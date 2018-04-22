package io.deniffel.dsl.useCase.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import io.deniffel.dsl.useCase.services.UseCaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'optional'", "'Firma'", "'Company'", "'Kathegorie'", "'package'", "'use-case'", "'Rezept'", "'description:'", "'Kurzbeschreibung:'", "'Beschreibung'", "'allowed-usergroups:'", "'requires:'", "'require:'", "'optional:'", "'Optional'", "'as'", "'als'", "'e.g'", "'z.B.'", "'Ergebnis:'", "'produces:'", "'produce:'", "'Vorbedingungen:'", "'pre-condition:'", "'pre-conditions:'", "'steps:'", "'Schritte:'", "'.'", "':'", "'If'", "'Falls'", "'Solange'", "'While'", "'notes:'", "'note:'", "'Anmerkungen:'", "'Anmerkung:'", "'Gegeben'", "'gegeben'", "'und'", "'aber'", "'Dann'", "'dann'", "'>'", "'end'", "'of'", "'Ende'", "'des'", "'Rezpets'", "'Erlaubt'", "'f\\u00FCr:'", "'-'", "'requires'", "'the'", "'following'", "'input'", "'Ben\\u00F6tigte'", "'Zutaten'", "'inputs'", "'Optionale'", "'('", "')'", "'produces'", "'output'", "'On'", "'error'", "'raise'", "'Bei'", "'Fehler'", "'melde'", "'Raise'", "'Melde'", "'used'", "'building-blocks:'", "'Genutzte'", "'Bausteine:'", "'['", "']'", "'errors:'", "'Fehler:'", "'Beispiel'", "'Beschreibung:'", "'Warum?'", "'Wenn'", "'many'"
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

    	public void setGrammarAccess(UseCaseGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalUseCase.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalUseCase.g:54:1: ( ruleModel EOF )
            // InternalUseCase.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUseCase.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalUseCase.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalUseCase.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalUseCase.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalUseCase.g:69:3: ( rule__Model__Group__0 )
            // InternalUseCase.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUseCase.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalUseCase.g:79:1: ( ruleQualifiedName EOF )
            // InternalUseCase.g:80:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalUseCase.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalUseCase.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalUseCase.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalUseCase.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalUseCase.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalUseCase.g:94:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNumber"
    // InternalUseCase.g:103:1: entryRuleQualifiedNumber : ruleQualifiedNumber EOF ;
    public final void entryRuleQualifiedNumber() throws RecognitionException {
        try {
            // InternalUseCase.g:104:1: ( ruleQualifiedNumber EOF )
            // InternalUseCase.g:105:1: ruleQualifiedNumber EOF
            {
             before(grammarAccess.getQualifiedNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNumber();

            state._fsp--;

             after(grammarAccess.getQualifiedNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNumber"


    // $ANTLR start "ruleQualifiedNumber"
    // InternalUseCase.g:112:1: ruleQualifiedNumber : ( ( rule__QualifiedNumber__Group__0 ) ) ;
    public final void ruleQualifiedNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:116:2: ( ( ( rule__QualifiedNumber__Group__0 ) ) )
            // InternalUseCase.g:117:2: ( ( rule__QualifiedNumber__Group__0 ) )
            {
            // InternalUseCase.g:117:2: ( ( rule__QualifiedNumber__Group__0 ) )
            // InternalUseCase.g:118:3: ( rule__QualifiedNumber__Group__0 )
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup()); 
            // InternalUseCase.g:119:3: ( rule__QualifiedNumber__Group__0 )
            // InternalUseCase.g:119:4: rule__QualifiedNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNumber"


    // $ANTLR start "entryRulePackage"
    // InternalUseCase.g:128:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalUseCase.g:129:1: ( rulePackage EOF )
            // InternalUseCase.g:130:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalUseCase.g:137:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:141:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalUseCase.g:142:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalUseCase.g:142:2: ( ( rule__Package__Group__0 ) )
            // InternalUseCase.g:143:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalUseCase.g:144:3: ( rule__Package__Group__0 )
            // InternalUseCase.g:144:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackagePart"
    // InternalUseCase.g:153:1: entryRulePackagePart : rulePackagePart EOF ;
    public final void entryRulePackagePart() throws RecognitionException {
        try {
            // InternalUseCase.g:154:1: ( rulePackagePart EOF )
            // InternalUseCase.g:155:1: rulePackagePart EOF
            {
             before(grammarAccess.getPackagePartRule()); 
            pushFollow(FOLLOW_1);
            rulePackagePart();

            state._fsp--;

             after(grammarAccess.getPackagePartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackagePart"


    // $ANTLR start "rulePackagePart"
    // InternalUseCase.g:162:1: rulePackagePart : ( ( rule__PackagePart__NameAssignment ) ) ;
    public final void rulePackagePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:166:2: ( ( ( rule__PackagePart__NameAssignment ) ) )
            // InternalUseCase.g:167:2: ( ( rule__PackagePart__NameAssignment ) )
            {
            // InternalUseCase.g:167:2: ( ( rule__PackagePart__NameAssignment ) )
            // InternalUseCase.g:168:3: ( rule__PackagePart__NameAssignment )
            {
             before(grammarAccess.getPackagePartAccess().getNameAssignment()); 
            // InternalUseCase.g:169:3: ( rule__PackagePart__NameAssignment )
            // InternalUseCase.g:169:4: rule__PackagePart__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PackagePart__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPackagePartAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackagePart"


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCase.g:178:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // InternalUseCase.g:179:1: ( ruleUseCase EOF )
            // InternalUseCase.g:180:1: ruleUseCase EOF
            {
             before(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getUseCaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUseCase.g:187:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:191:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUseCase.g:192:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUseCase.g:192:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUseCase.g:193:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUseCase.g:194:3: ( rule__UseCase__Group__0 )
            // InternalUseCase.g:194:4: rule__UseCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleDescription"
    // InternalUseCase.g:203:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalUseCase.g:204:1: ( ruleDescription EOF )
            // InternalUseCase.g:205:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalUseCase.g:212:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:216:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalUseCase.g:217:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalUseCase.g:217:2: ( ( rule__Description__Group__0 ) )
            // InternalUseCase.g:218:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalUseCase.g:219:3: ( rule__Description__Group__0 )
            // InternalUseCase.g:219:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleAllowedUserGroups"
    // InternalUseCase.g:228:1: entryRuleAllowedUserGroups : ruleAllowedUserGroups EOF ;
    public final void entryRuleAllowedUserGroups() throws RecognitionException {
        try {
            // InternalUseCase.g:229:1: ( ruleAllowedUserGroups EOF )
            // InternalUseCase.g:230:1: ruleAllowedUserGroups EOF
            {
             before(grammarAccess.getAllowedUserGroupsRule()); 
            pushFollow(FOLLOW_1);
            ruleAllowedUserGroups();

            state._fsp--;

             after(grammarAccess.getAllowedUserGroupsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllowedUserGroups"


    // $ANTLR start "ruleAllowedUserGroups"
    // InternalUseCase.g:237:1: ruleAllowedUserGroups : ( ( rule__AllowedUserGroups__Group__0 ) ) ;
    public final void ruleAllowedUserGroups() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:241:2: ( ( ( rule__AllowedUserGroups__Group__0 ) ) )
            // InternalUseCase.g:242:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            {
            // InternalUseCase.g:242:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            // InternalUseCase.g:243:3: ( rule__AllowedUserGroups__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroup()); 
            // InternalUseCase.g:244:3: ( rule__AllowedUserGroups__Group__0 )
            // InternalUseCase.g:244:4: rule__AllowedUserGroups__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllowedUserGroups__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllowedUserGroupsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllowedUserGroups"


    // $ANTLR start "entryRuleAllowedUserGroup"
    // InternalUseCase.g:253:1: entryRuleAllowedUserGroup : ruleAllowedUserGroup EOF ;
    public final void entryRuleAllowedUserGroup() throws RecognitionException {
        try {
            // InternalUseCase.g:254:1: ( ruleAllowedUserGroup EOF )
            // InternalUseCase.g:255:1: ruleAllowedUserGroup EOF
            {
             before(grammarAccess.getAllowedUserGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleAllowedUserGroup();

            state._fsp--;

             after(grammarAccess.getAllowedUserGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllowedUserGroup"


    // $ANTLR start "ruleAllowedUserGroup"
    // InternalUseCase.g:262:1: ruleAllowedUserGroup : ( ( rule__AllowedUserGroup__Group__0 ) ) ;
    public final void ruleAllowedUserGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:266:2: ( ( ( rule__AllowedUserGroup__Group__0 ) ) )
            // InternalUseCase.g:267:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            {
            // InternalUseCase.g:267:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            // InternalUseCase.g:268:3: ( rule__AllowedUserGroup__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup()); 
            // InternalUseCase.g:269:3: ( rule__AllowedUserGroup__Group__0 )
            // InternalUseCase.g:269:4: rule__AllowedUserGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllowedUserGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllowedUserGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllowedUserGroup"


    // $ANTLR start "entryRuleInputs"
    // InternalUseCase.g:278:1: entryRuleInputs : ruleInputs EOF ;
    public final void entryRuleInputs() throws RecognitionException {
        try {
            // InternalUseCase.g:279:1: ( ruleInputs EOF )
            // InternalUseCase.g:280:1: ruleInputs EOF
            {
             before(grammarAccess.getInputsRule()); 
            pushFollow(FOLLOW_1);
            ruleInputs();

            state._fsp--;

             after(grammarAccess.getInputsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputs"


    // $ANTLR start "ruleInputs"
    // InternalUseCase.g:287:1: ruleInputs : ( ( rule__Inputs__Group__0 ) ) ;
    public final void ruleInputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:291:2: ( ( ( rule__Inputs__Group__0 ) ) )
            // InternalUseCase.g:292:2: ( ( rule__Inputs__Group__0 ) )
            {
            // InternalUseCase.g:292:2: ( ( rule__Inputs__Group__0 ) )
            // InternalUseCase.g:293:3: ( rule__Inputs__Group__0 )
            {
             before(grammarAccess.getInputsAccess().getGroup()); 
            // InternalUseCase.g:294:3: ( rule__Inputs__Group__0 )
            // InternalUseCase.g:294:4: rule__Inputs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inputs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleOptionalInputs"
    // InternalUseCase.g:303:1: entryRuleOptionalInputs : ruleOptionalInputs EOF ;
    public final void entryRuleOptionalInputs() throws RecognitionException {
        try {
            // InternalUseCase.g:304:1: ( ruleOptionalInputs EOF )
            // InternalUseCase.g:305:1: ruleOptionalInputs EOF
            {
             before(grammarAccess.getOptionalInputsRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionalInputs();

            state._fsp--;

             after(grammarAccess.getOptionalInputsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionalInputs"


    // $ANTLR start "ruleOptionalInputs"
    // InternalUseCase.g:312:1: ruleOptionalInputs : ( ( rule__OptionalInputs__Group__0 ) ) ;
    public final void ruleOptionalInputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:316:2: ( ( ( rule__OptionalInputs__Group__0 ) ) )
            // InternalUseCase.g:317:2: ( ( rule__OptionalInputs__Group__0 ) )
            {
            // InternalUseCase.g:317:2: ( ( rule__OptionalInputs__Group__0 ) )
            // InternalUseCase.g:318:3: ( rule__OptionalInputs__Group__0 )
            {
             before(grammarAccess.getOptionalInputsAccess().getGroup()); 
            // InternalUseCase.g:319:3: ( rule__OptionalInputs__Group__0 )
            // InternalUseCase.g:319:4: rule__OptionalInputs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalInputsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionalInputs"


    // $ANTLR start "entryRuleInput"
    // InternalUseCase.g:328:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalUseCase.g:329:1: ( ruleInput EOF )
            // InternalUseCase.g:330:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalUseCase.g:337:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:341:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalUseCase.g:342:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalUseCase.g:342:2: ( ( rule__Input__Group__0 ) )
            // InternalUseCase.g:343:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalUseCase.g:344:3: ( rule__Input__Group__0 )
            // InternalUseCase.g:344:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutputs"
    // InternalUseCase.g:353:1: entryRuleOutputs : ruleOutputs EOF ;
    public final void entryRuleOutputs() throws RecognitionException {
        try {
            // InternalUseCase.g:354:1: ( ruleOutputs EOF )
            // InternalUseCase.g:355:1: ruleOutputs EOF
            {
             before(grammarAccess.getOutputsRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputs();

            state._fsp--;

             after(grammarAccess.getOutputsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutputs"


    // $ANTLR start "ruleOutputs"
    // InternalUseCase.g:362:1: ruleOutputs : ( ( rule__Outputs__Group__0 ) ) ;
    public final void ruleOutputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:366:2: ( ( ( rule__Outputs__Group__0 ) ) )
            // InternalUseCase.g:367:2: ( ( rule__Outputs__Group__0 ) )
            {
            // InternalUseCase.g:367:2: ( ( rule__Outputs__Group__0 ) )
            // InternalUseCase.g:368:3: ( rule__Outputs__Group__0 )
            {
             before(grammarAccess.getOutputsAccess().getGroup()); 
            // InternalUseCase.g:369:3: ( rule__Outputs__Group__0 )
            // InternalUseCase.g:369:4: rule__Outputs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Outputs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputs"


    // $ANTLR start "entryRuleOutput"
    // InternalUseCase.g:378:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalUseCase.g:379:1: ( ruleOutput EOF )
            // InternalUseCase.g:380:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalUseCase.g:387:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:391:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalUseCase.g:392:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalUseCase.g:392:2: ( ( rule__Output__Group__0 ) )
            // InternalUseCase.g:393:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalUseCase.g:394:3: ( rule__Output__Group__0 )
            // InternalUseCase.g:394:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleOptional"
    // InternalUseCase.g:403:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // InternalUseCase.g:404:1: ( ruleOptional EOF )
            // InternalUseCase.g:405:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_1);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // InternalUseCase.g:412:1: ruleOptional : ( 'optional' ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:416:2: ( ( 'optional' ) )
            // InternalUseCase.g:417:2: ( 'optional' )
            {
            // InternalUseCase.g:417:2: ( 'optional' )
            // InternalUseCase.g:418:3: 'optional'
            {
             before(grammarAccess.getOptionalAccess().getOptionalKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getOptionalAccess().getOptionalKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRulePreConditions"
    // InternalUseCase.g:428:1: entryRulePreConditions : rulePreConditions EOF ;
    public final void entryRulePreConditions() throws RecognitionException {
        try {
            // InternalUseCase.g:429:1: ( rulePreConditions EOF )
            // InternalUseCase.g:430:1: rulePreConditions EOF
            {
             before(grammarAccess.getPreConditionsRule()); 
            pushFollow(FOLLOW_1);
            rulePreConditions();

            state._fsp--;

             after(grammarAccess.getPreConditionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePreConditions"


    // $ANTLR start "rulePreConditions"
    // InternalUseCase.g:437:1: rulePreConditions : ( ( rule__PreConditions__Group__0 ) ) ;
    public final void rulePreConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:441:2: ( ( ( rule__PreConditions__Group__0 ) ) )
            // InternalUseCase.g:442:2: ( ( rule__PreConditions__Group__0 ) )
            {
            // InternalUseCase.g:442:2: ( ( rule__PreConditions__Group__0 ) )
            // InternalUseCase.g:443:3: ( rule__PreConditions__Group__0 )
            {
             before(grammarAccess.getPreConditionsAccess().getGroup()); 
            // InternalUseCase.g:444:3: ( rule__PreConditions__Group__0 )
            // InternalUseCase.g:444:4: rule__PreConditions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PreConditions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreConditionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePreConditions"


    // $ANTLR start "entryRuleCondition"
    // InternalUseCase.g:453:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalUseCase.g:454:1: ( ruleCondition EOF )
            // InternalUseCase.g:455:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalUseCase.g:462:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:466:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalUseCase.g:467:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalUseCase.g:467:2: ( ( rule__Condition__Group__0 ) )
            // InternalUseCase.g:468:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalUseCase.g:469:3: ( rule__Condition__Group__0 )
            // InternalUseCase.g:469:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleSteps"
    // InternalUseCase.g:478:1: entryRuleSteps : ruleSteps EOF ;
    public final void entryRuleSteps() throws RecognitionException {
        try {
            // InternalUseCase.g:479:1: ( ruleSteps EOF )
            // InternalUseCase.g:480:1: ruleSteps EOF
            {
             before(grammarAccess.getStepsRule()); 
            pushFollow(FOLLOW_1);
            ruleSteps();

            state._fsp--;

             after(grammarAccess.getStepsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSteps"


    // $ANTLR start "ruleSteps"
    // InternalUseCase.g:487:1: ruleSteps : ( ( rule__Steps__Group__0 ) ) ;
    public final void ruleSteps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:491:2: ( ( ( rule__Steps__Group__0 ) ) )
            // InternalUseCase.g:492:2: ( ( rule__Steps__Group__0 ) )
            {
            // InternalUseCase.g:492:2: ( ( rule__Steps__Group__0 ) )
            // InternalUseCase.g:493:3: ( rule__Steps__Group__0 )
            {
             before(grammarAccess.getStepsAccess().getGroup()); 
            // InternalUseCase.g:494:3: ( rule__Steps__Group__0 )
            // InternalUseCase.g:494:4: rule__Steps__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Steps__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSteps"


    // $ANTLR start "entryRuleStep"
    // InternalUseCase.g:503:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalUseCase.g:504:1: ( ruleStep EOF )
            // InternalUseCase.g:505:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalUseCase.g:512:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:516:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalUseCase.g:517:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalUseCase.g:517:2: ( ( rule__Step__Group__0 ) )
            // InternalUseCase.g:518:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalUseCase.g:519:3: ( rule__Step__Group__0 )
            // InternalUseCase.g:519:4: rule__Step__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleRaiseErrorConditional"
    // InternalUseCase.g:528:1: entryRuleRaiseErrorConditional : ruleRaiseErrorConditional EOF ;
    public final void entryRuleRaiseErrorConditional() throws RecognitionException {
        try {
            // InternalUseCase.g:529:1: ( ruleRaiseErrorConditional EOF )
            // InternalUseCase.g:530:1: ruleRaiseErrorConditional EOF
            {
             before(grammarAccess.getRaiseErrorConditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleRaiseErrorConditional();

            state._fsp--;

             after(grammarAccess.getRaiseErrorConditionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRaiseErrorConditional"


    // $ANTLR start "ruleRaiseErrorConditional"
    // InternalUseCase.g:537:1: ruleRaiseErrorConditional : ( ( rule__RaiseErrorConditional__Group__0 ) ) ;
    public final void ruleRaiseErrorConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:541:2: ( ( ( rule__RaiseErrorConditional__Group__0 ) ) )
            // InternalUseCase.g:542:2: ( ( rule__RaiseErrorConditional__Group__0 ) )
            {
            // InternalUseCase.g:542:2: ( ( rule__RaiseErrorConditional__Group__0 ) )
            // InternalUseCase.g:543:3: ( rule__RaiseErrorConditional__Group__0 )
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getGroup()); 
            // InternalUseCase.g:544:3: ( rule__RaiseErrorConditional__Group__0 )
            // InternalUseCase.g:544:4: rule__RaiseErrorConditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRaiseErrorConditionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRaiseErrorConditional"


    // $ANTLR start "entryRuleRaiseErrorNow"
    // InternalUseCase.g:553:1: entryRuleRaiseErrorNow : ruleRaiseErrorNow EOF ;
    public final void entryRuleRaiseErrorNow() throws RecognitionException {
        try {
            // InternalUseCase.g:554:1: ( ruleRaiseErrorNow EOF )
            // InternalUseCase.g:555:1: ruleRaiseErrorNow EOF
            {
             before(grammarAccess.getRaiseErrorNowRule()); 
            pushFollow(FOLLOW_1);
            ruleRaiseErrorNow();

            state._fsp--;

             after(grammarAccess.getRaiseErrorNowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRaiseErrorNow"


    // $ANTLR start "ruleRaiseErrorNow"
    // InternalUseCase.g:562:1: ruleRaiseErrorNow : ( ( rule__RaiseErrorNow__Group__0 ) ) ;
    public final void ruleRaiseErrorNow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:566:2: ( ( ( rule__RaiseErrorNow__Group__0 ) ) )
            // InternalUseCase.g:567:2: ( ( rule__RaiseErrorNow__Group__0 ) )
            {
            // InternalUseCase.g:567:2: ( ( rule__RaiseErrorNow__Group__0 ) )
            // InternalUseCase.g:568:3: ( rule__RaiseErrorNow__Group__0 )
            {
             before(grammarAccess.getRaiseErrorNowAccess().getGroup()); 
            // InternalUseCase.g:569:3: ( rule__RaiseErrorNow__Group__0 )
            // InternalUseCase.g:569:4: rule__RaiseErrorNow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorNow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRaiseErrorNowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRaiseErrorNow"


    // $ANTLR start "entryRuleIfStatement"
    // InternalUseCase.g:578:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalUseCase.g:579:1: ( ruleIfStatement EOF )
            // InternalUseCase.g:580:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalUseCase.g:587:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:591:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalUseCase.g:592:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalUseCase.g:592:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalUseCase.g:593:3: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalUseCase.g:594:3: ( rule__IfStatement__Group__0 )
            // InternalUseCase.g:594:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleLoop"
    // InternalUseCase.g:603:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalUseCase.g:604:1: ( ruleLoop EOF )
            // InternalUseCase.g:605:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalUseCase.g:612:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:616:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalUseCase.g:617:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalUseCase.g:617:2: ( ( rule__Loop__Group__0 ) )
            // InternalUseCase.g:618:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalUseCase.g:619:3: ( rule__Loop__Group__0 )
            // InternalUseCase.g:619:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBooleanCondition"
    // InternalUseCase.g:628:1: entryRuleBooleanCondition : ruleBooleanCondition EOF ;
    public final void entryRuleBooleanCondition() throws RecognitionException {
        try {
            // InternalUseCase.g:629:1: ( ruleBooleanCondition EOF )
            // InternalUseCase.g:630:1: ruleBooleanCondition EOF
            {
             before(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanCondition();

            state._fsp--;

             after(grammarAccess.getBooleanConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // InternalUseCase.g:637:1: ruleBooleanCondition : ( ( rule__BooleanCondition__NameAssignment ) ) ;
    public final void ruleBooleanCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:641:2: ( ( ( rule__BooleanCondition__NameAssignment ) ) )
            // InternalUseCase.g:642:2: ( ( rule__BooleanCondition__NameAssignment ) )
            {
            // InternalUseCase.g:642:2: ( ( rule__BooleanCondition__NameAssignment ) )
            // InternalUseCase.g:643:3: ( rule__BooleanCondition__NameAssignment )
            {
             before(grammarAccess.getBooleanConditionAccess().getNameAssignment()); 
            // InternalUseCase.g:644:3: ( rule__BooleanCondition__NameAssignment )
            // InternalUseCase.g:644:4: rule__BooleanCondition__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanCondition__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConditionAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleNotes"
    // InternalUseCase.g:653:1: entryRuleNotes : ruleNotes EOF ;
    public final void entryRuleNotes() throws RecognitionException {
        try {
            // InternalUseCase.g:654:1: ( ruleNotes EOF )
            // InternalUseCase.g:655:1: ruleNotes EOF
            {
             before(grammarAccess.getNotesRule()); 
            pushFollow(FOLLOW_1);
            ruleNotes();

            state._fsp--;

             after(grammarAccess.getNotesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotes"


    // $ANTLR start "ruleNotes"
    // InternalUseCase.g:662:1: ruleNotes : ( ( rule__Notes__Group__0 ) ) ;
    public final void ruleNotes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:666:2: ( ( ( rule__Notes__Group__0 ) ) )
            // InternalUseCase.g:667:2: ( ( rule__Notes__Group__0 ) )
            {
            // InternalUseCase.g:667:2: ( ( rule__Notes__Group__0 ) )
            // InternalUseCase.g:668:3: ( rule__Notes__Group__0 )
            {
             before(grammarAccess.getNotesAccess().getGroup()); 
            // InternalUseCase.g:669:3: ( rule__Notes__Group__0 )
            // InternalUseCase.g:669:4: rule__Notes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Notes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotes"


    // $ANTLR start "entryRuleUsedTypes"
    // InternalUseCase.g:678:1: entryRuleUsedTypes : ruleUsedTypes EOF ;
    public final void entryRuleUsedTypes() throws RecognitionException {
        try {
            // InternalUseCase.g:679:1: ( ruleUsedTypes EOF )
            // InternalUseCase.g:680:1: ruleUsedTypes EOF
            {
             before(grammarAccess.getUsedTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleUsedTypes();

            state._fsp--;

             after(grammarAccess.getUsedTypesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUsedTypes"


    // $ANTLR start "ruleUsedTypes"
    // InternalUseCase.g:687:1: ruleUsedTypes : ( ( rule__UsedTypes__Group__0 ) ) ;
    public final void ruleUsedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:691:2: ( ( ( rule__UsedTypes__Group__0 ) ) )
            // InternalUseCase.g:692:2: ( ( rule__UsedTypes__Group__0 ) )
            {
            // InternalUseCase.g:692:2: ( ( rule__UsedTypes__Group__0 ) )
            // InternalUseCase.g:693:3: ( rule__UsedTypes__Group__0 )
            {
             before(grammarAccess.getUsedTypesAccess().getGroup()); 
            // InternalUseCase.g:694:3: ( rule__UsedTypes__Group__0 )
            // InternalUseCase.g:694:4: rule__UsedTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UsedTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsedTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsedTypes"


    // $ANTLR start "entryRuleType"
    // InternalUseCase.g:703:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUseCase.g:704:1: ( ruleType EOF )
            // InternalUseCase.g:705:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUseCase.g:712:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:716:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalUseCase.g:717:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalUseCase.g:717:2: ( ( rule__Type__Group__0 ) )
            // InternalUseCase.g:718:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalUseCase.g:719:3: ( rule__Type__Group__0 )
            // InternalUseCase.g:719:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleUsedExceptions"
    // InternalUseCase.g:728:1: entryRuleUsedExceptions : ruleUsedExceptions EOF ;
    public final void entryRuleUsedExceptions() throws RecognitionException {
        try {
            // InternalUseCase.g:729:1: ( ruleUsedExceptions EOF )
            // InternalUseCase.g:730:1: ruleUsedExceptions EOF
            {
             before(grammarAccess.getUsedExceptionsRule()); 
            pushFollow(FOLLOW_1);
            ruleUsedExceptions();

            state._fsp--;

             after(grammarAccess.getUsedExceptionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUsedExceptions"


    // $ANTLR start "ruleUsedExceptions"
    // InternalUseCase.g:737:1: ruleUsedExceptions : ( ( rule__UsedExceptions__Group__0 ) ) ;
    public final void ruleUsedExceptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:741:2: ( ( ( rule__UsedExceptions__Group__0 ) ) )
            // InternalUseCase.g:742:2: ( ( rule__UsedExceptions__Group__0 ) )
            {
            // InternalUseCase.g:742:2: ( ( rule__UsedExceptions__Group__0 ) )
            // InternalUseCase.g:743:3: ( rule__UsedExceptions__Group__0 )
            {
             before(grammarAccess.getUsedExceptionsAccess().getGroup()); 
            // InternalUseCase.g:744:3: ( rule__UsedExceptions__Group__0 )
            // InternalUseCase.g:744:4: rule__UsedExceptions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UsedExceptions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsedExceptionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsedExceptions"


    // $ANTLR start "entryRuleException"
    // InternalUseCase.g:753:1: entryRuleException : ruleException EOF ;
    public final void entryRuleException() throws RecognitionException {
        try {
            // InternalUseCase.g:754:1: ( ruleException EOF )
            // InternalUseCase.g:755:1: ruleException EOF
            {
             before(grammarAccess.getExceptionRule()); 
            pushFollow(FOLLOW_1);
            ruleException();

            state._fsp--;

             after(grammarAccess.getExceptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleException"


    // $ANTLR start "ruleException"
    // InternalUseCase.g:762:1: ruleException : ( ( rule__Exception__TypeAssignment ) ) ;
    public final void ruleException() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:766:2: ( ( ( rule__Exception__TypeAssignment ) ) )
            // InternalUseCase.g:767:2: ( ( rule__Exception__TypeAssignment ) )
            {
            // InternalUseCase.g:767:2: ( ( rule__Exception__TypeAssignment ) )
            // InternalUseCase.g:768:3: ( rule__Exception__TypeAssignment )
            {
             before(grammarAccess.getExceptionAccess().getTypeAssignment()); 
            // InternalUseCase.g:769:3: ( rule__Exception__TypeAssignment )
            // InternalUseCase.g:769:4: rule__Exception__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Exception__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExceptionAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleException"


    // $ANTLR start "entryRuleExceptionDecleration"
    // InternalUseCase.g:778:1: entryRuleExceptionDecleration : ruleExceptionDecleration EOF ;
    public final void entryRuleExceptionDecleration() throws RecognitionException {
        try {
            // InternalUseCase.g:779:1: ( ruleExceptionDecleration EOF )
            // InternalUseCase.g:780:1: ruleExceptionDecleration EOF
            {
             before(grammarAccess.getExceptionDeclerationRule()); 
            pushFollow(FOLLOW_1);
            ruleExceptionDecleration();

            state._fsp--;

             after(grammarAccess.getExceptionDeclerationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExceptionDecleration"


    // $ANTLR start "ruleExceptionDecleration"
    // InternalUseCase.g:787:1: ruleExceptionDecleration : ( ( rule__ExceptionDecleration__Group__0 ) ) ;
    public final void ruleExceptionDecleration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:791:2: ( ( ( rule__ExceptionDecleration__Group__0 ) ) )
            // InternalUseCase.g:792:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            {
            // InternalUseCase.g:792:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            // InternalUseCase.g:793:3: ( rule__ExceptionDecleration__Group__0 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup()); 
            // InternalUseCase.g:794:3: ( rule__ExceptionDecleration__Group__0 )
            // InternalUseCase.g:794:4: rule__ExceptionDecleration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExceptionDecleration"


    // $ANTLR start "entryRuleExample"
    // InternalUseCase.g:803:1: entryRuleExample : ruleExample EOF ;
    public final void entryRuleExample() throws RecognitionException {
        try {
            // InternalUseCase.g:804:1: ( ruleExample EOF )
            // InternalUseCase.g:805:1: ruleExample EOF
            {
             before(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_1);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getExampleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // InternalUseCase.g:812:1: ruleExample : ( ( rule__Example__Group__0 ) ) ;
    public final void ruleExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:816:2: ( ( ( rule__Example__Group__0 ) ) )
            // InternalUseCase.g:817:2: ( ( rule__Example__Group__0 ) )
            {
            // InternalUseCase.g:817:2: ( ( rule__Example__Group__0 ) )
            // InternalUseCase.g:818:3: ( rule__Example__Group__0 )
            {
             before(grammarAccess.getExampleAccess().getGroup()); 
            // InternalUseCase.g:819:3: ( rule__Example__Group__0 )
            // InternalUseCase.g:819:4: rule__Example__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleGiven"
    // InternalUseCase.g:828:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalUseCase.g:829:1: ( ruleGiven EOF )
            // InternalUseCase.g:830:1: ruleGiven EOF
            {
             before(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            ruleGiven();

            state._fsp--;

             after(grammarAccess.getGivenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalUseCase.g:837:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:841:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalUseCase.g:842:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalUseCase.g:842:2: ( ( rule__Given__Group__0 ) )
            // InternalUseCase.g:843:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalUseCase.g:844:3: ( rule__Given__Group__0 )
            // InternalUseCase.g:844:4: rule__Given__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleGivenAnd"
    // InternalUseCase.g:853:1: entryRuleGivenAnd : ruleGivenAnd EOF ;
    public final void entryRuleGivenAnd() throws RecognitionException {
        try {
            // InternalUseCase.g:854:1: ( ruleGivenAnd EOF )
            // InternalUseCase.g:855:1: ruleGivenAnd EOF
            {
             before(grammarAccess.getGivenAndRule()); 
            pushFollow(FOLLOW_1);
            ruleGivenAnd();

            state._fsp--;

             after(grammarAccess.getGivenAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGivenAnd"


    // $ANTLR start "ruleGivenAnd"
    // InternalUseCase.g:862:1: ruleGivenAnd : ( ( rule__GivenAnd__Group__0 ) ) ;
    public final void ruleGivenAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:866:2: ( ( ( rule__GivenAnd__Group__0 ) ) )
            // InternalUseCase.g:867:2: ( ( rule__GivenAnd__Group__0 ) )
            {
            // InternalUseCase.g:867:2: ( ( rule__GivenAnd__Group__0 ) )
            // InternalUseCase.g:868:3: ( rule__GivenAnd__Group__0 )
            {
             before(grammarAccess.getGivenAndAccess().getGroup()); 
            // InternalUseCase.g:869:3: ( rule__GivenAnd__Group__0 )
            // InternalUseCase.g:869:4: rule__GivenAnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GivenAnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGivenAnd"


    // $ANTLR start "entryRuleWhen"
    // InternalUseCase.g:878:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalUseCase.g:879:1: ( ruleWhen EOF )
            // InternalUseCase.g:880:1: ruleWhen EOF
            {
             before(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getWhenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalUseCase.g:887:1: ruleWhen : ( ( rule__When__Group__0 ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:891:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalUseCase.g:892:2: ( ( rule__When__Group__0 ) )
            {
            // InternalUseCase.g:892:2: ( ( rule__When__Group__0 ) )
            // InternalUseCase.g:893:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalUseCase.g:894:3: ( rule__When__Group__0 )
            // InternalUseCase.g:894:4: rule__When__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleWhenAnd"
    // InternalUseCase.g:903:1: entryRuleWhenAnd : ruleWhenAnd EOF ;
    public final void entryRuleWhenAnd() throws RecognitionException {
        try {
            // InternalUseCase.g:904:1: ( ruleWhenAnd EOF )
            // InternalUseCase.g:905:1: ruleWhenAnd EOF
            {
             before(grammarAccess.getWhenAndRule()); 
            pushFollow(FOLLOW_1);
            ruleWhenAnd();

            state._fsp--;

             after(grammarAccess.getWhenAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhenAnd"


    // $ANTLR start "ruleWhenAnd"
    // InternalUseCase.g:912:1: ruleWhenAnd : ( ( rule__WhenAnd__Group__0 ) ) ;
    public final void ruleWhenAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:916:2: ( ( ( rule__WhenAnd__Group__0 ) ) )
            // InternalUseCase.g:917:2: ( ( rule__WhenAnd__Group__0 ) )
            {
            // InternalUseCase.g:917:2: ( ( rule__WhenAnd__Group__0 ) )
            // InternalUseCase.g:918:3: ( rule__WhenAnd__Group__0 )
            {
             before(grammarAccess.getWhenAndAccess().getGroup()); 
            // InternalUseCase.g:919:3: ( rule__WhenAnd__Group__0 )
            // InternalUseCase.g:919:4: rule__WhenAnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhenAnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhenAnd"


    // $ANTLR start "entryRuleThen"
    // InternalUseCase.g:928:1: entryRuleThen : ruleThen EOF ;
    public final void entryRuleThen() throws RecognitionException {
        try {
            // InternalUseCase.g:929:1: ( ruleThen EOF )
            // InternalUseCase.g:930:1: ruleThen EOF
            {
             before(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            ruleThen();

            state._fsp--;

             after(grammarAccess.getThenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalUseCase.g:937:1: ruleThen : ( ( rule__Then__Group__0 ) ) ;
    public final void ruleThen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:941:2: ( ( ( rule__Then__Group__0 ) ) )
            // InternalUseCase.g:942:2: ( ( rule__Then__Group__0 ) )
            {
            // InternalUseCase.g:942:2: ( ( rule__Then__Group__0 ) )
            // InternalUseCase.g:943:3: ( rule__Then__Group__0 )
            {
             before(grammarAccess.getThenAccess().getGroup()); 
            // InternalUseCase.g:944:3: ( rule__Then__Group__0 )
            // InternalUseCase.g:944:4: rule__Then__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleThenAnd"
    // InternalUseCase.g:953:1: entryRuleThenAnd : ruleThenAnd EOF ;
    public final void entryRuleThenAnd() throws RecognitionException {
        try {
            // InternalUseCase.g:954:1: ( ruleThenAnd EOF )
            // InternalUseCase.g:955:1: ruleThenAnd EOF
            {
             before(grammarAccess.getThenAndRule()); 
            pushFollow(FOLLOW_1);
            ruleThenAnd();

            state._fsp--;

             after(grammarAccess.getThenAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThenAnd"


    // $ANTLR start "ruleThenAnd"
    // InternalUseCase.g:962:1: ruleThenAnd : ( ( rule__ThenAnd__Group__0 ) ) ;
    public final void ruleThenAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:966:2: ( ( ( rule__ThenAnd__Group__0 ) ) )
            // InternalUseCase.g:967:2: ( ( rule__ThenAnd__Group__0 ) )
            {
            // InternalUseCase.g:967:2: ( ( rule__ThenAnd__Group__0 ) )
            // InternalUseCase.g:968:3: ( rule__ThenAnd__Group__0 )
            {
             before(grammarAccess.getThenAndAccess().getGroup()); 
            // InternalUseCase.g:969:3: ( rule__ThenAnd__Group__0 )
            // InternalUseCase.g:969:4: rule__ThenAnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ThenAnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThenAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThenAnd"


    // $ANTLR start "rule__Model__Alternatives_0"
    // InternalUseCase.g:977:1: rule__Model__Alternatives_0 : ( ( 'Firma' ) | ( 'Company' ) );
    public final void rule__Model__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:981:1: ( ( 'Firma' ) | ( 'Company' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUseCase.g:982:2: ( 'Firma' )
                    {
                    // InternalUseCase.g:982:2: ( 'Firma' )
                    // InternalUseCase.g:983:3: 'Firma'
                    {
                     before(grammarAccess.getModelAccess().getFirmaKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getFirmaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:988:2: ( 'Company' )
                    {
                    // InternalUseCase.g:988:2: ( 'Company' )
                    // InternalUseCase.g:989:3: 'Company'
                    {
                     before(grammarAccess.getModelAccess().getCompanyKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getCompanyKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_0"


    // $ANTLR start "rule__Package__Alternatives_0"
    // InternalUseCase.g:998:1: rule__Package__Alternatives_0 : ( ( 'Kathegorie' ) | ( 'package' ) );
    public final void rule__Package__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1002:1: ( ( 'Kathegorie' ) | ( 'package' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCase.g:1003:2: ( 'Kathegorie' )
                    {
                    // InternalUseCase.g:1003:2: ( 'Kathegorie' )
                    // InternalUseCase.g:1004:3: 'Kathegorie'
                    {
                     before(grammarAccess.getPackageAccess().getKathegorieKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getKathegorieKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1009:2: ( 'package' )
                    {
                    // InternalUseCase.g:1009:2: ( 'package' )
                    // InternalUseCase.g:1010:3: 'package'
                    {
                     before(grammarAccess.getPackageAccess().getPackageKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getPackageKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Alternatives_0"


    // $ANTLR start "rule__UseCase__Alternatives_0"
    // InternalUseCase.g:1019:1: rule__UseCase__Alternatives_0 : ( ( 'use-case' ) | ( 'Rezept' ) );
    public final void rule__UseCase__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1023:1: ( ( 'use-case' ) | ( 'Rezept' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUseCase.g:1024:2: ( 'use-case' )
                    {
                    // InternalUseCase.g:1024:2: ( 'use-case' )
                    // InternalUseCase.g:1025:3: 'use-case'
                    {
                     before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1030:2: ( 'Rezept' )
                    {
                    // InternalUseCase.g:1030:2: ( 'Rezept' )
                    // InternalUseCase.g:1031:3: 'Rezept'
                    {
                     before(grammarAccess.getUseCaseAccess().getRezeptKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getUseCaseAccess().getRezeptKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Alternatives_0"


    // $ANTLR start "rule__UseCase__Alternatives_10"
    // InternalUseCase.g:1040:1: rule__UseCase__Alternatives_10 : ( ( ( rule__UseCase__Group_10_0__0 ) ) | ( ( rule__UseCase__Group_10_1__0 ) ) );
    public final void rule__UseCase__Alternatives_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1044:1: ( ( ( rule__UseCase__Group_10_0__0 ) ) | ( ( rule__UseCase__Group_10_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==55) ) {
                alt4=1;
            }
            else if ( (LA4_0==57) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:1045:2: ( ( rule__UseCase__Group_10_0__0 ) )
                    {
                    // InternalUseCase.g:1045:2: ( ( rule__UseCase__Group_10_0__0 ) )
                    // InternalUseCase.g:1046:3: ( rule__UseCase__Group_10_0__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_10_0()); 
                    // InternalUseCase.g:1047:3: ( rule__UseCase__Group_10_0__0 )
                    // InternalUseCase.g:1047:4: rule__UseCase__Group_10_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_10_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseAccess().getGroup_10_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1051:2: ( ( rule__UseCase__Group_10_1__0 ) )
                    {
                    // InternalUseCase.g:1051:2: ( ( rule__UseCase__Group_10_1__0 ) )
                    // InternalUseCase.g:1052:3: ( rule__UseCase__Group_10_1__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_10_1()); 
                    // InternalUseCase.g:1053:3: ( rule__UseCase__Group_10_1__0 )
                    // InternalUseCase.g:1053:4: rule__UseCase__Group_10_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_10_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseAccess().getGroup_10_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Alternatives_10"


    // $ANTLR start "rule__Description__Alternatives_0"
    // InternalUseCase.g:1061:1: rule__Description__Alternatives_0 : ( ( 'description:' ) | ( 'Kurzbeschreibung:' ) | ( 'Beschreibung' ) );
    public final void rule__Description__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1065:1: ( ( 'description:' ) | ( 'Kurzbeschreibung:' ) | ( 'Beschreibung' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUseCase.g:1066:2: ( 'description:' )
                    {
                    // InternalUseCase.g:1066:2: ( 'description:' )
                    // InternalUseCase.g:1067:3: 'description:'
                    {
                     before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1072:2: ( 'Kurzbeschreibung:' )
                    {
                    // InternalUseCase.g:1072:2: ( 'Kurzbeschreibung:' )
                    // InternalUseCase.g:1073:3: 'Kurzbeschreibung:'
                    {
                     before(grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:1078:2: ( 'Beschreibung' )
                    {
                    // InternalUseCase.g:1078:2: ( 'Beschreibung' )
                    // InternalUseCase.g:1079:3: 'Beschreibung'
                    {
                     before(grammarAccess.getDescriptionAccess().getBeschreibungKeyword_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getDescriptionAccess().getBeschreibungKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Alternatives_0"


    // $ANTLR start "rule__AllowedUserGroups__Alternatives_0"
    // InternalUseCase.g:1088:1: rule__AllowedUserGroups__Alternatives_0 : ( ( 'allowed-usergroups:' ) | ( ( rule__AllowedUserGroups__Group_0_1__0 ) ) );
    public final void rule__AllowedUserGroups__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1092:1: ( ( 'allowed-usergroups:' ) | ( ( rule__AllowedUserGroups__Group_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==60) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:1093:2: ( 'allowed-usergroups:' )
                    {
                    // InternalUseCase.g:1093:2: ( 'allowed-usergroups:' )
                    // InternalUseCase.g:1094:3: 'allowed-usergroups:'
                    {
                     before(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1099:2: ( ( rule__AllowedUserGroups__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1099:2: ( ( rule__AllowedUserGroups__Group_0_1__0 ) )
                    // InternalUseCase.g:1100:3: ( rule__AllowedUserGroups__Group_0_1__0 )
                    {
                     before(grammarAccess.getAllowedUserGroupsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1101:3: ( rule__AllowedUserGroups__Group_0_1__0 )
                    // InternalUseCase.g:1101:4: rule__AllowedUserGroups__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllowedUserGroups__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAllowedUserGroupsAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroups__Alternatives_0"


    // $ANTLR start "rule__Inputs__Alternatives_0"
    // InternalUseCase.g:1109:1: rule__Inputs__Alternatives_0 : ( ( ( rule__Inputs__Alternatives_0_0 ) ) | ( ( rule__Inputs__Group_0_1__0 ) ) );
    public final void rule__Inputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1113:1: ( ( ( rule__Inputs__Alternatives_0_0 ) ) | ( ( rule__Inputs__Group_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=22 && LA7_0<=23)||LA7_0==63) ) {
                alt7=1;
            }
            else if ( (LA7_0==67) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:1114:2: ( ( rule__Inputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1114:2: ( ( rule__Inputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:1115:3: ( rule__Inputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getInputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1116:3: ( rule__Inputs__Alternatives_0_0 )
                    // InternalUseCase.g:1116:4: rule__Inputs__Alternatives_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inputs__Alternatives_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputsAccess().getAlternatives_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1120:2: ( ( rule__Inputs__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1120:2: ( ( rule__Inputs__Group_0_1__0 ) )
                    // InternalUseCase.g:1121:3: ( rule__Inputs__Group_0_1__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1122:3: ( rule__Inputs__Group_0_1__0 )
                    // InternalUseCase.g:1122:4: rule__Inputs__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inputs__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputsAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Alternatives_0"


    // $ANTLR start "rule__Inputs__Alternatives_0_0"
    // InternalUseCase.g:1130:1: rule__Inputs__Alternatives_0_0 : ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_0_2__0 ) ) );
    public final void rule__Inputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1134:1: ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_0_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 63:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:1135:2: ( 'requires:' )
                    {
                    // InternalUseCase.g:1135:2: ( 'requires:' )
                    // InternalUseCase.g:1136:3: 'requires:'
                    {
                     before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1141:2: ( 'require:' )
                    {
                    // InternalUseCase.g:1141:2: ( 'require:' )
                    // InternalUseCase.g:1142:3: 'require:'
                    {
                     before(grammarAccess.getInputsAccess().getRequireKeyword_0_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequireKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:1147:2: ( ( rule__Inputs__Group_0_0_2__0 ) )
                    {
                    // InternalUseCase.g:1147:2: ( ( rule__Inputs__Group_0_0_2__0 ) )
                    // InternalUseCase.g:1148:3: ( rule__Inputs__Group_0_0_2__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_0_2()); 
                    // InternalUseCase.g:1149:3: ( rule__Inputs__Group_0_0_2__0 )
                    // InternalUseCase.g:1149:4: rule__Inputs__Group_0_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inputs__Group_0_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputsAccess().getGroup_0_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Alternatives_0_0"


    // $ANTLR start "rule__OptionalInputs__Alternatives_0"
    // InternalUseCase.g:1157:1: rule__OptionalInputs__Alternatives_0 : ( ( ( rule__OptionalInputs__Alternatives_0_0 ) ) | ( ( rule__OptionalInputs__Group_0_1__0 ) ) );
    public final void rule__OptionalInputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1161:1: ( ( ( rule__OptionalInputs__Alternatives_0_0 ) ) | ( ( rule__OptionalInputs__Group_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11||LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25||LA9_0==70) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUseCase.g:1162:2: ( ( rule__OptionalInputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1162:2: ( ( rule__OptionalInputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:1163:3: ( rule__OptionalInputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getOptionalInputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1164:3: ( rule__OptionalInputs__Alternatives_0_0 )
                    // InternalUseCase.g:1164:4: rule__OptionalInputs__Alternatives_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OptionalInputs__Alternatives_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionalInputsAccess().getAlternatives_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1168:2: ( ( rule__OptionalInputs__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1168:2: ( ( rule__OptionalInputs__Group_0_1__0 ) )
                    // InternalUseCase.g:1169:3: ( rule__OptionalInputs__Group_0_1__0 )
                    {
                     before(grammarAccess.getOptionalInputsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1170:3: ( rule__OptionalInputs__Group_0_1__0 )
                    // InternalUseCase.g:1170:4: rule__OptionalInputs__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OptionalInputs__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionalInputsAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Alternatives_0"


    // $ANTLR start "rule__OptionalInputs__Alternatives_0_0"
    // InternalUseCase.g:1178:1: rule__OptionalInputs__Alternatives_0_0 : ( ( 'optional:' ) | ( ( rule__OptionalInputs__Group_0_0_1__0 ) ) );
    public final void rule__OptionalInputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1182:1: ( ( 'optional:' ) | ( ( rule__OptionalInputs__Group_0_0_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==11) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCase.g:1183:2: ( 'optional:' )
                    {
                    // InternalUseCase.g:1183:2: ( 'optional:' )
                    // InternalUseCase.g:1184:3: 'optional:'
                    {
                     before(grammarAccess.getOptionalInputsAccess().getOptionalKeyword_0_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOptionalInputsAccess().getOptionalKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1189:2: ( ( rule__OptionalInputs__Group_0_0_1__0 ) )
                    {
                    // InternalUseCase.g:1189:2: ( ( rule__OptionalInputs__Group_0_0_1__0 ) )
                    // InternalUseCase.g:1190:3: ( rule__OptionalInputs__Group_0_0_1__0 )
                    {
                     before(grammarAccess.getOptionalInputsAccess().getGroup_0_0_1()); 
                    // InternalUseCase.g:1191:3: ( rule__OptionalInputs__Group_0_0_1__0 )
                    // InternalUseCase.g:1191:4: rule__OptionalInputs__Group_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OptionalInputs__Group_0_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionalInputsAccess().getGroup_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Alternatives_0_0"


    // $ANTLR start "rule__OptionalInputs__Alternatives_0_1_0"
    // InternalUseCase.g:1199:1: rule__OptionalInputs__Alternatives_0_1_0 : ( ( ( rule__OptionalInputs__Group_0_1_0_0__0 ) ) | ( 'Optional' ) );
    public final void rule__OptionalInputs__Alternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1203:1: ( ( ( rule__OptionalInputs__Group_0_1_0_0__0 ) ) | ( 'Optional' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==70) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:1204:2: ( ( rule__OptionalInputs__Group_0_1_0_0__0 ) )
                    {
                    // InternalUseCase.g:1204:2: ( ( rule__OptionalInputs__Group_0_1_0_0__0 ) )
                    // InternalUseCase.g:1205:3: ( rule__OptionalInputs__Group_0_1_0_0__0 )
                    {
                     before(grammarAccess.getOptionalInputsAccess().getGroup_0_1_0_0()); 
                    // InternalUseCase.g:1206:3: ( rule__OptionalInputs__Group_0_1_0_0__0 )
                    // InternalUseCase.g:1206:4: rule__OptionalInputs__Group_0_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OptionalInputs__Group_0_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionalInputsAccess().getGroup_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1210:2: ( 'Optional' )
                    {
                    // InternalUseCase.g:1210:2: ( 'Optional' )
                    // InternalUseCase.g:1211:3: 'Optional'
                    {
                     before(grammarAccess.getOptionalInputsAccess().getOptionalKeyword_0_1_0_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOptionalInputsAccess().getOptionalKeyword_0_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Alternatives_0_1_0"


    // $ANTLR start "rule__Input__Alternatives_4_0"
    // InternalUseCase.g:1220:1: rule__Input__Alternatives_4_0 : ( ( 'as' ) | ( 'als' ) );
    public final void rule__Input__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1224:1: ( ( 'as' ) | ( 'als' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCase.g:1225:2: ( 'as' )
                    {
                    // InternalUseCase.g:1225:2: ( 'as' )
                    // InternalUseCase.g:1226:3: 'as'
                    {
                     before(grammarAccess.getInputAccess().getAsKeyword_4_0_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getAsKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1231:2: ( 'als' )
                    {
                    // InternalUseCase.g:1231:2: ( 'als' )
                    // InternalUseCase.g:1232:3: 'als'
                    {
                     before(grammarAccess.getInputAccess().getAlsKeyword_4_0_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getAlsKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Alternatives_4_0"


    // $ANTLR start "rule__Input__Alternatives_5_1"
    // InternalUseCase.g:1241:1: rule__Input__Alternatives_5_1 : ( ( 'e.g' ) | ( 'z.B.' ) );
    public final void rule__Input__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1245:1: ( ( 'e.g' ) | ( 'z.B.' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCase.g:1246:2: ( 'e.g' )
                    {
                    // InternalUseCase.g:1246:2: ( 'e.g' )
                    // InternalUseCase.g:1247:3: 'e.g'
                    {
                     before(grammarAccess.getInputAccess().getEGKeyword_5_1_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getEGKeyword_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1252:2: ( 'z.B.' )
                    {
                    // InternalUseCase.g:1252:2: ( 'z.B.' )
                    // InternalUseCase.g:1253:3: 'z.B.'
                    {
                     before(grammarAccess.getInputAccess().getZBKeyword_5_1_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getZBKeyword_5_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Alternatives_5_1"


    // $ANTLR start "rule__Outputs__Alternatives_0"
    // InternalUseCase.g:1262:1: rule__Outputs__Alternatives_0 : ( ( ( rule__Outputs__Alternatives_0_0 ) ) | ( 'Ergebnis:' ) );
    public final void rule__Outputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1266:1: ( ( ( rule__Outputs__Alternatives_0_0 ) ) | ( 'Ergebnis:' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=31 && LA14_0<=32)||LA14_0==73) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCase.g:1267:2: ( ( rule__Outputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1267:2: ( ( rule__Outputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:1268:3: ( rule__Outputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getOutputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1269:3: ( rule__Outputs__Alternatives_0_0 )
                    // InternalUseCase.g:1269:4: rule__Outputs__Alternatives_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Outputs__Alternatives_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOutputsAccess().getAlternatives_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1273:2: ( 'Ergebnis:' )
                    {
                    // InternalUseCase.g:1273:2: ( 'Ergebnis:' )
                    // InternalUseCase.g:1274:3: 'Ergebnis:'
                    {
                     before(grammarAccess.getOutputsAccess().getErgebnisKeyword_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getErgebnisKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Alternatives_0"


    // $ANTLR start "rule__Outputs__Alternatives_0_0"
    // InternalUseCase.g:1283:1: rule__Outputs__Alternatives_0_0 : ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_0_2__0 ) ) );
    public final void rule__Outputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1287:1: ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_0_2__0 ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 73:
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
                    // InternalUseCase.g:1288:2: ( 'produces:' )
                    {
                    // InternalUseCase.g:1288:2: ( 'produces:' )
                    // InternalUseCase.g:1289:3: 'produces:'
                    {
                     before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1294:2: ( 'produce:' )
                    {
                    // InternalUseCase.g:1294:2: ( 'produce:' )
                    // InternalUseCase.g:1295:3: 'produce:'
                    {
                     before(grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:1300:2: ( ( rule__Outputs__Group_0_0_2__0 ) )
                    {
                    // InternalUseCase.g:1300:2: ( ( rule__Outputs__Group_0_0_2__0 ) )
                    // InternalUseCase.g:1301:3: ( rule__Outputs__Group_0_0_2__0 )
                    {
                     before(grammarAccess.getOutputsAccess().getGroup_0_0_2()); 
                    // InternalUseCase.g:1302:3: ( rule__Outputs__Group_0_0_2__0 )
                    // InternalUseCase.g:1302:4: rule__Outputs__Group_0_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Outputs__Group_0_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOutputsAccess().getGroup_0_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Alternatives_0_0"


    // $ANTLR start "rule__Output__Alternatives_3_0"
    // InternalUseCase.g:1310:1: rule__Output__Alternatives_3_0 : ( ( 'as' ) | ( 'als' ) );
    public final void rule__Output__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1314:1: ( ( 'as' ) | ( 'als' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalUseCase.g:1315:2: ( 'as' )
                    {
                    // InternalUseCase.g:1315:2: ( 'as' )
                    // InternalUseCase.g:1316:3: 'as'
                    {
                     before(grammarAccess.getOutputAccess().getAsKeyword_3_0_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getAsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1321:2: ( 'als' )
                    {
                    // InternalUseCase.g:1321:2: ( 'als' )
                    // InternalUseCase.g:1322:3: 'als'
                    {
                     before(grammarAccess.getOutputAccess().getAlsKeyword_3_0_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getAlsKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Alternatives_3_0"


    // $ANTLR start "rule__Output__Alternatives_4_1"
    // InternalUseCase.g:1331:1: rule__Output__Alternatives_4_1 : ( ( 'e.g' ) | ( 'z.B.' ) );
    public final void rule__Output__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1335:1: ( ( 'e.g' ) | ( 'z.B.' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            else if ( (LA17_0==29) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCase.g:1336:2: ( 'e.g' )
                    {
                    // InternalUseCase.g:1336:2: ( 'e.g' )
                    // InternalUseCase.g:1337:3: 'e.g'
                    {
                     before(grammarAccess.getOutputAccess().getEGKeyword_4_1_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getEGKeyword_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1342:2: ( 'z.B.' )
                    {
                    // InternalUseCase.g:1342:2: ( 'z.B.' )
                    // InternalUseCase.g:1343:3: 'z.B.'
                    {
                     before(grammarAccess.getOutputAccess().getZBKeyword_4_1_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getZBKeyword_4_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Alternatives_4_1"


    // $ANTLR start "rule__PreConditions__Alternatives_0"
    // InternalUseCase.g:1352:1: rule__PreConditions__Alternatives_0 : ( ( ( rule__PreConditions__Alternatives_0_0 ) ) | ( 'Vorbedingungen:' ) );
    public final void rule__PreConditions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1356:1: ( ( ( rule__PreConditions__Alternatives_0_0 ) ) | ( 'Vorbedingungen:' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=34 && LA18_0<=35)) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCase.g:1357:2: ( ( rule__PreConditions__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1357:2: ( ( rule__PreConditions__Alternatives_0_0 ) )
                    // InternalUseCase.g:1358:3: ( rule__PreConditions__Alternatives_0_0 )
                    {
                     before(grammarAccess.getPreConditionsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1359:3: ( rule__PreConditions__Alternatives_0_0 )
                    // InternalUseCase.g:1359:4: rule__PreConditions__Alternatives_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PreConditions__Alternatives_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPreConditionsAccess().getAlternatives_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1363:2: ( 'Vorbedingungen:' )
                    {
                    // InternalUseCase.g:1363:2: ( 'Vorbedingungen:' )
                    // InternalUseCase.g:1364:3: 'Vorbedingungen:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getVorbedingungenKeyword_0_1()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getPreConditionsAccess().getVorbedingungenKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreConditions__Alternatives_0"


    // $ANTLR start "rule__PreConditions__Alternatives_0_0"
    // InternalUseCase.g:1373:1: rule__PreConditions__Alternatives_0_0 : ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) );
    public final void rule__PreConditions__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1377:1: ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
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
                    // InternalUseCase.g:1378:2: ( 'pre-condition:' )
                    {
                    // InternalUseCase.g:1378:2: ( 'pre-condition:' )
                    // InternalUseCase.g:1379:3: 'pre-condition:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1384:2: ( 'pre-conditions:' )
                    {
                    // InternalUseCase.g:1384:2: ( 'pre-conditions:' )
                    // InternalUseCase.g:1385:3: 'pre-conditions:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getPreConditionsKeyword_0_0_1()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getPreConditionsAccess().getPreConditionsKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreConditions__Alternatives_0_0"


    // $ANTLR start "rule__Steps__Alternatives_0"
    // InternalUseCase.g:1394:1: rule__Steps__Alternatives_0 : ( ( 'steps:' ) | ( 'Schritte:' ) );
    public final void rule__Steps__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1398:1: ( ( 'steps:' ) | ( 'Schritte:' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            else if ( (LA20_0==37) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCase.g:1399:2: ( 'steps:' )
                    {
                    // InternalUseCase.g:1399:2: ( 'steps:' )
                    // InternalUseCase.g:1400:3: 'steps:'
                    {
                     before(grammarAccess.getStepsAccess().getStepsKeyword_0_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getStepsAccess().getStepsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1405:2: ( 'Schritte:' )
                    {
                    // InternalUseCase.g:1405:2: ( 'Schritte:' )
                    // InternalUseCase.g:1406:3: 'Schritte:'
                    {
                     before(grammarAccess.getStepsAccess().getSchritteKeyword_0_1()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getStepsAccess().getSchritteKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__Alternatives_0"


    // $ANTLR start "rule__Step__Alternatives_1"
    // InternalUseCase.g:1415:1: rule__Step__Alternatives_1 : ( ( ( rule__Step__Group_1_0__0 ) ) | ( ( rule__Step__ErrorAssignment_1_1 ) ) | ( ( rule__Step__ConditionAssignment_1_2 ) ) | ( ( rule__Step__LoopAssignment_1_3 ) ) | ( ( rule__Step__ExceptionAssignment_1_4 ) ) );
    public final void rule__Step__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1419:1: ( ( ( rule__Step__Group_1_0__0 ) ) | ( ( rule__Step__ErrorAssignment_1_1 ) ) | ( ( rule__Step__ConditionAssignment_1_2 ) ) | ( ( rule__Step__LoopAssignment_1_3 ) ) | ( ( rule__Step__ExceptionAssignment_1_4 ) ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt21=1;
                }
                break;
            case 38:
            case 39:
                {
                alt21=2;
                }
                break;
            case 40:
            case 41:
                {
                alt21=3;
                }
                break;
            case 42:
            case 43:
                {
                alt21=4;
                }
                break;
            case 81:
            case 82:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:1420:2: ( ( rule__Step__Group_1_0__0 ) )
                    {
                    // InternalUseCase.g:1420:2: ( ( rule__Step__Group_1_0__0 ) )
                    // InternalUseCase.g:1421:3: ( rule__Step__Group_1_0__0 )
                    {
                     before(grammarAccess.getStepAccess().getGroup_1_0()); 
                    // InternalUseCase.g:1422:3: ( rule__Step__Group_1_0__0 )
                    // InternalUseCase.g:1422:4: rule__Step__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1426:2: ( ( rule__Step__ErrorAssignment_1_1 ) )
                    {
                    // InternalUseCase.g:1426:2: ( ( rule__Step__ErrorAssignment_1_1 ) )
                    // InternalUseCase.g:1427:3: ( rule__Step__ErrorAssignment_1_1 )
                    {
                     before(grammarAccess.getStepAccess().getErrorAssignment_1_1()); 
                    // InternalUseCase.g:1428:3: ( rule__Step__ErrorAssignment_1_1 )
                    // InternalUseCase.g:1428:4: rule__Step__ErrorAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__ErrorAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getErrorAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:1432:2: ( ( rule__Step__ConditionAssignment_1_2 ) )
                    {
                    // InternalUseCase.g:1432:2: ( ( rule__Step__ConditionAssignment_1_2 ) )
                    // InternalUseCase.g:1433:3: ( rule__Step__ConditionAssignment_1_2 )
                    {
                     before(grammarAccess.getStepAccess().getConditionAssignment_1_2()); 
                    // InternalUseCase.g:1434:3: ( rule__Step__ConditionAssignment_1_2 )
                    // InternalUseCase.g:1434:4: rule__Step__ConditionAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__ConditionAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getConditionAssignment_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCase.g:1438:2: ( ( rule__Step__LoopAssignment_1_3 ) )
                    {
                    // InternalUseCase.g:1438:2: ( ( rule__Step__LoopAssignment_1_3 ) )
                    // InternalUseCase.g:1439:3: ( rule__Step__LoopAssignment_1_3 )
                    {
                     before(grammarAccess.getStepAccess().getLoopAssignment_1_3()); 
                    // InternalUseCase.g:1440:3: ( rule__Step__LoopAssignment_1_3 )
                    // InternalUseCase.g:1440:4: rule__Step__LoopAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__LoopAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getLoopAssignment_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCase.g:1444:2: ( ( rule__Step__ExceptionAssignment_1_4 ) )
                    {
                    // InternalUseCase.g:1444:2: ( ( rule__Step__ExceptionAssignment_1_4 ) )
                    // InternalUseCase.g:1445:3: ( rule__Step__ExceptionAssignment_1_4 )
                    {
                     before(grammarAccess.getStepAccess().getExceptionAssignment_1_4()); 
                    // InternalUseCase.g:1446:3: ( rule__Step__ExceptionAssignment_1_4 )
                    // InternalUseCase.g:1446:4: rule__Step__ExceptionAssignment_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__ExceptionAssignment_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepAccess().getExceptionAssignment_1_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Alternatives_1"


    // $ANTLR start "rule__RaiseErrorConditional__Alternatives_0"
    // InternalUseCase.g:1454:1: rule__RaiseErrorConditional__Alternatives_0 : ( ( '.' ) | ( ':' ) );
    public final void rule__RaiseErrorConditional__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1458:1: ( ( '.' ) | ( ':' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            else if ( (LA22_0==39) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:1459:2: ( '.' )
                    {
                    // InternalUseCase.g:1459:2: ( '.' )
                    // InternalUseCase.g:1460:3: '.'
                    {
                     before(grammarAccess.getRaiseErrorConditionalAccess().getFullStopKeyword_0_0()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getRaiseErrorConditionalAccess().getFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1465:2: ( ':' )
                    {
                    // InternalUseCase.g:1465:2: ( ':' )
                    // InternalUseCase.g:1466:3: ':'
                    {
                     before(grammarAccess.getRaiseErrorConditionalAccess().getColonKeyword_0_1()); 
                    match(input,39,FOLLOW_2); 
                     after(grammarAccess.getRaiseErrorConditionalAccess().getColonKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Alternatives_0"


    // $ANTLR start "rule__RaiseErrorConditional__Alternatives_1"
    // InternalUseCase.g:1475:1: rule__RaiseErrorConditional__Alternatives_1 : ( ( ( rule__RaiseErrorConditional__Group_1_0__0 ) ) | ( ( rule__RaiseErrorConditional__Group_1_1__0 ) ) );
    public final void rule__RaiseErrorConditional__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1479:1: ( ( ( rule__RaiseErrorConditional__Group_1_0__0 ) ) | ( ( rule__RaiseErrorConditional__Group_1_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==75) ) {
                alt23=1;
            }
            else if ( (LA23_0==78) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:1480:2: ( ( rule__RaiseErrorConditional__Group_1_0__0 ) )
                    {
                    // InternalUseCase.g:1480:2: ( ( rule__RaiseErrorConditional__Group_1_0__0 ) )
                    // InternalUseCase.g:1481:3: ( rule__RaiseErrorConditional__Group_1_0__0 )
                    {
                     before(grammarAccess.getRaiseErrorConditionalAccess().getGroup_1_0()); 
                    // InternalUseCase.g:1482:3: ( rule__RaiseErrorConditional__Group_1_0__0 )
                    // InternalUseCase.g:1482:4: rule__RaiseErrorConditional__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RaiseErrorConditional__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRaiseErrorConditionalAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1486:2: ( ( rule__RaiseErrorConditional__Group_1_1__0 ) )
                    {
                    // InternalUseCase.g:1486:2: ( ( rule__RaiseErrorConditional__Group_1_1__0 ) )
                    // InternalUseCase.g:1487:3: ( rule__RaiseErrorConditional__Group_1_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorConditionalAccess().getGroup_1_1()); 
                    // InternalUseCase.g:1488:3: ( rule__RaiseErrorConditional__Group_1_1__0 )
                    // InternalUseCase.g:1488:4: rule__RaiseErrorConditional__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RaiseErrorConditional__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRaiseErrorConditionalAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Alternatives_1"


    // $ANTLR start "rule__RaiseErrorNow__Alternatives_0"
    // InternalUseCase.g:1496:1: rule__RaiseErrorNow__Alternatives_0 : ( ( ( rule__RaiseErrorNow__Group_0_0__0 ) ) | ( ( rule__RaiseErrorNow__Group_0_1__0 ) ) );
    public final void rule__RaiseErrorNow__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1500:1: ( ( ( rule__RaiseErrorNow__Group_0_0__0 ) ) | ( ( rule__RaiseErrorNow__Group_0_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==81) ) {
                alt24=1;
            }
            else if ( (LA24_0==82) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:1501:2: ( ( rule__RaiseErrorNow__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1501:2: ( ( rule__RaiseErrorNow__Group_0_0__0 ) )
                    // InternalUseCase.g:1502:3: ( rule__RaiseErrorNow__Group_0_0__0 )
                    {
                     before(grammarAccess.getRaiseErrorNowAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1503:3: ( rule__RaiseErrorNow__Group_0_0__0 )
                    // InternalUseCase.g:1503:4: rule__RaiseErrorNow__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RaiseErrorNow__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRaiseErrorNowAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1507:2: ( ( rule__RaiseErrorNow__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1507:2: ( ( rule__RaiseErrorNow__Group_0_1__0 ) )
                    // InternalUseCase.g:1508:3: ( rule__RaiseErrorNow__Group_0_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorNowAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1509:3: ( rule__RaiseErrorNow__Group_0_1__0 )
                    // InternalUseCase.g:1509:4: rule__RaiseErrorNow__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RaiseErrorNow__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRaiseErrorNowAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Alternatives_0"


    // $ANTLR start "rule__IfStatement__Alternatives_0"
    // InternalUseCase.g:1517:1: rule__IfStatement__Alternatives_0 : ( ( 'If' ) | ( 'Falls' ) );
    public final void rule__IfStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1521:1: ( ( 'If' ) | ( 'Falls' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            else if ( (LA25_0==41) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCase.g:1522:2: ( 'If' )
                    {
                    // InternalUseCase.g:1522:2: ( 'If' )
                    // InternalUseCase.g:1523:3: 'If'
                    {
                     before(grammarAccess.getIfStatementAccess().getIfKeyword_0_0()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getIfStatementAccess().getIfKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1528:2: ( 'Falls' )
                    {
                    // InternalUseCase.g:1528:2: ( 'Falls' )
                    // InternalUseCase.g:1529:3: 'Falls'
                    {
                     before(grammarAccess.getIfStatementAccess().getFallsKeyword_0_1()); 
                    match(input,41,FOLLOW_2); 
                     after(grammarAccess.getIfStatementAccess().getFallsKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Alternatives_0"


    // $ANTLR start "rule__Loop__Alternatives_0"
    // InternalUseCase.g:1538:1: rule__Loop__Alternatives_0 : ( ( 'Solange' ) | ( 'While' ) );
    public final void rule__Loop__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1542:1: ( ( 'Solange' ) | ( 'While' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            else if ( (LA26_0==43) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCase.g:1543:2: ( 'Solange' )
                    {
                    // InternalUseCase.g:1543:2: ( 'Solange' )
                    // InternalUseCase.g:1544:3: 'Solange'
                    {
                     before(grammarAccess.getLoopAccess().getSolangeKeyword_0_0()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getLoopAccess().getSolangeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1549:2: ( 'While' )
                    {
                    // InternalUseCase.g:1549:2: ( 'While' )
                    // InternalUseCase.g:1550:3: 'While'
                    {
                     before(grammarAccess.getLoopAccess().getWhileKeyword_0_1()); 
                    match(input,43,FOLLOW_2); 
                     after(grammarAccess.getLoopAccess().getWhileKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Alternatives_0"


    // $ANTLR start "rule__Notes__Alternatives_0"
    // InternalUseCase.g:1559:1: rule__Notes__Alternatives_0 : ( ( ( rule__Notes__Alternatives_0_0 ) ) | ( ( rule__Notes__Alternatives_0_1 ) ) );
    public final void rule__Notes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1563:1: ( ( ( rule__Notes__Alternatives_0_0 ) ) | ( ( rule__Notes__Alternatives_0_1 ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=44 && LA27_0<=45)) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=46 && LA27_0<=47)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalUseCase.g:1564:2: ( ( rule__Notes__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1564:2: ( ( rule__Notes__Alternatives_0_0 ) )
                    // InternalUseCase.g:1565:3: ( rule__Notes__Alternatives_0_0 )
                    {
                     before(grammarAccess.getNotesAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1566:3: ( rule__Notes__Alternatives_0_0 )
                    // InternalUseCase.g:1566:4: rule__Notes__Alternatives_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Notes__Alternatives_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotesAccess().getAlternatives_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1570:2: ( ( rule__Notes__Alternatives_0_1 ) )
                    {
                    // InternalUseCase.g:1570:2: ( ( rule__Notes__Alternatives_0_1 ) )
                    // InternalUseCase.g:1571:3: ( rule__Notes__Alternatives_0_1 )
                    {
                     before(grammarAccess.getNotesAccess().getAlternatives_0_1()); 
                    // InternalUseCase.g:1572:3: ( rule__Notes__Alternatives_0_1 )
                    // InternalUseCase.g:1572:4: rule__Notes__Alternatives_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Notes__Alternatives_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotesAccess().getAlternatives_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notes__Alternatives_0"


    // $ANTLR start "rule__Notes__Alternatives_0_0"
    // InternalUseCase.g:1580:1: rule__Notes__Alternatives_0_0 : ( ( 'notes:' ) | ( 'note:' ) );
    public final void rule__Notes__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1584:1: ( ( 'notes:' ) | ( 'note:' ) )
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
                    // InternalUseCase.g:1585:2: ( 'notes:' )
                    {
                    // InternalUseCase.g:1585:2: ( 'notes:' )
                    // InternalUseCase.g:1586:3: 'notes:'
                    {
                     before(grammarAccess.getNotesAccess().getNotesKeyword_0_0_0()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getNotesKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1591:2: ( 'note:' )
                    {
                    // InternalUseCase.g:1591:2: ( 'note:' )
                    // InternalUseCase.g:1592:3: 'note:'
                    {
                     before(grammarAccess.getNotesAccess().getNoteKeyword_0_0_1()); 
                    match(input,45,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getNoteKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notes__Alternatives_0_0"


    // $ANTLR start "rule__Notes__Alternatives_0_1"
    // InternalUseCase.g:1601:1: rule__Notes__Alternatives_0_1 : ( ( 'Anmerkungen:' ) | ( 'Anmerkung:' ) );
    public final void rule__Notes__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1605:1: ( ( 'Anmerkungen:' ) | ( 'Anmerkung:' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            else if ( (LA29_0==47) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalUseCase.g:1606:2: ( 'Anmerkungen:' )
                    {
                    // InternalUseCase.g:1606:2: ( 'Anmerkungen:' )
                    // InternalUseCase.g:1607:3: 'Anmerkungen:'
                    {
                     before(grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1612:2: ( 'Anmerkung:' )
                    {
                    // InternalUseCase.g:1612:2: ( 'Anmerkung:' )
                    // InternalUseCase.g:1613:3: 'Anmerkung:'
                    {
                     before(grammarAccess.getNotesAccess().getAnmerkungKeyword_0_1_1()); 
                    match(input,47,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getAnmerkungKeyword_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notes__Alternatives_0_1"


    // $ANTLR start "rule__UsedTypes__Alternatives_0"
    // InternalUseCase.g:1622:1: rule__UsedTypes__Alternatives_0 : ( ( ( rule__UsedTypes__Group_0_0__0 ) ) | ( ( rule__UsedTypes__Group_0_1__0 ) ) );
    public final void rule__UsedTypes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1626:1: ( ( ( rule__UsedTypes__Group_0_0__0 ) ) | ( ( rule__UsedTypes__Group_0_1__0 ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==83) ) {
                alt30=1;
            }
            else if ( (LA30_0==85) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalUseCase.g:1627:2: ( ( rule__UsedTypes__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1627:2: ( ( rule__UsedTypes__Group_0_0__0 ) )
                    // InternalUseCase.g:1628:3: ( rule__UsedTypes__Group_0_0__0 )
                    {
                     before(grammarAccess.getUsedTypesAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1629:3: ( rule__UsedTypes__Group_0_0__0 )
                    // InternalUseCase.g:1629:4: rule__UsedTypes__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UsedTypes__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUsedTypesAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1633:2: ( ( rule__UsedTypes__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1633:2: ( ( rule__UsedTypes__Group_0_1__0 ) )
                    // InternalUseCase.g:1634:3: ( rule__UsedTypes__Group_0_1__0 )
                    {
                     before(grammarAccess.getUsedTypesAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1635:3: ( rule__UsedTypes__Group_0_1__0 )
                    // InternalUseCase.g:1635:4: rule__UsedTypes__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UsedTypes__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUsedTypesAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Alternatives_0"


    // $ANTLR start "rule__UsedExceptions__Alternatives_0"
    // InternalUseCase.g:1643:1: rule__UsedExceptions__Alternatives_0 : ( ( ( rule__UsedExceptions__Group_0_0__0 ) ) | ( ( rule__UsedExceptions__Group_0_1__0 ) ) );
    public final void rule__UsedExceptions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1647:1: ( ( ( rule__UsedExceptions__Group_0_0__0 ) ) | ( ( rule__UsedExceptions__Group_0_1__0 ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==83) ) {
                alt31=1;
            }
            else if ( (LA31_0==85) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalUseCase.g:1648:2: ( ( rule__UsedExceptions__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1648:2: ( ( rule__UsedExceptions__Group_0_0__0 ) )
                    // InternalUseCase.g:1649:3: ( rule__UsedExceptions__Group_0_0__0 )
                    {
                     before(grammarAccess.getUsedExceptionsAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1650:3: ( rule__UsedExceptions__Group_0_0__0 )
                    // InternalUseCase.g:1650:4: rule__UsedExceptions__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UsedExceptions__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUsedExceptionsAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1654:2: ( ( rule__UsedExceptions__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1654:2: ( ( rule__UsedExceptions__Group_0_1__0 ) )
                    // InternalUseCase.g:1655:3: ( rule__UsedExceptions__Group_0_1__0 )
                    {
                     before(grammarAccess.getUsedExceptionsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1656:3: ( rule__UsedExceptions__Group_0_1__0 )
                    // InternalUseCase.g:1656:4: rule__UsedExceptions__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UsedExceptions__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUsedExceptionsAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Alternatives_0"


    // $ANTLR start "rule__Given__Alternatives_0"
    // InternalUseCase.g:1664:1: rule__Given__Alternatives_0 : ( ( 'Gegeben' ) | ( 'gegeben' ) );
    public final void rule__Given__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1668:1: ( ( 'Gegeben' ) | ( 'gegeben' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            else if ( (LA32_0==49) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalUseCase.g:1669:2: ( 'Gegeben' )
                    {
                    // InternalUseCase.g:1669:2: ( 'Gegeben' )
                    // InternalUseCase.g:1670:3: 'Gegeben'
                    {
                     before(grammarAccess.getGivenAccess().getGegebenKeyword_0_0()); 
                    match(input,48,FOLLOW_2); 
                     after(grammarAccess.getGivenAccess().getGegebenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1675:2: ( 'gegeben' )
                    {
                    // InternalUseCase.g:1675:2: ( 'gegeben' )
                    // InternalUseCase.g:1676:3: 'gegeben'
                    {
                     before(grammarAccess.getGivenAccess().getGegebenKeyword_0_1()); 
                    match(input,49,FOLLOW_2); 
                     after(grammarAccess.getGivenAccess().getGegebenKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Alternatives_0"


    // $ANTLR start "rule__GivenAnd__Alternatives_0"
    // InternalUseCase.g:1685:1: rule__GivenAnd__Alternatives_0 : ( ( 'und' ) | ( 'aber' ) );
    public final void rule__GivenAnd__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1689:1: ( ( 'und' ) | ( 'aber' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            else if ( (LA33_0==51) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalUseCase.g:1690:2: ( 'und' )
                    {
                    // InternalUseCase.g:1690:2: ( 'und' )
                    // InternalUseCase.g:1691:3: 'und'
                    {
                     before(grammarAccess.getGivenAndAccess().getUndKeyword_0_0()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getGivenAndAccess().getUndKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1696:2: ( 'aber' )
                    {
                    // InternalUseCase.g:1696:2: ( 'aber' )
                    // InternalUseCase.g:1697:3: 'aber'
                    {
                     before(grammarAccess.getGivenAndAccess().getAberKeyword_0_1()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getGivenAndAccess().getAberKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenAnd__Alternatives_0"


    // $ANTLR start "rule__WhenAnd__Alternatives_0"
    // InternalUseCase.g:1706:1: rule__WhenAnd__Alternatives_0 : ( ( 'und' ) | ( 'aber' ) );
    public final void rule__WhenAnd__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1710:1: ( ( 'und' ) | ( 'aber' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            else if ( (LA34_0==51) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalUseCase.g:1711:2: ( 'und' )
                    {
                    // InternalUseCase.g:1711:2: ( 'und' )
                    // InternalUseCase.g:1712:3: 'und'
                    {
                     before(grammarAccess.getWhenAndAccess().getUndKeyword_0_0()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getWhenAndAccess().getUndKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1717:2: ( 'aber' )
                    {
                    // InternalUseCase.g:1717:2: ( 'aber' )
                    // InternalUseCase.g:1718:3: 'aber'
                    {
                     before(grammarAccess.getWhenAndAccess().getAberKeyword_0_1()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getWhenAndAccess().getAberKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenAnd__Alternatives_0"


    // $ANTLR start "rule__Then__Alternatives_0"
    // InternalUseCase.g:1727:1: rule__Then__Alternatives_0 : ( ( 'Dann' ) | ( 'dann' ) );
    public final void rule__Then__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1731:1: ( ( 'Dann' ) | ( 'dann' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            else if ( (LA35_0==53) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalUseCase.g:1732:2: ( 'Dann' )
                    {
                    // InternalUseCase.g:1732:2: ( 'Dann' )
                    // InternalUseCase.g:1733:3: 'Dann'
                    {
                     before(grammarAccess.getThenAccess().getDannKeyword_0_0()); 
                    match(input,52,FOLLOW_2); 
                     after(grammarAccess.getThenAccess().getDannKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1738:2: ( 'dann' )
                    {
                    // InternalUseCase.g:1738:2: ( 'dann' )
                    // InternalUseCase.g:1739:3: 'dann'
                    {
                     before(grammarAccess.getThenAccess().getDannKeyword_0_1()); 
                    match(input,53,FOLLOW_2); 
                     after(grammarAccess.getThenAccess().getDannKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Alternatives_0"


    // $ANTLR start "rule__ThenAnd__Alternatives_0"
    // InternalUseCase.g:1748:1: rule__ThenAnd__Alternatives_0 : ( ( 'und' ) | ( 'aber' ) );
    public final void rule__ThenAnd__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1752:1: ( ( 'und' ) | ( 'aber' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            else if ( (LA36_0==51) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalUseCase.g:1753:2: ( 'und' )
                    {
                    // InternalUseCase.g:1753:2: ( 'und' )
                    // InternalUseCase.g:1754:3: 'und'
                    {
                     before(grammarAccess.getThenAndAccess().getUndKeyword_0_0()); 
                    match(input,50,FOLLOW_2); 
                     after(grammarAccess.getThenAndAccess().getUndKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1759:2: ( 'aber' )
                    {
                    // InternalUseCase.g:1759:2: ( 'aber' )
                    // InternalUseCase.g:1760:3: 'aber'
                    {
                     before(grammarAccess.getThenAndAccess().getAberKeyword_0_1()); 
                    match(input,51,FOLLOW_2); 
                     after(grammarAccess.getThenAndAccess().getAberKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenAnd__Alternatives_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalUseCase.g:1769:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1773:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUseCase.g:1774:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalUseCase.g:1781:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1785:1: ( ( ( rule__Model__Alternatives_0 ) ) )
            // InternalUseCase.g:1786:1: ( ( rule__Model__Alternatives_0 ) )
            {
            // InternalUseCase.g:1786:1: ( ( rule__Model__Alternatives_0 ) )
            // InternalUseCase.g:1787:2: ( rule__Model__Alternatives_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_0()); 
            // InternalUseCase.g:1788:2: ( rule__Model__Alternatives_0 )
            // InternalUseCase.g:1788:3: rule__Model__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalUseCase.g:1796:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1800:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUseCase.g:1801:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalUseCase.g:1808:1: rule__Model__Group__1__Impl : ( ( rule__Model__CompanyAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1812:1: ( ( ( rule__Model__CompanyAssignment_1 ) ) )
            // InternalUseCase.g:1813:1: ( ( rule__Model__CompanyAssignment_1 ) )
            {
            // InternalUseCase.g:1813:1: ( ( rule__Model__CompanyAssignment_1 ) )
            // InternalUseCase.g:1814:2: ( rule__Model__CompanyAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getCompanyAssignment_1()); 
            // InternalUseCase.g:1815:2: ( rule__Model__CompanyAssignment_1 )
            // InternalUseCase.g:1815:3: rule__Model__CompanyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__CompanyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getCompanyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalUseCase.g:1823:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1827:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalUseCase.g:1828:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalUseCase.g:1835:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackageAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1839:1: ( ( ( rule__Model__PackageAssignment_2 ) ) )
            // InternalUseCase.g:1840:1: ( ( rule__Model__PackageAssignment_2 ) )
            {
            // InternalUseCase.g:1840:1: ( ( rule__Model__PackageAssignment_2 ) )
            // InternalUseCase.g:1841:2: ( rule__Model__PackageAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getPackageAssignment_2()); 
            // InternalUseCase.g:1842:2: ( rule__Model__PackageAssignment_2 )
            // InternalUseCase.g:1842:3: rule__Model__PackageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__PackageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPackageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalUseCase.g:1850:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1854:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalUseCase.g:1855:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalUseCase.g:1862:1: rule__Model__Group__3__Impl : ( ( rule__Model__UseCasesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1866:1: ( ( ( rule__Model__UseCasesAssignment_3 )* ) )
            // InternalUseCase.g:1867:1: ( ( rule__Model__UseCasesAssignment_3 )* )
            {
            // InternalUseCase.g:1867:1: ( ( rule__Model__UseCasesAssignment_3 )* )
            // InternalUseCase.g:1868:2: ( rule__Model__UseCasesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getUseCasesAssignment_3()); 
            // InternalUseCase.g:1869:2: ( rule__Model__UseCasesAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=16 && LA37_0<=17)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalUseCase.g:1869:3: rule__Model__UseCasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__UseCasesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getUseCasesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalUseCase.g:1877:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1881:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalUseCase.g:1882:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalUseCase.g:1889:1: rule__Model__Group__4__Impl : ( ( rule__Model__TypesAssignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1893:1: ( ( ( rule__Model__TypesAssignment_4 )? ) )
            // InternalUseCase.g:1894:1: ( ( rule__Model__TypesAssignment_4 )? )
            {
            // InternalUseCase.g:1894:1: ( ( rule__Model__TypesAssignment_4 )? )
            // InternalUseCase.g:1895:2: ( rule__Model__TypesAssignment_4 )?
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_4()); 
            // InternalUseCase.g:1896:2: ( rule__Model__TypesAssignment_4 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==83) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==84) ) {
                    alt38=1;
                }
            }
            else if ( (LA38_0==85) ) {
                int LA38_2 = input.LA(2);

                if ( (LA38_2==86) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalUseCase.g:1896:3: rule__Model__TypesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__TypesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getTypesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalUseCase.g:1904:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1908:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalUseCase.g:1909:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalUseCase.g:1916:1: rule__Model__Group__5__Impl : ( ( rule__Model__ExceptionsAssignment_5 )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1920:1: ( ( ( rule__Model__ExceptionsAssignment_5 )? ) )
            // InternalUseCase.g:1921:1: ( ( rule__Model__ExceptionsAssignment_5 )? )
            {
            // InternalUseCase.g:1921:1: ( ( rule__Model__ExceptionsAssignment_5 )? )
            // InternalUseCase.g:1922:2: ( rule__Model__ExceptionsAssignment_5 )?
            {
             before(grammarAccess.getModelAccess().getExceptionsAssignment_5()); 
            // InternalUseCase.g:1923:2: ( rule__Model__ExceptionsAssignment_5 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==83||LA39_0==85) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUseCase.g:1923:3: rule__Model__ExceptionsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ExceptionsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getExceptionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalUseCase.g:1931:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1935:1: ( rule__Model__Group__6__Impl )
            // InternalUseCase.g:1936:2: rule__Model__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalUseCase.g:1942:1: rule__Model__Group__6__Impl : ( ( rule__Model__ExamplesAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1946:1: ( ( ( rule__Model__ExamplesAssignment_6 )* ) )
            // InternalUseCase.g:1947:1: ( ( rule__Model__ExamplesAssignment_6 )* )
            {
            // InternalUseCase.g:1947:1: ( ( rule__Model__ExamplesAssignment_6 )* )
            // InternalUseCase.g:1948:2: ( rule__Model__ExamplesAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getExamplesAssignment_6()); 
            // InternalUseCase.g:1949:2: ( rule__Model__ExamplesAssignment_6 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==91) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUseCase.g:1949:3: rule__Model__ExamplesAssignment_6
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__ExamplesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getExamplesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalUseCase.g:1958:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1962:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUseCase.g:1963:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalUseCase.g:1970:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1974:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1975:1: ( RULE_ID )
            {
            // InternalUseCase.g:1975:1: ( RULE_ID )
            // InternalUseCase.g:1976:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalUseCase.g:1985:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1989:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUseCase.g:1990:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalUseCase.g:1996:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2000:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUseCase.g:2001:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUseCase.g:2001:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUseCase.g:2002:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUseCase.g:2003:2: ( rule__QualifiedName__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==38) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUseCase.g:2003:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalUseCase.g:2012:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2016:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUseCase.g:2017:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalUseCase.g:2024:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2028:1: ( ( '.' ) )
            // InternalUseCase.g:2029:1: ( '.' )
            {
            // InternalUseCase.g:2029:1: ( '.' )
            // InternalUseCase.g:2030:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalUseCase.g:2039:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2043:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUseCase.g:2044:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalUseCase.g:2050:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2054:1: ( ( RULE_ID ) )
            // InternalUseCase.g:2055:1: ( RULE_ID )
            {
            // InternalUseCase.g:2055:1: ( RULE_ID )
            // InternalUseCase.g:2056:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNumber__Group__0"
    // InternalUseCase.g:2066:1: rule__QualifiedNumber__Group__0 : rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 ;
    public final void rule__QualifiedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2070:1: ( rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 )
            // InternalUseCase.g:2071:2: rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNumber__Group__0"


    // $ANTLR start "rule__QualifiedNumber__Group__0__Impl"
    // InternalUseCase.g:2078:1: rule__QualifiedNumber__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2082:1: ( ( RULE_INT ) )
            // InternalUseCase.g:2083:1: ( RULE_INT )
            {
            // InternalUseCase.g:2083:1: ( RULE_INT )
            // InternalUseCase.g:2084:2: RULE_INT
            {
             before(grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNumber__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNumber__Group__1"
    // InternalUseCase.g:2093:1: rule__QualifiedNumber__Group__1 : rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 ;
    public final void rule__QualifiedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2097:1: ( rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 )
            // InternalUseCase.g:2098:2: rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedNumber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNumber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNumber__Group__1"


    // $ANTLR start "rule__QualifiedNumber__Group__1__Impl"
    // InternalUseCase.g:2105:1: rule__QualifiedNumber__Group__1__Impl : ( ( rule__QualifiedNumber__Group_1__0 )* ) ;
    public final void rule__QualifiedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2109:1: ( ( ( rule__QualifiedNumber__Group_1__0 )* ) )
            // InternalUseCase.g:2110:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            {
            // InternalUseCase.g:2110:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            // InternalUseCase.g:2111:2: ( rule__QualifiedNumber__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup_1()); 
            // InternalUseCase.g:2112:2: ( rule__QualifiedNumber__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==38) ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==RULE_INT) ) {
                        alt42=1;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // InternalUseCase.g:2112:3: rule__QualifiedNumber__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedNumber__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getQualifiedNumberAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNumber__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNumber__Group__2"
    // InternalUseCase.g:2120:1: rule__QualifiedNumber__Group__2 : rule__QualifiedNumber__Group__2__Impl ;
    public final void rule__QualifiedNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2124:1: ( rule__QualifiedNumber__Group__2__Impl )
            // InternalUseCase.g:2125:2: rule__QualifiedNumber__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNumber__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNumber__Group__2"


    // $ANTLR start "rule__QualifiedNumber__Group__2__Impl"
    // InternalUseCase.g:2131:1: rule__QualifiedNumber__Group__2__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2135:1: ( ( '.' ) )
            // InternalUseCase.g:2136:1: ( '.' )
            {
            // InternalUseCase.g:2136:1: ( '.' )
            // InternalUseCase.g:2137:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNumber__Group__2__Impl"


    // $ANTLR start "rule__QualifiedNumber__Group_1__0"
    // InternalUseCase.g:2147:1: rule__QualifiedNumber__Group_1__0 : rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 ;
    public final void rule__QualifiedNumber__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2151:1: ( rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 )
            // InternalUseCase.g:2152:2: rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedNumber__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNumber__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNumber__Group_1__0"


    // $ANTLR start "rule__QualifiedNumber__Group_1__0__Impl"
    // InternalUseCase.g:2159:1: rule__QualifiedNumber__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2163:1: ( ( '.' ) )
            // InternalUseCase.g:2164:1: ( '.' )
            {
            // InternalUseCase.g:2164:1: ( '.' )
            // InternalUseCase.g:2165:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNumber__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNumber__Group_1__1"
    // InternalUseCase.g:2174:1: rule__QualifiedNumber__Group_1__1 : rule__QualifiedNumber__Group_1__1__Impl ;
    public final void rule__QualifiedNumber__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2178:1: ( rule__QualifiedNumber__Group_1__1__Impl )
            // InternalUseCase.g:2179:2: rule__QualifiedNumber__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNumber__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNumber__Group_1__1"


    // $ANTLR start "rule__QualifiedNumber__Group_1__1__Impl"
    // InternalUseCase.g:2185:1: rule__QualifiedNumber__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2189:1: ( ( RULE_INT ) )
            // InternalUseCase.g:2190:1: ( RULE_INT )
            {
            // InternalUseCase.g:2190:1: ( RULE_INT )
            // InternalUseCase.g:2191:2: RULE_INT
            {
             before(grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNumber__Group_1__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // InternalUseCase.g:2201:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2205:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalUseCase.g:2206:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalUseCase.g:2213:1: rule__Package__Group__0__Impl : ( ( rule__Package__Alternatives_0 ) ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2217:1: ( ( ( rule__Package__Alternatives_0 ) ) )
            // InternalUseCase.g:2218:1: ( ( rule__Package__Alternatives_0 ) )
            {
            // InternalUseCase.g:2218:1: ( ( rule__Package__Alternatives_0 ) )
            // InternalUseCase.g:2219:2: ( rule__Package__Alternatives_0 )
            {
             before(grammarAccess.getPackageAccess().getAlternatives_0()); 
            // InternalUseCase.g:2220:2: ( rule__Package__Alternatives_0 )
            // InternalUseCase.g:2220:3: rule__Package__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalUseCase.g:2228:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2232:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalUseCase.g:2233:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalUseCase.g:2240:1: rule__Package__Group__1__Impl : ( ( rule__Package__PartsAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2244:1: ( ( ( rule__Package__PartsAssignment_1 ) ) )
            // InternalUseCase.g:2245:1: ( ( rule__Package__PartsAssignment_1 ) )
            {
            // InternalUseCase.g:2245:1: ( ( rule__Package__PartsAssignment_1 ) )
            // InternalUseCase.g:2246:2: ( rule__Package__PartsAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getPartsAssignment_1()); 
            // InternalUseCase.g:2247:2: ( rule__Package__PartsAssignment_1 )
            // InternalUseCase.g:2247:3: rule__Package__PartsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__PartsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getPartsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalUseCase.g:2255:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2259:1: ( rule__Package__Group__2__Impl )
            // InternalUseCase.g:2260:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalUseCase.g:2266:1: rule__Package__Group__2__Impl : ( ( rule__Package__Group_2__0 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2270:1: ( ( ( rule__Package__Group_2__0 )* ) )
            // InternalUseCase.g:2271:1: ( ( rule__Package__Group_2__0 )* )
            {
            // InternalUseCase.g:2271:1: ( ( rule__Package__Group_2__0 )* )
            // InternalUseCase.g:2272:2: ( rule__Package__Group_2__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_2()); 
            // InternalUseCase.g:2273:2: ( rule__Package__Group_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==54) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUseCase.g:2273:3: rule__Package__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Package__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group_2__0"
    // InternalUseCase.g:2282:1: rule__Package__Group_2__0 : rule__Package__Group_2__0__Impl rule__Package__Group_2__1 ;
    public final void rule__Package__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2286:1: ( rule__Package__Group_2__0__Impl rule__Package__Group_2__1 )
            // InternalUseCase.g:2287:2: rule__Package__Group_2__0__Impl rule__Package__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__0"


    // $ANTLR start "rule__Package__Group_2__0__Impl"
    // InternalUseCase.g:2294:1: rule__Package__Group_2__0__Impl : ( '>' ) ;
    public final void rule__Package__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2298:1: ( ( '>' ) )
            // InternalUseCase.g:2299:1: ( '>' )
            {
            // InternalUseCase.g:2299:1: ( '>' )
            // InternalUseCase.g:2300:2: '>'
            {
             before(grammarAccess.getPackageAccess().getGreaterThanSignKeyword_2_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getGreaterThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__0__Impl"


    // $ANTLR start "rule__Package__Group_2__1"
    // InternalUseCase.g:2309:1: rule__Package__Group_2__1 : rule__Package__Group_2__1__Impl ;
    public final void rule__Package__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2313:1: ( rule__Package__Group_2__1__Impl )
            // InternalUseCase.g:2314:2: rule__Package__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__1"


    // $ANTLR start "rule__Package__Group_2__1__Impl"
    // InternalUseCase.g:2320:1: rule__Package__Group_2__1__Impl : ( ( rule__Package__PartsAssignment_2_1 ) ) ;
    public final void rule__Package__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2324:1: ( ( ( rule__Package__PartsAssignment_2_1 ) ) )
            // InternalUseCase.g:2325:1: ( ( rule__Package__PartsAssignment_2_1 ) )
            {
            // InternalUseCase.g:2325:1: ( ( rule__Package__PartsAssignment_2_1 ) )
            // InternalUseCase.g:2326:2: ( rule__Package__PartsAssignment_2_1 )
            {
             before(grammarAccess.getPackageAccess().getPartsAssignment_2_1()); 
            // InternalUseCase.g:2327:2: ( rule__Package__PartsAssignment_2_1 )
            // InternalUseCase.g:2327:3: rule__Package__PartsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__PartsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getPartsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__1__Impl"


    // $ANTLR start "rule__UseCase__Group__0"
    // InternalUseCase.g:2336:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2340:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCase.g:2341:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__UseCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0"


    // $ANTLR start "rule__UseCase__Group__0__Impl"
    // InternalUseCase.g:2348:1: rule__UseCase__Group__0__Impl : ( ( rule__UseCase__Alternatives_0 ) ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2352:1: ( ( ( rule__UseCase__Alternatives_0 ) ) )
            // InternalUseCase.g:2353:1: ( ( rule__UseCase__Alternatives_0 ) )
            {
            // InternalUseCase.g:2353:1: ( ( rule__UseCase__Alternatives_0 ) )
            // InternalUseCase.g:2354:2: ( rule__UseCase__Alternatives_0 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_0()); 
            // InternalUseCase.g:2355:2: ( rule__UseCase__Alternatives_0 )
            // InternalUseCase.g:2355:3: rule__UseCase__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0__Impl"


    // $ANTLR start "rule__UseCase__Group__1"
    // InternalUseCase.g:2363:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2367:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCase.g:2368:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1"


    // $ANTLR start "rule__UseCase__Group__1__Impl"
    // InternalUseCase.g:2375:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2379:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUseCase.g:2380:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUseCase.g:2380:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUseCase.g:2381:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUseCase.g:2382:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUseCase.g:2382:3: rule__UseCase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1__Impl"


    // $ANTLR start "rule__UseCase__Group__2"
    // InternalUseCase.g:2390:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2394:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCase.g:2395:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__2"


    // $ANTLR start "rule__UseCase__Group__2__Impl"
    // InternalUseCase.g:2402:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionsAssignment_2 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2406:1: ( ( ( rule__UseCase__DescriptionsAssignment_2 )? ) )
            // InternalUseCase.g:2407:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            {
            // InternalUseCase.g:2407:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            // InternalUseCase.g:2408:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); 
            // InternalUseCase.g:2409:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=18 && LA44_0<=20)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUseCase.g:2409:3: rule__UseCase__DescriptionsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__DescriptionsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__2__Impl"


    // $ANTLR start "rule__UseCase__Group__3"
    // InternalUseCase.g:2417:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2421:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCase.g:2422:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__3"


    // $ANTLR start "rule__UseCase__Group__3__Impl"
    // InternalUseCase.g:2429:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2433:1: ( ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) )
            // InternalUseCase.g:2434:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            {
            // InternalUseCase.g:2434:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            // InternalUseCase.g:2435:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            {
             before(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAssignment_3()); 
            // InternalUseCase.g:2436:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21||LA45_0==60) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUseCase.g:2436:3: rule__UseCase__AllowedUserGroupsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__AllowedUserGroupsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__3__Impl"


    // $ANTLR start "rule__UseCase__Group__4"
    // InternalUseCase.g:2444:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2448:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCase.g:2449:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__4"


    // $ANTLR start "rule__UseCase__Group__4__Impl"
    // InternalUseCase.g:2456:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__InputsAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2460:1: ( ( ( rule__UseCase__InputsAssignment_4 )? ) )
            // InternalUseCase.g:2461:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            {
            // InternalUseCase.g:2461:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            // InternalUseCase.g:2462:2: ( rule__UseCase__InputsAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getInputsAssignment_4()); 
            // InternalUseCase.g:2463:2: ( rule__UseCase__InputsAssignment_4 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=22 && LA46_0<=23)||LA46_0==63||LA46_0==67) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUseCase.g:2463:3: rule__UseCase__InputsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__InputsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getInputsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__4__Impl"


    // $ANTLR start "rule__UseCase__Group__5"
    // InternalUseCase.g:2471:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2475:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCase.g:2476:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__5"


    // $ANTLR start "rule__UseCase__Group__5__Impl"
    // InternalUseCase.g:2483:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__OptionalInputsAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2487:1: ( ( ( rule__UseCase__OptionalInputsAssignment_5 )? ) )
            // InternalUseCase.g:2488:1: ( ( rule__UseCase__OptionalInputsAssignment_5 )? )
            {
            // InternalUseCase.g:2488:1: ( ( rule__UseCase__OptionalInputsAssignment_5 )? )
            // InternalUseCase.g:2489:2: ( rule__UseCase__OptionalInputsAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getOptionalInputsAssignment_5()); 
            // InternalUseCase.g:2490:2: ( rule__UseCase__OptionalInputsAssignment_5 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==11||(LA47_0>=24 && LA47_0<=25)||LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUseCase.g:2490:3: rule__UseCase__OptionalInputsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__OptionalInputsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getOptionalInputsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__5__Impl"


    // $ANTLR start "rule__UseCase__Group__6"
    // InternalUseCase.g:2498:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2502:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCase.g:2503:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__6"


    // $ANTLR start "rule__UseCase__Group__6__Impl"
    // InternalUseCase.g:2510:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__OutputsAssignment_6 )? ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2514:1: ( ( ( rule__UseCase__OutputsAssignment_6 )? ) )
            // InternalUseCase.g:2515:1: ( ( rule__UseCase__OutputsAssignment_6 )? )
            {
            // InternalUseCase.g:2515:1: ( ( rule__UseCase__OutputsAssignment_6 )? )
            // InternalUseCase.g:2516:2: ( rule__UseCase__OutputsAssignment_6 )?
            {
             before(grammarAccess.getUseCaseAccess().getOutputsAssignment_6()); 
            // InternalUseCase.g:2517:2: ( rule__UseCase__OutputsAssignment_6 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=30 && LA48_0<=32)||LA48_0==73) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUseCase.g:2517:3: rule__UseCase__OutputsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__OutputsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getOutputsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__6__Impl"


    // $ANTLR start "rule__UseCase__Group__7"
    // InternalUseCase.g:2525:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2529:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCase.g:2530:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__7"


    // $ANTLR start "rule__UseCase__Group__7__Impl"
    // InternalUseCase.g:2537:1: rule__UseCase__Group__7__Impl : ( ( rule__UseCase__PreconditionsAssignment_7 )? ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2541:1: ( ( ( rule__UseCase__PreconditionsAssignment_7 )? ) )
            // InternalUseCase.g:2542:1: ( ( rule__UseCase__PreconditionsAssignment_7 )? )
            {
            // InternalUseCase.g:2542:1: ( ( rule__UseCase__PreconditionsAssignment_7 )? )
            // InternalUseCase.g:2543:2: ( rule__UseCase__PreconditionsAssignment_7 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_7()); 
            // InternalUseCase.g:2544:2: ( rule__UseCase__PreconditionsAssignment_7 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=33 && LA49_0<=35)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUseCase.g:2544:3: rule__UseCase__PreconditionsAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__PreconditionsAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__7__Impl"


    // $ANTLR start "rule__UseCase__Group__8"
    // InternalUseCase.g:2552:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2556:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCase.g:2557:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__8"


    // $ANTLR start "rule__UseCase__Group__8__Impl"
    // InternalUseCase.g:2564:1: rule__UseCase__Group__8__Impl : ( ( rule__UseCase__StepsAssignment_8 )? ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2568:1: ( ( ( rule__UseCase__StepsAssignment_8 )? ) )
            // InternalUseCase.g:2569:1: ( ( rule__UseCase__StepsAssignment_8 )? )
            {
            // InternalUseCase.g:2569:1: ( ( rule__UseCase__StepsAssignment_8 )? )
            // InternalUseCase.g:2570:2: ( rule__UseCase__StepsAssignment_8 )?
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_8()); 
            // InternalUseCase.g:2571:2: ( rule__UseCase__StepsAssignment_8 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=36 && LA50_0<=37)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUseCase.g:2571:3: rule__UseCase__StepsAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__StepsAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__8__Impl"


    // $ANTLR start "rule__UseCase__Group__9"
    // InternalUseCase.g:2579:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2583:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // InternalUseCase.g:2584:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__9"


    // $ANTLR start "rule__UseCase__Group__9__Impl"
    // InternalUseCase.g:2591:1: rule__UseCase__Group__9__Impl : ( ( rule__UseCase__NotesAssignment_9 )? ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2595:1: ( ( ( rule__UseCase__NotesAssignment_9 )? ) )
            // InternalUseCase.g:2596:1: ( ( rule__UseCase__NotesAssignment_9 )? )
            {
            // InternalUseCase.g:2596:1: ( ( rule__UseCase__NotesAssignment_9 )? )
            // InternalUseCase.g:2597:2: ( rule__UseCase__NotesAssignment_9 )?
            {
             before(grammarAccess.getUseCaseAccess().getNotesAssignment_9()); 
            // InternalUseCase.g:2598:2: ( rule__UseCase__NotesAssignment_9 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=44 && LA51_0<=47)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUseCase.g:2598:3: rule__UseCase__NotesAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__NotesAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getNotesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__9__Impl"


    // $ANTLR start "rule__UseCase__Group__10"
    // InternalUseCase.g:2606:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2610:1: ( rule__UseCase__Group__10__Impl )
            // InternalUseCase.g:2611:2: rule__UseCase__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__10"


    // $ANTLR start "rule__UseCase__Group__10__Impl"
    // InternalUseCase.g:2617:1: rule__UseCase__Group__10__Impl : ( ( rule__UseCase__Alternatives_10 ) ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2621:1: ( ( ( rule__UseCase__Alternatives_10 ) ) )
            // InternalUseCase.g:2622:1: ( ( rule__UseCase__Alternatives_10 ) )
            {
            // InternalUseCase.g:2622:1: ( ( rule__UseCase__Alternatives_10 ) )
            // InternalUseCase.g:2623:2: ( rule__UseCase__Alternatives_10 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_10()); 
            // InternalUseCase.g:2624:2: ( rule__UseCase__Alternatives_10 )
            // InternalUseCase.g:2624:3: rule__UseCase__Alternatives_10
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Alternatives_10();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getAlternatives_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__10__Impl"


    // $ANTLR start "rule__UseCase__Group_10_0__0"
    // InternalUseCase.g:2633:1: rule__UseCase__Group_10_0__0 : rule__UseCase__Group_10_0__0__Impl rule__UseCase__Group_10_0__1 ;
    public final void rule__UseCase__Group_10_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2637:1: ( rule__UseCase__Group_10_0__0__Impl rule__UseCase__Group_10_0__1 )
            // InternalUseCase.g:2638:2: rule__UseCase__Group_10_0__0__Impl rule__UseCase__Group_10_0__1
            {
            pushFollow(FOLLOW_15);
            rule__UseCase__Group_10_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_10_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_0__0"


    // $ANTLR start "rule__UseCase__Group_10_0__0__Impl"
    // InternalUseCase.g:2645:1: rule__UseCase__Group_10_0__0__Impl : ( 'end' ) ;
    public final void rule__UseCase__Group_10_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2649:1: ( ( 'end' ) )
            // InternalUseCase.g:2650:1: ( 'end' )
            {
            // InternalUseCase.g:2650:1: ( 'end' )
            // InternalUseCase.g:2651:2: 'end'
            {
             before(grammarAccess.getUseCaseAccess().getEndKeyword_10_0_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getEndKeyword_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_0__0__Impl"


    // $ANTLR start "rule__UseCase__Group_10_0__1"
    // InternalUseCase.g:2660:1: rule__UseCase__Group_10_0__1 : rule__UseCase__Group_10_0__1__Impl rule__UseCase__Group_10_0__2 ;
    public final void rule__UseCase__Group_10_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2664:1: ( rule__UseCase__Group_10_0__1__Impl rule__UseCase__Group_10_0__2 )
            // InternalUseCase.g:2665:2: rule__UseCase__Group_10_0__1__Impl rule__UseCase__Group_10_0__2
            {
            pushFollow(FOLLOW_16);
            rule__UseCase__Group_10_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_10_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_0__1"


    // $ANTLR start "rule__UseCase__Group_10_0__1__Impl"
    // InternalUseCase.g:2672:1: rule__UseCase__Group_10_0__1__Impl : ( 'of' ) ;
    public final void rule__UseCase__Group_10_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2676:1: ( ( 'of' ) )
            // InternalUseCase.g:2677:1: ( 'of' )
            {
            // InternalUseCase.g:2677:1: ( 'of' )
            // InternalUseCase.g:2678:2: 'of'
            {
             before(grammarAccess.getUseCaseAccess().getOfKeyword_10_0_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getOfKeyword_10_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_0__1__Impl"


    // $ANTLR start "rule__UseCase__Group_10_0__2"
    // InternalUseCase.g:2687:1: rule__UseCase__Group_10_0__2 : rule__UseCase__Group_10_0__2__Impl ;
    public final void rule__UseCase__Group_10_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2691:1: ( rule__UseCase__Group_10_0__2__Impl )
            // InternalUseCase.g:2692:2: rule__UseCase__Group_10_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_10_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_0__2"


    // $ANTLR start "rule__UseCase__Group_10_0__2__Impl"
    // InternalUseCase.g:2698:1: rule__UseCase__Group_10_0__2__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group_10_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2702:1: ( ( 'use-case' ) )
            // InternalUseCase.g:2703:1: ( 'use-case' )
            {
            // InternalUseCase.g:2703:1: ( 'use-case' )
            // InternalUseCase.g:2704:2: 'use-case'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_10_0_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_10_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_0__2__Impl"


    // $ANTLR start "rule__UseCase__Group_10_1__0"
    // InternalUseCase.g:2714:1: rule__UseCase__Group_10_1__0 : rule__UseCase__Group_10_1__0__Impl rule__UseCase__Group_10_1__1 ;
    public final void rule__UseCase__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2718:1: ( rule__UseCase__Group_10_1__0__Impl rule__UseCase__Group_10_1__1 )
            // InternalUseCase.g:2719:2: rule__UseCase__Group_10_1__0__Impl rule__UseCase__Group_10_1__1
            {
            pushFollow(FOLLOW_17);
            rule__UseCase__Group_10_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_10_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_1__0"


    // $ANTLR start "rule__UseCase__Group_10_1__0__Impl"
    // InternalUseCase.g:2726:1: rule__UseCase__Group_10_1__0__Impl : ( 'Ende' ) ;
    public final void rule__UseCase__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2730:1: ( ( 'Ende' ) )
            // InternalUseCase.g:2731:1: ( 'Ende' )
            {
            // InternalUseCase.g:2731:1: ( 'Ende' )
            // InternalUseCase.g:2732:2: 'Ende'
            {
             before(grammarAccess.getUseCaseAccess().getEndeKeyword_10_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getEndeKeyword_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_1__0__Impl"


    // $ANTLR start "rule__UseCase__Group_10_1__1"
    // InternalUseCase.g:2741:1: rule__UseCase__Group_10_1__1 : rule__UseCase__Group_10_1__1__Impl rule__UseCase__Group_10_1__2 ;
    public final void rule__UseCase__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2745:1: ( rule__UseCase__Group_10_1__1__Impl rule__UseCase__Group_10_1__2 )
            // InternalUseCase.g:2746:2: rule__UseCase__Group_10_1__1__Impl rule__UseCase__Group_10_1__2
            {
            pushFollow(FOLLOW_18);
            rule__UseCase__Group_10_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_10_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_1__1"


    // $ANTLR start "rule__UseCase__Group_10_1__1__Impl"
    // InternalUseCase.g:2753:1: rule__UseCase__Group_10_1__1__Impl : ( 'des' ) ;
    public final void rule__UseCase__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2757:1: ( ( 'des' ) )
            // InternalUseCase.g:2758:1: ( 'des' )
            {
            // InternalUseCase.g:2758:1: ( 'des' )
            // InternalUseCase.g:2759:2: 'des'
            {
             before(grammarAccess.getUseCaseAccess().getDesKeyword_10_1_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getDesKeyword_10_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_1__1__Impl"


    // $ANTLR start "rule__UseCase__Group_10_1__2"
    // InternalUseCase.g:2768:1: rule__UseCase__Group_10_1__2 : rule__UseCase__Group_10_1__2__Impl ;
    public final void rule__UseCase__Group_10_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2772:1: ( rule__UseCase__Group_10_1__2__Impl )
            // InternalUseCase.g:2773:2: rule__UseCase__Group_10_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_10_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_1__2"


    // $ANTLR start "rule__UseCase__Group_10_1__2__Impl"
    // InternalUseCase.g:2779:1: rule__UseCase__Group_10_1__2__Impl : ( 'Rezpets' ) ;
    public final void rule__UseCase__Group_10_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2783:1: ( ( 'Rezpets' ) )
            // InternalUseCase.g:2784:1: ( 'Rezpets' )
            {
            // InternalUseCase.g:2784:1: ( 'Rezpets' )
            // InternalUseCase.g:2785:2: 'Rezpets'
            {
             before(grammarAccess.getUseCaseAccess().getRezpetsKeyword_10_1_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getRezpetsKeyword_10_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_10_1__2__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalUseCase.g:2795:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2799:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalUseCase.g:2800:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalUseCase.g:2807:1: rule__Description__Group__0__Impl : ( ( rule__Description__Alternatives_0 ) ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2811:1: ( ( ( rule__Description__Alternatives_0 ) ) )
            // InternalUseCase.g:2812:1: ( ( rule__Description__Alternatives_0 ) )
            {
            // InternalUseCase.g:2812:1: ( ( rule__Description__Alternatives_0 ) )
            // InternalUseCase.g:2813:2: ( rule__Description__Alternatives_0 )
            {
             before(grammarAccess.getDescriptionAccess().getAlternatives_0()); 
            // InternalUseCase.g:2814:2: ( rule__Description__Alternatives_0 )
            // InternalUseCase.g:2814:3: rule__Description__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalUseCase.g:2822:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2826:1: ( rule__Description__Group__1__Impl )
            // InternalUseCase.g:2827:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalUseCase.g:2833:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2837:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalUseCase.g:2838:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalUseCase.g:2838:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalUseCase.g:2839:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalUseCase.g:2840:2: ( rule__Description__NameAssignment_1 )
            // InternalUseCase.g:2840:3: rule__Description__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Description__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__AllowedUserGroups__Group__0"
    // InternalUseCase.g:2849:1: rule__AllowedUserGroups__Group__0 : rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 ;
    public final void rule__AllowedUserGroups__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2853:1: ( rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 )
            // InternalUseCase.g:2854:2: rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AllowedUserGroups__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllowedUserGroups__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroups__Group__0"


    // $ANTLR start "rule__AllowedUserGroups__Group__0__Impl"
    // InternalUseCase.g:2861:1: rule__AllowedUserGroups__Group__0__Impl : ( ( rule__AllowedUserGroups__Alternatives_0 ) ) ;
    public final void rule__AllowedUserGroups__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2865:1: ( ( ( rule__AllowedUserGroups__Alternatives_0 ) ) )
            // InternalUseCase.g:2866:1: ( ( rule__AllowedUserGroups__Alternatives_0 ) )
            {
            // InternalUseCase.g:2866:1: ( ( rule__AllowedUserGroups__Alternatives_0 ) )
            // InternalUseCase.g:2867:2: ( rule__AllowedUserGroups__Alternatives_0 )
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getAlternatives_0()); 
            // InternalUseCase.g:2868:2: ( rule__AllowedUserGroups__Alternatives_0 )
            // InternalUseCase.g:2868:3: rule__AllowedUserGroups__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__AllowedUserGroups__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAllowedUserGroupsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroups__Group__0__Impl"


    // $ANTLR start "rule__AllowedUserGroups__Group__1"
    // InternalUseCase.g:2876:1: rule__AllowedUserGroups__Group__1 : rule__AllowedUserGroups__Group__1__Impl ;
    public final void rule__AllowedUserGroups__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2880:1: ( rule__AllowedUserGroups__Group__1__Impl )
            // InternalUseCase.g:2881:2: rule__AllowedUserGroups__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllowedUserGroups__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroups__Group__1"


    // $ANTLR start "rule__AllowedUserGroups__Group__1__Impl"
    // InternalUseCase.g:2887:1: rule__AllowedUserGroups__Group__1__Impl : ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) ;
    public final void rule__AllowedUserGroups__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2891:1: ( ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) )
            // InternalUseCase.g:2892:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            {
            // InternalUseCase.g:2892:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            // InternalUseCase.g:2893:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroupsAssignment_1()); 
            // InternalUseCase.g:2894:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==62||LA52_0==95) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUseCase.g:2894:3: rule__AllowedUserGroups__GroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__AllowedUserGroups__GroupsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getAllowedUserGroupsAccess().getGroupsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroups__Group__1__Impl"


    // $ANTLR start "rule__AllowedUserGroups__Group_0_1__0"
    // InternalUseCase.g:2903:1: rule__AllowedUserGroups__Group_0_1__0 : rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1 ;
    public final void rule__AllowedUserGroups__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2907:1: ( rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1 )
            // InternalUseCase.g:2908:2: rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1
            {
            pushFollow(FOLLOW_21);
            rule__AllowedUserGroups__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllowedUserGroups__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroups__Group_0_1__0"


    // $ANTLR start "rule__AllowedUserGroups__Group_0_1__0__Impl"
    // InternalUseCase.g:2915:1: rule__AllowedUserGroups__Group_0_1__0__Impl : ( 'Erlaubt' ) ;
    public final void rule__AllowedUserGroups__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2919:1: ( ( 'Erlaubt' ) )
            // InternalUseCase.g:2920:1: ( 'Erlaubt' )
            {
            // InternalUseCase.g:2920:1: ( 'Erlaubt' )
            // InternalUseCase.g:2921:2: 'Erlaubt'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getErlaubtKeyword_0_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getAllowedUserGroupsAccess().getErlaubtKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroups__Group_0_1__0__Impl"


    // $ANTLR start "rule__AllowedUserGroups__Group_0_1__1"
    // InternalUseCase.g:2930:1: rule__AllowedUserGroups__Group_0_1__1 : rule__AllowedUserGroups__Group_0_1__1__Impl ;
    public final void rule__AllowedUserGroups__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2934:1: ( rule__AllowedUserGroups__Group_0_1__1__Impl )
            // InternalUseCase.g:2935:2: rule__AllowedUserGroups__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllowedUserGroups__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroups__Group_0_1__1"


    // $ANTLR start "rule__AllowedUserGroups__Group_0_1__1__Impl"
    // InternalUseCase.g:2941:1: rule__AllowedUserGroups__Group_0_1__1__Impl : ( 'f\\u00FCr:' ) ;
    public final void rule__AllowedUserGroups__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2945:1: ( ( 'f\\u00FCr:' ) )
            // InternalUseCase.g:2946:1: ( 'f\\u00FCr:' )
            {
            // InternalUseCase.g:2946:1: ( 'f\\u00FCr:' )
            // InternalUseCase.g:2947:2: 'f\\u00FCr:'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getFürKeyword_0_1_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getAllowedUserGroupsAccess().getFürKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroups__Group_0_1__1__Impl"


    // $ANTLR start "rule__AllowedUserGroup__Group__0"
    // InternalUseCase.g:2957:1: rule__AllowedUserGroup__Group__0 : rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 ;
    public final void rule__AllowedUserGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2961:1: ( rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 )
            // InternalUseCase.g:2962:2: rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AllowedUserGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllowedUserGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group__0"


    // $ANTLR start "rule__AllowedUserGroup__Group__0__Impl"
    // InternalUseCase.g:2969:1: rule__AllowedUserGroup__Group__0__Impl : ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) ;
    public final void rule__AllowedUserGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2973:1: ( ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2974:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2974:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            // InternalUseCase.g:2975:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2976:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==95) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalUseCase.g:2976:3: rule__AllowedUserGroup__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllowedUserGroup__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllowedUserGroupAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group__0__Impl"


    // $ANTLR start "rule__AllowedUserGroup__Group__1"
    // InternalUseCase.g:2984:1: rule__AllowedUserGroup__Group__1 : rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 ;
    public final void rule__AllowedUserGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2988:1: ( rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 )
            // InternalUseCase.g:2989:2: rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AllowedUserGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllowedUserGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group__1"


    // $ANTLR start "rule__AllowedUserGroup__Group__1__Impl"
    // InternalUseCase.g:2996:1: rule__AllowedUserGroup__Group__1__Impl : ( '-' ) ;
    public final void rule__AllowedUserGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3000:1: ( ( '-' ) )
            // InternalUseCase.g:3001:1: ( '-' )
            {
            // InternalUseCase.g:3001:1: ( '-' )
            // InternalUseCase.g:3002:2: '-'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group__1__Impl"


    // $ANTLR start "rule__AllowedUserGroup__Group__2"
    // InternalUseCase.g:3011:1: rule__AllowedUserGroup__Group__2 : rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 ;
    public final void rule__AllowedUserGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3015:1: ( rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 )
            // InternalUseCase.g:3016:2: rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__AllowedUserGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllowedUserGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group__2"


    // $ANTLR start "rule__AllowedUserGroup__Group__2__Impl"
    // InternalUseCase.g:3023:1: rule__AllowedUserGroup__Group__2__Impl : ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) ;
    public final void rule__AllowedUserGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3027:1: ( ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) )
            // InternalUseCase.g:3028:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            {
            // InternalUseCase.g:3028:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            // InternalUseCase.g:3029:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getNameAssignment_2()); 
            // InternalUseCase.g:3030:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            // InternalUseCase.g:3030:3: rule__AllowedUserGroup__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AllowedUserGroup__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAllowedUserGroupAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group__2__Impl"


    // $ANTLR start "rule__AllowedUserGroup__Group__3"
    // InternalUseCase.g:3038:1: rule__AllowedUserGroup__Group__3 : rule__AllowedUserGroup__Group__3__Impl ;
    public final void rule__AllowedUserGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3042:1: ( rule__AllowedUserGroup__Group__3__Impl )
            // InternalUseCase.g:3043:2: rule__AllowedUserGroup__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllowedUserGroup__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group__3"


    // $ANTLR start "rule__AllowedUserGroup__Group__3__Impl"
    // InternalUseCase.g:3049:1: rule__AllowedUserGroup__Group__3__Impl : ( ( rule__AllowedUserGroup__Group_3__0 )? ) ;
    public final void rule__AllowedUserGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3053:1: ( ( ( rule__AllowedUserGroup__Group_3__0 )? ) )
            // InternalUseCase.g:3054:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            {
            // InternalUseCase.g:3054:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            // InternalUseCase.g:3055:2: ( rule__AllowedUserGroup__Group_3__0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup_3()); 
            // InternalUseCase.g:3056:2: ( rule__AllowedUserGroup__Group_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==26) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUseCase.g:3056:3: rule__AllowedUserGroup__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllowedUserGroup__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllowedUserGroupAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group__3__Impl"


    // $ANTLR start "rule__AllowedUserGroup__Group_3__0"
    // InternalUseCase.g:3065:1: rule__AllowedUserGroup__Group_3__0 : rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 ;
    public final void rule__AllowedUserGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3069:1: ( rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 )
            // InternalUseCase.g:3070:2: rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__AllowedUserGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllowedUserGroup__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group_3__0"


    // $ANTLR start "rule__AllowedUserGroup__Group_3__0__Impl"
    // InternalUseCase.g:3077:1: rule__AllowedUserGroup__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__AllowedUserGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3081:1: ( ( 'as' ) )
            // InternalUseCase.g:3082:1: ( 'as' )
            {
            // InternalUseCase.g:3082:1: ( 'as' )
            // InternalUseCase.g:3083:2: 'as'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group_3__0__Impl"


    // $ANTLR start "rule__AllowedUserGroup__Group_3__1"
    // InternalUseCase.g:3092:1: rule__AllowedUserGroup__Group_3__1 : rule__AllowedUserGroup__Group_3__1__Impl ;
    public final void rule__AllowedUserGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3096:1: ( rule__AllowedUserGroup__Group_3__1__Impl )
            // InternalUseCase.g:3097:2: rule__AllowedUserGroup__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllowedUserGroup__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group_3__1"


    // $ANTLR start "rule__AllowedUserGroup__Group_3__1__Impl"
    // InternalUseCase.g:3103:1: rule__AllowedUserGroup__Group_3__1__Impl : ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) ;
    public final void rule__AllowedUserGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3107:1: ( ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:3108:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:3108:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            // InternalUseCase.g:3109:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:3110:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            // InternalUseCase.g:3110:3: rule__AllowedUserGroup__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AllowedUserGroup__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAllowedUserGroupAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__Group_3__1__Impl"


    // $ANTLR start "rule__Inputs__Group__0"
    // InternalUseCase.g:3119:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3123:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalUseCase.g:3124:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Inputs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group__0"


    // $ANTLR start "rule__Inputs__Group__0__Impl"
    // InternalUseCase.g:3131:1: rule__Inputs__Group__0__Impl : ( ( rule__Inputs__Alternatives_0 ) ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3135:1: ( ( ( rule__Inputs__Alternatives_0 ) ) )
            // InternalUseCase.g:3136:1: ( ( rule__Inputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:3136:1: ( ( rule__Inputs__Alternatives_0 ) )
            // InternalUseCase.g:3137:2: ( rule__Inputs__Alternatives_0 )
            {
             before(grammarAccess.getInputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3138:2: ( rule__Inputs__Alternatives_0 )
            // InternalUseCase.g:3138:3: rule__Inputs__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Inputs__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInputsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group__0__Impl"


    // $ANTLR start "rule__Inputs__Group__1"
    // InternalUseCase.g:3146:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3150:1: ( rule__Inputs__Group__1__Impl )
            // InternalUseCase.g:3151:2: rule__Inputs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inputs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group__1"


    // $ANTLR start "rule__Inputs__Group__1__Impl"
    // InternalUseCase.g:3157:1: rule__Inputs__Group__1__Impl : ( ( rule__Inputs__InputsAssignment_1 )* ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3161:1: ( ( ( rule__Inputs__InputsAssignment_1 )* ) )
            // InternalUseCase.g:3162:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            {
            // InternalUseCase.g:3162:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            // InternalUseCase.g:3163:2: ( rule__Inputs__InputsAssignment_1 )*
            {
             before(grammarAccess.getInputsAccess().getInputsAssignment_1()); 
            // InternalUseCase.g:3164:2: ( rule__Inputs__InputsAssignment_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==62||LA55_0==95) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalUseCase.g:3164:3: rule__Inputs__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Inputs__InputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getInputsAccess().getInputsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group__1__Impl"


    // $ANTLR start "rule__Inputs__Group_0_0_2__0"
    // InternalUseCase.g:3173:1: rule__Inputs__Group_0_0_2__0 : rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1 ;
    public final void rule__Inputs__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3177:1: ( rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1 )
            // InternalUseCase.g:3178:2: rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Inputs__Group_0_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_0_2__0"


    // $ANTLR start "rule__Inputs__Group_0_0_2__0__Impl"
    // InternalUseCase.g:3185:1: rule__Inputs__Group_0_0_2__0__Impl : ( 'requires' ) ;
    public final void rule__Inputs__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3189:1: ( ( 'requires' ) )
            // InternalUseCase.g:3190:1: ( 'requires' )
            {
            // InternalUseCase.g:3190:1: ( 'requires' )
            // InternalUseCase.g:3191:2: 'requires'
            {
             before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_2_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_0_2__0__Impl"


    // $ANTLR start "rule__Inputs__Group_0_0_2__1"
    // InternalUseCase.g:3200:1: rule__Inputs__Group_0_0_2__1 : rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2 ;
    public final void rule__Inputs__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3204:1: ( rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2 )
            // InternalUseCase.g:3205:2: rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2
            {
            pushFollow(FOLLOW_24);
            rule__Inputs__Group_0_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_0_2__1"


    // $ANTLR start "rule__Inputs__Group_0_0_2__1__Impl"
    // InternalUseCase.g:3212:1: rule__Inputs__Group_0_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Inputs__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3216:1: ( ( 'the' ) )
            // InternalUseCase.g:3217:1: ( 'the' )
            {
            // InternalUseCase.g:3217:1: ( 'the' )
            // InternalUseCase.g:3218:2: 'the'
            {
             before(grammarAccess.getInputsAccess().getTheKeyword_0_0_2_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getTheKeyword_0_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_0_2__1__Impl"


    // $ANTLR start "rule__Inputs__Group_0_0_2__2"
    // InternalUseCase.g:3227:1: rule__Inputs__Group_0_0_2__2 : rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3 ;
    public final void rule__Inputs__Group_0_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3231:1: ( rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3 )
            // InternalUseCase.g:3232:2: rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3
            {
            pushFollow(FOLLOW_25);
            rule__Inputs__Group_0_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_0_2__2"


    // $ANTLR start "rule__Inputs__Group_0_0_2__2__Impl"
    // InternalUseCase.g:3239:1: rule__Inputs__Group_0_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Inputs__Group_0_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3243:1: ( ( 'following' ) )
            // InternalUseCase.g:3244:1: ( 'following' )
            {
            // InternalUseCase.g:3244:1: ( 'following' )
            // InternalUseCase.g:3245:2: 'following'
            {
             before(grammarAccess.getInputsAccess().getFollowingKeyword_0_0_2_2()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getFollowingKeyword_0_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_0_2__2__Impl"


    // $ANTLR start "rule__Inputs__Group_0_0_2__3"
    // InternalUseCase.g:3254:1: rule__Inputs__Group_0_0_2__3 : rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4 ;
    public final void rule__Inputs__Group_0_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3258:1: ( rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4 )
            // InternalUseCase.g:3259:2: rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4
            {
            pushFollow(FOLLOW_26);
            rule__Inputs__Group_0_0_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_0_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_0_2__3"


    // $ANTLR start "rule__Inputs__Group_0_0_2__3__Impl"
    // InternalUseCase.g:3266:1: rule__Inputs__Group_0_0_2__3__Impl : ( 'input' ) ;
    public final void rule__Inputs__Group_0_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3270:1: ( ( 'input' ) )
            // InternalUseCase.g:3271:1: ( 'input' )
            {
            // InternalUseCase.g:3271:1: ( 'input' )
            // InternalUseCase.g:3272:2: 'input'
            {
             before(grammarAccess.getInputsAccess().getInputKeyword_0_0_2_3()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getInputKeyword_0_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_0_2__3__Impl"


    // $ANTLR start "rule__Inputs__Group_0_0_2__4"
    // InternalUseCase.g:3281:1: rule__Inputs__Group_0_0_2__4 : rule__Inputs__Group_0_0_2__4__Impl ;
    public final void rule__Inputs__Group_0_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3285:1: ( rule__Inputs__Group_0_0_2__4__Impl )
            // InternalUseCase.g:3286:2: rule__Inputs__Group_0_0_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_0_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_0_2__4"


    // $ANTLR start "rule__Inputs__Group_0_0_2__4__Impl"
    // InternalUseCase.g:3292:1: rule__Inputs__Group_0_0_2__4__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3296:1: ( ( ':' ) )
            // InternalUseCase.g:3297:1: ( ':' )
            {
            // InternalUseCase.g:3297:1: ( ':' )
            // InternalUseCase.g:3298:2: ':'
            {
             before(grammarAccess.getInputsAccess().getColonKeyword_0_0_2_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getColonKeyword_0_0_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_0_2__4__Impl"


    // $ANTLR start "rule__Inputs__Group_0_1__0"
    // InternalUseCase.g:3308:1: rule__Inputs__Group_0_1__0 : rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1 ;
    public final void rule__Inputs__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3312:1: ( rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1 )
            // InternalUseCase.g:3313:2: rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Inputs__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_1__0"


    // $ANTLR start "rule__Inputs__Group_0_1__0__Impl"
    // InternalUseCase.g:3320:1: rule__Inputs__Group_0_1__0__Impl : ( 'Ben\\u00F6tigte' ) ;
    public final void rule__Inputs__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3324:1: ( ( 'Ben\\u00F6tigte' ) )
            // InternalUseCase.g:3325:1: ( 'Ben\\u00F6tigte' )
            {
            // InternalUseCase.g:3325:1: ( 'Ben\\u00F6tigte' )
            // InternalUseCase.g:3326:2: 'Ben\\u00F6tigte'
            {
             before(grammarAccess.getInputsAccess().getBenötigteKeyword_0_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getBenötigteKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_1__0__Impl"


    // $ANTLR start "rule__Inputs__Group_0_1__1"
    // InternalUseCase.g:3335:1: rule__Inputs__Group_0_1__1 : rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2 ;
    public final void rule__Inputs__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3339:1: ( rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2 )
            // InternalUseCase.g:3340:2: rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2
            {
            pushFollow(FOLLOW_26);
            rule__Inputs__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_1__1"


    // $ANTLR start "rule__Inputs__Group_0_1__1__Impl"
    // InternalUseCase.g:3347:1: rule__Inputs__Group_0_1__1__Impl : ( 'Zutaten' ) ;
    public final void rule__Inputs__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3351:1: ( ( 'Zutaten' ) )
            // InternalUseCase.g:3352:1: ( 'Zutaten' )
            {
            // InternalUseCase.g:3352:1: ( 'Zutaten' )
            // InternalUseCase.g:3353:2: 'Zutaten'
            {
             before(grammarAccess.getInputsAccess().getZutatenKeyword_0_1_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getZutatenKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_1__1__Impl"


    // $ANTLR start "rule__Inputs__Group_0_1__2"
    // InternalUseCase.g:3362:1: rule__Inputs__Group_0_1__2 : rule__Inputs__Group_0_1__2__Impl ;
    public final void rule__Inputs__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3366:1: ( rule__Inputs__Group_0_1__2__Impl )
            // InternalUseCase.g:3367:2: rule__Inputs__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_1__2"


    // $ANTLR start "rule__Inputs__Group_0_1__2__Impl"
    // InternalUseCase.g:3373:1: rule__Inputs__Group_0_1__2__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3377:1: ( ( ':' ) )
            // InternalUseCase.g:3378:1: ( ':' )
            {
            // InternalUseCase.g:3378:1: ( ':' )
            // InternalUseCase.g:3379:2: ':'
            {
             before(grammarAccess.getInputsAccess().getColonKeyword_0_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getColonKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_1__2__Impl"


    // $ANTLR start "rule__OptionalInputs__Group__0"
    // InternalUseCase.g:3389:1: rule__OptionalInputs__Group__0 : rule__OptionalInputs__Group__0__Impl rule__OptionalInputs__Group__1 ;
    public final void rule__OptionalInputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3393:1: ( rule__OptionalInputs__Group__0__Impl rule__OptionalInputs__Group__1 )
            // InternalUseCase.g:3394:2: rule__OptionalInputs__Group__0__Impl rule__OptionalInputs__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__OptionalInputs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group__0"


    // $ANTLR start "rule__OptionalInputs__Group__0__Impl"
    // InternalUseCase.g:3401:1: rule__OptionalInputs__Group__0__Impl : ( ( rule__OptionalInputs__Alternatives_0 ) ) ;
    public final void rule__OptionalInputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3405:1: ( ( ( rule__OptionalInputs__Alternatives_0 ) ) )
            // InternalUseCase.g:3406:1: ( ( rule__OptionalInputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:3406:1: ( ( rule__OptionalInputs__Alternatives_0 ) )
            // InternalUseCase.g:3407:2: ( rule__OptionalInputs__Alternatives_0 )
            {
             before(grammarAccess.getOptionalInputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3408:2: ( rule__OptionalInputs__Alternatives_0 )
            // InternalUseCase.g:3408:3: rule__OptionalInputs__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalInputsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group__0__Impl"


    // $ANTLR start "rule__OptionalInputs__Group__1"
    // InternalUseCase.g:3416:1: rule__OptionalInputs__Group__1 : rule__OptionalInputs__Group__1__Impl ;
    public final void rule__OptionalInputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3420:1: ( rule__OptionalInputs__Group__1__Impl )
            // InternalUseCase.g:3421:2: rule__OptionalInputs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group__1"


    // $ANTLR start "rule__OptionalInputs__Group__1__Impl"
    // InternalUseCase.g:3427:1: rule__OptionalInputs__Group__1__Impl : ( ( rule__OptionalInputs__InputsAssignment_1 )* ) ;
    public final void rule__OptionalInputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3431:1: ( ( ( rule__OptionalInputs__InputsAssignment_1 )* ) )
            // InternalUseCase.g:3432:1: ( ( rule__OptionalInputs__InputsAssignment_1 )* )
            {
            // InternalUseCase.g:3432:1: ( ( rule__OptionalInputs__InputsAssignment_1 )* )
            // InternalUseCase.g:3433:2: ( rule__OptionalInputs__InputsAssignment_1 )*
            {
             before(grammarAccess.getOptionalInputsAccess().getInputsAssignment_1()); 
            // InternalUseCase.g:3434:2: ( rule__OptionalInputs__InputsAssignment_1 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==62||LA56_0==95) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalUseCase.g:3434:3: rule__OptionalInputs__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__OptionalInputs__InputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getOptionalInputsAccess().getInputsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group__1__Impl"


    // $ANTLR start "rule__OptionalInputs__Group_0_0_1__0"
    // InternalUseCase.g:3443:1: rule__OptionalInputs__Group_0_0_1__0 : rule__OptionalInputs__Group_0_0_1__0__Impl rule__OptionalInputs__Group_0_0_1__1 ;
    public final void rule__OptionalInputs__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3447:1: ( rule__OptionalInputs__Group_0_0_1__0__Impl rule__OptionalInputs__Group_0_0_1__1 )
            // InternalUseCase.g:3448:2: rule__OptionalInputs__Group_0_0_1__0__Impl rule__OptionalInputs__Group_0_0_1__1
            {
            pushFollow(FOLLOW_28);
            rule__OptionalInputs__Group_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Group_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_0_1__0"


    // $ANTLR start "rule__OptionalInputs__Group_0_0_1__0__Impl"
    // InternalUseCase.g:3455:1: rule__OptionalInputs__Group_0_0_1__0__Impl : ( 'optional' ) ;
    public final void rule__OptionalInputs__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3459:1: ( ( 'optional' ) )
            // InternalUseCase.g:3460:1: ( 'optional' )
            {
            // InternalUseCase.g:3460:1: ( 'optional' )
            // InternalUseCase.g:3461:2: 'optional'
            {
             before(grammarAccess.getOptionalInputsAccess().getOptionalKeyword_0_0_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getOptionalInputsAccess().getOptionalKeyword_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__OptionalInputs__Group_0_0_1__1"
    // InternalUseCase.g:3470:1: rule__OptionalInputs__Group_0_0_1__1 : rule__OptionalInputs__Group_0_0_1__1__Impl rule__OptionalInputs__Group_0_0_1__2 ;
    public final void rule__OptionalInputs__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3474:1: ( rule__OptionalInputs__Group_0_0_1__1__Impl rule__OptionalInputs__Group_0_0_1__2 )
            // InternalUseCase.g:3475:2: rule__OptionalInputs__Group_0_0_1__1__Impl rule__OptionalInputs__Group_0_0_1__2
            {
            pushFollow(FOLLOW_26);
            rule__OptionalInputs__Group_0_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Group_0_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_0_1__1"


    // $ANTLR start "rule__OptionalInputs__Group_0_0_1__1__Impl"
    // InternalUseCase.g:3482:1: rule__OptionalInputs__Group_0_0_1__1__Impl : ( 'inputs' ) ;
    public final void rule__OptionalInputs__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3486:1: ( ( 'inputs' ) )
            // InternalUseCase.g:3487:1: ( 'inputs' )
            {
            // InternalUseCase.g:3487:1: ( 'inputs' )
            // InternalUseCase.g:3488:2: 'inputs'
            {
             before(grammarAccess.getOptionalInputsAccess().getInputsKeyword_0_0_1_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getOptionalInputsAccess().getInputsKeyword_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_0_1__1__Impl"


    // $ANTLR start "rule__OptionalInputs__Group_0_0_1__2"
    // InternalUseCase.g:3497:1: rule__OptionalInputs__Group_0_0_1__2 : rule__OptionalInputs__Group_0_0_1__2__Impl ;
    public final void rule__OptionalInputs__Group_0_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3501:1: ( rule__OptionalInputs__Group_0_0_1__2__Impl )
            // InternalUseCase.g:3502:2: rule__OptionalInputs__Group_0_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Group_0_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_0_1__2"


    // $ANTLR start "rule__OptionalInputs__Group_0_0_1__2__Impl"
    // InternalUseCase.g:3508:1: rule__OptionalInputs__Group_0_0_1__2__Impl : ( ':' ) ;
    public final void rule__OptionalInputs__Group_0_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3512:1: ( ( ':' ) )
            // InternalUseCase.g:3513:1: ( ':' )
            {
            // InternalUseCase.g:3513:1: ( ':' )
            // InternalUseCase.g:3514:2: ':'
            {
             before(grammarAccess.getOptionalInputsAccess().getColonKeyword_0_0_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOptionalInputsAccess().getColonKeyword_0_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_0_1__2__Impl"


    // $ANTLR start "rule__OptionalInputs__Group_0_1__0"
    // InternalUseCase.g:3524:1: rule__OptionalInputs__Group_0_1__0 : rule__OptionalInputs__Group_0_1__0__Impl rule__OptionalInputs__Group_0_1__1 ;
    public final void rule__OptionalInputs__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3528:1: ( rule__OptionalInputs__Group_0_1__0__Impl rule__OptionalInputs__Group_0_1__1 )
            // InternalUseCase.g:3529:2: rule__OptionalInputs__Group_0_1__0__Impl rule__OptionalInputs__Group_0_1__1
            {
            pushFollow(FOLLOW_26);
            rule__OptionalInputs__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_1__0"


    // $ANTLR start "rule__OptionalInputs__Group_0_1__0__Impl"
    // InternalUseCase.g:3536:1: rule__OptionalInputs__Group_0_1__0__Impl : ( ( rule__OptionalInputs__Alternatives_0_1_0 ) ) ;
    public final void rule__OptionalInputs__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3540:1: ( ( ( rule__OptionalInputs__Alternatives_0_1_0 ) ) )
            // InternalUseCase.g:3541:1: ( ( rule__OptionalInputs__Alternatives_0_1_0 ) )
            {
            // InternalUseCase.g:3541:1: ( ( rule__OptionalInputs__Alternatives_0_1_0 ) )
            // InternalUseCase.g:3542:2: ( rule__OptionalInputs__Alternatives_0_1_0 )
            {
             before(grammarAccess.getOptionalInputsAccess().getAlternatives_0_1_0()); 
            // InternalUseCase.g:3543:2: ( rule__OptionalInputs__Alternatives_0_1_0 )
            // InternalUseCase.g:3543:3: rule__OptionalInputs__Alternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Alternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalInputsAccess().getAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_1__0__Impl"


    // $ANTLR start "rule__OptionalInputs__Group_0_1__1"
    // InternalUseCase.g:3551:1: rule__OptionalInputs__Group_0_1__1 : rule__OptionalInputs__Group_0_1__1__Impl ;
    public final void rule__OptionalInputs__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3555:1: ( rule__OptionalInputs__Group_0_1__1__Impl )
            // InternalUseCase.g:3556:2: rule__OptionalInputs__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_1__1"


    // $ANTLR start "rule__OptionalInputs__Group_0_1__1__Impl"
    // InternalUseCase.g:3562:1: rule__OptionalInputs__Group_0_1__1__Impl : ( ':' ) ;
    public final void rule__OptionalInputs__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3566:1: ( ( ':' ) )
            // InternalUseCase.g:3567:1: ( ':' )
            {
            // InternalUseCase.g:3567:1: ( ':' )
            // InternalUseCase.g:3568:2: ':'
            {
             before(grammarAccess.getOptionalInputsAccess().getColonKeyword_0_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOptionalInputsAccess().getColonKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_1__1__Impl"


    // $ANTLR start "rule__OptionalInputs__Group_0_1_0_0__0"
    // InternalUseCase.g:3578:1: rule__OptionalInputs__Group_0_1_0_0__0 : rule__OptionalInputs__Group_0_1_0_0__0__Impl rule__OptionalInputs__Group_0_1_0_0__1 ;
    public final void rule__OptionalInputs__Group_0_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3582:1: ( rule__OptionalInputs__Group_0_1_0_0__0__Impl rule__OptionalInputs__Group_0_1_0_0__1 )
            // InternalUseCase.g:3583:2: rule__OptionalInputs__Group_0_1_0_0__0__Impl rule__OptionalInputs__Group_0_1_0_0__1
            {
            pushFollow(FOLLOW_27);
            rule__OptionalInputs__Group_0_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Group_0_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_1_0_0__0"


    // $ANTLR start "rule__OptionalInputs__Group_0_1_0_0__0__Impl"
    // InternalUseCase.g:3590:1: rule__OptionalInputs__Group_0_1_0_0__0__Impl : ( 'Optionale' ) ;
    public final void rule__OptionalInputs__Group_0_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3594:1: ( ( 'Optionale' ) )
            // InternalUseCase.g:3595:1: ( 'Optionale' )
            {
            // InternalUseCase.g:3595:1: ( 'Optionale' )
            // InternalUseCase.g:3596:2: 'Optionale'
            {
             before(grammarAccess.getOptionalInputsAccess().getOptionaleKeyword_0_1_0_0_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getOptionalInputsAccess().getOptionaleKeyword_0_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_1_0_0__0__Impl"


    // $ANTLR start "rule__OptionalInputs__Group_0_1_0_0__1"
    // InternalUseCase.g:3605:1: rule__OptionalInputs__Group_0_1_0_0__1 : rule__OptionalInputs__Group_0_1_0_0__1__Impl ;
    public final void rule__OptionalInputs__Group_0_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3609:1: ( rule__OptionalInputs__Group_0_1_0_0__1__Impl )
            // InternalUseCase.g:3610:2: rule__OptionalInputs__Group_0_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OptionalInputs__Group_0_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_1_0_0__1"


    // $ANTLR start "rule__OptionalInputs__Group_0_1_0_0__1__Impl"
    // InternalUseCase.g:3616:1: rule__OptionalInputs__Group_0_1_0_0__1__Impl : ( 'Zutaten' ) ;
    public final void rule__OptionalInputs__Group_0_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3620:1: ( ( 'Zutaten' ) )
            // InternalUseCase.g:3621:1: ( 'Zutaten' )
            {
            // InternalUseCase.g:3621:1: ( 'Zutaten' )
            // InternalUseCase.g:3622:2: 'Zutaten'
            {
             before(grammarAccess.getOptionalInputsAccess().getZutatenKeyword_0_1_0_0_1()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getOptionalInputsAccess().getZutatenKeyword_0_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__Group_0_1_0_0__1__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalUseCase.g:3632:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3636:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalUseCase.g:3637:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalUseCase.g:3644:1: rule__Input__Group__0__Impl : ( ( rule__Input__ManyAssignment_0 )? ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3648:1: ( ( ( rule__Input__ManyAssignment_0 )? ) )
            // InternalUseCase.g:3649:1: ( ( rule__Input__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:3649:1: ( ( rule__Input__ManyAssignment_0 )? )
            // InternalUseCase.g:3650:2: ( rule__Input__ManyAssignment_0 )?
            {
             before(grammarAccess.getInputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:3651:2: ( rule__Input__ManyAssignment_0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==95) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalUseCase.g:3651:3: rule__Input__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalUseCase.g:3659:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3663:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalUseCase.g:3664:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalUseCase.g:3671:1: rule__Input__Group__1__Impl : ( '-' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3675:1: ( ( '-' ) )
            // InternalUseCase.g:3676:1: ( '-' )
            {
            // InternalUseCase.g:3676:1: ( '-' )
            // InternalUseCase.g:3677:2: '-'
            {
             before(grammarAccess.getInputAccess().getHyphenMinusKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalUseCase.g:3686:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3690:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalUseCase.g:3691:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalUseCase.g:3698:1: rule__Input__Group__2__Impl : ( ( rule__Input__OptionalAssignment_2 )? ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3702:1: ( ( ( rule__Input__OptionalAssignment_2 )? ) )
            // InternalUseCase.g:3703:1: ( ( rule__Input__OptionalAssignment_2 )? )
            {
            // InternalUseCase.g:3703:1: ( ( rule__Input__OptionalAssignment_2 )? )
            // InternalUseCase.g:3704:2: ( rule__Input__OptionalAssignment_2 )?
            {
             before(grammarAccess.getInputAccess().getOptionalAssignment_2()); 
            // InternalUseCase.g:3705:2: ( rule__Input__OptionalAssignment_2 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==11) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalUseCase.g:3705:3: rule__Input__OptionalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__OptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getOptionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalUseCase.g:3713:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3717:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalUseCase.g:3718:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalUseCase.g:3725:1: rule__Input__Group__3__Impl : ( ( rule__Input__ContentAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3729:1: ( ( ( rule__Input__ContentAssignment_3 ) ) )
            // InternalUseCase.g:3730:1: ( ( rule__Input__ContentAssignment_3 ) )
            {
            // InternalUseCase.g:3730:1: ( ( rule__Input__ContentAssignment_3 ) )
            // InternalUseCase.g:3731:2: ( rule__Input__ContentAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getContentAssignment_3()); 
            // InternalUseCase.g:3732:2: ( rule__Input__ContentAssignment_3 )
            // InternalUseCase.g:3732:3: rule__Input__ContentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Input__ContentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // InternalUseCase.g:3740:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3744:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // InternalUseCase.g:3745:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Input__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // InternalUseCase.g:3752:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3756:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalUseCase.g:3757:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalUseCase.g:3757:1: ( ( rule__Input__Group_4__0 )? )
            // InternalUseCase.g:3758:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalUseCase.g:3759:2: ( rule__Input__Group_4__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=26 && LA59_0<=27)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalUseCase.g:3759:3: rule__Input__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Input__Group__5"
    // InternalUseCase.g:3767:1: rule__Input__Group__5 : rule__Input__Group__5__Impl ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3771:1: ( rule__Input__Group__5__Impl )
            // InternalUseCase.g:3772:2: rule__Input__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5"


    // $ANTLR start "rule__Input__Group__5__Impl"
    // InternalUseCase.g:3778:1: rule__Input__Group__5__Impl : ( ( rule__Input__Group_5__0 )? ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3782:1: ( ( ( rule__Input__Group_5__0 )? ) )
            // InternalUseCase.g:3783:1: ( ( rule__Input__Group_5__0 )? )
            {
            // InternalUseCase.g:3783:1: ( ( rule__Input__Group_5__0 )? )
            // InternalUseCase.g:3784:2: ( rule__Input__Group_5__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_5()); 
            // InternalUseCase.g:3785:2: ( rule__Input__Group_5__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==71) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalUseCase.g:3785:3: rule__Input__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5__Impl"


    // $ANTLR start "rule__Input__Group_4__0"
    // InternalUseCase.g:3794:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3798:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalUseCase.g:3799:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Input__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__0"


    // $ANTLR start "rule__Input__Group_4__0__Impl"
    // InternalUseCase.g:3806:1: rule__Input__Group_4__0__Impl : ( ( rule__Input__Alternatives_4_0 ) ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3810:1: ( ( ( rule__Input__Alternatives_4_0 ) ) )
            // InternalUseCase.g:3811:1: ( ( rule__Input__Alternatives_4_0 ) )
            {
            // InternalUseCase.g:3811:1: ( ( rule__Input__Alternatives_4_0 ) )
            // InternalUseCase.g:3812:2: ( rule__Input__Alternatives_4_0 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_4_0()); 
            // InternalUseCase.g:3813:2: ( rule__Input__Alternatives_4_0 )
            // InternalUseCase.g:3813:3: rule__Input__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__0__Impl"


    // $ANTLR start "rule__Input__Group_4__1"
    // InternalUseCase.g:3821:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3825:1: ( rule__Input__Group_4__1__Impl )
            // InternalUseCase.g:3826:2: rule__Input__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__1"


    // $ANTLR start "rule__Input__Group_4__1__Impl"
    // InternalUseCase.g:3832:1: rule__Input__Group_4__1__Impl : ( ( rule__Input__TypeAssignment_4_1 ) ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3836:1: ( ( ( rule__Input__TypeAssignment_4_1 ) ) )
            // InternalUseCase.g:3837:1: ( ( rule__Input__TypeAssignment_4_1 ) )
            {
            // InternalUseCase.g:3837:1: ( ( rule__Input__TypeAssignment_4_1 ) )
            // InternalUseCase.g:3838:2: ( rule__Input__TypeAssignment_4_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_4_1()); 
            // InternalUseCase.g:3839:2: ( rule__Input__TypeAssignment_4_1 )
            // InternalUseCase.g:3839:3: rule__Input__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__1__Impl"


    // $ANTLR start "rule__Input__Group_5__0"
    // InternalUseCase.g:3848:1: rule__Input__Group_5__0 : rule__Input__Group_5__0__Impl rule__Input__Group_5__1 ;
    public final void rule__Input__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3852:1: ( rule__Input__Group_5__0__Impl rule__Input__Group_5__1 )
            // InternalUseCase.g:3853:2: rule__Input__Group_5__0__Impl rule__Input__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__Input__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__0"


    // $ANTLR start "rule__Input__Group_5__0__Impl"
    // InternalUseCase.g:3860:1: rule__Input__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Input__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3864:1: ( ( '(' ) )
            // InternalUseCase.g:3865:1: ( '(' )
            {
            // InternalUseCase.g:3865:1: ( '(' )
            // InternalUseCase.g:3866:2: '('
            {
             before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__0__Impl"


    // $ANTLR start "rule__Input__Group_5__1"
    // InternalUseCase.g:3875:1: rule__Input__Group_5__1 : rule__Input__Group_5__1__Impl rule__Input__Group_5__2 ;
    public final void rule__Input__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3879:1: ( rule__Input__Group_5__1__Impl rule__Input__Group_5__2 )
            // InternalUseCase.g:3880:2: rule__Input__Group_5__1__Impl rule__Input__Group_5__2
            {
            pushFollow(FOLLOW_13);
            rule__Input__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__1"


    // $ANTLR start "rule__Input__Group_5__1__Impl"
    // InternalUseCase.g:3887:1: rule__Input__Group_5__1__Impl : ( ( rule__Input__Alternatives_5_1 ) ) ;
    public final void rule__Input__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3891:1: ( ( ( rule__Input__Alternatives_5_1 ) ) )
            // InternalUseCase.g:3892:1: ( ( rule__Input__Alternatives_5_1 ) )
            {
            // InternalUseCase.g:3892:1: ( ( rule__Input__Alternatives_5_1 ) )
            // InternalUseCase.g:3893:2: ( rule__Input__Alternatives_5_1 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_5_1()); 
            // InternalUseCase.g:3894:2: ( rule__Input__Alternatives_5_1 )
            // InternalUseCase.g:3894:3: rule__Input__Alternatives_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__Alternatives_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getAlternatives_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__1__Impl"


    // $ANTLR start "rule__Input__Group_5__2"
    // InternalUseCase.g:3902:1: rule__Input__Group_5__2 : rule__Input__Group_5__2__Impl rule__Input__Group_5__3 ;
    public final void rule__Input__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3906:1: ( rule__Input__Group_5__2__Impl rule__Input__Group_5__3 )
            // InternalUseCase.g:3907:2: rule__Input__Group_5__2__Impl rule__Input__Group_5__3
            {
            pushFollow(FOLLOW_32);
            rule__Input__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__2"


    // $ANTLR start "rule__Input__Group_5__2__Impl"
    // InternalUseCase.g:3914:1: rule__Input__Group_5__2__Impl : ( ( rule__Input__ExampleAssignment_5_2 ) ) ;
    public final void rule__Input__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3918:1: ( ( ( rule__Input__ExampleAssignment_5_2 ) ) )
            // InternalUseCase.g:3919:1: ( ( rule__Input__ExampleAssignment_5_2 ) )
            {
            // InternalUseCase.g:3919:1: ( ( rule__Input__ExampleAssignment_5_2 ) )
            // InternalUseCase.g:3920:2: ( rule__Input__ExampleAssignment_5_2 )
            {
             before(grammarAccess.getInputAccess().getExampleAssignment_5_2()); 
            // InternalUseCase.g:3921:2: ( rule__Input__ExampleAssignment_5_2 )
            // InternalUseCase.g:3921:3: rule__Input__ExampleAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Input__ExampleAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getExampleAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__2__Impl"


    // $ANTLR start "rule__Input__Group_5__3"
    // InternalUseCase.g:3929:1: rule__Input__Group_5__3 : rule__Input__Group_5__3__Impl ;
    public final void rule__Input__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3933:1: ( rule__Input__Group_5__3__Impl )
            // InternalUseCase.g:3934:2: rule__Input__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__3"


    // $ANTLR start "rule__Input__Group_5__3__Impl"
    // InternalUseCase.g:3940:1: rule__Input__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Input__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3944:1: ( ( ')' ) )
            // InternalUseCase.g:3945:1: ( ')' )
            {
            // InternalUseCase.g:3945:1: ( ')' )
            // InternalUseCase.g:3946:2: ')'
            {
             before(grammarAccess.getInputAccess().getRightParenthesisKeyword_5_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getRightParenthesisKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_5__3__Impl"


    // $ANTLR start "rule__Outputs__Group__0"
    // InternalUseCase.g:3956:1: rule__Outputs__Group__0 : rule__Outputs__Group__0__Impl rule__Outputs__Group__1 ;
    public final void rule__Outputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3960:1: ( rule__Outputs__Group__0__Impl rule__Outputs__Group__1 )
            // InternalUseCase.g:3961:2: rule__Outputs__Group__0__Impl rule__Outputs__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Outputs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group__0"


    // $ANTLR start "rule__Outputs__Group__0__Impl"
    // InternalUseCase.g:3968:1: rule__Outputs__Group__0__Impl : ( ( rule__Outputs__Alternatives_0 ) ) ;
    public final void rule__Outputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3972:1: ( ( ( rule__Outputs__Alternatives_0 ) ) )
            // InternalUseCase.g:3973:1: ( ( rule__Outputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:3973:1: ( ( rule__Outputs__Alternatives_0 ) )
            // InternalUseCase.g:3974:2: ( rule__Outputs__Alternatives_0 )
            {
             before(grammarAccess.getOutputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3975:2: ( rule__Outputs__Alternatives_0 )
            // InternalUseCase.g:3975:3: rule__Outputs__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Outputs__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOutputsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group__0__Impl"


    // $ANTLR start "rule__Outputs__Group__1"
    // InternalUseCase.g:3983:1: rule__Outputs__Group__1 : rule__Outputs__Group__1__Impl ;
    public final void rule__Outputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3987:1: ( rule__Outputs__Group__1__Impl )
            // InternalUseCase.g:3988:2: rule__Outputs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Outputs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group__1"


    // $ANTLR start "rule__Outputs__Group__1__Impl"
    // InternalUseCase.g:3994:1: rule__Outputs__Group__1__Impl : ( ( rule__Outputs__OutputsAssignment_1 )* ) ;
    public final void rule__Outputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3998:1: ( ( ( rule__Outputs__OutputsAssignment_1 )* ) )
            // InternalUseCase.g:3999:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            {
            // InternalUseCase.g:3999:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            // InternalUseCase.g:4000:2: ( rule__Outputs__OutputsAssignment_1 )*
            {
             before(grammarAccess.getOutputsAccess().getOutputsAssignment_1()); 
            // InternalUseCase.g:4001:2: ( rule__Outputs__OutputsAssignment_1 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==62||LA61_0==95) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalUseCase.g:4001:3: rule__Outputs__OutputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Outputs__OutputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getOutputsAccess().getOutputsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group__1__Impl"


    // $ANTLR start "rule__Outputs__Group_0_0_2__0"
    // InternalUseCase.g:4010:1: rule__Outputs__Group_0_0_2__0 : rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1 ;
    public final void rule__Outputs__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4014:1: ( rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1 )
            // InternalUseCase.g:4015:2: rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Outputs__Group_0_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group_0_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_0_2__0"


    // $ANTLR start "rule__Outputs__Group_0_0_2__0__Impl"
    // InternalUseCase.g:4022:1: rule__Outputs__Group_0_0_2__0__Impl : ( 'produces' ) ;
    public final void rule__Outputs__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4026:1: ( ( 'produces' ) )
            // InternalUseCase.g:4027:1: ( 'produces' )
            {
            // InternalUseCase.g:4027:1: ( 'produces' )
            // InternalUseCase.g:4028:2: 'produces'
            {
             before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_2_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_0_2__0__Impl"


    // $ANTLR start "rule__Outputs__Group_0_0_2__1"
    // InternalUseCase.g:4037:1: rule__Outputs__Group_0_0_2__1 : rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2 ;
    public final void rule__Outputs__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4041:1: ( rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2 )
            // InternalUseCase.g:4042:2: rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2
            {
            pushFollow(FOLLOW_24);
            rule__Outputs__Group_0_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group_0_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_0_2__1"


    // $ANTLR start "rule__Outputs__Group_0_0_2__1__Impl"
    // InternalUseCase.g:4049:1: rule__Outputs__Group_0_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Outputs__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4053:1: ( ( 'the' ) )
            // InternalUseCase.g:4054:1: ( 'the' )
            {
            // InternalUseCase.g:4054:1: ( 'the' )
            // InternalUseCase.g:4055:2: 'the'
            {
             before(grammarAccess.getOutputsAccess().getTheKeyword_0_0_2_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getTheKeyword_0_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_0_2__1__Impl"


    // $ANTLR start "rule__Outputs__Group_0_0_2__2"
    // InternalUseCase.g:4064:1: rule__Outputs__Group_0_0_2__2 : rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3 ;
    public final void rule__Outputs__Group_0_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4068:1: ( rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3 )
            // InternalUseCase.g:4069:2: rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3
            {
            pushFollow(FOLLOW_33);
            rule__Outputs__Group_0_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group_0_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_0_2__2"


    // $ANTLR start "rule__Outputs__Group_0_0_2__2__Impl"
    // InternalUseCase.g:4076:1: rule__Outputs__Group_0_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Outputs__Group_0_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4080:1: ( ( 'following' ) )
            // InternalUseCase.g:4081:1: ( 'following' )
            {
            // InternalUseCase.g:4081:1: ( 'following' )
            // InternalUseCase.g:4082:2: 'following'
            {
             before(grammarAccess.getOutputsAccess().getFollowingKeyword_0_0_2_2()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getFollowingKeyword_0_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_0_2__2__Impl"


    // $ANTLR start "rule__Outputs__Group_0_0_2__3"
    // InternalUseCase.g:4091:1: rule__Outputs__Group_0_0_2__3 : rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4 ;
    public final void rule__Outputs__Group_0_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4095:1: ( rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4 )
            // InternalUseCase.g:4096:2: rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4
            {
            pushFollow(FOLLOW_26);
            rule__Outputs__Group_0_0_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group_0_0_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_0_2__3"


    // $ANTLR start "rule__Outputs__Group_0_0_2__3__Impl"
    // InternalUseCase.g:4103:1: rule__Outputs__Group_0_0_2__3__Impl : ( 'output' ) ;
    public final void rule__Outputs__Group_0_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4107:1: ( ( 'output' ) )
            // InternalUseCase.g:4108:1: ( 'output' )
            {
            // InternalUseCase.g:4108:1: ( 'output' )
            // InternalUseCase.g:4109:2: 'output'
            {
             before(grammarAccess.getOutputsAccess().getOutputKeyword_0_0_2_3()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getOutputKeyword_0_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_0_2__3__Impl"


    // $ANTLR start "rule__Outputs__Group_0_0_2__4"
    // InternalUseCase.g:4118:1: rule__Outputs__Group_0_0_2__4 : rule__Outputs__Group_0_0_2__4__Impl ;
    public final void rule__Outputs__Group_0_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4122:1: ( rule__Outputs__Group_0_0_2__4__Impl )
            // InternalUseCase.g:4123:2: rule__Outputs__Group_0_0_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Outputs__Group_0_0_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_0_2__4"


    // $ANTLR start "rule__Outputs__Group_0_0_2__4__Impl"
    // InternalUseCase.g:4129:1: rule__Outputs__Group_0_0_2__4__Impl : ( ':' ) ;
    public final void rule__Outputs__Group_0_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4133:1: ( ( ':' ) )
            // InternalUseCase.g:4134:1: ( ':' )
            {
            // InternalUseCase.g:4134:1: ( ':' )
            // InternalUseCase.g:4135:2: ':'
            {
             before(grammarAccess.getOutputsAccess().getColonKeyword_0_0_2_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getColonKeyword_0_0_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_0_2__4__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalUseCase.g:4145:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4149:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalUseCase.g:4150:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalUseCase.g:4157:1: rule__Output__Group__0__Impl : ( ( rule__Output__ManyAssignment_0 )? ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4161:1: ( ( ( rule__Output__ManyAssignment_0 )? ) )
            // InternalUseCase.g:4162:1: ( ( rule__Output__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:4162:1: ( ( rule__Output__ManyAssignment_0 )? )
            // InternalUseCase.g:4163:2: ( rule__Output__ManyAssignment_0 )?
            {
             before(grammarAccess.getOutputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:4164:2: ( rule__Output__ManyAssignment_0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==95) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalUseCase.g:4164:3: rule__Output__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalUseCase.g:4172:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4176:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalUseCase.g:4177:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalUseCase.g:4184:1: rule__Output__Group__1__Impl : ( '-' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4188:1: ( ( '-' ) )
            // InternalUseCase.g:4189:1: ( '-' )
            {
            // InternalUseCase.g:4189:1: ( '-' )
            // InternalUseCase.g:4190:2: '-'
            {
             before(grammarAccess.getOutputAccess().getHyphenMinusKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalUseCase.g:4199:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4203:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalUseCase.g:4204:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalUseCase.g:4211:1: rule__Output__Group__2__Impl : ( ( rule__Output__ContentAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4215:1: ( ( ( rule__Output__ContentAssignment_2 ) ) )
            // InternalUseCase.g:4216:1: ( ( rule__Output__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:4216:1: ( ( rule__Output__ContentAssignment_2 ) )
            // InternalUseCase.g:4217:2: ( rule__Output__ContentAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:4218:2: ( rule__Output__ContentAssignment_2 )
            // InternalUseCase.g:4218:3: rule__Output__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Output__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalUseCase.g:4226:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4230:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalUseCase.g:4231:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Output__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalUseCase.g:4238:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4242:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalUseCase.g:4243:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalUseCase.g:4243:1: ( ( rule__Output__Group_3__0 )? )
            // InternalUseCase.g:4244:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalUseCase.g:4245:2: ( rule__Output__Group_3__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=26 && LA63_0<=27)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalUseCase.g:4245:3: rule__Output__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group__4"
    // InternalUseCase.g:4253:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4257:1: ( rule__Output__Group__4__Impl )
            // InternalUseCase.g:4258:2: rule__Output__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4"


    // $ANTLR start "rule__Output__Group__4__Impl"
    // InternalUseCase.g:4264:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4268:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalUseCase.g:4269:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalUseCase.g:4269:1: ( ( rule__Output__Group_4__0 )? )
            // InternalUseCase.g:4270:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalUseCase.g:4271:2: ( rule__Output__Group_4__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==71) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalUseCase.g:4271:3: rule__Output__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4__Impl"


    // $ANTLR start "rule__Output__Group_3__0"
    // InternalUseCase.g:4280:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4284:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalUseCase.g:4285:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Output__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__0"


    // $ANTLR start "rule__Output__Group_3__0__Impl"
    // InternalUseCase.g:4292:1: rule__Output__Group_3__0__Impl : ( ( rule__Output__Alternatives_3_0 ) ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4296:1: ( ( ( rule__Output__Alternatives_3_0 ) ) )
            // InternalUseCase.g:4297:1: ( ( rule__Output__Alternatives_3_0 ) )
            {
            // InternalUseCase.g:4297:1: ( ( rule__Output__Alternatives_3_0 ) )
            // InternalUseCase.g:4298:2: ( rule__Output__Alternatives_3_0 )
            {
             before(grammarAccess.getOutputAccess().getAlternatives_3_0()); 
            // InternalUseCase.g:4299:2: ( rule__Output__Alternatives_3_0 )
            // InternalUseCase.g:4299:3: rule__Output__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__0__Impl"


    // $ANTLR start "rule__Output__Group_3__1"
    // InternalUseCase.g:4307:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4311:1: ( rule__Output__Group_3__1__Impl )
            // InternalUseCase.g:4312:2: rule__Output__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__1"


    // $ANTLR start "rule__Output__Group_3__1__Impl"
    // InternalUseCase.g:4318:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4322:1: ( ( ( rule__Output__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:4323:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:4323:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            // InternalUseCase.g:4324:2: ( rule__Output__TypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:4325:2: ( rule__Output__TypeAssignment_3_1 )
            // InternalUseCase.g:4325:3: rule__Output__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__1__Impl"


    // $ANTLR start "rule__Output__Group_4__0"
    // InternalUseCase.g:4334:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4338:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalUseCase.g:4339:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__Output__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__0"


    // $ANTLR start "rule__Output__Group_4__0__Impl"
    // InternalUseCase.g:4346:1: rule__Output__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4350:1: ( ( '(' ) )
            // InternalUseCase.g:4351:1: ( '(' )
            {
            // InternalUseCase.g:4351:1: ( '(' )
            // InternalUseCase.g:4352:2: '('
            {
             before(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__0__Impl"


    // $ANTLR start "rule__Output__Group_4__1"
    // InternalUseCase.g:4361:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl rule__Output__Group_4__2 ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4365:1: ( rule__Output__Group_4__1__Impl rule__Output__Group_4__2 )
            // InternalUseCase.g:4366:2: rule__Output__Group_4__1__Impl rule__Output__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__Output__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__1"


    // $ANTLR start "rule__Output__Group_4__1__Impl"
    // InternalUseCase.g:4373:1: rule__Output__Group_4__1__Impl : ( ( rule__Output__Alternatives_4_1 ) ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4377:1: ( ( ( rule__Output__Alternatives_4_1 ) ) )
            // InternalUseCase.g:4378:1: ( ( rule__Output__Alternatives_4_1 ) )
            {
            // InternalUseCase.g:4378:1: ( ( rule__Output__Alternatives_4_1 ) )
            // InternalUseCase.g:4379:2: ( rule__Output__Alternatives_4_1 )
            {
             before(grammarAccess.getOutputAccess().getAlternatives_4_1()); 
            // InternalUseCase.g:4380:2: ( rule__Output__Alternatives_4_1 )
            // InternalUseCase.g:4380:3: rule__Output__Alternatives_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__Alternatives_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getAlternatives_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__1__Impl"


    // $ANTLR start "rule__Output__Group_4__2"
    // InternalUseCase.g:4388:1: rule__Output__Group_4__2 : rule__Output__Group_4__2__Impl rule__Output__Group_4__3 ;
    public final void rule__Output__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4392:1: ( rule__Output__Group_4__2__Impl rule__Output__Group_4__3 )
            // InternalUseCase.g:4393:2: rule__Output__Group_4__2__Impl rule__Output__Group_4__3
            {
            pushFollow(FOLLOW_32);
            rule__Output__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__2"


    // $ANTLR start "rule__Output__Group_4__2__Impl"
    // InternalUseCase.g:4400:1: rule__Output__Group_4__2__Impl : ( ( rule__Output__ExampleAssignment_4_2 ) ) ;
    public final void rule__Output__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4404:1: ( ( ( rule__Output__ExampleAssignment_4_2 ) ) )
            // InternalUseCase.g:4405:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            {
            // InternalUseCase.g:4405:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            // InternalUseCase.g:4406:2: ( rule__Output__ExampleAssignment_4_2 )
            {
             before(grammarAccess.getOutputAccess().getExampleAssignment_4_2()); 
            // InternalUseCase.g:4407:2: ( rule__Output__ExampleAssignment_4_2 )
            // InternalUseCase.g:4407:3: rule__Output__ExampleAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Output__ExampleAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getExampleAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__2__Impl"


    // $ANTLR start "rule__Output__Group_4__3"
    // InternalUseCase.g:4415:1: rule__Output__Group_4__3 : rule__Output__Group_4__3__Impl ;
    public final void rule__Output__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4419:1: ( rule__Output__Group_4__3__Impl )
            // InternalUseCase.g:4420:2: rule__Output__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__3"


    // $ANTLR start "rule__Output__Group_4__3__Impl"
    // InternalUseCase.g:4426:1: rule__Output__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Output__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4430:1: ( ( ')' ) )
            // InternalUseCase.g:4431:1: ( ')' )
            {
            // InternalUseCase.g:4431:1: ( ')' )
            // InternalUseCase.g:4432:2: ')'
            {
             before(grammarAccess.getOutputAccess().getRightParenthesisKeyword_4_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__3__Impl"


    // $ANTLR start "rule__PreConditions__Group__0"
    // InternalUseCase.g:4442:1: rule__PreConditions__Group__0 : rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 ;
    public final void rule__PreConditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4446:1: ( rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 )
            // InternalUseCase.g:4447:2: rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__PreConditions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreConditions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreConditions__Group__0"


    // $ANTLR start "rule__PreConditions__Group__0__Impl"
    // InternalUseCase.g:4454:1: rule__PreConditions__Group__0__Impl : ( ( rule__PreConditions__Alternatives_0 ) ) ;
    public final void rule__PreConditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4458:1: ( ( ( rule__PreConditions__Alternatives_0 ) ) )
            // InternalUseCase.g:4459:1: ( ( rule__PreConditions__Alternatives_0 ) )
            {
            // InternalUseCase.g:4459:1: ( ( rule__PreConditions__Alternatives_0 ) )
            // InternalUseCase.g:4460:2: ( rule__PreConditions__Alternatives_0 )
            {
             before(grammarAccess.getPreConditionsAccess().getAlternatives_0()); 
            // InternalUseCase.g:4461:2: ( rule__PreConditions__Alternatives_0 )
            // InternalUseCase.g:4461:3: rule__PreConditions__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PreConditions__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPreConditionsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreConditions__Group__0__Impl"


    // $ANTLR start "rule__PreConditions__Group__1"
    // InternalUseCase.g:4469:1: rule__PreConditions__Group__1 : rule__PreConditions__Group__1__Impl ;
    public final void rule__PreConditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4473:1: ( rule__PreConditions__Group__1__Impl )
            // InternalUseCase.g:4474:2: rule__PreConditions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PreConditions__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreConditions__Group__1"


    // $ANTLR start "rule__PreConditions__Group__1__Impl"
    // InternalUseCase.g:4480:1: rule__PreConditions__Group__1__Impl : ( ( rule__PreConditions__ConditionsAssignment_1 )* ) ;
    public final void rule__PreConditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4484:1: ( ( ( rule__PreConditions__ConditionsAssignment_1 )* ) )
            // InternalUseCase.g:4485:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            {
            // InternalUseCase.g:4485:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            // InternalUseCase.g:4486:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            {
             before(grammarAccess.getPreConditionsAccess().getConditionsAssignment_1()); 
            // InternalUseCase.g:4487:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==62) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalUseCase.g:4487:3: rule__PreConditions__ConditionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__PreConditions__ConditionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getPreConditionsAccess().getConditionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreConditions__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalUseCase.g:4496:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4500:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalUseCase.g:4501:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalUseCase.g:4508:1: rule__Condition__Group__0__Impl : ( '-' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4512:1: ( ( '-' ) )
            // InternalUseCase.g:4513:1: ( '-' )
            {
            // InternalUseCase.g:4513:1: ( '-' )
            // InternalUseCase.g:4514:2: '-'
            {
             before(grammarAccess.getConditionAccess().getHyphenMinusKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalUseCase.g:4523:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4527:1: ( rule__Condition__Group__1__Impl )
            // InternalUseCase.g:4528:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalUseCase.g:4534:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ContentAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4538:1: ( ( ( rule__Condition__ContentAssignment_1 ) ) )
            // InternalUseCase.g:4539:1: ( ( rule__Condition__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:4539:1: ( ( rule__Condition__ContentAssignment_1 ) )
            // InternalUseCase.g:4540:2: ( rule__Condition__ContentAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getContentAssignment_1()); 
            // InternalUseCase.g:4541:2: ( rule__Condition__ContentAssignment_1 )
            // InternalUseCase.g:4541:3: rule__Condition__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Steps__Group__0"
    // InternalUseCase.g:4550:1: rule__Steps__Group__0 : rule__Steps__Group__0__Impl rule__Steps__Group__1 ;
    public final void rule__Steps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4554:1: ( rule__Steps__Group__0__Impl rule__Steps__Group__1 )
            // InternalUseCase.g:4555:2: rule__Steps__Group__0__Impl rule__Steps__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Steps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Steps__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__Group__0"


    // $ANTLR start "rule__Steps__Group__0__Impl"
    // InternalUseCase.g:4562:1: rule__Steps__Group__0__Impl : ( ( rule__Steps__Alternatives_0 ) ) ;
    public final void rule__Steps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4566:1: ( ( ( rule__Steps__Alternatives_0 ) ) )
            // InternalUseCase.g:4567:1: ( ( rule__Steps__Alternatives_0 ) )
            {
            // InternalUseCase.g:4567:1: ( ( rule__Steps__Alternatives_0 ) )
            // InternalUseCase.g:4568:2: ( rule__Steps__Alternatives_0 )
            {
             before(grammarAccess.getStepsAccess().getAlternatives_0()); 
            // InternalUseCase.g:4569:2: ( rule__Steps__Alternatives_0 )
            // InternalUseCase.g:4569:3: rule__Steps__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Steps__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStepsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__Group__0__Impl"


    // $ANTLR start "rule__Steps__Group__1"
    // InternalUseCase.g:4577:1: rule__Steps__Group__1 : rule__Steps__Group__1__Impl ;
    public final void rule__Steps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4581:1: ( rule__Steps__Group__1__Impl )
            // InternalUseCase.g:4582:2: rule__Steps__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Steps__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__Group__1"


    // $ANTLR start "rule__Steps__Group__1__Impl"
    // InternalUseCase.g:4588:1: rule__Steps__Group__1__Impl : ( ( rule__Steps__StepsAssignment_1 )* ) ;
    public final void rule__Steps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4592:1: ( ( ( rule__Steps__StepsAssignment_1 )* ) )
            // InternalUseCase.g:4593:1: ( ( rule__Steps__StepsAssignment_1 )* )
            {
            // InternalUseCase.g:4593:1: ( ( rule__Steps__StepsAssignment_1 )* )
            // InternalUseCase.g:4594:2: ( rule__Steps__StepsAssignment_1 )*
            {
             before(grammarAccess.getStepsAccess().getStepsAssignment_1()); 
            // InternalUseCase.g:4595:2: ( rule__Steps__StepsAssignment_1 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_INT) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalUseCase.g:4595:3: rule__Steps__StepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Steps__StepsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

             after(grammarAccess.getStepsAccess().getStepsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalUseCase.g:4604:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4608:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalUseCase.g:4609:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0"


    // $ANTLR start "rule__Step__Group__0__Impl"
    // InternalUseCase.g:4616:1: rule__Step__Group__0__Impl : ( ( rule__Step__NumberAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4620:1: ( ( ( rule__Step__NumberAssignment_0 ) ) )
            // InternalUseCase.g:4621:1: ( ( rule__Step__NumberAssignment_0 ) )
            {
            // InternalUseCase.g:4621:1: ( ( rule__Step__NumberAssignment_0 ) )
            // InternalUseCase.g:4622:2: ( rule__Step__NumberAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getNumberAssignment_0()); 
            // InternalUseCase.g:4623:2: ( rule__Step__NumberAssignment_0 )
            // InternalUseCase.g:4623:3: rule__Step__NumberAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__NumberAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getNumberAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // InternalUseCase.g:4631:1: rule__Step__Group__1 : rule__Step__Group__1__Impl ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4635:1: ( rule__Step__Group__1__Impl )
            // InternalUseCase.g:4636:2: rule__Step__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1"


    // $ANTLR start "rule__Step__Group__1__Impl"
    // InternalUseCase.g:4642:1: rule__Step__Group__1__Impl : ( ( rule__Step__Alternatives_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4646:1: ( ( ( rule__Step__Alternatives_1 ) ) )
            // InternalUseCase.g:4647:1: ( ( rule__Step__Alternatives_1 ) )
            {
            // InternalUseCase.g:4647:1: ( ( rule__Step__Alternatives_1 ) )
            // InternalUseCase.g:4648:2: ( rule__Step__Alternatives_1 )
            {
             before(grammarAccess.getStepAccess().getAlternatives_1()); 
            // InternalUseCase.g:4649:2: ( rule__Step__Alternatives_1 )
            // InternalUseCase.g:4649:3: rule__Step__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Step__Group_1_0__0"
    // InternalUseCase.g:4658:1: rule__Step__Group_1_0__0 : rule__Step__Group_1_0__0__Impl rule__Step__Group_1_0__1 ;
    public final void rule__Step__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4662:1: ( rule__Step__Group_1_0__0__Impl rule__Step__Group_1_0__1 )
            // InternalUseCase.g:4663:2: rule__Step__Group_1_0__0__Impl rule__Step__Group_1_0__1
            {
            pushFollow(FOLLOW_38);
            rule__Step__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_1_0__0"


    // $ANTLR start "rule__Step__Group_1_0__0__Impl"
    // InternalUseCase.g:4670:1: rule__Step__Group_1_0__0__Impl : ( ( rule__Step__ActionAssignment_1_0_0 ) ) ;
    public final void rule__Step__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4674:1: ( ( ( rule__Step__ActionAssignment_1_0_0 ) ) )
            // InternalUseCase.g:4675:1: ( ( rule__Step__ActionAssignment_1_0_0 ) )
            {
            // InternalUseCase.g:4675:1: ( ( rule__Step__ActionAssignment_1_0_0 ) )
            // InternalUseCase.g:4676:2: ( rule__Step__ActionAssignment_1_0_0 )
            {
             before(grammarAccess.getStepAccess().getActionAssignment_1_0_0()); 
            // InternalUseCase.g:4677:2: ( rule__Step__ActionAssignment_1_0_0 )
            // InternalUseCase.g:4677:3: rule__Step__ActionAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__ActionAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getActionAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_1_0__0__Impl"


    // $ANTLR start "rule__Step__Group_1_0__1"
    // InternalUseCase.g:4685:1: rule__Step__Group_1_0__1 : rule__Step__Group_1_0__1__Impl ;
    public final void rule__Step__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4689:1: ( rule__Step__Group_1_0__1__Impl )
            // InternalUseCase.g:4690:2: rule__Step__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_1_0__1"


    // $ANTLR start "rule__Step__Group_1_0__1__Impl"
    // InternalUseCase.g:4696:1: rule__Step__Group_1_0__1__Impl : ( ( rule__Step__ErrorAssignment_1_0_1 )? ) ;
    public final void rule__Step__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4700:1: ( ( ( rule__Step__ErrorAssignment_1_0_1 )? ) )
            // InternalUseCase.g:4701:1: ( ( rule__Step__ErrorAssignment_1_0_1 )? )
            {
            // InternalUseCase.g:4701:1: ( ( rule__Step__ErrorAssignment_1_0_1 )? )
            // InternalUseCase.g:4702:2: ( rule__Step__ErrorAssignment_1_0_1 )?
            {
             before(grammarAccess.getStepAccess().getErrorAssignment_1_0_1()); 
            // InternalUseCase.g:4703:2: ( rule__Step__ErrorAssignment_1_0_1 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=38 && LA67_0<=39)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalUseCase.g:4703:3: rule__Step__ErrorAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__ErrorAssignment_1_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStepAccess().getErrorAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group_1_0__1__Impl"


    // $ANTLR start "rule__RaiseErrorConditional__Group__0"
    // InternalUseCase.g:4712:1: rule__RaiseErrorConditional__Group__0 : rule__RaiseErrorConditional__Group__0__Impl rule__RaiseErrorConditional__Group__1 ;
    public final void rule__RaiseErrorConditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4716:1: ( rule__RaiseErrorConditional__Group__0__Impl rule__RaiseErrorConditional__Group__1 )
            // InternalUseCase.g:4717:2: rule__RaiseErrorConditional__Group__0__Impl rule__RaiseErrorConditional__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__RaiseErrorConditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group__0"


    // $ANTLR start "rule__RaiseErrorConditional__Group__0__Impl"
    // InternalUseCase.g:4724:1: rule__RaiseErrorConditional__Group__0__Impl : ( ( rule__RaiseErrorConditional__Alternatives_0 ) ) ;
    public final void rule__RaiseErrorConditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4728:1: ( ( ( rule__RaiseErrorConditional__Alternatives_0 ) ) )
            // InternalUseCase.g:4729:1: ( ( rule__RaiseErrorConditional__Alternatives_0 ) )
            {
            // InternalUseCase.g:4729:1: ( ( rule__RaiseErrorConditional__Alternatives_0 ) )
            // InternalUseCase.g:4730:2: ( rule__RaiseErrorConditional__Alternatives_0 )
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getAlternatives_0()); 
            // InternalUseCase.g:4731:2: ( rule__RaiseErrorConditional__Alternatives_0 )
            // InternalUseCase.g:4731:3: rule__RaiseErrorConditional__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRaiseErrorConditionalAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group__0__Impl"


    // $ANTLR start "rule__RaiseErrorConditional__Group__1"
    // InternalUseCase.g:4739:1: rule__RaiseErrorConditional__Group__1 : rule__RaiseErrorConditional__Group__1__Impl rule__RaiseErrorConditional__Group__2 ;
    public final void rule__RaiseErrorConditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4743:1: ( rule__RaiseErrorConditional__Group__1__Impl rule__RaiseErrorConditional__Group__2 )
            // InternalUseCase.g:4744:2: rule__RaiseErrorConditional__Group__1__Impl rule__RaiseErrorConditional__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RaiseErrorConditional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group__1"


    // $ANTLR start "rule__RaiseErrorConditional__Group__1__Impl"
    // InternalUseCase.g:4751:1: rule__RaiseErrorConditional__Group__1__Impl : ( ( rule__RaiseErrorConditional__Alternatives_1 ) ) ;
    public final void rule__RaiseErrorConditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4755:1: ( ( ( rule__RaiseErrorConditional__Alternatives_1 ) ) )
            // InternalUseCase.g:4756:1: ( ( rule__RaiseErrorConditional__Alternatives_1 ) )
            {
            // InternalUseCase.g:4756:1: ( ( rule__RaiseErrorConditional__Alternatives_1 ) )
            // InternalUseCase.g:4757:2: ( rule__RaiseErrorConditional__Alternatives_1 )
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getAlternatives_1()); 
            // InternalUseCase.g:4758:2: ( rule__RaiseErrorConditional__Alternatives_1 )
            // InternalUseCase.g:4758:3: rule__RaiseErrorConditional__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRaiseErrorConditionalAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group__1__Impl"


    // $ANTLR start "rule__RaiseErrorConditional__Group__2"
    // InternalUseCase.g:4766:1: rule__RaiseErrorConditional__Group__2 : rule__RaiseErrorConditional__Group__2__Impl ;
    public final void rule__RaiseErrorConditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4770:1: ( rule__RaiseErrorConditional__Group__2__Impl )
            // InternalUseCase.g:4771:2: rule__RaiseErrorConditional__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group__2"


    // $ANTLR start "rule__RaiseErrorConditional__Group__2__Impl"
    // InternalUseCase.g:4777:1: rule__RaiseErrorConditional__Group__2__Impl : ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) ) ;
    public final void rule__RaiseErrorConditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4781:1: ( ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) ) )
            // InternalUseCase.g:4782:1: ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) )
            {
            // InternalUseCase.g:4782:1: ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) )
            // InternalUseCase.g:4783:2: ( rule__RaiseErrorConditional__ExceptionAssignment_2 )
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getExceptionAssignment_2()); 
            // InternalUseCase.g:4784:2: ( rule__RaiseErrorConditional__ExceptionAssignment_2 )
            // InternalUseCase.g:4784:3: rule__RaiseErrorConditional__ExceptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__ExceptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRaiseErrorConditionalAccess().getExceptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group__2__Impl"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_0__0"
    // InternalUseCase.g:4793:1: rule__RaiseErrorConditional__Group_1_0__0 : rule__RaiseErrorConditional__Group_1_0__0__Impl rule__RaiseErrorConditional__Group_1_0__1 ;
    public final void rule__RaiseErrorConditional__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4797:1: ( rule__RaiseErrorConditional__Group_1_0__0__Impl rule__RaiseErrorConditional__Group_1_0__1 )
            // InternalUseCase.g:4798:2: rule__RaiseErrorConditional__Group_1_0__0__Impl rule__RaiseErrorConditional__Group_1_0__1
            {
            pushFollow(FOLLOW_40);
            rule__RaiseErrorConditional__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_0__0"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_0__0__Impl"
    // InternalUseCase.g:4805:1: rule__RaiseErrorConditional__Group_1_0__0__Impl : ( 'On' ) ;
    public final void rule__RaiseErrorConditional__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4809:1: ( ( 'On' ) )
            // InternalUseCase.g:4810:1: ( 'On' )
            {
            // InternalUseCase.g:4810:1: ( 'On' )
            // InternalUseCase.g:4811:2: 'On'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getOnKeyword_1_0_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorConditionalAccess().getOnKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_0__0__Impl"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_0__1"
    // InternalUseCase.g:4820:1: rule__RaiseErrorConditional__Group_1_0__1 : rule__RaiseErrorConditional__Group_1_0__1__Impl rule__RaiseErrorConditional__Group_1_0__2 ;
    public final void rule__RaiseErrorConditional__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4824:1: ( rule__RaiseErrorConditional__Group_1_0__1__Impl rule__RaiseErrorConditional__Group_1_0__2 )
            // InternalUseCase.g:4825:2: rule__RaiseErrorConditional__Group_1_0__1__Impl rule__RaiseErrorConditional__Group_1_0__2
            {
            pushFollow(FOLLOW_41);
            rule__RaiseErrorConditional__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_0__1"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_0__1__Impl"
    // InternalUseCase.g:4832:1: rule__RaiseErrorConditional__Group_1_0__1__Impl : ( 'error' ) ;
    public final void rule__RaiseErrorConditional__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4836:1: ( ( 'error' ) )
            // InternalUseCase.g:4837:1: ( 'error' )
            {
            // InternalUseCase.g:4837:1: ( 'error' )
            // InternalUseCase.g:4838:2: 'error'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getErrorKeyword_1_0_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorConditionalAccess().getErrorKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_0__1__Impl"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_0__2"
    // InternalUseCase.g:4847:1: rule__RaiseErrorConditional__Group_1_0__2 : rule__RaiseErrorConditional__Group_1_0__2__Impl ;
    public final void rule__RaiseErrorConditional__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4851:1: ( rule__RaiseErrorConditional__Group_1_0__2__Impl )
            // InternalUseCase.g:4852:2: rule__RaiseErrorConditional__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_0__2"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_0__2__Impl"
    // InternalUseCase.g:4858:1: rule__RaiseErrorConditional__Group_1_0__2__Impl : ( 'raise' ) ;
    public final void rule__RaiseErrorConditional__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4862:1: ( ( 'raise' ) )
            // InternalUseCase.g:4863:1: ( 'raise' )
            {
            // InternalUseCase.g:4863:1: ( 'raise' )
            // InternalUseCase.g:4864:2: 'raise'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getRaiseKeyword_1_0_2()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorConditionalAccess().getRaiseKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_0__2__Impl"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_1__0"
    // InternalUseCase.g:4874:1: rule__RaiseErrorConditional__Group_1_1__0 : rule__RaiseErrorConditional__Group_1_1__0__Impl rule__RaiseErrorConditional__Group_1_1__1 ;
    public final void rule__RaiseErrorConditional__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4878:1: ( rule__RaiseErrorConditional__Group_1_1__0__Impl rule__RaiseErrorConditional__Group_1_1__1 )
            // InternalUseCase.g:4879:2: rule__RaiseErrorConditional__Group_1_1__0__Impl rule__RaiseErrorConditional__Group_1_1__1
            {
            pushFollow(FOLLOW_42);
            rule__RaiseErrorConditional__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_1__0"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_1__0__Impl"
    // InternalUseCase.g:4886:1: rule__RaiseErrorConditional__Group_1_1__0__Impl : ( 'Bei' ) ;
    public final void rule__RaiseErrorConditional__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4890:1: ( ( 'Bei' ) )
            // InternalUseCase.g:4891:1: ( 'Bei' )
            {
            // InternalUseCase.g:4891:1: ( 'Bei' )
            // InternalUseCase.g:4892:2: 'Bei'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getBeiKeyword_1_1_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorConditionalAccess().getBeiKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_1__0__Impl"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_1__1"
    // InternalUseCase.g:4901:1: rule__RaiseErrorConditional__Group_1_1__1 : rule__RaiseErrorConditional__Group_1_1__1__Impl rule__RaiseErrorConditional__Group_1_1__2 ;
    public final void rule__RaiseErrorConditional__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4905:1: ( rule__RaiseErrorConditional__Group_1_1__1__Impl rule__RaiseErrorConditional__Group_1_1__2 )
            // InternalUseCase.g:4906:2: rule__RaiseErrorConditional__Group_1_1__1__Impl rule__RaiseErrorConditional__Group_1_1__2
            {
            pushFollow(FOLLOW_43);
            rule__RaiseErrorConditional__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_1__1"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_1__1__Impl"
    // InternalUseCase.g:4913:1: rule__RaiseErrorConditional__Group_1_1__1__Impl : ( 'Fehler' ) ;
    public final void rule__RaiseErrorConditional__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4917:1: ( ( 'Fehler' ) )
            // InternalUseCase.g:4918:1: ( 'Fehler' )
            {
            // InternalUseCase.g:4918:1: ( 'Fehler' )
            // InternalUseCase.g:4919:2: 'Fehler'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getFehlerKeyword_1_1_1()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorConditionalAccess().getFehlerKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_1__1__Impl"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_1__2"
    // InternalUseCase.g:4928:1: rule__RaiseErrorConditional__Group_1_1__2 : rule__RaiseErrorConditional__Group_1_1__2__Impl ;
    public final void rule__RaiseErrorConditional__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4932:1: ( rule__RaiseErrorConditional__Group_1_1__2__Impl )
            // InternalUseCase.g:4933:2: rule__RaiseErrorConditional__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorConditional__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_1__2"


    // $ANTLR start "rule__RaiseErrorConditional__Group_1_1__2__Impl"
    // InternalUseCase.g:4939:1: rule__RaiseErrorConditional__Group_1_1__2__Impl : ( 'melde' ) ;
    public final void rule__RaiseErrorConditional__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4943:1: ( ( 'melde' ) )
            // InternalUseCase.g:4944:1: ( 'melde' )
            {
            // InternalUseCase.g:4944:1: ( 'melde' )
            // InternalUseCase.g:4945:2: 'melde'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getMeldeKeyword_1_1_2()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorConditionalAccess().getMeldeKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__Group_1_1__2__Impl"


    // $ANTLR start "rule__RaiseErrorNow__Group__0"
    // InternalUseCase.g:4955:1: rule__RaiseErrorNow__Group__0 : rule__RaiseErrorNow__Group__0__Impl rule__RaiseErrorNow__Group__1 ;
    public final void rule__RaiseErrorNow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4959:1: ( rule__RaiseErrorNow__Group__0__Impl rule__RaiseErrorNow__Group__1 )
            // InternalUseCase.g:4960:2: rule__RaiseErrorNow__Group__0__Impl rule__RaiseErrorNow__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RaiseErrorNow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseErrorNow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group__0"


    // $ANTLR start "rule__RaiseErrorNow__Group__0__Impl"
    // InternalUseCase.g:4967:1: rule__RaiseErrorNow__Group__0__Impl : ( ( rule__RaiseErrorNow__Alternatives_0 ) ) ;
    public final void rule__RaiseErrorNow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4971:1: ( ( ( rule__RaiseErrorNow__Alternatives_0 ) ) )
            // InternalUseCase.g:4972:1: ( ( rule__RaiseErrorNow__Alternatives_0 ) )
            {
            // InternalUseCase.g:4972:1: ( ( rule__RaiseErrorNow__Alternatives_0 ) )
            // InternalUseCase.g:4973:2: ( rule__RaiseErrorNow__Alternatives_0 )
            {
             before(grammarAccess.getRaiseErrorNowAccess().getAlternatives_0()); 
            // InternalUseCase.g:4974:2: ( rule__RaiseErrorNow__Alternatives_0 )
            // InternalUseCase.g:4974:3: rule__RaiseErrorNow__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorNow__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRaiseErrorNowAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group__0__Impl"


    // $ANTLR start "rule__RaiseErrorNow__Group__1"
    // InternalUseCase.g:4982:1: rule__RaiseErrorNow__Group__1 : rule__RaiseErrorNow__Group__1__Impl ;
    public final void rule__RaiseErrorNow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4986:1: ( rule__RaiseErrorNow__Group__1__Impl )
            // InternalUseCase.g:4987:2: rule__RaiseErrorNow__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorNow__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group__1"


    // $ANTLR start "rule__RaiseErrorNow__Group__1__Impl"
    // InternalUseCase.g:4993:1: rule__RaiseErrorNow__Group__1__Impl : ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) ) ;
    public final void rule__RaiseErrorNow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4997:1: ( ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) ) )
            // InternalUseCase.g:4998:1: ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) )
            {
            // InternalUseCase.g:4998:1: ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) )
            // InternalUseCase.g:4999:2: ( rule__RaiseErrorNow__ExceptionAssignment_1 )
            {
             before(grammarAccess.getRaiseErrorNowAccess().getExceptionAssignment_1()); 
            // InternalUseCase.g:5000:2: ( rule__RaiseErrorNow__ExceptionAssignment_1 )
            // InternalUseCase.g:5000:3: rule__RaiseErrorNow__ExceptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorNow__ExceptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRaiseErrorNowAccess().getExceptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group__1__Impl"


    // $ANTLR start "rule__RaiseErrorNow__Group_0_0__0"
    // InternalUseCase.g:5009:1: rule__RaiseErrorNow__Group_0_0__0 : rule__RaiseErrorNow__Group_0_0__0__Impl rule__RaiseErrorNow__Group_0_0__1 ;
    public final void rule__RaiseErrorNow__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5013:1: ( rule__RaiseErrorNow__Group_0_0__0__Impl rule__RaiseErrorNow__Group_0_0__1 )
            // InternalUseCase.g:5014:2: rule__RaiseErrorNow__Group_0_0__0__Impl rule__RaiseErrorNow__Group_0_0__1
            {
            pushFollow(FOLLOW_40);
            rule__RaiseErrorNow__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseErrorNow__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group_0_0__0"


    // $ANTLR start "rule__RaiseErrorNow__Group_0_0__0__Impl"
    // InternalUseCase.g:5021:1: rule__RaiseErrorNow__Group_0_0__0__Impl : ( 'Raise' ) ;
    public final void rule__RaiseErrorNow__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5025:1: ( ( 'Raise' ) )
            // InternalUseCase.g:5026:1: ( 'Raise' )
            {
            // InternalUseCase.g:5026:1: ( 'Raise' )
            // InternalUseCase.g:5027:2: 'Raise'
            {
             before(grammarAccess.getRaiseErrorNowAccess().getRaiseKeyword_0_0_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorNowAccess().getRaiseKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group_0_0__0__Impl"


    // $ANTLR start "rule__RaiseErrorNow__Group_0_0__1"
    // InternalUseCase.g:5036:1: rule__RaiseErrorNow__Group_0_0__1 : rule__RaiseErrorNow__Group_0_0__1__Impl ;
    public final void rule__RaiseErrorNow__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5040:1: ( rule__RaiseErrorNow__Group_0_0__1__Impl )
            // InternalUseCase.g:5041:2: rule__RaiseErrorNow__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorNow__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group_0_0__1"


    // $ANTLR start "rule__RaiseErrorNow__Group_0_0__1__Impl"
    // InternalUseCase.g:5047:1: rule__RaiseErrorNow__Group_0_0__1__Impl : ( ( 'error' )? ) ;
    public final void rule__RaiseErrorNow__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5051:1: ( ( ( 'error' )? ) )
            // InternalUseCase.g:5052:1: ( ( 'error' )? )
            {
            // InternalUseCase.g:5052:1: ( ( 'error' )? )
            // InternalUseCase.g:5053:2: ( 'error' )?
            {
             before(grammarAccess.getRaiseErrorNowAccess().getErrorKeyword_0_0_1()); 
            // InternalUseCase.g:5054:2: ( 'error' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==76) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalUseCase.g:5054:3: 'error'
                    {
                    match(input,76,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRaiseErrorNowAccess().getErrorKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group_0_0__1__Impl"


    // $ANTLR start "rule__RaiseErrorNow__Group_0_1__0"
    // InternalUseCase.g:5063:1: rule__RaiseErrorNow__Group_0_1__0 : rule__RaiseErrorNow__Group_0_1__0__Impl rule__RaiseErrorNow__Group_0_1__1 ;
    public final void rule__RaiseErrorNow__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5067:1: ( rule__RaiseErrorNow__Group_0_1__0__Impl rule__RaiseErrorNow__Group_0_1__1 )
            // InternalUseCase.g:5068:2: rule__RaiseErrorNow__Group_0_1__0__Impl rule__RaiseErrorNow__Group_0_1__1
            {
            pushFollow(FOLLOW_42);
            rule__RaiseErrorNow__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseErrorNow__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group_0_1__0"


    // $ANTLR start "rule__RaiseErrorNow__Group_0_1__0__Impl"
    // InternalUseCase.g:5075:1: rule__RaiseErrorNow__Group_0_1__0__Impl : ( 'Melde' ) ;
    public final void rule__RaiseErrorNow__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5079:1: ( ( 'Melde' ) )
            // InternalUseCase.g:5080:1: ( 'Melde' )
            {
            // InternalUseCase.g:5080:1: ( 'Melde' )
            // InternalUseCase.g:5081:2: 'Melde'
            {
             before(grammarAccess.getRaiseErrorNowAccess().getMeldeKeyword_0_1_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorNowAccess().getMeldeKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group_0_1__0__Impl"


    // $ANTLR start "rule__RaiseErrorNow__Group_0_1__1"
    // InternalUseCase.g:5090:1: rule__RaiseErrorNow__Group_0_1__1 : rule__RaiseErrorNow__Group_0_1__1__Impl ;
    public final void rule__RaiseErrorNow__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5094:1: ( rule__RaiseErrorNow__Group_0_1__1__Impl )
            // InternalUseCase.g:5095:2: rule__RaiseErrorNow__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseErrorNow__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group_0_1__1"


    // $ANTLR start "rule__RaiseErrorNow__Group_0_1__1__Impl"
    // InternalUseCase.g:5101:1: rule__RaiseErrorNow__Group_0_1__1__Impl : ( ( 'Fehler' )? ) ;
    public final void rule__RaiseErrorNow__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5105:1: ( ( ( 'Fehler' )? ) )
            // InternalUseCase.g:5106:1: ( ( 'Fehler' )? )
            {
            // InternalUseCase.g:5106:1: ( ( 'Fehler' )? )
            // InternalUseCase.g:5107:2: ( 'Fehler' )?
            {
             before(grammarAccess.getRaiseErrorNowAccess().getFehlerKeyword_0_1_1()); 
            // InternalUseCase.g:5108:2: ( 'Fehler' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==79) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalUseCase.g:5108:3: 'Fehler'
                    {
                    match(input,79,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRaiseErrorNowAccess().getFehlerKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__Group_0_1__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalUseCase.g:5117:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5121:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalUseCase.g:5122:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalUseCase.g:5129:1: rule__IfStatement__Group__0__Impl : ( ( rule__IfStatement__Alternatives_0 ) ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5133:1: ( ( ( rule__IfStatement__Alternatives_0 ) ) )
            // InternalUseCase.g:5134:1: ( ( rule__IfStatement__Alternatives_0 ) )
            {
            // InternalUseCase.g:5134:1: ( ( rule__IfStatement__Alternatives_0 ) )
            // InternalUseCase.g:5135:2: ( rule__IfStatement__Alternatives_0 )
            {
             before(grammarAccess.getIfStatementAccess().getAlternatives_0()); 
            // InternalUseCase.g:5136:2: ( rule__IfStatement__Alternatives_0 )
            // InternalUseCase.g:5136:3: rule__IfStatement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalUseCase.g:5144:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5148:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalUseCase.g:5149:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalUseCase.g:5156:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ConditionAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5160:1: ( ( ( rule__IfStatement__ConditionAssignment_1 ) ) )
            // InternalUseCase.g:5161:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            {
            // InternalUseCase.g:5161:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            // InternalUseCase.g:5162:2: ( rule__IfStatement__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_1()); 
            // InternalUseCase.g:5163:2: ( rule__IfStatement__ConditionAssignment_1 )
            // InternalUseCase.g:5163:3: rule__IfStatement__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalUseCase.g:5171:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5175:1: ( rule__IfStatement__Group__2__Impl )
            // InternalUseCase.g:5176:2: rule__IfStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalUseCase.g:5182:1: rule__IfStatement__Group__2__Impl : ( ':' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5186:1: ( ( ':' ) )
            // InternalUseCase.g:5187:1: ( ':' )
            {
            // InternalUseCase.g:5187:1: ( ':' )
            // InternalUseCase.g:5188:2: ':'
            {
             before(grammarAccess.getIfStatementAccess().getColonKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalUseCase.g:5198:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5202:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalUseCase.g:5203:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalUseCase.g:5210:1: rule__Loop__Group__0__Impl : ( ( rule__Loop__Alternatives_0 ) ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5214:1: ( ( ( rule__Loop__Alternatives_0 ) ) )
            // InternalUseCase.g:5215:1: ( ( rule__Loop__Alternatives_0 ) )
            {
            // InternalUseCase.g:5215:1: ( ( rule__Loop__Alternatives_0 ) )
            // InternalUseCase.g:5216:2: ( rule__Loop__Alternatives_0 )
            {
             before(grammarAccess.getLoopAccess().getAlternatives_0()); 
            // InternalUseCase.g:5217:2: ( rule__Loop__Alternatives_0 )
            // InternalUseCase.g:5217:3: rule__Loop__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalUseCase.g:5225:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5229:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalUseCase.g:5230:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalUseCase.g:5237:1: rule__Loop__Group__1__Impl : ( ( rule__Loop__ConditionAssignment_1 ) ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5241:1: ( ( ( rule__Loop__ConditionAssignment_1 ) ) )
            // InternalUseCase.g:5242:1: ( ( rule__Loop__ConditionAssignment_1 ) )
            {
            // InternalUseCase.g:5242:1: ( ( rule__Loop__ConditionAssignment_1 ) )
            // InternalUseCase.g:5243:2: ( rule__Loop__ConditionAssignment_1 )
            {
             before(grammarAccess.getLoopAccess().getConditionAssignment_1()); 
            // InternalUseCase.g:5244:2: ( rule__Loop__ConditionAssignment_1 )
            // InternalUseCase.g:5244:3: rule__Loop__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalUseCase.g:5252:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5256:1: ( rule__Loop__Group__2__Impl )
            // InternalUseCase.g:5257:2: rule__Loop__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalUseCase.g:5263:1: rule__Loop__Group__2__Impl : ( ':' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5267:1: ( ( ':' ) )
            // InternalUseCase.g:5268:1: ( ':' )
            {
            // InternalUseCase.g:5268:1: ( ':' )
            // InternalUseCase.g:5269:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Notes__Group__0"
    // InternalUseCase.g:5279:1: rule__Notes__Group__0 : rule__Notes__Group__0__Impl rule__Notes__Group__1 ;
    public final void rule__Notes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5283:1: ( rule__Notes__Group__0__Impl rule__Notes__Group__1 )
            // InternalUseCase.g:5284:2: rule__Notes__Group__0__Impl rule__Notes__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Notes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Notes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notes__Group__0"


    // $ANTLR start "rule__Notes__Group__0__Impl"
    // InternalUseCase.g:5291:1: rule__Notes__Group__0__Impl : ( ( rule__Notes__Alternatives_0 ) ) ;
    public final void rule__Notes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5295:1: ( ( ( rule__Notes__Alternatives_0 ) ) )
            // InternalUseCase.g:5296:1: ( ( rule__Notes__Alternatives_0 ) )
            {
            // InternalUseCase.g:5296:1: ( ( rule__Notes__Alternatives_0 ) )
            // InternalUseCase.g:5297:2: ( rule__Notes__Alternatives_0 )
            {
             before(grammarAccess.getNotesAccess().getAlternatives_0()); 
            // InternalUseCase.g:5298:2: ( rule__Notes__Alternatives_0 )
            // InternalUseCase.g:5298:3: rule__Notes__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Notes__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNotesAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notes__Group__0__Impl"


    // $ANTLR start "rule__Notes__Group__1"
    // InternalUseCase.g:5306:1: rule__Notes__Group__1 : rule__Notes__Group__1__Impl ;
    public final void rule__Notes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5310:1: ( rule__Notes__Group__1__Impl )
            // InternalUseCase.g:5311:2: rule__Notes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Notes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notes__Group__1"


    // $ANTLR start "rule__Notes__Group__1__Impl"
    // InternalUseCase.g:5317:1: rule__Notes__Group__1__Impl : ( ( rule__Notes__ContentAssignment_1 ) ) ;
    public final void rule__Notes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5321:1: ( ( ( rule__Notes__ContentAssignment_1 ) ) )
            // InternalUseCase.g:5322:1: ( ( rule__Notes__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:5322:1: ( ( rule__Notes__ContentAssignment_1 ) )
            // InternalUseCase.g:5323:2: ( rule__Notes__ContentAssignment_1 )
            {
             before(grammarAccess.getNotesAccess().getContentAssignment_1()); 
            // InternalUseCase.g:5324:2: ( rule__Notes__ContentAssignment_1 )
            // InternalUseCase.g:5324:3: rule__Notes__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Notes__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotesAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notes__Group__1__Impl"


    // $ANTLR start "rule__UsedTypes__Group__0"
    // InternalUseCase.g:5333:1: rule__UsedTypes__Group__0 : rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 ;
    public final void rule__UsedTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5337:1: ( rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 )
            // InternalUseCase.g:5338:2: rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__UsedTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsedTypes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group__0"


    // $ANTLR start "rule__UsedTypes__Group__0__Impl"
    // InternalUseCase.g:5345:1: rule__UsedTypes__Group__0__Impl : ( ( rule__UsedTypes__Alternatives_0 ) ) ;
    public final void rule__UsedTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5349:1: ( ( ( rule__UsedTypes__Alternatives_0 ) ) )
            // InternalUseCase.g:5350:1: ( ( rule__UsedTypes__Alternatives_0 ) )
            {
            // InternalUseCase.g:5350:1: ( ( rule__UsedTypes__Alternatives_0 ) )
            // InternalUseCase.g:5351:2: ( rule__UsedTypes__Alternatives_0 )
            {
             before(grammarAccess.getUsedTypesAccess().getAlternatives_0()); 
            // InternalUseCase.g:5352:2: ( rule__UsedTypes__Alternatives_0 )
            // InternalUseCase.g:5352:3: rule__UsedTypes__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__UsedTypes__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getUsedTypesAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group__0__Impl"


    // $ANTLR start "rule__UsedTypes__Group__1"
    // InternalUseCase.g:5360:1: rule__UsedTypes__Group__1 : rule__UsedTypes__Group__1__Impl ;
    public final void rule__UsedTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5364:1: ( rule__UsedTypes__Group__1__Impl )
            // InternalUseCase.g:5365:2: rule__UsedTypes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsedTypes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group__1"


    // $ANTLR start "rule__UsedTypes__Group__1__Impl"
    // InternalUseCase.g:5371:1: rule__UsedTypes__Group__1__Impl : ( ( rule__UsedTypes__TypesAssignment_1 )* ) ;
    public final void rule__UsedTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5375:1: ( ( ( rule__UsedTypes__TypesAssignment_1 )* ) )
            // InternalUseCase.g:5376:1: ( ( rule__UsedTypes__TypesAssignment_1 )* )
            {
            // InternalUseCase.g:5376:1: ( ( rule__UsedTypes__TypesAssignment_1 )* )
            // InternalUseCase.g:5377:2: ( rule__UsedTypes__TypesAssignment_1 )*
            {
             before(grammarAccess.getUsedTypesAccess().getTypesAssignment_1()); 
            // InternalUseCase.g:5378:2: ( rule__UsedTypes__TypesAssignment_1 )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==62) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalUseCase.g:5378:3: rule__UsedTypes__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__UsedTypes__TypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

             after(grammarAccess.getUsedTypesAccess().getTypesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group__1__Impl"


    // $ANTLR start "rule__UsedTypes__Group_0_0__0"
    // InternalUseCase.g:5387:1: rule__UsedTypes__Group_0_0__0 : rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1 ;
    public final void rule__UsedTypes__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5391:1: ( rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1 )
            // InternalUseCase.g:5392:2: rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1
            {
            pushFollow(FOLLOW_44);
            rule__UsedTypes__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsedTypes__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group_0_0__0"


    // $ANTLR start "rule__UsedTypes__Group_0_0__0__Impl"
    // InternalUseCase.g:5399:1: rule__UsedTypes__Group_0_0__0__Impl : ( 'used' ) ;
    public final void rule__UsedTypes__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5403:1: ( ( 'used' ) )
            // InternalUseCase.g:5404:1: ( 'used' )
            {
            // InternalUseCase.g:5404:1: ( 'used' )
            // InternalUseCase.g:5405:2: 'used'
            {
             before(grammarAccess.getUsedTypesAccess().getUsedKeyword_0_0_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getUsedTypesAccess().getUsedKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group_0_0__0__Impl"


    // $ANTLR start "rule__UsedTypes__Group_0_0__1"
    // InternalUseCase.g:5414:1: rule__UsedTypes__Group_0_0__1 : rule__UsedTypes__Group_0_0__1__Impl ;
    public final void rule__UsedTypes__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5418:1: ( rule__UsedTypes__Group_0_0__1__Impl )
            // InternalUseCase.g:5419:2: rule__UsedTypes__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsedTypes__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group_0_0__1"


    // $ANTLR start "rule__UsedTypes__Group_0_0__1__Impl"
    // InternalUseCase.g:5425:1: rule__UsedTypes__Group_0_0__1__Impl : ( 'building-blocks:' ) ;
    public final void rule__UsedTypes__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5429:1: ( ( 'building-blocks:' ) )
            // InternalUseCase.g:5430:1: ( 'building-blocks:' )
            {
            // InternalUseCase.g:5430:1: ( 'building-blocks:' )
            // InternalUseCase.g:5431:2: 'building-blocks:'
            {
             before(grammarAccess.getUsedTypesAccess().getBuildingBlocksKeyword_0_0_1()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getUsedTypesAccess().getBuildingBlocksKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group_0_0__1__Impl"


    // $ANTLR start "rule__UsedTypes__Group_0_1__0"
    // InternalUseCase.g:5441:1: rule__UsedTypes__Group_0_1__0 : rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1 ;
    public final void rule__UsedTypes__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5445:1: ( rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1 )
            // InternalUseCase.g:5446:2: rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1
            {
            pushFollow(FOLLOW_45);
            rule__UsedTypes__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsedTypes__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group_0_1__0"


    // $ANTLR start "rule__UsedTypes__Group_0_1__0__Impl"
    // InternalUseCase.g:5453:1: rule__UsedTypes__Group_0_1__0__Impl : ( 'Genutzte' ) ;
    public final void rule__UsedTypes__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5457:1: ( ( 'Genutzte' ) )
            // InternalUseCase.g:5458:1: ( 'Genutzte' )
            {
            // InternalUseCase.g:5458:1: ( 'Genutzte' )
            // InternalUseCase.g:5459:2: 'Genutzte'
            {
             before(grammarAccess.getUsedTypesAccess().getGenutzteKeyword_0_1_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getUsedTypesAccess().getGenutzteKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group_0_1__0__Impl"


    // $ANTLR start "rule__UsedTypes__Group_0_1__1"
    // InternalUseCase.g:5468:1: rule__UsedTypes__Group_0_1__1 : rule__UsedTypes__Group_0_1__1__Impl ;
    public final void rule__UsedTypes__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5472:1: ( rule__UsedTypes__Group_0_1__1__Impl )
            // InternalUseCase.g:5473:2: rule__UsedTypes__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsedTypes__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group_0_1__1"


    // $ANTLR start "rule__UsedTypes__Group_0_1__1__Impl"
    // InternalUseCase.g:5479:1: rule__UsedTypes__Group_0_1__1__Impl : ( 'Bausteine:' ) ;
    public final void rule__UsedTypes__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5483:1: ( ( 'Bausteine:' ) )
            // InternalUseCase.g:5484:1: ( 'Bausteine:' )
            {
            // InternalUseCase.g:5484:1: ( 'Bausteine:' )
            // InternalUseCase.g:5485:2: 'Bausteine:'
            {
             before(grammarAccess.getUsedTypesAccess().getBausteineKeyword_0_1_1()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getUsedTypesAccess().getBausteineKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group_0_1__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalUseCase.g:5495:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5499:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalUseCase.g:5500:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalUseCase.g:5507:1: rule__Type__Group__0__Impl : ( '-' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5511:1: ( ( '-' ) )
            // InternalUseCase.g:5512:1: ( '-' )
            {
            // InternalUseCase.g:5512:1: ( '-' )
            // InternalUseCase.g:5513:2: '-'
            {
             before(grammarAccess.getTypeAccess().getHyphenMinusKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalUseCase.g:5522:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5526:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalUseCase.g:5527:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalUseCase.g:5534:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5538:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalUseCase.g:5539:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalUseCase.g:5539:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalUseCase.g:5540:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalUseCase.g:5541:2: ( rule__Type__NameAssignment_1 )
            // InternalUseCase.g:5541:3: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalUseCase.g:5549:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5553:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalUseCase.g:5554:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalUseCase.g:5561:1: rule__Type__Group__2__Impl : ( ( rule__Type__Group_2__0 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5565:1: ( ( ( rule__Type__Group_2__0 )? ) )
            // InternalUseCase.g:5566:1: ( ( rule__Type__Group_2__0 )? )
            {
            // InternalUseCase.g:5566:1: ( ( rule__Type__Group_2__0 )? )
            // InternalUseCase.g:5567:2: ( rule__Type__Group_2__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_2()); 
            // InternalUseCase.g:5568:2: ( rule__Type__Group_2__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==71) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalUseCase.g:5568:3: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // InternalUseCase.g:5576:1: rule__Type__Group__3 : rule__Type__Group__3__Impl ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5580:1: ( rule__Type__Group__3__Impl )
            // InternalUseCase.g:5581:2: rule__Type__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalUseCase.g:5587:1: rule__Type__Group__3__Impl : ( ( rule__Type__Group_3__0 )? ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5591:1: ( ( ( rule__Type__Group_3__0 )? ) )
            // InternalUseCase.g:5592:1: ( ( rule__Type__Group_3__0 )? )
            {
            // InternalUseCase.g:5592:1: ( ( rule__Type__Group_3__0 )? )
            // InternalUseCase.g:5593:2: ( rule__Type__Group_3__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_3()); 
            // InternalUseCase.g:5594:2: ( rule__Type__Group_3__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==87) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalUseCase.g:5594:3: rule__Type__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalUseCase.g:5603:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5607:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalUseCase.g:5608:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalUseCase.g:5615:1: rule__Type__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5619:1: ( ( '(' ) )
            // InternalUseCase.g:5620:1: ( '(' )
            {
            // InternalUseCase.g:5620:1: ( '(' )
            // InternalUseCase.g:5621:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalUseCase.g:5630:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5634:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalUseCase.g:5635:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
            {
            pushFollow(FOLLOW_32);
            rule__Type__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalUseCase.g:5642:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5646:1: ( ( ( rule__Type__DescriptionAssignment_2_1 ) ) )
            // InternalUseCase.g:5647:1: ( ( rule__Type__DescriptionAssignment_2_1 ) )
            {
            // InternalUseCase.g:5647:1: ( ( rule__Type__DescriptionAssignment_2_1 ) )
            // InternalUseCase.g:5648:2: ( rule__Type__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getDescriptionAssignment_2_1()); 
            // InternalUseCase.g:5649:2: ( rule__Type__DescriptionAssignment_2_1 )
            // InternalUseCase.g:5649:3: rule__Type__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_2__2"
    // InternalUseCase.g:5657:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5661:1: ( rule__Type__Group_2__2__Impl )
            // InternalUseCase.g:5662:2: rule__Type__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2"


    // $ANTLR start "rule__Type__Group_2__2__Impl"
    // InternalUseCase.g:5668:1: rule__Type__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5672:1: ( ( ')' ) )
            // InternalUseCase.g:5673:1: ( ')' )
            {
            // InternalUseCase.g:5673:1: ( ')' )
            // InternalUseCase.g:5674:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__2__Impl"


    // $ANTLR start "rule__Type__Group_3__0"
    // InternalUseCase.g:5684:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5688:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalUseCase.g:5689:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0"


    // $ANTLR start "rule__Type__Group_3__0__Impl"
    // InternalUseCase.g:5696:1: rule__Type__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5700:1: ( ( '[' ) )
            // InternalUseCase.g:5701:1: ( '[' )
            {
            // InternalUseCase.g:5701:1: ( '[' )
            // InternalUseCase.g:5702:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0__Impl"


    // $ANTLR start "rule__Type__Group_3__1"
    // InternalUseCase.g:5711:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5715:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // InternalUseCase.g:5716:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
            {
            pushFollow(FOLLOW_47);
            rule__Type__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1"


    // $ANTLR start "rule__Type__Group_3__1__Impl"
    // InternalUseCase.g:5723:1: rule__Type__Group_3__1__Impl : ( ( rule__Type__ImportInfoAssignment_3_1 ) ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5727:1: ( ( ( rule__Type__ImportInfoAssignment_3_1 ) ) )
            // InternalUseCase.g:5728:1: ( ( rule__Type__ImportInfoAssignment_3_1 ) )
            {
            // InternalUseCase.g:5728:1: ( ( rule__Type__ImportInfoAssignment_3_1 ) )
            // InternalUseCase.g:5729:2: ( rule__Type__ImportInfoAssignment_3_1 )
            {
             before(grammarAccess.getTypeAccess().getImportInfoAssignment_3_1()); 
            // InternalUseCase.g:5730:2: ( rule__Type__ImportInfoAssignment_3_1 )
            // InternalUseCase.g:5730:3: rule__Type__ImportInfoAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ImportInfoAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getImportInfoAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1__Impl"


    // $ANTLR start "rule__Type__Group_3__2"
    // InternalUseCase.g:5738:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5742:1: ( rule__Type__Group_3__2__Impl )
            // InternalUseCase.g:5743:2: rule__Type__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__2"


    // $ANTLR start "rule__Type__Group_3__2__Impl"
    // InternalUseCase.g:5749:1: rule__Type__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5753:1: ( ( ']' ) )
            // InternalUseCase.g:5754:1: ( ']' )
            {
            // InternalUseCase.g:5754:1: ( ']' )
            // InternalUseCase.g:5755:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__2__Impl"


    // $ANTLR start "rule__UsedExceptions__Group__0"
    // InternalUseCase.g:5765:1: rule__UsedExceptions__Group__0 : rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 ;
    public final void rule__UsedExceptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5769:1: ( rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 )
            // InternalUseCase.g:5770:2: rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__UsedExceptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsedExceptions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group__0"


    // $ANTLR start "rule__UsedExceptions__Group__0__Impl"
    // InternalUseCase.g:5777:1: rule__UsedExceptions__Group__0__Impl : ( ( rule__UsedExceptions__Alternatives_0 ) ) ;
    public final void rule__UsedExceptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5781:1: ( ( ( rule__UsedExceptions__Alternatives_0 ) ) )
            // InternalUseCase.g:5782:1: ( ( rule__UsedExceptions__Alternatives_0 ) )
            {
            // InternalUseCase.g:5782:1: ( ( rule__UsedExceptions__Alternatives_0 ) )
            // InternalUseCase.g:5783:2: ( rule__UsedExceptions__Alternatives_0 )
            {
             before(grammarAccess.getUsedExceptionsAccess().getAlternatives_0()); 
            // InternalUseCase.g:5784:2: ( rule__UsedExceptions__Alternatives_0 )
            // InternalUseCase.g:5784:3: rule__UsedExceptions__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__UsedExceptions__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getUsedExceptionsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group__0__Impl"


    // $ANTLR start "rule__UsedExceptions__Group__1"
    // InternalUseCase.g:5792:1: rule__UsedExceptions__Group__1 : rule__UsedExceptions__Group__1__Impl ;
    public final void rule__UsedExceptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5796:1: ( rule__UsedExceptions__Group__1__Impl )
            // InternalUseCase.g:5797:2: rule__UsedExceptions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsedExceptions__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group__1"


    // $ANTLR start "rule__UsedExceptions__Group__1__Impl"
    // InternalUseCase.g:5803:1: rule__UsedExceptions__Group__1__Impl : ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* ) ;
    public final void rule__UsedExceptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5807:1: ( ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* ) )
            // InternalUseCase.g:5808:1: ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* )
            {
            // InternalUseCase.g:5808:1: ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* )
            // InternalUseCase.g:5809:2: ( rule__UsedExceptions__ExceptionsAssignment_1 )*
            {
             before(grammarAccess.getUsedExceptionsAccess().getExceptionsAssignment_1()); 
            // InternalUseCase.g:5810:2: ( rule__UsedExceptions__ExceptionsAssignment_1 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==62) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalUseCase.g:5810:3: rule__UsedExceptions__ExceptionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__UsedExceptions__ExceptionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

             after(grammarAccess.getUsedExceptionsAccess().getExceptionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group__1__Impl"


    // $ANTLR start "rule__UsedExceptions__Group_0_0__0"
    // InternalUseCase.g:5819:1: rule__UsedExceptions__Group_0_0__0 : rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1 ;
    public final void rule__UsedExceptions__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5823:1: ( rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1 )
            // InternalUseCase.g:5824:2: rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1
            {
            pushFollow(FOLLOW_48);
            rule__UsedExceptions__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsedExceptions__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group_0_0__0"


    // $ANTLR start "rule__UsedExceptions__Group_0_0__0__Impl"
    // InternalUseCase.g:5831:1: rule__UsedExceptions__Group_0_0__0__Impl : ( 'used' ) ;
    public final void rule__UsedExceptions__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5835:1: ( ( 'used' ) )
            // InternalUseCase.g:5836:1: ( 'used' )
            {
            // InternalUseCase.g:5836:1: ( 'used' )
            // InternalUseCase.g:5837:2: 'used'
            {
             before(grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0_0_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group_0_0__0__Impl"


    // $ANTLR start "rule__UsedExceptions__Group_0_0__1"
    // InternalUseCase.g:5846:1: rule__UsedExceptions__Group_0_0__1 : rule__UsedExceptions__Group_0_0__1__Impl ;
    public final void rule__UsedExceptions__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5850:1: ( rule__UsedExceptions__Group_0_0__1__Impl )
            // InternalUseCase.g:5851:2: rule__UsedExceptions__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsedExceptions__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group_0_0__1"


    // $ANTLR start "rule__UsedExceptions__Group_0_0__1__Impl"
    // InternalUseCase.g:5857:1: rule__UsedExceptions__Group_0_0__1__Impl : ( 'errors:' ) ;
    public final void rule__UsedExceptions__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5861:1: ( ( 'errors:' ) )
            // InternalUseCase.g:5862:1: ( 'errors:' )
            {
            // InternalUseCase.g:5862:1: ( 'errors:' )
            // InternalUseCase.g:5863:2: 'errors:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_0_0_1()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group_0_0__1__Impl"


    // $ANTLR start "rule__UsedExceptions__Group_0_1__0"
    // InternalUseCase.g:5873:1: rule__UsedExceptions__Group_0_1__0 : rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1 ;
    public final void rule__UsedExceptions__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5877:1: ( rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1 )
            // InternalUseCase.g:5878:2: rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1
            {
            pushFollow(FOLLOW_49);
            rule__UsedExceptions__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsedExceptions__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group_0_1__0"


    // $ANTLR start "rule__UsedExceptions__Group_0_1__0__Impl"
    // InternalUseCase.g:5885:1: rule__UsedExceptions__Group_0_1__0__Impl : ( 'Genutzte' ) ;
    public final void rule__UsedExceptions__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5889:1: ( ( 'Genutzte' ) )
            // InternalUseCase.g:5890:1: ( 'Genutzte' )
            {
            // InternalUseCase.g:5890:1: ( 'Genutzte' )
            // InternalUseCase.g:5891:2: 'Genutzte'
            {
             before(grammarAccess.getUsedExceptionsAccess().getGenutzteKeyword_0_1_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getUsedExceptionsAccess().getGenutzteKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group_0_1__0__Impl"


    // $ANTLR start "rule__UsedExceptions__Group_0_1__1"
    // InternalUseCase.g:5900:1: rule__UsedExceptions__Group_0_1__1 : rule__UsedExceptions__Group_0_1__1__Impl ;
    public final void rule__UsedExceptions__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5904:1: ( rule__UsedExceptions__Group_0_1__1__Impl )
            // InternalUseCase.g:5905:2: rule__UsedExceptions__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsedExceptions__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group_0_1__1"


    // $ANTLR start "rule__UsedExceptions__Group_0_1__1__Impl"
    // InternalUseCase.g:5911:1: rule__UsedExceptions__Group_0_1__1__Impl : ( 'Fehler:' ) ;
    public final void rule__UsedExceptions__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5915:1: ( ( 'Fehler:' ) )
            // InternalUseCase.g:5916:1: ( 'Fehler:' )
            {
            // InternalUseCase.g:5916:1: ( 'Fehler:' )
            // InternalUseCase.g:5917:2: 'Fehler:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getFehlerKeyword_0_1_1()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getUsedExceptionsAccess().getFehlerKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group_0_1__1__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group__0"
    // InternalUseCase.g:5927:1: rule__ExceptionDecleration__Group__0 : rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 ;
    public final void rule__ExceptionDecleration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5931:1: ( rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 )
            // InternalUseCase.g:5932:2: rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExceptionDecleration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__0"


    // $ANTLR start "rule__ExceptionDecleration__Group__0__Impl"
    // InternalUseCase.g:5939:1: rule__ExceptionDecleration__Group__0__Impl : ( '-' ) ;
    public final void rule__ExceptionDecleration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5943:1: ( ( '-' ) )
            // InternalUseCase.g:5944:1: ( '-' )
            {
            // InternalUseCase.g:5944:1: ( '-' )
            // InternalUseCase.g:5945:2: '-'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__0__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group__1"
    // InternalUseCase.g:5954:1: rule__ExceptionDecleration__Group__1 : rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 ;
    public final void rule__ExceptionDecleration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5958:1: ( rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 )
            // InternalUseCase.g:5959:2: rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__ExceptionDecleration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__1"


    // $ANTLR start "rule__ExceptionDecleration__Group__1__Impl"
    // InternalUseCase.g:5966:1: rule__ExceptionDecleration__Group__1__Impl : ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) ;
    public final void rule__ExceptionDecleration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5970:1: ( ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) )
            // InternalUseCase.g:5971:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            {
            // InternalUseCase.g:5971:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            // InternalUseCase.g:5972:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getNameAssignment_1()); 
            // InternalUseCase.g:5973:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            // InternalUseCase.g:5973:3: rule__ExceptionDecleration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclerationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__1__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group__2"
    // InternalUseCase.g:5981:1: rule__ExceptionDecleration__Group__2 : rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 ;
    public final void rule__ExceptionDecleration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5985:1: ( rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 )
            // InternalUseCase.g:5986:2: rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__ExceptionDecleration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__2"


    // $ANTLR start "rule__ExceptionDecleration__Group__2__Impl"
    // InternalUseCase.g:5993:1: rule__ExceptionDecleration__Group__2__Impl : ( ( rule__ExceptionDecleration__Group_2__0 )? ) ;
    public final void rule__ExceptionDecleration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5997:1: ( ( ( rule__ExceptionDecleration__Group_2__0 )? ) )
            // InternalUseCase.g:5998:1: ( ( rule__ExceptionDecleration__Group_2__0 )? )
            {
            // InternalUseCase.g:5998:1: ( ( rule__ExceptionDecleration__Group_2__0 )? )
            // InternalUseCase.g:5999:2: ( rule__ExceptionDecleration__Group_2__0 )?
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup_2()); 
            // InternalUseCase.g:6000:2: ( rule__ExceptionDecleration__Group_2__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==71) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalUseCase.g:6000:3: rule__ExceptionDecleration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExceptionDecleration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExceptionDeclerationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__2__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group__3"
    // InternalUseCase.g:6008:1: rule__ExceptionDecleration__Group__3 : rule__ExceptionDecleration__Group__3__Impl ;
    public final void rule__ExceptionDecleration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6012:1: ( rule__ExceptionDecleration__Group__3__Impl )
            // InternalUseCase.g:6013:2: rule__ExceptionDecleration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__3"


    // $ANTLR start "rule__ExceptionDecleration__Group__3__Impl"
    // InternalUseCase.g:6019:1: rule__ExceptionDecleration__Group__3__Impl : ( ( rule__ExceptionDecleration__Group_3__0 )? ) ;
    public final void rule__ExceptionDecleration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6023:1: ( ( ( rule__ExceptionDecleration__Group_3__0 )? ) )
            // InternalUseCase.g:6024:1: ( ( rule__ExceptionDecleration__Group_3__0 )? )
            {
            // InternalUseCase.g:6024:1: ( ( rule__ExceptionDecleration__Group_3__0 )? )
            // InternalUseCase.g:6025:2: ( rule__ExceptionDecleration__Group_3__0 )?
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup_3()); 
            // InternalUseCase.g:6026:2: ( rule__ExceptionDecleration__Group_3__0 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==87) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalUseCase.g:6026:3: rule__ExceptionDecleration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExceptionDecleration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExceptionDeclerationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__3__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group_2__0"
    // InternalUseCase.g:6035:1: rule__ExceptionDecleration__Group_2__0 : rule__ExceptionDecleration__Group_2__0__Impl rule__ExceptionDecleration__Group_2__1 ;
    public final void rule__ExceptionDecleration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6039:1: ( rule__ExceptionDecleration__Group_2__0__Impl rule__ExceptionDecleration__Group_2__1 )
            // InternalUseCase.g:6040:2: rule__ExceptionDecleration__Group_2__0__Impl rule__ExceptionDecleration__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__ExceptionDecleration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_2__0"


    // $ANTLR start "rule__ExceptionDecleration__Group_2__0__Impl"
    // InternalUseCase.g:6047:1: rule__ExceptionDecleration__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExceptionDecleration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6051:1: ( ( '(' ) )
            // InternalUseCase.g:6052:1: ( '(' )
            {
            // InternalUseCase.g:6052:1: ( '(' )
            // InternalUseCase.g:6053:2: '('
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_2__0__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group_2__1"
    // InternalUseCase.g:6062:1: rule__ExceptionDecleration__Group_2__1 : rule__ExceptionDecleration__Group_2__1__Impl rule__ExceptionDecleration__Group_2__2 ;
    public final void rule__ExceptionDecleration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6066:1: ( rule__ExceptionDecleration__Group_2__1__Impl rule__ExceptionDecleration__Group_2__2 )
            // InternalUseCase.g:6067:2: rule__ExceptionDecleration__Group_2__1__Impl rule__ExceptionDecleration__Group_2__2
            {
            pushFollow(FOLLOW_32);
            rule__ExceptionDecleration__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_2__1"


    // $ANTLR start "rule__ExceptionDecleration__Group_2__1__Impl"
    // InternalUseCase.g:6074:1: rule__ExceptionDecleration__Group_2__1__Impl : ( ( rule__ExceptionDecleration__MessageAssignment_2_1 ) ) ;
    public final void rule__ExceptionDecleration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6078:1: ( ( ( rule__ExceptionDecleration__MessageAssignment_2_1 ) ) )
            // InternalUseCase.g:6079:1: ( ( rule__ExceptionDecleration__MessageAssignment_2_1 ) )
            {
            // InternalUseCase.g:6079:1: ( ( rule__ExceptionDecleration__MessageAssignment_2_1 ) )
            // InternalUseCase.g:6080:2: ( rule__ExceptionDecleration__MessageAssignment_2_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getMessageAssignment_2_1()); 
            // InternalUseCase.g:6081:2: ( rule__ExceptionDecleration__MessageAssignment_2_1 )
            // InternalUseCase.g:6081:3: rule__ExceptionDecleration__MessageAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__MessageAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclerationAccess().getMessageAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_2__1__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group_2__2"
    // InternalUseCase.g:6089:1: rule__ExceptionDecleration__Group_2__2 : rule__ExceptionDecleration__Group_2__2__Impl ;
    public final void rule__ExceptionDecleration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6093:1: ( rule__ExceptionDecleration__Group_2__2__Impl )
            // InternalUseCase.g:6094:2: rule__ExceptionDecleration__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_2__2"


    // $ANTLR start "rule__ExceptionDecleration__Group_2__2__Impl"
    // InternalUseCase.g:6100:1: rule__ExceptionDecleration__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ExceptionDecleration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6104:1: ( ( ')' ) )
            // InternalUseCase.g:6105:1: ( ')' )
            {
            // InternalUseCase.g:6105:1: ( ')' )
            // InternalUseCase.g:6106:2: ')'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_2_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_2__2__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group_3__0"
    // InternalUseCase.g:6116:1: rule__ExceptionDecleration__Group_3__0 : rule__ExceptionDecleration__Group_3__0__Impl rule__ExceptionDecleration__Group_3__1 ;
    public final void rule__ExceptionDecleration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6120:1: ( rule__ExceptionDecleration__Group_3__0__Impl rule__ExceptionDecleration__Group_3__1 )
            // InternalUseCase.g:6121:2: rule__ExceptionDecleration__Group_3__0__Impl rule__ExceptionDecleration__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ExceptionDecleration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_3__0"


    // $ANTLR start "rule__ExceptionDecleration__Group_3__0__Impl"
    // InternalUseCase.g:6128:1: rule__ExceptionDecleration__Group_3__0__Impl : ( '[' ) ;
    public final void rule__ExceptionDecleration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6132:1: ( ( '[' ) )
            // InternalUseCase.g:6133:1: ( '[' )
            {
            // InternalUseCase.g:6133:1: ( '[' )
            // InternalUseCase.g:6134:2: '['
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_3__0__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group_3__1"
    // InternalUseCase.g:6143:1: rule__ExceptionDecleration__Group_3__1 : rule__ExceptionDecleration__Group_3__1__Impl rule__ExceptionDecleration__Group_3__2 ;
    public final void rule__ExceptionDecleration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6147:1: ( rule__ExceptionDecleration__Group_3__1__Impl rule__ExceptionDecleration__Group_3__2 )
            // InternalUseCase.g:6148:2: rule__ExceptionDecleration__Group_3__1__Impl rule__ExceptionDecleration__Group_3__2
            {
            pushFollow(FOLLOW_47);
            rule__ExceptionDecleration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_3__1"


    // $ANTLR start "rule__ExceptionDecleration__Group_3__1__Impl"
    // InternalUseCase.g:6155:1: rule__ExceptionDecleration__Group_3__1__Impl : ( ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 ) ) ;
    public final void rule__ExceptionDecleration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6159:1: ( ( ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 ) ) )
            // InternalUseCase.g:6160:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 ) )
            {
            // InternalUseCase.g:6160:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 ) )
            // InternalUseCase.g:6161:2: ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getImportInfoAssignment_3_1()); 
            // InternalUseCase.g:6162:2: ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 )
            // InternalUseCase.g:6162:3: rule__ExceptionDecleration__ImportInfoAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__ImportInfoAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclerationAccess().getImportInfoAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_3__1__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group_3__2"
    // InternalUseCase.g:6170:1: rule__ExceptionDecleration__Group_3__2 : rule__ExceptionDecleration__Group_3__2__Impl ;
    public final void rule__ExceptionDecleration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6174:1: ( rule__ExceptionDecleration__Group_3__2__Impl )
            // InternalUseCase.g:6175:2: rule__ExceptionDecleration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_3__2"


    // $ANTLR start "rule__ExceptionDecleration__Group_3__2__Impl"
    // InternalUseCase.g:6181:1: rule__ExceptionDecleration__Group_3__2__Impl : ( ']' ) ;
    public final void rule__ExceptionDecleration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6185:1: ( ( ']' ) )
            // InternalUseCase.g:6186:1: ( ']' )
            {
            // InternalUseCase.g:6186:1: ( ']' )
            // InternalUseCase.g:6187:2: ']'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getRightSquareBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_3__2__Impl"


    // $ANTLR start "rule__Example__Group__0"
    // InternalUseCase.g:6197:1: rule__Example__Group__0 : rule__Example__Group__0__Impl rule__Example__Group__1 ;
    public final void rule__Example__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6201:1: ( rule__Example__Group__0__Impl rule__Example__Group__1 )
            // InternalUseCase.g:6202:2: rule__Example__Group__0__Impl rule__Example__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Example__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__0"


    // $ANTLR start "rule__Example__Group__0__Impl"
    // InternalUseCase.g:6209:1: rule__Example__Group__0__Impl : ( 'Beispiel' ) ;
    public final void rule__Example__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6213:1: ( ( 'Beispiel' ) )
            // InternalUseCase.g:6214:1: ( 'Beispiel' )
            {
            // InternalUseCase.g:6214:1: ( 'Beispiel' )
            // InternalUseCase.g:6215:2: 'Beispiel'
            {
             before(grammarAccess.getExampleAccess().getBeispielKeyword_0()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getBeispielKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__0__Impl"


    // $ANTLR start "rule__Example__Group__1"
    // InternalUseCase.g:6224:1: rule__Example__Group__1 : rule__Example__Group__1__Impl rule__Example__Group__2 ;
    public final void rule__Example__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6228:1: ( rule__Example__Group__1__Impl rule__Example__Group__2 )
            // InternalUseCase.g:6229:2: rule__Example__Group__1__Impl rule__Example__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Example__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__1"


    // $ANTLR start "rule__Example__Group__1__Impl"
    // InternalUseCase.g:6236:1: rule__Example__Group__1__Impl : ( ( rule__Example__NameAssignment_1 ) ) ;
    public final void rule__Example__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6240:1: ( ( ( rule__Example__NameAssignment_1 ) ) )
            // InternalUseCase.g:6241:1: ( ( rule__Example__NameAssignment_1 ) )
            {
            // InternalUseCase.g:6241:1: ( ( rule__Example__NameAssignment_1 ) )
            // InternalUseCase.g:6242:2: ( rule__Example__NameAssignment_1 )
            {
             before(grammarAccess.getExampleAccess().getNameAssignment_1()); 
            // InternalUseCase.g:6243:2: ( rule__Example__NameAssignment_1 )
            // InternalUseCase.g:6243:3: rule__Example__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Example__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__1__Impl"


    // $ANTLR start "rule__Example__Group__2"
    // InternalUseCase.g:6251:1: rule__Example__Group__2 : rule__Example__Group__2__Impl rule__Example__Group__3 ;
    public final void rule__Example__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6255:1: ( rule__Example__Group__2__Impl rule__Example__Group__3 )
            // InternalUseCase.g:6256:2: rule__Example__Group__2__Impl rule__Example__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__Example__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__2"


    // $ANTLR start "rule__Example__Group__2__Impl"
    // InternalUseCase.g:6263:1: rule__Example__Group__2__Impl : ( ':' ) ;
    public final void rule__Example__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6267:1: ( ( ':' ) )
            // InternalUseCase.g:6268:1: ( ':' )
            {
            // InternalUseCase.g:6268:1: ( ':' )
            // InternalUseCase.g:6269:2: ':'
            {
             before(grammarAccess.getExampleAccess().getColonKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__2__Impl"


    // $ANTLR start "rule__Example__Group__3"
    // InternalUseCase.g:6278:1: rule__Example__Group__3 : rule__Example__Group__3__Impl rule__Example__Group__4 ;
    public final void rule__Example__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6282:1: ( rule__Example__Group__3__Impl rule__Example__Group__4 )
            // InternalUseCase.g:6283:2: rule__Example__Group__3__Impl rule__Example__Group__4
            {
            pushFollow(FOLLOW_50);
            rule__Example__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__3"


    // $ANTLR start "rule__Example__Group__3__Impl"
    // InternalUseCase.g:6290:1: rule__Example__Group__3__Impl : ( ( rule__Example__Group_3__0 )? ) ;
    public final void rule__Example__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6294:1: ( ( ( rule__Example__Group_3__0 )? ) )
            // InternalUseCase.g:6295:1: ( ( rule__Example__Group_3__0 )? )
            {
            // InternalUseCase.g:6295:1: ( ( rule__Example__Group_3__0 )? )
            // InternalUseCase.g:6296:2: ( rule__Example__Group_3__0 )?
            {
             before(grammarAccess.getExampleAccess().getGroup_3()); 
            // InternalUseCase.g:6297:2: ( rule__Example__Group_3__0 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==92) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalUseCase.g:6297:3: rule__Example__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Example__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExampleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__3__Impl"


    // $ANTLR start "rule__Example__Group__4"
    // InternalUseCase.g:6305:1: rule__Example__Group__4 : rule__Example__Group__4__Impl rule__Example__Group__5 ;
    public final void rule__Example__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6309:1: ( rule__Example__Group__4__Impl rule__Example__Group__5 )
            // InternalUseCase.g:6310:2: rule__Example__Group__4__Impl rule__Example__Group__5
            {
            pushFollow(FOLLOW_51);
            rule__Example__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__4"


    // $ANTLR start "rule__Example__Group__4__Impl"
    // InternalUseCase.g:6317:1: rule__Example__Group__4__Impl : ( ( rule__Example__GivenAssignment_4 ) ) ;
    public final void rule__Example__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6321:1: ( ( ( rule__Example__GivenAssignment_4 ) ) )
            // InternalUseCase.g:6322:1: ( ( rule__Example__GivenAssignment_4 ) )
            {
            // InternalUseCase.g:6322:1: ( ( rule__Example__GivenAssignment_4 ) )
            // InternalUseCase.g:6323:2: ( rule__Example__GivenAssignment_4 )
            {
             before(grammarAccess.getExampleAccess().getGivenAssignment_4()); 
            // InternalUseCase.g:6324:2: ( rule__Example__GivenAssignment_4 )
            // InternalUseCase.g:6324:3: rule__Example__GivenAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Example__GivenAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getGivenAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__4__Impl"


    // $ANTLR start "rule__Example__Group__5"
    // InternalUseCase.g:6332:1: rule__Example__Group__5 : rule__Example__Group__5__Impl rule__Example__Group__6 ;
    public final void rule__Example__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6336:1: ( rule__Example__Group__5__Impl rule__Example__Group__6 )
            // InternalUseCase.g:6337:2: rule__Example__Group__5__Impl rule__Example__Group__6
            {
            pushFollow(FOLLOW_51);
            rule__Example__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__5"


    // $ANTLR start "rule__Example__Group__5__Impl"
    // InternalUseCase.g:6344:1: rule__Example__Group__5__Impl : ( ( rule__Example__GivenAndAssignment_5 )* ) ;
    public final void rule__Example__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6348:1: ( ( ( rule__Example__GivenAndAssignment_5 )* ) )
            // InternalUseCase.g:6349:1: ( ( rule__Example__GivenAndAssignment_5 )* )
            {
            // InternalUseCase.g:6349:1: ( ( rule__Example__GivenAndAssignment_5 )* )
            // InternalUseCase.g:6350:2: ( rule__Example__GivenAndAssignment_5 )*
            {
             before(grammarAccess.getExampleAccess().getGivenAndAssignment_5()); 
            // InternalUseCase.g:6351:2: ( rule__Example__GivenAndAssignment_5 )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=50 && LA77_0<=51)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalUseCase.g:6351:3: rule__Example__GivenAndAssignment_5
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Example__GivenAndAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getGivenAndAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__5__Impl"


    // $ANTLR start "rule__Example__Group__6"
    // InternalUseCase.g:6359:1: rule__Example__Group__6 : rule__Example__Group__6__Impl rule__Example__Group__7 ;
    public final void rule__Example__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6363:1: ( rule__Example__Group__6__Impl rule__Example__Group__7 )
            // InternalUseCase.g:6364:2: rule__Example__Group__6__Impl rule__Example__Group__7
            {
            pushFollow(FOLLOW_53);
            rule__Example__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__6"


    // $ANTLR start "rule__Example__Group__6__Impl"
    // InternalUseCase.g:6371:1: rule__Example__Group__6__Impl : ( ( rule__Example__WhenAssignment_6 ) ) ;
    public final void rule__Example__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6375:1: ( ( ( rule__Example__WhenAssignment_6 ) ) )
            // InternalUseCase.g:6376:1: ( ( rule__Example__WhenAssignment_6 ) )
            {
            // InternalUseCase.g:6376:1: ( ( rule__Example__WhenAssignment_6 ) )
            // InternalUseCase.g:6377:2: ( rule__Example__WhenAssignment_6 )
            {
             before(grammarAccess.getExampleAccess().getWhenAssignment_6()); 
            // InternalUseCase.g:6378:2: ( rule__Example__WhenAssignment_6 )
            // InternalUseCase.g:6378:3: rule__Example__WhenAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Example__WhenAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getWhenAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__6__Impl"


    // $ANTLR start "rule__Example__Group__7"
    // InternalUseCase.g:6386:1: rule__Example__Group__7 : rule__Example__Group__7__Impl rule__Example__Group__8 ;
    public final void rule__Example__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6390:1: ( rule__Example__Group__7__Impl rule__Example__Group__8 )
            // InternalUseCase.g:6391:2: rule__Example__Group__7__Impl rule__Example__Group__8
            {
            pushFollow(FOLLOW_53);
            rule__Example__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__7"


    // $ANTLR start "rule__Example__Group__7__Impl"
    // InternalUseCase.g:6398:1: rule__Example__Group__7__Impl : ( ( rule__Example__WhenAndAssignment_7 )* ) ;
    public final void rule__Example__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6402:1: ( ( ( rule__Example__WhenAndAssignment_7 )* ) )
            // InternalUseCase.g:6403:1: ( ( rule__Example__WhenAndAssignment_7 )* )
            {
            // InternalUseCase.g:6403:1: ( ( rule__Example__WhenAndAssignment_7 )* )
            // InternalUseCase.g:6404:2: ( rule__Example__WhenAndAssignment_7 )*
            {
             before(grammarAccess.getExampleAccess().getWhenAndAssignment_7()); 
            // InternalUseCase.g:6405:2: ( rule__Example__WhenAndAssignment_7 )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=50 && LA78_0<=51)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalUseCase.g:6405:3: rule__Example__WhenAndAssignment_7
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Example__WhenAndAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getWhenAndAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__7__Impl"


    // $ANTLR start "rule__Example__Group__8"
    // InternalUseCase.g:6413:1: rule__Example__Group__8 : rule__Example__Group__8__Impl rule__Example__Group__9 ;
    public final void rule__Example__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6417:1: ( rule__Example__Group__8__Impl rule__Example__Group__9 )
            // InternalUseCase.g:6418:2: rule__Example__Group__8__Impl rule__Example__Group__9
            {
            pushFollow(FOLLOW_54);
            rule__Example__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__8"


    // $ANTLR start "rule__Example__Group__8__Impl"
    // InternalUseCase.g:6425:1: rule__Example__Group__8__Impl : ( ( rule__Example__ThenAssignment_8 ) ) ;
    public final void rule__Example__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6429:1: ( ( ( rule__Example__ThenAssignment_8 ) ) )
            // InternalUseCase.g:6430:1: ( ( rule__Example__ThenAssignment_8 ) )
            {
            // InternalUseCase.g:6430:1: ( ( rule__Example__ThenAssignment_8 ) )
            // InternalUseCase.g:6431:2: ( rule__Example__ThenAssignment_8 )
            {
             before(grammarAccess.getExampleAccess().getThenAssignment_8()); 
            // InternalUseCase.g:6432:2: ( rule__Example__ThenAssignment_8 )
            // InternalUseCase.g:6432:3: rule__Example__ThenAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Example__ThenAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getThenAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__8__Impl"


    // $ANTLR start "rule__Example__Group__9"
    // InternalUseCase.g:6440:1: rule__Example__Group__9 : rule__Example__Group__9__Impl rule__Example__Group__10 ;
    public final void rule__Example__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6444:1: ( rule__Example__Group__9__Impl rule__Example__Group__10 )
            // InternalUseCase.g:6445:2: rule__Example__Group__9__Impl rule__Example__Group__10
            {
            pushFollow(FOLLOW_54);
            rule__Example__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__9"


    // $ANTLR start "rule__Example__Group__9__Impl"
    // InternalUseCase.g:6452:1: rule__Example__Group__9__Impl : ( ( rule__Example__ThenAndAssignment_9 )* ) ;
    public final void rule__Example__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6456:1: ( ( ( rule__Example__ThenAndAssignment_9 )* ) )
            // InternalUseCase.g:6457:1: ( ( rule__Example__ThenAndAssignment_9 )* )
            {
            // InternalUseCase.g:6457:1: ( ( rule__Example__ThenAndAssignment_9 )* )
            // InternalUseCase.g:6458:2: ( rule__Example__ThenAndAssignment_9 )*
            {
             before(grammarAccess.getExampleAccess().getThenAndAssignment_9()); 
            // InternalUseCase.g:6459:2: ( rule__Example__ThenAndAssignment_9 )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=50 && LA79_0<=51)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalUseCase.g:6459:3: rule__Example__ThenAndAssignment_9
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Example__ThenAndAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getThenAndAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__9__Impl"


    // $ANTLR start "rule__Example__Group__10"
    // InternalUseCase.g:6467:1: rule__Example__Group__10 : rule__Example__Group__10__Impl rule__Example__Group__11 ;
    public final void rule__Example__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6471:1: ( rule__Example__Group__10__Impl rule__Example__Group__11 )
            // InternalUseCase.g:6472:2: rule__Example__Group__10__Impl rule__Example__Group__11
            {
            pushFollow(FOLLOW_54);
            rule__Example__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__10"


    // $ANTLR start "rule__Example__Group__10__Impl"
    // InternalUseCase.g:6479:1: rule__Example__Group__10__Impl : ( ( rule__Example__Group_10__0 )? ) ;
    public final void rule__Example__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6483:1: ( ( ( rule__Example__Group_10__0 )? ) )
            // InternalUseCase.g:6484:1: ( ( rule__Example__Group_10__0 )? )
            {
            // InternalUseCase.g:6484:1: ( ( rule__Example__Group_10__0 )? )
            // InternalUseCase.g:6485:2: ( rule__Example__Group_10__0 )?
            {
             before(grammarAccess.getExampleAccess().getGroup_10()); 
            // InternalUseCase.g:6486:2: ( rule__Example__Group_10__0 )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==93) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalUseCase.g:6486:3: rule__Example__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Example__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExampleAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__10__Impl"


    // $ANTLR start "rule__Example__Group__11"
    // InternalUseCase.g:6494:1: rule__Example__Group__11 : rule__Example__Group__11__Impl rule__Example__Group__12 ;
    public final void rule__Example__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6498:1: ( rule__Example__Group__11__Impl rule__Example__Group__12 )
            // InternalUseCase.g:6499:2: rule__Example__Group__11__Impl rule__Example__Group__12
            {
            pushFollow(FOLLOW_55);
            rule__Example__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__11"


    // $ANTLR start "rule__Example__Group__11__Impl"
    // InternalUseCase.g:6506:1: rule__Example__Group__11__Impl : ( 'Beispiel' ) ;
    public final void rule__Example__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6510:1: ( ( 'Beispiel' ) )
            // InternalUseCase.g:6511:1: ( 'Beispiel' )
            {
            // InternalUseCase.g:6511:1: ( 'Beispiel' )
            // InternalUseCase.g:6512:2: 'Beispiel'
            {
             before(grammarAccess.getExampleAccess().getBeispielKeyword_11()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getBeispielKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__11__Impl"


    // $ANTLR start "rule__Example__Group__12"
    // InternalUseCase.g:6521:1: rule__Example__Group__12 : rule__Example__Group__12__Impl ;
    public final void rule__Example__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6525:1: ( rule__Example__Group__12__Impl )
            // InternalUseCase.g:6526:2: rule__Example__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__12"


    // $ANTLR start "rule__Example__Group__12__Impl"
    // InternalUseCase.g:6532:1: rule__Example__Group__12__Impl : ( 'Ende' ) ;
    public final void rule__Example__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6536:1: ( ( 'Ende' ) )
            // InternalUseCase.g:6537:1: ( 'Ende' )
            {
            // InternalUseCase.g:6537:1: ( 'Ende' )
            // InternalUseCase.g:6538:2: 'Ende'
            {
             before(grammarAccess.getExampleAccess().getEndeKeyword_12()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getEndeKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__12__Impl"


    // $ANTLR start "rule__Example__Group_3__0"
    // InternalUseCase.g:6548:1: rule__Example__Group_3__0 : rule__Example__Group_3__0__Impl rule__Example__Group_3__1 ;
    public final void rule__Example__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6552:1: ( rule__Example__Group_3__0__Impl rule__Example__Group_3__1 )
            // InternalUseCase.g:6553:2: rule__Example__Group_3__0__Impl rule__Example__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Example__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_3__0"


    // $ANTLR start "rule__Example__Group_3__0__Impl"
    // InternalUseCase.g:6560:1: rule__Example__Group_3__0__Impl : ( 'Beschreibung:' ) ;
    public final void rule__Example__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6564:1: ( ( 'Beschreibung:' ) )
            // InternalUseCase.g:6565:1: ( 'Beschreibung:' )
            {
            // InternalUseCase.g:6565:1: ( 'Beschreibung:' )
            // InternalUseCase.g:6566:2: 'Beschreibung:'
            {
             before(grammarAccess.getExampleAccess().getBeschreibungKeyword_3_0()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getBeschreibungKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_3__0__Impl"


    // $ANTLR start "rule__Example__Group_3__1"
    // InternalUseCase.g:6575:1: rule__Example__Group_3__1 : rule__Example__Group_3__1__Impl ;
    public final void rule__Example__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6579:1: ( rule__Example__Group_3__1__Impl )
            // InternalUseCase.g:6580:2: rule__Example__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_3__1"


    // $ANTLR start "rule__Example__Group_3__1__Impl"
    // InternalUseCase.g:6586:1: rule__Example__Group_3__1__Impl : ( ( rule__Example__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Example__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6590:1: ( ( ( rule__Example__DescriptionAssignment_3_1 ) ) )
            // InternalUseCase.g:6591:1: ( ( rule__Example__DescriptionAssignment_3_1 ) )
            {
            // InternalUseCase.g:6591:1: ( ( rule__Example__DescriptionAssignment_3_1 ) )
            // InternalUseCase.g:6592:2: ( rule__Example__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getExampleAccess().getDescriptionAssignment_3_1()); 
            // InternalUseCase.g:6593:2: ( rule__Example__DescriptionAssignment_3_1 )
            // InternalUseCase.g:6593:3: rule__Example__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Example__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_3__1__Impl"


    // $ANTLR start "rule__Example__Group_10__0"
    // InternalUseCase.g:6602:1: rule__Example__Group_10__0 : rule__Example__Group_10__0__Impl rule__Example__Group_10__1 ;
    public final void rule__Example__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6606:1: ( rule__Example__Group_10__0__Impl rule__Example__Group_10__1 )
            // InternalUseCase.g:6607:2: rule__Example__Group_10__0__Impl rule__Example__Group_10__1
            {
            pushFollow(FOLLOW_13);
            rule__Example__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_10__0"


    // $ANTLR start "rule__Example__Group_10__0__Impl"
    // InternalUseCase.g:6614:1: rule__Example__Group_10__0__Impl : ( 'Warum?' ) ;
    public final void rule__Example__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6618:1: ( ( 'Warum?' ) )
            // InternalUseCase.g:6619:1: ( 'Warum?' )
            {
            // InternalUseCase.g:6619:1: ( 'Warum?' )
            // InternalUseCase.g:6620:2: 'Warum?'
            {
             before(grammarAccess.getExampleAccess().getWarumKeyword_10_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getWarumKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_10__0__Impl"


    // $ANTLR start "rule__Example__Group_10__1"
    // InternalUseCase.g:6629:1: rule__Example__Group_10__1 : rule__Example__Group_10__1__Impl ;
    public final void rule__Example__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6633:1: ( rule__Example__Group_10__1__Impl )
            // InternalUseCase.g:6634:2: rule__Example__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_10__1"


    // $ANTLR start "rule__Example__Group_10__1__Impl"
    // InternalUseCase.g:6640:1: rule__Example__Group_10__1__Impl : ( ( rule__Example__ExplainationAssignment_10_1 ) ) ;
    public final void rule__Example__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6644:1: ( ( ( rule__Example__ExplainationAssignment_10_1 ) ) )
            // InternalUseCase.g:6645:1: ( ( rule__Example__ExplainationAssignment_10_1 ) )
            {
            // InternalUseCase.g:6645:1: ( ( rule__Example__ExplainationAssignment_10_1 ) )
            // InternalUseCase.g:6646:2: ( rule__Example__ExplainationAssignment_10_1 )
            {
             before(grammarAccess.getExampleAccess().getExplainationAssignment_10_1()); 
            // InternalUseCase.g:6647:2: ( rule__Example__ExplainationAssignment_10_1 )
            // InternalUseCase.g:6647:3: rule__Example__ExplainationAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Example__ExplainationAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getExplainationAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group_10__1__Impl"


    // $ANTLR start "rule__Given__Group__0"
    // InternalUseCase.g:6656:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6660:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalUseCase.g:6661:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Given__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__0"


    // $ANTLR start "rule__Given__Group__0__Impl"
    // InternalUseCase.g:6668:1: rule__Given__Group__0__Impl : ( ( rule__Given__Alternatives_0 ) ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6672:1: ( ( ( rule__Given__Alternatives_0 ) ) )
            // InternalUseCase.g:6673:1: ( ( rule__Given__Alternatives_0 ) )
            {
            // InternalUseCase.g:6673:1: ( ( rule__Given__Alternatives_0 ) )
            // InternalUseCase.g:6674:2: ( rule__Given__Alternatives_0 )
            {
             before(grammarAccess.getGivenAccess().getAlternatives_0()); 
            // InternalUseCase.g:6675:2: ( rule__Given__Alternatives_0 )
            // InternalUseCase.g:6675:3: rule__Given__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Given__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__0__Impl"


    // $ANTLR start "rule__Given__Group__1"
    // InternalUseCase.g:6683:1: rule__Given__Group__1 : rule__Given__Group__1__Impl ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6687:1: ( rule__Given__Group__1__Impl )
            // InternalUseCase.g:6688:2: rule__Given__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__1"


    // $ANTLR start "rule__Given__Group__1__Impl"
    // InternalUseCase.g:6694:1: rule__Given__Group__1__Impl : ( ( rule__Given__ContentAssignment_1 ) ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6698:1: ( ( ( rule__Given__ContentAssignment_1 ) ) )
            // InternalUseCase.g:6699:1: ( ( rule__Given__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:6699:1: ( ( rule__Given__ContentAssignment_1 ) )
            // InternalUseCase.g:6700:2: ( rule__Given__ContentAssignment_1 )
            {
             before(grammarAccess.getGivenAccess().getContentAssignment_1()); 
            // InternalUseCase.g:6701:2: ( rule__Given__ContentAssignment_1 )
            // InternalUseCase.g:6701:3: rule__Given__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Given__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__1__Impl"


    // $ANTLR start "rule__GivenAnd__Group__0"
    // InternalUseCase.g:6710:1: rule__GivenAnd__Group__0 : rule__GivenAnd__Group__0__Impl rule__GivenAnd__Group__1 ;
    public final void rule__GivenAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6714:1: ( rule__GivenAnd__Group__0__Impl rule__GivenAnd__Group__1 )
            // InternalUseCase.g:6715:2: rule__GivenAnd__Group__0__Impl rule__GivenAnd__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__GivenAnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivenAnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenAnd__Group__0"


    // $ANTLR start "rule__GivenAnd__Group__0__Impl"
    // InternalUseCase.g:6722:1: rule__GivenAnd__Group__0__Impl : ( ( rule__GivenAnd__Alternatives_0 ) ) ;
    public final void rule__GivenAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6726:1: ( ( ( rule__GivenAnd__Alternatives_0 ) ) )
            // InternalUseCase.g:6727:1: ( ( rule__GivenAnd__Alternatives_0 ) )
            {
            // InternalUseCase.g:6727:1: ( ( rule__GivenAnd__Alternatives_0 ) )
            // InternalUseCase.g:6728:2: ( rule__GivenAnd__Alternatives_0 )
            {
             before(grammarAccess.getGivenAndAccess().getAlternatives_0()); 
            // InternalUseCase.g:6729:2: ( rule__GivenAnd__Alternatives_0 )
            // InternalUseCase.g:6729:3: rule__GivenAnd__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__GivenAnd__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAndAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenAnd__Group__0__Impl"


    // $ANTLR start "rule__GivenAnd__Group__1"
    // InternalUseCase.g:6737:1: rule__GivenAnd__Group__1 : rule__GivenAnd__Group__1__Impl ;
    public final void rule__GivenAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6741:1: ( rule__GivenAnd__Group__1__Impl )
            // InternalUseCase.g:6742:2: rule__GivenAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivenAnd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenAnd__Group__1"


    // $ANTLR start "rule__GivenAnd__Group__1__Impl"
    // InternalUseCase.g:6748:1: rule__GivenAnd__Group__1__Impl : ( ( rule__GivenAnd__ContentAssignment_1 ) ) ;
    public final void rule__GivenAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6752:1: ( ( ( rule__GivenAnd__ContentAssignment_1 ) ) )
            // InternalUseCase.g:6753:1: ( ( rule__GivenAnd__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:6753:1: ( ( rule__GivenAnd__ContentAssignment_1 ) )
            // InternalUseCase.g:6754:2: ( rule__GivenAnd__ContentAssignment_1 )
            {
             before(grammarAccess.getGivenAndAccess().getContentAssignment_1()); 
            // InternalUseCase.g:6755:2: ( rule__GivenAnd__ContentAssignment_1 )
            // InternalUseCase.g:6755:3: rule__GivenAnd__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GivenAnd__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGivenAndAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenAnd__Group__1__Impl"


    // $ANTLR start "rule__When__Group__0"
    // InternalUseCase.g:6764:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6768:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalUseCase.g:6769:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__When__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__0"


    // $ANTLR start "rule__When__Group__0__Impl"
    // InternalUseCase.g:6776:1: rule__When__Group__0__Impl : ( 'Wenn' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6780:1: ( ( 'Wenn' ) )
            // InternalUseCase.g:6781:1: ( 'Wenn' )
            {
            // InternalUseCase.g:6781:1: ( 'Wenn' )
            // InternalUseCase.g:6782:2: 'Wenn'
            {
             before(grammarAccess.getWhenAccess().getWennKeyword_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getWennKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__0__Impl"


    // $ANTLR start "rule__When__Group__1"
    // InternalUseCase.g:6791:1: rule__When__Group__1 : rule__When__Group__1__Impl ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6795:1: ( rule__When__Group__1__Impl )
            // InternalUseCase.g:6796:2: rule__When__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__1"


    // $ANTLR start "rule__When__Group__1__Impl"
    // InternalUseCase.g:6802:1: rule__When__Group__1__Impl : ( ( rule__When__ContentAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6806:1: ( ( ( rule__When__ContentAssignment_1 ) ) )
            // InternalUseCase.g:6807:1: ( ( rule__When__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:6807:1: ( ( rule__When__ContentAssignment_1 ) )
            // InternalUseCase.g:6808:2: ( rule__When__ContentAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getContentAssignment_1()); 
            // InternalUseCase.g:6809:2: ( rule__When__ContentAssignment_1 )
            // InternalUseCase.g:6809:3: rule__When__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__When__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__1__Impl"


    // $ANTLR start "rule__WhenAnd__Group__0"
    // InternalUseCase.g:6818:1: rule__WhenAnd__Group__0 : rule__WhenAnd__Group__0__Impl rule__WhenAnd__Group__1 ;
    public final void rule__WhenAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6822:1: ( rule__WhenAnd__Group__0__Impl rule__WhenAnd__Group__1 )
            // InternalUseCase.g:6823:2: rule__WhenAnd__Group__0__Impl rule__WhenAnd__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__WhenAnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhenAnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenAnd__Group__0"


    // $ANTLR start "rule__WhenAnd__Group__0__Impl"
    // InternalUseCase.g:6830:1: rule__WhenAnd__Group__0__Impl : ( ( rule__WhenAnd__Alternatives_0 ) ) ;
    public final void rule__WhenAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6834:1: ( ( ( rule__WhenAnd__Alternatives_0 ) ) )
            // InternalUseCase.g:6835:1: ( ( rule__WhenAnd__Alternatives_0 ) )
            {
            // InternalUseCase.g:6835:1: ( ( rule__WhenAnd__Alternatives_0 ) )
            // InternalUseCase.g:6836:2: ( rule__WhenAnd__Alternatives_0 )
            {
             before(grammarAccess.getWhenAndAccess().getAlternatives_0()); 
            // InternalUseCase.g:6837:2: ( rule__WhenAnd__Alternatives_0 )
            // InternalUseCase.g:6837:3: rule__WhenAnd__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__WhenAnd__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getWhenAndAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenAnd__Group__0__Impl"


    // $ANTLR start "rule__WhenAnd__Group__1"
    // InternalUseCase.g:6845:1: rule__WhenAnd__Group__1 : rule__WhenAnd__Group__1__Impl ;
    public final void rule__WhenAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6849:1: ( rule__WhenAnd__Group__1__Impl )
            // InternalUseCase.g:6850:2: rule__WhenAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhenAnd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenAnd__Group__1"


    // $ANTLR start "rule__WhenAnd__Group__1__Impl"
    // InternalUseCase.g:6856:1: rule__WhenAnd__Group__1__Impl : ( ( rule__WhenAnd__ContentAssignment_1 ) ) ;
    public final void rule__WhenAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6860:1: ( ( ( rule__WhenAnd__ContentAssignment_1 ) ) )
            // InternalUseCase.g:6861:1: ( ( rule__WhenAnd__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:6861:1: ( ( rule__WhenAnd__ContentAssignment_1 ) )
            // InternalUseCase.g:6862:2: ( rule__WhenAnd__ContentAssignment_1 )
            {
             before(grammarAccess.getWhenAndAccess().getContentAssignment_1()); 
            // InternalUseCase.g:6863:2: ( rule__WhenAnd__ContentAssignment_1 )
            // InternalUseCase.g:6863:3: rule__WhenAnd__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhenAnd__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhenAndAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenAnd__Group__1__Impl"


    // $ANTLR start "rule__Then__Group__0"
    // InternalUseCase.g:6872:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6876:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalUseCase.g:6877:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Then__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__0"


    // $ANTLR start "rule__Then__Group__0__Impl"
    // InternalUseCase.g:6884:1: rule__Then__Group__0__Impl : ( ( rule__Then__Alternatives_0 ) ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6888:1: ( ( ( rule__Then__Alternatives_0 ) ) )
            // InternalUseCase.g:6889:1: ( ( rule__Then__Alternatives_0 ) )
            {
            // InternalUseCase.g:6889:1: ( ( rule__Then__Alternatives_0 ) )
            // InternalUseCase.g:6890:2: ( rule__Then__Alternatives_0 )
            {
             before(grammarAccess.getThenAccess().getAlternatives_0()); 
            // InternalUseCase.g:6891:2: ( rule__Then__Alternatives_0 )
            // InternalUseCase.g:6891:3: rule__Then__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Then__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__0__Impl"


    // $ANTLR start "rule__Then__Group__1"
    // InternalUseCase.g:6899:1: rule__Then__Group__1 : rule__Then__Group__1__Impl ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6903:1: ( rule__Then__Group__1__Impl )
            // InternalUseCase.g:6904:2: rule__Then__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__1"


    // $ANTLR start "rule__Then__Group__1__Impl"
    // InternalUseCase.g:6910:1: rule__Then__Group__1__Impl : ( ( rule__Then__ContentAssignment_1 ) ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6914:1: ( ( ( rule__Then__ContentAssignment_1 ) ) )
            // InternalUseCase.g:6915:1: ( ( rule__Then__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:6915:1: ( ( rule__Then__ContentAssignment_1 ) )
            // InternalUseCase.g:6916:2: ( rule__Then__ContentAssignment_1 )
            {
             before(grammarAccess.getThenAccess().getContentAssignment_1()); 
            // InternalUseCase.g:6917:2: ( rule__Then__ContentAssignment_1 )
            // InternalUseCase.g:6917:3: rule__Then__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Then__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__1__Impl"


    // $ANTLR start "rule__ThenAnd__Group__0"
    // InternalUseCase.g:6926:1: rule__ThenAnd__Group__0 : rule__ThenAnd__Group__0__Impl rule__ThenAnd__Group__1 ;
    public final void rule__ThenAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6930:1: ( rule__ThenAnd__Group__0__Impl rule__ThenAnd__Group__1 )
            // InternalUseCase.g:6931:2: rule__ThenAnd__Group__0__Impl rule__ThenAnd__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ThenAnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThenAnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenAnd__Group__0"


    // $ANTLR start "rule__ThenAnd__Group__0__Impl"
    // InternalUseCase.g:6938:1: rule__ThenAnd__Group__0__Impl : ( ( rule__ThenAnd__Alternatives_0 ) ) ;
    public final void rule__ThenAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6942:1: ( ( ( rule__ThenAnd__Alternatives_0 ) ) )
            // InternalUseCase.g:6943:1: ( ( rule__ThenAnd__Alternatives_0 ) )
            {
            // InternalUseCase.g:6943:1: ( ( rule__ThenAnd__Alternatives_0 ) )
            // InternalUseCase.g:6944:2: ( rule__ThenAnd__Alternatives_0 )
            {
             before(grammarAccess.getThenAndAccess().getAlternatives_0()); 
            // InternalUseCase.g:6945:2: ( rule__ThenAnd__Alternatives_0 )
            // InternalUseCase.g:6945:3: rule__ThenAnd__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ThenAnd__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getThenAndAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenAnd__Group__0__Impl"


    // $ANTLR start "rule__ThenAnd__Group__1"
    // InternalUseCase.g:6953:1: rule__ThenAnd__Group__1 : rule__ThenAnd__Group__1__Impl ;
    public final void rule__ThenAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6957:1: ( rule__ThenAnd__Group__1__Impl )
            // InternalUseCase.g:6958:2: rule__ThenAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ThenAnd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenAnd__Group__1"


    // $ANTLR start "rule__ThenAnd__Group__1__Impl"
    // InternalUseCase.g:6964:1: rule__ThenAnd__Group__1__Impl : ( ( rule__ThenAnd__ContentAssignment_1 ) ) ;
    public final void rule__ThenAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6968:1: ( ( ( rule__ThenAnd__ContentAssignment_1 ) ) )
            // InternalUseCase.g:6969:1: ( ( rule__ThenAnd__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:6969:1: ( ( rule__ThenAnd__ContentAssignment_1 ) )
            // InternalUseCase.g:6970:2: ( rule__ThenAnd__ContentAssignment_1 )
            {
             before(grammarAccess.getThenAndAccess().getContentAssignment_1()); 
            // InternalUseCase.g:6971:2: ( rule__ThenAnd__ContentAssignment_1 )
            // InternalUseCase.g:6971:3: rule__ThenAnd__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ThenAnd__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThenAndAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenAnd__Group__1__Impl"


    // $ANTLR start "rule__Model__CompanyAssignment_1"
    // InternalUseCase.g:6980:1: rule__Model__CompanyAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__CompanyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6984:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:6985:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:6985:2: ( ruleQualifiedName )
            // InternalUseCase.g:6986:3: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getCompanyQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCompanyQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CompanyAssignment_1"


    // $ANTLR start "rule__Model__PackageAssignment_2"
    // InternalUseCase.g:6995:1: rule__Model__PackageAssignment_2 : ( rulePackage ) ;
    public final void rule__Model__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6999:1: ( ( rulePackage ) )
            // InternalUseCase.g:7000:2: ( rulePackage )
            {
            // InternalUseCase.g:7000:2: ( rulePackage )
            // InternalUseCase.g:7001:3: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackageAssignment_2"


    // $ANTLR start "rule__Model__UseCasesAssignment_3"
    // InternalUseCase.g:7010:1: rule__Model__UseCasesAssignment_3 : ( ruleUseCase ) ;
    public final void rule__Model__UseCasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7014:1: ( ( ruleUseCase ) )
            // InternalUseCase.g:7015:2: ( ruleUseCase )
            {
            // InternalUseCase.g:7015:2: ( ruleUseCase )
            // InternalUseCase.g:7016:3: ruleUseCase
            {
             before(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UseCasesAssignment_3"


    // $ANTLR start "rule__Model__TypesAssignment_4"
    // InternalUseCase.g:7025:1: rule__Model__TypesAssignment_4 : ( ruleUsedTypes ) ;
    public final void rule__Model__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7029:1: ( ( ruleUsedTypes ) )
            // InternalUseCase.g:7030:2: ( ruleUsedTypes )
            {
            // InternalUseCase.g:7030:2: ( ruleUsedTypes )
            // InternalUseCase.g:7031:3: ruleUsedTypes
            {
             before(grammarAccess.getModelAccess().getTypesUsedTypesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUsedTypes();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesUsedTypesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment_4"


    // $ANTLR start "rule__Model__ExceptionsAssignment_5"
    // InternalUseCase.g:7040:1: rule__Model__ExceptionsAssignment_5 : ( ruleUsedExceptions ) ;
    public final void rule__Model__ExceptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7044:1: ( ( ruleUsedExceptions ) )
            // InternalUseCase.g:7045:2: ( ruleUsedExceptions )
            {
            // InternalUseCase.g:7045:2: ( ruleUsedExceptions )
            // InternalUseCase.g:7046:3: ruleUsedExceptions
            {
             before(grammarAccess.getModelAccess().getExceptionsUsedExceptionsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUsedExceptions();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExceptionsUsedExceptionsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExceptionsAssignment_5"


    // $ANTLR start "rule__Model__ExamplesAssignment_6"
    // InternalUseCase.g:7055:1: rule__Model__ExamplesAssignment_6 : ( ruleExample ) ;
    public final void rule__Model__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7059:1: ( ( ruleExample ) )
            // InternalUseCase.g:7060:2: ( ruleExample )
            {
            // InternalUseCase.g:7060:2: ( ruleExample )
            // InternalUseCase.g:7061:3: ruleExample
            {
             before(grammarAccess.getModelAccess().getExamplesExampleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExamplesExampleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExamplesAssignment_6"


    // $ANTLR start "rule__Package__PartsAssignment_1"
    // InternalUseCase.g:7070:1: rule__Package__PartsAssignment_1 : ( rulePackagePart ) ;
    public final void rule__Package__PartsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7074:1: ( ( rulePackagePart ) )
            // InternalUseCase.g:7075:2: ( rulePackagePart )
            {
            // InternalUseCase.g:7075:2: ( rulePackagePart )
            // InternalUseCase.g:7076:3: rulePackagePart
            {
             before(grammarAccess.getPackageAccess().getPartsPackagePartParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePackagePart();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPartsPackagePartParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PartsAssignment_1"


    // $ANTLR start "rule__Package__PartsAssignment_2_1"
    // InternalUseCase.g:7085:1: rule__Package__PartsAssignment_2_1 : ( rulePackagePart ) ;
    public final void rule__Package__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7089:1: ( ( rulePackagePart ) )
            // InternalUseCase.g:7090:2: ( rulePackagePart )
            {
            // InternalUseCase.g:7090:2: ( rulePackagePart )
            // InternalUseCase.g:7091:3: rulePackagePart
            {
             before(grammarAccess.getPackageAccess().getPartsPackagePartParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePackagePart();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPartsPackagePartParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PartsAssignment_2_1"


    // $ANTLR start "rule__PackagePart__NameAssignment"
    // InternalUseCase.g:7100:1: rule__PackagePart__NameAssignment : ( RULE_ID ) ;
    public final void rule__PackagePart__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7104:1: ( ( RULE_ID ) )
            // InternalUseCase.g:7105:2: ( RULE_ID )
            {
            // InternalUseCase.g:7105:2: ( RULE_ID )
            // InternalUseCase.g:7106:3: RULE_ID
            {
             before(grammarAccess.getPackagePartAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackagePartAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackagePart__NameAssignment"


    // $ANTLR start "rule__UseCase__NameAssignment_1"
    // InternalUseCase.g:7115:1: rule__UseCase__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7119:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7120:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7120:2: ( RULE_STRING )
            // InternalUseCase.g:7121:3: RULE_STRING
            {
             before(grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__NameAssignment_1"


    // $ANTLR start "rule__UseCase__DescriptionsAssignment_2"
    // InternalUseCase.g:7130:1: rule__UseCase__DescriptionsAssignment_2 : ( ruleDescription ) ;
    public final void rule__UseCase__DescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7134:1: ( ( ruleDescription ) )
            // InternalUseCase.g:7135:2: ( ruleDescription )
            {
            // InternalUseCase.g:7135:2: ( ruleDescription )
            // InternalUseCase.g:7136:3: ruleDescription
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionsDescriptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getDescriptionsDescriptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__DescriptionsAssignment_2"


    // $ANTLR start "rule__UseCase__AllowedUserGroupsAssignment_3"
    // InternalUseCase.g:7145:1: rule__UseCase__AllowedUserGroupsAssignment_3 : ( ruleAllowedUserGroups ) ;
    public final void rule__UseCase__AllowedUserGroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7149:1: ( ( ruleAllowedUserGroups ) )
            // InternalUseCase.g:7150:2: ( ruleAllowedUserGroups )
            {
            // InternalUseCase.g:7150:2: ( ruleAllowedUserGroups )
            // InternalUseCase.g:7151:3: ruleAllowedUserGroups
            {
             before(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAllowedUserGroupsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAllowedUserGroups();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAllowedUserGroupsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__AllowedUserGroupsAssignment_3"


    // $ANTLR start "rule__UseCase__InputsAssignment_4"
    // InternalUseCase.g:7160:1: rule__UseCase__InputsAssignment_4 : ( ruleInputs ) ;
    public final void rule__UseCase__InputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7164:1: ( ( ruleInputs ) )
            // InternalUseCase.g:7165:2: ( ruleInputs )
            {
            // InternalUseCase.g:7165:2: ( ruleInputs )
            // InternalUseCase.g:7166:3: ruleInputs
            {
             before(grammarAccess.getUseCaseAccess().getInputsInputsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInputs();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getInputsInputsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__InputsAssignment_4"


    // $ANTLR start "rule__UseCase__OptionalInputsAssignment_5"
    // InternalUseCase.g:7175:1: rule__UseCase__OptionalInputsAssignment_5 : ( ruleOptionalInputs ) ;
    public final void rule__UseCase__OptionalInputsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7179:1: ( ( ruleOptionalInputs ) )
            // InternalUseCase.g:7180:2: ( ruleOptionalInputs )
            {
            // InternalUseCase.g:7180:2: ( ruleOptionalInputs )
            // InternalUseCase.g:7181:3: ruleOptionalInputs
            {
             before(grammarAccess.getUseCaseAccess().getOptionalInputsOptionalInputsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionalInputs();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getOptionalInputsOptionalInputsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__OptionalInputsAssignment_5"


    // $ANTLR start "rule__UseCase__OutputsAssignment_6"
    // InternalUseCase.g:7190:1: rule__UseCase__OutputsAssignment_6 : ( ruleOutputs ) ;
    public final void rule__UseCase__OutputsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7194:1: ( ( ruleOutputs ) )
            // InternalUseCase.g:7195:2: ( ruleOutputs )
            {
            // InternalUseCase.g:7195:2: ( ruleOutputs )
            // InternalUseCase.g:7196:3: ruleOutputs
            {
             before(grammarAccess.getUseCaseAccess().getOutputsOutputsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputs();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getOutputsOutputsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__OutputsAssignment_6"


    // $ANTLR start "rule__UseCase__PreconditionsAssignment_7"
    // InternalUseCase.g:7205:1: rule__UseCase__PreconditionsAssignment_7 : ( rulePreConditions ) ;
    public final void rule__UseCase__PreconditionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7209:1: ( ( rulePreConditions ) )
            // InternalUseCase.g:7210:2: ( rulePreConditions )
            {
            // InternalUseCase.g:7210:2: ( rulePreConditions )
            // InternalUseCase.g:7211:3: rulePreConditions
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsPreConditionsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePreConditions();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getPreconditionsPreConditionsParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__PreconditionsAssignment_7"


    // $ANTLR start "rule__UseCase__StepsAssignment_8"
    // InternalUseCase.g:7220:1: rule__UseCase__StepsAssignment_8 : ( ruleSteps ) ;
    public final void rule__UseCase__StepsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7224:1: ( ( ruleSteps ) )
            // InternalUseCase.g:7225:2: ( ruleSteps )
            {
            // InternalUseCase.g:7225:2: ( ruleSteps )
            // InternalUseCase.g:7226:3: ruleSteps
            {
             before(grammarAccess.getUseCaseAccess().getStepsStepsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSteps();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getStepsStepsParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__StepsAssignment_8"


    // $ANTLR start "rule__UseCase__NotesAssignment_9"
    // InternalUseCase.g:7235:1: rule__UseCase__NotesAssignment_9 : ( ruleNotes ) ;
    public final void rule__UseCase__NotesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7239:1: ( ( ruleNotes ) )
            // InternalUseCase.g:7240:2: ( ruleNotes )
            {
            // InternalUseCase.g:7240:2: ( ruleNotes )
            // InternalUseCase.g:7241:3: ruleNotes
            {
             before(grammarAccess.getUseCaseAccess().getNotesNotesParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleNotes();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getNotesNotesParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__NotesAssignment_9"


    // $ANTLR start "rule__Description__NameAssignment_1"
    // InternalUseCase.g:7250:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7254:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7255:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7255:2: ( RULE_STRING )
            // InternalUseCase.g:7256:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__NameAssignment_1"


    // $ANTLR start "rule__AllowedUserGroups__GroupsAssignment_1"
    // InternalUseCase.g:7265:1: rule__AllowedUserGroups__GroupsAssignment_1 : ( ruleAllowedUserGroup ) ;
    public final void rule__AllowedUserGroups__GroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7269:1: ( ( ruleAllowedUserGroup ) )
            // InternalUseCase.g:7270:2: ( ruleAllowedUserGroup )
            {
            // InternalUseCase.g:7270:2: ( ruleAllowedUserGroup )
            // InternalUseCase.g:7271:3: ruleAllowedUserGroup
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroupsAllowedUserGroupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAllowedUserGroup();

            state._fsp--;

             after(grammarAccess.getAllowedUserGroupsAccess().getGroupsAllowedUserGroupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroups__GroupsAssignment_1"


    // $ANTLR start "rule__AllowedUserGroup__ManyAssignment_0"
    // InternalUseCase.g:7280:1: rule__AllowedUserGroup__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__AllowedUserGroup__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7284:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:7285:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:7285:2: ( ( 'many' ) )
            // InternalUseCase.g:7286:3: ( 'many' )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:7287:3: ( 'many' )
            // InternalUseCase.g:7288:4: 'many'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__ManyAssignment_0"


    // $ANTLR start "rule__AllowedUserGroup__NameAssignment_2"
    // InternalUseCase.g:7299:1: rule__AllowedUserGroup__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllowedUserGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7303:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7304:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7304:2: ( RULE_STRING )
            // InternalUseCase.g:7305:3: RULE_STRING
            {
             before(grammarAccess.getAllowedUserGroupAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAllowedUserGroupAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__NameAssignment_2"


    // $ANTLR start "rule__AllowedUserGroup__TypeAssignment_3_1"
    // InternalUseCase.g:7314:1: rule__AllowedUserGroup__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllowedUserGroup__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7318:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:7319:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:7319:2: ( ( RULE_ID ) )
            // InternalUseCase.g:7320:3: ( RULE_ID )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:7321:3: ( RULE_ID )
            // InternalUseCase.g:7322:4: RULE_ID
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllowedUserGroupAccess().getTypeTypeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllowedUserGroup__TypeAssignment_3_1"


    // $ANTLR start "rule__Inputs__InputsAssignment_1"
    // InternalUseCase.g:7333:1: rule__Inputs__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Inputs__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7337:1: ( ( ruleInput ) )
            // InternalUseCase.g:7338:2: ( ruleInput )
            {
            // InternalUseCase.g:7338:2: ( ruleInput )
            // InternalUseCase.g:7339:3: ruleInput
            {
             before(grammarAccess.getInputsAccess().getInputsInputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputsAccess().getInputsInputParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__InputsAssignment_1"


    // $ANTLR start "rule__OptionalInputs__InputsAssignment_1"
    // InternalUseCase.g:7348:1: rule__OptionalInputs__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__OptionalInputs__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7352:1: ( ( ruleInput ) )
            // InternalUseCase.g:7353:2: ( ruleInput )
            {
            // InternalUseCase.g:7353:2: ( ruleInput )
            // InternalUseCase.g:7354:3: ruleInput
            {
             before(grammarAccess.getOptionalInputsAccess().getInputsInputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getOptionalInputsAccess().getInputsInputParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalInputs__InputsAssignment_1"


    // $ANTLR start "rule__Input__ManyAssignment_0"
    // InternalUseCase.g:7363:1: rule__Input__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Input__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7367:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:7368:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:7368:2: ( ( 'many' ) )
            // InternalUseCase.g:7369:3: ( 'many' )
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:7370:3: ( 'many' )
            // InternalUseCase.g:7371:4: 'many'
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ManyAssignment_0"


    // $ANTLR start "rule__Input__OptionalAssignment_2"
    // InternalUseCase.g:7382:1: rule__Input__OptionalAssignment_2 : ( ruleOptional ) ;
    public final void rule__Input__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7386:1: ( ( ruleOptional ) )
            // InternalUseCase.g:7387:2: ( ruleOptional )
            {
            // InternalUseCase.g:7387:2: ( ruleOptional )
            // InternalUseCase.g:7388:3: ruleOptional
            {
             before(grammarAccess.getInputAccess().getOptionalOptionalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getInputAccess().getOptionalOptionalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__OptionalAssignment_2"


    // $ANTLR start "rule__Input__ContentAssignment_3"
    // InternalUseCase.g:7397:1: rule__Input__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Input__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7401:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7402:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7402:2: ( RULE_STRING )
            // InternalUseCase.g:7403:3: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getContentSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getContentSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ContentAssignment_3"


    // $ANTLR start "rule__Input__TypeAssignment_4_1"
    // InternalUseCase.g:7412:1: rule__Input__TypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Input__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7416:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:7417:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:7417:2: ( ( RULE_ID ) )
            // InternalUseCase.g:7418:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getTypeTypeCrossReference_4_1_0()); 
            // InternalUseCase.g:7419:3: ( RULE_ID )
            // InternalUseCase.g:7420:4: RULE_ID
            {
             before(grammarAccess.getInputAccess().getTypeTypeIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getTypeTypeIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getInputAccess().getTypeTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__TypeAssignment_4_1"


    // $ANTLR start "rule__Input__ExampleAssignment_5_2"
    // InternalUseCase.g:7431:1: rule__Input__ExampleAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Input__ExampleAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7435:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7436:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7436:2: ( RULE_STRING )
            // InternalUseCase.g:7437:3: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getExampleSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getExampleSTRINGTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ExampleAssignment_5_2"


    // $ANTLR start "rule__Outputs__OutputsAssignment_1"
    // InternalUseCase.g:7446:1: rule__Outputs__OutputsAssignment_1 : ( ruleOutput ) ;
    public final void rule__Outputs__OutputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7450:1: ( ( ruleOutput ) )
            // InternalUseCase.g:7451:2: ( ruleOutput )
            {
            // InternalUseCase.g:7451:2: ( ruleOutput )
            // InternalUseCase.g:7452:3: ruleOutput
            {
             before(grammarAccess.getOutputsAccess().getOutputsOutputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputsAccess().getOutputsOutputParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__OutputsAssignment_1"


    // $ANTLR start "rule__Output__ManyAssignment_0"
    // InternalUseCase.g:7461:1: rule__Output__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Output__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7465:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:7466:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:7466:2: ( ( 'many' ) )
            // InternalUseCase.g:7467:3: ( 'many' )
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:7468:3: ( 'many' )
            // InternalUseCase.g:7469:4: 'many'
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__ManyAssignment_0"


    // $ANTLR start "rule__Output__ContentAssignment_2"
    // InternalUseCase.g:7480:1: rule__Output__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7484:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7485:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7485:2: ( RULE_STRING )
            // InternalUseCase.g:7486:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getContentSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__ContentAssignment_2"


    // $ANTLR start "rule__Output__TypeAssignment_3_1"
    // InternalUseCase.g:7495:1: rule__Output__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Output__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7499:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:7500:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:7500:2: ( ( RULE_ID ) )
            // InternalUseCase.g:7501:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:7502:3: ( RULE_ID )
            // InternalUseCase.g:7503:4: RULE_ID
            {
             before(grammarAccess.getOutputAccess().getTypeTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getTypeTypeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__TypeAssignment_3_1"


    // $ANTLR start "rule__Output__ExampleAssignment_4_2"
    // InternalUseCase.g:7514:1: rule__Output__ExampleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Output__ExampleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7518:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7519:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7519:2: ( RULE_STRING )
            // InternalUseCase.g:7520:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getExampleSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getExampleSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__ExampleAssignment_4_2"


    // $ANTLR start "rule__PreConditions__ConditionsAssignment_1"
    // InternalUseCase.g:7529:1: rule__PreConditions__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__PreConditions__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7533:1: ( ( ruleCondition ) )
            // InternalUseCase.g:7534:2: ( ruleCondition )
            {
            // InternalUseCase.g:7534:2: ( ruleCondition )
            // InternalUseCase.g:7535:3: ruleCondition
            {
             before(grammarAccess.getPreConditionsAccess().getConditionsConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPreConditionsAccess().getConditionsConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreConditions__ConditionsAssignment_1"


    // $ANTLR start "rule__Condition__ContentAssignment_1"
    // InternalUseCase.g:7544:1: rule__Condition__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Condition__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7548:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7549:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7549:2: ( RULE_STRING )
            // InternalUseCase.g:7550:3: RULE_STRING
            {
             before(grammarAccess.getConditionAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getContentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ContentAssignment_1"


    // $ANTLR start "rule__Steps__StepsAssignment_1"
    // InternalUseCase.g:7559:1: rule__Steps__StepsAssignment_1 : ( ruleStep ) ;
    public final void rule__Steps__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7563:1: ( ( ruleStep ) )
            // InternalUseCase.g:7564:2: ( ruleStep )
            {
            // InternalUseCase.g:7564:2: ( ruleStep )
            // InternalUseCase.g:7565:3: ruleStep
            {
             before(grammarAccess.getStepsAccess().getStepsStepParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepsAccess().getStepsStepParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__StepsAssignment_1"


    // $ANTLR start "rule__Step__NumberAssignment_0"
    // InternalUseCase.g:7574:1: rule__Step__NumberAssignment_0 : ( ruleQualifiedNumber ) ;
    public final void rule__Step__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7578:1: ( ( ruleQualifiedNumber ) )
            // InternalUseCase.g:7579:2: ( ruleQualifiedNumber )
            {
            // InternalUseCase.g:7579:2: ( ruleQualifiedNumber )
            // InternalUseCase.g:7580:3: ruleQualifiedNumber
            {
             before(grammarAccess.getStepAccess().getNumberQualifiedNumberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNumber();

            state._fsp--;

             after(grammarAccess.getStepAccess().getNumberQualifiedNumberParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__NumberAssignment_0"


    // $ANTLR start "rule__Step__ActionAssignment_1_0_0"
    // InternalUseCase.g:7589:1: rule__Step__ActionAssignment_1_0_0 : ( RULE_STRING ) ;
    public final void rule__Step__ActionAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7593:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7594:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7594:2: ( RULE_STRING )
            // InternalUseCase.g:7595:3: RULE_STRING
            {
             before(grammarAccess.getStepAccess().getActionSTRINGTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getActionSTRINGTerminalRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__ActionAssignment_1_0_0"


    // $ANTLR start "rule__Step__ErrorAssignment_1_0_1"
    // InternalUseCase.g:7604:1: rule__Step__ErrorAssignment_1_0_1 : ( ruleRaiseErrorConditional ) ;
    public final void rule__Step__ErrorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7608:1: ( ( ruleRaiseErrorConditional ) )
            // InternalUseCase.g:7609:2: ( ruleRaiseErrorConditional )
            {
            // InternalUseCase.g:7609:2: ( ruleRaiseErrorConditional )
            // InternalUseCase.g:7610:3: ruleRaiseErrorConditional
            {
             before(grammarAccess.getStepAccess().getErrorRaiseErrorConditionalParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRaiseErrorConditional();

            state._fsp--;

             after(grammarAccess.getStepAccess().getErrorRaiseErrorConditionalParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__ErrorAssignment_1_0_1"


    // $ANTLR start "rule__Step__ErrorAssignment_1_1"
    // InternalUseCase.g:7619:1: rule__Step__ErrorAssignment_1_1 : ( ruleRaiseErrorConditional ) ;
    public final void rule__Step__ErrorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7623:1: ( ( ruleRaiseErrorConditional ) )
            // InternalUseCase.g:7624:2: ( ruleRaiseErrorConditional )
            {
            // InternalUseCase.g:7624:2: ( ruleRaiseErrorConditional )
            // InternalUseCase.g:7625:3: ruleRaiseErrorConditional
            {
             before(grammarAccess.getStepAccess().getErrorRaiseErrorConditionalParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRaiseErrorConditional();

            state._fsp--;

             after(grammarAccess.getStepAccess().getErrorRaiseErrorConditionalParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__ErrorAssignment_1_1"


    // $ANTLR start "rule__Step__ConditionAssignment_1_2"
    // InternalUseCase.g:7634:1: rule__Step__ConditionAssignment_1_2 : ( ruleIfStatement ) ;
    public final void rule__Step__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7638:1: ( ( ruleIfStatement ) )
            // InternalUseCase.g:7639:2: ( ruleIfStatement )
            {
            // InternalUseCase.g:7639:2: ( ruleIfStatement )
            // InternalUseCase.g:7640:3: ruleIfStatement
            {
             before(grammarAccess.getStepAccess().getConditionIfStatementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getStepAccess().getConditionIfStatementParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__ConditionAssignment_1_2"


    // $ANTLR start "rule__Step__LoopAssignment_1_3"
    // InternalUseCase.g:7649:1: rule__Step__LoopAssignment_1_3 : ( ruleLoop ) ;
    public final void rule__Step__LoopAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7653:1: ( ( ruleLoop ) )
            // InternalUseCase.g:7654:2: ( ruleLoop )
            {
            // InternalUseCase.g:7654:2: ( ruleLoop )
            // InternalUseCase.g:7655:3: ruleLoop
            {
             before(grammarAccess.getStepAccess().getLoopLoopParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getStepAccess().getLoopLoopParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__LoopAssignment_1_3"


    // $ANTLR start "rule__Step__ExceptionAssignment_1_4"
    // InternalUseCase.g:7664:1: rule__Step__ExceptionAssignment_1_4 : ( ruleRaiseErrorNow ) ;
    public final void rule__Step__ExceptionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7668:1: ( ( ruleRaiseErrorNow ) )
            // InternalUseCase.g:7669:2: ( ruleRaiseErrorNow )
            {
            // InternalUseCase.g:7669:2: ( ruleRaiseErrorNow )
            // InternalUseCase.g:7670:3: ruleRaiseErrorNow
            {
             before(grammarAccess.getStepAccess().getExceptionRaiseErrorNowParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRaiseErrorNow();

            state._fsp--;

             after(grammarAccess.getStepAccess().getExceptionRaiseErrorNowParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__ExceptionAssignment_1_4"


    // $ANTLR start "rule__RaiseErrorConditional__ExceptionAssignment_2"
    // InternalUseCase.g:7679:1: rule__RaiseErrorConditional__ExceptionAssignment_2 : ( ruleException ) ;
    public final void rule__RaiseErrorConditional__ExceptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7683:1: ( ( ruleException ) )
            // InternalUseCase.g:7684:2: ( ruleException )
            {
            // InternalUseCase.g:7684:2: ( ruleException )
            // InternalUseCase.g:7685:3: ruleException
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getExceptionExceptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleException();

            state._fsp--;

             after(grammarAccess.getRaiseErrorConditionalAccess().getExceptionExceptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorConditional__ExceptionAssignment_2"


    // $ANTLR start "rule__RaiseErrorNow__ExceptionAssignment_1"
    // InternalUseCase.g:7694:1: rule__RaiseErrorNow__ExceptionAssignment_1 : ( ruleException ) ;
    public final void rule__RaiseErrorNow__ExceptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7698:1: ( ( ruleException ) )
            // InternalUseCase.g:7699:2: ( ruleException )
            {
            // InternalUseCase.g:7699:2: ( ruleException )
            // InternalUseCase.g:7700:3: ruleException
            {
             before(grammarAccess.getRaiseErrorNowAccess().getExceptionExceptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleException();

            state._fsp--;

             after(grammarAccess.getRaiseErrorNowAccess().getExceptionExceptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseErrorNow__ExceptionAssignment_1"


    // $ANTLR start "rule__IfStatement__ConditionAssignment_1"
    // InternalUseCase.g:7709:1: rule__IfStatement__ConditionAssignment_1 : ( ruleBooleanCondition ) ;
    public final void rule__IfStatement__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7713:1: ( ( ruleBooleanCondition ) )
            // InternalUseCase.g:7714:2: ( ruleBooleanCondition )
            {
            // InternalUseCase.g:7714:2: ( ruleBooleanCondition )
            // InternalUseCase.g:7715:3: ruleBooleanCondition
            {
             before(grammarAccess.getIfStatementAccess().getConditionBooleanConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanCondition();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getConditionBooleanConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ConditionAssignment_1"


    // $ANTLR start "rule__Loop__ConditionAssignment_1"
    // InternalUseCase.g:7724:1: rule__Loop__ConditionAssignment_1 : ( ruleBooleanCondition ) ;
    public final void rule__Loop__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7728:1: ( ( ruleBooleanCondition ) )
            // InternalUseCase.g:7729:2: ( ruleBooleanCondition )
            {
            // InternalUseCase.g:7729:2: ( ruleBooleanCondition )
            // InternalUseCase.g:7730:3: ruleBooleanCondition
            {
             before(grammarAccess.getLoopAccess().getConditionBooleanConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanCondition();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getConditionBooleanConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__ConditionAssignment_1"


    // $ANTLR start "rule__BooleanCondition__NameAssignment"
    // InternalUseCase.g:7739:1: rule__BooleanCondition__NameAssignment : ( RULE_STRING ) ;
    public final void rule__BooleanCondition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7743:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7744:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7744:2: ( RULE_STRING )
            // InternalUseCase.g:7745:3: RULE_STRING
            {
             before(grammarAccess.getBooleanConditionAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBooleanConditionAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanCondition__NameAssignment"


    // $ANTLR start "rule__Notes__ContentAssignment_1"
    // InternalUseCase.g:7754:1: rule__Notes__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notes__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7758:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7759:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7759:2: ( RULE_STRING )
            // InternalUseCase.g:7760:3: RULE_STRING
            {
             before(grammarAccess.getNotesAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNotesAccess().getContentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notes__ContentAssignment_1"


    // $ANTLR start "rule__UsedTypes__TypesAssignment_1"
    // InternalUseCase.g:7769:1: rule__UsedTypes__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__UsedTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7773:1: ( ( ruleType ) )
            // InternalUseCase.g:7774:2: ( ruleType )
            {
            // InternalUseCase.g:7774:2: ( ruleType )
            // InternalUseCase.g:7775:3: ruleType
            {
             before(grammarAccess.getUsedTypesAccess().getTypesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getUsedTypesAccess().getTypesTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__TypesAssignment_1"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalUseCase.g:7784:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7788:1: ( ( RULE_ID ) )
            // InternalUseCase.g:7789:2: ( RULE_ID )
            {
            // InternalUseCase.g:7789:2: ( RULE_ID )
            // InternalUseCase.g:7790:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__Type__DescriptionAssignment_2_1"
    // InternalUseCase.g:7799:1: rule__Type__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Type__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7803:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7804:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7804:2: ( RULE_STRING )
            // InternalUseCase.g:7805:3: RULE_STRING
            {
             before(grammarAccess.getTypeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__DescriptionAssignment_2_1"


    // $ANTLR start "rule__Type__ImportInfoAssignment_3_1"
    // InternalUseCase.g:7814:1: rule__Type__ImportInfoAssignment_3_1 : ( ruleQualifiedName ) ;
    public final void rule__Type__ImportInfoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7818:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:7819:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:7819:2: ( ruleQualifiedName )
            // InternalUseCase.g:7820:3: ruleQualifiedName
            {
             before(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ImportInfoAssignment_3_1"


    // $ANTLR start "rule__UsedExceptions__ExceptionsAssignment_1"
    // InternalUseCase.g:7829:1: rule__UsedExceptions__ExceptionsAssignment_1 : ( ruleExceptionDecleration ) ;
    public final void rule__UsedExceptions__ExceptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7833:1: ( ( ruleExceptionDecleration ) )
            // InternalUseCase.g:7834:2: ( ruleExceptionDecleration )
            {
            // InternalUseCase.g:7834:2: ( ruleExceptionDecleration )
            // InternalUseCase.g:7835:3: ruleExceptionDecleration
            {
             before(grammarAccess.getUsedExceptionsAccess().getExceptionsExceptionDeclerationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExceptionDecleration();

            state._fsp--;

             after(grammarAccess.getUsedExceptionsAccess().getExceptionsExceptionDeclerationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__ExceptionsAssignment_1"


    // $ANTLR start "rule__Exception__TypeAssignment"
    // InternalUseCase.g:7844:1: rule__Exception__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Exception__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7848:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:7849:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:7849:2: ( ( RULE_ID ) )
            // InternalUseCase.g:7850:3: ( RULE_ID )
            {
             before(grammarAccess.getExceptionAccess().getTypeExceptionDeclerationCrossReference_0()); 
            // InternalUseCase.g:7851:3: ( RULE_ID )
            // InternalUseCase.g:7852:4: RULE_ID
            {
             before(grammarAccess.getExceptionAccess().getTypeExceptionDeclerationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExceptionAccess().getTypeExceptionDeclerationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getExceptionAccess().getTypeExceptionDeclerationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exception__TypeAssignment"


    // $ANTLR start "rule__ExceptionDecleration__NameAssignment_1"
    // InternalUseCase.g:7863:1: rule__ExceptionDecleration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExceptionDecleration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7867:1: ( ( RULE_ID ) )
            // InternalUseCase.g:7868:2: ( RULE_ID )
            {
            // InternalUseCase.g:7868:2: ( RULE_ID )
            // InternalUseCase.g:7869:3: RULE_ID
            {
             before(grammarAccess.getExceptionDeclerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__NameAssignment_1"


    // $ANTLR start "rule__ExceptionDecleration__MessageAssignment_2_1"
    // InternalUseCase.g:7878:1: rule__ExceptionDecleration__MessageAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ExceptionDecleration__MessageAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7882:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7883:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7883:2: ( RULE_STRING )
            // InternalUseCase.g:7884:3: RULE_STRING
            {
             before(grammarAccess.getExceptionDeclerationAccess().getMessageSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getMessageSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__MessageAssignment_2_1"


    // $ANTLR start "rule__ExceptionDecleration__ImportInfoAssignment_3_1"
    // InternalUseCase.g:7893:1: rule__ExceptionDecleration__ImportInfoAssignment_3_1 : ( ruleQualifiedName ) ;
    public final void rule__ExceptionDecleration__ImportInfoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7897:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:7898:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:7898:2: ( ruleQualifiedName )
            // InternalUseCase.g:7899:3: ruleQualifiedName
            {
             before(grammarAccess.getExceptionDeclerationAccess().getImportInfoQualifiedNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getExceptionDeclerationAccess().getImportInfoQualifiedNameParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__ImportInfoAssignment_3_1"


    // $ANTLR start "rule__Example__NameAssignment_1"
    // InternalUseCase.g:7908:1: rule__Example__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Example__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7912:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7913:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7913:2: ( RULE_STRING )
            // InternalUseCase.g:7914:3: RULE_STRING
            {
             before(grammarAccess.getExampleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__NameAssignment_1"


    // $ANTLR start "rule__Example__DescriptionAssignment_3_1"
    // InternalUseCase.g:7923:1: rule__Example__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Example__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7927:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:7928:2: ( RULE_STRING )
            {
            // InternalUseCase.g:7928:2: ( RULE_STRING )
            // InternalUseCase.g:7929:3: RULE_STRING
            {
             before(grammarAccess.getExampleAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Example__GivenAssignment_4"
    // InternalUseCase.g:7938:1: rule__Example__GivenAssignment_4 : ( ruleGiven ) ;
    public final void rule__Example__GivenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7942:1: ( ( ruleGiven ) )
            // InternalUseCase.g:7943:2: ( ruleGiven )
            {
            // InternalUseCase.g:7943:2: ( ruleGiven )
            // InternalUseCase.g:7944:3: ruleGiven
            {
             before(grammarAccess.getExampleAccess().getGivenGivenParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGiven();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getGivenGivenParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__GivenAssignment_4"


    // $ANTLR start "rule__Example__GivenAndAssignment_5"
    // InternalUseCase.g:7953:1: rule__Example__GivenAndAssignment_5 : ( ruleGivenAnd ) ;
    public final void rule__Example__GivenAndAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7957:1: ( ( ruleGivenAnd ) )
            // InternalUseCase.g:7958:2: ( ruleGivenAnd )
            {
            // InternalUseCase.g:7958:2: ( ruleGivenAnd )
            // InternalUseCase.g:7959:3: ruleGivenAnd
            {
             before(grammarAccess.getExampleAccess().getGivenAndGivenAndParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGivenAnd();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getGivenAndGivenAndParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__GivenAndAssignment_5"


    // $ANTLR start "rule__Example__WhenAssignment_6"
    // InternalUseCase.g:7968:1: rule__Example__WhenAssignment_6 : ( ruleWhen ) ;
    public final void rule__Example__WhenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7972:1: ( ( ruleWhen ) )
            // InternalUseCase.g:7973:2: ( ruleWhen )
            {
            // InternalUseCase.g:7973:2: ( ruleWhen )
            // InternalUseCase.g:7974:3: ruleWhen
            {
             before(grammarAccess.getExampleAccess().getWhenWhenParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getWhenWhenParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__WhenAssignment_6"


    // $ANTLR start "rule__Example__WhenAndAssignment_7"
    // InternalUseCase.g:7983:1: rule__Example__WhenAndAssignment_7 : ( ruleWhenAnd ) ;
    public final void rule__Example__WhenAndAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:7987:1: ( ( ruleWhenAnd ) )
            // InternalUseCase.g:7988:2: ( ruleWhenAnd )
            {
            // InternalUseCase.g:7988:2: ( ruleWhenAnd )
            // InternalUseCase.g:7989:3: ruleWhenAnd
            {
             before(grammarAccess.getExampleAccess().getWhenAndWhenAndParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleWhenAnd();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getWhenAndWhenAndParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__WhenAndAssignment_7"


    // $ANTLR start "rule__Example__ThenAssignment_8"
    // InternalUseCase.g:7998:1: rule__Example__ThenAssignment_8 : ( ruleThen ) ;
    public final void rule__Example__ThenAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:8002:1: ( ( ruleThen ) )
            // InternalUseCase.g:8003:2: ( ruleThen )
            {
            // InternalUseCase.g:8003:2: ( ruleThen )
            // InternalUseCase.g:8004:3: ruleThen
            {
             before(grammarAccess.getExampleAccess().getThenThenParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleThen();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getThenThenParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__ThenAssignment_8"


    // $ANTLR start "rule__Example__ThenAndAssignment_9"
    // InternalUseCase.g:8013:1: rule__Example__ThenAndAssignment_9 : ( ruleThenAnd ) ;
    public final void rule__Example__ThenAndAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:8017:1: ( ( ruleThenAnd ) )
            // InternalUseCase.g:8018:2: ( ruleThenAnd )
            {
            // InternalUseCase.g:8018:2: ( ruleThenAnd )
            // InternalUseCase.g:8019:3: ruleThenAnd
            {
             before(grammarAccess.getExampleAccess().getThenAndThenAndParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleThenAnd();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getThenAndThenAndParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__ThenAndAssignment_9"


    // $ANTLR start "rule__Example__ExplainationAssignment_10_1"
    // InternalUseCase.g:8028:1: rule__Example__ExplainationAssignment_10_1 : ( RULE_STRING ) ;
    public final void rule__Example__ExplainationAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:8032:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:8033:2: ( RULE_STRING )
            {
            // InternalUseCase.g:8033:2: ( RULE_STRING )
            // InternalUseCase.g:8034:3: RULE_STRING
            {
             before(grammarAccess.getExampleAccess().getExplainationSTRINGTerminalRuleCall_10_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getExplainationSTRINGTerminalRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__ExplainationAssignment_10_1"


    // $ANTLR start "rule__Given__ContentAssignment_1"
    // InternalUseCase.g:8043:1: rule__Given__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Given__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:8047:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:8048:2: ( RULE_STRING )
            {
            // InternalUseCase.g:8048:2: ( RULE_STRING )
            // InternalUseCase.g:8049:3: RULE_STRING
            {
             before(grammarAccess.getGivenAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getContentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__ContentAssignment_1"


    // $ANTLR start "rule__GivenAnd__ContentAssignment_1"
    // InternalUseCase.g:8058:1: rule__GivenAnd__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GivenAnd__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:8062:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:8063:2: ( RULE_STRING )
            {
            // InternalUseCase.g:8063:2: ( RULE_STRING )
            // InternalUseCase.g:8064:3: RULE_STRING
            {
             before(grammarAccess.getGivenAndAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGivenAndAccess().getContentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenAnd__ContentAssignment_1"


    // $ANTLR start "rule__When__ContentAssignment_1"
    // InternalUseCase.g:8073:1: rule__When__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__When__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:8077:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:8078:2: ( RULE_STRING )
            {
            // InternalUseCase.g:8078:2: ( RULE_STRING )
            // InternalUseCase.g:8079:3: RULE_STRING
            {
             before(grammarAccess.getWhenAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getContentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__ContentAssignment_1"


    // $ANTLR start "rule__WhenAnd__ContentAssignment_1"
    // InternalUseCase.g:8088:1: rule__WhenAnd__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__WhenAnd__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:8092:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:8093:2: ( RULE_STRING )
            {
            // InternalUseCase.g:8093:2: ( RULE_STRING )
            // InternalUseCase.g:8094:3: RULE_STRING
            {
             before(grammarAccess.getWhenAndAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWhenAndAccess().getContentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhenAnd__ContentAssignment_1"


    // $ANTLR start "rule__Then__ContentAssignment_1"
    // InternalUseCase.g:8103:1: rule__Then__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Then__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:8107:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:8108:2: ( RULE_STRING )
            {
            // InternalUseCase.g:8108:2: ( RULE_STRING )
            // InternalUseCase.g:8109:3: RULE_STRING
            {
             before(grammarAccess.getThenAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getContentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__ContentAssignment_1"


    // $ANTLR start "rule__ThenAnd__ContentAssignment_1"
    // InternalUseCase.g:8118:1: rule__ThenAnd__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ThenAnd__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:8122:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:8123:2: ( RULE_STRING )
            {
            // InternalUseCase.g:8123:2: ( RULE_STRING )
            // InternalUseCase.g:8124:3: RULE_STRING
            {
             before(grammarAccess.getThenAndAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getThenAndAccess().getContentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThenAnd__ContentAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L,0x0000000008280000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x9280F03FC3FC0800L,0x0000000000000248L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x4000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000C000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000FC000000040L,0x0000000000060000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800080L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0003000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000C000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000C000000000000L,0x0000000028000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0200000000000000L});

}