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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pre-condition:'", "'pre-conditions:'", "'Raise'", "'notes:'", "'note:'", "'requires:'", "'require:'", "'produces:'", "'produce:'", "'use-case'", "'end'", "'of'", "'-'", "'steps:'", "'used'", "'types:'", "'errors:'", "'.'", "'On'", "'error'", "'raise'", "'description:'", "'requires'", "'the'", "'following'", "'input'", "':'", "'produces'", "'output'", "'('", "')'", "'['", "']'", "'as'", "'e.g'", "'allowed-usergroups:'", "'many'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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


    // $ANTLR start "entryRulePreConditions"
    // InternalUseCase.g:103:1: entryRulePreConditions : rulePreConditions EOF ;
    public final void entryRulePreConditions() throws RecognitionException {
        try {
            // InternalUseCase.g:104:1: ( rulePreConditions EOF )
            // InternalUseCase.g:105:1: rulePreConditions EOF
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
    // InternalUseCase.g:112:1: rulePreConditions : ( ( rule__PreConditions__Group__0 ) ) ;
    public final void rulePreConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:116:2: ( ( ( rule__PreConditions__Group__0 ) ) )
            // InternalUseCase.g:117:2: ( ( rule__PreConditions__Group__0 ) )
            {
            // InternalUseCase.g:117:2: ( ( rule__PreConditions__Group__0 ) )
            // InternalUseCase.g:118:3: ( rule__PreConditions__Group__0 )
            {
             before(grammarAccess.getPreConditionsAccess().getGroup()); 
            // InternalUseCase.g:119:3: ( rule__PreConditions__Group__0 )
            // InternalUseCase.g:119:4: rule__PreConditions__Group__0
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
    // InternalUseCase.g:128:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalUseCase.g:129:1: ( ruleCondition EOF )
            // InternalUseCase.g:130:1: ruleCondition EOF
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
    // InternalUseCase.g:137:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:141:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalUseCase.g:142:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalUseCase.g:142:2: ( ( rule__Condition__Group__0 ) )
            // InternalUseCase.g:143:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalUseCase.g:144:3: ( rule__Condition__Group__0 )
            // InternalUseCase.g:144:4: rule__Condition__Group__0
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
    // InternalUseCase.g:153:1: entryRuleSteps : ruleSteps EOF ;
    public final void entryRuleSteps() throws RecognitionException {
        try {
            // InternalUseCase.g:154:1: ( ruleSteps EOF )
            // InternalUseCase.g:155:1: ruleSteps EOF
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
    // InternalUseCase.g:162:1: ruleSteps : ( ( rule__Steps__Group__0 ) ) ;
    public final void ruleSteps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:166:2: ( ( ( rule__Steps__Group__0 ) ) )
            // InternalUseCase.g:167:2: ( ( rule__Steps__Group__0 ) )
            {
            // InternalUseCase.g:167:2: ( ( rule__Steps__Group__0 ) )
            // InternalUseCase.g:168:3: ( rule__Steps__Group__0 )
            {
             before(grammarAccess.getStepsAccess().getGroup()); 
            // InternalUseCase.g:169:3: ( rule__Steps__Group__0 )
            // InternalUseCase.g:169:4: rule__Steps__Group__0
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


    // $ANTLR start "entryRuleUsedTypes"
    // InternalUseCase.g:178:1: entryRuleUsedTypes : ruleUsedTypes EOF ;
    public final void entryRuleUsedTypes() throws RecognitionException {
        try {
            // InternalUseCase.g:179:1: ( ruleUsedTypes EOF )
            // InternalUseCase.g:180:1: ruleUsedTypes EOF
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
    // InternalUseCase.g:187:1: ruleUsedTypes : ( ( rule__UsedTypes__Group__0 ) ) ;
    public final void ruleUsedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:191:2: ( ( ( rule__UsedTypes__Group__0 ) ) )
            // InternalUseCase.g:192:2: ( ( rule__UsedTypes__Group__0 ) )
            {
            // InternalUseCase.g:192:2: ( ( rule__UsedTypes__Group__0 ) )
            // InternalUseCase.g:193:3: ( rule__UsedTypes__Group__0 )
            {
             before(grammarAccess.getUsedTypesAccess().getGroup()); 
            // InternalUseCase.g:194:3: ( rule__UsedTypes__Group__0 )
            // InternalUseCase.g:194:4: rule__UsedTypes__Group__0
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


    // $ANTLR start "entryRuleUsedExceptions"
    // InternalUseCase.g:203:1: entryRuleUsedExceptions : ruleUsedExceptions EOF ;
    public final void entryRuleUsedExceptions() throws RecognitionException {
        try {
            // InternalUseCase.g:204:1: ( ruleUsedExceptions EOF )
            // InternalUseCase.g:205:1: ruleUsedExceptions EOF
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
    // InternalUseCase.g:212:1: ruleUsedExceptions : ( ( rule__UsedExceptions__Group__0 ) ) ;
    public final void ruleUsedExceptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:216:2: ( ( ( rule__UsedExceptions__Group__0 ) ) )
            // InternalUseCase.g:217:2: ( ( rule__UsedExceptions__Group__0 ) )
            {
            // InternalUseCase.g:217:2: ( ( rule__UsedExceptions__Group__0 ) )
            // InternalUseCase.g:218:3: ( rule__UsedExceptions__Group__0 )
            {
             before(grammarAccess.getUsedExceptionsAccess().getGroup()); 
            // InternalUseCase.g:219:3: ( rule__UsedExceptions__Group__0 )
            // InternalUseCase.g:219:4: rule__UsedExceptions__Group__0
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


    // $ANTLR start "entryRuleStep"
    // InternalUseCase.g:228:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalUseCase.g:229:1: ( ruleStep EOF )
            // InternalUseCase.g:230:1: ruleStep EOF
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
    // InternalUseCase.g:237:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:241:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalUseCase.g:242:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalUseCase.g:242:2: ( ( rule__Step__Group__0 ) )
            // InternalUseCase.g:243:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalUseCase.g:244:3: ( rule__Step__Group__0 )
            // InternalUseCase.g:244:4: rule__Step__Group__0
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
    // InternalUseCase.g:253:1: entryRuleRaiseError : ruleRaiseError EOF ;
    public final void entryRuleRaiseError() throws RecognitionException {
        try {
            // InternalUseCase.g:254:1: ( ruleRaiseError EOF )
            // InternalUseCase.g:255:1: ruleRaiseError EOF
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
    // InternalUseCase.g:262:1: ruleRaiseError : ( ( rule__RaiseError__Group__0 ) ) ;
    public final void ruleRaiseError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:266:2: ( ( ( rule__RaiseError__Group__0 ) ) )
            // InternalUseCase.g:267:2: ( ( rule__RaiseError__Group__0 ) )
            {
            // InternalUseCase.g:267:2: ( ( rule__RaiseError__Group__0 ) )
            // InternalUseCase.g:268:3: ( rule__RaiseError__Group__0 )
            {
             before(grammarAccess.getRaiseErrorAccess().getGroup()); 
            // InternalUseCase.g:269:3: ( rule__RaiseError__Group__0 )
            // InternalUseCase.g:269:4: rule__RaiseError__Group__0
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


    // $ANTLR start "entryRuleException"
    // InternalUseCase.g:278:1: entryRuleException : ruleException EOF ;
    public final void entryRuleException() throws RecognitionException {
        try {
            // InternalUseCase.g:279:1: ( ruleException EOF )
            // InternalUseCase.g:280:1: ruleException EOF
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
    // InternalUseCase.g:287:1: ruleException : ( ( rule__Exception__TypeAssignment ) ) ;
    public final void ruleException() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:291:2: ( ( ( rule__Exception__TypeAssignment ) ) )
            // InternalUseCase.g:292:2: ( ( rule__Exception__TypeAssignment ) )
            {
            // InternalUseCase.g:292:2: ( ( rule__Exception__TypeAssignment ) )
            // InternalUseCase.g:293:3: ( rule__Exception__TypeAssignment )
            {
             before(grammarAccess.getExceptionAccess().getTypeAssignment()); 
            // InternalUseCase.g:294:3: ( rule__Exception__TypeAssignment )
            // InternalUseCase.g:294:4: rule__Exception__TypeAssignment
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


    // $ANTLR start "entryRuleDescription"
    // InternalUseCase.g:303:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalUseCase.g:304:1: ( ruleDescription EOF )
            // InternalUseCase.g:305:1: ruleDescription EOF
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
    // InternalUseCase.g:312:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:316:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalUseCase.g:317:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalUseCase.g:317:2: ( ( rule__Description__Group__0 ) )
            // InternalUseCase.g:318:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalUseCase.g:319:3: ( rule__Description__Group__0 )
            // InternalUseCase.g:319:4: rule__Description__Group__0
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


    // $ANTLR start "entryRuleNotes"
    // InternalUseCase.g:328:1: entryRuleNotes : ruleNotes EOF ;
    public final void entryRuleNotes() throws RecognitionException {
        try {
            // InternalUseCase.g:329:1: ( ruleNotes EOF )
            // InternalUseCase.g:330:1: ruleNotes EOF
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
    // InternalUseCase.g:337:1: ruleNotes : ( ( rule__Notes__Group__0 ) ) ;
    public final void ruleNotes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:341:2: ( ( ( rule__Notes__Group__0 ) ) )
            // InternalUseCase.g:342:2: ( ( rule__Notes__Group__0 ) )
            {
            // InternalUseCase.g:342:2: ( ( rule__Notes__Group__0 ) )
            // InternalUseCase.g:343:3: ( rule__Notes__Group__0 )
            {
             before(grammarAccess.getNotesAccess().getGroup()); 
            // InternalUseCase.g:344:3: ( rule__Notes__Group__0 )
            // InternalUseCase.g:344:4: rule__Notes__Group__0
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


    // $ANTLR start "entryRuleInputs"
    // InternalUseCase.g:353:1: entryRuleInputs : ruleInputs EOF ;
    public final void entryRuleInputs() throws RecognitionException {
        try {
            // InternalUseCase.g:354:1: ( ruleInputs EOF )
            // InternalUseCase.g:355:1: ruleInputs EOF
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
    // InternalUseCase.g:362:1: ruleInputs : ( ( rule__Inputs__Group__0 ) ) ;
    public final void ruleInputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:366:2: ( ( ( rule__Inputs__Group__0 ) ) )
            // InternalUseCase.g:367:2: ( ( rule__Inputs__Group__0 ) )
            {
            // InternalUseCase.g:367:2: ( ( rule__Inputs__Group__0 ) )
            // InternalUseCase.g:368:3: ( rule__Inputs__Group__0 )
            {
             before(grammarAccess.getInputsAccess().getGroup()); 
            // InternalUseCase.g:369:3: ( rule__Inputs__Group__0 )
            // InternalUseCase.g:369:4: rule__Inputs__Group__0
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
    // InternalUseCase.g:378:1: entryRuleOutputs : ruleOutputs EOF ;
    public final void entryRuleOutputs() throws RecognitionException {
        try {
            // InternalUseCase.g:379:1: ( ruleOutputs EOF )
            // InternalUseCase.g:380:1: ruleOutputs EOF
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
    // InternalUseCase.g:387:1: ruleOutputs : ( ( rule__Outputs__Group__0 ) ) ;
    public final void ruleOutputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:391:2: ( ( ( rule__Outputs__Group__0 ) ) )
            // InternalUseCase.g:392:2: ( ( rule__Outputs__Group__0 ) )
            {
            // InternalUseCase.g:392:2: ( ( rule__Outputs__Group__0 ) )
            // InternalUseCase.g:393:3: ( rule__Outputs__Group__0 )
            {
             before(grammarAccess.getOutputsAccess().getGroup()); 
            // InternalUseCase.g:394:3: ( rule__Outputs__Group__0 )
            // InternalUseCase.g:394:4: rule__Outputs__Group__0
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
    // InternalUseCase.g:403:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUseCase.g:404:1: ( ruleType EOF )
            // InternalUseCase.g:405:1: ruleType EOF
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
    // InternalUseCase.g:412:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:416:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalUseCase.g:417:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalUseCase.g:417:2: ( ( rule__Type__Group__0 ) )
            // InternalUseCase.g:418:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalUseCase.g:419:3: ( rule__Type__Group__0 )
            // InternalUseCase.g:419:4: rule__Type__Group__0
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


    // $ANTLR start "entryRuleExceptionDecleration"
    // InternalUseCase.g:428:1: entryRuleExceptionDecleration : ruleExceptionDecleration EOF ;
    public final void entryRuleExceptionDecleration() throws RecognitionException {
        try {
            // InternalUseCase.g:429:1: ( ruleExceptionDecleration EOF )
            // InternalUseCase.g:430:1: ruleExceptionDecleration EOF
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
    // InternalUseCase.g:437:1: ruleExceptionDecleration : ( ( rule__ExceptionDecleration__Group__0 ) ) ;
    public final void ruleExceptionDecleration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:441:2: ( ( ( rule__ExceptionDecleration__Group__0 ) ) )
            // InternalUseCase.g:442:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            {
            // InternalUseCase.g:442:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            // InternalUseCase.g:443:3: ( rule__ExceptionDecleration__Group__0 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup()); 
            // InternalUseCase.g:444:3: ( rule__ExceptionDecleration__Group__0 )
            // InternalUseCase.g:444:4: rule__ExceptionDecleration__Group__0
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


    // $ANTLR start "entryRuleInput"
    // InternalUseCase.g:453:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalUseCase.g:454:1: ( ruleInput EOF )
            // InternalUseCase.g:455:1: ruleInput EOF
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
    // InternalUseCase.g:462:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:466:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalUseCase.g:467:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalUseCase.g:467:2: ( ( rule__Input__Group__0 ) )
            // InternalUseCase.g:468:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalUseCase.g:469:3: ( rule__Input__Group__0 )
            // InternalUseCase.g:469:4: rule__Input__Group__0
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
    // InternalUseCase.g:478:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalUseCase.g:479:1: ( ruleOutput EOF )
            // InternalUseCase.g:480:1: ruleOutput EOF
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
    // InternalUseCase.g:487:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:491:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalUseCase.g:492:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalUseCase.g:492:2: ( ( rule__Output__Group__0 ) )
            // InternalUseCase.g:493:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalUseCase.g:494:3: ( rule__Output__Group__0 )
            // InternalUseCase.g:494:4: rule__Output__Group__0
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
    // InternalUseCase.g:503:1: entryRuleAllowedUserGroups : ruleAllowedUserGroups EOF ;
    public final void entryRuleAllowedUserGroups() throws RecognitionException {
        try {
            // InternalUseCase.g:504:1: ( ruleAllowedUserGroups EOF )
            // InternalUseCase.g:505:1: ruleAllowedUserGroups EOF
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
    // InternalUseCase.g:512:1: ruleAllowedUserGroups : ( ( rule__AllowedUserGroups__Group__0 ) ) ;
    public final void ruleAllowedUserGroups() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:516:2: ( ( ( rule__AllowedUserGroups__Group__0 ) ) )
            // InternalUseCase.g:517:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            {
            // InternalUseCase.g:517:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            // InternalUseCase.g:518:3: ( rule__AllowedUserGroups__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroup()); 
            // InternalUseCase.g:519:3: ( rule__AllowedUserGroups__Group__0 )
            // InternalUseCase.g:519:4: rule__AllowedUserGroups__Group__0
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
    // InternalUseCase.g:528:1: entryRuleAllowedUserGroup : ruleAllowedUserGroup EOF ;
    public final void entryRuleAllowedUserGroup() throws RecognitionException {
        try {
            // InternalUseCase.g:529:1: ( ruleAllowedUserGroup EOF )
            // InternalUseCase.g:530:1: ruleAllowedUserGroup EOF
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
    // InternalUseCase.g:537:1: ruleAllowedUserGroup : ( ( rule__AllowedUserGroup__Group__0 ) ) ;
    public final void ruleAllowedUserGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:541:2: ( ( ( rule__AllowedUserGroup__Group__0 ) ) )
            // InternalUseCase.g:542:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            {
            // InternalUseCase.g:542:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            // InternalUseCase.g:543:3: ( rule__AllowedUserGroup__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup()); 
            // InternalUseCase.g:544:3: ( rule__AllowedUserGroup__Group__0 )
            // InternalUseCase.g:544:4: rule__AllowedUserGroup__Group__0
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
    // InternalUseCase.g:553:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalUseCase.g:554:1: ( ruleQualifiedName EOF )
            // InternalUseCase.g:555:1: ruleQualifiedName EOF
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
    // InternalUseCase.g:562:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:566:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalUseCase.g:567:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalUseCase.g:567:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalUseCase.g:568:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalUseCase.g:569:3: ( rule__QualifiedName__Group__0 )
            // InternalUseCase.g:569:4: rule__QualifiedName__Group__0
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
    // InternalUseCase.g:578:1: entryRuleQualifiedNumber : ruleQualifiedNumber EOF ;
    public final void entryRuleQualifiedNumber() throws RecognitionException {
        try {
            // InternalUseCase.g:579:1: ( ruleQualifiedNumber EOF )
            // InternalUseCase.g:580:1: ruleQualifiedNumber EOF
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
    // InternalUseCase.g:587:1: ruleQualifiedNumber : ( ( rule__QualifiedNumber__Group__0 ) ) ;
    public final void ruleQualifiedNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:591:2: ( ( ( rule__QualifiedNumber__Group__0 ) ) )
            // InternalUseCase.g:592:2: ( ( rule__QualifiedNumber__Group__0 ) )
            {
            // InternalUseCase.g:592:2: ( ( rule__QualifiedNumber__Group__0 ) )
            // InternalUseCase.g:593:3: ( rule__QualifiedNumber__Group__0 )
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup()); 
            // InternalUseCase.g:594:3: ( rule__QualifiedNumber__Group__0 )
            // InternalUseCase.g:594:4: rule__QualifiedNumber__Group__0
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


    // $ANTLR start "rule__PreConditions__Alternatives_0"
    // InternalUseCase.g:602:1: rule__PreConditions__Alternatives_0 : ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) );
    public final void rule__PreConditions__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:606:1: ( ( 'pre-condition:' ) | ( 'pre-conditions:' ) )
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
                    // InternalUseCase.g:607:2: ( 'pre-condition:' )
                    {
                    // InternalUseCase.g:607:2: ( 'pre-condition:' )
                    // InternalUseCase.g:608:3: 'pre-condition:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:613:2: ( 'pre-conditions:' )
                    {
                    // InternalUseCase.g:613:2: ( 'pre-conditions:' )
                    // InternalUseCase.g:614:3: 'pre-conditions:'
                    {
                     before(grammarAccess.getPreConditionsAccess().getPreConditionsKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPreConditionsAccess().getPreConditionsKeyword_0_1()); 

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


    // $ANTLR start "rule__RaiseError__Alternatives_1"
    // InternalUseCase.g:623:1: rule__RaiseError__Alternatives_1 : ( ( 'Raise' ) | ( ( rule__RaiseError__Group_1_1__0 ) ) );
    public final void rule__RaiseError__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:627:1: ( ( 'Raise' ) | ( ( rule__RaiseError__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCase.g:628:2: ( 'Raise' )
                    {
                    // InternalUseCase.g:628:2: ( 'Raise' )
                    // InternalUseCase.g:629:3: 'Raise'
                    {
                     before(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:634:2: ( ( rule__RaiseError__Group_1_1__0 ) )
                    {
                    // InternalUseCase.g:634:2: ( ( rule__RaiseError__Group_1_1__0 ) )
                    // InternalUseCase.g:635:3: ( rule__RaiseError__Group_1_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getGroup_1_1()); 
                    // InternalUseCase.g:636:3: ( rule__RaiseError__Group_1_1__0 )
                    // InternalUseCase.g:636:4: rule__RaiseError__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RaiseError__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRaiseErrorAccess().getGroup_1_1()); 

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


    // $ANTLR start "rule__Notes__Alternatives_0"
    // InternalUseCase.g:644:1: rule__Notes__Alternatives_0 : ( ( 'notes:' ) | ( 'note:' ) );
    public final void rule__Notes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:648:1: ( ( 'notes:' ) | ( 'note:' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUseCase.g:649:2: ( 'notes:' )
                    {
                    // InternalUseCase.g:649:2: ( 'notes:' )
                    // InternalUseCase.g:650:3: 'notes:'
                    {
                     before(grammarAccess.getNotesAccess().getNotesKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getNotesKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:655:2: ( 'note:' )
                    {
                    // InternalUseCase.g:655:2: ( 'note:' )
                    // InternalUseCase.g:656:3: 'note:'
                    {
                     before(grammarAccess.getNotesAccess().getNoteKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getNoteKeyword_0_1()); 

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


    // $ANTLR start "rule__Inputs__Alternatives_0"
    // InternalUseCase.g:665:1: rule__Inputs__Alternatives_0 : ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_2__0 ) ) );
    public final void rule__Inputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:669:1: ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:670:2: ( 'requires:' )
                    {
                    // InternalUseCase.g:670:2: ( 'requires:' )
                    // InternalUseCase.g:671:3: 'requires:'
                    {
                     before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequiresKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:676:2: ( 'require:' )
                    {
                    // InternalUseCase.g:676:2: ( 'require:' )
                    // InternalUseCase.g:677:3: 'require:'
                    {
                     before(grammarAccess.getInputsAccess().getRequireKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequireKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:682:2: ( ( rule__Inputs__Group_0_2__0 ) )
                    {
                    // InternalUseCase.g:682:2: ( ( rule__Inputs__Group_0_2__0 ) )
                    // InternalUseCase.g:683:3: ( rule__Inputs__Group_0_2__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_2()); 
                    // InternalUseCase.g:684:3: ( rule__Inputs__Group_0_2__0 )
                    // InternalUseCase.g:684:4: rule__Inputs__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inputs__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputsAccess().getGroup_0_2()); 

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
    // InternalUseCase.g:692:1: rule__Outputs__Alternatives_0 : ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_2__0 ) ) );
    public final void rule__Outputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:696:1: ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_2__0 ) ) )
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
            case 38:
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
                    // InternalUseCase.g:697:2: ( 'produces:' )
                    {
                    // InternalUseCase.g:697:2: ( 'produces:' )
                    // InternalUseCase.g:698:3: 'produces:'
                    {
                     before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProducesKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:703:2: ( 'produce:' )
                    {
                    // InternalUseCase.g:703:2: ( 'produce:' )
                    // InternalUseCase.g:704:3: 'produce:'
                    {
                     before(grammarAccess.getOutputsAccess().getProduceKeyword_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProduceKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:709:2: ( ( rule__Outputs__Group_0_2__0 ) )
                    {
                    // InternalUseCase.g:709:2: ( ( rule__Outputs__Group_0_2__0 ) )
                    // InternalUseCase.g:710:3: ( rule__Outputs__Group_0_2__0 )
                    {
                     before(grammarAccess.getOutputsAccess().getGroup_0_2()); 
                    // InternalUseCase.g:711:3: ( rule__Outputs__Group_0_2__0 )
                    // InternalUseCase.g:711:4: rule__Outputs__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Outputs__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOutputsAccess().getGroup_0_2()); 

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
    // InternalUseCase.g:719:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:723:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUseCase.g:724:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalUseCase.g:731:1: rule__Model__Group__0__Impl : ( ( rule__Model__UseCasesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:735:1: ( ( ( rule__Model__UseCasesAssignment_0 )* ) )
            // InternalUseCase.g:736:1: ( ( rule__Model__UseCasesAssignment_0 )* )
            {
            // InternalUseCase.g:736:1: ( ( rule__Model__UseCasesAssignment_0 )* )
            // InternalUseCase.g:737:2: ( rule__Model__UseCasesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getUseCasesAssignment_0()); 
            // InternalUseCase.g:738:2: ( rule__Model__UseCasesAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUseCase.g:738:3: rule__Model__UseCasesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__UseCasesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalUseCase.g:746:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:750:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUseCase.g:751:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalUseCase.g:758:1: rule__Model__Group__1__Impl : ( ( rule__Model__TypesAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:762:1: ( ( ( rule__Model__TypesAssignment_1 ) ) )
            // InternalUseCase.g:763:1: ( ( rule__Model__TypesAssignment_1 ) )
            {
            // InternalUseCase.g:763:1: ( ( rule__Model__TypesAssignment_1 ) )
            // InternalUseCase.g:764:2: ( rule__Model__TypesAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_1()); 
            // InternalUseCase.g:765:2: ( rule__Model__TypesAssignment_1 )
            // InternalUseCase.g:765:3: rule__Model__TypesAssignment_1
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
    // InternalUseCase.g:773:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:777:1: ( rule__Model__Group__2__Impl )
            // InternalUseCase.g:778:2: rule__Model__Group__2__Impl
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
    // InternalUseCase.g:784:1: rule__Model__Group__2__Impl : ( ( rule__Model__ExceptionsAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:788:1: ( ( ( rule__Model__ExceptionsAssignment_2 ) ) )
            // InternalUseCase.g:789:1: ( ( rule__Model__ExceptionsAssignment_2 ) )
            {
            // InternalUseCase.g:789:1: ( ( rule__Model__ExceptionsAssignment_2 ) )
            // InternalUseCase.g:790:2: ( rule__Model__ExceptionsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getExceptionsAssignment_2()); 
            // InternalUseCase.g:791:2: ( rule__Model__ExceptionsAssignment_2 )
            // InternalUseCase.g:791:3: rule__Model__ExceptionsAssignment_2
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


    // $ANTLR start "rule__UseCase__Group__0"
    // InternalUseCase.g:800:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:804:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCase.g:805:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:812:1: rule__UseCase__Group__0__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:816:1: ( ( 'use-case' ) )
            // InternalUseCase.g:817:1: ( 'use-case' )
            {
            // InternalUseCase.g:817:1: ( 'use-case' )
            // InternalUseCase.g:818:2: 'use-case'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUseCase.g:827:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:831:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCase.g:832:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:839:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:843:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUseCase.g:844:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUseCase.g:844:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUseCase.g:845:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUseCase.g:846:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUseCase.g:846:3: rule__UseCase__NameAssignment_1
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
    // InternalUseCase.g:854:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:858:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCase.g:859:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:866:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionsAssignment_2 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:870:1: ( ( ( rule__UseCase__DescriptionsAssignment_2 )? ) )
            // InternalUseCase.g:871:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            {
            // InternalUseCase.g:871:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            // InternalUseCase.g:872:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); 
            // InternalUseCase.g:873:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:873:3: rule__UseCase__DescriptionsAssignment_2
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
    // InternalUseCase.g:881:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:885:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCase.g:886:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:893:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:897:1: ( ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) )
            // InternalUseCase.g:898:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            {
            // InternalUseCase.g:898:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            // InternalUseCase.g:899:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            {
             before(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAssignment_3()); 
            // InternalUseCase.g:900:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==46) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:900:3: rule__UseCase__AllowedUserGroupsAssignment_3
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
    // InternalUseCase.g:908:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:912:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCase.g:913:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:920:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__InputsAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:924:1: ( ( ( rule__UseCase__InputsAssignment_4 )? ) )
            // InternalUseCase.g:925:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            {
            // InternalUseCase.g:925:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            // InternalUseCase.g:926:2: ( rule__UseCase__InputsAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getInputsAssignment_4()); 
            // InternalUseCase.g:927:2: ( rule__UseCase__InputsAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=16 && LA9_0<=17)||LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUseCase.g:927:3: rule__UseCase__InputsAssignment_4
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
    // InternalUseCase.g:935:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:939:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCase.g:940:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:947:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__OutputsAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:951:1: ( ( ( rule__UseCase__OutputsAssignment_5 )? ) )
            // InternalUseCase.g:952:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            {
            // InternalUseCase.g:952:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            // InternalUseCase.g:953:2: ( rule__UseCase__OutputsAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getOutputsAssignment_5()); 
            // InternalUseCase.g:954:2: ( rule__UseCase__OutputsAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=18 && LA10_0<=19)||LA10_0==38) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCase.g:954:3: rule__UseCase__OutputsAssignment_5
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
    // InternalUseCase.g:962:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:966:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCase.g:967:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:974:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__PreconditionsAssignment_6 )? ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:978:1: ( ( ( rule__UseCase__PreconditionsAssignment_6 )? ) )
            // InternalUseCase.g:979:1: ( ( rule__UseCase__PreconditionsAssignment_6 )? )
            {
            // InternalUseCase.g:979:1: ( ( rule__UseCase__PreconditionsAssignment_6 )? )
            // InternalUseCase.g:980:2: ( rule__UseCase__PreconditionsAssignment_6 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionsAssignment_6()); 
            // InternalUseCase.g:981:2: ( rule__UseCase__PreconditionsAssignment_6 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:981:3: rule__UseCase__PreconditionsAssignment_6
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
    // InternalUseCase.g:989:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:993:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCase.g:994:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:1001:1: rule__UseCase__Group__7__Impl : ( ( rule__UseCase__StepsAssignment_7 )? ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1005:1: ( ( ( rule__UseCase__StepsAssignment_7 )? ) )
            // InternalUseCase.g:1006:1: ( ( rule__UseCase__StepsAssignment_7 )? )
            {
            // InternalUseCase.g:1006:1: ( ( rule__UseCase__StepsAssignment_7 )? )
            // InternalUseCase.g:1007:2: ( rule__UseCase__StepsAssignment_7 )?
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_7()); 
            // InternalUseCase.g:1008:2: ( rule__UseCase__StepsAssignment_7 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCase.g:1008:3: rule__UseCase__StepsAssignment_7
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
    // InternalUseCase.g:1016:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1020:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCase.g:1021:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:1028:1: rule__UseCase__Group__8__Impl : ( ( rule__UseCase__NotesAssignment_8 )? ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1032:1: ( ( ( rule__UseCase__NotesAssignment_8 )? ) )
            // InternalUseCase.g:1033:1: ( ( rule__UseCase__NotesAssignment_8 )? )
            {
            // InternalUseCase.g:1033:1: ( ( rule__UseCase__NotesAssignment_8 )? )
            // InternalUseCase.g:1034:2: ( rule__UseCase__NotesAssignment_8 )?
            {
             before(grammarAccess.getUseCaseAccess().getNotesAssignment_8()); 
            // InternalUseCase.g:1035:2: ( rule__UseCase__NotesAssignment_8 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=14 && LA13_0<=15)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCase.g:1035:3: rule__UseCase__NotesAssignment_8
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
    // InternalUseCase.g:1043:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1047:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // InternalUseCase.g:1048:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:1055:1: rule__UseCase__Group__9__Impl : ( 'end' ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1059:1: ( ( 'end' ) )
            // InternalUseCase.g:1060:1: ( 'end' )
            {
            // InternalUseCase.g:1060:1: ( 'end' )
            // InternalUseCase.g:1061:2: 'end'
            {
             before(grammarAccess.getUseCaseAccess().getEndKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getEndKeyword_9()); 

            }


            }

        }
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
    // InternalUseCase.g:1070:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl rule__UseCase__Group__11 ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1074:1: ( rule__UseCase__Group__10__Impl rule__UseCase__Group__11 )
            // InternalUseCase.g:1075:2: rule__UseCase__Group__10__Impl rule__UseCase__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__UseCase__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__11();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:1082:1: rule__UseCase__Group__10__Impl : ( 'of' ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1086:1: ( ( 'of' ) )
            // InternalUseCase.g:1087:1: ( 'of' )
            {
            // InternalUseCase.g:1087:1: ( 'of' )
            // InternalUseCase.g:1088:2: 'of'
            {
             before(grammarAccess.getUseCaseAccess().getOfKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getOfKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__UseCase__Group__11"
    // InternalUseCase.g:1097:1: rule__UseCase__Group__11 : rule__UseCase__Group__11__Impl ;
    public final void rule__UseCase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1101:1: ( rule__UseCase__Group__11__Impl )
            // InternalUseCase.g:1102:2: rule__UseCase__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__11"


    // $ANTLR start "rule__UseCase__Group__11__Impl"
    // InternalUseCase.g:1108:1: rule__UseCase__Group__11__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1112:1: ( ( 'use-case' ) )
            // InternalUseCase.g:1113:1: ( 'use-case' )
            {
            // InternalUseCase.g:1113:1: ( 'use-case' )
            // InternalUseCase.g:1114:2: 'use-case'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__11__Impl"


    // $ANTLR start "rule__PreConditions__Group__0"
    // InternalUseCase.g:1124:1: rule__PreConditions__Group__0 : rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 ;
    public final void rule__PreConditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1128:1: ( rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1 )
            // InternalUseCase.g:1129:2: rule__PreConditions__Group__0__Impl rule__PreConditions__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:1136:1: rule__PreConditions__Group__0__Impl : ( ( rule__PreConditions__Alternatives_0 ) ) ;
    public final void rule__PreConditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1140:1: ( ( ( rule__PreConditions__Alternatives_0 ) ) )
            // InternalUseCase.g:1141:1: ( ( rule__PreConditions__Alternatives_0 ) )
            {
            // InternalUseCase.g:1141:1: ( ( rule__PreConditions__Alternatives_0 ) )
            // InternalUseCase.g:1142:2: ( rule__PreConditions__Alternatives_0 )
            {
             before(grammarAccess.getPreConditionsAccess().getAlternatives_0()); 
            // InternalUseCase.g:1143:2: ( rule__PreConditions__Alternatives_0 )
            // InternalUseCase.g:1143:3: rule__PreConditions__Alternatives_0
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
    // InternalUseCase.g:1151:1: rule__PreConditions__Group__1 : rule__PreConditions__Group__1__Impl ;
    public final void rule__PreConditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1155:1: ( rule__PreConditions__Group__1__Impl )
            // InternalUseCase.g:1156:2: rule__PreConditions__Group__1__Impl
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
    // InternalUseCase.g:1162:1: rule__PreConditions__Group__1__Impl : ( ( rule__PreConditions__ConditionsAssignment_1 )* ) ;
    public final void rule__PreConditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1166:1: ( ( ( rule__PreConditions__ConditionsAssignment_1 )* ) )
            // InternalUseCase.g:1167:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            {
            // InternalUseCase.g:1167:1: ( ( rule__PreConditions__ConditionsAssignment_1 )* )
            // InternalUseCase.g:1168:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            {
             before(grammarAccess.getPreConditionsAccess().getConditionsAssignment_1()); 
            // InternalUseCase.g:1169:2: ( rule__PreConditions__ConditionsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUseCase.g:1169:3: rule__PreConditions__ConditionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PreConditions__ConditionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalUseCase.g:1178:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1182:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalUseCase.g:1183:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:1190:1: rule__Condition__Group__0__Impl : ( '-' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1194:1: ( ( '-' ) )
            // InternalUseCase.g:1195:1: ( '-' )
            {
            // InternalUseCase.g:1195:1: ( '-' )
            // InternalUseCase.g:1196:2: '-'
            {
             before(grammarAccess.getConditionAccess().getHyphenMinusKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUseCase.g:1205:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1209:1: ( rule__Condition__Group__1__Impl )
            // InternalUseCase.g:1210:2: rule__Condition__Group__1__Impl
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
    // InternalUseCase.g:1216:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ContentAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1220:1: ( ( ( rule__Condition__ContentAssignment_1 ) ) )
            // InternalUseCase.g:1221:1: ( ( rule__Condition__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:1221:1: ( ( rule__Condition__ContentAssignment_1 ) )
            // InternalUseCase.g:1222:2: ( rule__Condition__ContentAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getContentAssignment_1()); 
            // InternalUseCase.g:1223:2: ( rule__Condition__ContentAssignment_1 )
            // InternalUseCase.g:1223:3: rule__Condition__ContentAssignment_1
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
    // InternalUseCase.g:1232:1: rule__Steps__Group__0 : rule__Steps__Group__0__Impl rule__Steps__Group__1 ;
    public final void rule__Steps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1236:1: ( rule__Steps__Group__0__Impl rule__Steps__Group__1 )
            // InternalUseCase.g:1237:2: rule__Steps__Group__0__Impl rule__Steps__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:1244:1: rule__Steps__Group__0__Impl : ( 'steps:' ) ;
    public final void rule__Steps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1248:1: ( ( 'steps:' ) )
            // InternalUseCase.g:1249:1: ( 'steps:' )
            {
            // InternalUseCase.g:1249:1: ( 'steps:' )
            // InternalUseCase.g:1250:2: 'steps:'
            {
             before(grammarAccess.getStepsAccess().getStepsKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStepsAccess().getStepsKeyword_0()); 

            }


            }

        }
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
    // InternalUseCase.g:1259:1: rule__Steps__Group__1 : rule__Steps__Group__1__Impl ;
    public final void rule__Steps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1263:1: ( rule__Steps__Group__1__Impl )
            // InternalUseCase.g:1264:2: rule__Steps__Group__1__Impl
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
    // InternalUseCase.g:1270:1: rule__Steps__Group__1__Impl : ( ( rule__Steps__StepsAssignment_1 )* ) ;
    public final void rule__Steps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1274:1: ( ( ( rule__Steps__StepsAssignment_1 )* ) )
            // InternalUseCase.g:1275:1: ( ( rule__Steps__StepsAssignment_1 )* )
            {
            // InternalUseCase.g:1275:1: ( ( rule__Steps__StepsAssignment_1 )* )
            // InternalUseCase.g:1276:2: ( rule__Steps__StepsAssignment_1 )*
            {
             before(grammarAccess.getStepsAccess().getStepsAssignment_1()); 
            // InternalUseCase.g:1277:2: ( rule__Steps__StepsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUseCase.g:1277:3: rule__Steps__StepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Steps__StepsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "rule__UsedTypes__Group__0"
    // InternalUseCase.g:1286:1: rule__UsedTypes__Group__0 : rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 ;
    public final void rule__UsedTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1290:1: ( rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 )
            // InternalUseCase.g:1291:2: rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCase.g:1298:1: rule__UsedTypes__Group__0__Impl : ( 'used' ) ;
    public final void rule__UsedTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1302:1: ( ( 'used' ) )
            // InternalUseCase.g:1303:1: ( 'used' )
            {
            // InternalUseCase.g:1303:1: ( 'used' )
            // InternalUseCase.g:1304:2: 'used'
            {
             before(grammarAccess.getUsedTypesAccess().getUsedKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUsedTypesAccess().getUsedKeyword_0()); 

            }


            }

        }
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
    // InternalUseCase.g:1313:1: rule__UsedTypes__Group__1 : rule__UsedTypes__Group__1__Impl rule__UsedTypes__Group__2 ;
    public final void rule__UsedTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1317:1: ( rule__UsedTypes__Group__1__Impl rule__UsedTypes__Group__2 )
            // InternalUseCase.g:1318:2: rule__UsedTypes__Group__1__Impl rule__UsedTypes__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__UsedTypes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsedTypes__Group__2();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:1325:1: rule__UsedTypes__Group__1__Impl : ( 'types:' ) ;
    public final void rule__UsedTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1329:1: ( ( 'types:' ) )
            // InternalUseCase.g:1330:1: ( 'types:' )
            {
            // InternalUseCase.g:1330:1: ( 'types:' )
            // InternalUseCase.g:1331:2: 'types:'
            {
             before(grammarAccess.getUsedTypesAccess().getTypesKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUsedTypesAccess().getTypesKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__UsedTypes__Group__2"
    // InternalUseCase.g:1340:1: rule__UsedTypes__Group__2 : rule__UsedTypes__Group__2__Impl ;
    public final void rule__UsedTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1344:1: ( rule__UsedTypes__Group__2__Impl )
            // InternalUseCase.g:1345:2: rule__UsedTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsedTypes__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group__2"


    // $ANTLR start "rule__UsedTypes__Group__2__Impl"
    // InternalUseCase.g:1351:1: rule__UsedTypes__Group__2__Impl : ( ( rule__UsedTypes__TypesAssignment_2 )* ) ;
    public final void rule__UsedTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1355:1: ( ( ( rule__UsedTypes__TypesAssignment_2 )* ) )
            // InternalUseCase.g:1356:1: ( ( rule__UsedTypes__TypesAssignment_2 )* )
            {
            // InternalUseCase.g:1356:1: ( ( rule__UsedTypes__TypesAssignment_2 )* )
            // InternalUseCase.g:1357:2: ( rule__UsedTypes__TypesAssignment_2 )*
            {
             before(grammarAccess.getUsedTypesAccess().getTypesAssignment_2()); 
            // InternalUseCase.g:1358:2: ( rule__UsedTypes__TypesAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUseCase.g:1358:3: rule__UsedTypes__TypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UsedTypes__TypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getUsedTypesAccess().getTypesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__Group__2__Impl"


    // $ANTLR start "rule__UsedExceptions__Group__0"
    // InternalUseCase.g:1367:1: rule__UsedExceptions__Group__0 : rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 ;
    public final void rule__UsedExceptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1371:1: ( rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 )
            // InternalUseCase.g:1372:2: rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalUseCase.g:1379:1: rule__UsedExceptions__Group__0__Impl : ( 'used' ) ;
    public final void rule__UsedExceptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1383:1: ( ( 'used' ) )
            // InternalUseCase.g:1384:1: ( 'used' )
            {
            // InternalUseCase.g:1384:1: ( 'used' )
            // InternalUseCase.g:1385:2: 'used'
            {
             before(grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0()); 

            }


            }

        }
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
    // InternalUseCase.g:1394:1: rule__UsedExceptions__Group__1 : rule__UsedExceptions__Group__1__Impl rule__UsedExceptions__Group__2 ;
    public final void rule__UsedExceptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1398:1: ( rule__UsedExceptions__Group__1__Impl rule__UsedExceptions__Group__2 )
            // InternalUseCase.g:1399:2: rule__UsedExceptions__Group__1__Impl rule__UsedExceptions__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__UsedExceptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsedExceptions__Group__2();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:1406:1: rule__UsedExceptions__Group__1__Impl : ( 'errors:' ) ;
    public final void rule__UsedExceptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1410:1: ( ( 'errors:' ) )
            // InternalUseCase.g:1411:1: ( 'errors:' )
            {
            // InternalUseCase.g:1411:1: ( 'errors:' )
            // InternalUseCase.g:1412:2: 'errors:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__UsedExceptions__Group__2"
    // InternalUseCase.g:1421:1: rule__UsedExceptions__Group__2 : rule__UsedExceptions__Group__2__Impl ;
    public final void rule__UsedExceptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1425:1: ( rule__UsedExceptions__Group__2__Impl )
            // InternalUseCase.g:1426:2: rule__UsedExceptions__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsedExceptions__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group__2"


    // $ANTLR start "rule__UsedExceptions__Group__2__Impl"
    // InternalUseCase.g:1432:1: rule__UsedExceptions__Group__2__Impl : ( ( rule__UsedExceptions__ExceptionsAssignment_2 )* ) ;
    public final void rule__UsedExceptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1436:1: ( ( ( rule__UsedExceptions__ExceptionsAssignment_2 )* ) )
            // InternalUseCase.g:1437:1: ( ( rule__UsedExceptions__ExceptionsAssignment_2 )* )
            {
            // InternalUseCase.g:1437:1: ( ( rule__UsedExceptions__ExceptionsAssignment_2 )* )
            // InternalUseCase.g:1438:2: ( rule__UsedExceptions__ExceptionsAssignment_2 )*
            {
             before(grammarAccess.getUsedExceptionsAccess().getExceptionsAssignment_2()); 
            // InternalUseCase.g:1439:2: ( rule__UsedExceptions__ExceptionsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUseCase.g:1439:3: rule__UsedExceptions__ExceptionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UsedExceptions__ExceptionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getUsedExceptionsAccess().getExceptionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalUseCase.g:1448:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1452:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalUseCase.g:1453:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:1460:1: rule__Step__Group__0__Impl : ( ( rule__Step__NumberAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1464:1: ( ( ( rule__Step__NumberAssignment_0 ) ) )
            // InternalUseCase.g:1465:1: ( ( rule__Step__NumberAssignment_0 ) )
            {
            // InternalUseCase.g:1465:1: ( ( rule__Step__NumberAssignment_0 ) )
            // InternalUseCase.g:1466:2: ( rule__Step__NumberAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getNumberAssignment_0()); 
            // InternalUseCase.g:1467:2: ( rule__Step__NumberAssignment_0 )
            // InternalUseCase.g:1467:3: rule__Step__NumberAssignment_0
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
    // InternalUseCase.g:1475:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1479:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalUseCase.g:1480:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:1487:1: rule__Step__Group__1__Impl : ( ( rule__Step__ActionAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1491:1: ( ( ( rule__Step__ActionAssignment_1 ) ) )
            // InternalUseCase.g:1492:1: ( ( rule__Step__ActionAssignment_1 ) )
            {
            // InternalUseCase.g:1492:1: ( ( rule__Step__ActionAssignment_1 ) )
            // InternalUseCase.g:1493:2: ( rule__Step__ActionAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getActionAssignment_1()); 
            // InternalUseCase.g:1494:2: ( rule__Step__ActionAssignment_1 )
            // InternalUseCase.g:1494:3: rule__Step__ActionAssignment_1
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
    // InternalUseCase.g:1502:1: rule__Step__Group__2 : rule__Step__Group__2__Impl ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1506:1: ( rule__Step__Group__2__Impl )
            // InternalUseCase.g:1507:2: rule__Step__Group__2__Impl
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
    // InternalUseCase.g:1513:1: rule__Step__Group__2__Impl : ( ( rule__Step__ErrorAssignment_2 )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1517:1: ( ( ( rule__Step__ErrorAssignment_2 )? ) )
            // InternalUseCase.g:1518:1: ( ( rule__Step__ErrorAssignment_2 )? )
            {
            // InternalUseCase.g:1518:1: ( ( rule__Step__ErrorAssignment_2 )? )
            // InternalUseCase.g:1519:2: ( rule__Step__ErrorAssignment_2 )?
            {
             before(grammarAccess.getStepAccess().getErrorAssignment_2()); 
            // InternalUseCase.g:1520:2: ( rule__Step__ErrorAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCase.g:1520:3: rule__Step__ErrorAssignment_2
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
    // InternalUseCase.g:1529:1: rule__RaiseError__Group__0 : rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1 ;
    public final void rule__RaiseError__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1533:1: ( rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1 )
            // InternalUseCase.g:1534:2: rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCase.g:1541:1: rule__RaiseError__Group__0__Impl : ( '.' ) ;
    public final void rule__RaiseError__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1545:1: ( ( '.' ) )
            // InternalUseCase.g:1546:1: ( '.' )
            {
            // InternalUseCase.g:1546:1: ( '.' )
            // InternalUseCase.g:1547:2: '.'
            {
             before(grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0()); 

            }


            }

        }
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
    // InternalUseCase.g:1556:1: rule__RaiseError__Group__1 : rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2 ;
    public final void rule__RaiseError__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1560:1: ( rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2 )
            // InternalUseCase.g:1561:2: rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:1568:1: rule__RaiseError__Group__1__Impl : ( ( rule__RaiseError__Alternatives_1 ) ) ;
    public final void rule__RaiseError__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1572:1: ( ( ( rule__RaiseError__Alternatives_1 ) ) )
            // InternalUseCase.g:1573:1: ( ( rule__RaiseError__Alternatives_1 ) )
            {
            // InternalUseCase.g:1573:1: ( ( rule__RaiseError__Alternatives_1 ) )
            // InternalUseCase.g:1574:2: ( rule__RaiseError__Alternatives_1 )
            {
             before(grammarAccess.getRaiseErrorAccess().getAlternatives_1()); 
            // InternalUseCase.g:1575:2: ( rule__RaiseError__Alternatives_1 )
            // InternalUseCase.g:1575:3: rule__RaiseError__Alternatives_1
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
    // InternalUseCase.g:1583:1: rule__RaiseError__Group__2 : rule__RaiseError__Group__2__Impl ;
    public final void rule__RaiseError__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1587:1: ( rule__RaiseError__Group__2__Impl )
            // InternalUseCase.g:1588:2: rule__RaiseError__Group__2__Impl
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
    // InternalUseCase.g:1594:1: rule__RaiseError__Group__2__Impl : ( ( rule__RaiseError__ExceptionAssignment_2 ) ) ;
    public final void rule__RaiseError__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1598:1: ( ( ( rule__RaiseError__ExceptionAssignment_2 ) ) )
            // InternalUseCase.g:1599:1: ( ( rule__RaiseError__ExceptionAssignment_2 ) )
            {
            // InternalUseCase.g:1599:1: ( ( rule__RaiseError__ExceptionAssignment_2 ) )
            // InternalUseCase.g:1600:2: ( rule__RaiseError__ExceptionAssignment_2 )
            {
             before(grammarAccess.getRaiseErrorAccess().getExceptionAssignment_2()); 
            // InternalUseCase.g:1601:2: ( rule__RaiseError__ExceptionAssignment_2 )
            // InternalUseCase.g:1601:3: rule__RaiseError__ExceptionAssignment_2
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


    // $ANTLR start "rule__RaiseError__Group_1_1__0"
    // InternalUseCase.g:1610:1: rule__RaiseError__Group_1_1__0 : rule__RaiseError__Group_1_1__0__Impl rule__RaiseError__Group_1_1__1 ;
    public final void rule__RaiseError__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1614:1: ( rule__RaiseError__Group_1_1__0__Impl rule__RaiseError__Group_1_1__1 )
            // InternalUseCase.g:1615:2: rule__RaiseError__Group_1_1__0__Impl rule__RaiseError__Group_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__RaiseError__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1__0"


    // $ANTLR start "rule__RaiseError__Group_1_1__0__Impl"
    // InternalUseCase.g:1622:1: rule__RaiseError__Group_1_1__0__Impl : ( 'On' ) ;
    public final void rule__RaiseError__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1626:1: ( ( 'On' ) )
            // InternalUseCase.g:1627:1: ( 'On' )
            {
            // InternalUseCase.g:1627:1: ( 'On' )
            // InternalUseCase.g:1628:2: 'On'
            {
             before(grammarAccess.getRaiseErrorAccess().getOnKeyword_1_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getOnKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1__0__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_1__1"
    // InternalUseCase.g:1637:1: rule__RaiseError__Group_1_1__1 : rule__RaiseError__Group_1_1__1__Impl rule__RaiseError__Group_1_1__2 ;
    public final void rule__RaiseError__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1641:1: ( rule__RaiseError__Group_1_1__1__Impl rule__RaiseError__Group_1_1__2 )
            // InternalUseCase.g:1642:2: rule__RaiseError__Group_1_1__1__Impl rule__RaiseError__Group_1_1__2
            {
            pushFollow(FOLLOW_19);
            rule__RaiseError__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1__1"


    // $ANTLR start "rule__RaiseError__Group_1_1__1__Impl"
    // InternalUseCase.g:1649:1: rule__RaiseError__Group_1_1__1__Impl : ( 'error' ) ;
    public final void rule__RaiseError__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1653:1: ( ( 'error' ) )
            // InternalUseCase.g:1654:1: ( 'error' )
            {
            // InternalUseCase.g:1654:1: ( 'error' )
            // InternalUseCase.g:1655:2: 'error'
            {
             before(grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1__1__Impl"


    // $ANTLR start "rule__RaiseError__Group_1_1__2"
    // InternalUseCase.g:1664:1: rule__RaiseError__Group_1_1__2 : rule__RaiseError__Group_1_1__2__Impl ;
    public final void rule__RaiseError__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1668:1: ( rule__RaiseError__Group_1_1__2__Impl )
            // InternalUseCase.g:1669:2: rule__RaiseError__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RaiseError__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1__2"


    // $ANTLR start "rule__RaiseError__Group_1_1__2__Impl"
    // InternalUseCase.g:1675:1: rule__RaiseError__Group_1_1__2__Impl : ( 'raise' ) ;
    public final void rule__RaiseError__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1679:1: ( ( 'raise' ) )
            // InternalUseCase.g:1680:1: ( 'raise' )
            {
            // InternalUseCase.g:1680:1: ( 'raise' )
            // InternalUseCase.g:1681:2: 'raise'
            {
             before(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_1_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RaiseError__Group_1_1__2__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalUseCase.g:1691:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1695:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalUseCase.g:1696:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:1703:1: rule__Description__Group__0__Impl : ( 'description:' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1707:1: ( ( 'description:' ) )
            // InternalUseCase.g:1708:1: ( 'description:' )
            {
            // InternalUseCase.g:1708:1: ( 'description:' )
            // InternalUseCase.g:1709:2: 'description:'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUseCase.g:1718:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1722:1: ( rule__Description__Group__1__Impl )
            // InternalUseCase.g:1723:2: rule__Description__Group__1__Impl
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
    // InternalUseCase.g:1729:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1733:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalUseCase.g:1734:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalUseCase.g:1734:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalUseCase.g:1735:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalUseCase.g:1736:2: ( rule__Description__NameAssignment_1 )
            // InternalUseCase.g:1736:3: rule__Description__NameAssignment_1
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


    // $ANTLR start "rule__Notes__Group__0"
    // InternalUseCase.g:1745:1: rule__Notes__Group__0 : rule__Notes__Group__0__Impl rule__Notes__Group__1 ;
    public final void rule__Notes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1749:1: ( rule__Notes__Group__0__Impl rule__Notes__Group__1 )
            // InternalUseCase.g:1750:2: rule__Notes__Group__0__Impl rule__Notes__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:1757:1: rule__Notes__Group__0__Impl : ( ( rule__Notes__Alternatives_0 ) ) ;
    public final void rule__Notes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1761:1: ( ( ( rule__Notes__Alternatives_0 ) ) )
            // InternalUseCase.g:1762:1: ( ( rule__Notes__Alternatives_0 ) )
            {
            // InternalUseCase.g:1762:1: ( ( rule__Notes__Alternatives_0 ) )
            // InternalUseCase.g:1763:2: ( rule__Notes__Alternatives_0 )
            {
             before(grammarAccess.getNotesAccess().getAlternatives_0()); 
            // InternalUseCase.g:1764:2: ( rule__Notes__Alternatives_0 )
            // InternalUseCase.g:1764:3: rule__Notes__Alternatives_0
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
    // InternalUseCase.g:1772:1: rule__Notes__Group__1 : rule__Notes__Group__1__Impl ;
    public final void rule__Notes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1776:1: ( rule__Notes__Group__1__Impl )
            // InternalUseCase.g:1777:2: rule__Notes__Group__1__Impl
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
    // InternalUseCase.g:1783:1: rule__Notes__Group__1__Impl : ( ( rule__Notes__ContentAssignment_1 ) ) ;
    public final void rule__Notes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1787:1: ( ( ( rule__Notes__ContentAssignment_1 ) ) )
            // InternalUseCase.g:1788:1: ( ( rule__Notes__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:1788:1: ( ( rule__Notes__ContentAssignment_1 ) )
            // InternalUseCase.g:1789:2: ( rule__Notes__ContentAssignment_1 )
            {
             before(grammarAccess.getNotesAccess().getContentAssignment_1()); 
            // InternalUseCase.g:1790:2: ( rule__Notes__ContentAssignment_1 )
            // InternalUseCase.g:1790:3: rule__Notes__ContentAssignment_1
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


    // $ANTLR start "rule__Inputs__Group__0"
    // InternalUseCase.g:1799:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1803:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalUseCase.g:1804:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCase.g:1811:1: rule__Inputs__Group__0__Impl : ( ( rule__Inputs__Alternatives_0 ) ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1815:1: ( ( ( rule__Inputs__Alternatives_0 ) ) )
            // InternalUseCase.g:1816:1: ( ( rule__Inputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:1816:1: ( ( rule__Inputs__Alternatives_0 ) )
            // InternalUseCase.g:1817:2: ( rule__Inputs__Alternatives_0 )
            {
             before(grammarAccess.getInputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:1818:2: ( rule__Inputs__Alternatives_0 )
            // InternalUseCase.g:1818:3: rule__Inputs__Alternatives_0
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
    // InternalUseCase.g:1826:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1830:1: ( rule__Inputs__Group__1__Impl )
            // InternalUseCase.g:1831:2: rule__Inputs__Group__1__Impl
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
    // InternalUseCase.g:1837:1: rule__Inputs__Group__1__Impl : ( ( rule__Inputs__InputsAssignment_1 )* ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1841:1: ( ( ( rule__Inputs__InputsAssignment_1 )* ) )
            // InternalUseCase.g:1842:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            {
            // InternalUseCase.g:1842:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            // InternalUseCase.g:1843:2: ( rule__Inputs__InputsAssignment_1 )*
            {
             before(grammarAccess.getInputsAccess().getInputsAssignment_1()); 
            // InternalUseCase.g:1844:2: ( rule__Inputs__InputsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23||LA19_0==47) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUseCase.g:1844:3: rule__Inputs__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Inputs__InputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "rule__Inputs__Group_0_2__0"
    // InternalUseCase.g:1853:1: rule__Inputs__Group_0_2__0 : rule__Inputs__Group_0_2__0__Impl rule__Inputs__Group_0_2__1 ;
    public final void rule__Inputs__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1857:1: ( rule__Inputs__Group_0_2__0__Impl rule__Inputs__Group_0_2__1 )
            // InternalUseCase.g:1858:2: rule__Inputs__Group_0_2__0__Impl rule__Inputs__Group_0_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Inputs__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_2__0"


    // $ANTLR start "rule__Inputs__Group_0_2__0__Impl"
    // InternalUseCase.g:1865:1: rule__Inputs__Group_0_2__0__Impl : ( 'requires' ) ;
    public final void rule__Inputs__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1869:1: ( ( 'requires' ) )
            // InternalUseCase.g:1870:1: ( 'requires' )
            {
            // InternalUseCase.g:1870:1: ( 'requires' )
            // InternalUseCase.g:1871:2: 'requires'
            {
             before(grammarAccess.getInputsAccess().getRequiresKeyword_0_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getRequiresKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_2__0__Impl"


    // $ANTLR start "rule__Inputs__Group_0_2__1"
    // InternalUseCase.g:1880:1: rule__Inputs__Group_0_2__1 : rule__Inputs__Group_0_2__1__Impl rule__Inputs__Group_0_2__2 ;
    public final void rule__Inputs__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1884:1: ( rule__Inputs__Group_0_2__1__Impl rule__Inputs__Group_0_2__2 )
            // InternalUseCase.g:1885:2: rule__Inputs__Group_0_2__1__Impl rule__Inputs__Group_0_2__2
            {
            pushFollow(FOLLOW_23);
            rule__Inputs__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_2__1"


    // $ANTLR start "rule__Inputs__Group_0_2__1__Impl"
    // InternalUseCase.g:1892:1: rule__Inputs__Group_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Inputs__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1896:1: ( ( 'the' ) )
            // InternalUseCase.g:1897:1: ( 'the' )
            {
            // InternalUseCase.g:1897:1: ( 'the' )
            // InternalUseCase.g:1898:2: 'the'
            {
             before(grammarAccess.getInputsAccess().getTheKeyword_0_2_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getTheKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_2__1__Impl"


    // $ANTLR start "rule__Inputs__Group_0_2__2"
    // InternalUseCase.g:1907:1: rule__Inputs__Group_0_2__2 : rule__Inputs__Group_0_2__2__Impl rule__Inputs__Group_0_2__3 ;
    public final void rule__Inputs__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1911:1: ( rule__Inputs__Group_0_2__2__Impl rule__Inputs__Group_0_2__3 )
            // InternalUseCase.g:1912:2: rule__Inputs__Group_0_2__2__Impl rule__Inputs__Group_0_2__3
            {
            pushFollow(FOLLOW_24);
            rule__Inputs__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_2__2"


    // $ANTLR start "rule__Inputs__Group_0_2__2__Impl"
    // InternalUseCase.g:1919:1: rule__Inputs__Group_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Inputs__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1923:1: ( ( 'following' ) )
            // InternalUseCase.g:1924:1: ( 'following' )
            {
            // InternalUseCase.g:1924:1: ( 'following' )
            // InternalUseCase.g:1925:2: 'following'
            {
             before(grammarAccess.getInputsAccess().getFollowingKeyword_0_2_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getFollowingKeyword_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_2__2__Impl"


    // $ANTLR start "rule__Inputs__Group_0_2__3"
    // InternalUseCase.g:1934:1: rule__Inputs__Group_0_2__3 : rule__Inputs__Group_0_2__3__Impl rule__Inputs__Group_0_2__4 ;
    public final void rule__Inputs__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1938:1: ( rule__Inputs__Group_0_2__3__Impl rule__Inputs__Group_0_2__4 )
            // InternalUseCase.g:1939:2: rule__Inputs__Group_0_2__3__Impl rule__Inputs__Group_0_2__4
            {
            pushFollow(FOLLOW_25);
            rule__Inputs__Group_0_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_2__3"


    // $ANTLR start "rule__Inputs__Group_0_2__3__Impl"
    // InternalUseCase.g:1946:1: rule__Inputs__Group_0_2__3__Impl : ( 'input' ) ;
    public final void rule__Inputs__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1950:1: ( ( 'input' ) )
            // InternalUseCase.g:1951:1: ( 'input' )
            {
            // InternalUseCase.g:1951:1: ( 'input' )
            // InternalUseCase.g:1952:2: 'input'
            {
             before(grammarAccess.getInputsAccess().getInputKeyword_0_2_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getInputKeyword_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_2__3__Impl"


    // $ANTLR start "rule__Inputs__Group_0_2__4"
    // InternalUseCase.g:1961:1: rule__Inputs__Group_0_2__4 : rule__Inputs__Group_0_2__4__Impl ;
    public final void rule__Inputs__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1965:1: ( rule__Inputs__Group_0_2__4__Impl )
            // InternalUseCase.g:1966:2: rule__Inputs__Group_0_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inputs__Group_0_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_2__4"


    // $ANTLR start "rule__Inputs__Group_0_2__4__Impl"
    // InternalUseCase.g:1972:1: rule__Inputs__Group_0_2__4__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1976:1: ( ( ':' ) )
            // InternalUseCase.g:1977:1: ( ':' )
            {
            // InternalUseCase.g:1977:1: ( ':' )
            // InternalUseCase.g:1978:2: ':'
            {
             before(grammarAccess.getInputsAccess().getColonKeyword_0_2_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInputsAccess().getColonKeyword_0_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inputs__Group_0_2__4__Impl"


    // $ANTLR start "rule__Outputs__Group__0"
    // InternalUseCase.g:1988:1: rule__Outputs__Group__0 : rule__Outputs__Group__0__Impl rule__Outputs__Group__1 ;
    public final void rule__Outputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1992:1: ( rule__Outputs__Group__0__Impl rule__Outputs__Group__1 )
            // InternalUseCase.g:1993:2: rule__Outputs__Group__0__Impl rule__Outputs__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCase.g:2000:1: rule__Outputs__Group__0__Impl : ( ( rule__Outputs__Alternatives_0 ) ) ;
    public final void rule__Outputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2004:1: ( ( ( rule__Outputs__Alternatives_0 ) ) )
            // InternalUseCase.g:2005:1: ( ( rule__Outputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:2005:1: ( ( rule__Outputs__Alternatives_0 ) )
            // InternalUseCase.g:2006:2: ( rule__Outputs__Alternatives_0 )
            {
             before(grammarAccess.getOutputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:2007:2: ( rule__Outputs__Alternatives_0 )
            // InternalUseCase.g:2007:3: rule__Outputs__Alternatives_0
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
    // InternalUseCase.g:2015:1: rule__Outputs__Group__1 : rule__Outputs__Group__1__Impl ;
    public final void rule__Outputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2019:1: ( rule__Outputs__Group__1__Impl )
            // InternalUseCase.g:2020:2: rule__Outputs__Group__1__Impl
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
    // InternalUseCase.g:2026:1: rule__Outputs__Group__1__Impl : ( ( rule__Outputs__OutputsAssignment_1 )* ) ;
    public final void rule__Outputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2030:1: ( ( ( rule__Outputs__OutputsAssignment_1 )* ) )
            // InternalUseCase.g:2031:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            {
            // InternalUseCase.g:2031:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            // InternalUseCase.g:2032:2: ( rule__Outputs__OutputsAssignment_1 )*
            {
             before(grammarAccess.getOutputsAccess().getOutputsAssignment_1()); 
            // InternalUseCase.g:2033:2: ( rule__Outputs__OutputsAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23||LA20_0==47) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUseCase.g:2033:3: rule__Outputs__OutputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Outputs__OutputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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


    // $ANTLR start "rule__Outputs__Group_0_2__0"
    // InternalUseCase.g:2042:1: rule__Outputs__Group_0_2__0 : rule__Outputs__Group_0_2__0__Impl rule__Outputs__Group_0_2__1 ;
    public final void rule__Outputs__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2046:1: ( rule__Outputs__Group_0_2__0__Impl rule__Outputs__Group_0_2__1 )
            // InternalUseCase.g:2047:2: rule__Outputs__Group_0_2__0__Impl rule__Outputs__Group_0_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Outputs__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_2__0"


    // $ANTLR start "rule__Outputs__Group_0_2__0__Impl"
    // InternalUseCase.g:2054:1: rule__Outputs__Group_0_2__0__Impl : ( 'produces' ) ;
    public final void rule__Outputs__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2058:1: ( ( 'produces' ) )
            // InternalUseCase.g:2059:1: ( 'produces' )
            {
            // InternalUseCase.g:2059:1: ( 'produces' )
            // InternalUseCase.g:2060:2: 'produces'
            {
             before(grammarAccess.getOutputsAccess().getProducesKeyword_0_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getProducesKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_2__0__Impl"


    // $ANTLR start "rule__Outputs__Group_0_2__1"
    // InternalUseCase.g:2069:1: rule__Outputs__Group_0_2__1 : rule__Outputs__Group_0_2__1__Impl rule__Outputs__Group_0_2__2 ;
    public final void rule__Outputs__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2073:1: ( rule__Outputs__Group_0_2__1__Impl rule__Outputs__Group_0_2__2 )
            // InternalUseCase.g:2074:2: rule__Outputs__Group_0_2__1__Impl rule__Outputs__Group_0_2__2
            {
            pushFollow(FOLLOW_23);
            rule__Outputs__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_2__1"


    // $ANTLR start "rule__Outputs__Group_0_2__1__Impl"
    // InternalUseCase.g:2081:1: rule__Outputs__Group_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Outputs__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2085:1: ( ( 'the' ) )
            // InternalUseCase.g:2086:1: ( 'the' )
            {
            // InternalUseCase.g:2086:1: ( 'the' )
            // InternalUseCase.g:2087:2: 'the'
            {
             before(grammarAccess.getOutputsAccess().getTheKeyword_0_2_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getTheKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_2__1__Impl"


    // $ANTLR start "rule__Outputs__Group_0_2__2"
    // InternalUseCase.g:2096:1: rule__Outputs__Group_0_2__2 : rule__Outputs__Group_0_2__2__Impl rule__Outputs__Group_0_2__3 ;
    public final void rule__Outputs__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2100:1: ( rule__Outputs__Group_0_2__2__Impl rule__Outputs__Group_0_2__3 )
            // InternalUseCase.g:2101:2: rule__Outputs__Group_0_2__2__Impl rule__Outputs__Group_0_2__3
            {
            pushFollow(FOLLOW_26);
            rule__Outputs__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_2__2"


    // $ANTLR start "rule__Outputs__Group_0_2__2__Impl"
    // InternalUseCase.g:2108:1: rule__Outputs__Group_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Outputs__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2112:1: ( ( 'following' ) )
            // InternalUseCase.g:2113:1: ( 'following' )
            {
            // InternalUseCase.g:2113:1: ( 'following' )
            // InternalUseCase.g:2114:2: 'following'
            {
             before(grammarAccess.getOutputsAccess().getFollowingKeyword_0_2_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getFollowingKeyword_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_2__2__Impl"


    // $ANTLR start "rule__Outputs__Group_0_2__3"
    // InternalUseCase.g:2123:1: rule__Outputs__Group_0_2__3 : rule__Outputs__Group_0_2__3__Impl rule__Outputs__Group_0_2__4 ;
    public final void rule__Outputs__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2127:1: ( rule__Outputs__Group_0_2__3__Impl rule__Outputs__Group_0_2__4 )
            // InternalUseCase.g:2128:2: rule__Outputs__Group_0_2__3__Impl rule__Outputs__Group_0_2__4
            {
            pushFollow(FOLLOW_25);
            rule__Outputs__Group_0_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Outputs__Group_0_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_2__3"


    // $ANTLR start "rule__Outputs__Group_0_2__3__Impl"
    // InternalUseCase.g:2135:1: rule__Outputs__Group_0_2__3__Impl : ( 'output' ) ;
    public final void rule__Outputs__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2139:1: ( ( 'output' ) )
            // InternalUseCase.g:2140:1: ( 'output' )
            {
            // InternalUseCase.g:2140:1: ( 'output' )
            // InternalUseCase.g:2141:2: 'output'
            {
             before(grammarAccess.getOutputsAccess().getOutputKeyword_0_2_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getOutputKeyword_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_2__3__Impl"


    // $ANTLR start "rule__Outputs__Group_0_2__4"
    // InternalUseCase.g:2150:1: rule__Outputs__Group_0_2__4 : rule__Outputs__Group_0_2__4__Impl ;
    public final void rule__Outputs__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2154:1: ( rule__Outputs__Group_0_2__4__Impl )
            // InternalUseCase.g:2155:2: rule__Outputs__Group_0_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Outputs__Group_0_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_2__4"


    // $ANTLR start "rule__Outputs__Group_0_2__4__Impl"
    // InternalUseCase.g:2161:1: rule__Outputs__Group_0_2__4__Impl : ( ':' ) ;
    public final void rule__Outputs__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2165:1: ( ( ':' ) )
            // InternalUseCase.g:2166:1: ( ':' )
            {
            // InternalUseCase.g:2166:1: ( ':' )
            // InternalUseCase.g:2167:2: ':'
            {
             before(grammarAccess.getOutputsAccess().getColonKeyword_0_2_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOutputsAccess().getColonKeyword_0_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Outputs__Group_0_2__4__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalUseCase.g:2177:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2181:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalUseCase.g:2182:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:2189:1: rule__Type__Group__0__Impl : ( '-' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2193:1: ( ( '-' ) )
            // InternalUseCase.g:2194:1: ( '-' )
            {
            // InternalUseCase.g:2194:1: ( '-' )
            // InternalUseCase.g:2195:2: '-'
            {
             before(grammarAccess.getTypeAccess().getHyphenMinusKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUseCase.g:2204:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2208:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalUseCase.g:2209:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCase.g:2216:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2220:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalUseCase.g:2221:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalUseCase.g:2221:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalUseCase.g:2222:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalUseCase.g:2223:2: ( rule__Type__NameAssignment_1 )
            // InternalUseCase.g:2223:3: rule__Type__NameAssignment_1
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
    // InternalUseCase.g:2231:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2235:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalUseCase.g:2236:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:2243:1: rule__Type__Group__2__Impl : ( '(' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2247:1: ( ( '(' ) )
            // InternalUseCase.g:2248:1: ( '(' )
            {
            // InternalUseCase.g:2248:1: ( '(' )
            // InternalUseCase.g:2249:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUseCase.g:2258:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2262:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalUseCase.g:2263:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalUseCase.g:2270:1: rule__Type__Group__3__Impl : ( ( rule__Type__DescriptionAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2274:1: ( ( ( rule__Type__DescriptionAssignment_3 ) ) )
            // InternalUseCase.g:2275:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            {
            // InternalUseCase.g:2275:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            // InternalUseCase.g:2276:2: ( rule__Type__DescriptionAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getDescriptionAssignment_3()); 
            // InternalUseCase.g:2277:2: ( rule__Type__DescriptionAssignment_3 )
            // InternalUseCase.g:2277:3: rule__Type__DescriptionAssignment_3
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
    // InternalUseCase.g:2285:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2289:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalUseCase.g:2290:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalUseCase.g:2297:1: rule__Type__Group__4__Impl : ( ')' ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2301:1: ( ( ')' ) )
            // InternalUseCase.g:2302:1: ( ')' )
            {
            // InternalUseCase.g:2302:1: ( ')' )
            // InternalUseCase.g:2303:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUseCase.g:2312:1: rule__Type__Group__5 : rule__Type__Group__5__Impl ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2316:1: ( rule__Type__Group__5__Impl )
            // InternalUseCase.g:2317:2: rule__Type__Group__5__Impl
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
    // InternalUseCase.g:2323:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )? ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2327:1: ( ( ( rule__Type__Group_5__0 )? ) )
            // InternalUseCase.g:2328:1: ( ( rule__Type__Group_5__0 )? )
            {
            // InternalUseCase.g:2328:1: ( ( rule__Type__Group_5__0 )? )
            // InternalUseCase.g:2329:2: ( rule__Type__Group_5__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // InternalUseCase.g:2330:2: ( rule__Type__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:2330:3: rule__Type__Group_5__0
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
    // InternalUseCase.g:2339:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2343:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalUseCase.g:2344:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:2351:1: rule__Type__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2355:1: ( ( '[' ) )
            // InternalUseCase.g:2356:1: ( '[' )
            {
            // InternalUseCase.g:2356:1: ( '[' )
            // InternalUseCase.g:2357:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUseCase.g:2366:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2370:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalUseCase.g:2371:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalUseCase.g:2378:1: rule__Type__Group_5__1__Impl : ( ( rule__Type__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2382:1: ( ( ( rule__Type__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:2383:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:2383:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:2384:2: ( rule__Type__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getTypeAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:2385:2: ( rule__Type__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:2385:3: rule__Type__ImportInfoAssignment_5_1
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
    // InternalUseCase.g:2393:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2397:1: ( rule__Type__Group_5__2__Impl )
            // InternalUseCase.g:2398:2: rule__Type__Group_5__2__Impl
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
    // InternalUseCase.g:2404:1: rule__Type__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2408:1: ( ( ']' ) )
            // InternalUseCase.g:2409:1: ( ']' )
            {
            // InternalUseCase.g:2409:1: ( ']' )
            // InternalUseCase.g:2410:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,43,FOLLOW_2); 
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


    // $ANTLR start "rule__ExceptionDecleration__Group__0"
    // InternalUseCase.g:2420:1: rule__ExceptionDecleration__Group__0 : rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 ;
    public final void rule__ExceptionDecleration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2424:1: ( rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 )
            // InternalUseCase.g:2425:2: rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:2432:1: rule__ExceptionDecleration__Group__0__Impl : ( '-' ) ;
    public final void rule__ExceptionDecleration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2436:1: ( ( '-' ) )
            // InternalUseCase.g:2437:1: ( '-' )
            {
            // InternalUseCase.g:2437:1: ( '-' )
            // InternalUseCase.g:2438:2: '-'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUseCase.g:2447:1: rule__ExceptionDecleration__Group__1 : rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 ;
    public final void rule__ExceptionDecleration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2451:1: ( rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 )
            // InternalUseCase.g:2452:2: rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCase.g:2459:1: rule__ExceptionDecleration__Group__1__Impl : ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) ;
    public final void rule__ExceptionDecleration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2463:1: ( ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) )
            // InternalUseCase.g:2464:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            {
            // InternalUseCase.g:2464:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            // InternalUseCase.g:2465:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getNameAssignment_1()); 
            // InternalUseCase.g:2466:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            // InternalUseCase.g:2466:3: rule__ExceptionDecleration__NameAssignment_1
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
    // InternalUseCase.g:2474:1: rule__ExceptionDecleration__Group__2 : rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 ;
    public final void rule__ExceptionDecleration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2478:1: ( rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 )
            // InternalUseCase.g:2479:2: rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:2486:1: rule__ExceptionDecleration__Group__2__Impl : ( '(' ) ;
    public final void rule__ExceptionDecleration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2490:1: ( ( '(' ) )
            // InternalUseCase.g:2491:1: ( '(' )
            {
            // InternalUseCase.g:2491:1: ( '(' )
            // InternalUseCase.g:2492:2: '('
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUseCase.g:2501:1: rule__ExceptionDecleration__Group__3 : rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4 ;
    public final void rule__ExceptionDecleration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2505:1: ( rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4 )
            // InternalUseCase.g:2506:2: rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalUseCase.g:2513:1: rule__ExceptionDecleration__Group__3__Impl : ( ( rule__ExceptionDecleration__MessageAssignment_3 ) ) ;
    public final void rule__ExceptionDecleration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2517:1: ( ( ( rule__ExceptionDecleration__MessageAssignment_3 ) ) )
            // InternalUseCase.g:2518:1: ( ( rule__ExceptionDecleration__MessageAssignment_3 ) )
            {
            // InternalUseCase.g:2518:1: ( ( rule__ExceptionDecleration__MessageAssignment_3 ) )
            // InternalUseCase.g:2519:2: ( rule__ExceptionDecleration__MessageAssignment_3 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getMessageAssignment_3()); 
            // InternalUseCase.g:2520:2: ( rule__ExceptionDecleration__MessageAssignment_3 )
            // InternalUseCase.g:2520:3: rule__ExceptionDecleration__MessageAssignment_3
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
    // InternalUseCase.g:2528:1: rule__ExceptionDecleration__Group__4 : rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5 ;
    public final void rule__ExceptionDecleration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2532:1: ( rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5 )
            // InternalUseCase.g:2533:2: rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalUseCase.g:2540:1: rule__ExceptionDecleration__Group__4__Impl : ( ')' ) ;
    public final void rule__ExceptionDecleration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2544:1: ( ( ')' ) )
            // InternalUseCase.g:2545:1: ( ')' )
            {
            // InternalUseCase.g:2545:1: ( ')' )
            // InternalUseCase.g:2546:2: ')'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUseCase.g:2555:1: rule__ExceptionDecleration__Group__5 : rule__ExceptionDecleration__Group__5__Impl ;
    public final void rule__ExceptionDecleration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2559:1: ( rule__ExceptionDecleration__Group__5__Impl )
            // InternalUseCase.g:2560:2: rule__ExceptionDecleration__Group__5__Impl
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
    // InternalUseCase.g:2566:1: rule__ExceptionDecleration__Group__5__Impl : ( ( rule__ExceptionDecleration__Group_5__0 )? ) ;
    public final void rule__ExceptionDecleration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2570:1: ( ( ( rule__ExceptionDecleration__Group_5__0 )? ) )
            // InternalUseCase.g:2571:1: ( ( rule__ExceptionDecleration__Group_5__0 )? )
            {
            // InternalUseCase.g:2571:1: ( ( rule__ExceptionDecleration__Group_5__0 )? )
            // InternalUseCase.g:2572:2: ( rule__ExceptionDecleration__Group_5__0 )?
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup_5()); 
            // InternalUseCase.g:2573:2: ( rule__ExceptionDecleration__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:2573:3: rule__ExceptionDecleration__Group_5__0
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
    // InternalUseCase.g:2582:1: rule__ExceptionDecleration__Group_5__0 : rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1 ;
    public final void rule__ExceptionDecleration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2586:1: ( rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1 )
            // InternalUseCase.g:2587:2: rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:2594:1: rule__ExceptionDecleration__Group_5__0__Impl : ( '[' ) ;
    public final void rule__ExceptionDecleration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2598:1: ( ( '[' ) )
            // InternalUseCase.g:2599:1: ( '[' )
            {
            // InternalUseCase.g:2599:1: ( '[' )
            // InternalUseCase.g:2600:2: '['
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUseCase.g:2609:1: rule__ExceptionDecleration__Group_5__1 : rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2 ;
    public final void rule__ExceptionDecleration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2613:1: ( rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2 )
            // InternalUseCase.g:2614:2: rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalUseCase.g:2621:1: rule__ExceptionDecleration__Group_5__1__Impl : ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__ExceptionDecleration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2625:1: ( ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:2626:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:2626:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:2627:2: ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:2628:2: ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:2628:3: rule__ExceptionDecleration__ImportInfoAssignment_5_1
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
    // InternalUseCase.g:2636:1: rule__ExceptionDecleration__Group_5__2 : rule__ExceptionDecleration__Group_5__2__Impl ;
    public final void rule__ExceptionDecleration__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2640:1: ( rule__ExceptionDecleration__Group_5__2__Impl )
            // InternalUseCase.g:2641:2: rule__ExceptionDecleration__Group_5__2__Impl
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
    // InternalUseCase.g:2647:1: rule__ExceptionDecleration__Group_5__2__Impl : ( ']' ) ;
    public final void rule__ExceptionDecleration__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2651:1: ( ( ']' ) )
            // InternalUseCase.g:2652:1: ( ']' )
            {
            // InternalUseCase.g:2652:1: ( ']' )
            // InternalUseCase.g:2653:2: ']'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,43,FOLLOW_2); 
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


    // $ANTLR start "rule__Input__Group__0"
    // InternalUseCase.g:2663:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2667:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalUseCase.g:2668:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCase.g:2675:1: rule__Input__Group__0__Impl : ( ( rule__Input__ManyAssignment_0 )? ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2679:1: ( ( ( rule__Input__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2680:1: ( ( rule__Input__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2680:1: ( ( rule__Input__ManyAssignment_0 )? )
            // InternalUseCase.g:2681:2: ( rule__Input__ManyAssignment_0 )?
            {
             before(grammarAccess.getInputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2682:2: ( rule__Input__ManyAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:2682:3: rule__Input__ManyAssignment_0
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
    // InternalUseCase.g:2690:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2694:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalUseCase.g:2695:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:2702:1: rule__Input__Group__1__Impl : ( '-' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2706:1: ( ( '-' ) )
            // InternalUseCase.g:2707:1: ( '-' )
            {
            // InternalUseCase.g:2707:1: ( '-' )
            // InternalUseCase.g:2708:2: '-'
            {
             before(grammarAccess.getInputAccess().getHyphenMinusKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUseCase.g:2717:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2721:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalUseCase.g:2722:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalUseCase.g:2729:1: rule__Input__Group__2__Impl : ( ( rule__Input__ContentAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2733:1: ( ( ( rule__Input__ContentAssignment_2 ) ) )
            // InternalUseCase.g:2734:1: ( ( rule__Input__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:2734:1: ( ( rule__Input__ContentAssignment_2 ) )
            // InternalUseCase.g:2735:2: ( rule__Input__ContentAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:2736:2: ( rule__Input__ContentAssignment_2 )
            // InternalUseCase.g:2736:3: rule__Input__ContentAssignment_2
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
    // InternalUseCase.g:2744:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2748:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalUseCase.g:2749:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalUseCase.g:2756:1: rule__Input__Group__3__Impl : ( ( rule__Input__Group_3__0 )? ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2760:1: ( ( ( rule__Input__Group_3__0 )? ) )
            // InternalUseCase.g:2761:1: ( ( rule__Input__Group_3__0 )? )
            {
            // InternalUseCase.g:2761:1: ( ( rule__Input__Group_3__0 )? )
            // InternalUseCase.g:2762:2: ( rule__Input__Group_3__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_3()); 
            // InternalUseCase.g:2763:2: ( rule__Input__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:2763:3: rule__Input__Group_3__0
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


    // $ANTLR start "rule__Input__Group__4"
    // InternalUseCase.g:2771:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2775:1: ( rule__Input__Group__4__Impl )
            // InternalUseCase.g:2776:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:2782:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2786:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalUseCase.g:2787:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalUseCase.g:2787:1: ( ( rule__Input__Group_4__0 )? )
            // InternalUseCase.g:2788:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalUseCase.g:2789:2: ( rule__Input__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCase.g:2789:3: rule__Input__Group_4__0
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


    // $ANTLR start "rule__Input__Group_3__0"
    // InternalUseCase.g:2798:1: rule__Input__Group_3__0 : rule__Input__Group_3__0__Impl rule__Input__Group_3__1 ;
    public final void rule__Input__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2802:1: ( rule__Input__Group_3__0__Impl rule__Input__Group_3__1 )
            // InternalUseCase.g:2803:2: rule__Input__Group_3__0__Impl rule__Input__Group_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:2810:1: rule__Input__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Input__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2814:1: ( ( 'as' ) )
            // InternalUseCase.g:2815:1: ( 'as' )
            {
            // InternalUseCase.g:2815:1: ( 'as' )
            // InternalUseCase.g:2816:2: 'as'
            {
             before(grammarAccess.getInputAccess().getAsKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUseCase.g:2825:1: rule__Input__Group_3__1 : rule__Input__Group_3__1__Impl ;
    public final void rule__Input__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2829:1: ( rule__Input__Group_3__1__Impl )
            // InternalUseCase.g:2830:2: rule__Input__Group_3__1__Impl
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
    // InternalUseCase.g:2836:1: rule__Input__Group_3__1__Impl : ( ( rule__Input__TypeAssignment_3_1 ) ) ;
    public final void rule__Input__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2840:1: ( ( ( rule__Input__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:2841:1: ( ( rule__Input__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:2841:1: ( ( rule__Input__TypeAssignment_3_1 ) )
            // InternalUseCase.g:2842:2: ( rule__Input__TypeAssignment_3_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:2843:2: ( rule__Input__TypeAssignment_3_1 )
            // InternalUseCase.g:2843:3: rule__Input__TypeAssignment_3_1
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


    // $ANTLR start "rule__Input__Group_4__0"
    // InternalUseCase.g:2852:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2856:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalUseCase.g:2857:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalUseCase.g:2864:1: rule__Input__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2868:1: ( ( '(' ) )
            // InternalUseCase.g:2869:1: ( '(' )
            {
            // InternalUseCase.g:2869:1: ( '(' )
            // InternalUseCase.g:2870:2: '('
            {
             before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
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
    // InternalUseCase.g:2879:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl rule__Input__Group_4__2 ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2883:1: ( rule__Input__Group_4__1__Impl rule__Input__Group_4__2 )
            // InternalUseCase.g:2884:2: rule__Input__Group_4__1__Impl rule__Input__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__Input__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_4__2();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:2891:1: rule__Input__Group_4__1__Impl : ( 'e.g' ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2895:1: ( ( 'e.g' ) )
            // InternalUseCase.g:2896:1: ( 'e.g' )
            {
            // InternalUseCase.g:2896:1: ( 'e.g' )
            // InternalUseCase.g:2897:2: 'e.g'
            {
             before(grammarAccess.getInputAccess().getEGKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getEGKeyword_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Input__Group_4__2"
    // InternalUseCase.g:2906:1: rule__Input__Group_4__2 : rule__Input__Group_4__2__Impl rule__Input__Group_4__3 ;
    public final void rule__Input__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2910:1: ( rule__Input__Group_4__2__Impl rule__Input__Group_4__3 )
            // InternalUseCase.g:2911:2: rule__Input__Group_4__2__Impl rule__Input__Group_4__3
            {
            pushFollow(FOLLOW_28);
            rule__Input__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__2"


    // $ANTLR start "rule__Input__Group_4__2__Impl"
    // InternalUseCase.g:2918:1: rule__Input__Group_4__2__Impl : ( ( rule__Input__ExampleAssignment_4_2 ) ) ;
    public final void rule__Input__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2922:1: ( ( ( rule__Input__ExampleAssignment_4_2 ) ) )
            // InternalUseCase.g:2923:1: ( ( rule__Input__ExampleAssignment_4_2 ) )
            {
            // InternalUseCase.g:2923:1: ( ( rule__Input__ExampleAssignment_4_2 ) )
            // InternalUseCase.g:2924:2: ( rule__Input__ExampleAssignment_4_2 )
            {
             before(grammarAccess.getInputAccess().getExampleAssignment_4_2()); 
            // InternalUseCase.g:2925:2: ( rule__Input__ExampleAssignment_4_2 )
            // InternalUseCase.g:2925:3: rule__Input__ExampleAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Input__ExampleAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getExampleAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__2__Impl"


    // $ANTLR start "rule__Input__Group_4__3"
    // InternalUseCase.g:2933:1: rule__Input__Group_4__3 : rule__Input__Group_4__3__Impl ;
    public final void rule__Input__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2937:1: ( rule__Input__Group_4__3__Impl )
            // InternalUseCase.g:2938:2: rule__Input__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__3"


    // $ANTLR start "rule__Input__Group_4__3__Impl"
    // InternalUseCase.g:2944:1: rule__Input__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Input__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2948:1: ( ( ')' ) )
            // InternalUseCase.g:2949:1: ( ')' )
            {
            // InternalUseCase.g:2949:1: ( ')' )
            // InternalUseCase.g:2950:2: ')'
            {
             before(grammarAccess.getInputAccess().getRightParenthesisKeyword_4_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__3__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalUseCase.g:2960:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2964:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalUseCase.g:2965:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCase.g:2972:1: rule__Output__Group__0__Impl : ( ( rule__Output__ManyAssignment_0 )? ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2976:1: ( ( ( rule__Output__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2977:1: ( ( rule__Output__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2977:1: ( ( rule__Output__ManyAssignment_0 )? )
            // InternalUseCase.g:2978:2: ( rule__Output__ManyAssignment_0 )?
            {
             before(grammarAccess.getOutputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2979:2: ( rule__Output__ManyAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCase.g:2979:3: rule__Output__ManyAssignment_0
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
    // InternalUseCase.g:2987:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2991:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalUseCase.g:2992:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:2999:1: rule__Output__Group__1__Impl : ( '-' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3003:1: ( ( '-' ) )
            // InternalUseCase.g:3004:1: ( '-' )
            {
            // InternalUseCase.g:3004:1: ( '-' )
            // InternalUseCase.g:3005:2: '-'
            {
             before(grammarAccess.getOutputAccess().getHyphenMinusKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUseCase.g:3014:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3018:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalUseCase.g:3019:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalUseCase.g:3026:1: rule__Output__Group__2__Impl : ( ( rule__Output__ContentAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3030:1: ( ( ( rule__Output__ContentAssignment_2 ) ) )
            // InternalUseCase.g:3031:1: ( ( rule__Output__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:3031:1: ( ( rule__Output__ContentAssignment_2 ) )
            // InternalUseCase.g:3032:2: ( rule__Output__ContentAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:3033:2: ( rule__Output__ContentAssignment_2 )
            // InternalUseCase.g:3033:3: rule__Output__ContentAssignment_2
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
    // InternalUseCase.g:3041:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3045:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalUseCase.g:3046:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalUseCase.g:3053:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3057:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalUseCase.g:3058:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalUseCase.g:3058:1: ( ( rule__Output__Group_3__0 )? )
            // InternalUseCase.g:3059:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalUseCase.g:3060:2: ( rule__Output__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUseCase.g:3060:3: rule__Output__Group_3__0
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
    // InternalUseCase.g:3068:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3072:1: ( rule__Output__Group__4__Impl )
            // InternalUseCase.g:3073:2: rule__Output__Group__4__Impl
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
    // InternalUseCase.g:3079:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3083:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalUseCase.g:3084:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalUseCase.g:3084:1: ( ( rule__Output__Group_4__0 )? )
            // InternalUseCase.g:3085:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalUseCase.g:3086:2: ( rule__Output__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUseCase.g:3086:3: rule__Output__Group_4__0
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
    // InternalUseCase.g:3095:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3099:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalUseCase.g:3100:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:3107:1: rule__Output__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3111:1: ( ( 'as' ) )
            // InternalUseCase.g:3112:1: ( 'as' )
            {
            // InternalUseCase.g:3112:1: ( 'as' )
            // InternalUseCase.g:3113:2: 'as'
            {
             before(grammarAccess.getOutputAccess().getAsKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUseCase.g:3122:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3126:1: ( rule__Output__Group_3__1__Impl )
            // InternalUseCase.g:3127:2: rule__Output__Group_3__1__Impl
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
    // InternalUseCase.g:3133:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3137:1: ( ( ( rule__Output__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:3138:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:3138:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            // InternalUseCase.g:3139:2: ( rule__Output__TypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:3140:2: ( rule__Output__TypeAssignment_3_1 )
            // InternalUseCase.g:3140:3: rule__Output__TypeAssignment_3_1
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
    // InternalUseCase.g:3149:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3153:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalUseCase.g:3154:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalUseCase.g:3161:1: rule__Output__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3165:1: ( ( '(' ) )
            // InternalUseCase.g:3166:1: ( '(' )
            {
            // InternalUseCase.g:3166:1: ( '(' )
            // InternalUseCase.g:3167:2: '('
            {
             before(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUseCase.g:3176:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl rule__Output__Group_4__2 ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3180:1: ( rule__Output__Group_4__1__Impl rule__Output__Group_4__2 )
            // InternalUseCase.g:3181:2: rule__Output__Group_4__1__Impl rule__Output__Group_4__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:3188:1: rule__Output__Group_4__1__Impl : ( 'e.g' ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3192:1: ( ( 'e.g' ) )
            // InternalUseCase.g:3193:1: ( 'e.g' )
            {
            // InternalUseCase.g:3193:1: ( 'e.g' )
            // InternalUseCase.g:3194:2: 'e.g'
            {
             before(grammarAccess.getOutputAccess().getEGKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getEGKeyword_4_1()); 

            }


            }

        }
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
    // InternalUseCase.g:3203:1: rule__Output__Group_4__2 : rule__Output__Group_4__2__Impl rule__Output__Group_4__3 ;
    public final void rule__Output__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3207:1: ( rule__Output__Group_4__2__Impl rule__Output__Group_4__3 )
            // InternalUseCase.g:3208:2: rule__Output__Group_4__2__Impl rule__Output__Group_4__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalUseCase.g:3215:1: rule__Output__Group_4__2__Impl : ( ( rule__Output__ExampleAssignment_4_2 ) ) ;
    public final void rule__Output__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3219:1: ( ( ( rule__Output__ExampleAssignment_4_2 ) ) )
            // InternalUseCase.g:3220:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            {
            // InternalUseCase.g:3220:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            // InternalUseCase.g:3221:2: ( rule__Output__ExampleAssignment_4_2 )
            {
             before(grammarAccess.getOutputAccess().getExampleAssignment_4_2()); 
            // InternalUseCase.g:3222:2: ( rule__Output__ExampleAssignment_4_2 )
            // InternalUseCase.g:3222:3: rule__Output__ExampleAssignment_4_2
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
    // InternalUseCase.g:3230:1: rule__Output__Group_4__3 : rule__Output__Group_4__3__Impl ;
    public final void rule__Output__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3234:1: ( rule__Output__Group_4__3__Impl )
            // InternalUseCase.g:3235:2: rule__Output__Group_4__3__Impl
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
    // InternalUseCase.g:3241:1: rule__Output__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Output__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3245:1: ( ( ')' ) )
            // InternalUseCase.g:3246:1: ( ')' )
            {
            // InternalUseCase.g:3246:1: ( ')' )
            // InternalUseCase.g:3247:2: ')'
            {
             before(grammarAccess.getOutputAccess().getRightParenthesisKeyword_4_3()); 
            match(input,41,FOLLOW_2); 
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


    // $ANTLR start "rule__AllowedUserGroups__Group__0"
    // InternalUseCase.g:3257:1: rule__AllowedUserGroups__Group__0 : rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 ;
    public final void rule__AllowedUserGroups__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3261:1: ( rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 )
            // InternalUseCase.g:3262:2: rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCase.g:3269:1: rule__AllowedUserGroups__Group__0__Impl : ( 'allowed-usergroups:' ) ;
    public final void rule__AllowedUserGroups__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3273:1: ( ( 'allowed-usergroups:' ) )
            // InternalUseCase.g:3274:1: ( 'allowed-usergroups:' )
            {
            // InternalUseCase.g:3274:1: ( 'allowed-usergroups:' )
            // InternalUseCase.g:3275:2: 'allowed-usergroups:'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalUseCase.g:3284:1: rule__AllowedUserGroups__Group__1 : rule__AllowedUserGroups__Group__1__Impl ;
    public final void rule__AllowedUserGroups__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3288:1: ( rule__AllowedUserGroups__Group__1__Impl )
            // InternalUseCase.g:3289:2: rule__AllowedUserGroups__Group__1__Impl
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
    // InternalUseCase.g:3295:1: rule__AllowedUserGroups__Group__1__Impl : ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) ;
    public final void rule__AllowedUserGroups__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3299:1: ( ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) )
            // InternalUseCase.g:3300:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            {
            // InternalUseCase.g:3300:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            // InternalUseCase.g:3301:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroupsAssignment_1()); 
            // InternalUseCase.g:3302:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23||LA29_0==47) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUseCase.g:3302:3: rule__AllowedUserGroups__GroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__AllowedUserGroups__GroupsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalUseCase.g:3311:1: rule__AllowedUserGroup__Group__0 : rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 ;
    public final void rule__AllowedUserGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3315:1: ( rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 )
            // InternalUseCase.g:3316:2: rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCase.g:3323:1: rule__AllowedUserGroup__Group__0__Impl : ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) ;
    public final void rule__AllowedUserGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3327:1: ( ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) )
            // InternalUseCase.g:3328:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:3328:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            // InternalUseCase.g:3329:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyAssignment_0()); 
            // InternalUseCase.g:3330:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUseCase.g:3330:3: rule__AllowedUserGroup__ManyAssignment_0
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
    // InternalUseCase.g:3338:1: rule__AllowedUserGroup__Group__1 : rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 ;
    public final void rule__AllowedUserGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3342:1: ( rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 )
            // InternalUseCase.g:3343:2: rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCase.g:3350:1: rule__AllowedUserGroup__Group__1__Impl : ( '-' ) ;
    public final void rule__AllowedUserGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3354:1: ( ( '-' ) )
            // InternalUseCase.g:3355:1: ( '-' )
            {
            // InternalUseCase.g:3355:1: ( '-' )
            // InternalUseCase.g:3356:2: '-'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUseCase.g:3365:1: rule__AllowedUserGroup__Group__2 : rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 ;
    public final void rule__AllowedUserGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3369:1: ( rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 )
            // InternalUseCase.g:3370:2: rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalUseCase.g:3377:1: rule__AllowedUserGroup__Group__2__Impl : ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) ;
    public final void rule__AllowedUserGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3381:1: ( ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) )
            // InternalUseCase.g:3382:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            {
            // InternalUseCase.g:3382:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            // InternalUseCase.g:3383:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getNameAssignment_2()); 
            // InternalUseCase.g:3384:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            // InternalUseCase.g:3384:3: rule__AllowedUserGroup__NameAssignment_2
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
    // InternalUseCase.g:3392:1: rule__AllowedUserGroup__Group__3 : rule__AllowedUserGroup__Group__3__Impl ;
    public final void rule__AllowedUserGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3396:1: ( rule__AllowedUserGroup__Group__3__Impl )
            // InternalUseCase.g:3397:2: rule__AllowedUserGroup__Group__3__Impl
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
    // InternalUseCase.g:3403:1: rule__AllowedUserGroup__Group__3__Impl : ( ( rule__AllowedUserGroup__Group_3__0 )? ) ;
    public final void rule__AllowedUserGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3407:1: ( ( ( rule__AllowedUserGroup__Group_3__0 )? ) )
            // InternalUseCase.g:3408:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            {
            // InternalUseCase.g:3408:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            // InternalUseCase.g:3409:2: ( rule__AllowedUserGroup__Group_3__0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup_3()); 
            // InternalUseCase.g:3410:2: ( rule__AllowedUserGroup__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUseCase.g:3410:3: rule__AllowedUserGroup__Group_3__0
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
    // InternalUseCase.g:3419:1: rule__AllowedUserGroup__Group_3__0 : rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 ;
    public final void rule__AllowedUserGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3423:1: ( rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 )
            // InternalUseCase.g:3424:2: rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:3431:1: rule__AllowedUserGroup__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__AllowedUserGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3435:1: ( ( 'as' ) )
            // InternalUseCase.g:3436:1: ( 'as' )
            {
            // InternalUseCase.g:3436:1: ( 'as' )
            // InternalUseCase.g:3437:2: 'as'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUseCase.g:3446:1: rule__AllowedUserGroup__Group_3__1 : rule__AllowedUserGroup__Group_3__1__Impl ;
    public final void rule__AllowedUserGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3450:1: ( rule__AllowedUserGroup__Group_3__1__Impl )
            // InternalUseCase.g:3451:2: rule__AllowedUserGroup__Group_3__1__Impl
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
    // InternalUseCase.g:3457:1: rule__AllowedUserGroup__Group_3__1__Impl : ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) ;
    public final void rule__AllowedUserGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3461:1: ( ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:3462:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:3462:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            // InternalUseCase.g:3463:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:3464:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            // InternalUseCase.g:3464:3: rule__AllowedUserGroup__TypeAssignment_3_1
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
    // InternalUseCase.g:3473:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3477:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUseCase.g:3478:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:3485:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3489:1: ( ( RULE_ID ) )
            // InternalUseCase.g:3490:1: ( RULE_ID )
            {
            // InternalUseCase.g:3490:1: ( RULE_ID )
            // InternalUseCase.g:3491:2: RULE_ID
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
    // InternalUseCase.g:3500:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3504:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUseCase.g:3505:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUseCase.g:3511:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3515:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUseCase.g:3516:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUseCase.g:3516:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUseCase.g:3517:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUseCase.g:3518:2: ( rule__QualifiedName__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==28) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUseCase.g:3518:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalUseCase.g:3527:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3531:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUseCase.g:3532:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:3539:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3543:1: ( ( '.' ) )
            // InternalUseCase.g:3544:1: ( '.' )
            {
            // InternalUseCase.g:3544:1: ( '.' )
            // InternalUseCase.g:3545:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUseCase.g:3554:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3558:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUseCase.g:3559:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUseCase.g:3565:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3569:1: ( ( RULE_ID ) )
            // InternalUseCase.g:3570:1: ( RULE_ID )
            {
            // InternalUseCase.g:3570:1: ( RULE_ID )
            // InternalUseCase.g:3571:2: RULE_ID
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
    // InternalUseCase.g:3581:1: rule__QualifiedNumber__Group__0 : rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 ;
    public final void rule__QualifiedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3585:1: ( rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 )
            // InternalUseCase.g:3586:2: rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:3593:1: rule__QualifiedNumber__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3597:1: ( ( RULE_INT ) )
            // InternalUseCase.g:3598:1: ( RULE_INT )
            {
            // InternalUseCase.g:3598:1: ( RULE_INT )
            // InternalUseCase.g:3599:2: RULE_INT
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
    // InternalUseCase.g:3608:1: rule__QualifiedNumber__Group__1 : rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 ;
    public final void rule__QualifiedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3612:1: ( rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 )
            // InternalUseCase.g:3613:2: rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:3620:1: rule__QualifiedNumber__Group__1__Impl : ( ( rule__QualifiedNumber__Group_1__0 )* ) ;
    public final void rule__QualifiedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3624:1: ( ( ( rule__QualifiedNumber__Group_1__0 )* ) )
            // InternalUseCase.g:3625:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            {
            // InternalUseCase.g:3625:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            // InternalUseCase.g:3626:2: ( rule__QualifiedNumber__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup_1()); 
            // InternalUseCase.g:3627:2: ( rule__QualifiedNumber__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_INT) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalUseCase.g:3627:3: rule__QualifiedNumber__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__QualifiedNumber__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalUseCase.g:3635:1: rule__QualifiedNumber__Group__2 : rule__QualifiedNumber__Group__2__Impl ;
    public final void rule__QualifiedNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3639:1: ( rule__QualifiedNumber__Group__2__Impl )
            // InternalUseCase.g:3640:2: rule__QualifiedNumber__Group__2__Impl
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
    // InternalUseCase.g:3646:1: rule__QualifiedNumber__Group__2__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3650:1: ( ( '.' ) )
            // InternalUseCase.g:3651:1: ( '.' )
            {
            // InternalUseCase.g:3651:1: ( '.' )
            // InternalUseCase.g:3652:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUseCase.g:3662:1: rule__QualifiedNumber__Group_1__0 : rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 ;
    public final void rule__QualifiedNumber__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3666:1: ( rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 )
            // InternalUseCase.g:3667:2: rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:3674:1: rule__QualifiedNumber__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3678:1: ( ( '.' ) )
            // InternalUseCase.g:3679:1: ( '.' )
            {
            // InternalUseCase.g:3679:1: ( '.' )
            // InternalUseCase.g:3680:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUseCase.g:3689:1: rule__QualifiedNumber__Group_1__1 : rule__QualifiedNumber__Group_1__1__Impl ;
    public final void rule__QualifiedNumber__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3693:1: ( rule__QualifiedNumber__Group_1__1__Impl )
            // InternalUseCase.g:3694:2: rule__QualifiedNumber__Group_1__1__Impl
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
    // InternalUseCase.g:3700:1: rule__QualifiedNumber__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3704:1: ( ( RULE_INT ) )
            // InternalUseCase.g:3705:1: ( RULE_INT )
            {
            // InternalUseCase.g:3705:1: ( RULE_INT )
            // InternalUseCase.g:3706:2: RULE_INT
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


    // $ANTLR start "rule__Model__UseCasesAssignment_0"
    // InternalUseCase.g:3716:1: rule__Model__UseCasesAssignment_0 : ( ruleUseCase ) ;
    public final void rule__Model__UseCasesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3720:1: ( ( ruleUseCase ) )
            // InternalUseCase.g:3721:2: ( ruleUseCase )
            {
            // InternalUseCase.g:3721:2: ( ruleUseCase )
            // InternalUseCase.g:3722:3: ruleUseCase
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
    // InternalUseCase.g:3731:1: rule__Model__TypesAssignment_1 : ( ruleUsedTypes ) ;
    public final void rule__Model__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3735:1: ( ( ruleUsedTypes ) )
            // InternalUseCase.g:3736:2: ( ruleUsedTypes )
            {
            // InternalUseCase.g:3736:2: ( ruleUsedTypes )
            // InternalUseCase.g:3737:3: ruleUsedTypes
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
    // InternalUseCase.g:3746:1: rule__Model__ExceptionsAssignment_2 : ( ruleUsedExceptions ) ;
    public final void rule__Model__ExceptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3750:1: ( ( ruleUsedExceptions ) )
            // InternalUseCase.g:3751:2: ( ruleUsedExceptions )
            {
            // InternalUseCase.g:3751:2: ( ruleUsedExceptions )
            // InternalUseCase.g:3752:3: ruleUsedExceptions
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
    // InternalUseCase.g:3761:1: rule__UseCase__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3765:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3766:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3766:2: ( RULE_STRING )
            // InternalUseCase.g:3767:3: RULE_STRING
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
    // InternalUseCase.g:3776:1: rule__UseCase__DescriptionsAssignment_2 : ( ruleDescription ) ;
    public final void rule__UseCase__DescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3780:1: ( ( ruleDescription ) )
            // InternalUseCase.g:3781:2: ( ruleDescription )
            {
            // InternalUseCase.g:3781:2: ( ruleDescription )
            // InternalUseCase.g:3782:3: ruleDescription
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
    // InternalUseCase.g:3791:1: rule__UseCase__AllowedUserGroupsAssignment_3 : ( ruleAllowedUserGroups ) ;
    public final void rule__UseCase__AllowedUserGroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3795:1: ( ( ruleAllowedUserGroups ) )
            // InternalUseCase.g:3796:2: ( ruleAllowedUserGroups )
            {
            // InternalUseCase.g:3796:2: ( ruleAllowedUserGroups )
            // InternalUseCase.g:3797:3: ruleAllowedUserGroups
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
    // InternalUseCase.g:3806:1: rule__UseCase__InputsAssignment_4 : ( ruleInputs ) ;
    public final void rule__UseCase__InputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3810:1: ( ( ruleInputs ) )
            // InternalUseCase.g:3811:2: ( ruleInputs )
            {
            // InternalUseCase.g:3811:2: ( ruleInputs )
            // InternalUseCase.g:3812:3: ruleInputs
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
    // InternalUseCase.g:3821:1: rule__UseCase__OutputsAssignment_5 : ( ruleOutputs ) ;
    public final void rule__UseCase__OutputsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3825:1: ( ( ruleOutputs ) )
            // InternalUseCase.g:3826:2: ( ruleOutputs )
            {
            // InternalUseCase.g:3826:2: ( ruleOutputs )
            // InternalUseCase.g:3827:3: ruleOutputs
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
    // InternalUseCase.g:3836:1: rule__UseCase__PreconditionsAssignment_6 : ( rulePreConditions ) ;
    public final void rule__UseCase__PreconditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3840:1: ( ( rulePreConditions ) )
            // InternalUseCase.g:3841:2: ( rulePreConditions )
            {
            // InternalUseCase.g:3841:2: ( rulePreConditions )
            // InternalUseCase.g:3842:3: rulePreConditions
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
    // InternalUseCase.g:3851:1: rule__UseCase__StepsAssignment_7 : ( ruleSteps ) ;
    public final void rule__UseCase__StepsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3855:1: ( ( ruleSteps ) )
            // InternalUseCase.g:3856:2: ( ruleSteps )
            {
            // InternalUseCase.g:3856:2: ( ruleSteps )
            // InternalUseCase.g:3857:3: ruleSteps
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
    // InternalUseCase.g:3866:1: rule__UseCase__NotesAssignment_8 : ( ruleNotes ) ;
    public final void rule__UseCase__NotesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3870:1: ( ( ruleNotes ) )
            // InternalUseCase.g:3871:2: ( ruleNotes )
            {
            // InternalUseCase.g:3871:2: ( ruleNotes )
            // InternalUseCase.g:3872:3: ruleNotes
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


    // $ANTLR start "rule__PreConditions__ConditionsAssignment_1"
    // InternalUseCase.g:3881:1: rule__PreConditions__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__PreConditions__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3885:1: ( ( ruleCondition ) )
            // InternalUseCase.g:3886:2: ( ruleCondition )
            {
            // InternalUseCase.g:3886:2: ( ruleCondition )
            // InternalUseCase.g:3887:3: ruleCondition
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
    // InternalUseCase.g:3896:1: rule__Condition__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Condition__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3900:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3901:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3901:2: ( RULE_STRING )
            // InternalUseCase.g:3902:3: RULE_STRING
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
    // InternalUseCase.g:3911:1: rule__Steps__StepsAssignment_1 : ( ruleStep ) ;
    public final void rule__Steps__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3915:1: ( ( ruleStep ) )
            // InternalUseCase.g:3916:2: ( ruleStep )
            {
            // InternalUseCase.g:3916:2: ( ruleStep )
            // InternalUseCase.g:3917:3: ruleStep
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


    // $ANTLR start "rule__UsedTypes__TypesAssignment_2"
    // InternalUseCase.g:3926:1: rule__UsedTypes__TypesAssignment_2 : ( ruleType ) ;
    public final void rule__UsedTypes__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3930:1: ( ( ruleType ) )
            // InternalUseCase.g:3931:2: ( ruleType )
            {
            // InternalUseCase.g:3931:2: ( ruleType )
            // InternalUseCase.g:3932:3: ruleType
            {
             before(grammarAccess.getUsedTypesAccess().getTypesTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getUsedTypesAccess().getTypesTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedTypes__TypesAssignment_2"


    // $ANTLR start "rule__UsedExceptions__ExceptionsAssignment_2"
    // InternalUseCase.g:3941:1: rule__UsedExceptions__ExceptionsAssignment_2 : ( ruleExceptionDecleration ) ;
    public final void rule__UsedExceptions__ExceptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3945:1: ( ( ruleExceptionDecleration ) )
            // InternalUseCase.g:3946:2: ( ruleExceptionDecleration )
            {
            // InternalUseCase.g:3946:2: ( ruleExceptionDecleration )
            // InternalUseCase.g:3947:3: ruleExceptionDecleration
            {
             before(grammarAccess.getUsedExceptionsAccess().getExceptionsExceptionDeclerationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExceptionDecleration();

            state._fsp--;

             after(grammarAccess.getUsedExceptionsAccess().getExceptionsExceptionDeclerationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__ExceptionsAssignment_2"


    // $ANTLR start "rule__Step__NumberAssignment_0"
    // InternalUseCase.g:3956:1: rule__Step__NumberAssignment_0 : ( ruleQualifiedNumber ) ;
    public final void rule__Step__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3960:1: ( ( ruleQualifiedNumber ) )
            // InternalUseCase.g:3961:2: ( ruleQualifiedNumber )
            {
            // InternalUseCase.g:3961:2: ( ruleQualifiedNumber )
            // InternalUseCase.g:3962:3: ruleQualifiedNumber
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
    // InternalUseCase.g:3971:1: rule__Step__ActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Step__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3975:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3976:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3976:2: ( RULE_STRING )
            // InternalUseCase.g:3977:3: RULE_STRING
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
    // InternalUseCase.g:3986:1: rule__Step__ErrorAssignment_2 : ( ruleRaiseError ) ;
    public final void rule__Step__ErrorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3990:1: ( ( ruleRaiseError ) )
            // InternalUseCase.g:3991:2: ( ruleRaiseError )
            {
            // InternalUseCase.g:3991:2: ( ruleRaiseError )
            // InternalUseCase.g:3992:3: ruleRaiseError
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
    // InternalUseCase.g:4001:1: rule__RaiseError__ExceptionAssignment_2 : ( ruleException ) ;
    public final void rule__RaiseError__ExceptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4005:1: ( ( ruleException ) )
            // InternalUseCase.g:4006:2: ( ruleException )
            {
            // InternalUseCase.g:4006:2: ( ruleException )
            // InternalUseCase.g:4007:3: ruleException
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


    // $ANTLR start "rule__Exception__TypeAssignment"
    // InternalUseCase.g:4016:1: rule__Exception__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Exception__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4020:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:4021:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:4021:2: ( ( RULE_ID ) )
            // InternalUseCase.g:4022:3: ( RULE_ID )
            {
             before(grammarAccess.getExceptionAccess().getTypeExceptionDeclerationCrossReference_0()); 
            // InternalUseCase.g:4023:3: ( RULE_ID )
            // InternalUseCase.g:4024:4: RULE_ID
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


    // $ANTLR start "rule__Description__NameAssignment_1"
    // InternalUseCase.g:4035:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4039:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4040:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4040:2: ( RULE_STRING )
            // InternalUseCase.g:4041:3: RULE_STRING
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


    // $ANTLR start "rule__Notes__ContentAssignment_1"
    // InternalUseCase.g:4050:1: rule__Notes__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notes__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4054:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4055:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4055:2: ( RULE_STRING )
            // InternalUseCase.g:4056:3: RULE_STRING
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


    // $ANTLR start "rule__Inputs__InputsAssignment_1"
    // InternalUseCase.g:4065:1: rule__Inputs__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Inputs__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4069:1: ( ( ruleInput ) )
            // InternalUseCase.g:4070:2: ( ruleInput )
            {
            // InternalUseCase.g:4070:2: ( ruleInput )
            // InternalUseCase.g:4071:3: ruleInput
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
    // InternalUseCase.g:4080:1: rule__Outputs__OutputsAssignment_1 : ( ruleOutput ) ;
    public final void rule__Outputs__OutputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4084:1: ( ( ruleOutput ) )
            // InternalUseCase.g:4085:2: ( ruleOutput )
            {
            // InternalUseCase.g:4085:2: ( ruleOutput )
            // InternalUseCase.g:4086:3: ruleOutput
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
    // InternalUseCase.g:4095:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4099:1: ( ( RULE_ID ) )
            // InternalUseCase.g:4100:2: ( RULE_ID )
            {
            // InternalUseCase.g:4100:2: ( RULE_ID )
            // InternalUseCase.g:4101:3: RULE_ID
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
    // InternalUseCase.g:4110:1: rule__Type__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Type__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4114:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4115:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4115:2: ( RULE_STRING )
            // InternalUseCase.g:4116:3: RULE_STRING
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
    // InternalUseCase.g:4125:1: rule__Type__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__Type__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4129:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:4130:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:4130:2: ( ruleQualifiedName )
            // InternalUseCase.g:4131:3: ruleQualifiedName
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


    // $ANTLR start "rule__ExceptionDecleration__NameAssignment_1"
    // InternalUseCase.g:4140:1: rule__ExceptionDecleration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExceptionDecleration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4144:1: ( ( RULE_ID ) )
            // InternalUseCase.g:4145:2: ( RULE_ID )
            {
            // InternalUseCase.g:4145:2: ( RULE_ID )
            // InternalUseCase.g:4146:3: RULE_ID
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
    // InternalUseCase.g:4155:1: rule__ExceptionDecleration__MessageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ExceptionDecleration__MessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4159:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4160:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4160:2: ( RULE_STRING )
            // InternalUseCase.g:4161:3: RULE_STRING
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
    // InternalUseCase.g:4170:1: rule__ExceptionDecleration__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__ExceptionDecleration__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4174:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:4175:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:4175:2: ( ruleQualifiedName )
            // InternalUseCase.g:4176:3: ruleQualifiedName
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


    // $ANTLR start "rule__Input__ManyAssignment_0"
    // InternalUseCase.g:4185:1: rule__Input__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Input__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4189:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:4190:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:4190:2: ( ( 'many' ) )
            // InternalUseCase.g:4191:3: ( 'many' )
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:4192:3: ( 'many' )
            // InternalUseCase.g:4193:4: 'many'
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalUseCase.g:4204:1: rule__Input__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Input__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4208:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4209:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4209:2: ( RULE_STRING )
            // InternalUseCase.g:4210:3: RULE_STRING
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
    // InternalUseCase.g:4219:1: rule__Input__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Input__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4223:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:4224:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:4224:2: ( ( RULE_ID ) )
            // InternalUseCase.g:4225:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:4226:3: ( RULE_ID )
            // InternalUseCase.g:4227:4: RULE_ID
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


    // $ANTLR start "rule__Input__ExampleAssignment_4_2"
    // InternalUseCase.g:4238:1: rule__Input__ExampleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Input__ExampleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4242:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4243:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4243:2: ( RULE_STRING )
            // InternalUseCase.g:4244:3: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getExampleSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getExampleSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ExampleAssignment_4_2"


    // $ANTLR start "rule__Output__ManyAssignment_0"
    // InternalUseCase.g:4253:1: rule__Output__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Output__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4257:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:4258:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:4258:2: ( ( 'many' ) )
            // InternalUseCase.g:4259:3: ( 'many' )
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:4260:3: ( 'many' )
            // InternalUseCase.g:4261:4: 'many'
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalUseCase.g:4272:1: rule__Output__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4276:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4277:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4277:2: ( RULE_STRING )
            // InternalUseCase.g:4278:3: RULE_STRING
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
    // InternalUseCase.g:4287:1: rule__Output__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Output__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4291:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:4292:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:4292:2: ( ( RULE_ID ) )
            // InternalUseCase.g:4293:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:4294:3: ( RULE_ID )
            // InternalUseCase.g:4295:4: RULE_ID
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
    // InternalUseCase.g:4306:1: rule__Output__ExampleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Output__ExampleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4310:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4311:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4311:2: ( RULE_STRING )
            // InternalUseCase.g:4312:3: RULE_STRING
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


    // $ANTLR start "rule__AllowedUserGroups__GroupsAssignment_1"
    // InternalUseCase.g:4321:1: rule__AllowedUserGroups__GroupsAssignment_1 : ( ruleAllowedUserGroup ) ;
    public final void rule__AllowedUserGroups__GroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4325:1: ( ( ruleAllowedUserGroup ) )
            // InternalUseCase.g:4326:2: ( ruleAllowedUserGroup )
            {
            // InternalUseCase.g:4326:2: ( ruleAllowedUserGroup )
            // InternalUseCase.g:4327:3: ruleAllowedUserGroup
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
    // InternalUseCase.g:4336:1: rule__AllowedUserGroup__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__AllowedUserGroup__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4340:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:4341:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:4341:2: ( ( 'many' ) )
            // InternalUseCase.g:4342:3: ( 'many' )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:4343:3: ( 'many' )
            // InternalUseCase.g:4344:4: 'many'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalUseCase.g:4355:1: rule__AllowedUserGroup__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllowedUserGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4359:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4360:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4360:2: ( RULE_STRING )
            // InternalUseCase.g:4361:3: RULE_STRING
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
    // InternalUseCase.g:4370:1: rule__AllowedUserGroup__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllowedUserGroup__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4374:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:4375:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:4375:2: ( ( RULE_ID ) )
            // InternalUseCase.g:4376:3: ( RULE_ID )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:4377:3: ( RULE_ID )
            // InternalUseCase.g:4378:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00004043012FD800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010000002L});

}