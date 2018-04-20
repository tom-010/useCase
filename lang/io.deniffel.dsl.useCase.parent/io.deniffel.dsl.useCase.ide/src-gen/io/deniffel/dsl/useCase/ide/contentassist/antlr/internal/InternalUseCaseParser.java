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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'optional'", "'use-case'", "'Rezept'", "'description:'", "'Kurzbeschreibung:'", "'Beschreibung'", "'allowed-usergroups:'", "'requires:'", "'require:'", "'as'", "'als'", "'e.g'", "'z.B.'", "'Ergebnis:'", "'produces:'", "'produce:'", "'Vorbedingungen:'", "'pre-condition:'", "'pre-conditions:'", "'steps:'", "'Schritte:'", "'.'", "':'", "'notes:'", "'note:'", "'Anmerkungen:'", "'Anmerkung:'", "'end'", "'of'", "'Ende'", "'des'", "'Rezpets'", "'Erlaubt'", "'f\\u00FCr:'", "'-'", "'requires'", "'the'", "'following'", "'input'", "'Ben\\u00F6tigte'", "'Zutaten'", "'('", "')'", "'produces'", "'output'", "'Raise'", "'error'", "'On'", "'raise'", "'Melde'", "'Fehler'", "'Bei'", "'melde'", "'used'", "'types:'", "'Genutzte'", "'Typen:'", "'['", "']'", "'errors:'", "'Fehler:'", "'many'"
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


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCase.g:128:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // InternalUseCase.g:129:1: ( ruleUseCase EOF )
            // InternalUseCase.g:130:1: ruleUseCase EOF
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
    // InternalUseCase.g:137:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:141:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUseCase.g:142:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUseCase.g:142:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUseCase.g:143:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUseCase.g:144:3: ( rule__UseCase__Group__0 )
            // InternalUseCase.g:144:4: rule__UseCase__Group__0
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
    // InternalUseCase.g:153:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalUseCase.g:154:1: ( ruleDescription EOF )
            // InternalUseCase.g:155:1: ruleDescription EOF
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
    // InternalUseCase.g:162:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:166:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalUseCase.g:167:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalUseCase.g:167:2: ( ( rule__Description__Group__0 ) )
            // InternalUseCase.g:168:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalUseCase.g:169:3: ( rule__Description__Group__0 )
            // InternalUseCase.g:169:4: rule__Description__Group__0
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
    // InternalUseCase.g:178:1: entryRuleAllowedUserGroups : ruleAllowedUserGroups EOF ;
    public final void entryRuleAllowedUserGroups() throws RecognitionException {
        try {
            // InternalUseCase.g:179:1: ( ruleAllowedUserGroups EOF )
            // InternalUseCase.g:180:1: ruleAllowedUserGroups EOF
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
    // InternalUseCase.g:187:1: ruleAllowedUserGroups : ( ( rule__AllowedUserGroups__Group__0 ) ) ;
    public final void ruleAllowedUserGroups() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:191:2: ( ( ( rule__AllowedUserGroups__Group__0 ) ) )
            // InternalUseCase.g:192:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            {
            // InternalUseCase.g:192:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            // InternalUseCase.g:193:3: ( rule__AllowedUserGroups__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroup()); 
            // InternalUseCase.g:194:3: ( rule__AllowedUserGroups__Group__0 )
            // InternalUseCase.g:194:4: rule__AllowedUserGroups__Group__0
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
    // InternalUseCase.g:203:1: entryRuleAllowedUserGroup : ruleAllowedUserGroup EOF ;
    public final void entryRuleAllowedUserGroup() throws RecognitionException {
        try {
            // InternalUseCase.g:204:1: ( ruleAllowedUserGroup EOF )
            // InternalUseCase.g:205:1: ruleAllowedUserGroup EOF
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
    // InternalUseCase.g:212:1: ruleAllowedUserGroup : ( ( rule__AllowedUserGroup__Group__0 ) ) ;
    public final void ruleAllowedUserGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:216:2: ( ( ( rule__AllowedUserGroup__Group__0 ) ) )
            // InternalUseCase.g:217:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            {
            // InternalUseCase.g:217:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            // InternalUseCase.g:218:3: ( rule__AllowedUserGroup__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup()); 
            // InternalUseCase.g:219:3: ( rule__AllowedUserGroup__Group__0 )
            // InternalUseCase.g:219:4: rule__AllowedUserGroup__Group__0
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
    // InternalUseCase.g:228:1: entryRuleInputs : ruleInputs EOF ;
    public final void entryRuleInputs() throws RecognitionException {
        try {
            // InternalUseCase.g:229:1: ( ruleInputs EOF )
            // InternalUseCase.g:230:1: ruleInputs EOF
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
    // InternalUseCase.g:237:1: ruleInputs : ( ( rule__Inputs__Group__0 ) ) ;
    public final void ruleInputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:241:2: ( ( ( rule__Inputs__Group__0 ) ) )
            // InternalUseCase.g:242:2: ( ( rule__Inputs__Group__0 ) )
            {
            // InternalUseCase.g:242:2: ( ( rule__Inputs__Group__0 ) )
            // InternalUseCase.g:243:3: ( rule__Inputs__Group__0 )
            {
             before(grammarAccess.getInputsAccess().getGroup()); 
            // InternalUseCase.g:244:3: ( rule__Inputs__Group__0 )
            // InternalUseCase.g:244:4: rule__Inputs__Group__0
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
    // InternalUseCase.g:253:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalUseCase.g:254:1: ( ruleInput EOF )
            // InternalUseCase.g:255:1: ruleInput EOF
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
    // InternalUseCase.g:262:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:266:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalUseCase.g:267:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalUseCase.g:267:2: ( ( rule__Input__Group__0 ) )
            // InternalUseCase.g:268:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalUseCase.g:269:3: ( rule__Input__Group__0 )
            // InternalUseCase.g:269:4: rule__Input__Group__0
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
    // InternalUseCase.g:278:1: entryRuleOutputs : ruleOutputs EOF ;
    public final void entryRuleOutputs() throws RecognitionException {
        try {
            // InternalUseCase.g:279:1: ( ruleOutputs EOF )
            // InternalUseCase.g:280:1: ruleOutputs EOF
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
    // InternalUseCase.g:287:1: ruleOutputs : ( ( rule__Outputs__Group__0 ) ) ;
    public final void ruleOutputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:291:2: ( ( ( rule__Outputs__Group__0 ) ) )
            // InternalUseCase.g:292:2: ( ( rule__Outputs__Group__0 ) )
            {
            // InternalUseCase.g:292:2: ( ( rule__Outputs__Group__0 ) )
            // InternalUseCase.g:293:3: ( rule__Outputs__Group__0 )
            {
             before(grammarAccess.getOutputsAccess().getGroup()); 
            // InternalUseCase.g:294:3: ( rule__Outputs__Group__0 )
            // InternalUseCase.g:294:4: rule__Outputs__Group__0
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
    // InternalUseCase.g:303:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalUseCase.g:304:1: ( ruleOutput EOF )
            // InternalUseCase.g:305:1: ruleOutput EOF
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
    // InternalUseCase.g:312:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:316:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalUseCase.g:317:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalUseCase.g:317:2: ( ( rule__Output__Group__0 ) )
            // InternalUseCase.g:318:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalUseCase.g:319:3: ( rule__Output__Group__0 )
            // InternalUseCase.g:319:4: rule__Output__Group__0
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
    // InternalUseCase.g:328:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // InternalUseCase.g:329:1: ( ruleOptional EOF )
            // InternalUseCase.g:330:1: ruleOptional EOF
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
    // InternalUseCase.g:337:1: ruleOptional : ( 'optional' ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:341:2: ( ( 'optional' ) )
            // InternalUseCase.g:342:2: ( 'optional' )
            {
            // InternalUseCase.g:342:2: ( 'optional' )
            // InternalUseCase.g:343:3: 'optional'
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
    // InternalUseCase.g:353:1: entryRulePreConditions : rulePreConditions EOF ;
    public final void entryRulePreConditions() throws RecognitionException {
        try {
            // InternalUseCase.g:354:1: ( rulePreConditions EOF )
            // InternalUseCase.g:355:1: rulePreConditions EOF
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
    // InternalUseCase.g:362:1: rulePreConditions : ( ( rule__PreConditions__Group__0 ) ) ;
    public final void rulePreConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:366:2: ( ( ( rule__PreConditions__Group__0 ) ) )
            // InternalUseCase.g:367:2: ( ( rule__PreConditions__Group__0 ) )
            {
            // InternalUseCase.g:367:2: ( ( rule__PreConditions__Group__0 ) )
            // InternalUseCase.g:368:3: ( rule__PreConditions__Group__0 )
            {
             before(grammarAccess.getPreConditionsAccess().getGroup()); 
            // InternalUseCase.g:369:3: ( rule__PreConditions__Group__0 )
            // InternalUseCase.g:369:4: rule__PreConditions__Group__0
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
    // InternalUseCase.g:378:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalUseCase.g:379:1: ( ruleCondition EOF )
            // InternalUseCase.g:380:1: ruleCondition EOF
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
    // InternalUseCase.g:387:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:391:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalUseCase.g:392:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalUseCase.g:392:2: ( ( rule__Condition__Group__0 ) )
            // InternalUseCase.g:393:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalUseCase.g:394:3: ( rule__Condition__Group__0 )
            // InternalUseCase.g:394:4: rule__Condition__Group__0
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
    // InternalUseCase.g:403:1: entryRuleSteps : ruleSteps EOF ;
    public final void entryRuleSteps() throws RecognitionException {
        try {
            // InternalUseCase.g:404:1: ( ruleSteps EOF )
            // InternalUseCase.g:405:1: ruleSteps EOF
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
    // InternalUseCase.g:412:1: ruleSteps : ( ( rule__Steps__Group__0 ) ) ;
    public final void ruleSteps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:416:2: ( ( ( rule__Steps__Group__0 ) ) )
            // InternalUseCase.g:417:2: ( ( rule__Steps__Group__0 ) )
            {
            // InternalUseCase.g:417:2: ( ( rule__Steps__Group__0 ) )
            // InternalUseCase.g:418:3: ( rule__Steps__Group__0 )
            {
             before(grammarAccess.getStepsAccess().getGroup()); 
            // InternalUseCase.g:419:3: ( rule__Steps__Group__0 )
            // InternalUseCase.g:419:4: rule__Steps__Group__0
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
    // InternalUseCase.g:428:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalUseCase.g:429:1: ( ruleStep EOF )
            // InternalUseCase.g:430:1: ruleStep EOF
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
    // InternalUseCase.g:437:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:441:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalUseCase.g:442:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalUseCase.g:442:2: ( ( rule__Step__Group__0 ) )
            // InternalUseCase.g:443:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalUseCase.g:444:3: ( rule__Step__Group__0 )
            // InternalUseCase.g:444:4: rule__Step__Group__0
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
    // InternalUseCase.g:453:1: entryRuleRaiseError : ruleRaiseError EOF ;
    public final void entryRuleRaiseError() throws RecognitionException {
        try {
            // InternalUseCase.g:454:1: ( ruleRaiseError EOF )
            // InternalUseCase.g:455:1: ruleRaiseError EOF
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
    // InternalUseCase.g:462:1: ruleRaiseError : ( ( rule__RaiseError__Group__0 ) ) ;
    public final void ruleRaiseError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:466:2: ( ( ( rule__RaiseError__Group__0 ) ) )
            // InternalUseCase.g:467:2: ( ( rule__RaiseError__Group__0 ) )
            {
            // InternalUseCase.g:467:2: ( ( rule__RaiseError__Group__0 ) )
            // InternalUseCase.g:468:3: ( rule__RaiseError__Group__0 )
            {
             before(grammarAccess.getRaiseErrorAccess().getGroup()); 
            // InternalUseCase.g:469:3: ( rule__RaiseError__Group__0 )
            // InternalUseCase.g:469:4: rule__RaiseError__Group__0
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
    // InternalUseCase.g:478:1: entryRuleNotes : ruleNotes EOF ;
    public final void entryRuleNotes() throws RecognitionException {
        try {
            // InternalUseCase.g:479:1: ( ruleNotes EOF )
            // InternalUseCase.g:480:1: ruleNotes EOF
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
    // InternalUseCase.g:487:1: ruleNotes : ( ( rule__Notes__Group__0 ) ) ;
    public final void ruleNotes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:491:2: ( ( ( rule__Notes__Group__0 ) ) )
            // InternalUseCase.g:492:2: ( ( rule__Notes__Group__0 ) )
            {
            // InternalUseCase.g:492:2: ( ( rule__Notes__Group__0 ) )
            // InternalUseCase.g:493:3: ( rule__Notes__Group__0 )
            {
             before(grammarAccess.getNotesAccess().getGroup()); 
            // InternalUseCase.g:494:3: ( rule__Notes__Group__0 )
            // InternalUseCase.g:494:4: rule__Notes__Group__0
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
    // InternalUseCase.g:503:1: entryRuleUsedTypes : ruleUsedTypes EOF ;
    public final void entryRuleUsedTypes() throws RecognitionException {
        try {
            // InternalUseCase.g:504:1: ( ruleUsedTypes EOF )
            // InternalUseCase.g:505:1: ruleUsedTypes EOF
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
    // InternalUseCase.g:512:1: ruleUsedTypes : ( ( rule__UsedTypes__Group__0 ) ) ;
    public final void ruleUsedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:516:2: ( ( ( rule__UsedTypes__Group__0 ) ) )
            // InternalUseCase.g:517:2: ( ( rule__UsedTypes__Group__0 ) )
            {
            // InternalUseCase.g:517:2: ( ( rule__UsedTypes__Group__0 ) )
            // InternalUseCase.g:518:3: ( rule__UsedTypes__Group__0 )
            {
             before(grammarAccess.getUsedTypesAccess().getGroup()); 
            // InternalUseCase.g:519:3: ( rule__UsedTypes__Group__0 )
            // InternalUseCase.g:519:4: rule__UsedTypes__Group__0
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
    // InternalUseCase.g:528:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUseCase.g:529:1: ( ruleType EOF )
            // InternalUseCase.g:530:1: ruleType EOF
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
    // InternalUseCase.g:537:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:541:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalUseCase.g:542:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalUseCase.g:542:2: ( ( rule__Type__Group__0 ) )
            // InternalUseCase.g:543:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalUseCase.g:544:3: ( rule__Type__Group__0 )
            // InternalUseCase.g:544:4: rule__Type__Group__0
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
    // InternalUseCase.g:553:1: entryRuleUsedExceptions : ruleUsedExceptions EOF ;
    public final void entryRuleUsedExceptions() throws RecognitionException {
        try {
            // InternalUseCase.g:554:1: ( ruleUsedExceptions EOF )
            // InternalUseCase.g:555:1: ruleUsedExceptions EOF
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
    // InternalUseCase.g:562:1: ruleUsedExceptions : ( ( rule__UsedExceptions__Group__0 ) ) ;
    public final void ruleUsedExceptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:566:2: ( ( ( rule__UsedExceptions__Group__0 ) ) )
            // InternalUseCase.g:567:2: ( ( rule__UsedExceptions__Group__0 ) )
            {
            // InternalUseCase.g:567:2: ( ( rule__UsedExceptions__Group__0 ) )
            // InternalUseCase.g:568:3: ( rule__UsedExceptions__Group__0 )
            {
             before(grammarAccess.getUsedExceptionsAccess().getGroup()); 
            // InternalUseCase.g:569:3: ( rule__UsedExceptions__Group__0 )
            // InternalUseCase.g:569:4: rule__UsedExceptions__Group__0
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
    // InternalUseCase.g:578:1: entryRuleException : ruleException EOF ;
    public final void entryRuleException() throws RecognitionException {
        try {
            // InternalUseCase.g:579:1: ( ruleException EOF )
            // InternalUseCase.g:580:1: ruleException EOF
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
    // InternalUseCase.g:587:1: ruleException : ( ( rule__Exception__TypeAssignment ) ) ;
    public final void ruleException() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:591:2: ( ( ( rule__Exception__TypeAssignment ) ) )
            // InternalUseCase.g:592:2: ( ( rule__Exception__TypeAssignment ) )
            {
            // InternalUseCase.g:592:2: ( ( rule__Exception__TypeAssignment ) )
            // InternalUseCase.g:593:3: ( rule__Exception__TypeAssignment )
            {
             before(grammarAccess.getExceptionAccess().getTypeAssignment()); 
            // InternalUseCase.g:594:3: ( rule__Exception__TypeAssignment )
            // InternalUseCase.g:594:4: rule__Exception__TypeAssignment
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
    // InternalUseCase.g:603:1: entryRuleExceptionDecleration : ruleExceptionDecleration EOF ;
    public final void entryRuleExceptionDecleration() throws RecognitionException {
        try {
            // InternalUseCase.g:604:1: ( ruleExceptionDecleration EOF )
            // InternalUseCase.g:605:1: ruleExceptionDecleration EOF
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
    // InternalUseCase.g:612:1: ruleExceptionDecleration : ( ( rule__ExceptionDecleration__Group__0 ) ) ;
    public final void ruleExceptionDecleration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:616:2: ( ( ( rule__ExceptionDecleration__Group__0 ) ) )
            // InternalUseCase.g:617:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            {
            // InternalUseCase.g:617:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            // InternalUseCase.g:618:3: ( rule__ExceptionDecleration__Group__0 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup()); 
            // InternalUseCase.g:619:3: ( rule__ExceptionDecleration__Group__0 )
            // InternalUseCase.g:619:4: rule__ExceptionDecleration__Group__0
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


    // $ANTLR start "rule__UseCase__Alternatives_0"
    // InternalUseCase.g:627:1: rule__UseCase__Alternatives_0 : ( ( 'use-case' ) | ( 'Rezept' ) );
    public final void rule__UseCase__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:631:1: ( ( 'use-case' ) | ( 'Rezept' ) )
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
                    // InternalUseCase.g:632:2: ( 'use-case' )
                    {
                    // InternalUseCase.g:632:2: ( 'use-case' )
                    // InternalUseCase.g:633:3: 'use-case'
                    {
                     before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:638:2: ( 'Rezept' )
                    {
                    // InternalUseCase.g:638:2: ( 'Rezept' )
                    // InternalUseCase.g:639:3: 'Rezept'
                    {
                     before(grammarAccess.getUseCaseAccess().getRezeptKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalUseCase.g:648:1: rule__UseCase__Alternatives_9 : ( ( ( rule__UseCase__Group_9_0__0 ) ) | ( ( rule__UseCase__Group_9_1__0 ) ) );
    public final void rule__UseCase__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:652:1: ( ( ( rule__UseCase__Group_9_0__0 ) ) | ( ( rule__UseCase__Group_9_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==38) ) {
                alt2=1;
            }
            else if ( (LA2_0==40) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCase.g:653:2: ( ( rule__UseCase__Group_9_0__0 ) )
                    {
                    // InternalUseCase.g:653:2: ( ( rule__UseCase__Group_9_0__0 ) )
                    // InternalUseCase.g:654:3: ( rule__UseCase__Group_9_0__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_9_0()); 
                    // InternalUseCase.g:655:3: ( rule__UseCase__Group_9_0__0 )
                    // InternalUseCase.g:655:4: rule__UseCase__Group_9_0__0
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
                    // InternalUseCase.g:659:2: ( ( rule__UseCase__Group_9_1__0 ) )
                    {
                    // InternalUseCase.g:659:2: ( ( rule__UseCase__Group_9_1__0 ) )
                    // InternalUseCase.g:660:3: ( rule__UseCase__Group_9_1__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_9_1()); 
                    // InternalUseCase.g:661:3: ( rule__UseCase__Group_9_1__0 )
                    // InternalUseCase.g:661:4: rule__UseCase__Group_9_1__0
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
    // InternalUseCase.g:669:1: rule__Description__Alternatives_0 : ( ( 'description:' ) | ( 'Kurzbeschreibung:' ) | ( 'Beschreibung' ) );
    public final void rule__Description__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:673:1: ( ( 'description:' ) | ( 'Kurzbeschreibung:' ) | ( 'Beschreibung' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUseCase.g:674:2: ( 'description:' )
                    {
                    // InternalUseCase.g:674:2: ( 'description:' )
                    // InternalUseCase.g:675:3: 'description:'
                    {
                     before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:680:2: ( 'Kurzbeschreibung:' )
                    {
                    // InternalUseCase.g:680:2: ( 'Kurzbeschreibung:' )
                    // InternalUseCase.g:681:3: 'Kurzbeschreibung:'
                    {
                     before(grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:686:2: ( 'Beschreibung' )
                    {
                    // InternalUseCase.g:686:2: ( 'Beschreibung' )
                    // InternalUseCase.g:687:3: 'Beschreibung'
                    {
                     before(grammarAccess.getDescriptionAccess().getBeschreibungKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalUseCase.g:696:1: rule__AllowedUserGroups__Alternatives_0 : ( ( 'allowed-usergroups:' ) | ( ( rule__AllowedUserGroups__Group_0_1__0 ) ) );
    public final void rule__AllowedUserGroups__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:700:1: ( ( 'allowed-usergroups:' ) | ( ( rule__AllowedUserGroups__Group_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==43) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:701:2: ( 'allowed-usergroups:' )
                    {
                    // InternalUseCase.g:701:2: ( 'allowed-usergroups:' )
                    // InternalUseCase.g:702:3: 'allowed-usergroups:'
                    {
                     before(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:707:2: ( ( rule__AllowedUserGroups__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:707:2: ( ( rule__AllowedUserGroups__Group_0_1__0 ) )
                    // InternalUseCase.g:708:3: ( rule__AllowedUserGroups__Group_0_1__0 )
                    {
                     before(grammarAccess.getAllowedUserGroupsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:709:3: ( rule__AllowedUserGroups__Group_0_1__0 )
                    // InternalUseCase.g:709:4: rule__AllowedUserGroups__Group_0_1__0
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
    // InternalUseCase.g:717:1: rule__Inputs__Alternatives_0 : ( ( ( rule__Inputs__Alternatives_0_0 ) ) | ( ( rule__Inputs__Group_0_1__0 ) ) );
    public final void rule__Inputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:721:1: ( ( ( rule__Inputs__Alternatives_0_0 ) ) | ( ( rule__Inputs__Group_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=18 && LA5_0<=19)||LA5_0==46) ) {
                alt5=1;
            }
            else if ( (LA5_0==50) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCase.g:722:2: ( ( rule__Inputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:722:2: ( ( rule__Inputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:723:3: ( rule__Inputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getInputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:724:3: ( rule__Inputs__Alternatives_0_0 )
                    // InternalUseCase.g:724:4: rule__Inputs__Alternatives_0_0
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
                    // InternalUseCase.g:728:2: ( ( rule__Inputs__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:728:2: ( ( rule__Inputs__Group_0_1__0 ) )
                    // InternalUseCase.g:729:3: ( rule__Inputs__Group_0_1__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:730:3: ( rule__Inputs__Group_0_1__0 )
                    // InternalUseCase.g:730:4: rule__Inputs__Group_0_1__0
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
    // InternalUseCase.g:738:1: rule__Inputs__Alternatives_0_0 : ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_0_2__0 ) ) );
    public final void rule__Inputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:742:1: ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_0_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 46:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:743:2: ( 'requires:' )
                    {
                    // InternalUseCase.g:743:2: ( 'requires:' )
                    // InternalUseCase.g:744:3: 'requires:'
                    {
                     before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:749:2: ( 'require:' )
                    {
                    // InternalUseCase.g:749:2: ( 'require:' )
                    // InternalUseCase.g:750:3: 'require:'
                    {
                     before(grammarAccess.getInputsAccess().getRequireKeyword_0_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequireKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:755:2: ( ( rule__Inputs__Group_0_0_2__0 ) )
                    {
                    // InternalUseCase.g:755:2: ( ( rule__Inputs__Group_0_0_2__0 ) )
                    // InternalUseCase.g:756:3: ( rule__Inputs__Group_0_0_2__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_0_2()); 
                    // InternalUseCase.g:757:3: ( rule__Inputs__Group_0_0_2__0 )
                    // InternalUseCase.g:757:4: rule__Inputs__Group_0_0_2__0
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
    // InternalUseCase.g:765:1: rule__Input__Alternatives_4_0 : ( ( 'as' ) | ( 'als' ) );
    public final void rule__Input__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:769:1: ( ( 'as' ) | ( 'als' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:770:2: ( 'as' )
                    {
                    // InternalUseCase.g:770:2: ( 'as' )
                    // InternalUseCase.g:771:3: 'as'
                    {
                     before(grammarAccess.getInputAccess().getAsKeyword_4_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getAsKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:776:2: ( 'als' )
                    {
                    // InternalUseCase.g:776:2: ( 'als' )
                    // InternalUseCase.g:777:3: 'als'
                    {
                     before(grammarAccess.getInputAccess().getAlsKeyword_4_0_1()); 
                    match(input,21,FOLLOW_2); 
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
    // InternalUseCase.g:786:1: rule__Input__Alternatives_5_1 : ( ( 'e.g' ) | ( 'z.B.' ) );
    public final void rule__Input__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:790:1: ( ( 'e.g' ) | ( 'z.B.' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:791:2: ( 'e.g' )
                    {
                    // InternalUseCase.g:791:2: ( 'e.g' )
                    // InternalUseCase.g:792:3: 'e.g'
                    {
                     before(grammarAccess.getInputAccess().getEGKeyword_5_1_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getInputAccess().getEGKeyword_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:797:2: ( 'z.B.' )
                    {
                    // InternalUseCase.g:797:2: ( 'z.B.' )
                    // InternalUseCase.g:798:3: 'z.B.'
                    {
                     before(grammarAccess.getInputAccess().getZBKeyword_5_1_1()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalUseCase.g:807:1: rule__Outputs__Alternatives_0 : ( ( ( rule__Outputs__Alternatives_0_0 ) ) | ( 'Ergebnis:' ) );
    public final void rule__Outputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:811:1: ( ( ( rule__Outputs__Alternatives_0_0 ) ) | ( 'Ergebnis:' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=25 && LA9_0<=26)||LA9_0==54) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUseCase.g:812:2: ( ( rule__Outputs__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:812:2: ( ( rule__Outputs__Alternatives_0_0 ) )
                    // InternalUseCase.g:813:3: ( rule__Outputs__Alternatives_0_0 )
                    {
                     before(grammarAccess.getOutputsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:814:3: ( rule__Outputs__Alternatives_0_0 )
                    // InternalUseCase.g:814:4: rule__Outputs__Alternatives_0_0
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
                    // InternalUseCase.g:818:2: ( 'Ergebnis:' )
                    {
                    // InternalUseCase.g:818:2: ( 'Ergebnis:' )
                    // InternalUseCase.g:819:3: 'Ergebnis:'
                    {
                     before(grammarAccess.getOutputsAccess().getErgebnisKeyword_0_1()); 
                    match(input,24,FOLLOW_2); 
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
    // InternalUseCase.g:828:1: rule__Outputs__Alternatives_0_0 : ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_0_2__0 ) ) );
    public final void rule__Outputs__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:832:1: ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_0_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 54:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUseCase.g:833:2: ( 'produces:' )
                    {
                    // InternalUseCase.g:833:2: ( 'produces:' )
                    // InternalUseCase.g:834:3: 'produces:'
                    {
                     before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:839:2: ( 'produce:' )
                    {
                    // InternalUseCase.g:839:2: ( 'produce:' )
                    // InternalUseCase.g:840:3: 'produce:'
                    {
                     before(grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:845:2: ( ( rule__Outputs__Group_0_0_2__0 ) )
                    {
                    // InternalUseCase.g:845:2: ( ( rule__Outputs__Group_0_0_2__0 ) )
                    // InternalUseCase.g:846:3: ( rule__Outputs__Group_0_0_2__0 )
                    {
                     before(grammarAccess.getOutputsAccess().getGroup_0_0_2()); 
                    // InternalUseCase.g:847:3: ( rule__Outputs__Group_0_0_2__0 )
                    // InternalUseCase.g:847:4: rule__Outputs__Group_0_0_2__0
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
    // InternalUseCase.g:855:1: rule__Output__Alternatives_3_0 : ( ( 'as' ) | ( 'als' ) );
    public final void rule__Output__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:859:1: ( ( 'as' ) | ( 'als' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:860:2: ( 'as' )
                    {
                    // InternalUseCase.g:860:2: ( 'as' )
                    // InternalUseCase.g:861:3: 'as'
                    {
                     before(grammarAccess.getOutputAccess().getAsKeyword_3_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getAsKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:866:2: ( 'als' )
                    {
                    // InternalUseCase.g:866:2: ( 'als' )
                    // InternalUseCase.g:867:3: 'als'
                    {
                     before(grammarAccess.getOutputAccess().getAlsKeyword_3_0_1()); 
                    match(input,21,FOLLOW_2); 
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
    // InternalUseCase.g:876:1: rule__Output__Alternatives_4_1 : ( ( 'e.g' ) | ( 'z.B.' ) );
    public final void rule__Output__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:880:1: ( ( 'e.g' ) | ( 'z.B.' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCase.g:881:2: ( 'e.g' )
                    {
                    // InternalUseCase.g:881:2: ( 'e.g' )
                    // InternalUseCase.g:882:3: 'e.g'
                    {
                     before(grammarAccess.getOutputAccess().getEGKeyword_4_1_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getEGKeyword_4_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:887:2: ( 'z.B.' )
                    {
                    // InternalUseCase.g:887:2: ( 'z.B.' )
                    // InternalUseCase.g:888:3: 'z.B.'
                    {
                     before(grammarAccess.getOutputAccess().getZBKeyword_4_1_1()); 
                    match(input,23,FOLLOW_2); 
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
    // InternalUseCase.g:897:1: rule__PreConditions__Alternatives_0 : ( ( ( rule__PreConditions__Alternatives_0_0 ) ) | ( 'Vorbedingungen:' ) );
    public final void rule__PreConditions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:901:1: ( ( ( rule__PreConditions__Alternatives_0_0 ) ) | ( 'Vorbedingungen:' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=28 && LA13_0<=29)) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCase.g:902:2: ( ( rule__PreConditions__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:902:2: ( ( rule__PreConditions__Alternatives_0_0 ) )
                    // InternalUseCase.g:903:3: ( rule__PreConditions__Alternatives_0_0 )
                    {
                     before(grammarAccess.getPreConditionsAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:904:3: ( rule__PreConditions__Alternatives_0_0 )
                    // InternalUseCase.g:904:4: rule__PreConditions__Alternatives_0_0
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
                    // InternalUseCase.g:908:2: ( 'Vorbedingungen:' )
                    {
                    // InternalUseCase.g:908:2: ( 'Vorbedingungen:' )
                    // InternalUseCase.g:909:3: 'Vorbedingungen:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getVorbedingungenKeyword_0_1()); 
                    match(input,27,FOLLOW_2); 
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
    // InternalUseCase.g:918:1: rule__PreConditions__Alternatives_0_0 : ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) );
    public final void rule__PreConditions__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:922:1: ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCase.g:923:2: ( 'pre-condition:' )
                    {
                    // InternalUseCase.g:923:2: ( 'pre-condition:' )
                    // InternalUseCase.g:924:3: 'pre-condition:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:929:2: ( 'pre-conditions:' )
                    {
                    // InternalUseCase.g:929:2: ( 'pre-conditions:' )
                    // InternalUseCase.g:930:3: 'pre-conditions:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getPreConditionsKeyword_0_0_1()); 
                    match(input,29,FOLLOW_2); 
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
    // InternalUseCase.g:939:1: rule__Steps__Alternatives_0 : ( ( 'steps:' ) | ( 'Schritte:' ) );
    public final void rule__Steps__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:943:1: ( ( 'steps:' ) | ( 'Schritte:' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
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
                    // InternalUseCase.g:944:2: ( 'steps:' )
                    {
                    // InternalUseCase.g:944:2: ( 'steps:' )
                    // InternalUseCase.g:945:3: 'steps:'
                    {
                     before(grammarAccess.getStepsAccess().getStepsKeyword_0_0()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getStepsAccess().getStepsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:950:2: ( 'Schritte:' )
                    {
                    // InternalUseCase.g:950:2: ( 'Schritte:' )
                    // InternalUseCase.g:951:3: 'Schritte:'
                    {
                     before(grammarAccess.getStepsAccess().getSchritteKeyword_0_1()); 
                    match(input,31,FOLLOW_2); 
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
    // InternalUseCase.g:960:1: rule__RaiseError__Alternatives_0 : ( ( '.' ) | ( ':' ) );
    public final void rule__RaiseError__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:964:1: ( ( '.' ) | ( ':' ) )
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
                    // InternalUseCase.g:965:2: ( '.' )
                    {
                    // InternalUseCase.g:965:2: ( '.' )
                    // InternalUseCase.g:966:3: '.'
                    {
                     before(grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0_0()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:971:2: ( ':' )
                    {
                    // InternalUseCase.g:971:2: ( ':' )
                    // InternalUseCase.g:972:3: ':'
                    {
                     before(grammarAccess.getRaiseErrorAccess().getColonKeyword_0_1()); 
                    match(input,33,FOLLOW_2); 
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
    // InternalUseCase.g:981:1: rule__RaiseError__Alternatives_1 : ( ( ( rule__RaiseError__Alternatives_1_0 ) ) | ( ( rule__RaiseError__Alternatives_1_1 ) ) );
    public final void rule__RaiseError__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:985:1: ( ( ( rule__RaiseError__Alternatives_1_0 ) ) | ( ( rule__RaiseError__Alternatives_1_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==56||LA17_0==58) ) {
                alt17=1;
            }
            else if ( (LA17_0==60||LA17_0==62) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCase.g:986:2: ( ( rule__RaiseError__Alternatives_1_0 ) )
                    {
                    // InternalUseCase.g:986:2: ( ( rule__RaiseError__Alternatives_1_0 ) )
                    // InternalUseCase.g:987:3: ( rule__RaiseError__Alternatives_1_0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getAlternatives_1_0()); 
                    // InternalUseCase.g:988:3: ( rule__RaiseError__Alternatives_1_0 )
                    // InternalUseCase.g:988:4: rule__RaiseError__Alternatives_1_0
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
                    // InternalUseCase.g:992:2: ( ( rule__RaiseError__Alternatives_1_1 ) )
                    {
                    // InternalUseCase.g:992:2: ( ( rule__RaiseError__Alternatives_1_1 ) )
                    // InternalUseCase.g:993:3: ( rule__RaiseError__Alternatives_1_1 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getAlternatives_1_1()); 
                    // InternalUseCase.g:994:3: ( rule__RaiseError__Alternatives_1_1 )
                    // InternalUseCase.g:994:4: rule__RaiseError__Alternatives_1_1
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
    // InternalUseCase.g:1002:1: rule__RaiseError__Alternatives_1_0 : ( ( ( rule__RaiseError__Group_1_0_0__0 ) ) | ( ( rule__RaiseError__Group_1_0_1__0 ) ) );
    public final void rule__RaiseError__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1006:1: ( ( ( rule__RaiseError__Group_1_0_0__0 ) ) | ( ( rule__RaiseError__Group_1_0_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==56) ) {
                alt18=1;
            }
            else if ( (LA18_0==58) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCase.g:1007:2: ( ( rule__RaiseError__Group_1_0_0__0 ) )
                    {
                    // InternalUseCase.g:1007:2: ( ( rule__RaiseError__Group_1_0_0__0 ) )
                    // InternalUseCase.g:1008:3: ( rule__RaiseError__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getGroup_1_0_0()); 
                    // InternalUseCase.g:1009:3: ( rule__RaiseError__Group_1_0_0__0 )
                    // InternalUseCase.g:1009:4: rule__RaiseError__Group_1_0_0__0
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
                    // InternalUseCase.g:1013:2: ( ( rule__RaiseError__Group_1_0_1__0 ) )
                    {
                    // InternalUseCase.g:1013:2: ( ( rule__RaiseError__Group_1_0_1__0 ) )
                    // InternalUseCase.g:1014:3: ( rule__RaiseError__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getGroup_1_0_1()); 
                    // InternalUseCase.g:1015:3: ( rule__RaiseError__Group_1_0_1__0 )
                    // InternalUseCase.g:1015:4: rule__RaiseError__Group_1_0_1__0
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
    // InternalUseCase.g:1023:1: rule__RaiseError__Alternatives_1_1 : ( ( ( rule__RaiseError__Group_1_1_0__0 ) ) | ( ( rule__RaiseError__Group_1_1_1__0 ) ) );
    public final void rule__RaiseError__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1027:1: ( ( ( rule__RaiseError__Group_1_1_0__0 ) ) | ( ( rule__RaiseError__Group_1_1_1__0 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==60) ) {
                alt19=1;
            }
            else if ( (LA19_0==62) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCase.g:1028:2: ( ( rule__RaiseError__Group_1_1_0__0 ) )
                    {
                    // InternalUseCase.g:1028:2: ( ( rule__RaiseError__Group_1_1_0__0 ) )
                    // InternalUseCase.g:1029:3: ( rule__RaiseError__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getGroup_1_1_0()); 
                    // InternalUseCase.g:1030:3: ( rule__RaiseError__Group_1_1_0__0 )
                    // InternalUseCase.g:1030:4: rule__RaiseError__Group_1_1_0__0
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
                    // InternalUseCase.g:1034:2: ( ( rule__RaiseError__Group_1_1_1__0 ) )
                    {
                    // InternalUseCase.g:1034:2: ( ( rule__RaiseError__Group_1_1_1__0 ) )
                    // InternalUseCase.g:1035:3: ( rule__RaiseError__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getGroup_1_1_1()); 
                    // InternalUseCase.g:1036:3: ( rule__RaiseError__Group_1_1_1__0 )
                    // InternalUseCase.g:1036:4: rule__RaiseError__Group_1_1_1__0
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
    // InternalUseCase.g:1044:1: rule__Notes__Alternatives_0 : ( ( ( rule__Notes__Alternatives_0_0 ) ) | ( ( rule__Notes__Alternatives_0_1 ) ) );
    public final void rule__Notes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1048:1: ( ( ( rule__Notes__Alternatives_0_0 ) ) | ( ( rule__Notes__Alternatives_0_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=34 && LA20_0<=35)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=36 && LA20_0<=37)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCase.g:1049:2: ( ( rule__Notes__Alternatives_0_0 ) )
                    {
                    // InternalUseCase.g:1049:2: ( ( rule__Notes__Alternatives_0_0 ) )
                    // InternalUseCase.g:1050:3: ( rule__Notes__Alternatives_0_0 )
                    {
                     before(grammarAccess.getNotesAccess().getAlternatives_0_0()); 
                    // InternalUseCase.g:1051:3: ( rule__Notes__Alternatives_0_0 )
                    // InternalUseCase.g:1051:4: rule__Notes__Alternatives_0_0
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
                    // InternalUseCase.g:1055:2: ( ( rule__Notes__Alternatives_0_1 ) )
                    {
                    // InternalUseCase.g:1055:2: ( ( rule__Notes__Alternatives_0_1 ) )
                    // InternalUseCase.g:1056:3: ( rule__Notes__Alternatives_0_1 )
                    {
                     before(grammarAccess.getNotesAccess().getAlternatives_0_1()); 
                    // InternalUseCase.g:1057:3: ( rule__Notes__Alternatives_0_1 )
                    // InternalUseCase.g:1057:4: rule__Notes__Alternatives_0_1
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
    // InternalUseCase.g:1065:1: rule__Notes__Alternatives_0_0 : ( ( 'notes:' ) | ( 'note:' ) );
    public final void rule__Notes__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1069:1: ( ( 'notes:' ) | ( 'note:' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            else if ( (LA21_0==35) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:1070:2: ( 'notes:' )
                    {
                    // InternalUseCase.g:1070:2: ( 'notes:' )
                    // InternalUseCase.g:1071:3: 'notes:'
                    {
                     before(grammarAccess.getNotesAccess().getNotesKeyword_0_0_0()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getNotesKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1076:2: ( 'note:' )
                    {
                    // InternalUseCase.g:1076:2: ( 'note:' )
                    // InternalUseCase.g:1077:3: 'note:'
                    {
                     before(grammarAccess.getNotesAccess().getNoteKeyword_0_0_1()); 
                    match(input,35,FOLLOW_2); 
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
    // InternalUseCase.g:1086:1: rule__Notes__Alternatives_0_1 : ( ( 'Anmerkungen:' ) | ( 'Anmerkung:' ) );
    public final void rule__Notes__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1090:1: ( ( 'Anmerkungen:' ) | ( 'Anmerkung:' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            else if ( (LA22_0==37) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:1091:2: ( 'Anmerkungen:' )
                    {
                    // InternalUseCase.g:1091:2: ( 'Anmerkungen:' )
                    // InternalUseCase.g:1092:3: 'Anmerkungen:'
                    {
                     before(grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1097:2: ( 'Anmerkung:' )
                    {
                    // InternalUseCase.g:1097:2: ( 'Anmerkung:' )
                    // InternalUseCase.g:1098:3: 'Anmerkung:'
                    {
                     before(grammarAccess.getNotesAccess().getAnmerkungKeyword_0_1_1()); 
                    match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:1107:1: rule__UsedTypes__Alternatives_0 : ( ( ( rule__UsedTypes__Group_0_0__0 ) ) | ( ( rule__UsedTypes__Group_0_1__0 ) ) );
    public final void rule__UsedTypes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1111:1: ( ( ( rule__UsedTypes__Group_0_0__0 ) ) | ( ( rule__UsedTypes__Group_0_1__0 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==64) ) {
                alt23=1;
            }
            else if ( (LA23_0==66) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:1112:2: ( ( rule__UsedTypes__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1112:2: ( ( rule__UsedTypes__Group_0_0__0 ) )
                    // InternalUseCase.g:1113:3: ( rule__UsedTypes__Group_0_0__0 )
                    {
                     before(grammarAccess.getUsedTypesAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1114:3: ( rule__UsedTypes__Group_0_0__0 )
                    // InternalUseCase.g:1114:4: rule__UsedTypes__Group_0_0__0
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
                    // InternalUseCase.g:1118:2: ( ( rule__UsedTypes__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1118:2: ( ( rule__UsedTypes__Group_0_1__0 ) )
                    // InternalUseCase.g:1119:3: ( rule__UsedTypes__Group_0_1__0 )
                    {
                     before(grammarAccess.getUsedTypesAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1120:3: ( rule__UsedTypes__Group_0_1__0 )
                    // InternalUseCase.g:1120:4: rule__UsedTypes__Group_0_1__0
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
    // InternalUseCase.g:1128:1: rule__UsedExceptions__Alternatives_0 : ( ( ( rule__UsedExceptions__Group_0_0__0 ) ) | ( ( rule__UsedExceptions__Group_0_1__0 ) ) );
    public final void rule__UsedExceptions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1132:1: ( ( ( rule__UsedExceptions__Group_0_0__0 ) ) | ( ( rule__UsedExceptions__Group_0_1__0 ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==64) ) {
                alt24=1;
            }
            else if ( (LA24_0==66) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:1133:2: ( ( rule__UsedExceptions__Group_0_0__0 ) )
                    {
                    // InternalUseCase.g:1133:2: ( ( rule__UsedExceptions__Group_0_0__0 ) )
                    // InternalUseCase.g:1134:3: ( rule__UsedExceptions__Group_0_0__0 )
                    {
                     before(grammarAccess.getUsedExceptionsAccess().getGroup_0_0()); 
                    // InternalUseCase.g:1135:3: ( rule__UsedExceptions__Group_0_0__0 )
                    // InternalUseCase.g:1135:4: rule__UsedExceptions__Group_0_0__0
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
                    // InternalUseCase.g:1139:2: ( ( rule__UsedExceptions__Group_0_1__0 ) )
                    {
                    // InternalUseCase.g:1139:2: ( ( rule__UsedExceptions__Group_0_1__0 ) )
                    // InternalUseCase.g:1140:3: ( rule__UsedExceptions__Group_0_1__0 )
                    {
                     before(grammarAccess.getUsedExceptionsAccess().getGroup_0_1()); 
                    // InternalUseCase.g:1141:3: ( rule__UsedExceptions__Group_0_1__0 )
                    // InternalUseCase.g:1141:4: rule__UsedExceptions__Group_0_1__0
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
    // InternalUseCase.g:1149:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1153:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUseCase.g:1154:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalUseCase.g:1161:1: rule__Model__Group__0__Impl : ( ( rule__Model__UseCasesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1165:1: ( ( ( rule__Model__UseCasesAssignment_0 )* ) )
            // InternalUseCase.g:1166:1: ( ( rule__Model__UseCasesAssignment_0 )* )
            {
            // InternalUseCase.g:1166:1: ( ( rule__Model__UseCasesAssignment_0 )* )
            // InternalUseCase.g:1167:2: ( rule__Model__UseCasesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getUseCasesAssignment_0()); 
            // InternalUseCase.g:1168:2: ( rule__Model__UseCasesAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=12 && LA25_0<=13)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalUseCase.g:1168:3: rule__Model__UseCasesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__UseCasesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getUseCasesAssignment_0()); 

            }


            }

        }
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
    // InternalUseCase.g:1176:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1180:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUseCase.g:1181:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalUseCase.g:1188:1: rule__Model__Group__1__Impl : ( ( rule__Model__TypesAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1192:1: ( ( ( rule__Model__TypesAssignment_1 ) ) )
            // InternalUseCase.g:1193:1: ( ( rule__Model__TypesAssignment_1 ) )
            {
            // InternalUseCase.g:1193:1: ( ( rule__Model__TypesAssignment_1 ) )
            // InternalUseCase.g:1194:2: ( rule__Model__TypesAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_1()); 
            // InternalUseCase.g:1195:2: ( rule__Model__TypesAssignment_1 )
            // InternalUseCase.g:1195:3: rule__Model__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTypesAssignment_1()); 

            }


            }

        }
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
    // InternalUseCase.g:1203:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1207:1: ( rule__Model__Group__2__Impl )
            // InternalUseCase.g:1208:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:1214:1: rule__Model__Group__2__Impl : ( ( rule__Model__ExceptionsAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1218:1: ( ( ( rule__Model__ExceptionsAssignment_2 ) ) )
            // InternalUseCase.g:1219:1: ( ( rule__Model__ExceptionsAssignment_2 ) )
            {
            // InternalUseCase.g:1219:1: ( ( rule__Model__ExceptionsAssignment_2 ) )
            // InternalUseCase.g:1220:2: ( rule__Model__ExceptionsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getExceptionsAssignment_2()); 
            // InternalUseCase.g:1221:2: ( rule__Model__ExceptionsAssignment_2 )
            // InternalUseCase.g:1221:3: rule__Model__ExceptionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__ExceptionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExceptionsAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalUseCase.g:1230:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1234:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUseCase.g:1235:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:1242:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1246:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1247:1: ( RULE_ID )
            {
            // InternalUseCase.g:1247:1: ( RULE_ID )
            // InternalUseCase.g:1248:2: RULE_ID
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
    // InternalUseCase.g:1257:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1261:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUseCase.g:1262:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUseCase.g:1268:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1272:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUseCase.g:1273:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUseCase.g:1273:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUseCase.g:1274:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUseCase.g:1275:2: ( rule__QualifiedName__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==32) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUseCase.g:1275:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalUseCase.g:1284:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1288:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUseCase.g:1289:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:1296:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1300:1: ( ( '.' ) )
            // InternalUseCase.g:1301:1: ( '.' )
            {
            // InternalUseCase.g:1301:1: ( '.' )
            // InternalUseCase.g:1302:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUseCase.g:1311:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1315:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUseCase.g:1316:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUseCase.g:1322:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1326:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1327:1: ( RULE_ID )
            {
            // InternalUseCase.g:1327:1: ( RULE_ID )
            // InternalUseCase.g:1328:2: RULE_ID
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
    // InternalUseCase.g:1338:1: rule__QualifiedNumber__Group__0 : rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 ;
    public final void rule__QualifiedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1342:1: ( rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 )
            // InternalUseCase.g:1343:2: rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:1350:1: rule__QualifiedNumber__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1354:1: ( ( RULE_INT ) )
            // InternalUseCase.g:1355:1: ( RULE_INT )
            {
            // InternalUseCase.g:1355:1: ( RULE_INT )
            // InternalUseCase.g:1356:2: RULE_INT
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
    // InternalUseCase.g:1365:1: rule__QualifiedNumber__Group__1 : rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 ;
    public final void rule__QualifiedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1369:1: ( rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 )
            // InternalUseCase.g:1370:2: rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:1377:1: rule__QualifiedNumber__Group__1__Impl : ( ( rule__QualifiedNumber__Group_1__0 )* ) ;
    public final void rule__QualifiedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1381:1: ( ( ( rule__QualifiedNumber__Group_1__0 )* ) )
            // InternalUseCase.g:1382:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            {
            // InternalUseCase.g:1382:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            // InternalUseCase.g:1383:2: ( rule__QualifiedNumber__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup_1()); 
            // InternalUseCase.g:1384:2: ( rule__QualifiedNumber__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==32) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_INT) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalUseCase.g:1384:3: rule__QualifiedNumber__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QualifiedNumber__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalUseCase.g:1392:1: rule__QualifiedNumber__Group__2 : rule__QualifiedNumber__Group__2__Impl ;
    public final void rule__QualifiedNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1396:1: ( rule__QualifiedNumber__Group__2__Impl )
            // InternalUseCase.g:1397:2: rule__QualifiedNumber__Group__2__Impl
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
    // InternalUseCase.g:1403:1: rule__QualifiedNumber__Group__2__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1407:1: ( ( '.' ) )
            // InternalUseCase.g:1408:1: ( '.' )
            {
            // InternalUseCase.g:1408:1: ( '.' )
            // InternalUseCase.g:1409:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUseCase.g:1419:1: rule__QualifiedNumber__Group_1__0 : rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 ;
    public final void rule__QualifiedNumber__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1423:1: ( rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 )
            // InternalUseCase.g:1424:2: rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCase.g:1431:1: rule__QualifiedNumber__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1435:1: ( ( '.' ) )
            // InternalUseCase.g:1436:1: ( '.' )
            {
            // InternalUseCase.g:1436:1: ( '.' )
            // InternalUseCase.g:1437:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUseCase.g:1446:1: rule__QualifiedNumber__Group_1__1 : rule__QualifiedNumber__Group_1__1__Impl ;
    public final void rule__QualifiedNumber__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1450:1: ( rule__QualifiedNumber__Group_1__1__Impl )
            // InternalUseCase.g:1451:2: rule__QualifiedNumber__Group_1__1__Impl
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
    // InternalUseCase.g:1457:1: rule__QualifiedNumber__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1461:1: ( ( RULE_INT ) )
            // InternalUseCase.g:1462:1: ( RULE_INT )
            {
            // InternalUseCase.g:1462:1: ( RULE_INT )
            // InternalUseCase.g:1463:2: RULE_INT
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


    // $ANTLR start "rule__UseCase__Group__0"
    // InternalUseCase.g:1473:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1477:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCase.g:1478:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:1485:1: rule__UseCase__Group__0__Impl : ( ( rule__UseCase__Alternatives_0 ) ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1489:1: ( ( ( rule__UseCase__Alternatives_0 ) ) )
            // InternalUseCase.g:1490:1: ( ( rule__UseCase__Alternatives_0 ) )
            {
            // InternalUseCase.g:1490:1: ( ( rule__UseCase__Alternatives_0 ) )
            // InternalUseCase.g:1491:2: ( rule__UseCase__Alternatives_0 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_0()); 
            // InternalUseCase.g:1492:2: ( rule__UseCase__Alternatives_0 )
            // InternalUseCase.g:1492:3: rule__UseCase__Alternatives_0
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
    // InternalUseCase.g:1500:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1504:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCase.g:1505:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCase.g:1512:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1516:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUseCase.g:1517:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUseCase.g:1517:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUseCase.g:1518:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUseCase.g:1519:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUseCase.g:1519:3: rule__UseCase__NameAssignment_1
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
    // InternalUseCase.g:1527:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1531:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCase.g:1532:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCase.g:1539:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionsAssignment_2 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1543:1: ( ( ( rule__UseCase__DescriptionsAssignment_2 )? ) )
            // InternalUseCase.g:1544:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            {
            // InternalUseCase.g:1544:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            // InternalUseCase.g:1545:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); 
            // InternalUseCase.g:1546:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=14 && LA28_0<=16)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUseCase.g:1546:3: rule__UseCase__DescriptionsAssignment_2
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
    // InternalUseCase.g:1554:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1558:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCase.g:1559:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCase.g:1566:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1570:1: ( ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) )
            // InternalUseCase.g:1571:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            {
            // InternalUseCase.g:1571:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            // InternalUseCase.g:1572:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            {
             before(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAssignment_3()); 
            // InternalUseCase.g:1573:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17||LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUseCase.g:1573:3: rule__UseCase__AllowedUserGroupsAssignment_3
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
    // InternalUseCase.g:1581:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1585:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCase.g:1586:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCase.g:1593:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__InputsAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1597:1: ( ( ( rule__UseCase__InputsAssignment_4 )? ) )
            // InternalUseCase.g:1598:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            {
            // InternalUseCase.g:1598:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            // InternalUseCase.g:1599:2: ( rule__UseCase__InputsAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getInputsAssignment_4()); 
            // InternalUseCase.g:1600:2: ( rule__UseCase__InputsAssignment_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=18 && LA30_0<=19)||LA30_0==46||LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUseCase.g:1600:3: rule__UseCase__InputsAssignment_4
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
    // InternalUseCase.g:1608:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1612:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCase.g:1613:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCase.g:1620:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__OutputsAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1624:1: ( ( ( rule__UseCase__OutputsAssignment_5 )? ) )
            // InternalUseCase.g:1625:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            {
            // InternalUseCase.g:1625:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            // InternalUseCase.g:1626:2: ( rule__UseCase__OutputsAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getOutputsAssignment_5()); 
            // InternalUseCase.g:1627:2: ( rule__UseCase__OutputsAssignment_5 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=24 && LA31_0<=26)||LA31_0==54) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUseCase.g:1627:3: rule__UseCase__OutputsAssignment_5
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
    // InternalUseCase.g:1635:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1639:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCase.g:1640:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCase.g:1647:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__PreconditionsAssignment_6 )? ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1651:1: ( ( ( rule__UseCase__PreconditionsAssignment_6 )? ) )
            // InternalUseCase.g:1652:1: ( ( rule__UseCase__PreconditionsAssignment_6 )? )
            {
            // InternalUseCase.g:1652:1: ( ( rule__UseCase__PreconditionsAssignment_6 )? )
            // InternalUseCase.g:1653:2: ( rule__UseCase__PreconditionsAssignment_6 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_6()); 
            // InternalUseCase.g:1654:2: ( rule__UseCase__PreconditionsAssignment_6 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=27 && LA32_0<=29)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUseCase.g:1654:3: rule__UseCase__PreconditionsAssignment_6
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
    // InternalUseCase.g:1662:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1666:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCase.g:1667:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCase.g:1674:1: rule__UseCase__Group__7__Impl : ( ( rule__UseCase__StepsAssignment_7 )? ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1678:1: ( ( ( rule__UseCase__StepsAssignment_7 )? ) )
            // InternalUseCase.g:1679:1: ( ( rule__UseCase__StepsAssignment_7 )? )
            {
            // InternalUseCase.g:1679:1: ( ( rule__UseCase__StepsAssignment_7 )? )
            // InternalUseCase.g:1680:2: ( rule__UseCase__StepsAssignment_7 )?
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_7()); 
            // InternalUseCase.g:1681:2: ( rule__UseCase__StepsAssignment_7 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=30 && LA33_0<=31)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUseCase.g:1681:3: rule__UseCase__StepsAssignment_7
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
    // InternalUseCase.g:1689:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1693:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCase.g:1694:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCase.g:1701:1: rule__UseCase__Group__8__Impl : ( ( rule__UseCase__NotesAssignment_8 )? ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1705:1: ( ( ( rule__UseCase__NotesAssignment_8 )? ) )
            // InternalUseCase.g:1706:1: ( ( rule__UseCase__NotesAssignment_8 )? )
            {
            // InternalUseCase.g:1706:1: ( ( rule__UseCase__NotesAssignment_8 )? )
            // InternalUseCase.g:1707:2: ( rule__UseCase__NotesAssignment_8 )?
            {
             before(grammarAccess.getUseCaseAccess().getNotesAssignment_8()); 
            // InternalUseCase.g:1708:2: ( rule__UseCase__NotesAssignment_8 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=34 && LA34_0<=37)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUseCase.g:1708:3: rule__UseCase__NotesAssignment_8
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
    // InternalUseCase.g:1716:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1720:1: ( rule__UseCase__Group__9__Impl )
            // InternalUseCase.g:1721:2: rule__UseCase__Group__9__Impl
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
    // InternalUseCase.g:1727:1: rule__UseCase__Group__9__Impl : ( ( rule__UseCase__Alternatives_9 ) ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1731:1: ( ( ( rule__UseCase__Alternatives_9 ) ) )
            // InternalUseCase.g:1732:1: ( ( rule__UseCase__Alternatives_9 ) )
            {
            // InternalUseCase.g:1732:1: ( ( rule__UseCase__Alternatives_9 ) )
            // InternalUseCase.g:1733:2: ( rule__UseCase__Alternatives_9 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_9()); 
            // InternalUseCase.g:1734:2: ( rule__UseCase__Alternatives_9 )
            // InternalUseCase.g:1734:3: rule__UseCase__Alternatives_9
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
    // InternalUseCase.g:1743:1: rule__UseCase__Group_9_0__0 : rule__UseCase__Group_9_0__0__Impl rule__UseCase__Group_9_0__1 ;
    public final void rule__UseCase__Group_9_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1747:1: ( rule__UseCase__Group_9_0__0__Impl rule__UseCase__Group_9_0__1 )
            // InternalUseCase.g:1748:2: rule__UseCase__Group_9_0__0__Impl rule__UseCase__Group_9_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:1755:1: rule__UseCase__Group_9_0__0__Impl : ( 'end' ) ;
    public final void rule__UseCase__Group_9_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1759:1: ( ( 'end' ) )
            // InternalUseCase.g:1760:1: ( 'end' )
            {
            // InternalUseCase.g:1760:1: ( 'end' )
            // InternalUseCase.g:1761:2: 'end'
            {
             before(grammarAccess.getUseCaseAccess().getEndKeyword_9_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUseCase.g:1770:1: rule__UseCase__Group_9_0__1 : rule__UseCase__Group_9_0__1__Impl rule__UseCase__Group_9_0__2 ;
    public final void rule__UseCase__Group_9_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1774:1: ( rule__UseCase__Group_9_0__1__Impl rule__UseCase__Group_9_0__2 )
            // InternalUseCase.g:1775:2: rule__UseCase__Group_9_0__1__Impl rule__UseCase__Group_9_0__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCase.g:1782:1: rule__UseCase__Group_9_0__1__Impl : ( 'of' ) ;
    public final void rule__UseCase__Group_9_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1786:1: ( ( 'of' ) )
            // InternalUseCase.g:1787:1: ( 'of' )
            {
            // InternalUseCase.g:1787:1: ( 'of' )
            // InternalUseCase.g:1788:2: 'of'
            {
             before(grammarAccess.getUseCaseAccess().getOfKeyword_9_0_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUseCase.g:1797:1: rule__UseCase__Group_9_0__2 : rule__UseCase__Group_9_0__2__Impl ;
    public final void rule__UseCase__Group_9_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1801:1: ( rule__UseCase__Group_9_0__2__Impl )
            // InternalUseCase.g:1802:2: rule__UseCase__Group_9_0__2__Impl
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
    // InternalUseCase.g:1808:1: rule__UseCase__Group_9_0__2__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group_9_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1812:1: ( ( 'use-case' ) )
            // InternalUseCase.g:1813:1: ( 'use-case' )
            {
            // InternalUseCase.g:1813:1: ( 'use-case' )
            // InternalUseCase.g:1814:2: 'use-case'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_9_0_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalUseCase.g:1824:1: rule__UseCase__Group_9_1__0 : rule__UseCase__Group_9_1__0__Impl rule__UseCase__Group_9_1__1 ;
    public final void rule__UseCase__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1828:1: ( rule__UseCase__Group_9_1__0__Impl rule__UseCase__Group_9_1__1 )
            // InternalUseCase.g:1829:2: rule__UseCase__Group_9_1__0__Impl rule__UseCase__Group_9_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCase.g:1836:1: rule__UseCase__Group_9_1__0__Impl : ( 'Ende' ) ;
    public final void rule__UseCase__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1840:1: ( ( 'Ende' ) )
            // InternalUseCase.g:1841:1: ( 'Ende' )
            {
            // InternalUseCase.g:1841:1: ( 'Ende' )
            // InternalUseCase.g:1842:2: 'Ende'
            {
             before(grammarAccess.getUseCaseAccess().getEndeKeyword_9_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUseCase.g:1851:1: rule__UseCase__Group_9_1__1 : rule__UseCase__Group_9_1__1__Impl rule__UseCase__Group_9_1__2 ;
    public final void rule__UseCase__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1855:1: ( rule__UseCase__Group_9_1__1__Impl rule__UseCase__Group_9_1__2 )
            // InternalUseCase.g:1856:2: rule__UseCase__Group_9_1__1__Impl rule__UseCase__Group_9_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalUseCase.g:1863:1: rule__UseCase__Group_9_1__1__Impl : ( 'des' ) ;
    public final void rule__UseCase__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1867:1: ( ( 'des' ) )
            // InternalUseCase.g:1868:1: ( 'des' )
            {
            // InternalUseCase.g:1868:1: ( 'des' )
            // InternalUseCase.g:1869:2: 'des'
            {
             before(grammarAccess.getUseCaseAccess().getDesKeyword_9_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUseCase.g:1878:1: rule__UseCase__Group_9_1__2 : rule__UseCase__Group_9_1__2__Impl ;
    public final void rule__UseCase__Group_9_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1882:1: ( rule__UseCase__Group_9_1__2__Impl )
            // InternalUseCase.g:1883:2: rule__UseCase__Group_9_1__2__Impl
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
    // InternalUseCase.g:1889:1: rule__UseCase__Group_9_1__2__Impl : ( 'Rezpets' ) ;
    public final void rule__UseCase__Group_9_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1893:1: ( ( 'Rezpets' ) )
            // InternalUseCase.g:1894:1: ( 'Rezpets' )
            {
            // InternalUseCase.g:1894:1: ( 'Rezpets' )
            // InternalUseCase.g:1895:2: 'Rezpets'
            {
             before(grammarAccess.getUseCaseAccess().getRezpetsKeyword_9_1_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUseCase.g:1905:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1909:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalUseCase.g:1910:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:1917:1: rule__Description__Group__0__Impl : ( ( rule__Description__Alternatives_0 ) ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1921:1: ( ( ( rule__Description__Alternatives_0 ) ) )
            // InternalUseCase.g:1922:1: ( ( rule__Description__Alternatives_0 ) )
            {
            // InternalUseCase.g:1922:1: ( ( rule__Description__Alternatives_0 ) )
            // InternalUseCase.g:1923:2: ( rule__Description__Alternatives_0 )
            {
             before(grammarAccess.getDescriptionAccess().getAlternatives_0()); 
            // InternalUseCase.g:1924:2: ( rule__Description__Alternatives_0 )
            // InternalUseCase.g:1924:3: rule__Description__Alternatives_0
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
    // InternalUseCase.g:1932:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1936:1: ( rule__Description__Group__1__Impl )
            // InternalUseCase.g:1937:2: rule__Description__Group__1__Impl
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
    // InternalUseCase.g:1943:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1947:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalUseCase.g:1948:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalUseCase.g:1948:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalUseCase.g:1949:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalUseCase.g:1950:2: ( rule__Description__NameAssignment_1 )
            // InternalUseCase.g:1950:3: rule__Description__NameAssignment_1
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
    // InternalUseCase.g:1959:1: rule__AllowedUserGroups__Group__0 : rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 ;
    public final void rule__AllowedUserGroups__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1963:1: ( rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 )
            // InternalUseCase.g:1964:2: rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:1971:1: rule__AllowedUserGroups__Group__0__Impl : ( ( rule__AllowedUserGroups__Alternatives_0 ) ) ;
    public final void rule__AllowedUserGroups__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1975:1: ( ( ( rule__AllowedUserGroups__Alternatives_0 ) ) )
            // InternalUseCase.g:1976:1: ( ( rule__AllowedUserGroups__Alternatives_0 ) )
            {
            // InternalUseCase.g:1976:1: ( ( rule__AllowedUserGroups__Alternatives_0 ) )
            // InternalUseCase.g:1977:2: ( rule__AllowedUserGroups__Alternatives_0 )
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getAlternatives_0()); 
            // InternalUseCase.g:1978:2: ( rule__AllowedUserGroups__Alternatives_0 )
            // InternalUseCase.g:1978:3: rule__AllowedUserGroups__Alternatives_0
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
    // InternalUseCase.g:1986:1: rule__AllowedUserGroups__Group__1 : rule__AllowedUserGroups__Group__1__Impl ;
    public final void rule__AllowedUserGroups__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1990:1: ( rule__AllowedUserGroups__Group__1__Impl )
            // InternalUseCase.g:1991:2: rule__AllowedUserGroups__Group__1__Impl
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
    // InternalUseCase.g:1997:1: rule__AllowedUserGroups__Group__1__Impl : ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) ;
    public final void rule__AllowedUserGroups__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2001:1: ( ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) )
            // InternalUseCase.g:2002:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            {
            // InternalUseCase.g:2002:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            // InternalUseCase.g:2003:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroupsAssignment_1()); 
            // InternalUseCase.g:2004:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==45||LA35_0==72) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalUseCase.g:2004:3: rule__AllowedUserGroups__GroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AllowedUserGroups__GroupsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalUseCase.g:2013:1: rule__AllowedUserGroups__Group_0_1__0 : rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1 ;
    public final void rule__AllowedUserGroups__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2017:1: ( rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1 )
            // InternalUseCase.g:2018:2: rule__AllowedUserGroups__Group_0_1__0__Impl rule__AllowedUserGroups__Group_0_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:2025:1: rule__AllowedUserGroups__Group_0_1__0__Impl : ( 'Erlaubt' ) ;
    public final void rule__AllowedUserGroups__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2029:1: ( ( 'Erlaubt' ) )
            // InternalUseCase.g:2030:1: ( 'Erlaubt' )
            {
            // InternalUseCase.g:2030:1: ( 'Erlaubt' )
            // InternalUseCase.g:2031:2: 'Erlaubt'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getErlaubtKeyword_0_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUseCase.g:2040:1: rule__AllowedUserGroups__Group_0_1__1 : rule__AllowedUserGroups__Group_0_1__1__Impl ;
    public final void rule__AllowedUserGroups__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2044:1: ( rule__AllowedUserGroups__Group_0_1__1__Impl )
            // InternalUseCase.g:2045:2: rule__AllowedUserGroups__Group_0_1__1__Impl
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
    // InternalUseCase.g:2051:1: rule__AllowedUserGroups__Group_0_1__1__Impl : ( 'f\\u00FCr:' ) ;
    public final void rule__AllowedUserGroups__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2055:1: ( ( 'f\\u00FCr:' ) )
            // InternalUseCase.g:2056:1: ( 'f\\u00FCr:' )
            {
            // InternalUseCase.g:2056:1: ( 'f\\u00FCr:' )
            // InternalUseCase.g:2057:2: 'f\\u00FCr:'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getFürKeyword_0_1_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUseCase.g:2067:1: rule__AllowedUserGroup__Group__0 : rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 ;
    public final void rule__AllowedUserGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2071:1: ( rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 )
            // InternalUseCase.g:2072:2: rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:2079:1: rule__AllowedUserGroup__Group__0__Impl : ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) ;
    public final void rule__AllowedUserGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2083:1: ( ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2084:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2084:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            // InternalUseCase.g:2085:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2086:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==72) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUseCase.g:2086:3: rule__AllowedUserGroup__ManyAssignment_0
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
    // InternalUseCase.g:2094:1: rule__AllowedUserGroup__Group__1 : rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 ;
    public final void rule__AllowedUserGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2098:1: ( rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 )
            // InternalUseCase.g:2099:2: rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:2106:1: rule__AllowedUserGroup__Group__1__Impl : ( '-' ) ;
    public final void rule__AllowedUserGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2110:1: ( ( '-' ) )
            // InternalUseCase.g:2111:1: ( '-' )
            {
            // InternalUseCase.g:2111:1: ( '-' )
            // InternalUseCase.g:2112:2: '-'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUseCase.g:2121:1: rule__AllowedUserGroup__Group__2 : rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 ;
    public final void rule__AllowedUserGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2125:1: ( rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 )
            // InternalUseCase.g:2126:2: rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalUseCase.g:2133:1: rule__AllowedUserGroup__Group__2__Impl : ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) ;
    public final void rule__AllowedUserGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2137:1: ( ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) )
            // InternalUseCase.g:2138:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            {
            // InternalUseCase.g:2138:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            // InternalUseCase.g:2139:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getNameAssignment_2()); 
            // InternalUseCase.g:2140:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            // InternalUseCase.g:2140:3: rule__AllowedUserGroup__NameAssignment_2
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
    // InternalUseCase.g:2148:1: rule__AllowedUserGroup__Group__3 : rule__AllowedUserGroup__Group__3__Impl ;
    public final void rule__AllowedUserGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2152:1: ( rule__AllowedUserGroup__Group__3__Impl )
            // InternalUseCase.g:2153:2: rule__AllowedUserGroup__Group__3__Impl
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
    // InternalUseCase.g:2159:1: rule__AllowedUserGroup__Group__3__Impl : ( ( rule__AllowedUserGroup__Group_3__0 )? ) ;
    public final void rule__AllowedUserGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2163:1: ( ( ( rule__AllowedUserGroup__Group_3__0 )? ) )
            // InternalUseCase.g:2164:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            {
            // InternalUseCase.g:2164:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            // InternalUseCase.g:2165:2: ( rule__AllowedUserGroup__Group_3__0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup_3()); 
            // InternalUseCase.g:2166:2: ( rule__AllowedUserGroup__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUseCase.g:2166:3: rule__AllowedUserGroup__Group_3__0
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
    // InternalUseCase.g:2175:1: rule__AllowedUserGroup__Group_3__0 : rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 ;
    public final void rule__AllowedUserGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2179:1: ( rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 )
            // InternalUseCase.g:2180:2: rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:2187:1: rule__AllowedUserGroup__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__AllowedUserGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2191:1: ( ( 'as' ) )
            // InternalUseCase.g:2192:1: ( 'as' )
            {
            // InternalUseCase.g:2192:1: ( 'as' )
            // InternalUseCase.g:2193:2: 'as'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUseCase.g:2202:1: rule__AllowedUserGroup__Group_3__1 : rule__AllowedUserGroup__Group_3__1__Impl ;
    public final void rule__AllowedUserGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2206:1: ( rule__AllowedUserGroup__Group_3__1__Impl )
            // InternalUseCase.g:2207:2: rule__AllowedUserGroup__Group_3__1__Impl
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
    // InternalUseCase.g:2213:1: rule__AllowedUserGroup__Group_3__1__Impl : ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) ;
    public final void rule__AllowedUserGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2217:1: ( ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:2218:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:2218:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            // InternalUseCase.g:2219:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:2220:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            // InternalUseCase.g:2220:3: rule__AllowedUserGroup__TypeAssignment_3_1
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
    // InternalUseCase.g:2229:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2233:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalUseCase.g:2234:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:2241:1: rule__Inputs__Group__0__Impl : ( ( rule__Inputs__Alternatives_0 ) ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2245:1: ( ( ( rule__Inputs__Alternatives_0 ) ) )
            // InternalUseCase.g:2246:1: ( ( rule__Inputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:2246:1: ( ( rule__Inputs__Alternatives_0 ) )
            // InternalUseCase.g:2247:2: ( rule__Inputs__Alternatives_0 )
            {
             before(grammarAccess.getInputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:2248:2: ( rule__Inputs__Alternatives_0 )
            // InternalUseCase.g:2248:3: rule__Inputs__Alternatives_0
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
    // InternalUseCase.g:2256:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2260:1: ( rule__Inputs__Group__1__Impl )
            // InternalUseCase.g:2261:2: rule__Inputs__Group__1__Impl
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
    // InternalUseCase.g:2267:1: rule__Inputs__Group__1__Impl : ( ( rule__Inputs__InputsAssignment_1 )* ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2271:1: ( ( ( rule__Inputs__InputsAssignment_1 )* ) )
            // InternalUseCase.g:2272:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            {
            // InternalUseCase.g:2272:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            // InternalUseCase.g:2273:2: ( rule__Inputs__InputsAssignment_1 )*
            {
             before(grammarAccess.getInputsAccess().getInputsAssignment_1()); 
            // InternalUseCase.g:2274:2: ( rule__Inputs__InputsAssignment_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==45||LA38_0==72) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalUseCase.g:2274:3: rule__Inputs__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Inputs__InputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalUseCase.g:2283:1: rule__Inputs__Group_0_0_2__0 : rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1 ;
    public final void rule__Inputs__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2287:1: ( rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1 )
            // InternalUseCase.g:2288:2: rule__Inputs__Group_0_0_2__0__Impl rule__Inputs__Group_0_0_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalUseCase.g:2295:1: rule__Inputs__Group_0_0_2__0__Impl : ( 'requires' ) ;
    public final void rule__Inputs__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2299:1: ( ( 'requires' ) )
            // InternalUseCase.g:2300:1: ( 'requires' )
            {
            // InternalUseCase.g:2300:1: ( 'requires' )
            // InternalUseCase.g:2301:2: 'requires'
            {
             before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalUseCase.g:2310:1: rule__Inputs__Group_0_0_2__1 : rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2 ;
    public final void rule__Inputs__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2314:1: ( rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2 )
            // InternalUseCase.g:2315:2: rule__Inputs__Group_0_0_2__1__Impl rule__Inputs__Group_0_0_2__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCase.g:2322:1: rule__Inputs__Group_0_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Inputs__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2326:1: ( ( 'the' ) )
            // InternalUseCase.g:2327:1: ( 'the' )
            {
            // InternalUseCase.g:2327:1: ( 'the' )
            // InternalUseCase.g:2328:2: 'the'
            {
             before(grammarAccess.getInputsAccess().getTheKeyword_0_0_2_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalUseCase.g:2337:1: rule__Inputs__Group_0_0_2__2 : rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3 ;
    public final void rule__Inputs__Group_0_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2341:1: ( rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3 )
            // InternalUseCase.g:2342:2: rule__Inputs__Group_0_0_2__2__Impl rule__Inputs__Group_0_0_2__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalUseCase.g:2349:1: rule__Inputs__Group_0_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Inputs__Group_0_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2353:1: ( ( 'following' ) )
            // InternalUseCase.g:2354:1: ( 'following' )
            {
            // InternalUseCase.g:2354:1: ( 'following' )
            // InternalUseCase.g:2355:2: 'following'
            {
             before(grammarAccess.getInputsAccess().getFollowingKeyword_0_0_2_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalUseCase.g:2364:1: rule__Inputs__Group_0_0_2__3 : rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4 ;
    public final void rule__Inputs__Group_0_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2368:1: ( rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4 )
            // InternalUseCase.g:2369:2: rule__Inputs__Group_0_0_2__3__Impl rule__Inputs__Group_0_0_2__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCase.g:2376:1: rule__Inputs__Group_0_0_2__3__Impl : ( 'input' ) ;
    public final void rule__Inputs__Group_0_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2380:1: ( ( 'input' ) )
            // InternalUseCase.g:2381:1: ( 'input' )
            {
            // InternalUseCase.g:2381:1: ( 'input' )
            // InternalUseCase.g:2382:2: 'input'
            {
             before(grammarAccess.getInputsAccess().getInputKeyword_0_0_2_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUseCase.g:2391:1: rule__Inputs__Group_0_0_2__4 : rule__Inputs__Group_0_0_2__4__Impl ;
    public final void rule__Inputs__Group_0_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2395:1: ( rule__Inputs__Group_0_0_2__4__Impl )
            // InternalUseCase.g:2396:2: rule__Inputs__Group_0_0_2__4__Impl
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
    // InternalUseCase.g:2402:1: rule__Inputs__Group_0_0_2__4__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2406:1: ( ( ':' ) )
            // InternalUseCase.g:2407:1: ( ':' )
            {
            // InternalUseCase.g:2407:1: ( ':' )
            // InternalUseCase.g:2408:2: ':'
            {
             before(grammarAccess.getInputsAccess().getColonKeyword_0_0_2_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalUseCase.g:2418:1: rule__Inputs__Group_0_1__0 : rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1 ;
    public final void rule__Inputs__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2422:1: ( rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1 )
            // InternalUseCase.g:2423:2: rule__Inputs__Group_0_1__0__Impl rule__Inputs__Group_0_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalUseCase.g:2430:1: rule__Inputs__Group_0_1__0__Impl : ( 'Ben\\u00F6tigte' ) ;
    public final void rule__Inputs__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2434:1: ( ( 'Ben\\u00F6tigte' ) )
            // InternalUseCase.g:2435:1: ( 'Ben\\u00F6tigte' )
            {
            // InternalUseCase.g:2435:1: ( 'Ben\\u00F6tigte' )
            // InternalUseCase.g:2436:2: 'Ben\\u00F6tigte'
            {
             before(grammarAccess.getInputsAccess().getBenötigteKeyword_0_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUseCase.g:2445:1: rule__Inputs__Group_0_1__1 : rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2 ;
    public final void rule__Inputs__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2449:1: ( rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2 )
            // InternalUseCase.g:2450:2: rule__Inputs__Group_0_1__1__Impl rule__Inputs__Group_0_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCase.g:2457:1: rule__Inputs__Group_0_1__1__Impl : ( 'Zutaten' ) ;
    public final void rule__Inputs__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2461:1: ( ( 'Zutaten' ) )
            // InternalUseCase.g:2462:1: ( 'Zutaten' )
            {
            // InternalUseCase.g:2462:1: ( 'Zutaten' )
            // InternalUseCase.g:2463:2: 'Zutaten'
            {
             before(grammarAccess.getInputsAccess().getZutatenKeyword_0_1_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUseCase.g:2472:1: rule__Inputs__Group_0_1__2 : rule__Inputs__Group_0_1__2__Impl ;
    public final void rule__Inputs__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2476:1: ( rule__Inputs__Group_0_1__2__Impl )
            // InternalUseCase.g:2477:2: rule__Inputs__Group_0_1__2__Impl
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
    // InternalUseCase.g:2483:1: rule__Inputs__Group_0_1__2__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2487:1: ( ( ':' ) )
            // InternalUseCase.g:2488:1: ( ':' )
            {
            // InternalUseCase.g:2488:1: ( ':' )
            // InternalUseCase.g:2489:2: ':'
            {
             before(grammarAccess.getInputsAccess().getColonKeyword_0_1_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalUseCase.g:2499:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2503:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalUseCase.g:2504:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:2511:1: rule__Input__Group__0__Impl : ( ( rule__Input__ManyAssignment_0 )? ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2515:1: ( ( ( rule__Input__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2516:1: ( ( rule__Input__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2516:1: ( ( rule__Input__ManyAssignment_0 )? )
            // InternalUseCase.g:2517:2: ( rule__Input__ManyAssignment_0 )?
            {
             before(grammarAccess.getInputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2518:2: ( rule__Input__ManyAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==72) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUseCase.g:2518:3: rule__Input__ManyAssignment_0
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
    // InternalUseCase.g:2526:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2530:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalUseCase.g:2531:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalUseCase.g:2538:1: rule__Input__Group__1__Impl : ( '-' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2542:1: ( ( '-' ) )
            // InternalUseCase.g:2543:1: ( '-' )
            {
            // InternalUseCase.g:2543:1: ( '-' )
            // InternalUseCase.g:2544:2: '-'
            {
             before(grammarAccess.getInputAccess().getHyphenMinusKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUseCase.g:2553:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2557:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalUseCase.g:2558:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalUseCase.g:2565:1: rule__Input__Group__2__Impl : ( ( rule__Input__OptionalAssignment_2 )? ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2569:1: ( ( ( rule__Input__OptionalAssignment_2 )? ) )
            // InternalUseCase.g:2570:1: ( ( rule__Input__OptionalAssignment_2 )? )
            {
            // InternalUseCase.g:2570:1: ( ( rule__Input__OptionalAssignment_2 )? )
            // InternalUseCase.g:2571:2: ( rule__Input__OptionalAssignment_2 )?
            {
             before(grammarAccess.getInputAccess().getOptionalAssignment_2()); 
            // InternalUseCase.g:2572:2: ( rule__Input__OptionalAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==11) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUseCase.g:2572:3: rule__Input__OptionalAssignment_2
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
    // InternalUseCase.g:2580:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2584:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalUseCase.g:2585:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCase.g:2592:1: rule__Input__Group__3__Impl : ( ( rule__Input__ContentAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2596:1: ( ( ( rule__Input__ContentAssignment_3 ) ) )
            // InternalUseCase.g:2597:1: ( ( rule__Input__ContentAssignment_3 ) )
            {
            // InternalUseCase.g:2597:1: ( ( rule__Input__ContentAssignment_3 ) )
            // InternalUseCase.g:2598:2: ( rule__Input__ContentAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getContentAssignment_3()); 
            // InternalUseCase.g:2599:2: ( rule__Input__ContentAssignment_3 )
            // InternalUseCase.g:2599:3: rule__Input__ContentAssignment_3
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
    // InternalUseCase.g:2607:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2611:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // InternalUseCase.g:2612:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCase.g:2619:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2623:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalUseCase.g:2624:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalUseCase.g:2624:1: ( ( rule__Input__Group_4__0 )? )
            // InternalUseCase.g:2625:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalUseCase.g:2626:2: ( rule__Input__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=20 && LA41_0<=21)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUseCase.g:2626:3: rule__Input__Group_4__0
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
    // InternalUseCase.g:2634:1: rule__Input__Group__5 : rule__Input__Group__5__Impl ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2638:1: ( rule__Input__Group__5__Impl )
            // InternalUseCase.g:2639:2: rule__Input__Group__5__Impl
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
    // InternalUseCase.g:2645:1: rule__Input__Group__5__Impl : ( ( rule__Input__Group_5__0 )? ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2649:1: ( ( ( rule__Input__Group_5__0 )? ) )
            // InternalUseCase.g:2650:1: ( ( rule__Input__Group_5__0 )? )
            {
            // InternalUseCase.g:2650:1: ( ( rule__Input__Group_5__0 )? )
            // InternalUseCase.g:2651:2: ( rule__Input__Group_5__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_5()); 
            // InternalUseCase.g:2652:2: ( rule__Input__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==52) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUseCase.g:2652:3: rule__Input__Group_5__0
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
    // InternalUseCase.g:2661:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2665:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalUseCase.g:2666:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:2673:1: rule__Input__Group_4__0__Impl : ( ( rule__Input__Alternatives_4_0 ) ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2677:1: ( ( ( rule__Input__Alternatives_4_0 ) ) )
            // InternalUseCase.g:2678:1: ( ( rule__Input__Alternatives_4_0 ) )
            {
            // InternalUseCase.g:2678:1: ( ( rule__Input__Alternatives_4_0 ) )
            // InternalUseCase.g:2679:2: ( rule__Input__Alternatives_4_0 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_4_0()); 
            // InternalUseCase.g:2680:2: ( rule__Input__Alternatives_4_0 )
            // InternalUseCase.g:2680:3: rule__Input__Alternatives_4_0
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
    // InternalUseCase.g:2688:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2692:1: ( rule__Input__Group_4__1__Impl )
            // InternalUseCase.g:2693:2: rule__Input__Group_4__1__Impl
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
    // InternalUseCase.g:2699:1: rule__Input__Group_4__1__Impl : ( ( rule__Input__TypeAssignment_4_1 ) ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2703:1: ( ( ( rule__Input__TypeAssignment_4_1 ) ) )
            // InternalUseCase.g:2704:1: ( ( rule__Input__TypeAssignment_4_1 ) )
            {
            // InternalUseCase.g:2704:1: ( ( rule__Input__TypeAssignment_4_1 ) )
            // InternalUseCase.g:2705:2: ( rule__Input__TypeAssignment_4_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_4_1()); 
            // InternalUseCase.g:2706:2: ( rule__Input__TypeAssignment_4_1 )
            // InternalUseCase.g:2706:3: rule__Input__TypeAssignment_4_1
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
    // InternalUseCase.g:2715:1: rule__Input__Group_5__0 : rule__Input__Group_5__0__Impl rule__Input__Group_5__1 ;
    public final void rule__Input__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2719:1: ( rule__Input__Group_5__0__Impl rule__Input__Group_5__1 )
            // InternalUseCase.g:2720:2: rule__Input__Group_5__0__Impl rule__Input__Group_5__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalUseCase.g:2727:1: rule__Input__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Input__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2731:1: ( ( '(' ) )
            // InternalUseCase.g:2732:1: ( '(' )
            {
            // InternalUseCase.g:2732:1: ( '(' )
            // InternalUseCase.g:2733:2: '('
            {
             before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUseCase.g:2742:1: rule__Input__Group_5__1 : rule__Input__Group_5__1__Impl rule__Input__Group_5__2 ;
    public final void rule__Input__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2746:1: ( rule__Input__Group_5__1__Impl rule__Input__Group_5__2 )
            // InternalUseCase.g:2747:2: rule__Input__Group_5__1__Impl rule__Input__Group_5__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:2754:1: rule__Input__Group_5__1__Impl : ( ( rule__Input__Alternatives_5_1 ) ) ;
    public final void rule__Input__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2758:1: ( ( ( rule__Input__Alternatives_5_1 ) ) )
            // InternalUseCase.g:2759:1: ( ( rule__Input__Alternatives_5_1 ) )
            {
            // InternalUseCase.g:2759:1: ( ( rule__Input__Alternatives_5_1 ) )
            // InternalUseCase.g:2760:2: ( rule__Input__Alternatives_5_1 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_5_1()); 
            // InternalUseCase.g:2761:2: ( rule__Input__Alternatives_5_1 )
            // InternalUseCase.g:2761:3: rule__Input__Alternatives_5_1
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
    // InternalUseCase.g:2769:1: rule__Input__Group_5__2 : rule__Input__Group_5__2__Impl rule__Input__Group_5__3 ;
    public final void rule__Input__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2773:1: ( rule__Input__Group_5__2__Impl rule__Input__Group_5__3 )
            // InternalUseCase.g:2774:2: rule__Input__Group_5__2__Impl rule__Input__Group_5__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCase.g:2781:1: rule__Input__Group_5__2__Impl : ( ( rule__Input__ExampleAssignment_5_2 ) ) ;
    public final void rule__Input__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2785:1: ( ( ( rule__Input__ExampleAssignment_5_2 ) ) )
            // InternalUseCase.g:2786:1: ( ( rule__Input__ExampleAssignment_5_2 ) )
            {
            // InternalUseCase.g:2786:1: ( ( rule__Input__ExampleAssignment_5_2 ) )
            // InternalUseCase.g:2787:2: ( rule__Input__ExampleAssignment_5_2 )
            {
             before(grammarAccess.getInputAccess().getExampleAssignment_5_2()); 
            // InternalUseCase.g:2788:2: ( rule__Input__ExampleAssignment_5_2 )
            // InternalUseCase.g:2788:3: rule__Input__ExampleAssignment_5_2
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
    // InternalUseCase.g:2796:1: rule__Input__Group_5__3 : rule__Input__Group_5__3__Impl ;
    public final void rule__Input__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2800:1: ( rule__Input__Group_5__3__Impl )
            // InternalUseCase.g:2801:2: rule__Input__Group_5__3__Impl
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
    // InternalUseCase.g:2807:1: rule__Input__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Input__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2811:1: ( ( ')' ) )
            // InternalUseCase.g:2812:1: ( ')' )
            {
            // InternalUseCase.g:2812:1: ( ')' )
            // InternalUseCase.g:2813:2: ')'
            {
             before(grammarAccess.getInputAccess().getRightParenthesisKeyword_5_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUseCase.g:2823:1: rule__Outputs__Group__0 : rule__Outputs__Group__0__Impl rule__Outputs__Group__1 ;
    public final void rule__Outputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2827:1: ( rule__Outputs__Group__0__Impl rule__Outputs__Group__1 )
            // InternalUseCase.g:2828:2: rule__Outputs__Group__0__Impl rule__Outputs__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:2835:1: rule__Outputs__Group__0__Impl : ( ( rule__Outputs__Alternatives_0 ) ) ;
    public final void rule__Outputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2839:1: ( ( ( rule__Outputs__Alternatives_0 ) ) )
            // InternalUseCase.g:2840:1: ( ( rule__Outputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:2840:1: ( ( rule__Outputs__Alternatives_0 ) )
            // InternalUseCase.g:2841:2: ( rule__Outputs__Alternatives_0 )
            {
             before(grammarAccess.getOutputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:2842:2: ( rule__Outputs__Alternatives_0 )
            // InternalUseCase.g:2842:3: rule__Outputs__Alternatives_0
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
    // InternalUseCase.g:2850:1: rule__Outputs__Group__1 : rule__Outputs__Group__1__Impl ;
    public final void rule__Outputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2854:1: ( rule__Outputs__Group__1__Impl )
            // InternalUseCase.g:2855:2: rule__Outputs__Group__1__Impl
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
    // InternalUseCase.g:2861:1: rule__Outputs__Group__1__Impl : ( ( rule__Outputs__OutputsAssignment_1 )* ) ;
    public final void rule__Outputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2865:1: ( ( ( rule__Outputs__OutputsAssignment_1 )* ) )
            // InternalUseCase.g:2866:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            {
            // InternalUseCase.g:2866:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            // InternalUseCase.g:2867:2: ( rule__Outputs__OutputsAssignment_1 )*
            {
             before(grammarAccess.getOutputsAccess().getOutputsAssignment_1()); 
            // InternalUseCase.g:2868:2: ( rule__Outputs__OutputsAssignment_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==45||LA43_0==72) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUseCase.g:2868:3: rule__Outputs__OutputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Outputs__OutputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalUseCase.g:2877:1: rule__Outputs__Group_0_0_2__0 : rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1 ;
    public final void rule__Outputs__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2881:1: ( rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1 )
            // InternalUseCase.g:2882:2: rule__Outputs__Group_0_0_2__0__Impl rule__Outputs__Group_0_0_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalUseCase.g:2889:1: rule__Outputs__Group_0_0_2__0__Impl : ( 'produces' ) ;
    public final void rule__Outputs__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2893:1: ( ( 'produces' ) )
            // InternalUseCase.g:2894:1: ( 'produces' )
            {
            // InternalUseCase.g:2894:1: ( 'produces' )
            // InternalUseCase.g:2895:2: 'produces'
            {
             before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0_2_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUseCase.g:2904:1: rule__Outputs__Group_0_0_2__1 : rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2 ;
    public final void rule__Outputs__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2908:1: ( rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2 )
            // InternalUseCase.g:2909:2: rule__Outputs__Group_0_0_2__1__Impl rule__Outputs__Group_0_0_2__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCase.g:2916:1: rule__Outputs__Group_0_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Outputs__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2920:1: ( ( 'the' ) )
            // InternalUseCase.g:2921:1: ( 'the' )
            {
            // InternalUseCase.g:2921:1: ( 'the' )
            // InternalUseCase.g:2922:2: 'the'
            {
             before(grammarAccess.getOutputsAccess().getTheKeyword_0_0_2_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalUseCase.g:2931:1: rule__Outputs__Group_0_0_2__2 : rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3 ;
    public final void rule__Outputs__Group_0_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2935:1: ( rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3 )
            // InternalUseCase.g:2936:2: rule__Outputs__Group_0_0_2__2__Impl rule__Outputs__Group_0_0_2__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalUseCase.g:2943:1: rule__Outputs__Group_0_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Outputs__Group_0_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2947:1: ( ( 'following' ) )
            // InternalUseCase.g:2948:1: ( 'following' )
            {
            // InternalUseCase.g:2948:1: ( 'following' )
            // InternalUseCase.g:2949:2: 'following'
            {
             before(grammarAccess.getOutputsAccess().getFollowingKeyword_0_0_2_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalUseCase.g:2958:1: rule__Outputs__Group_0_0_2__3 : rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4 ;
    public final void rule__Outputs__Group_0_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2962:1: ( rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4 )
            // InternalUseCase.g:2963:2: rule__Outputs__Group_0_0_2__3__Impl rule__Outputs__Group_0_0_2__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCase.g:2970:1: rule__Outputs__Group_0_0_2__3__Impl : ( 'output' ) ;
    public final void rule__Outputs__Group_0_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2974:1: ( ( 'output' ) )
            // InternalUseCase.g:2975:1: ( 'output' )
            {
            // InternalUseCase.g:2975:1: ( 'output' )
            // InternalUseCase.g:2976:2: 'output'
            {
             before(grammarAccess.getOutputsAccess().getOutputKeyword_0_0_2_3()); 
            match(input,55,FOLLOW_2); 
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
    // InternalUseCase.g:2985:1: rule__Outputs__Group_0_0_2__4 : rule__Outputs__Group_0_0_2__4__Impl ;
    public final void rule__Outputs__Group_0_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2989:1: ( rule__Outputs__Group_0_0_2__4__Impl )
            // InternalUseCase.g:2990:2: rule__Outputs__Group_0_0_2__4__Impl
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
    // InternalUseCase.g:2996:1: rule__Outputs__Group_0_0_2__4__Impl : ( ':' ) ;
    public final void rule__Outputs__Group_0_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3000:1: ( ( ':' ) )
            // InternalUseCase.g:3001:1: ( ':' )
            {
            // InternalUseCase.g:3001:1: ( ':' )
            // InternalUseCase.g:3002:2: ':'
            {
             before(grammarAccess.getOutputsAccess().getColonKeyword_0_0_2_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalUseCase.g:3012:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3016:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalUseCase.g:3017:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:3024:1: rule__Output__Group__0__Impl : ( ( rule__Output__ManyAssignment_0 )? ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3028:1: ( ( ( rule__Output__ManyAssignment_0 )? ) )
            // InternalUseCase.g:3029:1: ( ( rule__Output__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:3029:1: ( ( rule__Output__ManyAssignment_0 )? )
            // InternalUseCase.g:3030:2: ( rule__Output__ManyAssignment_0 )?
            {
             before(grammarAccess.getOutputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:3031:2: ( rule__Output__ManyAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==72) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUseCase.g:3031:3: rule__Output__ManyAssignment_0
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
    // InternalUseCase.g:3039:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3043:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalUseCase.g:3044:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:3051:1: rule__Output__Group__1__Impl : ( '-' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3055:1: ( ( '-' ) )
            // InternalUseCase.g:3056:1: ( '-' )
            {
            // InternalUseCase.g:3056:1: ( '-' )
            // InternalUseCase.g:3057:2: '-'
            {
             before(grammarAccess.getOutputAccess().getHyphenMinusKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUseCase.g:3066:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3070:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalUseCase.g:3071:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCase.g:3078:1: rule__Output__Group__2__Impl : ( ( rule__Output__ContentAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3082:1: ( ( ( rule__Output__ContentAssignment_2 ) ) )
            // InternalUseCase.g:3083:1: ( ( rule__Output__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:3083:1: ( ( rule__Output__ContentAssignment_2 ) )
            // InternalUseCase.g:3084:2: ( rule__Output__ContentAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:3085:2: ( rule__Output__ContentAssignment_2 )
            // InternalUseCase.g:3085:3: rule__Output__ContentAssignment_2
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
    // InternalUseCase.g:3093:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3097:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalUseCase.g:3098:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCase.g:3105:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3109:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalUseCase.g:3110:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalUseCase.g:3110:1: ( ( rule__Output__Group_3__0 )? )
            // InternalUseCase.g:3111:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalUseCase.g:3112:2: ( rule__Output__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=20 && LA45_0<=21)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUseCase.g:3112:3: rule__Output__Group_3__0
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
    // InternalUseCase.g:3120:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3124:1: ( rule__Output__Group__4__Impl )
            // InternalUseCase.g:3125:2: rule__Output__Group__4__Impl
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
    // InternalUseCase.g:3131:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3135:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalUseCase.g:3136:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalUseCase.g:3136:1: ( ( rule__Output__Group_4__0 )? )
            // InternalUseCase.g:3137:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalUseCase.g:3138:2: ( rule__Output__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUseCase.g:3138:3: rule__Output__Group_4__0
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
    // InternalUseCase.g:3147:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3151:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalUseCase.g:3152:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:3159:1: rule__Output__Group_3__0__Impl : ( ( rule__Output__Alternatives_3_0 ) ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3163:1: ( ( ( rule__Output__Alternatives_3_0 ) ) )
            // InternalUseCase.g:3164:1: ( ( rule__Output__Alternatives_3_0 ) )
            {
            // InternalUseCase.g:3164:1: ( ( rule__Output__Alternatives_3_0 ) )
            // InternalUseCase.g:3165:2: ( rule__Output__Alternatives_3_0 )
            {
             before(grammarAccess.getOutputAccess().getAlternatives_3_0()); 
            // InternalUseCase.g:3166:2: ( rule__Output__Alternatives_3_0 )
            // InternalUseCase.g:3166:3: rule__Output__Alternatives_3_0
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
    // InternalUseCase.g:3174:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3178:1: ( rule__Output__Group_3__1__Impl )
            // InternalUseCase.g:3179:2: rule__Output__Group_3__1__Impl
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
    // InternalUseCase.g:3185:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3189:1: ( ( ( rule__Output__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:3190:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:3190:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            // InternalUseCase.g:3191:2: ( rule__Output__TypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:3192:2: ( rule__Output__TypeAssignment_3_1 )
            // InternalUseCase.g:3192:3: rule__Output__TypeAssignment_3_1
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
    // InternalUseCase.g:3201:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3205:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalUseCase.g:3206:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalUseCase.g:3213:1: rule__Output__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3217:1: ( ( '(' ) )
            // InternalUseCase.g:3218:1: ( '(' )
            {
            // InternalUseCase.g:3218:1: ( '(' )
            // InternalUseCase.g:3219:2: '('
            {
             before(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUseCase.g:3228:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl rule__Output__Group_4__2 ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3232:1: ( rule__Output__Group_4__1__Impl rule__Output__Group_4__2 )
            // InternalUseCase.g:3233:2: rule__Output__Group_4__1__Impl rule__Output__Group_4__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:3240:1: rule__Output__Group_4__1__Impl : ( ( rule__Output__Alternatives_4_1 ) ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3244:1: ( ( ( rule__Output__Alternatives_4_1 ) ) )
            // InternalUseCase.g:3245:1: ( ( rule__Output__Alternatives_4_1 ) )
            {
            // InternalUseCase.g:3245:1: ( ( rule__Output__Alternatives_4_1 ) )
            // InternalUseCase.g:3246:2: ( rule__Output__Alternatives_4_1 )
            {
             before(grammarAccess.getOutputAccess().getAlternatives_4_1()); 
            // InternalUseCase.g:3247:2: ( rule__Output__Alternatives_4_1 )
            // InternalUseCase.g:3247:3: rule__Output__Alternatives_4_1
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
    // InternalUseCase.g:3255:1: rule__Output__Group_4__2 : rule__Output__Group_4__2__Impl rule__Output__Group_4__3 ;
    public final void rule__Output__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3259:1: ( rule__Output__Group_4__2__Impl rule__Output__Group_4__3 )
            // InternalUseCase.g:3260:2: rule__Output__Group_4__2__Impl rule__Output__Group_4__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCase.g:3267:1: rule__Output__Group_4__2__Impl : ( ( rule__Output__ExampleAssignment_4_2 ) ) ;
    public final void rule__Output__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3271:1: ( ( ( rule__Output__ExampleAssignment_4_2 ) ) )
            // InternalUseCase.g:3272:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            {
            // InternalUseCase.g:3272:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            // InternalUseCase.g:3273:2: ( rule__Output__ExampleAssignment_4_2 )
            {
             before(grammarAccess.getOutputAccess().getExampleAssignment_4_2()); 
            // InternalUseCase.g:3274:2: ( rule__Output__ExampleAssignment_4_2 )
            // InternalUseCase.g:3274:3: rule__Output__ExampleAssignment_4_2
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
    // InternalUseCase.g:3282:1: rule__Output__Group_4__3 : rule__Output__Group_4__3__Impl ;
    public final void rule__Output__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3286:1: ( rule__Output__Group_4__3__Impl )
            // InternalUseCase.g:3287:2: rule__Output__Group_4__3__Impl
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
    // InternalUseCase.g:3293:1: rule__Output__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Output__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3297:1: ( ( ')' ) )
            // InternalUseCase.g:3298:1: ( ')' )
            {
            // InternalUseCase.g:3298:1: ( ')' )
            // InternalUseCase.g:3299:2: ')'
            {
             before(grammarAccess.getOutputAccess().getRightParenthesisKeyword_4_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUseCase.g:3309:1: rule__PreConditions__Group__0 : rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 ;
    public final void rule__PreConditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3313:1: ( rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 )
            // InternalUseCase.g:3314:2: rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalUseCase.g:3321:1: rule__PreConditions__Group__0__Impl : ( ( rule__PreConditions__Alternatives_0 ) ) ;
    public final void rule__PreConditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3325:1: ( ( ( rule__PreConditions__Alternatives_0 ) ) )
            // InternalUseCase.g:3326:1: ( ( rule__PreConditions__Alternatives_0 ) )
            {
            // InternalUseCase.g:3326:1: ( ( rule__PreConditions__Alternatives_0 ) )
            // InternalUseCase.g:3327:2: ( rule__PreConditions__Alternatives_0 )
            {
             before(grammarAccess.getPreConditionsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3328:2: ( rule__PreConditions__Alternatives_0 )
            // InternalUseCase.g:3328:3: rule__PreConditions__Alternatives_0
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
    // InternalUseCase.g:3336:1: rule__PreConditions__Group__1 : rule__PreConditions__Group__1__Impl ;
    public final void rule__PreConditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3340:1: ( rule__PreConditions__Group__1__Impl )
            // InternalUseCase.g:3341:2: rule__PreConditions__Group__1__Impl
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
    // InternalUseCase.g:3347:1: rule__PreConditions__Group__1__Impl : ( ( rule__PreConditions__ConditionsAssignment_1 )* ) ;
    public final void rule__PreConditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3351:1: ( ( ( rule__PreConditions__ConditionsAssignment_1 )* ) )
            // InternalUseCase.g:3352:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            {
            // InternalUseCase.g:3352:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            // InternalUseCase.g:3353:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            {
             before(grammarAccess.getPreConditionsAccess().getConditionsAssignment_1()); 
            // InternalUseCase.g:3354:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==45) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalUseCase.g:3354:3: rule__PreConditions__ConditionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__PreConditions__ConditionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalUseCase.g:3363:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3367:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalUseCase.g:3368:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:3375:1: rule__Condition__Group__0__Impl : ( '-' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3379:1: ( ( '-' ) )
            // InternalUseCase.g:3380:1: ( '-' )
            {
            // InternalUseCase.g:3380:1: ( '-' )
            // InternalUseCase.g:3381:2: '-'
            {
             before(grammarAccess.getConditionAccess().getHyphenMinusKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUseCase.g:3390:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3394:1: ( rule__Condition__Group__1__Impl )
            // InternalUseCase.g:3395:2: rule__Condition__Group__1__Impl
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
    // InternalUseCase.g:3401:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ContentAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3405:1: ( ( ( rule__Condition__ContentAssignment_1 ) ) )
            // InternalUseCase.g:3406:1: ( ( rule__Condition__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:3406:1: ( ( rule__Condition__ContentAssignment_1 ) )
            // InternalUseCase.g:3407:2: ( rule__Condition__ContentAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getContentAssignment_1()); 
            // InternalUseCase.g:3408:2: ( rule__Condition__ContentAssignment_1 )
            // InternalUseCase.g:3408:3: rule__Condition__ContentAssignment_1
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
    // InternalUseCase.g:3417:1: rule__Steps__Group__0 : rule__Steps__Group__0__Impl rule__Steps__Group__1 ;
    public final void rule__Steps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3421:1: ( rule__Steps__Group__0__Impl rule__Steps__Group__1 )
            // InternalUseCase.g:3422:2: rule__Steps__Group__0__Impl rule__Steps__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCase.g:3429:1: rule__Steps__Group__0__Impl : ( ( rule__Steps__Alternatives_0 ) ) ;
    public final void rule__Steps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3433:1: ( ( ( rule__Steps__Alternatives_0 ) ) )
            // InternalUseCase.g:3434:1: ( ( rule__Steps__Alternatives_0 ) )
            {
            // InternalUseCase.g:3434:1: ( ( rule__Steps__Alternatives_0 ) )
            // InternalUseCase.g:3435:2: ( rule__Steps__Alternatives_0 )
            {
             before(grammarAccess.getStepsAccess().getAlternatives_0()); 
            // InternalUseCase.g:3436:2: ( rule__Steps__Alternatives_0 )
            // InternalUseCase.g:3436:3: rule__Steps__Alternatives_0
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
    // InternalUseCase.g:3444:1: rule__Steps__Group__1 : rule__Steps__Group__1__Impl ;
    public final void rule__Steps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3448:1: ( rule__Steps__Group__1__Impl )
            // InternalUseCase.g:3449:2: rule__Steps__Group__1__Impl
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
    // InternalUseCase.g:3455:1: rule__Steps__Group__1__Impl : ( ( rule__Steps__StepsAssignment_1 )* ) ;
    public final void rule__Steps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3459:1: ( ( ( rule__Steps__StepsAssignment_1 )* ) )
            // InternalUseCase.g:3460:1: ( ( rule__Steps__StepsAssignment_1 )* )
            {
            // InternalUseCase.g:3460:1: ( ( rule__Steps__StepsAssignment_1 )* )
            // InternalUseCase.g:3461:2: ( rule__Steps__StepsAssignment_1 )*
            {
             before(grammarAccess.getStepsAccess().getStepsAssignment_1()); 
            // InternalUseCase.g:3462:2: ( rule__Steps__StepsAssignment_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_INT) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUseCase.g:3462:3: rule__Steps__StepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Steps__StepsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalUseCase.g:3471:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3475:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalUseCase.g:3476:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:3483:1: rule__Step__Group__0__Impl : ( ( rule__Step__NumberAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3487:1: ( ( ( rule__Step__NumberAssignment_0 ) ) )
            // InternalUseCase.g:3488:1: ( ( rule__Step__NumberAssignment_0 ) )
            {
            // InternalUseCase.g:3488:1: ( ( rule__Step__NumberAssignment_0 ) )
            // InternalUseCase.g:3489:2: ( rule__Step__NumberAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getNumberAssignment_0()); 
            // InternalUseCase.g:3490:2: ( rule__Step__NumberAssignment_0 )
            // InternalUseCase.g:3490:3: rule__Step__NumberAssignment_0
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
    // InternalUseCase.g:3498:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3502:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalUseCase.g:3503:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalUseCase.g:3510:1: rule__Step__Group__1__Impl : ( ( rule__Step__ActionAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3514:1: ( ( ( rule__Step__ActionAssignment_1 ) ) )
            // InternalUseCase.g:3515:1: ( ( rule__Step__ActionAssignment_1 ) )
            {
            // InternalUseCase.g:3515:1: ( ( rule__Step__ActionAssignment_1 ) )
            // InternalUseCase.g:3516:2: ( rule__Step__ActionAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getActionAssignment_1()); 
            // InternalUseCase.g:3517:2: ( rule__Step__ActionAssignment_1 )
            // InternalUseCase.g:3517:3: rule__Step__ActionAssignment_1
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
    // InternalUseCase.g:3525:1: rule__Step__Group__2 : rule__Step__Group__2__Impl ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3529:1: ( rule__Step__Group__2__Impl )
            // InternalUseCase.g:3530:2: rule__Step__Group__2__Impl
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
    // InternalUseCase.g:3536:1: rule__Step__Group__2__Impl : ( ( rule__Step__ErrorAssignment_2 )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3540:1: ( ( ( rule__Step__ErrorAssignment_2 )? ) )
            // InternalUseCase.g:3541:1: ( ( rule__Step__ErrorAssignment_2 )? )
            {
            // InternalUseCase.g:3541:1: ( ( rule__Step__ErrorAssignment_2 )? )
            // InternalUseCase.g:3542:2: ( rule__Step__ErrorAssignment_2 )?
            {
             before(grammarAccess.getStepAccess().getErrorAssignment_2()); 
            // InternalUseCase.g:3543:2: ( rule__Step__ErrorAssignment_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=32 && LA49_0<=33)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUseCase.g:3543:3: rule__Step__ErrorAssignment_2
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
    // InternalUseCase.g:3552:1: rule__RaiseError__Group__0 : rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1 ;
    public final void rule__RaiseError__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3556:1: ( rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1 )
            // InternalUseCase.g:3557:2: rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalUseCase.g:3564:1: rule__RaiseError__Group__0__Impl : ( ( rule__RaiseError__Alternatives_0 ) ) ;
    public final void rule__RaiseError__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3568:1: ( ( ( rule__RaiseError__Alternatives_0 ) ) )
            // InternalUseCase.g:3569:1: ( ( rule__RaiseError__Alternatives_0 ) )
            {
            // InternalUseCase.g:3569:1: ( ( rule__RaiseError__Alternatives_0 ) )
            // InternalUseCase.g:3570:2: ( rule__RaiseError__Alternatives_0 )
            {
             before(grammarAccess.getRaiseErrorAccess().getAlternatives_0()); 
            // InternalUseCase.g:3571:2: ( rule__RaiseError__Alternatives_0 )
            // InternalUseCase.g:3571:3: rule__RaiseError__Alternatives_0
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
    // InternalUseCase.g:3579:1: rule__RaiseError__Group__1 : rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2 ;
    public final void rule__RaiseError__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3583:1: ( rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2 )
            // InternalUseCase.g:3584:2: rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:3591:1: rule__RaiseError__Group__1__Impl : ( ( rule__RaiseError__Alternatives_1 ) ) ;
    public final void rule__RaiseError__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3595:1: ( ( ( rule__RaiseError__Alternatives_1 ) ) )
            // InternalUseCase.g:3596:1: ( ( rule__RaiseError__Alternatives_1 ) )
            {
            // InternalUseCase.g:3596:1: ( ( rule__RaiseError__Alternatives_1 ) )
            // InternalUseCase.g:3597:2: ( rule__RaiseError__Alternatives_1 )
            {
             before(grammarAccess.getRaiseErrorAccess().getAlternatives_1()); 
            // InternalUseCase.g:3598:2: ( rule__RaiseError__Alternatives_1 )
            // InternalUseCase.g:3598:3: rule__RaiseError__Alternatives_1
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
    // InternalUseCase.g:3606:1: rule__RaiseError__Group__2 : rule__RaiseError__Group__2__Impl ;
    public final void rule__RaiseError__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3610:1: ( rule__RaiseError__Group__2__Impl )
            // InternalUseCase.g:3611:2: rule__RaiseError__Group__2__Impl
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
    // InternalUseCase.g:3617:1: rule__RaiseError__Group__2__Impl : ( ( rule__RaiseError__ExceptionAssignment_2 ) ) ;
    public final void rule__RaiseError__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3621:1: ( ( ( rule__RaiseError__ExceptionAssignment_2 ) ) )
            // InternalUseCase.g:3622:1: ( ( rule__RaiseError__ExceptionAssignment_2 ) )
            {
            // InternalUseCase.g:3622:1: ( ( rule__RaiseError__ExceptionAssignment_2 ) )
            // InternalUseCase.g:3623:2: ( rule__RaiseError__ExceptionAssignment_2 )
            {
             before(grammarAccess.getRaiseErrorAccess().getExceptionAssignment_2()); 
            // InternalUseCase.g:3624:2: ( rule__RaiseError__ExceptionAssignment_2 )
            // InternalUseCase.g:3624:3: rule__RaiseError__ExceptionAssignment_2
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
    // InternalUseCase.g:3633:1: rule__RaiseError__Group_1_0_0__0 : rule__RaiseError__Group_1_0_0__0__Impl rule__RaiseError__Group_1_0_0__1 ;
    public final void rule__RaiseError__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3637:1: ( rule__RaiseError__Group_1_0_0__0__Impl rule__RaiseError__Group_1_0_0__1 )
            // InternalUseCase.g:3638:2: rule__RaiseError__Group_1_0_0__0__Impl rule__RaiseError__Group_1_0_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalUseCase.g:3645:1: rule__RaiseError__Group_1_0_0__0__Impl : ( 'Raise' ) ;
    public final void rule__RaiseError__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3649:1: ( ( 'Raise' ) )
            // InternalUseCase.g:3650:1: ( 'Raise' )
            {
            // InternalUseCase.g:3650:1: ( 'Raise' )
            // InternalUseCase.g:3651:2: 'Raise'
            {
             before(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0_0_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUseCase.g:3660:1: rule__RaiseError__Group_1_0_0__1 : rule__RaiseError__Group_1_0_0__1__Impl ;
    public final void rule__RaiseError__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3664:1: ( rule__RaiseError__Group_1_0_0__1__Impl )
            // InternalUseCase.g:3665:2: rule__RaiseError__Group_1_0_0__1__Impl
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
    // InternalUseCase.g:3671:1: rule__RaiseError__Group_1_0_0__1__Impl : ( ( 'error' )? ) ;
    public final void rule__RaiseError__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3675:1: ( ( ( 'error' )? ) )
            // InternalUseCase.g:3676:1: ( ( 'error' )? )
            {
            // InternalUseCase.g:3676:1: ( ( 'error' )? )
            // InternalUseCase.g:3677:2: ( 'error' )?
            {
             before(grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_0_0_1()); 
            // InternalUseCase.g:3678:2: ( 'error' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==57) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUseCase.g:3678:3: 'error'
                    {
                    match(input,57,FOLLOW_2); 

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
    // InternalUseCase.g:3687:1: rule__RaiseError__Group_1_0_1__0 : rule__RaiseError__Group_1_0_1__0__Impl rule__RaiseError__Group_1_0_1__1 ;
    public final void rule__RaiseError__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3691:1: ( rule__RaiseError__Group_1_0_1__0__Impl rule__RaiseError__Group_1_0_1__1 )
            // InternalUseCase.g:3692:2: rule__RaiseError__Group_1_0_1__0__Impl rule__RaiseError__Group_1_0_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalUseCase.g:3699:1: rule__RaiseError__Group_1_0_1__0__Impl : ( 'On' ) ;
    public final void rule__RaiseError__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3703:1: ( ( 'On' ) )
            // InternalUseCase.g:3704:1: ( 'On' )
            {
            // InternalUseCase.g:3704:1: ( 'On' )
            // InternalUseCase.g:3705:2: 'On'
            {
             before(grammarAccess.getRaiseErrorAccess().getOnKeyword_1_0_1_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalUseCase.g:3714:1: rule__RaiseError__Group_1_0_1__1 : rule__RaiseError__Group_1_0_1__1__Impl rule__RaiseError__Group_1_0_1__2 ;
    public final void rule__RaiseError__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3718:1: ( rule__RaiseError__Group_1_0_1__1__Impl rule__RaiseError__Group_1_0_1__2 )
            // InternalUseCase.g:3719:2: rule__RaiseError__Group_1_0_1__1__Impl rule__RaiseError__Group_1_0_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalUseCase.g:3726:1: rule__RaiseError__Group_1_0_1__1__Impl : ( 'error' ) ;
    public final void rule__RaiseError__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3730:1: ( ( 'error' ) )
            // InternalUseCase.g:3731:1: ( 'error' )
            {
            // InternalUseCase.g:3731:1: ( 'error' )
            // InternalUseCase.g:3732:2: 'error'
            {
             before(grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_0_1_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalUseCase.g:3741:1: rule__RaiseError__Group_1_0_1__2 : rule__RaiseError__Group_1_0_1__2__Impl ;
    public final void rule__RaiseError__Group_1_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3745:1: ( rule__RaiseError__Group_1_0_1__2__Impl )
            // InternalUseCase.g:3746:2: rule__RaiseError__Group_1_0_1__2__Impl
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
    // InternalUseCase.g:3752:1: rule__RaiseError__Group_1_0_1__2__Impl : ( 'raise' ) ;
    public final void rule__RaiseError__Group_1_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3756:1: ( ( 'raise' ) )
            // InternalUseCase.g:3757:1: ( 'raise' )
            {
            // InternalUseCase.g:3757:1: ( 'raise' )
            // InternalUseCase.g:3758:2: 'raise'
            {
             before(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0_1_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalUseCase.g:3768:1: rule__RaiseError__Group_1_1_0__0 : rule__RaiseError__Group_1_1_0__0__Impl rule__RaiseError__Group_1_1_0__1 ;
    public final void rule__RaiseError__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3772:1: ( rule__RaiseError__Group_1_1_0__0__Impl rule__RaiseError__Group_1_1_0__1 )
            // InternalUseCase.g:3773:2: rule__RaiseError__Group_1_1_0__0__Impl rule__RaiseError__Group_1_1_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalUseCase.g:3780:1: rule__RaiseError__Group_1_1_0__0__Impl : ( 'Melde' ) ;
    public final void rule__RaiseError__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3784:1: ( ( 'Melde' ) )
            // InternalUseCase.g:3785:1: ( 'Melde' )
            {
            // InternalUseCase.g:3785:1: ( 'Melde' )
            // InternalUseCase.g:3786:2: 'Melde'
            {
             before(grammarAccess.getRaiseErrorAccess().getMeldeKeyword_1_1_0_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalUseCase.g:3795:1: rule__RaiseError__Group_1_1_0__1 : rule__RaiseError__Group_1_1_0__1__Impl ;
    public final void rule__RaiseError__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3799:1: ( rule__RaiseError__Group_1_1_0__1__Impl )
            // InternalUseCase.g:3800:2: rule__RaiseError__Group_1_1_0__1__Impl
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
    // InternalUseCase.g:3806:1: rule__RaiseError__Group_1_1_0__1__Impl : ( ( 'Fehler' )? ) ;
    public final void rule__RaiseError__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3810:1: ( ( ( 'Fehler' )? ) )
            // InternalUseCase.g:3811:1: ( ( 'Fehler' )? )
            {
            // InternalUseCase.g:3811:1: ( ( 'Fehler' )? )
            // InternalUseCase.g:3812:2: ( 'Fehler' )?
            {
             before(grammarAccess.getRaiseErrorAccess().getFehlerKeyword_1_1_0_1()); 
            // InternalUseCase.g:3813:2: ( 'Fehler' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==61) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUseCase.g:3813:3: 'Fehler'
                    {
                    match(input,61,FOLLOW_2); 

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
    // InternalUseCase.g:3822:1: rule__RaiseError__Group_1_1_1__0 : rule__RaiseError__Group_1_1_1__0__Impl rule__RaiseError__Group_1_1_1__1 ;
    public final void rule__RaiseError__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3826:1: ( rule__RaiseError__Group_1_1_1__0__Impl rule__RaiseError__Group_1_1_1__1 )
            // InternalUseCase.g:3827:2: rule__RaiseError__Group_1_1_1__0__Impl rule__RaiseError__Group_1_1_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalUseCase.g:3834:1: rule__RaiseError__Group_1_1_1__0__Impl : ( 'Bei' ) ;
    public final void rule__RaiseError__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3838:1: ( ( 'Bei' ) )
            // InternalUseCase.g:3839:1: ( 'Bei' )
            {
            // InternalUseCase.g:3839:1: ( 'Bei' )
            // InternalUseCase.g:3840:2: 'Bei'
            {
             before(grammarAccess.getRaiseErrorAccess().getBeiKeyword_1_1_1_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalUseCase.g:3849:1: rule__RaiseError__Group_1_1_1__1 : rule__RaiseError__Group_1_1_1__1__Impl rule__RaiseError__Group_1_1_1__2 ;
    public final void rule__RaiseError__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3853:1: ( rule__RaiseError__Group_1_1_1__1__Impl rule__RaiseError__Group_1_1_1__2 )
            // InternalUseCase.g:3854:2: rule__RaiseError__Group_1_1_1__1__Impl rule__RaiseError__Group_1_1_1__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalUseCase.g:3861:1: rule__RaiseError__Group_1_1_1__1__Impl : ( 'Fehler' ) ;
    public final void rule__RaiseError__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3865:1: ( ( 'Fehler' ) )
            // InternalUseCase.g:3866:1: ( 'Fehler' )
            {
            // InternalUseCase.g:3866:1: ( 'Fehler' )
            // InternalUseCase.g:3867:2: 'Fehler'
            {
             before(grammarAccess.getRaiseErrorAccess().getFehlerKeyword_1_1_1_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalUseCase.g:3876:1: rule__RaiseError__Group_1_1_1__2 : rule__RaiseError__Group_1_1_1__2__Impl ;
    public final void rule__RaiseError__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3880:1: ( rule__RaiseError__Group_1_1_1__2__Impl )
            // InternalUseCase.g:3881:2: rule__RaiseError__Group_1_1_1__2__Impl
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
    // InternalUseCase.g:3887:1: rule__RaiseError__Group_1_1_1__2__Impl : ( 'melde' ) ;
    public final void rule__RaiseError__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3891:1: ( ( 'melde' ) )
            // InternalUseCase.g:3892:1: ( 'melde' )
            {
            // InternalUseCase.g:3892:1: ( 'melde' )
            // InternalUseCase.g:3893:2: 'melde'
            {
             before(grammarAccess.getRaiseErrorAccess().getMeldeKeyword_1_1_1_2()); 
            match(input,63,FOLLOW_2); 
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
    // InternalUseCase.g:3903:1: rule__Notes__Group__0 : rule__Notes__Group__0__Impl rule__Notes__Group__1 ;
    public final void rule__Notes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3907:1: ( rule__Notes__Group__0__Impl rule__Notes__Group__1 )
            // InternalUseCase.g:3908:2: rule__Notes__Group__0__Impl rule__Notes__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:3915:1: rule__Notes__Group__0__Impl : ( ( rule__Notes__Alternatives_0 ) ) ;
    public final void rule__Notes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3919:1: ( ( ( rule__Notes__Alternatives_0 ) ) )
            // InternalUseCase.g:3920:1: ( ( rule__Notes__Alternatives_0 ) )
            {
            // InternalUseCase.g:3920:1: ( ( rule__Notes__Alternatives_0 ) )
            // InternalUseCase.g:3921:2: ( rule__Notes__Alternatives_0 )
            {
             before(grammarAccess.getNotesAccess().getAlternatives_0()); 
            // InternalUseCase.g:3922:2: ( rule__Notes__Alternatives_0 )
            // InternalUseCase.g:3922:3: rule__Notes__Alternatives_0
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
    // InternalUseCase.g:3930:1: rule__Notes__Group__1 : rule__Notes__Group__1__Impl ;
    public final void rule__Notes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3934:1: ( rule__Notes__Group__1__Impl )
            // InternalUseCase.g:3935:2: rule__Notes__Group__1__Impl
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
    // InternalUseCase.g:3941:1: rule__Notes__Group__1__Impl : ( ( rule__Notes__ContentAssignment_1 ) ) ;
    public final void rule__Notes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3945:1: ( ( ( rule__Notes__ContentAssignment_1 ) ) )
            // InternalUseCase.g:3946:1: ( ( rule__Notes__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:3946:1: ( ( rule__Notes__ContentAssignment_1 ) )
            // InternalUseCase.g:3947:2: ( rule__Notes__ContentAssignment_1 )
            {
             before(grammarAccess.getNotesAccess().getContentAssignment_1()); 
            // InternalUseCase.g:3948:2: ( rule__Notes__ContentAssignment_1 )
            // InternalUseCase.g:3948:3: rule__Notes__ContentAssignment_1
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
    // InternalUseCase.g:3957:1: rule__UsedTypes__Group__0 : rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 ;
    public final void rule__UsedTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3961:1: ( rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 )
            // InternalUseCase.g:3962:2: rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalUseCase.g:3969:1: rule__UsedTypes__Group__0__Impl : ( ( rule__UsedTypes__Alternatives_0 ) ) ;
    public final void rule__UsedTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3973:1: ( ( ( rule__UsedTypes__Alternatives_0 ) ) )
            // InternalUseCase.g:3974:1: ( ( rule__UsedTypes__Alternatives_0 ) )
            {
            // InternalUseCase.g:3974:1: ( ( rule__UsedTypes__Alternatives_0 ) )
            // InternalUseCase.g:3975:2: ( rule__UsedTypes__Alternatives_0 )
            {
             before(grammarAccess.getUsedTypesAccess().getAlternatives_0()); 
            // InternalUseCase.g:3976:2: ( rule__UsedTypes__Alternatives_0 )
            // InternalUseCase.g:3976:3: rule__UsedTypes__Alternatives_0
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
    // InternalUseCase.g:3984:1: rule__UsedTypes__Group__1 : rule__UsedTypes__Group__1__Impl ;
    public final void rule__UsedTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3988:1: ( rule__UsedTypes__Group__1__Impl )
            // InternalUseCase.g:3989:2: rule__UsedTypes__Group__1__Impl
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
    // InternalUseCase.g:3995:1: rule__UsedTypes__Group__1__Impl : ( ( rule__UsedTypes__TypesAssignment_1 )* ) ;
    public final void rule__UsedTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3999:1: ( ( ( rule__UsedTypes__TypesAssignment_1 )* ) )
            // InternalUseCase.g:4000:1: ( ( rule__UsedTypes__TypesAssignment_1 )* )
            {
            // InternalUseCase.g:4000:1: ( ( rule__UsedTypes__TypesAssignment_1 )* )
            // InternalUseCase.g:4001:2: ( rule__UsedTypes__TypesAssignment_1 )*
            {
             before(grammarAccess.getUsedTypesAccess().getTypesAssignment_1()); 
            // InternalUseCase.g:4002:2: ( rule__UsedTypes__TypesAssignment_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==45) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUseCase.g:4002:3: rule__UsedTypes__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__UsedTypes__TypesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalUseCase.g:4011:1: rule__UsedTypes__Group_0_0__0 : rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1 ;
    public final void rule__UsedTypes__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4015:1: ( rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1 )
            // InternalUseCase.g:4016:2: rule__UsedTypes__Group_0_0__0__Impl rule__UsedTypes__Group_0_0__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalUseCase.g:4023:1: rule__UsedTypes__Group_0_0__0__Impl : ( 'used' ) ;
    public final void rule__UsedTypes__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4027:1: ( ( 'used' ) )
            // InternalUseCase.g:4028:1: ( 'used' )
            {
            // InternalUseCase.g:4028:1: ( 'used' )
            // InternalUseCase.g:4029:2: 'used'
            {
             before(grammarAccess.getUsedTypesAccess().getUsedKeyword_0_0_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalUseCase.g:4038:1: rule__UsedTypes__Group_0_0__1 : rule__UsedTypes__Group_0_0__1__Impl ;
    public final void rule__UsedTypes__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4042:1: ( rule__UsedTypes__Group_0_0__1__Impl )
            // InternalUseCase.g:4043:2: rule__UsedTypes__Group_0_0__1__Impl
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
    // InternalUseCase.g:4049:1: rule__UsedTypes__Group_0_0__1__Impl : ( 'types:' ) ;
    public final void rule__UsedTypes__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4053:1: ( ( 'types:' ) )
            // InternalUseCase.g:4054:1: ( 'types:' )
            {
            // InternalUseCase.g:4054:1: ( 'types:' )
            // InternalUseCase.g:4055:2: 'types:'
            {
             before(grammarAccess.getUsedTypesAccess().getTypesKeyword_0_0_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalUseCase.g:4065:1: rule__UsedTypes__Group_0_1__0 : rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1 ;
    public final void rule__UsedTypes__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4069:1: ( rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1 )
            // InternalUseCase.g:4070:2: rule__UsedTypes__Group_0_1__0__Impl rule__UsedTypes__Group_0_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalUseCase.g:4077:1: rule__UsedTypes__Group_0_1__0__Impl : ( 'Genutzte' ) ;
    public final void rule__UsedTypes__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4081:1: ( ( 'Genutzte' ) )
            // InternalUseCase.g:4082:1: ( 'Genutzte' )
            {
            // InternalUseCase.g:4082:1: ( 'Genutzte' )
            // InternalUseCase.g:4083:2: 'Genutzte'
            {
             before(grammarAccess.getUsedTypesAccess().getGenutzteKeyword_0_1_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalUseCase.g:4092:1: rule__UsedTypes__Group_0_1__1 : rule__UsedTypes__Group_0_1__1__Impl ;
    public final void rule__UsedTypes__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4096:1: ( rule__UsedTypes__Group_0_1__1__Impl )
            // InternalUseCase.g:4097:2: rule__UsedTypes__Group_0_1__1__Impl
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
    // InternalUseCase.g:4103:1: rule__UsedTypes__Group_0_1__1__Impl : ( 'Typen:' ) ;
    public final void rule__UsedTypes__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4107:1: ( ( 'Typen:' ) )
            // InternalUseCase.g:4108:1: ( 'Typen:' )
            {
            // InternalUseCase.g:4108:1: ( 'Typen:' )
            // InternalUseCase.g:4109:2: 'Typen:'
            {
             before(grammarAccess.getUsedTypesAccess().getTypenKeyword_0_1_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalUseCase.g:4119:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4123:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalUseCase.g:4124:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:4131:1: rule__Type__Group__0__Impl : ( '-' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4135:1: ( ( '-' ) )
            // InternalUseCase.g:4136:1: ( '-' )
            {
            // InternalUseCase.g:4136:1: ( '-' )
            // InternalUseCase.g:4137:2: '-'
            {
             before(grammarAccess.getTypeAccess().getHyphenMinusKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUseCase.g:4146:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4150:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalUseCase.g:4151:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalUseCase.g:4158:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4162:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalUseCase.g:4163:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalUseCase.g:4163:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalUseCase.g:4164:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalUseCase.g:4165:2: ( rule__Type__NameAssignment_1 )
            // InternalUseCase.g:4165:3: rule__Type__NameAssignment_1
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
    // InternalUseCase.g:4173:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4177:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalUseCase.g:4178:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:4185:1: rule__Type__Group__2__Impl : ( '(' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4189:1: ( ( '(' ) )
            // InternalUseCase.g:4190:1: ( '(' )
            {
            // InternalUseCase.g:4190:1: ( '(' )
            // InternalUseCase.g:4191:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUseCase.g:4200:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4204:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalUseCase.g:4205:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCase.g:4212:1: rule__Type__Group__3__Impl : ( ( rule__Type__DescriptionAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4216:1: ( ( ( rule__Type__DescriptionAssignment_3 ) ) )
            // InternalUseCase.g:4217:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            {
            // InternalUseCase.g:4217:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            // InternalUseCase.g:4218:2: ( rule__Type__DescriptionAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getDescriptionAssignment_3()); 
            // InternalUseCase.g:4219:2: ( rule__Type__DescriptionAssignment_3 )
            // InternalUseCase.g:4219:3: rule__Type__DescriptionAssignment_3
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
    // InternalUseCase.g:4227:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4231:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalUseCase.g:4232:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalUseCase.g:4239:1: rule__Type__Group__4__Impl : ( ')' ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4243:1: ( ( ')' ) )
            // InternalUseCase.g:4244:1: ( ')' )
            {
            // InternalUseCase.g:4244:1: ( ')' )
            // InternalUseCase.g:4245:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUseCase.g:4254:1: rule__Type__Group__5 : rule__Type__Group__5__Impl ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4258:1: ( rule__Type__Group__5__Impl )
            // InternalUseCase.g:4259:2: rule__Type__Group__5__Impl
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
    // InternalUseCase.g:4265:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )? ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4269:1: ( ( ( rule__Type__Group_5__0 )? ) )
            // InternalUseCase.g:4270:1: ( ( rule__Type__Group_5__0 )? )
            {
            // InternalUseCase.g:4270:1: ( ( rule__Type__Group_5__0 )? )
            // InternalUseCase.g:4271:2: ( rule__Type__Group_5__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // InternalUseCase.g:4272:2: ( rule__Type__Group_5__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==68) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalUseCase.g:4272:3: rule__Type__Group_5__0
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
    // InternalUseCase.g:4281:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4285:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalUseCase.g:4286:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:4293:1: rule__Type__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4297:1: ( ( '[' ) )
            // InternalUseCase.g:4298:1: ( '[' )
            {
            // InternalUseCase.g:4298:1: ( '[' )
            // InternalUseCase.g:4299:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalUseCase.g:4308:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4312:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalUseCase.g:4313:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalUseCase.g:4320:1: rule__Type__Group_5__1__Impl : ( ( rule__Type__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4324:1: ( ( ( rule__Type__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:4325:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:4325:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:4326:2: ( rule__Type__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getTypeAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:4327:2: ( rule__Type__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:4327:3: rule__Type__ImportInfoAssignment_5_1
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
    // InternalUseCase.g:4335:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4339:1: ( rule__Type__Group_5__2__Impl )
            // InternalUseCase.g:4340:2: rule__Type__Group_5__2__Impl
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
    // InternalUseCase.g:4346:1: rule__Type__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4350:1: ( ( ']' ) )
            // InternalUseCase.g:4351:1: ( ']' )
            {
            // InternalUseCase.g:4351:1: ( ']' )
            // InternalUseCase.g:4352:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,69,FOLLOW_2); 
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
    // InternalUseCase.g:4362:1: rule__UsedExceptions__Group__0 : rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 ;
    public final void rule__UsedExceptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4366:1: ( rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 )
            // InternalUseCase.g:4367:2: rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalUseCase.g:4374:1: rule__UsedExceptions__Group__0__Impl : ( ( rule__UsedExceptions__Alternatives_0 ) ) ;
    public final void rule__UsedExceptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4378:1: ( ( ( rule__UsedExceptions__Alternatives_0 ) ) )
            // InternalUseCase.g:4379:1: ( ( rule__UsedExceptions__Alternatives_0 ) )
            {
            // InternalUseCase.g:4379:1: ( ( rule__UsedExceptions__Alternatives_0 ) )
            // InternalUseCase.g:4380:2: ( rule__UsedExceptions__Alternatives_0 )
            {
             before(grammarAccess.getUsedExceptionsAccess().getAlternatives_0()); 
            // InternalUseCase.g:4381:2: ( rule__UsedExceptions__Alternatives_0 )
            // InternalUseCase.g:4381:3: rule__UsedExceptions__Alternatives_0
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
    // InternalUseCase.g:4389:1: rule__UsedExceptions__Group__1 : rule__UsedExceptions__Group__1__Impl ;
    public final void rule__UsedExceptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4393:1: ( rule__UsedExceptions__Group__1__Impl )
            // InternalUseCase.g:4394:2: rule__UsedExceptions__Group__1__Impl
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
    // InternalUseCase.g:4400:1: rule__UsedExceptions__Group__1__Impl : ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* ) ;
    public final void rule__UsedExceptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4404:1: ( ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* ) )
            // InternalUseCase.g:4405:1: ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* )
            {
            // InternalUseCase.g:4405:1: ( ( rule__UsedExceptions__ExceptionsAssignment_1 )* )
            // InternalUseCase.g:4406:2: ( rule__UsedExceptions__ExceptionsAssignment_1 )*
            {
             before(grammarAccess.getUsedExceptionsAccess().getExceptionsAssignment_1()); 
            // InternalUseCase.g:4407:2: ( rule__UsedExceptions__ExceptionsAssignment_1 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==45) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalUseCase.g:4407:3: rule__UsedExceptions__ExceptionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__UsedExceptions__ExceptionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalUseCase.g:4416:1: rule__UsedExceptions__Group_0_0__0 : rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1 ;
    public final void rule__UsedExceptions__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4420:1: ( rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1 )
            // InternalUseCase.g:4421:2: rule__UsedExceptions__Group_0_0__0__Impl rule__UsedExceptions__Group_0_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalUseCase.g:4428:1: rule__UsedExceptions__Group_0_0__0__Impl : ( 'used' ) ;
    public final void rule__UsedExceptions__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4432:1: ( ( 'used' ) )
            // InternalUseCase.g:4433:1: ( 'used' )
            {
            // InternalUseCase.g:4433:1: ( 'used' )
            // InternalUseCase.g:4434:2: 'used'
            {
             before(grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0_0_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalUseCase.g:4443:1: rule__UsedExceptions__Group_0_0__1 : rule__UsedExceptions__Group_0_0__1__Impl ;
    public final void rule__UsedExceptions__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4447:1: ( rule__UsedExceptions__Group_0_0__1__Impl )
            // InternalUseCase.g:4448:2: rule__UsedExceptions__Group_0_0__1__Impl
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
    // InternalUseCase.g:4454:1: rule__UsedExceptions__Group_0_0__1__Impl : ( 'errors:' ) ;
    public final void rule__UsedExceptions__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4458:1: ( ( 'errors:' ) )
            // InternalUseCase.g:4459:1: ( 'errors:' )
            {
            // InternalUseCase.g:4459:1: ( 'errors:' )
            // InternalUseCase.g:4460:2: 'errors:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_0_0_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalUseCase.g:4470:1: rule__UsedExceptions__Group_0_1__0 : rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1 ;
    public final void rule__UsedExceptions__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4474:1: ( rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1 )
            // InternalUseCase.g:4475:2: rule__UsedExceptions__Group_0_1__0__Impl rule__UsedExceptions__Group_0_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalUseCase.g:4482:1: rule__UsedExceptions__Group_0_1__0__Impl : ( 'Genutzte' ) ;
    public final void rule__UsedExceptions__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4486:1: ( ( 'Genutzte' ) )
            // InternalUseCase.g:4487:1: ( 'Genutzte' )
            {
            // InternalUseCase.g:4487:1: ( 'Genutzte' )
            // InternalUseCase.g:4488:2: 'Genutzte'
            {
             before(grammarAccess.getUsedExceptionsAccess().getGenutzteKeyword_0_1_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalUseCase.g:4497:1: rule__UsedExceptions__Group_0_1__1 : rule__UsedExceptions__Group_0_1__1__Impl ;
    public final void rule__UsedExceptions__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4501:1: ( rule__UsedExceptions__Group_0_1__1__Impl )
            // InternalUseCase.g:4502:2: rule__UsedExceptions__Group_0_1__1__Impl
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
    // InternalUseCase.g:4508:1: rule__UsedExceptions__Group_0_1__1__Impl : ( 'Fehler:' ) ;
    public final void rule__UsedExceptions__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4512:1: ( ( 'Fehler:' ) )
            // InternalUseCase.g:4513:1: ( 'Fehler:' )
            {
            // InternalUseCase.g:4513:1: ( 'Fehler:' )
            // InternalUseCase.g:4514:2: 'Fehler:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getFehlerKeyword_0_1_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalUseCase.g:4524:1: rule__ExceptionDecleration__Group__0 : rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 ;
    public final void rule__ExceptionDecleration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4528:1: ( rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 )
            // InternalUseCase.g:4529:2: rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:4536:1: rule__ExceptionDecleration__Group__0__Impl : ( '-' ) ;
    public final void rule__ExceptionDecleration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4540:1: ( ( '-' ) )
            // InternalUseCase.g:4541:1: ( '-' )
            {
            // InternalUseCase.g:4541:1: ( '-' )
            // InternalUseCase.g:4542:2: '-'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUseCase.g:4551:1: rule__ExceptionDecleration__Group__1 : rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 ;
    public final void rule__ExceptionDecleration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4555:1: ( rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 )
            // InternalUseCase.g:4556:2: rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalUseCase.g:4563:1: rule__ExceptionDecleration__Group__1__Impl : ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) ;
    public final void rule__ExceptionDecleration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4567:1: ( ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) )
            // InternalUseCase.g:4568:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            {
            // InternalUseCase.g:4568:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            // InternalUseCase.g:4569:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getNameAssignment_1()); 
            // InternalUseCase.g:4570:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            // InternalUseCase.g:4570:3: rule__ExceptionDecleration__NameAssignment_1
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
    // InternalUseCase.g:4578:1: rule__ExceptionDecleration__Group__2 : rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 ;
    public final void rule__ExceptionDecleration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4582:1: ( rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 )
            // InternalUseCase.g:4583:2: rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:4590:1: rule__ExceptionDecleration__Group__2__Impl : ( '(' ) ;
    public final void rule__ExceptionDecleration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4594:1: ( ( '(' ) )
            // InternalUseCase.g:4595:1: ( '(' )
            {
            // InternalUseCase.g:4595:1: ( '(' )
            // InternalUseCase.g:4596:2: '('
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUseCase.g:4605:1: rule__ExceptionDecleration__Group__3 : rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4 ;
    public final void rule__ExceptionDecleration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4609:1: ( rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4 )
            // InternalUseCase.g:4610:2: rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCase.g:4617:1: rule__ExceptionDecleration__Group__3__Impl : ( ( rule__ExceptionDecleration__MessageAssignment_3 ) ) ;
    public final void rule__ExceptionDecleration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4621:1: ( ( ( rule__ExceptionDecleration__MessageAssignment_3 ) ) )
            // InternalUseCase.g:4622:1: ( ( rule__ExceptionDecleration__MessageAssignment_3 ) )
            {
            // InternalUseCase.g:4622:1: ( ( rule__ExceptionDecleration__MessageAssignment_3 ) )
            // InternalUseCase.g:4623:2: ( rule__ExceptionDecleration__MessageAssignment_3 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getMessageAssignment_3()); 
            // InternalUseCase.g:4624:2: ( rule__ExceptionDecleration__MessageAssignment_3 )
            // InternalUseCase.g:4624:3: rule__ExceptionDecleration__MessageAssignment_3
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
    // InternalUseCase.g:4632:1: rule__ExceptionDecleration__Group__4 : rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5 ;
    public final void rule__ExceptionDecleration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4636:1: ( rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5 )
            // InternalUseCase.g:4637:2: rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalUseCase.g:4644:1: rule__ExceptionDecleration__Group__4__Impl : ( ')' ) ;
    public final void rule__ExceptionDecleration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4648:1: ( ( ')' ) )
            // InternalUseCase.g:4649:1: ( ')' )
            {
            // InternalUseCase.g:4649:1: ( ')' )
            // InternalUseCase.g:4650:2: ')'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_4()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUseCase.g:4659:1: rule__ExceptionDecleration__Group__5 : rule__ExceptionDecleration__Group__5__Impl ;
    public final void rule__ExceptionDecleration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4663:1: ( rule__ExceptionDecleration__Group__5__Impl )
            // InternalUseCase.g:4664:2: rule__ExceptionDecleration__Group__5__Impl
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
    // InternalUseCase.g:4670:1: rule__ExceptionDecleration__Group__5__Impl : ( ( rule__ExceptionDecleration__Group_5__0 )? ) ;
    public final void rule__ExceptionDecleration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4674:1: ( ( ( rule__ExceptionDecleration__Group_5__0 )? ) )
            // InternalUseCase.g:4675:1: ( ( rule__ExceptionDecleration__Group_5__0 )? )
            {
            // InternalUseCase.g:4675:1: ( ( rule__ExceptionDecleration__Group_5__0 )? )
            // InternalUseCase.g:4676:2: ( rule__ExceptionDecleration__Group_5__0 )?
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup_5()); 
            // InternalUseCase.g:4677:2: ( rule__ExceptionDecleration__Group_5__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==68) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUseCase.g:4677:3: rule__ExceptionDecleration__Group_5__0
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
    // InternalUseCase.g:4686:1: rule__ExceptionDecleration__Group_5__0 : rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1 ;
    public final void rule__ExceptionDecleration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4690:1: ( rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1 )
            // InternalUseCase.g:4691:2: rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:4698:1: rule__ExceptionDecleration__Group_5__0__Impl : ( '[' ) ;
    public final void rule__ExceptionDecleration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4702:1: ( ( '[' ) )
            // InternalUseCase.g:4703:1: ( '[' )
            {
            // InternalUseCase.g:4703:1: ( '[' )
            // InternalUseCase.g:4704:2: '['
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalUseCase.g:4713:1: rule__ExceptionDecleration__Group_5__1 : rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2 ;
    public final void rule__ExceptionDecleration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4717:1: ( rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2 )
            // InternalUseCase.g:4718:2: rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalUseCase.g:4725:1: rule__ExceptionDecleration__Group_5__1__Impl : ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__ExceptionDecleration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4729:1: ( ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:4730:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:4730:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:4731:2: ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:4732:2: ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:4732:3: rule__ExceptionDecleration__ImportInfoAssignment_5_1
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
    // InternalUseCase.g:4740:1: rule__ExceptionDecleration__Group_5__2 : rule__ExceptionDecleration__Group_5__2__Impl ;
    public final void rule__ExceptionDecleration__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4744:1: ( rule__ExceptionDecleration__Group_5__2__Impl )
            // InternalUseCase.g:4745:2: rule__ExceptionDecleration__Group_5__2__Impl
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
    // InternalUseCase.g:4751:1: rule__ExceptionDecleration__Group_5__2__Impl : ( ']' ) ;
    public final void rule__ExceptionDecleration__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4755:1: ( ( ']' ) )
            // InternalUseCase.g:4756:1: ( ']' )
            {
            // InternalUseCase.g:4756:1: ( ']' )
            // InternalUseCase.g:4757:2: ']'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,69,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__UseCasesAssignment_0"
    // InternalUseCase.g:4767:1: rule__Model__UseCasesAssignment_0 : ( ruleUseCase ) ;
    public final void rule__Model__UseCasesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4771:1: ( ( ruleUseCase ) )
            // InternalUseCase.g:4772:2: ( ruleUseCase )
            {
            // InternalUseCase.g:4772:2: ( ruleUseCase )
            // InternalUseCase.g:4773:3: ruleUseCase
            {
             before(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UseCasesAssignment_0"


    // $ANTLR start "rule__Model__TypesAssignment_1"
    // InternalUseCase.g:4782:1: rule__Model__TypesAssignment_1 : ( ruleUsedTypes ) ;
    public final void rule__Model__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4786:1: ( ( ruleUsedTypes ) )
            // InternalUseCase.g:4787:2: ( ruleUsedTypes )
            {
            // InternalUseCase.g:4787:2: ( ruleUsedTypes )
            // InternalUseCase.g:4788:3: ruleUsedTypes
            {
             before(grammarAccess.getModelAccess().getTypesUsedTypesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUsedTypes();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesUsedTypesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment_1"


    // $ANTLR start "rule__Model__ExceptionsAssignment_2"
    // InternalUseCase.g:4797:1: rule__Model__ExceptionsAssignment_2 : ( ruleUsedExceptions ) ;
    public final void rule__Model__ExceptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4801:1: ( ( ruleUsedExceptions ) )
            // InternalUseCase.g:4802:2: ( ruleUsedExceptions )
            {
            // InternalUseCase.g:4802:2: ( ruleUsedExceptions )
            // InternalUseCase.g:4803:3: ruleUsedExceptions
            {
             before(grammarAccess.getModelAccess().getExceptionsUsedExceptionsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUsedExceptions();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExceptionsUsedExceptionsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExceptionsAssignment_2"


    // $ANTLR start "rule__UseCase__NameAssignment_1"
    // InternalUseCase.g:4812:1: rule__UseCase__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4816:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4817:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4817:2: ( RULE_STRING )
            // InternalUseCase.g:4818:3: RULE_STRING
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
    // InternalUseCase.g:4827:1: rule__UseCase__DescriptionsAssignment_2 : ( ruleDescription ) ;
    public final void rule__UseCase__DescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4831:1: ( ( ruleDescription ) )
            // InternalUseCase.g:4832:2: ( ruleDescription )
            {
            // InternalUseCase.g:4832:2: ( ruleDescription )
            // InternalUseCase.g:4833:3: ruleDescription
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
    // InternalUseCase.g:4842:1: rule__UseCase__AllowedUserGroupsAssignment_3 : ( ruleAllowedUserGroups ) ;
    public final void rule__UseCase__AllowedUserGroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4846:1: ( ( ruleAllowedUserGroups ) )
            // InternalUseCase.g:4847:2: ( ruleAllowedUserGroups )
            {
            // InternalUseCase.g:4847:2: ( ruleAllowedUserGroups )
            // InternalUseCase.g:4848:3: ruleAllowedUserGroups
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
    // InternalUseCase.g:4857:1: rule__UseCase__InputsAssignment_4 : ( ruleInputs ) ;
    public final void rule__UseCase__InputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4861:1: ( ( ruleInputs ) )
            // InternalUseCase.g:4862:2: ( ruleInputs )
            {
            // InternalUseCase.g:4862:2: ( ruleInputs )
            // InternalUseCase.g:4863:3: ruleInputs
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
    // InternalUseCase.g:4872:1: rule__UseCase__OutputsAssignment_5 : ( ruleOutputs ) ;
    public final void rule__UseCase__OutputsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4876:1: ( ( ruleOutputs ) )
            // InternalUseCase.g:4877:2: ( ruleOutputs )
            {
            // InternalUseCase.g:4877:2: ( ruleOutputs )
            // InternalUseCase.g:4878:3: ruleOutputs
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
    // InternalUseCase.g:4887:1: rule__UseCase__PreconditionsAssignment_6 : ( rulePreConditions ) ;
    public final void rule__UseCase__PreconditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4891:1: ( ( rulePreConditions ) )
            // InternalUseCase.g:4892:2: ( rulePreConditions )
            {
            // InternalUseCase.g:4892:2: ( rulePreConditions )
            // InternalUseCase.g:4893:3: rulePreConditions
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
    // InternalUseCase.g:4902:1: rule__UseCase__StepsAssignment_7 : ( ruleSteps ) ;
    public final void rule__UseCase__StepsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4906:1: ( ( ruleSteps ) )
            // InternalUseCase.g:4907:2: ( ruleSteps )
            {
            // InternalUseCase.g:4907:2: ( ruleSteps )
            // InternalUseCase.g:4908:3: ruleSteps
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
    // InternalUseCase.g:4917:1: rule__UseCase__NotesAssignment_8 : ( ruleNotes ) ;
    public final void rule__UseCase__NotesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4921:1: ( ( ruleNotes ) )
            // InternalUseCase.g:4922:2: ( ruleNotes )
            {
            // InternalUseCase.g:4922:2: ( ruleNotes )
            // InternalUseCase.g:4923:3: ruleNotes
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
    // InternalUseCase.g:4932:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4936:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4937:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4937:2: ( RULE_STRING )
            // InternalUseCase.g:4938:3: RULE_STRING
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
    // InternalUseCase.g:4947:1: rule__AllowedUserGroups__GroupsAssignment_1 : ( ruleAllowedUserGroup ) ;
    public final void rule__AllowedUserGroups__GroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4951:1: ( ( ruleAllowedUserGroup ) )
            // InternalUseCase.g:4952:2: ( ruleAllowedUserGroup )
            {
            // InternalUseCase.g:4952:2: ( ruleAllowedUserGroup )
            // InternalUseCase.g:4953:3: ruleAllowedUserGroup
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
    // InternalUseCase.g:4962:1: rule__AllowedUserGroup__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__AllowedUserGroup__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4966:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:4967:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:4967:2: ( ( 'many' ) )
            // InternalUseCase.g:4968:3: ( 'many' )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:4969:3: ( 'many' )
            // InternalUseCase.g:4970:4: 'many'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalUseCase.g:4981:1: rule__AllowedUserGroup__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllowedUserGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4985:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4986:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4986:2: ( RULE_STRING )
            // InternalUseCase.g:4987:3: RULE_STRING
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
    // InternalUseCase.g:4996:1: rule__AllowedUserGroup__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllowedUserGroup__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5000:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:5001:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:5001:2: ( ( RULE_ID ) )
            // InternalUseCase.g:5002:3: ( RULE_ID )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:5003:3: ( RULE_ID )
            // InternalUseCase.g:5004:4: RULE_ID
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
    // InternalUseCase.g:5015:1: rule__Inputs__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Inputs__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5019:1: ( ( ruleInput ) )
            // InternalUseCase.g:5020:2: ( ruleInput )
            {
            // InternalUseCase.g:5020:2: ( ruleInput )
            // InternalUseCase.g:5021:3: ruleInput
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
    // InternalUseCase.g:5030:1: rule__Input__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Input__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5034:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:5035:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:5035:2: ( ( 'many' ) )
            // InternalUseCase.g:5036:3: ( 'many' )
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:5037:3: ( 'many' )
            // InternalUseCase.g:5038:4: 'many'
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalUseCase.g:5049:1: rule__Input__OptionalAssignment_2 : ( ruleOptional ) ;
    public final void rule__Input__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5053:1: ( ( ruleOptional ) )
            // InternalUseCase.g:5054:2: ( ruleOptional )
            {
            // InternalUseCase.g:5054:2: ( ruleOptional )
            // InternalUseCase.g:5055:3: ruleOptional
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
    // InternalUseCase.g:5064:1: rule__Input__ContentAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Input__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5068:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5069:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5069:2: ( RULE_STRING )
            // InternalUseCase.g:5070:3: RULE_STRING
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
    // InternalUseCase.g:5079:1: rule__Input__TypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Input__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5083:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:5084:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:5084:2: ( ( RULE_ID ) )
            // InternalUseCase.g:5085:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getTypeTypeCrossReference_4_1_0()); 
            // InternalUseCase.g:5086:3: ( RULE_ID )
            // InternalUseCase.g:5087:4: RULE_ID
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
    // InternalUseCase.g:5098:1: rule__Input__ExampleAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Input__ExampleAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5102:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5103:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5103:2: ( RULE_STRING )
            // InternalUseCase.g:5104:3: RULE_STRING
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
    // InternalUseCase.g:5113:1: rule__Outputs__OutputsAssignment_1 : ( ruleOutput ) ;
    public final void rule__Outputs__OutputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5117:1: ( ( ruleOutput ) )
            // InternalUseCase.g:5118:2: ( ruleOutput )
            {
            // InternalUseCase.g:5118:2: ( ruleOutput )
            // InternalUseCase.g:5119:3: ruleOutput
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
    // InternalUseCase.g:5128:1: rule__Output__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Output__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5132:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:5133:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:5133:2: ( ( 'many' ) )
            // InternalUseCase.g:5134:3: ( 'many' )
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:5135:3: ( 'many' )
            // InternalUseCase.g:5136:4: 'many'
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalUseCase.g:5147:1: rule__Output__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5151:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5152:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5152:2: ( RULE_STRING )
            // InternalUseCase.g:5153:3: RULE_STRING
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
    // InternalUseCase.g:5162:1: rule__Output__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Output__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5166:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:5167:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:5167:2: ( ( RULE_ID ) )
            // InternalUseCase.g:5168:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:5169:3: ( RULE_ID )
            // InternalUseCase.g:5170:4: RULE_ID
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
    // InternalUseCase.g:5181:1: rule__Output__ExampleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Output__ExampleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5185:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5186:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5186:2: ( RULE_STRING )
            // InternalUseCase.g:5187:3: RULE_STRING
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
    // InternalUseCase.g:5196:1: rule__PreConditions__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__PreConditions__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5200:1: ( ( ruleCondition ) )
            // InternalUseCase.g:5201:2: ( ruleCondition )
            {
            // InternalUseCase.g:5201:2: ( ruleCondition )
            // InternalUseCase.g:5202:3: ruleCondition
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
    // InternalUseCase.g:5211:1: rule__Condition__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Condition__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5215:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5216:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5216:2: ( RULE_STRING )
            // InternalUseCase.g:5217:3: RULE_STRING
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
    // InternalUseCase.g:5226:1: rule__Steps__StepsAssignment_1 : ( ruleStep ) ;
    public final void rule__Steps__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5230:1: ( ( ruleStep ) )
            // InternalUseCase.g:5231:2: ( ruleStep )
            {
            // InternalUseCase.g:5231:2: ( ruleStep )
            // InternalUseCase.g:5232:3: ruleStep
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
    // InternalUseCase.g:5241:1: rule__Step__NumberAssignment_0 : ( ruleQualifiedNumber ) ;
    public final void rule__Step__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5245:1: ( ( ruleQualifiedNumber ) )
            // InternalUseCase.g:5246:2: ( ruleQualifiedNumber )
            {
            // InternalUseCase.g:5246:2: ( ruleQualifiedNumber )
            // InternalUseCase.g:5247:3: ruleQualifiedNumber
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
    // InternalUseCase.g:5256:1: rule__Step__ActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Step__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5260:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5261:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5261:2: ( RULE_STRING )
            // InternalUseCase.g:5262:3: RULE_STRING
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
    // InternalUseCase.g:5271:1: rule__Step__ErrorAssignment_2 : ( ruleRaiseError ) ;
    public final void rule__Step__ErrorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5275:1: ( ( ruleRaiseError ) )
            // InternalUseCase.g:5276:2: ( ruleRaiseError )
            {
            // InternalUseCase.g:5276:2: ( ruleRaiseError )
            // InternalUseCase.g:5277:3: ruleRaiseError
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
    // InternalUseCase.g:5286:1: rule__RaiseError__ExceptionAssignment_2 : ( ruleException ) ;
    public final void rule__RaiseError__ExceptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5290:1: ( ( ruleException ) )
            // InternalUseCase.g:5291:2: ( ruleException )
            {
            // InternalUseCase.g:5291:2: ( ruleException )
            // InternalUseCase.g:5292:3: ruleException
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
    // InternalUseCase.g:5301:1: rule__Notes__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notes__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5305:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5306:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5306:2: ( RULE_STRING )
            // InternalUseCase.g:5307:3: RULE_STRING
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
    // InternalUseCase.g:5316:1: rule__UsedTypes__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__UsedTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5320:1: ( ( ruleType ) )
            // InternalUseCase.g:5321:2: ( ruleType )
            {
            // InternalUseCase.g:5321:2: ( ruleType )
            // InternalUseCase.g:5322:3: ruleType
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
    // InternalUseCase.g:5331:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5335:1: ( ( RULE_ID ) )
            // InternalUseCase.g:5336:2: ( RULE_ID )
            {
            // InternalUseCase.g:5336:2: ( RULE_ID )
            // InternalUseCase.g:5337:3: RULE_ID
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
    // InternalUseCase.g:5346:1: rule__Type__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Type__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5350:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5351:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5351:2: ( RULE_STRING )
            // InternalUseCase.g:5352:3: RULE_STRING
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
    // InternalUseCase.g:5361:1: rule__Type__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__Type__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5365:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:5366:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:5366:2: ( ruleQualifiedName )
            // InternalUseCase.g:5367:3: ruleQualifiedName
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
    // InternalUseCase.g:5376:1: rule__UsedExceptions__ExceptionsAssignment_1 : ( ruleExceptionDecleration ) ;
    public final void rule__UsedExceptions__ExceptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5380:1: ( ( ruleExceptionDecleration ) )
            // InternalUseCase.g:5381:2: ( ruleExceptionDecleration )
            {
            // InternalUseCase.g:5381:2: ( ruleExceptionDecleration )
            // InternalUseCase.g:5382:3: ruleExceptionDecleration
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
    // InternalUseCase.g:5391:1: rule__Exception__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Exception__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5395:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:5396:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:5396:2: ( ( RULE_ID ) )
            // InternalUseCase.g:5397:3: ( RULE_ID )
            {
             before(grammarAccess.getExceptionAccess().getTypeExceptionDeclerationCrossReference_0()); 
            // InternalUseCase.g:5398:3: ( RULE_ID )
            // InternalUseCase.g:5399:4: RULE_ID
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
    // InternalUseCase.g:5410:1: rule__ExceptionDecleration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExceptionDecleration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5414:1: ( ( RULE_ID ) )
            // InternalUseCase.g:5415:2: ( RULE_ID )
            {
            // InternalUseCase.g:5415:2: ( RULE_ID )
            // InternalUseCase.g:5416:3: RULE_ID
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
    // InternalUseCase.g:5425:1: rule__ExceptionDecleration__MessageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ExceptionDecleration__MessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5429:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:5430:2: ( RULE_STRING )
            {
            // InternalUseCase.g:5430:2: ( RULE_STRING )
            // InternalUseCase.g:5431:3: RULE_STRING
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
    // InternalUseCase.g:5440:1: rule__ExceptionDecleration__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__ExceptionDecleration__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:5444:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:5445:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:5445:2: ( ruleQualifiedName )
            // InternalUseCase.g:5446:3: ruleQualifiedName
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0044497CFF0FC000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000300000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x5500000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});

}