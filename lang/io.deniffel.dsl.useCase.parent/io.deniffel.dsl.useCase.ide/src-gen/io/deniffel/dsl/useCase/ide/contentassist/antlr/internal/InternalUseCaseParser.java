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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'optional'", "'Firma'", "'Company'", "'Kathegorie'", "'package'", "'use-case'", "'Rezept'", "'description:'", "'Kurzbeschreibung:'", "'Beschreibung'", "'allowed-usergroups:'", "'requires:'", "'require:'", "'as'", "'als'", "'e.g'", "'z.B.'", "'Ergebnis:'", "'produces:'", "'produce:'", "'Vorbedingungen:'", "'pre-condition:'", "'pre-conditions:'", "'steps:'", "'Schritte:'", "'.'", "':'", "'If'", "'Falls'", "'Solange'", "'While'", "'notes:'", "'note:'", "'Anmerkungen:'", "'Anmerkung:'", "'>'", "'end'", "'of'", "'Ende'", "'des'", "'Rezpets'", "'Erlaubt'", "'f\\u00FCr:'", "'-'", "'requires'", "'the'", "'following'", "'input'", "'Ben\\u00F6tigte'", "'Zutaten'", "'('", "')'", "'produces'", "'output'", "'On'", "'error'", "'raise'", "'Bei'", "'Fehler'", "'melde'", "'Raise'", "'Melde'", "'used'", "'types:'", "'Genutzte'", "'Typen:'", "'['", "']'", "'errors:'", "'Fehler:'", "'many'"
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


    // $ANTLR start "entryRuleRaiseErrorConditional"
    // InternalUseCase.g:503:1: entryRuleRaiseErrorConditional : ruleRaiseErrorConditional EOF ;
    public final void entryRuleRaiseErrorConditional() throws RecognitionException {
        try {
            // InternalUseCase.g:504:1: ( ruleRaiseErrorConditional EOF )
            // InternalUseCase.g:505:1: ruleRaiseErrorConditional EOF
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
    // InternalUseCase.g:512:1: ruleRaiseErrorConditional : ( ( rule__RaiseErrorConditional__Group__0 ) ) ;
    public final void ruleRaiseErrorConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:516:2: ( ( ( rule__RaiseErrorConditional__Group__0 ) ) )
            // InternalUseCase.g:517:2: ( ( rule__RaiseErrorConditional__Group__0 ) )
            {
            // InternalUseCase.g:517:2: ( ( rule__RaiseErrorConditional__Group__0 ) )
            // InternalUseCase.g:518:3: ( rule__RaiseErrorConditional__Group__0 )
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getGroup()); 
            // InternalUseCase.g:519:3: ( rule__RaiseErrorConditional__Group__0 )
            // InternalUseCase.g:519:4: rule__RaiseErrorConditional__Group__0
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
    // InternalUseCase.g:528:1: entryRuleRaiseErrorNow : ruleRaiseErrorNow EOF ;
    public final void entryRuleRaiseErrorNow() throws RecognitionException {
        try {
            // InternalUseCase.g:529:1: ( ruleRaiseErrorNow EOF )
            // InternalUseCase.g:530:1: ruleRaiseErrorNow EOF
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
    // InternalUseCase.g:537:1: ruleRaiseErrorNow : ( ( rule__RaiseErrorNow__Group__0 ) ) ;
    public final void ruleRaiseErrorNow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:541:2: ( ( ( rule__RaiseErrorNow__Group__0 ) ) )
            // InternalUseCase.g:542:2: ( ( rule__RaiseErrorNow__Group__0 ) )
            {
            // InternalUseCase.g:542:2: ( ( rule__RaiseErrorNow__Group__0 ) )
            // InternalUseCase.g:543:3: ( rule__RaiseErrorNow__Group__0 )
            {
             before(grammarAccess.getRaiseErrorNowAccess().getGroup()); 
            // InternalUseCase.g:544:3: ( rule__RaiseErrorNow__Group__0 )
            // InternalUseCase.g:544:4: rule__RaiseErrorNow__Group__0
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
    // InternalUseCase.g:553:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalUseCase.g:554:1: ( ruleIfStatement EOF )
            // InternalUseCase.g:555:1: ruleIfStatement EOF
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
    // InternalUseCase.g:562:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:566:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalUseCase.g:567:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalUseCase.g:567:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalUseCase.g:568:3: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalUseCase.g:569:3: ( rule__IfStatement__Group__0 )
            // InternalUseCase.g:569:4: rule__IfStatement__Group__0
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
    // InternalUseCase.g:578:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalUseCase.g:579:1: ( ruleLoop EOF )
            // InternalUseCase.g:580:1: ruleLoop EOF
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
    // InternalUseCase.g:587:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:591:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalUseCase.g:592:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalUseCase.g:592:2: ( ( rule__Loop__Group__0 ) )
            // InternalUseCase.g:593:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalUseCase.g:594:3: ( rule__Loop__Group__0 )
            // InternalUseCase.g:594:4: rule__Loop__Group__0
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
    // InternalUseCase.g:603:1: entryRuleBooleanCondition : ruleBooleanCondition EOF ;
    public final void entryRuleBooleanCondition() throws RecognitionException {
        try {
            // InternalUseCase.g:604:1: ( ruleBooleanCondition EOF )
            // InternalUseCase.g:605:1: ruleBooleanCondition EOF
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
    // InternalUseCase.g:612:1: ruleBooleanCondition : ( ( rule__BooleanCondition__NameAssignment ) ) ;
    public final void ruleBooleanCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:616:2: ( ( ( rule__BooleanCondition__NameAssignment ) ) )
            // InternalUseCase.g:617:2: ( ( rule__BooleanCondition__NameAssignment ) )
            {
            // InternalUseCase.g:617:2: ( ( rule__BooleanCondition__NameAssignment ) )
            // InternalUseCase.g:618:3: ( rule__BooleanCondition__NameAssignment )
            {
             before(grammarAccess.getBooleanConditionAccess().getNameAssignment()); 
            // InternalUseCase.g:619:3: ( rule__BooleanCondition__NameAssignment )
            // InternalUseCase.g:619:4: rule__BooleanCondition__NameAssignment
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
    // InternalUseCase.g:628:1: entryRuleNotes : ruleNotes EOF ;
    public final void entryRuleNotes() throws RecognitionException {
        try {
            // InternalUseCase.g:629:1: ( ruleNotes EOF )
            // InternalUseCase.g:630:1: ruleNotes EOF
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
    // InternalUseCase.g:637:1: ruleNotes : ( ( rule__Notes__Group__0 ) ) ;
    public final void ruleNotes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:641:2: ( ( ( rule__Notes__Group__0 ) ) )
            // InternalUseCase.g:642:2: ( ( rule__Notes__Group__0 ) )
            {
            // InternalUseCase.g:642:2: ( ( rule__Notes__Group__0 ) )
            // InternalUseCase.g:643:3: ( rule__Notes__Group__0 )
            {
             before(grammarAccess.getNotesAccess().getGroup()); 
            // InternalUseCase.g:644:3: ( rule__Notes__Group__0 )
            // InternalUseCase.g:644:4: rule__Notes__Group__0
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
    // InternalUseCase.g:653:1: entryRuleUsedTypes : ruleUsedTypes EOF ;
    public final void entryRuleUsedTypes() throws RecognitionException {
        try {
            // InternalUseCase.g:654:1: ( ruleUsedTypes EOF )
            // InternalUseCase.g:655:1: ruleUsedTypes EOF
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
    // InternalUseCase.g:662:1: ruleUsedTypes : ( ( rule__UsedTypes__Group__0 ) ) ;
    public final void ruleUsedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:666:2: ( ( ( rule__UsedTypes__Group__0 ) ) )
            // InternalUseCase.g:667:2: ( ( rule__UsedTypes__Group__0 ) )
            {
            // InternalUseCase.g:667:2: ( ( rule__UsedTypes__Group__0 ) )
            // InternalUseCase.g:668:3: ( rule__UsedTypes__Group__0 )
            {
             before(grammarAccess.getUsedTypesAccess().getGroup()); 
            // InternalUseCase.g:669:3: ( rule__UsedTypes__Group__0 )
            // InternalUseCase.g:669:4: rule__UsedTypes__Group__0
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
    // InternalUseCase.g:678:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUseCase.g:679:1: ( ruleType EOF )
            // InternalUseCase.g:680:1: ruleType EOF
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
    // InternalUseCase.g:687:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:691:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalUseCase.g:692:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalUseCase.g:692:2: ( ( rule__Type__Group__0 ) )
            // InternalUseCase.g:693:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalUseCase.g:694:3: ( rule__Type__Group__0 )
            // InternalUseCase.g:694:4: rule__Type__Group__0
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
    // InternalUseCase.g:703:1: entryRuleUsedExceptions : ruleUsedExceptions EOF ;
    public final void entryRuleUsedExceptions() throws RecognitionException {
        try {
            // InternalUseCase.g:704:1: ( ruleUsedExceptions EOF )
            // InternalUseCase.g:705:1: ruleUsedExceptions EOF
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
    // InternalUseCase.g:712:1: ruleUsedExceptions : ( ( rule__UsedExceptions__Group__0 ) ) ;
    public final void ruleUsedExceptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:716:2: ( ( ( rule__UsedExceptions__Group__0 ) ) )
            // InternalUseCase.g:717:2: ( ( rule__UsedExceptions__Group__0 ) )
            {
            // InternalUseCase.g:717:2: ( ( rule__UsedExceptions__Group__0 ) )
            // InternalUseCase.g:718:3: ( rule__UsedExceptions__Group__0 )
            {
             before(grammarAccess.getUsedExceptionsAccess().getGroup()); 
            // InternalUseCase.g:719:3: ( rule__UsedExceptions__Group__0 )
            // InternalUseCase.g:719:4: rule__UsedExceptions__Group__0
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
    // InternalUseCase.g:728:1: entryRuleException : ruleException EOF ;
    public final void entryRuleException() throws RecognitionException {
        try {
            // InternalUseCase.g:729:1: ( ruleException EOF )
            // InternalUseCase.g:730:1: ruleException EOF
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
    // InternalUseCase.g:737:1: ruleException : ( ( rule__Exception__TypeAssignment ) ) ;
    public final void ruleException() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:741:2: ( ( ( rule__Exception__TypeAssignment ) ) )
            // InternalUseCase.g:742:2: ( ( rule__Exception__TypeAssignment ) )
            {
            // InternalUseCase.g:742:2: ( ( rule__Exception__TypeAssignment ) )
            // InternalUseCase.g:743:3: ( rule__Exception__TypeAssignment )
            {
             before(grammarAccess.getExceptionAccess().getTypeAssignment()); 
            // InternalUseCase.g:744:3: ( rule__Exception__TypeAssignment )
            // InternalUseCase.g:744:4: rule__Exception__TypeAssignment
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
    // InternalUseCase.g:753:1: entryRuleExceptionDecleration : ruleExceptionDecleration EOF ;
    public final void entryRuleExceptionDecleration() throws RecognitionException {
        try {
            // InternalUseCase.g:754:1: ( ruleExceptionDecleration EOF )
            // InternalUseCase.g:755:1: ruleExceptionDecleration EOF
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
    // InternalUseCase.g:762:1: ruleExceptionDecleration : ( ( rule__ExceptionDecleration__Group__0 ) ) ;
    public final void ruleExceptionDecleration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:766:2: ( ( ( rule__ExceptionDecleration__Group__0 ) ) )
            // InternalUseCase.g:767:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            {
            // InternalUseCase.g:767:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            // InternalUseCase.g:768:3: ( rule__ExceptionDecleration__Group__0 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup()); 
            // InternalUseCase.g:769:3: ( rule__ExceptionDecleration__Group__0 )
            // InternalUseCase.g:769:4: rule__ExceptionDecleration__Group__0
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
    // InternalUseCase.g:777:1: rule__Model__Alternatives_0 : ( ( 'Firma' ) | ( 'Company' ) );
    public final void rule__Model__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:781:1: ( ( 'Firma' ) | ( 'Company' ) )
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
                    // InternalUseCase.g:782:2: ( 'Firma' )
                    {
                    // InternalUseCase.g:782:2: ( 'Firma' )
                    // InternalUseCase.g:783:3: 'Firma'
                    {
                     before(grammarAccess.getModelAccess().getFirmaKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getFirmaKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:788:2: ( 'Company' )
                    {
                    // InternalUseCase.g:788:2: ( 'Company' )
                    // InternalUseCase.g:789:3: 'Company'
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
    // InternalUseCase.g:798:1: rule__Package__Alternatives_0 : ( ( 'Kathegorie' ) | ( 'package' ) );
    public final void rule__Package__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:802:1: ( ( 'Kathegorie' ) | ( 'package' ) )
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
                    // InternalUseCase.g:803:2: ( 'Kathegorie' )
                    {
                    // InternalUseCase.g:803:2: ( 'Kathegorie' )
                    // InternalUseCase.g:804:3: 'Kathegorie'
                    {
                     before(grammarAccess.getPackageAccess().getKathegorieKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getKathegorieKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:809:2: ( 'package' )
                    {
                    // InternalUseCase.g:809:2: ( 'package' )
                    // InternalUseCase.g:810:3: 'package'
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
    // InternalUseCase.g:819:1: rule__UseCase__Alternatives_0 : ( ( 'use-case' ) | ( 'Rezept' ) );
    public final void rule__UseCase__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:823:1: ( ( 'use-case' ) | ( 'Rezept' ) )
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
                    // InternalUseCase.g:824:2: ( 'use-case' )
                    {
                    // InternalUseCase.g:824:2: ( 'use-case' )
                    // InternalUseCase.g:825:3: 'use-case'
                    {
                     before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:830:2: ( 'Rezept' )
                    {
                    // InternalUseCase.g:830:2: ( 'Rezept' )
                    // InternalUseCase.g:831:3: 'Rezept'
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
    // InternalUseCase.g:840:1: rule__UseCase__Alternatives_9 : ( ( ( rule__UseCase__Group_9_0__0 ) ) | ( ( rule__UseCase__Group_9_1__0 ) ) );
    public final void rule__UseCase__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:844:1: ( ( ( rule__UseCase__Group_9_0__0 ) ) | ( ( rule__UseCase__Group_9_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            else if ( (LA4_0==49) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:845:2: ( ( rule__UseCase__Group_9_0__0 ) )
                    {
                    // InternalUseCase.g:845:2: ( ( rule__UseCase__Group_9_0__0 ) )
                    // InternalUseCase.g:846:3: ( rule__UseCase__Group_9_0__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_9_0()); 
                    // InternalUseCase.g:847:3: ( rule__UseCase__Group_9_0__0 )
                    // InternalUseCase.g:847:4: rule__UseCase__Group_9_0__0
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
                    // InternalUseCase.g:851:2: ( ( rule__UseCase__Group_9_1__0 ) )
                    {
                    // InternalUseCase.g:851:2: ( ( rule__UseCase__Group_9_1__0 ) )
                    // InternalUseCase.g:852:3: ( rule__UseCase__Group_9_1__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_9_1()); 
                    // InternalUseCase.g:853:3: ( rule__UseCase__Group_9_1__0 )
                    // InternalUseCase.g:853:4: rule__UseCase__Group_9_1__0
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
    // InternalUseCase.g:861:1: rule__Description__Alternatives_0 : ( ( 'description:' ) | ( 'Kurzbeschreibung:' ) | ( 'Beschreibung' ) );
    public final void rule__Description__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:865:1: ( ( 'description:' ) | ( 'Kurzbeschreibung:' ) | ( 'Beschreibung' ) )
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
                    // InternalUseCase.g:866:2: ( 'description:' )
                    {
                    // InternalUseCase.g:866:2: ( 'description:' )
                    // InternalUseCase.g:867:3: 'description:'
                    {
                     before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:872:2: ( 'Kurzbeschreibung:' )
                    {
                    // InternalUseCase.g:872:2: ( 'Kurzbeschreibung:' )
                    // InternalUseCase.g:873:3: 'Kurzbeschreibung:'
                    {
                     before(grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:878:2: ( 'Beschreibung' )
                    {
                    // InternalUseCase.g:878:2: ( 'Beschreibung' )
                    // InternalUseCase.g:879:3: 'Beschreibung'
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
    // InternalUseCase.g:888:1: rule__AllowedUserGroups__Alternatives_0 : ( ( 'allowed-usergroups:' ) | ( ( rule__AllowedUserGroups__Group_0_1__0 ) ) );
    public final void rule__AllowedUserGroups__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:892:1: ( ( 'allowed-usergroups:' ) | ( ( rule__AllowedUserGroups__Group_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==52) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:893:2: ( 'allowed-usergroups:' )
                    {
                    // InternalUseCase.g:893:2: ( 'allowed-usergroups:' )
                    // InternalUseCase.g:894:3: 'allowed-usergroups:'
                    {
                     before(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:899:2: ( ( rule__AllowedUserGroups__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:899:2: ( ( rule__AllowedUserGroups__Group_0_1__0 ) )
                    // InternalUseCase.g:900:3: ( rule__AllowedUserGroups__Group_0_1__0 )
                    {
                     before(grammarAccess.getAllowedUserGroupsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:901:3: ( rule__AllowedUserGroups__Group_0_1__0 )
                    // InternalUseCase.g:901:4: rule__AllowedUserGroups__Group_0_1__0
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
    // InternalUseCase.g:909:1: rule__Inputs__Alternatives_0 : ( ( ( rule__Inputs__Alternatives_0_0 ) ) | ( ( rule__Inputs__Group_0_1__0 ) ) );
    public final void rule__Inputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:913:1: ( ( ( rule__Inputs__Alternatives_0_0 ) ) | ( ( rule__Inputs__Group_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=22 && LA7_0<=23)||LA7_0==55) ) {
                alt7=1;
            }
            else if ( (LA7_0==59) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:914:2: ( ( rule__Inputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:914:2: ( ( rule__Inputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:915:3: ( rule__Inputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getInputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:916:3: ( rule__Inputs__Alternatives_0_0 )
                    // InternalUseCase.g:916:4: rule__Inputs__Alternatives_0_0
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
                    // InternalUseCase.g:920:2: ( ( rule__Inputs__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:920:2: ( ( rule__Inputs__Group_0_1__0 ) )
                    // InternalUseCase.g:921:3: ( rule__Inputs__Group_0_1__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:922:3: ( rule__Inputs__Group_0_1__0 )
                    // InternalUseCase.g:922:4: rule__Inputs__Group_0_1__0
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
    // InternalUseCase.g:930:1: rule__Inputs__Alternatives_0_0 : ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_0_2__0 ) ) );
    public final void rule__Inputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:934:1: ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_0_2__0 ) ) )
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
            case 55:
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
                    // InternalUseCase.g:935:2: ( 'requires:' )
                    {
                    // InternalUseCase.g:935:2: ( 'requires:' )
                    // InternalUseCase.g:936:3: 'requires:'
                    {
                     before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:941:2: ( 'require:' )
                    {
                    // InternalUseCase.g:941:2: ( 'require:' )
                    // InternalUseCase.g:942:3: 'require:'
                    {
                     before(grammarAccess.getInputsAccess().getRequireKeyword_0_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequireKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:947:2: ( ( rule__Inputs__Group_0_0_2__0 ) )
                    {
                    // InternalUseCase.g:947:2: ( ( rule__Inputs__Group_0_0_2__0 ) )
                    // InternalUseCase.g:948:3: ( rule__Inputs__Group_0_0_2__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_0_2()); 
                    // InternalUseCase.g:949:3: ( rule__Inputs__Group_0_0_2__0 )
                    // InternalUseCase.g:949:4: rule__Inputs__Group_0_0_2__0
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
    // InternalUseCase.g:957:1: rule__Input__Alternatives_4_0 : ( ( 'as' ) | ( 'als' ) );
    public final void rule__Input__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:961:1: ( ( 'as' ) | ( 'als' ) )
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
                    // InternalUseCase.g:962:2: ( 'as' )
                    {
                    // InternalUseCase.g:962:2: ( 'as' )
                    // InternalUseCase.g:963:3: 'as'
                    {
                     before(grammarAccess.getInputAccess().getAsKeyword_4_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getAsKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:968:2: ( 'als' )
                    {
                    // InternalUseCase.g:968:2: ( 'als' )
                    // InternalUseCase.g:969:3: 'als'
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
    // InternalUseCase.g:978:1: rule__Input__Alternatives_5_1 : ( ( 'e.g' ) | ( 'z.B.' ) );
    public final void rule__Input__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:982:1: ( ( 'e.g' ) | ( 'z.B.' ) )
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
                    // InternalUseCase.g:983:2: ( 'e.g' )
                    {
                    // InternalUseCase.g:983:2: ( 'e.g' )
                    // InternalUseCase.g:984:3: 'e.g'
                    {
                     before(grammarAccess.getInputAccess().getEGKeyword_5_1_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getEGKeyword_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:989:2: ( 'z.B.' )
                    {
                    // InternalUseCase.g:989:2: ( 'z.B.' )
                    // InternalUseCase.g:990:3: 'z.B.'
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
    // InternalUseCase.g:999:1: rule__Outputs__Alternatives_0 : ( ( ( rule__Outputs__Alternatives_0_0 ) ) | ( 'Ergebnis:' ) );
    public final void rule__Outputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1003:1: ( ( ( rule__Outputs__Alternatives_0_0 ) ) | ( 'Ergebnis:' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=29 && LA11_0<=30)||LA11_0==63) ) {
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
                    // InternalUseCase.g:1004:2: ( ( rule__Outputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1004:2: ( ( rule__Outputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:1005:3: ( rule__Outputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getOutputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1006:3: ( rule__Outputs__Alternatives_0_0 )
                    // InternalUseCase.g:1006:4: rule__Outputs__Alternatives_0_0
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
                    // InternalUseCase.g:1010:2: ( 'Ergebnis:' )
                    {
                    // InternalUseCase.g:1010:2: ( 'Ergebnis:' )
                    // InternalUseCase.g:1011:3: 'Ergebnis:'
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
    // InternalUseCase.g:1020:1: rule__Outputs__Alternatives_0_0 : ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_0_2__0 ) ) );
    public final void rule__Outputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1024:1: ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_0_2__0 ) ) )
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
            case 63:
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
                    // InternalUseCase.g:1025:2: ( 'produces:' )
                    {
                    // InternalUseCase.g:1025:2: ( 'produces:' )
                    // InternalUseCase.g:1026:3: 'produces:'
                    {
                     before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1031:2: ( 'produce:' )
                    {
                    // InternalUseCase.g:1031:2: ( 'produce:' )
                    // InternalUseCase.g:1032:3: 'produce:'
                    {
                     before(grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:1037:2: ( ( rule__Outputs__Group_0_0_2__0 ) )
                    {
                    // InternalUseCase.g:1037:2: ( ( rule__Outputs__Group_0_0_2__0 ) )
                    // InternalUseCase.g:1038:3: ( rule__Outputs__Group_0_0_2__0 )
                    {
                     before(grammarAccess.getOutputsAccess().getGroup_0_0_2()); 
                    // InternalUseCase.g:1039:3: ( rule__Outputs__Group_0_0_2__0 )
                    // InternalUseCase.g:1039:4: rule__Outputs__Group_0_0_2__0
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
    // InternalUseCase.g:1047:1: rule__Output__Alternatives_3_0 : ( ( 'as' ) | ( 'als' ) );
    public final void rule__Output__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1051:1: ( ( 'as' ) | ( 'als' ) )
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
                    // InternalUseCase.g:1052:2: ( 'as' )
                    {
                    // InternalUseCase.g:1052:2: ( 'as' )
                    // InternalUseCase.g:1053:3: 'as'
                    {
                     before(grammarAccess.getOutputAccess().getAsKeyword_3_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getAsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1058:2: ( 'als' )
                    {
                    // InternalUseCase.g:1058:2: ( 'als' )
                    // InternalUseCase.g:1059:3: 'als'
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
    // InternalUseCase.g:1068:1: rule__Output__Alternatives_4_1 : ( ( 'e.g' ) | ( 'z.B.' ) );
    public final void rule__Output__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1072:1: ( ( 'e.g' ) | ( 'z.B.' ) )
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
                    // InternalUseCase.g:1073:2: ( 'e.g' )
                    {
                    // InternalUseCase.g:1073:2: ( 'e.g' )
                    // InternalUseCase.g:1074:3: 'e.g'
                    {
                     before(grammarAccess.getOutputAccess().getEGKeyword_4_1_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getEGKeyword_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1079:2: ( 'z.B.' )
                    {
                    // InternalUseCase.g:1079:2: ( 'z.B.' )
                    // InternalUseCase.g:1080:3: 'z.B.'
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
    // InternalUseCase.g:1089:1: rule__PreConditions__Alternatives_0 : ( ( ( rule__PreConditions__Alternatives_0_0 ) ) | ( 'Vorbedingungen:' ) );
    public final void rule__PreConditions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1093:1: ( ( ( rule__PreConditions__Alternatives_0_0 ) ) | ( 'Vorbedingungen:' ) )
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
                    // InternalUseCase.g:1094:2: ( ( rule__PreConditions__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1094:2: ( ( rule__PreConditions__Alternatives_0_0 ) )
                    // InternalUseCase.g:1095:3: ( rule__PreConditions__Alternatives_0_0 )
                    {
                     before(grammarAccess.getPreConditionsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1096:3: ( rule__PreConditions__Alternatives_0_0 )
                    // InternalUseCase.g:1096:4: rule__PreConditions__Alternatives_0_0
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
                    // InternalUseCase.g:1100:2: ( 'Vorbedingungen:' )
                    {
                    // InternalUseCase.g:1100:2: ( 'Vorbedingungen:' )
                    // InternalUseCase.g:1101:3: 'Vorbedingungen:'
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
    // InternalUseCase.g:1110:1: rule__PreConditions__Alternatives_0_0 : ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) );
    public final void rule__PreConditions__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1114:1: ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) )
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
                    // InternalUseCase.g:1115:2: ( 'pre-condition:' )
                    {
                    // InternalUseCase.g:1115:2: ( 'pre-condition:' )
                    // InternalUseCase.g:1116:3: 'pre-condition:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1121:2: ( 'pre-conditions:' )
                    {
                    // InternalUseCase.g:1121:2: ( 'pre-conditions:' )
                    // InternalUseCase.g:1122:3: 'pre-conditions:'
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
    // InternalUseCase.g:1131:1: rule__Steps__Alternatives_0 : ( ( 'steps:' ) | ( 'Schritte:' ) );
    public final void rule__Steps__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1135:1: ( ( 'steps:' ) | ( 'Schritte:' ) )
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
                    // InternalUseCase.g:1136:2: ( 'steps:' )
                    {
                    // InternalUseCase.g:1136:2: ( 'steps:' )
                    // InternalUseCase.g:1137:3: 'steps:'
                    {
                     before(grammarAccess.getStepsAccess().getStepsKeyword_0_0()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getStepsAccess().getStepsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1142:2: ( 'Schritte:' )
                    {
                    // InternalUseCase.g:1142:2: ( 'Schritte:' )
                    // InternalUseCase.g:1143:3: 'Schritte:'
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


    // $ANTLR start "rule__Step__Alternatives_1"
    // InternalUseCase.g:1152:1: rule__Step__Alternatives_1 : ( ( ( rule__Step__Group_1_0__0 ) ) | ( ( rule__Step__ErrorAssignment_1_1 ) ) | ( ( rule__Step__ConditionAssignment_1_2 ) ) | ( ( rule__Step__LoopAssignment_1_3 ) ) | ( ( rule__Step__ExceptionAssignment_1_4 ) ) );
    public final void rule__Step__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1156:1: ( ( ( rule__Step__Group_1_0__0 ) ) | ( ( rule__Step__ErrorAssignment_1_1 ) ) | ( ( rule__Step__ConditionAssignment_1_2 ) ) | ( ( rule__Step__LoopAssignment_1_3 ) ) | ( ( rule__Step__ExceptionAssignment_1_4 ) ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt18=1;
                }
                break;
            case 36:
            case 37:
                {
                alt18=2;
                }
                break;
            case 38:
            case 39:
                {
                alt18=3;
                }
                break;
            case 40:
            case 41:
                {
                alt18=4;
                }
                break;
            case 71:
            case 72:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalUseCase.g:1157:2: ( ( rule__Step__Group_1_0__0 ) )
                    {
                    // InternalUseCase.g:1157:2: ( ( rule__Step__Group_1_0__0 ) )
                    // InternalUseCase.g:1158:3: ( rule__Step__Group_1_0__0 )
                    {
                     before(grammarAccess.getStepAccess().getGroup_1_0()); 
                    // InternalUseCase.g:1159:3: ( rule__Step__Group_1_0__0 )
                    // InternalUseCase.g:1159:4: rule__Step__Group_1_0__0
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
                    // InternalUseCase.g:1163:2: ( ( rule__Step__ErrorAssignment_1_1 ) )
                    {
                    // InternalUseCase.g:1163:2: ( ( rule__Step__ErrorAssignment_1_1 ) )
                    // InternalUseCase.g:1164:3: ( rule__Step__ErrorAssignment_1_1 )
                    {
                     before(grammarAccess.getStepAccess().getErrorAssignment_1_1()); 
                    // InternalUseCase.g:1165:3: ( rule__Step__ErrorAssignment_1_1 )
                    // InternalUseCase.g:1165:4: rule__Step__ErrorAssignment_1_1
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
                    // InternalUseCase.g:1169:2: ( ( rule__Step__ConditionAssignment_1_2 ) )
                    {
                    // InternalUseCase.g:1169:2: ( ( rule__Step__ConditionAssignment_1_2 ) )
                    // InternalUseCase.g:1170:3: ( rule__Step__ConditionAssignment_1_2 )
                    {
                     before(grammarAccess.getStepAccess().getConditionAssignment_1_2()); 
                    // InternalUseCase.g:1171:3: ( rule__Step__ConditionAssignment_1_2 )
                    // InternalUseCase.g:1171:4: rule__Step__ConditionAssignment_1_2
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
                    // InternalUseCase.g:1175:2: ( ( rule__Step__LoopAssignment_1_3 ) )
                    {
                    // InternalUseCase.g:1175:2: ( ( rule__Step__LoopAssignment_1_3 ) )
                    // InternalUseCase.g:1176:3: ( rule__Step__LoopAssignment_1_3 )
                    {
                     before(grammarAccess.getStepAccess().getLoopAssignment_1_3()); 
                    // InternalUseCase.g:1177:3: ( rule__Step__LoopAssignment_1_3 )
                    // InternalUseCase.g:1177:4: rule__Step__LoopAssignment_1_3
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
                    // InternalUseCase.g:1181:2: ( ( rule__Step__ExceptionAssignment_1_4 ) )
                    {
                    // InternalUseCase.g:1181:2: ( ( rule__Step__ExceptionAssignment_1_4 ) )
                    // InternalUseCase.g:1182:3: ( rule__Step__ExceptionAssignment_1_4 )
                    {
                     before(grammarAccess.getStepAccess().getExceptionAssignment_1_4()); 
                    // InternalUseCase.g:1183:3: ( rule__Step__ExceptionAssignment_1_4 )
                    // InternalUseCase.g:1183:4: rule__Step__ExceptionAssignment_1_4
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
    // InternalUseCase.g:1191:1: rule__RaiseErrorConditional__Alternatives_0 : ( ( '.' ) | ( ':' ) );
    public final void rule__RaiseErrorConditional__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1195:1: ( ( '.' ) | ( ':' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            else if ( (LA19_0==37) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCase.g:1196:2: ( '.' )
                    {
                    // InternalUseCase.g:1196:2: ( '.' )
                    // InternalUseCase.g:1197:3: '.'
                    {
                     before(grammarAccess.getRaiseErrorConditionalAccess().getFullStopKeyword_0_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getRaiseErrorConditionalAccess().getFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1202:2: ( ':' )
                    {
                    // InternalUseCase.g:1202:2: ( ':' )
                    // InternalUseCase.g:1203:3: ':'
                    {
                     before(grammarAccess.getRaiseErrorConditionalAccess().getColonKeyword_0_1()); 
                    match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:1212:1: rule__RaiseErrorConditional__Alternatives_1 : ( ( ( rule__RaiseErrorConditional__Group_1_0__0 ) ) | ( ( rule__RaiseErrorConditional__Group_1_1__0 ) ) );
    public final void rule__RaiseErrorConditional__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1216:1: ( ( ( rule__RaiseErrorConditional__Group_1_0__0 ) ) | ( ( rule__RaiseErrorConditional__Group_1_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==65) ) {
                alt20=1;
            }
            else if ( (LA20_0==68) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCase.g:1217:2: ( ( rule__RaiseErrorConditional__Group_1_0__0 ) )
                    {
                    // InternalUseCase.g:1217:2: ( ( rule__RaiseErrorConditional__Group_1_0__0 ) )
                    // InternalUseCase.g:1218:3: ( rule__RaiseErrorConditional__Group_1_0__0 )
                    {
                     before(grammarAccess.getRaiseErrorConditionalAccess().getGroup_1_0()); 
                    // InternalUseCase.g:1219:3: ( rule__RaiseErrorConditional__Group_1_0__0 )
                    // InternalUseCase.g:1219:4: rule__RaiseErrorConditional__Group_1_0__0
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
                    // InternalUseCase.g:1223:2: ( ( rule__RaiseErrorConditional__Group_1_1__0 ) )
                    {
                    // InternalUseCase.g:1223:2: ( ( rule__RaiseErrorConditional__Group_1_1__0 ) )
                    // InternalUseCase.g:1224:3: ( rule__RaiseErrorConditional__Group_1_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorConditionalAccess().getGroup_1_1()); 
                    // InternalUseCase.g:1225:3: ( rule__RaiseErrorConditional__Group_1_1__0 )
                    // InternalUseCase.g:1225:4: rule__RaiseErrorConditional__Group_1_1__0
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
    // InternalUseCase.g:1233:1: rule__RaiseErrorNow__Alternatives_0 : ( ( ( rule__RaiseErrorNow__Group_0_0__0 ) ) | ( ( rule__RaiseErrorNow__Group_0_1__0 ) ) );
    public final void rule__RaiseErrorNow__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1237:1: ( ( ( rule__RaiseErrorNow__Group_0_0__0 ) ) | ( ( rule__RaiseErrorNow__Group_0_1__0 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==71) ) {
                alt21=1;
            }
            else if ( (LA21_0==72) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:1238:2: ( ( rule__RaiseErrorNow__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1238:2: ( ( rule__RaiseErrorNow__Group_0_0__0 ) )
                    // InternalUseCase.g:1239:3: ( rule__RaiseErrorNow__Group_0_0__0 )
                    {
                     before(grammarAccess.getRaiseErrorNowAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1240:3: ( rule__RaiseErrorNow__Group_0_0__0 )
                    // InternalUseCase.g:1240:4: rule__RaiseErrorNow__Group_0_0__0
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
                    // InternalUseCase.g:1244:2: ( ( rule__RaiseErrorNow__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1244:2: ( ( rule__RaiseErrorNow__Group_0_1__0 ) )
                    // InternalUseCase.g:1245:3: ( rule__RaiseErrorNow__Group_0_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorNowAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1246:3: ( rule__RaiseErrorNow__Group_0_1__0 )
                    // InternalUseCase.g:1246:4: rule__RaiseErrorNow__Group_0_1__0
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
    // InternalUseCase.g:1254:1: rule__IfStatement__Alternatives_0 : ( ( 'If' ) | ( 'Falls' ) );
    public final void rule__IfStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1258:1: ( ( 'If' ) | ( 'Falls' ) )
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
                    // InternalUseCase.g:1259:2: ( 'If' )
                    {
                    // InternalUseCase.g:1259:2: ( 'If' )
                    // InternalUseCase.g:1260:3: 'If'
                    {
                     before(grammarAccess.getIfStatementAccess().getIfKeyword_0_0()); 
                    match(input,38,FOLLOW_2); 
                     after(grammarAccess.getIfStatementAccess().getIfKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1265:2: ( 'Falls' )
                    {
                    // InternalUseCase.g:1265:2: ( 'Falls' )
                    // InternalUseCase.g:1266:3: 'Falls'
                    {
                     before(grammarAccess.getIfStatementAccess().getFallsKeyword_0_1()); 
                    match(input,39,FOLLOW_2); 
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
    // InternalUseCase.g:1275:1: rule__Loop__Alternatives_0 : ( ( 'Solange' ) | ( 'While' ) );
    public final void rule__Loop__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1279:1: ( ( 'Solange' ) | ( 'While' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            else if ( (LA23_0==41) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:1280:2: ( 'Solange' )
                    {
                    // InternalUseCase.g:1280:2: ( 'Solange' )
                    // InternalUseCase.g:1281:3: 'Solange'
                    {
                     before(grammarAccess.getLoopAccess().getSolangeKeyword_0_0()); 
                    match(input,40,FOLLOW_2); 
                     after(grammarAccess.getLoopAccess().getSolangeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1286:2: ( 'While' )
                    {
                    // InternalUseCase.g:1286:2: ( 'While' )
                    // InternalUseCase.g:1287:3: 'While'
                    {
                     before(grammarAccess.getLoopAccess().getWhileKeyword_0_1()); 
                    match(input,41,FOLLOW_2); 
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
    // InternalUseCase.g:1296:1: rule__Notes__Alternatives_0 : ( ( ( rule__Notes__Alternatives_0_0 ) ) | ( ( rule__Notes__Alternatives_0_1 ) ) );
    public final void rule__Notes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1300:1: ( ( ( rule__Notes__Alternatives_0_0 ) ) | ( ( rule__Notes__Alternatives_0_1 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=42 && LA24_0<=43)) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=44 && LA24_0<=45)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:1301:2: ( ( rule__Notes__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1301:2: ( ( rule__Notes__Alternatives_0_0 ) )
                    // InternalUseCase.g:1302:3: ( rule__Notes__Alternatives_0_0 )
                    {
                     before(grammarAccess.getNotesAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1303:3: ( rule__Notes__Alternatives_0_0 )
                    // InternalUseCase.g:1303:4: rule__Notes__Alternatives_0_0
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
                    // InternalUseCase.g:1307:2: ( ( rule__Notes__Alternatives_0_1 ) )
                    {
                    // InternalUseCase.g:1307:2: ( ( rule__Notes__Alternatives_0_1 ) )
                    // InternalUseCase.g:1308:3: ( rule__Notes__Alternatives_0_1 )
                    {
                     before(grammarAccess.getNotesAccess().getAlternatives_0_1()); 
                    // InternalUseCase.g:1309:3: ( rule__Notes__Alternatives_0_1 )
                    // InternalUseCase.g:1309:4: rule__Notes__Alternatives_0_1
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
    // InternalUseCase.g:1317:1: rule__Notes__Alternatives_0_0 : ( ( 'notes:' ) | ( 'note:' ) );
    public final void rule__Notes__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1321:1: ( ( 'notes:' ) | ( 'note:' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            else if ( (LA25_0==43) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCase.g:1322:2: ( 'notes:' )
                    {
                    // InternalUseCase.g:1322:2: ( 'notes:' )
                    // InternalUseCase.g:1323:3: 'notes:'
                    {
                     before(grammarAccess.getNotesAccess().getNotesKeyword_0_0_0()); 
                    match(input,42,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getNotesKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1328:2: ( 'note:' )
                    {
                    // InternalUseCase.g:1328:2: ( 'note:' )
                    // InternalUseCase.g:1329:3: 'note:'
                    {
                     before(grammarAccess.getNotesAccess().getNoteKeyword_0_0_1()); 
                    match(input,43,FOLLOW_2); 
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
    // InternalUseCase.g:1338:1: rule__Notes__Alternatives_0_1 : ( ( 'Anmerkungen:' ) | ( 'Anmerkung:' ) );
    public final void rule__Notes__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1342:1: ( ( 'Anmerkungen:' ) | ( 'Anmerkung:' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            else if ( (LA26_0==45) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCase.g:1343:2: ( 'Anmerkungen:' )
                    {
                    // InternalUseCase.g:1343:2: ( 'Anmerkungen:' )
                    // InternalUseCase.g:1344:3: 'Anmerkungen:'
                    {
                     before(grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0()); 
                    match(input,44,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1349:2: ( 'Anmerkung:' )
                    {
                    // InternalUseCase.g:1349:2: ( 'Anmerkung:' )
                    // InternalUseCase.g:1350:3: 'Anmerkung:'
                    {
                     before(grammarAccess.getNotesAccess().getAnmerkungKeyword_0_1_1()); 
                    match(input,45,FOLLOW_2); 
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
    // InternalUseCase.g:1359:1: rule__UsedTypes__Alternatives_0 : ( ( ( rule__UsedTypes__Group_0_0__0 ) ) | ( ( rule__UsedTypes__Group_0_1__0 ) ) );
    public final void rule__UsedTypes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1363:1: ( ( ( rule__UsedTypes__Group_0_0__0 ) ) | ( ( rule__UsedTypes__Group_0_1__0 ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==73) ) {
                alt27=1;
            }
            else if ( (LA27_0==75) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalUseCase.g:1364:2: ( ( rule__UsedTypes__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1364:2: ( ( rule__UsedTypes__Group_0_0__0 ) )
                    // InternalUseCase.g:1365:3: ( rule__UsedTypes__Group_0_0__0 )
                    {
                     before(grammarAccess.getUsedTypesAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1366:3: ( rule__UsedTypes__Group_0_0__0 )
                    // InternalUseCase.g:1366:4: rule__UsedTypes__Group_0_0__0
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
                    // InternalUseCase.g:1370:2: ( ( rule__UsedTypes__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1370:2: ( ( rule__UsedTypes__Group_0_1__0 ) )
                    // InternalUseCase.g:1371:3: ( rule__UsedTypes__Group_0_1__0 )
                    {
                     before(grammarAccess.getUsedTypesAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1372:3: ( rule__UsedTypes__Group_0_1__0 )
                    // InternalUseCase.g:1372:4: rule__UsedTypes__Group_0_1__0
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
    // InternalUseCase.g:1380:1: rule__UsedExceptions__Alternatives_0 : ( ( ( rule__UsedExceptions__Group_0_0__0 ) ) | ( ( rule__UsedExceptions__Group_0_1__0 ) ) );
    public final void rule__UsedExceptions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1384:1: ( ( ( rule__UsedExceptions__Group_0_0__0 ) ) | ( ( rule__UsedExceptions__Group_0_1__0 ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==73) ) {
                alt28=1;
            }
            else if ( (LA28_0==75) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalUseCase.g:1385:2: ( ( rule__UsedExceptions__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1385:2: ( ( rule__UsedExceptions__Group_0_0__0 ) )
                    // InternalUseCase.g:1386:3: ( rule__UsedExceptions__Group_0_0__0 )
                    {
                     before(grammarAccess.getUsedExceptionsAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1387:3: ( rule__UsedExceptions__Group_0_0__0 )
                    // InternalUseCase.g:1387:4: rule__UsedExceptions__Group_0_0__0
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
                    // InternalUseCase.g:1391:2: ( ( rule__UsedExceptions__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1391:2: ( ( rule__UsedExceptions__Group_0_1__0 ) )
                    // InternalUseCase.g:1392:3: ( rule__UsedExceptions__Group_0_1__0 )
                    {
                     before(grammarAccess.getUsedExceptionsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1393:3: ( rule__UsedExceptions__Group_0_1__0 )
                    // InternalUseCase.g:1393:4: rule__UsedExceptions__Group_0_1__0
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
    // InternalUseCase.g:1401:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1405:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUseCase.g:1406:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalUseCase.g:1413:1: rule__Model__Group__0__Impl : ( ( rule__Model__Alternatives_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1417:1: ( ( ( rule__Model__Alternatives_0 ) ) )
            // InternalUseCase.g:1418:1: ( ( rule__Model__Alternatives_0 ) )
            {
            // InternalUseCase.g:1418:1: ( ( rule__Model__Alternatives_0 ) )
            // InternalUseCase.g:1419:2: ( rule__Model__Alternatives_0 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_0()); 
            // InternalUseCase.g:1420:2: ( rule__Model__Alternatives_0 )
            // InternalUseCase.g:1420:3: rule__Model__Alternatives_0
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
    // InternalUseCase.g:1428:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1432:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUseCase.g:1433:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalUseCase.g:1440:1: rule__Model__Group__1__Impl : ( ( rule__Model__CompanyAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1444:1: ( ( ( rule__Model__CompanyAssignment_1 ) ) )
            // InternalUseCase.g:1445:1: ( ( rule__Model__CompanyAssignment_1 ) )
            {
            // InternalUseCase.g:1445:1: ( ( rule__Model__CompanyAssignment_1 ) )
            // InternalUseCase.g:1446:2: ( rule__Model__CompanyAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getCompanyAssignment_1()); 
            // InternalUseCase.g:1447:2: ( rule__Model__CompanyAssignment_1 )
            // InternalUseCase.g:1447:3: rule__Model__CompanyAssignment_1
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
    // InternalUseCase.g:1455:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1459:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalUseCase.g:1460:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalUseCase.g:1467:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackageAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1471:1: ( ( ( rule__Model__PackageAssignment_2 ) ) )
            // InternalUseCase.g:1472:1: ( ( rule__Model__PackageAssignment_2 ) )
            {
            // InternalUseCase.g:1472:1: ( ( rule__Model__PackageAssignment_2 ) )
            // InternalUseCase.g:1473:2: ( rule__Model__PackageAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getPackageAssignment_2()); 
            // InternalUseCase.g:1474:2: ( rule__Model__PackageAssignment_2 )
            // InternalUseCase.g:1474:3: rule__Model__PackageAssignment_2
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
    // InternalUseCase.g:1482:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1486:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalUseCase.g:1487:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalUseCase.g:1494:1: rule__Model__Group__3__Impl : ( ( rule__Model__UseCasesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1498:1: ( ( ( rule__Model__UseCasesAssignment_3 )* ) )
            // InternalUseCase.g:1499:1: ( ( rule__Model__UseCasesAssignment_3 )* )
            {
            // InternalUseCase.g:1499:1: ( ( rule__Model__UseCasesAssignment_3 )* )
            // InternalUseCase.g:1500:2: ( rule__Model__UseCasesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getUseCasesAssignment_3()); 
            // InternalUseCase.g:1501:2: ( rule__Model__UseCasesAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=16 && LA29_0<=17)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUseCase.g:1501:3: rule__Model__UseCasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__UseCasesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalUseCase.g:1509:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1513:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalUseCase.g:1514:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalUseCase.g:1521:1: rule__Model__Group__4__Impl : ( ( rule__Model__TypesAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1525:1: ( ( ( rule__Model__TypesAssignment_4 ) ) )
            // InternalUseCase.g:1526:1: ( ( rule__Model__TypesAssignment_4 ) )
            {
            // InternalUseCase.g:1526:1: ( ( rule__Model__TypesAssignment_4 ) )
            // InternalUseCase.g:1527:2: ( rule__Model__TypesAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_4()); 
            // InternalUseCase.g:1528:2: ( rule__Model__TypesAssignment_4 )
            // InternalUseCase.g:1528:3: rule__Model__TypesAssignment_4
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
    // InternalUseCase.g:1536:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1540:1: ( rule__Model__Group__5__Impl )
            // InternalUseCase.g:1541:2: rule__Model__Group__5__Impl
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
    // InternalUseCase.g:1547:1: rule__Model__Group__5__Impl : ( ( rule__Model__ExceptionsAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1551:1: ( ( ( rule__Model__ExceptionsAssignment_5 ) ) )
            // InternalUseCase.g:1552:1: ( ( rule__Model__ExceptionsAssignment_5 ) )
            {
            // InternalUseCase.g:1552:1: ( ( rule__Model__ExceptionsAssignment_5 ) )
            // InternalUseCase.g:1553:2: ( rule__Model__ExceptionsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getExceptionsAssignment_5()); 
            // InternalUseCase.g:1554:2: ( rule__Model__ExceptionsAssignment_5 )
            // InternalUseCase.g:1554:3: rule__Model__ExceptionsAssignment_5
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
    // InternalUseCase.g:1563:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1567:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUseCase.g:1568:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalUseCase.g:1575:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1579:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1580:1: ( RULE_ID )
            {
            // InternalUseCase.g:1580:1: ( RULE_ID )
            // InternalUseCase.g:1581:2: RULE_ID
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
    // InternalUseCase.g:1590:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1594:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUseCase.g:1595:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUseCase.g:1601:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1605:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUseCase.g:1606:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUseCase.g:1606:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUseCase.g:1607:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUseCase.g:1608:2: ( rule__QualifiedName__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==36) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUseCase.g:1608:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalUseCase.g:1617:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1621:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUseCase.g:1622:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalUseCase.g:1629:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1633:1: ( ( '.' ) )
            // InternalUseCase.g:1634:1: ( '.' )
            {
            // InternalUseCase.g:1634:1: ( '.' )
            // InternalUseCase.g:1635:2: '.'
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
    // InternalUseCase.g:1644:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1648:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUseCase.g:1649:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUseCase.g:1655:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1659:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1660:1: ( RULE_ID )
            {
            // InternalUseCase.g:1660:1: ( RULE_ID )
            // InternalUseCase.g:1661:2: RULE_ID
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
    // InternalUseCase.g:1671:1: rule__QualifiedNumber__Group__0 : rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 ;
    public final void rule__QualifiedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1675:1: ( rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 )
            // InternalUseCase.g:1676:2: rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1
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
    // InternalUseCase.g:1683:1: rule__QualifiedNumber__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1687:1: ( ( RULE_INT ) )
            // InternalUseCase.g:1688:1: ( RULE_INT )
            {
            // InternalUseCase.g:1688:1: ( RULE_INT )
            // InternalUseCase.g:1689:2: RULE_INT
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
    // InternalUseCase.g:1698:1: rule__QualifiedNumber__Group__1 : rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 ;
    public final void rule__QualifiedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1702:1: ( rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 )
            // InternalUseCase.g:1703:2: rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2
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
    // InternalUseCase.g:1710:1: rule__QualifiedNumber__Group__1__Impl : ( ( rule__QualifiedNumber__Group_1__0 )* ) ;
    public final void rule__QualifiedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1714:1: ( ( ( rule__QualifiedNumber__Group_1__0 )* ) )
            // InternalUseCase.g:1715:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            {
            // InternalUseCase.g:1715:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            // InternalUseCase.g:1716:2: ( rule__QualifiedNumber__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup_1()); 
            // InternalUseCase.g:1717:2: ( rule__QualifiedNumber__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==RULE_INT) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalUseCase.g:1717:3: rule__QualifiedNumber__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedNumber__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalUseCase.g:1725:1: rule__QualifiedNumber__Group__2 : rule__QualifiedNumber__Group__2__Impl ;
    public final void rule__QualifiedNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1729:1: ( rule__QualifiedNumber__Group__2__Impl )
            // InternalUseCase.g:1730:2: rule__QualifiedNumber__Group__2__Impl
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
    // InternalUseCase.g:1736:1: rule__QualifiedNumber__Group__2__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1740:1: ( ( '.' ) )
            // InternalUseCase.g:1741:1: ( '.' )
            {
            // InternalUseCase.g:1741:1: ( '.' )
            // InternalUseCase.g:1742:2: '.'
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
    // InternalUseCase.g:1752:1: rule__QualifiedNumber__Group_1__0 : rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 ;
    public final void rule__QualifiedNumber__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1756:1: ( rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 )
            // InternalUseCase.g:1757:2: rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1
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
    // InternalUseCase.g:1764:1: rule__QualifiedNumber__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1768:1: ( ( '.' ) )
            // InternalUseCase.g:1769:1: ( '.' )
            {
            // InternalUseCase.g:1769:1: ( '.' )
            // InternalUseCase.g:1770:2: '.'
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
    // InternalUseCase.g:1779:1: rule__QualifiedNumber__Group_1__1 : rule__QualifiedNumber__Group_1__1__Impl ;
    public final void rule__QualifiedNumber__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1783:1: ( rule__QualifiedNumber__Group_1__1__Impl )
            // InternalUseCase.g:1784:2: rule__QualifiedNumber__Group_1__1__Impl
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
    // InternalUseCase.g:1790:1: rule__QualifiedNumber__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1794:1: ( ( RULE_INT ) )
            // InternalUseCase.g:1795:1: ( RULE_INT )
            {
            // InternalUseCase.g:1795:1: ( RULE_INT )
            // InternalUseCase.g:1796:2: RULE_INT
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
    // InternalUseCase.g:1806:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1810:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalUseCase.g:1811:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalUseCase.g:1818:1: rule__Package__Group__0__Impl : ( ( rule__Package__Alternatives_0 ) ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1822:1: ( ( ( rule__Package__Alternatives_0 ) ) )
            // InternalUseCase.g:1823:1: ( ( rule__Package__Alternatives_0 ) )
            {
            // InternalUseCase.g:1823:1: ( ( rule__Package__Alternatives_0 ) )
            // InternalUseCase.g:1824:2: ( rule__Package__Alternatives_0 )
            {
             before(grammarAccess.getPackageAccess().getAlternatives_0()); 
            // InternalUseCase.g:1825:2: ( rule__Package__Alternatives_0 )
            // InternalUseCase.g:1825:3: rule__Package__Alternatives_0
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
    // InternalUseCase.g:1833:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1837:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalUseCase.g:1838:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalUseCase.g:1845:1: rule__Package__Group__1__Impl : ( ( rule__Package__PartsAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1849:1: ( ( ( rule__Package__PartsAssignment_1 ) ) )
            // InternalUseCase.g:1850:1: ( ( rule__Package__PartsAssignment_1 ) )
            {
            // InternalUseCase.g:1850:1: ( ( rule__Package__PartsAssignment_1 ) )
            // InternalUseCase.g:1851:2: ( rule__Package__PartsAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getPartsAssignment_1()); 
            // InternalUseCase.g:1852:2: ( rule__Package__PartsAssignment_1 )
            // InternalUseCase.g:1852:3: rule__Package__PartsAssignment_1
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
    // InternalUseCase.g:1860:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1864:1: ( rule__Package__Group__2__Impl )
            // InternalUseCase.g:1865:2: rule__Package__Group__2__Impl
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
    // InternalUseCase.g:1871:1: rule__Package__Group__2__Impl : ( ( rule__Package__Group_2__0 )* ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1875:1: ( ( ( rule__Package__Group_2__0 )* ) )
            // InternalUseCase.g:1876:1: ( ( rule__Package__Group_2__0 )* )
            {
            // InternalUseCase.g:1876:1: ( ( rule__Package__Group_2__0 )* )
            // InternalUseCase.g:1877:2: ( rule__Package__Group_2__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_2()); 
            // InternalUseCase.g:1878:2: ( rule__Package__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==46) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUseCase.g:1878:3: rule__Package__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Package__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalUseCase.g:1887:1: rule__Package__Group_2__0 : rule__Package__Group_2__0__Impl rule__Package__Group_2__1 ;
    public final void rule__Package__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1891:1: ( rule__Package__Group_2__0__Impl rule__Package__Group_2__1 )
            // InternalUseCase.g:1892:2: rule__Package__Group_2__0__Impl rule__Package__Group_2__1
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
    // InternalUseCase.g:1899:1: rule__Package__Group_2__0__Impl : ( '>' ) ;
    public final void rule__Package__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1903:1: ( ( '>' ) )
            // InternalUseCase.g:1904:1: ( '>' )
            {
            // InternalUseCase.g:1904:1: ( '>' )
            // InternalUseCase.g:1905:2: '>'
            {
             before(grammarAccess.getPackageAccess().getGreaterThanSignKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalUseCase.g:1914:1: rule__Package__Group_2__1 : rule__Package__Group_2__1__Impl ;
    public final void rule__Package__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1918:1: ( rule__Package__Group_2__1__Impl )
            // InternalUseCase.g:1919:2: rule__Package__Group_2__1__Impl
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
    // InternalUseCase.g:1925:1: rule__Package__Group_2__1__Impl : ( ( rule__Package__PartsAssignment_2_1 ) ) ;
    public final void rule__Package__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1929:1: ( ( ( rule__Package__PartsAssignment_2_1 ) ) )
            // InternalUseCase.g:1930:1: ( ( rule__Package__PartsAssignment_2_1 ) )
            {
            // InternalUseCase.g:1930:1: ( ( rule__Package__PartsAssignment_2_1 ) )
            // InternalUseCase.g:1931:2: ( rule__Package__PartsAssignment_2_1 )
            {
             before(grammarAccess.getPackageAccess().getPartsAssignment_2_1()); 
            // InternalUseCase.g:1932:2: ( rule__Package__PartsAssignment_2_1 )
            // InternalUseCase.g:1932:3: rule__Package__PartsAssignment_2_1
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
    // InternalUseCase.g:1941:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1945:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCase.g:1946:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUseCase.g:1953:1: rule__UseCase__Group__0__Impl : ( ( rule__UseCase__Alternatives_0 ) ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1957:1: ( ( ( rule__UseCase__Alternatives_0 ) ) )
            // InternalUseCase.g:1958:1: ( ( rule__UseCase__Alternatives_0 ) )
            {
            // InternalUseCase.g:1958:1: ( ( rule__UseCase__Alternatives_0 ) )
            // InternalUseCase.g:1959:2: ( rule__UseCase__Alternatives_0 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_0()); 
            // InternalUseCase.g:1960:2: ( rule__UseCase__Alternatives_0 )
            // InternalUseCase.g:1960:3: rule__UseCase__Alternatives_0
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
    // InternalUseCase.g:1968:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1972:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCase.g:1973:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
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
    // InternalUseCase.g:1980:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1984:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUseCase.g:1985:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUseCase.g:1985:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUseCase.g:1986:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUseCase.g:1987:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUseCase.g:1987:3: rule__UseCase__NameAssignment_1
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
    // InternalUseCase.g:1995:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1999:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCase.g:2000:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
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
    // InternalUseCase.g:2007:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionsAssignment_2 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2011:1: ( ( ( rule__UseCase__DescriptionsAssignment_2 )? ) )
            // InternalUseCase.g:2012:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            {
            // InternalUseCase.g:2012:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            // InternalUseCase.g:2013:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); 
            // InternalUseCase.g:2014:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=18 && LA33_0<=20)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUseCase.g:2014:3: rule__UseCase__DescriptionsAssignment_2
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
    // InternalUseCase.g:2022:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2026:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCase.g:2027:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
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
    // InternalUseCase.g:2034:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2038:1: ( ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) )
            // InternalUseCase.g:2039:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            {
            // InternalUseCase.g:2039:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            // InternalUseCase.g:2040:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            {
             before(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAssignment_3()); 
            // InternalUseCase.g:2041:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21||LA34_0==52) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUseCase.g:2041:3: rule__UseCase__AllowedUserGroupsAssignment_3
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
    // InternalUseCase.g:2049:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2053:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCase.g:2054:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
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
    // InternalUseCase.g:2061:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__InputsAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2065:1: ( ( ( rule__UseCase__InputsAssignment_4 )? ) )
            // InternalUseCase.g:2066:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            {
            // InternalUseCase.g:2066:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            // InternalUseCase.g:2067:2: ( rule__UseCase__InputsAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getInputsAssignment_4()); 
            // InternalUseCase.g:2068:2: ( rule__UseCase__InputsAssignment_4 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=22 && LA35_0<=23)||LA35_0==55||LA35_0==59) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUseCase.g:2068:3: rule__UseCase__InputsAssignment_4
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
    // InternalUseCase.g:2076:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2080:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCase.g:2081:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
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
    // InternalUseCase.g:2088:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__OutputsAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2092:1: ( ( ( rule__UseCase__OutputsAssignment_5 )? ) )
            // InternalUseCase.g:2093:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            {
            // InternalUseCase.g:2093:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            // InternalUseCase.g:2094:2: ( rule__UseCase__OutputsAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getOutputsAssignment_5()); 
            // InternalUseCase.g:2095:2: ( rule__UseCase__OutputsAssignment_5 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=28 && LA36_0<=30)||LA36_0==63) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUseCase.g:2095:3: rule__UseCase__OutputsAssignment_5
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
    // InternalUseCase.g:2103:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2107:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCase.g:2108:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
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
    // InternalUseCase.g:2115:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__PreconditionsAssignment_6 )? ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2119:1: ( ( ( rule__UseCase__PreconditionsAssignment_6 )? ) )
            // InternalUseCase.g:2120:1: ( ( rule__UseCase__PreconditionsAssignment_6 )? )
            {
            // InternalUseCase.g:2120:1: ( ( rule__UseCase__PreconditionsAssignment_6 )? )
            // InternalUseCase.g:2121:2: ( rule__UseCase__PreconditionsAssignment_6 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_6()); 
            // InternalUseCase.g:2122:2: ( rule__UseCase__PreconditionsAssignment_6 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=31 && LA37_0<=33)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUseCase.g:2122:3: rule__UseCase__PreconditionsAssignment_6
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
    // InternalUseCase.g:2130:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2134:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCase.g:2135:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
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
    // InternalUseCase.g:2142:1: rule__UseCase__Group__7__Impl : ( ( rule__UseCase__StepsAssignment_7 )? ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2146:1: ( ( ( rule__UseCase__StepsAssignment_7 )? ) )
            // InternalUseCase.g:2147:1: ( ( rule__UseCase__StepsAssignment_7 )? )
            {
            // InternalUseCase.g:2147:1: ( ( rule__UseCase__StepsAssignment_7 )? )
            // InternalUseCase.g:2148:2: ( rule__UseCase__StepsAssignment_7 )?
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_7()); 
            // InternalUseCase.g:2149:2: ( rule__UseCase__StepsAssignment_7 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=34 && LA38_0<=35)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUseCase.g:2149:3: rule__UseCase__StepsAssignment_7
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
    // InternalUseCase.g:2157:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2161:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCase.g:2162:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
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
    // InternalUseCase.g:2169:1: rule__UseCase__Group__8__Impl : ( ( rule__UseCase__NotesAssignment_8 )? ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2173:1: ( ( ( rule__UseCase__NotesAssignment_8 )? ) )
            // InternalUseCase.g:2174:1: ( ( rule__UseCase__NotesAssignment_8 )? )
            {
            // InternalUseCase.g:2174:1: ( ( rule__UseCase__NotesAssignment_8 )? )
            // InternalUseCase.g:2175:2: ( rule__UseCase__NotesAssignment_8 )?
            {
             before(grammarAccess.getUseCaseAccess().getNotesAssignment_8()); 
            // InternalUseCase.g:2176:2: ( rule__UseCase__NotesAssignment_8 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=42 && LA39_0<=45)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUseCase.g:2176:3: rule__UseCase__NotesAssignment_8
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
    // InternalUseCase.g:2184:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2188:1: ( rule__UseCase__Group__9__Impl )
            // InternalUseCase.g:2189:2: rule__UseCase__Group__9__Impl
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
    // InternalUseCase.g:2195:1: rule__UseCase__Group__9__Impl : ( ( rule__UseCase__Alternatives_9 ) ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2199:1: ( ( ( rule__UseCase__Alternatives_9 ) ) )
            // InternalUseCase.g:2200:1: ( ( rule__UseCase__Alternatives_9 ) )
            {
            // InternalUseCase.g:2200:1: ( ( rule__UseCase__Alternatives_9 ) )
            // InternalUseCase.g:2201:2: ( rule__UseCase__Alternatives_9 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_9()); 
            // InternalUseCase.g:2202:2: ( rule__UseCase__Alternatives_9 )
            // InternalUseCase.g:2202:3: rule__UseCase__Alternatives_9
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
    // InternalUseCase.g:2211:1: rule__UseCase__Group_9_0__0 : rule__UseCase__Group_9_0__0__Impl rule__UseCase__Group_9_0__1 ;
    public final void rule__UseCase__Group_9_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2215:1: ( rule__UseCase__Group_9_0__0__Impl rule__UseCase__Group_9_0__1 )
            // InternalUseCase.g:2216:2: rule__UseCase__Group_9_0__0__Impl rule__UseCase__Group_9_0__1
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
    // InternalUseCase.g:2223:1: rule__UseCase__Group_9_0__0__Impl : ( 'end' ) ;
    public final void rule__UseCase__Group_9_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2227:1: ( ( 'end' ) )
            // InternalUseCase.g:2228:1: ( 'end' )
            {
            // InternalUseCase.g:2228:1: ( 'end' )
            // InternalUseCase.g:2229:2: 'end'
            {
             before(grammarAccess.getUseCaseAccess().getEndKeyword_9_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalUseCase.g:2238:1: rule__UseCase__Group_9_0__1 : rule__UseCase__Group_9_0__1__Impl rule__UseCase__Group_9_0__2 ;
    public final void rule__UseCase__Group_9_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2242:1: ( rule__UseCase__Group_9_0__1__Impl rule__UseCase__Group_9_0__2 )
            // InternalUseCase.g:2243:2: rule__UseCase__Group_9_0__1__Impl rule__UseCase__Group_9_0__2
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
    // InternalUseCase.g:2250:1: rule__UseCase__Group_9_0__1__Impl : ( 'of' ) ;
    public final void rule__UseCase__Group_9_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2254:1: ( ( 'of' ) )
            // InternalUseCase.g:2255:1: ( 'of' )
            {
            // InternalUseCase.g:2255:1: ( 'of' )
            // InternalUseCase.g:2256:2: 'of'
            {
             before(grammarAccess.getUseCaseAccess().getOfKeyword_9_0_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalUseCase.g:2265:1: rule__UseCase__Group_9_0__2 : rule__UseCase__Group_9_0__2__Impl ;
    public final void rule__UseCase__Group_9_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2269:1: ( rule__UseCase__Group_9_0__2__Impl )
            // InternalUseCase.g:2270:2: rule__UseCase__Group_9_0__2__Impl
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
    // InternalUseCase.g:2276:1: rule__UseCase__Group_9_0__2__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group_9_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2280:1: ( ( 'use-case' ) )
            // InternalUseCase.g:2281:1: ( 'use-case' )
            {
            // InternalUseCase.g:2281:1: ( 'use-case' )
            // InternalUseCase.g:2282:2: 'use-case'
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
    // InternalUseCase.g:2292:1: rule__UseCase__Group_9_1__0 : rule__UseCase__Group_9_1__0__Impl rule__UseCase__Group_9_1__1 ;
    public final void rule__UseCase__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2296:1: ( rule__UseCase__Group_9_1__0__Impl rule__UseCase__Group_9_1__1 )
            // InternalUseCase.g:2297:2: rule__UseCase__Group_9_1__0__Impl rule__UseCase__Group_9_1__1
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
    // InternalUseCase.g:2304:1: rule__UseCase__Group_9_1__0__Impl : ( 'Ende' ) ;
    public final void rule__UseCase__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2308:1: ( ( 'Ende' ) )
            // InternalUseCase.g:2309:1: ( 'Ende' )
            {
            // InternalUseCase.g:2309:1: ( 'Ende' )
            // InternalUseCase.g:2310:2: 'Ende'
            {
             before(grammarAccess.getUseCaseAccess().getEndeKeyword_9_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUseCase.g:2319:1: rule__UseCase__Group_9_1__1 : rule__UseCase__Group_9_1__1__Impl rule__UseCase__Group_9_1__2 ;
    public final void rule__UseCase__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2323:1: ( rule__UseCase__Group_9_1__1__Impl rule__UseCase__Group_9_1__2 )
            // InternalUseCase.g:2324:2: rule__UseCase__Group_9_1__1__Impl rule__UseCase__Group_9_1__2
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
    // InternalUseCase.g:2331:1: rule__UseCase__Group_9_1__1__Impl : ( 'des' ) ;
    public final void rule__UseCase__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2335:1: ( ( 'des' ) )
            // InternalUseCase.g:2336:1: ( 'des' )
            {
            // InternalUseCase.g:2336:1: ( 'des' )
            // InternalUseCase.g:2337:2: 'des'
            {
             before(grammarAccess.getUseCaseAccess().getDesKeyword_9_1_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUseCase.g:2346:1: rule__UseCase__Group_9_1__2 : rule__UseCase__Group_9_1__2__Impl ;
    public final void rule__UseCase__Group_9_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2350:1: ( rule__UseCase__Group_9_1__2__Impl )
            // InternalUseCase.g:2351:2: rule__UseCase__Group_9_1__2__Impl
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
    // InternalUseCase.g:2357:1: rule__UseCase__Group_9_1__2__Impl : ( 'Rezpets' ) ;
    public final void rule__UseCase__Group_9_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2361:1: ( ( 'Rezpets' ) )
            // InternalUseCase.g:2362:1: ( 'Rezpets' )
            {
            // InternalUseCase.g:2362:1: ( 'Rezpets' )
            // InternalUseCase.g:2363:2: 'Rezpets'
            {
             before(grammarAccess.getUseCaseAccess().getRezpetsKeyword_9_1_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUseCase.g:2373:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2377:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalUseCase.g:2378:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalUseCase.g:2385:1: rule__Description__Group__0__Impl : ( ( rule__Description__Alternatives_0 ) ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2389:1: ( ( ( rule__Description__Alternatives_0 ) ) )
            // InternalUseCase.g:2390:1: ( ( rule__Description__Alternatives_0 ) )
            {
            // InternalUseCase.g:2390:1: ( ( rule__Description__Alternatives_0 ) )
            // InternalUseCase.g:2391:2: ( rule__Description__Alternatives_0 )
            {
             before(grammarAccess.getDescriptionAccess().getAlternatives_0()); 
            // InternalUseCase.g:2392:2: ( rule__Description__Alternatives_0 )
            // InternalUseCase.g:2392:3: rule__Description__Alternatives_0
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
    // InternalUseCase.g:2400:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2404:1: ( rule__Description__Group__1__Impl )
            // InternalUseCase.g:2405:2: rule__Description__Group__1__Impl
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
    // InternalUseCase.g:2411:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2415:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalUseCase.g:2416:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalUseCase.g:2416:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalUseCase.g:2417:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalUseCase.g:2418:2: ( rule__Description__NameAssignment_1 )
            // InternalUseCase.g:2418:3: rule__Description__NameAssignment_1
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
    // InternalUseCase.g:2427:1: rule__AllowedUserGroups__Group__0 : rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 ;
    public final void rule__AllowedUserGroups__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2431:1: ( rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 )
            // InternalUseCase.g:2432:2: rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1
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
    // InternalUseCase.g:2439:1: rule__AllowedUserGroups__Group__0__Impl : ( ( rule__AllowedUserGroups__Alternatives_0 ) ) ;
    public final void rule__AllowedUserGroups__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2443:1: ( ( ( rule__AllowedUserGroups__Alternatives_0 ) ) )
            // InternalUseCase.g:2444:1: ( ( rule__AllowedUserGroups__Alternatives_0 ) )
            {
            // InternalUseCase.g:2444:1: ( ( rule__AllowedUserGroups__Alternatives_0 ) )
            // InternalUseCase.g:2445:2: ( rule__AllowedUserGroups__Alternatives_0 )
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getAlternatives_0()); 
            // InternalUseCase.g:2446:2: ( rule__AllowedUserGroups__Alternatives_0 )
            // InternalUseCase.g:2446:3: rule__AllowedUserGroups__Alternatives_0
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
    // InternalUseCase.g:2454:1: rule__AllowedUserGroups__Group__1 : rule__AllowedUserGroups__Group__1__Impl ;
    public final void rule__AllowedUserGroups__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2458:1: ( rule__AllowedUserGroups__Group__1__Impl )
            // InternalUseCase.g:2459:2: rule__AllowedUserGroups__Group__1__Impl
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
    // InternalUseCase.g:2465:1: rule__AllowedUserGroups__Group__1__Impl : ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) ;
    public final void rule__AllowedUserGroups__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2469:1: ( ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) )
            // InternalUseCase.g:2470:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            {
            // InternalUseCase.g:2470:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            // InternalUseCase.g:2471:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroupsAssignment_1()); 
            // InternalUseCase.g:2472:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==54||LA40_0==81) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUseCase.g:2472:3: rule__AllowedUserGroups__GroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__AllowedUserGroups__GroupsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalUseCase.g:2481:1: rule__AllowedUserGroups__Group_0_1__0 : rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1 ;
    public final void rule__AllowedUserGroups__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2485:1: ( rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1 )
            // InternalUseCase.g:2486:2: rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1
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
    // InternalUseCase.g:2493:1: rule__AllowedUserGroups__Group_0_1__0__Impl : ( 'Erlaubt' ) ;
    public final void rule__AllowedUserGroups__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2497:1: ( ( 'Erlaubt' ) )
            // InternalUseCase.g:2498:1: ( 'Erlaubt' )
            {
            // InternalUseCase.g:2498:1: ( 'Erlaubt' )
            // InternalUseCase.g:2499:2: 'Erlaubt'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getErlaubtKeyword_0_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUseCase.g:2508:1: rule__AllowedUserGroups__Group_0_1__1 : rule__AllowedUserGroups__Group_0_1__1__Impl ;
    public final void rule__AllowedUserGroups__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2512:1: ( rule__AllowedUserGroups__Group_0_1__1__Impl )
            // InternalUseCase.g:2513:2: rule__AllowedUserGroups__Group_0_1__1__Impl
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
    // InternalUseCase.g:2519:1: rule__AllowedUserGroups__Group_0_1__1__Impl : ( 'f\\u00FCr:' ) ;
    public final void rule__AllowedUserGroups__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2523:1: ( ( 'f\\u00FCr:' ) )
            // InternalUseCase.g:2524:1: ( 'f\\u00FCr:' )
            {
            // InternalUseCase.g:2524:1: ( 'f\\u00FCr:' )
            // InternalUseCase.g:2525:2: 'f\\u00FCr:'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getFürKeyword_0_1_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUseCase.g:2535:1: rule__AllowedUserGroup__Group__0 : rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 ;
    public final void rule__AllowedUserGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2539:1: ( rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 )
            // InternalUseCase.g:2540:2: rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1
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
    // InternalUseCase.g:2547:1: rule__AllowedUserGroup__Group__0__Impl : ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) ;
    public final void rule__AllowedUserGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2551:1: ( ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2552:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2552:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            // InternalUseCase.g:2553:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2554:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==81) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUseCase.g:2554:3: rule__AllowedUserGroup__ManyAssignment_0
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
    // InternalUseCase.g:2562:1: rule__AllowedUserGroup__Group__1 : rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 ;
    public final void rule__AllowedUserGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2566:1: ( rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 )
            // InternalUseCase.g:2567:2: rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2
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
    // InternalUseCase.g:2574:1: rule__AllowedUserGroup__Group__1__Impl : ( '-' ) ;
    public final void rule__AllowedUserGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2578:1: ( ( '-' ) )
            // InternalUseCase.g:2579:1: ( '-' )
            {
            // InternalUseCase.g:2579:1: ( '-' )
            // InternalUseCase.g:2580:2: '-'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUseCase.g:2589:1: rule__AllowedUserGroup__Group__2 : rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 ;
    public final void rule__AllowedUserGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2593:1: ( rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 )
            // InternalUseCase.g:2594:2: rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3
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
    // InternalUseCase.g:2601:1: rule__AllowedUserGroup__Group__2__Impl : ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) ;
    public final void rule__AllowedUserGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2605:1: ( ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) )
            // InternalUseCase.g:2606:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            {
            // InternalUseCase.g:2606:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            // InternalUseCase.g:2607:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getNameAssignment_2()); 
            // InternalUseCase.g:2608:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            // InternalUseCase.g:2608:3: rule__AllowedUserGroup__NameAssignment_2
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
    // InternalUseCase.g:2616:1: rule__AllowedUserGroup__Group__3 : rule__AllowedUserGroup__Group__3__Impl ;
    public final void rule__AllowedUserGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2620:1: ( rule__AllowedUserGroup__Group__3__Impl )
            // InternalUseCase.g:2621:2: rule__AllowedUserGroup__Group__3__Impl
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
    // InternalUseCase.g:2627:1: rule__AllowedUserGroup__Group__3__Impl : ( ( rule__AllowedUserGroup__Group_3__0 )? ) ;
    public final void rule__AllowedUserGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2631:1: ( ( ( rule__AllowedUserGroup__Group_3__0 )? ) )
            // InternalUseCase.g:2632:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            {
            // InternalUseCase.g:2632:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            // InternalUseCase.g:2633:2: ( rule__AllowedUserGroup__Group_3__0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup_3()); 
            // InternalUseCase.g:2634:2: ( rule__AllowedUserGroup__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==24) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUseCase.g:2634:3: rule__AllowedUserGroup__Group_3__0
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
    // InternalUseCase.g:2643:1: rule__AllowedUserGroup__Group_3__0 : rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 ;
    public final void rule__AllowedUserGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2647:1: ( rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 )
            // InternalUseCase.g:2648:2: rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1
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
    // InternalUseCase.g:2655:1: rule__AllowedUserGroup__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__AllowedUserGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2659:1: ( ( 'as' ) )
            // InternalUseCase.g:2660:1: ( 'as' )
            {
            // InternalUseCase.g:2660:1: ( 'as' )
            // InternalUseCase.g:2661:2: 'as'
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
    // InternalUseCase.g:2670:1: rule__AllowedUserGroup__Group_3__1 : rule__AllowedUserGroup__Group_3__1__Impl ;
    public final void rule__AllowedUserGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2674:1: ( rule__AllowedUserGroup__Group_3__1__Impl )
            // InternalUseCase.g:2675:2: rule__AllowedUserGroup__Group_3__1__Impl
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
    // InternalUseCase.g:2681:1: rule__AllowedUserGroup__Group_3__1__Impl : ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) ;
    public final void rule__AllowedUserGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2685:1: ( ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:2686:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:2686:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            // InternalUseCase.g:2687:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:2688:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            // InternalUseCase.g:2688:3: rule__AllowedUserGroup__TypeAssignment_3_1
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
    // InternalUseCase.g:2697:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2701:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalUseCase.g:2702:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
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
    // InternalUseCase.g:2709:1: rule__Inputs__Group__0__Impl : ( ( rule__Inputs__Alternatives_0 ) ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2713:1: ( ( ( rule__Inputs__Alternatives_0 ) ) )
            // InternalUseCase.g:2714:1: ( ( rule__Inputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:2714:1: ( ( rule__Inputs__Alternatives_0 ) )
            // InternalUseCase.g:2715:2: ( rule__Inputs__Alternatives_0 )
            {
             before(grammarAccess.getInputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:2716:2: ( rule__Inputs__Alternatives_0 )
            // InternalUseCase.g:2716:3: rule__Inputs__Alternatives_0
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
    // InternalUseCase.g:2724:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2728:1: ( rule__Inputs__Group__1__Impl )
            // InternalUseCase.g:2729:2: rule__Inputs__Group__1__Impl
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
    // InternalUseCase.g:2735:1: rule__Inputs__Group__1__Impl : ( ( rule__Inputs__InputsAssignment_1 )* ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2739:1: ( ( ( rule__Inputs__InputsAssignment_1 )* ) )
            // InternalUseCase.g:2740:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            {
            // InternalUseCase.g:2740:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            // InternalUseCase.g:2741:2: ( rule__Inputs__InputsAssignment_1 )*
            {
             before(grammarAccess.getInputsAccess().getInputsAssignment_1()); 
            // InternalUseCase.g:2742:2: ( rule__Inputs__InputsAssignment_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==54||LA43_0==81) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUseCase.g:2742:3: rule__Inputs__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Inputs__InputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalUseCase.g:2751:1: rule__Inputs__Group_0_0_2__0 : rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1 ;
    public final void rule__Inputs__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2755:1: ( rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1 )
            // InternalUseCase.g:2756:2: rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1
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
    // InternalUseCase.g:2763:1: rule__Inputs__Group_0_0_2__0__Impl : ( 'requires' ) ;
    public final void rule__Inputs__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2767:1: ( ( 'requires' ) )
            // InternalUseCase.g:2768:1: ( 'requires' )
            {
            // InternalUseCase.g:2768:1: ( 'requires' )
            // InternalUseCase.g:2769:2: 'requires'
            {
             before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_2_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalUseCase.g:2778:1: rule__Inputs__Group_0_0_2__1 : rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2 ;
    public final void rule__Inputs__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2782:1: ( rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2 )
            // InternalUseCase.g:2783:2: rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2
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
    // InternalUseCase.g:2790:1: rule__Inputs__Group_0_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Inputs__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2794:1: ( ( 'the' ) )
            // InternalUseCase.g:2795:1: ( 'the' )
            {
            // InternalUseCase.g:2795:1: ( 'the' )
            // InternalUseCase.g:2796:2: 'the'
            {
             before(grammarAccess.getInputsAccess().getTheKeyword_0_0_2_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUseCase.g:2805:1: rule__Inputs__Group_0_0_2__2 : rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3 ;
    public final void rule__Inputs__Group_0_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2809:1: ( rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3 )
            // InternalUseCase.g:2810:2: rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3
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
    // InternalUseCase.g:2817:1: rule__Inputs__Group_0_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Inputs__Group_0_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2821:1: ( ( 'following' ) )
            // InternalUseCase.g:2822:1: ( 'following' )
            {
            // InternalUseCase.g:2822:1: ( 'following' )
            // InternalUseCase.g:2823:2: 'following'
            {
             before(grammarAccess.getInputsAccess().getFollowingKeyword_0_0_2_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalUseCase.g:2832:1: rule__Inputs__Group_0_0_2__3 : rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4 ;
    public final void rule__Inputs__Group_0_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2836:1: ( rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4 )
            // InternalUseCase.g:2837:2: rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4
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
    // InternalUseCase.g:2844:1: rule__Inputs__Group_0_0_2__3__Impl : ( 'input' ) ;
    public final void rule__Inputs__Group_0_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2848:1: ( ( 'input' ) )
            // InternalUseCase.g:2849:1: ( 'input' )
            {
            // InternalUseCase.g:2849:1: ( 'input' )
            // InternalUseCase.g:2850:2: 'input'
            {
             before(grammarAccess.getInputsAccess().getInputKeyword_0_0_2_3()); 
            match(input,58,FOLLOW_2); 
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
    // InternalUseCase.g:2859:1: rule__Inputs__Group_0_0_2__4 : rule__Inputs__Group_0_0_2__4__Impl ;
    public final void rule__Inputs__Group_0_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2863:1: ( rule__Inputs__Group_0_0_2__4__Impl )
            // InternalUseCase.g:2864:2: rule__Inputs__Group_0_0_2__4__Impl
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
    // InternalUseCase.g:2870:1: rule__Inputs__Group_0_0_2__4__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2874:1: ( ( ':' ) )
            // InternalUseCase.g:2875:1: ( ':' )
            {
            // InternalUseCase.g:2875:1: ( ':' )
            // InternalUseCase.g:2876:2: ':'
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
    // InternalUseCase.g:2886:1: rule__Inputs__Group_0_1__0 : rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1 ;
    public final void rule__Inputs__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2890:1: ( rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1 )
            // InternalUseCase.g:2891:2: rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1
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
    // InternalUseCase.g:2898:1: rule__Inputs__Group_0_1__0__Impl : ( 'Ben\\u00F6tigte' ) ;
    public final void rule__Inputs__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2902:1: ( ( 'Ben\\u00F6tigte' ) )
            // InternalUseCase.g:2903:1: ( 'Ben\\u00F6tigte' )
            {
            // InternalUseCase.g:2903:1: ( 'Ben\\u00F6tigte' )
            // InternalUseCase.g:2904:2: 'Ben\\u00F6tigte'
            {
             before(grammarAccess.getInputsAccess().getBenötigteKeyword_0_1_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalUseCase.g:2913:1: rule__Inputs__Group_0_1__1 : rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2 ;
    public final void rule__Inputs__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2917:1: ( rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2 )
            // InternalUseCase.g:2918:2: rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2
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
    // InternalUseCase.g:2925:1: rule__Inputs__Group_0_1__1__Impl : ( 'Zutaten' ) ;
    public final void rule__Inputs__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2929:1: ( ( 'Zutaten' ) )
            // InternalUseCase.g:2930:1: ( 'Zutaten' )
            {
            // InternalUseCase.g:2930:1: ( 'Zutaten' )
            // InternalUseCase.g:2931:2: 'Zutaten'
            {
             before(grammarAccess.getInputsAccess().getZutatenKeyword_0_1_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalUseCase.g:2940:1: rule__Inputs__Group_0_1__2 : rule__Inputs__Group_0_1__2__Impl ;
    public final void rule__Inputs__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2944:1: ( rule__Inputs__Group_0_1__2__Impl )
            // InternalUseCase.g:2945:2: rule__Inputs__Group_0_1__2__Impl
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
    // InternalUseCase.g:2951:1: rule__Inputs__Group_0_1__2__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2955:1: ( ( ':' ) )
            // InternalUseCase.g:2956:1: ( ':' )
            {
            // InternalUseCase.g:2956:1: ( ':' )
            // InternalUseCase.g:2957:2: ':'
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
    // InternalUseCase.g:2967:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2971:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalUseCase.g:2972:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalUseCase.g:2979:1: rule__Input__Group__0__Impl : ( ( rule__Input__ManyAssignment_0 )? ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2983:1: ( ( ( rule__Input__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2984:1: ( ( rule__Input__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2984:1: ( ( rule__Input__ManyAssignment_0 )? )
            // InternalUseCase.g:2985:2: ( rule__Input__ManyAssignment_0 )?
            {
             before(grammarAccess.getInputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2986:2: ( rule__Input__ManyAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==81) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUseCase.g:2986:3: rule__Input__ManyAssignment_0
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
    // InternalUseCase.g:2994:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2998:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalUseCase.g:2999:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalUseCase.g:3006:1: rule__Input__Group__1__Impl : ( '-' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3010:1: ( ( '-' ) )
            // InternalUseCase.g:3011:1: ( '-' )
            {
            // InternalUseCase.g:3011:1: ( '-' )
            // InternalUseCase.g:3012:2: '-'
            {
             before(grammarAccess.getInputAccess().getHyphenMinusKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUseCase.g:3021:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3025:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalUseCase.g:3026:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalUseCase.g:3033:1: rule__Input__Group__2__Impl : ( ( rule__Input__OptionalAssignment_2 )? ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3037:1: ( ( ( rule__Input__OptionalAssignment_2 )? ) )
            // InternalUseCase.g:3038:1: ( ( rule__Input__OptionalAssignment_2 )? )
            {
            // InternalUseCase.g:3038:1: ( ( rule__Input__OptionalAssignment_2 )? )
            // InternalUseCase.g:3039:2: ( rule__Input__OptionalAssignment_2 )?
            {
             before(grammarAccess.getInputAccess().getOptionalAssignment_2()); 
            // InternalUseCase.g:3040:2: ( rule__Input__OptionalAssignment_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==11) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUseCase.g:3040:3: rule__Input__OptionalAssignment_2
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
    // InternalUseCase.g:3048:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3052:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalUseCase.g:3053:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalUseCase.g:3060:1: rule__Input__Group__3__Impl : ( ( rule__Input__ContentAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3064:1: ( ( ( rule__Input__ContentAssignment_3 ) ) )
            // InternalUseCase.g:3065:1: ( ( rule__Input__ContentAssignment_3 ) )
            {
            // InternalUseCase.g:3065:1: ( ( rule__Input__ContentAssignment_3 ) )
            // InternalUseCase.g:3066:2: ( rule__Input__ContentAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getContentAssignment_3()); 
            // InternalUseCase.g:3067:2: ( rule__Input__ContentAssignment_3 )
            // InternalUseCase.g:3067:3: rule__Input__ContentAssignment_3
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
    // InternalUseCase.g:3075:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3079:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // InternalUseCase.g:3080:2: rule__Input__Group__4__Impl rule__Input__Group__5
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
    // InternalUseCase.g:3087:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3091:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalUseCase.g:3092:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalUseCase.g:3092:1: ( ( rule__Input__Group_4__0 )? )
            // InternalUseCase.g:3093:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalUseCase.g:3094:2: ( rule__Input__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=24 && LA46_0<=25)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUseCase.g:3094:3: rule__Input__Group_4__0
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
    // InternalUseCase.g:3102:1: rule__Input__Group__5 : rule__Input__Group__5__Impl ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3106:1: ( rule__Input__Group__5__Impl )
            // InternalUseCase.g:3107:2: rule__Input__Group__5__Impl
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
    // InternalUseCase.g:3113:1: rule__Input__Group__5__Impl : ( ( rule__Input__Group_5__0 )? ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3117:1: ( ( ( rule__Input__Group_5__0 )? ) )
            // InternalUseCase.g:3118:1: ( ( rule__Input__Group_5__0 )? )
            {
            // InternalUseCase.g:3118:1: ( ( rule__Input__Group_5__0 )? )
            // InternalUseCase.g:3119:2: ( rule__Input__Group_5__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_5()); 
            // InternalUseCase.g:3120:2: ( rule__Input__Group_5__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==61) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUseCase.g:3120:3: rule__Input__Group_5__0
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
    // InternalUseCase.g:3129:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3133:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalUseCase.g:3134:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
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
    // InternalUseCase.g:3141:1: rule__Input__Group_4__0__Impl : ( ( rule__Input__Alternatives_4_0 ) ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3145:1: ( ( ( rule__Input__Alternatives_4_0 ) ) )
            // InternalUseCase.g:3146:1: ( ( rule__Input__Alternatives_4_0 ) )
            {
            // InternalUseCase.g:3146:1: ( ( rule__Input__Alternatives_4_0 ) )
            // InternalUseCase.g:3147:2: ( rule__Input__Alternatives_4_0 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_4_0()); 
            // InternalUseCase.g:3148:2: ( rule__Input__Alternatives_4_0 )
            // InternalUseCase.g:3148:3: rule__Input__Alternatives_4_0
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
    // InternalUseCase.g:3156:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3160:1: ( rule__Input__Group_4__1__Impl )
            // InternalUseCase.g:3161:2: rule__Input__Group_4__1__Impl
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
    // InternalUseCase.g:3167:1: rule__Input__Group_4__1__Impl : ( ( rule__Input__TypeAssignment_4_1 ) ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3171:1: ( ( ( rule__Input__TypeAssignment_4_1 ) ) )
            // InternalUseCase.g:3172:1: ( ( rule__Input__TypeAssignment_4_1 ) )
            {
            // InternalUseCase.g:3172:1: ( ( rule__Input__TypeAssignment_4_1 ) )
            // InternalUseCase.g:3173:2: ( rule__Input__TypeAssignment_4_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_4_1()); 
            // InternalUseCase.g:3174:2: ( rule__Input__TypeAssignment_4_1 )
            // InternalUseCase.g:3174:3: rule__Input__TypeAssignment_4_1
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
    // InternalUseCase.g:3183:1: rule__Input__Group_5__0 : rule__Input__Group_5__0__Impl rule__Input__Group_5__1 ;
    public final void rule__Input__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3187:1: ( rule__Input__Group_5__0__Impl rule__Input__Group_5__1 )
            // InternalUseCase.g:3188:2: rule__Input__Group_5__0__Impl rule__Input__Group_5__1
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
    // InternalUseCase.g:3195:1: rule__Input__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Input__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3199:1: ( ( '(' ) )
            // InternalUseCase.g:3200:1: ( '(' )
            {
            // InternalUseCase.g:3200:1: ( '(' )
            // InternalUseCase.g:3201:2: '('
            {
             before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalUseCase.g:3210:1: rule__Input__Group_5__1 : rule__Input__Group_5__1__Impl rule__Input__Group_5__2 ;
    public final void rule__Input__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3214:1: ( rule__Input__Group_5__1__Impl rule__Input__Group_5__2 )
            // InternalUseCase.g:3215:2: rule__Input__Group_5__1__Impl rule__Input__Group_5__2
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
    // InternalUseCase.g:3222:1: rule__Input__Group_5__1__Impl : ( ( rule__Input__Alternatives_5_1 ) ) ;
    public final void rule__Input__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3226:1: ( ( ( rule__Input__Alternatives_5_1 ) ) )
            // InternalUseCase.g:3227:1: ( ( rule__Input__Alternatives_5_1 ) )
            {
            // InternalUseCase.g:3227:1: ( ( rule__Input__Alternatives_5_1 ) )
            // InternalUseCase.g:3228:2: ( rule__Input__Alternatives_5_1 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_5_1()); 
            // InternalUseCase.g:3229:2: ( rule__Input__Alternatives_5_1 )
            // InternalUseCase.g:3229:3: rule__Input__Alternatives_5_1
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
    // InternalUseCase.g:3237:1: rule__Input__Group_5__2 : rule__Input__Group_5__2__Impl rule__Input__Group_5__3 ;
    public final void rule__Input__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3241:1: ( rule__Input__Group_5__2__Impl rule__Input__Group_5__3 )
            // InternalUseCase.g:3242:2: rule__Input__Group_5__2__Impl rule__Input__Group_5__3
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
    // InternalUseCase.g:3249:1: rule__Input__Group_5__2__Impl : ( ( rule__Input__ExampleAssignment_5_2 ) ) ;
    public final void rule__Input__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3253:1: ( ( ( rule__Input__ExampleAssignment_5_2 ) ) )
            // InternalUseCase.g:3254:1: ( ( rule__Input__ExampleAssignment_5_2 ) )
            {
            // InternalUseCase.g:3254:1: ( ( rule__Input__ExampleAssignment_5_2 ) )
            // InternalUseCase.g:3255:2: ( rule__Input__ExampleAssignment_5_2 )
            {
             before(grammarAccess.getInputAccess().getExampleAssignment_5_2()); 
            // InternalUseCase.g:3256:2: ( rule__Input__ExampleAssignment_5_2 )
            // InternalUseCase.g:3256:3: rule__Input__ExampleAssignment_5_2
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
    // InternalUseCase.g:3264:1: rule__Input__Group_5__3 : rule__Input__Group_5__3__Impl ;
    public final void rule__Input__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3268:1: ( rule__Input__Group_5__3__Impl )
            // InternalUseCase.g:3269:2: rule__Input__Group_5__3__Impl
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
    // InternalUseCase.g:3275:1: rule__Input__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Input__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3279:1: ( ( ')' ) )
            // InternalUseCase.g:3280:1: ( ')' )
            {
            // InternalUseCase.g:3280:1: ( ')' )
            // InternalUseCase.g:3281:2: ')'
            {
             before(grammarAccess.getInputAccess().getRightParenthesisKeyword_5_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalUseCase.g:3291:1: rule__Outputs__Group__0 : rule__Outputs__Group__0__Impl rule__Outputs__Group__1 ;
    public final void rule__Outputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3295:1: ( rule__Outputs__Group__0__Impl rule__Outputs__Group__1 )
            // InternalUseCase.g:3296:2: rule__Outputs__Group__0__Impl rule__Outputs__Group__1
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
    // InternalUseCase.g:3303:1: rule__Outputs__Group__0__Impl : ( ( rule__Outputs__Alternatives_0 ) ) ;
    public final void rule__Outputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3307:1: ( ( ( rule__Outputs__Alternatives_0 ) ) )
            // InternalUseCase.g:3308:1: ( ( rule__Outputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:3308:1: ( ( rule__Outputs__Alternatives_0 ) )
            // InternalUseCase.g:3309:2: ( rule__Outputs__Alternatives_0 )
            {
             before(grammarAccess.getOutputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3310:2: ( rule__Outputs__Alternatives_0 )
            // InternalUseCase.g:3310:3: rule__Outputs__Alternatives_0
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
    // InternalUseCase.g:3318:1: rule__Outputs__Group__1 : rule__Outputs__Group__1__Impl ;
    public final void rule__Outputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3322:1: ( rule__Outputs__Group__1__Impl )
            // InternalUseCase.g:3323:2: rule__Outputs__Group__1__Impl
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
    // InternalUseCase.g:3329:1: rule__Outputs__Group__1__Impl : ( ( rule__Outputs__OutputsAssignment_1 )* ) ;
    public final void rule__Outputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3333:1: ( ( ( rule__Outputs__OutputsAssignment_1 )* ) )
            // InternalUseCase.g:3334:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            {
            // InternalUseCase.g:3334:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            // InternalUseCase.g:3335:2: ( rule__Outputs__OutputsAssignment_1 )*
            {
             before(grammarAccess.getOutputsAccess().getOutputsAssignment_1()); 
            // InternalUseCase.g:3336:2: ( rule__Outputs__OutputsAssignment_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==54||LA48_0==81) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUseCase.g:3336:3: rule__Outputs__OutputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Outputs__OutputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalUseCase.g:3345:1: rule__Outputs__Group_0_0_2__0 : rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1 ;
    public final void rule__Outputs__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3349:1: ( rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1 )
            // InternalUseCase.g:3350:2: rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1
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
    // InternalUseCase.g:3357:1: rule__Outputs__Group_0_0_2__0__Impl : ( 'produces' ) ;
    public final void rule__Outputs__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3361:1: ( ( 'produces' ) )
            // InternalUseCase.g:3362:1: ( 'produces' )
            {
            // InternalUseCase.g:3362:1: ( 'produces' )
            // InternalUseCase.g:3363:2: 'produces'
            {
             before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_2_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalUseCase.g:3372:1: rule__Outputs__Group_0_0_2__1 : rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2 ;
    public final void rule__Outputs__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3376:1: ( rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2 )
            // InternalUseCase.g:3377:2: rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2
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
    // InternalUseCase.g:3384:1: rule__Outputs__Group_0_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Outputs__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3388:1: ( ( 'the' ) )
            // InternalUseCase.g:3389:1: ( 'the' )
            {
            // InternalUseCase.g:3389:1: ( 'the' )
            // InternalUseCase.g:3390:2: 'the'
            {
             before(grammarAccess.getOutputsAccess().getTheKeyword_0_0_2_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUseCase.g:3399:1: rule__Outputs__Group_0_0_2__2 : rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3 ;
    public final void rule__Outputs__Group_0_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3403:1: ( rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3 )
            // InternalUseCase.g:3404:2: rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3
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
    // InternalUseCase.g:3411:1: rule__Outputs__Group_0_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Outputs__Group_0_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3415:1: ( ( 'following' ) )
            // InternalUseCase.g:3416:1: ( 'following' )
            {
            // InternalUseCase.g:3416:1: ( 'following' )
            // InternalUseCase.g:3417:2: 'following'
            {
             before(grammarAccess.getOutputsAccess().getFollowingKeyword_0_0_2_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalUseCase.g:3426:1: rule__Outputs__Group_0_0_2__3 : rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4 ;
    public final void rule__Outputs__Group_0_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3430:1: ( rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4 )
            // InternalUseCase.g:3431:2: rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4
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
    // InternalUseCase.g:3438:1: rule__Outputs__Group_0_0_2__3__Impl : ( 'output' ) ;
    public final void rule__Outputs__Group_0_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3442:1: ( ( 'output' ) )
            // InternalUseCase.g:3443:1: ( 'output' )
            {
            // InternalUseCase.g:3443:1: ( 'output' )
            // InternalUseCase.g:3444:2: 'output'
            {
             before(grammarAccess.getOutputsAccess().getOutputKeyword_0_0_2_3()); 
            match(input,64,FOLLOW_2); 
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
    // InternalUseCase.g:3453:1: rule__Outputs__Group_0_0_2__4 : rule__Outputs__Group_0_0_2__4__Impl ;
    public final void rule__Outputs__Group_0_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3457:1: ( rule__Outputs__Group_0_0_2__4__Impl )
            // InternalUseCase.g:3458:2: rule__Outputs__Group_0_0_2__4__Impl
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
    // InternalUseCase.g:3464:1: rule__Outputs__Group_0_0_2__4__Impl : ( ':' ) ;
    public final void rule__Outputs__Group_0_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3468:1: ( ( ':' ) )
            // InternalUseCase.g:3469:1: ( ':' )
            {
            // InternalUseCase.g:3469:1: ( ':' )
            // InternalUseCase.g:3470:2: ':'
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
    // InternalUseCase.g:3480:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3484:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalUseCase.g:3485:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalUseCase.g:3492:1: rule__Output__Group__0__Impl : ( ( rule__Output__ManyAssignment_0 )? ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3496:1: ( ( ( rule__Output__ManyAssignment_0 )? ) )
            // InternalUseCase.g:3497:1: ( ( rule__Output__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:3497:1: ( ( rule__Output__ManyAssignment_0 )? )
            // InternalUseCase.g:3498:2: ( rule__Output__ManyAssignment_0 )?
            {
             before(grammarAccess.getOutputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:3499:2: ( rule__Output__ManyAssignment_0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==81) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUseCase.g:3499:3: rule__Output__ManyAssignment_0
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
    // InternalUseCase.g:3507:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3511:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalUseCase.g:3512:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalUseCase.g:3519:1: rule__Output__Group__1__Impl : ( '-' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3523:1: ( ( '-' ) )
            // InternalUseCase.g:3524:1: ( '-' )
            {
            // InternalUseCase.g:3524:1: ( '-' )
            // InternalUseCase.g:3525:2: '-'
            {
             before(grammarAccess.getOutputAccess().getHyphenMinusKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUseCase.g:3534:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3538:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalUseCase.g:3539:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalUseCase.g:3546:1: rule__Output__Group__2__Impl : ( ( rule__Output__ContentAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3550:1: ( ( ( rule__Output__ContentAssignment_2 ) ) )
            // InternalUseCase.g:3551:1: ( ( rule__Output__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:3551:1: ( ( rule__Output__ContentAssignment_2 ) )
            // InternalUseCase.g:3552:2: ( rule__Output__ContentAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:3553:2: ( rule__Output__ContentAssignment_2 )
            // InternalUseCase.g:3553:3: rule__Output__ContentAssignment_2
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
    // InternalUseCase.g:3561:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3565:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalUseCase.g:3566:2: rule__Output__Group__3__Impl rule__Output__Group__4
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
    // InternalUseCase.g:3573:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3577:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalUseCase.g:3578:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalUseCase.g:3578:1: ( ( rule__Output__Group_3__0 )? )
            // InternalUseCase.g:3579:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalUseCase.g:3580:2: ( rule__Output__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=24 && LA50_0<=25)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUseCase.g:3580:3: rule__Output__Group_3__0
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
    // InternalUseCase.g:3588:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3592:1: ( rule__Output__Group__4__Impl )
            // InternalUseCase.g:3593:2: rule__Output__Group__4__Impl
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
    // InternalUseCase.g:3599:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3603:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalUseCase.g:3604:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalUseCase.g:3604:1: ( ( rule__Output__Group_4__0 )? )
            // InternalUseCase.g:3605:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalUseCase.g:3606:2: ( rule__Output__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==61) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUseCase.g:3606:3: rule__Output__Group_4__0
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
    // InternalUseCase.g:3615:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3619:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalUseCase.g:3620:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
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
    // InternalUseCase.g:3627:1: rule__Output__Group_3__0__Impl : ( ( rule__Output__Alternatives_3_0 ) ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3631:1: ( ( ( rule__Output__Alternatives_3_0 ) ) )
            // InternalUseCase.g:3632:1: ( ( rule__Output__Alternatives_3_0 ) )
            {
            // InternalUseCase.g:3632:1: ( ( rule__Output__Alternatives_3_0 ) )
            // InternalUseCase.g:3633:2: ( rule__Output__Alternatives_3_0 )
            {
             before(grammarAccess.getOutputAccess().getAlternatives_3_0()); 
            // InternalUseCase.g:3634:2: ( rule__Output__Alternatives_3_0 )
            // InternalUseCase.g:3634:3: rule__Output__Alternatives_3_0
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
    // InternalUseCase.g:3642:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3646:1: ( rule__Output__Group_3__1__Impl )
            // InternalUseCase.g:3647:2: rule__Output__Group_3__1__Impl
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
    // InternalUseCase.g:3653:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3657:1: ( ( ( rule__Output__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:3658:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:3658:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            // InternalUseCase.g:3659:2: ( rule__Output__TypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:3660:2: ( rule__Output__TypeAssignment_3_1 )
            // InternalUseCase.g:3660:3: rule__Output__TypeAssignment_3_1
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
    // InternalUseCase.g:3669:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3673:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalUseCase.g:3674:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
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
    // InternalUseCase.g:3681:1: rule__Output__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3685:1: ( ( '(' ) )
            // InternalUseCase.g:3686:1: ( '(' )
            {
            // InternalUseCase.g:3686:1: ( '(' )
            // InternalUseCase.g:3687:2: '('
            {
             before(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalUseCase.g:3696:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl rule__Output__Group_4__2 ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3700:1: ( rule__Output__Group_4__1__Impl rule__Output__Group_4__2 )
            // InternalUseCase.g:3701:2: rule__Output__Group_4__1__Impl rule__Output__Group_4__2
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
    // InternalUseCase.g:3708:1: rule__Output__Group_4__1__Impl : ( ( rule__Output__Alternatives_4_1 ) ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3712:1: ( ( ( rule__Output__Alternatives_4_1 ) ) )
            // InternalUseCase.g:3713:1: ( ( rule__Output__Alternatives_4_1 ) )
            {
            // InternalUseCase.g:3713:1: ( ( rule__Output__Alternatives_4_1 ) )
            // InternalUseCase.g:3714:2: ( rule__Output__Alternatives_4_1 )
            {
             before(grammarAccess.getOutputAccess().getAlternatives_4_1()); 
            // InternalUseCase.g:3715:2: ( rule__Output__Alternatives_4_1 )
            // InternalUseCase.g:3715:3: rule__Output__Alternatives_4_1
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
    // InternalUseCase.g:3723:1: rule__Output__Group_4__2 : rule__Output__Group_4__2__Impl rule__Output__Group_4__3 ;
    public final void rule__Output__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3727:1: ( rule__Output__Group_4__2__Impl rule__Output__Group_4__3 )
            // InternalUseCase.g:3728:2: rule__Output__Group_4__2__Impl rule__Output__Group_4__3
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
    // InternalUseCase.g:3735:1: rule__Output__Group_4__2__Impl : ( ( rule__Output__ExampleAssignment_4_2 ) ) ;
    public final void rule__Output__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3739:1: ( ( ( rule__Output__ExampleAssignment_4_2 ) ) )
            // InternalUseCase.g:3740:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            {
            // InternalUseCase.g:3740:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            // InternalUseCase.g:3741:2: ( rule__Output__ExampleAssignment_4_2 )
            {
             before(grammarAccess.getOutputAccess().getExampleAssignment_4_2()); 
            // InternalUseCase.g:3742:2: ( rule__Output__ExampleAssignment_4_2 )
            // InternalUseCase.g:3742:3: rule__Output__ExampleAssignment_4_2
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
    // InternalUseCase.g:3750:1: rule__Output__Group_4__3 : rule__Output__Group_4__3__Impl ;
    public final void rule__Output__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3754:1: ( rule__Output__Group_4__3__Impl )
            // InternalUseCase.g:3755:2: rule__Output__Group_4__3__Impl
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
    // InternalUseCase.g:3761:1: rule__Output__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Output__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3765:1: ( ( ')' ) )
            // InternalUseCase.g:3766:1: ( ')' )
            {
            // InternalUseCase.g:3766:1: ( ')' )
            // InternalUseCase.g:3767:2: ')'
            {
             before(grammarAccess.getOutputAccess().getRightParenthesisKeyword_4_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalUseCase.g:3777:1: rule__PreConditions__Group__0 : rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 ;
    public final void rule__PreConditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3781:1: ( rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 )
            // InternalUseCase.g:3782:2: rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1
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
    // InternalUseCase.g:3789:1: rule__PreConditions__Group__0__Impl : ( ( rule__PreConditions__Alternatives_0 ) ) ;
    public final void rule__PreConditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3793:1: ( ( ( rule__PreConditions__Alternatives_0 ) ) )
            // InternalUseCase.g:3794:1: ( ( rule__PreConditions__Alternatives_0 ) )
            {
            // InternalUseCase.g:3794:1: ( ( rule__PreConditions__Alternatives_0 ) )
            // InternalUseCase.g:3795:2: ( rule__PreConditions__Alternatives_0 )
            {
             before(grammarAccess.getPreConditionsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3796:2: ( rule__PreConditions__Alternatives_0 )
            // InternalUseCase.g:3796:3: rule__PreConditions__Alternatives_0
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
    // InternalUseCase.g:3804:1: rule__PreConditions__Group__1 : rule__PreConditions__Group__1__Impl ;
    public final void rule__PreConditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3808:1: ( rule__PreConditions__Group__1__Impl )
            // InternalUseCase.g:3809:2: rule__PreConditions__Group__1__Impl
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
    // InternalUseCase.g:3815:1: rule__PreConditions__Group__1__Impl : ( ( rule__PreConditions__ConditionsAssignment_1 )* ) ;
    public final void rule__PreConditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3819:1: ( ( ( rule__PreConditions__ConditionsAssignment_1 )* ) )
            // InternalUseCase.g:3820:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            {
            // InternalUseCase.g:3820:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            // InternalUseCase.g:3821:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            {
             before(grammarAccess.getPreConditionsAccess().getConditionsAssignment_1()); 
            // InternalUseCase.g:3822:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==54) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUseCase.g:3822:3: rule__PreConditions__ConditionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__PreConditions__ConditionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalUseCase.g:3831:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3835:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalUseCase.g:3836:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalUseCase.g:3843:1: rule__Condition__Group__0__Impl : ( '-' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3847:1: ( ( '-' ) )
            // InternalUseCase.g:3848:1: ( '-' )
            {
            // InternalUseCase.g:3848:1: ( '-' )
            // InternalUseCase.g:3849:2: '-'
            {
             before(grammarAccess.getConditionAccess().getHyphenMinusKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUseCase.g:3858:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3862:1: ( rule__Condition__Group__1__Impl )
            // InternalUseCase.g:3863:2: rule__Condition__Group__1__Impl
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
    // InternalUseCase.g:3869:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ContentAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3873:1: ( ( ( rule__Condition__ContentAssignment_1 ) ) )
            // InternalUseCase.g:3874:1: ( ( rule__Condition__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:3874:1: ( ( rule__Condition__ContentAssignment_1 ) )
            // InternalUseCase.g:3875:2: ( rule__Condition__ContentAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getContentAssignment_1()); 
            // InternalUseCase.g:3876:2: ( rule__Condition__ContentAssignment_1 )
            // InternalUseCase.g:3876:3: rule__Condition__ContentAssignment_1
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
    // InternalUseCase.g:3885:1: rule__Steps__Group__0 : rule__Steps__Group__0__Impl rule__Steps__Group__1 ;
    public final void rule__Steps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3889:1: ( rule__Steps__Group__0__Impl rule__Steps__Group__1 )
            // InternalUseCase.g:3890:2: rule__Steps__Group__0__Impl rule__Steps__Group__1
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
    // InternalUseCase.g:3897:1: rule__Steps__Group__0__Impl : ( ( rule__Steps__Alternatives_0 ) ) ;
    public final void rule__Steps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3901:1: ( ( ( rule__Steps__Alternatives_0 ) ) )
            // InternalUseCase.g:3902:1: ( ( rule__Steps__Alternatives_0 ) )
            {
            // InternalUseCase.g:3902:1: ( ( rule__Steps__Alternatives_0 ) )
            // InternalUseCase.g:3903:2: ( rule__Steps__Alternatives_0 )
            {
             before(grammarAccess.getStepsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3904:2: ( rule__Steps__Alternatives_0 )
            // InternalUseCase.g:3904:3: rule__Steps__Alternatives_0
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
    // InternalUseCase.g:3912:1: rule__Steps__Group__1 : rule__Steps__Group__1__Impl ;
    public final void rule__Steps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3916:1: ( rule__Steps__Group__1__Impl )
            // InternalUseCase.g:3917:2: rule__Steps__Group__1__Impl
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
    // InternalUseCase.g:3923:1: rule__Steps__Group__1__Impl : ( ( rule__Steps__StepsAssignment_1 )* ) ;
    public final void rule__Steps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3927:1: ( ( ( rule__Steps__StepsAssignment_1 )* ) )
            // InternalUseCase.g:3928:1: ( ( rule__Steps__StepsAssignment_1 )* )
            {
            // InternalUseCase.g:3928:1: ( ( rule__Steps__StepsAssignment_1 )* )
            // InternalUseCase.g:3929:2: ( rule__Steps__StepsAssignment_1 )*
            {
             before(grammarAccess.getStepsAccess().getStepsAssignment_1()); 
            // InternalUseCase.g:3930:2: ( rule__Steps__StepsAssignment_1 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_INT) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalUseCase.g:3930:3: rule__Steps__StepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Steps__StepsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalUseCase.g:3939:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3943:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalUseCase.g:3944:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalUseCase.g:3951:1: rule__Step__Group__0__Impl : ( ( rule__Step__NumberAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3955:1: ( ( ( rule__Step__NumberAssignment_0 ) ) )
            // InternalUseCase.g:3956:1: ( ( rule__Step__NumberAssignment_0 ) )
            {
            // InternalUseCase.g:3956:1: ( ( rule__Step__NumberAssignment_0 ) )
            // InternalUseCase.g:3957:2: ( rule__Step__NumberAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getNumberAssignment_0()); 
            // InternalUseCase.g:3958:2: ( rule__Step__NumberAssignment_0 )
            // InternalUseCase.g:3958:3: rule__Step__NumberAssignment_0
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
    // InternalUseCase.g:3966:1: rule__Step__Group__1 : rule__Step__Group__1__Impl ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3970:1: ( rule__Step__Group__1__Impl )
            // InternalUseCase.g:3971:2: rule__Step__Group__1__Impl
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
    // InternalUseCase.g:3977:1: rule__Step__Group__1__Impl : ( ( rule__Step__Alternatives_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3981:1: ( ( ( rule__Step__Alternatives_1 ) ) )
            // InternalUseCase.g:3982:1: ( ( rule__Step__Alternatives_1 ) )
            {
            // InternalUseCase.g:3982:1: ( ( rule__Step__Alternatives_1 ) )
            // InternalUseCase.g:3983:2: ( rule__Step__Alternatives_1 )
            {
             before(grammarAccess.getStepAccess().getAlternatives_1()); 
            // InternalUseCase.g:3984:2: ( rule__Step__Alternatives_1 )
            // InternalUseCase.g:3984:3: rule__Step__Alternatives_1
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
    // InternalUseCase.g:3993:1: rule__Step__Group_1_0__0 : rule__Step__Group_1_0__0__Impl rule__Step__Group_1_0__1 ;
    public final void rule__Step__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3997:1: ( rule__Step__Group_1_0__0__Impl rule__Step__Group_1_0__1 )
            // InternalUseCase.g:3998:2: rule__Step__Group_1_0__0__Impl rule__Step__Group_1_0__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalUseCase.g:4005:1: rule__Step__Group_1_0__0__Impl : ( ( rule__Step__ActionAssignment_1_0_0 ) ) ;
    public final void rule__Step__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4009:1: ( ( ( rule__Step__ActionAssignment_1_0_0 ) ) )
            // InternalUseCase.g:4010:1: ( ( rule__Step__ActionAssignment_1_0_0 ) )
            {
            // InternalUseCase.g:4010:1: ( ( rule__Step__ActionAssignment_1_0_0 ) )
            // InternalUseCase.g:4011:2: ( rule__Step__ActionAssignment_1_0_0 )
            {
             before(grammarAccess.getStepAccess().getActionAssignment_1_0_0()); 
            // InternalUseCase.g:4012:2: ( rule__Step__ActionAssignment_1_0_0 )
            // InternalUseCase.g:4012:3: rule__Step__ActionAssignment_1_0_0
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
    // InternalUseCase.g:4020:1: rule__Step__Group_1_0__1 : rule__Step__Group_1_0__1__Impl ;
    public final void rule__Step__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4024:1: ( rule__Step__Group_1_0__1__Impl )
            // InternalUseCase.g:4025:2: rule__Step__Group_1_0__1__Impl
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
    // InternalUseCase.g:4031:1: rule__Step__Group_1_0__1__Impl : ( ( rule__Step__ErrorAssignment_1_0_1 )? ) ;
    public final void rule__Step__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4035:1: ( ( ( rule__Step__ErrorAssignment_1_0_1 )? ) )
            // InternalUseCase.g:4036:1: ( ( rule__Step__ErrorAssignment_1_0_1 )? )
            {
            // InternalUseCase.g:4036:1: ( ( rule__Step__ErrorAssignment_1_0_1 )? )
            // InternalUseCase.g:4037:2: ( rule__Step__ErrorAssignment_1_0_1 )?
            {
             before(grammarAccess.getStepAccess().getErrorAssignment_1_0_1()); 
            // InternalUseCase.g:4038:2: ( rule__Step__ErrorAssignment_1_0_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=36 && LA54_0<=37)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUseCase.g:4038:3: rule__Step__ErrorAssignment_1_0_1
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
    // InternalUseCase.g:4047:1: rule__RaiseErrorConditional__Group__0 : rule__RaiseErrorConditional__Group__0__Impl rule__RaiseErrorConditional__Group__1 ;
    public final void rule__RaiseErrorConditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4051:1: ( rule__RaiseErrorConditional__Group__0__Impl rule__RaiseErrorConditional__Group__1 )
            // InternalUseCase.g:4052:2: rule__RaiseErrorConditional__Group__0__Impl rule__RaiseErrorConditional__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalUseCase.g:4059:1: rule__RaiseErrorConditional__Group__0__Impl : ( ( rule__RaiseErrorConditional__Alternatives_0 ) ) ;
    public final void rule__RaiseErrorConditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4063:1: ( ( ( rule__RaiseErrorConditional__Alternatives_0 ) ) )
            // InternalUseCase.g:4064:1: ( ( rule__RaiseErrorConditional__Alternatives_0 ) )
            {
            // InternalUseCase.g:4064:1: ( ( rule__RaiseErrorConditional__Alternatives_0 ) )
            // InternalUseCase.g:4065:2: ( rule__RaiseErrorConditional__Alternatives_0 )
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getAlternatives_0()); 
            // InternalUseCase.g:4066:2: ( rule__RaiseErrorConditional__Alternatives_0 )
            // InternalUseCase.g:4066:3: rule__RaiseErrorConditional__Alternatives_0
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
    // InternalUseCase.g:4074:1: rule__RaiseErrorConditional__Group__1 : rule__RaiseErrorConditional__Group__1__Impl rule__RaiseErrorConditional__Group__2 ;
    public final void rule__RaiseErrorConditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4078:1: ( rule__RaiseErrorConditional__Group__1__Impl rule__RaiseErrorConditional__Group__2 )
            // InternalUseCase.g:4079:2: rule__RaiseErrorConditional__Group__1__Impl rule__RaiseErrorConditional__Group__2
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
    // InternalUseCase.g:4086:1: rule__RaiseErrorConditional__Group__1__Impl : ( ( rule__RaiseErrorConditional__Alternatives_1 ) ) ;
    public final void rule__RaiseErrorConditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4090:1: ( ( ( rule__RaiseErrorConditional__Alternatives_1 ) ) )
            // InternalUseCase.g:4091:1: ( ( rule__RaiseErrorConditional__Alternatives_1 ) )
            {
            // InternalUseCase.g:4091:1: ( ( rule__RaiseErrorConditional__Alternatives_1 ) )
            // InternalUseCase.g:4092:2: ( rule__RaiseErrorConditional__Alternatives_1 )
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getAlternatives_1()); 
            // InternalUseCase.g:4093:2: ( rule__RaiseErrorConditional__Alternatives_1 )
            // InternalUseCase.g:4093:3: rule__RaiseErrorConditional__Alternatives_1
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
    // InternalUseCase.g:4101:1: rule__RaiseErrorConditional__Group__2 : rule__RaiseErrorConditional__Group__2__Impl ;
    public final void rule__RaiseErrorConditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4105:1: ( rule__RaiseErrorConditional__Group__2__Impl )
            // InternalUseCase.g:4106:2: rule__RaiseErrorConditional__Group__2__Impl
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
    // InternalUseCase.g:4112:1: rule__RaiseErrorConditional__Group__2__Impl : ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) ) ;
    public final void rule__RaiseErrorConditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4116:1: ( ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) ) )
            // InternalUseCase.g:4117:1: ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) )
            {
            // InternalUseCase.g:4117:1: ( ( rule__RaiseErrorConditional__ExceptionAssignment_2 ) )
            // InternalUseCase.g:4118:2: ( rule__RaiseErrorConditional__ExceptionAssignment_2 )
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getExceptionAssignment_2()); 
            // InternalUseCase.g:4119:2: ( rule__RaiseErrorConditional__ExceptionAssignment_2 )
            // InternalUseCase.g:4119:3: rule__RaiseErrorConditional__ExceptionAssignment_2
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
    // InternalUseCase.g:4128:1: rule__RaiseErrorConditional__Group_1_0__0 : rule__RaiseErrorConditional__Group_1_0__0__Impl rule__RaiseErrorConditional__Group_1_0__1 ;
    public final void rule__RaiseErrorConditional__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4132:1: ( rule__RaiseErrorConditional__Group_1_0__0__Impl rule__RaiseErrorConditional__Group_1_0__1 )
            // InternalUseCase.g:4133:2: rule__RaiseErrorConditional__Group_1_0__0__Impl rule__RaiseErrorConditional__Group_1_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalUseCase.g:4140:1: rule__RaiseErrorConditional__Group_1_0__0__Impl : ( 'On' ) ;
    public final void rule__RaiseErrorConditional__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4144:1: ( ( 'On' ) )
            // InternalUseCase.g:4145:1: ( 'On' )
            {
            // InternalUseCase.g:4145:1: ( 'On' )
            // InternalUseCase.g:4146:2: 'On'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getOnKeyword_1_0_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalUseCase.g:4155:1: rule__RaiseErrorConditional__Group_1_0__1 : rule__RaiseErrorConditional__Group_1_0__1__Impl rule__RaiseErrorConditional__Group_1_0__2 ;
    public final void rule__RaiseErrorConditional__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4159:1: ( rule__RaiseErrorConditional__Group_1_0__1__Impl rule__RaiseErrorConditional__Group_1_0__2 )
            // InternalUseCase.g:4160:2: rule__RaiseErrorConditional__Group_1_0__1__Impl rule__RaiseErrorConditional__Group_1_0__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalUseCase.g:4167:1: rule__RaiseErrorConditional__Group_1_0__1__Impl : ( 'error' ) ;
    public final void rule__RaiseErrorConditional__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4171:1: ( ( 'error' ) )
            // InternalUseCase.g:4172:1: ( 'error' )
            {
            // InternalUseCase.g:4172:1: ( 'error' )
            // InternalUseCase.g:4173:2: 'error'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getErrorKeyword_1_0_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalUseCase.g:4182:1: rule__RaiseErrorConditional__Group_1_0__2 : rule__RaiseErrorConditional__Group_1_0__2__Impl ;
    public final void rule__RaiseErrorConditional__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4186:1: ( rule__RaiseErrorConditional__Group_1_0__2__Impl )
            // InternalUseCase.g:4187:2: rule__RaiseErrorConditional__Group_1_0__2__Impl
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
    // InternalUseCase.g:4193:1: rule__RaiseErrorConditional__Group_1_0__2__Impl : ( 'raise' ) ;
    public final void rule__RaiseErrorConditional__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4197:1: ( ( 'raise' ) )
            // InternalUseCase.g:4198:1: ( 'raise' )
            {
            // InternalUseCase.g:4198:1: ( 'raise' )
            // InternalUseCase.g:4199:2: 'raise'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getRaiseKeyword_1_0_2()); 
            match(input,67,FOLLOW_2); 
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
    // InternalUseCase.g:4209:1: rule__RaiseErrorConditional__Group_1_1__0 : rule__RaiseErrorConditional__Group_1_1__0__Impl rule__RaiseErrorConditional__Group_1_1__1 ;
    public final void rule__RaiseErrorConditional__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4213:1: ( rule__RaiseErrorConditional__Group_1_1__0__Impl rule__RaiseErrorConditional__Group_1_1__1 )
            // InternalUseCase.g:4214:2: rule__RaiseErrorConditional__Group_1_1__0__Impl rule__RaiseErrorConditional__Group_1_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalUseCase.g:4221:1: rule__RaiseErrorConditional__Group_1_1__0__Impl : ( 'Bei' ) ;
    public final void rule__RaiseErrorConditional__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4225:1: ( ( 'Bei' ) )
            // InternalUseCase.g:4226:1: ( 'Bei' )
            {
            // InternalUseCase.g:4226:1: ( 'Bei' )
            // InternalUseCase.g:4227:2: 'Bei'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getBeiKeyword_1_1_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalUseCase.g:4236:1: rule__RaiseErrorConditional__Group_1_1__1 : rule__RaiseErrorConditional__Group_1_1__1__Impl rule__RaiseErrorConditional__Group_1_1__2 ;
    public final void rule__RaiseErrorConditional__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4240:1: ( rule__RaiseErrorConditional__Group_1_1__1__Impl rule__RaiseErrorConditional__Group_1_1__2 )
            // InternalUseCase.g:4241:2: rule__RaiseErrorConditional__Group_1_1__1__Impl rule__RaiseErrorConditional__Group_1_1__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalUseCase.g:4248:1: rule__RaiseErrorConditional__Group_1_1__1__Impl : ( 'Fehler' ) ;
    public final void rule__RaiseErrorConditional__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4252:1: ( ( 'Fehler' ) )
            // InternalUseCase.g:4253:1: ( 'Fehler' )
            {
            // InternalUseCase.g:4253:1: ( 'Fehler' )
            // InternalUseCase.g:4254:2: 'Fehler'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getFehlerKeyword_1_1_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalUseCase.g:4263:1: rule__RaiseErrorConditional__Group_1_1__2 : rule__RaiseErrorConditional__Group_1_1__2__Impl ;
    public final void rule__RaiseErrorConditional__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4267:1: ( rule__RaiseErrorConditional__Group_1_1__2__Impl )
            // InternalUseCase.g:4268:2: rule__RaiseErrorConditional__Group_1_1__2__Impl
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
    // InternalUseCase.g:4274:1: rule__RaiseErrorConditional__Group_1_1__2__Impl : ( 'melde' ) ;
    public final void rule__RaiseErrorConditional__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4278:1: ( ( 'melde' ) )
            // InternalUseCase.g:4279:1: ( 'melde' )
            {
            // InternalUseCase.g:4279:1: ( 'melde' )
            // InternalUseCase.g:4280:2: 'melde'
            {
             before(grammarAccess.getRaiseErrorConditionalAccess().getMeldeKeyword_1_1_2()); 
            match(input,70,FOLLOW_2); 
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
    // InternalUseCase.g:4290:1: rule__RaiseErrorNow__Group__0 : rule__RaiseErrorNow__Group__0__Impl rule__RaiseErrorNow__Group__1 ;
    public final void rule__RaiseErrorNow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4294:1: ( rule__RaiseErrorNow__Group__0__Impl rule__RaiseErrorNow__Group__1 )
            // InternalUseCase.g:4295:2: rule__RaiseErrorNow__Group__0__Impl rule__RaiseErrorNow__Group__1
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
    // InternalUseCase.g:4302:1: rule__RaiseErrorNow__Group__0__Impl : ( ( rule__RaiseErrorNow__Alternatives_0 ) ) ;
    public final void rule__RaiseErrorNow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4306:1: ( ( ( rule__RaiseErrorNow__Alternatives_0 ) ) )
            // InternalUseCase.g:4307:1: ( ( rule__RaiseErrorNow__Alternatives_0 ) )
            {
            // InternalUseCase.g:4307:1: ( ( rule__RaiseErrorNow__Alternatives_0 ) )
            // InternalUseCase.g:4308:2: ( rule__RaiseErrorNow__Alternatives_0 )
            {
             before(grammarAccess.getRaiseErrorNowAccess().getAlternatives_0()); 
            // InternalUseCase.g:4309:2: ( rule__RaiseErrorNow__Alternatives_0 )
            // InternalUseCase.g:4309:3: rule__RaiseErrorNow__Alternatives_0
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
    // InternalUseCase.g:4317:1: rule__RaiseErrorNow__Group__1 : rule__RaiseErrorNow__Group__1__Impl ;
    public final void rule__RaiseErrorNow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4321:1: ( rule__RaiseErrorNow__Group__1__Impl )
            // InternalUseCase.g:4322:2: rule__RaiseErrorNow__Group__1__Impl
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
    // InternalUseCase.g:4328:1: rule__RaiseErrorNow__Group__1__Impl : ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) ) ;
    public final void rule__RaiseErrorNow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4332:1: ( ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) ) )
            // InternalUseCase.g:4333:1: ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) )
            {
            // InternalUseCase.g:4333:1: ( ( rule__RaiseErrorNow__ExceptionAssignment_1 ) )
            // InternalUseCase.g:4334:2: ( rule__RaiseErrorNow__ExceptionAssignment_1 )
            {
             before(grammarAccess.getRaiseErrorNowAccess().getExceptionAssignment_1()); 
            // InternalUseCase.g:4335:2: ( rule__RaiseErrorNow__ExceptionAssignment_1 )
            // InternalUseCase.g:4335:3: rule__RaiseErrorNow__ExceptionAssignment_1
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
    // InternalUseCase.g:4344:1: rule__RaiseErrorNow__Group_0_0__0 : rule__RaiseErrorNow__Group_0_0__0__Impl rule__RaiseErrorNow__Group_0_0__1 ;
    public final void rule__RaiseErrorNow__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4348:1: ( rule__RaiseErrorNow__Group_0_0__0__Impl rule__RaiseErrorNow__Group_0_0__1 )
            // InternalUseCase.g:4349:2: rule__RaiseErrorNow__Group_0_0__0__Impl rule__RaiseErrorNow__Group_0_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalUseCase.g:4356:1: rule__RaiseErrorNow__Group_0_0__0__Impl : ( 'Raise' ) ;
    public final void rule__RaiseErrorNow__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4360:1: ( ( 'Raise' ) )
            // InternalUseCase.g:4361:1: ( 'Raise' )
            {
            // InternalUseCase.g:4361:1: ( 'Raise' )
            // InternalUseCase.g:4362:2: 'Raise'
            {
             before(grammarAccess.getRaiseErrorNowAccess().getRaiseKeyword_0_0_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalUseCase.g:4371:1: rule__RaiseErrorNow__Group_0_0__1 : rule__RaiseErrorNow__Group_0_0__1__Impl ;
    public final void rule__RaiseErrorNow__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4375:1: ( rule__RaiseErrorNow__Group_0_0__1__Impl )
            // InternalUseCase.g:4376:2: rule__RaiseErrorNow__Group_0_0__1__Impl
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
    // InternalUseCase.g:4382:1: rule__RaiseErrorNow__Group_0_0__1__Impl : ( ( 'error' )? ) ;
    public final void rule__RaiseErrorNow__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4386:1: ( ( ( 'error' )? ) )
            // InternalUseCase.g:4387:1: ( ( 'error' )? )
            {
            // InternalUseCase.g:4387:1: ( ( 'error' )? )
            // InternalUseCase.g:4388:2: ( 'error' )?
            {
             before(grammarAccess.getRaiseErrorNowAccess().getErrorKeyword_0_0_1()); 
            // InternalUseCase.g:4389:2: ( 'error' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==66) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUseCase.g:4389:3: 'error'
                    {
                    match(input,66,FOLLOW_2); 

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
    // InternalUseCase.g:4398:1: rule__RaiseErrorNow__Group_0_1__0 : rule__RaiseErrorNow__Group_0_1__0__Impl rule__RaiseErrorNow__Group_0_1__1 ;
    public final void rule__RaiseErrorNow__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4402:1: ( rule__RaiseErrorNow__Group_0_1__0__Impl rule__RaiseErrorNow__Group_0_1__1 )
            // InternalUseCase.g:4403:2: rule__RaiseErrorNow__Group_0_1__0__Impl rule__RaiseErrorNow__Group_0_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalUseCase.g:4410:1: rule__RaiseErrorNow__Group_0_1__0__Impl : ( 'Melde' ) ;
    public final void rule__RaiseErrorNow__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4414:1: ( ( 'Melde' ) )
            // InternalUseCase.g:4415:1: ( 'Melde' )
            {
            // InternalUseCase.g:4415:1: ( 'Melde' )
            // InternalUseCase.g:4416:2: 'Melde'
            {
             before(grammarAccess.getRaiseErrorNowAccess().getMeldeKeyword_0_1_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalUseCase.g:4425:1: rule__RaiseErrorNow__Group_0_1__1 : rule__RaiseErrorNow__Group_0_1__1__Impl ;
    public final void rule__RaiseErrorNow__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4429:1: ( rule__RaiseErrorNow__Group_0_1__1__Impl )
            // InternalUseCase.g:4430:2: rule__RaiseErrorNow__Group_0_1__1__Impl
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
    // InternalUseCase.g:4436:1: rule__RaiseErrorNow__Group_0_1__1__Impl : ( ( 'Fehler' )? ) ;
    public final void rule__RaiseErrorNow__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4440:1: ( ( ( 'Fehler' )? ) )
            // InternalUseCase.g:4441:1: ( ( 'Fehler' )? )
            {
            // InternalUseCase.g:4441:1: ( ( 'Fehler' )? )
            // InternalUseCase.g:4442:2: ( 'Fehler' )?
            {
             before(grammarAccess.getRaiseErrorNowAccess().getFehlerKeyword_0_1_1()); 
            // InternalUseCase.g:4443:2: ( 'Fehler' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==69) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalUseCase.g:4443:3: 'Fehler'
                    {
                    match(input,69,FOLLOW_2); 

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
    // InternalUseCase.g:4452:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4456:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalUseCase.g:4457:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
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
    // InternalUseCase.g:4464:1: rule__IfStatement__Group__0__Impl : ( ( rule__IfStatement__Alternatives_0 ) ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4468:1: ( ( ( rule__IfStatement__Alternatives_0 ) ) )
            // InternalUseCase.g:4469:1: ( ( rule__IfStatement__Alternatives_0 ) )
            {
            // InternalUseCase.g:4469:1: ( ( rule__IfStatement__Alternatives_0 ) )
            // InternalUseCase.g:4470:2: ( rule__IfStatement__Alternatives_0 )
            {
             before(grammarAccess.getIfStatementAccess().getAlternatives_0()); 
            // InternalUseCase.g:4471:2: ( rule__IfStatement__Alternatives_0 )
            // InternalUseCase.g:4471:3: rule__IfStatement__Alternatives_0
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
    // InternalUseCase.g:4479:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4483:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalUseCase.g:4484:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
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
    // InternalUseCase.g:4491:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__ConditionAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4495:1: ( ( ( rule__IfStatement__ConditionAssignment_1 ) ) )
            // InternalUseCase.g:4496:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            {
            // InternalUseCase.g:4496:1: ( ( rule__IfStatement__ConditionAssignment_1 ) )
            // InternalUseCase.g:4497:2: ( rule__IfStatement__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfStatementAccess().getConditionAssignment_1()); 
            // InternalUseCase.g:4498:2: ( rule__IfStatement__ConditionAssignment_1 )
            // InternalUseCase.g:4498:3: rule__IfStatement__ConditionAssignment_1
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
    // InternalUseCase.g:4506:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4510:1: ( rule__IfStatement__Group__2__Impl )
            // InternalUseCase.g:4511:2: rule__IfStatement__Group__2__Impl
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
    // InternalUseCase.g:4517:1: rule__IfStatement__Group__2__Impl : ( ':' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4521:1: ( ( ':' ) )
            // InternalUseCase.g:4522:1: ( ':' )
            {
            // InternalUseCase.g:4522:1: ( ':' )
            // InternalUseCase.g:4523:2: ':'
            {
             before(grammarAccess.getIfStatementAccess().getColonKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:4533:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4537:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalUseCase.g:4538:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
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
    // InternalUseCase.g:4545:1: rule__Loop__Group__0__Impl : ( ( rule__Loop__Alternatives_0 ) ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4549:1: ( ( ( rule__Loop__Alternatives_0 ) ) )
            // InternalUseCase.g:4550:1: ( ( rule__Loop__Alternatives_0 ) )
            {
            // InternalUseCase.g:4550:1: ( ( rule__Loop__Alternatives_0 ) )
            // InternalUseCase.g:4551:2: ( rule__Loop__Alternatives_0 )
            {
             before(grammarAccess.getLoopAccess().getAlternatives_0()); 
            // InternalUseCase.g:4552:2: ( rule__Loop__Alternatives_0 )
            // InternalUseCase.g:4552:3: rule__Loop__Alternatives_0
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
    // InternalUseCase.g:4560:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4564:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalUseCase.g:4565:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
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
    // InternalUseCase.g:4572:1: rule__Loop__Group__1__Impl : ( ( rule__Loop__ConditionAssignment_1 ) ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4576:1: ( ( ( rule__Loop__ConditionAssignment_1 ) ) )
            // InternalUseCase.g:4577:1: ( ( rule__Loop__ConditionAssignment_1 ) )
            {
            // InternalUseCase.g:4577:1: ( ( rule__Loop__ConditionAssignment_1 ) )
            // InternalUseCase.g:4578:2: ( rule__Loop__ConditionAssignment_1 )
            {
             before(grammarAccess.getLoopAccess().getConditionAssignment_1()); 
            // InternalUseCase.g:4579:2: ( rule__Loop__ConditionAssignment_1 )
            // InternalUseCase.g:4579:3: rule__Loop__ConditionAssignment_1
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
    // InternalUseCase.g:4587:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4591:1: ( rule__Loop__Group__2__Impl )
            // InternalUseCase.g:4592:2: rule__Loop__Group__2__Impl
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
    // InternalUseCase.g:4598:1: rule__Loop__Group__2__Impl : ( ':' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4602:1: ( ( ':' ) )
            // InternalUseCase.g:4603:1: ( ':' )
            {
            // InternalUseCase.g:4603:1: ( ':' )
            // InternalUseCase.g:4604:2: ':'
            {
             before(grammarAccess.getLoopAccess().getColonKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:4614:1: rule__Notes__Group__0 : rule__Notes__Group__0__Impl rule__Notes__Group__1 ;
    public final void rule__Notes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4618:1: ( rule__Notes__Group__0__Impl rule__Notes__Group__1 )
            // InternalUseCase.g:4619:2: rule__Notes__Group__0__Impl rule__Notes__Group__1
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
    // InternalUseCase.g:4626:1: rule__Notes__Group__0__Impl : ( ( rule__Notes__Alternatives_0 ) ) ;
    public final void rule__Notes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4630:1: ( ( ( rule__Notes__Alternatives_0 ) ) )
            // InternalUseCase.g:4631:1: ( ( rule__Notes__Alternatives_0 ) )
            {
            // InternalUseCase.g:4631:1: ( ( rule__Notes__Alternatives_0 ) )
            // InternalUseCase.g:4632:2: ( rule__Notes__Alternatives_0 )
            {
             before(grammarAccess.getNotesAccess().getAlternatives_0()); 
            // InternalUseCase.g:4633:2: ( rule__Notes__Alternatives_0 )
            // InternalUseCase.g:4633:3: rule__Notes__Alternatives_0
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
    // InternalUseCase.g:4641:1: rule__Notes__Group__1 : rule__Notes__Group__1__Impl ;
    public final void rule__Notes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4645:1: ( rule__Notes__Group__1__Impl )
            // InternalUseCase.g:4646:2: rule__Notes__Group__1__Impl
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
    // InternalUseCase.g:4652:1: rule__Notes__Group__1__Impl : ( ( rule__Notes__ContentAssignment_1 ) ) ;
    public final void rule__Notes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4656:1: ( ( ( rule__Notes__ContentAssignment_1 ) ) )
            // InternalUseCase.g:4657:1: ( ( rule__Notes__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:4657:1: ( ( rule__Notes__ContentAssignment_1 ) )
            // InternalUseCase.g:4658:2: ( rule__Notes__ContentAssignment_1 )
            {
             before(grammarAccess.getNotesAccess().getContentAssignment_1()); 
            // InternalUseCase.g:4659:2: ( rule__Notes__ContentAssignment_1 )
            // InternalUseCase.g:4659:3: rule__Notes__ContentAssignment_1
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
    // InternalUseCase.g:4668:1: rule__UsedTypes__Group__0 : rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 ;
    public final void rule__UsedTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4672:1: ( rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 )
            // InternalUseCase.g:4673:2: rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1
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
    // InternalUseCase.g:4680:1: rule__UsedTypes__Group__0__Impl : ( ( rule__UsedTypes__Alternatives_0 ) ) ;
    public final void rule__UsedTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4684:1: ( ( ( rule__UsedTypes__Alternatives_0 ) ) )
            // InternalUseCase.g:4685:1: ( ( rule__UsedTypes__Alternatives_0 ) )
            {
            // InternalUseCase.g:4685:1: ( ( rule__UsedTypes__Alternatives_0 ) )
            // InternalUseCase.g:4686:2: ( rule__UsedTypes__Alternatives_0 )
            {
             before(grammarAccess.getUsedTypesAccess().getAlternatives_0()); 
            // InternalUseCase.g:4687:2: ( rule__UsedTypes__Alternatives_0 )
            // InternalUseCase.g:4687:3: rule__UsedTypes__Alternatives_0
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
    // InternalUseCase.g:4695:1: rule__UsedTypes__Group__1 : rule__UsedTypes__Group__1__Impl ;
    public final void rule__UsedTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4699:1: ( rule__UsedTypes__Group__1__Impl )
            // InternalUseCase.g:4700:2: rule__UsedTypes__Group__1__Impl
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
    // InternalUseCase.g:4706:1: rule__UsedTypes__Group__1__Impl : ( ( rule__UsedTypes__TypesAssignment_1 )* ) ;
    public final void rule__UsedTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4710:1: ( ( ( rule__UsedTypes__TypesAssignment_1 )* ) )
            // InternalUseCase.g:4711:1: ( ( rule__UsedTypes__TypesAssignment_1 )* )
            {
            // InternalUseCase.g:4711:1: ( ( rule__UsedTypes__TypesAssignment_1 )* )
            // InternalUseCase.g:4712:2: ( rule__UsedTypes__TypesAssignment_1 )*
            {
             before(grammarAccess.getUsedTypesAccess().getTypesAssignment_1()); 
            // InternalUseCase.g:4713:2: ( rule__UsedTypes__TypesAssignment_1 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==54) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalUseCase.g:4713:3: rule__UsedTypes__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__UsedTypes__TypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalUseCase.g:4722:1: rule__UsedTypes__Group_0_0__0 : rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1 ;
    public final void rule__UsedTypes__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4726:1: ( rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1 )
            // InternalUseCase.g:4727:2: rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalUseCase.g:4734:1: rule__UsedTypes__Group_0_0__0__Impl : ( 'used' ) ;
    public final void rule__UsedTypes__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4738:1: ( ( 'used' ) )
            // InternalUseCase.g:4739:1: ( 'used' )
            {
            // InternalUseCase.g:4739:1: ( 'used' )
            // InternalUseCase.g:4740:2: 'used'
            {
             before(grammarAccess.getUsedTypesAccess().getUsedKeyword_0_0_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalUseCase.g:4749:1: rule__UsedTypes__Group_0_0__1 : rule__UsedTypes__Group_0_0__1__Impl ;
    public final void rule__UsedTypes__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4753:1: ( rule__UsedTypes__Group_0_0__1__Impl )
            // InternalUseCase.g:4754:2: rule__UsedTypes__Group_0_0__1__Impl
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
    // InternalUseCase.g:4760:1: rule__UsedTypes__Group_0_0__1__Impl : ( 'types:' ) ;
    public final void rule__UsedTypes__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4764:1: ( ( 'types:' ) )
            // InternalUseCase.g:4765:1: ( 'types:' )
            {
            // InternalUseCase.g:4765:1: ( 'types:' )
            // InternalUseCase.g:4766:2: 'types:'
            {
             before(grammarAccess.getUsedTypesAccess().getTypesKeyword_0_0_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalUseCase.g:4776:1: rule__UsedTypes__Group_0_1__0 : rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1 ;
    public final void rule__UsedTypes__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4780:1: ( rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1 )
            // InternalUseCase.g:4781:2: rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalUseCase.g:4788:1: rule__UsedTypes__Group_0_1__0__Impl : ( 'Genutzte' ) ;
    public final void rule__UsedTypes__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4792:1: ( ( 'Genutzte' ) )
            // InternalUseCase.g:4793:1: ( 'Genutzte' )
            {
            // InternalUseCase.g:4793:1: ( 'Genutzte' )
            // InternalUseCase.g:4794:2: 'Genutzte'
            {
             before(grammarAccess.getUsedTypesAccess().getGenutzteKeyword_0_1_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalUseCase.g:4803:1: rule__UsedTypes__Group_0_1__1 : rule__UsedTypes__Group_0_1__1__Impl ;
    public final void rule__UsedTypes__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4807:1: ( rule__UsedTypes__Group_0_1__1__Impl )
            // InternalUseCase.g:4808:2: rule__UsedTypes__Group_0_1__1__Impl
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
    // InternalUseCase.g:4814:1: rule__UsedTypes__Group_0_1__1__Impl : ( 'Typen:' ) ;
    public final void rule__UsedTypes__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4818:1: ( ( 'Typen:' ) )
            // InternalUseCase.g:4819:1: ( 'Typen:' )
            {
            // InternalUseCase.g:4819:1: ( 'Typen:' )
            // InternalUseCase.g:4820:2: 'Typen:'
            {
             before(grammarAccess.getUsedTypesAccess().getTypenKeyword_0_1_1()); 
            match(input,76,FOLLOW_2); 
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
    // InternalUseCase.g:4830:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4834:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalUseCase.g:4835:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalUseCase.g:4842:1: rule__Type__Group__0__Impl : ( '-' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4846:1: ( ( '-' ) )
            // InternalUseCase.g:4847:1: ( '-' )
            {
            // InternalUseCase.g:4847:1: ( '-' )
            // InternalUseCase.g:4848:2: '-'
            {
             before(grammarAccess.getTypeAccess().getHyphenMinusKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUseCase.g:4857:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4861:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalUseCase.g:4862:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalUseCase.g:4869:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4873:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalUseCase.g:4874:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalUseCase.g:4874:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalUseCase.g:4875:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalUseCase.g:4876:2: ( rule__Type__NameAssignment_1 )
            // InternalUseCase.g:4876:3: rule__Type__NameAssignment_1
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
    // InternalUseCase.g:4884:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4888:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalUseCase.g:4889:2: rule__Type__Group__2__Impl rule__Type__Group__3
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
    // InternalUseCase.g:4896:1: rule__Type__Group__2__Impl : ( '(' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4900:1: ( ( '(' ) )
            // InternalUseCase.g:4901:1: ( '(' )
            {
            // InternalUseCase.g:4901:1: ( '(' )
            // InternalUseCase.g:4902:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,61,FOLLOW_2); 
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
    // InternalUseCase.g:4911:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4915:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalUseCase.g:4916:2: rule__Type__Group__3__Impl rule__Type__Group__4
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
    // InternalUseCase.g:4923:1: rule__Type__Group__3__Impl : ( ( rule__Type__DescriptionAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4927:1: ( ( ( rule__Type__DescriptionAssignment_3 ) ) )
            // InternalUseCase.g:4928:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            {
            // InternalUseCase.g:4928:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            // InternalUseCase.g:4929:2: ( rule__Type__DescriptionAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getDescriptionAssignment_3()); 
            // InternalUseCase.g:4930:2: ( rule__Type__DescriptionAssignment_3 )
            // InternalUseCase.g:4930:3: rule__Type__DescriptionAssignment_3
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
    // InternalUseCase.g:4938:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4942:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalUseCase.g:4943:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_46);
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
    // InternalUseCase.g:4950:1: rule__Type__Group__4__Impl : ( ')' ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4954:1: ( ( ')' ) )
            // InternalUseCase.g:4955:1: ( ')' )
            {
            // InternalUseCase.g:4955:1: ( ')' )
            // InternalUseCase.g:4956:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,62,FOLLOW_2); 
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
    // InternalUseCase.g:4965:1: rule__Type__Group__5 : rule__Type__Group__5__Impl ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4969:1: ( rule__Type__Group__5__Impl )
            // InternalUseCase.g:4970:2: rule__Type__Group__5__Impl
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
    // InternalUseCase.g:4976:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )? ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4980:1: ( ( ( rule__Type__Group_5__0 )? ) )
            // InternalUseCase.g:4981:1: ( ( rule__Type__Group_5__0 )? )
            {
            // InternalUseCase.g:4981:1: ( ( rule__Type__Group_5__0 )? )
            // InternalUseCase.g:4982:2: ( rule__Type__Group_5__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // InternalUseCase.g:4983:2: ( rule__Type__Group_5__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==77) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalUseCase.g:4983:3: rule__Type__Group_5__0
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
    // InternalUseCase.g:4992:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4996:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalUseCase.g:4997:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
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
    // InternalUseCase.g:5004:1: rule__Type__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5008:1: ( ( '[' ) )
            // InternalUseCase.g:5009:1: ( '[' )
            {
            // InternalUseCase.g:5009:1: ( '[' )
            // InternalUseCase.g:5010:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalUseCase.g:5019:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5023:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalUseCase.g:5024:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalUseCase.g:5031:1: rule__Type__Group_5__1__Impl : ( ( rule__Type__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5035:1: ( ( ( rule__Type__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:5036:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:5036:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:5037:2: ( rule__Type__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getTypeAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:5038:2: ( rule__Type__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:5038:3: rule__Type__ImportInfoAssignment_5_1
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
    // InternalUseCase.g:5046:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5050:1: ( rule__Type__Group_5__2__Impl )
            // InternalUseCase.g:5051:2: rule__Type__Group_5__2__Impl
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
    // InternalUseCase.g:5057:1: rule__Type__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5061:1: ( ( ']' ) )
            // InternalUseCase.g:5062:1: ( ']' )
            {
            // InternalUseCase.g:5062:1: ( ']' )
            // InternalUseCase.g:5063:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalUseCase.g:5073:1: rule__UsedExceptions__Group__0 : rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 ;
    public final void rule__UsedExceptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5077:1: ( rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 )
            // InternalUseCase.g:5078:2: rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1
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
    // InternalUseCase.g:5085:1: rule__UsedExceptions__Group__0__Impl : ( ( rule__UsedExceptions__Alternatives_0 ) ) ;
    public final void rule__UsedExceptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5089:1: ( ( ( rule__UsedExceptions__Alternatives_0 ) ) )
            // InternalUseCase.g:5090:1: ( ( rule__UsedExceptions__Alternatives_0 ) )
            {
            // InternalUseCase.g:5090:1: ( ( rule__UsedExceptions__Alternatives_0 ) )
            // InternalUseCase.g:5091:2: ( rule__UsedExceptions__Alternatives_0 )
            {
             before(grammarAccess.getUsedExceptionsAccess().getAlternatives_0()); 
            // InternalUseCase.g:5092:2: ( rule__UsedExceptions__Alternatives_0 )
            // InternalUseCase.g:5092:3: rule__UsedExceptions__Alternatives_0
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
    // InternalUseCase.g:5100:1: rule__UsedExceptions__Group__1 : rule__UsedExceptions__Group__1__Impl ;
    public final void rule__UsedExceptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5104:1: ( rule__UsedExceptions__Group__1__Impl )
            // InternalUseCase.g:5105:2: rule__UsedExceptions__Group__1__Impl
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
    // InternalUseCase.g:5111:1: rule__UsedExceptions__Group__1__Impl : ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* ) ;
    public final void rule__UsedExceptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5115:1: ( ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* ) )
            // InternalUseCase.g:5116:1: ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* )
            {
            // InternalUseCase.g:5116:1: ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* )
            // InternalUseCase.g:5117:2: ( rule__UsedExceptions__ExceptionsAssignment_1 )*
            {
             before(grammarAccess.getUsedExceptionsAccess().getExceptionsAssignment_1()); 
            // InternalUseCase.g:5118:2: ( rule__UsedExceptions__ExceptionsAssignment_1 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==54) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalUseCase.g:5118:3: rule__UsedExceptions__ExceptionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__UsedExceptions__ExceptionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
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
    // InternalUseCase.g:5127:1: rule__UsedExceptions__Group_0_0__0 : rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1 ;
    public final void rule__UsedExceptions__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5131:1: ( rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1 )
            // InternalUseCase.g:5132:2: rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1
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
    // InternalUseCase.g:5139:1: rule__UsedExceptions__Group_0_0__0__Impl : ( 'used' ) ;
    public final void rule__UsedExceptions__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5143:1: ( ( 'used' ) )
            // InternalUseCase.g:5144:1: ( 'used' )
            {
            // InternalUseCase.g:5144:1: ( 'used' )
            // InternalUseCase.g:5145:2: 'used'
            {
             before(grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0_0_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalUseCase.g:5154:1: rule__UsedExceptions__Group_0_0__1 : rule__UsedExceptions__Group_0_0__1__Impl ;
    public final void rule__UsedExceptions__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5158:1: ( rule__UsedExceptions__Group_0_0__1__Impl )
            // InternalUseCase.g:5159:2: rule__UsedExceptions__Group_0_0__1__Impl
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
    // InternalUseCase.g:5165:1: rule__UsedExceptions__Group_0_0__1__Impl : ( 'errors:' ) ;
    public final void rule__UsedExceptions__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5169:1: ( ( 'errors:' ) )
            // InternalUseCase.g:5170:1: ( 'errors:' )
            {
            // InternalUseCase.g:5170:1: ( 'errors:' )
            // InternalUseCase.g:5171:2: 'errors:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_0_0_1()); 
            match(input,79,FOLLOW_2); 
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
    // InternalUseCase.g:5181:1: rule__UsedExceptions__Group_0_1__0 : rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1 ;
    public final void rule__UsedExceptions__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5185:1: ( rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1 )
            // InternalUseCase.g:5186:2: rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1
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
    // InternalUseCase.g:5193:1: rule__UsedExceptions__Group_0_1__0__Impl : ( 'Genutzte' ) ;
    public final void rule__UsedExceptions__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5197:1: ( ( 'Genutzte' ) )
            // InternalUseCase.g:5198:1: ( 'Genutzte' )
            {
            // InternalUseCase.g:5198:1: ( 'Genutzte' )
            // InternalUseCase.g:5199:2: 'Genutzte'
            {
             before(grammarAccess.getUsedExceptionsAccess().getGenutzteKeyword_0_1_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalUseCase.g:5208:1: rule__UsedExceptions__Group_0_1__1 : rule__UsedExceptions__Group_0_1__1__Impl ;
    public final void rule__UsedExceptions__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5212:1: ( rule__UsedExceptions__Group_0_1__1__Impl )
            // InternalUseCase.g:5213:2: rule__UsedExceptions__Group_0_1__1__Impl
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
    // InternalUseCase.g:5219:1: rule__UsedExceptions__Group_0_1__1__Impl : ( 'Fehler:' ) ;
    public final void rule__UsedExceptions__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5223:1: ( ( 'Fehler:' ) )
            // InternalUseCase.g:5224:1: ( 'Fehler:' )
            {
            // InternalUseCase.g:5224:1: ( 'Fehler:' )
            // InternalUseCase.g:5225:2: 'Fehler:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getFehlerKeyword_0_1_1()); 
            match(input,80,FOLLOW_2); 
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
    // InternalUseCase.g:5235:1: rule__ExceptionDecleration__Group__0 : rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 ;
    public final void rule__ExceptionDecleration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5239:1: ( rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 )
            // InternalUseCase.g:5240:2: rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1
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
    // InternalUseCase.g:5247:1: rule__ExceptionDecleration__Group__0__Impl : ( '-' ) ;
    public final void rule__ExceptionDecleration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5251:1: ( ( '-' ) )
            // InternalUseCase.g:5252:1: ( '-' )
            {
            // InternalUseCase.g:5252:1: ( '-' )
            // InternalUseCase.g:5253:2: '-'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUseCase.g:5262:1: rule__ExceptionDecleration__Group__1 : rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 ;
    public final void rule__ExceptionDecleration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5266:1: ( rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 )
            // InternalUseCase.g:5267:2: rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalUseCase.g:5274:1: rule__ExceptionDecleration__Group__1__Impl : ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) ;
    public final void rule__ExceptionDecleration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5278:1: ( ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) )
            // InternalUseCase.g:5279:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            {
            // InternalUseCase.g:5279:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            // InternalUseCase.g:5280:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getNameAssignment_1()); 
            // InternalUseCase.g:5281:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            // InternalUseCase.g:5281:3: rule__ExceptionDecleration__NameAssignment_1
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
    // InternalUseCase.g:5289:1: rule__ExceptionDecleration__Group__2 : rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 ;
    public final void rule__ExceptionDecleration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5293:1: ( rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 )
            // InternalUseCase.g:5294:2: rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3
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
    // InternalUseCase.g:5301:1: rule__ExceptionDecleration__Group__2__Impl : ( '(' ) ;
    public final void rule__ExceptionDecleration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5305:1: ( ( '(' ) )
            // InternalUseCase.g:5306:1: ( '(' )
            {
            // InternalUseCase.g:5306:1: ( '(' )
            // InternalUseCase.g:5307:2: '('
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2()); 
            match(input,61,FOLLOW_2); 
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
    // InternalUseCase.g:5316:1: rule__ExceptionDecleration__Group__3 : rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4 ;
    public final void rule__ExceptionDecleration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5320:1: ( rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4 )
            // InternalUseCase.g:5321:2: rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4
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
    // InternalUseCase.g:5328:1: rule__ExceptionDecleration__Group__3__Impl : ( ( rule__ExceptionDecleration__MessageAssignment_3 ) ) ;
    public final void rule__ExceptionDecleration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5332:1: ( ( ( rule__ExceptionDecleration__MessageAssignment_3 ) ) )
            // InternalUseCase.g:5333:1: ( ( rule__ExceptionDecleration__MessageAssignment_3 ) )
            {
            // InternalUseCase.g:5333:1: ( ( rule__ExceptionDecleration__MessageAssignment_3 ) )
            // InternalUseCase.g:5334:2: ( rule__ExceptionDecleration__MessageAssignment_3 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getMessageAssignment_3()); 
            // InternalUseCase.g:5335:2: ( rule__ExceptionDecleration__MessageAssignment_3 )
            // InternalUseCase.g:5335:3: rule__ExceptionDecleration__MessageAssignment_3
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
    // InternalUseCase.g:5343:1: rule__ExceptionDecleration__Group__4 : rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5 ;
    public final void rule__ExceptionDecleration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5347:1: ( rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5 )
            // InternalUseCase.g:5348:2: rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5
            {
            pushFollow(FOLLOW_46);
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
    // InternalUseCase.g:5355:1: rule__ExceptionDecleration__Group__4__Impl : ( ')' ) ;
    public final void rule__ExceptionDecleration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5359:1: ( ( ')' ) )
            // InternalUseCase.g:5360:1: ( ')' )
            {
            // InternalUseCase.g:5360:1: ( ')' )
            // InternalUseCase.g:5361:2: ')'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_4()); 
            match(input,62,FOLLOW_2); 
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
    // InternalUseCase.g:5370:1: rule__ExceptionDecleration__Group__5 : rule__ExceptionDecleration__Group__5__Impl ;
    public final void rule__ExceptionDecleration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5374:1: ( rule__ExceptionDecleration__Group__5__Impl )
            // InternalUseCase.g:5375:2: rule__ExceptionDecleration__Group__5__Impl
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
    // InternalUseCase.g:5381:1: rule__ExceptionDecleration__Group__5__Impl : ( ( rule__ExceptionDecleration__Group_5__0 )? ) ;
    public final void rule__ExceptionDecleration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5385:1: ( ( ( rule__ExceptionDecleration__Group_5__0 )? ) )
            // InternalUseCase.g:5386:1: ( ( rule__ExceptionDecleration__Group_5__0 )? )
            {
            // InternalUseCase.g:5386:1: ( ( rule__ExceptionDecleration__Group_5__0 )? )
            // InternalUseCase.g:5387:2: ( rule__ExceptionDecleration__Group_5__0 )?
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup_5()); 
            // InternalUseCase.g:5388:2: ( rule__ExceptionDecleration__Group_5__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==77) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalUseCase.g:5388:3: rule__ExceptionDecleration__Group_5__0
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
    // InternalUseCase.g:5397:1: rule__ExceptionDecleration__Group_5__0 : rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1 ;
    public final void rule__ExceptionDecleration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5401:1: ( rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1 )
            // InternalUseCase.g:5402:2: rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1
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
    // InternalUseCase.g:5409:1: rule__ExceptionDecleration__Group_5__0__Impl : ( '[' ) ;
    public final void rule__ExceptionDecleration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5413:1: ( ( '[' ) )
            // InternalUseCase.g:5414:1: ( '[' )
            {
            // InternalUseCase.g:5414:1: ( '[' )
            // InternalUseCase.g:5415:2: '['
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalUseCase.g:5424:1: rule__ExceptionDecleration__Group_5__1 : rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2 ;
    public final void rule__ExceptionDecleration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5428:1: ( rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2 )
            // InternalUseCase.g:5429:2: rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalUseCase.g:5436:1: rule__ExceptionDecleration__Group_5__1__Impl : ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__ExceptionDecleration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5440:1: ( ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:5441:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:5441:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:5442:2: ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:5443:2: ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:5443:3: rule__ExceptionDecleration__ImportInfoAssignment_5_1
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
    // InternalUseCase.g:5451:1: rule__ExceptionDecleration__Group_5__2 : rule__ExceptionDecleration__Group_5__2__Impl ;
    public final void rule__ExceptionDecleration__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5455:1: ( rule__ExceptionDecleration__Group_5__2__Impl )
            // InternalUseCase.g:5456:2: rule__ExceptionDecleration__Group_5__2__Impl
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
    // InternalUseCase.g:5462:1: rule__ExceptionDecleration__Group_5__2__Impl : ( ']' ) ;
    public final void rule__ExceptionDecleration__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5466:1: ( ( ']' ) )
            // InternalUseCase.g:5467:1: ( ']' )
            {
            // InternalUseCase.g:5467:1: ( ']' )
            // InternalUseCase.g:5468:2: ']'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalUseCase.g:5478:1: rule__Model__CompanyAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__CompanyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5482:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:5483:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:5483:2: ( ruleQualifiedName )
            // InternalUseCase.g:5484:3: ruleQualifiedName
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
    // InternalUseCase.g:5493:1: rule__Model__PackageAssignment_2 : ( rulePackage ) ;
    public final void rule__Model__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5497:1: ( ( rulePackage ) )
            // InternalUseCase.g:5498:2: ( rulePackage )
            {
            // InternalUseCase.g:5498:2: ( rulePackage )
            // InternalUseCase.g:5499:3: rulePackage
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
    // InternalUseCase.g:5508:1: rule__Model__UseCasesAssignment_3 : ( ruleUseCase ) ;
    public final void rule__Model__UseCasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5512:1: ( ( ruleUseCase ) )
            // InternalUseCase.g:5513:2: ( ruleUseCase )
            {
            // InternalUseCase.g:5513:2: ( ruleUseCase )
            // InternalUseCase.g:5514:3: ruleUseCase
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
    // InternalUseCase.g:5523:1: rule__Model__TypesAssignment_4 : ( ruleUsedTypes ) ;
    public final void rule__Model__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5527:1: ( ( ruleUsedTypes ) )
            // InternalUseCase.g:5528:2: ( ruleUsedTypes )
            {
            // InternalUseCase.g:5528:2: ( ruleUsedTypes )
            // InternalUseCase.g:5529:3: ruleUsedTypes
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
    // InternalUseCase.g:5538:1: rule__Model__ExceptionsAssignment_5 : ( ruleUsedExceptions ) ;
    public final void rule__Model__ExceptionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5542:1: ( ( ruleUsedExceptions ) )
            // InternalUseCase.g:5543:2: ( ruleUsedExceptions )
            {
            // InternalUseCase.g:5543:2: ( ruleUsedExceptions )
            // InternalUseCase.g:5544:3: ruleUsedExceptions
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
    // InternalUseCase.g:5553:1: rule__Package__PartsAssignment_1 : ( rulePackagePart ) ;
    public final void rule__Package__PartsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5557:1: ( ( rulePackagePart ) )
            // InternalUseCase.g:5558:2: ( rulePackagePart )
            {
            // InternalUseCase.g:5558:2: ( rulePackagePart )
            // InternalUseCase.g:5559:3: rulePackagePart
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
    // InternalUseCase.g:5568:1: rule__Package__PartsAssignment_2_1 : ( rulePackagePart ) ;
    public final void rule__Package__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5572:1: ( ( rulePackagePart ) )
            // InternalUseCase.g:5573:2: ( rulePackagePart )
            {
            // InternalUseCase.g:5573:2: ( rulePackagePart )
            // InternalUseCase.g:5574:3: rulePackagePart
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
    // InternalUseCase.g:5583:1: rule__PackagePart__NameAssignment : ( RULE_ID ) ;
    public final void rule__PackagePart__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5587:1: ( ( RULE_ID ) )
            // InternalUseCase.g:5588:2: ( RULE_ID )
            {
            // InternalUseCase.g:5588:2: ( RULE_ID )
            // InternalUseCase.g:5589:3: RULE_ID
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
    // InternalUseCase.g:5598:1: rule__UseCase__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5602:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5603:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5603:2: ( RULE_STRING )
            // InternalUseCase.g:5604:3: RULE_STRING
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
    // InternalUseCase.g:5613:1: rule__UseCase__DescriptionsAssignment_2 : ( ruleDescription ) ;
    public final void rule__UseCase__DescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5617:1: ( ( ruleDescription ) )
            // InternalUseCase.g:5618:2: ( ruleDescription )
            {
            // InternalUseCase.g:5618:2: ( ruleDescription )
            // InternalUseCase.g:5619:3: ruleDescription
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
    // InternalUseCase.g:5628:1: rule__UseCase__AllowedUserGroupsAssignment_3 : ( ruleAllowedUserGroups ) ;
    public final void rule__UseCase__AllowedUserGroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5632:1: ( ( ruleAllowedUserGroups ) )
            // InternalUseCase.g:5633:2: ( ruleAllowedUserGroups )
            {
            // InternalUseCase.g:5633:2: ( ruleAllowedUserGroups )
            // InternalUseCase.g:5634:3: ruleAllowedUserGroups
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
    // InternalUseCase.g:5643:1: rule__UseCase__InputsAssignment_4 : ( ruleInputs ) ;
    public final void rule__UseCase__InputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5647:1: ( ( ruleInputs ) )
            // InternalUseCase.g:5648:2: ( ruleInputs )
            {
            // InternalUseCase.g:5648:2: ( ruleInputs )
            // InternalUseCase.g:5649:3: ruleInputs
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
    // InternalUseCase.g:5658:1: rule__UseCase__OutputsAssignment_5 : ( ruleOutputs ) ;
    public final void rule__UseCase__OutputsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5662:1: ( ( ruleOutputs ) )
            // InternalUseCase.g:5663:2: ( ruleOutputs )
            {
            // InternalUseCase.g:5663:2: ( ruleOutputs )
            // InternalUseCase.g:5664:3: ruleOutputs
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
    // InternalUseCase.g:5673:1: rule__UseCase__PreconditionsAssignment_6 : ( rulePreConditions ) ;
    public final void rule__UseCase__PreconditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5677:1: ( ( rulePreConditions ) )
            // InternalUseCase.g:5678:2: ( rulePreConditions )
            {
            // InternalUseCase.g:5678:2: ( rulePreConditions )
            // InternalUseCase.g:5679:3: rulePreConditions
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
    // InternalUseCase.g:5688:1: rule__UseCase__StepsAssignment_7 : ( ruleSteps ) ;
    public final void rule__UseCase__StepsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5692:1: ( ( ruleSteps ) )
            // InternalUseCase.g:5693:2: ( ruleSteps )
            {
            // InternalUseCase.g:5693:2: ( ruleSteps )
            // InternalUseCase.g:5694:3: ruleSteps
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
    // InternalUseCase.g:5703:1: rule__UseCase__NotesAssignment_8 : ( ruleNotes ) ;
    public final void rule__UseCase__NotesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5707:1: ( ( ruleNotes ) )
            // InternalUseCase.g:5708:2: ( ruleNotes )
            {
            // InternalUseCase.g:5708:2: ( ruleNotes )
            // InternalUseCase.g:5709:3: ruleNotes
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
    // InternalUseCase.g:5718:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5722:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5723:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5723:2: ( RULE_STRING )
            // InternalUseCase.g:5724:3: RULE_STRING
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
    // InternalUseCase.g:5733:1: rule__AllowedUserGroups__GroupsAssignment_1 : ( ruleAllowedUserGroup ) ;
    public final void rule__AllowedUserGroups__GroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5737:1: ( ( ruleAllowedUserGroup ) )
            // InternalUseCase.g:5738:2: ( ruleAllowedUserGroup )
            {
            // InternalUseCase.g:5738:2: ( ruleAllowedUserGroup )
            // InternalUseCase.g:5739:3: ruleAllowedUserGroup
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
    // InternalUseCase.g:5748:1: rule__AllowedUserGroup__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__AllowedUserGroup__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5752:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:5753:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:5753:2: ( ( 'many' ) )
            // InternalUseCase.g:5754:3: ( 'many' )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:5755:3: ( 'many' )
            // InternalUseCase.g:5756:4: 'many'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalUseCase.g:5767:1: rule__AllowedUserGroup__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllowedUserGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5771:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5772:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5772:2: ( RULE_STRING )
            // InternalUseCase.g:5773:3: RULE_STRING
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
    // InternalUseCase.g:5782:1: rule__AllowedUserGroup__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllowedUserGroup__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5786:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:5787:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:5787:2: ( ( RULE_ID ) )
            // InternalUseCase.g:5788:3: ( RULE_ID )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:5789:3: ( RULE_ID )
            // InternalUseCase.g:5790:4: RULE_ID
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
    // InternalUseCase.g:5801:1: rule__Inputs__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Inputs__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5805:1: ( ( ruleInput ) )
            // InternalUseCase.g:5806:2: ( ruleInput )
            {
            // InternalUseCase.g:5806:2: ( ruleInput )
            // InternalUseCase.g:5807:3: ruleInput
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
    // InternalUseCase.g:5816:1: rule__Input__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Input__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5820:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:5821:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:5821:2: ( ( 'many' ) )
            // InternalUseCase.g:5822:3: ( 'many' )
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:5823:3: ( 'many' )
            // InternalUseCase.g:5824:4: 'many'
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalUseCase.g:5835:1: rule__Input__OptionalAssignment_2 : ( ruleOptional ) ;
    public final void rule__Input__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5839:1: ( ( ruleOptional ) )
            // InternalUseCase.g:5840:2: ( ruleOptional )
            {
            // InternalUseCase.g:5840:2: ( ruleOptional )
            // InternalUseCase.g:5841:3: ruleOptional
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
    // InternalUseCase.g:5850:1: rule__Input__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Input__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5854:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5855:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5855:2: ( RULE_STRING )
            // InternalUseCase.g:5856:3: RULE_STRING
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
    // InternalUseCase.g:5865:1: rule__Input__TypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Input__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5869:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:5870:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:5870:2: ( ( RULE_ID ) )
            // InternalUseCase.g:5871:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getTypeTypeCrossReference_4_1_0()); 
            // InternalUseCase.g:5872:3: ( RULE_ID )
            // InternalUseCase.g:5873:4: RULE_ID
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
    // InternalUseCase.g:5884:1: rule__Input__ExampleAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Input__ExampleAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5888:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5889:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5889:2: ( RULE_STRING )
            // InternalUseCase.g:5890:3: RULE_STRING
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
    // InternalUseCase.g:5899:1: rule__Outputs__OutputsAssignment_1 : ( ruleOutput ) ;
    public final void rule__Outputs__OutputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5903:1: ( ( ruleOutput ) )
            // InternalUseCase.g:5904:2: ( ruleOutput )
            {
            // InternalUseCase.g:5904:2: ( ruleOutput )
            // InternalUseCase.g:5905:3: ruleOutput
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
    // InternalUseCase.g:5914:1: rule__Output__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Output__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5918:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:5919:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:5919:2: ( ( 'many' ) )
            // InternalUseCase.g:5920:3: ( 'many' )
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:5921:3: ( 'many' )
            // InternalUseCase.g:5922:4: 'many'
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalUseCase.g:5933:1: rule__Output__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5937:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5938:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5938:2: ( RULE_STRING )
            // InternalUseCase.g:5939:3: RULE_STRING
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
    // InternalUseCase.g:5948:1: rule__Output__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Output__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5952:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:5953:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:5953:2: ( ( RULE_ID ) )
            // InternalUseCase.g:5954:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:5955:3: ( RULE_ID )
            // InternalUseCase.g:5956:4: RULE_ID
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
    // InternalUseCase.g:5967:1: rule__Output__ExampleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Output__ExampleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5971:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5972:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5972:2: ( RULE_STRING )
            // InternalUseCase.g:5973:3: RULE_STRING
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
    // InternalUseCase.g:5982:1: rule__PreConditions__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__PreConditions__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5986:1: ( ( ruleCondition ) )
            // InternalUseCase.g:5987:2: ( ruleCondition )
            {
            // InternalUseCase.g:5987:2: ( ruleCondition )
            // InternalUseCase.g:5988:3: ruleCondition
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
    // InternalUseCase.g:5997:1: rule__Condition__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Condition__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6001:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6002:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6002:2: ( RULE_STRING )
            // InternalUseCase.g:6003:3: RULE_STRING
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
    // InternalUseCase.g:6012:1: rule__Steps__StepsAssignment_1 : ( ruleStep ) ;
    public final void rule__Steps__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6016:1: ( ( ruleStep ) )
            // InternalUseCase.g:6017:2: ( ruleStep )
            {
            // InternalUseCase.g:6017:2: ( ruleStep )
            // InternalUseCase.g:6018:3: ruleStep
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
    // InternalUseCase.g:6027:1: rule__Step__NumberAssignment_0 : ( ruleQualifiedNumber ) ;
    public final void rule__Step__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6031:1: ( ( ruleQualifiedNumber ) )
            // InternalUseCase.g:6032:2: ( ruleQualifiedNumber )
            {
            // InternalUseCase.g:6032:2: ( ruleQualifiedNumber )
            // InternalUseCase.g:6033:3: ruleQualifiedNumber
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
    // InternalUseCase.g:6042:1: rule__Step__ActionAssignment_1_0_0 : ( RULE_STRING ) ;
    public final void rule__Step__ActionAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6046:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6047:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6047:2: ( RULE_STRING )
            // InternalUseCase.g:6048:3: RULE_STRING
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
    // InternalUseCase.g:6057:1: rule__Step__ErrorAssignment_1_0_1 : ( ruleRaiseErrorConditional ) ;
    public final void rule__Step__ErrorAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6061:1: ( ( ruleRaiseErrorConditional ) )
            // InternalUseCase.g:6062:2: ( ruleRaiseErrorConditional )
            {
            // InternalUseCase.g:6062:2: ( ruleRaiseErrorConditional )
            // InternalUseCase.g:6063:3: ruleRaiseErrorConditional
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
    // InternalUseCase.g:6072:1: rule__Step__ErrorAssignment_1_1 : ( ruleRaiseErrorConditional ) ;
    public final void rule__Step__ErrorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6076:1: ( ( ruleRaiseErrorConditional ) )
            // InternalUseCase.g:6077:2: ( ruleRaiseErrorConditional )
            {
            // InternalUseCase.g:6077:2: ( ruleRaiseErrorConditional )
            // InternalUseCase.g:6078:3: ruleRaiseErrorConditional
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
    // InternalUseCase.g:6087:1: rule__Step__ConditionAssignment_1_2 : ( ruleIfStatement ) ;
    public final void rule__Step__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6091:1: ( ( ruleIfStatement ) )
            // InternalUseCase.g:6092:2: ( ruleIfStatement )
            {
            // InternalUseCase.g:6092:2: ( ruleIfStatement )
            // InternalUseCase.g:6093:3: ruleIfStatement
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
    // InternalUseCase.g:6102:1: rule__Step__LoopAssignment_1_3 : ( ruleLoop ) ;
    public final void rule__Step__LoopAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6106:1: ( ( ruleLoop ) )
            // InternalUseCase.g:6107:2: ( ruleLoop )
            {
            // InternalUseCase.g:6107:2: ( ruleLoop )
            // InternalUseCase.g:6108:3: ruleLoop
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
    // InternalUseCase.g:6117:1: rule__Step__ExceptionAssignment_1_4 : ( ruleRaiseErrorNow ) ;
    public final void rule__Step__ExceptionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6121:1: ( ( ruleRaiseErrorNow ) )
            // InternalUseCase.g:6122:2: ( ruleRaiseErrorNow )
            {
            // InternalUseCase.g:6122:2: ( ruleRaiseErrorNow )
            // InternalUseCase.g:6123:3: ruleRaiseErrorNow
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
    // InternalUseCase.g:6132:1: rule__RaiseErrorConditional__ExceptionAssignment_2 : ( ruleException ) ;
    public final void rule__RaiseErrorConditional__ExceptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6136:1: ( ( ruleException ) )
            // InternalUseCase.g:6137:2: ( ruleException )
            {
            // InternalUseCase.g:6137:2: ( ruleException )
            // InternalUseCase.g:6138:3: ruleException
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
    // InternalUseCase.g:6147:1: rule__RaiseErrorNow__ExceptionAssignment_1 : ( ruleException ) ;
    public final void rule__RaiseErrorNow__ExceptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6151:1: ( ( ruleException ) )
            // InternalUseCase.g:6152:2: ( ruleException )
            {
            // InternalUseCase.g:6152:2: ( ruleException )
            // InternalUseCase.g:6153:3: ruleException
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
    // InternalUseCase.g:6162:1: rule__IfStatement__ConditionAssignment_1 : ( ruleBooleanCondition ) ;
    public final void rule__IfStatement__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6166:1: ( ( ruleBooleanCondition ) )
            // InternalUseCase.g:6167:2: ( ruleBooleanCondition )
            {
            // InternalUseCase.g:6167:2: ( ruleBooleanCondition )
            // InternalUseCase.g:6168:3: ruleBooleanCondition
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
    // InternalUseCase.g:6177:1: rule__Loop__ConditionAssignment_1 : ( ruleBooleanCondition ) ;
    public final void rule__Loop__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6181:1: ( ( ruleBooleanCondition ) )
            // InternalUseCase.g:6182:2: ( ruleBooleanCondition )
            {
            // InternalUseCase.g:6182:2: ( ruleBooleanCondition )
            // InternalUseCase.g:6183:3: ruleBooleanCondition
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
    // InternalUseCase.g:6192:1: rule__BooleanCondition__NameAssignment : ( RULE_STRING ) ;
    public final void rule__BooleanCondition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6196:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6197:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6197:2: ( RULE_STRING )
            // InternalUseCase.g:6198:3: RULE_STRING
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
    // InternalUseCase.g:6207:1: rule__Notes__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notes__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6211:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6212:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6212:2: ( RULE_STRING )
            // InternalUseCase.g:6213:3: RULE_STRING
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
    // InternalUseCase.g:6222:1: rule__UsedTypes__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__UsedTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6226:1: ( ( ruleType ) )
            // InternalUseCase.g:6227:2: ( ruleType )
            {
            // InternalUseCase.g:6227:2: ( ruleType )
            // InternalUseCase.g:6228:3: ruleType
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
    // InternalUseCase.g:6237:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6241:1: ( ( RULE_ID ) )
            // InternalUseCase.g:6242:2: ( RULE_ID )
            {
            // InternalUseCase.g:6242:2: ( RULE_ID )
            // InternalUseCase.g:6243:3: RULE_ID
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
    // InternalUseCase.g:6252:1: rule__Type__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Type__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6256:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6257:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6257:2: ( RULE_STRING )
            // InternalUseCase.g:6258:3: RULE_STRING
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
    // InternalUseCase.g:6267:1: rule__Type__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__Type__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6271:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:6272:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:6272:2: ( ruleQualifiedName )
            // InternalUseCase.g:6273:3: ruleQualifiedName
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
    // InternalUseCase.g:6282:1: rule__UsedExceptions__ExceptionsAssignment_1 : ( ruleExceptionDecleration ) ;
    public final void rule__UsedExceptions__ExceptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6286:1: ( ( ruleExceptionDecleration ) )
            // InternalUseCase.g:6287:2: ( ruleExceptionDecleration )
            {
            // InternalUseCase.g:6287:2: ( ruleExceptionDecleration )
            // InternalUseCase.g:6288:3: ruleExceptionDecleration
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
    // InternalUseCase.g:6297:1: rule__Exception__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Exception__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6301:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:6302:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:6302:2: ( ( RULE_ID ) )
            // InternalUseCase.g:6303:3: ( RULE_ID )
            {
             before(grammarAccess.getExceptionAccess().getTypeExceptionDeclerationCrossReference_0()); 
            // InternalUseCase.g:6304:3: ( RULE_ID )
            // InternalUseCase.g:6305:4: RULE_ID
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
    // InternalUseCase.g:6316:1: rule__ExceptionDecleration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExceptionDecleration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6320:1: ( ( RULE_ID ) )
            // InternalUseCase.g:6321:2: ( RULE_ID )
            {
            // InternalUseCase.g:6321:2: ( RULE_ID )
            // InternalUseCase.g:6322:3: RULE_ID
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
    // InternalUseCase.g:6331:1: rule__ExceptionDecleration__MessageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ExceptionDecleration__MessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6335:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:6336:2: ( RULE_STRING )
            {
            // InternalUseCase.g:6336:2: ( RULE_STRING )
            // InternalUseCase.g:6337:3: RULE_STRING
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
    // InternalUseCase.g:6346:1: rule__ExceptionDecleration__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__ExceptionDecleration__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:6350:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:6351:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:6351:2: ( ruleQualifiedName )
            // InternalUseCase.g:6352:3: ruleQualifiedName
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x8892BC0FF0FC0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0040000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2000000003000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000003F000000040L,0x0000000000000180L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});

}