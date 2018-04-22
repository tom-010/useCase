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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Firma'", "'Company'", "'.'", "'Kathegorie'", "'package'", "'>'", "'use-case'", "'Rezept'", "'end'", "'of'", "'Ende'", "'des'", "'Rezpets'", "'description:'", "'Kurzbeschreibung:'", "'Beschreibung'", "'allowed-usergroups:'", "'Erlaubt'", "'f\\u00FCr:'", "'many'", "'-'", "'as'", "'requires:'", "'require:'", "'requires'", "'the'", "'following'", "'input'", "':'", "'Ben\\u00F6tigte'", "'Zutaten'", "'optional:'", "'optional'", "'inputs'", "'Optionale'", "'Optional'", "'als'", "'('", "'e.g'", "'z.B.'", "')'", "'produces:'", "'produce:'", "'produces'", "'output'", "'Ergebnis:'", "'pre-condition:'", "'pre-conditions:'", "'Vorbedingungen:'", "'steps:'", "'Schritte:'", "'On'", "'error'", "'raise'", "'Bei'", "'Fehler'", "'melde'", "'Raise'", "'Melde'", "'If'", "'Falls'", "'Solange'", "'While'", "'notes:'", "'note:'", "'Anmerkungen:'", "'Anmerkung:'", "'used'", "'building-blocks:'", "'Genutzte'", "'Bausteine:'", "'['", "']'", "'errors:'", "'Fehler:'", "'Beispiel'", "'Beschreibung:'", "'Warum?'", "'Gegeben'", "'gegeben'", "'und'", "'aber'", "'Wenn'", "'Dann'", "'dann'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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
    // InternalUseCase.g:71:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) )? ( (lv_exceptions_6_0= ruleUsedExceptions ) )? ( (lv_examples_7_0= ruleExample ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_company_2_0 = null;

        EObject lv_package_3_0 = null;

        EObject lv_useCases_4_0 = null;

        EObject lv_types_5_0 = null;

        EObject lv_exceptions_6_0 = null;

        EObject lv_examples_7_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:77:2: ( ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) )? ( (lv_exceptions_6_0= ruleUsedExceptions ) )? ( (lv_examples_7_0= ruleExample ) )* ) )
            // InternalUseCase.g:78:2: ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) )? ( (lv_exceptions_6_0= ruleUsedExceptions ) )? ( (lv_examples_7_0= ruleExample ) )* )
            {
            // InternalUseCase.g:78:2: ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) )? ( (lv_exceptions_6_0= ruleUsedExceptions ) )? ( (lv_examples_7_0= ruleExample ) )* )
            // InternalUseCase.g:79:3: (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) )? ( (lv_exceptions_6_0= ruleUsedExceptions ) )? ( (lv_examples_7_0= ruleExample ) )*
            {
            // InternalUseCase.g:79:3: (otherlv_0= 'Firma' | otherlv_1= 'Company' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUseCase.g:80:4: otherlv_0= 'Firma'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getFirmaKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:85:4: otherlv_1= 'Company'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getCompanyKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:90:3: ( (lv_company_2_0= ruleQualifiedName ) )
            // InternalUseCase.g:91:4: (lv_company_2_0= ruleQualifiedName )
            {
            // InternalUseCase.g:91:4: (lv_company_2_0= ruleQualifiedName )
            // InternalUseCase.g:92:5: lv_company_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getCompanyQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_company_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"company",
            						lv_company_2_0,
            						"io.deniffel.dsl.useCase.UseCase.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:109:3: ( (lv_package_3_0= rulePackage ) )
            // InternalUseCase.g:110:4: (lv_package_3_0= rulePackage )
            {
            // InternalUseCase.g:110:4: (lv_package_3_0= rulePackage )
            // InternalUseCase.g:111:5: lv_package_3_0= rulePackage
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_package_3_0=rulePackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"package",
            						lv_package_3_0,
            						"io.deniffel.dsl.useCase.UseCase.Package");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:128:3: ( (lv_useCases_4_0= ruleUseCase ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCase.g:129:4: (lv_useCases_4_0= ruleUseCase )
            	    {
            	    // InternalUseCase.g:129:4: (lv_useCases_4_0= ruleUseCase )
            	    // InternalUseCase.g:130:5: lv_useCases_4_0= ruleUseCase
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_useCases_4_0=ruleUseCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"useCases",
            	    						lv_useCases_4_0,
            	    						"io.deniffel.dsl.useCase.UseCase.UseCase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalUseCase.g:147:3: ( (lv_types_5_0= ruleUsedTypes ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==78) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==79) ) {
                    alt3=1;
                }
            }
            else if ( (LA3_0==80) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==81) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalUseCase.g:148:4: (lv_types_5_0= ruleUsedTypes )
                    {
                    // InternalUseCase.g:148:4: (lv_types_5_0= ruleUsedTypes )
                    // InternalUseCase.g:149:5: lv_types_5_0= ruleUsedTypes
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getTypesUsedTypesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_types_5_0=ruleUsedTypes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"types",
                    						lv_types_5_0,
                    						"io.deniffel.dsl.useCase.UseCase.UsedTypes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:166:3: ( (lv_exceptions_6_0= ruleUsedExceptions ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==78||LA4_0==80) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:167:4: (lv_exceptions_6_0= ruleUsedExceptions )
                    {
                    // InternalUseCase.g:167:4: (lv_exceptions_6_0= ruleUsedExceptions )
                    // InternalUseCase.g:168:5: lv_exceptions_6_0= ruleUsedExceptions
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getExceptionsUsedExceptionsParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_exceptions_6_0=ruleUsedExceptions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"exceptions",
                    						lv_exceptions_6_0,
                    						"io.deniffel.dsl.useCase.UseCase.UsedExceptions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:185:3: ( (lv_examples_7_0= ruleExample ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==86) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUseCase.g:186:4: (lv_examples_7_0= ruleExample )
            	    {
            	    // InternalUseCase.g:186:4: (lv_examples_7_0= ruleExample )
            	    // InternalUseCase.g:187:5: lv_examples_7_0= ruleExample
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getExamplesExampleParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_examples_7_0=ruleExample();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"examples",
            	    						lv_examples_7_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Example");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUseCase.g:208:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUseCase.g:208:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUseCase.g:209:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalUseCase.g:215:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:221:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUseCase.g:222:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUseCase.g:222:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUseCase.g:223:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUseCase.g:230:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUseCase.g:231:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalUseCase.g:248:1: entryRuleQualifiedNumber returns [String current=null] : iv_ruleQualifiedNumber= ruleQualifiedNumber EOF ;
    public final String entryRuleQualifiedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNumber = null;


        try {
            // InternalUseCase.g:248:55: (iv_ruleQualifiedNumber= ruleQualifiedNumber EOF )
            // InternalUseCase.g:249:2: iv_ruleQualifiedNumber= ruleQualifiedNumber EOF
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
    // InternalUseCase.g:255:1: ruleQualifiedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:261:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) )
            // InternalUseCase.g:262:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            {
            // InternalUseCase.g:262:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            // InternalUseCase.g:263:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.'
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_0());
            		
            // InternalUseCase.g:270:3: (kw= '.' this_INT_2= RULE_INT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_INT) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalUseCase.g:271:4: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)match(input,13,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_9); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            kw=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRulePackage"
    // InternalUseCase.g:293:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalUseCase.g:293:48: (iv_rulePackage= rulePackage EOF )
            // InternalUseCase.g:294:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalUseCase.g:300:1: rulePackage returns [EObject current=null] : ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parts_2_0 = null;

        EObject lv_parts_4_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:306:2: ( ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* ) )
            // InternalUseCase.g:307:2: ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* )
            {
            // InternalUseCase.g:307:2: ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* )
            // InternalUseCase.g:308:3: (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )*
            {
            // InternalUseCase.g:308:3: (otherlv_0= 'Kathegorie' | otherlv_1= 'package' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:309:4: otherlv_0= 'Kathegorie'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getKathegorieKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:314:4: otherlv_1= 'package'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:319:3: ( (lv_parts_2_0= rulePackagePart ) )
            // InternalUseCase.g:320:4: (lv_parts_2_0= rulePackagePart )
            {
            // InternalUseCase.g:320:4: (lv_parts_2_0= rulePackagePart )
            // InternalUseCase.g:321:5: lv_parts_2_0= rulePackagePart
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getPartsPackagePartParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_parts_2_0=rulePackagePart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					add(
            						current,
            						"parts",
            						lv_parts_2_0,
            						"io.deniffel.dsl.useCase.UseCase.PackagePart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:338:3: (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUseCase.g:339:4: otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getGreaterThanSignKeyword_2_0());
            	    			
            	    // InternalUseCase.g:343:4: ( (lv_parts_4_0= rulePackagePart ) )
            	    // InternalUseCase.g:344:5: (lv_parts_4_0= rulePackagePart )
            	    {
            	    // InternalUseCase.g:344:5: (lv_parts_4_0= rulePackagePart )
            	    // InternalUseCase.g:345:6: lv_parts_4_0= rulePackagePart
            	    {

            	    						newCompositeNode(grammarAccess.getPackageAccess().getPartsPackagePartParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_parts_4_0=rulePackagePart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parts",
            	    							lv_parts_4_0,
            	    							"io.deniffel.dsl.useCase.UseCase.PackagePart");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackagePart"
    // InternalUseCase.g:367:1: entryRulePackagePart returns [EObject current=null] : iv_rulePackagePart= rulePackagePart EOF ;
    public final EObject entryRulePackagePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagePart = null;


        try {
            // InternalUseCase.g:367:52: (iv_rulePackagePart= rulePackagePart EOF )
            // InternalUseCase.g:368:2: iv_rulePackagePart= rulePackagePart EOF
            {
             newCompositeNode(grammarAccess.getPackagePartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackagePart=rulePackagePart();

            state._fsp--;

             current =iv_rulePackagePart; 
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
    // $ANTLR end "entryRulePackagePart"


    // $ANTLR start "rulePackagePart"
    // InternalUseCase.g:374:1: rulePackagePart returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePackagePart() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:380:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalUseCase.g:381:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalUseCase.g:381:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalUseCase.g:382:3: (lv_name_0_0= RULE_ID )
            {
            // InternalUseCase.g:382:3: (lv_name_0_0= RULE_ID )
            // InternalUseCase.g:383:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPackagePartAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPackagePartRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "rulePackagePart"


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCase.g:402:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUseCase.g:402:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUseCase.g:403:2: iv_ruleUseCase= ruleUseCase EOF
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
    // InternalUseCase.g:409:1: ruleUseCase returns [EObject current=null] : ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )? ( (lv_outputs_7_0= ruleOutputs ) )? ( (lv_preconditions_8_0= rulePreConditions ) )? ( (lv_steps_9_0= ruleSteps ) )? ( (lv_notes_10_0= ruleNotes ) )? ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) ) ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_descriptions_3_0 = null;

        EObject lv_allowedUserGroups_4_0 = null;

        EObject lv_inputs_5_0 = null;

        EObject lv_optionalInputs_6_0 = null;

        EObject lv_outputs_7_0 = null;

        EObject lv_preconditions_8_0 = null;

        EObject lv_steps_9_0 = null;

        EObject lv_notes_10_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:415:2: ( ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )? ( (lv_outputs_7_0= ruleOutputs ) )? ( (lv_preconditions_8_0= rulePreConditions ) )? ( (lv_steps_9_0= ruleSteps ) )? ( (lv_notes_10_0= ruleNotes ) )? ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) ) ) )
            // InternalUseCase.g:416:2: ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )? ( (lv_outputs_7_0= ruleOutputs ) )? ( (lv_preconditions_8_0= rulePreConditions ) )? ( (lv_steps_9_0= ruleSteps ) )? ( (lv_notes_10_0= ruleNotes ) )? ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) ) )
            {
            // InternalUseCase.g:416:2: ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )? ( (lv_outputs_7_0= ruleOutputs ) )? ( (lv_preconditions_8_0= rulePreConditions ) )? ( (lv_steps_9_0= ruleSteps ) )? ( (lv_notes_10_0= ruleNotes ) )? ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) ) )
            // InternalUseCase.g:417:3: (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )? ( (lv_outputs_7_0= ruleOutputs ) )? ( (lv_preconditions_8_0= rulePreConditions ) )? ( (lv_steps_9_0= ruleSteps ) )? ( (lv_notes_10_0= ruleNotes ) )? ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) )
            {
            // InternalUseCase.g:417:3: (otherlv_0= 'use-case' | otherlv_1= 'Rezept' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==18) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCase.g:418:4: otherlv_0= 'use-case'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:423:4: otherlv_1= 'Rezept'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getUseCaseAccess().getRezeptKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:428:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUseCase.g:429:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalUseCase.g:429:4: (lv_name_2_0= RULE_STRING )
            // InternalUseCase.g:430:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            // InternalUseCase.g:446:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=24 && LA11_0<=26)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:447:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalUseCase.g:447:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalUseCase.g:448:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getDescriptionsDescriptionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
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

            // InternalUseCase.g:465:3: ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=27 && LA12_0<=28)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCase.g:466:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    {
                    // InternalUseCase.g:466:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    // InternalUseCase.g:467:5: lv_allowedUserGroups_4_0= ruleAllowedUserGroups
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAllowedUserGroupsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_15);
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

            // InternalUseCase.g:484:3: ( (lv_inputs_5_0= ruleInputs ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=33 && LA13_0<=35)||LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCase.g:485:4: (lv_inputs_5_0= ruleInputs )
                    {
                    // InternalUseCase.g:485:4: (lv_inputs_5_0= ruleInputs )
                    // InternalUseCase.g:486:5: lv_inputs_5_0= ruleInputs
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getInputsInputsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_16);
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

            // InternalUseCase.g:503:3: ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=42 && LA14_0<=43)||(LA14_0>=45 && LA14_0<=46)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCase.g:504:4: (lv_optionalInputs_6_0= ruleOptionalInputs )
                    {
                    // InternalUseCase.g:504:4: (lv_optionalInputs_6_0= ruleOptionalInputs )
                    // InternalUseCase.g:505:5: lv_optionalInputs_6_0= ruleOptionalInputs
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getOptionalInputsOptionalInputsParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_optionalInputs_6_0=ruleOptionalInputs();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"optionalInputs",
                    						lv_optionalInputs_6_0,
                    						"io.deniffel.dsl.useCase.UseCase.OptionalInputs");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:522:3: ( (lv_outputs_7_0= ruleOutputs ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=52 && LA15_0<=54)||LA15_0==56) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUseCase.g:523:4: (lv_outputs_7_0= ruleOutputs )
                    {
                    // InternalUseCase.g:523:4: (lv_outputs_7_0= ruleOutputs )
                    // InternalUseCase.g:524:5: lv_outputs_7_0= ruleOutputs
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getOutputsOutputsParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_outputs_7_0=ruleOutputs();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"outputs",
                    						lv_outputs_7_0,
                    						"io.deniffel.dsl.useCase.UseCase.Outputs");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:541:3: ( (lv_preconditions_8_0= rulePreConditions ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=57 && LA16_0<=59)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUseCase.g:542:4: (lv_preconditions_8_0= rulePreConditions )
                    {
                    // InternalUseCase.g:542:4: (lv_preconditions_8_0= rulePreConditions )
                    // InternalUseCase.g:543:5: lv_preconditions_8_0= rulePreConditions
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getPreconditionsPreConditionsParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_preconditions_8_0=rulePreConditions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					set(
                    						current,
                    						"preconditions",
                    						lv_preconditions_8_0,
                    						"io.deniffel.dsl.useCase.UseCase.PreConditions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:560:3: ( (lv_steps_9_0= ruleSteps ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=60 && LA17_0<=61)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCase.g:561:4: (lv_steps_9_0= ruleSteps )
                    {
                    // InternalUseCase.g:561:4: (lv_steps_9_0= ruleSteps )
                    // InternalUseCase.g:562:5: lv_steps_9_0= ruleSteps
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getStepsStepsParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_steps_9_0=ruleSteps();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"steps",
                    						lv_steps_9_0,
                    						"io.deniffel.dsl.useCase.UseCase.Steps");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:579:3: ( (lv_notes_10_0= ruleNotes ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=74 && LA18_0<=77)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCase.g:580:4: (lv_notes_10_0= ruleNotes )
                    {
                    // InternalUseCase.g:580:4: (lv_notes_10_0= ruleNotes )
                    // InternalUseCase.g:581:5: lv_notes_10_0= ruleNotes
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getNotesNotesParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_notes_10_0=ruleNotes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"notes",
                    						lv_notes_10_0,
                    						"io.deniffel.dsl.useCase.UseCase.Notes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:598:3: ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            else if ( (LA19_0==21) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCase.g:599:4: (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' )
                    {
                    // InternalUseCase.g:599:4: (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' )
                    // InternalUseCase.g:600:5: otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_22); 

                    					newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getEndKeyword_10_0_0());
                    				
                    otherlv_12=(Token)match(input,20,FOLLOW_23); 

                    					newLeafNode(otherlv_12, grammarAccess.getUseCaseAccess().getOfKeyword_10_0_1());
                    				
                    otherlv_13=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getUseCaseAccess().getUseCaseKeyword_10_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:614:4: (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' )
                    {
                    // InternalUseCase.g:614:4: (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' )
                    // InternalUseCase.g:615:5: otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets'
                    {
                    otherlv_14=(Token)match(input,21,FOLLOW_24); 

                    					newLeafNode(otherlv_14, grammarAccess.getUseCaseAccess().getEndeKeyword_10_1_0());
                    				
                    otherlv_15=(Token)match(input,22,FOLLOW_25); 

                    					newLeafNode(otherlv_15, grammarAccess.getUseCaseAccess().getDesKeyword_10_1_1());
                    				
                    otherlv_16=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(otherlv_16, grammarAccess.getUseCaseAccess().getRezpetsKeyword_10_1_2());
                    				

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
    // InternalUseCase.g:633:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalUseCase.g:633:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalUseCase.g:634:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalUseCase.g:640:1: ruleDescription returns [EObject current=null] : ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:646:2: ( ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:647:2: ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:647:2: ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalUseCase.g:648:3: (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) )
            {
            // InternalUseCase.g:648:3: (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt20=1;
                }
                break;
            case 25:
                {
                alt20=2;
                }
                break;
            case 26:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalUseCase.g:649:4: otherlv_0= 'description:'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:654:4: otherlv_1= 'Kurzbeschreibung:'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCase.g:659:4: otherlv_2= 'Beschreibung'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getDescriptionAccess().getBeschreibungKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:664:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalUseCase.g:665:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalUseCase.g:665:4: (lv_name_3_0= RULE_STRING )
            // InternalUseCase.g:666:5: lv_name_3_0= RULE_STRING
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
    // InternalUseCase.g:686:1: entryRuleAllowedUserGroups returns [EObject current=null] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final EObject entryRuleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroups = null;


        try {
            // InternalUseCase.g:686:58: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // InternalUseCase.g:687:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
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
    // InternalUseCase.g:693:1: ruleAllowedUserGroups returns [EObject current=null] : ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* ) ;
    public final EObject ruleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_groups_3_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:699:2: ( ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* ) )
            // InternalUseCase.g:700:2: ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* )
            {
            // InternalUseCase.g:700:2: ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* )
            // InternalUseCase.g:701:3: (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )*
            {
            // InternalUseCase.g:701:3: (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            else if ( (LA21_0==28) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:702:4: otherlv_0= 'allowed-usergroups:'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:707:4: (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' )
                    {
                    // InternalUseCase.g:707:4: (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' )
                    // InternalUseCase.g:708:5: otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_27); 

                    					newLeafNode(otherlv_1, grammarAccess.getAllowedUserGroupsAccess().getErlaubtKeyword_0_1_0());
                    				
                    otherlv_2=(Token)match(input,29,FOLLOW_26); 

                    					newLeafNode(otherlv_2, grammarAccess.getAllowedUserGroupsAccess().getFürKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:718:3: ( (lv_groups_3_0= ruleAllowedUserGroup ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=30 && LA22_0<=31)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUseCase.g:719:4: (lv_groups_3_0= ruleAllowedUserGroup )
            	    {
            	    // InternalUseCase.g:719:4: (lv_groups_3_0= ruleAllowedUserGroup )
            	    // InternalUseCase.g:720:5: lv_groups_3_0= ruleAllowedUserGroup
            	    {

            	    					newCompositeNode(grammarAccess.getAllowedUserGroupsAccess().getGroupsAllowedUserGroupParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop22;
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
    // InternalUseCase.g:741:1: entryRuleAllowedUserGroup returns [EObject current=null] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final EObject entryRuleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroup = null;


        try {
            // InternalUseCase.g:741:57: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // InternalUseCase.g:742:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
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
    // InternalUseCase.g:748:1: ruleAllowedUserGroup returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUseCase.g:754:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalUseCase.g:755:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalUseCase.g:755:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalUseCase.g:756:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalUseCase.g:756:3: ( (lv_many_0_0= 'many' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:757:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:757:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:758:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,30,FOLLOW_28); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAllowedUserGroupRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:774:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUseCase.g:775:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalUseCase.g:775:4: (lv_name_2_0= RULE_STRING )
            // InternalUseCase.g:776:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            // InternalUseCase.g:792:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:793:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:797:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:798:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:798:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:799:6: otherlv_4= RULE_ID
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
    // InternalUseCase.g:815:1: entryRuleInputs returns [EObject current=null] : iv_ruleInputs= ruleInputs EOF ;
    public final EObject entryRuleInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputs = null;


        try {
            // InternalUseCase.g:815:47: (iv_ruleInputs= ruleInputs EOF )
            // InternalUseCase.g:816:2: iv_ruleInputs= ruleInputs EOF
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
    // InternalUseCase.g:822:1: ruleInputs returns [EObject current=null] : ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* ) ;
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
            // InternalUseCase.g:828:2: ( ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* ) )
            // InternalUseCase.g:829:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* )
            {
            // InternalUseCase.g:829:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* )
            // InternalUseCase.g:830:3: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )*
            {
            // InternalUseCase.g:830:3: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=33 && LA26_0<=35)) ) {
                alt26=1;
            }
            else if ( (LA26_0==40) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCase.g:831:4: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
                    {
                    // InternalUseCase.g:831:4: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
                    int alt25=3;
                    switch ( input.LA(1) ) {
                    case 33:
                        {
                        alt25=1;
                        }
                        break;
                    case 34:
                        {
                        alt25=2;
                        }
                        break;
                    case 35:
                        {
                        alt25=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // InternalUseCase.g:832:5: otherlv_0= 'requires:'
                            {
                            otherlv_0=(Token)match(input,33,FOLLOW_26); 

                            					newLeafNode(otherlv_0, grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:837:5: otherlv_1= 'require:'
                            {
                            otherlv_1=(Token)match(input,34,FOLLOW_26); 

                            					newLeafNode(otherlv_1, grammarAccess.getInputsAccess().getRequireKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUseCase.g:842:5: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                            {
                            // InternalUseCase.g:842:5: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                            // InternalUseCase.g:843:6: otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':'
                            {
                            otherlv_2=(Token)match(input,35,FOLLOW_30); 

                            						newLeafNode(otherlv_2, grammarAccess.getInputsAccess().getRequiresKeyword_0_0_2_0());
                            					
                            otherlv_3=(Token)match(input,36,FOLLOW_31); 

                            						newLeafNode(otherlv_3, grammarAccess.getInputsAccess().getTheKeyword_0_0_2_1());
                            					
                            otherlv_4=(Token)match(input,37,FOLLOW_32); 

                            						newLeafNode(otherlv_4, grammarAccess.getInputsAccess().getFollowingKeyword_0_0_2_2());
                            					
                            otherlv_5=(Token)match(input,38,FOLLOW_33); 

                            						newLeafNode(otherlv_5, grammarAccess.getInputsAccess().getInputKeyword_0_0_2_3());
                            					
                            otherlv_6=(Token)match(input,39,FOLLOW_26); 

                            						newLeafNode(otherlv_6, grammarAccess.getInputsAccess().getColonKeyword_0_0_2_4());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:866:4: (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' )
                    {
                    // InternalUseCase.g:866:4: (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' )
                    // InternalUseCase.g:867:5: otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':'
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_34); 

                    					newLeafNode(otherlv_7, grammarAccess.getInputsAccess().getBenötigteKeyword_0_1_0());
                    				
                    otherlv_8=(Token)match(input,41,FOLLOW_33); 

                    					newLeafNode(otherlv_8, grammarAccess.getInputsAccess().getZutatenKeyword_0_1_1());
                    				
                    otherlv_9=(Token)match(input,39,FOLLOW_26); 

                    					newLeafNode(otherlv_9, grammarAccess.getInputsAccess().getColonKeyword_0_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:881:3: ( (lv_inputs_10_0= ruleInput ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=30 && LA27_0<=31)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUseCase.g:882:4: (lv_inputs_10_0= ruleInput )
            	    {
            	    // InternalUseCase.g:882:4: (lv_inputs_10_0= ruleInput )
            	    // InternalUseCase.g:883:5: lv_inputs_10_0= ruleInput
            	    {

            	    					newCompositeNode(grammarAccess.getInputsAccess().getInputsInputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleOptionalInputs"
    // InternalUseCase.g:904:1: entryRuleOptionalInputs returns [EObject current=null] : iv_ruleOptionalInputs= ruleOptionalInputs EOF ;
    public final EObject entryRuleOptionalInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalInputs = null;


        try {
            // InternalUseCase.g:904:55: (iv_ruleOptionalInputs= ruleOptionalInputs EOF )
            // InternalUseCase.g:905:2: iv_ruleOptionalInputs= ruleOptionalInputs EOF
            {
             newCompositeNode(grammarAccess.getOptionalInputsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionalInputs=ruleOptionalInputs();

            state._fsp--;

             current =iv_ruleOptionalInputs; 
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
    // $ANTLR end "entryRuleOptionalInputs"


    // $ANTLR start "ruleOptionalInputs"
    // InternalUseCase.g:911:1: ruleOptionalInputs returns [EObject current=null] : ( ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) ) ( (lv_inputs_8_0= ruleInput ) )* ) ;
    public final EObject ruleOptionalInputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_inputs_8_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:917:2: ( ( ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) ) ( (lv_inputs_8_0= ruleInput ) )* ) )
            // InternalUseCase.g:918:2: ( ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) ) ( (lv_inputs_8_0= ruleInput ) )* )
            {
            // InternalUseCase.g:918:2: ( ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) ) ( (lv_inputs_8_0= ruleInput ) )* )
            // InternalUseCase.g:919:3: ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) ) ( (lv_inputs_8_0= ruleInput ) )*
            {
            // InternalUseCase.g:919:3: ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=42 && LA30_0<=43)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=45 && LA30_0<=46)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalUseCase.g:920:4: (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) )
                    {
                    // InternalUseCase.g:920:4: (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==42) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==43) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalUseCase.g:921:5: otherlv_0= 'optional:'
                            {
                            otherlv_0=(Token)match(input,42,FOLLOW_26); 

                            					newLeafNode(otherlv_0, grammarAccess.getOptionalInputsAccess().getOptionalKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:926:5: (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' )
                            {
                            // InternalUseCase.g:926:5: (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' )
                            // InternalUseCase.g:927:6: otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':'
                            {
                            otherlv_1=(Token)match(input,43,FOLLOW_35); 

                            						newLeafNode(otherlv_1, grammarAccess.getOptionalInputsAccess().getOptionalKeyword_0_0_1_0());
                            					
                            otherlv_2=(Token)match(input,44,FOLLOW_33); 

                            						newLeafNode(otherlv_2, grammarAccess.getOptionalInputsAccess().getInputsKeyword_0_0_1_1());
                            					
                            otherlv_3=(Token)match(input,39,FOLLOW_26); 

                            						newLeafNode(otherlv_3, grammarAccess.getOptionalInputsAccess().getColonKeyword_0_0_1_2());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:942:4: ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' )
                    {
                    // InternalUseCase.g:942:4: ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' )
                    // InternalUseCase.g:943:5: ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':'
                    {
                    // InternalUseCase.g:943:5: ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==45) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==46) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalUseCase.g:944:6: (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' )
                            {
                            // InternalUseCase.g:944:6: (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' )
                            // InternalUseCase.g:945:7: otherlv_4= 'Optionale' otherlv_5= 'Zutaten'
                            {
                            otherlv_4=(Token)match(input,45,FOLLOW_34); 

                            							newLeafNode(otherlv_4, grammarAccess.getOptionalInputsAccess().getOptionaleKeyword_0_1_0_0_0());
                            						
                            otherlv_5=(Token)match(input,41,FOLLOW_33); 

                            							newLeafNode(otherlv_5, grammarAccess.getOptionalInputsAccess().getZutatenKeyword_0_1_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:955:6: otherlv_6= 'Optional'
                            {
                            otherlv_6=(Token)match(input,46,FOLLOW_33); 

                            						newLeafNode(otherlv_6, grammarAccess.getOptionalInputsAccess().getOptionalKeyword_0_1_0_1());
                            					

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,39,FOLLOW_26); 

                    					newLeafNode(otherlv_7, grammarAccess.getOptionalInputsAccess().getColonKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:966:3: ( (lv_inputs_8_0= ruleInput ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=30 && LA31_0<=31)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalUseCase.g:967:4: (lv_inputs_8_0= ruleInput )
            	    {
            	    // InternalUseCase.g:967:4: (lv_inputs_8_0= ruleInput )
            	    // InternalUseCase.g:968:5: lv_inputs_8_0= ruleInput
            	    {

            	    					newCompositeNode(grammarAccess.getOptionalInputsAccess().getInputsInputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_inputs_8_0=ruleInput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOptionalInputsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputs",
            	    						lv_inputs_8_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Input");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleOptionalInputs"


    // $ANTLR start "entryRuleInput"
    // InternalUseCase.g:989:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalUseCase.g:989:46: (iv_ruleInput= ruleInput EOF )
            // InternalUseCase.g:990:2: iv_ruleInput= ruleInput EOF
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
    // InternalUseCase.g:996:1: ruleInput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? ) ;
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
            // InternalUseCase.g:1002:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? ) )
            // InternalUseCase.g:1003:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? )
            {
            // InternalUseCase.g:1003:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? )
            // InternalUseCase.g:1004:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )?
            {
            // InternalUseCase.g:1004:3: ( (lv_many_0_0= 'many' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUseCase.g:1005:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:1005:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:1006:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,30,FOLLOW_28); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getInputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:1022:3: ( (lv_optional_2_0= ruleOptional ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUseCase.g:1023:4: (lv_optional_2_0= ruleOptional )
                    {
                    // InternalUseCase.g:1023:4: (lv_optional_2_0= ruleOptional )
                    // InternalUseCase.g:1024:5: lv_optional_2_0= ruleOptional
                    {

                    					newCompositeNode(grammarAccess.getInputAccess().getOptionalOptionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_12);
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

            // InternalUseCase.g:1041:3: ( (lv_content_3_0= RULE_STRING ) )
            // InternalUseCase.g:1042:4: (lv_content_3_0= RULE_STRING )
            {
            // InternalUseCase.g:1042:4: (lv_content_3_0= RULE_STRING )
            // InternalUseCase.g:1043:5: lv_content_3_0= RULE_STRING
            {
            lv_content_3_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

            // InternalUseCase.g:1059:3: ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32||LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUseCase.g:1060:4: (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalUseCase.g:1060:4: (otherlv_4= 'as' | otherlv_5= 'als' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==32) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==47) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalUseCase.g:1061:5: otherlv_4= 'as'
                            {
                            otherlv_4=(Token)match(input,32,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getInputAccess().getAsKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1066:5: otherlv_5= 'als'
                            {
                            otherlv_5=(Token)match(input,47,FOLLOW_3); 

                            					newLeafNode(otherlv_5, grammarAccess.getInputAccess().getAlsKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:1071:4: ( (otherlv_6= RULE_ID ) )
                    // InternalUseCase.g:1072:5: (otherlv_6= RULE_ID )
                    {
                    // InternalUseCase.g:1072:5: (otherlv_6= RULE_ID )
                    // InternalUseCase.g:1073:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(otherlv_6, grammarAccess.getInputAccess().getTypeTypeCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:1085:3: (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUseCase.g:1086:4: otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_39); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalUseCase.g:1090:4: (otherlv_8= 'e.g' | otherlv_9= 'z.B.' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==49) ) {
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
                            // InternalUseCase.g:1091:5: otherlv_8= 'e.g'
                            {
                            otherlv_8=(Token)match(input,49,FOLLOW_12); 

                            					newLeafNode(otherlv_8, grammarAccess.getInputAccess().getEGKeyword_5_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1096:5: otherlv_9= 'z.B.'
                            {
                            otherlv_9=(Token)match(input,50,FOLLOW_12); 

                            					newLeafNode(otherlv_9, grammarAccess.getInputAccess().getZBKeyword_5_1_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:1101:4: ( (lv_example_10_0= RULE_STRING ) )
                    // InternalUseCase.g:1102:5: (lv_example_10_0= RULE_STRING )
                    {
                    // InternalUseCase.g:1102:5: (lv_example_10_0= RULE_STRING )
                    // InternalUseCase.g:1103:6: lv_example_10_0= RULE_STRING
                    {
                    lv_example_10_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

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

                    otherlv_11=(Token)match(input,51,FOLLOW_2); 

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
    // InternalUseCase.g:1128:1: entryRuleOutputs returns [EObject current=null] : iv_ruleOutputs= ruleOutputs EOF ;
    public final EObject entryRuleOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputs = null;


        try {
            // InternalUseCase.g:1128:48: (iv_ruleOutputs= ruleOutputs EOF )
            // InternalUseCase.g:1129:2: iv_ruleOutputs= ruleOutputs EOF
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
    // InternalUseCase.g:1135:1: ruleOutputs returns [EObject current=null] : ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* ) ;
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
            // InternalUseCase.g:1141:2: ( ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* ) )
            // InternalUseCase.g:1142:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* )
            {
            // InternalUseCase.g:1142:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* )
            // InternalUseCase.g:1143:3: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )*
            {
            // InternalUseCase.g:1143:3: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=52 && LA39_0<=54)) ) {
                alt39=1;
            }
            else if ( (LA39_0==56) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalUseCase.g:1144:4: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
                    {
                    // InternalUseCase.g:1144:4: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
                    int alt38=3;
                    switch ( input.LA(1) ) {
                    case 52:
                        {
                        alt38=1;
                        }
                        break;
                    case 53:
                        {
                        alt38=2;
                        }
                        break;
                    case 54:
                        {
                        alt38=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }

                    switch (alt38) {
                        case 1 :
                            // InternalUseCase.g:1145:5: otherlv_0= 'produces:'
                            {
                            otherlv_0=(Token)match(input,52,FOLLOW_26); 

                            					newLeafNode(otherlv_0, grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1150:5: otherlv_1= 'produce:'
                            {
                            otherlv_1=(Token)match(input,53,FOLLOW_26); 

                            					newLeafNode(otherlv_1, grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUseCase.g:1155:5: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                            {
                            // InternalUseCase.g:1155:5: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                            // InternalUseCase.g:1156:6: otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':'
                            {
                            otherlv_2=(Token)match(input,54,FOLLOW_30); 

                            						newLeafNode(otherlv_2, grammarAccess.getOutputsAccess().getProducesKeyword_0_0_2_0());
                            					
                            otherlv_3=(Token)match(input,36,FOLLOW_31); 

                            						newLeafNode(otherlv_3, grammarAccess.getOutputsAccess().getTheKeyword_0_0_2_1());
                            					
                            otherlv_4=(Token)match(input,37,FOLLOW_41); 

                            						newLeafNode(otherlv_4, grammarAccess.getOutputsAccess().getFollowingKeyword_0_0_2_2());
                            					
                            otherlv_5=(Token)match(input,55,FOLLOW_33); 

                            						newLeafNode(otherlv_5, grammarAccess.getOutputsAccess().getOutputKeyword_0_0_2_3());
                            					
                            otherlv_6=(Token)match(input,39,FOLLOW_26); 

                            						newLeafNode(otherlv_6, grammarAccess.getOutputsAccess().getColonKeyword_0_0_2_4());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1179:4: otherlv_7= 'Ergebnis:'
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_26); 

                    				newLeafNode(otherlv_7, grammarAccess.getOutputsAccess().getErgebnisKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1184:3: ( (lv_outputs_8_0= ruleOutput ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=30 && LA40_0<=31)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUseCase.g:1185:4: (lv_outputs_8_0= ruleOutput )
            	    {
            	    // InternalUseCase.g:1185:4: (lv_outputs_8_0= ruleOutput )
            	    // InternalUseCase.g:1186:5: lv_outputs_8_0= ruleOutput
            	    {

            	    					newCompositeNode(grammarAccess.getOutputsAccess().getOutputsOutputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop40;
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
    // InternalUseCase.g:1207:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalUseCase.g:1207:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalUseCase.g:1208:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalUseCase.g:1214:1: ruleOutput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) ;
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
            // InternalUseCase.g:1220:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) )
            // InternalUseCase.g:1221:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            {
            // InternalUseCase.g:1221:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            // InternalUseCase.g:1222:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            {
            // InternalUseCase.g:1222:3: ( (lv_many_0_0= 'many' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUseCase.g:1223:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:1223:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:1224:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,30,FOLLOW_28); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getOutputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOutputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:1240:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:1241:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:1241:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:1242:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

            // InternalUseCase.g:1258:3: ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32||LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUseCase.g:1259:4: (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalUseCase.g:1259:4: (otherlv_3= 'as' | otherlv_4= 'als' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==32) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==47) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalUseCase.g:1260:5: otherlv_3= 'as'
                            {
                            otherlv_3=(Token)match(input,32,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getAsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1265:5: otherlv_4= 'als'
                            {
                            otherlv_4=(Token)match(input,47,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getAlsKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:1270:4: ( (otherlv_5= RULE_ID ) )
                    // InternalUseCase.g:1271:5: (otherlv_5= RULE_ID )
                    {
                    // InternalUseCase.g:1271:5: (otherlv_5= RULE_ID )
                    // InternalUseCase.g:1272:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:1284:3: (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUseCase.g:1285:4: otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_39); 

                    				newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalUseCase.g:1289:4: (otherlv_7= 'e.g' | otherlv_8= 'z.B.' )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==49) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==50) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalUseCase.g:1290:5: otherlv_7= 'e.g'
                            {
                            otherlv_7=(Token)match(input,49,FOLLOW_12); 

                            					newLeafNode(otherlv_7, grammarAccess.getOutputAccess().getEGKeyword_4_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1295:5: otherlv_8= 'z.B.'
                            {
                            otherlv_8=(Token)match(input,50,FOLLOW_12); 

                            					newLeafNode(otherlv_8, grammarAccess.getOutputAccess().getZBKeyword_4_1_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:1300:4: ( (lv_example_9_0= RULE_STRING ) )
                    // InternalUseCase.g:1301:5: (lv_example_9_0= RULE_STRING )
                    {
                    // InternalUseCase.g:1301:5: (lv_example_9_0= RULE_STRING )
                    // InternalUseCase.g:1302:6: lv_example_9_0= RULE_STRING
                    {
                    lv_example_9_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

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

                    otherlv_10=(Token)match(input,51,FOLLOW_2); 

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
    // InternalUseCase.g:1327:1: entryRuleOptional returns [String current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final String entryRuleOptional() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOptional = null;


        try {
            // InternalUseCase.g:1327:48: (iv_ruleOptional= ruleOptional EOF )
            // InternalUseCase.g:1328:2: iv_ruleOptional= ruleOptional EOF
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
    // InternalUseCase.g:1334:1: ruleOptional returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'optional' ;
    public final AntlrDatatypeRuleToken ruleOptional() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUseCase.g:1340:2: (kw= 'optional' )
            // InternalUseCase.g:1341:2: kw= 'optional'
            {
            kw=(Token)match(input,43,FOLLOW_2); 

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
    // InternalUseCase.g:1349:1: entryRulePreConditions returns [EObject current=null] : iv_rulePreConditions= rulePreConditions EOF ;
    public final EObject entryRulePreConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreConditions = null;


        try {
            // InternalUseCase.g:1349:54: (iv_rulePreConditions= rulePreConditions EOF )
            // InternalUseCase.g:1350:2: iv_rulePreConditions= rulePreConditions EOF
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
    // InternalUseCase.g:1356:1: rulePreConditions returns [EObject current=null] : ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* ) ;
    public final EObject rulePreConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_conditions_3_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1362:2: ( ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* ) )
            // InternalUseCase.g:1363:2: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* )
            {
            // InternalUseCase.g:1363:2: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* )
            // InternalUseCase.g:1364:3: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )*
            {
            // InternalUseCase.g:1364:3: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=57 && LA47_0<=58)) ) {
                alt47=1;
            }
            else if ( (LA47_0==59) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalUseCase.g:1365:4: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
                    {
                    // InternalUseCase.g:1365:4: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==57) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==58) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalUseCase.g:1366:5: otherlv_0= 'pre-condition:'
                            {
                            otherlv_0=(Token)match(input,57,FOLLOW_42); 

                            					newLeafNode(otherlv_0, grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1371:5: otherlv_1= 'pre-conditions:'
                            {
                            otherlv_1=(Token)match(input,58,FOLLOW_42); 

                            					newLeafNode(otherlv_1, grammarAccess.getPreConditionsAccess().getPreConditionsKeyword_0_0_1());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1377:4: otherlv_2= 'Vorbedingungen:'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_42); 

                    				newLeafNode(otherlv_2, grammarAccess.getPreConditionsAccess().getVorbedingungenKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1382:3: ( (lv_conditions_3_0= ruleCondition ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==31) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUseCase.g:1383:4: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // InternalUseCase.g:1383:4: (lv_conditions_3_0= ruleCondition )
            	    // InternalUseCase.g:1384:5: lv_conditions_3_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getPreConditionsAccess().getConditionsConditionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop48;
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
    // InternalUseCase.g:1405:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalUseCase.g:1405:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalUseCase.g:1406:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalUseCase.g:1412:1: ruleCondition returns [EObject current=null] : (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:1418:2: ( (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:1419:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:1419:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            // InternalUseCase.g:1420:3: otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:1424:3: ( (lv_content_1_0= RULE_STRING ) )
            // InternalUseCase.g:1425:4: (lv_content_1_0= RULE_STRING )
            {
            // InternalUseCase.g:1425:4: (lv_content_1_0= RULE_STRING )
            // InternalUseCase.g:1426:5: lv_content_1_0= RULE_STRING
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
    // InternalUseCase.g:1446:1: entryRuleSteps returns [EObject current=null] : iv_ruleSteps= ruleSteps EOF ;
    public final EObject entryRuleSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps = null;


        try {
            // InternalUseCase.g:1446:46: (iv_ruleSteps= ruleSteps EOF )
            // InternalUseCase.g:1447:2: iv_ruleSteps= ruleSteps EOF
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
    // InternalUseCase.g:1453:1: ruleSteps returns [EObject current=null] : ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* ) ;
    public final EObject ruleSteps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1459:2: ( ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* ) )
            // InternalUseCase.g:1460:2: ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* )
            {
            // InternalUseCase.g:1460:2: ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* )
            // InternalUseCase.g:1461:3: (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )*
            {
            // InternalUseCase.g:1461:3: (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            else if ( (LA49_0==61) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalUseCase.g:1462:4: otherlv_0= 'steps:'
                    {
                    otherlv_0=(Token)match(input,60,FOLLOW_43); 

                    				newLeafNode(otherlv_0, grammarAccess.getStepsAccess().getStepsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1467:4: otherlv_1= 'Schritte:'
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_43); 

                    				newLeafNode(otherlv_1, grammarAccess.getStepsAccess().getSchritteKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1472:3: ( (lv_steps_2_0= ruleStep ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_INT) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUseCase.g:1473:4: (lv_steps_2_0= ruleStep )
            	    {
            	    // InternalUseCase.g:1473:4: (lv_steps_2_0= ruleStep )
            	    // InternalUseCase.g:1474:5: lv_steps_2_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getStepsAccess().getStepsStepParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_43);
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
            	    break loop50;
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
    // InternalUseCase.g:1495:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalUseCase.g:1495:45: (iv_ruleStep= ruleStep EOF )
            // InternalUseCase.g:1496:2: iv_ruleStep= ruleStep EOF
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
    // InternalUseCase.g:1502:1: ruleStep returns [EObject current=null] : ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_action_1_0=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        EObject lv_error_2_0 = null;

        EObject lv_error_3_0 = null;

        EObject lv_condition_4_0 = null;

        EObject lv_loop_5_0 = null;

        EObject lv_exception_6_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1508:2: ( ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) ) ) )
            // InternalUseCase.g:1509:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) ) )
            {
            // InternalUseCase.g:1509:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) ) )
            // InternalUseCase.g:1510:3: ( (lv_number_0_0= ruleQualifiedNumber ) ) ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) )
            {
            // InternalUseCase.g:1510:3: ( (lv_number_0_0= ruleQualifiedNumber ) )
            // InternalUseCase.g:1511:4: (lv_number_0_0= ruleQualifiedNumber )
            {
            // InternalUseCase.g:1511:4: (lv_number_0_0= ruleQualifiedNumber )
            // InternalUseCase.g:1512:5: lv_number_0_0= ruleQualifiedNumber
            {

            					newCompositeNode(grammarAccess.getStepAccess().getNumberQualifiedNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalUseCase.g:1529:3: ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) )
            int alt52=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt52=1;
                }
                break;
            case 13:
            case 39:
                {
                alt52=2;
                }
                break;
            case 70:
            case 71:
                {
                alt52=3;
                }
                break;
            case 72:
            case 73:
                {
                alt52=4;
                }
                break;
            case 68:
            case 69:
                {
                alt52=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalUseCase.g:1530:4: ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? )
                    {
                    // InternalUseCase.g:1530:4: ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? )
                    // InternalUseCase.g:1531:5: ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )?
                    {
                    // InternalUseCase.g:1531:5: ( (lv_action_1_0= RULE_STRING ) )
                    // InternalUseCase.g:1532:6: (lv_action_1_0= RULE_STRING )
                    {
                    // InternalUseCase.g:1532:6: (lv_action_1_0= RULE_STRING )
                    // InternalUseCase.g:1533:7: lv_action_1_0= RULE_STRING
                    {
                    lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

                    							newLeafNode(lv_action_1_0, grammarAccess.getStepAccess().getActionSTRINGTerminalRuleCall_1_0_0_0());
                    						

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

                    // InternalUseCase.g:1549:5: ( (lv_error_2_0= ruleRaiseErrorConditional ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==13||LA51_0==39) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalUseCase.g:1550:6: (lv_error_2_0= ruleRaiseErrorConditional )
                            {
                            // InternalUseCase.g:1550:6: (lv_error_2_0= ruleRaiseErrorConditional )
                            // InternalUseCase.g:1551:7: lv_error_2_0= ruleRaiseErrorConditional
                            {

                            							newCompositeNode(grammarAccess.getStepAccess().getErrorRaiseErrorConditionalParserRuleCall_1_0_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_error_2_0=ruleRaiseErrorConditional();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getStepRule());
                            							}
                            							set(
                            								current,
                            								"error",
                            								lv_error_2_0,
                            								"io.deniffel.dsl.useCase.UseCase.RaiseErrorConditional");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1570:4: ( (lv_error_3_0= ruleRaiseErrorConditional ) )
                    {
                    // InternalUseCase.g:1570:4: ( (lv_error_3_0= ruleRaiseErrorConditional ) )
                    // InternalUseCase.g:1571:5: (lv_error_3_0= ruleRaiseErrorConditional )
                    {
                    // InternalUseCase.g:1571:5: (lv_error_3_0= ruleRaiseErrorConditional )
                    // InternalUseCase.g:1572:6: lv_error_3_0= ruleRaiseErrorConditional
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getErrorRaiseErrorConditionalParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_error_3_0=ruleRaiseErrorConditional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"error",
                    							lv_error_3_0,
                    							"io.deniffel.dsl.useCase.UseCase.RaiseErrorConditional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:1590:4: ( (lv_condition_4_0= ruleIfStatement ) )
                    {
                    // InternalUseCase.g:1590:4: ( (lv_condition_4_0= ruleIfStatement ) )
                    // InternalUseCase.g:1591:5: (lv_condition_4_0= ruleIfStatement )
                    {
                    // InternalUseCase.g:1591:5: (lv_condition_4_0= ruleIfStatement )
                    // InternalUseCase.g:1592:6: lv_condition_4_0= ruleIfStatement
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getConditionIfStatementParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_4_0=ruleIfStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_4_0,
                    							"io.deniffel.dsl.useCase.UseCase.IfStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUseCase.g:1610:4: ( (lv_loop_5_0= ruleLoop ) )
                    {
                    // InternalUseCase.g:1610:4: ( (lv_loop_5_0= ruleLoop ) )
                    // InternalUseCase.g:1611:5: (lv_loop_5_0= ruleLoop )
                    {
                    // InternalUseCase.g:1611:5: (lv_loop_5_0= ruleLoop )
                    // InternalUseCase.g:1612:6: lv_loop_5_0= ruleLoop
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getLoopLoopParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_loop_5_0=ruleLoop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"loop",
                    							lv_loop_5_0,
                    							"io.deniffel.dsl.useCase.UseCase.Loop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalUseCase.g:1630:4: ( (lv_exception_6_0= ruleRaiseErrorNow ) )
                    {
                    // InternalUseCase.g:1630:4: ( (lv_exception_6_0= ruleRaiseErrorNow ) )
                    // InternalUseCase.g:1631:5: (lv_exception_6_0= ruleRaiseErrorNow )
                    {
                    // InternalUseCase.g:1631:5: (lv_exception_6_0= ruleRaiseErrorNow )
                    // InternalUseCase.g:1632:6: lv_exception_6_0= ruleRaiseErrorNow
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getExceptionRaiseErrorNowParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exception_6_0=ruleRaiseErrorNow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"exception",
                    							lv_exception_6_0,
                    							"io.deniffel.dsl.useCase.UseCase.RaiseErrorNow");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleRaiseErrorConditional"
    // InternalUseCase.g:1654:1: entryRuleRaiseErrorConditional returns [EObject current=null] : iv_ruleRaiseErrorConditional= ruleRaiseErrorConditional EOF ;
    public final EObject entryRuleRaiseErrorConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiseErrorConditional = null;


        try {
            // InternalUseCase.g:1654:62: (iv_ruleRaiseErrorConditional= ruleRaiseErrorConditional EOF )
            // InternalUseCase.g:1655:2: iv_ruleRaiseErrorConditional= ruleRaiseErrorConditional EOF
            {
             newCompositeNode(grammarAccess.getRaiseErrorConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaiseErrorConditional=ruleRaiseErrorConditional();

            state._fsp--;

             current =iv_ruleRaiseErrorConditional; 
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
    // $ANTLR end "entryRuleRaiseErrorConditional"


    // $ANTLR start "ruleRaiseErrorConditional"
    // InternalUseCase.g:1661:1: ruleRaiseErrorConditional returns [EObject current=null] : ( (otherlv_0= '.' | otherlv_1= ':' ) ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) ) ( (lv_exception_8_0= ruleException ) ) ) ;
    public final EObject ruleRaiseErrorConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_exception_8_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1667:2: ( ( (otherlv_0= '.' | otherlv_1= ':' ) ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) ) ( (lv_exception_8_0= ruleException ) ) ) )
            // InternalUseCase.g:1668:2: ( (otherlv_0= '.' | otherlv_1= ':' ) ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) ) ( (lv_exception_8_0= ruleException ) ) )
            {
            // InternalUseCase.g:1668:2: ( (otherlv_0= '.' | otherlv_1= ':' ) ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) ) ( (lv_exception_8_0= ruleException ) ) )
            // InternalUseCase.g:1669:3: (otherlv_0= '.' | otherlv_1= ':' ) ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) ) ( (lv_exception_8_0= ruleException ) )
            {
            // InternalUseCase.g:1669:3: (otherlv_0= '.' | otherlv_1= ':' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==13) ) {
                alt53=1;
            }
            else if ( (LA53_0==39) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalUseCase.g:1670:4: otherlv_0= '.'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_46); 

                    				newLeafNode(otherlv_0, grammarAccess.getRaiseErrorConditionalAccess().getFullStopKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1675:4: otherlv_1= ':'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_46); 

                    				newLeafNode(otherlv_1, grammarAccess.getRaiseErrorConditionalAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1680:3: ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==62) ) {
                alt54=1;
            }
            else if ( (LA54_0==65) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalUseCase.g:1681:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    {
                    // InternalUseCase.g:1681:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    // InternalUseCase.g:1682:5: otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise'
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_47); 

                    					newLeafNode(otherlv_2, grammarAccess.getRaiseErrorConditionalAccess().getOnKeyword_1_0_0());
                    				
                    otherlv_3=(Token)match(input,63,FOLLOW_48); 

                    					newLeafNode(otherlv_3, grammarAccess.getRaiseErrorConditionalAccess().getErrorKeyword_1_0_1());
                    				
                    otherlv_4=(Token)match(input,64,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getRaiseErrorConditionalAccess().getRaiseKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1696:4: (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' )
                    {
                    // InternalUseCase.g:1696:4: (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' )
                    // InternalUseCase.g:1697:5: otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde'
                    {
                    otherlv_5=(Token)match(input,65,FOLLOW_49); 

                    					newLeafNode(otherlv_5, grammarAccess.getRaiseErrorConditionalAccess().getBeiKeyword_1_1_0());
                    				
                    otherlv_6=(Token)match(input,66,FOLLOW_50); 

                    					newLeafNode(otherlv_6, grammarAccess.getRaiseErrorConditionalAccess().getFehlerKeyword_1_1_1());
                    				
                    otherlv_7=(Token)match(input,67,FOLLOW_3); 

                    					newLeafNode(otherlv_7, grammarAccess.getRaiseErrorConditionalAccess().getMeldeKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1711:3: ( (lv_exception_8_0= ruleException ) )
            // InternalUseCase.g:1712:4: (lv_exception_8_0= ruleException )
            {
            // InternalUseCase.g:1712:4: (lv_exception_8_0= ruleException )
            // InternalUseCase.g:1713:5: lv_exception_8_0= ruleException
            {

            					newCompositeNode(grammarAccess.getRaiseErrorConditionalAccess().getExceptionExceptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exception_8_0=ruleException();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRaiseErrorConditionalRule());
            					}
            					set(
            						current,
            						"exception",
            						lv_exception_8_0,
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
    // $ANTLR end "ruleRaiseErrorConditional"


    // $ANTLR start "entryRuleRaiseErrorNow"
    // InternalUseCase.g:1734:1: entryRuleRaiseErrorNow returns [EObject current=null] : iv_ruleRaiseErrorNow= ruleRaiseErrorNow EOF ;
    public final EObject entryRuleRaiseErrorNow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiseErrorNow = null;


        try {
            // InternalUseCase.g:1734:54: (iv_ruleRaiseErrorNow= ruleRaiseErrorNow EOF )
            // InternalUseCase.g:1735:2: iv_ruleRaiseErrorNow= ruleRaiseErrorNow EOF
            {
             newCompositeNode(grammarAccess.getRaiseErrorNowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaiseErrorNow=ruleRaiseErrorNow();

            state._fsp--;

             current =iv_ruleRaiseErrorNow; 
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
    // $ANTLR end "entryRuleRaiseErrorNow"


    // $ANTLR start "ruleRaiseErrorNow"
    // InternalUseCase.g:1741:1: ruleRaiseErrorNow returns [EObject current=null] : ( ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) ) ( (lv_exception_4_0= ruleException ) ) ) ;
    public final EObject ruleRaiseErrorNow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_exception_4_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1747:2: ( ( ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) ) ( (lv_exception_4_0= ruleException ) ) ) )
            // InternalUseCase.g:1748:2: ( ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) ) ( (lv_exception_4_0= ruleException ) ) )
            {
            // InternalUseCase.g:1748:2: ( ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) ) ( (lv_exception_4_0= ruleException ) ) )
            // InternalUseCase.g:1749:3: ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) ) ( (lv_exception_4_0= ruleException ) )
            {
            // InternalUseCase.g:1749:3: ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==68) ) {
                alt57=1;
            }
            else if ( (LA57_0==69) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalUseCase.g:1750:4: (otherlv_0= 'Raise' (otherlv_1= 'error' )? )
                    {
                    // InternalUseCase.g:1750:4: (otherlv_0= 'Raise' (otherlv_1= 'error' )? )
                    // InternalUseCase.g:1751:5: otherlv_0= 'Raise' (otherlv_1= 'error' )?
                    {
                    otherlv_0=(Token)match(input,68,FOLLOW_51); 

                    					newLeafNode(otherlv_0, grammarAccess.getRaiseErrorNowAccess().getRaiseKeyword_0_0_0());
                    				
                    // InternalUseCase.g:1755:5: (otherlv_1= 'error' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==63) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalUseCase.g:1756:6: otherlv_1= 'error'
                            {
                            otherlv_1=(Token)match(input,63,FOLLOW_3); 

                            						newLeafNode(otherlv_1, grammarAccess.getRaiseErrorNowAccess().getErrorKeyword_0_0_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1763:4: (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? )
                    {
                    // InternalUseCase.g:1763:4: (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? )
                    // InternalUseCase.g:1764:5: otherlv_2= 'Melde' (otherlv_3= 'Fehler' )?
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_52); 

                    					newLeafNode(otherlv_2, grammarAccess.getRaiseErrorNowAccess().getMeldeKeyword_0_1_0());
                    				
                    // InternalUseCase.g:1768:5: (otherlv_3= 'Fehler' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==66) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalUseCase.g:1769:6: otherlv_3= 'Fehler'
                            {
                            otherlv_3=(Token)match(input,66,FOLLOW_3); 

                            						newLeafNode(otherlv_3, grammarAccess.getRaiseErrorNowAccess().getFehlerKeyword_0_1_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:1776:3: ( (lv_exception_4_0= ruleException ) )
            // InternalUseCase.g:1777:4: (lv_exception_4_0= ruleException )
            {
            // InternalUseCase.g:1777:4: (lv_exception_4_0= ruleException )
            // InternalUseCase.g:1778:5: lv_exception_4_0= ruleException
            {

            					newCompositeNode(grammarAccess.getRaiseErrorNowAccess().getExceptionExceptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_exception_4_0=ruleException();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRaiseErrorNowRule());
            					}
            					set(
            						current,
            						"exception",
            						lv_exception_4_0,
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
    // $ANTLR end "ruleRaiseErrorNow"


    // $ANTLR start "entryRuleIfStatement"
    // InternalUseCase.g:1799:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalUseCase.g:1799:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalUseCase.g:1800:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalUseCase.g:1806:1: ruleIfStatement returns [EObject current=null] : ( (otherlv_0= 'If' | otherlv_1= 'Falls' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1812:2: ( ( (otherlv_0= 'If' | otherlv_1= 'Falls' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' ) )
            // InternalUseCase.g:1813:2: ( (otherlv_0= 'If' | otherlv_1= 'Falls' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' )
            {
            // InternalUseCase.g:1813:2: ( (otherlv_0= 'If' | otherlv_1= 'Falls' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' )
            // InternalUseCase.g:1814:3: (otherlv_0= 'If' | otherlv_1= 'Falls' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':'
            {
            // InternalUseCase.g:1814:3: (otherlv_0= 'If' | otherlv_1= 'Falls' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==70) ) {
                alt58=1;
            }
            else if ( (LA58_0==71) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalUseCase.g:1815:4: otherlv_0= 'If'
                    {
                    otherlv_0=(Token)match(input,70,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1820:4: otherlv_1= 'Falls'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getFallsKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1825:3: ( (lv_condition_2_0= ruleBooleanCondition ) )
            // InternalUseCase.g:1826:4: (lv_condition_2_0= ruleBooleanCondition )
            {
            // InternalUseCase.g:1826:4: (lv_condition_2_0= ruleBooleanCondition )
            // InternalUseCase.g:1827:5: lv_condition_2_0= ruleBooleanCondition
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getConditionBooleanConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_condition_2_0=ruleBooleanCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"io.deniffel.dsl.useCase.UseCase.BooleanCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getColonKeyword_2());
            		

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleLoop"
    // InternalUseCase.g:1852:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalUseCase.g:1852:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalUseCase.g:1853:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalUseCase.g:1859:1: ruleLoop returns [EObject current=null] : ( (otherlv_0= 'Solange' | otherlv_1= 'While' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1865:2: ( ( (otherlv_0= 'Solange' | otherlv_1= 'While' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' ) )
            // InternalUseCase.g:1866:2: ( (otherlv_0= 'Solange' | otherlv_1= 'While' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' )
            {
            // InternalUseCase.g:1866:2: ( (otherlv_0= 'Solange' | otherlv_1= 'While' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' )
            // InternalUseCase.g:1867:3: (otherlv_0= 'Solange' | otherlv_1= 'While' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':'
            {
            // InternalUseCase.g:1867:3: (otherlv_0= 'Solange' | otherlv_1= 'While' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==72) ) {
                alt59=1;
            }
            else if ( (LA59_0==73) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalUseCase.g:1868:4: otherlv_0= 'Solange'
                    {
                    otherlv_0=(Token)match(input,72,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getSolangeKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1873:4: otherlv_1= 'While'
                    {
                    otherlv_1=(Token)match(input,73,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getWhileKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1878:3: ( (lv_condition_2_0= ruleBooleanCondition ) )
            // InternalUseCase.g:1879:4: (lv_condition_2_0= ruleBooleanCondition )
            {
            // InternalUseCase.g:1879:4: (lv_condition_2_0= ruleBooleanCondition )
            // InternalUseCase.g:1880:5: lv_condition_2_0= ruleBooleanCondition
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getConditionBooleanConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_condition_2_0=ruleBooleanCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"io.deniffel.dsl.useCase.UseCase.BooleanCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getColonKeyword_2());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBooleanCondition"
    // InternalUseCase.g:1905:1: entryRuleBooleanCondition returns [EObject current=null] : iv_ruleBooleanCondition= ruleBooleanCondition EOF ;
    public final EObject entryRuleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanCondition = null;


        try {
            // InternalUseCase.g:1905:57: (iv_ruleBooleanCondition= ruleBooleanCondition EOF )
            // InternalUseCase.g:1906:2: iv_ruleBooleanCondition= ruleBooleanCondition EOF
            {
             newCompositeNode(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanCondition=ruleBooleanCondition();

            state._fsp--;

             current =iv_ruleBooleanCondition; 
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
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // InternalUseCase.g:1912:1: ruleBooleanCondition returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleBooleanCondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:1918:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalUseCase.g:1919:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalUseCase.g:1919:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalUseCase.g:1920:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalUseCase.g:1920:3: (lv_name_0_0= RULE_STRING )
            // InternalUseCase.g:1921:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBooleanConditionAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanConditionRule());
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
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleNotes"
    // InternalUseCase.g:1940:1: entryRuleNotes returns [EObject current=null] : iv_ruleNotes= ruleNotes EOF ;
    public final EObject entryRuleNotes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotes = null;


        try {
            // InternalUseCase.g:1940:46: (iv_ruleNotes= ruleNotes EOF )
            // InternalUseCase.g:1941:2: iv_ruleNotes= ruleNotes EOF
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
    // InternalUseCase.g:1947:1: ruleNotes returns [EObject current=null] : ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleNotes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:1953:2: ( ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:1954:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:1954:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) )
            // InternalUseCase.g:1955:3: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) )
            {
            // InternalUseCase.g:1955:3: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=74 && LA62_0<=75)) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=76 && LA62_0<=77)) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalUseCase.g:1956:4: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
                    {
                    // InternalUseCase.g:1956:4: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==74) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==75) ) {
                        alt60=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalUseCase.g:1957:5: otherlv_0= 'notes:'
                            {
                            otherlv_0=(Token)match(input,74,FOLLOW_12); 

                            					newLeafNode(otherlv_0, grammarAccess.getNotesAccess().getNotesKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1962:5: otherlv_1= 'note:'
                            {
                            otherlv_1=(Token)match(input,75,FOLLOW_12); 

                            					newLeafNode(otherlv_1, grammarAccess.getNotesAccess().getNoteKeyword_0_0_1());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1968:4: (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' )
                    {
                    // InternalUseCase.g:1968:4: (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==76) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==77) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalUseCase.g:1969:5: otherlv_2= 'Anmerkungen:'
                            {
                            otherlv_2=(Token)match(input,76,FOLLOW_12); 

                            					newLeafNode(otherlv_2, grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1974:5: otherlv_3= 'Anmerkung:'
                            {
                            otherlv_3=(Token)match(input,77,FOLLOW_12); 

                            					newLeafNode(otherlv_3, grammarAccess.getNotesAccess().getAnmerkungKeyword_0_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1980:3: ( (lv_content_4_0= RULE_STRING ) )
            // InternalUseCase.g:1981:4: (lv_content_4_0= RULE_STRING )
            {
            // InternalUseCase.g:1981:4: (lv_content_4_0= RULE_STRING )
            // InternalUseCase.g:1982:5: lv_content_4_0= RULE_STRING
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
    // InternalUseCase.g:2002:1: entryRuleUsedTypes returns [EObject current=null] : iv_ruleUsedTypes= ruleUsedTypes EOF ;
    public final EObject entryRuleUsedTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedTypes = null;


        try {
            // InternalUseCase.g:2002:50: (iv_ruleUsedTypes= ruleUsedTypes EOF )
            // InternalUseCase.g:2003:2: iv_ruleUsedTypes= ruleUsedTypes EOF
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
    // InternalUseCase.g:2009:1: ruleUsedTypes returns [EObject current=null] : ( ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) ) ( (lv_types_4_0= ruleType ) )* ) ;
    public final EObject ruleUsedTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:2015:2: ( ( ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) ) ( (lv_types_4_0= ruleType ) )* ) )
            // InternalUseCase.g:2016:2: ( ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) ) ( (lv_types_4_0= ruleType ) )* )
            {
            // InternalUseCase.g:2016:2: ( ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) ) ( (lv_types_4_0= ruleType ) )* )
            // InternalUseCase.g:2017:3: ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) ) ( (lv_types_4_0= ruleType ) )*
            {
            // InternalUseCase.g:2017:3: ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==78) ) {
                alt63=1;
            }
            else if ( (LA63_0==80) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalUseCase.g:2018:4: (otherlv_0= 'used' otherlv_1= 'building-blocks:' )
                    {
                    // InternalUseCase.g:2018:4: (otherlv_0= 'used' otherlv_1= 'building-blocks:' )
                    // InternalUseCase.g:2019:5: otherlv_0= 'used' otherlv_1= 'building-blocks:'
                    {
                    otherlv_0=(Token)match(input,78,FOLLOW_53); 

                    					newLeafNode(otherlv_0, grammarAccess.getUsedTypesAccess().getUsedKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,79,FOLLOW_42); 

                    					newLeafNode(otherlv_1, grammarAccess.getUsedTypesAccess().getBuildingBlocksKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:2029:4: (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' )
                    {
                    // InternalUseCase.g:2029:4: (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' )
                    // InternalUseCase.g:2030:5: otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:'
                    {
                    otherlv_2=(Token)match(input,80,FOLLOW_54); 

                    					newLeafNode(otherlv_2, grammarAccess.getUsedTypesAccess().getGenutzteKeyword_0_1_0());
                    				
                    otherlv_3=(Token)match(input,81,FOLLOW_42); 

                    					newLeafNode(otherlv_3, grammarAccess.getUsedTypesAccess().getBausteineKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:2040:3: ( (lv_types_4_0= ruleType ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==31) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalUseCase.g:2041:4: (lv_types_4_0= ruleType )
            	    {
            	    // InternalUseCase.g:2041:4: (lv_types_4_0= ruleType )
            	    // InternalUseCase.g:2042:5: lv_types_4_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getUsedTypesAccess().getTypesTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop64;
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
    // InternalUseCase.g:2063:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUseCase.g:2063:45: (iv_ruleType= ruleType EOF )
            // InternalUseCase.g:2064:2: iv_ruleType= ruleType EOF
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
    // InternalUseCase.g:2070:1: ruleType returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // InternalUseCase.g:2076:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:2077:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:2077:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:2078:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:2082:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:2083:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:2083:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:2084:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); 

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

            // InternalUseCase.g:2100:3: (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==48) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalUseCase.g:2101:4: otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalUseCase.g:2105:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalUseCase.g:2106:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalUseCase.g:2106:5: (lv_description_3_0= RULE_STRING )
                    // InternalUseCase.g:2107:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_description_3_0, grammarAccess.getTypeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0());
                    					

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

                    otherlv_4=(Token)match(input,51,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:2128:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==82) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalUseCase.g:2129:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,82,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalUseCase.g:2133:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:2134:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:2134:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:2135:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_57);
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

                    otherlv_7=(Token)match(input,83,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_3_2());
                    			

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
    // InternalUseCase.g:2161:1: entryRuleUsedExceptions returns [EObject current=null] : iv_ruleUsedExceptions= ruleUsedExceptions EOF ;
    public final EObject entryRuleUsedExceptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedExceptions = null;


        try {
            // InternalUseCase.g:2161:55: (iv_ruleUsedExceptions= ruleUsedExceptions EOF )
            // InternalUseCase.g:2162:2: iv_ruleUsedExceptions= ruleUsedExceptions EOF
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
    // InternalUseCase.g:2168:1: ruleUsedExceptions returns [EObject current=null] : ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* ) ;
    public final EObject ruleUsedExceptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_exceptions_4_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:2174:2: ( ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* ) )
            // InternalUseCase.g:2175:2: ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* )
            {
            // InternalUseCase.g:2175:2: ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* )
            // InternalUseCase.g:2176:3: ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )*
            {
            // InternalUseCase.g:2176:3: ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==78) ) {
                alt67=1;
            }
            else if ( (LA67_0==80) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalUseCase.g:2177:4: (otherlv_0= 'used' otherlv_1= 'errors:' )
                    {
                    // InternalUseCase.g:2177:4: (otherlv_0= 'used' otherlv_1= 'errors:' )
                    // InternalUseCase.g:2178:5: otherlv_0= 'used' otherlv_1= 'errors:'
                    {
                    otherlv_0=(Token)match(input,78,FOLLOW_58); 

                    					newLeafNode(otherlv_0, grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,84,FOLLOW_42); 

                    					newLeafNode(otherlv_1, grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:2188:4: (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' )
                    {
                    // InternalUseCase.g:2188:4: (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' )
                    // InternalUseCase.g:2189:5: otherlv_2= 'Genutzte' otherlv_3= 'Fehler:'
                    {
                    otherlv_2=(Token)match(input,80,FOLLOW_59); 

                    					newLeafNode(otherlv_2, grammarAccess.getUsedExceptionsAccess().getGenutzteKeyword_0_1_0());
                    				
                    otherlv_3=(Token)match(input,85,FOLLOW_42); 

                    					newLeafNode(otherlv_3, grammarAccess.getUsedExceptionsAccess().getFehlerKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:2199:3: ( (lv_exceptions_4_0= ruleExceptionDecleration ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==31) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalUseCase.g:2200:4: (lv_exceptions_4_0= ruleExceptionDecleration )
            	    {
            	    // InternalUseCase.g:2200:4: (lv_exceptions_4_0= ruleExceptionDecleration )
            	    // InternalUseCase.g:2201:5: lv_exceptions_4_0= ruleExceptionDecleration
            	    {

            	    					newCompositeNode(grammarAccess.getUsedExceptionsAccess().getExceptionsExceptionDeclerationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop68;
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
    // InternalUseCase.g:2222:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // InternalUseCase.g:2222:50: (iv_ruleException= ruleException EOF )
            // InternalUseCase.g:2223:2: iv_ruleException= ruleException EOF
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
    // InternalUseCase.g:2229:1: ruleException returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:2235:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUseCase.g:2236:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUseCase.g:2236:2: ( (otherlv_0= RULE_ID ) )
            // InternalUseCase.g:2237:3: (otherlv_0= RULE_ID )
            {
            // InternalUseCase.g:2237:3: (otherlv_0= RULE_ID )
            // InternalUseCase.g:2238:4: otherlv_0= RULE_ID
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
    // InternalUseCase.g:2252:1: entryRuleExceptionDecleration returns [EObject current=null] : iv_ruleExceptionDecleration= ruleExceptionDecleration EOF ;
    public final EObject entryRuleExceptionDecleration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionDecleration = null;


        try {
            // InternalUseCase.g:2252:61: (iv_ruleExceptionDecleration= ruleExceptionDecleration EOF )
            // InternalUseCase.g:2253:2: iv_ruleExceptionDecleration= ruleExceptionDecleration EOF
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
    // InternalUseCase.g:2259:1: ruleExceptionDecleration returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // InternalUseCase.g:2265:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:2266:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:2266:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:2267:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:2271:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:2272:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:2272:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:2273:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); 

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

            // InternalUseCase.g:2289:3: (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==48) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalUseCase.g:2290:4: otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalUseCase.g:2294:4: ( (lv_message_3_0= RULE_STRING ) )
                    // InternalUseCase.g:2295:5: (lv_message_3_0= RULE_STRING )
                    {
                    // InternalUseCase.g:2295:5: (lv_message_3_0= RULE_STRING )
                    // InternalUseCase.g:2296:6: lv_message_3_0= RULE_STRING
                    {
                    lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_message_3_0, grammarAccess.getExceptionDeclerationAccess().getMessageSTRINGTerminalRuleCall_2_1_0());
                    					

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

                    otherlv_4=(Token)match(input,51,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:2317:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==82) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalUseCase.g:2318:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,82,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalUseCase.g:2322:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:2323:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:2323:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:2324:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getExceptionDeclerationAccess().getImportInfoQualifiedNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_57);
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

                    otherlv_7=(Token)match(input,83,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getExceptionDeclerationAccess().getRightSquareBracketKeyword_3_2());
                    			

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


    // $ANTLR start "entryRuleExample"
    // InternalUseCase.g:2350:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // InternalUseCase.g:2350:48: (iv_ruleExample= ruleExample EOF )
            // InternalUseCase.g:2351:2: iv_ruleExample= ruleExample EOF
            {
             newCompositeNode(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExample=ruleExample();

            state._fsp--;

             current =iv_ruleExample; 
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
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // InternalUseCase.g:2357:1: ruleExample returns [EObject current=null] : (otherlv_0= 'Beispiel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_given_5_0= ruleGiven ) ) ( (lv_givenAnd_6_0= ruleGivenAnd ) )* ( (lv_when_7_0= ruleWhen ) ) ( (lv_whenAnd_8_0= ruleWhenAnd ) )* ( (lv_then_9_0= ruleThen ) ) ( (lv_thenAnd_10_0= ruleThenAnd ) )* (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )? otherlv_13= 'Beispiel' otherlv_14= 'Ende' ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_11=null;
        Token lv_explaination_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_given_5_0 = null;

        EObject lv_givenAnd_6_0 = null;

        EObject lv_when_7_0 = null;

        AntlrDatatypeRuleToken lv_whenAnd_8_0 = null;

        EObject lv_then_9_0 = null;

        EObject lv_thenAnd_10_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:2363:2: ( (otherlv_0= 'Beispiel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_given_5_0= ruleGiven ) ) ( (lv_givenAnd_6_0= ruleGivenAnd ) )* ( (lv_when_7_0= ruleWhen ) ) ( (lv_whenAnd_8_0= ruleWhenAnd ) )* ( (lv_then_9_0= ruleThen ) ) ( (lv_thenAnd_10_0= ruleThenAnd ) )* (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )? otherlv_13= 'Beispiel' otherlv_14= 'Ende' ) )
            // InternalUseCase.g:2364:2: (otherlv_0= 'Beispiel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_given_5_0= ruleGiven ) ) ( (lv_givenAnd_6_0= ruleGivenAnd ) )* ( (lv_when_7_0= ruleWhen ) ) ( (lv_whenAnd_8_0= ruleWhenAnd ) )* ( (lv_then_9_0= ruleThen ) ) ( (lv_thenAnd_10_0= ruleThenAnd ) )* (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )? otherlv_13= 'Beispiel' otherlv_14= 'Ende' )
            {
            // InternalUseCase.g:2364:2: (otherlv_0= 'Beispiel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_given_5_0= ruleGiven ) ) ( (lv_givenAnd_6_0= ruleGivenAnd ) )* ( (lv_when_7_0= ruleWhen ) ) ( (lv_whenAnd_8_0= ruleWhenAnd ) )* ( (lv_then_9_0= ruleThen ) ) ( (lv_thenAnd_10_0= ruleThenAnd ) )* (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )? otherlv_13= 'Beispiel' otherlv_14= 'Ende' )
            // InternalUseCase.g:2365:3: otherlv_0= 'Beispiel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_given_5_0= ruleGiven ) ) ( (lv_givenAnd_6_0= ruleGivenAnd ) )* ( (lv_when_7_0= ruleWhen ) ) ( (lv_whenAnd_8_0= ruleWhenAnd ) )* ( (lv_then_9_0= ruleThen ) ) ( (lv_thenAnd_10_0= ruleThenAnd ) )* (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )? otherlv_13= 'Beispiel' otherlv_14= 'Ende'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getExampleAccess().getBeispielKeyword_0());
            		
            // InternalUseCase.g:2369:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalUseCase.g:2370:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalUseCase.g:2370:4: (lv_name_1_0= RULE_STRING )
            // InternalUseCase.g:2371:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExampleAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExampleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getExampleAccess().getColonKeyword_2());
            		
            // InternalUseCase.g:2391:3: (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==87) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalUseCase.g:2392:4: otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,87,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getExampleAccess().getBeschreibungKeyword_3_0());
                    			
                    // InternalUseCase.g:2396:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalUseCase.g:2397:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalUseCase.g:2397:5: (lv_description_4_0= RULE_STRING )
                    // InternalUseCase.g:2398:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getExampleAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExampleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:2415:3: ( (lv_given_5_0= ruleGiven ) )
            // InternalUseCase.g:2416:4: (lv_given_5_0= ruleGiven )
            {
            // InternalUseCase.g:2416:4: (lv_given_5_0= ruleGiven )
            // InternalUseCase.g:2417:5: lv_given_5_0= ruleGiven
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getGivenGivenParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_61);
            lv_given_5_0=ruleGiven();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					add(
            						current,
            						"given",
            						lv_given_5_0,
            						"io.deniffel.dsl.useCase.UseCase.Given");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:2434:3: ( (lv_givenAnd_6_0= ruleGivenAnd ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=91 && LA72_0<=92)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalUseCase.g:2435:4: (lv_givenAnd_6_0= ruleGivenAnd )
            	    {
            	    // InternalUseCase.g:2435:4: (lv_givenAnd_6_0= ruleGivenAnd )
            	    // InternalUseCase.g:2436:5: lv_givenAnd_6_0= ruleGivenAnd
            	    {

            	    					newCompositeNode(grammarAccess.getExampleAccess().getGivenAndGivenAndParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_givenAnd_6_0=ruleGivenAnd();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExampleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"givenAnd",
            	    						lv_givenAnd_6_0,
            	    						"io.deniffel.dsl.useCase.UseCase.GivenAnd");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            // InternalUseCase.g:2453:3: ( (lv_when_7_0= ruleWhen ) )
            // InternalUseCase.g:2454:4: (lv_when_7_0= ruleWhen )
            {
            // InternalUseCase.g:2454:4: (lv_when_7_0= ruleWhen )
            // InternalUseCase.g:2455:5: lv_when_7_0= ruleWhen
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getWhenWhenParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_62);
            lv_when_7_0=ruleWhen();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					add(
            						current,
            						"when",
            						lv_when_7_0,
            						"io.deniffel.dsl.useCase.UseCase.When");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:2472:3: ( (lv_whenAnd_8_0= ruleWhenAnd ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=91 && LA73_0<=92)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalUseCase.g:2473:4: (lv_whenAnd_8_0= ruleWhenAnd )
            	    {
            	    // InternalUseCase.g:2473:4: (lv_whenAnd_8_0= ruleWhenAnd )
            	    // InternalUseCase.g:2474:5: lv_whenAnd_8_0= ruleWhenAnd
            	    {

            	    					newCompositeNode(grammarAccess.getExampleAccess().getWhenAndWhenAndParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_whenAnd_8_0=ruleWhenAnd();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExampleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"whenAnd",
            	    						lv_whenAnd_8_0,
            	    						"io.deniffel.dsl.useCase.UseCase.WhenAnd");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // InternalUseCase.g:2491:3: ( (lv_then_9_0= ruleThen ) )
            // InternalUseCase.g:2492:4: (lv_then_9_0= ruleThen )
            {
            // InternalUseCase.g:2492:4: (lv_then_9_0= ruleThen )
            // InternalUseCase.g:2493:5: lv_then_9_0= ruleThen
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getThenThenParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_63);
            lv_then_9_0=ruleThen();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					add(
            						current,
            						"then",
            						lv_then_9_0,
            						"io.deniffel.dsl.useCase.UseCase.Then");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:2510:3: ( (lv_thenAnd_10_0= ruleThenAnd ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=91 && LA74_0<=92)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalUseCase.g:2511:4: (lv_thenAnd_10_0= ruleThenAnd )
            	    {
            	    // InternalUseCase.g:2511:4: (lv_thenAnd_10_0= ruleThenAnd )
            	    // InternalUseCase.g:2512:5: lv_thenAnd_10_0= ruleThenAnd
            	    {

            	    					newCompositeNode(grammarAccess.getExampleAccess().getThenAndThenAndParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_63);
            	    lv_thenAnd_10_0=ruleThenAnd();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExampleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"thenAnd",
            	    						lv_thenAnd_10_0,
            	    						"io.deniffel.dsl.useCase.UseCase.ThenAnd");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            // InternalUseCase.g:2529:3: (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==88) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalUseCase.g:2530:4: otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,88,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getExampleAccess().getWarumKeyword_10_0());
                    			
                    // InternalUseCase.g:2534:4: ( (lv_explaination_12_0= RULE_STRING ) )
                    // InternalUseCase.g:2535:5: (lv_explaination_12_0= RULE_STRING )
                    {
                    // InternalUseCase.g:2535:5: (lv_explaination_12_0= RULE_STRING )
                    // InternalUseCase.g:2536:6: lv_explaination_12_0= RULE_STRING
                    {
                    lv_explaination_12_0=(Token)match(input,RULE_STRING,FOLLOW_64); 

                    						newLeafNode(lv_explaination_12_0, grammarAccess.getExampleAccess().getExplainationSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExampleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"explaination",
                    							lv_explaination_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,86,FOLLOW_65); 

            			newLeafNode(otherlv_13, grammarAccess.getExampleAccess().getBeispielKeyword_11());
            		
            otherlv_14=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getExampleAccess().getEndeKeyword_12());
            		

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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleGiven"
    // InternalUseCase.g:2565:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalUseCase.g:2565:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalUseCase.g:2566:2: iv_ruleGiven= ruleGiven EOF
            {
             newCompositeNode(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGiven=ruleGiven();

            state._fsp--;

             current =iv_ruleGiven; 
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
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalUseCase.g:2572:1: ruleGiven returns [EObject current=null] : ( (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:2578:2: ( ( (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:2579:2: ( (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:2579:2: ( (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // InternalUseCase.g:2580:3: (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // InternalUseCase.g:2580:3: (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==89) ) {
                alt76=1;
            }
            else if ( (LA76_0==90) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalUseCase.g:2581:4: otherlv_0= 'Gegeben'
                    {
                    otherlv_0=(Token)match(input,89,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getGegebenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:2586:4: otherlv_1= 'gegeben'
                    {
                    otherlv_1=(Token)match(input,90,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getGivenAccess().getGegebenKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:2591:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:2592:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:2592:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:2593:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_content_2_0, grammarAccess.getGivenAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenRule());
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
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleGivenAnd"
    // InternalUseCase.g:2613:1: entryRuleGivenAnd returns [EObject current=null] : iv_ruleGivenAnd= ruleGivenAnd EOF ;
    public final EObject entryRuleGivenAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivenAnd = null;


        try {
            // InternalUseCase.g:2613:49: (iv_ruleGivenAnd= ruleGivenAnd EOF )
            // InternalUseCase.g:2614:2: iv_ruleGivenAnd= ruleGivenAnd EOF
            {
             newCompositeNode(grammarAccess.getGivenAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGivenAnd=ruleGivenAnd();

            state._fsp--;

             current =iv_ruleGivenAnd; 
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
    // $ANTLR end "entryRuleGivenAnd"


    // $ANTLR start "ruleGivenAnd"
    // InternalUseCase.g:2620:1: ruleGivenAnd returns [EObject current=null] : ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGivenAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:2626:2: ( ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:2627:2: ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:2627:2: ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // InternalUseCase.g:2628:3: (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // InternalUseCase.g:2628:3: (otherlv_0= 'und' | otherlv_1= 'aber' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==91) ) {
                alt77=1;
            }
            else if ( (LA77_0==92) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalUseCase.g:2629:4: otherlv_0= 'und'
                    {
                    otherlv_0=(Token)match(input,91,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getGivenAndAccess().getUndKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:2634:4: otherlv_1= 'aber'
                    {
                    otherlv_1=(Token)match(input,92,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getGivenAndAccess().getAberKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:2639:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:2640:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:2640:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:2641:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_content_2_0, grammarAccess.getGivenAndAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenAndRule());
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
    // $ANTLR end "ruleGivenAnd"


    // $ANTLR start "entryRuleWhen"
    // InternalUseCase.g:2661:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalUseCase.g:2661:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalUseCase.g:2662:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalUseCase.g:2668:1: ruleWhen returns [EObject current=null] : (otherlv_0= 'Wenn' ( (lv_content_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:2674:2: ( (otherlv_0= 'Wenn' ( (lv_content_1_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:2675:2: (otherlv_0= 'Wenn' ( (lv_content_1_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:2675:2: (otherlv_0= 'Wenn' ( (lv_content_1_0= RULE_STRING ) ) )
            // InternalUseCase.g:2676:3: otherlv_0= 'Wenn' ( (lv_content_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,93,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWennKeyword_0());
            		
            // InternalUseCase.g:2680:3: ( (lv_content_1_0= RULE_STRING ) )
            // InternalUseCase.g:2681:4: (lv_content_1_0= RULE_STRING )
            {
            // InternalUseCase.g:2681:4: (lv_content_1_0= RULE_STRING )
            // InternalUseCase.g:2682:5: lv_content_1_0= RULE_STRING
            {
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_content_1_0, grammarAccess.getWhenAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhenRule());
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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleWhenAnd"
    // InternalUseCase.g:2702:1: entryRuleWhenAnd returns [String current=null] : iv_ruleWhenAnd= ruleWhenAnd EOF ;
    public final String entryRuleWhenAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWhenAnd = null;


        try {
            // InternalUseCase.g:2702:47: (iv_ruleWhenAnd= ruleWhenAnd EOF )
            // InternalUseCase.g:2703:2: iv_ruleWhenAnd= ruleWhenAnd EOF
            {
             newCompositeNode(grammarAccess.getWhenAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhenAnd=ruleWhenAnd();

            state._fsp--;

             current =iv_ruleWhenAnd.getText(); 
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
    // $ANTLR end "entryRuleWhenAnd"


    // $ANTLR start "ruleWhenAnd"
    // InternalUseCase.g:2709:1: ruleWhenAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'und' | kw= 'aber' ) ;
    public final AntlrDatatypeRuleToken ruleWhenAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUseCase.g:2715:2: ( (kw= 'und' | kw= 'aber' ) )
            // InternalUseCase.g:2716:2: (kw= 'und' | kw= 'aber' )
            {
            // InternalUseCase.g:2716:2: (kw= 'und' | kw= 'aber' )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==91) ) {
                alt78=1;
            }
            else if ( (LA78_0==92) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalUseCase.g:2717:3: kw= 'und'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWhenAndAccess().getUndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:2723:3: kw= 'aber'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWhenAndAccess().getAberKeyword_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleWhenAnd"


    // $ANTLR start "entryRuleThen"
    // InternalUseCase.g:2732:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalUseCase.g:2732:45: (iv_ruleThen= ruleThen EOF )
            // InternalUseCase.g:2733:2: iv_ruleThen= ruleThen EOF
            {
             newCompositeNode(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThen=ruleThen();

            state._fsp--;

             current =iv_ruleThen; 
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
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalUseCase.g:2739:1: ruleThen returns [EObject current=null] : ( (otherlv_0= 'Dann' | otherlv_1= 'dann' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:2745:2: ( ( (otherlv_0= 'Dann' | otherlv_1= 'dann' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:2746:2: ( (otherlv_0= 'Dann' | otherlv_1= 'dann' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:2746:2: ( (otherlv_0= 'Dann' | otherlv_1= 'dann' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // InternalUseCase.g:2747:3: (otherlv_0= 'Dann' | otherlv_1= 'dann' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // InternalUseCase.g:2747:3: (otherlv_0= 'Dann' | otherlv_1= 'dann' )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==94) ) {
                alt79=1;
            }
            else if ( (LA79_0==95) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalUseCase.g:2748:4: otherlv_0= 'Dann'
                    {
                    otherlv_0=(Token)match(input,94,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getThenAccess().getDannKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:2753:4: otherlv_1= 'dann'
                    {
                    otherlv_1=(Token)match(input,95,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getThenAccess().getDannKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:2758:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:2759:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:2759:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:2760:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_content_2_0, grammarAccess.getThenAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThenRule());
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
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleThenAnd"
    // InternalUseCase.g:2780:1: entryRuleThenAnd returns [EObject current=null] : iv_ruleThenAnd= ruleThenAnd EOF ;
    public final EObject entryRuleThenAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenAnd = null;


        try {
            // InternalUseCase.g:2780:48: (iv_ruleThenAnd= ruleThenAnd EOF )
            // InternalUseCase.g:2781:2: iv_ruleThenAnd= ruleThenAnd EOF
            {
             newCompositeNode(grammarAccess.getThenAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThenAnd=ruleThenAnd();

            state._fsp--;

             current =iv_ruleThenAnd; 
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
    // $ANTLR end "entryRuleThenAnd"


    // $ANTLR start "ruleThenAnd"
    // InternalUseCase.g:2787:1: ruleThenAnd returns [EObject current=null] : ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleThenAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:2793:2: ( ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:2794:2: ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:2794:2: ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // InternalUseCase.g:2795:3: (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // InternalUseCase.g:2795:3: (otherlv_0= 'und' | otherlv_1= 'aber' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==91) ) {
                alt80=1;
            }
            else if ( (LA80_0==92) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalUseCase.g:2796:4: otherlv_0= 'und'
                    {
                    otherlv_0=(Token)match(input,91,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getThenAndAccess().getUndKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:2801:4: otherlv_1= 'aber'
                    {
                    otherlv_1=(Token)match(input,92,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getThenAndAccess().getAberKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:2806:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:2807:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:2807:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:2808:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_content_2_0, grammarAccess.getThenAndAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThenAndRule());
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
    // $ANTLR end "ruleThenAnd"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000060002L,0x0000000000414000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000002L,0x0000000000414000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x3F706D0E1F280000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x3F706D0E18280000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x3F706D0E00280000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x3F706C0000280000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x3F70000000280000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x3E00000000280000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x3000000000280000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000280000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001800100000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000002040L,0x00000000000003F0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000008000002002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000006800000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000038000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x00000000D8000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000019400000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000200000L});

}