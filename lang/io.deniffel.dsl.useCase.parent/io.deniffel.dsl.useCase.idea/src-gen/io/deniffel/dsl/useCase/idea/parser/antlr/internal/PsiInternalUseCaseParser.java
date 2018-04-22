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
    // PsiInternalUseCase.g:59:1: ruleModel returns [Boolean current=false] : ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) )? ( (lv_exceptions_6_0= ruleUsedExceptions ) )? ( (lv_examples_7_0= ruleExample ) )* ) ;
    public final Boolean ruleModel() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Boolean lv_company_2_0 = null;

        Boolean lv_package_3_0 = null;

        Boolean lv_useCases_4_0 = null;

        Boolean lv_types_5_0 = null;

        Boolean lv_exceptions_6_0 = null;

        Boolean lv_examples_7_0 = null;


        try {
            // PsiInternalUseCase.g:60:1: ( ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) )? ( (lv_exceptions_6_0= ruleUsedExceptions ) )? ( (lv_examples_7_0= ruleExample ) )* ) )
            // PsiInternalUseCase.g:61:2: ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) )? ( (lv_exceptions_6_0= ruleUsedExceptions ) )? ( (lv_examples_7_0= ruleExample ) )* )
            {
            // PsiInternalUseCase.g:61:2: ( (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) )? ( (lv_exceptions_6_0= ruleUsedExceptions ) )? ( (lv_examples_7_0= ruleExample ) )* )
            // PsiInternalUseCase.g:62:3: (otherlv_0= 'Firma' | otherlv_1= 'Company' ) ( (lv_company_2_0= ruleQualifiedName ) ) ( (lv_package_3_0= rulePackage ) ) ( (lv_useCases_4_0= ruleUseCase ) )* ( (lv_types_5_0= ruleUsedTypes ) )? ( (lv_exceptions_6_0= ruleUsedExceptions ) )? ( (lv_examples_7_0= ruleExample ) )*
            {
            // PsiInternalUseCase.g:62:3: (otherlv_0= 'Firma' | otherlv_1= 'Company' )
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
                    // PsiInternalUseCase.g:63:4: otherlv_0= 'Firma'
                    {

                    				markLeaf(elementTypeProvider.getModel_FirmaKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:71:4: otherlv_1= 'Company'
                    {

                    				markLeaf(elementTypeProvider.getModel_CompanyKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:79:3: ( (lv_company_2_0= ruleQualifiedName ) )
            // PsiInternalUseCase.g:80:4: (lv_company_2_0= ruleQualifiedName )
            {
            // PsiInternalUseCase.g:80:4: (lv_company_2_0= ruleQualifiedName )
            // PsiInternalUseCase.g:81:5: lv_company_2_0= ruleQualifiedName
            {

            					markComposite(elementTypeProvider.getModel_CompanyQualifiedNameParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_4);
            lv_company_2_0=ruleQualifiedName();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalUseCase.g:94:3: ( (lv_package_3_0= rulePackage ) )
            // PsiInternalUseCase.g:95:4: (lv_package_3_0= rulePackage )
            {
            // PsiInternalUseCase.g:95:4: (lv_package_3_0= rulePackage )
            // PsiInternalUseCase.g:96:5: lv_package_3_0= rulePackage
            {

            					markComposite(elementTypeProvider.getModel_PackagePackageParserRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_5);
            lv_package_3_0=rulePackage();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalUseCase.g:109:3: ( (lv_useCases_4_0= ruleUseCase ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalUseCase.g:110:4: (lv_useCases_4_0= ruleUseCase )
            	    {
            	    // PsiInternalUseCase.g:110:4: (lv_useCases_4_0= ruleUseCase )
            	    // PsiInternalUseCase.g:111:5: lv_useCases_4_0= ruleUseCase
            	    {

            	    					markComposite(elementTypeProvider.getModel_UseCasesUseCaseParserRuleCall_3_0ElementType());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_useCases_4_0=ruleUseCase();

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

            // PsiInternalUseCase.g:124:3: ( (lv_types_5_0= ruleUsedTypes ) )?
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
                    // PsiInternalUseCase.g:125:4: (lv_types_5_0= ruleUsedTypes )
                    {
                    // PsiInternalUseCase.g:125:4: (lv_types_5_0= ruleUsedTypes )
                    // PsiInternalUseCase.g:126:5: lv_types_5_0= ruleUsedTypes
                    {

                    					markComposite(elementTypeProvider.getModel_TypesUsedTypesParserRuleCall_4_0ElementType());
                    				
                    pushFollow(FOLLOW_6);
                    lv_types_5_0=ruleUsedTypes();

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

            // PsiInternalUseCase.g:139:3: ( (lv_exceptions_6_0= ruleUsedExceptions ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==78||LA4_0==80) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // PsiInternalUseCase.g:140:4: (lv_exceptions_6_0= ruleUsedExceptions )
                    {
                    // PsiInternalUseCase.g:140:4: (lv_exceptions_6_0= ruleUsedExceptions )
                    // PsiInternalUseCase.g:141:5: lv_exceptions_6_0= ruleUsedExceptions
                    {

                    					markComposite(elementTypeProvider.getModel_ExceptionsUsedExceptionsParserRuleCall_5_0ElementType());
                    				
                    pushFollow(FOLLOW_7);
                    lv_exceptions_6_0=ruleUsedExceptions();

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

            // PsiInternalUseCase.g:154:3: ( (lv_examples_7_0= ruleExample ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==86) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // PsiInternalUseCase.g:155:4: (lv_examples_7_0= ruleExample )
            	    {
            	    // PsiInternalUseCase.g:155:4: (lv_examples_7_0= ruleExample )
            	    // PsiInternalUseCase.g:156:5: lv_examples_7_0= ruleExample
            	    {

            	    					markComposite(elementTypeProvider.getModel_ExamplesExampleParserRuleCall_6_0ElementType());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_examples_7_0=ruleExample();

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
            	    break loop5;
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


    // $ANTLR start "entryRuleQualifiedName"
    // PsiInternalUseCase.g:173:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalUseCase.g:173:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalUseCase.g:174:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // PsiInternalUseCase.g:180:1: ruleQualifiedName returns [Boolean current=false] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // PsiInternalUseCase.g:181:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // PsiInternalUseCase.g:182:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // PsiInternalUseCase.g:182:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // PsiInternalUseCase.g:183:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			doneLeaf(this_ID_0);
            		
            // PsiInternalUseCase.g:190:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PsiInternalUseCase.g:191:4: kw= '.' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,13,FOLLOW_3); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // PsiInternalUseCase.g:210:1: entryRuleQualifiedNumber returns [Boolean current=false] : iv_ruleQualifiedNumber= ruleQualifiedNumber EOF ;
    public final Boolean entryRuleQualifiedNumber() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedNumber = null;


        try {
            // PsiInternalUseCase.g:210:57: (iv_ruleQualifiedNumber= ruleQualifiedNumber EOF )
            // PsiInternalUseCase.g:211:2: iv_ruleQualifiedNumber= ruleQualifiedNumber EOF
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
    // PsiInternalUseCase.g:217:1: ruleQualifiedNumber returns [Boolean current=false] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) ;
    public final Boolean ruleQualifiedNumber() throws RecognitionException {
        Boolean current = false;

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

        try {
            // PsiInternalUseCase.g:218:1: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) )
            // PsiInternalUseCase.g:219:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            {
            // PsiInternalUseCase.g:219:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            // PsiInternalUseCase.g:220:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.'
            {

            			markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_0ElementType());
            		
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            			doneLeaf(this_INT_0);
            		
            // PsiInternalUseCase.g:227:3: (kw= '.' this_INT_2= RULE_INT )*
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
            	    // PsiInternalUseCase.g:228:4: kw= '.' this_INT_2= RULE_INT
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,13,FOLLOW_10); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_1_1ElementType());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_9); 

            	    				doneLeaf(this_INT_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_2ElementType());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRulePackage"
    // PsiInternalUseCase.g:254:1: entryRulePackage returns [Boolean current=false] : iv_rulePackage= rulePackage EOF ;
    public final Boolean entryRulePackage() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePackage = null;


        try {
            // PsiInternalUseCase.g:254:49: (iv_rulePackage= rulePackage EOF )
            // PsiInternalUseCase.g:255:2: iv_rulePackage= rulePackage EOF
            {
             markComposite(elementTypeProvider.getPackageElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // PsiInternalUseCase.g:261:1: rulePackage returns [Boolean current=false] : ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* ) ;
    public final Boolean rulePackage() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_parts_2_0 = null;

        Boolean lv_parts_4_0 = null;


        try {
            // PsiInternalUseCase.g:262:1: ( ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* ) )
            // PsiInternalUseCase.g:263:2: ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* )
            {
            // PsiInternalUseCase.g:263:2: ( (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )* )
            // PsiInternalUseCase.g:264:3: (otherlv_0= 'Kathegorie' | otherlv_1= 'package' ) ( (lv_parts_2_0= rulePackagePart ) ) (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )*
            {
            // PsiInternalUseCase.g:264:3: (otherlv_0= 'Kathegorie' | otherlv_1= 'package' )
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
                    // PsiInternalUseCase.g:265:4: otherlv_0= 'Kathegorie'
                    {

                    				markLeaf(elementTypeProvider.getPackage_KathegorieKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,14,FOLLOW_3); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:273:4: otherlv_1= 'package'
                    {

                    				markLeaf(elementTypeProvider.getPackage_PackageKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,15,FOLLOW_3); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:281:3: ( (lv_parts_2_0= rulePackagePart ) )
            // PsiInternalUseCase.g:282:4: (lv_parts_2_0= rulePackagePart )
            {
            // PsiInternalUseCase.g:282:4: (lv_parts_2_0= rulePackagePart )
            // PsiInternalUseCase.g:283:5: lv_parts_2_0= rulePackagePart
            {

            					markComposite(elementTypeProvider.getPackage_PartsPackagePartParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_11);
            lv_parts_2_0=rulePackagePart();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalUseCase.g:296:3: (otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // PsiInternalUseCase.g:297:4: otherlv_3= '>' ( (lv_parts_4_0= rulePackagePart ) )
            	    {

            	    				markLeaf(elementTypeProvider.getPackage_GreaterThanSignKeyword_2_0ElementType());
            	    			
            	    otherlv_3=(Token)match(input,16,FOLLOW_3); 

            	    				doneLeaf(otherlv_3);
            	    			
            	    // PsiInternalUseCase.g:304:4: ( (lv_parts_4_0= rulePackagePart ) )
            	    // PsiInternalUseCase.g:305:5: (lv_parts_4_0= rulePackagePart )
            	    {
            	    // PsiInternalUseCase.g:305:5: (lv_parts_4_0= rulePackagePart )
            	    // PsiInternalUseCase.g:306:6: lv_parts_4_0= rulePackagePart
            	    {

            	    						markComposite(elementTypeProvider.getPackage_PartsPackagePartParserRuleCall_2_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_parts_4_0=rulePackagePart();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackagePart"
    // PsiInternalUseCase.g:324:1: entryRulePackagePart returns [Boolean current=false] : iv_rulePackagePart= rulePackagePart EOF ;
    public final Boolean entryRulePackagePart() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePackagePart = null;


        try {
            // PsiInternalUseCase.g:324:53: (iv_rulePackagePart= rulePackagePart EOF )
            // PsiInternalUseCase.g:325:2: iv_rulePackagePart= rulePackagePart EOF
            {
             markComposite(elementTypeProvider.getPackagePartElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulePackagePart=rulePackagePart();

            state._fsp--;

             current =iv_rulePackagePart; 
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
    // $ANTLR end "entryRulePackagePart"


    // $ANTLR start "rulePackagePart"
    // PsiInternalUseCase.g:331:1: rulePackagePart returns [Boolean current=false] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final Boolean rulePackagePart() throws RecognitionException {
        Boolean current = false;

        Token lv_name_0_0=null;

        try {
            // PsiInternalUseCase.g:332:1: ( ( (lv_name_0_0= RULE_ID ) ) )
            // PsiInternalUseCase.g:333:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // PsiInternalUseCase.g:333:2: ( (lv_name_0_0= RULE_ID ) )
            // PsiInternalUseCase.g:334:3: (lv_name_0_0= RULE_ID )
            {
            // PsiInternalUseCase.g:334:3: (lv_name_0_0= RULE_ID )
            // PsiInternalUseCase.g:335:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getPackagePart_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // $ANTLR end "rulePackagePart"


    // $ANTLR start "entryRuleUseCase"
    // PsiInternalUseCase.g:353:1: entryRuleUseCase returns [Boolean current=false] : iv_ruleUseCase= ruleUseCase EOF ;
    public final Boolean entryRuleUseCase() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUseCase = null;


        try {
            // PsiInternalUseCase.g:353:49: (iv_ruleUseCase= ruleUseCase EOF )
            // PsiInternalUseCase.g:354:2: iv_ruleUseCase= ruleUseCase EOF
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
    // PsiInternalUseCase.g:360:1: ruleUseCase returns [Boolean current=false] : ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )? ( (lv_outputs_7_0= ruleOutputs ) )? ( (lv_preconditions_8_0= rulePreConditions ) )? ( (lv_steps_9_0= ruleSteps ) )? ( (lv_notes_10_0= ruleNotes ) )? ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) ) ) ;
    public final Boolean ruleUseCase() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Boolean lv_descriptions_3_0 = null;

        Boolean lv_allowedUserGroups_4_0 = null;

        Boolean lv_inputs_5_0 = null;

        Boolean lv_optionalInputs_6_0 = null;

        Boolean lv_outputs_7_0 = null;

        Boolean lv_preconditions_8_0 = null;

        Boolean lv_steps_9_0 = null;

        Boolean lv_notes_10_0 = null;


        try {
            // PsiInternalUseCase.g:361:1: ( ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )? ( (lv_outputs_7_0= ruleOutputs ) )? ( (lv_preconditions_8_0= rulePreConditions ) )? ( (lv_steps_9_0= ruleSteps ) )? ( (lv_notes_10_0= ruleNotes ) )? ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) ) ) )
            // PsiInternalUseCase.g:362:2: ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )? ( (lv_outputs_7_0= ruleOutputs ) )? ( (lv_preconditions_8_0= rulePreConditions ) )? ( (lv_steps_9_0= ruleSteps ) )? ( (lv_notes_10_0= ruleNotes ) )? ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) ) )
            {
            // PsiInternalUseCase.g:362:2: ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )? ( (lv_outputs_7_0= ruleOutputs ) )? ( (lv_preconditions_8_0= rulePreConditions ) )? ( (lv_steps_9_0= ruleSteps ) )? ( (lv_notes_10_0= ruleNotes ) )? ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) ) )
            // PsiInternalUseCase.g:363:3: (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )? ( (lv_outputs_7_0= ruleOutputs ) )? ( (lv_preconditions_8_0= rulePreConditions ) )? ( (lv_steps_9_0= ruleSteps ) )? ( (lv_notes_10_0= ruleNotes ) )? ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) )
            {
            // PsiInternalUseCase.g:363:3: (otherlv_0= 'use-case' | otherlv_1= 'Rezept' )
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
                    // PsiInternalUseCase.g:364:4: otherlv_0= 'use-case'
                    {

                    				markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,17,FOLLOW_12); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:372:4: otherlv_1= 'Rezept'
                    {

                    				markLeaf(elementTypeProvider.getUseCase_RezeptKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_12); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:380:3: ( (lv_name_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:381:4: (lv_name_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:381:4: (lv_name_2_0= RULE_STRING )
            // PsiInternalUseCase.g:382:5: lv_name_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getUseCase_NameSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:397:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=24 && LA11_0<=26)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalUseCase.g:398:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // PsiInternalUseCase.g:398:4: (lv_descriptions_3_0= ruleDescription )
                    // PsiInternalUseCase.g:399:5: lv_descriptions_3_0= ruleDescription
                    {

                    					markComposite(elementTypeProvider.getUseCase_DescriptionsDescriptionParserRuleCall_2_0ElementType());
                    				
                    pushFollow(FOLLOW_14);
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

            // PsiInternalUseCase.g:412:3: ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=27 && LA12_0<=28)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalUseCase.g:413:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    {
                    // PsiInternalUseCase.g:413:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    // PsiInternalUseCase.g:414:5: lv_allowedUserGroups_4_0= ruleAllowedUserGroups
                    {

                    					markComposite(elementTypeProvider.getUseCase_AllowedUserGroupsAllowedUserGroupsParserRuleCall_3_0ElementType());
                    				
                    pushFollow(FOLLOW_15);
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

            // PsiInternalUseCase.g:427:3: ( (lv_inputs_5_0= ruleInputs ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=33 && LA13_0<=35)||LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // PsiInternalUseCase.g:428:4: (lv_inputs_5_0= ruleInputs )
                    {
                    // PsiInternalUseCase.g:428:4: (lv_inputs_5_0= ruleInputs )
                    // PsiInternalUseCase.g:429:5: lv_inputs_5_0= ruleInputs
                    {

                    					markComposite(elementTypeProvider.getUseCase_InputsInputsParserRuleCall_4_0ElementType());
                    				
                    pushFollow(FOLLOW_16);
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

            // PsiInternalUseCase.g:442:3: ( (lv_optionalInputs_6_0= ruleOptionalInputs ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=42 && LA14_0<=43)||(LA14_0>=45 && LA14_0<=46)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // PsiInternalUseCase.g:443:4: (lv_optionalInputs_6_0= ruleOptionalInputs )
                    {
                    // PsiInternalUseCase.g:443:4: (lv_optionalInputs_6_0= ruleOptionalInputs )
                    // PsiInternalUseCase.g:444:5: lv_optionalInputs_6_0= ruleOptionalInputs
                    {

                    					markComposite(elementTypeProvider.getUseCase_OptionalInputsOptionalInputsParserRuleCall_5_0ElementType());
                    				
                    pushFollow(FOLLOW_17);
                    lv_optionalInputs_6_0=ruleOptionalInputs();

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

            // PsiInternalUseCase.g:457:3: ( (lv_outputs_7_0= ruleOutputs ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=52 && LA15_0<=54)||LA15_0==56) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalUseCase.g:458:4: (lv_outputs_7_0= ruleOutputs )
                    {
                    // PsiInternalUseCase.g:458:4: (lv_outputs_7_0= ruleOutputs )
                    // PsiInternalUseCase.g:459:5: lv_outputs_7_0= ruleOutputs
                    {

                    					markComposite(elementTypeProvider.getUseCase_OutputsOutputsParserRuleCall_6_0ElementType());
                    				
                    pushFollow(FOLLOW_18);
                    lv_outputs_7_0=ruleOutputs();

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

            // PsiInternalUseCase.g:472:3: ( (lv_preconditions_8_0= rulePreConditions ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=57 && LA16_0<=59)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // PsiInternalUseCase.g:473:4: (lv_preconditions_8_0= rulePreConditions )
                    {
                    // PsiInternalUseCase.g:473:4: (lv_preconditions_8_0= rulePreConditions )
                    // PsiInternalUseCase.g:474:5: lv_preconditions_8_0= rulePreConditions
                    {

                    					markComposite(elementTypeProvider.getUseCase_PreconditionsPreConditionsParserRuleCall_7_0ElementType());
                    				
                    pushFollow(FOLLOW_19);
                    lv_preconditions_8_0=rulePreConditions();

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

            // PsiInternalUseCase.g:487:3: ( (lv_steps_9_0= ruleSteps ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=60 && LA17_0<=61)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalUseCase.g:488:4: (lv_steps_9_0= ruleSteps )
                    {
                    // PsiInternalUseCase.g:488:4: (lv_steps_9_0= ruleSteps )
                    // PsiInternalUseCase.g:489:5: lv_steps_9_0= ruleSteps
                    {

                    					markComposite(elementTypeProvider.getUseCase_StepsStepsParserRuleCall_8_0ElementType());
                    				
                    pushFollow(FOLLOW_20);
                    lv_steps_9_0=ruleSteps();

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

            // PsiInternalUseCase.g:502:3: ( (lv_notes_10_0= ruleNotes ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=74 && LA18_0<=77)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // PsiInternalUseCase.g:503:4: (lv_notes_10_0= ruleNotes )
                    {
                    // PsiInternalUseCase.g:503:4: (lv_notes_10_0= ruleNotes )
                    // PsiInternalUseCase.g:504:5: lv_notes_10_0= ruleNotes
                    {

                    					markComposite(elementTypeProvider.getUseCase_NotesNotesParserRuleCall_9_0ElementType());
                    				
                    pushFollow(FOLLOW_21);
                    lv_notes_10_0=ruleNotes();

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

            // PsiInternalUseCase.g:517:3: ( (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' ) | (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' ) )
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
                    // PsiInternalUseCase.g:518:4: (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' )
                    {
                    // PsiInternalUseCase.g:518:4: (otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case' )
                    // PsiInternalUseCase.g:519:5: otherlv_11= 'end' otherlv_12= 'of' otherlv_13= 'use-case'
                    {

                    					markLeaf(elementTypeProvider.getUseCase_EndKeyword_10_0_0ElementType());
                    				
                    otherlv_11=(Token)match(input,19,FOLLOW_22); 

                    					doneLeaf(otherlv_11);
                    				

                    					markLeaf(elementTypeProvider.getUseCase_OfKeyword_10_0_1ElementType());
                    				
                    otherlv_12=(Token)match(input,20,FOLLOW_23); 

                    					doneLeaf(otherlv_12);
                    				

                    					markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_10_0_2ElementType());
                    				
                    otherlv_13=(Token)match(input,17,FOLLOW_2); 

                    					doneLeaf(otherlv_13);
                    				

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:542:4: (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' )
                    {
                    // PsiInternalUseCase.g:542:4: (otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets' )
                    // PsiInternalUseCase.g:543:5: otherlv_14= 'Ende' otherlv_15= 'des' otherlv_16= 'Rezpets'
                    {

                    					markLeaf(elementTypeProvider.getUseCase_EndeKeyword_10_1_0ElementType());
                    				
                    otherlv_14=(Token)match(input,21,FOLLOW_24); 

                    					doneLeaf(otherlv_14);
                    				

                    					markLeaf(elementTypeProvider.getUseCase_DesKeyword_10_1_1ElementType());
                    				
                    otherlv_15=(Token)match(input,22,FOLLOW_25); 

                    					doneLeaf(otherlv_15);
                    				

                    					markLeaf(elementTypeProvider.getUseCase_RezpetsKeyword_10_1_2ElementType());
                    				
                    otherlv_16=(Token)match(input,23,FOLLOW_2); 

                    					doneLeaf(otherlv_16);
                    				

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
    // PsiInternalUseCase.g:570:1: entryRuleDescription returns [Boolean current=false] : iv_ruleDescription= ruleDescription EOF ;
    public final Boolean entryRuleDescription() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDescription = null;


        try {
            // PsiInternalUseCase.g:570:53: (iv_ruleDescription= ruleDescription EOF )
            // PsiInternalUseCase.g:571:2: iv_ruleDescription= ruleDescription EOF
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
    // PsiInternalUseCase.g:577:1: ruleDescription returns [Boolean current=false] : ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final Boolean ruleDescription() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

        try {
            // PsiInternalUseCase.g:578:1: ( ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:579:2: ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:579:2: ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:580:3: (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:580:3: (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' )
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
                    // PsiInternalUseCase.g:581:4: otherlv_0= 'description:'
                    {

                    				markLeaf(elementTypeProvider.getDescription_DescriptionKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,24,FOLLOW_12); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:589:4: otherlv_1= 'Kurzbeschreibung:'
                    {

                    				markLeaf(elementTypeProvider.getDescription_KurzbeschreibungKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,25,FOLLOW_12); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 3 :
                    // PsiInternalUseCase.g:597:4: otherlv_2= 'Beschreibung'
                    {

                    				markLeaf(elementTypeProvider.getDescription_BeschreibungKeyword_0_2ElementType());
                    			
                    otherlv_2=(Token)match(input,26,FOLLOW_12); 

                    				doneLeaf(otherlv_2);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:605:3: ( (lv_name_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:606:4: (lv_name_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:606:4: (lv_name_3_0= RULE_STRING )
            // PsiInternalUseCase.g:607:5: lv_name_3_0= RULE_STRING
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
    // PsiInternalUseCase.g:626:1: entryRuleAllowedUserGroups returns [Boolean current=false] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final Boolean entryRuleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroups = null;


        try {
            // PsiInternalUseCase.g:626:59: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // PsiInternalUseCase.g:627:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
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
    // PsiInternalUseCase.g:633:1: ruleAllowedUserGroups returns [Boolean current=false] : ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* ) ;
    public final Boolean ruleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Boolean lv_groups_3_0 = null;


        try {
            // PsiInternalUseCase.g:634:1: ( ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* ) )
            // PsiInternalUseCase.g:635:2: ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* )
            {
            // PsiInternalUseCase.g:635:2: ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* )
            // PsiInternalUseCase.g:636:3: (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )*
            {
            // PsiInternalUseCase.g:636:3: (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) )
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
                    // PsiInternalUseCase.g:637:4: otherlv_0= 'allowed-usergroups:'
                    {

                    				markLeaf(elementTypeProvider.getAllowedUserGroups_AllowedUsergroupsKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,27,FOLLOW_26); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:645:4: (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' )
                    {
                    // PsiInternalUseCase.g:645:4: (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' )
                    // PsiInternalUseCase.g:646:5: otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:'
                    {

                    					markLeaf(elementTypeProvider.getAllowedUserGroups_ErlaubtKeyword_0_1_0ElementType());
                    				
                    otherlv_1=(Token)match(input,28,FOLLOW_27); 

                    					doneLeaf(otherlv_1);
                    				

                    					markLeaf(elementTypeProvider.getAllowedUserGroups_FürKeyword_0_1_1ElementType());
                    				
                    otherlv_2=(Token)match(input,29,FOLLOW_26); 

                    					doneLeaf(otherlv_2);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:662:3: ( (lv_groups_3_0= ruleAllowedUserGroup ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=30 && LA22_0<=31)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // PsiInternalUseCase.g:663:4: (lv_groups_3_0= ruleAllowedUserGroup )
            	    {
            	    // PsiInternalUseCase.g:663:4: (lv_groups_3_0= ruleAllowedUserGroup )
            	    // PsiInternalUseCase.g:664:5: lv_groups_3_0= ruleAllowedUserGroup
            	    {

            	    					markComposite(elementTypeProvider.getAllowedUserGroups_GroupsAllowedUserGroupParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop22;
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
    // PsiInternalUseCase.g:681:1: entryRuleAllowedUserGroup returns [Boolean current=false] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final Boolean entryRuleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroup = null;


        try {
            // PsiInternalUseCase.g:681:58: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // PsiInternalUseCase.g:682:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
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
    // PsiInternalUseCase.g:688:1: ruleAllowedUserGroup returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final Boolean ruleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // PsiInternalUseCase.g:689:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // PsiInternalUseCase.g:690:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // PsiInternalUseCase.g:690:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // PsiInternalUseCase.g:691:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // PsiInternalUseCase.g:691:3: ( (lv_many_0_0= 'many' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalUseCase.g:692:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:692:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:693:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getAllowedUserGroup_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,30,FOLLOW_28); 

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
            		
            otherlv_1=(Token)match(input,31,FOLLOW_12); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:715:3: ( (lv_name_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:716:4: (lv_name_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:716:4: (lv_name_2_0= RULE_STRING )
            // PsiInternalUseCase.g:717:5: lv_name_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getAllowedUserGroup_NameSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:732:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // PsiInternalUseCase.g:733:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getAllowedUserGroup_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:740:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:741:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:741:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:742:6: otherlv_4= RULE_ID
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
    // PsiInternalUseCase.g:762:1: entryRuleInputs returns [Boolean current=false] : iv_ruleInputs= ruleInputs EOF ;
    public final Boolean entryRuleInputs() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInputs = null;


        try {
            // PsiInternalUseCase.g:762:48: (iv_ruleInputs= ruleInputs EOF )
            // PsiInternalUseCase.g:763:2: iv_ruleInputs= ruleInputs EOF
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
    // PsiInternalUseCase.g:769:1: ruleInputs returns [Boolean current=false] : ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* ) ;
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
            // PsiInternalUseCase.g:770:1: ( ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* ) )
            // PsiInternalUseCase.g:771:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* )
            {
            // PsiInternalUseCase.g:771:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* )
            // PsiInternalUseCase.g:772:3: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )*
            {
            // PsiInternalUseCase.g:772:3: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) )
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
                    // PsiInternalUseCase.g:773:4: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
                    {
                    // PsiInternalUseCase.g:773:4: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
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
                            // PsiInternalUseCase.g:774:5: otherlv_0= 'requires:'
                            {

                            					markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_0_0ElementType());
                            				
                            otherlv_0=(Token)match(input,33,FOLLOW_26); 

                            					doneLeaf(otherlv_0);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:782:5: otherlv_1= 'require:'
                            {

                            					markLeaf(elementTypeProvider.getInputs_RequireKeyword_0_0_1ElementType());
                            				
                            otherlv_1=(Token)match(input,34,FOLLOW_26); 

                            					doneLeaf(otherlv_1);
                            				

                            }
                            break;
                        case 3 :
                            // PsiInternalUseCase.g:790:5: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                            {
                            // PsiInternalUseCase.g:790:5: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                            // PsiInternalUseCase.g:791:6: otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':'
                            {

                            						markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_0_2_0ElementType());
                            					
                            otherlv_2=(Token)match(input,35,FOLLOW_30); 

                            						doneLeaf(otherlv_2);
                            					

                            						markLeaf(elementTypeProvider.getInputs_TheKeyword_0_0_2_1ElementType());
                            					
                            otherlv_3=(Token)match(input,36,FOLLOW_31); 

                            						doneLeaf(otherlv_3);
                            					

                            						markLeaf(elementTypeProvider.getInputs_FollowingKeyword_0_0_2_2ElementType());
                            					
                            otherlv_4=(Token)match(input,37,FOLLOW_32); 

                            						doneLeaf(otherlv_4);
                            					

                            						markLeaf(elementTypeProvider.getInputs_InputKeyword_0_0_2_3ElementType());
                            					
                            otherlv_5=(Token)match(input,38,FOLLOW_33); 

                            						doneLeaf(otherlv_5);
                            					

                            						markLeaf(elementTypeProvider.getInputs_ColonKeyword_0_0_2_4ElementType());
                            					
                            otherlv_6=(Token)match(input,39,FOLLOW_26); 

                            						doneLeaf(otherlv_6);
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:829:4: (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' )
                    {
                    // PsiInternalUseCase.g:829:4: (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' )
                    // PsiInternalUseCase.g:830:5: otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':'
                    {

                    					markLeaf(elementTypeProvider.getInputs_BenötigteKeyword_0_1_0ElementType());
                    				
                    otherlv_7=(Token)match(input,40,FOLLOW_34); 

                    					doneLeaf(otherlv_7);
                    				

                    					markLeaf(elementTypeProvider.getInputs_ZutatenKeyword_0_1_1ElementType());
                    				
                    otherlv_8=(Token)match(input,41,FOLLOW_33); 

                    					doneLeaf(otherlv_8);
                    				

                    					markLeaf(elementTypeProvider.getInputs_ColonKeyword_0_1_2ElementType());
                    				
                    otherlv_9=(Token)match(input,39,FOLLOW_26); 

                    					doneLeaf(otherlv_9);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:853:3: ( (lv_inputs_10_0= ruleInput ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=30 && LA27_0<=31)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // PsiInternalUseCase.g:854:4: (lv_inputs_10_0= ruleInput )
            	    {
            	    // PsiInternalUseCase.g:854:4: (lv_inputs_10_0= ruleInput )
            	    // PsiInternalUseCase.g:855:5: lv_inputs_10_0= ruleInput
            	    {

            	    					markComposite(elementTypeProvider.getInputs_InputsInputParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_26);
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
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleOptionalInputs"
    // PsiInternalUseCase.g:872:1: entryRuleOptionalInputs returns [Boolean current=false] : iv_ruleOptionalInputs= ruleOptionalInputs EOF ;
    public final Boolean entryRuleOptionalInputs() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOptionalInputs = null;


        try {
            // PsiInternalUseCase.g:872:56: (iv_ruleOptionalInputs= ruleOptionalInputs EOF )
            // PsiInternalUseCase.g:873:2: iv_ruleOptionalInputs= ruleOptionalInputs EOF
            {
             markComposite(elementTypeProvider.getOptionalInputsElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionalInputs=ruleOptionalInputs();

            state._fsp--;

             current =iv_ruleOptionalInputs; 
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
    // $ANTLR end "entryRuleOptionalInputs"


    // $ANTLR start "ruleOptionalInputs"
    // PsiInternalUseCase.g:879:1: ruleOptionalInputs returns [Boolean current=false] : ( ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) ) ( (lv_inputs_8_0= ruleInput ) )* ) ;
    public final Boolean ruleOptionalInputs() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Boolean lv_inputs_8_0 = null;


        try {
            // PsiInternalUseCase.g:880:1: ( ( ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) ) ( (lv_inputs_8_0= ruleInput ) )* ) )
            // PsiInternalUseCase.g:881:2: ( ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) ) ( (lv_inputs_8_0= ruleInput ) )* )
            {
            // PsiInternalUseCase.g:881:2: ( ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) ) ( (lv_inputs_8_0= ruleInput ) )* )
            // PsiInternalUseCase.g:882:3: ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) ) ( (lv_inputs_8_0= ruleInput ) )*
            {
            // PsiInternalUseCase.g:882:3: ( (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) ) | ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' ) )
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
                    // PsiInternalUseCase.g:883:4: (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) )
                    {
                    // PsiInternalUseCase.g:883:4: (otherlv_0= 'optional:' | (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' ) )
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
                            // PsiInternalUseCase.g:884:5: otherlv_0= 'optional:'
                            {

                            					markLeaf(elementTypeProvider.getOptionalInputs_OptionalKeyword_0_0_0ElementType());
                            				
                            otherlv_0=(Token)match(input,42,FOLLOW_26); 

                            					doneLeaf(otherlv_0);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:892:5: (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' )
                            {
                            // PsiInternalUseCase.g:892:5: (otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':' )
                            // PsiInternalUseCase.g:893:6: otherlv_1= 'optional' otherlv_2= 'inputs' otherlv_3= ':'
                            {

                            						markLeaf(elementTypeProvider.getOptionalInputs_OptionalKeyword_0_0_1_0ElementType());
                            					
                            otherlv_1=(Token)match(input,43,FOLLOW_35); 

                            						doneLeaf(otherlv_1);
                            					

                            						markLeaf(elementTypeProvider.getOptionalInputs_InputsKeyword_0_0_1_1ElementType());
                            					
                            otherlv_2=(Token)match(input,44,FOLLOW_33); 

                            						doneLeaf(otherlv_2);
                            					

                            						markLeaf(elementTypeProvider.getOptionalInputs_ColonKeyword_0_0_1_2ElementType());
                            					
                            otherlv_3=(Token)match(input,39,FOLLOW_26); 

                            						doneLeaf(otherlv_3);
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:917:4: ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' )
                    {
                    // PsiInternalUseCase.g:917:4: ( ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':' )
                    // PsiInternalUseCase.g:918:5: ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' ) otherlv_7= ':'
                    {
                    // PsiInternalUseCase.g:918:5: ( (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' ) | otherlv_6= 'Optional' )
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
                            // PsiInternalUseCase.g:919:6: (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' )
                            {
                            // PsiInternalUseCase.g:919:6: (otherlv_4= 'Optionale' otherlv_5= 'Zutaten' )
                            // PsiInternalUseCase.g:920:7: otherlv_4= 'Optionale' otherlv_5= 'Zutaten'
                            {

                            							markLeaf(elementTypeProvider.getOptionalInputs_OptionaleKeyword_0_1_0_0_0ElementType());
                            						
                            otherlv_4=(Token)match(input,45,FOLLOW_34); 

                            							doneLeaf(otherlv_4);
                            						

                            							markLeaf(elementTypeProvider.getOptionalInputs_ZutatenKeyword_0_1_0_0_1ElementType());
                            						
                            otherlv_5=(Token)match(input,41,FOLLOW_33); 

                            							doneLeaf(otherlv_5);
                            						

                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:936:6: otherlv_6= 'Optional'
                            {

                            						markLeaf(elementTypeProvider.getOptionalInputs_OptionalKeyword_0_1_0_1ElementType());
                            					
                            otherlv_6=(Token)match(input,46,FOLLOW_33); 

                            						doneLeaf(otherlv_6);
                            					

                            }
                            break;

                    }


                    					markLeaf(elementTypeProvider.getOptionalInputs_ColonKeyword_0_1_1ElementType());
                    				
                    otherlv_7=(Token)match(input,39,FOLLOW_26); 

                    					doneLeaf(otherlv_7);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:953:3: ( (lv_inputs_8_0= ruleInput ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=30 && LA31_0<=31)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // PsiInternalUseCase.g:954:4: (lv_inputs_8_0= ruleInput )
            	    {
            	    // PsiInternalUseCase.g:954:4: (lv_inputs_8_0= ruleInput )
            	    // PsiInternalUseCase.g:955:5: lv_inputs_8_0= ruleInput
            	    {

            	    					markComposite(elementTypeProvider.getOptionalInputs_InputsInputParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_inputs_8_0=ruleInput();

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
            	    break loop31;
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
    // $ANTLR end "ruleOptionalInputs"


    // $ANTLR start "entryRuleInput"
    // PsiInternalUseCase.g:972:1: entryRuleInput returns [Boolean current=false] : iv_ruleInput= ruleInput EOF ;
    public final Boolean entryRuleInput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInput = null;


        try {
            // PsiInternalUseCase.g:972:47: (iv_ruleInput= ruleInput EOF )
            // PsiInternalUseCase.g:973:2: iv_ruleInput= ruleInput EOF
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
    // PsiInternalUseCase.g:979:1: ruleInput returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? ) ;
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
            // PsiInternalUseCase.g:980:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? ) )
            // PsiInternalUseCase.g:981:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? )
            {
            // PsiInternalUseCase.g:981:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? )
            // PsiInternalUseCase.g:982:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )?
            {
            // PsiInternalUseCase.g:982:3: ( (lv_many_0_0= 'many' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // PsiInternalUseCase.g:983:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:983:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:984:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getInput_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,30,FOLLOW_28); 

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
            		
            otherlv_1=(Token)match(input,31,FOLLOW_36); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:1006:3: ( (lv_optional_2_0= ruleOptional ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // PsiInternalUseCase.g:1007:4: (lv_optional_2_0= ruleOptional )
                    {
                    // PsiInternalUseCase.g:1007:4: (lv_optional_2_0= ruleOptional )
                    // PsiInternalUseCase.g:1008:5: lv_optional_2_0= ruleOptional
                    {

                    					markComposite(elementTypeProvider.getInput_OptionalOptionalParserRuleCall_2_0ElementType());
                    				
                    pushFollow(FOLLOW_12);
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

            // PsiInternalUseCase.g:1021:3: ( (lv_content_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1022:4: (lv_content_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1022:4: (lv_content_3_0= RULE_STRING )
            // PsiInternalUseCase.g:1023:5: lv_content_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getInput_ContentSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_content_3_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_3_0);
            				

            }


            }

            // PsiInternalUseCase.g:1038:3: ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32||LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // PsiInternalUseCase.g:1039:4: (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) )
                    {
                    // PsiInternalUseCase.g:1039:4: (otherlv_4= 'as' | otherlv_5= 'als' )
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
                            // PsiInternalUseCase.g:1040:5: otherlv_4= 'as'
                            {

                            					markLeaf(elementTypeProvider.getInput_AsKeyword_4_0_0ElementType());
                            				
                            otherlv_4=(Token)match(input,32,FOLLOW_3); 

                            					doneLeaf(otherlv_4);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1048:5: otherlv_5= 'als'
                            {

                            					markLeaf(elementTypeProvider.getInput_AlsKeyword_4_0_1ElementType());
                            				
                            otherlv_5=(Token)match(input,47,FOLLOW_3); 

                            					doneLeaf(otherlv_5);
                            				

                            }
                            break;

                    }

                    // PsiInternalUseCase.g:1056:4: ( (otherlv_6= RULE_ID ) )
                    // PsiInternalUseCase.g:1057:5: (otherlv_6= RULE_ID )
                    {
                    // PsiInternalUseCase.g:1057:5: (otherlv_6= RULE_ID )
                    // PsiInternalUseCase.g:1058:6: otherlv_6= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getInput_TypeTypeCrossReference_4_1_0ElementType());
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						doneLeaf(otherlv_6);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1074:3: (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // PsiInternalUseCase.g:1075:4: otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')'
                    {

                    				markLeaf(elementTypeProvider.getInput_LeftParenthesisKeyword_5_0ElementType());
                    			
                    otherlv_7=(Token)match(input,48,FOLLOW_39); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalUseCase.g:1082:4: (otherlv_8= 'e.g' | otherlv_9= 'z.B.' )
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
                            // PsiInternalUseCase.g:1083:5: otherlv_8= 'e.g'
                            {

                            					markLeaf(elementTypeProvider.getInput_EGKeyword_5_1_0ElementType());
                            				
                            otherlv_8=(Token)match(input,49,FOLLOW_12); 

                            					doneLeaf(otherlv_8);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1091:5: otherlv_9= 'z.B.'
                            {

                            					markLeaf(elementTypeProvider.getInput_ZBKeyword_5_1_1ElementType());
                            				
                            otherlv_9=(Token)match(input,50,FOLLOW_12); 

                            					doneLeaf(otherlv_9);
                            				

                            }
                            break;

                    }

                    // PsiInternalUseCase.g:1099:4: ( (lv_example_10_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:1100:5: (lv_example_10_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:1100:5: (lv_example_10_0= RULE_STRING )
                    // PsiInternalUseCase.g:1101:6: lv_example_10_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getInput_ExampleSTRINGTerminalRuleCall_5_2_0ElementType());
                    					
                    lv_example_10_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_example_10_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getInput_RightParenthesisKeyword_5_3ElementType());
                    			
                    otherlv_11=(Token)match(input,51,FOLLOW_2); 

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
    // PsiInternalUseCase.g:1128:1: entryRuleOutputs returns [Boolean current=false] : iv_ruleOutputs= ruleOutputs EOF ;
    public final Boolean entryRuleOutputs() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOutputs = null;


        try {
            // PsiInternalUseCase.g:1128:49: (iv_ruleOutputs= ruleOutputs EOF )
            // PsiInternalUseCase.g:1129:2: iv_ruleOutputs= ruleOutputs EOF
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
    // PsiInternalUseCase.g:1135:1: ruleOutputs returns [Boolean current=false] : ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* ) ;
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
            // PsiInternalUseCase.g:1136:1: ( ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* ) )
            // PsiInternalUseCase.g:1137:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* )
            {
            // PsiInternalUseCase.g:1137:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* )
            // PsiInternalUseCase.g:1138:3: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )*
            {
            // PsiInternalUseCase.g:1138:3: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' )
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
                    // PsiInternalUseCase.g:1139:4: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
                    {
                    // PsiInternalUseCase.g:1139:4: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
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
                            // PsiInternalUseCase.g:1140:5: otherlv_0= 'produces:'
                            {

                            					markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_0_0ElementType());
                            				
                            otherlv_0=(Token)match(input,52,FOLLOW_26); 

                            					doneLeaf(otherlv_0);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1148:5: otherlv_1= 'produce:'
                            {

                            					markLeaf(elementTypeProvider.getOutputs_ProduceKeyword_0_0_1ElementType());
                            				
                            otherlv_1=(Token)match(input,53,FOLLOW_26); 

                            					doneLeaf(otherlv_1);
                            				

                            }
                            break;
                        case 3 :
                            // PsiInternalUseCase.g:1156:5: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                            {
                            // PsiInternalUseCase.g:1156:5: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                            // PsiInternalUseCase.g:1157:6: otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':'
                            {

                            						markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_0_2_0ElementType());
                            					
                            otherlv_2=(Token)match(input,54,FOLLOW_30); 

                            						doneLeaf(otherlv_2);
                            					

                            						markLeaf(elementTypeProvider.getOutputs_TheKeyword_0_0_2_1ElementType());
                            					
                            otherlv_3=(Token)match(input,36,FOLLOW_31); 

                            						doneLeaf(otherlv_3);
                            					

                            						markLeaf(elementTypeProvider.getOutputs_FollowingKeyword_0_0_2_2ElementType());
                            					
                            otherlv_4=(Token)match(input,37,FOLLOW_41); 

                            						doneLeaf(otherlv_4);
                            					

                            						markLeaf(elementTypeProvider.getOutputs_OutputKeyword_0_0_2_3ElementType());
                            					
                            otherlv_5=(Token)match(input,55,FOLLOW_33); 

                            						doneLeaf(otherlv_5);
                            					

                            						markLeaf(elementTypeProvider.getOutputs_ColonKeyword_0_0_2_4ElementType());
                            					
                            otherlv_6=(Token)match(input,39,FOLLOW_26); 

                            						doneLeaf(otherlv_6);
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1195:4: otherlv_7= 'Ergebnis:'
                    {

                    				markLeaf(elementTypeProvider.getOutputs_ErgebnisKeyword_0_1ElementType());
                    			
                    otherlv_7=(Token)match(input,56,FOLLOW_26); 

                    				doneLeaf(otherlv_7);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:1203:3: ( (lv_outputs_8_0= ruleOutput ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=30 && LA40_0<=31)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // PsiInternalUseCase.g:1204:4: (lv_outputs_8_0= ruleOutput )
            	    {
            	    // PsiInternalUseCase.g:1204:4: (lv_outputs_8_0= ruleOutput )
            	    // PsiInternalUseCase.g:1205:5: lv_outputs_8_0= ruleOutput
            	    {

            	    					markComposite(elementTypeProvider.getOutputs_OutputsOutputParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_26);
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
            	    break loop40;
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
    // PsiInternalUseCase.g:1222:1: entryRuleOutput returns [Boolean current=false] : iv_ruleOutput= ruleOutput EOF ;
    public final Boolean entryRuleOutput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOutput = null;


        try {
            // PsiInternalUseCase.g:1222:48: (iv_ruleOutput= ruleOutput EOF )
            // PsiInternalUseCase.g:1223:2: iv_ruleOutput= ruleOutput EOF
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
    // PsiInternalUseCase.g:1229:1: ruleOutput returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) ;
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
            // PsiInternalUseCase.g:1230:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) )
            // PsiInternalUseCase.g:1231:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            {
            // PsiInternalUseCase.g:1231:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            // PsiInternalUseCase.g:1232:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            {
            // PsiInternalUseCase.g:1232:3: ( (lv_many_0_0= 'many' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // PsiInternalUseCase.g:1233:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:1233:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:1234:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getOutput_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,30,FOLLOW_28); 

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
            		
            otherlv_1=(Token)match(input,31,FOLLOW_12); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:1256:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1257:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1257:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:1258:5: lv_content_2_0= RULE_STRING
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

            // PsiInternalUseCase.g:1273:3: ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32||LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // PsiInternalUseCase.g:1274:4: (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) )
                    {
                    // PsiInternalUseCase.g:1274:4: (otherlv_3= 'as' | otherlv_4= 'als' )
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
                            // PsiInternalUseCase.g:1275:5: otherlv_3= 'as'
                            {

                            					markLeaf(elementTypeProvider.getOutput_AsKeyword_3_0_0ElementType());
                            				
                            otherlv_3=(Token)match(input,32,FOLLOW_3); 

                            					doneLeaf(otherlv_3);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1283:5: otherlv_4= 'als'
                            {

                            					markLeaf(elementTypeProvider.getOutput_AlsKeyword_3_0_1ElementType());
                            				
                            otherlv_4=(Token)match(input,47,FOLLOW_3); 

                            					doneLeaf(otherlv_4);
                            				

                            }
                            break;

                    }

                    // PsiInternalUseCase.g:1291:4: ( (otherlv_5= RULE_ID ) )
                    // PsiInternalUseCase.g:1292:5: (otherlv_5= RULE_ID )
                    {
                    // PsiInternalUseCase.g:1292:5: (otherlv_5= RULE_ID )
                    // PsiInternalUseCase.g:1293:6: otherlv_5= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getOutput_TypeTypeCrossReference_3_1_0ElementType());
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						doneLeaf(otherlv_5);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1309:3: (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // PsiInternalUseCase.g:1310:4: otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')'
                    {

                    				markLeaf(elementTypeProvider.getOutput_LeftParenthesisKeyword_4_0ElementType());
                    			
                    otherlv_6=(Token)match(input,48,FOLLOW_39); 

                    				doneLeaf(otherlv_6);
                    			
                    // PsiInternalUseCase.g:1317:4: (otherlv_7= 'e.g' | otherlv_8= 'z.B.' )
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
                            // PsiInternalUseCase.g:1318:5: otherlv_7= 'e.g'
                            {

                            					markLeaf(elementTypeProvider.getOutput_EGKeyword_4_1_0ElementType());
                            				
                            otherlv_7=(Token)match(input,49,FOLLOW_12); 

                            					doneLeaf(otherlv_7);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1326:5: otherlv_8= 'z.B.'
                            {

                            					markLeaf(elementTypeProvider.getOutput_ZBKeyword_4_1_1ElementType());
                            				
                            otherlv_8=(Token)match(input,50,FOLLOW_12); 

                            					doneLeaf(otherlv_8);
                            				

                            }
                            break;

                    }

                    // PsiInternalUseCase.g:1334:4: ( (lv_example_9_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:1335:5: (lv_example_9_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:1335:5: (lv_example_9_0= RULE_STRING )
                    // PsiInternalUseCase.g:1336:6: lv_example_9_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getOutput_ExampleSTRINGTerminalRuleCall_4_2_0ElementType());
                    					
                    lv_example_9_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_example_9_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getOutput_RightParenthesisKeyword_4_3ElementType());
                    			
                    otherlv_10=(Token)match(input,51,FOLLOW_2); 

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
    // PsiInternalUseCase.g:1363:1: entryRuleOptional returns [Boolean current=false] : iv_ruleOptional= ruleOptional EOF ;
    public final Boolean entryRuleOptional() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOptional = null;


        try {
            // PsiInternalUseCase.g:1363:50: (iv_ruleOptional= ruleOptional EOF )
            // PsiInternalUseCase.g:1364:2: iv_ruleOptional= ruleOptional EOF
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
    // PsiInternalUseCase.g:1370:1: ruleOptional returns [Boolean current=false] : kw= 'optional' ;
    public final Boolean ruleOptional() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalUseCase.g:1371:1: (kw= 'optional' )
            // PsiInternalUseCase.g:1372:2: kw= 'optional'
            {

            		markLeaf(elementTypeProvider.getOptional_OptionalKeywordElementType());
            	
            kw=(Token)match(input,43,FOLLOW_2); 

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
    // PsiInternalUseCase.g:1382:1: entryRulePreConditions returns [Boolean current=false] : iv_rulePreConditions= rulePreConditions EOF ;
    public final Boolean entryRulePreConditions() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePreConditions = null;


        try {
            // PsiInternalUseCase.g:1382:55: (iv_rulePreConditions= rulePreConditions EOF )
            // PsiInternalUseCase.g:1383:2: iv_rulePreConditions= rulePreConditions EOF
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
    // PsiInternalUseCase.g:1389:1: rulePreConditions returns [Boolean current=false] : ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* ) ;
    public final Boolean rulePreConditions() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Boolean lv_conditions_3_0 = null;


        try {
            // PsiInternalUseCase.g:1390:1: ( ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* ) )
            // PsiInternalUseCase.g:1391:2: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* )
            {
            // PsiInternalUseCase.g:1391:2: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* )
            // PsiInternalUseCase.g:1392:3: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )*
            {
            // PsiInternalUseCase.g:1392:3: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' )
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
                    // PsiInternalUseCase.g:1393:4: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
                    {
                    // PsiInternalUseCase.g:1393:4: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
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
                            // PsiInternalUseCase.g:1394:5: otherlv_0= 'pre-condition:'
                            {

                            					markLeaf(elementTypeProvider.getPreConditions_PreConditionKeyword_0_0_0ElementType());
                            				
                            otherlv_0=(Token)match(input,57,FOLLOW_42); 

                            					doneLeaf(otherlv_0);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1402:5: otherlv_1= 'pre-conditions:'
                            {

                            					markLeaf(elementTypeProvider.getPreConditions_PreConditionsKeyword_0_0_1ElementType());
                            				
                            otherlv_1=(Token)match(input,58,FOLLOW_42); 

                            					doneLeaf(otherlv_1);
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1411:4: otherlv_2= 'Vorbedingungen:'
                    {

                    				markLeaf(elementTypeProvider.getPreConditions_VorbedingungenKeyword_0_1ElementType());
                    			
                    otherlv_2=(Token)match(input,59,FOLLOW_42); 

                    				doneLeaf(otherlv_2);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:1419:3: ( (lv_conditions_3_0= ruleCondition ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==31) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // PsiInternalUseCase.g:1420:4: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // PsiInternalUseCase.g:1420:4: (lv_conditions_3_0= ruleCondition )
            	    // PsiInternalUseCase.g:1421:5: lv_conditions_3_0= ruleCondition
            	    {

            	    					markComposite(elementTypeProvider.getPreConditions_ConditionsConditionParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop48;
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
    // PsiInternalUseCase.g:1438:1: entryRuleCondition returns [Boolean current=false] : iv_ruleCondition= ruleCondition EOF ;
    public final Boolean entryRuleCondition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCondition = null;


        try {
            // PsiInternalUseCase.g:1438:51: (iv_ruleCondition= ruleCondition EOF )
            // PsiInternalUseCase.g:1439:2: iv_ruleCondition= ruleCondition EOF
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
    // PsiInternalUseCase.g:1445:1: ruleCondition returns [Boolean current=false] : (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) ;
    public final Boolean ruleCondition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_content_1_0=null;

        try {
            // PsiInternalUseCase.g:1446:1: ( (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:1447:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:1447:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:1448:3: otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getCondition_HyphenMinusKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:1455:3: ( (lv_content_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1456:4: (lv_content_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1456:4: (lv_content_1_0= RULE_STRING )
            // PsiInternalUseCase.g:1457:5: lv_content_1_0= RULE_STRING
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
    // PsiInternalUseCase.g:1476:1: entryRuleSteps returns [Boolean current=false] : iv_ruleSteps= ruleSteps EOF ;
    public final Boolean entryRuleSteps() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSteps = null;


        try {
            // PsiInternalUseCase.g:1476:47: (iv_ruleSteps= ruleSteps EOF )
            // PsiInternalUseCase.g:1477:2: iv_ruleSteps= ruleSteps EOF
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
    // PsiInternalUseCase.g:1483:1: ruleSteps returns [Boolean current=false] : ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* ) ;
    public final Boolean ruleSteps() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Boolean lv_steps_2_0 = null;


        try {
            // PsiInternalUseCase.g:1484:1: ( ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* ) )
            // PsiInternalUseCase.g:1485:2: ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* )
            {
            // PsiInternalUseCase.g:1485:2: ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* )
            // PsiInternalUseCase.g:1486:3: (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )*
            {
            // PsiInternalUseCase.g:1486:3: (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' )
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
                    // PsiInternalUseCase.g:1487:4: otherlv_0= 'steps:'
                    {

                    				markLeaf(elementTypeProvider.getSteps_StepsKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,60,FOLLOW_43); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1495:4: otherlv_1= 'Schritte:'
                    {

                    				markLeaf(elementTypeProvider.getSteps_SchritteKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,61,FOLLOW_43); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:1503:3: ( (lv_steps_2_0= ruleStep ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_INT) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // PsiInternalUseCase.g:1504:4: (lv_steps_2_0= ruleStep )
            	    {
            	    // PsiInternalUseCase.g:1504:4: (lv_steps_2_0= ruleStep )
            	    // PsiInternalUseCase.g:1505:5: lv_steps_2_0= ruleStep
            	    {

            	    					markComposite(elementTypeProvider.getSteps_StepsStepParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_43);
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
            	    break loop50;
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
    // PsiInternalUseCase.g:1522:1: entryRuleStep returns [Boolean current=false] : iv_ruleStep= ruleStep EOF ;
    public final Boolean entryRuleStep() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStep = null;


        try {
            // PsiInternalUseCase.g:1522:46: (iv_ruleStep= ruleStep EOF )
            // PsiInternalUseCase.g:1523:2: iv_ruleStep= ruleStep EOF
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
    // PsiInternalUseCase.g:1529:1: ruleStep returns [Boolean current=false] : ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) ) ) ;
    public final Boolean ruleStep() throws RecognitionException {
        Boolean current = false;

        Token lv_action_1_0=null;
        Boolean lv_number_0_0 = null;

        Boolean lv_error_2_0 = null;

        Boolean lv_error_3_0 = null;

        Boolean lv_condition_4_0 = null;

        Boolean lv_loop_5_0 = null;

        Boolean lv_exception_6_0 = null;


        try {
            // PsiInternalUseCase.g:1530:1: ( ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) ) ) )
            // PsiInternalUseCase.g:1531:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) ) )
            {
            // PsiInternalUseCase.g:1531:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) ) )
            // PsiInternalUseCase.g:1532:3: ( (lv_number_0_0= ruleQualifiedNumber ) ) ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) )
            {
            // PsiInternalUseCase.g:1532:3: ( (lv_number_0_0= ruleQualifiedNumber ) )
            // PsiInternalUseCase.g:1533:4: (lv_number_0_0= ruleQualifiedNumber )
            {
            // PsiInternalUseCase.g:1533:4: (lv_number_0_0= ruleQualifiedNumber )
            // PsiInternalUseCase.g:1534:5: lv_number_0_0= ruleQualifiedNumber
            {

            					markComposite(elementTypeProvider.getStep_NumberQualifiedNumberParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_44);
            lv_number_0_0=ruleQualifiedNumber();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalUseCase.g:1547:3: ( ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? ) | ( (lv_error_3_0= ruleRaiseErrorConditional ) ) | ( (lv_condition_4_0= ruleIfStatement ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exception_6_0= ruleRaiseErrorNow ) ) )
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
                    // PsiInternalUseCase.g:1548:4: ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? )
                    {
                    // PsiInternalUseCase.g:1548:4: ( ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )? )
                    // PsiInternalUseCase.g:1549:5: ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseErrorConditional ) )?
                    {
                    // PsiInternalUseCase.g:1549:5: ( (lv_action_1_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:1550:6: (lv_action_1_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:1550:6: (lv_action_1_0= RULE_STRING )
                    // PsiInternalUseCase.g:1551:7: lv_action_1_0= RULE_STRING
                    {

                    							markLeaf(elementTypeProvider.getStep_ActionSTRINGTerminalRuleCall_1_0_0_0ElementType());
                    						
                    lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

                    							if(!current) {
                    								associateWithSemanticElement();
                    								current = true;
                    							}
                    						

                    							doneLeaf(lv_action_1_0);
                    						

                    }


                    }

                    // PsiInternalUseCase.g:1566:5: ( (lv_error_2_0= ruleRaiseErrorConditional ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==13||LA51_0==39) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // PsiInternalUseCase.g:1567:6: (lv_error_2_0= ruleRaiseErrorConditional )
                            {
                            // PsiInternalUseCase.g:1567:6: (lv_error_2_0= ruleRaiseErrorConditional )
                            // PsiInternalUseCase.g:1568:7: lv_error_2_0= ruleRaiseErrorConditional
                            {

                            							markComposite(elementTypeProvider.getStep_ErrorRaiseErrorConditionalParserRuleCall_1_0_1_0ElementType());
                            						
                            pushFollow(FOLLOW_2);
                            lv_error_2_0=ruleRaiseErrorConditional();

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
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1583:4: ( (lv_error_3_0= ruleRaiseErrorConditional ) )
                    {
                    // PsiInternalUseCase.g:1583:4: ( (lv_error_3_0= ruleRaiseErrorConditional ) )
                    // PsiInternalUseCase.g:1584:5: (lv_error_3_0= ruleRaiseErrorConditional )
                    {
                    // PsiInternalUseCase.g:1584:5: (lv_error_3_0= ruleRaiseErrorConditional )
                    // PsiInternalUseCase.g:1585:6: lv_error_3_0= ruleRaiseErrorConditional
                    {

                    						markComposite(elementTypeProvider.getStep_ErrorRaiseErrorConditionalParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_error_3_0=ruleRaiseErrorConditional();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalUseCase.g:1599:4: ( (lv_condition_4_0= ruleIfStatement ) )
                    {
                    // PsiInternalUseCase.g:1599:4: ( (lv_condition_4_0= ruleIfStatement ) )
                    // PsiInternalUseCase.g:1600:5: (lv_condition_4_0= ruleIfStatement )
                    {
                    // PsiInternalUseCase.g:1600:5: (lv_condition_4_0= ruleIfStatement )
                    // PsiInternalUseCase.g:1601:6: lv_condition_4_0= ruleIfStatement
                    {

                    						markComposite(elementTypeProvider.getStep_ConditionIfStatementParserRuleCall_1_2_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_4_0=ruleIfStatement();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // PsiInternalUseCase.g:1615:4: ( (lv_loop_5_0= ruleLoop ) )
                    {
                    // PsiInternalUseCase.g:1615:4: ( (lv_loop_5_0= ruleLoop ) )
                    // PsiInternalUseCase.g:1616:5: (lv_loop_5_0= ruleLoop )
                    {
                    // PsiInternalUseCase.g:1616:5: (lv_loop_5_0= ruleLoop )
                    // PsiInternalUseCase.g:1617:6: lv_loop_5_0= ruleLoop
                    {

                    						markComposite(elementTypeProvider.getStep_LoopLoopParserRuleCall_1_3_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_loop_5_0=ruleLoop();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // PsiInternalUseCase.g:1631:4: ( (lv_exception_6_0= ruleRaiseErrorNow ) )
                    {
                    // PsiInternalUseCase.g:1631:4: ( (lv_exception_6_0= ruleRaiseErrorNow ) )
                    // PsiInternalUseCase.g:1632:5: (lv_exception_6_0= ruleRaiseErrorNow )
                    {
                    // PsiInternalUseCase.g:1632:5: (lv_exception_6_0= ruleRaiseErrorNow )
                    // PsiInternalUseCase.g:1633:6: lv_exception_6_0= ruleRaiseErrorNow
                    {

                    						markComposite(elementTypeProvider.getStep_ExceptionRaiseErrorNowParserRuleCall_1_4_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exception_6_0=ruleRaiseErrorNow();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

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


    // $ANTLR start "entryRuleRaiseErrorConditional"
    // PsiInternalUseCase.g:1651:1: entryRuleRaiseErrorConditional returns [Boolean current=false] : iv_ruleRaiseErrorConditional= ruleRaiseErrorConditional EOF ;
    public final Boolean entryRuleRaiseErrorConditional() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRaiseErrorConditional = null;


        try {
            // PsiInternalUseCase.g:1651:63: (iv_ruleRaiseErrorConditional= ruleRaiseErrorConditional EOF )
            // PsiInternalUseCase.g:1652:2: iv_ruleRaiseErrorConditional= ruleRaiseErrorConditional EOF
            {
             markComposite(elementTypeProvider.getRaiseErrorConditionalElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaiseErrorConditional=ruleRaiseErrorConditional();

            state._fsp--;

             current =iv_ruleRaiseErrorConditional; 
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
    // $ANTLR end "entryRuleRaiseErrorConditional"


    // $ANTLR start "ruleRaiseErrorConditional"
    // PsiInternalUseCase.g:1658:1: ruleRaiseErrorConditional returns [Boolean current=false] : ( (otherlv_0= '.' | otherlv_1= ':' ) ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) ) ( (lv_exception_8_0= ruleException ) ) ) ;
    public final Boolean ruleRaiseErrorConditional() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Boolean lv_exception_8_0 = null;


        try {
            // PsiInternalUseCase.g:1659:1: ( ( (otherlv_0= '.' | otherlv_1= ':' ) ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) ) ( (lv_exception_8_0= ruleException ) ) ) )
            // PsiInternalUseCase.g:1660:2: ( (otherlv_0= '.' | otherlv_1= ':' ) ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) ) ( (lv_exception_8_0= ruleException ) ) )
            {
            // PsiInternalUseCase.g:1660:2: ( (otherlv_0= '.' | otherlv_1= ':' ) ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) ) ( (lv_exception_8_0= ruleException ) ) )
            // PsiInternalUseCase.g:1661:3: (otherlv_0= '.' | otherlv_1= ':' ) ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) ) ( (lv_exception_8_0= ruleException ) )
            {
            // PsiInternalUseCase.g:1661:3: (otherlv_0= '.' | otherlv_1= ':' )
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
                    // PsiInternalUseCase.g:1662:4: otherlv_0= '.'
                    {

                    				markLeaf(elementTypeProvider.getRaiseErrorConditional_FullStopKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,13,FOLLOW_46); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1670:4: otherlv_1= ':'
                    {

                    				markLeaf(elementTypeProvider.getRaiseErrorConditional_ColonKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,39,FOLLOW_46); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:1678:3: ( (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) | (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' ) )
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
                    // PsiInternalUseCase.g:1679:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    {
                    // PsiInternalUseCase.g:1679:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    // PsiInternalUseCase.g:1680:5: otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise'
                    {

                    					markLeaf(elementTypeProvider.getRaiseErrorConditional_OnKeyword_1_0_0ElementType());
                    				
                    otherlv_2=(Token)match(input,62,FOLLOW_47); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getRaiseErrorConditional_ErrorKeyword_1_0_1ElementType());
                    				
                    otherlv_3=(Token)match(input,63,FOLLOW_48); 

                    					doneLeaf(otherlv_3);
                    				

                    					markLeaf(elementTypeProvider.getRaiseErrorConditional_RaiseKeyword_1_0_2ElementType());
                    				
                    otherlv_4=(Token)match(input,64,FOLLOW_3); 

                    					doneLeaf(otherlv_4);
                    				

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1703:4: (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' )
                    {
                    // PsiInternalUseCase.g:1703:4: (otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde' )
                    // PsiInternalUseCase.g:1704:5: otherlv_5= 'Bei' otherlv_6= 'Fehler' otherlv_7= 'melde'
                    {

                    					markLeaf(elementTypeProvider.getRaiseErrorConditional_BeiKeyword_1_1_0ElementType());
                    				
                    otherlv_5=(Token)match(input,65,FOLLOW_49); 

                    					doneLeaf(otherlv_5);
                    				

                    					markLeaf(elementTypeProvider.getRaiseErrorConditional_FehlerKeyword_1_1_1ElementType());
                    				
                    otherlv_6=(Token)match(input,66,FOLLOW_50); 

                    					doneLeaf(otherlv_6);
                    				

                    					markLeaf(elementTypeProvider.getRaiseErrorConditional_MeldeKeyword_1_1_2ElementType());
                    				
                    otherlv_7=(Token)match(input,67,FOLLOW_3); 

                    					doneLeaf(otherlv_7);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1727:3: ( (lv_exception_8_0= ruleException ) )
            // PsiInternalUseCase.g:1728:4: (lv_exception_8_0= ruleException )
            {
            // PsiInternalUseCase.g:1728:4: (lv_exception_8_0= ruleException )
            // PsiInternalUseCase.g:1729:5: lv_exception_8_0= ruleException
            {

            					markComposite(elementTypeProvider.getRaiseErrorConditional_ExceptionExceptionParserRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_2);
            lv_exception_8_0=ruleException();

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
    // $ANTLR end "ruleRaiseErrorConditional"


    // $ANTLR start "entryRuleRaiseErrorNow"
    // PsiInternalUseCase.g:1746:1: entryRuleRaiseErrorNow returns [Boolean current=false] : iv_ruleRaiseErrorNow= ruleRaiseErrorNow EOF ;
    public final Boolean entryRuleRaiseErrorNow() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRaiseErrorNow = null;


        try {
            // PsiInternalUseCase.g:1746:55: (iv_ruleRaiseErrorNow= ruleRaiseErrorNow EOF )
            // PsiInternalUseCase.g:1747:2: iv_ruleRaiseErrorNow= ruleRaiseErrorNow EOF
            {
             markComposite(elementTypeProvider.getRaiseErrorNowElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaiseErrorNow=ruleRaiseErrorNow();

            state._fsp--;

             current =iv_ruleRaiseErrorNow; 
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
    // $ANTLR end "entryRuleRaiseErrorNow"


    // $ANTLR start "ruleRaiseErrorNow"
    // PsiInternalUseCase.g:1753:1: ruleRaiseErrorNow returns [Boolean current=false] : ( ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) ) ( (lv_exception_4_0= ruleException ) ) ) ;
    public final Boolean ruleRaiseErrorNow() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Boolean lv_exception_4_0 = null;


        try {
            // PsiInternalUseCase.g:1754:1: ( ( ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) ) ( (lv_exception_4_0= ruleException ) ) ) )
            // PsiInternalUseCase.g:1755:2: ( ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) ) ( (lv_exception_4_0= ruleException ) ) )
            {
            // PsiInternalUseCase.g:1755:2: ( ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) ) ( (lv_exception_4_0= ruleException ) ) )
            // PsiInternalUseCase.g:1756:3: ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) ) ( (lv_exception_4_0= ruleException ) )
            {
            // PsiInternalUseCase.g:1756:3: ( (otherlv_0= 'Raise' (otherlv_1= 'error' )? ) | (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? ) )
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
                    // PsiInternalUseCase.g:1757:4: (otherlv_0= 'Raise' (otherlv_1= 'error' )? )
                    {
                    // PsiInternalUseCase.g:1757:4: (otherlv_0= 'Raise' (otherlv_1= 'error' )? )
                    // PsiInternalUseCase.g:1758:5: otherlv_0= 'Raise' (otherlv_1= 'error' )?
                    {

                    					markLeaf(elementTypeProvider.getRaiseErrorNow_RaiseKeyword_0_0_0ElementType());
                    				
                    otherlv_0=(Token)match(input,68,FOLLOW_51); 

                    					doneLeaf(otherlv_0);
                    				
                    // PsiInternalUseCase.g:1765:5: (otherlv_1= 'error' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==63) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // PsiInternalUseCase.g:1766:6: otherlv_1= 'error'
                            {

                            						markLeaf(elementTypeProvider.getRaiseErrorNow_ErrorKeyword_0_0_1ElementType());
                            					
                            otherlv_1=(Token)match(input,63,FOLLOW_3); 

                            						doneLeaf(otherlv_1);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1776:4: (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? )
                    {
                    // PsiInternalUseCase.g:1776:4: (otherlv_2= 'Melde' (otherlv_3= 'Fehler' )? )
                    // PsiInternalUseCase.g:1777:5: otherlv_2= 'Melde' (otherlv_3= 'Fehler' )?
                    {

                    					markLeaf(elementTypeProvider.getRaiseErrorNow_MeldeKeyword_0_1_0ElementType());
                    				
                    otherlv_2=(Token)match(input,69,FOLLOW_52); 

                    					doneLeaf(otherlv_2);
                    				
                    // PsiInternalUseCase.g:1784:5: (otherlv_3= 'Fehler' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==66) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // PsiInternalUseCase.g:1785:6: otherlv_3= 'Fehler'
                            {

                            						markLeaf(elementTypeProvider.getRaiseErrorNow_FehlerKeyword_0_1_1ElementType());
                            					
                            otherlv_3=(Token)match(input,66,FOLLOW_3); 

                            						doneLeaf(otherlv_3);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1795:3: ( (lv_exception_4_0= ruleException ) )
            // PsiInternalUseCase.g:1796:4: (lv_exception_4_0= ruleException )
            {
            // PsiInternalUseCase.g:1796:4: (lv_exception_4_0= ruleException )
            // PsiInternalUseCase.g:1797:5: lv_exception_4_0= ruleException
            {

            					markComposite(elementTypeProvider.getRaiseErrorNow_ExceptionExceptionParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_2);
            lv_exception_4_0=ruleException();

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
    // $ANTLR end "ruleRaiseErrorNow"


    // $ANTLR start "entryRuleIfStatement"
    // PsiInternalUseCase.g:1814:1: entryRuleIfStatement returns [Boolean current=false] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final Boolean entryRuleIfStatement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIfStatement = null;


        try {
            // PsiInternalUseCase.g:1814:53: (iv_ruleIfStatement= ruleIfStatement EOF )
            // PsiInternalUseCase.g:1815:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             markComposite(elementTypeProvider.getIfStatementElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // PsiInternalUseCase.g:1821:1: ruleIfStatement returns [Boolean current=false] : ( (otherlv_0= 'If' | otherlv_1= 'Falls' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' ) ;
    public final Boolean ruleIfStatement() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_condition_2_0 = null;


        try {
            // PsiInternalUseCase.g:1822:1: ( ( (otherlv_0= 'If' | otherlv_1= 'Falls' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' ) )
            // PsiInternalUseCase.g:1823:2: ( (otherlv_0= 'If' | otherlv_1= 'Falls' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' )
            {
            // PsiInternalUseCase.g:1823:2: ( (otherlv_0= 'If' | otherlv_1= 'Falls' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' )
            // PsiInternalUseCase.g:1824:3: (otherlv_0= 'If' | otherlv_1= 'Falls' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':'
            {
            // PsiInternalUseCase.g:1824:3: (otherlv_0= 'If' | otherlv_1= 'Falls' )
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
                    // PsiInternalUseCase.g:1825:4: otherlv_0= 'If'
                    {

                    				markLeaf(elementTypeProvider.getIfStatement_IfKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,70,FOLLOW_12); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1833:4: otherlv_1= 'Falls'
                    {

                    				markLeaf(elementTypeProvider.getIfStatement_FallsKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,71,FOLLOW_12); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:1841:3: ( (lv_condition_2_0= ruleBooleanCondition ) )
            // PsiInternalUseCase.g:1842:4: (lv_condition_2_0= ruleBooleanCondition )
            {
            // PsiInternalUseCase.g:1842:4: (lv_condition_2_0= ruleBooleanCondition )
            // PsiInternalUseCase.g:1843:5: lv_condition_2_0= ruleBooleanCondition
            {

            					markComposite(elementTypeProvider.getIfStatement_ConditionBooleanConditionParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_33);
            lv_condition_2_0=ruleBooleanCondition();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getIfStatement_ColonKeyword_2ElementType());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			doneLeaf(otherlv_3);
            		

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleLoop"
    // PsiInternalUseCase.g:1867:1: entryRuleLoop returns [Boolean current=false] : iv_ruleLoop= ruleLoop EOF ;
    public final Boolean entryRuleLoop() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleLoop = null;


        try {
            // PsiInternalUseCase.g:1867:46: (iv_ruleLoop= ruleLoop EOF )
            // PsiInternalUseCase.g:1868:2: iv_ruleLoop= ruleLoop EOF
            {
             markComposite(elementTypeProvider.getLoopElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // PsiInternalUseCase.g:1874:1: ruleLoop returns [Boolean current=false] : ( (otherlv_0= 'Solange' | otherlv_1= 'While' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' ) ;
    public final Boolean ruleLoop() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_condition_2_0 = null;


        try {
            // PsiInternalUseCase.g:1875:1: ( ( (otherlv_0= 'Solange' | otherlv_1= 'While' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' ) )
            // PsiInternalUseCase.g:1876:2: ( (otherlv_0= 'Solange' | otherlv_1= 'While' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' )
            {
            // PsiInternalUseCase.g:1876:2: ( (otherlv_0= 'Solange' | otherlv_1= 'While' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':' )
            // PsiInternalUseCase.g:1877:3: (otherlv_0= 'Solange' | otherlv_1= 'While' ) ( (lv_condition_2_0= ruleBooleanCondition ) ) otherlv_3= ':'
            {
            // PsiInternalUseCase.g:1877:3: (otherlv_0= 'Solange' | otherlv_1= 'While' )
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
                    // PsiInternalUseCase.g:1878:4: otherlv_0= 'Solange'
                    {

                    				markLeaf(elementTypeProvider.getLoop_SolangeKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,72,FOLLOW_12); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1886:4: otherlv_1= 'While'
                    {

                    				markLeaf(elementTypeProvider.getLoop_WhileKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,73,FOLLOW_12); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:1894:3: ( (lv_condition_2_0= ruleBooleanCondition ) )
            // PsiInternalUseCase.g:1895:4: (lv_condition_2_0= ruleBooleanCondition )
            {
            // PsiInternalUseCase.g:1895:4: (lv_condition_2_0= ruleBooleanCondition )
            // PsiInternalUseCase.g:1896:5: lv_condition_2_0= ruleBooleanCondition
            {

            					markComposite(elementTypeProvider.getLoop_ConditionBooleanConditionParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_33);
            lv_condition_2_0=ruleBooleanCondition();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getLoop_ColonKeyword_2ElementType());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			doneLeaf(otherlv_3);
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBooleanCondition"
    // PsiInternalUseCase.g:1920:1: entryRuleBooleanCondition returns [Boolean current=false] : iv_ruleBooleanCondition= ruleBooleanCondition EOF ;
    public final Boolean entryRuleBooleanCondition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleBooleanCondition = null;


        try {
            // PsiInternalUseCase.g:1920:58: (iv_ruleBooleanCondition= ruleBooleanCondition EOF )
            // PsiInternalUseCase.g:1921:2: iv_ruleBooleanCondition= ruleBooleanCondition EOF
            {
             markComposite(elementTypeProvider.getBooleanConditionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanCondition=ruleBooleanCondition();

            state._fsp--;

             current =iv_ruleBooleanCondition; 
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
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // PsiInternalUseCase.g:1927:1: ruleBooleanCondition returns [Boolean current=false] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final Boolean ruleBooleanCondition() throws RecognitionException {
        Boolean current = false;

        Token lv_name_0_0=null;

        try {
            // PsiInternalUseCase.g:1928:1: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:1929:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:1929:2: ( (lv_name_0_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1930:3: (lv_name_0_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1930:3: (lv_name_0_0= RULE_STRING )
            // PsiInternalUseCase.g:1931:4: lv_name_0_0= RULE_STRING
            {

            				markLeaf(elementTypeProvider.getBooleanCondition_NameSTRINGTerminalRuleCall_0ElementType());
            			
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
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleNotes"
    // PsiInternalUseCase.g:1949:1: entryRuleNotes returns [Boolean current=false] : iv_ruleNotes= ruleNotes EOF ;
    public final Boolean entryRuleNotes() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleNotes = null;


        try {
            // PsiInternalUseCase.g:1949:47: (iv_ruleNotes= ruleNotes EOF )
            // PsiInternalUseCase.g:1950:2: iv_ruleNotes= ruleNotes EOF
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
    // PsiInternalUseCase.g:1956:1: ruleNotes returns [Boolean current=false] : ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) ) ;
    public final Boolean ruleNotes() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;

        try {
            // PsiInternalUseCase.g:1957:1: ( ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:1958:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:1958:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:1959:3: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:1959:3: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) )
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
                    // PsiInternalUseCase.g:1960:4: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
                    {
                    // PsiInternalUseCase.g:1960:4: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
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
                            // PsiInternalUseCase.g:1961:5: otherlv_0= 'notes:'
                            {

                            					markLeaf(elementTypeProvider.getNotes_NotesKeyword_0_0_0ElementType());
                            				
                            otherlv_0=(Token)match(input,74,FOLLOW_12); 

                            					doneLeaf(otherlv_0);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1969:5: otherlv_1= 'note:'
                            {

                            					markLeaf(elementTypeProvider.getNotes_NoteKeyword_0_0_1ElementType());
                            				
                            otherlv_1=(Token)match(input,75,FOLLOW_12); 

                            					doneLeaf(otherlv_1);
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:1978:4: (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' )
                    {
                    // PsiInternalUseCase.g:1978:4: (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' )
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
                            // PsiInternalUseCase.g:1979:5: otherlv_2= 'Anmerkungen:'
                            {

                            					markLeaf(elementTypeProvider.getNotes_AnmerkungenKeyword_0_1_0ElementType());
                            				
                            otherlv_2=(Token)match(input,76,FOLLOW_12); 

                            					doneLeaf(otherlv_2);
                            				

                            }
                            break;
                        case 2 :
                            // PsiInternalUseCase.g:1987:5: otherlv_3= 'Anmerkung:'
                            {

                            					markLeaf(elementTypeProvider.getNotes_AnmerkungKeyword_0_1_1ElementType());
                            				
                            otherlv_3=(Token)match(input,77,FOLLOW_12); 

                            					doneLeaf(otherlv_3);
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1996:3: ( (lv_content_4_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1997:4: (lv_content_4_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1997:4: (lv_content_4_0= RULE_STRING )
            // PsiInternalUseCase.g:1998:5: lv_content_4_0= RULE_STRING
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
    // PsiInternalUseCase.g:2017:1: entryRuleUsedTypes returns [Boolean current=false] : iv_ruleUsedTypes= ruleUsedTypes EOF ;
    public final Boolean entryRuleUsedTypes() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUsedTypes = null;


        try {
            // PsiInternalUseCase.g:2017:51: (iv_ruleUsedTypes= ruleUsedTypes EOF )
            // PsiInternalUseCase.g:2018:2: iv_ruleUsedTypes= ruleUsedTypes EOF
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
    // PsiInternalUseCase.g:2024:1: ruleUsedTypes returns [Boolean current=false] : ( ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) ) ( (lv_types_4_0= ruleType ) )* ) ;
    public final Boolean ruleUsedTypes() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Boolean lv_types_4_0 = null;


        try {
            // PsiInternalUseCase.g:2025:1: ( ( ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) ) ( (lv_types_4_0= ruleType ) )* ) )
            // PsiInternalUseCase.g:2026:2: ( ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) ) ( (lv_types_4_0= ruleType ) )* )
            {
            // PsiInternalUseCase.g:2026:2: ( ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) ) ( (lv_types_4_0= ruleType ) )* )
            // PsiInternalUseCase.g:2027:3: ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) ) ( (lv_types_4_0= ruleType ) )*
            {
            // PsiInternalUseCase.g:2027:3: ( (otherlv_0= 'used' otherlv_1= 'building-blocks:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' ) )
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
                    // PsiInternalUseCase.g:2028:4: (otherlv_0= 'used' otherlv_1= 'building-blocks:' )
                    {
                    // PsiInternalUseCase.g:2028:4: (otherlv_0= 'used' otherlv_1= 'building-blocks:' )
                    // PsiInternalUseCase.g:2029:5: otherlv_0= 'used' otherlv_1= 'building-blocks:'
                    {

                    					markLeaf(elementTypeProvider.getUsedTypes_UsedKeyword_0_0_0ElementType());
                    				
                    otherlv_0=(Token)match(input,78,FOLLOW_53); 

                    					doneLeaf(otherlv_0);
                    				

                    					markLeaf(elementTypeProvider.getUsedTypes_BuildingBlocksKeyword_0_0_1ElementType());
                    				
                    otherlv_1=(Token)match(input,79,FOLLOW_42); 

                    					doneLeaf(otherlv_1);
                    				

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:2045:4: (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' )
                    {
                    // PsiInternalUseCase.g:2045:4: (otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:' )
                    // PsiInternalUseCase.g:2046:5: otherlv_2= 'Genutzte' otherlv_3= 'Bausteine:'
                    {

                    					markLeaf(elementTypeProvider.getUsedTypes_GenutzteKeyword_0_1_0ElementType());
                    				
                    otherlv_2=(Token)match(input,80,FOLLOW_54); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getUsedTypes_BausteineKeyword_0_1_1ElementType());
                    				
                    otherlv_3=(Token)match(input,81,FOLLOW_42); 

                    					doneLeaf(otherlv_3);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:2062:3: ( (lv_types_4_0= ruleType ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==31) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // PsiInternalUseCase.g:2063:4: (lv_types_4_0= ruleType )
            	    {
            	    // PsiInternalUseCase.g:2063:4: (lv_types_4_0= ruleType )
            	    // PsiInternalUseCase.g:2064:5: lv_types_4_0= ruleType
            	    {

            	    					markComposite(elementTypeProvider.getUsedTypes_TypesTypeParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop64;
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
    // PsiInternalUseCase.g:2081:1: entryRuleType returns [Boolean current=false] : iv_ruleType= ruleType EOF ;
    public final Boolean entryRuleType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleType = null;


        try {
            // PsiInternalUseCase.g:2081:46: (iv_ruleType= ruleType EOF )
            // PsiInternalUseCase.g:2082:2: iv_ruleType= ruleType EOF
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
    // PsiInternalUseCase.g:2088:1: ruleType returns [Boolean current=false] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // PsiInternalUseCase.g:2089:1: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // PsiInternalUseCase.g:2090:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // PsiInternalUseCase.g:2090:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // PsiInternalUseCase.g:2091:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {

            			markLeaf(elementTypeProvider.getType_HyphenMinusKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:2098:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:2099:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:2099:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:2100:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getType_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalUseCase.g:2115:3: (otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==48) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // PsiInternalUseCase.g:2116:4: otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {

                    				markLeaf(elementTypeProvider.getType_LeftParenthesisKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,48,FOLLOW_12); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalUseCase.g:2123:4: ( (lv_description_3_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:2124:5: (lv_description_3_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:2124:5: (lv_description_3_0= RULE_STRING )
                    // PsiInternalUseCase.g:2125:6: lv_description_3_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getType_DescriptionSTRINGTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_description_3_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getType_RightParenthesisKeyword_2_2ElementType());
                    			
                    otherlv_4=(Token)match(input,51,FOLLOW_56); 

                    				doneLeaf(otherlv_4);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:2148:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==82) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // PsiInternalUseCase.g:2149:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {

                    				markLeaf(elementTypeProvider.getType_LeftSquareBracketKeyword_3_0ElementType());
                    			
                    otherlv_5=(Token)match(input,82,FOLLOW_3); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalUseCase.g:2156:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // PsiInternalUseCase.g:2157:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // PsiInternalUseCase.g:2157:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // PsiInternalUseCase.g:2158:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						markComposite(elementTypeProvider.getType_ImportInfoQualifiedNameParserRuleCall_3_1_0ElementType());
                    					
                    pushFollow(FOLLOW_57);
                    lv_importInfo_6_0=ruleQualifiedName();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getType_RightSquareBracketKeyword_3_2ElementType());
                    			
                    otherlv_7=(Token)match(input,83,FOLLOW_2); 

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
    // PsiInternalUseCase.g:2183:1: entryRuleUsedExceptions returns [Boolean current=false] : iv_ruleUsedExceptions= ruleUsedExceptions EOF ;
    public final Boolean entryRuleUsedExceptions() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUsedExceptions = null;


        try {
            // PsiInternalUseCase.g:2183:56: (iv_ruleUsedExceptions= ruleUsedExceptions EOF )
            // PsiInternalUseCase.g:2184:2: iv_ruleUsedExceptions= ruleUsedExceptions EOF
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
    // PsiInternalUseCase.g:2190:1: ruleUsedExceptions returns [Boolean current=false] : ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* ) ;
    public final Boolean ruleUsedExceptions() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Boolean lv_exceptions_4_0 = null;


        try {
            // PsiInternalUseCase.g:2191:1: ( ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* ) )
            // PsiInternalUseCase.g:2192:2: ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* )
            {
            // PsiInternalUseCase.g:2192:2: ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* )
            // PsiInternalUseCase.g:2193:3: ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )*
            {
            // PsiInternalUseCase.g:2193:3: ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) )
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
                    // PsiInternalUseCase.g:2194:4: (otherlv_0= 'used' otherlv_1= 'errors:' )
                    {
                    // PsiInternalUseCase.g:2194:4: (otherlv_0= 'used' otherlv_1= 'errors:' )
                    // PsiInternalUseCase.g:2195:5: otherlv_0= 'used' otherlv_1= 'errors:'
                    {

                    					markLeaf(elementTypeProvider.getUsedExceptions_UsedKeyword_0_0_0ElementType());
                    				
                    otherlv_0=(Token)match(input,78,FOLLOW_58); 

                    					doneLeaf(otherlv_0);
                    				

                    					markLeaf(elementTypeProvider.getUsedExceptions_ErrorsKeyword_0_0_1ElementType());
                    				
                    otherlv_1=(Token)match(input,84,FOLLOW_42); 

                    					doneLeaf(otherlv_1);
                    				

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:2211:4: (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' )
                    {
                    // PsiInternalUseCase.g:2211:4: (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' )
                    // PsiInternalUseCase.g:2212:5: otherlv_2= 'Genutzte' otherlv_3= 'Fehler:'
                    {

                    					markLeaf(elementTypeProvider.getUsedExceptions_GenutzteKeyword_0_1_0ElementType());
                    				
                    otherlv_2=(Token)match(input,80,FOLLOW_59); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getUsedExceptions_FehlerKeyword_0_1_1ElementType());
                    				
                    otherlv_3=(Token)match(input,85,FOLLOW_42); 

                    					doneLeaf(otherlv_3);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:2228:3: ( (lv_exceptions_4_0= ruleExceptionDecleration ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==31) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // PsiInternalUseCase.g:2229:4: (lv_exceptions_4_0= ruleExceptionDecleration )
            	    {
            	    // PsiInternalUseCase.g:2229:4: (lv_exceptions_4_0= ruleExceptionDecleration )
            	    // PsiInternalUseCase.g:2230:5: lv_exceptions_4_0= ruleExceptionDecleration
            	    {

            	    					markComposite(elementTypeProvider.getUsedExceptions_ExceptionsExceptionDeclerationParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop68;
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
    // PsiInternalUseCase.g:2247:1: entryRuleException returns [Boolean current=false] : iv_ruleException= ruleException EOF ;
    public final Boolean entryRuleException() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleException = null;


        try {
            // PsiInternalUseCase.g:2247:51: (iv_ruleException= ruleException EOF )
            // PsiInternalUseCase.g:2248:2: iv_ruleException= ruleException EOF
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
    // PsiInternalUseCase.g:2254:1: ruleException returns [Boolean current=false] : ( (otherlv_0= RULE_ID ) ) ;
    public final Boolean ruleException() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;

        try {
            // PsiInternalUseCase.g:2255:1: ( ( (otherlv_0= RULE_ID ) ) )
            // PsiInternalUseCase.g:2256:2: ( (otherlv_0= RULE_ID ) )
            {
            // PsiInternalUseCase.g:2256:2: ( (otherlv_0= RULE_ID ) )
            // PsiInternalUseCase.g:2257:3: (otherlv_0= RULE_ID )
            {
            // PsiInternalUseCase.g:2257:3: (otherlv_0= RULE_ID )
            // PsiInternalUseCase.g:2258:4: otherlv_0= RULE_ID
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
    // PsiInternalUseCase.g:2276:1: entryRuleExceptionDecleration returns [Boolean current=false] : iv_ruleExceptionDecleration= ruleExceptionDecleration EOF ;
    public final Boolean entryRuleExceptionDecleration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleExceptionDecleration = null;


        try {
            // PsiInternalUseCase.g:2276:62: (iv_ruleExceptionDecleration= ruleExceptionDecleration EOF )
            // PsiInternalUseCase.g:2277:2: iv_ruleExceptionDecleration= ruleExceptionDecleration EOF
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
    // PsiInternalUseCase.g:2283:1: ruleExceptionDecleration returns [Boolean current=false] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // PsiInternalUseCase.g:2284:1: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // PsiInternalUseCase.g:2285:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // PsiInternalUseCase.g:2285:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // PsiInternalUseCase.g:2286:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )? (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {

            			markLeaf(elementTypeProvider.getExceptionDecleration_HyphenMinusKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:2293:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:2294:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:2294:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:2295:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getExceptionDecleration_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalUseCase.g:2310:3: (otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==48) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // PsiInternalUseCase.g:2311:4: otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {

                    				markLeaf(elementTypeProvider.getExceptionDecleration_LeftParenthesisKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,48,FOLLOW_12); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalUseCase.g:2318:4: ( (lv_message_3_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:2319:5: (lv_message_3_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:2319:5: (lv_message_3_0= RULE_STRING )
                    // PsiInternalUseCase.g:2320:6: lv_message_3_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getExceptionDecleration_MessageSTRINGTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_message_3_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getExceptionDecleration_RightParenthesisKeyword_2_2ElementType());
                    			
                    otherlv_4=(Token)match(input,51,FOLLOW_56); 

                    				doneLeaf(otherlv_4);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:2343:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==82) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // PsiInternalUseCase.g:2344:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {

                    				markLeaf(elementTypeProvider.getExceptionDecleration_LeftSquareBracketKeyword_3_0ElementType());
                    			
                    otherlv_5=(Token)match(input,82,FOLLOW_3); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalUseCase.g:2351:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // PsiInternalUseCase.g:2352:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // PsiInternalUseCase.g:2352:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // PsiInternalUseCase.g:2353:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						markComposite(elementTypeProvider.getExceptionDecleration_ImportInfoQualifiedNameParserRuleCall_3_1_0ElementType());
                    					
                    pushFollow(FOLLOW_57);
                    lv_importInfo_6_0=ruleQualifiedName();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getExceptionDecleration_RightSquareBracketKeyword_3_2ElementType());
                    			
                    otherlv_7=(Token)match(input,83,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExample"
    // PsiInternalUseCase.g:2378:1: entryRuleExample returns [Boolean current=false] : iv_ruleExample= ruleExample EOF ;
    public final Boolean entryRuleExample() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleExample = null;


        try {
            // PsiInternalUseCase.g:2378:49: (iv_ruleExample= ruleExample EOF )
            // PsiInternalUseCase.g:2379:2: iv_ruleExample= ruleExample EOF
            {
             markComposite(elementTypeProvider.getExampleElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleExample=ruleExample();

            state._fsp--;

             current =iv_ruleExample; 
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
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // PsiInternalUseCase.g:2385:1: ruleExample returns [Boolean current=false] : (otherlv_0= 'Beispiel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_given_5_0= ruleGiven ) ) ( (lv_givenAnd_6_0= ruleGivenAnd ) )* ( (lv_when_7_0= ruleWhen ) ) ( (lv_whenAnd_8_0= ruleWhenAnd ) )* ( (lv_then_9_0= ruleThen ) ) ( (lv_thenAnd_10_0= ruleThenAnd ) )* (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )? otherlv_13= 'Beispiel' otherlv_14= 'Ende' ) ;
    public final Boolean ruleExample() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_11=null;
        Token lv_explaination_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Boolean lv_given_5_0 = null;

        Boolean lv_givenAnd_6_0 = null;

        Boolean lv_when_7_0 = null;

        Boolean lv_whenAnd_8_0 = null;

        Boolean lv_then_9_0 = null;

        Boolean lv_thenAnd_10_0 = null;


        try {
            // PsiInternalUseCase.g:2386:1: ( (otherlv_0= 'Beispiel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_given_5_0= ruleGiven ) ) ( (lv_givenAnd_6_0= ruleGivenAnd ) )* ( (lv_when_7_0= ruleWhen ) ) ( (lv_whenAnd_8_0= ruleWhenAnd ) )* ( (lv_then_9_0= ruleThen ) ) ( (lv_thenAnd_10_0= ruleThenAnd ) )* (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )? otherlv_13= 'Beispiel' otherlv_14= 'Ende' ) )
            // PsiInternalUseCase.g:2387:2: (otherlv_0= 'Beispiel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_given_5_0= ruleGiven ) ) ( (lv_givenAnd_6_0= ruleGivenAnd ) )* ( (lv_when_7_0= ruleWhen ) ) ( (lv_whenAnd_8_0= ruleWhenAnd ) )* ( (lv_then_9_0= ruleThen ) ) ( (lv_thenAnd_10_0= ruleThenAnd ) )* (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )? otherlv_13= 'Beispiel' otherlv_14= 'Ende' )
            {
            // PsiInternalUseCase.g:2387:2: (otherlv_0= 'Beispiel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_given_5_0= ruleGiven ) ) ( (lv_givenAnd_6_0= ruleGivenAnd ) )* ( (lv_when_7_0= ruleWhen ) ) ( (lv_whenAnd_8_0= ruleWhenAnd ) )* ( (lv_then_9_0= ruleThen ) ) ( (lv_thenAnd_10_0= ruleThenAnd ) )* (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )? otherlv_13= 'Beispiel' otherlv_14= 'Ende' )
            // PsiInternalUseCase.g:2388:3: otherlv_0= 'Beispiel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_given_5_0= ruleGiven ) ) ( (lv_givenAnd_6_0= ruleGivenAnd ) )* ( (lv_when_7_0= ruleWhen ) ) ( (lv_whenAnd_8_0= ruleWhenAnd ) )* ( (lv_then_9_0= ruleThen ) ) ( (lv_thenAnd_10_0= ruleThenAnd ) )* (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )? otherlv_13= 'Beispiel' otherlv_14= 'Ende'
            {

            			markLeaf(elementTypeProvider.getExample_BeispielKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,86,FOLLOW_12); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:2395:3: ( (lv_name_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:2396:4: (lv_name_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:2396:4: (lv_name_1_0= RULE_STRING )
            // PsiInternalUseCase.g:2397:5: lv_name_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getExample_NameSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getExample_ColonKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_60); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalUseCase.g:2419:3: (otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==87) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // PsiInternalUseCase.g:2420:4: otherlv_3= 'Beschreibung:' ( (lv_description_4_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getExample_BeschreibungKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,87,FOLLOW_12); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:2427:4: ( (lv_description_4_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:2428:5: (lv_description_4_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:2428:5: (lv_description_4_0= RULE_STRING )
                    // PsiInternalUseCase.g:2429:6: lv_description_4_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getExample_DescriptionSTRINGTerminalRuleCall_3_1_0ElementType());
                    					
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_description_4_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:2445:3: ( (lv_given_5_0= ruleGiven ) )
            // PsiInternalUseCase.g:2446:4: (lv_given_5_0= ruleGiven )
            {
            // PsiInternalUseCase.g:2446:4: (lv_given_5_0= ruleGiven )
            // PsiInternalUseCase.g:2447:5: lv_given_5_0= ruleGiven
            {

            					markComposite(elementTypeProvider.getExample_GivenGivenParserRuleCall_4_0ElementType());
            				
            pushFollow(FOLLOW_61);
            lv_given_5_0=ruleGiven();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalUseCase.g:2460:3: ( (lv_givenAnd_6_0= ruleGivenAnd ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=91 && LA72_0<=92)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // PsiInternalUseCase.g:2461:4: (lv_givenAnd_6_0= ruleGivenAnd )
            	    {
            	    // PsiInternalUseCase.g:2461:4: (lv_givenAnd_6_0= ruleGivenAnd )
            	    // PsiInternalUseCase.g:2462:5: lv_givenAnd_6_0= ruleGivenAnd
            	    {

            	    					markComposite(elementTypeProvider.getExample_GivenAndGivenAndParserRuleCall_5_0ElementType());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_givenAnd_6_0=ruleGivenAnd();

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
            	    break loop72;
                }
            } while (true);

            // PsiInternalUseCase.g:2475:3: ( (lv_when_7_0= ruleWhen ) )
            // PsiInternalUseCase.g:2476:4: (lv_when_7_0= ruleWhen )
            {
            // PsiInternalUseCase.g:2476:4: (lv_when_7_0= ruleWhen )
            // PsiInternalUseCase.g:2477:5: lv_when_7_0= ruleWhen
            {

            					markComposite(elementTypeProvider.getExample_WhenWhenParserRuleCall_6_0ElementType());
            				
            pushFollow(FOLLOW_62);
            lv_when_7_0=ruleWhen();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalUseCase.g:2490:3: ( (lv_whenAnd_8_0= ruleWhenAnd ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=91 && LA73_0<=92)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // PsiInternalUseCase.g:2491:4: (lv_whenAnd_8_0= ruleWhenAnd )
            	    {
            	    // PsiInternalUseCase.g:2491:4: (lv_whenAnd_8_0= ruleWhenAnd )
            	    // PsiInternalUseCase.g:2492:5: lv_whenAnd_8_0= ruleWhenAnd
            	    {

            	    					markComposite(elementTypeProvider.getExample_WhenAndWhenAndParserRuleCall_7_0ElementType());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_whenAnd_8_0=ruleWhenAnd();

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
            	    break loop73;
                }
            } while (true);

            // PsiInternalUseCase.g:2505:3: ( (lv_then_9_0= ruleThen ) )
            // PsiInternalUseCase.g:2506:4: (lv_then_9_0= ruleThen )
            {
            // PsiInternalUseCase.g:2506:4: (lv_then_9_0= ruleThen )
            // PsiInternalUseCase.g:2507:5: lv_then_9_0= ruleThen
            {

            					markComposite(elementTypeProvider.getExample_ThenThenParserRuleCall_8_0ElementType());
            				
            pushFollow(FOLLOW_63);
            lv_then_9_0=ruleThen();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalUseCase.g:2520:3: ( (lv_thenAnd_10_0= ruleThenAnd ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=91 && LA74_0<=92)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // PsiInternalUseCase.g:2521:4: (lv_thenAnd_10_0= ruleThenAnd )
            	    {
            	    // PsiInternalUseCase.g:2521:4: (lv_thenAnd_10_0= ruleThenAnd )
            	    // PsiInternalUseCase.g:2522:5: lv_thenAnd_10_0= ruleThenAnd
            	    {

            	    					markComposite(elementTypeProvider.getExample_ThenAndThenAndParserRuleCall_9_0ElementType());
            	    				
            	    pushFollow(FOLLOW_63);
            	    lv_thenAnd_10_0=ruleThenAnd();

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
            	    break loop74;
                }
            } while (true);

            // PsiInternalUseCase.g:2535:3: (otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==88) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // PsiInternalUseCase.g:2536:4: otherlv_11= 'Warum?' ( (lv_explaination_12_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getExample_WarumKeyword_10_0ElementType());
                    			
                    otherlv_11=(Token)match(input,88,FOLLOW_12); 

                    				doneLeaf(otherlv_11);
                    			
                    // PsiInternalUseCase.g:2543:4: ( (lv_explaination_12_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:2544:5: (lv_explaination_12_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:2544:5: (lv_explaination_12_0= RULE_STRING )
                    // PsiInternalUseCase.g:2545:6: lv_explaination_12_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getExample_ExplainationSTRINGTerminalRuleCall_10_1_0ElementType());
                    					
                    lv_explaination_12_0=(Token)match(input,RULE_STRING,FOLLOW_64); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_explaination_12_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getExample_BeispielKeyword_11ElementType());
            		
            otherlv_13=(Token)match(input,86,FOLLOW_65); 

            			doneLeaf(otherlv_13);
            		

            			markLeaf(elementTypeProvider.getExample_EndeKeyword_12ElementType());
            		
            otherlv_14=(Token)match(input,21,FOLLOW_2); 

            			doneLeaf(otherlv_14);
            		

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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleGiven"
    // PsiInternalUseCase.g:2579:1: entryRuleGiven returns [Boolean current=false] : iv_ruleGiven= ruleGiven EOF ;
    public final Boolean entryRuleGiven() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleGiven = null;


        try {
            // PsiInternalUseCase.g:2579:47: (iv_ruleGiven= ruleGiven EOF )
            // PsiInternalUseCase.g:2580:2: iv_ruleGiven= ruleGiven EOF
            {
             markComposite(elementTypeProvider.getGivenElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleGiven=ruleGiven();

            state._fsp--;

             current =iv_ruleGiven; 
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
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // PsiInternalUseCase.g:2586:1: ruleGiven returns [Boolean current=false] : ( (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final Boolean ruleGiven() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;

        try {
            // PsiInternalUseCase.g:2587:1: ( ( (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:2588:2: ( (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:2588:2: ( (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:2589:3: (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:2589:3: (otherlv_0= 'Gegeben' | otherlv_1= 'gegeben' )
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
                    // PsiInternalUseCase.g:2590:4: otherlv_0= 'Gegeben'
                    {

                    				markLeaf(elementTypeProvider.getGiven_GegebenKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,89,FOLLOW_12); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:2598:4: otherlv_1= 'gegeben'
                    {

                    				markLeaf(elementTypeProvider.getGiven_GegebenKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,90,FOLLOW_12); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:2606:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:2607:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:2607:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:2608:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getGiven_ContentSTRINGTerminalRuleCall_1_0ElementType());
            				
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
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleGivenAnd"
    // PsiInternalUseCase.g:2627:1: entryRuleGivenAnd returns [Boolean current=false] : iv_ruleGivenAnd= ruleGivenAnd EOF ;
    public final Boolean entryRuleGivenAnd() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleGivenAnd = null;


        try {
            // PsiInternalUseCase.g:2627:50: (iv_ruleGivenAnd= ruleGivenAnd EOF )
            // PsiInternalUseCase.g:2628:2: iv_ruleGivenAnd= ruleGivenAnd EOF
            {
             markComposite(elementTypeProvider.getGivenAndElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleGivenAnd=ruleGivenAnd();

            state._fsp--;

             current =iv_ruleGivenAnd; 
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
    // $ANTLR end "entryRuleGivenAnd"


    // $ANTLR start "ruleGivenAnd"
    // PsiInternalUseCase.g:2634:1: ruleGivenAnd returns [Boolean current=false] : ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final Boolean ruleGivenAnd() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;

        try {
            // PsiInternalUseCase.g:2635:1: ( ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:2636:2: ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:2636:2: ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:2637:3: (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:2637:3: (otherlv_0= 'und' | otherlv_1= 'aber' )
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
                    // PsiInternalUseCase.g:2638:4: otherlv_0= 'und'
                    {

                    				markLeaf(elementTypeProvider.getGivenAnd_UndKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,91,FOLLOW_12); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:2646:4: otherlv_1= 'aber'
                    {

                    				markLeaf(elementTypeProvider.getGivenAnd_AberKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,92,FOLLOW_12); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:2654:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:2655:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:2655:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:2656:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getGivenAnd_ContentSTRINGTerminalRuleCall_1_0ElementType());
            				
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
    // $ANTLR end "ruleGivenAnd"


    // $ANTLR start "entryRuleWhen"
    // PsiInternalUseCase.g:2675:1: entryRuleWhen returns [Boolean current=false] : iv_ruleWhen= ruleWhen EOF ;
    public final Boolean entryRuleWhen() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleWhen = null;


        try {
            // PsiInternalUseCase.g:2675:46: (iv_ruleWhen= ruleWhen EOF )
            // PsiInternalUseCase.g:2676:2: iv_ruleWhen= ruleWhen EOF
            {
             markComposite(elementTypeProvider.getWhenElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // PsiInternalUseCase.g:2682:1: ruleWhen returns [Boolean current=false] : (otherlv_0= 'Wenn' ( (lv_content_1_0= RULE_STRING ) ) ) ;
    public final Boolean ruleWhen() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_content_1_0=null;

        try {
            // PsiInternalUseCase.g:2683:1: ( (otherlv_0= 'Wenn' ( (lv_content_1_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:2684:2: (otherlv_0= 'Wenn' ( (lv_content_1_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:2684:2: (otherlv_0= 'Wenn' ( (lv_content_1_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:2685:3: otherlv_0= 'Wenn' ( (lv_content_1_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getWhen_WennKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,93,FOLLOW_12); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:2692:3: ( (lv_content_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:2693:4: (lv_content_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:2693:4: (lv_content_1_0= RULE_STRING )
            // PsiInternalUseCase.g:2694:5: lv_content_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getWhen_ContentSTRINGTerminalRuleCall_1_0ElementType());
            				
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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleWhenAnd"
    // PsiInternalUseCase.g:2713:1: entryRuleWhenAnd returns [Boolean current=false] : iv_ruleWhenAnd= ruleWhenAnd EOF ;
    public final Boolean entryRuleWhenAnd() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleWhenAnd = null;


        try {
            // PsiInternalUseCase.g:2713:49: (iv_ruleWhenAnd= ruleWhenAnd EOF )
            // PsiInternalUseCase.g:2714:2: iv_ruleWhenAnd= ruleWhenAnd EOF
            {
             markComposite(elementTypeProvider.getWhenAndElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhenAnd=ruleWhenAnd();

            state._fsp--;

             current =iv_ruleWhenAnd; 
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
    // $ANTLR end "entryRuleWhenAnd"


    // $ANTLR start "ruleWhenAnd"
    // PsiInternalUseCase.g:2720:1: ruleWhenAnd returns [Boolean current=false] : (kw= 'und' | kw= 'aber' ) ;
    public final Boolean ruleWhenAnd() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalUseCase.g:2721:1: ( (kw= 'und' | kw= 'aber' ) )
            // PsiInternalUseCase.g:2722:2: (kw= 'und' | kw= 'aber' )
            {
            // PsiInternalUseCase.g:2722:2: (kw= 'und' | kw= 'aber' )
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
                    // PsiInternalUseCase.g:2723:3: kw= 'und'
                    {

                    			markLeaf(elementTypeProvider.getWhenAnd_UndKeyword_0ElementType());
                    		
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:2731:3: kw= 'aber'
                    {

                    			markLeaf(elementTypeProvider.getWhenAnd_AberKeyword_1ElementType());
                    		
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			doneLeaf(kw);
                    		

                    }
                    break;

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
    // $ANTLR end "ruleWhenAnd"


    // $ANTLR start "entryRuleThen"
    // PsiInternalUseCase.g:2742:1: entryRuleThen returns [Boolean current=false] : iv_ruleThen= ruleThen EOF ;
    public final Boolean entryRuleThen() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleThen = null;


        try {
            // PsiInternalUseCase.g:2742:46: (iv_ruleThen= ruleThen EOF )
            // PsiInternalUseCase.g:2743:2: iv_ruleThen= ruleThen EOF
            {
             markComposite(elementTypeProvider.getThenElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleThen=ruleThen();

            state._fsp--;

             current =iv_ruleThen; 
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
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // PsiInternalUseCase.g:2749:1: ruleThen returns [Boolean current=false] : ( (otherlv_0= 'Dann' | otherlv_1= 'dann' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final Boolean ruleThen() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;

        try {
            // PsiInternalUseCase.g:2750:1: ( ( (otherlv_0= 'Dann' | otherlv_1= 'dann' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:2751:2: ( (otherlv_0= 'Dann' | otherlv_1= 'dann' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:2751:2: ( (otherlv_0= 'Dann' | otherlv_1= 'dann' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:2752:3: (otherlv_0= 'Dann' | otherlv_1= 'dann' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:2752:3: (otherlv_0= 'Dann' | otherlv_1= 'dann' )
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
                    // PsiInternalUseCase.g:2753:4: otherlv_0= 'Dann'
                    {

                    				markLeaf(elementTypeProvider.getThen_DannKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,94,FOLLOW_12); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:2761:4: otherlv_1= 'dann'
                    {

                    				markLeaf(elementTypeProvider.getThen_DannKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,95,FOLLOW_12); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:2769:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:2770:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:2770:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:2771:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getThen_ContentSTRINGTerminalRuleCall_1_0ElementType());
            				
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
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleThenAnd"
    // PsiInternalUseCase.g:2790:1: entryRuleThenAnd returns [Boolean current=false] : iv_ruleThenAnd= ruleThenAnd EOF ;
    public final Boolean entryRuleThenAnd() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleThenAnd = null;


        try {
            // PsiInternalUseCase.g:2790:49: (iv_ruleThenAnd= ruleThenAnd EOF )
            // PsiInternalUseCase.g:2791:2: iv_ruleThenAnd= ruleThenAnd EOF
            {
             markComposite(elementTypeProvider.getThenAndElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleThenAnd=ruleThenAnd();

            state._fsp--;

             current =iv_ruleThenAnd; 
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
    // $ANTLR end "entryRuleThenAnd"


    // $ANTLR start "ruleThenAnd"
    // PsiInternalUseCase.g:2797:1: ruleThenAnd returns [Boolean current=false] : ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final Boolean ruleThenAnd() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;

        try {
            // PsiInternalUseCase.g:2798:1: ( ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:2799:2: ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:2799:2: ( (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:2800:3: (otherlv_0= 'und' | otherlv_1= 'aber' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:2800:3: (otherlv_0= 'und' | otherlv_1= 'aber' )
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
                    // PsiInternalUseCase.g:2801:4: otherlv_0= 'und'
                    {

                    				markLeaf(elementTypeProvider.getThenAnd_UndKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,91,FOLLOW_12); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:2809:4: otherlv_1= 'aber'
                    {

                    				markLeaf(elementTypeProvider.getThenAnd_AberKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,92,FOLLOW_12); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:2817:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:2818:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:2818:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:2819:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getThenAnd_ContentSTRINGTerminalRuleCall_1_0ElementType());
            				
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