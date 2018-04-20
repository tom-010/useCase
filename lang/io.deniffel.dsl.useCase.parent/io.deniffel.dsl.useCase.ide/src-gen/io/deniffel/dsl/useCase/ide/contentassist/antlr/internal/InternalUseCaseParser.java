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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'optional'", "'Firma'", "'Company'", "'Kathegorie'", "'package'", "'use-case'", "'Rezept'", "'description:'", "'Kurzbeschreibung:'", "'Beschreibung'", "'allowed-usergroups:'", "'requires:'", "'require:'", "'as'", "'als'", "'e.g'", "'z.B.'", "'Ergebnis:'", "'produces:'", "'produce:'", "'Vorbedingungen:'", "'pre-condition:'", "'pre-conditions:'", "'steps:'", "'Schritte:'", "'.'", "':'", "'notes:'", "'note:'", "'Anmerkungen:'", "'Anmerkung:'", "'>'", "'end'", "'of'", "'Ende'", "'des'", "'Rezpets'", "'Erlaubt'", "'f\\u00FCr:'", "'-'", "'requires'", "'the'", "'following'", "'input'", "'Ben\\u00F6tigte'", "'Zutaten'", "'('", "')'", "'produces'", "'output'", "'Raise'", "'error'", "'On'", "'raise'", "'Melde'", "'Fehler'", "'Bei'", "'melde'", "'used'", "'types:'", "'Genutzte'", "'Typen:'", "'['", "']'", "'errors:'", "'Fehler:'", "'many'"
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


    // $ANTLR start "entryRuleInput"
    // InternalUseCase.g:303:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalUseCase.g:304:1: ( ruleInput EOF )
            // InternalUseCase.g:305:1: ruleInput EOF
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
    // InternalUseCase.g:312:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:316:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalUseCase.g:317:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalUseCase.g:317:2: ( ( rule__Input__Group__0 ) )
            // InternalUseCase.g:318:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalUseCase.g:319:3: ( rule__Input__Group__0 )
            // InternalUseCase.g:319:4: rule__Input__Group__0
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
    // InternalUseCase.g:328:1: entryRuleOutputs : ruleOutputs EOF ;
    public final void entryRuleOutputs() throws RecognitionException {
        try {
            // InternalUseCase.g:329:1: ( ruleOutputs EOF )
            // InternalUseCase.g:330:1: ruleOutputs EOF
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
    // InternalUseCase.g:337:1: ruleOutputs : ( ( rule__Outputs__Group__0 ) ) ;
    public final void ruleOutputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:341:2: ( ( ( rule__Outputs__Group__0 ) ) )
            // InternalUseCase.g:342:2: ( ( rule__Outputs__Group__0 ) )
            {
            // InternalUseCase.g:342:2: ( ( rule__Outputs__Group__0 ) )
            // InternalUseCase.g:343:3: ( rule__Outputs__Group__0 )
            {
             before(grammarAccess.getOutputsAccess().getGroup()); 
            // InternalUseCase.g:344:3: ( rule__Outputs__Group__0 )
            // InternalUseCase.g:344:4: rule__Outputs__Group__0
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
    // InternalUseCase.g:353:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalUseCase.g:354:1: ( ruleOutput EOF )
            // InternalUseCase.g:355:1: ruleOutput EOF
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
    // InternalUseCase.g:362:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:366:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalUseCase.g:367:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalUseCase.g:367:2: ( ( rule__Output__Group__0 ) )
            // InternalUseCase.g:368:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalUseCase.g:369:3: ( rule__Output__Group__0 )
            // InternalUseCase.g:369:4: rule__Output__Group__0
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
    // InternalUseCase.g:378:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // InternalUseCase.g:379:1: ( ruleOptional EOF )
            // InternalUseCase.g:380:1: ruleOptional EOF
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
    // InternalUseCase.g:387:1: ruleOptional : ( 'optional' ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:391:2: ( ( 'optional' ) )
            // InternalUseCase.g:392:2: ( 'optional' )
            {
            // InternalUseCase.g:392:2: ( 'optional' )
            // InternalUseCase.g:393:3: 'optional'
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
    // InternalUseCase.g:403:1: entryRulePreConditions : rulePreConditions EOF ;
    public final void entryRulePreConditions() throws RecognitionException {
        try {
            // InternalUseCase.g:404:1: ( rulePreConditions EOF )
            // InternalUseCase.g:405:1: rulePreConditions EOF
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
    // InternalUseCase.g:412:1: rulePreConditions : ( ( rule__PreConditions__Group__0 ) ) ;
    public final void rulePreConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:416:2: ( ( ( rule__PreConditions__Group__0 ) ) )
            // InternalUseCase.g:417:2: ( ( rule__PreConditions__Group__0 ) )
            {
            // InternalUseCase.g:417:2: ( ( rule__PreConditions__Group__0 ) )
            // InternalUseCase.g:418:3: ( rule__PreConditions__Group__0 )
            {
             before(grammarAccess.getPreConditionsAccess().getGroup()); 
            // InternalUseCase.g:419:3: ( rule__PreConditions__Group__0 )
            // InternalUseCase.g:419:4: rule__PreConditions__Group__0
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
    // InternalUseCase.g:428:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalUseCase.g:429:1: ( ruleCondition EOF )
            // InternalUseCase.g:430:1: ruleCondition EOF
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
    // InternalUseCase.g:437:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:441:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalUseCase.g:442:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalUseCase.g:442:2: ( ( rule__Condition__Group__0 ) )
            // InternalUseCase.g:443:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalUseCase.g:444:3: ( rule__Condition__Group__0 )
            // InternalUseCase.g:444:4: rule__Condition__Group__0
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
    // InternalUseCase.g:453:1: entryRuleSteps : ruleSteps EOF ;
    public final void entryRuleSteps() throws RecognitionException {
        try {
            // InternalUseCase.g:454:1: ( ruleSteps EOF )
            // InternalUseCase.g:455:1: ruleSteps EOF
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
    // InternalUseCase.g:462:1: ruleSteps : ( ( rule__Steps__Group__0 ) ) ;
    public final void ruleSteps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:466:2: ( ( ( rule__Steps__Group__0 ) ) )
            // InternalUseCase.g:467:2: ( ( rule__Steps__Group__0 ) )
            {
            // InternalUseCase.g:467:2: ( ( rule__Steps__Group__0 ) )
            // InternalUseCase.g:468:3: ( rule__Steps__Group__0 )
            {
             before(grammarAccess.getStepsAccess().getGroup()); 
            // InternalUseCase.g:469:3: ( rule__Steps__Group__0 )
            // InternalUseCase.g:469:4: rule__Steps__Group__0
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
    // InternalUseCase.g:478:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalUseCase.g:479:1: ( ruleStep EOF )
            // InternalUseCase.g:480:1: ruleStep EOF
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
    // InternalUseCase.g:487:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:491:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalUseCase.g:492:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalUseCase.g:492:2: ( ( rule__Step__Group__0 ) )
            // InternalUseCase.g:493:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalUseCase.g:494:3: ( rule__Step__Group__0 )
            // InternalUseCase.g:494:4: rule__Step__Group__0
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


    // $ANTLR start "entryRuleRaiseError"
    // InternalUseCase.g:503:1: entryRuleRaiseError : ruleRaiseError EOF ;
    public final void entryRuleRaiseError() throws RecognitionException {
        try {
            // InternalUseCase.g:504:1: ( ruleRaiseError EOF )
            // InternalUseCase.g:505:1: ruleRaiseError EOF
            {
             before(grammarAccess.getRaiseErrorRule()); 
            pushFollow(FOLLOW_1);
            ruleRaiseError();

            state._fsp--;

             after(grammarAccess.getRaiseErrorRule()); 
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
    // $ANTLR end "entryRuleRaiseError"


    // $ANTLR start "ruleRaiseError"
    // InternalUseCase.g:512:1: ruleRaiseError : ( ( rule__RaiseError__Group__0 ) ) ;
    public final void ruleRaiseError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:516:2: ( ( ( rule__RaiseError__Group__0 ) ) )
            // InternalUseCase.g:517:2: ( ( rule__RaiseError__Group__0 ) )
            {
            // InternalUseCase.g:517:2: ( ( rule__RaiseError__Group__0 ) )
            // InternalUseCase.g:518:3: ( rule__RaiseError__Group__0 )
            {
             before(grammarAccess.getRaiseErrorAccess().getGroup()); 
            // InternalUseCase.g:519:3: ( rule__RaiseError__Group__0 )
            // InternalUseCase.g:519:4: rule__RaiseError__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RaiseError__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRaiseErrorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRaiseError"


    // $ANTLR start "entryRuleNotes"
    // InternalUseCase.g:528:1: entryRuleNotes : ruleNotes EOF ;
    public final void entryRuleNotes() throws RecognitionException {
        try {
            // InternalUseCase.g:529:1: ( ruleNotes EOF )
            // InternalUseCase.g:530:1: ruleNotes EOF
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
    // InternalUseCase.g:537:1: ruleNotes : ( ( rule__Notes__Group__0 ) ) ;
    public final void ruleNotes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:541:2: ( ( ( rule__Notes__Group__0 ) ) )
            // InternalUseCase.g:542:2: ( ( rule__Notes__Group__0 ) )
            {
            // InternalUseCase.g:542:2: ( ( rule__Notes__Group__0 ) )
            // InternalUseCase.g:543:3: ( rule__Notes__Group__0 )
            {
             before(grammarAccess.getNotesAccess().getGroup()); 
            // InternalUseCase.g:544:3: ( rule__Notes__Group__0 )
            // InternalUseCase.g:544:4: rule__Notes__Group__0
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
    // InternalUseCase.g:553:1: entryRuleUsedTypes : ruleUsedTypes EOF ;
    public final void entryRuleUsedTypes() throws RecognitionException {
        try {
            // InternalUseCase.g:554:1: ( ruleUsedTypes EOF )
            // InternalUseCase.g:555:1: ruleUsedTypes EOF
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
    // InternalUseCase.g:562:1: ruleUsedTypes : ( ( rule__UsedTypes__Group__0 ) ) ;
    public final void ruleUsedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:566:2: ( ( ( rule__UsedTypes__Group__0 ) ) )
            // InternalUseCase.g:567:2: ( ( rule__UsedTypes__Group__0 ) )
            {
            // InternalUseCase.g:567:2: ( ( rule__UsedTypes__Group__0 ) )
            // InternalUseCase.g:568:3: ( rule__UsedTypes__Group__0 )
            {
             before(grammarAccess.getUsedTypesAccess().getGroup()); 
            // InternalUseCase.g:569:3: ( rule__UsedTypes__Group__0 )
            // InternalUseCase.g:569:4: rule__UsedTypes__Group__0
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
    // InternalUseCase.g:578:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUseCase.g:579:1: ( ruleType EOF )
            // InternalUseCase.g:580:1: ruleType EOF
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
    // InternalUseCase.g:587:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:591:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalUseCase.g:592:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalUseCase.g:592:2: ( ( rule__Type__Group__0 ) )
            // InternalUseCase.g:593:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalUseCase.g:594:3: ( rule__Type__Group__0 )
            // InternalUseCase.g:594:4: rule__Type__Group__0
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
    // InternalUseCase.g:603:1: entryRuleUsedExceptions : ruleUsedExceptions EOF ;
    public final void entryRuleUsedExceptions() throws RecognitionException {
        try {
            // InternalUseCase.g:604:1: ( ruleUsedExceptions EOF )
            // InternalUseCase.g:605:1: ruleUsedExceptions EOF
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
    // InternalUseCase.g:612:1: ruleUsedExceptions : ( ( rule__UsedExceptions__Group__0 ) ) ;
    public final void ruleUsedExceptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:616:2: ( ( ( rule__UsedExceptions__Group__0 ) ) )
            // InternalUseCase.g:617:2: ( ( rule__UsedExceptions__Group__0 ) )
            {
            // InternalUseCase.g:617:2: ( ( rule__UsedExceptions__Group__0 ) )
            // InternalUseCase.g:618:3: ( rule__UsedExceptions__Group__0 )
            {
             before(grammarAccess.getUsedExceptionsAccess().getGroup()); 
            // InternalUseCase.g:619:3: ( rule__UsedExceptions__Group__0 )
            // InternalUseCase.g:619:4: rule__UsedExceptions__Group__0
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
    // InternalUseCase.g:628:1: entryRuleException : ruleException EOF ;
    public final void entryRuleException() throws RecognitionException {
        try {
            // InternalUseCase.g:629:1: ( ruleException EOF )
            // InternalUseCase.g:630:1: ruleException EOF
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
    // InternalUseCase.g:637:1: ruleException : ( ( rule__Exception__TypeAssignment ) ) ;
    public final void ruleException() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:641:2: ( ( ( rule__Exception__TypeAssignment ) ) )
            // InternalUseCase.g:642:2: ( ( rule__Exception__TypeAssignment ) )
            {
            // InternalUseCase.g:642:2: ( ( rule__Exception__TypeAssignment ) )
            // InternalUseCase.g:643:3: ( rule__Exception__TypeAssignment )
            {
             before(grammarAccess.getExceptionAccess().getTypeAssignment()); 
            // InternalUseCase.g:644:3: ( rule__Exception__TypeAssignment )
            // InternalUseCase.g:644:4: rule__Exception__TypeAssignment
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
    // InternalUseCase.g:653:1: entryRuleExceptionDecleration : ruleExceptionDecleration EOF ;
    public final void entryRuleExceptionDecleration() throws RecognitionException {
        try {
            // InternalUseCase.g:654:1: ( ruleExceptionDecleration EOF )
            // InternalUseCase.g:655:1: ruleExceptionDecleration EOF
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
    // InternalUseCase.g:662:1: ruleExceptionDecleration : ( ( rule__ExceptionDecleration__Group__0 ) ) ;
    public final void ruleExceptionDecleration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:666:2: ( ( ( rule__ExceptionDecleration__Group__0 ) ) )
            // InternalUseCase.g:667:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            {
            // InternalUseCase.g:667:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            // InternalUseCase.g:668:3: ( rule__ExceptionDecleration__Group__0 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup()); 
            // InternalUseCase.g:669:3: ( rule__ExceptionDecleration__Group__0 )
            // InternalUseCase.g:669:4: rule__ExceptionDecleration__Group__0
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
    // InternalUseCase.g:677:1: rule__Model__Alternatives_0 : ( ( 'Firma' ) | ( 'Company' ) );
    public final void rule__Model__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:681:1: ( ( 'Firma' ) | ( 'Company' ) )
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
                    // InternalUseCase.g:682:2: ( 'Firma' )
                    {
                    // InternalUseCase.g:682:2: ( 'Firma' )
                    // InternalUseCase.g:683:3: 'Firma'
                    {
                     before(grammarAccess.getModelAccess().getFirmaKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getFirmaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:688:2: ( 'Company' )
                    {
                    // InternalUseCase.g:688:2: ( 'Company' )
                    // InternalUseCase.g:689:3: 'Company'
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
    // InternalUseCase.g:698:1: rule__Package__Alternatives_0 : ( ( 'Kathegorie' ) | ( 'package' ) );
    public final void rule__Package__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:702:1: ( ( 'Kathegorie' ) | ( 'package' ) )
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
                    // InternalUseCase.g:703:2: ( 'Kathegorie' )
                    {
                    // InternalUseCase.g:703:2: ( 'Kathegorie' )
                    // InternalUseCase.g:704:3: 'Kathegorie'
                    {
                     before(grammarAccess.getPackageAccess().getKathegorieKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getKathegorieKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:709:2: ( 'package' )
                    {
                    // InternalUseCase.g:709:2: ( 'package' )
                    // InternalUseCase.g:710:3: 'package'
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
    // InternalUseCase.g:719:1: rule__UseCase__Alternatives_0 : ( ( 'use-case' ) | ( 'Rezept' ) );
    public final void rule__UseCase__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:723:1: ( ( 'use-case' ) | ( 'Rezept' ) )
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
                    // InternalUseCase.g:724:2: ( 'use-case' )
                    {
                    // InternalUseCase.g:724:2: ( 'use-case' )
                    // InternalUseCase.g:725:3: 'use-case'
                    {
                     before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:730:2: ( 'Rezept' )
                    {
                    // InternalUseCase.g:730:2: ( 'Rezept' )
                    // InternalUseCase.g:731:3: 'Rezept'
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


    // $ANTLR start "rule__UseCase__Alternatives_9"
    // InternalUseCase.g:740:1: rule__UseCase__Alternatives_9 : ( ( ( rule__UseCase__Group_9_0__0 ) ) | ( ( rule__UseCase__Group_9_1__0 ) ) );
    public final void rule__UseCase__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:744:1: ( ( ( rule__UseCase__Group_9_0__0 ) ) | ( ( rule__UseCase__Group_9_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==43) ) {
                alt4=1;
            }
            else if ( (LA4_0==45) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:745:2: ( ( rule__UseCase__Group_9_0__0 ) )
                    {
                    // InternalUseCase.g:745:2: ( ( rule__UseCase__Group_9_0__0 ) )
                    // InternalUseCase.g:746:3: ( rule__UseCase__Group_9_0__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_9_0()); 
                    // InternalUseCase.g:747:3: ( rule__UseCase__Group_9_0__0 )
                    // InternalUseCase.g:747:4: rule__UseCase__Group_9_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_9_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseAccess().getGroup_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:751:2: ( ( rule__UseCase__Group_9_1__0 ) )
                    {
                    // InternalUseCase.g:751:2: ( ( rule__UseCase__Group_9_1__0 ) )
                    // InternalUseCase.g:752:3: ( rule__UseCase__Group_9_1__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_9_1()); 
                    // InternalUseCase.g:753:3: ( rule__UseCase__Group_9_1__0 )
                    // InternalUseCase.g:753:4: rule__UseCase__Group_9_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_9_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseAccess().getGroup_9_1()); 

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
    // $ANTLR end "rule__UseCase__Alternatives_9"


    // $ANTLR start "rule__Description__Alternatives_0"
    // InternalUseCase.g:761:1: rule__Description__Alternatives_0 : ( ( 'description:' ) | ( 'Kurzbeschreibung:' ) | ( 'Beschreibung' ) );
    public final void rule__Description__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:765:1: ( ( 'description:' ) | ( 'Kurzbeschreibung:' ) | ( 'Beschreibung' ) )
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
                    // InternalUseCase.g:766:2: ( 'description:' )
                    {
                    // InternalUseCase.g:766:2: ( 'description:' )
                    // InternalUseCase.g:767:3: 'description:'
                    {
                     before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:772:2: ( 'Kurzbeschreibung:' )
                    {
                    // InternalUseCase.g:772:2: ( 'Kurzbeschreibung:' )
                    // InternalUseCase.g:773:3: 'Kurzbeschreibung:'
                    {
                     before(grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:778:2: ( 'Beschreibung' )
                    {
                    // InternalUseCase.g:778:2: ( 'Beschreibung' )
                    // InternalUseCase.g:779:3: 'Beschreibung'
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
    // InternalUseCase.g:788:1: rule__AllowedUserGroups__Alternatives_0 : ( ( 'allowed-usergroups:' ) | ( ( rule__AllowedUserGroups__Group_0_1__0 ) ) );
    public final void rule__AllowedUserGroups__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:792:1: ( ( 'allowed-usergroups:' ) | ( ( rule__AllowedUserGroups__Group_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==48) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:793:2: ( 'allowed-usergroups:' )
                    {
                    // InternalUseCase.g:793:2: ( 'allowed-usergroups:' )
                    // InternalUseCase.g:794:3: 'allowed-usergroups:'
                    {
                     before(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:799:2: ( ( rule__AllowedUserGroups__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:799:2: ( ( rule__AllowedUserGroups__Group_0_1__0 ) )
                    // InternalUseCase.g:800:3: ( rule__AllowedUserGroups__Group_0_1__0 )
                    {
                     before(grammarAccess.getAllowedUserGroupsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:801:3: ( rule__AllowedUserGroups__Group_0_1__0 )
                    // InternalUseCase.g:801:4: rule__AllowedUserGroups__Group_0_1__0
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
    // InternalUseCase.g:809:1: rule__Inputs__Alternatives_0 : ( ( ( rule__Inputs__Alternatives_0_0 ) ) | ( ( rule__Inputs__Group_0_1__0 ) ) );
    public final void rule__Inputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:813:1: ( ( ( rule__Inputs__Alternatives_0_0 ) ) | ( ( rule__Inputs__Group_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=22 && LA7_0<=23)||LA7_0==51) ) {
                alt7=1;
            }
            else if ( (LA7_0==55) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:814:2: ( ( rule__Inputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:814:2: ( ( rule__Inputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:815:3: ( rule__Inputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getInputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:816:3: ( rule__Inputs__Alternatives_0_0 )
                    // InternalUseCase.g:816:4: rule__Inputs__Alternatives_0_0
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
                    // InternalUseCase.g:820:2: ( ( rule__Inputs__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:820:2: ( ( rule__Inputs__Group_0_1__0 ) )
                    // InternalUseCase.g:821:3: ( rule__Inputs__Group_0_1__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:822:3: ( rule__Inputs__Group_0_1__0 )
                    // InternalUseCase.g:822:4: rule__Inputs__Group_0_1__0
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
    // InternalUseCase.g:830:1: rule__Inputs__Alternatives_0_0 : ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_0_2__0 ) ) );
    public final void rule__Inputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:834:1: ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_0_2__0 ) ) )
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
            case 51:
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
                    // InternalUseCase.g:835:2: ( 'requires:' )
                    {
                    // InternalUseCase.g:835:2: ( 'requires:' )
                    // InternalUseCase.g:836:3: 'requires:'
                    {
                     before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:841:2: ( 'require:' )
                    {
                    // InternalUseCase.g:841:2: ( 'require:' )
                    // InternalUseCase.g:842:3: 'require:'
                    {
                     before(grammarAccess.getInputsAccess().getRequireKeyword_0_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequireKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:847:2: ( ( rule__Inputs__Group_0_0_2__0 ) )
                    {
                    // InternalUseCase.g:847:2: ( ( rule__Inputs__Group_0_0_2__0 ) )
                    // InternalUseCase.g:848:3: ( rule__Inputs__Group_0_0_2__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_0_2()); 
                    // InternalUseCase.g:849:3: ( rule__Inputs__Group_0_0_2__0 )
                    // InternalUseCase.g:849:4: rule__Inputs__Group_0_0_2__0
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


    // $ANTLR start "rule__Input__Alternatives_4_0"
    // InternalUseCase.g:857:1: rule__Input__Alternatives_4_0 : ( ( 'as' ) | ( 'als' ) );
    public final void rule__Input__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:861:1: ( ( 'as' ) | ( 'als' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUseCase.g:862:2: ( 'as' )
                    {
                    // InternalUseCase.g:862:2: ( 'as' )
                    // InternalUseCase.g:863:3: 'as'
                    {
                     before(grammarAccess.getInputAccess().getAsKeyword_4_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getAsKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:868:2: ( 'als' )
                    {
                    // InternalUseCase.g:868:2: ( 'als' )
                    // InternalUseCase.g:869:3: 'als'
                    {
                     before(grammarAccess.getInputAccess().getAlsKeyword_4_0_1()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalUseCase.g:878:1: rule__Input__Alternatives_5_1 : ( ( 'e.g' ) | ( 'z.B.' ) );
    public final void rule__Input__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:882:1: ( ( 'e.g' ) | ( 'z.B.' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCase.g:883:2: ( 'e.g' )
                    {
                    // InternalUseCase.g:883:2: ( 'e.g' )
                    // InternalUseCase.g:884:3: 'e.g'
                    {
                     before(grammarAccess.getInputAccess().getEGKeyword_5_1_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getEGKeyword_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:889:2: ( 'z.B.' )
                    {
                    // InternalUseCase.g:889:2: ( 'z.B.' )
                    // InternalUseCase.g:890:3: 'z.B.'
                    {
                     before(grammarAccess.getInputAccess().getZBKeyword_5_1_1()); 
                    match(input,27,FOLLOW_2); 
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
    // InternalUseCase.g:899:1: rule__Outputs__Alternatives_0 : ( ( ( rule__Outputs__Alternatives_0_0 ) ) | ( 'Ergebnis:' ) );
    public final void rule__Outputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:903:1: ( ( ( rule__Outputs__Alternatives_0_0 ) ) | ( 'Ergebnis:' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=29 && LA11_0<=30)||LA11_0==59) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:904:2: ( ( rule__Outputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:904:2: ( ( rule__Outputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:905:3: ( rule__Outputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getOutputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:906:3: ( rule__Outputs__Alternatives_0_0 )
                    // InternalUseCase.g:906:4: rule__Outputs__Alternatives_0_0
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
                    // InternalUseCase.g:910:2: ( 'Ergebnis:' )
                    {
                    // InternalUseCase.g:910:2: ( 'Ergebnis:' )
                    // InternalUseCase.g:911:3: 'Ergebnis:'
                    {
                     before(grammarAccess.getOutputsAccess().getErgebnisKeyword_0_1()); 
                    match(input,28,FOLLOW_2); 
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
    // InternalUseCase.g:920:1: rule__Outputs__Alternatives_0_0 : ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_0_2__0 ) ) );
    public final void rule__Outputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:924:1: ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_0_2__0 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 59:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUseCase.g:925:2: ( 'produces:' )
                    {
                    // InternalUseCase.g:925:2: ( 'produces:' )
                    // InternalUseCase.g:926:3: 'produces:'
                    {
                     before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:931:2: ( 'produce:' )
                    {
                    // InternalUseCase.g:931:2: ( 'produce:' )
                    // InternalUseCase.g:932:3: 'produce:'
                    {
                     before(grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:937:2: ( ( rule__Outputs__Group_0_0_2__0 ) )
                    {
                    // InternalUseCase.g:937:2: ( ( rule__Outputs__Group_0_0_2__0 ) )
                    // InternalUseCase.g:938:3: ( rule__Outputs__Group_0_0_2__0 )
                    {
                     before(grammarAccess.getOutputsAccess().getGroup_0_0_2()); 
                    // InternalUseCase.g:939:3: ( rule__Outputs__Group_0_0_2__0 )
                    // InternalUseCase.g:939:4: rule__Outputs__Group_0_0_2__0
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
    // InternalUseCase.g:947:1: rule__Output__Alternatives_3_0 : ( ( 'as' ) | ( 'als' ) );
    public final void rule__Output__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:951:1: ( ( 'as' ) | ( 'als' ) )
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
                    // InternalUseCase.g:952:2: ( 'as' )
                    {
                    // InternalUseCase.g:952:2: ( 'as' )
                    // InternalUseCase.g:953:3: 'as'
                    {
                     before(grammarAccess.getOutputAccess().getAsKeyword_3_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getAsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:958:2: ( 'als' )
                    {
                    // InternalUseCase.g:958:2: ( 'als' )
                    // InternalUseCase.g:959:3: 'als'
                    {
                     before(grammarAccess.getOutputAccess().getAlsKeyword_3_0_1()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalUseCase.g:968:1: rule__Output__Alternatives_4_1 : ( ( 'e.g' ) | ( 'z.B.' ) );
    public final void rule__Output__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:972:1: ( ( 'e.g' ) | ( 'z.B.' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCase.g:973:2: ( 'e.g' )
                    {
                    // InternalUseCase.g:973:2: ( 'e.g' )
                    // InternalUseCase.g:974:3: 'e.g'
                    {
                     before(grammarAccess.getOutputAccess().getEGKeyword_4_1_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getEGKeyword_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:979:2: ( 'z.B.' )
                    {
                    // InternalUseCase.g:979:2: ( 'z.B.' )
                    // InternalUseCase.g:980:3: 'z.B.'
                    {
                     before(grammarAccess.getOutputAccess().getZBKeyword_4_1_1()); 
                    match(input,27,FOLLOW_2); 
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
    // InternalUseCase.g:989:1: rule__PreConditions__Alternatives_0 : ( ( ( rule__PreConditions__Alternatives_0_0 ) ) | ( 'Vorbedingungen:' ) );
    public final void rule__PreConditions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:993:1: ( ( ( rule__PreConditions__Alternatives_0_0 ) ) | ( 'Vorbedingungen:' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=32 && LA15_0<=33)) ) {
                alt15=1;
            }
            else if ( (LA15_0==31) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalUseCase.g:994:2: ( ( rule__PreConditions__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:994:2: ( ( rule__PreConditions__Alternatives_0_0 ) )
                    // InternalUseCase.g:995:3: ( rule__PreConditions__Alternatives_0_0 )
                    {
                     before(grammarAccess.getPreConditionsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:996:3: ( rule__PreConditions__Alternatives_0_0 )
                    // InternalUseCase.g:996:4: rule__PreConditions__Alternatives_0_0
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
                    // InternalUseCase.g:1000:2: ( 'Vorbedingungen:' )
                    {
                    // InternalUseCase.g:1000:2: ( 'Vorbedingungen:' )
                    // InternalUseCase.g:1001:3: 'Vorbedingungen:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getVorbedingungenKeyword_0_1()); 
                    match(input,31,FOLLOW_2); 
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
    // InternalUseCase.g:1010:1: rule__PreConditions__Alternatives_0_0 : ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) );
    public final void rule__PreConditions__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1014:1: ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalUseCase.g:1015:2: ( 'pre-condition:' )
                    {
                    // InternalUseCase.g:1015:2: ( 'pre-condition:' )
                    // InternalUseCase.g:1016:3: 'pre-condition:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1021:2: ( 'pre-conditions:' )
                    {
                    // InternalUseCase.g:1021:2: ( 'pre-conditions:' )
                    // InternalUseCase.g:1022:3: 'pre-conditions:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getPreConditionsKeyword_0_0_1()); 
                    match(input,33,FOLLOW_2); 
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
    // InternalUseCase.g:1031:1: rule__Steps__Alternatives_0 : ( ( 'steps:' ) | ( 'Schritte:' ) );
    public final void rule__Steps__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1035:1: ( ( 'steps:' ) | ( 'Schritte:' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCase.g:1036:2: ( 'steps:' )
                    {
                    // InternalUseCase.g:1036:2: ( 'steps:' )
                    // InternalUseCase.g:1037:3: 'steps:'
                    {
                     before(grammarAccess.getStepsAccess().getStepsKeyword_0_0()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getStepsAccess().getStepsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1042:2: ( 'Schritte:' )
                    {
                    // InternalUseCase.g:1042:2: ( 'Schritte:' )
                    // InternalUseCase.g:1043:3: 'Schritte:'
                    {
                     before(grammarAccess.getStepsAccess().getSchritteKeyword_0_1()); 
                    match(input,35,FOLLOW_2); 
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


    // $ANTLR start "rule__RaiseError__Alternatives_0"
    // InternalUseCase.g:1052:1: rule__RaiseError__Alternatives_0 : ( ( '.' ) | ( ':' ) );
    public final void rule__RaiseError__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1056:1: ( ( '.' ) | ( ':' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            else if ( (LA18_0==37) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCase.g:1057:2: ( '.' )
                    {
                    // InternalUseCase.g:1057:2: ( '.' )
                    // InternalUseCase.g:1058:3: '.'
                    {
                     before(grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1063:2: ( ':' )
                    {
                    // InternalUseCase.g:1063:2: ( ':' )
                    // InternalUseCase.g:1064:3: ':'
                    {
                     before(grammarAccess.getRaiseErrorAccess().getColonKeyword_0_1()); 
                    match(input,37,FOLLOW_2); 
                     after(grammarAccess.getRaiseErrorAccess().getColonKeyword_0_1()); 

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
    // $ANTLR end "rule__RaiseError__Alternatives_0"


    // $ANTLR start "rule__RaiseError__Alternatives_1"
    // InternalUseCase.g:1073:1: rule__RaiseError__Alternatives_1 : ( ( ( rule__RaiseError__Alternatives_1_0 ) ) | ( ( rule__RaiseError__Alternatives_1_1 ) ) );
    public final void rule__RaiseError__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1077:1: ( ( ( rule__RaiseError__Alternatives_1_0 ) ) | ( ( rule__RaiseError__Alternatives_1_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==61||LA19_0==63) ) {
                alt19=1;
            }
            else if ( (LA19_0==65||LA19_0==67) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCase.g:1078:2: ( ( rule__RaiseError__Alternatives_1_0 ) )
                    {
                    // InternalUseCase.g:1078:2: ( ( rule__RaiseError__Alternatives_1_0 ) )
                    // InternalUseCase.g:1079:3: ( rule__RaiseError__Alternatives_1_0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getAlternatives_1_0()); 
                    // InternalUseCase.g:1080:3: ( rule__RaiseError__Alternatives_1_0 )
                    // InternalUseCase.g:1080:4: rule__RaiseError__Alternatives_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RaiseError__Alternatives_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRaiseErrorAccess().getAlternatives_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1084:2: ( ( rule__RaiseError__Alternatives_1_1 ) )
                    {
                    // InternalUseCase.g:1084:2: ( ( rule__RaiseError__Alternatives_1_1 ) )
                    // InternalUseCase.g:1085:3: ( rule__RaiseError__Alternatives_1_1 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getAlternatives_1_1()); 
                    // InternalUseCase.g:1086:3: ( rule__RaiseError__Alternatives_1_1 )
                    // InternalUseCase.g:1086:4: rule__RaiseError__Alternatives_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RaiseError__Alternatives_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRaiseErrorAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__RaiseError__Alternatives_1"


    // $ANTLR start "rule__RaiseError__Alternatives_1_0"
    // InternalUseCase.g:1094:1: rule__RaiseError__Alternatives_1_0 : ( ( ( rule__RaiseError__Group_1_0_0__0 ) ) | ( ( rule__RaiseError__Group_1_0_1__0 ) ) );
    public final void rule__RaiseError__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1098:1: ( ( ( rule__RaiseError__Group_1_0_0__0 ) ) | ( ( rule__RaiseError__Group_1_0_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==61) ) {
                alt20=1;
            }
            else if ( (LA20_0==63) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCase.g:1099:2: ( ( rule__RaiseError__Group_1_0_0__0 ) )
                    {
                    // InternalUseCase.g:1099:2: ( ( rule__RaiseError__Group_1_0_0__0 ) )
                    // InternalUseCase.g:1100:3: ( rule__RaiseError__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getGroup_1_0_0()); 
                    // InternalUseCase.g:1101:3: ( rule__RaiseError__Group_1_0_0__0 )
                    // InternalUseCase.g:1101:4: rule__RaiseError__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RaiseError__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRaiseErrorAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1105:2: ( ( rule__RaiseError__Group_1_0_1__0 ) )
                    {
                    // InternalUseCase.g:1105:2: ( ( rule__RaiseError__Group_1_0_1__0 ) )
                    // InternalUseCase.g:1106:3: ( rule__RaiseError__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getGroup_1_0_1()); 
                    // InternalUseCase.g:1107:3: ( rule__RaiseError__Group_1_0_1__0 )
                    // InternalUseCase.g:1107:4: rule__RaiseError__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RaiseError__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRaiseErrorAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__RaiseError__Alternatives_1_0"


    // $ANTLR start "rule__RaiseError__Alternatives_1_1"
    // InternalUseCase.g:1115:1: rule__RaiseError__Alternatives_1_1 : ( ( ( rule__RaiseError__Group_1_1_0__0 ) ) | ( ( rule__RaiseError__Group_1_1_1__0 ) ) );
    public final void rule__RaiseError__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1119:1: ( ( ( rule__RaiseError__Group_1_1_0__0 ) ) | ( ( rule__RaiseError__Group_1_1_1__0 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==65) ) {
                alt21=1;
            }
            else if ( (LA21_0==67) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:1120:2: ( ( rule__RaiseError__Group_1_1_0__0 ) )
                    {
                    // InternalUseCase.g:1120:2: ( ( rule__RaiseError__Group_1_1_0__0 ) )
                    // InternalUseCase.g:1121:3: ( rule__RaiseError__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getGroup_1_1_0()); 
                    // InternalUseCase.g:1122:3: ( rule__RaiseError__Group_1_1_0__0 )
                    // InternalUseCase.g:1122:4: rule__RaiseError__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RaiseError__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRaiseErrorAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1126:2: ( ( rule__RaiseError__Group_1_1_1__0 ) )
                    {
                    // InternalUseCase.g:1126:2: ( ( rule__RaiseError__Group_1_1_1__0 ) )
                    // InternalUseCase.g:1127:3: ( rule__RaiseError__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getGroup_1_1_1()); 
                    // InternalUseCase.g:1128:3: ( rule__RaiseError__Group_1_1_1__0 )
                    // InternalUseCase.g:1128:4: rule__RaiseError__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RaiseError__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRaiseErrorAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__RaiseError__Alternatives_1_1"


    // $ANTLR start "rule__Notes__Alternatives_0"
    // InternalUseCase.g:1136:1: rule__Notes__Alternatives_0 : ( ( ( rule__Notes__Alternatives_0_0 ) ) | ( ( rule__Notes__Alternatives_0_1 ) ) );
    public final void rule__Notes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1140:1: ( ( ( rule__Notes__Alternatives_0_0 ) ) | ( ( rule__Notes__Alternatives_0_1 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=38 && LA22_0<=39)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=40 && LA22_0<=41)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:1141:2: ( ( rule__Notes__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1141:2: ( ( rule__Notes__Alternatives_0_0 ) )
                    // InternalUseCase.g:1142:3: ( rule__Notes__Alternatives_0_0 )
                    {
                     before(grammarAccess.getNotesAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1143:3: ( rule__Notes__Alternatives_0_0 )
                    // InternalUseCase.g:1143:4: rule__Notes__Alternatives_0_0
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
                    // InternalUseCase.g:1147:2: ( ( rule__Notes__Alternatives_0_1 ) )
                    {
                    // InternalUseCase.g:1147:2: ( ( rule__Notes__Alternatives_0_1 ) )
                    // InternalUseCase.g:1148:3: ( rule__Notes__Alternatives_0_1 )
                    {
                     before(grammarAccess.getNotesAccess().getAlternatives_0_1()); 
                    // InternalUseCase.g:1149:3: ( rule__Notes__Alternatives_0_1 )
                    // InternalUseCase.g:1149:4: rule__Notes__Alternatives_0_1
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
    // InternalUseCase.g:1157:1: rule__Notes__Alternatives_0_0 : ( ( 'notes:' ) | ( 'note:' ) );
    public final void rule__Notes__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1161:1: ( ( 'notes:' ) | ( 'note:' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            else if ( (LA23_0==39) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:1162:2: ( 'notes:' )
                    {
                    // InternalUseCase.g:1162:2: ( 'notes:' )
                    // InternalUseCase.g:1163:3: 'notes:'
                    {
                     before(grammarAccess.getNotesAccess().getNotesKeyword_0_0_0()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getNotesKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1168:2: ( 'note:' )
                    {
                    // InternalUseCase.g:1168:2: ( 'note:' )
                    // InternalUseCase.g:1169:3: 'note:'
                    {
                     before(grammarAccess.getNotesAccess().getNoteKeyword_0_0_1()); 
                    match(input,39,FOLLOW_2); 
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
    // InternalUseCase.g:1178:1: rule__Notes__Alternatives_0_1 : ( ( 'Anmerkungen:' ) | ( 'Anmerkung:' ) );
    public final void rule__Notes__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1182:1: ( ( 'Anmerkungen:' ) | ( 'Anmerkung:' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            else if ( (LA24_0==41) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:1183:2: ( 'Anmerkungen:' )
                    {
                    // InternalUseCase.g:1183:2: ( 'Anmerkungen:' )
                    // InternalUseCase.g:1184:3: 'Anmerkungen:'
                    {
                     before(grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1189:2: ( 'Anmerkung:' )
                    {
                    // InternalUseCase.g:1189:2: ( 'Anmerkung:' )
                    // InternalUseCase.g:1190:3: 'Anmerkung:'
                    {
                     before(grammarAccess.getNotesAccess().getAnmerkungKeyword_0_1_1()); 
                    match(input,41,FOLLOW_2); 
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
    // InternalUseCase.g:1199:1: rule__UsedTypes__Alternatives_0 : ( ( ( rule__UsedTypes__Group_0_0__0 ) ) | ( ( rule__UsedTypes__Group_0_1__0 ) ) );
    public final void rule__UsedTypes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1203:1: ( ( ( rule__UsedTypes__Group_0_0__0 ) ) | ( ( rule__UsedTypes__Group_0_1__0 ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==69) ) {
                alt25=1;
            }
            else if ( (LA25_0==71) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCase.g:1204:2: ( ( rule__UsedTypes__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1204:2: ( ( rule__UsedTypes__Group_0_0__0 ) )
                    // InternalUseCase.g:1205:3: ( rule__UsedTypes__Group_0_0__0 )
                    {
                     before(grammarAccess.getUsedTypesAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1206:3: ( rule__UsedTypes__Group_0_0__0 )
                    // InternalUseCase.g:1206:4: rule__UsedTypes__Group_0_0__0
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
                    // InternalUseCase.g:1210:2: ( ( rule__UsedTypes__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1210:2: ( ( rule__UsedTypes__Group_0_1__0 ) )
                    // InternalUseCase.g:1211:3: ( rule__UsedTypes__Group_0_1__0 )
                    {
                     before(grammarAccess.getUsedTypesAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1212:3: ( rule__UsedTypes__Group_0_1__0 )
                    // InternalUseCase.g:1212:4: rule__UsedTypes__Group_0_1__0
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
    // InternalUseCase.g:1220:1: rule__UsedExceptions__Alternatives_0 : ( ( ( rule__UsedExceptions__Group_0_0__0 ) ) | ( ( rule__UsedExceptions__Group_0_1__0 ) ) );
    public final void rule__UsedExceptions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1224:1: ( ( ( rule__UsedExceptions__Group_0_0__0 ) ) | ( ( rule__UsedExceptions__Group_0_1__0 ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==69) ) {
                alt26=1;
            }
            else if ( (LA26_0==71) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCase.g:1225:2: ( ( rule__UsedExceptions__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1225:2: ( ( rule__UsedExceptions__Group_0_0__0 ) )
                    // InternalUseCase.g:1226:3: ( rule__UsedExceptions__Group_0_0__0 )
                    {
                     before(grammarAccess.getUsedExceptionsAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1227:3: ( rule__UsedExceptions__Group_0_0__0 )
                    // InternalUseCase.g:1227:4: rule__UsedExceptions__Group_0_0__0
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
                    // InternalUseCase.g:1231:2: ( ( rule__UsedExceptions__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1231:2: ( ( rule__UsedExceptions__Group_0_1__0 ) )
                    // InternalUseCase.g:1232:3: ( rule__UsedExceptions__Group_0_1__0 )
                    {
                     before(grammarAccess.getUsedExceptionsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1233:3: ( rule__UsedExceptions__Group_0_1__0 )
                    // InternalUseCase.g:1233:4: rule__UsedExceptions__Group_0_1__0
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
    // InternalUseCase.g:1241:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1245:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUseCase.g:1246:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalUseCase.g:1253:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1257:1: ( ( ( rule__Model__Alternatives_0 ) ) )
            // InternalUseCase.g:1258:1: ( ( rule__Model__Alternatives_0 ) )
            {
            // InternalUseCase.g:1258:1: ( ( rule__Model__Alternatives_0 ) )
            // InternalUseCase.g:1259:2: ( rule__Model__Alternatives_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_0()); 
            // InternalUseCase.g:1260:2: ( rule__Model__Alternatives_0 )
            // InternalUseCase.g:1260:3: rule__Model__Alternatives_0
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
    // InternalUseCase.g:1268:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1272:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUseCase.g:1273:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalUseCase.g:1280:1: rule__Model__Group__1__Impl : ( ( rule__Model__CompanyAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1284:1: ( ( ( rule__Model__CompanyAssignment_1 ) ) )
            // InternalUseCase.g:1285:1: ( ( rule__Model__CompanyAssignment_1 ) )
            {
            // InternalUseCase.g:1285:1: ( ( rule__Model__CompanyAssignment_1 ) )
            // InternalUseCase.g:1286:2: ( rule__Model__CompanyAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getCompanyAssignment_1()); 
            // InternalUseCase.g:1287:2: ( rule__Model__CompanyAssignment_1 )
            // InternalUseCase.g:1287:3: rule__Model__CompanyAssignment_1
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
    // InternalUseCase.g:1295:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1299:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalUseCase.g:1300:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalUseCase.g:1307:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackageAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1311:1: ( ( ( rule__Model__PackageAssignment_2 ) ) )
            // InternalUseCase.g:1312:1: ( ( rule__Model__PackageAssignment_2 ) )
            {
            // InternalUseCase.g:1312:1: ( ( rule__Model__PackageAssignment_2 ) )
            // InternalUseCase.g:1313:2: ( rule__Model__PackageAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getPackageAssignment_2()); 
            // InternalUseCase.g:1314:2: ( rule__Model__PackageAssignment_2 )
            // InternalUseCase.g:1314:3: rule__Model__PackageAssignment_2
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
    // InternalUseCase.g:1322:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1326:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalUseCase.g:1327:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalUseCase.g:1334:1: rule__Model__Group__3__Impl : ( ( rule__Model__UseCasesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1338:1: ( ( ( rule__Model__UseCasesAssignment_3 )* ) )
            // InternalUseCase.g:1339:1: ( ( rule__Model__UseCasesAssignment_3 )* )
            {
            // InternalUseCase.g:1339:1: ( ( rule__Model__UseCasesAssignment_3 )* )
            // InternalUseCase.g:1340:2: ( rule__Model__UseCasesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getUseCasesAssignment_3()); 
            // InternalUseCase.g:1341:2: ( rule__Model__UseCasesAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=16 && LA27_0<=17)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUseCase.g:1341:3: rule__Model__UseCasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__UseCasesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalUseCase.g:1349:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1353:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalUseCase.g:1354:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalUseCase.g:1361:1: rule__Model__Group__4__Impl : ( ( rule__Model__TypesAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1365:1: ( ( ( rule__Model__TypesAssignment_4 ) ) )
            // InternalUseCase.g:1366:1: ( ( rule__Model__TypesAssignment_4 ) )
            {
            // InternalUseCase.g:1366:1: ( ( rule__Model__TypesAssignment_4 ) )
            // InternalUseCase.g:1367:2: ( rule__Model__TypesAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_4()); 
            // InternalUseCase.g:1368:2: ( rule__Model__TypesAssignment_4 )
            // InternalUseCase.g:1368:3: rule__Model__TypesAssignment_4
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
    // InternalUseCase.g:1376:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1380:1: ( rule__Model__Group__5__Impl )
            // InternalUseCase.g:1381:2: rule__Model__Group__5__Impl
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
    // InternalUseCase.g:1387:1: rule__Model__Group__5__Impl : ( ( rule__Model__ExceptionsAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1391:1: ( ( ( rule__Model__ExceptionsAssignment_5 ) ) )
            // InternalUseCase.g:1392:1: ( ( rule__Model__ExceptionsAssignment_5 ) )
            {
            // InternalUseCase.g:1392:1: ( ( rule__Model__ExceptionsAssignment_5 ) )
            // InternalUseCase.g:1393:2: ( rule__Model__ExceptionsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getExceptionsAssignment_5()); 
            // InternalUseCase.g:1394:2: ( rule__Model__ExceptionsAssignment_5 )
            // InternalUseCase.g:1394:3: rule__Model__ExceptionsAssignment_5
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
    // InternalUseCase.g:1403:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1407:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUseCase.g:1408:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalUseCase.g:1415:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1419:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1420:1: ( RULE_ID )
            {
            // InternalUseCase.g:1420:1: ( RULE_ID )
            // InternalUseCase.g:1421:2: RULE_ID
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
    // InternalUseCase.g:1430:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1434:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUseCase.g:1435:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUseCase.g:1441:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1445:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUseCase.g:1446:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUseCase.g:1446:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUseCase.g:1447:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUseCase.g:1448:2: ( rule__QualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==36) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUseCase.g:1448:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalUseCase.g:1457:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1461:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUseCase.g:1462:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalUseCase.g:1469:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1473:1: ( ( '.' ) )
            // InternalUseCase.g:1474:1: ( '.' )
            {
            // InternalUseCase.g:1474:1: ( '.' )
            // InternalUseCase.g:1475:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUseCase.g:1484:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1488:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUseCase.g:1489:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUseCase.g:1495:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1499:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1500:1: ( RULE_ID )
            {
            // InternalUseCase.g:1500:1: ( RULE_ID )
            // InternalUseCase.g:1501:2: RULE_ID
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
    // InternalUseCase.g:1511:1: rule__QualifiedNumber__Group__0 : rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 ;
    public final void rule__QualifiedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1515:1: ( rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 )
            // InternalUseCase.g:1516:2: rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1
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
    // InternalUseCase.g:1523:1: rule__QualifiedNumber__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1527:1: ( ( RULE_INT ) )
            // InternalUseCase.g:1528:1: ( RULE_INT )
            {
            // InternalUseCase.g:1528:1: ( RULE_INT )
            // InternalUseCase.g:1529:2: RULE_INT
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
    // InternalUseCase.g:1538:1: rule__QualifiedNumber__Group__1 : rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 ;
    public final void rule__QualifiedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1542:1: ( rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 )
            // InternalUseCase.g:1543:2: rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2
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
    // InternalUseCase.g:1550:1: rule__QualifiedNumber__Group__1__Impl : ( ( rule__QualifiedNumber__Group_1__0 )* ) ;
    public final void rule__QualifiedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1554:1: ( ( ( rule__QualifiedNumber__Group_1__0 )* ) )
            // InternalUseCase.g:1555:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            {
            // InternalUseCase.g:1555:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            // InternalUseCase.g:1556:2: ( rule__QualifiedNumber__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup_1()); 
            // InternalUseCase.g:1557:2: ( rule__QualifiedNumber__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==36) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_INT) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalUseCase.g:1557:3: rule__QualifiedNumber__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedNumber__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalUseCase.g:1565:1: rule__QualifiedNumber__Group__2 : rule__QualifiedNumber__Group__2__Impl ;
    public final void rule__QualifiedNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1569:1: ( rule__QualifiedNumber__Group__2__Impl )
            // InternalUseCase.g:1570:2: rule__QualifiedNumber__Group__2__Impl
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
    // InternalUseCase.g:1576:1: rule__QualifiedNumber__Group__2__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1580:1: ( ( '.' ) )
            // InternalUseCase.g:1581:1: ( '.' )
            {
            // InternalUseCase.g:1581:1: ( '.' )
            // InternalUseCase.g:1582:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUseCase.g:1592:1: rule__QualifiedNumber__Group_1__0 : rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 ;
    public final void rule__QualifiedNumber__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1596:1: ( rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 )
            // InternalUseCase.g:1597:2: rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1
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
    // InternalUseCase.g:1604:1: rule__QualifiedNumber__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1608:1: ( ( '.' ) )
            // InternalUseCase.g:1609:1: ( '.' )
            {
            // InternalUseCase.g:1609:1: ( '.' )
            // InternalUseCase.g:1610:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUseCase.g:1619:1: rule__QualifiedNumber__Group_1__1 : rule__QualifiedNumber__Group_1__1__Impl ;
    public final void rule__QualifiedNumber__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1623:1: ( rule__QualifiedNumber__Group_1__1__Impl )
            // InternalUseCase.g:1624:2: rule__QualifiedNumber__Group_1__1__Impl
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
    // InternalUseCase.g:1630:1: rule__QualifiedNumber__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1634:1: ( ( RULE_INT ) )
            // InternalUseCase.g:1635:1: ( RULE_INT )
            {
            // InternalUseCase.g:1635:1: ( RULE_INT )
            // InternalUseCase.g:1636:2: RULE_INT
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
    // InternalUseCase.g:1646:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1650:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalUseCase.g:1651:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalUseCase.g:1658:1: rule__Package__Group__0__Impl : ( ( rule__Package__Alternatives_0 ) ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1662:1: ( ( ( rule__Package__Alternatives_0 ) ) )
            // InternalUseCase.g:1663:1: ( ( rule__Package__Alternatives_0 ) )
            {
            // InternalUseCase.g:1663:1: ( ( rule__Package__Alternatives_0 ) )
            // InternalUseCase.g:1664:2: ( rule__Package__Alternatives_0 )
            {
             before(grammarAccess.getPackageAccess().getAlternatives_0()); 
            // InternalUseCase.g:1665:2: ( rule__Package__Alternatives_0 )
            // InternalUseCase.g:1665:3: rule__Package__Alternatives_0
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
    // InternalUseCase.g:1673:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1677:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalUseCase.g:1678:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalUseCase.g:1685:1: rule__Package__Group__1__Impl : ( ( rule__Package__PartsAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1689:1: ( ( ( rule__Package__PartsAssignment_1 ) ) )
            // InternalUseCase.g:1690:1: ( ( rule__Package__PartsAssignment_1 ) )
            {
            // InternalUseCase.g:1690:1: ( ( rule__Package__PartsAssignment_1 ) )
            // InternalUseCase.g:1691:2: ( rule__Package__PartsAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getPartsAssignment_1()); 
            // InternalUseCase.g:1692:2: ( rule__Package__PartsAssignment_1 )
            // InternalUseCase.g:1692:3: rule__Package__PartsAssignment_1
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
    // InternalUseCase.g:1700:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1704:1: ( rule__Package__Group__2__Impl )
            // InternalUseCase.g:1705:2: rule__Package__Group__2__Impl
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
    // InternalUseCase.g:1711:1: rule__Package__Group__2__Impl : ( ( rule__Package__Group_2__0 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1715:1: ( ( ( rule__Package__Group_2__0 )* ) )
            // InternalUseCase.g:1716:1: ( ( rule__Package__Group_2__0 )* )
            {
            // InternalUseCase.g:1716:1: ( ( rule__Package__Group_2__0 )* )
            // InternalUseCase.g:1717:2: ( rule__Package__Group_2__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_2()); 
            // InternalUseCase.g:1718:2: ( rule__Package__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==42) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUseCase.g:1718:3: rule__Package__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Package__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalUseCase.g:1727:1: rule__Package__Group_2__0 : rule__Package__Group_2__0__Impl rule__Package__Group_2__1 ;
    public final void rule__Package__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1731:1: ( rule__Package__Group_2__0__Impl rule__Package__Group_2__1 )
            // InternalUseCase.g:1732:2: rule__Package__Group_2__0__Impl rule__Package__Group_2__1
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
    // InternalUseCase.g:1739:1: rule__Package__Group_2__0__Impl : ( '>' ) ;
    public final void rule__Package__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1743:1: ( ( '>' ) )
            // InternalUseCase.g:1744:1: ( '>' )
            {
            // InternalUseCase.g:1744:1: ( '>' )
            // InternalUseCase.g:1745:2: '>'
            {
             before(grammarAccess.getPackageAccess().getGreaterThanSignKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUseCase.g:1754:1: rule__Package__Group_2__1 : rule__Package__Group_2__1__Impl ;
    public final void rule__Package__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1758:1: ( rule__Package__Group_2__1__Impl )
            // InternalUseCase.g:1759:2: rule__Package__Group_2__1__Impl
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
    // InternalUseCase.g:1765:1: rule__Package__Group_2__1__Impl : ( ( rule__Package__PartsAssignment_2_1 ) ) ;
    public final void rule__Package__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1769:1: ( ( ( rule__Package__PartsAssignment_2_1 ) ) )
            // InternalUseCase.g:1770:1: ( ( rule__Package__PartsAssignment_2_1 ) )
            {
            // InternalUseCase.g:1770:1: ( ( rule__Package__PartsAssignment_2_1 ) )
            // InternalUseCase.g:1771:2: ( rule__Package__PartsAssignment_2_1 )
            {
             before(grammarAccess.getPackageAccess().getPartsAssignment_2_1()); 
            // InternalUseCase.g:1772:2: ( rule__Package__PartsAssignment_2_1 )
            // InternalUseCase.g:1772:3: rule__Package__PartsAssignment_2_1
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
    // InternalUseCase.g:1781:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1785:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCase.g:1786:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUseCase.g:1793:1: rule__UseCase__Group__0__Impl : ( ( rule__UseCase__Alternatives_0 ) ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1797:1: ( ( ( rule__UseCase__Alternatives_0 ) ) )
            // InternalUseCase.g:1798:1: ( ( rule__UseCase__Alternatives_0 ) )
            {
            // InternalUseCase.g:1798:1: ( ( rule__UseCase__Alternatives_0 ) )
            // InternalUseCase.g:1799:2: ( rule__UseCase__Alternatives_0 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_0()); 
            // InternalUseCase.g:1800:2: ( rule__UseCase__Alternatives_0 )
            // InternalUseCase.g:1800:3: rule__UseCase__Alternatives_0
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
    // InternalUseCase.g:1808:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1812:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCase.g:1813:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
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
    // InternalUseCase.g:1820:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1824:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUseCase.g:1825:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUseCase.g:1825:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUseCase.g:1826:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUseCase.g:1827:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUseCase.g:1827:3: rule__UseCase__NameAssignment_1
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
    // InternalUseCase.g:1835:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1839:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCase.g:1840:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
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
    // InternalUseCase.g:1847:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionsAssignment_2 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1851:1: ( ( ( rule__UseCase__DescriptionsAssignment_2 )? ) )
            // InternalUseCase.g:1852:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            {
            // InternalUseCase.g:1852:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            // InternalUseCase.g:1853:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); 
            // InternalUseCase.g:1854:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=18 && LA31_0<=20)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUseCase.g:1854:3: rule__UseCase__DescriptionsAssignment_2
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
    // InternalUseCase.g:1862:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1866:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCase.g:1867:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
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
    // InternalUseCase.g:1874:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1878:1: ( ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) )
            // InternalUseCase.g:1879:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            {
            // InternalUseCase.g:1879:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            // InternalUseCase.g:1880:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            {
             before(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAssignment_3()); 
            // InternalUseCase.g:1881:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21||LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUseCase.g:1881:3: rule__UseCase__AllowedUserGroupsAssignment_3
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
    // InternalUseCase.g:1889:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1893:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCase.g:1894:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
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
    // InternalUseCase.g:1901:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__InputsAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1905:1: ( ( ( rule__UseCase__InputsAssignment_4 )? ) )
            // InternalUseCase.g:1906:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            {
            // InternalUseCase.g:1906:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            // InternalUseCase.g:1907:2: ( rule__UseCase__InputsAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getInputsAssignment_4()); 
            // InternalUseCase.g:1908:2: ( rule__UseCase__InputsAssignment_4 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=22 && LA33_0<=23)||LA33_0==51||LA33_0==55) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUseCase.g:1908:3: rule__UseCase__InputsAssignment_4
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
    // InternalUseCase.g:1916:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1920:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCase.g:1921:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
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
    // InternalUseCase.g:1928:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__OutputsAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1932:1: ( ( ( rule__UseCase__OutputsAssignment_5 )? ) )
            // InternalUseCase.g:1933:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            {
            // InternalUseCase.g:1933:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            // InternalUseCase.g:1934:2: ( rule__UseCase__OutputsAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getOutputsAssignment_5()); 
            // InternalUseCase.g:1935:2: ( rule__UseCase__OutputsAssignment_5 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=28 && LA34_0<=30)||LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUseCase.g:1935:3: rule__UseCase__OutputsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__OutputsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getOutputsAssignment_5()); 

            }


            }

        }
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
    // InternalUseCase.g:1943:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1947:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCase.g:1948:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
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
    // InternalUseCase.g:1955:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__PreconditionsAssignment_6 )? ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1959:1: ( ( ( rule__UseCase__PreconditionsAssignment_6 )? ) )
            // InternalUseCase.g:1960:1: ( ( rule__UseCase__PreconditionsAssignment_6 )? )
            {
            // InternalUseCase.g:1960:1: ( ( rule__UseCase__PreconditionsAssignment_6 )? )
            // InternalUseCase.g:1961:2: ( rule__UseCase__PreconditionsAssignment_6 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_6()); 
            // InternalUseCase.g:1962:2: ( rule__UseCase__PreconditionsAssignment_6 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=31 && LA35_0<=33)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUseCase.g:1962:3: rule__UseCase__PreconditionsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__PreconditionsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_6()); 

            }


            }

        }
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
    // InternalUseCase.g:1970:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1974:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCase.g:1975:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
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
    // InternalUseCase.g:1982:1: rule__UseCase__Group__7__Impl : ( ( rule__UseCase__StepsAssignment_7 )? ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1986:1: ( ( ( rule__UseCase__StepsAssignment_7 )? ) )
            // InternalUseCase.g:1987:1: ( ( rule__UseCase__StepsAssignment_7 )? )
            {
            // InternalUseCase.g:1987:1: ( ( rule__UseCase__StepsAssignment_7 )? )
            // InternalUseCase.g:1988:2: ( rule__UseCase__StepsAssignment_7 )?
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_7()); 
            // InternalUseCase.g:1989:2: ( rule__UseCase__StepsAssignment_7 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=34 && LA36_0<=35)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUseCase.g:1989:3: rule__UseCase__StepsAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__StepsAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_7()); 

            }


            }

        }
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
    // InternalUseCase.g:1997:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2001:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCase.g:2002:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
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
    // InternalUseCase.g:2009:1: rule__UseCase__Group__8__Impl : ( ( rule__UseCase__NotesAssignment_8 )? ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2013:1: ( ( ( rule__UseCase__NotesAssignment_8 )? ) )
            // InternalUseCase.g:2014:1: ( ( rule__UseCase__NotesAssignment_8 )? )
            {
            // InternalUseCase.g:2014:1: ( ( rule__UseCase__NotesAssignment_8 )? )
            // InternalUseCase.g:2015:2: ( rule__UseCase__NotesAssignment_8 )?
            {
             before(grammarAccess.getUseCaseAccess().getNotesAssignment_8()); 
            // InternalUseCase.g:2016:2: ( rule__UseCase__NotesAssignment_8 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=38 && LA37_0<=41)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUseCase.g:2016:3: rule__UseCase__NotesAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__NotesAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getNotesAssignment_8()); 

            }


            }

        }
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
    // InternalUseCase.g:2024:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2028:1: ( rule__UseCase__Group__9__Impl )
            // InternalUseCase.g:2029:2: rule__UseCase__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:2035:1: rule__UseCase__Group__9__Impl : ( ( rule__UseCase__Alternatives_9 ) ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2039:1: ( ( ( rule__UseCase__Alternatives_9 ) ) )
            // InternalUseCase.g:2040:1: ( ( rule__UseCase__Alternatives_9 ) )
            {
            // InternalUseCase.g:2040:1: ( ( rule__UseCase__Alternatives_9 ) )
            // InternalUseCase.g:2041:2: ( rule__UseCase__Alternatives_9 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_9()); 
            // InternalUseCase.g:2042:2: ( rule__UseCase__Alternatives_9 )
            // InternalUseCase.g:2042:3: rule__UseCase__Alternatives_9
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Alternatives_9();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getAlternatives_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__UseCase__Group_9_0__0"
    // InternalUseCase.g:2051:1: rule__UseCase__Group_9_0__0 : rule__UseCase__Group_9_0__0__Impl rule__UseCase__Group_9_0__1 ;
    public final void rule__UseCase__Group_9_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2055:1: ( rule__UseCase__Group_9_0__0__Impl rule__UseCase__Group_9_0__1 )
            // InternalUseCase.g:2056:2: rule__UseCase__Group_9_0__0__Impl rule__UseCase__Group_9_0__1
            {
            pushFollow(FOLLOW_15);
            rule__UseCase__Group_9_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_9_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_0__0"


    // $ANTLR start "rule__UseCase__Group_9_0__0__Impl"
    // InternalUseCase.g:2063:1: rule__UseCase__Group_9_0__0__Impl : ( 'end' ) ;
    public final void rule__UseCase__Group_9_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2067:1: ( ( 'end' ) )
            // InternalUseCase.g:2068:1: ( 'end' )
            {
            // InternalUseCase.g:2068:1: ( 'end' )
            // InternalUseCase.g:2069:2: 'end'
            {
             before(grammarAccess.getUseCaseAccess().getEndKeyword_9_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getEndKeyword_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_0__0__Impl"


    // $ANTLR start "rule__UseCase__Group_9_0__1"
    // InternalUseCase.g:2078:1: rule__UseCase__Group_9_0__1 : rule__UseCase__Group_9_0__1__Impl rule__UseCase__Group_9_0__2 ;
    public final void rule__UseCase__Group_9_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2082:1: ( rule__UseCase__Group_9_0__1__Impl rule__UseCase__Group_9_0__2 )
            // InternalUseCase.g:2083:2: rule__UseCase__Group_9_0__1__Impl rule__UseCase__Group_9_0__2
            {
            pushFollow(FOLLOW_16);
            rule__UseCase__Group_9_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_9_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_0__1"


    // $ANTLR start "rule__UseCase__Group_9_0__1__Impl"
    // InternalUseCase.g:2090:1: rule__UseCase__Group_9_0__1__Impl : ( 'of' ) ;
    public final void rule__UseCase__Group_9_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2094:1: ( ( 'of' ) )
            // InternalUseCase.g:2095:1: ( 'of' )
            {
            // InternalUseCase.g:2095:1: ( 'of' )
            // InternalUseCase.g:2096:2: 'of'
            {
             before(grammarAccess.getUseCaseAccess().getOfKeyword_9_0_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getOfKeyword_9_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_0__1__Impl"


    // $ANTLR start "rule__UseCase__Group_9_0__2"
    // InternalUseCase.g:2105:1: rule__UseCase__Group_9_0__2 : rule__UseCase__Group_9_0__2__Impl ;
    public final void rule__UseCase__Group_9_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2109:1: ( rule__UseCase__Group_9_0__2__Impl )
            // InternalUseCase.g:2110:2: rule__UseCase__Group_9_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_9_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_0__2"


    // $ANTLR start "rule__UseCase__Group_9_0__2__Impl"
    // InternalUseCase.g:2116:1: rule__UseCase__Group_9_0__2__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group_9_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2120:1: ( ( 'use-case' ) )
            // InternalUseCase.g:2121:1: ( 'use-case' )
            {
            // InternalUseCase.g:2121:1: ( 'use-case' )
            // InternalUseCase.g:2122:2: 'use-case'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_9_0_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_9_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_0__2__Impl"


    // $ANTLR start "rule__UseCase__Group_9_1__0"
    // InternalUseCase.g:2132:1: rule__UseCase__Group_9_1__0 : rule__UseCase__Group_9_1__0__Impl rule__UseCase__Group_9_1__1 ;
    public final void rule__UseCase__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2136:1: ( rule__UseCase__Group_9_1__0__Impl rule__UseCase__Group_9_1__1 )
            // InternalUseCase.g:2137:2: rule__UseCase__Group_9_1__0__Impl rule__UseCase__Group_9_1__1
            {
            pushFollow(FOLLOW_17);
            rule__UseCase__Group_9_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_9_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_1__0"


    // $ANTLR start "rule__UseCase__Group_9_1__0__Impl"
    // InternalUseCase.g:2144:1: rule__UseCase__Group_9_1__0__Impl : ( 'Ende' ) ;
    public final void rule__UseCase__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2148:1: ( ( 'Ende' ) )
            // InternalUseCase.g:2149:1: ( 'Ende' )
            {
            // InternalUseCase.g:2149:1: ( 'Ende' )
            // InternalUseCase.g:2150:2: 'Ende'
            {
             before(grammarAccess.getUseCaseAccess().getEndeKeyword_9_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getEndeKeyword_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_1__0__Impl"


    // $ANTLR start "rule__UseCase__Group_9_1__1"
    // InternalUseCase.g:2159:1: rule__UseCase__Group_9_1__1 : rule__UseCase__Group_9_1__1__Impl rule__UseCase__Group_9_1__2 ;
    public final void rule__UseCase__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2163:1: ( rule__UseCase__Group_9_1__1__Impl rule__UseCase__Group_9_1__2 )
            // InternalUseCase.g:2164:2: rule__UseCase__Group_9_1__1__Impl rule__UseCase__Group_9_1__2
            {
            pushFollow(FOLLOW_18);
            rule__UseCase__Group_9_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_9_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_1__1"


    // $ANTLR start "rule__UseCase__Group_9_1__1__Impl"
    // InternalUseCase.g:2171:1: rule__UseCase__Group_9_1__1__Impl : ( 'des' ) ;
    public final void rule__UseCase__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2175:1: ( ( 'des' ) )
            // InternalUseCase.g:2176:1: ( 'des' )
            {
            // InternalUseCase.g:2176:1: ( 'des' )
            // InternalUseCase.g:2177:2: 'des'
            {
             before(grammarAccess.getUseCaseAccess().getDesKeyword_9_1_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getDesKeyword_9_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_1__1__Impl"


    // $ANTLR start "rule__UseCase__Group_9_1__2"
    // InternalUseCase.g:2186:1: rule__UseCase__Group_9_1__2 : rule__UseCase__Group_9_1__2__Impl ;
    public final void rule__UseCase__Group_9_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2190:1: ( rule__UseCase__Group_9_1__2__Impl )
            // InternalUseCase.g:2191:2: rule__UseCase__Group_9_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_9_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_1__2"


    // $ANTLR start "rule__UseCase__Group_9_1__2__Impl"
    // InternalUseCase.g:2197:1: rule__UseCase__Group_9_1__2__Impl : ( 'Rezpets' ) ;
    public final void rule__UseCase__Group_9_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2201:1: ( ( 'Rezpets' ) )
            // InternalUseCase.g:2202:1: ( 'Rezpets' )
            {
            // InternalUseCase.g:2202:1: ( 'Rezpets' )
            // InternalUseCase.g:2203:2: 'Rezpets'
            {
             before(grammarAccess.getUseCaseAccess().getRezpetsKeyword_9_1_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getRezpetsKeyword_9_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_9_1__2__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalUseCase.g:2213:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2217:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalUseCase.g:2218:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalUseCase.g:2225:1: rule__Description__Group__0__Impl : ( ( rule__Description__Alternatives_0 ) ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2229:1: ( ( ( rule__Description__Alternatives_0 ) ) )
            // InternalUseCase.g:2230:1: ( ( rule__Description__Alternatives_0 ) )
            {
            // InternalUseCase.g:2230:1: ( ( rule__Description__Alternatives_0 ) )
            // InternalUseCase.g:2231:2: ( rule__Description__Alternatives_0 )
            {
             before(grammarAccess.getDescriptionAccess().getAlternatives_0()); 
            // InternalUseCase.g:2232:2: ( rule__Description__Alternatives_0 )
            // InternalUseCase.g:2232:3: rule__Description__Alternatives_0
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
    // InternalUseCase.g:2240:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2244:1: ( rule__Description__Group__1__Impl )
            // InternalUseCase.g:2245:2: rule__Description__Group__1__Impl
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
    // InternalUseCase.g:2251:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2255:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalUseCase.g:2256:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalUseCase.g:2256:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalUseCase.g:2257:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalUseCase.g:2258:2: ( rule__Description__NameAssignment_1 )
            // InternalUseCase.g:2258:3: rule__Description__NameAssignment_1
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
    // InternalUseCase.g:2267:1: rule__AllowedUserGroups__Group__0 : rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 ;
    public final void rule__AllowedUserGroups__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2271:1: ( rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 )
            // InternalUseCase.g:2272:2: rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1
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
    // InternalUseCase.g:2279:1: rule__AllowedUserGroups__Group__0__Impl : ( ( rule__AllowedUserGroups__Alternatives_0 ) ) ;
    public final void rule__AllowedUserGroups__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2283:1: ( ( ( rule__AllowedUserGroups__Alternatives_0 ) ) )
            // InternalUseCase.g:2284:1: ( ( rule__AllowedUserGroups__Alternatives_0 ) )
            {
            // InternalUseCase.g:2284:1: ( ( rule__AllowedUserGroups__Alternatives_0 ) )
            // InternalUseCase.g:2285:2: ( rule__AllowedUserGroups__Alternatives_0 )
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getAlternatives_0()); 
            // InternalUseCase.g:2286:2: ( rule__AllowedUserGroups__Alternatives_0 )
            // InternalUseCase.g:2286:3: rule__AllowedUserGroups__Alternatives_0
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
    // InternalUseCase.g:2294:1: rule__AllowedUserGroups__Group__1 : rule__AllowedUserGroups__Group__1__Impl ;
    public final void rule__AllowedUserGroups__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2298:1: ( rule__AllowedUserGroups__Group__1__Impl )
            // InternalUseCase.g:2299:2: rule__AllowedUserGroups__Group__1__Impl
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
    // InternalUseCase.g:2305:1: rule__AllowedUserGroups__Group__1__Impl : ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) ;
    public final void rule__AllowedUserGroups__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2309:1: ( ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) )
            // InternalUseCase.g:2310:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            {
            // InternalUseCase.g:2310:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            // InternalUseCase.g:2311:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroupsAssignment_1()); 
            // InternalUseCase.g:2312:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==50||LA38_0==77) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalUseCase.g:2312:3: rule__AllowedUserGroups__GroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__AllowedUserGroups__GroupsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalUseCase.g:2321:1: rule__AllowedUserGroups__Group_0_1__0 : rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1 ;
    public final void rule__AllowedUserGroups__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2325:1: ( rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1 )
            // InternalUseCase.g:2326:2: rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1
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
    // InternalUseCase.g:2333:1: rule__AllowedUserGroups__Group_0_1__0__Impl : ( 'Erlaubt' ) ;
    public final void rule__AllowedUserGroups__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2337:1: ( ( 'Erlaubt' ) )
            // InternalUseCase.g:2338:1: ( 'Erlaubt' )
            {
            // InternalUseCase.g:2338:1: ( 'Erlaubt' )
            // InternalUseCase.g:2339:2: 'Erlaubt'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getErlaubtKeyword_0_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalUseCase.g:2348:1: rule__AllowedUserGroups__Group_0_1__1 : rule__AllowedUserGroups__Group_0_1__1__Impl ;
    public final void rule__AllowedUserGroups__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2352:1: ( rule__AllowedUserGroups__Group_0_1__1__Impl )
            // InternalUseCase.g:2353:2: rule__AllowedUserGroups__Group_0_1__1__Impl
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
    // InternalUseCase.g:2359:1: rule__AllowedUserGroups__Group_0_1__1__Impl : ( 'f\\u00FCr:' ) ;
    public final void rule__AllowedUserGroups__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2363:1: ( ( 'f\\u00FCr:' ) )
            // InternalUseCase.g:2364:1: ( 'f\\u00FCr:' )
            {
            // InternalUseCase.g:2364:1: ( 'f\\u00FCr:' )
            // InternalUseCase.g:2365:2: 'f\\u00FCr:'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getFürKeyword_0_1_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUseCase.g:2375:1: rule__AllowedUserGroup__Group__0 : rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 ;
    public final void rule__AllowedUserGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2379:1: ( rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 )
            // InternalUseCase.g:2380:2: rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1
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
    // InternalUseCase.g:2387:1: rule__AllowedUserGroup__Group__0__Impl : ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) ;
    public final void rule__AllowedUserGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2391:1: ( ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2392:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2392:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            // InternalUseCase.g:2393:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2394:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==77) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUseCase.g:2394:3: rule__AllowedUserGroup__ManyAssignment_0
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
    // InternalUseCase.g:2402:1: rule__AllowedUserGroup__Group__1 : rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 ;
    public final void rule__AllowedUserGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2406:1: ( rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 )
            // InternalUseCase.g:2407:2: rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2
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
    // InternalUseCase.g:2414:1: rule__AllowedUserGroup__Group__1__Impl : ( '-' ) ;
    public final void rule__AllowedUserGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2418:1: ( ( '-' ) )
            // InternalUseCase.g:2419:1: ( '-' )
            {
            // InternalUseCase.g:2419:1: ( '-' )
            // InternalUseCase.g:2420:2: '-'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUseCase.g:2429:1: rule__AllowedUserGroup__Group__2 : rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 ;
    public final void rule__AllowedUserGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2433:1: ( rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 )
            // InternalUseCase.g:2434:2: rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3
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
    // InternalUseCase.g:2441:1: rule__AllowedUserGroup__Group__2__Impl : ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) ;
    public final void rule__AllowedUserGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2445:1: ( ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) )
            // InternalUseCase.g:2446:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            {
            // InternalUseCase.g:2446:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            // InternalUseCase.g:2447:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getNameAssignment_2()); 
            // InternalUseCase.g:2448:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            // InternalUseCase.g:2448:3: rule__AllowedUserGroup__NameAssignment_2
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
    // InternalUseCase.g:2456:1: rule__AllowedUserGroup__Group__3 : rule__AllowedUserGroup__Group__3__Impl ;
    public final void rule__AllowedUserGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2460:1: ( rule__AllowedUserGroup__Group__3__Impl )
            // InternalUseCase.g:2461:2: rule__AllowedUserGroup__Group__3__Impl
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
    // InternalUseCase.g:2467:1: rule__AllowedUserGroup__Group__3__Impl : ( ( rule__AllowedUserGroup__Group_3__0 )? ) ;
    public final void rule__AllowedUserGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2471:1: ( ( ( rule__AllowedUserGroup__Group_3__0 )? ) )
            // InternalUseCase.g:2472:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            {
            // InternalUseCase.g:2472:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            // InternalUseCase.g:2473:2: ( rule__AllowedUserGroup__Group_3__0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup_3()); 
            // InternalUseCase.g:2474:2: ( rule__AllowedUserGroup__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==24) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUseCase.g:2474:3: rule__AllowedUserGroup__Group_3__0
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
    // InternalUseCase.g:2483:1: rule__AllowedUserGroup__Group_3__0 : rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 ;
    public final void rule__AllowedUserGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2487:1: ( rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 )
            // InternalUseCase.g:2488:2: rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1
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
    // InternalUseCase.g:2495:1: rule__AllowedUserGroup__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__AllowedUserGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2499:1: ( ( 'as' ) )
            // InternalUseCase.g:2500:1: ( 'as' )
            {
            // InternalUseCase.g:2500:1: ( 'as' )
            // InternalUseCase.g:2501:2: 'as'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUseCase.g:2510:1: rule__AllowedUserGroup__Group_3__1 : rule__AllowedUserGroup__Group_3__1__Impl ;
    public final void rule__AllowedUserGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2514:1: ( rule__AllowedUserGroup__Group_3__1__Impl )
            // InternalUseCase.g:2515:2: rule__AllowedUserGroup__Group_3__1__Impl
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
    // InternalUseCase.g:2521:1: rule__AllowedUserGroup__Group_3__1__Impl : ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) ;
    public final void rule__AllowedUserGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2525:1: ( ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:2526:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:2526:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            // InternalUseCase.g:2527:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:2528:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            // InternalUseCase.g:2528:3: rule__AllowedUserGroup__TypeAssignment_3_1
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
    // InternalUseCase.g:2537:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2541:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalUseCase.g:2542:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
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
    // InternalUseCase.g:2549:1: rule__Inputs__Group__0__Impl : ( ( rule__Inputs__Alternatives_0 ) ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2553:1: ( ( ( rule__Inputs__Alternatives_0 ) ) )
            // InternalUseCase.g:2554:1: ( ( rule__Inputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:2554:1: ( ( rule__Inputs__Alternatives_0 ) )
            // InternalUseCase.g:2555:2: ( rule__Inputs__Alternatives_0 )
            {
             before(grammarAccess.getInputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:2556:2: ( rule__Inputs__Alternatives_0 )
            // InternalUseCase.g:2556:3: rule__Inputs__Alternatives_0
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
    // InternalUseCase.g:2564:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2568:1: ( rule__Inputs__Group__1__Impl )
            // InternalUseCase.g:2569:2: rule__Inputs__Group__1__Impl
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
    // InternalUseCase.g:2575:1: rule__Inputs__Group__1__Impl : ( ( rule__Inputs__InputsAssignment_1 )* ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2579:1: ( ( ( rule__Inputs__InputsAssignment_1 )* ) )
            // InternalUseCase.g:2580:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            {
            // InternalUseCase.g:2580:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            // InternalUseCase.g:2581:2: ( rule__Inputs__InputsAssignment_1 )*
            {
             before(grammarAccess.getInputsAccess().getInputsAssignment_1()); 
            // InternalUseCase.g:2582:2: ( rule__Inputs__InputsAssignment_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==50||LA41_0==77) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUseCase.g:2582:3: rule__Inputs__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Inputs__InputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalUseCase.g:2591:1: rule__Inputs__Group_0_0_2__0 : rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1 ;
    public final void rule__Inputs__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2595:1: ( rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1 )
            // InternalUseCase.g:2596:2: rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1
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
    // InternalUseCase.g:2603:1: rule__Inputs__Group_0_0_2__0__Impl : ( 'requires' ) ;
    public final void rule__Inputs__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2607:1: ( ( 'requires' ) )
            // InternalUseCase.g:2608:1: ( 'requires' )
            {
            // InternalUseCase.g:2608:1: ( 'requires' )
            // InternalUseCase.g:2609:2: 'requires'
            {
             before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_2_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUseCase.g:2618:1: rule__Inputs__Group_0_0_2__1 : rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2 ;
    public final void rule__Inputs__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2622:1: ( rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2 )
            // InternalUseCase.g:2623:2: rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2
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
    // InternalUseCase.g:2630:1: rule__Inputs__Group_0_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Inputs__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2634:1: ( ( 'the' ) )
            // InternalUseCase.g:2635:1: ( 'the' )
            {
            // InternalUseCase.g:2635:1: ( 'the' )
            // InternalUseCase.g:2636:2: 'the'
            {
             before(grammarAccess.getInputsAccess().getTheKeyword_0_0_2_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUseCase.g:2645:1: rule__Inputs__Group_0_0_2__2 : rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3 ;
    public final void rule__Inputs__Group_0_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2649:1: ( rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3 )
            // InternalUseCase.g:2650:2: rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3
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
    // InternalUseCase.g:2657:1: rule__Inputs__Group_0_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Inputs__Group_0_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2661:1: ( ( 'following' ) )
            // InternalUseCase.g:2662:1: ( 'following' )
            {
            // InternalUseCase.g:2662:1: ( 'following' )
            // InternalUseCase.g:2663:2: 'following'
            {
             before(grammarAccess.getInputsAccess().getFollowingKeyword_0_0_2_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUseCase.g:2672:1: rule__Inputs__Group_0_0_2__3 : rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4 ;
    public final void rule__Inputs__Group_0_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2676:1: ( rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4 )
            // InternalUseCase.g:2677:2: rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4
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
    // InternalUseCase.g:2684:1: rule__Inputs__Group_0_0_2__3__Impl : ( 'input' ) ;
    public final void rule__Inputs__Group_0_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2688:1: ( ( 'input' ) )
            // InternalUseCase.g:2689:1: ( 'input' )
            {
            // InternalUseCase.g:2689:1: ( 'input' )
            // InternalUseCase.g:2690:2: 'input'
            {
             before(grammarAccess.getInputsAccess().getInputKeyword_0_0_2_3()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUseCase.g:2699:1: rule__Inputs__Group_0_0_2__4 : rule__Inputs__Group_0_0_2__4__Impl ;
    public final void rule__Inputs__Group_0_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2703:1: ( rule__Inputs__Group_0_0_2__4__Impl )
            // InternalUseCase.g:2704:2: rule__Inputs__Group_0_0_2__4__Impl
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
    // InternalUseCase.g:2710:1: rule__Inputs__Group_0_0_2__4__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2714:1: ( ( ':' ) )
            // InternalUseCase.g:2715:1: ( ':' )
            {
            // InternalUseCase.g:2715:1: ( ':' )
            // InternalUseCase.g:2716:2: ':'
            {
             before(grammarAccess.getInputsAccess().getColonKeyword_0_0_2_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:2726:1: rule__Inputs__Group_0_1__0 : rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1 ;
    public final void rule__Inputs__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2730:1: ( rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1 )
            // InternalUseCase.g:2731:2: rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1
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
    // InternalUseCase.g:2738:1: rule__Inputs__Group_0_1__0__Impl : ( 'Ben\\u00F6tigte' ) ;
    public final void rule__Inputs__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2742:1: ( ( 'Ben\\u00F6tigte' ) )
            // InternalUseCase.g:2743:1: ( 'Ben\\u00F6tigte' )
            {
            // InternalUseCase.g:2743:1: ( 'Ben\\u00F6tigte' )
            // InternalUseCase.g:2744:2: 'Ben\\u00F6tigte'
            {
             before(grammarAccess.getInputsAccess().getBenötigteKeyword_0_1_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalUseCase.g:2753:1: rule__Inputs__Group_0_1__1 : rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2 ;
    public final void rule__Inputs__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2757:1: ( rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2 )
            // InternalUseCase.g:2758:2: rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2
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
    // InternalUseCase.g:2765:1: rule__Inputs__Group_0_1__1__Impl : ( 'Zutaten' ) ;
    public final void rule__Inputs__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2769:1: ( ( 'Zutaten' ) )
            // InternalUseCase.g:2770:1: ( 'Zutaten' )
            {
            // InternalUseCase.g:2770:1: ( 'Zutaten' )
            // InternalUseCase.g:2771:2: 'Zutaten'
            {
             before(grammarAccess.getInputsAccess().getZutatenKeyword_0_1_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUseCase.g:2780:1: rule__Inputs__Group_0_1__2 : rule__Inputs__Group_0_1__2__Impl ;
    public final void rule__Inputs__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2784:1: ( rule__Inputs__Group_0_1__2__Impl )
            // InternalUseCase.g:2785:2: rule__Inputs__Group_0_1__2__Impl
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
    // InternalUseCase.g:2791:1: rule__Inputs__Group_0_1__2__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2795:1: ( ( ':' ) )
            // InternalUseCase.g:2796:1: ( ':' )
            {
            // InternalUseCase.g:2796:1: ( ':' )
            // InternalUseCase.g:2797:2: ':'
            {
             before(grammarAccess.getInputsAccess().getColonKeyword_0_1_2()); 
            match(input,37,FOLLOW_2); 
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


    // $ANTLR start "rule__Input__Group__0"
    // InternalUseCase.g:2807:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2811:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalUseCase.g:2812:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalUseCase.g:2819:1: rule__Input__Group__0__Impl : ( ( rule__Input__ManyAssignment_0 )? ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2823:1: ( ( ( rule__Input__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2824:1: ( ( rule__Input__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2824:1: ( ( rule__Input__ManyAssignment_0 )? )
            // InternalUseCase.g:2825:2: ( rule__Input__ManyAssignment_0 )?
            {
             before(grammarAccess.getInputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2826:2: ( rule__Input__ManyAssignment_0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==77) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUseCase.g:2826:3: rule__Input__ManyAssignment_0
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
    // InternalUseCase.g:2834:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2838:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalUseCase.g:2839:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalUseCase.g:2846:1: rule__Input__Group__1__Impl : ( '-' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2850:1: ( ( '-' ) )
            // InternalUseCase.g:2851:1: ( '-' )
            {
            // InternalUseCase.g:2851:1: ( '-' )
            // InternalUseCase.g:2852:2: '-'
            {
             before(grammarAccess.getInputAccess().getHyphenMinusKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUseCase.g:2861:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2865:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalUseCase.g:2866:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalUseCase.g:2873:1: rule__Input__Group__2__Impl : ( ( rule__Input__OptionalAssignment_2 )? ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2877:1: ( ( ( rule__Input__OptionalAssignment_2 )? ) )
            // InternalUseCase.g:2878:1: ( ( rule__Input__OptionalAssignment_2 )? )
            {
            // InternalUseCase.g:2878:1: ( ( rule__Input__OptionalAssignment_2 )? )
            // InternalUseCase.g:2879:2: ( rule__Input__OptionalAssignment_2 )?
            {
             before(grammarAccess.getInputAccess().getOptionalAssignment_2()); 
            // InternalUseCase.g:2880:2: ( rule__Input__OptionalAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==11) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUseCase.g:2880:3: rule__Input__OptionalAssignment_2
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
    // InternalUseCase.g:2888:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2892:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalUseCase.g:2893:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalUseCase.g:2900:1: rule__Input__Group__3__Impl : ( ( rule__Input__ContentAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2904:1: ( ( ( rule__Input__ContentAssignment_3 ) ) )
            // InternalUseCase.g:2905:1: ( ( rule__Input__ContentAssignment_3 ) )
            {
            // InternalUseCase.g:2905:1: ( ( rule__Input__ContentAssignment_3 ) )
            // InternalUseCase.g:2906:2: ( rule__Input__ContentAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getContentAssignment_3()); 
            // InternalUseCase.g:2907:2: ( rule__Input__ContentAssignment_3 )
            // InternalUseCase.g:2907:3: rule__Input__ContentAssignment_3
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
    // InternalUseCase.g:2915:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2919:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // InternalUseCase.g:2920:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalUseCase.g:2927:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2931:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalUseCase.g:2932:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalUseCase.g:2932:1: ( ( rule__Input__Group_4__0 )? )
            // InternalUseCase.g:2933:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalUseCase.g:2934:2: ( rule__Input__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=24 && LA44_0<=25)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUseCase.g:2934:3: rule__Input__Group_4__0
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
    // InternalUseCase.g:2942:1: rule__Input__Group__5 : rule__Input__Group__5__Impl ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2946:1: ( rule__Input__Group__5__Impl )
            // InternalUseCase.g:2947:2: rule__Input__Group__5__Impl
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
    // InternalUseCase.g:2953:1: rule__Input__Group__5__Impl : ( ( rule__Input__Group_5__0 )? ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2957:1: ( ( ( rule__Input__Group_5__0 )? ) )
            // InternalUseCase.g:2958:1: ( ( rule__Input__Group_5__0 )? )
            {
            // InternalUseCase.g:2958:1: ( ( rule__Input__Group_5__0 )? )
            // InternalUseCase.g:2959:2: ( rule__Input__Group_5__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_5()); 
            // InternalUseCase.g:2960:2: ( rule__Input__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUseCase.g:2960:3: rule__Input__Group_5__0
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
    // InternalUseCase.g:2969:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2973:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalUseCase.g:2974:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
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
    // InternalUseCase.g:2981:1: rule__Input__Group_4__0__Impl : ( ( rule__Input__Alternatives_4_0 ) ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2985:1: ( ( ( rule__Input__Alternatives_4_0 ) ) )
            // InternalUseCase.g:2986:1: ( ( rule__Input__Alternatives_4_0 ) )
            {
            // InternalUseCase.g:2986:1: ( ( rule__Input__Alternatives_4_0 ) )
            // InternalUseCase.g:2987:2: ( rule__Input__Alternatives_4_0 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_4_0()); 
            // InternalUseCase.g:2988:2: ( rule__Input__Alternatives_4_0 )
            // InternalUseCase.g:2988:3: rule__Input__Alternatives_4_0
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
    // InternalUseCase.g:2996:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3000:1: ( rule__Input__Group_4__1__Impl )
            // InternalUseCase.g:3001:2: rule__Input__Group_4__1__Impl
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
    // InternalUseCase.g:3007:1: rule__Input__Group_4__1__Impl : ( ( rule__Input__TypeAssignment_4_1 ) ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3011:1: ( ( ( rule__Input__TypeAssignment_4_1 ) ) )
            // InternalUseCase.g:3012:1: ( ( rule__Input__TypeAssignment_4_1 ) )
            {
            // InternalUseCase.g:3012:1: ( ( rule__Input__TypeAssignment_4_1 ) )
            // InternalUseCase.g:3013:2: ( rule__Input__TypeAssignment_4_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_4_1()); 
            // InternalUseCase.g:3014:2: ( rule__Input__TypeAssignment_4_1 )
            // InternalUseCase.g:3014:3: rule__Input__TypeAssignment_4_1
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
    // InternalUseCase.g:3023:1: rule__Input__Group_5__0 : rule__Input__Group_5__0__Impl rule__Input__Group_5__1 ;
    public final void rule__Input__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3027:1: ( rule__Input__Group_5__0__Impl rule__Input__Group_5__1 )
            // InternalUseCase.g:3028:2: rule__Input__Group_5__0__Impl rule__Input__Group_5__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalUseCase.g:3035:1: rule__Input__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Input__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3039:1: ( ( '(' ) )
            // InternalUseCase.g:3040:1: ( '(' )
            {
            // InternalUseCase.g:3040:1: ( '(' )
            // InternalUseCase.g:3041:2: '('
            {
             before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalUseCase.g:3050:1: rule__Input__Group_5__1 : rule__Input__Group_5__1__Impl rule__Input__Group_5__2 ;
    public final void rule__Input__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3054:1: ( rule__Input__Group_5__1__Impl rule__Input__Group_5__2 )
            // InternalUseCase.g:3055:2: rule__Input__Group_5__1__Impl rule__Input__Group_5__2
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
    // InternalUseCase.g:3062:1: rule__Input__Group_5__1__Impl : ( ( rule__Input__Alternatives_5_1 ) ) ;
    public final void rule__Input__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3066:1: ( ( ( rule__Input__Alternatives_5_1 ) ) )
            // InternalUseCase.g:3067:1: ( ( rule__Input__Alternatives_5_1 ) )
            {
            // InternalUseCase.g:3067:1: ( ( rule__Input__Alternatives_5_1 ) )
            // InternalUseCase.g:3068:2: ( rule__Input__Alternatives_5_1 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_5_1()); 
            // InternalUseCase.g:3069:2: ( rule__Input__Alternatives_5_1 )
            // InternalUseCase.g:3069:3: rule__Input__Alternatives_5_1
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
    // InternalUseCase.g:3077:1: rule__Input__Group_5__2 : rule__Input__Group_5__2__Impl rule__Input__Group_5__3 ;
    public final void rule__Input__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3081:1: ( rule__Input__Group_5__2__Impl rule__Input__Group_5__3 )
            // InternalUseCase.g:3082:2: rule__Input__Group_5__2__Impl rule__Input__Group_5__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalUseCase.g:3089:1: rule__Input__Group_5__2__Impl : ( ( rule__Input__ExampleAssignment_5_2 ) ) ;
    public final void rule__Input__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3093:1: ( ( ( rule__Input__ExampleAssignment_5_2 ) ) )
            // InternalUseCase.g:3094:1: ( ( rule__Input__ExampleAssignment_5_2 ) )
            {
            // InternalUseCase.g:3094:1: ( ( rule__Input__ExampleAssignment_5_2 ) )
            // InternalUseCase.g:3095:2: ( rule__Input__ExampleAssignment_5_2 )
            {
             before(grammarAccess.getInputAccess().getExampleAssignment_5_2()); 
            // InternalUseCase.g:3096:2: ( rule__Input__ExampleAssignment_5_2 )
            // InternalUseCase.g:3096:3: rule__Input__ExampleAssignment_5_2
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
    // InternalUseCase.g:3104:1: rule__Input__Group_5__3 : rule__Input__Group_5__3__Impl ;
    public final void rule__Input__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3108:1: ( rule__Input__Group_5__3__Impl )
            // InternalUseCase.g:3109:2: rule__Input__Group_5__3__Impl
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
    // InternalUseCase.g:3115:1: rule__Input__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Input__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3119:1: ( ( ')' ) )
            // InternalUseCase.g:3120:1: ( ')' )
            {
            // InternalUseCase.g:3120:1: ( ')' )
            // InternalUseCase.g:3121:2: ')'
            {
             before(grammarAccess.getInputAccess().getRightParenthesisKeyword_5_3()); 
            match(input,58,FOLLOW_2); 
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
    // InternalUseCase.g:3131:1: rule__Outputs__Group__0 : rule__Outputs__Group__0__Impl rule__Outputs__Group__1 ;
    public final void rule__Outputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3135:1: ( rule__Outputs__Group__0__Impl rule__Outputs__Group__1 )
            // InternalUseCase.g:3136:2: rule__Outputs__Group__0__Impl rule__Outputs__Group__1
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
    // InternalUseCase.g:3143:1: rule__Outputs__Group__0__Impl : ( ( rule__Outputs__Alternatives_0 ) ) ;
    public final void rule__Outputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3147:1: ( ( ( rule__Outputs__Alternatives_0 ) ) )
            // InternalUseCase.g:3148:1: ( ( rule__Outputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:3148:1: ( ( rule__Outputs__Alternatives_0 ) )
            // InternalUseCase.g:3149:2: ( rule__Outputs__Alternatives_0 )
            {
             before(grammarAccess.getOutputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3150:2: ( rule__Outputs__Alternatives_0 )
            // InternalUseCase.g:3150:3: rule__Outputs__Alternatives_0
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
    // InternalUseCase.g:3158:1: rule__Outputs__Group__1 : rule__Outputs__Group__1__Impl ;
    public final void rule__Outputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3162:1: ( rule__Outputs__Group__1__Impl )
            // InternalUseCase.g:3163:2: rule__Outputs__Group__1__Impl
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
    // InternalUseCase.g:3169:1: rule__Outputs__Group__1__Impl : ( ( rule__Outputs__OutputsAssignment_1 )* ) ;
    public final void rule__Outputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3173:1: ( ( ( rule__Outputs__OutputsAssignment_1 )* ) )
            // InternalUseCase.g:3174:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            {
            // InternalUseCase.g:3174:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            // InternalUseCase.g:3175:2: ( rule__Outputs__OutputsAssignment_1 )*
            {
             before(grammarAccess.getOutputsAccess().getOutputsAssignment_1()); 
            // InternalUseCase.g:3176:2: ( rule__Outputs__OutputsAssignment_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==50||LA46_0==77) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUseCase.g:3176:3: rule__Outputs__OutputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Outputs__OutputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalUseCase.g:3185:1: rule__Outputs__Group_0_0_2__0 : rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1 ;
    public final void rule__Outputs__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3189:1: ( rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1 )
            // InternalUseCase.g:3190:2: rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1
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
    // InternalUseCase.g:3197:1: rule__Outputs__Group_0_0_2__0__Impl : ( 'produces' ) ;
    public final void rule__Outputs__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3201:1: ( ( 'produces' ) )
            // InternalUseCase.g:3202:1: ( 'produces' )
            {
            // InternalUseCase.g:3202:1: ( 'produces' )
            // InternalUseCase.g:3203:2: 'produces'
            {
             before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_2_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalUseCase.g:3212:1: rule__Outputs__Group_0_0_2__1 : rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2 ;
    public final void rule__Outputs__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3216:1: ( rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2 )
            // InternalUseCase.g:3217:2: rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2
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
    // InternalUseCase.g:3224:1: rule__Outputs__Group_0_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Outputs__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3228:1: ( ( 'the' ) )
            // InternalUseCase.g:3229:1: ( 'the' )
            {
            // InternalUseCase.g:3229:1: ( 'the' )
            // InternalUseCase.g:3230:2: 'the'
            {
             before(grammarAccess.getOutputsAccess().getTheKeyword_0_0_2_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUseCase.g:3239:1: rule__Outputs__Group_0_0_2__2 : rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3 ;
    public final void rule__Outputs__Group_0_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3243:1: ( rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3 )
            // InternalUseCase.g:3244:2: rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalUseCase.g:3251:1: rule__Outputs__Group_0_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Outputs__Group_0_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3255:1: ( ( 'following' ) )
            // InternalUseCase.g:3256:1: ( 'following' )
            {
            // InternalUseCase.g:3256:1: ( 'following' )
            // InternalUseCase.g:3257:2: 'following'
            {
             before(grammarAccess.getOutputsAccess().getFollowingKeyword_0_0_2_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUseCase.g:3266:1: rule__Outputs__Group_0_0_2__3 : rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4 ;
    public final void rule__Outputs__Group_0_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3270:1: ( rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4 )
            // InternalUseCase.g:3271:2: rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4
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
    // InternalUseCase.g:3278:1: rule__Outputs__Group_0_0_2__3__Impl : ( 'output' ) ;
    public final void rule__Outputs__Group_0_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3282:1: ( ( 'output' ) )
            // InternalUseCase.g:3283:1: ( 'output' )
            {
            // InternalUseCase.g:3283:1: ( 'output' )
            // InternalUseCase.g:3284:2: 'output'
            {
             before(grammarAccess.getOutputsAccess().getOutputKeyword_0_0_2_3()); 
            match(input,60,FOLLOW_2); 
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
    // InternalUseCase.g:3293:1: rule__Outputs__Group_0_0_2__4 : rule__Outputs__Group_0_0_2__4__Impl ;
    public final void rule__Outputs__Group_0_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3297:1: ( rule__Outputs__Group_0_0_2__4__Impl )
            // InternalUseCase.g:3298:2: rule__Outputs__Group_0_0_2__4__Impl
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
    // InternalUseCase.g:3304:1: rule__Outputs__Group_0_0_2__4__Impl : ( ':' ) ;
    public final void rule__Outputs__Group_0_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3308:1: ( ( ':' ) )
            // InternalUseCase.g:3309:1: ( ':' )
            {
            // InternalUseCase.g:3309:1: ( ':' )
            // InternalUseCase.g:3310:2: ':'
            {
             before(grammarAccess.getOutputsAccess().getColonKeyword_0_0_2_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:3320:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3324:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalUseCase.g:3325:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalUseCase.g:3332:1: rule__Output__Group__0__Impl : ( ( rule__Output__ManyAssignment_0 )? ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3336:1: ( ( ( rule__Output__ManyAssignment_0 )? ) )
            // InternalUseCase.g:3337:1: ( ( rule__Output__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:3337:1: ( ( rule__Output__ManyAssignment_0 )? )
            // InternalUseCase.g:3338:2: ( rule__Output__ManyAssignment_0 )?
            {
             before(grammarAccess.getOutputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:3339:2: ( rule__Output__ManyAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==77) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUseCase.g:3339:3: rule__Output__ManyAssignment_0
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
    // InternalUseCase.g:3347:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3351:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalUseCase.g:3352:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalUseCase.g:3359:1: rule__Output__Group__1__Impl : ( '-' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3363:1: ( ( '-' ) )
            // InternalUseCase.g:3364:1: ( '-' )
            {
            // InternalUseCase.g:3364:1: ( '-' )
            // InternalUseCase.g:3365:2: '-'
            {
             before(grammarAccess.getOutputAccess().getHyphenMinusKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUseCase.g:3374:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3378:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalUseCase.g:3379:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalUseCase.g:3386:1: rule__Output__Group__2__Impl : ( ( rule__Output__ContentAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3390:1: ( ( ( rule__Output__ContentAssignment_2 ) ) )
            // InternalUseCase.g:3391:1: ( ( rule__Output__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:3391:1: ( ( rule__Output__ContentAssignment_2 ) )
            // InternalUseCase.g:3392:2: ( rule__Output__ContentAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:3393:2: ( rule__Output__ContentAssignment_2 )
            // InternalUseCase.g:3393:3: rule__Output__ContentAssignment_2
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
    // InternalUseCase.g:3401:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3405:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalUseCase.g:3406:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalUseCase.g:3413:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3417:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalUseCase.g:3418:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalUseCase.g:3418:1: ( ( rule__Output__Group_3__0 )? )
            // InternalUseCase.g:3419:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalUseCase.g:3420:2: ( rule__Output__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=24 && LA48_0<=25)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUseCase.g:3420:3: rule__Output__Group_3__0
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
    // InternalUseCase.g:3428:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3432:1: ( rule__Output__Group__4__Impl )
            // InternalUseCase.g:3433:2: rule__Output__Group__4__Impl
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
    // InternalUseCase.g:3439:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3443:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalUseCase.g:3444:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalUseCase.g:3444:1: ( ( rule__Output__Group_4__0 )? )
            // InternalUseCase.g:3445:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalUseCase.g:3446:2: ( rule__Output__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==57) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUseCase.g:3446:3: rule__Output__Group_4__0
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
    // InternalUseCase.g:3455:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3459:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalUseCase.g:3460:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
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
    // InternalUseCase.g:3467:1: rule__Output__Group_3__0__Impl : ( ( rule__Output__Alternatives_3_0 ) ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3471:1: ( ( ( rule__Output__Alternatives_3_0 ) ) )
            // InternalUseCase.g:3472:1: ( ( rule__Output__Alternatives_3_0 ) )
            {
            // InternalUseCase.g:3472:1: ( ( rule__Output__Alternatives_3_0 ) )
            // InternalUseCase.g:3473:2: ( rule__Output__Alternatives_3_0 )
            {
             before(grammarAccess.getOutputAccess().getAlternatives_3_0()); 
            // InternalUseCase.g:3474:2: ( rule__Output__Alternatives_3_0 )
            // InternalUseCase.g:3474:3: rule__Output__Alternatives_3_0
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
    // InternalUseCase.g:3482:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3486:1: ( rule__Output__Group_3__1__Impl )
            // InternalUseCase.g:3487:2: rule__Output__Group_3__1__Impl
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
    // InternalUseCase.g:3493:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3497:1: ( ( ( rule__Output__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:3498:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:3498:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            // InternalUseCase.g:3499:2: ( rule__Output__TypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:3500:2: ( rule__Output__TypeAssignment_3_1 )
            // InternalUseCase.g:3500:3: rule__Output__TypeAssignment_3_1
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
    // InternalUseCase.g:3509:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3513:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalUseCase.g:3514:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalUseCase.g:3521:1: rule__Output__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3525:1: ( ( '(' ) )
            // InternalUseCase.g:3526:1: ( '(' )
            {
            // InternalUseCase.g:3526:1: ( '(' )
            // InternalUseCase.g:3527:2: '('
            {
             before(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalUseCase.g:3536:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl rule__Output__Group_4__2 ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3540:1: ( rule__Output__Group_4__1__Impl rule__Output__Group_4__2 )
            // InternalUseCase.g:3541:2: rule__Output__Group_4__1__Impl rule__Output__Group_4__2
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
    // InternalUseCase.g:3548:1: rule__Output__Group_4__1__Impl : ( ( rule__Output__Alternatives_4_1 ) ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3552:1: ( ( ( rule__Output__Alternatives_4_1 ) ) )
            // InternalUseCase.g:3553:1: ( ( rule__Output__Alternatives_4_1 ) )
            {
            // InternalUseCase.g:3553:1: ( ( rule__Output__Alternatives_4_1 ) )
            // InternalUseCase.g:3554:2: ( rule__Output__Alternatives_4_1 )
            {
             before(grammarAccess.getOutputAccess().getAlternatives_4_1()); 
            // InternalUseCase.g:3555:2: ( rule__Output__Alternatives_4_1 )
            // InternalUseCase.g:3555:3: rule__Output__Alternatives_4_1
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
    // InternalUseCase.g:3563:1: rule__Output__Group_4__2 : rule__Output__Group_4__2__Impl rule__Output__Group_4__3 ;
    public final void rule__Output__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3567:1: ( rule__Output__Group_4__2__Impl rule__Output__Group_4__3 )
            // InternalUseCase.g:3568:2: rule__Output__Group_4__2__Impl rule__Output__Group_4__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalUseCase.g:3575:1: rule__Output__Group_4__2__Impl : ( ( rule__Output__ExampleAssignment_4_2 ) ) ;
    public final void rule__Output__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3579:1: ( ( ( rule__Output__ExampleAssignment_4_2 ) ) )
            // InternalUseCase.g:3580:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            {
            // InternalUseCase.g:3580:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            // InternalUseCase.g:3581:2: ( rule__Output__ExampleAssignment_4_2 )
            {
             before(grammarAccess.getOutputAccess().getExampleAssignment_4_2()); 
            // InternalUseCase.g:3582:2: ( rule__Output__ExampleAssignment_4_2 )
            // InternalUseCase.g:3582:3: rule__Output__ExampleAssignment_4_2
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
    // InternalUseCase.g:3590:1: rule__Output__Group_4__3 : rule__Output__Group_4__3__Impl ;
    public final void rule__Output__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3594:1: ( rule__Output__Group_4__3__Impl )
            // InternalUseCase.g:3595:2: rule__Output__Group_4__3__Impl
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
    // InternalUseCase.g:3601:1: rule__Output__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Output__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3605:1: ( ( ')' ) )
            // InternalUseCase.g:3606:1: ( ')' )
            {
            // InternalUseCase.g:3606:1: ( ')' )
            // InternalUseCase.g:3607:2: ')'
            {
             before(grammarAccess.getOutputAccess().getRightParenthesisKeyword_4_3()); 
            match(input,58,FOLLOW_2); 
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
    // InternalUseCase.g:3617:1: rule__PreConditions__Group__0 : rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 ;
    public final void rule__PreConditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3621:1: ( rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 )
            // InternalUseCase.g:3622:2: rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalUseCase.g:3629:1: rule__PreConditions__Group__0__Impl : ( ( rule__PreConditions__Alternatives_0 ) ) ;
    public final void rule__PreConditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3633:1: ( ( ( rule__PreConditions__Alternatives_0 ) ) )
            // InternalUseCase.g:3634:1: ( ( rule__PreConditions__Alternatives_0 ) )
            {
            // InternalUseCase.g:3634:1: ( ( rule__PreConditions__Alternatives_0 ) )
            // InternalUseCase.g:3635:2: ( rule__PreConditions__Alternatives_0 )
            {
             before(grammarAccess.getPreConditionsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3636:2: ( rule__PreConditions__Alternatives_0 )
            // InternalUseCase.g:3636:3: rule__PreConditions__Alternatives_0
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
    // InternalUseCase.g:3644:1: rule__PreConditions__Group__1 : rule__PreConditions__Group__1__Impl ;
    public final void rule__PreConditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3648:1: ( rule__PreConditions__Group__1__Impl )
            // InternalUseCase.g:3649:2: rule__PreConditions__Group__1__Impl
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
    // InternalUseCase.g:3655:1: rule__PreConditions__Group__1__Impl : ( ( rule__PreConditions__ConditionsAssignment_1 )* ) ;
    public final void rule__PreConditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3659:1: ( ( ( rule__PreConditions__ConditionsAssignment_1 )* ) )
            // InternalUseCase.g:3660:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            {
            // InternalUseCase.g:3660:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            // InternalUseCase.g:3661:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            {
             before(grammarAccess.getPreConditionsAccess().getConditionsAssignment_1()); 
            // InternalUseCase.g:3662:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==50) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUseCase.g:3662:3: rule__PreConditions__ConditionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__PreConditions__ConditionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalUseCase.g:3671:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3675:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalUseCase.g:3676:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalUseCase.g:3683:1: rule__Condition__Group__0__Impl : ( '-' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3687:1: ( ( '-' ) )
            // InternalUseCase.g:3688:1: ( '-' )
            {
            // InternalUseCase.g:3688:1: ( '-' )
            // InternalUseCase.g:3689:2: '-'
            {
             before(grammarAccess.getConditionAccess().getHyphenMinusKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUseCase.g:3698:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3702:1: ( rule__Condition__Group__1__Impl )
            // InternalUseCase.g:3703:2: rule__Condition__Group__1__Impl
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
    // InternalUseCase.g:3709:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ContentAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3713:1: ( ( ( rule__Condition__ContentAssignment_1 ) ) )
            // InternalUseCase.g:3714:1: ( ( rule__Condition__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:3714:1: ( ( rule__Condition__ContentAssignment_1 ) )
            // InternalUseCase.g:3715:2: ( rule__Condition__ContentAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getContentAssignment_1()); 
            // InternalUseCase.g:3716:2: ( rule__Condition__ContentAssignment_1 )
            // InternalUseCase.g:3716:3: rule__Condition__ContentAssignment_1
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
    // InternalUseCase.g:3725:1: rule__Steps__Group__0 : rule__Steps__Group__0__Impl rule__Steps__Group__1 ;
    public final void rule__Steps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3729:1: ( rule__Steps__Group__0__Impl rule__Steps__Group__1 )
            // InternalUseCase.g:3730:2: rule__Steps__Group__0__Impl rule__Steps__Group__1
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
    // InternalUseCase.g:3737:1: rule__Steps__Group__0__Impl : ( ( rule__Steps__Alternatives_0 ) ) ;
    public final void rule__Steps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3741:1: ( ( ( rule__Steps__Alternatives_0 ) ) )
            // InternalUseCase.g:3742:1: ( ( rule__Steps__Alternatives_0 ) )
            {
            // InternalUseCase.g:3742:1: ( ( rule__Steps__Alternatives_0 ) )
            // InternalUseCase.g:3743:2: ( rule__Steps__Alternatives_0 )
            {
             before(grammarAccess.getStepsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3744:2: ( rule__Steps__Alternatives_0 )
            // InternalUseCase.g:3744:3: rule__Steps__Alternatives_0
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
    // InternalUseCase.g:3752:1: rule__Steps__Group__1 : rule__Steps__Group__1__Impl ;
    public final void rule__Steps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3756:1: ( rule__Steps__Group__1__Impl )
            // InternalUseCase.g:3757:2: rule__Steps__Group__1__Impl
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
    // InternalUseCase.g:3763:1: rule__Steps__Group__1__Impl : ( ( rule__Steps__StepsAssignment_1 )* ) ;
    public final void rule__Steps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3767:1: ( ( ( rule__Steps__StepsAssignment_1 )* ) )
            // InternalUseCase.g:3768:1: ( ( rule__Steps__StepsAssignment_1 )* )
            {
            // InternalUseCase.g:3768:1: ( ( rule__Steps__StepsAssignment_1 )* )
            // InternalUseCase.g:3769:2: ( rule__Steps__StepsAssignment_1 )*
            {
             before(grammarAccess.getStepsAccess().getStepsAssignment_1()); 
            // InternalUseCase.g:3770:2: ( rule__Steps__StepsAssignment_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_INT) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalUseCase.g:3770:3: rule__Steps__StepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Steps__StepsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalUseCase.g:3779:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3783:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalUseCase.g:3784:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCase.g:3791:1: rule__Step__Group__0__Impl : ( ( rule__Step__NumberAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3795:1: ( ( ( rule__Step__NumberAssignment_0 ) ) )
            // InternalUseCase.g:3796:1: ( ( rule__Step__NumberAssignment_0 ) )
            {
            // InternalUseCase.g:3796:1: ( ( rule__Step__NumberAssignment_0 ) )
            // InternalUseCase.g:3797:2: ( rule__Step__NumberAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getNumberAssignment_0()); 
            // InternalUseCase.g:3798:2: ( rule__Step__NumberAssignment_0 )
            // InternalUseCase.g:3798:3: rule__Step__NumberAssignment_0
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
    // InternalUseCase.g:3806:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3810:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalUseCase.g:3811:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__2();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:3818:1: rule__Step__Group__1__Impl : ( ( rule__Step__ActionAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3822:1: ( ( ( rule__Step__ActionAssignment_1 ) ) )
            // InternalUseCase.g:3823:1: ( ( rule__Step__ActionAssignment_1 ) )
            {
            // InternalUseCase.g:3823:1: ( ( rule__Step__ActionAssignment_1 ) )
            // InternalUseCase.g:3824:2: ( rule__Step__ActionAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getActionAssignment_1()); 
            // InternalUseCase.g:3825:2: ( rule__Step__ActionAssignment_1 )
            // InternalUseCase.g:3825:3: rule__Step__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getActionAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Step__Group__2"
    // InternalUseCase.g:3833:1: rule__Step__Group__2 : rule__Step__Group__2__Impl ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3837:1: ( rule__Step__Group__2__Impl )
            // InternalUseCase.g:3838:2: rule__Step__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2"


    // $ANTLR start "rule__Step__Group__2__Impl"
    // InternalUseCase.g:3844:1: rule__Step__Group__2__Impl : ( ( rule__Step__ErrorAssignment_2 )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3848:1: ( ( ( rule__Step__ErrorAssignment_2 )? ) )
            // InternalUseCase.g:3849:1: ( ( rule__Step__ErrorAssignment_2 )? )
            {
            // InternalUseCase.g:3849:1: ( ( rule__Step__ErrorAssignment_2 )? )
            // InternalUseCase.g:3850:2: ( rule__Step__ErrorAssignment_2 )?
            {
             before(grammarAccess.getStepAccess().getErrorAssignment_2()); 
            // InternalUseCase.g:3851:2: ( rule__Step__ErrorAssignment_2 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=36 && LA52_0<=37)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUseCase.g:3851:3: rule__Step__ErrorAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Step__ErrorAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStepAccess().getErrorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__RaiseError__Group__0"
    // InternalUseCase.g:3860:1: rule__RaiseError__Group__0 : rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1 ;
    public final void rule__RaiseError__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3864:1: ( rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1 )
            // InternalUseCase.g:3865:2: rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__RaiseError__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseError__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group__0"


    // $ANTLR start "rule__RaiseError__Group__0__Impl"
    // InternalUseCase.g:3872:1: rule__RaiseError__Group__0__Impl : ( ( rule__RaiseError__Alternatives_0 ) ) ;
    public final void rule__RaiseError__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3876:1: ( ( ( rule__RaiseError__Alternatives_0 ) ) )
            // InternalUseCase.g:3877:1: ( ( rule__RaiseError__Alternatives_0 ) )
            {
            // InternalUseCase.g:3877:1: ( ( rule__RaiseError__Alternatives_0 ) )
            // InternalUseCase.g:3878:2: ( rule__RaiseError__Alternatives_0 )
            {
             before(grammarAccess.getRaiseErrorAccess().getAlternatives_0()); 
            // InternalUseCase.g:3879:2: ( rule__RaiseError__Alternatives_0 )
            // InternalUseCase.g:3879:3: rule__RaiseError__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__RaiseError__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRaiseErrorAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group__0__Impl"


    // $ANTLR start "rule__RaiseError__Group__1"
    // InternalUseCase.g:3887:1: rule__RaiseError__Group__1 : rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2 ;
    public final void rule__RaiseError__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3891:1: ( rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2 )
            // InternalUseCase.g:3892:2: rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RaiseError__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseError__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group__1"


    // $ANTLR start "rule__RaiseError__Group__1__Impl"
    // InternalUseCase.g:3899:1: rule__RaiseError__Group__1__Impl : ( ( rule__RaiseError__Alternatives_1 ) ) ;
    public final void rule__RaiseError__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3903:1: ( ( ( rule__RaiseError__Alternatives_1 ) ) )
            // InternalUseCase.g:3904:1: ( ( rule__RaiseError__Alternatives_1 ) )
            {
            // InternalUseCase.g:3904:1: ( ( rule__RaiseError__Alternatives_1 ) )
            // InternalUseCase.g:3905:2: ( rule__RaiseError__Alternatives_1 )
            {
             before(grammarAccess.getRaiseErrorAccess().getAlternatives_1()); 
            // InternalUseCase.g:3906:2: ( rule__RaiseError__Alternatives_1 )
            // InternalUseCase.g:3906:3: rule__RaiseError__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__RaiseError__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRaiseErrorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group__1__Impl"


    // $ANTLR start "rule__RaiseError__Group__2"
    // InternalUseCase.g:3914:1: rule__RaiseError__Group__2 : rule__RaiseError__Group__2__Impl ;
    public final void rule__RaiseError__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3918:1: ( rule__RaiseError__Group__2__Impl )
            // InternalUseCase.g:3919:2: rule__RaiseError__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseError__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group__2"


    // $ANTLR start "rule__RaiseError__Group__2__Impl"
    // InternalUseCase.g:3925:1: rule__RaiseError__Group__2__Impl : ( ( rule__RaiseError__ExceptionAssignment_2 ) ) ;
    public final void rule__RaiseError__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3929:1: ( ( ( rule__RaiseError__ExceptionAssignment_2 ) ) )
            // InternalUseCase.g:3930:1: ( ( rule__RaiseError__ExceptionAssignment_2 ) )
            {
            // InternalUseCase.g:3930:1: ( ( rule__RaiseError__ExceptionAssignment_2 ) )
            // InternalUseCase.g:3931:2: ( rule__RaiseError__ExceptionAssignment_2 )
            {
             before(grammarAccess.getRaiseErrorAccess().getExceptionAssignment_2()); 
            // InternalUseCase.g:3932:2: ( rule__RaiseError__ExceptionAssignment_2 )
            // InternalUseCase.g:3932:3: rule__RaiseError__ExceptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RaiseError__ExceptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRaiseErrorAccess().getExceptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group__2__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_0_0__0"
    // InternalUseCase.g:3941:1: rule__RaiseError__Group_1_0_0__0 : rule__RaiseError__Group_1_0_0__0__Impl rule__RaiseError__Group_1_0_0__1 ;
    public final void rule__RaiseError__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3945:1: ( rule__RaiseError__Group_1_0_0__0__Impl rule__RaiseError__Group_1_0_0__1 )
            // InternalUseCase.g:3946:2: rule__RaiseError__Group_1_0_0__0__Impl rule__RaiseError__Group_1_0_0__1
            {
            pushFollow(FOLLOW_38);
            rule__RaiseError__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_0_0__0"


    // $ANTLR start "rule__RaiseError__Group_1_0_0__0__Impl"
    // InternalUseCase.g:3953:1: rule__RaiseError__Group_1_0_0__0__Impl : ( 'Raise' ) ;
    public final void rule__RaiseError__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3957:1: ( ( 'Raise' ) )
            // InternalUseCase.g:3958:1: ( 'Raise' )
            {
            // InternalUseCase.g:3958:1: ( 'Raise' )
            // InternalUseCase.g:3959:2: 'Raise'
            {
             before(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0_0_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_0_0__1"
    // InternalUseCase.g:3968:1: rule__RaiseError__Group_1_0_0__1 : rule__RaiseError__Group_1_0_0__1__Impl ;
    public final void rule__RaiseError__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3972:1: ( rule__RaiseError__Group_1_0_0__1__Impl )
            // InternalUseCase.g:3973:2: rule__RaiseError__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_0_0__1"


    // $ANTLR start "rule__RaiseError__Group_1_0_0__1__Impl"
    // InternalUseCase.g:3979:1: rule__RaiseError__Group_1_0_0__1__Impl : ( ( 'error' )? ) ;
    public final void rule__RaiseError__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3983:1: ( ( ( 'error' )? ) )
            // InternalUseCase.g:3984:1: ( ( 'error' )? )
            {
            // InternalUseCase.g:3984:1: ( ( 'error' )? )
            // InternalUseCase.g:3985:2: ( 'error' )?
            {
             before(grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_0_0_1()); 
            // InternalUseCase.g:3986:2: ( 'error' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==62) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalUseCase.g:3986:3: 'error'
                    {
                    match(input,62,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_0_1__0"
    // InternalUseCase.g:3995:1: rule__RaiseError__Group_1_0_1__0 : rule__RaiseError__Group_1_0_1__0__Impl rule__RaiseError__Group_1_0_1__1 ;
    public final void rule__RaiseError__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3999:1: ( rule__RaiseError__Group_1_0_1__0__Impl rule__RaiseError__Group_1_0_1__1 )
            // InternalUseCase.g:4000:2: rule__RaiseError__Group_1_0_1__0__Impl rule__RaiseError__Group_1_0_1__1
            {
            pushFollow(FOLLOW_38);
            rule__RaiseError__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_0_1__0"


    // $ANTLR start "rule__RaiseError__Group_1_0_1__0__Impl"
    // InternalUseCase.g:4007:1: rule__RaiseError__Group_1_0_1__0__Impl : ( 'On' ) ;
    public final void rule__RaiseError__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4011:1: ( ( 'On' ) )
            // InternalUseCase.g:4012:1: ( 'On' )
            {
            // InternalUseCase.g:4012:1: ( 'On' )
            // InternalUseCase.g:4013:2: 'On'
            {
             before(grammarAccess.getRaiseErrorAccess().getOnKeyword_1_0_1_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getOnKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_0_1__1"
    // InternalUseCase.g:4022:1: rule__RaiseError__Group_1_0_1__1 : rule__RaiseError__Group_1_0_1__1__Impl rule__RaiseError__Group_1_0_1__2 ;
    public final void rule__RaiseError__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4026:1: ( rule__RaiseError__Group_1_0_1__1__Impl rule__RaiseError__Group_1_0_1__2 )
            // InternalUseCase.g:4027:2: rule__RaiseError__Group_1_0_1__1__Impl rule__RaiseError__Group_1_0_1__2
            {
            pushFollow(FOLLOW_39);
            rule__RaiseError__Group_1_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_0_1__1"


    // $ANTLR start "rule__RaiseError__Group_1_0_1__1__Impl"
    // InternalUseCase.g:4034:1: rule__RaiseError__Group_1_0_1__1__Impl : ( 'error' ) ;
    public final void rule__RaiseError__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4038:1: ( ( 'error' ) )
            // InternalUseCase.g:4039:1: ( 'error' )
            {
            // InternalUseCase.g:4039:1: ( 'error' )
            // InternalUseCase.g:4040:2: 'error'
            {
             before(grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_0_1_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_0_1__2"
    // InternalUseCase.g:4049:1: rule__RaiseError__Group_1_0_1__2 : rule__RaiseError__Group_1_0_1__2__Impl ;
    public final void rule__RaiseError__Group_1_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4053:1: ( rule__RaiseError__Group_1_0_1__2__Impl )
            // InternalUseCase.g:4054:2: rule__RaiseError__Group_1_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_0_1__2"


    // $ANTLR start "rule__RaiseError__Group_1_0_1__2__Impl"
    // InternalUseCase.g:4060:1: rule__RaiseError__Group_1_0_1__2__Impl : ( 'raise' ) ;
    public final void rule__RaiseError__Group_1_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4064:1: ( ( 'raise' ) )
            // InternalUseCase.g:4065:1: ( 'raise' )
            {
            // InternalUseCase.g:4065:1: ( 'raise' )
            // InternalUseCase.g:4066:2: 'raise'
            {
             before(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0_1_2()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_0_1__2__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_1_0__0"
    // InternalUseCase.g:4076:1: rule__RaiseError__Group_1_1_0__0 : rule__RaiseError__Group_1_1_0__0__Impl rule__RaiseError__Group_1_1_0__1 ;
    public final void rule__RaiseError__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4080:1: ( rule__RaiseError__Group_1_1_0__0__Impl rule__RaiseError__Group_1_1_0__1 )
            // InternalUseCase.g:4081:2: rule__RaiseError__Group_1_1_0__0__Impl rule__RaiseError__Group_1_1_0__1
            {
            pushFollow(FOLLOW_40);
            rule__RaiseError__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1_0__0"


    // $ANTLR start "rule__RaiseError__Group_1_1_0__0__Impl"
    // InternalUseCase.g:4088:1: rule__RaiseError__Group_1_1_0__0__Impl : ( 'Melde' ) ;
    public final void rule__RaiseError__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4092:1: ( ( 'Melde' ) )
            // InternalUseCase.g:4093:1: ( 'Melde' )
            {
            // InternalUseCase.g:4093:1: ( 'Melde' )
            // InternalUseCase.g:4094:2: 'Melde'
            {
             before(grammarAccess.getRaiseErrorAccess().getMeldeKeyword_1_1_0_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getMeldeKeyword_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_1_0__1"
    // InternalUseCase.g:4103:1: rule__RaiseError__Group_1_1_0__1 : rule__RaiseError__Group_1_1_0__1__Impl ;
    public final void rule__RaiseError__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4107:1: ( rule__RaiseError__Group_1_1_0__1__Impl )
            // InternalUseCase.g:4108:2: rule__RaiseError__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1_0__1"


    // $ANTLR start "rule__RaiseError__Group_1_1_0__1__Impl"
    // InternalUseCase.g:4114:1: rule__RaiseError__Group_1_1_0__1__Impl : ( ( 'Fehler' )? ) ;
    public final void rule__RaiseError__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4118:1: ( ( ( 'Fehler' )? ) )
            // InternalUseCase.g:4119:1: ( ( 'Fehler' )? )
            {
            // InternalUseCase.g:4119:1: ( ( 'Fehler' )? )
            // InternalUseCase.g:4120:2: ( 'Fehler' )?
            {
             before(grammarAccess.getRaiseErrorAccess().getFehlerKeyword_1_1_0_1()); 
            // InternalUseCase.g:4121:2: ( 'Fehler' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==66) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUseCase.g:4121:3: 'Fehler'
                    {
                    match(input,66,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRaiseErrorAccess().getFehlerKeyword_1_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_1_1__0"
    // InternalUseCase.g:4130:1: rule__RaiseError__Group_1_1_1__0 : rule__RaiseError__Group_1_1_1__0__Impl rule__RaiseError__Group_1_1_1__1 ;
    public final void rule__RaiseError__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4134:1: ( rule__RaiseError__Group_1_1_1__0__Impl rule__RaiseError__Group_1_1_1__1 )
            // InternalUseCase.g:4135:2: rule__RaiseError__Group_1_1_1__0__Impl rule__RaiseError__Group_1_1_1__1
            {
            pushFollow(FOLLOW_40);
            rule__RaiseError__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1_1__0"


    // $ANTLR start "rule__RaiseError__Group_1_1_1__0__Impl"
    // InternalUseCase.g:4142:1: rule__RaiseError__Group_1_1_1__0__Impl : ( 'Bei' ) ;
    public final void rule__RaiseError__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4146:1: ( ( 'Bei' ) )
            // InternalUseCase.g:4147:1: ( 'Bei' )
            {
            // InternalUseCase.g:4147:1: ( 'Bei' )
            // InternalUseCase.g:4148:2: 'Bei'
            {
             before(grammarAccess.getRaiseErrorAccess().getBeiKeyword_1_1_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getBeiKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_1_1__1"
    // InternalUseCase.g:4157:1: rule__RaiseError__Group_1_1_1__1 : rule__RaiseError__Group_1_1_1__1__Impl rule__RaiseError__Group_1_1_1__2 ;
    public final void rule__RaiseError__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4161:1: ( rule__RaiseError__Group_1_1_1__1__Impl rule__RaiseError__Group_1_1_1__2 )
            // InternalUseCase.g:4162:2: rule__RaiseError__Group_1_1_1__1__Impl rule__RaiseError__Group_1_1_1__2
            {
            pushFollow(FOLLOW_41);
            rule__RaiseError__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1_1__1"


    // $ANTLR start "rule__RaiseError__Group_1_1_1__1__Impl"
    // InternalUseCase.g:4169:1: rule__RaiseError__Group_1_1_1__1__Impl : ( 'Fehler' ) ;
    public final void rule__RaiseError__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4173:1: ( ( 'Fehler' ) )
            // InternalUseCase.g:4174:1: ( 'Fehler' )
            {
            // InternalUseCase.g:4174:1: ( 'Fehler' )
            // InternalUseCase.g:4175:2: 'Fehler'
            {
             before(grammarAccess.getRaiseErrorAccess().getFehlerKeyword_1_1_1_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getFehlerKeyword_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_1_1__2"
    // InternalUseCase.g:4184:1: rule__RaiseError__Group_1_1_1__2 : rule__RaiseError__Group_1_1_1__2__Impl ;
    public final void rule__RaiseError__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4188:1: ( rule__RaiseError__Group_1_1_1__2__Impl )
            // InternalUseCase.g:4189:2: rule__RaiseError__Group_1_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1_1__2"


    // $ANTLR start "rule__RaiseError__Group_1_1_1__2__Impl"
    // InternalUseCase.g:4195:1: rule__RaiseError__Group_1_1_1__2__Impl : ( 'melde' ) ;
    public final void rule__RaiseError__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4199:1: ( ( 'melde' ) )
            // InternalUseCase.g:4200:1: ( 'melde' )
            {
            // InternalUseCase.g:4200:1: ( 'melde' )
            // InternalUseCase.g:4201:2: 'melde'
            {
             before(grammarAccess.getRaiseErrorAccess().getMeldeKeyword_1_1_1_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getMeldeKeyword_1_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1_1__2__Impl"


    // $ANTLR start "rule__Notes__Group__0"
    // InternalUseCase.g:4211:1: rule__Notes__Group__0 : rule__Notes__Group__0__Impl rule__Notes__Group__1 ;
    public final void rule__Notes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4215:1: ( rule__Notes__Group__0__Impl rule__Notes__Group__1 )
            // InternalUseCase.g:4216:2: rule__Notes__Group__0__Impl rule__Notes__Group__1
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
    // InternalUseCase.g:4223:1: rule__Notes__Group__0__Impl : ( ( rule__Notes__Alternatives_0 ) ) ;
    public final void rule__Notes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4227:1: ( ( ( rule__Notes__Alternatives_0 ) ) )
            // InternalUseCase.g:4228:1: ( ( rule__Notes__Alternatives_0 ) )
            {
            // InternalUseCase.g:4228:1: ( ( rule__Notes__Alternatives_0 ) )
            // InternalUseCase.g:4229:2: ( rule__Notes__Alternatives_0 )
            {
             before(grammarAccess.getNotesAccess().getAlternatives_0()); 
            // InternalUseCase.g:4230:2: ( rule__Notes__Alternatives_0 )
            // InternalUseCase.g:4230:3: rule__Notes__Alternatives_0
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
    // InternalUseCase.g:4238:1: rule__Notes__Group__1 : rule__Notes__Group__1__Impl ;
    public final void rule__Notes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4242:1: ( rule__Notes__Group__1__Impl )
            // InternalUseCase.g:4243:2: rule__Notes__Group__1__Impl
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
    // InternalUseCase.g:4249:1: rule__Notes__Group__1__Impl : ( ( rule__Notes__ContentAssignment_1 ) ) ;
    public final void rule__Notes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4253:1: ( ( ( rule__Notes__ContentAssignment_1 ) ) )
            // InternalUseCase.g:4254:1: ( ( rule__Notes__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:4254:1: ( ( rule__Notes__ContentAssignment_1 ) )
            // InternalUseCase.g:4255:2: ( rule__Notes__ContentAssignment_1 )
            {
             before(grammarAccess.getNotesAccess().getContentAssignment_1()); 
            // InternalUseCase.g:4256:2: ( rule__Notes__ContentAssignment_1 )
            // InternalUseCase.g:4256:3: rule__Notes__ContentAssignment_1
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
    // InternalUseCase.g:4265:1: rule__UsedTypes__Group__0 : rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 ;
    public final void rule__UsedTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4269:1: ( rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 )
            // InternalUseCase.g:4270:2: rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalUseCase.g:4277:1: rule__UsedTypes__Group__0__Impl : ( ( rule__UsedTypes__Alternatives_0 ) ) ;
    public final void rule__UsedTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4281:1: ( ( ( rule__UsedTypes__Alternatives_0 ) ) )
            // InternalUseCase.g:4282:1: ( ( rule__UsedTypes__Alternatives_0 ) )
            {
            // InternalUseCase.g:4282:1: ( ( rule__UsedTypes__Alternatives_0 ) )
            // InternalUseCase.g:4283:2: ( rule__UsedTypes__Alternatives_0 )
            {
             before(grammarAccess.getUsedTypesAccess().getAlternatives_0()); 
            // InternalUseCase.g:4284:2: ( rule__UsedTypes__Alternatives_0 )
            // InternalUseCase.g:4284:3: rule__UsedTypes__Alternatives_0
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
    // InternalUseCase.g:4292:1: rule__UsedTypes__Group__1 : rule__UsedTypes__Group__1__Impl ;
    public final void rule__UsedTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4296:1: ( rule__UsedTypes__Group__1__Impl )
            // InternalUseCase.g:4297:2: rule__UsedTypes__Group__1__Impl
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
    // InternalUseCase.g:4303:1: rule__UsedTypes__Group__1__Impl : ( ( rule__UsedTypes__TypesAssignment_1 )* ) ;
    public final void rule__UsedTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4307:1: ( ( ( rule__UsedTypes__TypesAssignment_1 )* ) )
            // InternalUseCase.g:4308:1: ( ( rule__UsedTypes__TypesAssignment_1 )* )
            {
            // InternalUseCase.g:4308:1: ( ( rule__UsedTypes__TypesAssignment_1 )* )
            // InternalUseCase.g:4309:2: ( rule__UsedTypes__TypesAssignment_1 )*
            {
             before(grammarAccess.getUsedTypesAccess().getTypesAssignment_1()); 
            // InternalUseCase.g:4310:2: ( rule__UsedTypes__TypesAssignment_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==50) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalUseCase.g:4310:3: rule__UsedTypes__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__UsedTypes__TypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalUseCase.g:4319:1: rule__UsedTypes__Group_0_0__0 : rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1 ;
    public final void rule__UsedTypes__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4323:1: ( rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1 )
            // InternalUseCase.g:4324:2: rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalUseCase.g:4331:1: rule__UsedTypes__Group_0_0__0__Impl : ( 'used' ) ;
    public final void rule__UsedTypes__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4335:1: ( ( 'used' ) )
            // InternalUseCase.g:4336:1: ( 'used' )
            {
            // InternalUseCase.g:4336:1: ( 'used' )
            // InternalUseCase.g:4337:2: 'used'
            {
             before(grammarAccess.getUsedTypesAccess().getUsedKeyword_0_0_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalUseCase.g:4346:1: rule__UsedTypes__Group_0_0__1 : rule__UsedTypes__Group_0_0__1__Impl ;
    public final void rule__UsedTypes__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4350:1: ( rule__UsedTypes__Group_0_0__1__Impl )
            // InternalUseCase.g:4351:2: rule__UsedTypes__Group_0_0__1__Impl
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
    // InternalUseCase.g:4357:1: rule__UsedTypes__Group_0_0__1__Impl : ( 'types:' ) ;
    public final void rule__UsedTypes__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4361:1: ( ( 'types:' ) )
            // InternalUseCase.g:4362:1: ( 'types:' )
            {
            // InternalUseCase.g:4362:1: ( 'types:' )
            // InternalUseCase.g:4363:2: 'types:'
            {
             before(grammarAccess.getUsedTypesAccess().getTypesKeyword_0_0_1()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getUsedTypesAccess().getTypesKeyword_0_0_1()); 

            }


            }

        }
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
    // InternalUseCase.g:4373:1: rule__UsedTypes__Group_0_1__0 : rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1 ;
    public final void rule__UsedTypes__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4377:1: ( rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1 )
            // InternalUseCase.g:4378:2: rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalUseCase.g:4385:1: rule__UsedTypes__Group_0_1__0__Impl : ( 'Genutzte' ) ;
    public final void rule__UsedTypes__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4389:1: ( ( 'Genutzte' ) )
            // InternalUseCase.g:4390:1: ( 'Genutzte' )
            {
            // InternalUseCase.g:4390:1: ( 'Genutzte' )
            // InternalUseCase.g:4391:2: 'Genutzte'
            {
             before(grammarAccess.getUsedTypesAccess().getGenutzteKeyword_0_1_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalUseCase.g:4400:1: rule__UsedTypes__Group_0_1__1 : rule__UsedTypes__Group_0_1__1__Impl ;
    public final void rule__UsedTypes__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4404:1: ( rule__UsedTypes__Group_0_1__1__Impl )
            // InternalUseCase.g:4405:2: rule__UsedTypes__Group_0_1__1__Impl
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
    // InternalUseCase.g:4411:1: rule__UsedTypes__Group_0_1__1__Impl : ( 'Typen:' ) ;
    public final void rule__UsedTypes__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4415:1: ( ( 'Typen:' ) )
            // InternalUseCase.g:4416:1: ( 'Typen:' )
            {
            // InternalUseCase.g:4416:1: ( 'Typen:' )
            // InternalUseCase.g:4417:2: 'Typen:'
            {
             before(grammarAccess.getUsedTypesAccess().getTypenKeyword_0_1_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getUsedTypesAccess().getTypenKeyword_0_1_1()); 

            }


            }

        }
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
    // InternalUseCase.g:4427:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4431:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalUseCase.g:4432:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalUseCase.g:4439:1: rule__Type__Group__0__Impl : ( '-' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4443:1: ( ( '-' ) )
            // InternalUseCase.g:4444:1: ( '-' )
            {
            // InternalUseCase.g:4444:1: ( '-' )
            // InternalUseCase.g:4445:2: '-'
            {
             before(grammarAccess.getTypeAccess().getHyphenMinusKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUseCase.g:4454:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4458:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalUseCase.g:4459:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalUseCase.g:4466:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4470:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalUseCase.g:4471:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalUseCase.g:4471:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalUseCase.g:4472:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalUseCase.g:4473:2: ( rule__Type__NameAssignment_1 )
            // InternalUseCase.g:4473:3: rule__Type__NameAssignment_1
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
    // InternalUseCase.g:4481:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4485:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalUseCase.g:4486:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCase.g:4493:1: rule__Type__Group__2__Impl : ( '(' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4497:1: ( ( '(' ) )
            // InternalUseCase.g:4498:1: ( '(' )
            {
            // InternalUseCase.g:4498:1: ( '(' )
            // InternalUseCase.g:4499:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalUseCase.g:4508:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4512:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalUseCase.g:4513:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__4();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:4520:1: rule__Type__Group__3__Impl : ( ( rule__Type__DescriptionAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4524:1: ( ( ( rule__Type__DescriptionAssignment_3 ) ) )
            // InternalUseCase.g:4525:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            {
            // InternalUseCase.g:4525:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            // InternalUseCase.g:4526:2: ( rule__Type__DescriptionAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getDescriptionAssignment_3()); 
            // InternalUseCase.g:4527:2: ( rule__Type__DescriptionAssignment_3 )
            // InternalUseCase.g:4527:3: rule__Type__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getDescriptionAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Type__Group__4"
    // InternalUseCase.g:4535:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4539:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalUseCase.g:4540:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__Type__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4"


    // $ANTLR start "rule__Type__Group__4__Impl"
    // InternalUseCase.g:4547:1: rule__Type__Group__4__Impl : ( ')' ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4551:1: ( ( ')' ) )
            // InternalUseCase.g:4552:1: ( ')' )
            {
            // InternalUseCase.g:4552:1: ( ')' )
            // InternalUseCase.g:4553:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4__Impl"


    // $ANTLR start "rule__Type__Group__5"
    // InternalUseCase.g:4562:1: rule__Type__Group__5 : rule__Type__Group__5__Impl ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4566:1: ( rule__Type__Group__5__Impl )
            // InternalUseCase.g:4567:2: rule__Type__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5"


    // $ANTLR start "rule__Type__Group__5__Impl"
    // InternalUseCase.g:4573:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )? ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4577:1: ( ( ( rule__Type__Group_5__0 )? ) )
            // InternalUseCase.g:4578:1: ( ( rule__Type__Group_5__0 )? )
            {
            // InternalUseCase.g:4578:1: ( ( rule__Type__Group_5__0 )? )
            // InternalUseCase.g:4579:2: ( rule__Type__Group_5__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // InternalUseCase.g:4580:2: ( rule__Type__Group_5__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==73) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalUseCase.g:4580:3: rule__Type__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5__Impl"


    // $ANTLR start "rule__Type__Group_5__0"
    // InternalUseCase.g:4589:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4593:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalUseCase.g:4594:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0"


    // $ANTLR start "rule__Type__Group_5__0__Impl"
    // InternalUseCase.g:4601:1: rule__Type__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4605:1: ( ( '[' ) )
            // InternalUseCase.g:4606:1: ( '[' )
            {
            // InternalUseCase.g:4606:1: ( '[' )
            // InternalUseCase.g:4607:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__0__Impl"


    // $ANTLR start "rule__Type__Group_5__1"
    // InternalUseCase.g:4616:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4620:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalUseCase.g:4621:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_46);
            rule__Type__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1"


    // $ANTLR start "rule__Type__Group_5__1__Impl"
    // InternalUseCase.g:4628:1: rule__Type__Group_5__1__Impl : ( ( rule__Type__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4632:1: ( ( ( rule__Type__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:4633:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:4633:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:4634:2: ( rule__Type__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getTypeAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:4635:2: ( rule__Type__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:4635:3: rule__Type__ImportInfoAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ImportInfoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getImportInfoAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__1__Impl"


    // $ANTLR start "rule__Type__Group_5__2"
    // InternalUseCase.g:4643:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4647:1: ( rule__Type__Group_5__2__Impl )
            // InternalUseCase.g:4648:2: rule__Type__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__2"


    // $ANTLR start "rule__Type__Group_5__2__Impl"
    // InternalUseCase.g:4654:1: rule__Type__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4658:1: ( ( ']' ) )
            // InternalUseCase.g:4659:1: ( ']' )
            {
            // InternalUseCase.g:4659:1: ( ']' )
            // InternalUseCase.g:4660:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_5__2__Impl"


    // $ANTLR start "rule__UsedExceptions__Group__0"
    // InternalUseCase.g:4670:1: rule__UsedExceptions__Group__0 : rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 ;
    public final void rule__UsedExceptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4674:1: ( rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 )
            // InternalUseCase.g:4675:2: rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalUseCase.g:4682:1: rule__UsedExceptions__Group__0__Impl : ( ( rule__UsedExceptions__Alternatives_0 ) ) ;
    public final void rule__UsedExceptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4686:1: ( ( ( rule__UsedExceptions__Alternatives_0 ) ) )
            // InternalUseCase.g:4687:1: ( ( rule__UsedExceptions__Alternatives_0 ) )
            {
            // InternalUseCase.g:4687:1: ( ( rule__UsedExceptions__Alternatives_0 ) )
            // InternalUseCase.g:4688:2: ( rule__UsedExceptions__Alternatives_0 )
            {
             before(grammarAccess.getUsedExceptionsAccess().getAlternatives_0()); 
            // InternalUseCase.g:4689:2: ( rule__UsedExceptions__Alternatives_0 )
            // InternalUseCase.g:4689:3: rule__UsedExceptions__Alternatives_0
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
    // InternalUseCase.g:4697:1: rule__UsedExceptions__Group__1 : rule__UsedExceptions__Group__1__Impl ;
    public final void rule__UsedExceptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4701:1: ( rule__UsedExceptions__Group__1__Impl )
            // InternalUseCase.g:4702:2: rule__UsedExceptions__Group__1__Impl
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
    // InternalUseCase.g:4708:1: rule__UsedExceptions__Group__1__Impl : ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* ) ;
    public final void rule__UsedExceptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4712:1: ( ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* ) )
            // InternalUseCase.g:4713:1: ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* )
            {
            // InternalUseCase.g:4713:1: ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* )
            // InternalUseCase.g:4714:2: ( rule__UsedExceptions__ExceptionsAssignment_1 )*
            {
             before(grammarAccess.getUsedExceptionsAccess().getExceptionsAssignment_1()); 
            // InternalUseCase.g:4715:2: ( rule__UsedExceptions__ExceptionsAssignment_1 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==50) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalUseCase.g:4715:3: rule__UsedExceptions__ExceptionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__UsedExceptions__ExceptionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalUseCase.g:4724:1: rule__UsedExceptions__Group_0_0__0 : rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1 ;
    public final void rule__UsedExceptions__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4728:1: ( rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1 )
            // InternalUseCase.g:4729:2: rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalUseCase.g:4736:1: rule__UsedExceptions__Group_0_0__0__Impl : ( 'used' ) ;
    public final void rule__UsedExceptions__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4740:1: ( ( 'used' ) )
            // InternalUseCase.g:4741:1: ( 'used' )
            {
            // InternalUseCase.g:4741:1: ( 'used' )
            // InternalUseCase.g:4742:2: 'used'
            {
             before(grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0_0_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalUseCase.g:4751:1: rule__UsedExceptions__Group_0_0__1 : rule__UsedExceptions__Group_0_0__1__Impl ;
    public final void rule__UsedExceptions__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4755:1: ( rule__UsedExceptions__Group_0_0__1__Impl )
            // InternalUseCase.g:4756:2: rule__UsedExceptions__Group_0_0__1__Impl
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
    // InternalUseCase.g:4762:1: rule__UsedExceptions__Group_0_0__1__Impl : ( 'errors:' ) ;
    public final void rule__UsedExceptions__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4766:1: ( ( 'errors:' ) )
            // InternalUseCase.g:4767:1: ( 'errors:' )
            {
            // InternalUseCase.g:4767:1: ( 'errors:' )
            // InternalUseCase.g:4768:2: 'errors:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_0_0_1()); 
            match(input,75,FOLLOW_2); 
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
    // InternalUseCase.g:4778:1: rule__UsedExceptions__Group_0_1__0 : rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1 ;
    public final void rule__UsedExceptions__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4782:1: ( rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1 )
            // InternalUseCase.g:4783:2: rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalUseCase.g:4790:1: rule__UsedExceptions__Group_0_1__0__Impl : ( 'Genutzte' ) ;
    public final void rule__UsedExceptions__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4794:1: ( ( 'Genutzte' ) )
            // InternalUseCase.g:4795:1: ( 'Genutzte' )
            {
            // InternalUseCase.g:4795:1: ( 'Genutzte' )
            // InternalUseCase.g:4796:2: 'Genutzte'
            {
             before(grammarAccess.getUsedExceptionsAccess().getGenutzteKeyword_0_1_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalUseCase.g:4805:1: rule__UsedExceptions__Group_0_1__1 : rule__UsedExceptions__Group_0_1__1__Impl ;
    public final void rule__UsedExceptions__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4809:1: ( rule__UsedExceptions__Group_0_1__1__Impl )
            // InternalUseCase.g:4810:2: rule__UsedExceptions__Group_0_1__1__Impl
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
    // InternalUseCase.g:4816:1: rule__UsedExceptions__Group_0_1__1__Impl : ( 'Fehler:' ) ;
    public final void rule__UsedExceptions__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4820:1: ( ( 'Fehler:' ) )
            // InternalUseCase.g:4821:1: ( 'Fehler:' )
            {
            // InternalUseCase.g:4821:1: ( 'Fehler:' )
            // InternalUseCase.g:4822:2: 'Fehler:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getFehlerKeyword_0_1_1()); 
            match(input,76,FOLLOW_2); 
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
    // InternalUseCase.g:4832:1: rule__ExceptionDecleration__Group__0 : rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 ;
    public final void rule__ExceptionDecleration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4836:1: ( rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 )
            // InternalUseCase.g:4837:2: rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1
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
    // InternalUseCase.g:4844:1: rule__ExceptionDecleration__Group__0__Impl : ( '-' ) ;
    public final void rule__ExceptionDecleration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4848:1: ( ( '-' ) )
            // InternalUseCase.g:4849:1: ( '-' )
            {
            // InternalUseCase.g:4849:1: ( '-' )
            // InternalUseCase.g:4850:2: '-'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUseCase.g:4859:1: rule__ExceptionDecleration__Group__1 : rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 ;
    public final void rule__ExceptionDecleration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4863:1: ( rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 )
            // InternalUseCase.g:4864:2: rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalUseCase.g:4871:1: rule__ExceptionDecleration__Group__1__Impl : ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) ;
    public final void rule__ExceptionDecleration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4875:1: ( ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) )
            // InternalUseCase.g:4876:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            {
            // InternalUseCase.g:4876:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            // InternalUseCase.g:4877:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getNameAssignment_1()); 
            // InternalUseCase.g:4878:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            // InternalUseCase.g:4878:3: rule__ExceptionDecleration__NameAssignment_1
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
    // InternalUseCase.g:4886:1: rule__ExceptionDecleration__Group__2 : rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 ;
    public final void rule__ExceptionDecleration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4890:1: ( rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 )
            // InternalUseCase.g:4891:2: rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCase.g:4898:1: rule__ExceptionDecleration__Group__2__Impl : ( '(' ) ;
    public final void rule__ExceptionDecleration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4902:1: ( ( '(' ) )
            // InternalUseCase.g:4903:1: ( '(' )
            {
            // InternalUseCase.g:4903:1: ( '(' )
            // InternalUseCase.g:4904:2: '('
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalUseCase.g:4913:1: rule__ExceptionDecleration__Group__3 : rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4 ;
    public final void rule__ExceptionDecleration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4917:1: ( rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4 )
            // InternalUseCase.g:4918:2: rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__ExceptionDecleration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group__4();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:4925:1: rule__ExceptionDecleration__Group__3__Impl : ( ( rule__ExceptionDecleration__MessageAssignment_3 ) ) ;
    public final void rule__ExceptionDecleration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4929:1: ( ( ( rule__ExceptionDecleration__MessageAssignment_3 ) ) )
            // InternalUseCase.g:4930:1: ( ( rule__ExceptionDecleration__MessageAssignment_3 ) )
            {
            // InternalUseCase.g:4930:1: ( ( rule__ExceptionDecleration__MessageAssignment_3 ) )
            // InternalUseCase.g:4931:2: ( rule__ExceptionDecleration__MessageAssignment_3 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getMessageAssignment_3()); 
            // InternalUseCase.g:4932:2: ( rule__ExceptionDecleration__MessageAssignment_3 )
            // InternalUseCase.g:4932:3: rule__ExceptionDecleration__MessageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__MessageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclerationAccess().getMessageAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExceptionDecleration__Group__4"
    // InternalUseCase.g:4940:1: rule__ExceptionDecleration__Group__4 : rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5 ;
    public final void rule__ExceptionDecleration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4944:1: ( rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5 )
            // InternalUseCase.g:4945:2: rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__ExceptionDecleration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__4"


    // $ANTLR start "rule__ExceptionDecleration__Group__4__Impl"
    // InternalUseCase.g:4952:1: rule__ExceptionDecleration__Group__4__Impl : ( ')' ) ;
    public final void rule__ExceptionDecleration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4956:1: ( ( ')' ) )
            // InternalUseCase.g:4957:1: ( ')' )
            {
            // InternalUseCase.g:4957:1: ( ')' )
            // InternalUseCase.g:4958:2: ')'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_4()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__4__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group__5"
    // InternalUseCase.g:4967:1: rule__ExceptionDecleration__Group__5 : rule__ExceptionDecleration__Group__5__Impl ;
    public final void rule__ExceptionDecleration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4971:1: ( rule__ExceptionDecleration__Group__5__Impl )
            // InternalUseCase.g:4972:2: rule__ExceptionDecleration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__5"


    // $ANTLR start "rule__ExceptionDecleration__Group__5__Impl"
    // InternalUseCase.g:4978:1: rule__ExceptionDecleration__Group__5__Impl : ( ( rule__ExceptionDecleration__Group_5__0 )? ) ;
    public final void rule__ExceptionDecleration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4982:1: ( ( ( rule__ExceptionDecleration__Group_5__0 )? ) )
            // InternalUseCase.g:4983:1: ( ( rule__ExceptionDecleration__Group_5__0 )? )
            {
            // InternalUseCase.g:4983:1: ( ( rule__ExceptionDecleration__Group_5__0 )? )
            // InternalUseCase.g:4984:2: ( rule__ExceptionDecleration__Group_5__0 )?
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup_5()); 
            // InternalUseCase.g:4985:2: ( rule__ExceptionDecleration__Group_5__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==73) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalUseCase.g:4985:3: rule__ExceptionDecleration__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExceptionDecleration__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExceptionDeclerationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group__5__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group_5__0"
    // InternalUseCase.g:4994:1: rule__ExceptionDecleration__Group_5__0 : rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1 ;
    public final void rule__ExceptionDecleration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4998:1: ( rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1 )
            // InternalUseCase.g:4999:2: rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__ExceptionDecleration__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_5__0"


    // $ANTLR start "rule__ExceptionDecleration__Group_5__0__Impl"
    // InternalUseCase.g:5006:1: rule__ExceptionDecleration__Group_5__0__Impl : ( '[' ) ;
    public final void rule__ExceptionDecleration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5010:1: ( ( '[' ) )
            // InternalUseCase.g:5011:1: ( '[' )
            {
            // InternalUseCase.g:5011:1: ( '[' )
            // InternalUseCase.g:5012:2: '['
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_5__0__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group_5__1"
    // InternalUseCase.g:5021:1: rule__ExceptionDecleration__Group_5__1 : rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2 ;
    public final void rule__ExceptionDecleration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5025:1: ( rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2 )
            // InternalUseCase.g:5026:2: rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2
            {
            pushFollow(FOLLOW_46);
            rule__ExceptionDecleration__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_5__1"


    // $ANTLR start "rule__ExceptionDecleration__Group_5__1__Impl"
    // InternalUseCase.g:5033:1: rule__ExceptionDecleration__Group_5__1__Impl : ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__ExceptionDecleration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5037:1: ( ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:5038:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:5038:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:5039:2: ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:5040:2: ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:5040:3: rule__ExceptionDecleration__ImportInfoAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__ImportInfoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclerationAccess().getImportInfoAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_5__1__Impl"


    // $ANTLR start "rule__ExceptionDecleration__Group_5__2"
    // InternalUseCase.g:5048:1: rule__ExceptionDecleration__Group_5__2 : rule__ExceptionDecleration__Group_5__2__Impl ;
    public final void rule__ExceptionDecleration__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5052:1: ( rule__ExceptionDecleration__Group_5__2__Impl )
            // InternalUseCase.g:5053:2: rule__ExceptionDecleration__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExceptionDecleration__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_5__2"


    // $ANTLR start "rule__ExceptionDecleration__Group_5__2__Impl"
    // InternalUseCase.g:5059:1: rule__ExceptionDecleration__Group_5__2__Impl : ( ']' ) ;
    public final void rule__ExceptionDecleration__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5063:1: ( ( ']' ) )
            // InternalUseCase.g:5064:1: ( ']' )
            {
            // InternalUseCase.g:5064:1: ( ']' )
            // InternalUseCase.g:5065:2: ']'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getRightSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__Group_5__2__Impl"


    // $ANTLR start "rule__Model__CompanyAssignment_1"
    // InternalUseCase.g:5075:1: rule__Model__CompanyAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__CompanyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5079:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:5080:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:5080:2: ( ruleQualifiedName )
            // InternalUseCase.g:5081:3: ruleQualifiedName
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
    // InternalUseCase.g:5090:1: rule__Model__PackageAssignment_2 : ( rulePackage ) ;
    public final void rule__Model__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5094:1: ( ( rulePackage ) )
            // InternalUseCase.g:5095:2: ( rulePackage )
            {
            // InternalUseCase.g:5095:2: ( rulePackage )
            // InternalUseCase.g:5096:3: rulePackage
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
    // InternalUseCase.g:5105:1: rule__Model__UseCasesAssignment_3 : ( ruleUseCase ) ;
    public final void rule__Model__UseCasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5109:1: ( ( ruleUseCase ) )
            // InternalUseCase.g:5110:2: ( ruleUseCase )
            {
            // InternalUseCase.g:5110:2: ( ruleUseCase )
            // InternalUseCase.g:5111:3: ruleUseCase
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
    // InternalUseCase.g:5120:1: rule__Model__TypesAssignment_4 : ( ruleUsedTypes ) ;
    public final void rule__Model__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5124:1: ( ( ruleUsedTypes ) )
            // InternalUseCase.g:5125:2: ( ruleUsedTypes )
            {
            // InternalUseCase.g:5125:2: ( ruleUsedTypes )
            // InternalUseCase.g:5126:3: ruleUsedTypes
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
    // InternalUseCase.g:5135:1: rule__Model__ExceptionsAssignment_5 : ( ruleUsedExceptions ) ;
    public final void rule__Model__ExceptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5139:1: ( ( ruleUsedExceptions ) )
            // InternalUseCase.g:5140:2: ( ruleUsedExceptions )
            {
            // InternalUseCase.g:5140:2: ( ruleUsedExceptions )
            // InternalUseCase.g:5141:3: ruleUsedExceptions
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
    // InternalUseCase.g:5150:1: rule__Package__PartsAssignment_1 : ( rulePackagePart ) ;
    public final void rule__Package__PartsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5154:1: ( ( rulePackagePart ) )
            // InternalUseCase.g:5155:2: ( rulePackagePart )
            {
            // InternalUseCase.g:5155:2: ( rulePackagePart )
            // InternalUseCase.g:5156:3: rulePackagePart
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
    // InternalUseCase.g:5165:1: rule__Package__PartsAssignment_2_1 : ( rulePackagePart ) ;
    public final void rule__Package__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5169:1: ( ( rulePackagePart ) )
            // InternalUseCase.g:5170:2: ( rulePackagePart )
            {
            // InternalUseCase.g:5170:2: ( rulePackagePart )
            // InternalUseCase.g:5171:3: rulePackagePart
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
    // InternalUseCase.g:5180:1: rule__PackagePart__NameAssignment : ( RULE_ID ) ;
    public final void rule__PackagePart__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5184:1: ( ( RULE_ID ) )
            // InternalUseCase.g:5185:2: ( RULE_ID )
            {
            // InternalUseCase.g:5185:2: ( RULE_ID )
            // InternalUseCase.g:5186:3: RULE_ID
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
    // InternalUseCase.g:5195:1: rule__UseCase__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5199:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5200:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5200:2: ( RULE_STRING )
            // InternalUseCase.g:5201:3: RULE_STRING
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
    // InternalUseCase.g:5210:1: rule__UseCase__DescriptionsAssignment_2 : ( ruleDescription ) ;
    public final void rule__UseCase__DescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5214:1: ( ( ruleDescription ) )
            // InternalUseCase.g:5215:2: ( ruleDescription )
            {
            // InternalUseCase.g:5215:2: ( ruleDescription )
            // InternalUseCase.g:5216:3: ruleDescription
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
    // InternalUseCase.g:5225:1: rule__UseCase__AllowedUserGroupsAssignment_3 : ( ruleAllowedUserGroups ) ;
    public final void rule__UseCase__AllowedUserGroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5229:1: ( ( ruleAllowedUserGroups ) )
            // InternalUseCase.g:5230:2: ( ruleAllowedUserGroups )
            {
            // InternalUseCase.g:5230:2: ( ruleAllowedUserGroups )
            // InternalUseCase.g:5231:3: ruleAllowedUserGroups
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
    // InternalUseCase.g:5240:1: rule__UseCase__InputsAssignment_4 : ( ruleInputs ) ;
    public final void rule__UseCase__InputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5244:1: ( ( ruleInputs ) )
            // InternalUseCase.g:5245:2: ( ruleInputs )
            {
            // InternalUseCase.g:5245:2: ( ruleInputs )
            // InternalUseCase.g:5246:3: ruleInputs
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


    // $ANTLR start "rule__UseCase__OutputsAssignment_5"
    // InternalUseCase.g:5255:1: rule__UseCase__OutputsAssignment_5 : ( ruleOutputs ) ;
    public final void rule__UseCase__OutputsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5259:1: ( ( ruleOutputs ) )
            // InternalUseCase.g:5260:2: ( ruleOutputs )
            {
            // InternalUseCase.g:5260:2: ( ruleOutputs )
            // InternalUseCase.g:5261:3: ruleOutputs
            {
             before(grammarAccess.getUseCaseAccess().getOutputsOutputsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputs();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getOutputsOutputsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__OutputsAssignment_5"


    // $ANTLR start "rule__UseCase__PreconditionsAssignment_6"
    // InternalUseCase.g:5270:1: rule__UseCase__PreconditionsAssignment_6 : ( rulePreConditions ) ;
    public final void rule__UseCase__PreconditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5274:1: ( ( rulePreConditions ) )
            // InternalUseCase.g:5275:2: ( rulePreConditions )
            {
            // InternalUseCase.g:5275:2: ( rulePreConditions )
            // InternalUseCase.g:5276:3: rulePreConditions
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsPreConditionsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePreConditions();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getPreconditionsPreConditionsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__PreconditionsAssignment_6"


    // $ANTLR start "rule__UseCase__StepsAssignment_7"
    // InternalUseCase.g:5285:1: rule__UseCase__StepsAssignment_7 : ( ruleSteps ) ;
    public final void rule__UseCase__StepsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5289:1: ( ( ruleSteps ) )
            // InternalUseCase.g:5290:2: ( ruleSteps )
            {
            // InternalUseCase.g:5290:2: ( ruleSteps )
            // InternalUseCase.g:5291:3: ruleSteps
            {
             before(grammarAccess.getUseCaseAccess().getStepsStepsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSteps();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getStepsStepsParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__StepsAssignment_7"


    // $ANTLR start "rule__UseCase__NotesAssignment_8"
    // InternalUseCase.g:5300:1: rule__UseCase__NotesAssignment_8 : ( ruleNotes ) ;
    public final void rule__UseCase__NotesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5304:1: ( ( ruleNotes ) )
            // InternalUseCase.g:5305:2: ( ruleNotes )
            {
            // InternalUseCase.g:5305:2: ( ruleNotes )
            // InternalUseCase.g:5306:3: ruleNotes
            {
             before(grammarAccess.getUseCaseAccess().getNotesNotesParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleNotes();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getNotesNotesParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__NotesAssignment_8"


    // $ANTLR start "rule__Description__NameAssignment_1"
    // InternalUseCase.g:5315:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5319:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5320:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5320:2: ( RULE_STRING )
            // InternalUseCase.g:5321:3: RULE_STRING
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
    // InternalUseCase.g:5330:1: rule__AllowedUserGroups__GroupsAssignment_1 : ( ruleAllowedUserGroup ) ;
    public final void rule__AllowedUserGroups__GroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5334:1: ( ( ruleAllowedUserGroup ) )
            // InternalUseCase.g:5335:2: ( ruleAllowedUserGroup )
            {
            // InternalUseCase.g:5335:2: ( ruleAllowedUserGroup )
            // InternalUseCase.g:5336:3: ruleAllowedUserGroup
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
    // InternalUseCase.g:5345:1: rule__AllowedUserGroup__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__AllowedUserGroup__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5349:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:5350:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:5350:2: ( ( 'many' ) )
            // InternalUseCase.g:5351:3: ( 'many' )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:5352:3: ( 'many' )
            // InternalUseCase.g:5353:4: 'many'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalUseCase.g:5364:1: rule__AllowedUserGroup__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllowedUserGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5368:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5369:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5369:2: ( RULE_STRING )
            // InternalUseCase.g:5370:3: RULE_STRING
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
    // InternalUseCase.g:5379:1: rule__AllowedUserGroup__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllowedUserGroup__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5383:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:5384:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:5384:2: ( ( RULE_ID ) )
            // InternalUseCase.g:5385:3: ( RULE_ID )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:5386:3: ( RULE_ID )
            // InternalUseCase.g:5387:4: RULE_ID
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
    // InternalUseCase.g:5398:1: rule__Inputs__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Inputs__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5402:1: ( ( ruleInput ) )
            // InternalUseCase.g:5403:2: ( ruleInput )
            {
            // InternalUseCase.g:5403:2: ( ruleInput )
            // InternalUseCase.g:5404:3: ruleInput
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


    // $ANTLR start "rule__Input__ManyAssignment_0"
    // InternalUseCase.g:5413:1: rule__Input__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Input__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5417:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:5418:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:5418:2: ( ( 'many' ) )
            // InternalUseCase.g:5419:3: ( 'many' )
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:5420:3: ( 'many' )
            // InternalUseCase.g:5421:4: 'many'
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalUseCase.g:5432:1: rule__Input__OptionalAssignment_2 : ( ruleOptional ) ;
    public final void rule__Input__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5436:1: ( ( ruleOptional ) )
            // InternalUseCase.g:5437:2: ( ruleOptional )
            {
            // InternalUseCase.g:5437:2: ( ruleOptional )
            // InternalUseCase.g:5438:3: ruleOptional
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
    // InternalUseCase.g:5447:1: rule__Input__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Input__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5451:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5452:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5452:2: ( RULE_STRING )
            // InternalUseCase.g:5453:3: RULE_STRING
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
    // InternalUseCase.g:5462:1: rule__Input__TypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Input__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5466:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:5467:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:5467:2: ( ( RULE_ID ) )
            // InternalUseCase.g:5468:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getTypeTypeCrossReference_4_1_0()); 
            // InternalUseCase.g:5469:3: ( RULE_ID )
            // InternalUseCase.g:5470:4: RULE_ID
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
    // InternalUseCase.g:5481:1: rule__Input__ExampleAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Input__ExampleAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5485:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5486:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5486:2: ( RULE_STRING )
            // InternalUseCase.g:5487:3: RULE_STRING
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
    // InternalUseCase.g:5496:1: rule__Outputs__OutputsAssignment_1 : ( ruleOutput ) ;
    public final void rule__Outputs__OutputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5500:1: ( ( ruleOutput ) )
            // InternalUseCase.g:5501:2: ( ruleOutput )
            {
            // InternalUseCase.g:5501:2: ( ruleOutput )
            // InternalUseCase.g:5502:3: ruleOutput
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
    // InternalUseCase.g:5511:1: rule__Output__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Output__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5515:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:5516:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:5516:2: ( ( 'many' ) )
            // InternalUseCase.g:5517:3: ( 'many' )
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:5518:3: ( 'many' )
            // InternalUseCase.g:5519:4: 'many'
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalUseCase.g:5530:1: rule__Output__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5534:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5535:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5535:2: ( RULE_STRING )
            // InternalUseCase.g:5536:3: RULE_STRING
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
    // InternalUseCase.g:5545:1: rule__Output__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Output__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5549:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:5550:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:5550:2: ( ( RULE_ID ) )
            // InternalUseCase.g:5551:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:5552:3: ( RULE_ID )
            // InternalUseCase.g:5553:4: RULE_ID
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
    // InternalUseCase.g:5564:1: rule__Output__ExampleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Output__ExampleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5568:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5569:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5569:2: ( RULE_STRING )
            // InternalUseCase.g:5570:3: RULE_STRING
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
    // InternalUseCase.g:5579:1: rule__PreConditions__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__PreConditions__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5583:1: ( ( ruleCondition ) )
            // InternalUseCase.g:5584:2: ( ruleCondition )
            {
            // InternalUseCase.g:5584:2: ( ruleCondition )
            // InternalUseCase.g:5585:3: ruleCondition
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
    // InternalUseCase.g:5594:1: rule__Condition__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Condition__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5598:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5599:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5599:2: ( RULE_STRING )
            // InternalUseCase.g:5600:3: RULE_STRING
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
    // InternalUseCase.g:5609:1: rule__Steps__StepsAssignment_1 : ( ruleStep ) ;
    public final void rule__Steps__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5613:1: ( ( ruleStep ) )
            // InternalUseCase.g:5614:2: ( ruleStep )
            {
            // InternalUseCase.g:5614:2: ( ruleStep )
            // InternalUseCase.g:5615:3: ruleStep
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
    // InternalUseCase.g:5624:1: rule__Step__NumberAssignment_0 : ( ruleQualifiedNumber ) ;
    public final void rule__Step__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5628:1: ( ( ruleQualifiedNumber ) )
            // InternalUseCase.g:5629:2: ( ruleQualifiedNumber )
            {
            // InternalUseCase.g:5629:2: ( ruleQualifiedNumber )
            // InternalUseCase.g:5630:3: ruleQualifiedNumber
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


    // $ANTLR start "rule__Step__ActionAssignment_1"
    // InternalUseCase.g:5639:1: rule__Step__ActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Step__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5643:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5644:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5644:2: ( RULE_STRING )
            // InternalUseCase.g:5645:3: RULE_STRING
            {
             before(grammarAccess.getStepAccess().getActionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getActionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__ActionAssignment_1"


    // $ANTLR start "rule__Step__ErrorAssignment_2"
    // InternalUseCase.g:5654:1: rule__Step__ErrorAssignment_2 : ( ruleRaiseError ) ;
    public final void rule__Step__ErrorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5658:1: ( ( ruleRaiseError ) )
            // InternalUseCase.g:5659:2: ( ruleRaiseError )
            {
            // InternalUseCase.g:5659:2: ( ruleRaiseError )
            // InternalUseCase.g:5660:3: ruleRaiseError
            {
             before(grammarAccess.getStepAccess().getErrorRaiseErrorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRaiseError();

            state._fsp--;

             after(grammarAccess.getStepAccess().getErrorRaiseErrorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__ErrorAssignment_2"


    // $ANTLR start "rule__RaiseError__ExceptionAssignment_2"
    // InternalUseCase.g:5669:1: rule__RaiseError__ExceptionAssignment_2 : ( ruleException ) ;
    public final void rule__RaiseError__ExceptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5673:1: ( ( ruleException ) )
            // InternalUseCase.g:5674:2: ( ruleException )
            {
            // InternalUseCase.g:5674:2: ( ruleException )
            // InternalUseCase.g:5675:3: ruleException
            {
             before(grammarAccess.getRaiseErrorAccess().getExceptionExceptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleException();

            state._fsp--;

             after(grammarAccess.getRaiseErrorAccess().getExceptionExceptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__ExceptionAssignment_2"


    // $ANTLR start "rule__Notes__ContentAssignment_1"
    // InternalUseCase.g:5684:1: rule__Notes__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notes__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5688:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5689:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5689:2: ( RULE_STRING )
            // InternalUseCase.g:5690:3: RULE_STRING
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
    // InternalUseCase.g:5699:1: rule__UsedTypes__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__UsedTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5703:1: ( ( ruleType ) )
            // InternalUseCase.g:5704:2: ( ruleType )
            {
            // InternalUseCase.g:5704:2: ( ruleType )
            // InternalUseCase.g:5705:3: ruleType
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
    // InternalUseCase.g:5714:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5718:1: ( ( RULE_ID ) )
            // InternalUseCase.g:5719:2: ( RULE_ID )
            {
            // InternalUseCase.g:5719:2: ( RULE_ID )
            // InternalUseCase.g:5720:3: RULE_ID
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


    // $ANTLR start "rule__Type__DescriptionAssignment_3"
    // InternalUseCase.g:5729:1: rule__Type__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Type__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5733:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5734:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5734:2: ( RULE_STRING )
            // InternalUseCase.g:5735:3: RULE_STRING
            {
             before(grammarAccess.getTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__DescriptionAssignment_3"


    // $ANTLR start "rule__Type__ImportInfoAssignment_5_1"
    // InternalUseCase.g:5744:1: rule__Type__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__Type__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5748:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:5749:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:5749:2: ( ruleQualifiedName )
            // InternalUseCase.g:5750:3: ruleQualifiedName
            {
             before(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ImportInfoAssignment_5_1"


    // $ANTLR start "rule__UsedExceptions__ExceptionsAssignment_1"
    // InternalUseCase.g:5759:1: rule__UsedExceptions__ExceptionsAssignment_1 : ( ruleExceptionDecleration ) ;
    public final void rule__UsedExceptions__ExceptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5763:1: ( ( ruleExceptionDecleration ) )
            // InternalUseCase.g:5764:2: ( ruleExceptionDecleration )
            {
            // InternalUseCase.g:5764:2: ( ruleExceptionDecleration )
            // InternalUseCase.g:5765:3: ruleExceptionDecleration
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
    // InternalUseCase.g:5774:1: rule__Exception__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Exception__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5778:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:5779:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:5779:2: ( ( RULE_ID ) )
            // InternalUseCase.g:5780:3: ( RULE_ID )
            {
             before(grammarAccess.getExceptionAccess().getTypeExceptionDeclerationCrossReference_0()); 
            // InternalUseCase.g:5781:3: ( RULE_ID )
            // InternalUseCase.g:5782:4: RULE_ID
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
    // InternalUseCase.g:5793:1: rule__ExceptionDecleration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExceptionDecleration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5797:1: ( ( RULE_ID ) )
            // InternalUseCase.g:5798:2: ( RULE_ID )
            {
            // InternalUseCase.g:5798:2: ( RULE_ID )
            // InternalUseCase.g:5799:3: RULE_ID
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


    // $ANTLR start "rule__ExceptionDecleration__MessageAssignment_3"
    // InternalUseCase.g:5808:1: rule__ExceptionDecleration__MessageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ExceptionDecleration__MessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5812:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5813:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5813:2: ( RULE_STRING )
            // InternalUseCase.g:5814:3: RULE_STRING
            {
             before(grammarAccess.getExceptionDeclerationAccess().getMessageSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExceptionDeclerationAccess().getMessageSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__MessageAssignment_3"


    // $ANTLR start "rule__ExceptionDecleration__ImportInfoAssignment_5_1"
    // InternalUseCase.g:5823:1: rule__ExceptionDecleration__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__ExceptionDecleration__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5827:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:5828:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:5828:2: ( ruleQualifiedName )
            // InternalUseCase.g:5829:3: ruleQualifiedName
            {
             before(grammarAccess.getExceptionDeclerationAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getExceptionDeclerationAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptionDecleration__ImportInfoAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x08892BCFF0FC0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0200000003000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xA000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});

}