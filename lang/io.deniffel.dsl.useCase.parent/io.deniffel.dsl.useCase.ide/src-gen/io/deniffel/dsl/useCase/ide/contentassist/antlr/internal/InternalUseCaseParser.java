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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'inputs:'", "'input:'", "'outputs:'", "'output:'", "'use-case'", "'end'", "'of'", "'description:'", "'type'", "'('", "')'", "'['", "']'", "'-'", "'as'", "'allowed-usergroups:'", "'.'", "'many'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCase.g:78:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // InternalUseCase.g:79:1: ( ruleUseCase EOF )
            // InternalUseCase.g:80:1: ruleUseCase EOF
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
    // InternalUseCase.g:87:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:91:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUseCase.g:92:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUseCase.g:92:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUseCase.g:93:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUseCase.g:94:3: ( rule__UseCase__Group__0 )
            // InternalUseCase.g:94:4: rule__UseCase__Group__0
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
    // InternalUseCase.g:103:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalUseCase.g:104:1: ( ruleDescription EOF )
            // InternalUseCase.g:105:1: ruleDescription EOF
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
    // InternalUseCase.g:112:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:116:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalUseCase.g:117:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalUseCase.g:117:2: ( ( rule__Description__Group__0 ) )
            // InternalUseCase.g:118:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalUseCase.g:119:3: ( rule__Description__Group__0 )
            // InternalUseCase.g:119:4: rule__Description__Group__0
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


    // $ANTLR start "entryRuleInputs"
    // InternalUseCase.g:128:1: entryRuleInputs : ruleInputs EOF ;
    public final void entryRuleInputs() throws RecognitionException {
        try {
            // InternalUseCase.g:129:1: ( ruleInputs EOF )
            // InternalUseCase.g:130:1: ruleInputs EOF
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
    // InternalUseCase.g:137:1: ruleInputs : ( ( rule__Inputs__Group__0 ) ) ;
    public final void ruleInputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:141:2: ( ( ( rule__Inputs__Group__0 ) ) )
            // InternalUseCase.g:142:2: ( ( rule__Inputs__Group__0 ) )
            {
            // InternalUseCase.g:142:2: ( ( rule__Inputs__Group__0 ) )
            // InternalUseCase.g:143:3: ( rule__Inputs__Group__0 )
            {
             before(grammarAccess.getInputsAccess().getGroup()); 
            // InternalUseCase.g:144:3: ( rule__Inputs__Group__0 )
            // InternalUseCase.g:144:4: rule__Inputs__Group__0
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


    // $ANTLR start "entryRuleOutputs"
    // InternalUseCase.g:153:1: entryRuleOutputs : ruleOutputs EOF ;
    public final void entryRuleOutputs() throws RecognitionException {
        try {
            // InternalUseCase.g:154:1: ( ruleOutputs EOF )
            // InternalUseCase.g:155:1: ruleOutputs EOF
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
    // InternalUseCase.g:162:1: ruleOutputs : ( ( rule__Outputs__Group__0 ) ) ;
    public final void ruleOutputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:166:2: ( ( ( rule__Outputs__Group__0 ) ) )
            // InternalUseCase.g:167:2: ( ( rule__Outputs__Group__0 ) )
            {
            // InternalUseCase.g:167:2: ( ( rule__Outputs__Group__0 ) )
            // InternalUseCase.g:168:3: ( rule__Outputs__Group__0 )
            {
             before(grammarAccess.getOutputsAccess().getGroup()); 
            // InternalUseCase.g:169:3: ( rule__Outputs__Group__0 )
            // InternalUseCase.g:169:4: rule__Outputs__Group__0
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


    // $ANTLR start "entryRuleType"
    // InternalUseCase.g:178:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUseCase.g:179:1: ( ruleType EOF )
            // InternalUseCase.g:180:1: ruleType EOF
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
    // InternalUseCase.g:187:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:191:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalUseCase.g:192:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalUseCase.g:192:2: ( ( rule__Type__Group__0 ) )
            // InternalUseCase.g:193:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalUseCase.g:194:3: ( rule__Type__Group__0 )
            // InternalUseCase.g:194:4: rule__Type__Group__0
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


    // $ANTLR start "entryRuleInput"
    // InternalUseCase.g:203:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalUseCase.g:204:1: ( ruleInput EOF )
            // InternalUseCase.g:205:1: ruleInput EOF
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
    // InternalUseCase.g:212:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:216:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalUseCase.g:217:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalUseCase.g:217:2: ( ( rule__Input__Group__0 ) )
            // InternalUseCase.g:218:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalUseCase.g:219:3: ( rule__Input__Group__0 )
            // InternalUseCase.g:219:4: rule__Input__Group__0
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


    // $ANTLR start "entryRuleOutput"
    // InternalUseCase.g:228:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalUseCase.g:229:1: ( ruleOutput EOF )
            // InternalUseCase.g:230:1: ruleOutput EOF
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
    // InternalUseCase.g:237:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:241:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalUseCase.g:242:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalUseCase.g:242:2: ( ( rule__Output__Group__0 ) )
            // InternalUseCase.g:243:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalUseCase.g:244:3: ( rule__Output__Group__0 )
            // InternalUseCase.g:244:4: rule__Output__Group__0
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


    // $ANTLR start "entryRuleAllowedUserGroups"
    // InternalUseCase.g:253:1: entryRuleAllowedUserGroups : ruleAllowedUserGroups EOF ;
    public final void entryRuleAllowedUserGroups() throws RecognitionException {
        try {
            // InternalUseCase.g:254:1: ( ruleAllowedUserGroups EOF )
            // InternalUseCase.g:255:1: ruleAllowedUserGroups EOF
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
    // InternalUseCase.g:262:1: ruleAllowedUserGroups : ( ( rule__AllowedUserGroups__Group__0 ) ) ;
    public final void ruleAllowedUserGroups() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:266:2: ( ( ( rule__AllowedUserGroups__Group__0 ) ) )
            // InternalUseCase.g:267:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            {
            // InternalUseCase.g:267:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            // InternalUseCase.g:268:3: ( rule__AllowedUserGroups__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroup()); 
            // InternalUseCase.g:269:3: ( rule__AllowedUserGroups__Group__0 )
            // InternalUseCase.g:269:4: rule__AllowedUserGroups__Group__0
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
    // InternalUseCase.g:278:1: entryRuleAllowedUserGroup : ruleAllowedUserGroup EOF ;
    public final void entryRuleAllowedUserGroup() throws RecognitionException {
        try {
            // InternalUseCase.g:279:1: ( ruleAllowedUserGroup EOF )
            // InternalUseCase.g:280:1: ruleAllowedUserGroup EOF
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
    // InternalUseCase.g:287:1: ruleAllowedUserGroup : ( ( rule__AllowedUserGroup__Group__0 ) ) ;
    public final void ruleAllowedUserGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:291:2: ( ( ( rule__AllowedUserGroup__Group__0 ) ) )
            // InternalUseCase.g:292:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            {
            // InternalUseCase.g:292:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            // InternalUseCase.g:293:3: ( rule__AllowedUserGroup__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup()); 
            // InternalUseCase.g:294:3: ( rule__AllowedUserGroup__Group__0 )
            // InternalUseCase.g:294:4: rule__AllowedUserGroup__Group__0
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUseCase.g:303:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalUseCase.g:304:1: ( ruleQualifiedName EOF )
            // InternalUseCase.g:305:1: ruleQualifiedName EOF
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
    // InternalUseCase.g:312:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:316:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalUseCase.g:317:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalUseCase.g:317:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalUseCase.g:318:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalUseCase.g:319:3: ( rule__QualifiedName__Group__0 )
            // InternalUseCase.g:319:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "rule__Inputs__Alternatives_0"
    // InternalUseCase.g:327:1: rule__Inputs__Alternatives_0 : ( ( 'inputs:' ) | ( 'input:' ) );
    public final void rule__Inputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:331:1: ( ( 'inputs:' ) | ( 'input:' ) )
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
                    // InternalUseCase.g:332:2: ( 'inputs:' )
                    {
                    // InternalUseCase.g:332:2: ( 'inputs:' )
                    // InternalUseCase.g:333:3: 'inputs:'
                    {
                     before(grammarAccess.getInputsAccess().getInputsKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getInputsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:338:2: ( 'input:' )
                    {
                    // InternalUseCase.g:338:2: ( 'input:' )
                    // InternalUseCase.g:339:3: 'input:'
                    {
                     before(grammarAccess.getInputsAccess().getInputKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getInputKeyword_0_1()); 

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


    // $ANTLR start "rule__Outputs__Alternatives_0"
    // InternalUseCase.g:348:1: rule__Outputs__Alternatives_0 : ( ( 'outputs:' ) | ( 'output:' ) );
    public final void rule__Outputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:352:1: ( ( 'outputs:' ) | ( 'output:' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCase.g:353:2: ( 'outputs:' )
                    {
                    // InternalUseCase.g:353:2: ( 'outputs:' )
                    // InternalUseCase.g:354:3: 'outputs:'
                    {
                     before(grammarAccess.getOutputsAccess().getOutputsKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getOutputsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:359:2: ( 'output:' )
                    {
                    // InternalUseCase.g:359:2: ( 'output:' )
                    // InternalUseCase.g:360:3: 'output:'
                    {
                     before(grammarAccess.getOutputsAccess().getOutputKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getOutputKeyword_0_1()); 

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


    // $ANTLR start "rule__Model__Group__0"
    // InternalUseCase.g:369:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:373:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUseCase.g:374:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalUseCase.g:381:1: rule__Model__Group__0__Impl : ( ( rule__Model__TypesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:385:1: ( ( ( rule__Model__TypesAssignment_0 )* ) )
            // InternalUseCase.g:386:1: ( ( rule__Model__TypesAssignment_0 )* )
            {
            // InternalUseCase.g:386:1: ( ( rule__Model__TypesAssignment_0 )* )
            // InternalUseCase.g:387:2: ( rule__Model__TypesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_0()); 
            // InternalUseCase.g:388:2: ( rule__Model__TypesAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCase.g:388:3: rule__Model__TypesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__TypesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment_0()); 

            }


            }

        }
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
    // InternalUseCase.g:396:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:400:1: ( rule__Model__Group__1__Impl )
            // InternalUseCase.g:401:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:407:1: rule__Model__Group__1__Impl : ( ( rule__Model__UseCasesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:411:1: ( ( ( rule__Model__UseCasesAssignment_1 )* ) )
            // InternalUseCase.g:412:1: ( ( rule__Model__UseCasesAssignment_1 )* )
            {
            // InternalUseCase.g:412:1: ( ( rule__Model__UseCasesAssignment_1 )* )
            // InternalUseCase.g:413:2: ( rule__Model__UseCasesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getUseCasesAssignment_1()); 
            // InternalUseCase.g:414:2: ( rule__Model__UseCasesAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCase.g:414:3: rule__Model__UseCasesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__UseCasesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getUseCasesAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__UseCase__Group__0"
    // InternalUseCase.g:423:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:427:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCase.g:428:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:435:1: rule__UseCase__Group__0__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:439:1: ( ( 'use-case' ) )
            // InternalUseCase.g:440:1: ( 'use-case' )
            {
            // InternalUseCase.g:440:1: ( 'use-case' )
            // InternalUseCase.g:441:2: 'use-case'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0()); 

            }


            }

        }
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
    // InternalUseCase.g:450:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:454:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCase.g:455:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:462:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:466:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUseCase.g:467:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUseCase.g:467:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUseCase.g:468:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUseCase.g:469:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUseCase.g:469:3: rule__UseCase__NameAssignment_1
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
    // InternalUseCase.g:477:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:481:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCase.g:482:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:489:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionsAssignment_2 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:493:1: ( ( ( rule__UseCase__DescriptionsAssignment_2 )? ) )
            // InternalUseCase.g:494:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            {
            // InternalUseCase.g:494:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            // InternalUseCase.g:495:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); 
            // InternalUseCase.g:496:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCase.g:496:3: rule__UseCase__DescriptionsAssignment_2
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
    // InternalUseCase.g:504:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:508:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCase.g:509:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:516:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__InputsAssignment_3 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:520:1: ( ( ( rule__UseCase__InputsAssignment_3 )? ) )
            // InternalUseCase.g:521:1: ( ( rule__UseCase__InputsAssignment_3 )? )
            {
            // InternalUseCase.g:521:1: ( ( rule__UseCase__InputsAssignment_3 )? )
            // InternalUseCase.g:522:2: ( rule__UseCase__InputsAssignment_3 )?
            {
             before(grammarAccess.getUseCaseAccess().getInputsAssignment_3()); 
            // InternalUseCase.g:523:2: ( rule__UseCase__InputsAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:523:3: rule__UseCase__InputsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__InputsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getInputsAssignment_3()); 

            }


            }

        }
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
    // InternalUseCase.g:531:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:535:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCase.g:536:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:543:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__OutputsAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:547:1: ( ( ( rule__UseCase__OutputsAssignment_4 )? ) )
            // InternalUseCase.g:548:1: ( ( rule__UseCase__OutputsAssignment_4 )? )
            {
            // InternalUseCase.g:548:1: ( ( rule__UseCase__OutputsAssignment_4 )? )
            // InternalUseCase.g:549:2: ( rule__UseCase__OutputsAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getOutputsAssignment_4()); 
            // InternalUseCase.g:550:2: ( rule__UseCase__OutputsAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=13 && LA7_0<=14)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:550:3: rule__UseCase__OutputsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__OutputsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getOutputsAssignment_4()); 

            }


            }

        }
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
    // InternalUseCase.g:558:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:562:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCase.g:563:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:570:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__AllowedUserGroupsAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:574:1: ( ( ( rule__UseCase__AllowedUserGroupsAssignment_5 )? ) )
            // InternalUseCase.g:575:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_5 )? )
            {
            // InternalUseCase.g:575:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_5 )? )
            // InternalUseCase.g:576:2: ( rule__UseCase__AllowedUserGroupsAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAssignment_5()); 
            // InternalUseCase.g:577:2: ( rule__UseCase__AllowedUserGroupsAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:577:3: rule__UseCase__AllowedUserGroupsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__AllowedUserGroupsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAssignment_5()); 

            }


            }

        }
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
    // InternalUseCase.g:585:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:589:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCase.g:590:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCase.g:597:1: rule__UseCase__Group__6__Impl : ( 'end' ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:601:1: ( ( 'end' ) )
            // InternalUseCase.g:602:1: ( 'end' )
            {
            // InternalUseCase.g:602:1: ( 'end' )
            // InternalUseCase.g:603:2: 'end'
            {
             before(grammarAccess.getUseCaseAccess().getEndKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getEndKeyword_6()); 

            }


            }

        }
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
    // InternalUseCase.g:612:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:616:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCase.g:617:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
            {
            pushFollow(FOLLOW_3);
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
    // InternalUseCase.g:624:1: rule__UseCase__Group__7__Impl : ( 'of' ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:628:1: ( ( 'of' ) )
            // InternalUseCase.g:629:1: ( 'of' )
            {
            // InternalUseCase.g:629:1: ( 'of' )
            // InternalUseCase.g:630:2: 'of'
            {
             before(grammarAccess.getUseCaseAccess().getOfKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getOfKeyword_7()); 

            }


            }

        }
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
    // InternalUseCase.g:639:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:643:1: ( rule__UseCase__Group__8__Impl )
            // InternalUseCase.g:644:2: rule__UseCase__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:650:1: rule__UseCase__Group__8__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:654:1: ( ( 'use-case' ) )
            // InternalUseCase.g:655:1: ( 'use-case' )
            {
            // InternalUseCase.g:655:1: ( 'use-case' )
            // InternalUseCase.g:656:2: 'use-case'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Description__Group__0"
    // InternalUseCase.g:666:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:670:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalUseCase.g:671:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:678:1: rule__Description__Group__0__Impl : ( 'description:' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:682:1: ( ( 'description:' ) )
            // InternalUseCase.g:683:1: ( 'description:' )
            {
            // InternalUseCase.g:683:1: ( 'description:' )
            // InternalUseCase.g:684:2: 'description:'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

            }


            }

        }
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
    // InternalUseCase.g:693:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:697:1: ( rule__Description__Group__1__Impl )
            // InternalUseCase.g:698:2: rule__Description__Group__1__Impl
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
    // InternalUseCase.g:704:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:708:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalUseCase.g:709:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalUseCase.g:709:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalUseCase.g:710:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalUseCase.g:711:2: ( rule__Description__NameAssignment_1 )
            // InternalUseCase.g:711:3: rule__Description__NameAssignment_1
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


    // $ANTLR start "rule__Inputs__Group__0"
    // InternalUseCase.g:720:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:724:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalUseCase.g:725:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:732:1: rule__Inputs__Group__0__Impl : ( ( rule__Inputs__Alternatives_0 ) ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:736:1: ( ( ( rule__Inputs__Alternatives_0 ) ) )
            // InternalUseCase.g:737:1: ( ( rule__Inputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:737:1: ( ( rule__Inputs__Alternatives_0 ) )
            // InternalUseCase.g:738:2: ( rule__Inputs__Alternatives_0 )
            {
             before(grammarAccess.getInputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:739:2: ( rule__Inputs__Alternatives_0 )
            // InternalUseCase.g:739:3: rule__Inputs__Alternatives_0
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
    // InternalUseCase.g:747:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:751:1: ( rule__Inputs__Group__1__Impl )
            // InternalUseCase.g:752:2: rule__Inputs__Group__1__Impl
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
    // InternalUseCase.g:758:1: rule__Inputs__Group__1__Impl : ( ( rule__Inputs__InputsAssignment_1 )* ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:762:1: ( ( ( rule__Inputs__InputsAssignment_1 )* ) )
            // InternalUseCase.g:763:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            {
            // InternalUseCase.g:763:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            // InternalUseCase.g:764:2: ( rule__Inputs__InputsAssignment_1 )*
            {
             before(grammarAccess.getInputsAccess().getInputsAssignment_1()); 
            // InternalUseCase.g:765:2: ( rule__Inputs__InputsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24||LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUseCase.g:765:3: rule__Inputs__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Inputs__InputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "rule__Outputs__Group__0"
    // InternalUseCase.g:774:1: rule__Outputs__Group__0 : rule__Outputs__Group__0__Impl rule__Outputs__Group__1 ;
    public final void rule__Outputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:778:1: ( rule__Outputs__Group__0__Impl rule__Outputs__Group__1 )
            // InternalUseCase.g:779:2: rule__Outputs__Group__0__Impl rule__Outputs__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:786:1: rule__Outputs__Group__0__Impl : ( ( rule__Outputs__Alternatives_0 ) ) ;
    public final void rule__Outputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:790:1: ( ( ( rule__Outputs__Alternatives_0 ) ) )
            // InternalUseCase.g:791:1: ( ( rule__Outputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:791:1: ( ( rule__Outputs__Alternatives_0 ) )
            // InternalUseCase.g:792:2: ( rule__Outputs__Alternatives_0 )
            {
             before(grammarAccess.getOutputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:793:2: ( rule__Outputs__Alternatives_0 )
            // InternalUseCase.g:793:3: rule__Outputs__Alternatives_0
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
    // InternalUseCase.g:801:1: rule__Outputs__Group__1 : rule__Outputs__Group__1__Impl ;
    public final void rule__Outputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:805:1: ( rule__Outputs__Group__1__Impl )
            // InternalUseCase.g:806:2: rule__Outputs__Group__1__Impl
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
    // InternalUseCase.g:812:1: rule__Outputs__Group__1__Impl : ( ( rule__Outputs__OutputsAssignment_1 )* ) ;
    public final void rule__Outputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:816:1: ( ( ( rule__Outputs__OutputsAssignment_1 )* ) )
            // InternalUseCase.g:817:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            {
            // InternalUseCase.g:817:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            // InternalUseCase.g:818:2: ( rule__Outputs__OutputsAssignment_1 )*
            {
             before(grammarAccess.getOutputsAccess().getOutputsAssignment_1()); 
            // InternalUseCase.g:819:2: ( rule__Outputs__OutputsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24||LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUseCase.g:819:3: rule__Outputs__OutputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Outputs__OutputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "rule__Type__Group__0"
    // InternalUseCase.g:828:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:832:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalUseCase.g:833:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:840:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:844:1: ( ( 'type' ) )
            // InternalUseCase.g:845:1: ( 'type' )
            {
            // InternalUseCase.g:845:1: ( 'type' )
            // InternalUseCase.g:846:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
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
    // InternalUseCase.g:855:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:859:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalUseCase.g:860:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCase.g:867:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:871:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalUseCase.g:872:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalUseCase.g:872:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalUseCase.g:873:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalUseCase.g:874:2: ( rule__Type__NameAssignment_1 )
            // InternalUseCase.g:874:3: rule__Type__NameAssignment_1
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
    // InternalUseCase.g:882:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:886:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalUseCase.g:887:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:894:1: rule__Type__Group__2__Impl : ( '(' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:898:1: ( ( '(' ) )
            // InternalUseCase.g:899:1: ( '(' )
            {
            // InternalUseCase.g:899:1: ( '(' )
            // InternalUseCase.g:900:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUseCase.g:909:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:913:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalUseCase.g:914:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCase.g:921:1: rule__Type__Group__3__Impl : ( ( rule__Type__DescriptionAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:925:1: ( ( ( rule__Type__DescriptionAssignment_3 ) ) )
            // InternalUseCase.g:926:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            {
            // InternalUseCase.g:926:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            // InternalUseCase.g:927:2: ( rule__Type__DescriptionAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getDescriptionAssignment_3()); 
            // InternalUseCase.g:928:2: ( rule__Type__DescriptionAssignment_3 )
            // InternalUseCase.g:928:3: rule__Type__DescriptionAssignment_3
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
    // InternalUseCase.g:936:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:940:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalUseCase.g:941:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalUseCase.g:948:1: rule__Type__Group__4__Impl : ( ')' ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:952:1: ( ( ')' ) )
            // InternalUseCase.g:953:1: ( ')' )
            {
            // InternalUseCase.g:953:1: ( ')' )
            // InternalUseCase.g:954:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalUseCase.g:963:1: rule__Type__Group__5 : rule__Type__Group__5__Impl ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:967:1: ( rule__Type__Group__5__Impl )
            // InternalUseCase.g:968:2: rule__Type__Group__5__Impl
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
    // InternalUseCase.g:974:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )? ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:978:1: ( ( ( rule__Type__Group_5__0 )? ) )
            // InternalUseCase.g:979:1: ( ( rule__Type__Group_5__0 )? )
            {
            // InternalUseCase.g:979:1: ( ( rule__Type__Group_5__0 )? )
            // InternalUseCase.g:980:2: ( rule__Type__Group_5__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // InternalUseCase.g:981:2: ( rule__Type__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:981:3: rule__Type__Group_5__0
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
    // InternalUseCase.g:990:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:994:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalUseCase.g:995:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:1002:1: rule__Type__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1006:1: ( ( '[' ) )
            // InternalUseCase.g:1007:1: ( '[' )
            {
            // InternalUseCase.g:1007:1: ( '[' )
            // InternalUseCase.g:1008:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUseCase.g:1017:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1021:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalUseCase.g:1022:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:1029:1: rule__Type__Group_5__1__Impl : ( ( rule__Type__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1033:1: ( ( ( rule__Type__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:1034:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:1034:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:1035:2: ( rule__Type__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getTypeAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:1036:2: ( rule__Type__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:1036:3: rule__Type__ImportInfoAssignment_5_1
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
    // InternalUseCase.g:1044:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1048:1: ( rule__Type__Group_5__2__Impl )
            // InternalUseCase.g:1049:2: rule__Type__Group_5__2__Impl
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
    // InternalUseCase.g:1055:1: rule__Type__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1059:1: ( ( ']' ) )
            // InternalUseCase.g:1060:1: ( ']' )
            {
            // InternalUseCase.g:1060:1: ( ']' )
            // InternalUseCase.g:1061:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__Input__Group__0"
    // InternalUseCase.g:1071:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1075:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalUseCase.g:1076:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:1083:1: rule__Input__Group__0__Impl : ( ( rule__Input__ManyAssignment_0 )? ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1087:1: ( ( ( rule__Input__ManyAssignment_0 )? ) )
            // InternalUseCase.g:1088:1: ( ( rule__Input__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:1088:1: ( ( rule__Input__ManyAssignment_0 )? )
            // InternalUseCase.g:1089:2: ( rule__Input__ManyAssignment_0 )?
            {
             before(grammarAccess.getInputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:1090:2: ( rule__Input__ManyAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCase.g:1090:3: rule__Input__ManyAssignment_0
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
    // InternalUseCase.g:1098:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1102:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalUseCase.g:1103:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:1110:1: rule__Input__Group__1__Impl : ( '-' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1114:1: ( ( '-' ) )
            // InternalUseCase.g:1115:1: ( '-' )
            {
            // InternalUseCase.g:1115:1: ( '-' )
            // InternalUseCase.g:1116:2: '-'
            {
             before(grammarAccess.getInputAccess().getHyphenMinusKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUseCase.g:1125:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1129:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalUseCase.g:1130:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCase.g:1137:1: rule__Input__Group__2__Impl : ( ( rule__Input__ContentAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1141:1: ( ( ( rule__Input__ContentAssignment_2 ) ) )
            // InternalUseCase.g:1142:1: ( ( rule__Input__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:1142:1: ( ( rule__Input__ContentAssignment_2 ) )
            // InternalUseCase.g:1143:2: ( rule__Input__ContentAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:1144:2: ( rule__Input__ContentAssignment_2 )
            // InternalUseCase.g:1144:3: rule__Input__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Input__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getContentAssignment_2()); 

            }


            }

        }
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
    // InternalUseCase.g:1152:1: rule__Input__Group__3 : rule__Input__Group__3__Impl ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1156:1: ( rule__Input__Group__3__Impl )
            // InternalUseCase.g:1157:2: rule__Input__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:1163:1: rule__Input__Group__3__Impl : ( ( rule__Input__Group_3__0 )? ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1167:1: ( ( ( rule__Input__Group_3__0 )? ) )
            // InternalUseCase.g:1168:1: ( ( rule__Input__Group_3__0 )? )
            {
            // InternalUseCase.g:1168:1: ( ( rule__Input__Group_3__0 )? )
            // InternalUseCase.g:1169:2: ( rule__Input__Group_3__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_3()); 
            // InternalUseCase.g:1170:2: ( rule__Input__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCase.g:1170:3: rule__Input__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Input__Group_3__0"
    // InternalUseCase.g:1179:1: rule__Input__Group_3__0 : rule__Input__Group_3__0__Impl rule__Input__Group_3__1 ;
    public final void rule__Input__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1183:1: ( rule__Input__Group_3__0__Impl rule__Input__Group_3__1 )
            // InternalUseCase.g:1184:2: rule__Input__Group_3__0__Impl rule__Input__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Input__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_3__0"


    // $ANTLR start "rule__Input__Group_3__0__Impl"
    // InternalUseCase.g:1191:1: rule__Input__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Input__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1195:1: ( ( 'as' ) )
            // InternalUseCase.g:1196:1: ( 'as' )
            {
            // InternalUseCase.g:1196:1: ( 'as' )
            // InternalUseCase.g:1197:2: 'as'
            {
             before(grammarAccess.getInputAccess().getAsKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_3__0__Impl"


    // $ANTLR start "rule__Input__Group_3__1"
    // InternalUseCase.g:1206:1: rule__Input__Group_3__1 : rule__Input__Group_3__1__Impl ;
    public final void rule__Input__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1210:1: ( rule__Input__Group_3__1__Impl )
            // InternalUseCase.g:1211:2: rule__Input__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_3__1"


    // $ANTLR start "rule__Input__Group_3__1__Impl"
    // InternalUseCase.g:1217:1: rule__Input__Group_3__1__Impl : ( ( rule__Input__TypeAssignment_3_1 ) ) ;
    public final void rule__Input__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1221:1: ( ( ( rule__Input__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:1222:1: ( ( rule__Input__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:1222:1: ( ( rule__Input__TypeAssignment_3_1 ) )
            // InternalUseCase.g:1223:2: ( rule__Input__TypeAssignment_3_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:1224:2: ( rule__Input__TypeAssignment_3_1 )
            // InternalUseCase.g:1224:3: rule__Input__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_3__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalUseCase.g:1233:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1237:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalUseCase.g:1238:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:1245:1: rule__Output__Group__0__Impl : ( ( rule__Output__ManyAssignment_0 )? ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1249:1: ( ( ( rule__Output__ManyAssignment_0 )? ) )
            // InternalUseCase.g:1250:1: ( ( rule__Output__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:1250:1: ( ( rule__Output__ManyAssignment_0 )? )
            // InternalUseCase.g:1251:2: ( rule__Output__ManyAssignment_0 )?
            {
             before(grammarAccess.getOutputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:1252:2: ( rule__Output__ManyAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCase.g:1252:3: rule__Output__ManyAssignment_0
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
    // InternalUseCase.g:1260:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1264:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalUseCase.g:1265:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:1272:1: rule__Output__Group__1__Impl : ( '-' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1276:1: ( ( '-' ) )
            // InternalUseCase.g:1277:1: ( '-' )
            {
            // InternalUseCase.g:1277:1: ( '-' )
            // InternalUseCase.g:1278:2: '-'
            {
             before(grammarAccess.getOutputAccess().getHyphenMinusKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUseCase.g:1287:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1291:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalUseCase.g:1292:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCase.g:1299:1: rule__Output__Group__2__Impl : ( ( rule__Output__ContentAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1303:1: ( ( ( rule__Output__ContentAssignment_2 ) ) )
            // InternalUseCase.g:1304:1: ( ( rule__Output__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:1304:1: ( ( rule__Output__ContentAssignment_2 ) )
            // InternalUseCase.g:1305:2: ( rule__Output__ContentAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:1306:2: ( rule__Output__ContentAssignment_2 )
            // InternalUseCase.g:1306:3: rule__Output__ContentAssignment_2
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
    // InternalUseCase.g:1314:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1318:1: ( rule__Output__Group__3__Impl )
            // InternalUseCase.g:1319:2: rule__Output__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:1325:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1329:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalUseCase.g:1330:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalUseCase.g:1330:1: ( ( rule__Output__Group_3__0 )? )
            // InternalUseCase.g:1331:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalUseCase.g:1332:2: ( rule__Output__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUseCase.g:1332:3: rule__Output__Group_3__0
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


    // $ANTLR start "rule__Output__Group_3__0"
    // InternalUseCase.g:1341:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1345:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalUseCase.g:1346:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:1353:1: rule__Output__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1357:1: ( ( 'as' ) )
            // InternalUseCase.g:1358:1: ( 'as' )
            {
            // InternalUseCase.g:1358:1: ( 'as' )
            // InternalUseCase.g:1359:2: 'as'
            {
             before(grammarAccess.getOutputAccess().getAsKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getAsKeyword_3_0()); 

            }


            }

        }
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
    // InternalUseCase.g:1368:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1372:1: ( rule__Output__Group_3__1__Impl )
            // InternalUseCase.g:1373:2: rule__Output__Group_3__1__Impl
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
    // InternalUseCase.g:1379:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1383:1: ( ( ( rule__Output__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:1384:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:1384:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            // InternalUseCase.g:1385:2: ( rule__Output__TypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:1386:2: ( rule__Output__TypeAssignment_3_1 )
            // InternalUseCase.g:1386:3: rule__Output__TypeAssignment_3_1
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


    // $ANTLR start "rule__AllowedUserGroups__Group__0"
    // InternalUseCase.g:1395:1: rule__AllowedUserGroups__Group__0 : rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 ;
    public final void rule__AllowedUserGroups__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1399:1: ( rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 )
            // InternalUseCase.g:1400:2: rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:1407:1: rule__AllowedUserGroups__Group__0__Impl : ( 'allowed-usergroups:' ) ;
    public final void rule__AllowedUserGroups__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1411:1: ( ( 'allowed-usergroups:' ) )
            // InternalUseCase.g:1412:1: ( 'allowed-usergroups:' )
            {
            // InternalUseCase.g:1412:1: ( 'allowed-usergroups:' )
            // InternalUseCase.g:1413:2: 'allowed-usergroups:'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0()); 

            }


            }

        }
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
    // InternalUseCase.g:1422:1: rule__AllowedUserGroups__Group__1 : rule__AllowedUserGroups__Group__1__Impl ;
    public final void rule__AllowedUserGroups__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1426:1: ( rule__AllowedUserGroups__Group__1__Impl )
            // InternalUseCase.g:1427:2: rule__AllowedUserGroups__Group__1__Impl
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
    // InternalUseCase.g:1433:1: rule__AllowedUserGroups__Group__1__Impl : ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) ;
    public final void rule__AllowedUserGroups__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1437:1: ( ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) )
            // InternalUseCase.g:1438:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            {
            // InternalUseCase.g:1438:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            // InternalUseCase.g:1439:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroupsAssignment_1()); 
            // InternalUseCase.g:1440:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24||LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUseCase.g:1440:3: rule__AllowedUserGroups__GroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AllowedUserGroups__GroupsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "rule__AllowedUserGroup__Group__0"
    // InternalUseCase.g:1449:1: rule__AllowedUserGroup__Group__0 : rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 ;
    public final void rule__AllowedUserGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1453:1: ( rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 )
            // InternalUseCase.g:1454:2: rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:1461:1: rule__AllowedUserGroup__Group__0__Impl : ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) ;
    public final void rule__AllowedUserGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1465:1: ( ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) )
            // InternalUseCase.g:1466:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:1466:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            // InternalUseCase.g:1467:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyAssignment_0()); 
            // InternalUseCase.g:1468:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCase.g:1468:3: rule__AllowedUserGroup__ManyAssignment_0
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
    // InternalUseCase.g:1476:1: rule__AllowedUserGroup__Group__1 : rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 ;
    public final void rule__AllowedUserGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1480:1: ( rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 )
            // InternalUseCase.g:1481:2: rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:1488:1: rule__AllowedUserGroup__Group__1__Impl : ( '-' ) ;
    public final void rule__AllowedUserGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1492:1: ( ( '-' ) )
            // InternalUseCase.g:1493:1: ( '-' )
            {
            // InternalUseCase.g:1493:1: ( '-' )
            // InternalUseCase.g:1494:2: '-'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUseCase.g:1503:1: rule__AllowedUserGroup__Group__2 : rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 ;
    public final void rule__AllowedUserGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1507:1: ( rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 )
            // InternalUseCase.g:1508:2: rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCase.g:1515:1: rule__AllowedUserGroup__Group__2__Impl : ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) ;
    public final void rule__AllowedUserGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1519:1: ( ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) )
            // InternalUseCase.g:1520:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            {
            // InternalUseCase.g:1520:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            // InternalUseCase.g:1521:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getNameAssignment_2()); 
            // InternalUseCase.g:1522:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            // InternalUseCase.g:1522:3: rule__AllowedUserGroup__NameAssignment_2
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
    // InternalUseCase.g:1530:1: rule__AllowedUserGroup__Group__3 : rule__AllowedUserGroup__Group__3__Impl ;
    public final void rule__AllowedUserGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1534:1: ( rule__AllowedUserGroup__Group__3__Impl )
            // InternalUseCase.g:1535:2: rule__AllowedUserGroup__Group__3__Impl
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
    // InternalUseCase.g:1541:1: rule__AllowedUserGroup__Group__3__Impl : ( ( rule__AllowedUserGroup__Group_3__0 )? ) ;
    public final void rule__AllowedUserGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1545:1: ( ( ( rule__AllowedUserGroup__Group_3__0 )? ) )
            // InternalUseCase.g:1546:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            {
            // InternalUseCase.g:1546:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            // InternalUseCase.g:1547:2: ( rule__AllowedUserGroup__Group_3__0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup_3()); 
            // InternalUseCase.g:1548:2: ( rule__AllowedUserGroup__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCase.g:1548:3: rule__AllowedUserGroup__Group_3__0
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
    // InternalUseCase.g:1557:1: rule__AllowedUserGroup__Group_3__0 : rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 ;
    public final void rule__AllowedUserGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1561:1: ( rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 )
            // InternalUseCase.g:1562:2: rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:1569:1: rule__AllowedUserGroup__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__AllowedUserGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1573:1: ( ( 'as' ) )
            // InternalUseCase.g:1574:1: ( 'as' )
            {
            // InternalUseCase.g:1574:1: ( 'as' )
            // InternalUseCase.g:1575:2: 'as'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUseCase.g:1584:1: rule__AllowedUserGroup__Group_3__1 : rule__AllowedUserGroup__Group_3__1__Impl ;
    public final void rule__AllowedUserGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1588:1: ( rule__AllowedUserGroup__Group_3__1__Impl )
            // InternalUseCase.g:1589:2: rule__AllowedUserGroup__Group_3__1__Impl
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
    // InternalUseCase.g:1595:1: rule__AllowedUserGroup__Group_3__1__Impl : ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) ;
    public final void rule__AllowedUserGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1599:1: ( ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:1600:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:1600:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            // InternalUseCase.g:1601:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:1602:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            // InternalUseCase.g:1602:3: rule__AllowedUserGroup__TypeAssignment_3_1
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalUseCase.g:1611:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1615:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUseCase.g:1616:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:1623:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1627:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1628:1: ( RULE_ID )
            {
            // InternalUseCase.g:1628:1: ( RULE_ID )
            // InternalUseCase.g:1629:2: RULE_ID
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
    // InternalUseCase.g:1638:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1642:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUseCase.g:1643:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUseCase.g:1649:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1653:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUseCase.g:1654:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUseCase.g:1654:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUseCase.g:1655:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUseCase.g:1656:2: ( rule__QualifiedName__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUseCase.g:1656:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalUseCase.g:1665:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1669:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUseCase.g:1670:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:1677:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1681:1: ( ( '.' ) )
            // InternalUseCase.g:1682:1: ( '.' )
            {
            // InternalUseCase.g:1682:1: ( '.' )
            // InternalUseCase.g:1683:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalUseCase.g:1692:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1696:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUseCase.g:1697:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUseCase.g:1703:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1707:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1708:1: ( RULE_ID )
            {
            // InternalUseCase.g:1708:1: ( RULE_ID )
            // InternalUseCase.g:1709:2: RULE_ID
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


    // $ANTLR start "rule__Model__TypesAssignment_0"
    // InternalUseCase.g:1719:1: rule__Model__TypesAssignment_0 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1723:1: ( ( ruleType ) )
            // InternalUseCase.g:1724:2: ( ruleType )
            {
            // InternalUseCase.g:1724:2: ( ruleType )
            // InternalUseCase.g:1725:3: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment_0"


    // $ANTLR start "rule__Model__UseCasesAssignment_1"
    // InternalUseCase.g:1734:1: rule__Model__UseCasesAssignment_1 : ( ruleUseCase ) ;
    public final void rule__Model__UseCasesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1738:1: ( ( ruleUseCase ) )
            // InternalUseCase.g:1739:2: ( ruleUseCase )
            {
            // InternalUseCase.g:1739:2: ( ruleUseCase )
            // InternalUseCase.g:1740:3: ruleUseCase
            {
             before(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UseCasesAssignment_1"


    // $ANTLR start "rule__UseCase__NameAssignment_1"
    // InternalUseCase.g:1749:1: rule__UseCase__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1753:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:1754:2: ( RULE_STRING )
            {
            // InternalUseCase.g:1754:2: ( RULE_STRING )
            // InternalUseCase.g:1755:3: RULE_STRING
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
    // InternalUseCase.g:1764:1: rule__UseCase__DescriptionsAssignment_2 : ( ruleDescription ) ;
    public final void rule__UseCase__DescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1768:1: ( ( ruleDescription ) )
            // InternalUseCase.g:1769:2: ( ruleDescription )
            {
            // InternalUseCase.g:1769:2: ( ruleDescription )
            // InternalUseCase.g:1770:3: ruleDescription
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


    // $ANTLR start "rule__UseCase__InputsAssignment_3"
    // InternalUseCase.g:1779:1: rule__UseCase__InputsAssignment_3 : ( ruleInputs ) ;
    public final void rule__UseCase__InputsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1783:1: ( ( ruleInputs ) )
            // InternalUseCase.g:1784:2: ( ruleInputs )
            {
            // InternalUseCase.g:1784:2: ( ruleInputs )
            // InternalUseCase.g:1785:3: ruleInputs
            {
             before(grammarAccess.getUseCaseAccess().getInputsInputsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputs();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getInputsInputsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__InputsAssignment_3"


    // $ANTLR start "rule__UseCase__OutputsAssignment_4"
    // InternalUseCase.g:1794:1: rule__UseCase__OutputsAssignment_4 : ( ruleOutputs ) ;
    public final void rule__UseCase__OutputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1798:1: ( ( ruleOutputs ) )
            // InternalUseCase.g:1799:2: ( ruleOutputs )
            {
            // InternalUseCase.g:1799:2: ( ruleOutputs )
            // InternalUseCase.g:1800:3: ruleOutputs
            {
             before(grammarAccess.getUseCaseAccess().getOutputsOutputsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputs();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getOutputsOutputsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__OutputsAssignment_4"


    // $ANTLR start "rule__UseCase__AllowedUserGroupsAssignment_5"
    // InternalUseCase.g:1809:1: rule__UseCase__AllowedUserGroupsAssignment_5 : ( ruleAllowedUserGroups ) ;
    public final void rule__UseCase__AllowedUserGroupsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1813:1: ( ( ruleAllowedUserGroups ) )
            // InternalUseCase.g:1814:2: ( ruleAllowedUserGroups )
            {
            // InternalUseCase.g:1814:2: ( ruleAllowedUserGroups )
            // InternalUseCase.g:1815:3: ruleAllowedUserGroups
            {
             before(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAllowedUserGroupsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAllowedUserGroups();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAllowedUserGroupsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__AllowedUserGroupsAssignment_5"


    // $ANTLR start "rule__Description__NameAssignment_1"
    // InternalUseCase.g:1824:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1828:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:1829:2: ( RULE_STRING )
            {
            // InternalUseCase.g:1829:2: ( RULE_STRING )
            // InternalUseCase.g:1830:3: RULE_STRING
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


    // $ANTLR start "rule__Inputs__InputsAssignment_1"
    // InternalUseCase.g:1839:1: rule__Inputs__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Inputs__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1843:1: ( ( ruleInput ) )
            // InternalUseCase.g:1844:2: ( ruleInput )
            {
            // InternalUseCase.g:1844:2: ( ruleInput )
            // InternalUseCase.g:1845:3: ruleInput
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


    // $ANTLR start "rule__Outputs__OutputsAssignment_1"
    // InternalUseCase.g:1854:1: rule__Outputs__OutputsAssignment_1 : ( ruleOutput ) ;
    public final void rule__Outputs__OutputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1858:1: ( ( ruleOutput ) )
            // InternalUseCase.g:1859:2: ( ruleOutput )
            {
            // InternalUseCase.g:1859:2: ( ruleOutput )
            // InternalUseCase.g:1860:3: ruleOutput
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


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalUseCase.g:1869:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1873:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1874:2: ( RULE_ID )
            {
            // InternalUseCase.g:1874:2: ( RULE_ID )
            // InternalUseCase.g:1875:3: RULE_ID
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
    // InternalUseCase.g:1884:1: rule__Type__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Type__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1888:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:1889:2: ( RULE_STRING )
            {
            // InternalUseCase.g:1889:2: ( RULE_STRING )
            // InternalUseCase.g:1890:3: RULE_STRING
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
    // InternalUseCase.g:1899:1: rule__Type__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__Type__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1903:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:1904:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:1904:2: ( ruleQualifiedName )
            // InternalUseCase.g:1905:3: ruleQualifiedName
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


    // $ANTLR start "rule__Input__ManyAssignment_0"
    // InternalUseCase.g:1914:1: rule__Input__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Input__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1918:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:1919:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:1919:2: ( ( 'many' ) )
            // InternalUseCase.g:1920:3: ( 'many' )
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:1921:3: ( 'many' )
            // InternalUseCase.g:1922:4: 'many'
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__Input__ContentAssignment_2"
    // InternalUseCase.g:1933:1: rule__Input__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Input__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1937:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:1938:2: ( RULE_STRING )
            {
            // InternalUseCase.g:1938:2: ( RULE_STRING )
            // InternalUseCase.g:1939:3: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getContentSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ContentAssignment_2"


    // $ANTLR start "rule__Input__TypeAssignment_3_1"
    // InternalUseCase.g:1948:1: rule__Input__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Input__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1952:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:1953:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:1953:2: ( ( RULE_ID ) )
            // InternalUseCase.g:1954:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:1955:3: ( RULE_ID )
            // InternalUseCase.g:1956:4: RULE_ID
            {
             before(grammarAccess.getInputAccess().getTypeTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getTypeTypeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getInputAccess().getTypeTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__TypeAssignment_3_1"


    // $ANTLR start "rule__Output__ManyAssignment_0"
    // InternalUseCase.g:1967:1: rule__Output__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Output__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1971:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:1972:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:1972:2: ( ( 'many' ) )
            // InternalUseCase.g:1973:3: ( 'many' )
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:1974:3: ( 'many' )
            // InternalUseCase.g:1975:4: 'many'
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUseCase.g:1986:1: rule__Output__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1990:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:1991:2: ( RULE_STRING )
            {
            // InternalUseCase.g:1991:2: ( RULE_STRING )
            // InternalUseCase.g:1992:3: RULE_STRING
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
    // InternalUseCase.g:2001:1: rule__Output__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Output__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2005:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:2006:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:2006:2: ( ( RULE_ID ) )
            // InternalUseCase.g:2007:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:2008:3: ( RULE_ID )
            // InternalUseCase.g:2009:4: RULE_ID
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


    // $ANTLR start "rule__AllowedUserGroups__GroupsAssignment_1"
    // InternalUseCase.g:2020:1: rule__AllowedUserGroups__GroupsAssignment_1 : ( ruleAllowedUserGroup ) ;
    public final void rule__AllowedUserGroups__GroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2024:1: ( ( ruleAllowedUserGroup ) )
            // InternalUseCase.g:2025:2: ( ruleAllowedUserGroup )
            {
            // InternalUseCase.g:2025:2: ( ruleAllowedUserGroup )
            // InternalUseCase.g:2026:3: ruleAllowedUserGroup
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
    // InternalUseCase.g:2035:1: rule__AllowedUserGroup__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__AllowedUserGroup__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2039:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:2040:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:2040:2: ( ( 'many' ) )
            // InternalUseCase.g:2041:3: ( 'many' )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:2042:3: ( 'many' )
            // InternalUseCase.g:2043:4: 'many'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUseCase.g:2054:1: rule__AllowedUserGroup__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllowedUserGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2058:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:2059:2: ( RULE_STRING )
            {
            // InternalUseCase.g:2059:2: ( RULE_STRING )
            // InternalUseCase.g:2060:3: RULE_STRING
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
    // InternalUseCase.g:2069:1: rule__AllowedUserGroup__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllowedUserGroup__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2073:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:2074:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:2074:2: ( ( RULE_ID ) )
            // InternalUseCase.g:2075:3: ( RULE_ID )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:2076:3: ( RULE_ID )
            // InternalUseCase.g:2077:4: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004057800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});

}