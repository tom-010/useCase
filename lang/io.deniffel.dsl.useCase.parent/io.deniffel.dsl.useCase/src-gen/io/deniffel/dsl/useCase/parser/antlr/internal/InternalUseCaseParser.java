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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Firma'", "'Company'", "'.'", "'Kathegorie'", "'package'", "'>'", "'use-case'", "'Rezept'", "'end'", "'of'", "'Ende'", "'des'", "'Rezpets'", "'description:'", "'Kurzbeschreibung:'", "'Beschreibung'", "'allowed-usergroups:'", "'Erlaubt'", "'f\\u00FCr:'", "'many'", "'-'", "'as'", "'requires:'", "'require:'", "'requires'", "'the'", "'following'", "'input'", "':'", "'Ben\\u00F6tigte'", "'Zutaten'", "'als'", "'('", "'e.g'", "'z.B.'", "')'", "'produces:'", "'produce:'", "'produces'", "'output'", "'Ergebnis:'", "'optional'", "'pre-condition:'", "'pre-conditions:'", "'Vorbedingungen:'", "'steps:'", "'Schritte:'", "'Raise'", "'error'", "'On'", "'raise'", "'Melde'", "'Fehler'", "'Bei'", "'melde'", "'notes:'", "'note:'", "'Anmerkungen:'", "'Anmerkung:'", "'used'", "'types:'", "'Genutzte'", "'Typen:'", "'['", "']'", "'errors:'", "'Fehler:'"
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
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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
    // InternalUseCase.g:71:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) ) ( (lv_exceptions_6_0= ruleUsedExceptions ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_company_2_0 = null;

        EObject lv_package_3_0 = null;

        EObject lv_useCases_4_0 = null;

        EObject lv_types_5_0 = null;

        EObject lv_exceptions_6_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:77:2: ( ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) ) ( (lv_exceptions_6_0= ruleUsedExceptions ) ) ) )
            // InternalUseCase.g:78:2: ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) ) ( (lv_exceptions_6_0= ruleUsedExceptions ) ) )
            {
            // InternalUseCase.g:78:2: ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) ) ( (lv_exceptions_6_0= ruleUsedExceptions ) ) )
            // InternalUseCase.g:79:3: (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) ) ( (lv_exceptions_6_0= ruleUsedExceptions ) )
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

            // InternalUseCase.g:147:3: ( (lv_types_5_0= ruleUsedTypes ) )
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

            // InternalUseCase.g:166:3: ( (lv_exceptions_6_0= ruleUsedExceptions ) )
            // InternalUseCase.g:167:4: (lv_exceptions_6_0= ruleUsedExceptions )
            {
            // InternalUseCase.g:167:4: (lv_exceptions_6_0= ruleUsedExceptions )
            // InternalUseCase.g:168:5: lv_exceptions_6_0= ruleUsedExceptions
            {

            					newCompositeNode(grammarAccess.getModelAccess().getExceptionsUsedExceptionsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalUseCase.g:189:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUseCase.g:189:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUseCase.g:190:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalUseCase.g:196:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:202:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUseCase.g:203:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUseCase.g:203:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUseCase.g:204:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUseCase.g:211:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCase.g:212:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalUseCase.g:229:1: entryRuleQualifiedNumber returns [String current=null] : iv_ruleQualifiedNumber= ruleQualifiedNumber EOF ;
    public final String entryRuleQualifiedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNumber = null;


        try {
            // InternalUseCase.g:229:55: (iv_ruleQualifiedNumber= ruleQualifiedNumber EOF )
            // InternalUseCase.g:230:2: iv_ruleQualifiedNumber= ruleQualifiedNumber EOF
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
    // InternalUseCase.g:236:1: ruleQualifiedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:242:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) )
            // InternalUseCase.g:243:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            {
            // InternalUseCase.g:243:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            // InternalUseCase.g:244:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.'
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_0());
            		
            // InternalUseCase.g:251:3: (kw= '.' this_INT_2= RULE_INT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==RULE_INT) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCase.g:252:4: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)match(input,13,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_8); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalUseCase.g:274:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalUseCase.g:274:48: (iv_rulePackage= rulePackage EOF )
            // InternalUseCase.g:275:2: iv_rulePackage= rulePackage EOF
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
    // InternalUseCase.g:281:1: rulePackage returns [EObject current=null] : ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parts_2_0 = null;

        EObject lv_parts_4_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:287:2: ( ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* ) )
            // InternalUseCase.g:288:2: ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* )
            {
            // InternalUseCase.g:288:2: ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* )
            // InternalUseCase.g:289:3: (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )*
            {
            // InternalUseCase.g:289:3: (otherlv_0= 'Kathegorie' | otherlv_1= 'package' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCase.g:290:4: otherlv_0= 'Kathegorie'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getKathegorieKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:295:4: otherlv_1= 'package'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:300:3: ( (lv_parts_2_0= rulePackagePart ) )
            // InternalUseCase.g:301:4: (lv_parts_2_0= rulePackagePart )
            {
            // InternalUseCase.g:301:4: (lv_parts_2_0= rulePackagePart )
            // InternalUseCase.g:302:5: lv_parts_2_0= rulePackagePart
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getPartsPackagePartParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalUseCase.g:319:3: (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUseCase.g:320:4: otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getGreaterThanSignKeyword_2_0());
            	    			
            	    // InternalUseCase.g:324:4: ( (lv_parts_4_0= rulePackagePart ) )
            	    // InternalUseCase.g:325:5: (lv_parts_4_0= rulePackagePart )
            	    {
            	    // InternalUseCase.g:325:5: (lv_parts_4_0= rulePackagePart )
            	    // InternalUseCase.g:326:6: lv_parts_4_0= rulePackagePart
            	    {

            	    						newCompositeNode(grammarAccess.getPackageAccess().getPartsPackagePartParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackagePart"
    // InternalUseCase.g:348:1: entryRulePackagePart returns [EObject current=null] : iv_rulePackagePart= rulePackagePart EOF ;
    public final EObject entryRulePackagePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagePart = null;


        try {
            // InternalUseCase.g:348:52: (iv_rulePackagePart= rulePackagePart EOF )
            // InternalUseCase.g:349:2: iv_rulePackagePart= rulePackagePart EOF
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
    // InternalUseCase.g:355:1: rulePackagePart returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePackagePart() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:361:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalUseCase.g:362:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalUseCase.g:362:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalUseCase.g:363:3: (lv_name_0_0= RULE_ID )
            {
            // InternalUseCase.g:363:3: (lv_name_0_0= RULE_ID )
            // InternalUseCase.g:364:4: lv_name_0_0= RULE_ID
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
    // InternalUseCase.g:383:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUseCase.g:383:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUseCase.g:384:2: iv_ruleUseCase= ruleUseCase EOF
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
    // InternalUseCase.g:390:1: ruleUseCase returns [EObject current=null] : ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) ) ;
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
            // InternalUseCase.g:396:2: ( ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) ) )
            // InternalUseCase.g:397:2: ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) )
            {
            // InternalUseCase.g:397:2: ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) )
            // InternalUseCase.g:398:3: (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) )
            {
            // InternalUseCase.g:398:3: (otherlv_0= 'use-case' | otherlv_1= 'Rezept' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:399:4: otherlv_0= 'use-case'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:404:4: otherlv_1= 'Rezept'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getUseCaseAccess().getRezeptKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:409:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUseCase.g:410:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalUseCase.g:410:4: (lv_name_2_0= RULE_STRING )
            // InternalUseCase.g:411:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            // InternalUseCase.g:427:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=24 && LA8_0<=26)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:428:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalUseCase.g:428:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalUseCase.g:429:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getDescriptionsDescriptionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
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

            // InternalUseCase.g:446:3: ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=27 && LA9_0<=28)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUseCase.g:447:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    {
                    // InternalUseCase.g:447:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    // InternalUseCase.g:448:5: lv_allowedUserGroups_4_0= ruleAllowedUserGroups
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAllowedUserGroupsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
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

            // InternalUseCase.g:465:3: ( (lv_inputs_5_0= ruleInputs ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=33 && LA10_0<=35)||LA10_0==40) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCase.g:466:4: (lv_inputs_5_0= ruleInputs )
                    {
                    // InternalUseCase.g:466:4: (lv_inputs_5_0= ruleInputs )
                    // InternalUseCase.g:467:5: lv_inputs_5_0= ruleInputs
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getInputsInputsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
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

            // InternalUseCase.g:484:3: ( (lv_outputs_6_0= ruleOutputs ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=47 && LA11_0<=49)||LA11_0==51) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:485:4: (lv_outputs_6_0= ruleOutputs )
                    {
                    // InternalUseCase.g:485:4: (lv_outputs_6_0= ruleOutputs )
                    // InternalUseCase.g:486:5: lv_outputs_6_0= ruleOutputs
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getOutputsOutputsParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_16);
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

            // InternalUseCase.g:503:3: ( (lv_preconditions_7_0= rulePreConditions ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=53 && LA12_0<=55)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCase.g:504:4: (lv_preconditions_7_0= rulePreConditions )
                    {
                    // InternalUseCase.g:504:4: (lv_preconditions_7_0= rulePreConditions )
                    // InternalUseCase.g:505:5: lv_preconditions_7_0= rulePreConditions
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getPreconditionsPreConditionsParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_17);
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

            // InternalUseCase.g:522:3: ( (lv_steps_8_0= ruleSteps ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=56 && LA13_0<=57)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCase.g:523:4: (lv_steps_8_0= ruleSteps )
                    {
                    // InternalUseCase.g:523:4: (lv_steps_8_0= ruleSteps )
                    // InternalUseCase.g:524:5: lv_steps_8_0= ruleSteps
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getStepsStepsParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_18);
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

            // InternalUseCase.g:541:3: ( (lv_notes_9_0= ruleNotes ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=66 && LA14_0<=69)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCase.g:542:4: (lv_notes_9_0= ruleNotes )
                    {
                    // InternalUseCase.g:542:4: (lv_notes_9_0= ruleNotes )
                    // InternalUseCase.g:543:5: lv_notes_9_0= ruleNotes
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getNotesNotesParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_19);
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

            // InternalUseCase.g:560:3: ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            else if ( (LA15_0==21) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalUseCase.g:561:4: (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' )
                    {
                    // InternalUseCase.g:561:4: (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' )
                    // InternalUseCase.g:562:5: otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_20); 

                    					newLeafNode(otherlv_10, grammarAccess.getUseCaseAccess().getEndKeyword_9_0_0());
                    				
                    otherlv_11=(Token)match(input,20,FOLLOW_21); 

                    					newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getOfKeyword_9_0_1());
                    				
                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getUseCaseAccess().getUseCaseKeyword_9_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:576:4: (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' )
                    {
                    // InternalUseCase.g:576:4: (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' )
                    // InternalUseCase.g:577:5: otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets'
                    {
                    otherlv_13=(Token)match(input,21,FOLLOW_22); 

                    					newLeafNode(otherlv_13, grammarAccess.getUseCaseAccess().getEndeKeyword_9_1_0());
                    				
                    otherlv_14=(Token)match(input,22,FOLLOW_23); 

                    					newLeafNode(otherlv_14, grammarAccess.getUseCaseAccess().getDesKeyword_9_1_1());
                    				
                    otherlv_15=(Token)match(input,23,FOLLOW_2); 

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
    // InternalUseCase.g:595:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalUseCase.g:595:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalUseCase.g:596:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalUseCase.g:602:1: ruleDescription returns [EObject current=null] : ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:608:2: ( ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:609:2: ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:609:2: ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalUseCase.g:610:3: (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) )
            {
            // InternalUseCase.g:610:3: (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt16=1;
                }
                break;
            case 25:
                {
                alt16=2;
                }
                break;
            case 26:
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
                    // InternalUseCase.g:611:4: otherlv_0= 'description:'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:616:4: otherlv_1= 'Kurzbeschreibung:'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCase.g:621:4: otherlv_2= 'Beschreibung'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getDescriptionAccess().getBeschreibungKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:626:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalUseCase.g:627:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalUseCase.g:627:4: (lv_name_3_0= RULE_STRING )
            // InternalUseCase.g:628:5: lv_name_3_0= RULE_STRING
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
    // InternalUseCase.g:648:1: entryRuleAllowedUserGroups returns [EObject current=null] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final EObject entryRuleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroups = null;


        try {
            // InternalUseCase.g:648:58: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // InternalUseCase.g:649:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
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
    // InternalUseCase.g:655:1: ruleAllowedUserGroups returns [EObject current=null] : ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* ) ;
    public final EObject ruleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_groups_3_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:661:2: ( ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* ) )
            // InternalUseCase.g:662:2: ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* )
            {
            // InternalUseCase.g:662:2: ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* )
            // InternalUseCase.g:663:3: (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )*
            {
            // InternalUseCase.g:663:3: (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            else if ( (LA17_0==28) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCase.g:664:4: otherlv_0= 'allowed-usergroups:'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:669:4: (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' )
                    {
                    // InternalUseCase.g:669:4: (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' )
                    // InternalUseCase.g:670:5: otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_25); 

                    					newLeafNode(otherlv_1, grammarAccess.getAllowedUserGroupsAccess().getErlaubtKeyword_0_1_0());
                    				
                    otherlv_2=(Token)match(input,29,FOLLOW_24); 

                    					newLeafNode(otherlv_2, grammarAccess.getAllowedUserGroupsAccess().getFürKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:680:3: ( (lv_groups_3_0= ruleAllowedUserGroup ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=30 && LA18_0<=31)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUseCase.g:681:4: (lv_groups_3_0= ruleAllowedUserGroup )
            	    {
            	    // InternalUseCase.g:681:4: (lv_groups_3_0= ruleAllowedUserGroup )
            	    // InternalUseCase.g:682:5: lv_groups_3_0= ruleAllowedUserGroup
            	    {

            	    					newCompositeNode(grammarAccess.getAllowedUserGroupsAccess().getGroupsAllowedUserGroupParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
    // $ANTLR end "ruleAllowedUserGroups"


    // $ANTLR start "entryRuleAllowedUserGroup"
    // InternalUseCase.g:703:1: entryRuleAllowedUserGroup returns [EObject current=null] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final EObject entryRuleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroup = null;


        try {
            // InternalUseCase.g:703:57: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // InternalUseCase.g:704:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
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
    // InternalUseCase.g:710:1: ruleAllowedUserGroup returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUseCase.g:716:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalUseCase.g:717:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalUseCase.g:717:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalUseCase.g:718:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalUseCase.g:718:3: ( (lv_many_0_0= 'many' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCase.g:719:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:719:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:720:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,30,FOLLOW_26); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAllowedUserGroupRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:736:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUseCase.g:737:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalUseCase.g:737:4: (lv_name_2_0= RULE_STRING )
            // InternalUseCase.g:738:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            // InternalUseCase.g:754:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCase.g:755:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:759:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:760:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:760:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:761:6: otherlv_4= RULE_ID
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
    // InternalUseCase.g:777:1: entryRuleInputs returns [EObject current=null] : iv_ruleInputs= ruleInputs EOF ;
    public final EObject entryRuleInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputs = null;


        try {
            // InternalUseCase.g:777:47: (iv_ruleInputs= ruleInputs EOF )
            // InternalUseCase.g:778:2: iv_ruleInputs= ruleInputs EOF
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
    // InternalUseCase.g:784:1: ruleInputs returns [EObject current=null] : ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* ) ;
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
            // InternalUseCase.g:790:2: ( ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* ) )
            // InternalUseCase.g:791:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* )
            {
            // InternalUseCase.g:791:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* )
            // InternalUseCase.g:792:3: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )*
            {
            // InternalUseCase.g:792:3: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=33 && LA22_0<=35)) ) {
                alt22=1;
            }
            else if ( (LA22_0==40) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:793:4: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
                    {
                    // InternalUseCase.g:793:4: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
                    int alt21=3;
                    switch ( input.LA(1) ) {
                    case 33:
                        {
                        alt21=1;
                        }
                        break;
                    case 34:
                        {
                        alt21=2;
                        }
                        break;
                    case 35:
                        {
                        alt21=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }

                    switch (alt21) {
                        case 1 :
                            // InternalUseCase.g:794:5: otherlv_0= 'requires:'
                            {
                            otherlv_0=(Token)match(input,33,FOLLOW_24); 

                            					newLeafNode(otherlv_0, grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:799:5: otherlv_1= 'require:'
                            {
                            otherlv_1=(Token)match(input,34,FOLLOW_24); 

                            					newLeafNode(otherlv_1, grammarAccess.getInputsAccess().getRequireKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUseCase.g:804:5: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                            {
                            // InternalUseCase.g:804:5: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                            // InternalUseCase.g:805:6: otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':'
                            {
                            otherlv_2=(Token)match(input,35,FOLLOW_28); 

                            						newLeafNode(otherlv_2, grammarAccess.getInputsAccess().getRequiresKeyword_0_0_2_0());
                            					
                            otherlv_3=(Token)match(input,36,FOLLOW_29); 

                            						newLeafNode(otherlv_3, grammarAccess.getInputsAccess().getTheKeyword_0_0_2_1());
                            					
                            otherlv_4=(Token)match(input,37,FOLLOW_30); 

                            						newLeafNode(otherlv_4, grammarAccess.getInputsAccess().getFollowingKeyword_0_0_2_2());
                            					
                            otherlv_5=(Token)match(input,38,FOLLOW_31); 

                            						newLeafNode(otherlv_5, grammarAccess.getInputsAccess().getInputKeyword_0_0_2_3());
                            					
                            otherlv_6=(Token)match(input,39,FOLLOW_24); 

                            						newLeafNode(otherlv_6, grammarAccess.getInputsAccess().getColonKeyword_0_0_2_4());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:828:4: (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' )
                    {
                    // InternalUseCase.g:828:4: (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' )
                    // InternalUseCase.g:829:5: otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':'
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_32); 

                    					newLeafNode(otherlv_7, grammarAccess.getInputsAccess().getBenötigteKeyword_0_1_0());
                    				
                    otherlv_8=(Token)match(input,41,FOLLOW_31); 

                    					newLeafNode(otherlv_8, grammarAccess.getInputsAccess().getZutatenKeyword_0_1_1());
                    				
                    otherlv_9=(Token)match(input,39,FOLLOW_24); 

                    					newLeafNode(otherlv_9, grammarAccess.getInputsAccess().getColonKeyword_0_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:843:3: ( (lv_inputs_10_0= ruleInput ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=30 && LA23_0<=31)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUseCase.g:844:4: (lv_inputs_10_0= ruleInput )
            	    {
            	    // InternalUseCase.g:844:4: (lv_inputs_10_0= ruleInput )
            	    // InternalUseCase.g:845:5: lv_inputs_10_0= ruleInput
            	    {

            	    					newCompositeNode(grammarAccess.getInputsAccess().getInputsInputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop23;
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
    // InternalUseCase.g:866:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalUseCase.g:866:46: (iv_ruleInput= ruleInput EOF )
            // InternalUseCase.g:867:2: iv_ruleInput= ruleInput EOF
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
    // InternalUseCase.g:873:1: ruleInput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? ) ;
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
            // InternalUseCase.g:879:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? ) )
            // InternalUseCase.g:880:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? )
            {
            // InternalUseCase.g:880:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? )
            // InternalUseCase.g:881:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )?
            {
            // InternalUseCase.g:881:3: ( (lv_many_0_0= 'many' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:882:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:882:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:883:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,30,FOLLOW_26); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getInputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:899:3: ( (lv_optional_2_0= ruleOptional ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCase.g:900:4: (lv_optional_2_0= ruleOptional )
                    {
                    // InternalUseCase.g:900:4: (lv_optional_2_0= ruleOptional )
                    // InternalUseCase.g:901:5: lv_optional_2_0= ruleOptional
                    {

                    					newCompositeNode(grammarAccess.getInputAccess().getOptionalOptionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
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

            // InternalUseCase.g:918:3: ( (lv_content_3_0= RULE_STRING ) )
            // InternalUseCase.g:919:4: (lv_content_3_0= RULE_STRING )
            {
            // InternalUseCase.g:919:4: (lv_content_3_0= RULE_STRING )
            // InternalUseCase.g:920:5: lv_content_3_0= RULE_STRING
            {
            lv_content_3_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            // InternalUseCase.g:936:3: ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32||LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUseCase.g:937:4: (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalUseCase.g:937:4: (otherlv_4= 'as' | otherlv_5= 'als' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==32) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==42) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalUseCase.g:938:5: otherlv_4= 'as'
                            {
                            otherlv_4=(Token)match(input,32,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getInputAccess().getAsKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:943:5: otherlv_5= 'als'
                            {
                            otherlv_5=(Token)match(input,42,FOLLOW_3); 

                            					newLeafNode(otherlv_5, grammarAccess.getInputAccess().getAlsKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:948:4: ( (otherlv_6= RULE_ID ) )
                    // InternalUseCase.g:949:5: (otherlv_6= RULE_ID )
                    {
                    // InternalUseCase.g:949:5: (otherlv_6= RULE_ID )
                    // InternalUseCase.g:950:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_6, grammarAccess.getInputAccess().getTypeTypeCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:962:3: (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUseCase.g:963:4: otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalUseCase.g:967:4: (otherlv_8= 'e.g' | otherlv_9= 'z.B.' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==44) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==45) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalUseCase.g:968:5: otherlv_8= 'e.g'
                            {
                            otherlv_8=(Token)match(input,44,FOLLOW_11); 

                            					newLeafNode(otherlv_8, grammarAccess.getInputAccess().getEGKeyword_5_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:973:5: otherlv_9= 'z.B.'
                            {
                            otherlv_9=(Token)match(input,45,FOLLOW_11); 

                            					newLeafNode(otherlv_9, grammarAccess.getInputAccess().getZBKeyword_5_1_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:978:4: ( (lv_example_10_0= RULE_STRING ) )
                    // InternalUseCase.g:979:5: (lv_example_10_0= RULE_STRING )
                    {
                    // InternalUseCase.g:979:5: (lv_example_10_0= RULE_STRING )
                    // InternalUseCase.g:980:6: lv_example_10_0= RULE_STRING
                    {
                    lv_example_10_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

                    otherlv_11=(Token)match(input,46,FOLLOW_2); 

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
    // InternalUseCase.g:1005:1: entryRuleOutputs returns [EObject current=null] : iv_ruleOutputs= ruleOutputs EOF ;
    public final EObject entryRuleOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputs = null;


        try {
            // InternalUseCase.g:1005:48: (iv_ruleOutputs= ruleOutputs EOF )
            // InternalUseCase.g:1006:2: iv_ruleOutputs= ruleOutputs EOF
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
    // InternalUseCase.g:1012:1: ruleOutputs returns [EObject current=null] : ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* ) ;
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
            // InternalUseCase.g:1018:2: ( ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* ) )
            // InternalUseCase.g:1019:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* )
            {
            // InternalUseCase.g:1019:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* )
            // InternalUseCase.g:1020:3: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )*
            {
            // InternalUseCase.g:1020:3: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=47 && LA31_0<=49)) ) {
                alt31=1;
            }
            else if ( (LA31_0==51) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalUseCase.g:1021:4: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
                    {
                    // InternalUseCase.g:1021:4: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
                    int alt30=3;
                    switch ( input.LA(1) ) {
                    case 47:
                        {
                        alt30=1;
                        }
                        break;
                    case 48:
                        {
                        alt30=2;
                        }
                        break;
                    case 49:
                        {
                        alt30=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }

                    switch (alt30) {
                        case 1 :
                            // InternalUseCase.g:1022:5: otherlv_0= 'produces:'
                            {
                            otherlv_0=(Token)match(input,47,FOLLOW_24); 

                            					newLeafNode(otherlv_0, grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1027:5: otherlv_1= 'produce:'
                            {
                            otherlv_1=(Token)match(input,48,FOLLOW_24); 

                            					newLeafNode(otherlv_1, grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUseCase.g:1032:5: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                            {
                            // InternalUseCase.g:1032:5: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                            // InternalUseCase.g:1033:6: otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':'
                            {
                            otherlv_2=(Token)match(input,49,FOLLOW_28); 

                            						newLeafNode(otherlv_2, grammarAccess.getOutputsAccess().getProducesKeyword_0_0_2_0());
                            					
                            otherlv_3=(Token)match(input,36,FOLLOW_29); 

                            						newLeafNode(otherlv_3, grammarAccess.getOutputsAccess().getTheKeyword_0_0_2_1());
                            					
                            otherlv_4=(Token)match(input,37,FOLLOW_38); 

                            						newLeafNode(otherlv_4, grammarAccess.getOutputsAccess().getFollowingKeyword_0_0_2_2());
                            					
                            otherlv_5=(Token)match(input,50,FOLLOW_31); 

                            						newLeafNode(otherlv_5, grammarAccess.getOutputsAccess().getOutputKeyword_0_0_2_3());
                            					
                            otherlv_6=(Token)match(input,39,FOLLOW_24); 

                            						newLeafNode(otherlv_6, grammarAccess.getOutputsAccess().getColonKeyword_0_0_2_4());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1056:4: otherlv_7= 'Ergebnis:'
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getOutputsAccess().getErgebnisKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1061:3: ( (lv_outputs_8_0= ruleOutput ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=30 && LA32_0<=31)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUseCase.g:1062:4: (lv_outputs_8_0= ruleOutput )
            	    {
            	    // InternalUseCase.g:1062:4: (lv_outputs_8_0= ruleOutput )
            	    // InternalUseCase.g:1063:5: lv_outputs_8_0= ruleOutput
            	    {

            	    					newCompositeNode(grammarAccess.getOutputsAccess().getOutputsOutputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
    // $ANTLR end "ruleOutputs"


    // $ANTLR start "entryRuleOutput"
    // InternalUseCase.g:1084:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalUseCase.g:1084:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalUseCase.g:1085:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalUseCase.g:1091:1: ruleOutput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) ;
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
            // InternalUseCase.g:1097:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) )
            // InternalUseCase.g:1098:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            {
            // InternalUseCase.g:1098:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            // InternalUseCase.g:1099:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            {
            // InternalUseCase.g:1099:3: ( (lv_many_0_0= 'many' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUseCase.g:1100:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:1100:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:1101:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,30,FOLLOW_26); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getOutputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOutputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:1117:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:1118:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:1118:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:1119:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            // InternalUseCase.g:1135:3: ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32||LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUseCase.g:1136:4: (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalUseCase.g:1136:4: (otherlv_3= 'as' | otherlv_4= 'als' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==32) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==42) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalUseCase.g:1137:5: otherlv_3= 'as'
                            {
                            otherlv_3=(Token)match(input,32,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getAsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1142:5: otherlv_4= 'als'
                            {
                            otherlv_4=(Token)match(input,42,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getAlsKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:1147:4: ( (otherlv_5= RULE_ID ) )
                    // InternalUseCase.g:1148:5: (otherlv_5= RULE_ID )
                    {
                    // InternalUseCase.g:1148:5: (otherlv_5= RULE_ID )
                    // InternalUseCase.g:1149:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:1161:3: (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUseCase.g:1162:4: otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_36); 

                    				newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalUseCase.g:1166:4: (otherlv_7= 'e.g' | otherlv_8= 'z.B.' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==44) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==45) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalUseCase.g:1167:5: otherlv_7= 'e.g'
                            {
                            otherlv_7=(Token)match(input,44,FOLLOW_11); 

                            					newLeafNode(otherlv_7, grammarAccess.getOutputAccess().getEGKeyword_4_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1172:5: otherlv_8= 'z.B.'
                            {
                            otherlv_8=(Token)match(input,45,FOLLOW_11); 

                            					newLeafNode(otherlv_8, grammarAccess.getOutputAccess().getZBKeyword_4_1_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:1177:4: ( (lv_example_9_0= RULE_STRING ) )
                    // InternalUseCase.g:1178:5: (lv_example_9_0= RULE_STRING )
                    {
                    // InternalUseCase.g:1178:5: (lv_example_9_0= RULE_STRING )
                    // InternalUseCase.g:1179:6: lv_example_9_0= RULE_STRING
                    {
                    lv_example_9_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

                    otherlv_10=(Token)match(input,46,FOLLOW_2); 

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
    // InternalUseCase.g:1204:1: entryRuleOptional returns [String current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final String entryRuleOptional() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOptional = null;


        try {
            // InternalUseCase.g:1204:48: (iv_ruleOptional= ruleOptional EOF )
            // InternalUseCase.g:1205:2: iv_ruleOptional= ruleOptional EOF
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
    // InternalUseCase.g:1211:1: ruleOptional returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'optional' ;
    public final AntlrDatatypeRuleToken ruleOptional() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUseCase.g:1217:2: (kw= 'optional' )
            // InternalUseCase.g:1218:2: kw= 'optional'
            {
            kw=(Token)match(input,52,FOLLOW_2); 

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
    // InternalUseCase.g:1226:1: entryRulePreConditions returns [EObject current=null] : iv_rulePreConditions= rulePreConditions EOF ;
    public final EObject entryRulePreConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreConditions = null;


        try {
            // InternalUseCase.g:1226:54: (iv_rulePreConditions= rulePreConditions EOF )
            // InternalUseCase.g:1227:2: iv_rulePreConditions= rulePreConditions EOF
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
    // InternalUseCase.g:1233:1: rulePreConditions returns [EObject current=null] : ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* ) ;
    public final EObject rulePreConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_conditions_3_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1239:2: ( ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* ) )
            // InternalUseCase.g:1240:2: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* )
            {
            // InternalUseCase.g:1240:2: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* )
            // InternalUseCase.g:1241:3: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )*
            {
            // InternalUseCase.g:1241:3: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=53 && LA39_0<=54)) ) {
                alt39=1;
            }
            else if ( (LA39_0==55) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalUseCase.g:1242:4: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
                    {
                    // InternalUseCase.g:1242:4: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==53) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==54) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalUseCase.g:1243:5: otherlv_0= 'pre-condition:'
                            {
                            otherlv_0=(Token)match(input,53,FOLLOW_39); 

                            					newLeafNode(otherlv_0, grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1248:5: otherlv_1= 'pre-conditions:'
                            {
                            otherlv_1=(Token)match(input,54,FOLLOW_39); 

                            					newLeafNode(otherlv_1, grammarAccess.getPreConditionsAccess().getPreConditionsKeyword_0_0_1());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1254:4: otherlv_2= 'Vorbedingungen:'
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_39); 

                    				newLeafNode(otherlv_2, grammarAccess.getPreConditionsAccess().getVorbedingungenKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1259:3: ( (lv_conditions_3_0= ruleCondition ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==31) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUseCase.g:1260:4: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // InternalUseCase.g:1260:4: (lv_conditions_3_0= ruleCondition )
            	    // InternalUseCase.g:1261:5: lv_conditions_3_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getPreConditionsAccess().getConditionsConditionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
    // $ANTLR end "rulePreConditions"


    // $ANTLR start "entryRuleCondition"
    // InternalUseCase.g:1282:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalUseCase.g:1282:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalUseCase.g:1283:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalUseCase.g:1289:1: ruleCondition returns [EObject current=null] : (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:1295:2: ( (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:1296:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:1296:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            // InternalUseCase.g:1297:3: otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:1301:3: ( (lv_content_1_0= RULE_STRING ) )
            // InternalUseCase.g:1302:4: (lv_content_1_0= RULE_STRING )
            {
            // InternalUseCase.g:1302:4: (lv_content_1_0= RULE_STRING )
            // InternalUseCase.g:1303:5: lv_content_1_0= RULE_STRING
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
    // InternalUseCase.g:1323:1: entryRuleSteps returns [EObject current=null] : iv_ruleSteps= ruleSteps EOF ;
    public final EObject entryRuleSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps = null;


        try {
            // InternalUseCase.g:1323:46: (iv_ruleSteps= ruleSteps EOF )
            // InternalUseCase.g:1324:2: iv_ruleSteps= ruleSteps EOF
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
    // InternalUseCase.g:1330:1: ruleSteps returns [EObject current=null] : ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* ) ;
    public final EObject ruleSteps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1336:2: ( ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* ) )
            // InternalUseCase.g:1337:2: ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* )
            {
            // InternalUseCase.g:1337:2: ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* )
            // InternalUseCase.g:1338:3: (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )*
            {
            // InternalUseCase.g:1338:3: (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==56) ) {
                alt41=1;
            }
            else if ( (LA41_0==57) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalUseCase.g:1339:4: otherlv_0= 'steps:'
                    {
                    otherlv_0=(Token)match(input,56,FOLLOW_40); 

                    				newLeafNode(otherlv_0, grammarAccess.getStepsAccess().getStepsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1344:4: otherlv_1= 'Schritte:'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getStepsAccess().getSchritteKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1349:3: ( (lv_steps_2_0= ruleStep ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_INT) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUseCase.g:1350:4: (lv_steps_2_0= ruleStep )
            	    {
            	    // InternalUseCase.g:1350:4: (lv_steps_2_0= ruleStep )
            	    // InternalUseCase.g:1351:5: lv_steps_2_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getStepsAccess().getStepsStepParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop42;
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
    // InternalUseCase.g:1372:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalUseCase.g:1372:45: (iv_ruleStep= ruleStep EOF )
            // InternalUseCase.g:1373:2: iv_ruleStep= ruleStep EOF
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
    // InternalUseCase.g:1379:1: ruleStep returns [EObject current=null] : ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_action_1_0=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        EObject lv_error_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1385:2: ( ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) )
            // InternalUseCase.g:1386:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            {
            // InternalUseCase.g:1386:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            // InternalUseCase.g:1387:3: ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )?
            {
            // InternalUseCase.g:1387:3: ( (lv_number_0_0= ruleQualifiedNumber ) )
            // InternalUseCase.g:1388:4: (lv_number_0_0= ruleQualifiedNumber )
            {
            // InternalUseCase.g:1388:4: (lv_number_0_0= ruleQualifiedNumber )
            // InternalUseCase.g:1389:5: lv_number_0_0= ruleQualifiedNumber
            {

            					newCompositeNode(grammarAccess.getStepAccess().getNumberQualifiedNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalUseCase.g:1406:3: ( (lv_action_1_0= RULE_STRING ) )
            // InternalUseCase.g:1407:4: (lv_action_1_0= RULE_STRING )
            {
            // InternalUseCase.g:1407:4: (lv_action_1_0= RULE_STRING )
            // InternalUseCase.g:1408:5: lv_action_1_0= RULE_STRING
            {
            lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalUseCase.g:1424:3: ( (lv_error_2_0= ruleRaiseError ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13||LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUseCase.g:1425:4: (lv_error_2_0= ruleRaiseError )
                    {
                    // InternalUseCase.g:1425:4: (lv_error_2_0= ruleRaiseError )
                    // InternalUseCase.g:1426:5: lv_error_2_0= ruleRaiseError
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
    // InternalUseCase.g:1447:1: entryRuleRaiseError returns [EObject current=null] : iv_ruleRaiseError= ruleRaiseError EOF ;
    public final EObject entryRuleRaiseError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiseError = null;


        try {
            // InternalUseCase.g:1447:51: (iv_ruleRaiseError= ruleRaiseError EOF )
            // InternalUseCase.g:1448:2: iv_ruleRaiseError= ruleRaiseError EOF
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
    // InternalUseCase.g:1454:1: ruleRaiseError returns [EObject current=null] : ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) ) ;
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
            // InternalUseCase.g:1460:2: ( ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) ) )
            // InternalUseCase.g:1461:2: ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) )
            {
            // InternalUseCase.g:1461:2: ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) )
            // InternalUseCase.g:1462:3: (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) )
            {
            // InternalUseCase.g:1462:3: (otherlv_0= '.' | otherlv_1= ':' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==13) ) {
                alt44=1;
            }
            else if ( (LA44_0==39) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalUseCase.g:1463:4: otherlv_0= '.'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_42); 

                    				newLeafNode(otherlv_0, grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1468:4: otherlv_1= ':'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getRaiseErrorAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1473:3: ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==58||LA49_0==60) ) {
                alt49=1;
            }
            else if ( (LA49_0==62||LA49_0==64) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalUseCase.g:1474:4: ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) )
                    {
                    // InternalUseCase.g:1474:4: ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==58) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==60) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalUseCase.g:1475:5: (otherlv_2= 'Raise' (otherlv_3= 'error' )? )
                            {
                            // InternalUseCase.g:1475:5: (otherlv_2= 'Raise' (otherlv_3= 'error' )? )
                            // InternalUseCase.g:1476:6: otherlv_2= 'Raise' (otherlv_3= 'error' )?
                            {
                            otherlv_2=(Token)match(input,58,FOLLOW_43); 

                            						newLeafNode(otherlv_2, grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0_0_0());
                            					
                            // InternalUseCase.g:1480:6: (otherlv_3= 'error' )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==59) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // InternalUseCase.g:1481:7: otherlv_3= 'error'
                                    {
                                    otherlv_3=(Token)match(input,59,FOLLOW_43); 

                                    							newLeafNode(otherlv_3, grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_0_0_1());
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1488:5: (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' )
                            {
                            // InternalUseCase.g:1488:5: (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' )
                            // InternalUseCase.g:1489:6: otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise'
                            {
                            otherlv_4=(Token)match(input,60,FOLLOW_44); 

                            						newLeafNode(otherlv_4, grammarAccess.getRaiseErrorAccess().getOnKeyword_1_0_1_0());
                            					
                            otherlv_5=(Token)match(input,59,FOLLOW_45); 

                            						newLeafNode(otherlv_5, grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_0_1_1());
                            					
                            otherlv_6=(Token)match(input,61,FOLLOW_43); 

                            						newLeafNode(otherlv_6, grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0_1_2());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1504:4: ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) )
                    {
                    // InternalUseCase.g:1504:4: ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==62) ) {
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
                            // InternalUseCase.g:1505:5: (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? )
                            {
                            // InternalUseCase.g:1505:5: (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? )
                            // InternalUseCase.g:1506:6: otherlv_7= 'Melde' (otherlv_8= 'Fehler' )?
                            {
                            otherlv_7=(Token)match(input,62,FOLLOW_46); 

                            						newLeafNode(otherlv_7, grammarAccess.getRaiseErrorAccess().getMeldeKeyword_1_1_0_0());
                            					
                            // InternalUseCase.g:1510:6: (otherlv_8= 'Fehler' )?
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==63) ) {
                                alt47=1;
                            }
                            switch (alt47) {
                                case 1 :
                                    // InternalUseCase.g:1511:7: otherlv_8= 'Fehler'
                                    {
                                    otherlv_8=(Token)match(input,63,FOLLOW_43); 

                                    							newLeafNode(otherlv_8, grammarAccess.getRaiseErrorAccess().getFehlerKeyword_1_1_0_1());
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1518:5: (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' )
                            {
                            // InternalUseCase.g:1518:5: (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' )
                            // InternalUseCase.g:1519:6: otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde'
                            {
                            otherlv_9=(Token)match(input,64,FOLLOW_47); 

                            						newLeafNode(otherlv_9, grammarAccess.getRaiseErrorAccess().getBeiKeyword_1_1_1_0());
                            					
                            otherlv_10=(Token)match(input,63,FOLLOW_48); 

                            						newLeafNode(otherlv_10, grammarAccess.getRaiseErrorAccess().getFehlerKeyword_1_1_1_1());
                            					
                            otherlv_11=(Token)match(input,65,FOLLOW_43); 

                            						newLeafNode(otherlv_11, grammarAccess.getRaiseErrorAccess().getMeldeKeyword_1_1_1_2());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1534:3: ( (lv_exception_12_0= ruleException ) )
            // InternalUseCase.g:1535:4: (lv_exception_12_0= ruleException )
            {
            // InternalUseCase.g:1535:4: (lv_exception_12_0= ruleException )
            // InternalUseCase.g:1536:5: lv_exception_12_0= ruleException
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
    // InternalUseCase.g:1557:1: entryRuleNotes returns [EObject current=null] : iv_ruleNotes= ruleNotes EOF ;
    public final EObject entryRuleNotes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotes = null;


        try {
            // InternalUseCase.g:1557:46: (iv_ruleNotes= ruleNotes EOF )
            // InternalUseCase.g:1558:2: iv_ruleNotes= ruleNotes EOF
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
    // InternalUseCase.g:1564:1: ruleNotes returns [EObject current=null] : ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleNotes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:1570:2: ( ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:1571:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:1571:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) )
            // InternalUseCase.g:1572:3: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) )
            {
            // InternalUseCase.g:1572:3: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=66 && LA52_0<=67)) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=68 && LA52_0<=69)) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalUseCase.g:1573:4: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
                    {
                    // InternalUseCase.g:1573:4: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==66) ) {
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
                            // InternalUseCase.g:1574:5: otherlv_0= 'notes:'
                            {
                            otherlv_0=(Token)match(input,66,FOLLOW_11); 

                            					newLeafNode(otherlv_0, grammarAccess.getNotesAccess().getNotesKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1579:5: otherlv_1= 'note:'
                            {
                            otherlv_1=(Token)match(input,67,FOLLOW_11); 

                            					newLeafNode(otherlv_1, grammarAccess.getNotesAccess().getNoteKeyword_0_0_1());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1585:4: (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' )
                    {
                    // InternalUseCase.g:1585:4: (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==68) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==69) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalUseCase.g:1586:5: otherlv_2= 'Anmerkungen:'
                            {
                            otherlv_2=(Token)match(input,68,FOLLOW_11); 

                            					newLeafNode(otherlv_2, grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1591:5: otherlv_3= 'Anmerkung:'
                            {
                            otherlv_3=(Token)match(input,69,FOLLOW_11); 

                            					newLeafNode(otherlv_3, grammarAccess.getNotesAccess().getAnmerkungKeyword_0_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1597:3: ( (lv_content_4_0= RULE_STRING ) )
            // InternalUseCase.g:1598:4: (lv_content_4_0= RULE_STRING )
            {
            // InternalUseCase.g:1598:4: (lv_content_4_0= RULE_STRING )
            // InternalUseCase.g:1599:5: lv_content_4_0= RULE_STRING
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
    // InternalUseCase.g:1619:1: entryRuleUsedTypes returns [EObject current=null] : iv_ruleUsedTypes= ruleUsedTypes EOF ;
    public final EObject entryRuleUsedTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedTypes = null;


        try {
            // InternalUseCase.g:1619:50: (iv_ruleUsedTypes= ruleUsedTypes EOF )
            // InternalUseCase.g:1620:2: iv_ruleUsedTypes= ruleUsedTypes EOF
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
    // InternalUseCase.g:1626:1: ruleUsedTypes returns [EObject current=null] : ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* ) ;
    public final EObject ruleUsedTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1632:2: ( ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* ) )
            // InternalUseCase.g:1633:2: ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* )
            {
            // InternalUseCase.g:1633:2: ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* )
            // InternalUseCase.g:1634:3: ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )*
            {
            // InternalUseCase.g:1634:3: ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==70) ) {
                alt53=1;
            }
            else if ( (LA53_0==72) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalUseCase.g:1635:4: (otherlv_0= 'used' otherlv_1= 'types:' )
                    {
                    // InternalUseCase.g:1635:4: (otherlv_0= 'used' otherlv_1= 'types:' )
                    // InternalUseCase.g:1636:5: otherlv_0= 'used' otherlv_1= 'types:'
                    {
                    otherlv_0=(Token)match(input,70,FOLLOW_49); 

                    					newLeafNode(otherlv_0, grammarAccess.getUsedTypesAccess().getUsedKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,71,FOLLOW_39); 

                    					newLeafNode(otherlv_1, grammarAccess.getUsedTypesAccess().getTypesKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1646:4: (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' )
                    {
                    // InternalUseCase.g:1646:4: (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' )
                    // InternalUseCase.g:1647:5: otherlv_2= 'Genutzte' otherlv_3= 'Typen:'
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_50); 

                    					newLeafNode(otherlv_2, grammarAccess.getUsedTypesAccess().getGenutzteKeyword_0_1_0());
                    				
                    otherlv_3=(Token)match(input,73,FOLLOW_39); 

                    					newLeafNode(otherlv_3, grammarAccess.getUsedTypesAccess().getTypenKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1657:3: ( (lv_types_4_0= ruleType ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==31) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalUseCase.g:1658:4: (lv_types_4_0= ruleType )
            	    {
            	    // InternalUseCase.g:1658:4: (lv_types_4_0= ruleType )
            	    // InternalUseCase.g:1659:5: lv_types_4_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getUsedTypesAccess().getTypesTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
    // $ANTLR end "ruleUsedTypes"


    // $ANTLR start "entryRuleType"
    // InternalUseCase.g:1680:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUseCase.g:1680:45: (iv_ruleType= ruleType EOF )
            // InternalUseCase.g:1681:2: iv_ruleType= ruleType EOF
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
    // InternalUseCase.g:1687:1: ruleType returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // InternalUseCase.g:1693:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:1694:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:1694:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:1695:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:1699:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:1700:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:1700:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:1701:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_51); 

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

            otherlv_2=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUseCase.g:1721:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalUseCase.g:1722:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalUseCase.g:1722:4: (lv_description_3_0= RULE_STRING )
            // InternalUseCase.g:1723:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

            otherlv_4=(Token)match(input,46,FOLLOW_52); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_4());
            		
            // InternalUseCase.g:1743:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==74) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUseCase.g:1744:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUseCase.g:1748:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:1749:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:1749:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:1750:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

                    otherlv_7=(Token)match(input,75,FOLLOW_2); 

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
    // InternalUseCase.g:1776:1: entryRuleUsedExceptions returns [EObject current=null] : iv_ruleUsedExceptions= ruleUsedExceptions EOF ;
    public final EObject entryRuleUsedExceptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedExceptions = null;


        try {
            // InternalUseCase.g:1776:55: (iv_ruleUsedExceptions= ruleUsedExceptions EOF )
            // InternalUseCase.g:1777:2: iv_ruleUsedExceptions= ruleUsedExceptions EOF
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
    // InternalUseCase.g:1783:1: ruleUsedExceptions returns [EObject current=null] : ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* ) ;
    public final EObject ruleUsedExceptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_exceptions_4_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1789:2: ( ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* ) )
            // InternalUseCase.g:1790:2: ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* )
            {
            // InternalUseCase.g:1790:2: ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* )
            // InternalUseCase.g:1791:3: ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )*
            {
            // InternalUseCase.g:1791:3: ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==70) ) {
                alt56=1;
            }
            else if ( (LA56_0==72) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalUseCase.g:1792:4: (otherlv_0= 'used' otherlv_1= 'errors:' )
                    {
                    // InternalUseCase.g:1792:4: (otherlv_0= 'used' otherlv_1= 'errors:' )
                    // InternalUseCase.g:1793:5: otherlv_0= 'used' otherlv_1= 'errors:'
                    {
                    otherlv_0=(Token)match(input,70,FOLLOW_54); 

                    					newLeafNode(otherlv_0, grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,76,FOLLOW_39); 

                    					newLeafNode(otherlv_1, grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1803:4: (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' )
                    {
                    // InternalUseCase.g:1803:4: (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' )
                    // InternalUseCase.g:1804:5: otherlv_2= 'Genutzte' otherlv_3= 'Fehler:'
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_55); 

                    					newLeafNode(otherlv_2, grammarAccess.getUsedExceptionsAccess().getGenutzteKeyword_0_1_0());
                    				
                    otherlv_3=(Token)match(input,77,FOLLOW_39); 

                    					newLeafNode(otherlv_3, grammarAccess.getUsedExceptionsAccess().getFehlerKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1814:3: ( (lv_exceptions_4_0= ruleExceptionDecleration ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==31) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalUseCase.g:1815:4: (lv_exceptions_4_0= ruleExceptionDecleration )
            	    {
            	    // InternalUseCase.g:1815:4: (lv_exceptions_4_0= ruleExceptionDecleration )
            	    // InternalUseCase.g:1816:5: lv_exceptions_4_0= ruleExceptionDecleration
            	    {

            	    					newCompositeNode(grammarAccess.getUsedExceptionsAccess().getExceptionsExceptionDeclerationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
            	    break loop57;
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
    // InternalUseCase.g:1837:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // InternalUseCase.g:1837:50: (iv_ruleException= ruleException EOF )
            // InternalUseCase.g:1838:2: iv_ruleException= ruleException EOF
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
    // InternalUseCase.g:1844:1: ruleException returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:1850:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUseCase.g:1851:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUseCase.g:1851:2: ( (otherlv_0= RULE_ID ) )
            // InternalUseCase.g:1852:3: (otherlv_0= RULE_ID )
            {
            // InternalUseCase.g:1852:3: (otherlv_0= RULE_ID )
            // InternalUseCase.g:1853:4: otherlv_0= RULE_ID
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
    // InternalUseCase.g:1867:1: entryRuleExceptionDecleration returns [EObject current=null] : iv_ruleExceptionDecleration= ruleExceptionDecleration EOF ;
    public final EObject entryRuleExceptionDecleration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionDecleration = null;


        try {
            // InternalUseCase.g:1867:61: (iv_ruleExceptionDecleration= ruleExceptionDecleration EOF )
            // InternalUseCase.g:1868:2: iv_ruleExceptionDecleration= ruleExceptionDecleration EOF
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
    // InternalUseCase.g:1874:1: ruleExceptionDecleration returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // InternalUseCase.g:1880:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:1881:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:1881:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:1882:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:1886:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:1887:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:1887:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:1888:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_51); 

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

            otherlv_2=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUseCase.g:1908:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalUseCase.g:1909:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalUseCase.g:1909:4: (lv_message_3_0= RULE_STRING )
            // InternalUseCase.g:1910:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

            otherlv_4=(Token)match(input,46,FOLLOW_52); 

            			newLeafNode(otherlv_4, grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_4());
            		
            // InternalUseCase.g:1930:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==74) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalUseCase.g:1931:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUseCase.g:1935:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:1936:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:1936:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:1937:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getExceptionDeclerationAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

                    otherlv_7=(Token)match(input,75,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000140L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x03EB810E1F280000L,0x000000000000003CL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x03EB810E18280000L,0x000000000000003CL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x03EB810E00280000L,0x000000000000003CL});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x03EB800000280000L,0x000000000000003CL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x03E0000000280000L,0x000000000000003CL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0300000000280000L,0x000000000000003CL});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000280000L,0x000000000000003CL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000C0100000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000002002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x5400000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8800000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});

}