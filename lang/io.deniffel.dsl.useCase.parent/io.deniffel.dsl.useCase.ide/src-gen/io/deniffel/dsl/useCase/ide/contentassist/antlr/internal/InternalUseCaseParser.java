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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'optional'", "'Firma'", "'Company'", "'Kathegorie'", "'package'", "'use-case'", "'Rezept'", "'description:'", "'Kurzbeschreibung:'", "'Beschreibung'", "'allowed-usergroups:'", "'requires:'", "'require:'", "'optional:'", "'Optional'", "'as'", "'als'", "'e.g'", "'z.B.'", "'Ergebnis:'", "'produces:'", "'produce:'", "'Vorbedingungen:'", "'pre-condition:'", "'pre-conditions:'", "'steps:'", "'Schritte:'", "'.'", "':'", "'If'", "'Falls'", "'Solange'", "'While'", "'notes:'", "'note:'", "'Anmerkungen:'", "'Anmerkung:'", "'>'", "'end'", "'of'", "'Ende'", "'des'", "'Rezpets'", "'Erlaubt'", "'f\\u00FCr:'", "'-'", "'requires'", "'the'", "'following'", "'input'", "'Ben\\u00F6tigte'", "'Zutaten'", "'inputs'", "'Optionale'", "'('", "')'", "'produces'", "'output'", "'On'", "'error'", "'raise'", "'Bei'", "'Fehler'", "'melde'", "'Raise'", "'Melde'", "'used'", "'building-blocks:'", "'Genutzte'", "'Bausteine:'", "'['", "']'", "'errors:'", "'Fehler:'", "'many'"
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
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
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


    // $ANTLR start "rule__Model__Alternatives_0"
    // InternalUseCase.g:802:1: rule__Model__Alternatives_0 : ( ( 'Firma' ) | ( 'Company' ) );
    public final void rule__Model__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:806:1: ( ( 'Firma' ) | ( 'Company' ) )
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
                    // InternalUseCase.g:807:2: ( 'Firma' )
                    {
                    // InternalUseCase.g:807:2: ( 'Firma' )
                    // InternalUseCase.g:808:3: 'Firma'
                    {
                     before(grammarAccess.getModelAccess().getFirmaKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getFirmaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:813:2: ( 'Company' )
                    {
                    // InternalUseCase.g:813:2: ( 'Company' )
                    // InternalUseCase.g:814:3: 'Company'
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
    // InternalUseCase.g:823:1: rule__Package__Alternatives_0 : ( ( 'Kathegorie' ) | ( 'package' ) );
    public final void rule__Package__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:827:1: ( ( 'Kathegorie' ) | ( 'package' ) )
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
                    // InternalUseCase.g:828:2: ( 'Kathegorie' )
                    {
                    // InternalUseCase.g:828:2: ( 'Kathegorie' )
                    // InternalUseCase.g:829:3: 'Kathegorie'
                    {
                     before(grammarAccess.getPackageAccess().getKathegorieKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getKathegorieKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:834:2: ( 'package' )
                    {
                    // InternalUseCase.g:834:2: ( 'package' )
                    // InternalUseCase.g:835:3: 'package'
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
    // InternalUseCase.g:844:1: rule__UseCase__Alternatives_0 : ( ( 'use-case' ) | ( 'Rezept' ) );
    public final void rule__UseCase__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:848:1: ( ( 'use-case' ) | ( 'Rezept' ) )
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
                    // InternalUseCase.g:849:2: ( 'use-case' )
                    {
                    // InternalUseCase.g:849:2: ( 'use-case' )
                    // InternalUseCase.g:850:3: 'use-case'
                    {
                     before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:855:2: ( 'Rezept' )
                    {
                    // InternalUseCase.g:855:2: ( 'Rezept' )
                    // InternalUseCase.g:856:3: 'Rezept'
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
    // InternalUseCase.g:865:1: rule__UseCase__Alternatives_10 : ( ( ( rule__UseCase__Group_10_0__0 ) ) | ( ( rule__UseCase__Group_10_1__0 ) ) );
    public final void rule__UseCase__Alternatives_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:869:1: ( ( ( rule__UseCase__Group_10_0__0 ) ) | ( ( rule__UseCase__Group_10_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==49) ) {
                alt4=1;
            }
            else if ( (LA4_0==51) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:870:2: ( ( rule__UseCase__Group_10_0__0 ) )
                    {
                    // InternalUseCase.g:870:2: ( ( rule__UseCase__Group_10_0__0 ) )
                    // InternalUseCase.g:871:3: ( rule__UseCase__Group_10_0__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_10_0()); 
                    // InternalUseCase.g:872:3: ( rule__UseCase__Group_10_0__0 )
                    // InternalUseCase.g:872:4: rule__UseCase__Group_10_0__0
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
                    // InternalUseCase.g:876:2: ( ( rule__UseCase__Group_10_1__0 ) )
                    {
                    // InternalUseCase.g:876:2: ( ( rule__UseCase__Group_10_1__0 ) )
                    // InternalUseCase.g:877:3: ( rule__UseCase__Group_10_1__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_10_1()); 
                    // InternalUseCase.g:878:3: ( rule__UseCase__Group_10_1__0 )
                    // InternalUseCase.g:878:4: rule__UseCase__Group_10_1__0
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
    // InternalUseCase.g:886:1: rule__Description__Alternatives_0 : ( ( 'description:' ) | ( 'Kurzbeschreibung:' ) | ( 'Beschreibung' ) );
    public final void rule__Description__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:890:1: ( ( 'description:' ) | ( 'Kurzbeschreibung:' ) | ( 'Beschreibung' ) )
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
                    // InternalUseCase.g:891:2: ( 'description:' )
                    {
                    // InternalUseCase.g:891:2: ( 'description:' )
                    // InternalUseCase.g:892:3: 'description:'
                    {
                     before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:897:2: ( 'Kurzbeschreibung:' )
                    {
                    // InternalUseCase.g:897:2: ( 'Kurzbeschreibung:' )
                    // InternalUseCase.g:898:3: 'Kurzbeschreibung:'
                    {
                     before(grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:903:2: ( 'Beschreibung' )
                    {
                    // InternalUseCase.g:903:2: ( 'Beschreibung' )
                    // InternalUseCase.g:904:3: 'Beschreibung'
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
    // InternalUseCase.g:913:1: rule__AllowedUserGroups__Alternatives_0 : ( ( 'allowed-usergroups:' ) | ( ( rule__AllowedUserGroups__Group_0_1__0 ) ) );
    public final void rule__AllowedUserGroups__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:917:1: ( ( 'allowed-usergroups:' ) | ( ( rule__AllowedUserGroups__Group_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==54) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:918:2: ( 'allowed-usergroups:' )
                    {
                    // InternalUseCase.g:918:2: ( 'allowed-usergroups:' )
                    // InternalUseCase.g:919:3: 'allowed-usergroups:'
                    {
                     before(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:924:2: ( ( rule__AllowedUserGroups__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:924:2: ( ( rule__AllowedUserGroups__Group_0_1__0 ) )
                    // InternalUseCase.g:925:3: ( rule__AllowedUserGroups__Group_0_1__0 )
                    {
                     before(grammarAccess.getAllowedUserGroupsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:926:3: ( rule__AllowedUserGroups__Group_0_1__0 )
                    // InternalUseCase.g:926:4: rule__AllowedUserGroups__Group_0_1__0
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
    // InternalUseCase.g:934:1: rule__Inputs__Alternatives_0 : ( ( ( rule__Inputs__Alternatives_0_0 ) ) | ( ( rule__Inputs__Group_0_1__0 ) ) );
    public final void rule__Inputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:938:1: ( ( ( rule__Inputs__Alternatives_0_0 ) ) | ( ( rule__Inputs__Group_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=22 && LA7_0<=23)||LA7_0==57) ) {
                alt7=1;
            }
            else if ( (LA7_0==61) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:939:2: ( ( rule__Inputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:939:2: ( ( rule__Inputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:940:3: ( rule__Inputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getInputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:941:3: ( rule__Inputs__Alternatives_0_0 )
                    // InternalUseCase.g:941:4: rule__Inputs__Alternatives_0_0
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
                    // InternalUseCase.g:945:2: ( ( rule__Inputs__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:945:2: ( ( rule__Inputs__Group_0_1__0 ) )
                    // InternalUseCase.g:946:3: ( rule__Inputs__Group_0_1__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:947:3: ( rule__Inputs__Group_0_1__0 )
                    // InternalUseCase.g:947:4: rule__Inputs__Group_0_1__0
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
    // InternalUseCase.g:955:1: rule__Inputs__Alternatives_0_0 : ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_0_2__0 ) ) );
    public final void rule__Inputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:959:1: ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_0_2__0 ) ) )
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
            case 57:
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
                    // InternalUseCase.g:960:2: ( 'requires:' )
                    {
                    // InternalUseCase.g:960:2: ( 'requires:' )
                    // InternalUseCase.g:961:3: 'requires:'
                    {
                     before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:966:2: ( 'require:' )
                    {
                    // InternalUseCase.g:966:2: ( 'require:' )
                    // InternalUseCase.g:967:3: 'require:'
                    {
                     before(grammarAccess.getInputsAccess().getRequireKeyword_0_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequireKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:972:2: ( ( rule__Inputs__Group_0_0_2__0 ) )
                    {
                    // InternalUseCase.g:972:2: ( ( rule__Inputs__Group_0_0_2__0 ) )
                    // InternalUseCase.g:973:3: ( rule__Inputs__Group_0_0_2__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_0_2()); 
                    // InternalUseCase.g:974:3: ( rule__Inputs__Group_0_0_2__0 )
                    // InternalUseCase.g:974:4: rule__Inputs__Group_0_0_2__0
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
    // InternalUseCase.g:982:1: rule__OptionalInputs__Alternatives_0 : ( ( ( rule__OptionalInputs__Alternatives_0_0 ) ) | ( ( rule__OptionalInputs__Group_0_1__0 ) ) );
    public final void rule__OptionalInputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:986:1: ( ( ( rule__OptionalInputs__Alternatives_0_0 ) ) | ( ( rule__OptionalInputs__Group_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11||LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25||LA9_0==64) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUseCase.g:987:2: ( ( rule__OptionalInputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:987:2: ( ( rule__OptionalInputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:988:3: ( rule__OptionalInputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getOptionalInputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:989:3: ( rule__OptionalInputs__Alternatives_0_0 )
                    // InternalUseCase.g:989:4: rule__OptionalInputs__Alternatives_0_0
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
                    // InternalUseCase.g:993:2: ( ( rule__OptionalInputs__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:993:2: ( ( rule__OptionalInputs__Group_0_1__0 ) )
                    // InternalUseCase.g:994:3: ( rule__OptionalInputs__Group_0_1__0 )
                    {
                     before(grammarAccess.getOptionalInputsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:995:3: ( rule__OptionalInputs__Group_0_1__0 )
                    // InternalUseCase.g:995:4: rule__OptionalInputs__Group_0_1__0
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
    // InternalUseCase.g:1003:1: rule__OptionalInputs__Alternatives_0_0 : ( ( 'optional:' ) | ( ( rule__OptionalInputs__Group_0_0_1__0 ) ) );
    public final void rule__OptionalInputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1007:1: ( ( 'optional:' ) | ( ( rule__OptionalInputs__Group_0_0_1__0 ) ) )
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
                    // InternalUseCase.g:1008:2: ( 'optional:' )
                    {
                    // InternalUseCase.g:1008:2: ( 'optional:' )
                    // InternalUseCase.g:1009:3: 'optional:'
                    {
                     before(grammarAccess.getOptionalInputsAccess().getOptionalKeyword_0_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOptionalInputsAccess().getOptionalKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1014:2: ( ( rule__OptionalInputs__Group_0_0_1__0 ) )
                    {
                    // InternalUseCase.g:1014:2: ( ( rule__OptionalInputs__Group_0_0_1__0 ) )
                    // InternalUseCase.g:1015:3: ( rule__OptionalInputs__Group_0_0_1__0 )
                    {
                     before(grammarAccess.getOptionalInputsAccess().getGroup_0_0_1()); 
                    // InternalUseCase.g:1016:3: ( rule__OptionalInputs__Group_0_0_1__0 )
                    // InternalUseCase.g:1016:4: rule__OptionalInputs__Group_0_0_1__0
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
    // InternalUseCase.g:1024:1: rule__OptionalInputs__Alternatives_0_1_0 : ( ( ( rule__OptionalInputs__Group_0_1_0_0__0 ) ) | ( 'Optional' ) );
    public final void rule__OptionalInputs__Alternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1028:1: ( ( ( rule__OptionalInputs__Group_0_1_0_0__0 ) ) | ( 'Optional' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==64) ) {
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
                    // InternalUseCase.g:1029:2: ( ( rule__OptionalInputs__Group_0_1_0_0__0 ) )
                    {
                    // InternalUseCase.g:1029:2: ( ( rule__OptionalInputs__Group_0_1_0_0__0 ) )
                    // InternalUseCase.g:1030:3: ( rule__OptionalInputs__Group_0_1_0_0__0 )
                    {
                     before(grammarAccess.getOptionalInputsAccess().getGroup_0_1_0_0()); 
                    // InternalUseCase.g:1031:3: ( rule__OptionalInputs__Group_0_1_0_0__0 )
                    // InternalUseCase.g:1031:4: rule__OptionalInputs__Group_0_1_0_0__0
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
                    // InternalUseCase.g:1035:2: ( 'Optional' )
                    {
                    // InternalUseCase.g:1035:2: ( 'Optional' )
                    // InternalUseCase.g:1036:3: 'Optional'
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
    // InternalUseCase.g:1045:1: rule__Input__Alternatives_4_0 : ( ( 'as' ) | ( 'als' ) );
    public final void rule__Input__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1049:1: ( ( 'as' ) | ( 'als' ) )
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
                    // InternalUseCase.g:1050:2: ( 'as' )
                    {
                    // InternalUseCase.g:1050:2: ( 'as' )
                    // InternalUseCase.g:1051:3: 'as'
                    {
                     before(grammarAccess.getInputAccess().getAsKeyword_4_0_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getAsKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1056:2: ( 'als' )
                    {
                    // InternalUseCase.g:1056:2: ( 'als' )
                    // InternalUseCase.g:1057:3: 'als'
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
    // InternalUseCase.g:1066:1: rule__Input__Alternatives_5_1 : ( ( 'e.g' ) | ( 'z.B.' ) );
    public final void rule__Input__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1070:1: ( ( 'e.g' ) | ( 'z.B.' ) )
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
                    // InternalUseCase.g:1071:2: ( 'e.g' )
                    {
                    // InternalUseCase.g:1071:2: ( 'e.g' )
                    // InternalUseCase.g:1072:3: 'e.g'
                    {
                     before(grammarAccess.getInputAccess().getEGKeyword_5_1_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getEGKeyword_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1077:2: ( 'z.B.' )
                    {
                    // InternalUseCase.g:1077:2: ( 'z.B.' )
                    // InternalUseCase.g:1078:3: 'z.B.'
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
    // InternalUseCase.g:1087:1: rule__Outputs__Alternatives_0 : ( ( ( rule__Outputs__Alternatives_0_0 ) ) | ( 'Ergebnis:' ) );
    public final void rule__Outputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1091:1: ( ( ( rule__Outputs__Alternatives_0_0 ) ) | ( 'Ergebnis:' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=31 && LA14_0<=32)||LA14_0==67) ) {
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
                    // InternalUseCase.g:1092:2: ( ( rule__Outputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1092:2: ( ( rule__Outputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:1093:3: ( rule__Outputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getOutputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1094:3: ( rule__Outputs__Alternatives_0_0 )
                    // InternalUseCase.g:1094:4: rule__Outputs__Alternatives_0_0
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
                    // InternalUseCase.g:1098:2: ( 'Ergebnis:' )
                    {
                    // InternalUseCase.g:1098:2: ( 'Ergebnis:' )
                    // InternalUseCase.g:1099:3: 'Ergebnis:'
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
    // InternalUseCase.g:1108:1: rule__Outputs__Alternatives_0_0 : ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_0_2__0 ) ) );
    public final void rule__Outputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1112:1: ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_0_2__0 ) ) )
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
            case 67:
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
                    // InternalUseCase.g:1113:2: ( 'produces:' )
                    {
                    // InternalUseCase.g:1113:2: ( 'produces:' )
                    // InternalUseCase.g:1114:3: 'produces:'
                    {
                     before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1119:2: ( 'produce:' )
                    {
                    // InternalUseCase.g:1119:2: ( 'produce:' )
                    // InternalUseCase.g:1120:3: 'produce:'
                    {
                     before(grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:1125:2: ( ( rule__Outputs__Group_0_0_2__0 ) )
                    {
                    // InternalUseCase.g:1125:2: ( ( rule__Outputs__Group_0_0_2__0 ) )
                    // InternalUseCase.g:1126:3: ( rule__Outputs__Group_0_0_2__0 )
                    {
                     before(grammarAccess.getOutputsAccess().getGroup_0_0_2()); 
                    // InternalUseCase.g:1127:3: ( rule__Outputs__Group_0_0_2__0 )
                    // InternalUseCase.g:1127:4: rule__Outputs__Group_0_0_2__0
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
    // InternalUseCase.g:1135:1: rule__Output__Alternatives_3_0 : ( ( 'as' ) | ( 'als' ) );
    public final void rule__Output__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1139:1: ( ( 'as' ) | ( 'als' ) )
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
                    // InternalUseCase.g:1140:2: ( 'as' )
                    {
                    // InternalUseCase.g:1140:2: ( 'as' )
                    // InternalUseCase.g:1141:3: 'as'
                    {
                     before(grammarAccess.getOutputAccess().getAsKeyword_3_0_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getAsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1146:2: ( 'als' )
                    {
                    // InternalUseCase.g:1146:2: ( 'als' )
                    // InternalUseCase.g:1147:3: 'als'
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
    // InternalUseCase.g:1156:1: rule__Output__Alternatives_4_1 : ( ( 'e.g' ) | ( 'z.B.' ) );
    public final void rule__Output__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1160:1: ( ( 'e.g' ) | ( 'z.B.' ) )
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
                    // InternalUseCase.g:1161:2: ( 'e.g' )
                    {
                    // InternalUseCase.g:1161:2: ( 'e.g' )
                    // InternalUseCase.g:1162:3: 'e.g'
                    {
                     before(grammarAccess.getOutputAccess().getEGKeyword_4_1_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getEGKeyword_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1167:2: ( 'z.B.' )
                    {
                    // InternalUseCase.g:1167:2: ( 'z.B.' )
                    // InternalUseCase.g:1168:3: 'z.B.'
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
    // InternalUseCase.g:1177:1: rule__PreConditions__Alternatives_0 : ( ( ( rule__PreConditions__Alternatives_0_0 ) ) | ( 'Vorbedingungen:' ) );
    public final void rule__PreConditions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1181:1: ( ( ( rule__PreConditions__Alternatives_0_0 ) ) | ( 'Vorbedingungen:' ) )
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
                    // InternalUseCase.g:1182:2: ( ( rule__PreConditions__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1182:2: ( ( rule__PreConditions__Alternatives_0_0 ) )
                    // InternalUseCase.g:1183:3: ( rule__PreConditions__Alternatives_0_0 )
                    {
                     before(grammarAccess.getPreConditionsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1184:3: ( rule__PreConditions__Alternatives_0_0 )
                    // InternalUseCase.g:1184:4: rule__PreConditions__Alternatives_0_0
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
                    // InternalUseCase.g:1188:2: ( 'Vorbedingungen:' )
                    {
                    // InternalUseCase.g:1188:2: ( 'Vorbedingungen:' )
                    // InternalUseCase.g:1189:3: 'Vorbedingungen:'
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
    // InternalUseCase.g:1198:1: rule__PreConditions__Alternatives_0_0 : ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) );
    public final void rule__PreConditions__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1202:1: ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) )
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
                    // InternalUseCase.g:1203:2: ( 'pre-condition:' )
                    {
                    // InternalUseCase.g:1203:2: ( 'pre-condition:' )
                    // InternalUseCase.g:1204:3: 'pre-condition:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1209:2: ( 'pre-conditions:' )
                    {
                    // InternalUseCase.g:1209:2: ( 'pre-conditions:' )
                    // InternalUseCase.g:1210:3: 'pre-conditions:'
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
    // InternalUseCase.g:1219:1: rule__Steps__Alternatives_0 : ( ( 'steps:' ) | ( 'Schritte:' ) );
    public final void rule__Steps__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1223:1: ( ( 'steps:' ) | ( 'Schritte:' ) )
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
                    // InternalUseCase.g:1224:2: ( 'steps:' )
                    {
                    // InternalUseCase.g:1224:2: ( 'steps:' )
                    // InternalUseCase.g:1225:3: 'steps:'
                    {
                     before(grammarAccess.getStepsAccess().getStepsKeyword_0_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getStepsAccess().getStepsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1230:2: ( 'Schritte:' )
                    {
                    // InternalUseCase.g:1230:2: ( 'Schritte:' )
                    // InternalUseCase.g:1231:3: 'Schritte:'
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
    // InternalUseCase.g:1240:1: rule__Step__Alternatives_1 : ( ( ( rule__Step__Group_1_0__0 ) ) | ( ( rule__Step__ErrorAssignment_1_1 ) ) | ( ( rule__Step__ConditionAssignment_1_2 ) ) | ( ( rule__Step__LoopAssignment_1_3 ) ) | ( ( rule__Step__ExceptionAssignment_1_4 ) ) );
    public final void rule__Step__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1244:1: ( ( ( rule__Step__Group_1_0__0 ) ) | ( ( rule__Step__ErrorAssignment_1_1 ) ) | ( ( rule__Step__ConditionAssignment_1_2 ) ) | ( ( rule__Step__LoopAssignment_1_3 ) ) | ( ( rule__Step__ExceptionAssignment_1_4 ) ) )
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
            case 75:
            case 76:
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
                    // InternalUseCase.g:1245:2: ( ( rule__Step__Group_1_0__0 ) )
                    {
                    // InternalUseCase.g:1245:2: ( ( rule__Step__Group_1_0__0 ) )
                    // InternalUseCase.g:1246:3: ( rule__Step__Group_1_0__0 )
                    {
                     before(grammarAccess.getStepAccess().getGroup_1_0()); 
                    // InternalUseCase.g:1247:3: ( rule__Step__Group_1_0__0 )
                    // InternalUseCase.g:1247:4: rule__Step__Group_1_0__0
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
                    // InternalUseCase.g:1251:2: ( ( rule__Step__ErrorAssignment_1_1 ) )
                    {
                    // InternalUseCase.g:1251:2: ( ( rule__Step__ErrorAssignment_1_1 ) )
                    // InternalUseCase.g:1252:3: ( rule__Step__ErrorAssignment_1_1 )
                    {
                     before(grammarAccess.getStepAccess().getErrorAssignment_1_1()); 
                    // InternalUseCase.g:1253:3: ( rule__Step__ErrorAssignment_1_1 )
                    // InternalUseCase.g:1253:4: rule__Step__ErrorAssignment_1_1
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
                    // InternalUseCase.g:1257:2: ( ( rule__Step__ConditionAssignment_1_2 ) )
                    {
                    // InternalUseCase.g:1257:2: ( ( rule__Step__ConditionAssignment_1_2 ) )
                    // InternalUseCase.g:1258:3: ( rule__Step__ConditionAssignment_1_2 )
                    {
                     before(grammarAccess.getStepAccess().getConditionAssignment_1_2()); 
                    // InternalUseCase.g:1259:3: ( rule__Step__ConditionAssignment_1_2 )
                    // InternalUseCase.g:1259:4: rule__Step__ConditionAssignment_1_2
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
                    // InternalUseCase.g:1263:2: ( ( rule__Step__LoopAssignment_1_3 ) )
                    {
                    // InternalUseCase.g:1263:2: ( ( rule__Step__LoopAssignment_1_3 ) )
                    // InternalUseCase.g:1264:3: ( rule__Step__LoopAssignment_1_3 )
                    {
                     before(grammarAccess.getStepAccess().getLoopAssignment_1_3()); 
                    // InternalUseCase.g:1265:3: ( rule__Step__LoopAssignment_1_3 )
                    // InternalUseCase.g:1265:4: rule__Step__LoopAssignment_1_3
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
                    // InternalUseCase.g:1269:2: ( ( rule__Step__ExceptionAssignment_1_4 ) )
                    {
                    // InternalUseCase.g:1269:2: ( ( rule__Step__ExceptionAssignment_1_4 ) )
                    // InternalUseCase.g:1270:3: ( rule__Step__ExceptionAssignment_1_4 )
                    {
                     before(grammarAccess.getStepAccess().getExceptionAssignment_1_4()); 
                    // InternalUseCase.g:1271:3: ( rule__Step__ExceptionAssignment_1_4 )
                    // InternalUseCase.g:1271:4: rule__Step__ExceptionAssignment_1_4
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
    // InternalUseCase.g:1279:1: rule__RaiseErrorConditional__Alternatives_0 : ( ( '.' ) | ( ':' ) );
    public final void rule__RaiseErrorConditional__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1283:1: ( ( '.' ) | ( ':' ) )
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
                    // InternalUseCase.g:1284:2: ( '.' )
                    {
                    // InternalUseCase.g:1284:2: ( '.' )
                    // InternalUseCase.g:1285:3: '.'
                    {
                     before(grammarAccess.getRaiseErrorConditionalAccess().getFullStopKeyword_0_0()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getRaiseErrorConditionalAccess().getFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1290:2: ( ':' )
                    {
                    // InternalUseCase.g:1290:2: ( ':' )
                    // InternalUseCase.g:1291:3: ':'
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
    // InternalUseCase.g:1300:1: rule__RaiseErrorConditional__Alternatives_1 : ( ( ( rule__RaiseErrorConditional__Group_1_0__0 ) ) | ( ( rule__RaiseErrorConditional__Group_1_1__0 ) ) );
    public final void rule__RaiseErrorConditional__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1304:1: ( ( ( rule__RaiseErrorConditional__Group_1_0__0 ) ) | ( ( rule__RaiseErrorConditional__Group_1_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==69) ) {
                alt23=1;
            }
            else if ( (LA23_0==72) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:1305:2: ( ( rule__RaiseErrorConditional__Group_1_0__0 ) )
                    {
                    // InternalUseCase.g:1305:2: ( ( rule__RaiseErrorConditional__Group_1_0__0 ) )
                    // InternalUseCase.g:1306:3: ( rule__RaiseErrorConditional__Group_1_0__0 )
                    {
                     before(grammarAccess.getRaiseErrorConditionalAccess().getGroup_1_0()); 
                    // InternalUseCase.g:1307:3: ( rule__RaiseErrorConditional__Group_1_0__0 )
                    // InternalUseCase.g:1307:4: rule__RaiseErrorConditional__Group_1_0__0
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
                    // InternalUseCase.g:1311:2: ( ( rule__RaiseErrorConditional__Group_1_1__0 ) )
                    {
                    // InternalUseCase.g:1311:2: ( ( rule__RaiseErrorConditional__Group_1_1__0 ) )
                    // InternalUseCase.g:1312:3: ( rule__RaiseErrorConditional__Group_1_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorConditionalAccess().getGroup_1_1()); 
                    // InternalUseCase.g:1313:3: ( rule__RaiseErrorConditional__Group_1_1__0 )
                    // InternalUseCase.g:1313:4: rule__RaiseErrorConditional__Group_1_1__0
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
    // InternalUseCase.g:1321:1: rule__RaiseErrorNow__Alternatives_0 : ( ( ( rule__RaiseErrorNow__Group_0_0__0 ) ) | ( ( rule__RaiseErrorNow__Group_0_1__0 ) ) );
    public final void rule__RaiseErrorNow__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1325:1: ( ( ( rule__RaiseErrorNow__Group_0_0__0 ) ) | ( ( rule__RaiseErrorNow__Group_0_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==75) ) {
                alt24=1;
            }
            else if ( (LA24_0==76) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:1326:2: ( ( rule__RaiseErrorNow__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1326:2: ( ( rule__RaiseErrorNow__Group_0_0__0 ) )
                    // InternalUseCase.g:1327:3: ( rule__RaiseErrorNow__Group_0_0__0 )
                    {
                     before(grammarAccess.getRaiseErrorNowAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1328:3: ( rule__RaiseErrorNow__Group_0_0__0 )
                    // InternalUseCase.g:1328:4: rule__RaiseErrorNow__Group_0_0__0
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
                    // InternalUseCase.g:1332:2: ( ( rule__RaiseErrorNow__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1332:2: ( ( rule__RaiseErrorNow__Group_0_1__0 ) )
                    // InternalUseCase.g:1333:3: ( rule__RaiseErrorNow__Group_0_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorNowAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1334:3: ( rule__RaiseErrorNow__Group_0_1__0 )
                    // InternalUseCase.g:1334:4: rule__RaiseErrorNow__Group_0_1__0
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
    // InternalUseCase.g:1342:1: rule__IfStatement__Alternatives_0 : ( ( 'If' ) | ( 'Falls' ) );
    public final void rule__IfStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1346:1: ( ( 'If' ) | ( 'Falls' ) )
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
                    // InternalUseCase.g:1347:2: ( 'If' )
                    {
                    // InternalUseCase.g:1347:2: ( 'If' )
                    // InternalUseCase.g:1348:3: 'If'
                    {
                     before(grammarAccess.getIfStatementAccess().getIfKeyword_0_0()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getIfStatementAccess().getIfKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1353:2: ( 'Falls' )
                    {
                    // InternalUseCase.g:1353:2: ( 'Falls' )
                    // InternalUseCase.g:1354:3: 'Falls'
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
    // InternalUseCase.g:1363:1: rule__Loop__Alternatives_0 : ( ( 'Solange' ) | ( 'While' ) );
    public final void rule__Loop__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1367:1: ( ( 'Solange' ) | ( 'While' ) )
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
                    // InternalUseCase.g:1368:2: ( 'Solange' )
                    {
                    // InternalUseCase.g:1368:2: ( 'Solange' )
                    // InternalUseCase.g:1369:3: 'Solange'
                    {
                     before(grammarAccess.getLoopAccess().getSolangeKeyword_0_0()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getLoopAccess().getSolangeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1374:2: ( 'While' )
                    {
                    // InternalUseCase.g:1374:2: ( 'While' )
                    // InternalUseCase.g:1375:3: 'While'
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
    // InternalUseCase.g:1384:1: rule__Notes__Alternatives_0 : ( ( ( rule__Notes__Alternatives_0_0 ) ) | ( ( rule__Notes__Alternatives_0_1 ) ) );
    public final void rule__Notes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1388:1: ( ( ( rule__Notes__Alternatives_0_0 ) ) | ( ( rule__Notes__Alternatives_0_1 ) ) )
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
                    // InternalUseCase.g:1389:2: ( ( rule__Notes__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1389:2: ( ( rule__Notes__Alternatives_0_0 ) )
                    // InternalUseCase.g:1390:3: ( rule__Notes__Alternatives_0_0 )
                    {
                     before(grammarAccess.getNotesAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1391:3: ( rule__Notes__Alternatives_0_0 )
                    // InternalUseCase.g:1391:4: rule__Notes__Alternatives_0_0
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
                    // InternalUseCase.g:1395:2: ( ( rule__Notes__Alternatives_0_1 ) )
                    {
                    // InternalUseCase.g:1395:2: ( ( rule__Notes__Alternatives_0_1 ) )
                    // InternalUseCase.g:1396:3: ( rule__Notes__Alternatives_0_1 )
                    {
                     before(grammarAccess.getNotesAccess().getAlternatives_0_1()); 
                    // InternalUseCase.g:1397:3: ( rule__Notes__Alternatives_0_1 )
                    // InternalUseCase.g:1397:4: rule__Notes__Alternatives_0_1
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
    // InternalUseCase.g:1405:1: rule__Notes__Alternatives_0_0 : ( ( 'notes:' ) | ( 'note:' ) );
    public final void rule__Notes__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1409:1: ( ( 'notes:' ) | ( 'note:' ) )
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
                    // InternalUseCase.g:1410:2: ( 'notes:' )
                    {
                    // InternalUseCase.g:1410:2: ( 'notes:' )
                    // InternalUseCase.g:1411:3: 'notes:'
                    {
                     before(grammarAccess.getNotesAccess().getNotesKeyword_0_0_0()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getNotesKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1416:2: ( 'note:' )
                    {
                    // InternalUseCase.g:1416:2: ( 'note:' )
                    // InternalUseCase.g:1417:3: 'note:'
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
    // InternalUseCase.g:1426:1: rule__Notes__Alternatives_0_1 : ( ( 'Anmerkungen:' ) | ( 'Anmerkung:' ) );
    public final void rule__Notes__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1430:1: ( ( 'Anmerkungen:' ) | ( 'Anmerkung:' ) )
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
                    // InternalUseCase.g:1431:2: ( 'Anmerkungen:' )
                    {
                    // InternalUseCase.g:1431:2: ( 'Anmerkungen:' )
                    // InternalUseCase.g:1432:3: 'Anmerkungen:'
                    {
                     before(grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0()); 
                    match(input,46,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1437:2: ( 'Anmerkung:' )
                    {
                    // InternalUseCase.g:1437:2: ( 'Anmerkung:' )
                    // InternalUseCase.g:1438:3: 'Anmerkung:'
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
    // InternalUseCase.g:1447:1: rule__UsedTypes__Alternatives_0 : ( ( ( rule__UsedTypes__Group_0_0__0 ) ) | ( ( rule__UsedTypes__Group_0_1__0 ) ) );
    public final void rule__UsedTypes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1451:1: ( ( ( rule__UsedTypes__Group_0_0__0 ) ) | ( ( rule__UsedTypes__Group_0_1__0 ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==77) ) {
                alt30=1;
            }
            else if ( (LA30_0==79) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalUseCase.g:1452:2: ( ( rule__UsedTypes__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1452:2: ( ( rule__UsedTypes__Group_0_0__0 ) )
                    // InternalUseCase.g:1453:3: ( rule__UsedTypes__Group_0_0__0 )
                    {
                     before(grammarAccess.getUsedTypesAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1454:3: ( rule__UsedTypes__Group_0_0__0 )
                    // InternalUseCase.g:1454:4: rule__UsedTypes__Group_0_0__0
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
                    // InternalUseCase.g:1458:2: ( ( rule__UsedTypes__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1458:2: ( ( rule__UsedTypes__Group_0_1__0 ) )
                    // InternalUseCase.g:1459:3: ( rule__UsedTypes__Group_0_1__0 )
                    {
                     before(grammarAccess.getUsedTypesAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1460:3: ( rule__UsedTypes__Group_0_1__0 )
                    // InternalUseCase.g:1460:4: rule__UsedTypes__Group_0_1__0
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
    // InternalUseCase.g:1468:1: rule__UsedExceptions__Alternatives_0 : ( ( ( rule__UsedExceptions__Group_0_0__0 ) ) | ( ( rule__UsedExceptions__Group_0_1__0 ) ) );
    public final void rule__UsedExceptions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1472:1: ( ( ( rule__UsedExceptions__Group_0_0__0 ) ) | ( ( rule__UsedExceptions__Group_0_1__0 ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==77) ) {
                alt31=1;
            }
            else if ( (LA31_0==79) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalUseCase.g:1473:2: ( ( rule__UsedExceptions__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1473:2: ( ( rule__UsedExceptions__Group_0_0__0 ) )
                    // InternalUseCase.g:1474:3: ( rule__UsedExceptions__Group_0_0__0 )
                    {
                     before(grammarAccess.getUsedExceptionsAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1475:3: ( rule__UsedExceptions__Group_0_0__0 )
                    // InternalUseCase.g:1475:4: rule__UsedExceptions__Group_0_0__0
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
                    // InternalUseCase.g:1479:2: ( ( rule__UsedExceptions__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1479:2: ( ( rule__UsedExceptions__Group_0_1__0 ) )
                    // InternalUseCase.g:1480:3: ( rule__UsedExceptions__Group_0_1__0 )
                    {
                     before(grammarAccess.getUsedExceptionsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1481:3: ( rule__UsedExceptions__Group_0_1__0 )
                    // InternalUseCase.g:1481:4: rule__UsedExceptions__Group_0_1__0
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalUseCase.g:1489:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1493:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUseCase.g:1494:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalUseCase.g:1501:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1505:1: ( ( ( rule__Model__Alternatives_0 ) ) )
            // InternalUseCase.g:1506:1: ( ( rule__Model__Alternatives_0 ) )
            {
            // InternalUseCase.g:1506:1: ( ( rule__Model__Alternatives_0 ) )
            // InternalUseCase.g:1507:2: ( rule__Model__Alternatives_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_0()); 
            // InternalUseCase.g:1508:2: ( rule__Model__Alternatives_0 )
            // InternalUseCase.g:1508:3: rule__Model__Alternatives_0
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
    // InternalUseCase.g:1516:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1520:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUseCase.g:1521:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalUseCase.g:1528:1: rule__Model__Group__1__Impl : ( ( rule__Model__CompanyAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1532:1: ( ( ( rule__Model__CompanyAssignment_1 ) ) )
            // InternalUseCase.g:1533:1: ( ( rule__Model__CompanyAssignment_1 ) )
            {
            // InternalUseCase.g:1533:1: ( ( rule__Model__CompanyAssignment_1 ) )
            // InternalUseCase.g:1534:2: ( rule__Model__CompanyAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getCompanyAssignment_1()); 
            // InternalUseCase.g:1535:2: ( rule__Model__CompanyAssignment_1 )
            // InternalUseCase.g:1535:3: rule__Model__CompanyAssignment_1
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
    // InternalUseCase.g:1543:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1547:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalUseCase.g:1548:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalUseCase.g:1555:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackageAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1559:1: ( ( ( rule__Model__PackageAssignment_2 ) ) )
            // InternalUseCase.g:1560:1: ( ( rule__Model__PackageAssignment_2 ) )
            {
            // InternalUseCase.g:1560:1: ( ( rule__Model__PackageAssignment_2 ) )
            // InternalUseCase.g:1561:2: ( rule__Model__PackageAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getPackageAssignment_2()); 
            // InternalUseCase.g:1562:2: ( rule__Model__PackageAssignment_2 )
            // InternalUseCase.g:1562:3: rule__Model__PackageAssignment_2
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
    // InternalUseCase.g:1570:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1574:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalUseCase.g:1575:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalUseCase.g:1582:1: rule__Model__Group__3__Impl : ( ( rule__Model__UseCasesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1586:1: ( ( ( rule__Model__UseCasesAssignment_3 )* ) )
            // InternalUseCase.g:1587:1: ( ( rule__Model__UseCasesAssignment_3 )* )
            {
            // InternalUseCase.g:1587:1: ( ( rule__Model__UseCasesAssignment_3 )* )
            // InternalUseCase.g:1588:2: ( rule__Model__UseCasesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getUseCasesAssignment_3()); 
            // InternalUseCase.g:1589:2: ( rule__Model__UseCasesAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=16 && LA32_0<=17)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUseCase.g:1589:3: rule__Model__UseCasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__UseCasesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalUseCase.g:1597:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1601:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalUseCase.g:1602:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:1609:1: rule__Model__Group__4__Impl : ( ( rule__Model__TypesAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1613:1: ( ( ( rule__Model__TypesAssignment_4 ) ) )
            // InternalUseCase.g:1614:1: ( ( rule__Model__TypesAssignment_4 ) )
            {
            // InternalUseCase.g:1614:1: ( ( rule__Model__TypesAssignment_4 ) )
            // InternalUseCase.g:1615:2: ( rule__Model__TypesAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_4()); 
            // InternalUseCase.g:1616:2: ( rule__Model__TypesAssignment_4 )
            // InternalUseCase.g:1616:3: rule__Model__TypesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Model__TypesAssignment_4();

            state._fsp--;


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
    // InternalUseCase.g:1624:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1628:1: ( rule__Model__Group__5__Impl )
            // InternalUseCase.g:1629:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

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
    // InternalUseCase.g:1635:1: rule__Model__Group__5__Impl : ( ( rule__Model__ExceptionsAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1639:1: ( ( ( rule__Model__ExceptionsAssignment_5 ) ) )
            // InternalUseCase.g:1640:1: ( ( rule__Model__ExceptionsAssignment_5 ) )
            {
            // InternalUseCase.g:1640:1: ( ( rule__Model__ExceptionsAssignment_5 ) )
            // InternalUseCase.g:1641:2: ( rule__Model__ExceptionsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getExceptionsAssignment_5()); 
            // InternalUseCase.g:1642:2: ( rule__Model__ExceptionsAssignment_5 )
            // InternalUseCase.g:1642:3: rule__Model__ExceptionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Model__ExceptionsAssignment_5();

            state._fsp--;


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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalUseCase.g:1651:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1655:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUseCase.g:1656:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalUseCase.g:1663:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1667:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1668:1: ( RULE_ID )
            {
            // InternalUseCase.g:1668:1: ( RULE_ID )
            // InternalUseCase.g:1669:2: RULE_ID
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
    // InternalUseCase.g:1678:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1682:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUseCase.g:1683:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUseCase.g:1689:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1693:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUseCase.g:1694:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUseCase.g:1694:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUseCase.g:1695:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUseCase.g:1696:2: ( rule__QualifiedName__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==38) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalUseCase.g:1696:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalUseCase.g:1705:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1709:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUseCase.g:1710:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalUseCase.g:1717:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1721:1: ( ( '.' ) )
            // InternalUseCase.g:1722:1: ( '.' )
            {
            // InternalUseCase.g:1722:1: ( '.' )
            // InternalUseCase.g:1723:2: '.'
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
    // InternalUseCase.g:1732:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1736:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUseCase.g:1737:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUseCase.g:1743:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1747:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1748:1: ( RULE_ID )
            {
            // InternalUseCase.g:1748:1: ( RULE_ID )
            // InternalUseCase.g:1749:2: RULE_ID
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
    // InternalUseCase.g:1759:1: rule__QualifiedNumber__Group__0 : rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 ;
    public final void rule__QualifiedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1763:1: ( rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 )
            // InternalUseCase.g:1764:2: rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1
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
    // InternalUseCase.g:1771:1: rule__QualifiedNumber__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1775:1: ( ( RULE_INT ) )
            // InternalUseCase.g:1776:1: ( RULE_INT )
            {
            // InternalUseCase.g:1776:1: ( RULE_INT )
            // InternalUseCase.g:1777:2: RULE_INT
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
    // InternalUseCase.g:1786:1: rule__QualifiedNumber__Group__1 : rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 ;
    public final void rule__QualifiedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1790:1: ( rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 )
            // InternalUseCase.g:1791:2: rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2
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
    // InternalUseCase.g:1798:1: rule__QualifiedNumber__Group__1__Impl : ( ( rule__QualifiedNumber__Group_1__0 )* ) ;
    public final void rule__QualifiedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1802:1: ( ( ( rule__QualifiedNumber__Group_1__0 )* ) )
            // InternalUseCase.g:1803:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            {
            // InternalUseCase.g:1803:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            // InternalUseCase.g:1804:2: ( rule__QualifiedNumber__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup_1()); 
            // InternalUseCase.g:1805:2: ( rule__QualifiedNumber__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==38) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_INT) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalUseCase.g:1805:3: rule__QualifiedNumber__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedNumber__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalUseCase.g:1813:1: rule__QualifiedNumber__Group__2 : rule__QualifiedNumber__Group__2__Impl ;
    public final void rule__QualifiedNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1817:1: ( rule__QualifiedNumber__Group__2__Impl )
            // InternalUseCase.g:1818:2: rule__QualifiedNumber__Group__2__Impl
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
    // InternalUseCase.g:1824:1: rule__QualifiedNumber__Group__2__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1828:1: ( ( '.' ) )
            // InternalUseCase.g:1829:1: ( '.' )
            {
            // InternalUseCase.g:1829:1: ( '.' )
            // InternalUseCase.g:1830:2: '.'
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
    // InternalUseCase.g:1840:1: rule__QualifiedNumber__Group_1__0 : rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 ;
    public final void rule__QualifiedNumber__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1844:1: ( rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 )
            // InternalUseCase.g:1845:2: rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1
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
    // InternalUseCase.g:1852:1: rule__QualifiedNumber__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1856:1: ( ( '.' ) )
            // InternalUseCase.g:1857:1: ( '.' )
            {
            // InternalUseCase.g:1857:1: ( '.' )
            // InternalUseCase.g:1858:2: '.'
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
    // InternalUseCase.g:1867:1: rule__QualifiedNumber__Group_1__1 : rule__QualifiedNumber__Group_1__1__Impl ;
    public final void rule__QualifiedNumber__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1871:1: ( rule__QualifiedNumber__Group_1__1__Impl )
            // InternalUseCase.g:1872:2: rule__QualifiedNumber__Group_1__1__Impl
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
    // InternalUseCase.g:1878:1: rule__QualifiedNumber__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1882:1: ( ( RULE_INT ) )
            // InternalUseCase.g:1883:1: ( RULE_INT )
            {
            // InternalUseCase.g:1883:1: ( RULE_INT )
            // InternalUseCase.g:1884:2: RULE_INT
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
    // InternalUseCase.g:1894:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1898:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalUseCase.g:1899:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalUseCase.g:1906:1: rule__Package__Group__0__Impl : ( ( rule__Package__Alternatives_0 ) ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1910:1: ( ( ( rule__Package__Alternatives_0 ) ) )
            // InternalUseCase.g:1911:1: ( ( rule__Package__Alternatives_0 ) )
            {
            // InternalUseCase.g:1911:1: ( ( rule__Package__Alternatives_0 ) )
            // InternalUseCase.g:1912:2: ( rule__Package__Alternatives_0 )
            {
             before(grammarAccess.getPackageAccess().getAlternatives_0()); 
            // InternalUseCase.g:1913:2: ( rule__Package__Alternatives_0 )
            // InternalUseCase.g:1913:3: rule__Package__Alternatives_0
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
    // InternalUseCase.g:1921:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1925:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalUseCase.g:1926:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalUseCase.g:1933:1: rule__Package__Group__1__Impl : ( ( rule__Package__PartsAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1937:1: ( ( ( rule__Package__PartsAssignment_1 ) ) )
            // InternalUseCase.g:1938:1: ( ( rule__Package__PartsAssignment_1 ) )
            {
            // InternalUseCase.g:1938:1: ( ( rule__Package__PartsAssignment_1 ) )
            // InternalUseCase.g:1939:2: ( rule__Package__PartsAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getPartsAssignment_1()); 
            // InternalUseCase.g:1940:2: ( rule__Package__PartsAssignment_1 )
            // InternalUseCase.g:1940:3: rule__Package__PartsAssignment_1
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
    // InternalUseCase.g:1948:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1952:1: ( rule__Package__Group__2__Impl )
            // InternalUseCase.g:1953:2: rule__Package__Group__2__Impl
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
    // InternalUseCase.g:1959:1: rule__Package__Group__2__Impl : ( ( rule__Package__Group_2__0 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1963:1: ( ( ( rule__Package__Group_2__0 )* ) )
            // InternalUseCase.g:1964:1: ( ( rule__Package__Group_2__0 )* )
            {
            // InternalUseCase.g:1964:1: ( ( rule__Package__Group_2__0 )* )
            // InternalUseCase.g:1965:2: ( rule__Package__Group_2__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_2()); 
            // InternalUseCase.g:1966:2: ( rule__Package__Group_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==48) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalUseCase.g:1966:3: rule__Package__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Package__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalUseCase.g:1975:1: rule__Package__Group_2__0 : rule__Package__Group_2__0__Impl rule__Package__Group_2__1 ;
    public final void rule__Package__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1979:1: ( rule__Package__Group_2__0__Impl rule__Package__Group_2__1 )
            // InternalUseCase.g:1980:2: rule__Package__Group_2__0__Impl rule__Package__Group_2__1
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
    // InternalUseCase.g:1987:1: rule__Package__Group_2__0__Impl : ( '>' ) ;
    public final void rule__Package__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1991:1: ( ( '>' ) )
            // InternalUseCase.g:1992:1: ( '>' )
            {
            // InternalUseCase.g:1992:1: ( '>' )
            // InternalUseCase.g:1993:2: '>'
            {
             before(grammarAccess.getPackageAccess().getGreaterThanSignKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalUseCase.g:2002:1: rule__Package__Group_2__1 : rule__Package__Group_2__1__Impl ;
    public final void rule__Package__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2006:1: ( rule__Package__Group_2__1__Impl )
            // InternalUseCase.g:2007:2: rule__Package__Group_2__1__Impl
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
    // InternalUseCase.g:2013:1: rule__Package__Group_2__1__Impl : ( ( rule__Package__PartsAssignment_2_1 ) ) ;
    public final void rule__Package__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2017:1: ( ( ( rule__Package__PartsAssignment_2_1 ) ) )
            // InternalUseCase.g:2018:1: ( ( rule__Package__PartsAssignment_2_1 ) )
            {
            // InternalUseCase.g:2018:1: ( ( rule__Package__PartsAssignment_2_1 ) )
            // InternalUseCase.g:2019:2: ( rule__Package__PartsAssignment_2_1 )
            {
             before(grammarAccess.getPackageAccess().getPartsAssignment_2_1()); 
            // InternalUseCase.g:2020:2: ( rule__Package__PartsAssignment_2_1 )
            // InternalUseCase.g:2020:3: rule__Package__PartsAssignment_2_1
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
    // InternalUseCase.g:2029:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2033:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCase.g:2034:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUseCase.g:2041:1: rule__UseCase__Group__0__Impl : ( ( rule__UseCase__Alternatives_0 ) ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2045:1: ( ( ( rule__UseCase__Alternatives_0 ) ) )
            // InternalUseCase.g:2046:1: ( ( rule__UseCase__Alternatives_0 ) )
            {
            // InternalUseCase.g:2046:1: ( ( rule__UseCase__Alternatives_0 ) )
            // InternalUseCase.g:2047:2: ( rule__UseCase__Alternatives_0 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_0()); 
            // InternalUseCase.g:2048:2: ( rule__UseCase__Alternatives_0 )
            // InternalUseCase.g:2048:3: rule__UseCase__Alternatives_0
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
    // InternalUseCase.g:2056:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2060:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCase.g:2061:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
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
    // InternalUseCase.g:2068:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2072:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUseCase.g:2073:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUseCase.g:2073:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUseCase.g:2074:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUseCase.g:2075:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUseCase.g:2075:3: rule__UseCase__NameAssignment_1
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
    // InternalUseCase.g:2083:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2087:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCase.g:2088:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
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
    // InternalUseCase.g:2095:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionsAssignment_2 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2099:1: ( ( ( rule__UseCase__DescriptionsAssignment_2 )? ) )
            // InternalUseCase.g:2100:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            {
            // InternalUseCase.g:2100:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            // InternalUseCase.g:2101:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); 
            // InternalUseCase.g:2102:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=18 && LA36_0<=20)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUseCase.g:2102:3: rule__UseCase__DescriptionsAssignment_2
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
    // InternalUseCase.g:2110:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2114:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCase.g:2115:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
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
    // InternalUseCase.g:2122:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2126:1: ( ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) )
            // InternalUseCase.g:2127:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            {
            // InternalUseCase.g:2127:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            // InternalUseCase.g:2128:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            {
             before(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAssignment_3()); 
            // InternalUseCase.g:2129:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21||LA37_0==54) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUseCase.g:2129:3: rule__UseCase__AllowedUserGroupsAssignment_3
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
    // InternalUseCase.g:2137:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2141:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCase.g:2142:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
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
    // InternalUseCase.g:2149:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__InputsAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2153:1: ( ( ( rule__UseCase__InputsAssignment_4 )? ) )
            // InternalUseCase.g:2154:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            {
            // InternalUseCase.g:2154:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            // InternalUseCase.g:2155:2: ( rule__UseCase__InputsAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getInputsAssignment_4()); 
            // InternalUseCase.g:2156:2: ( rule__UseCase__InputsAssignment_4 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=22 && LA38_0<=23)||LA38_0==57||LA38_0==61) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUseCase.g:2156:3: rule__UseCase__InputsAssignment_4
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
    // InternalUseCase.g:2164:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2168:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCase.g:2169:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
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
    // InternalUseCase.g:2176:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__OptionalInputsAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2180:1: ( ( ( rule__UseCase__OptionalInputsAssignment_5 )? ) )
            // InternalUseCase.g:2181:1: ( ( rule__UseCase__OptionalInputsAssignment_5 )? )
            {
            // InternalUseCase.g:2181:1: ( ( rule__UseCase__OptionalInputsAssignment_5 )? )
            // InternalUseCase.g:2182:2: ( rule__UseCase__OptionalInputsAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getOptionalInputsAssignment_5()); 
            // InternalUseCase.g:2183:2: ( rule__UseCase__OptionalInputsAssignment_5 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==11||(LA39_0>=24 && LA39_0<=25)||LA39_0==64) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUseCase.g:2183:3: rule__UseCase__OptionalInputsAssignment_5
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
    // InternalUseCase.g:2191:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2195:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCase.g:2196:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
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
    // InternalUseCase.g:2203:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__OutputsAssignment_6 )? ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2207:1: ( ( ( rule__UseCase__OutputsAssignment_6 )? ) )
            // InternalUseCase.g:2208:1: ( ( rule__UseCase__OutputsAssignment_6 )? )
            {
            // InternalUseCase.g:2208:1: ( ( rule__UseCase__OutputsAssignment_6 )? )
            // InternalUseCase.g:2209:2: ( rule__UseCase__OutputsAssignment_6 )?
            {
             before(grammarAccess.getUseCaseAccess().getOutputsAssignment_6()); 
            // InternalUseCase.g:2210:2: ( rule__UseCase__OutputsAssignment_6 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=30 && LA40_0<=32)||LA40_0==67) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUseCase.g:2210:3: rule__UseCase__OutputsAssignment_6
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
    // InternalUseCase.g:2218:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2222:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCase.g:2223:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
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
    // InternalUseCase.g:2230:1: rule__UseCase__Group__7__Impl : ( ( rule__UseCase__PreconditionsAssignment_7 )? ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2234:1: ( ( ( rule__UseCase__PreconditionsAssignment_7 )? ) )
            // InternalUseCase.g:2235:1: ( ( rule__UseCase__PreconditionsAssignment_7 )? )
            {
            // InternalUseCase.g:2235:1: ( ( rule__UseCase__PreconditionsAssignment_7 )? )
            // InternalUseCase.g:2236:2: ( rule__UseCase__PreconditionsAssignment_7 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_7()); 
            // InternalUseCase.g:2237:2: ( rule__UseCase__PreconditionsAssignment_7 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=33 && LA41_0<=35)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUseCase.g:2237:3: rule__UseCase__PreconditionsAssignment_7
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
    // InternalUseCase.g:2245:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2249:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCase.g:2250:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
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
    // InternalUseCase.g:2257:1: rule__UseCase__Group__8__Impl : ( ( rule__UseCase__StepsAssignment_8 )? ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2261:1: ( ( ( rule__UseCase__StepsAssignment_8 )? ) )
            // InternalUseCase.g:2262:1: ( ( rule__UseCase__StepsAssignment_8 )? )
            {
            // InternalUseCase.g:2262:1: ( ( rule__UseCase__StepsAssignment_8 )? )
            // InternalUseCase.g:2263:2: ( rule__UseCase__StepsAssignment_8 )?
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_8()); 
            // InternalUseCase.g:2264:2: ( rule__UseCase__StepsAssignment_8 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=36 && LA42_0<=37)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUseCase.g:2264:3: rule__UseCase__StepsAssignment_8
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
    // InternalUseCase.g:2272:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2276:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // InternalUseCase.g:2277:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
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
    // InternalUseCase.g:2284:1: rule__UseCase__Group__9__Impl : ( ( rule__UseCase__NotesAssignment_9 )? ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2288:1: ( ( ( rule__UseCase__NotesAssignment_9 )? ) )
            // InternalUseCase.g:2289:1: ( ( rule__UseCase__NotesAssignment_9 )? )
            {
            // InternalUseCase.g:2289:1: ( ( rule__UseCase__NotesAssignment_9 )? )
            // InternalUseCase.g:2290:2: ( rule__UseCase__NotesAssignment_9 )?
            {
             before(grammarAccess.getUseCaseAccess().getNotesAssignment_9()); 
            // InternalUseCase.g:2291:2: ( rule__UseCase__NotesAssignment_9 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=44 && LA43_0<=47)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUseCase.g:2291:3: rule__UseCase__NotesAssignment_9
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
    // InternalUseCase.g:2299:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2303:1: ( rule__UseCase__Group__10__Impl )
            // InternalUseCase.g:2304:2: rule__UseCase__Group__10__Impl
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
    // InternalUseCase.g:2310:1: rule__UseCase__Group__10__Impl : ( ( rule__UseCase__Alternatives_10 ) ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2314:1: ( ( ( rule__UseCase__Alternatives_10 ) ) )
            // InternalUseCase.g:2315:1: ( ( rule__UseCase__Alternatives_10 ) )
            {
            // InternalUseCase.g:2315:1: ( ( rule__UseCase__Alternatives_10 ) )
            // InternalUseCase.g:2316:2: ( rule__UseCase__Alternatives_10 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_10()); 
            // InternalUseCase.g:2317:2: ( rule__UseCase__Alternatives_10 )
            // InternalUseCase.g:2317:3: rule__UseCase__Alternatives_10
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
    // InternalUseCase.g:2326:1: rule__UseCase__Group_10_0__0 : rule__UseCase__Group_10_0__0__Impl rule__UseCase__Group_10_0__1 ;
    public final void rule__UseCase__Group_10_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2330:1: ( rule__UseCase__Group_10_0__0__Impl rule__UseCase__Group_10_0__1 )
            // InternalUseCase.g:2331:2: rule__UseCase__Group_10_0__0__Impl rule__UseCase__Group_10_0__1
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
    // InternalUseCase.g:2338:1: rule__UseCase__Group_10_0__0__Impl : ( 'end' ) ;
    public final void rule__UseCase__Group_10_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2342:1: ( ( 'end' ) )
            // InternalUseCase.g:2343:1: ( 'end' )
            {
            // InternalUseCase.g:2343:1: ( 'end' )
            // InternalUseCase.g:2344:2: 'end'
            {
             before(grammarAccess.getUseCaseAccess().getEndKeyword_10_0_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUseCase.g:2353:1: rule__UseCase__Group_10_0__1 : rule__UseCase__Group_10_0__1__Impl rule__UseCase__Group_10_0__2 ;
    public final void rule__UseCase__Group_10_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2357:1: ( rule__UseCase__Group_10_0__1__Impl rule__UseCase__Group_10_0__2 )
            // InternalUseCase.g:2358:2: rule__UseCase__Group_10_0__1__Impl rule__UseCase__Group_10_0__2
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
    // InternalUseCase.g:2365:1: rule__UseCase__Group_10_0__1__Impl : ( 'of' ) ;
    public final void rule__UseCase__Group_10_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2369:1: ( ( 'of' ) )
            // InternalUseCase.g:2370:1: ( 'of' )
            {
            // InternalUseCase.g:2370:1: ( 'of' )
            // InternalUseCase.g:2371:2: 'of'
            {
             before(grammarAccess.getUseCaseAccess().getOfKeyword_10_0_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUseCase.g:2380:1: rule__UseCase__Group_10_0__2 : rule__UseCase__Group_10_0__2__Impl ;
    public final void rule__UseCase__Group_10_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2384:1: ( rule__UseCase__Group_10_0__2__Impl )
            // InternalUseCase.g:2385:2: rule__UseCase__Group_10_0__2__Impl
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
    // InternalUseCase.g:2391:1: rule__UseCase__Group_10_0__2__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group_10_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2395:1: ( ( 'use-case' ) )
            // InternalUseCase.g:2396:1: ( 'use-case' )
            {
            // InternalUseCase.g:2396:1: ( 'use-case' )
            // InternalUseCase.g:2397:2: 'use-case'
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
    // InternalUseCase.g:2407:1: rule__UseCase__Group_10_1__0 : rule__UseCase__Group_10_1__0__Impl rule__UseCase__Group_10_1__1 ;
    public final void rule__UseCase__Group_10_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2411:1: ( rule__UseCase__Group_10_1__0__Impl rule__UseCase__Group_10_1__1 )
            // InternalUseCase.g:2412:2: rule__UseCase__Group_10_1__0__Impl rule__UseCase__Group_10_1__1
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
    // InternalUseCase.g:2419:1: rule__UseCase__Group_10_1__0__Impl : ( 'Ende' ) ;
    public final void rule__UseCase__Group_10_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2423:1: ( ( 'Ende' ) )
            // InternalUseCase.g:2424:1: ( 'Ende' )
            {
            // InternalUseCase.g:2424:1: ( 'Ende' )
            // InternalUseCase.g:2425:2: 'Ende'
            {
             before(grammarAccess.getUseCaseAccess().getEndeKeyword_10_1_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUseCase.g:2434:1: rule__UseCase__Group_10_1__1 : rule__UseCase__Group_10_1__1__Impl rule__UseCase__Group_10_1__2 ;
    public final void rule__UseCase__Group_10_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2438:1: ( rule__UseCase__Group_10_1__1__Impl rule__UseCase__Group_10_1__2 )
            // InternalUseCase.g:2439:2: rule__UseCase__Group_10_1__1__Impl rule__UseCase__Group_10_1__2
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
    // InternalUseCase.g:2446:1: rule__UseCase__Group_10_1__1__Impl : ( 'des' ) ;
    public final void rule__UseCase__Group_10_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2450:1: ( ( 'des' ) )
            // InternalUseCase.g:2451:1: ( 'des' )
            {
            // InternalUseCase.g:2451:1: ( 'des' )
            // InternalUseCase.g:2452:2: 'des'
            {
             before(grammarAccess.getUseCaseAccess().getDesKeyword_10_1_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUseCase.g:2461:1: rule__UseCase__Group_10_1__2 : rule__UseCase__Group_10_1__2__Impl ;
    public final void rule__UseCase__Group_10_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2465:1: ( rule__UseCase__Group_10_1__2__Impl )
            // InternalUseCase.g:2466:2: rule__UseCase__Group_10_1__2__Impl
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
    // InternalUseCase.g:2472:1: rule__UseCase__Group_10_1__2__Impl : ( 'Rezpets' ) ;
    public final void rule__UseCase__Group_10_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2476:1: ( ( 'Rezpets' ) )
            // InternalUseCase.g:2477:1: ( 'Rezpets' )
            {
            // InternalUseCase.g:2477:1: ( 'Rezpets' )
            // InternalUseCase.g:2478:2: 'Rezpets'
            {
             before(grammarAccess.getUseCaseAccess().getRezpetsKeyword_10_1_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUseCase.g:2488:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2492:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalUseCase.g:2493:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalUseCase.g:2500:1: rule__Description__Group__0__Impl : ( ( rule__Description__Alternatives_0 ) ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2504:1: ( ( ( rule__Description__Alternatives_0 ) ) )
            // InternalUseCase.g:2505:1: ( ( rule__Description__Alternatives_0 ) )
            {
            // InternalUseCase.g:2505:1: ( ( rule__Description__Alternatives_0 ) )
            // InternalUseCase.g:2506:2: ( rule__Description__Alternatives_0 )
            {
             before(grammarAccess.getDescriptionAccess().getAlternatives_0()); 
            // InternalUseCase.g:2507:2: ( rule__Description__Alternatives_0 )
            // InternalUseCase.g:2507:3: rule__Description__Alternatives_0
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
    // InternalUseCase.g:2515:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2519:1: ( rule__Description__Group__1__Impl )
            // InternalUseCase.g:2520:2: rule__Description__Group__1__Impl
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
    // InternalUseCase.g:2526:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2530:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalUseCase.g:2531:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalUseCase.g:2531:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalUseCase.g:2532:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalUseCase.g:2533:2: ( rule__Description__NameAssignment_1 )
            // InternalUseCase.g:2533:3: rule__Description__NameAssignment_1
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
    // InternalUseCase.g:2542:1: rule__AllowedUserGroups__Group__0 : rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 ;
    public final void rule__AllowedUserGroups__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2546:1: ( rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 )
            // InternalUseCase.g:2547:2: rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1
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
    // InternalUseCase.g:2554:1: rule__AllowedUserGroups__Group__0__Impl : ( ( rule__AllowedUserGroups__Alternatives_0 ) ) ;
    public final void rule__AllowedUserGroups__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2558:1: ( ( ( rule__AllowedUserGroups__Alternatives_0 ) ) )
            // InternalUseCase.g:2559:1: ( ( rule__AllowedUserGroups__Alternatives_0 ) )
            {
            // InternalUseCase.g:2559:1: ( ( rule__AllowedUserGroups__Alternatives_0 ) )
            // InternalUseCase.g:2560:2: ( rule__AllowedUserGroups__Alternatives_0 )
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getAlternatives_0()); 
            // InternalUseCase.g:2561:2: ( rule__AllowedUserGroups__Alternatives_0 )
            // InternalUseCase.g:2561:3: rule__AllowedUserGroups__Alternatives_0
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
    // InternalUseCase.g:2569:1: rule__AllowedUserGroups__Group__1 : rule__AllowedUserGroups__Group__1__Impl ;
    public final void rule__AllowedUserGroups__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2573:1: ( rule__AllowedUserGroups__Group__1__Impl )
            // InternalUseCase.g:2574:2: rule__AllowedUserGroups__Group__1__Impl
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
    // InternalUseCase.g:2580:1: rule__AllowedUserGroups__Group__1__Impl : ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) ;
    public final void rule__AllowedUserGroups__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2584:1: ( ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) )
            // InternalUseCase.g:2585:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            {
            // InternalUseCase.g:2585:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            // InternalUseCase.g:2586:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroupsAssignment_1()); 
            // InternalUseCase.g:2587:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==56||LA44_0==85) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalUseCase.g:2587:3: rule__AllowedUserGroups__GroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__AllowedUserGroups__GroupsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalUseCase.g:2596:1: rule__AllowedUserGroups__Group_0_1__0 : rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1 ;
    public final void rule__AllowedUserGroups__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2600:1: ( rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1 )
            // InternalUseCase.g:2601:2: rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1
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
    // InternalUseCase.g:2608:1: rule__AllowedUserGroups__Group_0_1__0__Impl : ( 'Erlaubt' ) ;
    public final void rule__AllowedUserGroups__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2612:1: ( ( 'Erlaubt' ) )
            // InternalUseCase.g:2613:1: ( 'Erlaubt' )
            {
            // InternalUseCase.g:2613:1: ( 'Erlaubt' )
            // InternalUseCase.g:2614:2: 'Erlaubt'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getErlaubtKeyword_0_1_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUseCase.g:2623:1: rule__AllowedUserGroups__Group_0_1__1 : rule__AllowedUserGroups__Group_0_1__1__Impl ;
    public final void rule__AllowedUserGroups__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2627:1: ( rule__AllowedUserGroups__Group_0_1__1__Impl )
            // InternalUseCase.g:2628:2: rule__AllowedUserGroups__Group_0_1__1__Impl
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
    // InternalUseCase.g:2634:1: rule__AllowedUserGroups__Group_0_1__1__Impl : ( 'f\\u00FCr:' ) ;
    public final void rule__AllowedUserGroups__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2638:1: ( ( 'f\\u00FCr:' ) )
            // InternalUseCase.g:2639:1: ( 'f\\u00FCr:' )
            {
            // InternalUseCase.g:2639:1: ( 'f\\u00FCr:' )
            // InternalUseCase.g:2640:2: 'f\\u00FCr:'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getFürKeyword_0_1_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalUseCase.g:2650:1: rule__AllowedUserGroup__Group__0 : rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 ;
    public final void rule__AllowedUserGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2654:1: ( rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 )
            // InternalUseCase.g:2655:2: rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1
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
    // InternalUseCase.g:2662:1: rule__AllowedUserGroup__Group__0__Impl : ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) ;
    public final void rule__AllowedUserGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2666:1: ( ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2667:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2667:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            // InternalUseCase.g:2668:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2669:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==85) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUseCase.g:2669:3: rule__AllowedUserGroup__ManyAssignment_0
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
    // InternalUseCase.g:2677:1: rule__AllowedUserGroup__Group__1 : rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 ;
    public final void rule__AllowedUserGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2681:1: ( rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 )
            // InternalUseCase.g:2682:2: rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2
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
    // InternalUseCase.g:2689:1: rule__AllowedUserGroup__Group__1__Impl : ( '-' ) ;
    public final void rule__AllowedUserGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2693:1: ( ( '-' ) )
            // InternalUseCase.g:2694:1: ( '-' )
            {
            // InternalUseCase.g:2694:1: ( '-' )
            // InternalUseCase.g:2695:2: '-'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUseCase.g:2704:1: rule__AllowedUserGroup__Group__2 : rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 ;
    public final void rule__AllowedUserGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2708:1: ( rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 )
            // InternalUseCase.g:2709:2: rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3
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
    // InternalUseCase.g:2716:1: rule__AllowedUserGroup__Group__2__Impl : ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) ;
    public final void rule__AllowedUserGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2720:1: ( ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) )
            // InternalUseCase.g:2721:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            {
            // InternalUseCase.g:2721:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            // InternalUseCase.g:2722:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getNameAssignment_2()); 
            // InternalUseCase.g:2723:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            // InternalUseCase.g:2723:3: rule__AllowedUserGroup__NameAssignment_2
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
    // InternalUseCase.g:2731:1: rule__AllowedUserGroup__Group__3 : rule__AllowedUserGroup__Group__3__Impl ;
    public final void rule__AllowedUserGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2735:1: ( rule__AllowedUserGroup__Group__3__Impl )
            // InternalUseCase.g:2736:2: rule__AllowedUserGroup__Group__3__Impl
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
    // InternalUseCase.g:2742:1: rule__AllowedUserGroup__Group__3__Impl : ( ( rule__AllowedUserGroup__Group_3__0 )? ) ;
    public final void rule__AllowedUserGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2746:1: ( ( ( rule__AllowedUserGroup__Group_3__0 )? ) )
            // InternalUseCase.g:2747:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            {
            // InternalUseCase.g:2747:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            // InternalUseCase.g:2748:2: ( rule__AllowedUserGroup__Group_3__0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup_3()); 
            // InternalUseCase.g:2749:2: ( rule__AllowedUserGroup__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==26) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUseCase.g:2749:3: rule__AllowedUserGroup__Group_3__0
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
    // InternalUseCase.g:2758:1: rule__AllowedUserGroup__Group_3__0 : rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 ;
    public final void rule__AllowedUserGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2762:1: ( rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 )
            // InternalUseCase.g:2763:2: rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1
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
    // InternalUseCase.g:2770:1: rule__AllowedUserGroup__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__AllowedUserGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2774:1: ( ( 'as' ) )
            // InternalUseCase.g:2775:1: ( 'as' )
            {
            // InternalUseCase.g:2775:1: ( 'as' )
            // InternalUseCase.g:2776:2: 'as'
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
    // InternalUseCase.g:2785:1: rule__AllowedUserGroup__Group_3__1 : rule__AllowedUserGroup__Group_3__1__Impl ;
    public final void rule__AllowedUserGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2789:1: ( rule__AllowedUserGroup__Group_3__1__Impl )
            // InternalUseCase.g:2790:2: rule__AllowedUserGroup__Group_3__1__Impl
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
    // InternalUseCase.g:2796:1: rule__AllowedUserGroup__Group_3__1__Impl : ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) ;
    public final void rule__AllowedUserGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2800:1: ( ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:2801:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:2801:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            // InternalUseCase.g:2802:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:2803:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            // InternalUseCase.g:2803:3: rule__AllowedUserGroup__TypeAssignment_3_1
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
    // InternalUseCase.g:2812:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2816:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalUseCase.g:2817:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
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
    // InternalUseCase.g:2824:1: rule__Inputs__Group__0__Impl : ( ( rule__Inputs__Alternatives_0 ) ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2828:1: ( ( ( rule__Inputs__Alternatives_0 ) ) )
            // InternalUseCase.g:2829:1: ( ( rule__Inputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:2829:1: ( ( rule__Inputs__Alternatives_0 ) )
            // InternalUseCase.g:2830:2: ( rule__Inputs__Alternatives_0 )
            {
             before(grammarAccess.getInputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:2831:2: ( rule__Inputs__Alternatives_0 )
            // InternalUseCase.g:2831:3: rule__Inputs__Alternatives_0
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
    // InternalUseCase.g:2839:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2843:1: ( rule__Inputs__Group__1__Impl )
            // InternalUseCase.g:2844:2: rule__Inputs__Group__1__Impl
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
    // InternalUseCase.g:2850:1: rule__Inputs__Group__1__Impl : ( ( rule__Inputs__InputsAssignment_1 )* ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2854:1: ( ( ( rule__Inputs__InputsAssignment_1 )* ) )
            // InternalUseCase.g:2855:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            {
            // InternalUseCase.g:2855:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            // InternalUseCase.g:2856:2: ( rule__Inputs__InputsAssignment_1 )*
            {
             before(grammarAccess.getInputsAccess().getInputsAssignment_1()); 
            // InternalUseCase.g:2857:2: ( rule__Inputs__InputsAssignment_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==56||LA47_0==85) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalUseCase.g:2857:3: rule__Inputs__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Inputs__InputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalUseCase.g:2866:1: rule__Inputs__Group_0_0_2__0 : rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1 ;
    public final void rule__Inputs__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2870:1: ( rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1 )
            // InternalUseCase.g:2871:2: rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1
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
    // InternalUseCase.g:2878:1: rule__Inputs__Group_0_0_2__0__Impl : ( 'requires' ) ;
    public final void rule__Inputs__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2882:1: ( ( 'requires' ) )
            // InternalUseCase.g:2883:1: ( 'requires' )
            {
            // InternalUseCase.g:2883:1: ( 'requires' )
            // InternalUseCase.g:2884:2: 'requires'
            {
             before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_2_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalUseCase.g:2893:1: rule__Inputs__Group_0_0_2__1 : rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2 ;
    public final void rule__Inputs__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2897:1: ( rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2 )
            // InternalUseCase.g:2898:2: rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2
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
    // InternalUseCase.g:2905:1: rule__Inputs__Group_0_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Inputs__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2909:1: ( ( 'the' ) )
            // InternalUseCase.g:2910:1: ( 'the' )
            {
            // InternalUseCase.g:2910:1: ( 'the' )
            // InternalUseCase.g:2911:2: 'the'
            {
             before(grammarAccess.getInputsAccess().getTheKeyword_0_0_2_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalUseCase.g:2920:1: rule__Inputs__Group_0_0_2__2 : rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3 ;
    public final void rule__Inputs__Group_0_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2924:1: ( rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3 )
            // InternalUseCase.g:2925:2: rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3
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
    // InternalUseCase.g:2932:1: rule__Inputs__Group_0_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Inputs__Group_0_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2936:1: ( ( 'following' ) )
            // InternalUseCase.g:2937:1: ( 'following' )
            {
            // InternalUseCase.g:2937:1: ( 'following' )
            // InternalUseCase.g:2938:2: 'following'
            {
             before(grammarAccess.getInputsAccess().getFollowingKeyword_0_0_2_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalUseCase.g:2947:1: rule__Inputs__Group_0_0_2__3 : rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4 ;
    public final void rule__Inputs__Group_0_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2951:1: ( rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4 )
            // InternalUseCase.g:2952:2: rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4
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
    // InternalUseCase.g:2959:1: rule__Inputs__Group_0_0_2__3__Impl : ( 'input' ) ;
    public final void rule__Inputs__Group_0_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2963:1: ( ( 'input' ) )
            // InternalUseCase.g:2964:1: ( 'input' )
            {
            // InternalUseCase.g:2964:1: ( 'input' )
            // InternalUseCase.g:2965:2: 'input'
            {
             before(grammarAccess.getInputsAccess().getInputKeyword_0_0_2_3()); 
            match(input,60,FOLLOW_2); 
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
    // InternalUseCase.g:2974:1: rule__Inputs__Group_0_0_2__4 : rule__Inputs__Group_0_0_2__4__Impl ;
    public final void rule__Inputs__Group_0_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2978:1: ( rule__Inputs__Group_0_0_2__4__Impl )
            // InternalUseCase.g:2979:2: rule__Inputs__Group_0_0_2__4__Impl
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
    // InternalUseCase.g:2985:1: rule__Inputs__Group_0_0_2__4__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2989:1: ( ( ':' ) )
            // InternalUseCase.g:2990:1: ( ':' )
            {
            // InternalUseCase.g:2990:1: ( ':' )
            // InternalUseCase.g:2991:2: ':'
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
    // InternalUseCase.g:3001:1: rule__Inputs__Group_0_1__0 : rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1 ;
    public final void rule__Inputs__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3005:1: ( rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1 )
            // InternalUseCase.g:3006:2: rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1
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
    // InternalUseCase.g:3013:1: rule__Inputs__Group_0_1__0__Impl : ( 'Ben\\u00F6tigte' ) ;
    public final void rule__Inputs__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3017:1: ( ( 'Ben\\u00F6tigte' ) )
            // InternalUseCase.g:3018:1: ( 'Ben\\u00F6tigte' )
            {
            // InternalUseCase.g:3018:1: ( 'Ben\\u00F6tigte' )
            // InternalUseCase.g:3019:2: 'Ben\\u00F6tigte'
            {
             before(grammarAccess.getInputsAccess().getBenötigteKeyword_0_1_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalUseCase.g:3028:1: rule__Inputs__Group_0_1__1 : rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2 ;
    public final void rule__Inputs__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3032:1: ( rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2 )
            // InternalUseCase.g:3033:2: rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2
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
    // InternalUseCase.g:3040:1: rule__Inputs__Group_0_1__1__Impl : ( 'Zutaten' ) ;
    public final void rule__Inputs__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3044:1: ( ( 'Zutaten' ) )
            // InternalUseCase.g:3045:1: ( 'Zutaten' )
            {
            // InternalUseCase.g:3045:1: ( 'Zutaten' )
            // InternalUseCase.g:3046:2: 'Zutaten'
            {
             before(grammarAccess.getInputsAccess().getZutatenKeyword_0_1_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalUseCase.g:3055:1: rule__Inputs__Group_0_1__2 : rule__Inputs__Group_0_1__2__Impl ;
    public final void rule__Inputs__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3059:1: ( rule__Inputs__Group_0_1__2__Impl )
            // InternalUseCase.g:3060:2: rule__Inputs__Group_0_1__2__Impl
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
    // InternalUseCase.g:3066:1: rule__Inputs__Group_0_1__2__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3070:1: ( ( ':' ) )
            // InternalUseCase.g:3071:1: ( ':' )
            {
            // InternalUseCase.g:3071:1: ( ':' )
            // InternalUseCase.g:3072:2: ':'
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
    // InternalUseCase.g:3082:1: rule__OptionalInputs__Group__0 : rule__OptionalInputs__Group__0__Impl rule__OptionalInputs__Group__1 ;
    public final void rule__OptionalInputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3086:1: ( rule__OptionalInputs__Group__0__Impl rule__OptionalInputs__Group__1 )
            // InternalUseCase.g:3087:2: rule__OptionalInputs__Group__0__Impl rule__OptionalInputs__Group__1
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
    // InternalUseCase.g:3094:1: rule__OptionalInputs__Group__0__Impl : ( ( rule__OptionalInputs__Alternatives_0 ) ) ;
    public final void rule__OptionalInputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3098:1: ( ( ( rule__OptionalInputs__Alternatives_0 ) ) )
            // InternalUseCase.g:3099:1: ( ( rule__OptionalInputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:3099:1: ( ( rule__OptionalInputs__Alternatives_0 ) )
            // InternalUseCase.g:3100:2: ( rule__OptionalInputs__Alternatives_0 )
            {
             before(grammarAccess.getOptionalInputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3101:2: ( rule__OptionalInputs__Alternatives_0 )
            // InternalUseCase.g:3101:3: rule__OptionalInputs__Alternatives_0
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
    // InternalUseCase.g:3109:1: rule__OptionalInputs__Group__1 : rule__OptionalInputs__Group__1__Impl ;
    public final void rule__OptionalInputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3113:1: ( rule__OptionalInputs__Group__1__Impl )
            // InternalUseCase.g:3114:2: rule__OptionalInputs__Group__1__Impl
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
    // InternalUseCase.g:3120:1: rule__OptionalInputs__Group__1__Impl : ( ( rule__OptionalInputs__InputsAssignment_1 )* ) ;
    public final void rule__OptionalInputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3124:1: ( ( ( rule__OptionalInputs__InputsAssignment_1 )* ) )
            // InternalUseCase.g:3125:1: ( ( rule__OptionalInputs__InputsAssignment_1 )* )
            {
            // InternalUseCase.g:3125:1: ( ( rule__OptionalInputs__InputsAssignment_1 )* )
            // InternalUseCase.g:3126:2: ( rule__OptionalInputs__InputsAssignment_1 )*
            {
             before(grammarAccess.getOptionalInputsAccess().getInputsAssignment_1()); 
            // InternalUseCase.g:3127:2: ( rule__OptionalInputs__InputsAssignment_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==56||LA48_0==85) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUseCase.g:3127:3: rule__OptionalInputs__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__OptionalInputs__InputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalUseCase.g:3136:1: rule__OptionalInputs__Group_0_0_1__0 : rule__OptionalInputs__Group_0_0_1__0__Impl rule__OptionalInputs__Group_0_0_1__1 ;
    public final void rule__OptionalInputs__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3140:1: ( rule__OptionalInputs__Group_0_0_1__0__Impl rule__OptionalInputs__Group_0_0_1__1 )
            // InternalUseCase.g:3141:2: rule__OptionalInputs__Group_0_0_1__0__Impl rule__OptionalInputs__Group_0_0_1__1
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
    // InternalUseCase.g:3148:1: rule__OptionalInputs__Group_0_0_1__0__Impl : ( 'optional' ) ;
    public final void rule__OptionalInputs__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3152:1: ( ( 'optional' ) )
            // InternalUseCase.g:3153:1: ( 'optional' )
            {
            // InternalUseCase.g:3153:1: ( 'optional' )
            // InternalUseCase.g:3154:2: 'optional'
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
    // InternalUseCase.g:3163:1: rule__OptionalInputs__Group_0_0_1__1 : rule__OptionalInputs__Group_0_0_1__1__Impl rule__OptionalInputs__Group_0_0_1__2 ;
    public final void rule__OptionalInputs__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3167:1: ( rule__OptionalInputs__Group_0_0_1__1__Impl rule__OptionalInputs__Group_0_0_1__2 )
            // InternalUseCase.g:3168:2: rule__OptionalInputs__Group_0_0_1__1__Impl rule__OptionalInputs__Group_0_0_1__2
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
    // InternalUseCase.g:3175:1: rule__OptionalInputs__Group_0_0_1__1__Impl : ( 'inputs' ) ;
    public final void rule__OptionalInputs__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3179:1: ( ( 'inputs' ) )
            // InternalUseCase.g:3180:1: ( 'inputs' )
            {
            // InternalUseCase.g:3180:1: ( 'inputs' )
            // InternalUseCase.g:3181:2: 'inputs'
            {
             before(grammarAccess.getOptionalInputsAccess().getInputsKeyword_0_0_1_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalUseCase.g:3190:1: rule__OptionalInputs__Group_0_0_1__2 : rule__OptionalInputs__Group_0_0_1__2__Impl ;
    public final void rule__OptionalInputs__Group_0_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3194:1: ( rule__OptionalInputs__Group_0_0_1__2__Impl )
            // InternalUseCase.g:3195:2: rule__OptionalInputs__Group_0_0_1__2__Impl
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
    // InternalUseCase.g:3201:1: rule__OptionalInputs__Group_0_0_1__2__Impl : ( ':' ) ;
    public final void rule__OptionalInputs__Group_0_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3205:1: ( ( ':' ) )
            // InternalUseCase.g:3206:1: ( ':' )
            {
            // InternalUseCase.g:3206:1: ( ':' )
            // InternalUseCase.g:3207:2: ':'
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
    // InternalUseCase.g:3217:1: rule__OptionalInputs__Group_0_1__0 : rule__OptionalInputs__Group_0_1__0__Impl rule__OptionalInputs__Group_0_1__1 ;
    public final void rule__OptionalInputs__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3221:1: ( rule__OptionalInputs__Group_0_1__0__Impl rule__OptionalInputs__Group_0_1__1 )
            // InternalUseCase.g:3222:2: rule__OptionalInputs__Group_0_1__0__Impl rule__OptionalInputs__Group_0_1__1
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
    // InternalUseCase.g:3229:1: rule__OptionalInputs__Group_0_1__0__Impl : ( ( rule__OptionalInputs__Alternatives_0_1_0 ) ) ;
    public final void rule__OptionalInputs__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3233:1: ( ( ( rule__OptionalInputs__Alternatives_0_1_0 ) ) )
            // InternalUseCase.g:3234:1: ( ( rule__OptionalInputs__Alternatives_0_1_0 ) )
            {
            // InternalUseCase.g:3234:1: ( ( rule__OptionalInputs__Alternatives_0_1_0 ) )
            // InternalUseCase.g:3235:2: ( rule__OptionalInputs__Alternatives_0_1_0 )
            {
             before(grammarAccess.getOptionalInputsAccess().getAlternatives_0_1_0()); 
            // InternalUseCase.g:3236:2: ( rule__OptionalInputs__Alternatives_0_1_0 )
            // InternalUseCase.g:3236:3: rule__OptionalInputs__Alternatives_0_1_0
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
    // InternalUseCase.g:3244:1: rule__OptionalInputs__Group_0_1__1 : rule__OptionalInputs__Group_0_1__1__Impl ;
    public final void rule__OptionalInputs__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3248:1: ( rule__OptionalInputs__Group_0_1__1__Impl )
            // InternalUseCase.g:3249:2: rule__OptionalInputs__Group_0_1__1__Impl
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
    // InternalUseCase.g:3255:1: rule__OptionalInputs__Group_0_1__1__Impl : ( ':' ) ;
    public final void rule__OptionalInputs__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3259:1: ( ( ':' ) )
            // InternalUseCase.g:3260:1: ( ':' )
            {
            // InternalUseCase.g:3260:1: ( ':' )
            // InternalUseCase.g:3261:2: ':'
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
    // InternalUseCase.g:3271:1: rule__OptionalInputs__Group_0_1_0_0__0 : rule__OptionalInputs__Group_0_1_0_0__0__Impl rule__OptionalInputs__Group_0_1_0_0__1 ;
    public final void rule__OptionalInputs__Group_0_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3275:1: ( rule__OptionalInputs__Group_0_1_0_0__0__Impl rule__OptionalInputs__Group_0_1_0_0__1 )
            // InternalUseCase.g:3276:2: rule__OptionalInputs__Group_0_1_0_0__0__Impl rule__OptionalInputs__Group_0_1_0_0__1
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
    // InternalUseCase.g:3283:1: rule__OptionalInputs__Group_0_1_0_0__0__Impl : ( 'Optionale' ) ;
    public final void rule__OptionalInputs__Group_0_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3287:1: ( ( 'Optionale' ) )
            // InternalUseCase.g:3288:1: ( 'Optionale' )
            {
            // InternalUseCase.g:3288:1: ( 'Optionale' )
            // InternalUseCase.g:3289:2: 'Optionale'
            {
             before(grammarAccess.getOptionalInputsAccess().getOptionaleKeyword_0_1_0_0_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalUseCase.g:3298:1: rule__OptionalInputs__Group_0_1_0_0__1 : rule__OptionalInputs__Group_0_1_0_0__1__Impl ;
    public final void rule__OptionalInputs__Group_0_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3302:1: ( rule__OptionalInputs__Group_0_1_0_0__1__Impl )
            // InternalUseCase.g:3303:2: rule__OptionalInputs__Group_0_1_0_0__1__Impl
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
    // InternalUseCase.g:3309:1: rule__OptionalInputs__Group_0_1_0_0__1__Impl : ( 'Zutaten' ) ;
    public final void rule__OptionalInputs__Group_0_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3313:1: ( ( 'Zutaten' ) )
            // InternalUseCase.g:3314:1: ( 'Zutaten' )
            {
            // InternalUseCase.g:3314:1: ( 'Zutaten' )
            // InternalUseCase.g:3315:2: 'Zutaten'
            {
             before(grammarAccess.getOptionalInputsAccess().getZutatenKeyword_0_1_0_0_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalUseCase.g:3325:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3329:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalUseCase.g:3330:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalUseCase.g:3337:1: rule__Input__Group__0__Impl : ( ( rule__Input__ManyAssignment_0 )? ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3341:1: ( ( ( rule__Input__ManyAssignment_0 )? ) )
            // InternalUseCase.g:3342:1: ( ( rule__Input__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:3342:1: ( ( rule__Input__ManyAssignment_0 )? )
            // InternalUseCase.g:3343:2: ( rule__Input__ManyAssignment_0 )?
            {
             before(grammarAccess.getInputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:3344:2: ( rule__Input__ManyAssignment_0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==85) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUseCase.g:3344:3: rule__Input__ManyAssignment_0
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
    // InternalUseCase.g:3352:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3356:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalUseCase.g:3357:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalUseCase.g:3364:1: rule__Input__Group__1__Impl : ( '-' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3368:1: ( ( '-' ) )
            // InternalUseCase.g:3369:1: ( '-' )
            {
            // InternalUseCase.g:3369:1: ( '-' )
            // InternalUseCase.g:3370:2: '-'
            {
             before(grammarAccess.getInputAccess().getHyphenMinusKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUseCase.g:3379:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3383:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalUseCase.g:3384:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalUseCase.g:3391:1: rule__Input__Group__2__Impl : ( ( rule__Input__OptionalAssignment_2 )? ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3395:1: ( ( ( rule__Input__OptionalAssignment_2 )? ) )
            // InternalUseCase.g:3396:1: ( ( rule__Input__OptionalAssignment_2 )? )
            {
            // InternalUseCase.g:3396:1: ( ( rule__Input__OptionalAssignment_2 )? )
            // InternalUseCase.g:3397:2: ( rule__Input__OptionalAssignment_2 )?
            {
             before(grammarAccess.getInputAccess().getOptionalAssignment_2()); 
            // InternalUseCase.g:3398:2: ( rule__Input__OptionalAssignment_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==11) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUseCase.g:3398:3: rule__Input__OptionalAssignment_2
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
    // InternalUseCase.g:3406:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3410:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalUseCase.g:3411:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalUseCase.g:3418:1: rule__Input__Group__3__Impl : ( ( rule__Input__ContentAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3422:1: ( ( ( rule__Input__ContentAssignment_3 ) ) )
            // InternalUseCase.g:3423:1: ( ( rule__Input__ContentAssignment_3 ) )
            {
            // InternalUseCase.g:3423:1: ( ( rule__Input__ContentAssignment_3 ) )
            // InternalUseCase.g:3424:2: ( rule__Input__ContentAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getContentAssignment_3()); 
            // InternalUseCase.g:3425:2: ( rule__Input__ContentAssignment_3 )
            // InternalUseCase.g:3425:3: rule__Input__ContentAssignment_3
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
    // InternalUseCase.g:3433:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3437:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // InternalUseCase.g:3438:2: rule__Input__Group__4__Impl rule__Input__Group__5
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
    // InternalUseCase.g:3445:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3449:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalUseCase.g:3450:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalUseCase.g:3450:1: ( ( rule__Input__Group_4__0 )? )
            // InternalUseCase.g:3451:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalUseCase.g:3452:2: ( rule__Input__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=26 && LA51_0<=27)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUseCase.g:3452:3: rule__Input__Group_4__0
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
    // InternalUseCase.g:3460:1: rule__Input__Group__5 : rule__Input__Group__5__Impl ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3464:1: ( rule__Input__Group__5__Impl )
            // InternalUseCase.g:3465:2: rule__Input__Group__5__Impl
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
    // InternalUseCase.g:3471:1: rule__Input__Group__5__Impl : ( ( rule__Input__Group_5__0 )? ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3475:1: ( ( ( rule__Input__Group_5__0 )? ) )
            // InternalUseCase.g:3476:1: ( ( rule__Input__Group_5__0 )? )
            {
            // InternalUseCase.g:3476:1: ( ( rule__Input__Group_5__0 )? )
            // InternalUseCase.g:3477:2: ( rule__Input__Group_5__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_5()); 
            // InternalUseCase.g:3478:2: ( rule__Input__Group_5__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==65) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUseCase.g:3478:3: rule__Input__Group_5__0
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
    // InternalUseCase.g:3487:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3491:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalUseCase.g:3492:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
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
    // InternalUseCase.g:3499:1: rule__Input__Group_4__0__Impl : ( ( rule__Input__Alternatives_4_0 ) ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3503:1: ( ( ( rule__Input__Alternatives_4_0 ) ) )
            // InternalUseCase.g:3504:1: ( ( rule__Input__Alternatives_4_0 ) )
            {
            // InternalUseCase.g:3504:1: ( ( rule__Input__Alternatives_4_0 ) )
            // InternalUseCase.g:3505:2: ( rule__Input__Alternatives_4_0 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_4_0()); 
            // InternalUseCase.g:3506:2: ( rule__Input__Alternatives_4_0 )
            // InternalUseCase.g:3506:3: rule__Input__Alternatives_4_0
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
    // InternalUseCase.g:3514:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3518:1: ( rule__Input__Group_4__1__Impl )
            // InternalUseCase.g:3519:2: rule__Input__Group_4__1__Impl
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
    // InternalUseCase.g:3525:1: rule__Input__Group_4__1__Impl : ( ( rule__Input__TypeAssignment_4_1 ) ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3529:1: ( ( ( rule__Input__TypeAssignment_4_1 ) ) )
            // InternalUseCase.g:3530:1: ( ( rule__Input__TypeAssignment_4_1 ) )
            {
            // InternalUseCase.g:3530:1: ( ( rule__Input__TypeAssignment_4_1 ) )
            // InternalUseCase.g:3531:2: ( rule__Input__TypeAssignment_4_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_4_1()); 
            // InternalUseCase.g:3532:2: ( rule__Input__TypeAssignment_4_1 )
            // InternalUseCase.g:3532:3: rule__Input__TypeAssignment_4_1
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
    // InternalUseCase.g:3541:1: rule__Input__Group_5__0 : rule__Input__Group_5__0__Impl rule__Input__Group_5__1 ;
    public final void rule__Input__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3545:1: ( rule__Input__Group_5__0__Impl rule__Input__Group_5__1 )
            // InternalUseCase.g:3546:2: rule__Input__Group_5__0__Impl rule__Input__Group_5__1
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
    // InternalUseCase.g:3553:1: rule__Input__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Input__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3557:1: ( ( '(' ) )
            // InternalUseCase.g:3558:1: ( '(' )
            {
            // InternalUseCase.g:3558:1: ( '(' )
            // InternalUseCase.g:3559:2: '('
            {
             before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalUseCase.g:3568:1: rule__Input__Group_5__1 : rule__Input__Group_5__1__Impl rule__Input__Group_5__2 ;
    public final void rule__Input__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3572:1: ( rule__Input__Group_5__1__Impl rule__Input__Group_5__2 )
            // InternalUseCase.g:3573:2: rule__Input__Group_5__1__Impl rule__Input__Group_5__2
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
    // InternalUseCase.g:3580:1: rule__Input__Group_5__1__Impl : ( ( rule__Input__Alternatives_5_1 ) ) ;
    public final void rule__Input__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3584:1: ( ( ( rule__Input__Alternatives_5_1 ) ) )
            // InternalUseCase.g:3585:1: ( ( rule__Input__Alternatives_5_1 ) )
            {
            // InternalUseCase.g:3585:1: ( ( rule__Input__Alternatives_5_1 ) )
            // InternalUseCase.g:3586:2: ( rule__Input__Alternatives_5_1 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_5_1()); 
            // InternalUseCase.g:3587:2: ( rule__Input__Alternatives_5_1 )
            // InternalUseCase.g:3587:3: rule__Input__Alternatives_5_1
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
    // InternalUseCase.g:3595:1: rule__Input__Group_5__2 : rule__Input__Group_5__2__Impl rule__Input__Group_5__3 ;
    public final void rule__Input__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3599:1: ( rule__Input__Group_5__2__Impl rule__Input__Group_5__3 )
            // InternalUseCase.g:3600:2: rule__Input__Group_5__2__Impl rule__Input__Group_5__3
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
    // InternalUseCase.g:3607:1: rule__Input__Group_5__2__Impl : ( ( rule__Input__ExampleAssignment_5_2 ) ) ;
    public final void rule__Input__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3611:1: ( ( ( rule__Input__ExampleAssignment_5_2 ) ) )
            // InternalUseCase.g:3612:1: ( ( rule__Input__ExampleAssignment_5_2 ) )
            {
            // InternalUseCase.g:3612:1: ( ( rule__Input__ExampleAssignment_5_2 ) )
            // InternalUseCase.g:3613:2: ( rule__Input__ExampleAssignment_5_2 )
            {
             before(grammarAccess.getInputAccess().getExampleAssignment_5_2()); 
            // InternalUseCase.g:3614:2: ( rule__Input__ExampleAssignment_5_2 )
            // InternalUseCase.g:3614:3: rule__Input__ExampleAssignment_5_2
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
    // InternalUseCase.g:3622:1: rule__Input__Group_5__3 : rule__Input__Group_5__3__Impl ;
    public final void rule__Input__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3626:1: ( rule__Input__Group_5__3__Impl )
            // InternalUseCase.g:3627:2: rule__Input__Group_5__3__Impl
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
    // InternalUseCase.g:3633:1: rule__Input__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Input__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3637:1: ( ( ')' ) )
            // InternalUseCase.g:3638:1: ( ')' )
            {
            // InternalUseCase.g:3638:1: ( ')' )
            // InternalUseCase.g:3639:2: ')'
            {
             before(grammarAccess.getInputAccess().getRightParenthesisKeyword_5_3()); 
            match(input,66,FOLLOW_2); 
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
    // InternalUseCase.g:3649:1: rule__Outputs__Group__0 : rule__Outputs__Group__0__Impl rule__Outputs__Group__1 ;
    public final void rule__Outputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3653:1: ( rule__Outputs__Group__0__Impl rule__Outputs__Group__1 )
            // InternalUseCase.g:3654:2: rule__Outputs__Group__0__Impl rule__Outputs__Group__1
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
    // InternalUseCase.g:3661:1: rule__Outputs__Group__0__Impl : ( ( rule__Outputs__Alternatives_0 ) ) ;
    public final void rule__Outputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3665:1: ( ( ( rule__Outputs__Alternatives_0 ) ) )
            // InternalUseCase.g:3666:1: ( ( rule__Outputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:3666:1: ( ( rule__Outputs__Alternatives_0 ) )
            // InternalUseCase.g:3667:2: ( rule__Outputs__Alternatives_0 )
            {
             before(grammarAccess.getOutputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3668:2: ( rule__Outputs__Alternatives_0 )
            // InternalUseCase.g:3668:3: rule__Outputs__Alternatives_0
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
    // InternalUseCase.g:3676:1: rule__Outputs__Group__1 : rule__Outputs__Group__1__Impl ;
    public final void rule__Outputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3680:1: ( rule__Outputs__Group__1__Impl )
            // InternalUseCase.g:3681:2: rule__Outputs__Group__1__Impl
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
    // InternalUseCase.g:3687:1: rule__Outputs__Group__1__Impl : ( ( rule__Outputs__OutputsAssignment_1 )* ) ;
    public final void rule__Outputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3691:1: ( ( ( rule__Outputs__OutputsAssignment_1 )* ) )
            // InternalUseCase.g:3692:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            {
            // InternalUseCase.g:3692:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            // InternalUseCase.g:3693:2: ( rule__Outputs__OutputsAssignment_1 )*
            {
             before(grammarAccess.getOutputsAccess().getOutputsAssignment_1()); 
            // InternalUseCase.g:3694:2: ( rule__Outputs__OutputsAssignment_1 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==56||LA53_0==85) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalUseCase.g:3694:3: rule__Outputs__OutputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Outputs__OutputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalUseCase.g:3703:1: rule__Outputs__Group_0_0_2__0 : rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1 ;
    public final void rule__Outputs__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3707:1: ( rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1 )
            // InternalUseCase.g:3708:2: rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1
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
    // InternalUseCase.g:3715:1: rule__Outputs__Group_0_0_2__0__Impl : ( 'produces' ) ;
    public final void rule__Outputs__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3719:1: ( ( 'produces' ) )
            // InternalUseCase.g:3720:1: ( 'produces' )
            {
            // InternalUseCase.g:3720:1: ( 'produces' )
            // InternalUseCase.g:3721:2: 'produces'
            {
             before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_2_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalUseCase.g:3730:1: rule__Outputs__Group_0_0_2__1 : rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2 ;
    public final void rule__Outputs__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3734:1: ( rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2 )
            // InternalUseCase.g:3735:2: rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2
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
    // InternalUseCase.g:3742:1: rule__Outputs__Group_0_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Outputs__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3746:1: ( ( 'the' ) )
            // InternalUseCase.g:3747:1: ( 'the' )
            {
            // InternalUseCase.g:3747:1: ( 'the' )
            // InternalUseCase.g:3748:2: 'the'
            {
             before(grammarAccess.getOutputsAccess().getTheKeyword_0_0_2_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalUseCase.g:3757:1: rule__Outputs__Group_0_0_2__2 : rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3 ;
    public final void rule__Outputs__Group_0_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3761:1: ( rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3 )
            // InternalUseCase.g:3762:2: rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3
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
    // InternalUseCase.g:3769:1: rule__Outputs__Group_0_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Outputs__Group_0_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3773:1: ( ( 'following' ) )
            // InternalUseCase.g:3774:1: ( 'following' )
            {
            // InternalUseCase.g:3774:1: ( 'following' )
            // InternalUseCase.g:3775:2: 'following'
            {
             before(grammarAccess.getOutputsAccess().getFollowingKeyword_0_0_2_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalUseCase.g:3784:1: rule__Outputs__Group_0_0_2__3 : rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4 ;
    public final void rule__Outputs__Group_0_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3788:1: ( rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4 )
            // InternalUseCase.g:3789:2: rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4
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
    // InternalUseCase.g:3796:1: rule__Outputs__Group_0_0_2__3__Impl : ( 'output' ) ;
    public final void rule__Outputs__Group_0_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3800:1: ( ( 'output' ) )
            // InternalUseCase.g:3801:1: ( 'output' )
            {
            // InternalUseCase.g:3801:1: ( 'output' )
            // InternalUseCase.g:3802:2: 'output'
            {
             before(grammarAccess.getOutputsAccess().getOutputKeyword_0_0_2_3()); 
            match(input,68,FOLLOW_2); 
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
    // InternalUseCase.g:3811:1: rule__Outputs__Group_0_0_2__4 : rule__Outputs__Group_0_0_2__4__Impl ;
    public final void rule__Outputs__Group_0_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3815:1: ( rule__Outputs__Group_0_0_2__4__Impl )
            // InternalUseCase.g:3816:2: rule__Outputs__Group_0_0_2__4__Impl
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
    // InternalUseCase.g:3822:1: rule__Outputs__Group_0_0_2__4__Impl : ( ':' ) ;
    public final void rule__Outputs__Group_0_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3826:1: ( ( ':' ) )
            // InternalUseCase.g:3827:1: ( ':' )
            {
            // InternalUseCase.g:3827:1: ( ':' )
            // InternalUseCase.g:3828:2: ':'
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
    // InternalUseCase.g:3838:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3842:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalUseCase.g:3843:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalUseCase.g:3850:1: rule__Output__Group__0__Impl : ( ( rule__Output__ManyAssignment_0 )? ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3854:1: ( ( ( rule__Output__ManyAssignment_0 )? ) )
            // InternalUseCase.g:3855:1: ( ( rule__Output__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:3855:1: ( ( rule__Output__ManyAssignment_0 )? )
            // InternalUseCase.g:3856:2: ( rule__Output__ManyAssignment_0 )?
            {
             before(grammarAccess.getOutputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:3857:2: ( rule__Output__ManyAssignment_0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==85) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUseCase.g:3857:3: rule__Output__ManyAssignment_0
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
    // InternalUseCase.g:3865:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3869:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalUseCase.g:3870:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalUseCase.g:3877:1: rule__Output__Group__1__Impl : ( '-' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3881:1: ( ( '-' ) )
            // InternalUseCase.g:3882:1: ( '-' )
            {
            // InternalUseCase.g:3882:1: ( '-' )
            // InternalUseCase.g:3883:2: '-'
            {
             before(grammarAccess.getOutputAccess().getHyphenMinusKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUseCase.g:3892:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3896:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalUseCase.g:3897:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalUseCase.g:3904:1: rule__Output__Group__2__Impl : ( ( rule__Output__ContentAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3908:1: ( ( ( rule__Output__ContentAssignment_2 ) ) )
            // InternalUseCase.g:3909:1: ( ( rule__Output__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:3909:1: ( ( rule__Output__ContentAssignment_2 ) )
            // InternalUseCase.g:3910:2: ( rule__Output__ContentAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:3911:2: ( rule__Output__ContentAssignment_2 )
            // InternalUseCase.g:3911:3: rule__Output__ContentAssignment_2
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
    // InternalUseCase.g:3919:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3923:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalUseCase.g:3924:2: rule__Output__Group__3__Impl rule__Output__Group__4
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
    // InternalUseCase.g:3931:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3935:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalUseCase.g:3936:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalUseCase.g:3936:1: ( ( rule__Output__Group_3__0 )? )
            // InternalUseCase.g:3937:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalUseCase.g:3938:2: ( rule__Output__Group_3__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=26 && LA55_0<=27)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUseCase.g:3938:3: rule__Output__Group_3__0
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
    // InternalUseCase.g:3946:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3950:1: ( rule__Output__Group__4__Impl )
            // InternalUseCase.g:3951:2: rule__Output__Group__4__Impl
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
    // InternalUseCase.g:3957:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3961:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalUseCase.g:3962:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalUseCase.g:3962:1: ( ( rule__Output__Group_4__0 )? )
            // InternalUseCase.g:3963:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalUseCase.g:3964:2: ( rule__Output__Group_4__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==65) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalUseCase.g:3964:3: rule__Output__Group_4__0
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
    // InternalUseCase.g:3973:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3977:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalUseCase.g:3978:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
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
    // InternalUseCase.g:3985:1: rule__Output__Group_3__0__Impl : ( ( rule__Output__Alternatives_3_0 ) ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3989:1: ( ( ( rule__Output__Alternatives_3_0 ) ) )
            // InternalUseCase.g:3990:1: ( ( rule__Output__Alternatives_3_0 ) )
            {
            // InternalUseCase.g:3990:1: ( ( rule__Output__Alternatives_3_0 ) )
            // InternalUseCase.g:3991:2: ( rule__Output__Alternatives_3_0 )
            {
             before(grammarAccess.getOutputAccess().getAlternatives_3_0()); 
            // InternalUseCase.g:3992:2: ( rule__Output__Alternatives_3_0 )
            // InternalUseCase.g:3992:3: rule__Output__Alternatives_3_0
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
    // InternalUseCase.g:4000:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4004:1: ( rule__Output__Group_3__1__Impl )
            // InternalUseCase.g:4005:2: rule__Output__Group_3__1__Impl
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
    // InternalUseCase.g:4011:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4015:1: ( ( ( rule__Output__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:4016:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:4016:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            // InternalUseCase.g:4017:2: ( rule__Output__TypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:4018:2: ( rule__Output__TypeAssignment_3_1 )
            // InternalUseCase.g:4018:3: rule__Output__TypeAssignment_3_1
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
    // InternalUseCase.g:4027:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4031:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalUseCase.g:4032:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
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
    // InternalUseCase.g:4039:1: rule__Output__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4043:1: ( ( '(' ) )
            // InternalUseCase.g:4044:1: ( '(' )
            {
            // InternalUseCase.g:4044:1: ( '(' )
            // InternalUseCase.g:4045:2: '('
            {
             before(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalUseCase.g:4054:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl rule__Output__Group_4__2 ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4058:1: ( rule__Output__Group_4__1__Impl rule__Output__Group_4__2 )
            // InternalUseCase.g:4059:2: rule__Output__Group_4__1__Impl rule__Output__Group_4__2
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
    // InternalUseCase.g:4066:1: rule__Output__Group_4__1__Impl : ( ( rule__Output__Alternatives_4_1 ) ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4070:1: ( ( ( rule__Output__Alternatives_4_1 ) ) )
            // InternalUseCase.g:4071:1: ( ( rule__Output__Alternatives_4_1 ) )
            {
            // InternalUseCase.g:4071:1: ( ( rule__Output__Alternatives_4_1 ) )
            // InternalUseCase.g:4072:2: ( rule__Output__Alternatives_4_1 )
            {
             before(grammarAccess.getOutputAccess().getAlternatives_4_1()); 
            // InternalUseCase.g:4073:2: ( rule__Output__Alternatives_4_1 )
            // InternalUseCase.g:4073:3: rule__Output__Alternatives_4_1
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
    // InternalUseCase.g:4081:1: rule__Output__Group_4__2 : rule__Output__Group_4__2__Impl rule__Output__Group_4__3 ;
    public final void rule__Output__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4085:1: ( rule__Output__Group_4__2__Impl rule__Output__Group_4__3 )
            // InternalUseCase.g:4086:2: rule__Output__Group_4__2__Impl rule__Output__Group_4__3
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
    // InternalUseCase.g:4093:1: rule__Output__Group_4__2__Impl : ( ( rule__Output__ExampleAssignment_4_2 ) ) ;
    public final void rule__Output__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4097:1: ( ( ( rule__Output__ExampleAssignment_4_2 ) ) )
            // InternalUseCase.g:4098:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            {
            // InternalUseCase.g:4098:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            // InternalUseCase.g:4099:2: ( rule__Output__ExampleAssignment_4_2 )
            {
             before(grammarAccess.getOutputAccess().getExampleAssignment_4_2()); 
            // InternalUseCase.g:4100:2: ( rule__Output__ExampleAssignment_4_2 )
            // InternalUseCase.g:4100:3: rule__Output__ExampleAssignment_4_2
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
    // InternalUseCase.g:4108:1: rule__Output__Group_4__3 : rule__Output__Group_4__3__Impl ;
    public final void rule__Output__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4112:1: ( rule__Output__Group_4__3__Impl )
            // InternalUseCase.g:4113:2: rule__Output__Group_4__3__Impl
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
    // InternalUseCase.g:4119:1: rule__Output__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Output__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4123:1: ( ( ')' ) )
            // InternalUseCase.g:4124:1: ( ')' )
            {
            // InternalUseCase.g:4124:1: ( ')' )
            // InternalUseCase.g:4125:2: ')'
            {
             before(grammarAccess.getOutputAccess().getRightParenthesisKeyword_4_3()); 
            match(input,66,FOLLOW_2); 
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
    // InternalUseCase.g:4135:1: rule__PreConditions__Group__0 : rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 ;
    public final void rule__PreConditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4139:1: ( rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 )
            // InternalUseCase.g:4140:2: rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1
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
    // InternalUseCase.g:4147:1: rule__PreConditions__Group__0__Impl : ( ( rule__PreConditions__Alternatives_0 ) ) ;
    public final void rule__PreConditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4151:1: ( ( ( rule__PreConditions__Alternatives_0 ) ) )
            // InternalUseCase.g:4152:1: ( ( rule__PreConditions__Alternatives_0 ) )
            {
            // InternalUseCase.g:4152:1: ( ( rule__PreConditions__Alternatives_0 ) )
            // InternalUseCase.g:4153:2: ( rule__PreConditions__Alternatives_0 )
            {
             before(grammarAccess.getPreConditionsAccess().getAlternatives_0()); 
            // InternalUseCase.g:4154:2: ( rule__PreConditions__Alternatives_0 )
            // InternalUseCase.g:4154:3: rule__PreConditions__Alternatives_0
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
    // InternalUseCase.g:4162:1: rule__PreConditions__Group__1 : rule__PreConditions__Group__1__Impl ;
    public final void rule__PreConditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4166:1: ( rule__PreConditions__Group__1__Impl )
            // InternalUseCase.g:4167:2: rule__PreConditions__Group__1__Impl
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
    // InternalUseCase.g:4173:1: rule__PreConditions__Group__1__Impl : ( ( rule__PreConditions__ConditionsAssignment_1 )* ) ;
    public final void rule__PreConditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4177:1: ( ( ( rule__PreConditions__ConditionsAssignment_1 )* ) )
            // InternalUseCase.g:4178:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            {
            // InternalUseCase.g:4178:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            // InternalUseCase.g:4179:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            {
             before(grammarAccess.getPreConditionsAccess().getConditionsAssignment_1()); 
            // InternalUseCase.g:4180:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==56) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalUseCase.g:4180:3: rule__PreConditions__ConditionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__PreConditions__ConditionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalUseCase.g:4189:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4193:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalUseCase.g:4194:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalUseCase.g:4201:1: rule__Condition__Group__0__Impl : ( '-' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4205:1: ( ( '-' ) )
            // InternalUseCase.g:4206:1: ( '-' )
            {
            // InternalUseCase.g:4206:1: ( '-' )
            // InternalUseCase.g:4207:2: '-'
            {
             before(grammarAccess.getConditionAccess().getHyphenMinusKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUseCase.g:4216:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4220:1: ( rule__Condition__Group__1__Impl )
            // InternalUseCase.g:4221:2: rule__Condition__Group__1__Impl
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
    // InternalUseCase.g:4227:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ContentAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4231:1: ( ( ( rule__Condition__ContentAssignment_1 ) ) )
            // InternalUseCase.g:4232:1: ( ( rule__Condition__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:4232:1: ( ( rule__Condition__ContentAssignment_1 ) )
            // InternalUseCase.g:4233:2: ( rule__Condition__ContentAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getContentAssignment_1()); 
            // InternalUseCase.g:4234:2: ( rule__Condition__ContentAssignment_1 )
            // InternalUseCase.g:4234:3: rule__Condition__ContentAssignment_1
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
    // InternalUseCase.g:4243:1: rule__Steps__Group__0 : rule__Steps__Group__0__Impl rule__Steps__Group__1 ;
    public final void rule__Steps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4247:1: ( rule__Steps__Group__0__Impl rule__Steps__Group__1 )
            // InternalUseCase.g:4248:2: rule__Steps__Group__0__Impl rule__Steps__Group__1
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
    // InternalUseCase.g:4255:1: rule__Steps__Group__0__Impl : ( ( rule__Steps__Alternatives_0 ) ) ;
    public final void rule__Steps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4259:1: ( ( ( rule__Steps__Alternatives_0 ) ) )
            // InternalUseCase.g:4260:1: ( ( rule__Steps__Alternatives_0 ) )
            {
            // InternalUseCase.g:4260:1: ( ( rule__Steps__Alternatives_0 ) )
            // InternalUseCase.g:4261:2: ( rule__Steps__Alternatives_0 )
            {
             before(grammarAccess.getStepsAccess().getAlternatives_0()); 
            // InternalUseCase.g:4262:2: ( rule__Steps__Alternatives_0 )
            // InternalUseCase.g:4262:3: rule__Steps__Alternatives_0
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
    // InternalUseCase.g:4270:1: rule__Steps__Group__1 : rule__Steps__Group__1__Impl ;
    public final void rule__Steps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4274:1: ( rule__Steps__Group__1__Impl )
            // InternalUseCase.g:4275:2: rule__Steps__Group__1__Impl
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
    // InternalUseCase.g:4281:1: rule__Steps__Group__1__Impl : ( ( rule__Steps__StepsAssignment_1 )* ) ;
    public final void rule__Steps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4285:1: ( ( ( rule__Steps__StepsAssignment_1 )* ) )
            // InternalUseCase.g:4286:1: ( ( rule__Steps__StepsAssignment_1 )* )
            {
            // InternalUseCase.g:4286:1: ( ( rule__Steps__StepsAssignment_1 )* )
            // InternalUseCase.g:4287:2: ( rule__Steps__StepsAssignment_1 )*
            {
             before(grammarAccess.getStepsAccess().getStepsAssignment_1()); 
            // InternalUseCase.g:4288:2: ( rule__Steps__StepsAssignment_1 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_INT) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalUseCase.g:4288:3: rule__Steps__StepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Steps__StepsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalUseCase.g:4297:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4301:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalUseCase.g:4302:2: rule__Step__Group__0__Impl rule__Step__Group__1
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
    // InternalUseCase.g:4309:1: rule__Step__Group__0__Impl : ( ( rule__Step__NumberAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4313:1: ( ( ( rule__Step__NumberAssignment_0 ) ) )
            // InternalUseCase.g:4314:1: ( ( rule__Step__NumberAssignment_0 ) )
            {
            // InternalUseCase.g:4314:1: ( ( rule__Step__NumberAssignment_0 ) )
            // InternalUseCase.g:4315:2: ( rule__Step__NumberAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getNumberAssignment_0()); 
            // InternalUseCase.g:4316:2: ( rule__Step__NumberAssignment_0 )
            // InternalUseCase.g:4316:3: rule__Step__NumberAssignment_0
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
    // InternalUseCase.g:4324:1: rule__Step__Group__1 : rule__Step__Group__1__Impl ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4328:1: ( rule__Step__Group__1__Impl )
            // InternalUseCase.g:4329:2: rule__Step__Group__1__Impl
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
    // InternalUseCase.g:4335:1: rule__Step__Group__1__Impl : ( ( rule__Step__Alternatives_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4339:1: ( ( ( rule__Step__Alternatives_1 ) ) )
            // InternalUseCase.g:4340:1: ( ( rule__Step__Alternatives_1 ) )
            {
            // InternalUseCase.g:4340:1: ( ( rule__Step__Alternatives_1 ) )
            // InternalUseCase.g:4341:2: ( rule__Step__Alternatives_1 )
            {
             before(grammarAccess.getStepAccess().getAlternatives_1()); 
            // InternalUseCase.g:4342:2: ( rule__Step__Alternatives_1 )
            // InternalUseCase.g:4342:3: rule__Step__Alternatives_1
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
    // InternalUseCase.g:4351:1: rule__Step__Group_1_0__0 : rule__Step__Group_1_0__0__Impl rule__Step__Group_1_0__1 ;
    public final void rule__Step__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4355:1: ( rule__Step__Group_1_0__0__Impl rule__Step__Group_1_0__1 )
            // InternalUseCase.g:4356:2: rule__Step__Group_1_0__0__Impl rule__Step__Group_1_0__1
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
    // InternalUseCase.g:4363:1: rule__Step__Group_1_0__0__Impl : ( ( rule__Step__ActionAssignment_1_0_0 ) ) ;
    public final void rule__Step__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4367:1: ( ( ( rule__Step__ActionAssignment_1_0_0 ) ) )
            // InternalUseCase.g:4368:1: ( ( rule__Step__ActionAssignment_1_0_0 ) )
            {
            // InternalUseCase.g:4368:1: ( ( rule__Step__ActionAssignment_1_0_0 ) )
            // InternalUseCase.g:4369:2: ( rule__Step__ActionAssignment_1_0_0 )
            {
             before(grammarAccess.getStepAccess().getActionAssignment_1_0_0()); 
            // InternalUseCase.g:4370:2: ( rule__Step__ActionAssignment_1_0_0 )
            // InternalUseCase.g:4370:3: rule__Step__ActionAssignment_1_0_0
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
    // InternalUseCase.g:4378:1: rule__Step__Group_1_0__1 : rule__Step__Group_1_0__1__Impl ;
    public final void rule__Step__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4382:1: ( rule__Step__Group_1_0__1__Impl )
            // InternalUseCase.g:4383:2: rule__Step__Group_1_0__1__Impl
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
    // InternalUseCase.g:4389:1: rule__Step__Group_1_0__1__Impl : ( ( rule__Step__ErrorAssignment_1_0_1 )? ) ;
    public final void rule__Step__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4393:1: ( ( ( rule__Step__ErrorAssignment_1_0_1 )? ) )
            // InternalUseCase.g:4394:1: ( ( rule__Step__ErrorAssignment_1_0_1 )? )
            {
            // InternalUseCase.g:4394:1: ( ( rule__Step__ErrorAssignment_1_0_1 )? )
            // InternalUseCase.g:4395:2: ( rule__Step__ErrorAssignment_1_0_1 )?
            {
             before(grammarAccess.getStepAccess().getErrorAssignment_1_0_1()); 
            // InternalUseCase.g:4396:2: ( rule__Step__ErrorAssignment_1_0_1 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=38 && LA59_0<=39)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalUseCase.g:4396:3: rule__Step__ErrorAssignment_1_0_1
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
    // InternalUseCase.g:4405:1: rule__RaiseErrorConditional__Group__0 : rule__RaiseErrorConditional__Group__0__Impl rule__RaiseErrorConditional__Group__1 ;
    public final void rule__RaiseErrorConditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4409:1: ( rule__RaiseErrorConditional__Group__0__Impl rule__RaiseErrorConditional__Group__1 )
            // InternalUseCase.g:4410:2: rule__RaiseErrorConditional__Group__0__Impl rule__RaiseErrorConditional__Group__1
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
    // InternalUseCase.g:4417:1: rule__RaiseErrorConditional__Group__0__Impl : ( ( rule__RaiseErrorConditional__Alternatives_0 ) ) ;
    public final void rule__RaiseErrorConditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4421:1: ( ( ( rule__RaiseErrorConditional__Alternatives_0 ) ) )
            // InternalUseCase.g:4422:1: ( ( rule__RaiseErrorConditional__Alternatives_0 ) )
            {
            // InternalUseCase.g:4422:1: ( ( rule__RaiseErrorConditional__Alternatives_0 ) )
            // InternalUseCase.g:4423:2: ( rule__RaiseErrorConditional__Alternatives_0 )
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getAlternatives_0()); 
            // InternalUseCase.g:4424:2: ( rule__RaiseErrorConditional__Alternatives_0 )
            // InternalUseCase.g:4424:3: rule__RaiseErrorConditional__Alternatives_0
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
    // InternalUseCase.g:4432:1: rule__RaiseErrorConditional__Group__1 : rule__RaiseErrorConditional__Group__1__Impl rule__RaiseErrorConditional__Group__2 ;
    public final void rule__RaiseErrorConditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4436:1: ( rule__RaiseErrorConditional__Group__1__Impl rule__RaiseErrorConditional__Group__2 )
            // InternalUseCase.g:4437:2: rule__RaiseErrorConditional__Group__1__Impl rule__RaiseErrorConditional__Group__2
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
    // InternalUseCase.g:4444:1: rule__RaiseErrorConditional__Group__1__Impl : ( ( rule__RaiseErrorConditional__Alternatives_1 ) ) ;
    public final void rule__RaiseErrorConditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4448:1: ( ( ( rule__RaiseErrorConditional__Alternatives_1 ) ) )
            // InternalUseCase.g:4449:1: ( ( rule__RaiseErrorConditional__Alternatives_1 ) )
            {
            // InternalUseCase.g:4449:1: ( ( rule__RaiseErrorConditional__Alternatives_1 ) )
            // InternalUseCase.g:4450:2: ( rule__RaiseErrorConditional__Alternatives_1 )
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getAlternatives_1()); 
            // InternalUseCase.g:4451:2: ( rule__RaiseErrorConditional__Alternatives_1 )
            // InternalUseCase.g:4451:3: rule__RaiseErrorConditional__Alternatives_1
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
    // InternalUseCase.g:4459:1: rule__RaiseErrorConditional__Group__2 : rule__RaiseErrorConditional__Group__2__Impl ;
    public final void rule__RaiseErrorConditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4463:1: ( rule__RaiseErrorConditional__Group__2__Impl )
            // InternalUseCase.g:4464:2: rule__RaiseErrorConditional__Group__2__Impl
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
    // InternalUseCase.g:4470:1: rule__RaiseErrorConditional__Group__2__Impl : ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) ) ;
    public final void rule__RaiseErrorConditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4474:1: ( ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) ) )
            // InternalUseCase.g:4475:1: ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) )
            {
            // InternalUseCase.g:4475:1: ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) )
            // InternalUseCase.g:4476:2: ( rule__RaiseErrorConditional__ExceptionAssignment_2 )
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getExceptionAssignment_2()); 
            // InternalUseCase.g:4477:2: ( rule__RaiseErrorConditional__ExceptionAssignment_2 )
            // InternalUseCase.g:4477:3: rule__RaiseErrorConditional__ExceptionAssignment_2
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
    // InternalUseCase.g:4486:1: rule__RaiseErrorConditional__Group_1_0__0 : rule__RaiseErrorConditional__Group_1_0__0__Impl rule__RaiseErrorConditional__Group_1_0__1 ;
    public final void rule__RaiseErrorConditional__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4490:1: ( rule__RaiseErrorConditional__Group_1_0__0__Impl rule__RaiseErrorConditional__Group_1_0__1 )
            // InternalUseCase.g:4491:2: rule__RaiseErrorConditional__Group_1_0__0__Impl rule__RaiseErrorConditional__Group_1_0__1
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
    // InternalUseCase.g:4498:1: rule__RaiseErrorConditional__Group_1_0__0__Impl : ( 'On' ) ;
    public final void rule__RaiseErrorConditional__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4502:1: ( ( 'On' ) )
            // InternalUseCase.g:4503:1: ( 'On' )
            {
            // InternalUseCase.g:4503:1: ( 'On' )
            // InternalUseCase.g:4504:2: 'On'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getOnKeyword_1_0_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalUseCase.g:4513:1: rule__RaiseErrorConditional__Group_1_0__1 : rule__RaiseErrorConditional__Group_1_0__1__Impl rule__RaiseErrorConditional__Group_1_0__2 ;
    public final void rule__RaiseErrorConditional__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4517:1: ( rule__RaiseErrorConditional__Group_1_0__1__Impl rule__RaiseErrorConditional__Group_1_0__2 )
            // InternalUseCase.g:4518:2: rule__RaiseErrorConditional__Group_1_0__1__Impl rule__RaiseErrorConditional__Group_1_0__2
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
    // InternalUseCase.g:4525:1: rule__RaiseErrorConditional__Group_1_0__1__Impl : ( 'error' ) ;
    public final void rule__RaiseErrorConditional__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4529:1: ( ( 'error' ) )
            // InternalUseCase.g:4530:1: ( 'error' )
            {
            // InternalUseCase.g:4530:1: ( 'error' )
            // InternalUseCase.g:4531:2: 'error'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getErrorKeyword_1_0_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalUseCase.g:4540:1: rule__RaiseErrorConditional__Group_1_0__2 : rule__RaiseErrorConditional__Group_1_0__2__Impl ;
    public final void rule__RaiseErrorConditional__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4544:1: ( rule__RaiseErrorConditional__Group_1_0__2__Impl )
            // InternalUseCase.g:4545:2: rule__RaiseErrorConditional__Group_1_0__2__Impl
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
    // InternalUseCase.g:4551:1: rule__RaiseErrorConditional__Group_1_0__2__Impl : ( 'raise' ) ;
    public final void rule__RaiseErrorConditional__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4555:1: ( ( 'raise' ) )
            // InternalUseCase.g:4556:1: ( 'raise' )
            {
            // InternalUseCase.g:4556:1: ( 'raise' )
            // InternalUseCase.g:4557:2: 'raise'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getRaiseKeyword_1_0_2()); 
            match(input,71,FOLLOW_2); 
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
    // InternalUseCase.g:4567:1: rule__RaiseErrorConditional__Group_1_1__0 : rule__RaiseErrorConditional__Group_1_1__0__Impl rule__RaiseErrorConditional__Group_1_1__1 ;
    public final void rule__RaiseErrorConditional__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4571:1: ( rule__RaiseErrorConditional__Group_1_1__0__Impl rule__RaiseErrorConditional__Group_1_1__1 )
            // InternalUseCase.g:4572:2: rule__RaiseErrorConditional__Group_1_1__0__Impl rule__RaiseErrorConditional__Group_1_1__1
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
    // InternalUseCase.g:4579:1: rule__RaiseErrorConditional__Group_1_1__0__Impl : ( 'Bei' ) ;
    public final void rule__RaiseErrorConditional__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4583:1: ( ( 'Bei' ) )
            // InternalUseCase.g:4584:1: ( 'Bei' )
            {
            // InternalUseCase.g:4584:1: ( 'Bei' )
            // InternalUseCase.g:4585:2: 'Bei'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getBeiKeyword_1_1_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalUseCase.g:4594:1: rule__RaiseErrorConditional__Group_1_1__1 : rule__RaiseErrorConditional__Group_1_1__1__Impl rule__RaiseErrorConditional__Group_1_1__2 ;
    public final void rule__RaiseErrorConditional__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4598:1: ( rule__RaiseErrorConditional__Group_1_1__1__Impl rule__RaiseErrorConditional__Group_1_1__2 )
            // InternalUseCase.g:4599:2: rule__RaiseErrorConditional__Group_1_1__1__Impl rule__RaiseErrorConditional__Group_1_1__2
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
    // InternalUseCase.g:4606:1: rule__RaiseErrorConditional__Group_1_1__1__Impl : ( 'Fehler' ) ;
    public final void rule__RaiseErrorConditional__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4610:1: ( ( 'Fehler' ) )
            // InternalUseCase.g:4611:1: ( 'Fehler' )
            {
            // InternalUseCase.g:4611:1: ( 'Fehler' )
            // InternalUseCase.g:4612:2: 'Fehler'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getFehlerKeyword_1_1_1()); 
            match(input,73,FOLLOW_2); 
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
    // InternalUseCase.g:4621:1: rule__RaiseErrorConditional__Group_1_1__2 : rule__RaiseErrorConditional__Group_1_1__2__Impl ;
    public final void rule__RaiseErrorConditional__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4625:1: ( rule__RaiseErrorConditional__Group_1_1__2__Impl )
            // InternalUseCase.g:4626:2: rule__RaiseErrorConditional__Group_1_1__2__Impl
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
    // InternalUseCase.g:4632:1: rule__RaiseErrorConditional__Group_1_1__2__Impl : ( 'melde' ) ;
    public final void rule__RaiseErrorConditional__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4636:1: ( ( 'melde' ) )
            // InternalUseCase.g:4637:1: ( 'melde' )
            {
            // InternalUseCase.g:4637:1: ( 'melde' )
            // InternalUseCase.g:4638:2: 'melde'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getMeldeKeyword_1_1_2()); 
            match(input,74,FOLLOW_2); 
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
    // InternalUseCase.g:4648:1: rule__RaiseErrorNow__Group__0 : rule__RaiseErrorNow__Group__0__Impl rule__RaiseErrorNow__Group__1 ;
    public final void rule__RaiseErrorNow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4652:1: ( rule__RaiseErrorNow__Group__0__Impl rule__RaiseErrorNow__Group__1 )
            // InternalUseCase.g:4653:2: rule__RaiseErrorNow__Group__0__Impl rule__RaiseErrorNow__Group__1
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
    // InternalUseCase.g:4660:1: rule__RaiseErrorNow__Group__0__Impl : ( ( rule__RaiseErrorNow__Alternatives_0 ) ) ;
    public final void rule__RaiseErrorNow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4664:1: ( ( ( rule__RaiseErrorNow__Alternatives_0 ) ) )
            // InternalUseCase.g:4665:1: ( ( rule__RaiseErrorNow__Alternatives_0 ) )
            {
            // InternalUseCase.g:4665:1: ( ( rule__RaiseErrorNow__Alternatives_0 ) )
            // InternalUseCase.g:4666:2: ( rule__RaiseErrorNow__Alternatives_0 )
            {
             before(grammarAccess.getRaiseErrorNowAccess().getAlternatives_0()); 
            // InternalUseCase.g:4667:2: ( rule__RaiseErrorNow__Alternatives_0 )
            // InternalUseCase.g:4667:3: rule__RaiseErrorNow__Alternatives_0
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
    // InternalUseCase.g:4675:1: rule__RaiseErrorNow__Group__1 : rule__RaiseErrorNow__Group__1__Impl ;
    public final void rule__RaiseErrorNow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4679:1: ( rule__RaiseErrorNow__Group__1__Impl )
            // InternalUseCase.g:4680:2: rule__RaiseErrorNow__Group__1__Impl
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
    // InternalUseCase.g:4686:1: rule__RaiseErrorNow__Group__1__Impl : ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) ) ;
    public final void rule__RaiseErrorNow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4690:1: ( ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) ) )
            // InternalUseCase.g:4691:1: ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) )
            {
            // InternalUseCase.g:4691:1: ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) )
            // InternalUseCase.g:4692:2: ( rule__RaiseErrorNow__ExceptionAssignment_1 )
            {
             before(grammarAccess.getRaiseErrorNowAccess().getExceptionAssignment_1()); 
            // InternalUseCase.g:4693:2: ( rule__RaiseErrorNow__ExceptionAssignment_1 )
            // InternalUseCase.g:4693:3: rule__RaiseErrorNow__ExceptionAssignment_1
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
    // InternalUseCase.g:4702:1: rule__RaiseErrorNow__Group_0_0__0 : rule__RaiseErrorNow__Group_0_0__0__Impl rule__RaiseErrorNow__Group_0_0__1 ;
    public final void rule__RaiseErrorNow__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4706:1: ( rule__RaiseErrorNow__Group_0_0__0__Impl rule__RaiseErrorNow__Group_0_0__1 )
            // InternalUseCase.g:4707:2: rule__RaiseErrorNow__Group_0_0__0__Impl rule__RaiseErrorNow__Group_0_0__1
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
    // InternalUseCase.g:4714:1: rule__RaiseErrorNow__Group_0_0__0__Impl : ( 'Raise' ) ;
    public final void rule__RaiseErrorNow__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4718:1: ( ( 'Raise' ) )
            // InternalUseCase.g:4719:1: ( 'Raise' )
            {
            // InternalUseCase.g:4719:1: ( 'Raise' )
            // InternalUseCase.g:4720:2: 'Raise'
            {
             before(grammarAccess.getRaiseErrorNowAccess().getRaiseKeyword_0_0_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalUseCase.g:4729:1: rule__RaiseErrorNow__Group_0_0__1 : rule__RaiseErrorNow__Group_0_0__1__Impl ;
    public final void rule__RaiseErrorNow__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4733:1: ( rule__RaiseErrorNow__Group_0_0__1__Impl )
            // InternalUseCase.g:4734:2: rule__RaiseErrorNow__Group_0_0__1__Impl
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
    // InternalUseCase.g:4740:1: rule__RaiseErrorNow__Group_0_0__1__Impl : ( ( 'error' )? ) ;
    public final void rule__RaiseErrorNow__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4744:1: ( ( ( 'error' )? ) )
            // InternalUseCase.g:4745:1: ( ( 'error' )? )
            {
            // InternalUseCase.g:4745:1: ( ( 'error' )? )
            // InternalUseCase.g:4746:2: ( 'error' )?
            {
             before(grammarAccess.getRaiseErrorNowAccess().getErrorKeyword_0_0_1()); 
            // InternalUseCase.g:4747:2: ( 'error' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==70) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalUseCase.g:4747:3: 'error'
                    {
                    match(input,70,FOLLOW_2); 

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
    // InternalUseCase.g:4756:1: rule__RaiseErrorNow__Group_0_1__0 : rule__RaiseErrorNow__Group_0_1__0__Impl rule__RaiseErrorNow__Group_0_1__1 ;
    public final void rule__RaiseErrorNow__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4760:1: ( rule__RaiseErrorNow__Group_0_1__0__Impl rule__RaiseErrorNow__Group_0_1__1 )
            // InternalUseCase.g:4761:2: rule__RaiseErrorNow__Group_0_1__0__Impl rule__RaiseErrorNow__Group_0_1__1
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
    // InternalUseCase.g:4768:1: rule__RaiseErrorNow__Group_0_1__0__Impl : ( 'Melde' ) ;
    public final void rule__RaiseErrorNow__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4772:1: ( ( 'Melde' ) )
            // InternalUseCase.g:4773:1: ( 'Melde' )
            {
            // InternalUseCase.g:4773:1: ( 'Melde' )
            // InternalUseCase.g:4774:2: 'Melde'
            {
             before(grammarAccess.getRaiseErrorNowAccess().getMeldeKeyword_0_1_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalUseCase.g:4783:1: rule__RaiseErrorNow__Group_0_1__1 : rule__RaiseErrorNow__Group_0_1__1__Impl ;
    public final void rule__RaiseErrorNow__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4787:1: ( rule__RaiseErrorNow__Group_0_1__1__Impl )
            // InternalUseCase.g:4788:2: rule__RaiseErrorNow__Group_0_1__1__Impl
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
    // InternalUseCase.g:4794:1: rule__RaiseErrorNow__Group_0_1__1__Impl : ( ( 'Fehler' )? ) ;
    public final void rule__RaiseErrorNow__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4798:1: ( ( ( 'Fehler' )? ) )
            // InternalUseCase.g:4799:1: ( ( 'Fehler' )? )
            {
            // InternalUseCase.g:4799:1: ( ( 'Fehler' )? )
            // InternalUseCase.g:4800:2: ( 'Fehler' )?
            {
             before(grammarAccess.getRaiseErrorNowAccess().getFehlerKeyword_0_1_1()); 
            // InternalUseCase.g:4801:2: ( 'Fehler' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==73) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalUseCase.g:4801:3: 'Fehler'
                    {
                    match(input,73,FOLLOW_2); 

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
    // InternalUseCase.g:4810:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4814:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalUseCase.g:4815:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
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
    // InternalUseCase.g:4822:1: rule__IfStatement__Group__0__Impl : ( ( rule__IfStatement__Alternatives_0 ) ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4826:1: ( ( ( rule__IfStatement__Alternatives_0 ) ) )
            // InternalUseCase.g:4827:1: ( ( rule__IfStatement__Alternatives_0 ) )
            {
            // InternalUseCase.g:4827:1: ( ( rule__IfStatement__Alternatives_0 ) )
            // InternalUseCase.g:4828:2: ( rule__IfStatement__Alternatives_0 )
            {
             before(grammarAccess.getIfStatementAccess().getAlternatives_0()); 
            // InternalUseCase.g:4829:2: ( rule__IfStatement__Alternatives_0 )
            // InternalUseCase.g:4829:3: rule__IfStatement__Alternatives_0
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
    // InternalUseCase.g:4837:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4841:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalUseCase.g:4842:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
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
    // InternalUseCase.g:4849:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ConditionAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4853:1: ( ( ( rule__IfStatement__ConditionAssignment_1 ) ) )
            // InternalUseCase.g:4854:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            {
            // InternalUseCase.g:4854:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            // InternalUseCase.g:4855:2: ( rule__IfStatement__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_1()); 
            // InternalUseCase.g:4856:2: ( rule__IfStatement__ConditionAssignment_1 )
            // InternalUseCase.g:4856:3: rule__IfStatement__ConditionAssignment_1
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
    // InternalUseCase.g:4864:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4868:1: ( rule__IfStatement__Group__2__Impl )
            // InternalUseCase.g:4869:2: rule__IfStatement__Group__2__Impl
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
    // InternalUseCase.g:4875:1: rule__IfStatement__Group__2__Impl : ( ':' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4879:1: ( ( ':' ) )
            // InternalUseCase.g:4880:1: ( ':' )
            {
            // InternalUseCase.g:4880:1: ( ':' )
            // InternalUseCase.g:4881:2: ':'
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
    // InternalUseCase.g:4891:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4895:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalUseCase.g:4896:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
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
    // InternalUseCase.g:4903:1: rule__Loop__Group__0__Impl : ( ( rule__Loop__Alternatives_0 ) ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4907:1: ( ( ( rule__Loop__Alternatives_0 ) ) )
            // InternalUseCase.g:4908:1: ( ( rule__Loop__Alternatives_0 ) )
            {
            // InternalUseCase.g:4908:1: ( ( rule__Loop__Alternatives_0 ) )
            // InternalUseCase.g:4909:2: ( rule__Loop__Alternatives_0 )
            {
             before(grammarAccess.getLoopAccess().getAlternatives_0()); 
            // InternalUseCase.g:4910:2: ( rule__Loop__Alternatives_0 )
            // InternalUseCase.g:4910:3: rule__Loop__Alternatives_0
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
    // InternalUseCase.g:4918:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4922:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalUseCase.g:4923:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
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
    // InternalUseCase.g:4930:1: rule__Loop__Group__1__Impl : ( ( rule__Loop__ConditionAssignment_1 ) ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4934:1: ( ( ( rule__Loop__ConditionAssignment_1 ) ) )
            // InternalUseCase.g:4935:1: ( ( rule__Loop__ConditionAssignment_1 ) )
            {
            // InternalUseCase.g:4935:1: ( ( rule__Loop__ConditionAssignment_1 ) )
            // InternalUseCase.g:4936:2: ( rule__Loop__ConditionAssignment_1 )
            {
             before(grammarAccess.getLoopAccess().getConditionAssignment_1()); 
            // InternalUseCase.g:4937:2: ( rule__Loop__ConditionAssignment_1 )
            // InternalUseCase.g:4937:3: rule__Loop__ConditionAssignment_1
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
    // InternalUseCase.g:4945:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4949:1: ( rule__Loop__Group__2__Impl )
            // InternalUseCase.g:4950:2: rule__Loop__Group__2__Impl
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
    // InternalUseCase.g:4956:1: rule__Loop__Group__2__Impl : ( ':' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4960:1: ( ( ':' ) )
            // InternalUseCase.g:4961:1: ( ':' )
            {
            // InternalUseCase.g:4961:1: ( ':' )
            // InternalUseCase.g:4962:2: ':'
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
    // InternalUseCase.g:4972:1: rule__Notes__Group__0 : rule__Notes__Group__0__Impl rule__Notes__Group__1 ;
    public final void rule__Notes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4976:1: ( rule__Notes__Group__0__Impl rule__Notes__Group__1 )
            // InternalUseCase.g:4977:2: rule__Notes__Group__0__Impl rule__Notes__Group__1
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
    // InternalUseCase.g:4984:1: rule__Notes__Group__0__Impl : ( ( rule__Notes__Alternatives_0 ) ) ;
    public final void rule__Notes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4988:1: ( ( ( rule__Notes__Alternatives_0 ) ) )
            // InternalUseCase.g:4989:1: ( ( rule__Notes__Alternatives_0 ) )
            {
            // InternalUseCase.g:4989:1: ( ( rule__Notes__Alternatives_0 ) )
            // InternalUseCase.g:4990:2: ( rule__Notes__Alternatives_0 )
            {
             before(grammarAccess.getNotesAccess().getAlternatives_0()); 
            // InternalUseCase.g:4991:2: ( rule__Notes__Alternatives_0 )
            // InternalUseCase.g:4991:3: rule__Notes__Alternatives_0
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
    // InternalUseCase.g:4999:1: rule__Notes__Group__1 : rule__Notes__Group__1__Impl ;
    public final void rule__Notes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5003:1: ( rule__Notes__Group__1__Impl )
            // InternalUseCase.g:5004:2: rule__Notes__Group__1__Impl
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
    // InternalUseCase.g:5010:1: rule__Notes__Group__1__Impl : ( ( rule__Notes__ContentAssignment_1 ) ) ;
    public final void rule__Notes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5014:1: ( ( ( rule__Notes__ContentAssignment_1 ) ) )
            // InternalUseCase.g:5015:1: ( ( rule__Notes__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:5015:1: ( ( rule__Notes__ContentAssignment_1 ) )
            // InternalUseCase.g:5016:2: ( rule__Notes__ContentAssignment_1 )
            {
             before(grammarAccess.getNotesAccess().getContentAssignment_1()); 
            // InternalUseCase.g:5017:2: ( rule__Notes__ContentAssignment_1 )
            // InternalUseCase.g:5017:3: rule__Notes__ContentAssignment_1
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
    // InternalUseCase.g:5026:1: rule__UsedTypes__Group__0 : rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 ;
    public final void rule__UsedTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5030:1: ( rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 )
            // InternalUseCase.g:5031:2: rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1
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
    // InternalUseCase.g:5038:1: rule__UsedTypes__Group__0__Impl : ( ( rule__UsedTypes__Alternatives_0 ) ) ;
    public final void rule__UsedTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5042:1: ( ( ( rule__UsedTypes__Alternatives_0 ) ) )
            // InternalUseCase.g:5043:1: ( ( rule__UsedTypes__Alternatives_0 ) )
            {
            // InternalUseCase.g:5043:1: ( ( rule__UsedTypes__Alternatives_0 ) )
            // InternalUseCase.g:5044:2: ( rule__UsedTypes__Alternatives_0 )
            {
             before(grammarAccess.getUsedTypesAccess().getAlternatives_0()); 
            // InternalUseCase.g:5045:2: ( rule__UsedTypes__Alternatives_0 )
            // InternalUseCase.g:5045:3: rule__UsedTypes__Alternatives_0
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
    // InternalUseCase.g:5053:1: rule__UsedTypes__Group__1 : rule__UsedTypes__Group__1__Impl ;
    public final void rule__UsedTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5057:1: ( rule__UsedTypes__Group__1__Impl )
            // InternalUseCase.g:5058:2: rule__UsedTypes__Group__1__Impl
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
    // InternalUseCase.g:5064:1: rule__UsedTypes__Group__1__Impl : ( ( rule__UsedTypes__TypesAssignment_1 )* ) ;
    public final void rule__UsedTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5068:1: ( ( ( rule__UsedTypes__TypesAssignment_1 )* ) )
            // InternalUseCase.g:5069:1: ( ( rule__UsedTypes__TypesAssignment_1 )* )
            {
            // InternalUseCase.g:5069:1: ( ( rule__UsedTypes__TypesAssignment_1 )* )
            // InternalUseCase.g:5070:2: ( rule__UsedTypes__TypesAssignment_1 )*
            {
             before(grammarAccess.getUsedTypesAccess().getTypesAssignment_1()); 
            // InternalUseCase.g:5071:2: ( rule__UsedTypes__TypesAssignment_1 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==56) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalUseCase.g:5071:3: rule__UsedTypes__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__UsedTypes__TypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // InternalUseCase.g:5080:1: rule__UsedTypes__Group_0_0__0 : rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1 ;
    public final void rule__UsedTypes__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5084:1: ( rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1 )
            // InternalUseCase.g:5085:2: rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1
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
    // InternalUseCase.g:5092:1: rule__UsedTypes__Group_0_0__0__Impl : ( 'used' ) ;
    public final void rule__UsedTypes__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5096:1: ( ( 'used' ) )
            // InternalUseCase.g:5097:1: ( 'used' )
            {
            // InternalUseCase.g:5097:1: ( 'used' )
            // InternalUseCase.g:5098:2: 'used'
            {
             before(grammarAccess.getUsedTypesAccess().getUsedKeyword_0_0_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalUseCase.g:5107:1: rule__UsedTypes__Group_0_0__1 : rule__UsedTypes__Group_0_0__1__Impl ;
    public final void rule__UsedTypes__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5111:1: ( rule__UsedTypes__Group_0_0__1__Impl )
            // InternalUseCase.g:5112:2: rule__UsedTypes__Group_0_0__1__Impl
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
    // InternalUseCase.g:5118:1: rule__UsedTypes__Group_0_0__1__Impl : ( 'building-blocks:' ) ;
    public final void rule__UsedTypes__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5122:1: ( ( 'building-blocks:' ) )
            // InternalUseCase.g:5123:1: ( 'building-blocks:' )
            {
            // InternalUseCase.g:5123:1: ( 'building-blocks:' )
            // InternalUseCase.g:5124:2: 'building-blocks:'
            {
             before(grammarAccess.getUsedTypesAccess().getBuildingBlocksKeyword_0_0_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalUseCase.g:5134:1: rule__UsedTypes__Group_0_1__0 : rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1 ;
    public final void rule__UsedTypes__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5138:1: ( rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1 )
            // InternalUseCase.g:5139:2: rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1
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
    // InternalUseCase.g:5146:1: rule__UsedTypes__Group_0_1__0__Impl : ( 'Genutzte' ) ;
    public final void rule__UsedTypes__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5150:1: ( ( 'Genutzte' ) )
            // InternalUseCase.g:5151:1: ( 'Genutzte' )
            {
            // InternalUseCase.g:5151:1: ( 'Genutzte' )
            // InternalUseCase.g:5152:2: 'Genutzte'
            {
             before(grammarAccess.getUsedTypesAccess().getGenutzteKeyword_0_1_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalUseCase.g:5161:1: rule__UsedTypes__Group_0_1__1 : rule__UsedTypes__Group_0_1__1__Impl ;
    public final void rule__UsedTypes__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5165:1: ( rule__UsedTypes__Group_0_1__1__Impl )
            // InternalUseCase.g:5166:2: rule__UsedTypes__Group_0_1__1__Impl
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
    // InternalUseCase.g:5172:1: rule__UsedTypes__Group_0_1__1__Impl : ( 'Bausteine:' ) ;
    public final void rule__UsedTypes__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5176:1: ( ( 'Bausteine:' ) )
            // InternalUseCase.g:5177:1: ( 'Bausteine:' )
            {
            // InternalUseCase.g:5177:1: ( 'Bausteine:' )
            // InternalUseCase.g:5178:2: 'Bausteine:'
            {
             before(grammarAccess.getUsedTypesAccess().getBausteineKeyword_0_1_1()); 
            match(input,80,FOLLOW_2); 
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
    // InternalUseCase.g:5188:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5192:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalUseCase.g:5193:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalUseCase.g:5200:1: rule__Type__Group__0__Impl : ( '-' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5204:1: ( ( '-' ) )
            // InternalUseCase.g:5205:1: ( '-' )
            {
            // InternalUseCase.g:5205:1: ( '-' )
            // InternalUseCase.g:5206:2: '-'
            {
             before(grammarAccess.getTypeAccess().getHyphenMinusKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUseCase.g:5215:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5219:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalUseCase.g:5220:2: rule__Type__Group__1__Impl rule__Type__Group__2
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
    // InternalUseCase.g:5227:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5231:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalUseCase.g:5232:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalUseCase.g:5232:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalUseCase.g:5233:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalUseCase.g:5234:2: ( rule__Type__NameAssignment_1 )
            // InternalUseCase.g:5234:3: rule__Type__NameAssignment_1
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
    // InternalUseCase.g:5242:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5246:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalUseCase.g:5247:2: rule__Type__Group__2__Impl rule__Type__Group__3
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
    // InternalUseCase.g:5254:1: rule__Type__Group__2__Impl : ( ( rule__Type__Group_2__0 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5258:1: ( ( ( rule__Type__Group_2__0 )? ) )
            // InternalUseCase.g:5259:1: ( ( rule__Type__Group_2__0 )? )
            {
            // InternalUseCase.g:5259:1: ( ( rule__Type__Group_2__0 )? )
            // InternalUseCase.g:5260:2: ( rule__Type__Group_2__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_2()); 
            // InternalUseCase.g:5261:2: ( rule__Type__Group_2__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==65) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalUseCase.g:5261:3: rule__Type__Group_2__0
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
    // InternalUseCase.g:5269:1: rule__Type__Group__3 : rule__Type__Group__3__Impl ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5273:1: ( rule__Type__Group__3__Impl )
            // InternalUseCase.g:5274:2: rule__Type__Group__3__Impl
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
    // InternalUseCase.g:5280:1: rule__Type__Group__3__Impl : ( ( rule__Type__Group_3__0 )? ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5284:1: ( ( ( rule__Type__Group_3__0 )? ) )
            // InternalUseCase.g:5285:1: ( ( rule__Type__Group_3__0 )? )
            {
            // InternalUseCase.g:5285:1: ( ( rule__Type__Group_3__0 )? )
            // InternalUseCase.g:5286:2: ( rule__Type__Group_3__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_3()); 
            // InternalUseCase.g:5287:2: ( rule__Type__Group_3__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==81) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalUseCase.g:5287:3: rule__Type__Group_3__0
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
    // InternalUseCase.g:5296:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5300:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalUseCase.g:5301:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
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
    // InternalUseCase.g:5308:1: rule__Type__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5312:1: ( ( '(' ) )
            // InternalUseCase.g:5313:1: ( '(' )
            {
            // InternalUseCase.g:5313:1: ( '(' )
            // InternalUseCase.g:5314:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalUseCase.g:5323:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl rule__Type__Group_2__2 ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5327:1: ( rule__Type__Group_2__1__Impl rule__Type__Group_2__2 )
            // InternalUseCase.g:5328:2: rule__Type__Group_2__1__Impl rule__Type__Group_2__2
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
    // InternalUseCase.g:5335:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5339:1: ( ( ( rule__Type__DescriptionAssignment_2_1 ) ) )
            // InternalUseCase.g:5340:1: ( ( rule__Type__DescriptionAssignment_2_1 ) )
            {
            // InternalUseCase.g:5340:1: ( ( rule__Type__DescriptionAssignment_2_1 ) )
            // InternalUseCase.g:5341:2: ( rule__Type__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getDescriptionAssignment_2_1()); 
            // InternalUseCase.g:5342:2: ( rule__Type__DescriptionAssignment_2_1 )
            // InternalUseCase.g:5342:3: rule__Type__DescriptionAssignment_2_1
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
    // InternalUseCase.g:5350:1: rule__Type__Group_2__2 : rule__Type__Group_2__2__Impl ;
    public final void rule__Type__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5354:1: ( rule__Type__Group_2__2__Impl )
            // InternalUseCase.g:5355:2: rule__Type__Group_2__2__Impl
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
    // InternalUseCase.g:5361:1: rule__Type__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Type__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5365:1: ( ( ')' ) )
            // InternalUseCase.g:5366:1: ( ')' )
            {
            // InternalUseCase.g:5366:1: ( ')' )
            // InternalUseCase.g:5367:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalUseCase.g:5377:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5381:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalUseCase.g:5382:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
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
    // InternalUseCase.g:5389:1: rule__Type__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5393:1: ( ( '[' ) )
            // InternalUseCase.g:5394:1: ( '[' )
            {
            // InternalUseCase.g:5394:1: ( '[' )
            // InternalUseCase.g:5395:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalUseCase.g:5404:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl rule__Type__Group_3__2 ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5408:1: ( rule__Type__Group_3__1__Impl rule__Type__Group_3__2 )
            // InternalUseCase.g:5409:2: rule__Type__Group_3__1__Impl rule__Type__Group_3__2
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
    // InternalUseCase.g:5416:1: rule__Type__Group_3__1__Impl : ( ( rule__Type__ImportInfoAssignment_3_1 ) ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5420:1: ( ( ( rule__Type__ImportInfoAssignment_3_1 ) ) )
            // InternalUseCase.g:5421:1: ( ( rule__Type__ImportInfoAssignment_3_1 ) )
            {
            // InternalUseCase.g:5421:1: ( ( rule__Type__ImportInfoAssignment_3_1 ) )
            // InternalUseCase.g:5422:2: ( rule__Type__ImportInfoAssignment_3_1 )
            {
             before(grammarAccess.getTypeAccess().getImportInfoAssignment_3_1()); 
            // InternalUseCase.g:5423:2: ( rule__Type__ImportInfoAssignment_3_1 )
            // InternalUseCase.g:5423:3: rule__Type__ImportInfoAssignment_3_1
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
    // InternalUseCase.g:5431:1: rule__Type__Group_3__2 : rule__Type__Group_3__2__Impl ;
    public final void rule__Type__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5435:1: ( rule__Type__Group_3__2__Impl )
            // InternalUseCase.g:5436:2: rule__Type__Group_3__2__Impl
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
    // InternalUseCase.g:5442:1: rule__Type__Group_3__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5446:1: ( ( ']' ) )
            // InternalUseCase.g:5447:1: ( ']' )
            {
            // InternalUseCase.g:5447:1: ( ']' )
            // InternalUseCase.g:5448:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,82,FOLLOW_2); 
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
    // InternalUseCase.g:5458:1: rule__UsedExceptions__Group__0 : rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 ;
    public final void rule__UsedExceptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5462:1: ( rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 )
            // InternalUseCase.g:5463:2: rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1
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
    // InternalUseCase.g:5470:1: rule__UsedExceptions__Group__0__Impl : ( ( rule__UsedExceptions__Alternatives_0 ) ) ;
    public final void rule__UsedExceptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5474:1: ( ( ( rule__UsedExceptions__Alternatives_0 ) ) )
            // InternalUseCase.g:5475:1: ( ( rule__UsedExceptions__Alternatives_0 ) )
            {
            // InternalUseCase.g:5475:1: ( ( rule__UsedExceptions__Alternatives_0 ) )
            // InternalUseCase.g:5476:2: ( rule__UsedExceptions__Alternatives_0 )
            {
             before(grammarAccess.getUsedExceptionsAccess().getAlternatives_0()); 
            // InternalUseCase.g:5477:2: ( rule__UsedExceptions__Alternatives_0 )
            // InternalUseCase.g:5477:3: rule__UsedExceptions__Alternatives_0
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
    // InternalUseCase.g:5485:1: rule__UsedExceptions__Group__1 : rule__UsedExceptions__Group__1__Impl ;
    public final void rule__UsedExceptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5489:1: ( rule__UsedExceptions__Group__1__Impl )
            // InternalUseCase.g:5490:2: rule__UsedExceptions__Group__1__Impl
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
    // InternalUseCase.g:5496:1: rule__UsedExceptions__Group__1__Impl : ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* ) ;
    public final void rule__UsedExceptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5500:1: ( ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* ) )
            // InternalUseCase.g:5501:1: ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* )
            {
            // InternalUseCase.g:5501:1: ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* )
            // InternalUseCase.g:5502:2: ( rule__UsedExceptions__ExceptionsAssignment_1 )*
            {
             before(grammarAccess.getUsedExceptionsAccess().getExceptionsAssignment_1()); 
            // InternalUseCase.g:5503:2: ( rule__UsedExceptions__ExceptionsAssignment_1 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==56) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalUseCase.g:5503:3: rule__UsedExceptions__ExceptionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__UsedExceptions__ExceptionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
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
    // InternalUseCase.g:5512:1: rule__UsedExceptions__Group_0_0__0 : rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1 ;
    public final void rule__UsedExceptions__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5516:1: ( rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1 )
            // InternalUseCase.g:5517:2: rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1
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
    // InternalUseCase.g:5524:1: rule__UsedExceptions__Group_0_0__0__Impl : ( 'used' ) ;
    public final void rule__UsedExceptions__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5528:1: ( ( 'used' ) )
            // InternalUseCase.g:5529:1: ( 'used' )
            {
            // InternalUseCase.g:5529:1: ( 'used' )
            // InternalUseCase.g:5530:2: 'used'
            {
             before(grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0_0_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalUseCase.g:5539:1: rule__UsedExceptions__Group_0_0__1 : rule__UsedExceptions__Group_0_0__1__Impl ;
    public final void rule__UsedExceptions__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5543:1: ( rule__UsedExceptions__Group_0_0__1__Impl )
            // InternalUseCase.g:5544:2: rule__UsedExceptions__Group_0_0__1__Impl
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
    // InternalUseCase.g:5550:1: rule__UsedExceptions__Group_0_0__1__Impl : ( 'errors:' ) ;
    public final void rule__UsedExceptions__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5554:1: ( ( 'errors:' ) )
            // InternalUseCase.g:5555:1: ( 'errors:' )
            {
            // InternalUseCase.g:5555:1: ( 'errors:' )
            // InternalUseCase.g:5556:2: 'errors:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_0_0_1()); 
            match(input,83,FOLLOW_2); 
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
    // InternalUseCase.g:5566:1: rule__UsedExceptions__Group_0_1__0 : rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1 ;
    public final void rule__UsedExceptions__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5570:1: ( rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1 )
            // InternalUseCase.g:5571:2: rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1
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
    // InternalUseCase.g:5578:1: rule__UsedExceptions__Group_0_1__0__Impl : ( 'Genutzte' ) ;
    public final void rule__UsedExceptions__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5582:1: ( ( 'Genutzte' ) )
            // InternalUseCase.g:5583:1: ( 'Genutzte' )
            {
            // InternalUseCase.g:5583:1: ( 'Genutzte' )
            // InternalUseCase.g:5584:2: 'Genutzte'
            {
             before(grammarAccess.getUsedExceptionsAccess().getGenutzteKeyword_0_1_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalUseCase.g:5593:1: rule__UsedExceptions__Group_0_1__1 : rule__UsedExceptions__Group_0_1__1__Impl ;
    public final void rule__UsedExceptions__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5597:1: ( rule__UsedExceptions__Group_0_1__1__Impl )
            // InternalUseCase.g:5598:2: rule__UsedExceptions__Group_0_1__1__Impl
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
    // InternalUseCase.g:5604:1: rule__UsedExceptions__Group_0_1__1__Impl : ( 'Fehler:' ) ;
    public final void rule__UsedExceptions__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5608:1: ( ( 'Fehler:' ) )
            // InternalUseCase.g:5609:1: ( 'Fehler:' )
            {
            // InternalUseCase.g:5609:1: ( 'Fehler:' )
            // InternalUseCase.g:5610:2: 'Fehler:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getFehlerKeyword_0_1_1()); 
            match(input,84,FOLLOW_2); 
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
    // InternalUseCase.g:5620:1: rule__ExceptionDecleration__Group__0 : rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 ;
    public final void rule__ExceptionDecleration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5624:1: ( rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 )
            // InternalUseCase.g:5625:2: rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1
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
    // InternalUseCase.g:5632:1: rule__ExceptionDecleration__Group__0__Impl : ( '-' ) ;
    public final void rule__ExceptionDecleration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5636:1: ( ( '-' ) )
            // InternalUseCase.g:5637:1: ( '-' )
            {
            // InternalUseCase.g:5637:1: ( '-' )
            // InternalUseCase.g:5638:2: '-'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUseCase.g:5647:1: rule__ExceptionDecleration__Group__1 : rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 ;
    public final void rule__ExceptionDecleration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5651:1: ( rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 )
            // InternalUseCase.g:5652:2: rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2
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
    // InternalUseCase.g:5659:1: rule__ExceptionDecleration__Group__1__Impl : ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) ;
    public final void rule__ExceptionDecleration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5663:1: ( ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) )
            // InternalUseCase.g:5664:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            {
            // InternalUseCase.g:5664:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            // InternalUseCase.g:5665:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getNameAssignment_1()); 
            // InternalUseCase.g:5666:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            // InternalUseCase.g:5666:3: rule__ExceptionDecleration__NameAssignment_1
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
    // InternalUseCase.g:5674:1: rule__ExceptionDecleration__Group__2 : rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 ;
    public final void rule__ExceptionDecleration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5678:1: ( rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 )
            // InternalUseCase.g:5679:2: rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3
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
    // InternalUseCase.g:5686:1: rule__ExceptionDecleration__Group__2__Impl : ( ( rule__ExceptionDecleration__Group_2__0 )? ) ;
    public final void rule__ExceptionDecleration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5690:1: ( ( ( rule__ExceptionDecleration__Group_2__0 )? ) )
            // InternalUseCase.g:5691:1: ( ( rule__ExceptionDecleration__Group_2__0 )? )
            {
            // InternalUseCase.g:5691:1: ( ( rule__ExceptionDecleration__Group_2__0 )? )
            // InternalUseCase.g:5692:2: ( rule__ExceptionDecleration__Group_2__0 )?
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup_2()); 
            // InternalUseCase.g:5693:2: ( rule__ExceptionDecleration__Group_2__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==65) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalUseCase.g:5693:3: rule__ExceptionDecleration__Group_2__0
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
    // InternalUseCase.g:5701:1: rule__ExceptionDecleration__Group__3 : rule__ExceptionDecleration__Group__3__Impl ;
    public final void rule__ExceptionDecleration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5705:1: ( rule__ExceptionDecleration__Group__3__Impl )
            // InternalUseCase.g:5706:2: rule__ExceptionDecleration__Group__3__Impl
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
    // InternalUseCase.g:5712:1: rule__ExceptionDecleration__Group__3__Impl : ( ( rule__ExceptionDecleration__Group_3__0 )? ) ;
    public final void rule__ExceptionDecleration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5716:1: ( ( ( rule__ExceptionDecleration__Group_3__0 )? ) )
            // InternalUseCase.g:5717:1: ( ( rule__ExceptionDecleration__Group_3__0 )? )
            {
            // InternalUseCase.g:5717:1: ( ( rule__ExceptionDecleration__Group_3__0 )? )
            // InternalUseCase.g:5718:2: ( rule__ExceptionDecleration__Group_3__0 )?
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup_3()); 
            // InternalUseCase.g:5719:2: ( rule__ExceptionDecleration__Group_3__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==81) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalUseCase.g:5719:3: rule__ExceptionDecleration__Group_3__0
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
    // InternalUseCase.g:5728:1: rule__ExceptionDecleration__Group_2__0 : rule__ExceptionDecleration__Group_2__0__Impl rule__ExceptionDecleration__Group_2__1 ;
    public final void rule__ExceptionDecleration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5732:1: ( rule__ExceptionDecleration__Group_2__0__Impl rule__ExceptionDecleration__Group_2__1 )
            // InternalUseCase.g:5733:2: rule__ExceptionDecleration__Group_2__0__Impl rule__ExceptionDecleration__Group_2__1
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
    // InternalUseCase.g:5740:1: rule__ExceptionDecleration__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExceptionDecleration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5744:1: ( ( '(' ) )
            // InternalUseCase.g:5745:1: ( '(' )
            {
            // InternalUseCase.g:5745:1: ( '(' )
            // InternalUseCase.g:5746:2: '('
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalUseCase.g:5755:1: rule__ExceptionDecleration__Group_2__1 : rule__ExceptionDecleration__Group_2__1__Impl rule__ExceptionDecleration__Group_2__2 ;
    public final void rule__ExceptionDecleration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5759:1: ( rule__ExceptionDecleration__Group_2__1__Impl rule__ExceptionDecleration__Group_2__2 )
            // InternalUseCase.g:5760:2: rule__ExceptionDecleration__Group_2__1__Impl rule__ExceptionDecleration__Group_2__2
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
    // InternalUseCase.g:5767:1: rule__ExceptionDecleration__Group_2__1__Impl : ( ( rule__ExceptionDecleration__MessageAssignment_2_1 ) ) ;
    public final void rule__ExceptionDecleration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5771:1: ( ( ( rule__ExceptionDecleration__MessageAssignment_2_1 ) ) )
            // InternalUseCase.g:5772:1: ( ( rule__ExceptionDecleration__MessageAssignment_2_1 ) )
            {
            // InternalUseCase.g:5772:1: ( ( rule__ExceptionDecleration__MessageAssignment_2_1 ) )
            // InternalUseCase.g:5773:2: ( rule__ExceptionDecleration__MessageAssignment_2_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getMessageAssignment_2_1()); 
            // InternalUseCase.g:5774:2: ( rule__ExceptionDecleration__MessageAssignment_2_1 )
            // InternalUseCase.g:5774:3: rule__ExceptionDecleration__MessageAssignment_2_1
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
    // InternalUseCase.g:5782:1: rule__ExceptionDecleration__Group_2__2 : rule__ExceptionDecleration__Group_2__2__Impl ;
    public final void rule__ExceptionDecleration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5786:1: ( rule__ExceptionDecleration__Group_2__2__Impl )
            // InternalUseCase.g:5787:2: rule__ExceptionDecleration__Group_2__2__Impl
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
    // InternalUseCase.g:5793:1: rule__ExceptionDecleration__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ExceptionDecleration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5797:1: ( ( ')' ) )
            // InternalUseCase.g:5798:1: ( ')' )
            {
            // InternalUseCase.g:5798:1: ( ')' )
            // InternalUseCase.g:5799:2: ')'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_2_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalUseCase.g:5809:1: rule__ExceptionDecleration__Group_3__0 : rule__ExceptionDecleration__Group_3__0__Impl rule__ExceptionDecleration__Group_3__1 ;
    public final void rule__ExceptionDecleration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5813:1: ( rule__ExceptionDecleration__Group_3__0__Impl rule__ExceptionDecleration__Group_3__1 )
            // InternalUseCase.g:5814:2: rule__ExceptionDecleration__Group_3__0__Impl rule__ExceptionDecleration__Group_3__1
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
    // InternalUseCase.g:5821:1: rule__ExceptionDecleration__Group_3__0__Impl : ( '[' ) ;
    public final void rule__ExceptionDecleration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5825:1: ( ( '[' ) )
            // InternalUseCase.g:5826:1: ( '[' )
            {
            // InternalUseCase.g:5826:1: ( '[' )
            // InternalUseCase.g:5827:2: '['
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalUseCase.g:5836:1: rule__ExceptionDecleration__Group_3__1 : rule__ExceptionDecleration__Group_3__1__Impl rule__ExceptionDecleration__Group_3__2 ;
    public final void rule__ExceptionDecleration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5840:1: ( rule__ExceptionDecleration__Group_3__1__Impl rule__ExceptionDecleration__Group_3__2 )
            // InternalUseCase.g:5841:2: rule__ExceptionDecleration__Group_3__1__Impl rule__ExceptionDecleration__Group_3__2
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
    // InternalUseCase.g:5848:1: rule__ExceptionDecleration__Group_3__1__Impl : ( ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 ) ) ;
    public final void rule__ExceptionDecleration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5852:1: ( ( ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 ) ) )
            // InternalUseCase.g:5853:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 ) )
            {
            // InternalUseCase.g:5853:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 ) )
            // InternalUseCase.g:5854:2: ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getImportInfoAssignment_3_1()); 
            // InternalUseCase.g:5855:2: ( rule__ExceptionDecleration__ImportInfoAssignment_3_1 )
            // InternalUseCase.g:5855:3: rule__ExceptionDecleration__ImportInfoAssignment_3_1
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
    // InternalUseCase.g:5863:1: rule__ExceptionDecleration__Group_3__2 : rule__ExceptionDecleration__Group_3__2__Impl ;
    public final void rule__ExceptionDecleration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5867:1: ( rule__ExceptionDecleration__Group_3__2__Impl )
            // InternalUseCase.g:5868:2: rule__ExceptionDecleration__Group_3__2__Impl
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
    // InternalUseCase.g:5874:1: rule__ExceptionDecleration__Group_3__2__Impl : ( ']' ) ;
    public final void rule__ExceptionDecleration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5878:1: ( ( ']' ) )
            // InternalUseCase.g:5879:1: ( ']' )
            {
            // InternalUseCase.g:5879:1: ( ']' )
            // InternalUseCase.g:5880:2: ']'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,82,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__CompanyAssignment_1"
    // InternalUseCase.g:5890:1: rule__Model__CompanyAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__CompanyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5894:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:5895:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:5895:2: ( ruleQualifiedName )
            // InternalUseCase.g:5896:3: ruleQualifiedName
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
    // InternalUseCase.g:5905:1: rule__Model__PackageAssignment_2 : ( rulePackage ) ;
    public final void rule__Model__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5909:1: ( ( rulePackage ) )
            // InternalUseCase.g:5910:2: ( rulePackage )
            {
            // InternalUseCase.g:5910:2: ( rulePackage )
            // InternalUseCase.g:5911:3: rulePackage
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
    // InternalUseCase.g:5920:1: rule__Model__UseCasesAssignment_3 : ( ruleUseCase ) ;
    public final void rule__Model__UseCasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5924:1: ( ( ruleUseCase ) )
            // InternalUseCase.g:5925:2: ( ruleUseCase )
            {
            // InternalUseCase.g:5925:2: ( ruleUseCase )
            // InternalUseCase.g:5926:3: ruleUseCase
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
    // InternalUseCase.g:5935:1: rule__Model__TypesAssignment_4 : ( ruleUsedTypes ) ;
    public final void rule__Model__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5939:1: ( ( ruleUsedTypes ) )
            // InternalUseCase.g:5940:2: ( ruleUsedTypes )
            {
            // InternalUseCase.g:5940:2: ( ruleUsedTypes )
            // InternalUseCase.g:5941:3: ruleUsedTypes
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
    // InternalUseCase.g:5950:1: rule__Model__ExceptionsAssignment_5 : ( ruleUsedExceptions ) ;
    public final void rule__Model__ExceptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5954:1: ( ( ruleUsedExceptions ) )
            // InternalUseCase.g:5955:2: ( ruleUsedExceptions )
            {
            // InternalUseCase.g:5955:2: ( ruleUsedExceptions )
            // InternalUseCase.g:5956:3: ruleUsedExceptions
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


    // $ANTLR start "rule__Package__PartsAssignment_1"
    // InternalUseCase.g:5965:1: rule__Package__PartsAssignment_1 : ( rulePackagePart ) ;
    public final void rule__Package__PartsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5969:1: ( ( rulePackagePart ) )
            // InternalUseCase.g:5970:2: ( rulePackagePart )
            {
            // InternalUseCase.g:5970:2: ( rulePackagePart )
            // InternalUseCase.g:5971:3: rulePackagePart
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
    // InternalUseCase.g:5980:1: rule__Package__PartsAssignment_2_1 : ( rulePackagePart ) ;
    public final void rule__Package__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5984:1: ( ( rulePackagePart ) )
            // InternalUseCase.g:5985:2: ( rulePackagePart )
            {
            // InternalUseCase.g:5985:2: ( rulePackagePart )
            // InternalUseCase.g:5986:3: rulePackagePart
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
    // InternalUseCase.g:5995:1: rule__PackagePart__NameAssignment : ( RULE_ID ) ;
    public final void rule__PackagePart__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5999:1: ( ( RULE_ID ) )
            // InternalUseCase.g:6000:2: ( RULE_ID )
            {
            // InternalUseCase.g:6000:2: ( RULE_ID )
            // InternalUseCase.g:6001:3: RULE_ID
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
    // InternalUseCase.g:6010:1: rule__UseCase__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6014:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6015:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6015:2: ( RULE_STRING )
            // InternalUseCase.g:6016:3: RULE_STRING
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
    // InternalUseCase.g:6025:1: rule__UseCase__DescriptionsAssignment_2 : ( ruleDescription ) ;
    public final void rule__UseCase__DescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6029:1: ( ( ruleDescription ) )
            // InternalUseCase.g:6030:2: ( ruleDescription )
            {
            // InternalUseCase.g:6030:2: ( ruleDescription )
            // InternalUseCase.g:6031:3: ruleDescription
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
    // InternalUseCase.g:6040:1: rule__UseCase__AllowedUserGroupsAssignment_3 : ( ruleAllowedUserGroups ) ;
    public final void rule__UseCase__AllowedUserGroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6044:1: ( ( ruleAllowedUserGroups ) )
            // InternalUseCase.g:6045:2: ( ruleAllowedUserGroups )
            {
            // InternalUseCase.g:6045:2: ( ruleAllowedUserGroups )
            // InternalUseCase.g:6046:3: ruleAllowedUserGroups
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
    // InternalUseCase.g:6055:1: rule__UseCase__InputsAssignment_4 : ( ruleInputs ) ;
    public final void rule__UseCase__InputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6059:1: ( ( ruleInputs ) )
            // InternalUseCase.g:6060:2: ( ruleInputs )
            {
            // InternalUseCase.g:6060:2: ( ruleInputs )
            // InternalUseCase.g:6061:3: ruleInputs
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
    // InternalUseCase.g:6070:1: rule__UseCase__OptionalInputsAssignment_5 : ( ruleOptionalInputs ) ;
    public final void rule__UseCase__OptionalInputsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6074:1: ( ( ruleOptionalInputs ) )
            // InternalUseCase.g:6075:2: ( ruleOptionalInputs )
            {
            // InternalUseCase.g:6075:2: ( ruleOptionalInputs )
            // InternalUseCase.g:6076:3: ruleOptionalInputs
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
    // InternalUseCase.g:6085:1: rule__UseCase__OutputsAssignment_6 : ( ruleOutputs ) ;
    public final void rule__UseCase__OutputsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6089:1: ( ( ruleOutputs ) )
            // InternalUseCase.g:6090:2: ( ruleOutputs )
            {
            // InternalUseCase.g:6090:2: ( ruleOutputs )
            // InternalUseCase.g:6091:3: ruleOutputs
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
    // InternalUseCase.g:6100:1: rule__UseCase__PreconditionsAssignment_7 : ( rulePreConditions ) ;
    public final void rule__UseCase__PreconditionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6104:1: ( ( rulePreConditions ) )
            // InternalUseCase.g:6105:2: ( rulePreConditions )
            {
            // InternalUseCase.g:6105:2: ( rulePreConditions )
            // InternalUseCase.g:6106:3: rulePreConditions
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
    // InternalUseCase.g:6115:1: rule__UseCase__StepsAssignment_8 : ( ruleSteps ) ;
    public final void rule__UseCase__StepsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6119:1: ( ( ruleSteps ) )
            // InternalUseCase.g:6120:2: ( ruleSteps )
            {
            // InternalUseCase.g:6120:2: ( ruleSteps )
            // InternalUseCase.g:6121:3: ruleSteps
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
    // InternalUseCase.g:6130:1: rule__UseCase__NotesAssignment_9 : ( ruleNotes ) ;
    public final void rule__UseCase__NotesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6134:1: ( ( ruleNotes ) )
            // InternalUseCase.g:6135:2: ( ruleNotes )
            {
            // InternalUseCase.g:6135:2: ( ruleNotes )
            // InternalUseCase.g:6136:3: ruleNotes
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
    // InternalUseCase.g:6145:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6149:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6150:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6150:2: ( RULE_STRING )
            // InternalUseCase.g:6151:3: RULE_STRING
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
    // InternalUseCase.g:6160:1: rule__AllowedUserGroups__GroupsAssignment_1 : ( ruleAllowedUserGroup ) ;
    public final void rule__AllowedUserGroups__GroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6164:1: ( ( ruleAllowedUserGroup ) )
            // InternalUseCase.g:6165:2: ( ruleAllowedUserGroup )
            {
            // InternalUseCase.g:6165:2: ( ruleAllowedUserGroup )
            // InternalUseCase.g:6166:3: ruleAllowedUserGroup
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
    // InternalUseCase.g:6175:1: rule__AllowedUserGroup__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__AllowedUserGroup__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6179:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:6180:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:6180:2: ( ( 'many' ) )
            // InternalUseCase.g:6181:3: ( 'many' )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:6182:3: ( 'many' )
            // InternalUseCase.g:6183:4: 'many'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalUseCase.g:6194:1: rule__AllowedUserGroup__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllowedUserGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6198:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6199:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6199:2: ( RULE_STRING )
            // InternalUseCase.g:6200:3: RULE_STRING
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
    // InternalUseCase.g:6209:1: rule__AllowedUserGroup__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllowedUserGroup__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6213:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:6214:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:6214:2: ( ( RULE_ID ) )
            // InternalUseCase.g:6215:3: ( RULE_ID )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:6216:3: ( RULE_ID )
            // InternalUseCase.g:6217:4: RULE_ID
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
    // InternalUseCase.g:6228:1: rule__Inputs__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Inputs__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6232:1: ( ( ruleInput ) )
            // InternalUseCase.g:6233:2: ( ruleInput )
            {
            // InternalUseCase.g:6233:2: ( ruleInput )
            // InternalUseCase.g:6234:3: ruleInput
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
    // InternalUseCase.g:6243:1: rule__OptionalInputs__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__OptionalInputs__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6247:1: ( ( ruleInput ) )
            // InternalUseCase.g:6248:2: ( ruleInput )
            {
            // InternalUseCase.g:6248:2: ( ruleInput )
            // InternalUseCase.g:6249:3: ruleInput
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
    // InternalUseCase.g:6258:1: rule__Input__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Input__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6262:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:6263:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:6263:2: ( ( 'many' ) )
            // InternalUseCase.g:6264:3: ( 'many' )
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:6265:3: ( 'many' )
            // InternalUseCase.g:6266:4: 'many'
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalUseCase.g:6277:1: rule__Input__OptionalAssignment_2 : ( ruleOptional ) ;
    public final void rule__Input__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6281:1: ( ( ruleOptional ) )
            // InternalUseCase.g:6282:2: ( ruleOptional )
            {
            // InternalUseCase.g:6282:2: ( ruleOptional )
            // InternalUseCase.g:6283:3: ruleOptional
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
    // InternalUseCase.g:6292:1: rule__Input__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Input__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6296:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6297:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6297:2: ( RULE_STRING )
            // InternalUseCase.g:6298:3: RULE_STRING
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
    // InternalUseCase.g:6307:1: rule__Input__TypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Input__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6311:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:6312:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:6312:2: ( ( RULE_ID ) )
            // InternalUseCase.g:6313:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getTypeTypeCrossReference_4_1_0()); 
            // InternalUseCase.g:6314:3: ( RULE_ID )
            // InternalUseCase.g:6315:4: RULE_ID
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
    // InternalUseCase.g:6326:1: rule__Input__ExampleAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Input__ExampleAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6330:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6331:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6331:2: ( RULE_STRING )
            // InternalUseCase.g:6332:3: RULE_STRING
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
    // InternalUseCase.g:6341:1: rule__Outputs__OutputsAssignment_1 : ( ruleOutput ) ;
    public final void rule__Outputs__OutputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6345:1: ( ( ruleOutput ) )
            // InternalUseCase.g:6346:2: ( ruleOutput )
            {
            // InternalUseCase.g:6346:2: ( ruleOutput )
            // InternalUseCase.g:6347:3: ruleOutput
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
    // InternalUseCase.g:6356:1: rule__Output__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Output__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6360:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:6361:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:6361:2: ( ( 'many' ) )
            // InternalUseCase.g:6362:3: ( 'many' )
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:6363:3: ( 'many' )
            // InternalUseCase.g:6364:4: 'many'
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalUseCase.g:6375:1: rule__Output__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6379:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6380:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6380:2: ( RULE_STRING )
            // InternalUseCase.g:6381:3: RULE_STRING
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
    // InternalUseCase.g:6390:1: rule__Output__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Output__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6394:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:6395:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:6395:2: ( ( RULE_ID ) )
            // InternalUseCase.g:6396:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:6397:3: ( RULE_ID )
            // InternalUseCase.g:6398:4: RULE_ID
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
    // InternalUseCase.g:6409:1: rule__Output__ExampleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Output__ExampleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6413:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6414:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6414:2: ( RULE_STRING )
            // InternalUseCase.g:6415:3: RULE_STRING
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
    // InternalUseCase.g:6424:1: rule__PreConditions__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__PreConditions__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6428:1: ( ( ruleCondition ) )
            // InternalUseCase.g:6429:2: ( ruleCondition )
            {
            // InternalUseCase.g:6429:2: ( ruleCondition )
            // InternalUseCase.g:6430:3: ruleCondition
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
    // InternalUseCase.g:6439:1: rule__Condition__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Condition__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6443:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6444:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6444:2: ( RULE_STRING )
            // InternalUseCase.g:6445:3: RULE_STRING
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
    // InternalUseCase.g:6454:1: rule__Steps__StepsAssignment_1 : ( ruleStep ) ;
    public final void rule__Steps__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6458:1: ( ( ruleStep ) )
            // InternalUseCase.g:6459:2: ( ruleStep )
            {
            // InternalUseCase.g:6459:2: ( ruleStep )
            // InternalUseCase.g:6460:3: ruleStep
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
    // InternalUseCase.g:6469:1: rule__Step__NumberAssignment_0 : ( ruleQualifiedNumber ) ;
    public final void rule__Step__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6473:1: ( ( ruleQualifiedNumber ) )
            // InternalUseCase.g:6474:2: ( ruleQualifiedNumber )
            {
            // InternalUseCase.g:6474:2: ( ruleQualifiedNumber )
            // InternalUseCase.g:6475:3: ruleQualifiedNumber
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
    // InternalUseCase.g:6484:1: rule__Step__ActionAssignment_1_0_0 : ( RULE_STRING ) ;
    public final void rule__Step__ActionAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6488:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6489:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6489:2: ( RULE_STRING )
            // InternalUseCase.g:6490:3: RULE_STRING
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
    // InternalUseCase.g:6499:1: rule__Step__ErrorAssignment_1_0_1 : ( ruleRaiseErrorConditional ) ;
    public final void rule__Step__ErrorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6503:1: ( ( ruleRaiseErrorConditional ) )
            // InternalUseCase.g:6504:2: ( ruleRaiseErrorConditional )
            {
            // InternalUseCase.g:6504:2: ( ruleRaiseErrorConditional )
            // InternalUseCase.g:6505:3: ruleRaiseErrorConditional
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
    // InternalUseCase.g:6514:1: rule__Step__ErrorAssignment_1_1 : ( ruleRaiseErrorConditional ) ;
    public final void rule__Step__ErrorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6518:1: ( ( ruleRaiseErrorConditional ) )
            // InternalUseCase.g:6519:2: ( ruleRaiseErrorConditional )
            {
            // InternalUseCase.g:6519:2: ( ruleRaiseErrorConditional )
            // InternalUseCase.g:6520:3: ruleRaiseErrorConditional
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
    // InternalUseCase.g:6529:1: rule__Step__ConditionAssignment_1_2 : ( ruleIfStatement ) ;
    public final void rule__Step__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6533:1: ( ( ruleIfStatement ) )
            // InternalUseCase.g:6534:2: ( ruleIfStatement )
            {
            // InternalUseCase.g:6534:2: ( ruleIfStatement )
            // InternalUseCase.g:6535:3: ruleIfStatement
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
    // InternalUseCase.g:6544:1: rule__Step__LoopAssignment_1_3 : ( ruleLoop ) ;
    public final void rule__Step__LoopAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6548:1: ( ( ruleLoop ) )
            // InternalUseCase.g:6549:2: ( ruleLoop )
            {
            // InternalUseCase.g:6549:2: ( ruleLoop )
            // InternalUseCase.g:6550:3: ruleLoop
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
    // InternalUseCase.g:6559:1: rule__Step__ExceptionAssignment_1_4 : ( ruleRaiseErrorNow ) ;
    public final void rule__Step__ExceptionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6563:1: ( ( ruleRaiseErrorNow ) )
            // InternalUseCase.g:6564:2: ( ruleRaiseErrorNow )
            {
            // InternalUseCase.g:6564:2: ( ruleRaiseErrorNow )
            // InternalUseCase.g:6565:3: ruleRaiseErrorNow
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
    // InternalUseCase.g:6574:1: rule__RaiseErrorConditional__ExceptionAssignment_2 : ( ruleException ) ;
    public final void rule__RaiseErrorConditional__ExceptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6578:1: ( ( ruleException ) )
            // InternalUseCase.g:6579:2: ( ruleException )
            {
            // InternalUseCase.g:6579:2: ( ruleException )
            // InternalUseCase.g:6580:3: ruleException
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
    // InternalUseCase.g:6589:1: rule__RaiseErrorNow__ExceptionAssignment_1 : ( ruleException ) ;
    public final void rule__RaiseErrorNow__ExceptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6593:1: ( ( ruleException ) )
            // InternalUseCase.g:6594:2: ( ruleException )
            {
            // InternalUseCase.g:6594:2: ( ruleException )
            // InternalUseCase.g:6595:3: ruleException
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
    // InternalUseCase.g:6604:1: rule__IfStatement__ConditionAssignment_1 : ( ruleBooleanCondition ) ;
    public final void rule__IfStatement__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6608:1: ( ( ruleBooleanCondition ) )
            // InternalUseCase.g:6609:2: ( ruleBooleanCondition )
            {
            // InternalUseCase.g:6609:2: ( ruleBooleanCondition )
            // InternalUseCase.g:6610:3: ruleBooleanCondition
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
    // InternalUseCase.g:6619:1: rule__Loop__ConditionAssignment_1 : ( ruleBooleanCondition ) ;
    public final void rule__Loop__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6623:1: ( ( ruleBooleanCondition ) )
            // InternalUseCase.g:6624:2: ( ruleBooleanCondition )
            {
            // InternalUseCase.g:6624:2: ( ruleBooleanCondition )
            // InternalUseCase.g:6625:3: ruleBooleanCondition
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
    // InternalUseCase.g:6634:1: rule__BooleanCondition__NameAssignment : ( RULE_STRING ) ;
    public final void rule__BooleanCondition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6638:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6639:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6639:2: ( RULE_STRING )
            // InternalUseCase.g:6640:3: RULE_STRING
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
    // InternalUseCase.g:6649:1: rule__Notes__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notes__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6653:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6654:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6654:2: ( RULE_STRING )
            // InternalUseCase.g:6655:3: RULE_STRING
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
    // InternalUseCase.g:6664:1: rule__UsedTypes__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__UsedTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6668:1: ( ( ruleType ) )
            // InternalUseCase.g:6669:2: ( ruleType )
            {
            // InternalUseCase.g:6669:2: ( ruleType )
            // InternalUseCase.g:6670:3: ruleType
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
    // InternalUseCase.g:6679:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6683:1: ( ( RULE_ID ) )
            // InternalUseCase.g:6684:2: ( RULE_ID )
            {
            // InternalUseCase.g:6684:2: ( RULE_ID )
            // InternalUseCase.g:6685:3: RULE_ID
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
    // InternalUseCase.g:6694:1: rule__Type__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Type__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6698:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6699:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6699:2: ( RULE_STRING )
            // InternalUseCase.g:6700:3: RULE_STRING
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
    // InternalUseCase.g:6709:1: rule__Type__ImportInfoAssignment_3_1 : ( ruleQualifiedName ) ;
    public final void rule__Type__ImportInfoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6713:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:6714:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:6714:2: ( ruleQualifiedName )
            // InternalUseCase.g:6715:3: ruleQualifiedName
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
    // InternalUseCase.g:6724:1: rule__UsedExceptions__ExceptionsAssignment_1 : ( ruleExceptionDecleration ) ;
    public final void rule__UsedExceptions__ExceptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6728:1: ( ( ruleExceptionDecleration ) )
            // InternalUseCase.g:6729:2: ( ruleExceptionDecleration )
            {
            // InternalUseCase.g:6729:2: ( ruleExceptionDecleration )
            // InternalUseCase.g:6730:3: ruleExceptionDecleration
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
    // InternalUseCase.g:6739:1: rule__Exception__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Exception__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6743:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:6744:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:6744:2: ( ( RULE_ID ) )
            // InternalUseCase.g:6745:3: ( RULE_ID )
            {
             before(grammarAccess.getExceptionAccess().getTypeExceptionDeclerationCrossReference_0()); 
            // InternalUseCase.g:6746:3: ( RULE_ID )
            // InternalUseCase.g:6747:4: RULE_ID
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
    // InternalUseCase.g:6758:1: rule__ExceptionDecleration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExceptionDecleration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6762:1: ( ( RULE_ID ) )
            // InternalUseCase.g:6763:2: ( RULE_ID )
            {
            // InternalUseCase.g:6763:2: ( RULE_ID )
            // InternalUseCase.g:6764:3: RULE_ID
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
    // InternalUseCase.g:6773:1: rule__ExceptionDecleration__MessageAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ExceptionDecleration__MessageAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6777:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6778:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6778:2: ( RULE_STRING )
            // InternalUseCase.g:6779:3: RULE_STRING
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
    // InternalUseCase.g:6788:1: rule__ExceptionDecleration__ImportInfoAssignment_3_1 : ( ruleQualifiedName ) ;
    public final void rule__ExceptionDecleration__ImportInfoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6792:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:6793:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:6793:2: ( ruleQualifiedName )
            // InternalUseCase.g:6794:3: ruleQualifiedName
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L,0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x224AF03FC3FC0800L,0x0000000000000009L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0100000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0100000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000C000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000FC000000040L,0x0000000000001800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});

}