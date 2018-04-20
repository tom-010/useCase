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

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
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


    // $ANTLR start "entryRuleQualifiedName"
    // PsiInternalUseCase.g:111:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalUseCase.g:111:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalUseCase.g:112:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // PsiInternalUseCase.g:118:1: ruleQualifiedName returns [Boolean current=false] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // PsiInternalUseCase.g:119:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // PsiInternalUseCase.g:120:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // PsiInternalUseCase.g:120:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // PsiInternalUseCase.g:121:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			doneLeaf(this_ID_0);
            		
            // PsiInternalUseCase.g:128:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalUseCase.g:129:4: kw= '.' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,11,FOLLOW_6); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				doneLeaf(this_ID_2);
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNumber"
    // PsiInternalUseCase.g:148:1: entryRuleQualifiedNumber returns [Boolean current=false] : iv_ruleQualifiedNumber= ruleQualifiedNumber EOF ;
    public final Boolean entryRuleQualifiedNumber() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedNumber = null;


        try {
            // PsiInternalUseCase.g:148:57: (iv_ruleQualifiedNumber= ruleQualifiedNumber EOF )
            // PsiInternalUseCase.g:149:2: iv_ruleQualifiedNumber= ruleQualifiedNumber EOF
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
    // PsiInternalUseCase.g:155:1: ruleQualifiedNumber returns [Boolean current=false] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) ;
    public final Boolean ruleQualifiedNumber() throws RecognitionException {
        Boolean current = false;

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

        try {
            // PsiInternalUseCase.g:156:1: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) )
            // PsiInternalUseCase.g:157:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            {
            // PsiInternalUseCase.g:157:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            // PsiInternalUseCase.g:158:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.'
            {

            			markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_0ElementType());
            		
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            			doneLeaf(this_INT_0);
            		
            // PsiInternalUseCase.g:165:3: (kw= '.' this_INT_2= RULE_INT )*
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
            	    // PsiInternalUseCase.g:166:4: kw= '.' this_INT_2= RULE_INT
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,11,FOLLOW_8); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_1_1ElementType());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_7); 

            	    				doneLeaf(this_INT_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_2ElementType());
            		
            kw=(Token)match(input,11,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUseCase"
    // PsiInternalUseCase.g:192:1: entryRuleUseCase returns [Boolean current=false] : iv_ruleUseCase= ruleUseCase EOF ;
    public final Boolean entryRuleUseCase() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUseCase = null;


        try {
            // PsiInternalUseCase.g:192:49: (iv_ruleUseCase= ruleUseCase EOF )
            // PsiInternalUseCase.g:193:2: iv_ruleUseCase= ruleUseCase EOF
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
    // PsiInternalUseCase.g:199:1: ruleUseCase returns [Boolean current=false] : ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) ) ;
    public final Boolean ruleUseCase() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Boolean lv_descriptions_3_0 = null;

        Boolean lv_allowedUserGroups_4_0 = null;

        Boolean lv_inputs_5_0 = null;

        Boolean lv_outputs_6_0 = null;

        Boolean lv_preconditions_7_0 = null;

        Boolean lv_steps_8_0 = null;

        Boolean lv_notes_9_0 = null;


        try {
            // PsiInternalUseCase.g:200:1: ( ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) ) )
            // PsiInternalUseCase.g:201:2: ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) )
            {
            // PsiInternalUseCase.g:201:2: ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) )
            // PsiInternalUseCase.g:202:3: (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) )
            {
            // PsiInternalUseCase.g:202:3: (otherlv_0= 'use-case' | otherlv_1= 'Rezept' )
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
                    // PsiInternalUseCase.g:203:4: otherlv_0= 'use-case'
                    {

                    				markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,12,FOLLOW_9); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:211:4: otherlv_1= 'Rezept'
                    {

                    				markLeaf(elementTypeProvider.getUseCase_RezeptKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,13,FOLLOW_9); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:219:3: ( (lv_name_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:220:4: (lv_name_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:220:4: (lv_name_2_0= RULE_STRING )
            // PsiInternalUseCase.g:221:5: lv_name_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getUseCase_NameSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:236:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=19 && LA5_0<=21)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalUseCase.g:237:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // PsiInternalUseCase.g:237:4: (lv_descriptions_3_0= ruleDescription )
                    // PsiInternalUseCase.g:238:5: lv_descriptions_3_0= ruleDescription
                    {

                    					markComposite(elementTypeProvider.getUseCase_DescriptionsDescriptionParserRuleCall_2_0ElementType());
                    				
                    pushFollow(FOLLOW_11);
                    lv_descriptions_3_0=ruleDescription();

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

            // PsiInternalUseCase.g:251:3: ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=23)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalUseCase.g:252:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    {
                    // PsiInternalUseCase.g:252:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    // PsiInternalUseCase.g:253:5: lv_allowedUserGroups_4_0= ruleAllowedUserGroups
                    {

                    					markComposite(elementTypeProvider.getUseCase_AllowedUserGroupsAllowedUserGroupsParserRuleCall_3_0ElementType());
                    				
                    pushFollow(FOLLOW_12);
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

            // PsiInternalUseCase.g:266:3: ( (lv_inputs_5_0= ruleInputs ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=28 && LA7_0<=30)||LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalUseCase.g:267:4: (lv_inputs_5_0= ruleInputs )
                    {
                    // PsiInternalUseCase.g:267:4: (lv_inputs_5_0= ruleInputs )
                    // PsiInternalUseCase.g:268:5: lv_inputs_5_0= ruleInputs
                    {

                    					markComposite(elementTypeProvider.getUseCase_InputsInputsParserRuleCall_4_0ElementType());
                    				
                    pushFollow(FOLLOW_13);
                    lv_inputs_5_0=ruleInputs();

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

            // PsiInternalUseCase.g:281:3: ( (lv_outputs_6_0= ruleOutputs ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=42 && LA8_0<=44)||LA8_0==46) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalUseCase.g:282:4: (lv_outputs_6_0= ruleOutputs )
                    {
                    // PsiInternalUseCase.g:282:4: (lv_outputs_6_0= ruleOutputs )
                    // PsiInternalUseCase.g:283:5: lv_outputs_6_0= ruleOutputs
                    {

                    					markComposite(elementTypeProvider.getUseCase_OutputsOutputsParserRuleCall_5_0ElementType());
                    				
                    pushFollow(FOLLOW_14);
                    lv_outputs_6_0=ruleOutputs();

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

            // PsiInternalUseCase.g:296:3: ( (lv_preconditions_7_0= rulePreConditions ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=48 && LA9_0<=50)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalUseCase.g:297:4: (lv_preconditions_7_0= rulePreConditions )
                    {
                    // PsiInternalUseCase.g:297:4: (lv_preconditions_7_0= rulePreConditions )
                    // PsiInternalUseCase.g:298:5: lv_preconditions_7_0= rulePreConditions
                    {

                    					markComposite(elementTypeProvider.getUseCase_PreconditionsPreConditionsParserRuleCall_6_0ElementType());
                    				
                    pushFollow(FOLLOW_15);
                    lv_preconditions_7_0=rulePreConditions();

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

            // PsiInternalUseCase.g:311:3: ( (lv_steps_8_0= ruleSteps ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=51 && LA10_0<=52)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // PsiInternalUseCase.g:312:4: (lv_steps_8_0= ruleSteps )
                    {
                    // PsiInternalUseCase.g:312:4: (lv_steps_8_0= ruleSteps )
                    // PsiInternalUseCase.g:313:5: lv_steps_8_0= ruleSteps
                    {

                    					markComposite(elementTypeProvider.getUseCase_StepsStepsParserRuleCall_7_0ElementType());
                    				
                    pushFollow(FOLLOW_16);
                    lv_steps_8_0=ruleSteps();

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

            // PsiInternalUseCase.g:326:3: ( (lv_notes_9_0= ruleNotes ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=61 && LA11_0<=64)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalUseCase.g:327:4: (lv_notes_9_0= ruleNotes )
                    {
                    // PsiInternalUseCase.g:327:4: (lv_notes_9_0= ruleNotes )
                    // PsiInternalUseCase.g:328:5: lv_notes_9_0= ruleNotes
                    {

                    					markComposite(elementTypeProvider.getUseCase_NotesNotesParserRuleCall_8_0ElementType());
                    				
                    pushFollow(FOLLOW_17);
                    lv_notes_9_0=ruleNotes();

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

            // PsiInternalUseCase.g:341:3: ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) )
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
                    // PsiInternalUseCase.g:342:4: (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' )
                    {
                    // PsiInternalUseCase.g:342:4: (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' )
                    // PsiInternalUseCase.g:343:5: otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case'
                    {

                    					markLeaf(elementTypeProvider.getUseCase_EndKeyword_9_0_0ElementType());
                    				
                    otherlv_10=(Token)match(input,14,FOLLOW_18); 

                    					doneLeaf(otherlv_10);
                    				

                    					markLeaf(elementTypeProvider.getUseCase_OfKeyword_9_0_1ElementType());
                    				
                    otherlv_11=(Token)match(input,15,FOLLOW_19); 

                    					doneLeaf(otherlv_11);
                    				

                    					markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_9_0_2ElementType());
                    				
                    otherlv_12=(Token)match(input,12,FOLLOW_2); 

                    					doneLeaf(otherlv_12);
                    				

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:366:4: (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' )
                    {
                    // PsiInternalUseCase.g:366:4: (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' )
                    // PsiInternalUseCase.g:367:5: otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets'
                    {

                    					markLeaf(elementTypeProvider.getUseCase_EndeKeyword_9_1_0ElementType());
                    				
                    otherlv_13=(Token)match(input,16,FOLLOW_20); 

                    					doneLeaf(otherlv_13);
                    				

                    					markLeaf(elementTypeProvider.getUseCase_DesKeyword_9_1_1ElementType());
                    				
                    otherlv_14=(Token)match(input,17,FOLLOW_21); 

                    					doneLeaf(otherlv_14);
                    				

                    					markLeaf(elementTypeProvider.getUseCase_RezpetsKeyword_9_1_2ElementType());
                    				
                    otherlv_15=(Token)match(input,18,FOLLOW_2); 

                    					doneLeaf(otherlv_15);
                    				

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
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleDescription"
    // PsiInternalUseCase.g:394:1: entryRuleDescription returns [Boolean current=false] : iv_ruleDescription= ruleDescription EOF ;
    public final Boolean entryRuleDescription() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDescription = null;


        try {
            // PsiInternalUseCase.g:394:53: (iv_ruleDescription= ruleDescription EOF )
            // PsiInternalUseCase.g:395:2: iv_ruleDescription= ruleDescription EOF
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
    // PsiInternalUseCase.g:401:1: ruleDescription returns [Boolean current=false] : ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final Boolean ruleDescription() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

        try {
            // PsiInternalUseCase.g:402:1: ( ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:403:2: ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:403:2: ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:404:3: (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:404:3: (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' )
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
                    // PsiInternalUseCase.g:405:4: otherlv_0= 'description:'
                    {

                    				markLeaf(elementTypeProvider.getDescription_DescriptionKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,19,FOLLOW_9); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:413:4: otherlv_1= 'Kurzbeschreibung:'
                    {

                    				markLeaf(elementTypeProvider.getDescription_KurzbeschreibungKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_9); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 3 :
                    // PsiInternalUseCase.g:421:4: otherlv_2= 'Beschreibung'
                    {

                    				markLeaf(elementTypeProvider.getDescription_BeschreibungKeyword_0_2ElementType());
                    			
                    otherlv_2=(Token)match(input,21,FOLLOW_9); 

                    				doneLeaf(otherlv_2);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:429:3: ( (lv_name_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:430:4: (lv_name_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:430:4: (lv_name_3_0= RULE_STRING )
            // PsiInternalUseCase.g:431:5: lv_name_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getDescription_NameSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_3_0);
            				

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


    // $ANTLR start "entryRuleAllowedUserGroups"
    // PsiInternalUseCase.g:450:1: entryRuleAllowedUserGroups returns [Boolean current=false] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final Boolean entryRuleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroups = null;


        try {
            // PsiInternalUseCase.g:450:59: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // PsiInternalUseCase.g:451:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
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
    // PsiInternalUseCase.g:457:1: ruleAllowedUserGroups returns [Boolean current=false] : ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* ) ;
    public final Boolean ruleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Boolean lv_groups_3_0 = null;


        try {
            // PsiInternalUseCase.g:458:1: ( ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* ) )
            // PsiInternalUseCase.g:459:2: ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* )
            {
            // PsiInternalUseCase.g:459:2: ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* )
            // PsiInternalUseCase.g:460:3: (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )*
            {
            // PsiInternalUseCase.g:460:3: (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) )
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
                    // PsiInternalUseCase.g:461:4: otherlv_0= 'allowed-usergroups:'
                    {

                    				markLeaf(elementTypeProvider.getAllowedUserGroups_AllowedUsergroupsKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,22,FOLLOW_22); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:469:4: (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' )
                    {
                    // PsiInternalUseCase.g:469:4: (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' )
                    // PsiInternalUseCase.g:470:5: otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:'
                    {

                    					markLeaf(elementTypeProvider.getAllowedUserGroups_ErlaubtKeyword_0_1_0ElementType());
                    				
                    otherlv_1=(Token)match(input,23,FOLLOW_23); 

                    					doneLeaf(otherlv_1);
                    				

                    					markLeaf(elementTypeProvider.getAllowedUserGroups_FürKeyword_0_1_1ElementType());
                    				
                    otherlv_2=(Token)match(input,24,FOLLOW_22); 

                    					doneLeaf(otherlv_2);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:486:3: ( (lv_groups_3_0= ruleAllowedUserGroup ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=25 && LA15_0<=26)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // PsiInternalUseCase.g:487:4: (lv_groups_3_0= ruleAllowedUserGroup )
            	    {
            	    // PsiInternalUseCase.g:487:4: (lv_groups_3_0= ruleAllowedUserGroup )
            	    // PsiInternalUseCase.g:488:5: lv_groups_3_0= ruleAllowedUserGroup
            	    {

            	    					markComposite(elementTypeProvider.getAllowedUserGroups_GroupsAllowedUserGroupParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_groups_3_0=ruleAllowedUserGroup();

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
    // $ANTLR end "ruleAllowedUserGroups"


    // $ANTLR start "entryRuleAllowedUserGroup"
    // PsiInternalUseCase.g:505:1: entryRuleAllowedUserGroup returns [Boolean current=false] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final Boolean entryRuleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroup = null;


        try {
            // PsiInternalUseCase.g:505:58: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // PsiInternalUseCase.g:506:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
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
    // PsiInternalUseCase.g:512:1: ruleAllowedUserGroup returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final Boolean ruleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // PsiInternalUseCase.g:513:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // PsiInternalUseCase.g:514:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // PsiInternalUseCase.g:514:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // PsiInternalUseCase.g:515:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // PsiInternalUseCase.g:515:3: ( (lv_many_0_0= 'many' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // PsiInternalUseCase.g:516:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:516:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:517:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getAllowedUserGroup_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,25,FOLLOW_24); 

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
            		
            otherlv_1=(Token)match(input,26,FOLLOW_9); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:539:3: ( (lv_name_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:540:4: (lv_name_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:540:4: (lv_name_2_0= RULE_STRING )
            // PsiInternalUseCase.g:541:5: lv_name_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getAllowedUserGroup_NameSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:556:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalUseCase.g:557:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getAllowedUserGroup_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,27,FOLLOW_6); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:564:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:565:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:565:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:566:6: otherlv_4= RULE_ID
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


    // $ANTLR start "entryRuleInputs"
    // PsiInternalUseCase.g:586:1: entryRuleInputs returns [Boolean current=false] : iv_ruleInputs= ruleInputs EOF ;
    public final Boolean entryRuleInputs() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInputs = null;


        try {
            // PsiInternalUseCase.g:586:48: (iv_ruleInputs= ruleInputs EOF )
            // PsiInternalUseCase.g:587:2: iv_ruleInputs= ruleInputs EOF
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
    // PsiInternalUseCase.g:593:1: ruleInputs returns [Boolean current=false] : ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* ) ;
    public final Boolean ruleInputs() throws RecognitionException {
        Boolean current = false;

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
        Boolean lv_inputs_10_0 = null;


        try {
            // PsiInternalUseCase.g:594:1: ( ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* ) )
            // PsiInternalUseCase.g:595:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* )
            {
            // PsiInternalUseCase.g:595:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* )
            // PsiInternalUseCase.g:596:3: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )*
            {
            // PsiInternalUseCase.g:596:3: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) )
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
                    // PsiInternalUseCase.g:597:4: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
                    {
                    // PsiInternalUseCase.g:597:4: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
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
                            // PsiInternalUseCase.g:598:5: otherlv_0= 'requires:'
                            {

                            					markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_0_0ElementType());
                            				
                            otherlv_0=(Token)match(input,28,FOLLOW_22); 

                            					doneLeaf(otherlv_0);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:606:5: otherlv_1= 'require:'
                            {

                            					markLeaf(elementTypeProvider.getInputs_RequireKeyword_0_0_1ElementType());
                            				
                            otherlv_1=(Token)match(input,29,FOLLOW_22); 

                            					doneLeaf(otherlv_1);
                            				

                            }
                            break;
                        case 3 :
                            // PsiInternalUseCase.g:614:5: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                            {
                            // PsiInternalUseCase.g:614:5: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                            // PsiInternalUseCase.g:615:6: otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':'
                            {

                            						markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_0_2_0ElementType());
                            					
                            otherlv_2=(Token)match(input,30,FOLLOW_26); 

                            						doneLeaf(otherlv_2);
                            					

                            						markLeaf(elementTypeProvider.getInputs_TheKeyword_0_0_2_1ElementType());
                            					
                            otherlv_3=(Token)match(input,31,FOLLOW_27); 

                            						doneLeaf(otherlv_3);
                            					

                            						markLeaf(elementTypeProvider.getInputs_FollowingKeyword_0_0_2_2ElementType());
                            					
                            otherlv_4=(Token)match(input,32,FOLLOW_28); 

                            						doneLeaf(otherlv_4);
                            					

                            						markLeaf(elementTypeProvider.getInputs_InputKeyword_0_0_2_3ElementType());
                            					
                            otherlv_5=(Token)match(input,33,FOLLOW_29); 

                            						doneLeaf(otherlv_5);
                            					

                            						markLeaf(elementTypeProvider.getInputs_ColonKeyword_0_0_2_4ElementType());
                            					
                            otherlv_6=(Token)match(input,34,FOLLOW_22); 

                            						doneLeaf(otherlv_6);
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:653:4: (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' )
                    {
                    // PsiInternalUseCase.g:653:4: (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' )
                    // PsiInternalUseCase.g:654:5: otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':'
                    {

                    					markLeaf(elementTypeProvider.getInputs_BenötigteKeyword_0_1_0ElementType());
                    				
                    otherlv_7=(Token)match(input,35,FOLLOW_30); 

                    					doneLeaf(otherlv_7);
                    				

                    					markLeaf(elementTypeProvider.getInputs_ZutatenKeyword_0_1_1ElementType());
                    				
                    otherlv_8=(Token)match(input,36,FOLLOW_29); 

                    					doneLeaf(otherlv_8);
                    				

                    					markLeaf(elementTypeProvider.getInputs_ColonKeyword_0_1_2ElementType());
                    				
                    otherlv_9=(Token)match(input,34,FOLLOW_22); 

                    					doneLeaf(otherlv_9);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:677:3: ( (lv_inputs_10_0= ruleInput ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=25 && LA20_0<=26)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // PsiInternalUseCase.g:678:4: (lv_inputs_10_0= ruleInput )
            	    {
            	    // PsiInternalUseCase.g:678:4: (lv_inputs_10_0= ruleInput )
            	    // PsiInternalUseCase.g:679:5: lv_inputs_10_0= ruleInput
            	    {

            	    					markComposite(elementTypeProvider.getInputs_InputsInputParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_inputs_10_0=ruleInput();

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
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleInput"
    // PsiInternalUseCase.g:696:1: entryRuleInput returns [Boolean current=false] : iv_ruleInput= ruleInput EOF ;
    public final Boolean entryRuleInput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInput = null;


        try {
            // PsiInternalUseCase.g:696:47: (iv_ruleInput= ruleInput EOF )
            // PsiInternalUseCase.g:697:2: iv_ruleInput= ruleInput EOF
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
    // PsiInternalUseCase.g:703:1: ruleInput returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? ) ;
    public final Boolean ruleInput() throws RecognitionException {
        Boolean current = false;

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
        Boolean lv_optional_2_0 = null;


        try {
            // PsiInternalUseCase.g:704:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? ) )
            // PsiInternalUseCase.g:705:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? )
            {
            // PsiInternalUseCase.g:705:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? )
            // PsiInternalUseCase.g:706:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )?
            {
            // PsiInternalUseCase.g:706:3: ( (lv_many_0_0= 'many' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalUseCase.g:707:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:707:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:708:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getInput_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,25,FOLLOW_24); 

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
            		
            otherlv_1=(Token)match(input,26,FOLLOW_31); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:730:3: ( (lv_optional_2_0= ruleOptional ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // PsiInternalUseCase.g:731:4: (lv_optional_2_0= ruleOptional )
                    {
                    // PsiInternalUseCase.g:731:4: (lv_optional_2_0= ruleOptional )
                    // PsiInternalUseCase.g:732:5: lv_optional_2_0= ruleOptional
                    {

                    					markComposite(elementTypeProvider.getInput_OptionalOptionalParserRuleCall_2_0ElementType());
                    				
                    pushFollow(FOLLOW_9);
                    lv_optional_2_0=ruleOptional();

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

            // PsiInternalUseCase.g:745:3: ( (lv_content_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:746:4: (lv_content_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:746:4: (lv_content_3_0= RULE_STRING )
            // PsiInternalUseCase.g:747:5: lv_content_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getInput_ContentSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_content_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_3_0);
            				

            }


            }

            // PsiInternalUseCase.g:762:3: ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27||LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // PsiInternalUseCase.g:763:4: (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) )
                    {
                    // PsiInternalUseCase.g:763:4: (otherlv_4= 'as' | otherlv_5= 'als' )
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
                            // PsiInternalUseCase.g:764:5: otherlv_4= 'as'
                            {

                            					markLeaf(elementTypeProvider.getInput_AsKeyword_4_0_0ElementType());
                            				
                            otherlv_4=(Token)match(input,27,FOLLOW_6); 

                            					doneLeaf(otherlv_4);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:772:5: otherlv_5= 'als'
                            {

                            					markLeaf(elementTypeProvider.getInput_AlsKeyword_4_0_1ElementType());
                            				
                            otherlv_5=(Token)match(input,37,FOLLOW_6); 

                            					doneLeaf(otherlv_5);
                            				

                            }
                            break;

                    }

                    // PsiInternalUseCase.g:780:4: ( (otherlv_6= RULE_ID ) )
                    // PsiInternalUseCase.g:781:5: (otherlv_6= RULE_ID )
                    {
                    // PsiInternalUseCase.g:781:5: (otherlv_6= RULE_ID )
                    // PsiInternalUseCase.g:782:6: otherlv_6= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getInput_TypeTypeCrossReference_4_1_0ElementType());
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						doneLeaf(otherlv_6);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:798:3: (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // PsiInternalUseCase.g:799:4: otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')'
                    {

                    				markLeaf(elementTypeProvider.getInput_LeftParenthesisKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,38,FOLLOW_34); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalUseCase.g:806:4: (otherlv_8= 'e.g' | otherlv_9= 'z.B.' )
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
                            // PsiInternalUseCase.g:807:5: otherlv_8= 'e.g'
                            {

                            					markLeaf(elementTypeProvider.getInput_EGKeyword_5_1_0ElementType());
                            				
                            otherlv_8=(Token)match(input,39,FOLLOW_9); 

                            					doneLeaf(otherlv_8);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:815:5: otherlv_9= 'z.B.'
                            {

                            					markLeaf(elementTypeProvider.getInput_ZBKeyword_5_1_1ElementType());
                            				
                            otherlv_9=(Token)match(input,40,FOLLOW_9); 

                            					doneLeaf(otherlv_9);
                            				

                            }
                            break;

                    }

                    // PsiInternalUseCase.g:823:4: ( (lv_example_10_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:824:5: (lv_example_10_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:824:5: (lv_example_10_0= RULE_STRING )
                    // PsiInternalUseCase.g:825:6: lv_example_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getInput_ExampleSTRINGTerminalRuleCall_5_2_0ElementType());
                    					
                    lv_example_10_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_example_10_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getInput_RightParenthesisKeyword_5_3ElementType());
                    			
                    otherlv_11=(Token)match(input,41,FOLLOW_2); 

                    				doneLeaf(otherlv_11);
                    			

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


    // $ANTLR start "entryRuleOutputs"
    // PsiInternalUseCase.g:852:1: entryRuleOutputs returns [Boolean current=false] : iv_ruleOutputs= ruleOutputs EOF ;
    public final Boolean entryRuleOutputs() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOutputs = null;


        try {
            // PsiInternalUseCase.g:852:49: (iv_ruleOutputs= ruleOutputs EOF )
            // PsiInternalUseCase.g:853:2: iv_ruleOutputs= ruleOutputs EOF
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
    // PsiInternalUseCase.g:859:1: ruleOutputs returns [Boolean current=false] : ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* ) ;
    public final Boolean ruleOutputs() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Boolean lv_outputs_8_0 = null;


        try {
            // PsiInternalUseCase.g:860:1: ( ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* ) )
            // PsiInternalUseCase.g:861:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* )
            {
            // PsiInternalUseCase.g:861:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* )
            // PsiInternalUseCase.g:862:3: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )*
            {
            // PsiInternalUseCase.g:862:3: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' )
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
                    // PsiInternalUseCase.g:863:4: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
                    {
                    // PsiInternalUseCase.g:863:4: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
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
                            // PsiInternalUseCase.g:864:5: otherlv_0= 'produces:'
                            {

                            					markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_0_0ElementType());
                            				
                            otherlv_0=(Token)match(input,42,FOLLOW_22); 

                            					doneLeaf(otherlv_0);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:872:5: otherlv_1= 'produce:'
                            {

                            					markLeaf(elementTypeProvider.getOutputs_ProduceKeyword_0_0_1ElementType());
                            				
                            otherlv_1=(Token)match(input,43,FOLLOW_22); 

                            					doneLeaf(otherlv_1);
                            				

                            }
                            break;
                        case 3 :
                            // PsiInternalUseCase.g:880:5: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                            {
                            // PsiInternalUseCase.g:880:5: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                            // PsiInternalUseCase.g:881:6: otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':'
                            {

                            						markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_0_2_0ElementType());
                            					
                            otherlv_2=(Token)match(input,44,FOLLOW_26); 

                            						doneLeaf(otherlv_2);
                            					

                            						markLeaf(elementTypeProvider.getOutputs_TheKeyword_0_0_2_1ElementType());
                            					
                            otherlv_3=(Token)match(input,31,FOLLOW_27); 

                            						doneLeaf(otherlv_3);
                            					

                            						markLeaf(elementTypeProvider.getOutputs_FollowingKeyword_0_0_2_2ElementType());
                            					
                            otherlv_4=(Token)match(input,32,FOLLOW_36); 

                            						doneLeaf(otherlv_4);
                            					

                            						markLeaf(elementTypeProvider.getOutputs_OutputKeyword_0_0_2_3ElementType());
                            					
                            otherlv_5=(Token)match(input,45,FOLLOW_29); 

                            						doneLeaf(otherlv_5);
                            					

                            						markLeaf(elementTypeProvider.getOutputs_ColonKeyword_0_0_2_4ElementType());
                            					
                            otherlv_6=(Token)match(input,34,FOLLOW_22); 

                            						doneLeaf(otherlv_6);
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:919:4: otherlv_7= 'Ergebnis:'
                    {

                    				markLeaf(elementTypeProvider.getOutputs_ErgebnisKeyword_0_1ElementType());
                    			
                    otherlv_7=(Token)match(input,46,FOLLOW_22); 

                    				doneLeaf(otherlv_7);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:927:3: ( (lv_outputs_8_0= ruleOutput ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=25 && LA29_0<=26)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // PsiInternalUseCase.g:928:4: (lv_outputs_8_0= ruleOutput )
            	    {
            	    // PsiInternalUseCase.g:928:4: (lv_outputs_8_0= ruleOutput )
            	    // PsiInternalUseCase.g:929:5: lv_outputs_8_0= ruleOutput
            	    {

            	    					markComposite(elementTypeProvider.getOutputs_OutputsOutputParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_outputs_8_0=ruleOutput();

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
    // $ANTLR end "ruleOutputs"


    // $ANTLR start "entryRuleOutput"
    // PsiInternalUseCase.g:946:1: entryRuleOutput returns [Boolean current=false] : iv_ruleOutput= ruleOutput EOF ;
    public final Boolean entryRuleOutput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOutput = null;


        try {
            // PsiInternalUseCase.g:946:48: (iv_ruleOutput= ruleOutput EOF )
            // PsiInternalUseCase.g:947:2: iv_ruleOutput= ruleOutput EOF
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
    // PsiInternalUseCase.g:953:1: ruleOutput returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) ;
    public final Boolean ruleOutput() throws RecognitionException {
        Boolean current = false;

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

        try {
            // PsiInternalUseCase.g:954:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) )
            // PsiInternalUseCase.g:955:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            {
            // PsiInternalUseCase.g:955:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            // PsiInternalUseCase.g:956:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            {
            // PsiInternalUseCase.g:956:3: ( (lv_many_0_0= 'many' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // PsiInternalUseCase.g:957:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:957:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:958:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getOutput_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,25,FOLLOW_24); 

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
            		
            otherlv_1=(Token)match(input,26,FOLLOW_9); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:980:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:981:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:981:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:982:5: lv_content_2_0= RULE_STRING
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

            // PsiInternalUseCase.g:997:3: ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27||LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // PsiInternalUseCase.g:998:4: (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) )
                    {
                    // PsiInternalUseCase.g:998:4: (otherlv_3= 'as' | otherlv_4= 'als' )
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
                            // PsiInternalUseCase.g:999:5: otherlv_3= 'as'
                            {

                            					markLeaf(elementTypeProvider.getOutput_AsKeyword_3_0_0ElementType());
                            				
                            otherlv_3=(Token)match(input,27,FOLLOW_6); 

                            					doneLeaf(otherlv_3);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1007:5: otherlv_4= 'als'
                            {

                            					markLeaf(elementTypeProvider.getOutput_AlsKeyword_3_0_1ElementType());
                            				
                            otherlv_4=(Token)match(input,37,FOLLOW_6); 

                            					doneLeaf(otherlv_4);
                            				

                            }
                            break;

                    }

                    // PsiInternalUseCase.g:1015:4: ( (otherlv_5= RULE_ID ) )
                    // PsiInternalUseCase.g:1016:5: (otherlv_5= RULE_ID )
                    {
                    // PsiInternalUseCase.g:1016:5: (otherlv_5= RULE_ID )
                    // PsiInternalUseCase.g:1017:6: otherlv_5= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getOutput_TypeTypeCrossReference_3_1_0ElementType());
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						doneLeaf(otherlv_5);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1033:3: (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // PsiInternalUseCase.g:1034:4: otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')'
                    {

                    				markLeaf(elementTypeProvider.getOutput_LeftParenthesisKeyword_4_0ElementType());
                    			
                    otherlv_6=(Token)match(input,38,FOLLOW_34); 

                    				doneLeaf(otherlv_6);
                    			
                    // PsiInternalUseCase.g:1041:4: (otherlv_7= 'e.g' | otherlv_8= 'z.B.' )
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
                            // PsiInternalUseCase.g:1042:5: otherlv_7= 'e.g'
                            {

                            					markLeaf(elementTypeProvider.getOutput_EGKeyword_4_1_0ElementType());
                            				
                            otherlv_7=(Token)match(input,39,FOLLOW_9); 

                            					doneLeaf(otherlv_7);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1050:5: otherlv_8= 'z.B.'
                            {

                            					markLeaf(elementTypeProvider.getOutput_ZBKeyword_4_1_1ElementType());
                            				
                            otherlv_8=(Token)match(input,40,FOLLOW_9); 

                            					doneLeaf(otherlv_8);
                            				

                            }
                            break;

                    }

                    // PsiInternalUseCase.g:1058:4: ( (lv_example_9_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:1059:5: (lv_example_9_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:1059:5: (lv_example_9_0= RULE_STRING )
                    // PsiInternalUseCase.g:1060:6: lv_example_9_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getOutput_ExampleSTRINGTerminalRuleCall_4_2_0ElementType());
                    					
                    lv_example_9_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_example_9_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getOutput_RightParenthesisKeyword_4_3ElementType());
                    			
                    otherlv_10=(Token)match(input,41,FOLLOW_2); 

                    				doneLeaf(otherlv_10);
                    			

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


    // $ANTLR start "entryRuleOptional"
    // PsiInternalUseCase.g:1087:1: entryRuleOptional returns [Boolean current=false] : iv_ruleOptional= ruleOptional EOF ;
    public final Boolean entryRuleOptional() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOptional = null;


        try {
            // PsiInternalUseCase.g:1087:50: (iv_ruleOptional= ruleOptional EOF )
            // PsiInternalUseCase.g:1088:2: iv_ruleOptional= ruleOptional EOF
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
    // PsiInternalUseCase.g:1094:1: ruleOptional returns [Boolean current=false] : kw= 'optional' ;
    public final Boolean ruleOptional() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalUseCase.g:1095:1: (kw= 'optional' )
            // PsiInternalUseCase.g:1096:2: kw= 'optional'
            {

            		markLeaf(elementTypeProvider.getOptional_OptionalKeywordElementType());
            	
            kw=(Token)match(input,47,FOLLOW_2); 

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


    // $ANTLR start "entryRulePreConditions"
    // PsiInternalUseCase.g:1106:1: entryRulePreConditions returns [Boolean current=false] : iv_rulePreConditions= rulePreConditions EOF ;
    public final Boolean entryRulePreConditions() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePreConditions = null;


        try {
            // PsiInternalUseCase.g:1106:55: (iv_rulePreConditions= rulePreConditions EOF )
            // PsiInternalUseCase.g:1107:2: iv_rulePreConditions= rulePreConditions EOF
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
    // PsiInternalUseCase.g:1113:1: rulePreConditions returns [Boolean current=false] : ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* ) ;
    public final Boolean rulePreConditions() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Boolean lv_conditions_3_0 = null;


        try {
            // PsiInternalUseCase.g:1114:1: ( ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* ) )
            // PsiInternalUseCase.g:1115:2: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* )
            {
            // PsiInternalUseCase.g:1115:2: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* )
            // PsiInternalUseCase.g:1116:3: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )*
            {
            // PsiInternalUseCase.g:1116:3: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' )
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
                    // PsiInternalUseCase.g:1117:4: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
                    {
                    // PsiInternalUseCase.g:1117:4: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
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
                            // PsiInternalUseCase.g:1118:5: otherlv_0= 'pre-condition:'
                            {

                            					markLeaf(elementTypeProvider.getPreConditions_PreConditionKeyword_0_0_0ElementType());
                            				
                            otherlv_0=(Token)match(input,48,FOLLOW_37); 

                            					doneLeaf(otherlv_0);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1126:5: otherlv_1= 'pre-conditions:'
                            {

                            					markLeaf(elementTypeProvider.getPreConditions_PreConditionsKeyword_0_0_1ElementType());
                            				
                            otherlv_1=(Token)match(input,49,FOLLOW_37); 

                            					doneLeaf(otherlv_1);
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1135:4: otherlv_2= 'Vorbedingungen:'
                    {

                    				markLeaf(elementTypeProvider.getPreConditions_VorbedingungenKeyword_0_1ElementType());
                    			
                    otherlv_2=(Token)match(input,50,FOLLOW_37); 

                    				doneLeaf(otherlv_2);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:1143:3: ( (lv_conditions_3_0= ruleCondition ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==26) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // PsiInternalUseCase.g:1144:4: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // PsiInternalUseCase.g:1144:4: (lv_conditions_3_0= ruleCondition )
            	    // PsiInternalUseCase.g:1145:5: lv_conditions_3_0= ruleCondition
            	    {

            	    					markComposite(elementTypeProvider.getPreConditions_ConditionsConditionParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_conditions_3_0=ruleCondition();

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
            	    break loop37;
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
    // PsiInternalUseCase.g:1162:1: entryRuleCondition returns [Boolean current=false] : iv_ruleCondition= ruleCondition EOF ;
    public final Boolean entryRuleCondition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCondition = null;


        try {
            // PsiInternalUseCase.g:1162:51: (iv_ruleCondition= ruleCondition EOF )
            // PsiInternalUseCase.g:1163:2: iv_ruleCondition= ruleCondition EOF
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
    // PsiInternalUseCase.g:1169:1: ruleCondition returns [Boolean current=false] : (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) ;
    public final Boolean ruleCondition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_content_1_0=null;

        try {
            // PsiInternalUseCase.g:1170:1: ( (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:1171:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:1171:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:1172:3: otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getCondition_HyphenMinusKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:1179:3: ( (lv_content_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1180:4: (lv_content_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1180:4: (lv_content_1_0= RULE_STRING )
            // PsiInternalUseCase.g:1181:5: lv_content_1_0= RULE_STRING
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
    // PsiInternalUseCase.g:1200:1: entryRuleSteps returns [Boolean current=false] : iv_ruleSteps= ruleSteps EOF ;
    public final Boolean entryRuleSteps() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSteps = null;


        try {
            // PsiInternalUseCase.g:1200:47: (iv_ruleSteps= ruleSteps EOF )
            // PsiInternalUseCase.g:1201:2: iv_ruleSteps= ruleSteps EOF
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
    // PsiInternalUseCase.g:1207:1: ruleSteps returns [Boolean current=false] : ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* ) ;
    public final Boolean ruleSteps() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Boolean lv_steps_2_0 = null;


        try {
            // PsiInternalUseCase.g:1208:1: ( ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* ) )
            // PsiInternalUseCase.g:1209:2: ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* )
            {
            // PsiInternalUseCase.g:1209:2: ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* )
            // PsiInternalUseCase.g:1210:3: (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )*
            {
            // PsiInternalUseCase.g:1210:3: (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' )
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
                    // PsiInternalUseCase.g:1211:4: otherlv_0= 'steps:'
                    {

                    				markLeaf(elementTypeProvider.getSteps_StepsKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,51,FOLLOW_38); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1219:4: otherlv_1= 'Schritte:'
                    {

                    				markLeaf(elementTypeProvider.getSteps_SchritteKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,52,FOLLOW_38); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:1227:3: ( (lv_steps_2_0= ruleStep ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_INT) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // PsiInternalUseCase.g:1228:4: (lv_steps_2_0= ruleStep )
            	    {
            	    // PsiInternalUseCase.g:1228:4: (lv_steps_2_0= ruleStep )
            	    // PsiInternalUseCase.g:1229:5: lv_steps_2_0= ruleStep
            	    {

            	    					markComposite(elementTypeProvider.getSteps_StepsStepParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_steps_2_0=ruleStep();

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
            	    break loop39;
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
    // PsiInternalUseCase.g:1246:1: entryRuleStep returns [Boolean current=false] : iv_ruleStep= ruleStep EOF ;
    public final Boolean entryRuleStep() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStep = null;


        try {
            // PsiInternalUseCase.g:1246:46: (iv_ruleStep= ruleStep EOF )
            // PsiInternalUseCase.g:1247:2: iv_ruleStep= ruleStep EOF
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
    // PsiInternalUseCase.g:1253:1: ruleStep returns [Boolean current=false] : ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) ;
    public final Boolean ruleStep() throws RecognitionException {
        Boolean current = false;

        Token lv_action_1_0=null;
        Boolean lv_number_0_0 = null;

        Boolean lv_error_2_0 = null;


        try {
            // PsiInternalUseCase.g:1254:1: ( ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) )
            // PsiInternalUseCase.g:1255:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            {
            // PsiInternalUseCase.g:1255:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            // PsiInternalUseCase.g:1256:3: ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )?
            {
            // PsiInternalUseCase.g:1256:3: ( (lv_number_0_0= ruleQualifiedNumber ) )
            // PsiInternalUseCase.g:1257:4: (lv_number_0_0= ruleQualifiedNumber )
            {
            // PsiInternalUseCase.g:1257:4: (lv_number_0_0= ruleQualifiedNumber )
            // PsiInternalUseCase.g:1258:5: lv_number_0_0= ruleQualifiedNumber
            {

            					markComposite(elementTypeProvider.getStep_NumberQualifiedNumberParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_9);
            lv_number_0_0=ruleQualifiedNumber();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalUseCase.g:1271:3: ( (lv_action_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1272:4: (lv_action_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1272:4: (lv_action_1_0= RULE_STRING )
            // PsiInternalUseCase.g:1273:5: lv_action_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getStep_ActionSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_action_1_0);
            				

            }


            }

            // PsiInternalUseCase.g:1288:3: ( (lv_error_2_0= ruleRaiseError ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==11||LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // PsiInternalUseCase.g:1289:4: (lv_error_2_0= ruleRaiseError )
                    {
                    // PsiInternalUseCase.g:1289:4: (lv_error_2_0= ruleRaiseError )
                    // PsiInternalUseCase.g:1290:5: lv_error_2_0= ruleRaiseError
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
    // PsiInternalUseCase.g:1307:1: entryRuleRaiseError returns [Boolean current=false] : iv_ruleRaiseError= ruleRaiseError EOF ;
    public final Boolean entryRuleRaiseError() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRaiseError = null;


        try {
            // PsiInternalUseCase.g:1307:52: (iv_ruleRaiseError= ruleRaiseError EOF )
            // PsiInternalUseCase.g:1308:2: iv_ruleRaiseError= ruleRaiseError EOF
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
    // PsiInternalUseCase.g:1314:1: ruleRaiseError returns [Boolean current=false] : ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) ) ;
    public final Boolean ruleRaiseError() throws RecognitionException {
        Boolean current = false;

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
        Boolean lv_exception_12_0 = null;


        try {
            // PsiInternalUseCase.g:1315:1: ( ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) ) )
            // PsiInternalUseCase.g:1316:2: ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) )
            {
            // PsiInternalUseCase.g:1316:2: ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) )
            // PsiInternalUseCase.g:1317:3: (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) )
            {
            // PsiInternalUseCase.g:1317:3: (otherlv_0= '.' | otherlv_1= ':' )
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
                    // PsiInternalUseCase.g:1318:4: otherlv_0= '.'
                    {

                    				markLeaf(elementTypeProvider.getRaiseError_FullStopKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,11,FOLLOW_40); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1326:4: otherlv_1= ':'
                    {

                    				markLeaf(elementTypeProvider.getRaiseError_ColonKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,34,FOLLOW_40); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:1334:3: ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) )
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
                    // PsiInternalUseCase.g:1335:4: ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) )
                    {
                    // PsiInternalUseCase.g:1335:4: ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) )
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
                            // PsiInternalUseCase.g:1336:5: (otherlv_2= 'Raise' (otherlv_3= 'error' )? )
                            {
                            // PsiInternalUseCase.g:1336:5: (otherlv_2= 'Raise' (otherlv_3= 'error' )? )
                            // PsiInternalUseCase.g:1337:6: otherlv_2= 'Raise' (otherlv_3= 'error' )?
                            {

                            						markLeaf(elementTypeProvider.getRaiseError_RaiseKeyword_1_0_0_0ElementType());
                            					
                            otherlv_2=(Token)match(input,53,FOLLOW_41); 

                            						doneLeaf(otherlv_2);
                            					
                            // PsiInternalUseCase.g:1344:6: (otherlv_3= 'error' )?
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==54) ) {
                                alt42=1;
                            }
                            switch (alt42) {
                                case 1 :
                                    // PsiInternalUseCase.g:1345:7: otherlv_3= 'error'
                                    {

                                    							markLeaf(elementTypeProvider.getRaiseError_ErrorKeyword_1_0_0_1ElementType());
                                    						
                                    otherlv_3=(Token)match(input,54,FOLLOW_41); 

                                    							doneLeaf(otherlv_3);
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1355:5: (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' )
                            {
                            // PsiInternalUseCase.g:1355:5: (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' )
                            // PsiInternalUseCase.g:1356:6: otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise'
                            {

                            						markLeaf(elementTypeProvider.getRaiseError_OnKeyword_1_0_1_0ElementType());
                            					
                            otherlv_4=(Token)match(input,55,FOLLOW_42); 

                            						doneLeaf(otherlv_4);
                            					

                            						markLeaf(elementTypeProvider.getRaiseError_ErrorKeyword_1_0_1_1ElementType());
                            					
                            otherlv_5=(Token)match(input,54,FOLLOW_43); 

                            						doneLeaf(otherlv_5);
                            					

                            						markLeaf(elementTypeProvider.getRaiseError_RaiseKeyword_1_0_1_2ElementType());
                            					
                            otherlv_6=(Token)match(input,56,FOLLOW_41); 

                            						doneLeaf(otherlv_6);
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1380:4: ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) )
                    {
                    // PsiInternalUseCase.g:1380:4: ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) )
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
                            // PsiInternalUseCase.g:1381:5: (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? )
                            {
                            // PsiInternalUseCase.g:1381:5: (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? )
                            // PsiInternalUseCase.g:1382:6: otherlv_7= 'Melde' (otherlv_8= 'Fehler' )?
                            {

                            						markLeaf(elementTypeProvider.getRaiseError_MeldeKeyword_1_1_0_0ElementType());
                            					
                            otherlv_7=(Token)match(input,57,FOLLOW_44); 

                            						doneLeaf(otherlv_7);
                            					
                            // PsiInternalUseCase.g:1389:6: (otherlv_8= 'Fehler' )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==58) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // PsiInternalUseCase.g:1390:7: otherlv_8= 'Fehler'
                                    {

                                    							markLeaf(elementTypeProvider.getRaiseError_FehlerKeyword_1_1_0_1ElementType());
                                    						
                                    otherlv_8=(Token)match(input,58,FOLLOW_41); 

                                    							doneLeaf(otherlv_8);
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1400:5: (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' )
                            {
                            // PsiInternalUseCase.g:1400:5: (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' )
                            // PsiInternalUseCase.g:1401:6: otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde'
                            {

                            						markLeaf(elementTypeProvider.getRaiseError_BeiKeyword_1_1_1_0ElementType());
                            					
                            otherlv_9=(Token)match(input,59,FOLLOW_45); 

                            						doneLeaf(otherlv_9);
                            					

                            						markLeaf(elementTypeProvider.getRaiseError_FehlerKeyword_1_1_1_1ElementType());
                            					
                            otherlv_10=(Token)match(input,58,FOLLOW_46); 

                            						doneLeaf(otherlv_10);
                            					

                            						markLeaf(elementTypeProvider.getRaiseError_MeldeKeyword_1_1_1_2ElementType());
                            					
                            otherlv_11=(Token)match(input,60,FOLLOW_41); 

                            						doneLeaf(otherlv_11);
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1425:3: ( (lv_exception_12_0= ruleException ) )
            // PsiInternalUseCase.g:1426:4: (lv_exception_12_0= ruleException )
            {
            // PsiInternalUseCase.g:1426:4: (lv_exception_12_0= ruleException )
            // PsiInternalUseCase.g:1427:5: lv_exception_12_0= ruleException
            {

            					markComposite(elementTypeProvider.getRaiseError_ExceptionExceptionParserRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_2);
            lv_exception_12_0=ruleException();

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


    // $ANTLR start "entryRuleNotes"
    // PsiInternalUseCase.g:1444:1: entryRuleNotes returns [Boolean current=false] : iv_ruleNotes= ruleNotes EOF ;
    public final Boolean entryRuleNotes() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleNotes = null;


        try {
            // PsiInternalUseCase.g:1444:47: (iv_ruleNotes= ruleNotes EOF )
            // PsiInternalUseCase.g:1445:2: iv_ruleNotes= ruleNotes EOF
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
    // PsiInternalUseCase.g:1451:1: ruleNotes returns [Boolean current=false] : ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) ) ;
    public final Boolean ruleNotes() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;

        try {
            // PsiInternalUseCase.g:1452:1: ( ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:1453:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:1453:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:1454:3: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:1454:3: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) )
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
                    // PsiInternalUseCase.g:1455:4: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
                    {
                    // PsiInternalUseCase.g:1455:4: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
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
                            // PsiInternalUseCase.g:1456:5: otherlv_0= 'notes:'
                            {

                            					markLeaf(elementTypeProvider.getNotes_NotesKeyword_0_0_0ElementType());
                            				
                            otherlv_0=(Token)match(input,61,FOLLOW_9); 

                            					doneLeaf(otherlv_0);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1464:5: otherlv_1= 'note:'
                            {

                            					markLeaf(elementTypeProvider.getNotes_NoteKeyword_0_0_1ElementType());
                            				
                            otherlv_1=(Token)match(input,62,FOLLOW_9); 

                            					doneLeaf(otherlv_1);
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1473:4: (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' )
                    {
                    // PsiInternalUseCase.g:1473:4: (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' )
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
                            // PsiInternalUseCase.g:1474:5: otherlv_2= 'Anmerkungen:'
                            {

                            					markLeaf(elementTypeProvider.getNotes_AnmerkungenKeyword_0_1_0ElementType());
                            				
                            otherlv_2=(Token)match(input,63,FOLLOW_9); 

                            					doneLeaf(otherlv_2);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1482:5: otherlv_3= 'Anmerkung:'
                            {

                            					markLeaf(elementTypeProvider.getNotes_AnmerkungKeyword_0_1_1ElementType());
                            				
                            otherlv_3=(Token)match(input,64,FOLLOW_9); 

                            					doneLeaf(otherlv_3);
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1491:3: ( (lv_content_4_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1492:4: (lv_content_4_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1492:4: (lv_content_4_0= RULE_STRING )
            // PsiInternalUseCase.g:1493:5: lv_content_4_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getNotes_ContentSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_content_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_4_0);
            				

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


    // $ANTLR start "entryRuleUsedTypes"
    // PsiInternalUseCase.g:1512:1: entryRuleUsedTypes returns [Boolean current=false] : iv_ruleUsedTypes= ruleUsedTypes EOF ;
    public final Boolean entryRuleUsedTypes() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUsedTypes = null;


        try {
            // PsiInternalUseCase.g:1512:51: (iv_ruleUsedTypes= ruleUsedTypes EOF )
            // PsiInternalUseCase.g:1513:2: iv_ruleUsedTypes= ruleUsedTypes EOF
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
    // PsiInternalUseCase.g:1519:1: ruleUsedTypes returns [Boolean current=false] : ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* ) ;
    public final Boolean ruleUsedTypes() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Boolean lv_types_4_0 = null;


        try {
            // PsiInternalUseCase.g:1520:1: ( ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* ) )
            // PsiInternalUseCase.g:1521:2: ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* )
            {
            // PsiInternalUseCase.g:1521:2: ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* )
            // PsiInternalUseCase.g:1522:3: ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )*
            {
            // PsiInternalUseCase.g:1522:3: ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) )
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
                    // PsiInternalUseCase.g:1523:4: (otherlv_0= 'used' otherlv_1= 'types:' )
                    {
                    // PsiInternalUseCase.g:1523:4: (otherlv_0= 'used' otherlv_1= 'types:' )
                    // PsiInternalUseCase.g:1524:5: otherlv_0= 'used' otherlv_1= 'types:'
                    {

                    					markLeaf(elementTypeProvider.getUsedTypes_UsedKeyword_0_0_0ElementType());
                    				
                    otherlv_0=(Token)match(input,65,FOLLOW_47); 

                    					doneLeaf(otherlv_0);
                    				

                    					markLeaf(elementTypeProvider.getUsedTypes_TypesKeyword_0_0_1ElementType());
                    				
                    otherlv_1=(Token)match(input,66,FOLLOW_37); 

                    					doneLeaf(otherlv_1);
                    				

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1540:4: (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' )
                    {
                    // PsiInternalUseCase.g:1540:4: (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' )
                    // PsiInternalUseCase.g:1541:5: otherlv_2= 'Genutzte' otherlv_3= 'Typen:'
                    {

                    					markLeaf(elementTypeProvider.getUsedTypes_GenutzteKeyword_0_1_0ElementType());
                    				
                    otherlv_2=(Token)match(input,67,FOLLOW_48); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getUsedTypes_TypenKeyword_0_1_1ElementType());
                    				
                    otherlv_3=(Token)match(input,68,FOLLOW_37); 

                    					doneLeaf(otherlv_3);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1557:3: ( (lv_types_4_0= ruleType ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==26) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // PsiInternalUseCase.g:1558:4: (lv_types_4_0= ruleType )
            	    {
            	    // PsiInternalUseCase.g:1558:4: (lv_types_4_0= ruleType )
            	    // PsiInternalUseCase.g:1559:5: lv_types_4_0= ruleType
            	    {

            	    					markComposite(elementTypeProvider.getUsedTypes_TypesTypeParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_types_4_0=ruleType();

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
            	    break loop51;
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


    // $ANTLR start "entryRuleType"
    // PsiInternalUseCase.g:1576:1: entryRuleType returns [Boolean current=false] : iv_ruleType= ruleType EOF ;
    public final Boolean entryRuleType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleType = null;


        try {
            // PsiInternalUseCase.g:1576:46: (iv_ruleType= ruleType EOF )
            // PsiInternalUseCase.g:1577:2: iv_ruleType= ruleType EOF
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
    // PsiInternalUseCase.g:1583:1: ruleType returns [Boolean current=false] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // PsiInternalUseCase.g:1584:1: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // PsiInternalUseCase.g:1585:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // PsiInternalUseCase.g:1585:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // PsiInternalUseCase.g:1586:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {

            			markLeaf(elementTypeProvider.getType_HyphenMinusKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:1593:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:1594:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:1594:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:1595:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getType_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_49); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getType_LeftParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_9); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalUseCase.g:1617:3: ( (lv_description_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1618:4: (lv_description_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1618:4: (lv_description_3_0= RULE_STRING )
            // PsiInternalUseCase.g:1619:5: lv_description_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getType_DescriptionSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_description_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getType_RightParenthesisKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,41,FOLLOW_50); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalUseCase.g:1641:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==69) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // PsiInternalUseCase.g:1642:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {

                    				markLeaf(elementTypeProvider.getType_LeftSquareBracketKeyword_5_0ElementType());
                    			
                    otherlv_5=(Token)match(input,69,FOLLOW_6); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalUseCase.g:1649:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // PsiInternalUseCase.g:1650:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // PsiInternalUseCase.g:1650:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // PsiInternalUseCase.g:1651:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						markComposite(elementTypeProvider.getType_ImportInfoQualifiedNameParserRuleCall_5_1_0ElementType());
                    					
                    pushFollow(FOLLOW_51);
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
                    			
                    otherlv_7=(Token)match(input,70,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUsedExceptions"
    // PsiInternalUseCase.g:1676:1: entryRuleUsedExceptions returns [Boolean current=false] : iv_ruleUsedExceptions= ruleUsedExceptions EOF ;
    public final Boolean entryRuleUsedExceptions() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUsedExceptions = null;


        try {
            // PsiInternalUseCase.g:1676:56: (iv_ruleUsedExceptions= ruleUsedExceptions EOF )
            // PsiInternalUseCase.g:1677:2: iv_ruleUsedExceptions= ruleUsedExceptions EOF
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
    // PsiInternalUseCase.g:1683:1: ruleUsedExceptions returns [Boolean current=false] : ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* ) ;
    public final Boolean ruleUsedExceptions() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Boolean lv_exceptions_4_0 = null;


        try {
            // PsiInternalUseCase.g:1684:1: ( ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* ) )
            // PsiInternalUseCase.g:1685:2: ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* )
            {
            // PsiInternalUseCase.g:1685:2: ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* )
            // PsiInternalUseCase.g:1686:3: ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )*
            {
            // PsiInternalUseCase.g:1686:3: ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) )
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
                    // PsiInternalUseCase.g:1687:4: (otherlv_0= 'used' otherlv_1= 'errors:' )
                    {
                    // PsiInternalUseCase.g:1687:4: (otherlv_0= 'used' otherlv_1= 'errors:' )
                    // PsiInternalUseCase.g:1688:5: otherlv_0= 'used' otherlv_1= 'errors:'
                    {

                    					markLeaf(elementTypeProvider.getUsedExceptions_UsedKeyword_0_0_0ElementType());
                    				
                    otherlv_0=(Token)match(input,65,FOLLOW_52); 

                    					doneLeaf(otherlv_0);
                    				

                    					markLeaf(elementTypeProvider.getUsedExceptions_ErrorsKeyword_0_0_1ElementType());
                    				
                    otherlv_1=(Token)match(input,71,FOLLOW_37); 

                    					doneLeaf(otherlv_1);
                    				

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1704:4: (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' )
                    {
                    // PsiInternalUseCase.g:1704:4: (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' )
                    // PsiInternalUseCase.g:1705:5: otherlv_2= 'Genutzte' otherlv_3= 'Fehler:'
                    {

                    					markLeaf(elementTypeProvider.getUsedExceptions_GenutzteKeyword_0_1_0ElementType());
                    				
                    otherlv_2=(Token)match(input,67,FOLLOW_53); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getUsedExceptions_FehlerKeyword_0_1_1ElementType());
                    				
                    otherlv_3=(Token)match(input,72,FOLLOW_37); 

                    					doneLeaf(otherlv_3);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1721:3: ( (lv_exceptions_4_0= ruleExceptionDecleration ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==26) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // PsiInternalUseCase.g:1722:4: (lv_exceptions_4_0= ruleExceptionDecleration )
            	    {
            	    // PsiInternalUseCase.g:1722:4: (lv_exceptions_4_0= ruleExceptionDecleration )
            	    // PsiInternalUseCase.g:1723:5: lv_exceptions_4_0= ruleExceptionDecleration
            	    {

            	    					markComposite(elementTypeProvider.getUsedExceptions_ExceptionsExceptionDeclerationParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_exceptions_4_0=ruleExceptionDecleration();

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
            	    break loop54;
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


    // $ANTLR start "entryRuleException"
    // PsiInternalUseCase.g:1740:1: entryRuleException returns [Boolean current=false] : iv_ruleException= ruleException EOF ;
    public final Boolean entryRuleException() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleException = null;


        try {
            // PsiInternalUseCase.g:1740:51: (iv_ruleException= ruleException EOF )
            // PsiInternalUseCase.g:1741:2: iv_ruleException= ruleException EOF
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
    // PsiInternalUseCase.g:1747:1: ruleException returns [Boolean current=false] : ( (otherlv_0= RULE_ID ) ) ;
    public final Boolean ruleException() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;

        try {
            // PsiInternalUseCase.g:1748:1: ( ( (otherlv_0= RULE_ID ) ) )
            // PsiInternalUseCase.g:1749:2: ( (otherlv_0= RULE_ID ) )
            {
            // PsiInternalUseCase.g:1749:2: ( (otherlv_0= RULE_ID ) )
            // PsiInternalUseCase.g:1750:3: (otherlv_0= RULE_ID )
            {
            // PsiInternalUseCase.g:1750:3: (otherlv_0= RULE_ID )
            // PsiInternalUseCase.g:1751:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleExceptionDecleration"
    // PsiInternalUseCase.g:1769:1: entryRuleExceptionDecleration returns [Boolean current=false] : iv_ruleExceptionDecleration= ruleExceptionDecleration EOF ;
    public final Boolean entryRuleExceptionDecleration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleExceptionDecleration = null;


        try {
            // PsiInternalUseCase.g:1769:62: (iv_ruleExceptionDecleration= ruleExceptionDecleration EOF )
            // PsiInternalUseCase.g:1770:2: iv_ruleExceptionDecleration= ruleExceptionDecleration EOF
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
    // PsiInternalUseCase.g:1776:1: ruleExceptionDecleration returns [Boolean current=false] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // PsiInternalUseCase.g:1777:1: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // PsiInternalUseCase.g:1778:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // PsiInternalUseCase.g:1778:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // PsiInternalUseCase.g:1779:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {

            			markLeaf(elementTypeProvider.getExceptionDecleration_HyphenMinusKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:1786:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:1787:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:1787:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:1788:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getExceptionDecleration_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_49); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getExceptionDecleration_LeftParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_9); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalUseCase.g:1810:3: ( (lv_message_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1811:4: (lv_message_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1811:4: (lv_message_3_0= RULE_STRING )
            // PsiInternalUseCase.g:1812:5: lv_message_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getExceptionDecleration_MessageSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_message_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getExceptionDecleration_RightParenthesisKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,41,FOLLOW_50); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalUseCase.g:1834:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==69) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // PsiInternalUseCase.g:1835:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {

                    				markLeaf(elementTypeProvider.getExceptionDecleration_LeftSquareBracketKeyword_5_0ElementType());
                    			
                    otherlv_5=(Token)match(input,69,FOLLOW_6); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalUseCase.g:1842:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // PsiInternalUseCase.g:1843:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // PsiInternalUseCase.g:1843:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // PsiInternalUseCase.g:1844:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						markComposite(elementTypeProvider.getExceptionDecleration_ImportInfoQualifiedNameParserRuleCall_5_1_0ElementType());
                    					
                    pushFollow(FOLLOW_51);
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
                    			
                    otherlv_7=(Token)match(input,70,FOLLOW_2); 

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