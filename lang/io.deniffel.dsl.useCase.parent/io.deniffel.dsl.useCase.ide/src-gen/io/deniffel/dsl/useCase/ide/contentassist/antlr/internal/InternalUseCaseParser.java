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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Raise'", "'notes:'", "'note:'", "'requires:'", "'require:'", "'produces:'", "'produce:'", "'use-case'", "'end'", "'of'", "'steps:'", "'.'", "'On'", "'error'", "'raise'", "'description:'", "'requires'", "'the'", "'following'", "'input'", "':'", "'produces'", "'output'", "'type'", "'('", "')'", "'['", "']'", "'-'", "'as'", "'e.g'", "'allowed-usergroups:'", "'many'"
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


    // $ANTLR start "entryRuleSteps"
    // InternalUseCase.g:103:1: entryRuleSteps : ruleSteps EOF ;
    public final void entryRuleSteps() throws RecognitionException {
        try {
            // InternalUseCase.g:104:1: ( ruleSteps EOF )
            // InternalUseCase.g:105:1: ruleSteps EOF
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
    // InternalUseCase.g:112:1: ruleSteps : ( ( rule__Steps__Group__0 ) ) ;
    public final void ruleSteps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:116:2: ( ( ( rule__Steps__Group__0 ) ) )
            // InternalUseCase.g:117:2: ( ( rule__Steps__Group__0 ) )
            {
            // InternalUseCase.g:117:2: ( ( rule__Steps__Group__0 ) )
            // InternalUseCase.g:118:3: ( rule__Steps__Group__0 )
            {
             before(grammarAccess.getStepsAccess().getGroup()); 
            // InternalUseCase.g:119:3: ( rule__Steps__Group__0 )
            // InternalUseCase.g:119:4: rule__Steps__Group__0
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
    // InternalUseCase.g:128:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalUseCase.g:129:1: ( ruleStep EOF )
            // InternalUseCase.g:130:1: ruleStep EOF
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
    // InternalUseCase.g:137:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:141:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalUseCase.g:142:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalUseCase.g:142:2: ( ( rule__Step__Group__0 ) )
            // InternalUseCase.g:143:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalUseCase.g:144:3: ( rule__Step__Group__0 )
            // InternalUseCase.g:144:4: rule__Step__Group__0
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
    // InternalUseCase.g:153:1: entryRuleRaiseError : ruleRaiseError EOF ;
    public final void entryRuleRaiseError() throws RecognitionException {
        try {
            // InternalUseCase.g:154:1: ( ruleRaiseError EOF )
            // InternalUseCase.g:155:1: ruleRaiseError EOF
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
    // InternalUseCase.g:162:1: ruleRaiseError : ( ( rule__RaiseError__Group__0 ) ) ;
    public final void ruleRaiseError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:166:2: ( ( ( rule__RaiseError__Group__0 ) ) )
            // InternalUseCase.g:167:2: ( ( rule__RaiseError__Group__0 ) )
            {
            // InternalUseCase.g:167:2: ( ( rule__RaiseError__Group__0 ) )
            // InternalUseCase.g:168:3: ( rule__RaiseError__Group__0 )
            {
             before(grammarAccess.getRaiseErrorAccess().getGroup()); 
            // InternalUseCase.g:169:3: ( rule__RaiseError__Group__0 )
            // InternalUseCase.g:169:4: rule__RaiseError__Group__0
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
    // InternalUseCase.g:178:1: entryRuleException : ruleException EOF ;
    public final void entryRuleException() throws RecognitionException {
        try {
            // InternalUseCase.g:179:1: ( ruleException EOF )
            // InternalUseCase.g:180:1: ruleException EOF
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
    // InternalUseCase.g:187:1: ruleException : ( ( rule__Exception__NameAssignment ) ) ;
    public final void ruleException() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:191:2: ( ( ( rule__Exception__NameAssignment ) ) )
            // InternalUseCase.g:192:2: ( ( rule__Exception__NameAssignment ) )
            {
            // InternalUseCase.g:192:2: ( ( rule__Exception__NameAssignment ) )
            // InternalUseCase.g:193:3: ( rule__Exception__NameAssignment )
            {
             before(grammarAccess.getExceptionAccess().getNameAssignment()); 
            // InternalUseCase.g:194:3: ( rule__Exception__NameAssignment )
            // InternalUseCase.g:194:4: rule__Exception__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Exception__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExceptionAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleNotes"
    // InternalUseCase.g:228:1: entryRuleNotes : ruleNotes EOF ;
    public final void entryRuleNotes() throws RecognitionException {
        try {
            // InternalUseCase.g:229:1: ( ruleNotes EOF )
            // InternalUseCase.g:230:1: ruleNotes EOF
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
    // InternalUseCase.g:237:1: ruleNotes : ( ( rule__Notes__Group__0 ) ) ;
    public final void ruleNotes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:241:2: ( ( ( rule__Notes__Group__0 ) ) )
            // InternalUseCase.g:242:2: ( ( rule__Notes__Group__0 ) )
            {
            // InternalUseCase.g:242:2: ( ( rule__Notes__Group__0 ) )
            // InternalUseCase.g:243:3: ( rule__Notes__Group__0 )
            {
             before(grammarAccess.getNotesAccess().getGroup()); 
            // InternalUseCase.g:244:3: ( rule__Notes__Group__0 )
            // InternalUseCase.g:244:4: rule__Notes__Group__0
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
    // InternalUseCase.g:253:1: entryRuleInputs : ruleInputs EOF ;
    public final void entryRuleInputs() throws RecognitionException {
        try {
            // InternalUseCase.g:254:1: ( ruleInputs EOF )
            // InternalUseCase.g:255:1: ruleInputs EOF
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
    // InternalUseCase.g:262:1: ruleInputs : ( ( rule__Inputs__Group__0 ) ) ;
    public final void ruleInputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:266:2: ( ( ( rule__Inputs__Group__0 ) ) )
            // InternalUseCase.g:267:2: ( ( rule__Inputs__Group__0 ) )
            {
            // InternalUseCase.g:267:2: ( ( rule__Inputs__Group__0 ) )
            // InternalUseCase.g:268:3: ( rule__Inputs__Group__0 )
            {
             before(grammarAccess.getInputsAccess().getGroup()); 
            // InternalUseCase.g:269:3: ( rule__Inputs__Group__0 )
            // InternalUseCase.g:269:4: rule__Inputs__Group__0
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


    // $ANTLR start "entryRuleType"
    // InternalUseCase.g:303:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUseCase.g:304:1: ( ruleType EOF )
            // InternalUseCase.g:305:1: ruleType EOF
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
    // InternalUseCase.g:312:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:316:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalUseCase.g:317:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalUseCase.g:317:2: ( ( rule__Type__Group__0 ) )
            // InternalUseCase.g:318:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalUseCase.g:319:3: ( rule__Type__Group__0 )
            // InternalUseCase.g:319:4: rule__Type__Group__0
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


    // $ANTLR start "entryRuleAllowedUserGroups"
    // InternalUseCase.g:378:1: entryRuleAllowedUserGroups : ruleAllowedUserGroups EOF ;
    public final void entryRuleAllowedUserGroups() throws RecognitionException {
        try {
            // InternalUseCase.g:379:1: ( ruleAllowedUserGroups EOF )
            // InternalUseCase.g:380:1: ruleAllowedUserGroups EOF
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
    // InternalUseCase.g:387:1: ruleAllowedUserGroups : ( ( rule__AllowedUserGroups__Group__0 ) ) ;
    public final void ruleAllowedUserGroups() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:391:2: ( ( ( rule__AllowedUserGroups__Group__0 ) ) )
            // InternalUseCase.g:392:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            {
            // InternalUseCase.g:392:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            // InternalUseCase.g:393:3: ( rule__AllowedUserGroups__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroup()); 
            // InternalUseCase.g:394:3: ( rule__AllowedUserGroups__Group__0 )
            // InternalUseCase.g:394:4: rule__AllowedUserGroups__Group__0
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
    // InternalUseCase.g:403:1: entryRuleAllowedUserGroup : ruleAllowedUserGroup EOF ;
    public final void entryRuleAllowedUserGroup() throws RecognitionException {
        try {
            // InternalUseCase.g:404:1: ( ruleAllowedUserGroup EOF )
            // InternalUseCase.g:405:1: ruleAllowedUserGroup EOF
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
    // InternalUseCase.g:412:1: ruleAllowedUserGroup : ( ( rule__AllowedUserGroup__Group__0 ) ) ;
    public final void ruleAllowedUserGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:416:2: ( ( ( rule__AllowedUserGroup__Group__0 ) ) )
            // InternalUseCase.g:417:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            {
            // InternalUseCase.g:417:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            // InternalUseCase.g:418:3: ( rule__AllowedUserGroup__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup()); 
            // InternalUseCase.g:419:3: ( rule__AllowedUserGroup__Group__0 )
            // InternalUseCase.g:419:4: rule__AllowedUserGroup__Group__0
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
    // InternalUseCase.g:428:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalUseCase.g:429:1: ( ruleQualifiedName EOF )
            // InternalUseCase.g:430:1: ruleQualifiedName EOF
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
    // InternalUseCase.g:437:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:441:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalUseCase.g:442:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalUseCase.g:442:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalUseCase.g:443:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalUseCase.g:444:3: ( rule__QualifiedName__Group__0 )
            // InternalUseCase.g:444:4: rule__QualifiedName__Group__0
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
    // InternalUseCase.g:453:1: entryRuleQualifiedNumber : ruleQualifiedNumber EOF ;
    public final void entryRuleQualifiedNumber() throws RecognitionException {
        try {
            // InternalUseCase.g:454:1: ( ruleQualifiedNumber EOF )
            // InternalUseCase.g:455:1: ruleQualifiedNumber EOF
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
    // InternalUseCase.g:462:1: ruleQualifiedNumber : ( ( rule__QualifiedNumber__Group__0 ) ) ;
    public final void ruleQualifiedNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:466:2: ( ( ( rule__QualifiedNumber__Group__0 ) ) )
            // InternalUseCase.g:467:2: ( ( rule__QualifiedNumber__Group__0 ) )
            {
            // InternalUseCase.g:467:2: ( ( rule__QualifiedNumber__Group__0 ) )
            // InternalUseCase.g:468:3: ( rule__QualifiedNumber__Group__0 )
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup()); 
            // InternalUseCase.g:469:3: ( rule__QualifiedNumber__Group__0 )
            // InternalUseCase.g:469:4: rule__QualifiedNumber__Group__0
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


    // $ANTLR start "rule__RaiseError__Alternatives_1"
    // InternalUseCase.g:477:1: rule__RaiseError__Alternatives_1 : ( ( 'Raise' ) | ( ( rule__RaiseError__Group_1_1__0 ) ) );
    public final void rule__RaiseError__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:481:1: ( ( 'Raise' ) | ( ( rule__RaiseError__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUseCase.g:482:2: ( 'Raise' )
                    {
                    // InternalUseCase.g:482:2: ( 'Raise' )
                    // InternalUseCase.g:483:3: 'Raise'
                    {
                     before(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:488:2: ( ( rule__RaiseError__Group_1_1__0 ) )
                    {
                    // InternalUseCase.g:488:2: ( ( rule__RaiseError__Group_1_1__0 ) )
                    // InternalUseCase.g:489:3: ( rule__RaiseError__Group_1_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getGroup_1_1()); 
                    // InternalUseCase.g:490:3: ( rule__RaiseError__Group_1_1__0 )
                    // InternalUseCase.g:490:4: rule__RaiseError__Group_1_1__0
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
    // InternalUseCase.g:498:1: rule__Notes__Alternatives_0 : ( ( 'notes:' ) | ( 'note:' ) );
    public final void rule__Notes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:502:1: ( ( 'notes:' ) | ( 'note:' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCase.g:503:2: ( 'notes:' )
                    {
                    // InternalUseCase.g:503:2: ( 'notes:' )
                    // InternalUseCase.g:504:3: 'notes:'
                    {
                     before(grammarAccess.getNotesAccess().getNotesKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getNotesKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:509:2: ( 'note:' )
                    {
                    // InternalUseCase.g:509:2: ( 'note:' )
                    // InternalUseCase.g:510:3: 'note:'
                    {
                     before(grammarAccess.getNotesAccess().getNoteKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalUseCase.g:519:1: rule__Inputs__Alternatives_0 : ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_2__0 ) ) );
    public final void rule__Inputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:523:1: ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_2__0 ) ) )
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
            case 27:
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
                    // InternalUseCase.g:524:2: ( 'requires:' )
                    {
                    // InternalUseCase.g:524:2: ( 'requires:' )
                    // InternalUseCase.g:525:3: 'requires:'
                    {
                     before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequiresKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:530:2: ( 'require:' )
                    {
                    // InternalUseCase.g:530:2: ( 'require:' )
                    // InternalUseCase.g:531:3: 'require:'
                    {
                     before(grammarAccess.getInputsAccess().getRequireKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequireKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:536:2: ( ( rule__Inputs__Group_0_2__0 ) )
                    {
                    // InternalUseCase.g:536:2: ( ( rule__Inputs__Group_0_2__0 ) )
                    // InternalUseCase.g:537:3: ( rule__Inputs__Group_0_2__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_2()); 
                    // InternalUseCase.g:538:3: ( rule__Inputs__Group_0_2__0 )
                    // InternalUseCase.g:538:4: rule__Inputs__Group_0_2__0
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
    // InternalUseCase.g:546:1: rule__Outputs__Alternatives_0 : ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_2__0 ) ) );
    public final void rule__Outputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:550:1: ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_2__0 ) ) )
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
            case 32:
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
                    // InternalUseCase.g:551:2: ( 'produces:' )
                    {
                    // InternalUseCase.g:551:2: ( 'produces:' )
                    // InternalUseCase.g:552:3: 'produces:'
                    {
                     before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProducesKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:557:2: ( 'produce:' )
                    {
                    // InternalUseCase.g:557:2: ( 'produce:' )
                    // InternalUseCase.g:558:3: 'produce:'
                    {
                     before(grammarAccess.getOutputsAccess().getProduceKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProduceKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:563:2: ( ( rule__Outputs__Group_0_2__0 ) )
                    {
                    // InternalUseCase.g:563:2: ( ( rule__Outputs__Group_0_2__0 ) )
                    // InternalUseCase.g:564:3: ( rule__Outputs__Group_0_2__0 )
                    {
                     before(grammarAccess.getOutputsAccess().getGroup_0_2()); 
                    // InternalUseCase.g:565:3: ( rule__Outputs__Group_0_2__0 )
                    // InternalUseCase.g:565:4: rule__Outputs__Group_0_2__0
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
    // InternalUseCase.g:573:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:577:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUseCase.g:578:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalUseCase.g:585:1: rule__Model__Group__0__Impl : ( ( rule__Model__TypesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:589:1: ( ( ( rule__Model__TypesAssignment_0 )* ) )
            // InternalUseCase.g:590:1: ( ( rule__Model__TypesAssignment_0 )* )
            {
            // InternalUseCase.g:590:1: ( ( rule__Model__TypesAssignment_0 )* )
            // InternalUseCase.g:591:2: ( rule__Model__TypesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_0()); 
            // InternalUseCase.g:592:2: ( rule__Model__TypesAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUseCase.g:592:3: rule__Model__TypesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__TypesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalUseCase.g:600:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:604:1: ( rule__Model__Group__1__Impl )
            // InternalUseCase.g:605:2: rule__Model__Group__1__Impl
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
    // InternalUseCase.g:611:1: rule__Model__Group__1__Impl : ( ( rule__Model__UseCasesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:615:1: ( ( ( rule__Model__UseCasesAssignment_1 )* ) )
            // InternalUseCase.g:616:1: ( ( rule__Model__UseCasesAssignment_1 )* )
            {
            // InternalUseCase.g:616:1: ( ( rule__Model__UseCasesAssignment_1 )* )
            // InternalUseCase.g:617:2: ( rule__Model__UseCasesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getUseCasesAssignment_1()); 
            // InternalUseCase.g:618:2: ( rule__Model__UseCasesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUseCase.g:618:3: rule__Model__UseCasesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__UseCasesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalUseCase.g:627:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:631:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCase.g:632:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUseCase.g:639:1: rule__UseCase__Group__0__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:643:1: ( ( 'use-case' ) )
            // InternalUseCase.g:644:1: ( 'use-case' )
            {
            // InternalUseCase.g:644:1: ( 'use-case' )
            // InternalUseCase.g:645:2: 'use-case'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUseCase.g:654:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:658:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCase.g:659:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
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
    // InternalUseCase.g:666:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:670:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUseCase.g:671:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUseCase.g:671:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUseCase.g:672:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUseCase.g:673:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUseCase.g:673:3: rule__UseCase__NameAssignment_1
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
    // InternalUseCase.g:681:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:685:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCase.g:686:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
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
    // InternalUseCase.g:693:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionsAssignment_2 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:697:1: ( ( ( rule__UseCase__DescriptionsAssignment_2 )? ) )
            // InternalUseCase.g:698:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            {
            // InternalUseCase.g:698:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            // InternalUseCase.g:699:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); 
            // InternalUseCase.g:700:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:700:3: rule__UseCase__DescriptionsAssignment_2
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
    // InternalUseCase.g:708:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:712:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCase.g:713:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
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
    // InternalUseCase.g:720:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:724:1: ( ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) )
            // InternalUseCase.g:725:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            {
            // InternalUseCase.g:725:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            // InternalUseCase.g:726:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            {
             before(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAssignment_3()); 
            // InternalUseCase.g:727:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:727:3: rule__UseCase__AllowedUserGroupsAssignment_3
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
    // InternalUseCase.g:735:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:739:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCase.g:740:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
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
    // InternalUseCase.g:747:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__InputsAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:751:1: ( ( ( rule__UseCase__InputsAssignment_4 )? ) )
            // InternalUseCase.g:752:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            {
            // InternalUseCase.g:752:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            // InternalUseCase.g:753:2: ( rule__UseCase__InputsAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getInputsAssignment_4()); 
            // InternalUseCase.g:754:2: ( rule__UseCase__InputsAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=14 && LA9_0<=15)||LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUseCase.g:754:3: rule__UseCase__InputsAssignment_4
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
    // InternalUseCase.g:762:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:766:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCase.g:767:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
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
    // InternalUseCase.g:774:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__OutputsAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:778:1: ( ( ( rule__UseCase__OutputsAssignment_5 )? ) )
            // InternalUseCase.g:779:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            {
            // InternalUseCase.g:779:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            // InternalUseCase.g:780:2: ( rule__UseCase__OutputsAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getOutputsAssignment_5()); 
            // InternalUseCase.g:781:2: ( rule__UseCase__OutputsAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=16 && LA10_0<=17)||LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCase.g:781:3: rule__UseCase__OutputsAssignment_5
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
    // InternalUseCase.g:789:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:793:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCase.g:794:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:801:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__StepsAssignment_6 )? ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:805:1: ( ( ( rule__UseCase__StepsAssignment_6 )? ) )
            // InternalUseCase.g:806:1: ( ( rule__UseCase__StepsAssignment_6 )? )
            {
            // InternalUseCase.g:806:1: ( ( rule__UseCase__StepsAssignment_6 )? )
            // InternalUseCase.g:807:2: ( rule__UseCase__StepsAssignment_6 )?
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_6()); 
            // InternalUseCase.g:808:2: ( rule__UseCase__StepsAssignment_6 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:808:3: rule__UseCase__StepsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__StepsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_6()); 

            }


            }

        }
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
    // InternalUseCase.g:816:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:820:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCase.g:821:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:828:1: rule__UseCase__Group__7__Impl : ( ( rule__UseCase__NotesAssignment_7 )? ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:832:1: ( ( ( rule__UseCase__NotesAssignment_7 )? ) )
            // InternalUseCase.g:833:1: ( ( rule__UseCase__NotesAssignment_7 )? )
            {
            // InternalUseCase.g:833:1: ( ( rule__UseCase__NotesAssignment_7 )? )
            // InternalUseCase.g:834:2: ( rule__UseCase__NotesAssignment_7 )?
            {
             before(grammarAccess.getUseCaseAccess().getNotesAssignment_7()); 
            // InternalUseCase.g:835:2: ( rule__UseCase__NotesAssignment_7 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=12 && LA12_0<=13)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCase.g:835:3: rule__UseCase__NotesAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__NotesAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getNotesAssignment_7()); 

            }


            }

        }
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
    // InternalUseCase.g:843:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:847:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCase.g:848:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCase.g:855:1: rule__UseCase__Group__8__Impl : ( 'end' ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:859:1: ( ( 'end' ) )
            // InternalUseCase.g:860:1: ( 'end' )
            {
            // InternalUseCase.g:860:1: ( 'end' )
            // InternalUseCase.g:861:2: 'end'
            {
             before(grammarAccess.getUseCaseAccess().getEndKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getEndKeyword_8()); 

            }


            }

        }
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
    // InternalUseCase.g:870:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:874:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // InternalUseCase.g:875:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
            {
            pushFollow(FOLLOW_3);
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
    // InternalUseCase.g:882:1: rule__UseCase__Group__9__Impl : ( 'of' ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:886:1: ( ( 'of' ) )
            // InternalUseCase.g:887:1: ( 'of' )
            {
            // InternalUseCase.g:887:1: ( 'of' )
            // InternalUseCase.g:888:2: 'of'
            {
             before(grammarAccess.getUseCaseAccess().getOfKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getOfKeyword_9()); 

            }


            }

        }
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
    // InternalUseCase.g:897:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:901:1: ( rule__UseCase__Group__10__Impl )
            // InternalUseCase.g:902:2: rule__UseCase__Group__10__Impl
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
    // InternalUseCase.g:908:1: rule__UseCase__Group__10__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:912:1: ( ( 'use-case' ) )
            // InternalUseCase.g:913:1: ( 'use-case' )
            {
            // InternalUseCase.g:913:1: ( 'use-case' )
            // InternalUseCase.g:914:2: 'use-case'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__Steps__Group__0"
    // InternalUseCase.g:924:1: rule__Steps__Group__0 : rule__Steps__Group__0__Impl rule__Steps__Group__1 ;
    public final void rule__Steps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:928:1: ( rule__Steps__Group__0__Impl rule__Steps__Group__1 )
            // InternalUseCase.g:929:2: rule__Steps__Group__0__Impl rule__Steps__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:936:1: rule__Steps__Group__0__Impl : ( 'steps:' ) ;
    public final void rule__Steps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:940:1: ( ( 'steps:' ) )
            // InternalUseCase.g:941:1: ( 'steps:' )
            {
            // InternalUseCase.g:941:1: ( 'steps:' )
            // InternalUseCase.g:942:2: 'steps:'
            {
             before(grammarAccess.getStepsAccess().getStepsKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalUseCase.g:951:1: rule__Steps__Group__1 : rule__Steps__Group__1__Impl ;
    public final void rule__Steps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:955:1: ( rule__Steps__Group__1__Impl )
            // InternalUseCase.g:956:2: rule__Steps__Group__1__Impl
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
    // InternalUseCase.g:962:1: rule__Steps__Group__1__Impl : ( ( rule__Steps__StepsAssignment_1 )* ) ;
    public final void rule__Steps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:966:1: ( ( ( rule__Steps__StepsAssignment_1 )* ) )
            // InternalUseCase.g:967:1: ( ( rule__Steps__StepsAssignment_1 )* )
            {
            // InternalUseCase.g:967:1: ( ( rule__Steps__StepsAssignment_1 )* )
            // InternalUseCase.g:968:2: ( rule__Steps__StepsAssignment_1 )*
            {
             before(grammarAccess.getStepsAccess().getStepsAssignment_1()); 
            // InternalUseCase.g:969:2: ( rule__Steps__StepsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_INT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUseCase.g:969:3: rule__Steps__StepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Steps__StepsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalUseCase.g:978:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:982:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalUseCase.g:983:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:990:1: rule__Step__Group__0__Impl : ( ( rule__Step__NumberAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:994:1: ( ( ( rule__Step__NumberAssignment_0 ) ) )
            // InternalUseCase.g:995:1: ( ( rule__Step__NumberAssignment_0 ) )
            {
            // InternalUseCase.g:995:1: ( ( rule__Step__NumberAssignment_0 ) )
            // InternalUseCase.g:996:2: ( rule__Step__NumberAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getNumberAssignment_0()); 
            // InternalUseCase.g:997:2: ( rule__Step__NumberAssignment_0 )
            // InternalUseCase.g:997:3: rule__Step__NumberAssignment_0
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
    // InternalUseCase.g:1005:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1009:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalUseCase.g:1010:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:1017:1: rule__Step__Group__1__Impl : ( ( rule__Step__ActionAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1021:1: ( ( ( rule__Step__ActionAssignment_1 ) ) )
            // InternalUseCase.g:1022:1: ( ( rule__Step__ActionAssignment_1 ) )
            {
            // InternalUseCase.g:1022:1: ( ( rule__Step__ActionAssignment_1 ) )
            // InternalUseCase.g:1023:2: ( rule__Step__ActionAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getActionAssignment_1()); 
            // InternalUseCase.g:1024:2: ( rule__Step__ActionAssignment_1 )
            // InternalUseCase.g:1024:3: rule__Step__ActionAssignment_1
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
    // InternalUseCase.g:1032:1: rule__Step__Group__2 : rule__Step__Group__2__Impl ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1036:1: ( rule__Step__Group__2__Impl )
            // InternalUseCase.g:1037:2: rule__Step__Group__2__Impl
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
    // InternalUseCase.g:1043:1: rule__Step__Group__2__Impl : ( ( rule__Step__ErrorAssignment_2 )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1047:1: ( ( ( rule__Step__ErrorAssignment_2 )? ) )
            // InternalUseCase.g:1048:1: ( ( rule__Step__ErrorAssignment_2 )? )
            {
            // InternalUseCase.g:1048:1: ( ( rule__Step__ErrorAssignment_2 )? )
            // InternalUseCase.g:1049:2: ( rule__Step__ErrorAssignment_2 )?
            {
             before(grammarAccess.getStepAccess().getErrorAssignment_2()); 
            // InternalUseCase.g:1050:2: ( rule__Step__ErrorAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCase.g:1050:3: rule__Step__ErrorAssignment_2
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
    // InternalUseCase.g:1059:1: rule__RaiseError__Group__0 : rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1 ;
    public final void rule__RaiseError__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1063:1: ( rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1 )
            // InternalUseCase.g:1064:2: rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCase.g:1071:1: rule__RaiseError__Group__0__Impl : ( '.' ) ;
    public final void rule__RaiseError__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1075:1: ( ( '.' ) )
            // InternalUseCase.g:1076:1: ( '.' )
            {
            // InternalUseCase.g:1076:1: ( '.' )
            // InternalUseCase.g:1077:2: '.'
            {
             before(grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUseCase.g:1086:1: rule__RaiseError__Group__1 : rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2 ;
    public final void rule__RaiseError__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1090:1: ( rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2 )
            // InternalUseCase.g:1091:2: rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:1098:1: rule__RaiseError__Group__1__Impl : ( ( rule__RaiseError__Alternatives_1 ) ) ;
    public final void rule__RaiseError__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1102:1: ( ( ( rule__RaiseError__Alternatives_1 ) ) )
            // InternalUseCase.g:1103:1: ( ( rule__RaiseError__Alternatives_1 ) )
            {
            // InternalUseCase.g:1103:1: ( ( rule__RaiseError__Alternatives_1 ) )
            // InternalUseCase.g:1104:2: ( rule__RaiseError__Alternatives_1 )
            {
             before(grammarAccess.getRaiseErrorAccess().getAlternatives_1()); 
            // InternalUseCase.g:1105:2: ( rule__RaiseError__Alternatives_1 )
            // InternalUseCase.g:1105:3: rule__RaiseError__Alternatives_1
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
    // InternalUseCase.g:1113:1: rule__RaiseError__Group__2 : rule__RaiseError__Group__2__Impl ;
    public final void rule__RaiseError__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1117:1: ( rule__RaiseError__Group__2__Impl )
            // InternalUseCase.g:1118:2: rule__RaiseError__Group__2__Impl
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
    // InternalUseCase.g:1124:1: rule__RaiseError__Group__2__Impl : ( ( rule__RaiseError__ExceptionAssignment_2 ) ) ;
    public final void rule__RaiseError__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1128:1: ( ( ( rule__RaiseError__ExceptionAssignment_2 ) ) )
            // InternalUseCase.g:1129:1: ( ( rule__RaiseError__ExceptionAssignment_2 ) )
            {
            // InternalUseCase.g:1129:1: ( ( rule__RaiseError__ExceptionAssignment_2 ) )
            // InternalUseCase.g:1130:2: ( rule__RaiseError__ExceptionAssignment_2 )
            {
             before(grammarAccess.getRaiseErrorAccess().getExceptionAssignment_2()); 
            // InternalUseCase.g:1131:2: ( rule__RaiseError__ExceptionAssignment_2 )
            // InternalUseCase.g:1131:3: rule__RaiseError__ExceptionAssignment_2
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
    // InternalUseCase.g:1140:1: rule__RaiseError__Group_1_1__0 : rule__RaiseError__Group_1_1__0__Impl rule__RaiseError__Group_1_1__1 ;
    public final void rule__RaiseError__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1144:1: ( rule__RaiseError__Group_1_1__0__Impl rule__RaiseError__Group_1_1__1 )
            // InternalUseCase.g:1145:2: rule__RaiseError__Group_1_1__0__Impl rule__RaiseError__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCase.g:1152:1: rule__RaiseError__Group_1_1__0__Impl : ( 'On' ) ;
    public final void rule__RaiseError__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1156:1: ( ( 'On' ) )
            // InternalUseCase.g:1157:1: ( 'On' )
            {
            // InternalUseCase.g:1157:1: ( 'On' )
            // InternalUseCase.g:1158:2: 'On'
            {
             before(grammarAccess.getRaiseErrorAccess().getOnKeyword_1_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUseCase.g:1167:1: rule__RaiseError__Group_1_1__1 : rule__RaiseError__Group_1_1__1__Impl rule__RaiseError__Group_1_1__2 ;
    public final void rule__RaiseError__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1171:1: ( rule__RaiseError__Group_1_1__1__Impl rule__RaiseError__Group_1_1__2 )
            // InternalUseCase.g:1172:2: rule__RaiseError__Group_1_1__1__Impl rule__RaiseError__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalUseCase.g:1179:1: rule__RaiseError__Group_1_1__1__Impl : ( 'error' ) ;
    public final void rule__RaiseError__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1183:1: ( ( 'error' ) )
            // InternalUseCase.g:1184:1: ( 'error' )
            {
            // InternalUseCase.g:1184:1: ( 'error' )
            // InternalUseCase.g:1185:2: 'error'
            {
             before(grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_1_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUseCase.g:1194:1: rule__RaiseError__Group_1_1__2 : rule__RaiseError__Group_1_1__2__Impl ;
    public final void rule__RaiseError__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1198:1: ( rule__RaiseError__Group_1_1__2__Impl )
            // InternalUseCase.g:1199:2: rule__RaiseError__Group_1_1__2__Impl
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
    // InternalUseCase.g:1205:1: rule__RaiseError__Group_1_1__2__Impl : ( 'raise' ) ;
    public final void rule__RaiseError__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1209:1: ( ( 'raise' ) )
            // InternalUseCase.g:1210:1: ( 'raise' )
            {
            // InternalUseCase.g:1210:1: ( 'raise' )
            // InternalUseCase.g:1211:2: 'raise'
            {
             before(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_1_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUseCase.g:1221:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1225:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalUseCase.g:1226:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalUseCase.g:1233:1: rule__Description__Group__0__Impl : ( 'description:' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1237:1: ( ( 'description:' ) )
            // InternalUseCase.g:1238:1: ( 'description:' )
            {
            // InternalUseCase.g:1238:1: ( 'description:' )
            // InternalUseCase.g:1239:2: 'description:'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalUseCase.g:1248:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1252:1: ( rule__Description__Group__1__Impl )
            // InternalUseCase.g:1253:2: rule__Description__Group__1__Impl
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
    // InternalUseCase.g:1259:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1263:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalUseCase.g:1264:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalUseCase.g:1264:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalUseCase.g:1265:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalUseCase.g:1266:2: ( rule__Description__NameAssignment_1 )
            // InternalUseCase.g:1266:3: rule__Description__NameAssignment_1
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
    // InternalUseCase.g:1275:1: rule__Notes__Group__0 : rule__Notes__Group__0__Impl rule__Notes__Group__1 ;
    public final void rule__Notes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1279:1: ( rule__Notes__Group__0__Impl rule__Notes__Group__1 )
            // InternalUseCase.g:1280:2: rule__Notes__Group__0__Impl rule__Notes__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:1287:1: rule__Notes__Group__0__Impl : ( ( rule__Notes__Alternatives_0 ) ) ;
    public final void rule__Notes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1291:1: ( ( ( rule__Notes__Alternatives_0 ) ) )
            // InternalUseCase.g:1292:1: ( ( rule__Notes__Alternatives_0 ) )
            {
            // InternalUseCase.g:1292:1: ( ( rule__Notes__Alternatives_0 ) )
            // InternalUseCase.g:1293:2: ( rule__Notes__Alternatives_0 )
            {
             before(grammarAccess.getNotesAccess().getAlternatives_0()); 
            // InternalUseCase.g:1294:2: ( rule__Notes__Alternatives_0 )
            // InternalUseCase.g:1294:3: rule__Notes__Alternatives_0
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
    // InternalUseCase.g:1302:1: rule__Notes__Group__1 : rule__Notes__Group__1__Impl ;
    public final void rule__Notes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1306:1: ( rule__Notes__Group__1__Impl )
            // InternalUseCase.g:1307:2: rule__Notes__Group__1__Impl
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
    // InternalUseCase.g:1313:1: rule__Notes__Group__1__Impl : ( ( rule__Notes__ContentAssignment_1 ) ) ;
    public final void rule__Notes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1317:1: ( ( ( rule__Notes__ContentAssignment_1 ) ) )
            // InternalUseCase.g:1318:1: ( ( rule__Notes__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:1318:1: ( ( rule__Notes__ContentAssignment_1 ) )
            // InternalUseCase.g:1319:2: ( rule__Notes__ContentAssignment_1 )
            {
             before(grammarAccess.getNotesAccess().getContentAssignment_1()); 
            // InternalUseCase.g:1320:2: ( rule__Notes__ContentAssignment_1 )
            // InternalUseCase.g:1320:3: rule__Notes__ContentAssignment_1
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
    // InternalUseCase.g:1329:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1333:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalUseCase.g:1334:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
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
    // InternalUseCase.g:1341:1: rule__Inputs__Group__0__Impl : ( ( rule__Inputs__Alternatives_0 ) ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1345:1: ( ( ( rule__Inputs__Alternatives_0 ) ) )
            // InternalUseCase.g:1346:1: ( ( rule__Inputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:1346:1: ( ( rule__Inputs__Alternatives_0 ) )
            // InternalUseCase.g:1347:2: ( rule__Inputs__Alternatives_0 )
            {
             before(grammarAccess.getInputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:1348:2: ( rule__Inputs__Alternatives_0 )
            // InternalUseCase.g:1348:3: rule__Inputs__Alternatives_0
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
    // InternalUseCase.g:1356:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1360:1: ( rule__Inputs__Group__1__Impl )
            // InternalUseCase.g:1361:2: rule__Inputs__Group__1__Impl
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
    // InternalUseCase.g:1367:1: rule__Inputs__Group__1__Impl : ( ( rule__Inputs__InputsAssignment_1 )* ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1371:1: ( ( ( rule__Inputs__InputsAssignment_1 )* ) )
            // InternalUseCase.g:1372:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            {
            // InternalUseCase.g:1372:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            // InternalUseCase.g:1373:2: ( rule__Inputs__InputsAssignment_1 )*
            {
             before(grammarAccess.getInputsAccess().getInputsAssignment_1()); 
            // InternalUseCase.g:1374:2: ( rule__Inputs__InputsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==39||LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUseCase.g:1374:3: rule__Inputs__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Inputs__InputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalUseCase.g:1383:1: rule__Inputs__Group_0_2__0 : rule__Inputs__Group_0_2__0__Impl rule__Inputs__Group_0_2__1 ;
    public final void rule__Inputs__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1387:1: ( rule__Inputs__Group_0_2__0__Impl rule__Inputs__Group_0_2__1 )
            // InternalUseCase.g:1388:2: rule__Inputs__Group_0_2__0__Impl rule__Inputs__Group_0_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:1395:1: rule__Inputs__Group_0_2__0__Impl : ( 'requires' ) ;
    public final void rule__Inputs__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1399:1: ( ( 'requires' ) )
            // InternalUseCase.g:1400:1: ( 'requires' )
            {
            // InternalUseCase.g:1400:1: ( 'requires' )
            // InternalUseCase.g:1401:2: 'requires'
            {
             before(grammarAccess.getInputsAccess().getRequiresKeyword_0_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalUseCase.g:1410:1: rule__Inputs__Group_0_2__1 : rule__Inputs__Group_0_2__1__Impl rule__Inputs__Group_0_2__2 ;
    public final void rule__Inputs__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1414:1: ( rule__Inputs__Group_0_2__1__Impl rule__Inputs__Group_0_2__2 )
            // InternalUseCase.g:1415:2: rule__Inputs__Group_0_2__1__Impl rule__Inputs__Group_0_2__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalUseCase.g:1422:1: rule__Inputs__Group_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Inputs__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1426:1: ( ( 'the' ) )
            // InternalUseCase.g:1427:1: ( 'the' )
            {
            // InternalUseCase.g:1427:1: ( 'the' )
            // InternalUseCase.g:1428:2: 'the'
            {
             before(grammarAccess.getInputsAccess().getTheKeyword_0_2_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUseCase.g:1437:1: rule__Inputs__Group_0_2__2 : rule__Inputs__Group_0_2__2__Impl rule__Inputs__Group_0_2__3 ;
    public final void rule__Inputs__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1441:1: ( rule__Inputs__Group_0_2__2__Impl rule__Inputs__Group_0_2__3 )
            // InternalUseCase.g:1442:2: rule__Inputs__Group_0_2__2__Impl rule__Inputs__Group_0_2__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalUseCase.g:1449:1: rule__Inputs__Group_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Inputs__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1453:1: ( ( 'following' ) )
            // InternalUseCase.g:1454:1: ( 'following' )
            {
            // InternalUseCase.g:1454:1: ( 'following' )
            // InternalUseCase.g:1455:2: 'following'
            {
             before(grammarAccess.getInputsAccess().getFollowingKeyword_0_2_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalUseCase.g:1464:1: rule__Inputs__Group_0_2__3 : rule__Inputs__Group_0_2__3__Impl rule__Inputs__Group_0_2__4 ;
    public final void rule__Inputs__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1468:1: ( rule__Inputs__Group_0_2__3__Impl rule__Inputs__Group_0_2__4 )
            // InternalUseCase.g:1469:2: rule__Inputs__Group_0_2__3__Impl rule__Inputs__Group_0_2__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCase.g:1476:1: rule__Inputs__Group_0_2__3__Impl : ( 'input' ) ;
    public final void rule__Inputs__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1480:1: ( ( 'input' ) )
            // InternalUseCase.g:1481:1: ( 'input' )
            {
            // InternalUseCase.g:1481:1: ( 'input' )
            // InternalUseCase.g:1482:2: 'input'
            {
             before(grammarAccess.getInputsAccess().getInputKeyword_0_2_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalUseCase.g:1491:1: rule__Inputs__Group_0_2__4 : rule__Inputs__Group_0_2__4__Impl ;
    public final void rule__Inputs__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1495:1: ( rule__Inputs__Group_0_2__4__Impl )
            // InternalUseCase.g:1496:2: rule__Inputs__Group_0_2__4__Impl
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
    // InternalUseCase.g:1502:1: rule__Inputs__Group_0_2__4__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1506:1: ( ( ':' ) )
            // InternalUseCase.g:1507:1: ( ':' )
            {
            // InternalUseCase.g:1507:1: ( ':' )
            // InternalUseCase.g:1508:2: ':'
            {
             before(grammarAccess.getInputsAccess().getColonKeyword_0_2_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalUseCase.g:1518:1: rule__Outputs__Group__0 : rule__Outputs__Group__0__Impl rule__Outputs__Group__1 ;
    public final void rule__Outputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1522:1: ( rule__Outputs__Group__0__Impl rule__Outputs__Group__1 )
            // InternalUseCase.g:1523:2: rule__Outputs__Group__0__Impl rule__Outputs__Group__1
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
    // InternalUseCase.g:1530:1: rule__Outputs__Group__0__Impl : ( ( rule__Outputs__Alternatives_0 ) ) ;
    public final void rule__Outputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1534:1: ( ( ( rule__Outputs__Alternatives_0 ) ) )
            // InternalUseCase.g:1535:1: ( ( rule__Outputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:1535:1: ( ( rule__Outputs__Alternatives_0 ) )
            // InternalUseCase.g:1536:2: ( rule__Outputs__Alternatives_0 )
            {
             before(grammarAccess.getOutputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:1537:2: ( rule__Outputs__Alternatives_0 )
            // InternalUseCase.g:1537:3: rule__Outputs__Alternatives_0
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
    // InternalUseCase.g:1545:1: rule__Outputs__Group__1 : rule__Outputs__Group__1__Impl ;
    public final void rule__Outputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1549:1: ( rule__Outputs__Group__1__Impl )
            // InternalUseCase.g:1550:2: rule__Outputs__Group__1__Impl
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
    // InternalUseCase.g:1556:1: rule__Outputs__Group__1__Impl : ( ( rule__Outputs__OutputsAssignment_1 )* ) ;
    public final void rule__Outputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1560:1: ( ( ( rule__Outputs__OutputsAssignment_1 )* ) )
            // InternalUseCase.g:1561:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            {
            // InternalUseCase.g:1561:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            // InternalUseCase.g:1562:2: ( rule__Outputs__OutputsAssignment_1 )*
            {
             before(grammarAccess.getOutputsAccess().getOutputsAssignment_1()); 
            // InternalUseCase.g:1563:2: ( rule__Outputs__OutputsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39||LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUseCase.g:1563:3: rule__Outputs__OutputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Outputs__OutputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalUseCase.g:1572:1: rule__Outputs__Group_0_2__0 : rule__Outputs__Group_0_2__0__Impl rule__Outputs__Group_0_2__1 ;
    public final void rule__Outputs__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1576:1: ( rule__Outputs__Group_0_2__0__Impl rule__Outputs__Group_0_2__1 )
            // InternalUseCase.g:1577:2: rule__Outputs__Group_0_2__0__Impl rule__Outputs__Group_0_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:1584:1: rule__Outputs__Group_0_2__0__Impl : ( 'produces' ) ;
    public final void rule__Outputs__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1588:1: ( ( 'produces' ) )
            // InternalUseCase.g:1589:1: ( 'produces' )
            {
            // InternalUseCase.g:1589:1: ( 'produces' )
            // InternalUseCase.g:1590:2: 'produces'
            {
             before(grammarAccess.getOutputsAccess().getProducesKeyword_0_2_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUseCase.g:1599:1: rule__Outputs__Group_0_2__1 : rule__Outputs__Group_0_2__1__Impl rule__Outputs__Group_0_2__2 ;
    public final void rule__Outputs__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1603:1: ( rule__Outputs__Group_0_2__1__Impl rule__Outputs__Group_0_2__2 )
            // InternalUseCase.g:1604:2: rule__Outputs__Group_0_2__1__Impl rule__Outputs__Group_0_2__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalUseCase.g:1611:1: rule__Outputs__Group_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Outputs__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1615:1: ( ( 'the' ) )
            // InternalUseCase.g:1616:1: ( 'the' )
            {
            // InternalUseCase.g:1616:1: ( 'the' )
            // InternalUseCase.g:1617:2: 'the'
            {
             before(grammarAccess.getOutputsAccess().getTheKeyword_0_2_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUseCase.g:1626:1: rule__Outputs__Group_0_2__2 : rule__Outputs__Group_0_2__2__Impl rule__Outputs__Group_0_2__3 ;
    public final void rule__Outputs__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1630:1: ( rule__Outputs__Group_0_2__2__Impl rule__Outputs__Group_0_2__3 )
            // InternalUseCase.g:1631:2: rule__Outputs__Group_0_2__2__Impl rule__Outputs__Group_0_2__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalUseCase.g:1638:1: rule__Outputs__Group_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Outputs__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1642:1: ( ( 'following' ) )
            // InternalUseCase.g:1643:1: ( 'following' )
            {
            // InternalUseCase.g:1643:1: ( 'following' )
            // InternalUseCase.g:1644:2: 'following'
            {
             before(grammarAccess.getOutputsAccess().getFollowingKeyword_0_2_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalUseCase.g:1653:1: rule__Outputs__Group_0_2__3 : rule__Outputs__Group_0_2__3__Impl rule__Outputs__Group_0_2__4 ;
    public final void rule__Outputs__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1657:1: ( rule__Outputs__Group_0_2__3__Impl rule__Outputs__Group_0_2__4 )
            // InternalUseCase.g:1658:2: rule__Outputs__Group_0_2__3__Impl rule__Outputs__Group_0_2__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCase.g:1665:1: rule__Outputs__Group_0_2__3__Impl : ( 'output' ) ;
    public final void rule__Outputs__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1669:1: ( ( 'output' ) )
            // InternalUseCase.g:1670:1: ( 'output' )
            {
            // InternalUseCase.g:1670:1: ( 'output' )
            // InternalUseCase.g:1671:2: 'output'
            {
             before(grammarAccess.getOutputsAccess().getOutputKeyword_0_2_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalUseCase.g:1680:1: rule__Outputs__Group_0_2__4 : rule__Outputs__Group_0_2__4__Impl ;
    public final void rule__Outputs__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1684:1: ( rule__Outputs__Group_0_2__4__Impl )
            // InternalUseCase.g:1685:2: rule__Outputs__Group_0_2__4__Impl
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
    // InternalUseCase.g:1691:1: rule__Outputs__Group_0_2__4__Impl : ( ':' ) ;
    public final void rule__Outputs__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1695:1: ( ( ':' ) )
            // InternalUseCase.g:1696:1: ( ':' )
            {
            // InternalUseCase.g:1696:1: ( ':' )
            // InternalUseCase.g:1697:2: ':'
            {
             before(grammarAccess.getOutputsAccess().getColonKeyword_0_2_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalUseCase.g:1707:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1711:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalUseCase.g:1712:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCase.g:1719:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1723:1: ( ( 'type' ) )
            // InternalUseCase.g:1724:1: ( 'type' )
            {
            // InternalUseCase.g:1724:1: ( 'type' )
            // InternalUseCase.g:1725:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUseCase.g:1734:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1738:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalUseCase.g:1739:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalUseCase.g:1746:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1750:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalUseCase.g:1751:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalUseCase.g:1751:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalUseCase.g:1752:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalUseCase.g:1753:2: ( rule__Type__NameAssignment_1 )
            // InternalUseCase.g:1753:3: rule__Type__NameAssignment_1
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
    // InternalUseCase.g:1761:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1765:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalUseCase.g:1766:2: rule__Type__Group__2__Impl rule__Type__Group__3
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
    // InternalUseCase.g:1773:1: rule__Type__Group__2__Impl : ( '(' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1777:1: ( ( '(' ) )
            // InternalUseCase.g:1778:1: ( '(' )
            {
            // InternalUseCase.g:1778:1: ( '(' )
            // InternalUseCase.g:1779:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUseCase.g:1788:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1792:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalUseCase.g:1793:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalUseCase.g:1800:1: rule__Type__Group__3__Impl : ( ( rule__Type__DescriptionAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1804:1: ( ( ( rule__Type__DescriptionAssignment_3 ) ) )
            // InternalUseCase.g:1805:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            {
            // InternalUseCase.g:1805:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            // InternalUseCase.g:1806:2: ( rule__Type__DescriptionAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getDescriptionAssignment_3()); 
            // InternalUseCase.g:1807:2: ( rule__Type__DescriptionAssignment_3 )
            // InternalUseCase.g:1807:3: rule__Type__DescriptionAssignment_3
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
    // InternalUseCase.g:1815:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1819:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalUseCase.g:1820:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCase.g:1827:1: rule__Type__Group__4__Impl : ( ')' ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1831:1: ( ( ')' ) )
            // InternalUseCase.g:1832:1: ( ')' )
            {
            // InternalUseCase.g:1832:1: ( ')' )
            // InternalUseCase.g:1833:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUseCase.g:1842:1: rule__Type__Group__5 : rule__Type__Group__5__Impl ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1846:1: ( rule__Type__Group__5__Impl )
            // InternalUseCase.g:1847:2: rule__Type__Group__5__Impl
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
    // InternalUseCase.g:1853:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )? ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1857:1: ( ( ( rule__Type__Group_5__0 )? ) )
            // InternalUseCase.g:1858:1: ( ( rule__Type__Group_5__0 )? )
            {
            // InternalUseCase.g:1858:1: ( ( rule__Type__Group_5__0 )? )
            // InternalUseCase.g:1859:2: ( rule__Type__Group_5__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // InternalUseCase.g:1860:2: ( rule__Type__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCase.g:1860:3: rule__Type__Group_5__0
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
    // InternalUseCase.g:1869:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1873:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalUseCase.g:1874:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCase.g:1881:1: rule__Type__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1885:1: ( ( '[' ) )
            // InternalUseCase.g:1886:1: ( '[' )
            {
            // InternalUseCase.g:1886:1: ( '[' )
            // InternalUseCase.g:1887:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:1896:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1900:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalUseCase.g:1901:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalUseCase.g:1908:1: rule__Type__Group_5__1__Impl : ( ( rule__Type__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1912:1: ( ( ( rule__Type__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:1913:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:1913:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:1914:2: ( rule__Type__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getTypeAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:1915:2: ( rule__Type__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:1915:3: rule__Type__ImportInfoAssignment_5_1
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
    // InternalUseCase.g:1923:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1927:1: ( rule__Type__Group_5__2__Impl )
            // InternalUseCase.g:1928:2: rule__Type__Group_5__2__Impl
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
    // InternalUseCase.g:1934:1: rule__Type__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1938:1: ( ( ']' ) )
            // InternalUseCase.g:1939:1: ( ']' )
            {
            // InternalUseCase.g:1939:1: ( ']' )
            // InternalUseCase.g:1940:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUseCase.g:1950:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1954:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalUseCase.g:1955:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalUseCase.g:1962:1: rule__Input__Group__0__Impl : ( ( rule__Input__ManyAssignment_0 )? ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1966:1: ( ( ( rule__Input__ManyAssignment_0 )? ) )
            // InternalUseCase.g:1967:1: ( ( rule__Input__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:1967:1: ( ( rule__Input__ManyAssignment_0 )? )
            // InternalUseCase.g:1968:2: ( rule__Input__ManyAssignment_0 )?
            {
             before(grammarAccess.getInputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:1969:2: ( rule__Input__ManyAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCase.g:1969:3: rule__Input__ManyAssignment_0
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
    // InternalUseCase.g:1977:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1981:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalUseCase.g:1982:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalUseCase.g:1989:1: rule__Input__Group__1__Impl : ( '-' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1993:1: ( ( '-' ) )
            // InternalUseCase.g:1994:1: ( '-' )
            {
            // InternalUseCase.g:1994:1: ( '-' )
            // InternalUseCase.g:1995:2: '-'
            {
             before(grammarAccess.getInputAccess().getHyphenMinusKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUseCase.g:2004:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2008:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalUseCase.g:2009:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCase.g:2016:1: rule__Input__Group__2__Impl : ( ( rule__Input__ContentAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2020:1: ( ( ( rule__Input__ContentAssignment_2 ) ) )
            // InternalUseCase.g:2021:1: ( ( rule__Input__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:2021:1: ( ( rule__Input__ContentAssignment_2 ) )
            // InternalUseCase.g:2022:2: ( rule__Input__ContentAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:2023:2: ( rule__Input__ContentAssignment_2 )
            // InternalUseCase.g:2023:3: rule__Input__ContentAssignment_2
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
    // InternalUseCase.g:2031:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2035:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalUseCase.g:2036:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCase.g:2043:1: rule__Input__Group__3__Impl : ( ( rule__Input__Group_3__0 )? ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2047:1: ( ( ( rule__Input__Group_3__0 )? ) )
            // InternalUseCase.g:2048:1: ( ( rule__Input__Group_3__0 )? )
            {
            // InternalUseCase.g:2048:1: ( ( rule__Input__Group_3__0 )? )
            // InternalUseCase.g:2049:2: ( rule__Input__Group_3__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_3()); 
            // InternalUseCase.g:2050:2: ( rule__Input__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCase.g:2050:3: rule__Input__Group_3__0
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
    // InternalUseCase.g:2058:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2062:1: ( rule__Input__Group__4__Impl )
            // InternalUseCase.g:2063:2: rule__Input__Group__4__Impl
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
    // InternalUseCase.g:2069:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2073:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalUseCase.g:2074:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalUseCase.g:2074:1: ( ( rule__Input__Group_4__0 )? )
            // InternalUseCase.g:2075:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalUseCase.g:2076:2: ( rule__Input__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCase.g:2076:3: rule__Input__Group_4__0
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
    // InternalUseCase.g:2085:1: rule__Input__Group_3__0 : rule__Input__Group_3__0__Impl rule__Input__Group_3__1 ;
    public final void rule__Input__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2089:1: ( rule__Input__Group_3__0__Impl rule__Input__Group_3__1 )
            // InternalUseCase.g:2090:2: rule__Input__Group_3__0__Impl rule__Input__Group_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCase.g:2097:1: rule__Input__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Input__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2101:1: ( ( 'as' ) )
            // InternalUseCase.g:2102:1: ( 'as' )
            {
            // InternalUseCase.g:2102:1: ( 'as' )
            // InternalUseCase.g:2103:2: 'as'
            {
             before(grammarAccess.getInputAccess().getAsKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUseCase.g:2112:1: rule__Input__Group_3__1 : rule__Input__Group_3__1__Impl ;
    public final void rule__Input__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2116:1: ( rule__Input__Group_3__1__Impl )
            // InternalUseCase.g:2117:2: rule__Input__Group_3__1__Impl
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
    // InternalUseCase.g:2123:1: rule__Input__Group_3__1__Impl : ( ( rule__Input__TypeAssignment_3_1 ) ) ;
    public final void rule__Input__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2127:1: ( ( ( rule__Input__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:2128:1: ( ( rule__Input__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:2128:1: ( ( rule__Input__TypeAssignment_3_1 ) )
            // InternalUseCase.g:2129:2: ( rule__Input__TypeAssignment_3_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:2130:2: ( rule__Input__TypeAssignment_3_1 )
            // InternalUseCase.g:2130:3: rule__Input__TypeAssignment_3_1
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
    // InternalUseCase.g:2139:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2143:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalUseCase.g:2144:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalUseCase.g:2151:1: rule__Input__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2155:1: ( ( '(' ) )
            // InternalUseCase.g:2156:1: ( '(' )
            {
            // InternalUseCase.g:2156:1: ( '(' )
            // InternalUseCase.g:2157:2: '('
            {
             before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUseCase.g:2166:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl rule__Input__Group_4__2 ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2170:1: ( rule__Input__Group_4__1__Impl rule__Input__Group_4__2 )
            // InternalUseCase.g:2171:2: rule__Input__Group_4__1__Impl rule__Input__Group_4__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:2178:1: rule__Input__Group_4__1__Impl : ( 'e.g' ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2182:1: ( ( 'e.g' ) )
            // InternalUseCase.g:2183:1: ( 'e.g' )
            {
            // InternalUseCase.g:2183:1: ( 'e.g' )
            // InternalUseCase.g:2184:2: 'e.g'
            {
             before(grammarAccess.getInputAccess().getEGKeyword_4_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUseCase.g:2193:1: rule__Input__Group_4__2 : rule__Input__Group_4__2__Impl rule__Input__Group_4__3 ;
    public final void rule__Input__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2197:1: ( rule__Input__Group_4__2__Impl rule__Input__Group_4__3 )
            // InternalUseCase.g:2198:2: rule__Input__Group_4__2__Impl rule__Input__Group_4__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalUseCase.g:2205:1: rule__Input__Group_4__2__Impl : ( ( rule__Input__ExampleAssignment_4_2 ) ) ;
    public final void rule__Input__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2209:1: ( ( ( rule__Input__ExampleAssignment_4_2 ) ) )
            // InternalUseCase.g:2210:1: ( ( rule__Input__ExampleAssignment_4_2 ) )
            {
            // InternalUseCase.g:2210:1: ( ( rule__Input__ExampleAssignment_4_2 ) )
            // InternalUseCase.g:2211:2: ( rule__Input__ExampleAssignment_4_2 )
            {
             before(grammarAccess.getInputAccess().getExampleAssignment_4_2()); 
            // InternalUseCase.g:2212:2: ( rule__Input__ExampleAssignment_4_2 )
            // InternalUseCase.g:2212:3: rule__Input__ExampleAssignment_4_2
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
    // InternalUseCase.g:2220:1: rule__Input__Group_4__3 : rule__Input__Group_4__3__Impl ;
    public final void rule__Input__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2224:1: ( rule__Input__Group_4__3__Impl )
            // InternalUseCase.g:2225:2: rule__Input__Group_4__3__Impl
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
    // InternalUseCase.g:2231:1: rule__Input__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Input__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2235:1: ( ( ')' ) )
            // InternalUseCase.g:2236:1: ( ')' )
            {
            // InternalUseCase.g:2236:1: ( ')' )
            // InternalUseCase.g:2237:2: ')'
            {
             before(grammarAccess.getInputAccess().getRightParenthesisKeyword_4_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUseCase.g:2247:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2251:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalUseCase.g:2252:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalUseCase.g:2259:1: rule__Output__Group__0__Impl : ( ( rule__Output__ManyAssignment_0 )? ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2263:1: ( ( ( rule__Output__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2264:1: ( ( rule__Output__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2264:1: ( ( rule__Output__ManyAssignment_0 )? )
            // InternalUseCase.g:2265:2: ( rule__Output__ManyAssignment_0 )?
            {
             before(grammarAccess.getOutputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2266:2: ( rule__Output__ManyAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:2266:3: rule__Output__ManyAssignment_0
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
    // InternalUseCase.g:2274:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2278:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalUseCase.g:2279:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalUseCase.g:2286:1: rule__Output__Group__1__Impl : ( '-' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2290:1: ( ( '-' ) )
            // InternalUseCase.g:2291:1: ( '-' )
            {
            // InternalUseCase.g:2291:1: ( '-' )
            // InternalUseCase.g:2292:2: '-'
            {
             before(grammarAccess.getOutputAccess().getHyphenMinusKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUseCase.g:2301:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2305:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalUseCase.g:2306:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCase.g:2313:1: rule__Output__Group__2__Impl : ( ( rule__Output__ContentAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2317:1: ( ( ( rule__Output__ContentAssignment_2 ) ) )
            // InternalUseCase.g:2318:1: ( ( rule__Output__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:2318:1: ( ( rule__Output__ContentAssignment_2 ) )
            // InternalUseCase.g:2319:2: ( rule__Output__ContentAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:2320:2: ( rule__Output__ContentAssignment_2 )
            // InternalUseCase.g:2320:3: rule__Output__ContentAssignment_2
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
    // InternalUseCase.g:2328:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2332:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalUseCase.g:2333:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCase.g:2340:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2344:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalUseCase.g:2345:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalUseCase.g:2345:1: ( ( rule__Output__Group_3__0 )? )
            // InternalUseCase.g:2346:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalUseCase.g:2347:2: ( rule__Output__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:2347:3: rule__Output__Group_3__0
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
    // InternalUseCase.g:2355:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2359:1: ( rule__Output__Group__4__Impl )
            // InternalUseCase.g:2360:2: rule__Output__Group__4__Impl
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
    // InternalUseCase.g:2366:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2370:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalUseCase.g:2371:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalUseCase.g:2371:1: ( ( rule__Output__Group_4__0 )? )
            // InternalUseCase.g:2372:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalUseCase.g:2373:2: ( rule__Output__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:2373:3: rule__Output__Group_4__0
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
    // InternalUseCase.g:2382:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2386:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalUseCase.g:2387:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCase.g:2394:1: rule__Output__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2398:1: ( ( 'as' ) )
            // InternalUseCase.g:2399:1: ( 'as' )
            {
            // InternalUseCase.g:2399:1: ( 'as' )
            // InternalUseCase.g:2400:2: 'as'
            {
             before(grammarAccess.getOutputAccess().getAsKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUseCase.g:2409:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2413:1: ( rule__Output__Group_3__1__Impl )
            // InternalUseCase.g:2414:2: rule__Output__Group_3__1__Impl
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
    // InternalUseCase.g:2420:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2424:1: ( ( ( rule__Output__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:2425:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:2425:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            // InternalUseCase.g:2426:2: ( rule__Output__TypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:2427:2: ( rule__Output__TypeAssignment_3_1 )
            // InternalUseCase.g:2427:3: rule__Output__TypeAssignment_3_1
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
    // InternalUseCase.g:2436:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2440:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalUseCase.g:2441:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalUseCase.g:2448:1: rule__Output__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2452:1: ( ( '(' ) )
            // InternalUseCase.g:2453:1: ( '(' )
            {
            // InternalUseCase.g:2453:1: ( '(' )
            // InternalUseCase.g:2454:2: '('
            {
             before(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUseCase.g:2463:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl rule__Output__Group_4__2 ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2467:1: ( rule__Output__Group_4__1__Impl rule__Output__Group_4__2 )
            // InternalUseCase.g:2468:2: rule__Output__Group_4__1__Impl rule__Output__Group_4__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCase.g:2475:1: rule__Output__Group_4__1__Impl : ( 'e.g' ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2479:1: ( ( 'e.g' ) )
            // InternalUseCase.g:2480:1: ( 'e.g' )
            {
            // InternalUseCase.g:2480:1: ( 'e.g' )
            // InternalUseCase.g:2481:2: 'e.g'
            {
             before(grammarAccess.getOutputAccess().getEGKeyword_4_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUseCase.g:2490:1: rule__Output__Group_4__2 : rule__Output__Group_4__2__Impl rule__Output__Group_4__3 ;
    public final void rule__Output__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2494:1: ( rule__Output__Group_4__2__Impl rule__Output__Group_4__3 )
            // InternalUseCase.g:2495:2: rule__Output__Group_4__2__Impl rule__Output__Group_4__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalUseCase.g:2502:1: rule__Output__Group_4__2__Impl : ( ( rule__Output__ExampleAssignment_4_2 ) ) ;
    public final void rule__Output__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2506:1: ( ( ( rule__Output__ExampleAssignment_4_2 ) ) )
            // InternalUseCase.g:2507:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            {
            // InternalUseCase.g:2507:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            // InternalUseCase.g:2508:2: ( rule__Output__ExampleAssignment_4_2 )
            {
             before(grammarAccess.getOutputAccess().getExampleAssignment_4_2()); 
            // InternalUseCase.g:2509:2: ( rule__Output__ExampleAssignment_4_2 )
            // InternalUseCase.g:2509:3: rule__Output__ExampleAssignment_4_2
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
    // InternalUseCase.g:2517:1: rule__Output__Group_4__3 : rule__Output__Group_4__3__Impl ;
    public final void rule__Output__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2521:1: ( rule__Output__Group_4__3__Impl )
            // InternalUseCase.g:2522:2: rule__Output__Group_4__3__Impl
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
    // InternalUseCase.g:2528:1: rule__Output__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Output__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2532:1: ( ( ')' ) )
            // InternalUseCase.g:2533:1: ( ')' )
            {
            // InternalUseCase.g:2533:1: ( ')' )
            // InternalUseCase.g:2534:2: ')'
            {
             before(grammarAccess.getOutputAccess().getRightParenthesisKeyword_4_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUseCase.g:2544:1: rule__AllowedUserGroups__Group__0 : rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 ;
    public final void rule__AllowedUserGroups__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2548:1: ( rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 )
            // InternalUseCase.g:2549:2: rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1
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
    // InternalUseCase.g:2556:1: rule__AllowedUserGroups__Group__0__Impl : ( 'allowed-usergroups:' ) ;
    public final void rule__AllowedUserGroups__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2560:1: ( ( 'allowed-usergroups:' ) )
            // InternalUseCase.g:2561:1: ( 'allowed-usergroups:' )
            {
            // InternalUseCase.g:2561:1: ( 'allowed-usergroups:' )
            // InternalUseCase.g:2562:2: 'allowed-usergroups:'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUseCase.g:2571:1: rule__AllowedUserGroups__Group__1 : rule__AllowedUserGroups__Group__1__Impl ;
    public final void rule__AllowedUserGroups__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2575:1: ( rule__AllowedUserGroups__Group__1__Impl )
            // InternalUseCase.g:2576:2: rule__AllowedUserGroups__Group__1__Impl
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
    // InternalUseCase.g:2582:1: rule__AllowedUserGroups__Group__1__Impl : ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) ;
    public final void rule__AllowedUserGroups__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2586:1: ( ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) )
            // InternalUseCase.g:2587:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            {
            // InternalUseCase.g:2587:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            // InternalUseCase.g:2588:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroupsAssignment_1()); 
            // InternalUseCase.g:2589:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39||LA24_0==43) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUseCase.g:2589:3: rule__AllowedUserGroups__GroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AllowedUserGroups__GroupsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalUseCase.g:2598:1: rule__AllowedUserGroup__Group__0 : rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 ;
    public final void rule__AllowedUserGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2602:1: ( rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 )
            // InternalUseCase.g:2603:2: rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1
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
    // InternalUseCase.g:2610:1: rule__AllowedUserGroup__Group__0__Impl : ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) ;
    public final void rule__AllowedUserGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2614:1: ( ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2615:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2615:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            // InternalUseCase.g:2616:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2617:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCase.g:2617:3: rule__AllowedUserGroup__ManyAssignment_0
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
    // InternalUseCase.g:2625:1: rule__AllowedUserGroup__Group__1 : rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 ;
    public final void rule__AllowedUserGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2629:1: ( rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 )
            // InternalUseCase.g:2630:2: rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2
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
    // InternalUseCase.g:2637:1: rule__AllowedUserGroup__Group__1__Impl : ( '-' ) ;
    public final void rule__AllowedUserGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2641:1: ( ( '-' ) )
            // InternalUseCase.g:2642:1: ( '-' )
            {
            // InternalUseCase.g:2642:1: ( '-' )
            // InternalUseCase.g:2643:2: '-'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUseCase.g:2652:1: rule__AllowedUserGroup__Group__2 : rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 ;
    public final void rule__AllowedUserGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2656:1: ( rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 )
            // InternalUseCase.g:2657:2: rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalUseCase.g:2664:1: rule__AllowedUserGroup__Group__2__Impl : ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) ;
    public final void rule__AllowedUserGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2668:1: ( ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) )
            // InternalUseCase.g:2669:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            {
            // InternalUseCase.g:2669:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            // InternalUseCase.g:2670:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getNameAssignment_2()); 
            // InternalUseCase.g:2671:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            // InternalUseCase.g:2671:3: rule__AllowedUserGroup__NameAssignment_2
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
    // InternalUseCase.g:2679:1: rule__AllowedUserGroup__Group__3 : rule__AllowedUserGroup__Group__3__Impl ;
    public final void rule__AllowedUserGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2683:1: ( rule__AllowedUserGroup__Group__3__Impl )
            // InternalUseCase.g:2684:2: rule__AllowedUserGroup__Group__3__Impl
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
    // InternalUseCase.g:2690:1: rule__AllowedUserGroup__Group__3__Impl : ( ( rule__AllowedUserGroup__Group_3__0 )? ) ;
    public final void rule__AllowedUserGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2694:1: ( ( ( rule__AllowedUserGroup__Group_3__0 )? ) )
            // InternalUseCase.g:2695:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            {
            // InternalUseCase.g:2695:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            // InternalUseCase.g:2696:2: ( rule__AllowedUserGroup__Group_3__0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup_3()); 
            // InternalUseCase.g:2697:2: ( rule__AllowedUserGroup__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCase.g:2697:3: rule__AllowedUserGroup__Group_3__0
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
    // InternalUseCase.g:2706:1: rule__AllowedUserGroup__Group_3__0 : rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 ;
    public final void rule__AllowedUserGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2710:1: ( rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 )
            // InternalUseCase.g:2711:2: rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCase.g:2718:1: rule__AllowedUserGroup__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__AllowedUserGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2722:1: ( ( 'as' ) )
            // InternalUseCase.g:2723:1: ( 'as' )
            {
            // InternalUseCase.g:2723:1: ( 'as' )
            // InternalUseCase.g:2724:2: 'as'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUseCase.g:2733:1: rule__AllowedUserGroup__Group_3__1 : rule__AllowedUserGroup__Group_3__1__Impl ;
    public final void rule__AllowedUserGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2737:1: ( rule__AllowedUserGroup__Group_3__1__Impl )
            // InternalUseCase.g:2738:2: rule__AllowedUserGroup__Group_3__1__Impl
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
    // InternalUseCase.g:2744:1: rule__AllowedUserGroup__Group_3__1__Impl : ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) ;
    public final void rule__AllowedUserGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2748:1: ( ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:2749:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:2749:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            // InternalUseCase.g:2750:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:2751:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            // InternalUseCase.g:2751:3: rule__AllowedUserGroup__TypeAssignment_3_1
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
    // InternalUseCase.g:2760:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2764:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUseCase.g:2765:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:2772:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2776:1: ( ( RULE_ID ) )
            // InternalUseCase.g:2777:1: ( RULE_ID )
            {
            // InternalUseCase.g:2777:1: ( RULE_ID )
            // InternalUseCase.g:2778:2: RULE_ID
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
    // InternalUseCase.g:2787:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2791:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUseCase.g:2792:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUseCase.g:2798:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2802:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUseCase.g:2803:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUseCase.g:2803:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUseCase.g:2804:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUseCase.g:2805:2: ( rule__QualifiedName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUseCase.g:2805:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalUseCase.g:2814:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2818:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUseCase.g:2819:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCase.g:2826:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2830:1: ( ( '.' ) )
            // InternalUseCase.g:2831:1: ( '.' )
            {
            // InternalUseCase.g:2831:1: ( '.' )
            // InternalUseCase.g:2832:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUseCase.g:2841:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2845:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUseCase.g:2846:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUseCase.g:2852:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2856:1: ( ( RULE_ID ) )
            // InternalUseCase.g:2857:1: ( RULE_ID )
            {
            // InternalUseCase.g:2857:1: ( RULE_ID )
            // InternalUseCase.g:2858:2: RULE_ID
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
    // InternalUseCase.g:2868:1: rule__QualifiedNumber__Group__0 : rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 ;
    public final void rule__QualifiedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2872:1: ( rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 )
            // InternalUseCase.g:2873:2: rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:2880:1: rule__QualifiedNumber__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2884:1: ( ( RULE_INT ) )
            // InternalUseCase.g:2885:1: ( RULE_INT )
            {
            // InternalUseCase.g:2885:1: ( RULE_INT )
            // InternalUseCase.g:2886:2: RULE_INT
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
    // InternalUseCase.g:2895:1: rule__QualifiedNumber__Group__1 : rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 ;
    public final void rule__QualifiedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2899:1: ( rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 )
            // InternalUseCase.g:2900:2: rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:2907:1: rule__QualifiedNumber__Group__1__Impl : ( ( rule__QualifiedNumber__Group_1__0 )* ) ;
    public final void rule__QualifiedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2911:1: ( ( ( rule__QualifiedNumber__Group_1__0 )* ) )
            // InternalUseCase.g:2912:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            {
            // InternalUseCase.g:2912:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            // InternalUseCase.g:2913:2: ( rule__QualifiedNumber__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup_1()); 
            // InternalUseCase.g:2914:2: ( rule__QualifiedNumber__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_INT) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalUseCase.g:2914:3: rule__QualifiedNumber__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__QualifiedNumber__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalUseCase.g:2922:1: rule__QualifiedNumber__Group__2 : rule__QualifiedNumber__Group__2__Impl ;
    public final void rule__QualifiedNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2926:1: ( rule__QualifiedNumber__Group__2__Impl )
            // InternalUseCase.g:2927:2: rule__QualifiedNumber__Group__2__Impl
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
    // InternalUseCase.g:2933:1: rule__QualifiedNumber__Group__2__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2937:1: ( ( '.' ) )
            // InternalUseCase.g:2938:1: ( '.' )
            {
            // InternalUseCase.g:2938:1: ( '.' )
            // InternalUseCase.g:2939:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUseCase.g:2949:1: rule__QualifiedNumber__Group_1__0 : rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 ;
    public final void rule__QualifiedNumber__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2953:1: ( rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 )
            // InternalUseCase.g:2954:2: rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCase.g:2961:1: rule__QualifiedNumber__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2965:1: ( ( '.' ) )
            // InternalUseCase.g:2966:1: ( '.' )
            {
            // InternalUseCase.g:2966:1: ( '.' )
            // InternalUseCase.g:2967:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUseCase.g:2976:1: rule__QualifiedNumber__Group_1__1 : rule__QualifiedNumber__Group_1__1__Impl ;
    public final void rule__QualifiedNumber__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2980:1: ( rule__QualifiedNumber__Group_1__1__Impl )
            // InternalUseCase.g:2981:2: rule__QualifiedNumber__Group_1__1__Impl
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
    // InternalUseCase.g:2987:1: rule__QualifiedNumber__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2991:1: ( ( RULE_INT ) )
            // InternalUseCase.g:2992:1: ( RULE_INT )
            {
            // InternalUseCase.g:2992:1: ( RULE_INT )
            // InternalUseCase.g:2993:2: RULE_INT
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


    // $ANTLR start "rule__Model__TypesAssignment_0"
    // InternalUseCase.g:3003:1: rule__Model__TypesAssignment_0 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3007:1: ( ( ruleType ) )
            // InternalUseCase.g:3008:2: ( ruleType )
            {
            // InternalUseCase.g:3008:2: ( ruleType )
            // InternalUseCase.g:3009:3: ruleType
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
    // InternalUseCase.g:3018:1: rule__Model__UseCasesAssignment_1 : ( ruleUseCase ) ;
    public final void rule__Model__UseCasesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3022:1: ( ( ruleUseCase ) )
            // InternalUseCase.g:3023:2: ( ruleUseCase )
            {
            // InternalUseCase.g:3023:2: ( ruleUseCase )
            // InternalUseCase.g:3024:3: ruleUseCase
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
    // InternalUseCase.g:3033:1: rule__UseCase__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3037:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3038:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3038:2: ( RULE_STRING )
            // InternalUseCase.g:3039:3: RULE_STRING
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
    // InternalUseCase.g:3048:1: rule__UseCase__DescriptionsAssignment_2 : ( ruleDescription ) ;
    public final void rule__UseCase__DescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3052:1: ( ( ruleDescription ) )
            // InternalUseCase.g:3053:2: ( ruleDescription )
            {
            // InternalUseCase.g:3053:2: ( ruleDescription )
            // InternalUseCase.g:3054:3: ruleDescription
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
    // InternalUseCase.g:3063:1: rule__UseCase__AllowedUserGroupsAssignment_3 : ( ruleAllowedUserGroups ) ;
    public final void rule__UseCase__AllowedUserGroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3067:1: ( ( ruleAllowedUserGroups ) )
            // InternalUseCase.g:3068:2: ( ruleAllowedUserGroups )
            {
            // InternalUseCase.g:3068:2: ( ruleAllowedUserGroups )
            // InternalUseCase.g:3069:3: ruleAllowedUserGroups
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
    // InternalUseCase.g:3078:1: rule__UseCase__InputsAssignment_4 : ( ruleInputs ) ;
    public final void rule__UseCase__InputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3082:1: ( ( ruleInputs ) )
            // InternalUseCase.g:3083:2: ( ruleInputs )
            {
            // InternalUseCase.g:3083:2: ( ruleInputs )
            // InternalUseCase.g:3084:3: ruleInputs
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
    // InternalUseCase.g:3093:1: rule__UseCase__OutputsAssignment_5 : ( ruleOutputs ) ;
    public final void rule__UseCase__OutputsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3097:1: ( ( ruleOutputs ) )
            // InternalUseCase.g:3098:2: ( ruleOutputs )
            {
            // InternalUseCase.g:3098:2: ( ruleOutputs )
            // InternalUseCase.g:3099:3: ruleOutputs
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


    // $ANTLR start "rule__UseCase__StepsAssignment_6"
    // InternalUseCase.g:3108:1: rule__UseCase__StepsAssignment_6 : ( ruleSteps ) ;
    public final void rule__UseCase__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3112:1: ( ( ruleSteps ) )
            // InternalUseCase.g:3113:2: ( ruleSteps )
            {
            // InternalUseCase.g:3113:2: ( ruleSteps )
            // InternalUseCase.g:3114:3: ruleSteps
            {
             before(grammarAccess.getUseCaseAccess().getStepsStepsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSteps();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getStepsStepsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__StepsAssignment_6"


    // $ANTLR start "rule__UseCase__NotesAssignment_7"
    // InternalUseCase.g:3123:1: rule__UseCase__NotesAssignment_7 : ( ruleNotes ) ;
    public final void rule__UseCase__NotesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3127:1: ( ( ruleNotes ) )
            // InternalUseCase.g:3128:2: ( ruleNotes )
            {
            // InternalUseCase.g:3128:2: ( ruleNotes )
            // InternalUseCase.g:3129:3: ruleNotes
            {
             before(grammarAccess.getUseCaseAccess().getNotesNotesParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleNotes();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getNotesNotesParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__NotesAssignment_7"


    // $ANTLR start "rule__Steps__StepsAssignment_1"
    // InternalUseCase.g:3138:1: rule__Steps__StepsAssignment_1 : ( ruleStep ) ;
    public final void rule__Steps__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3142:1: ( ( ruleStep ) )
            // InternalUseCase.g:3143:2: ( ruleStep )
            {
            // InternalUseCase.g:3143:2: ( ruleStep )
            // InternalUseCase.g:3144:3: ruleStep
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
    // InternalUseCase.g:3153:1: rule__Step__NumberAssignment_0 : ( ruleQualifiedNumber ) ;
    public final void rule__Step__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3157:1: ( ( ruleQualifiedNumber ) )
            // InternalUseCase.g:3158:2: ( ruleQualifiedNumber )
            {
            // InternalUseCase.g:3158:2: ( ruleQualifiedNumber )
            // InternalUseCase.g:3159:3: ruleQualifiedNumber
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
    // InternalUseCase.g:3168:1: rule__Step__ActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Step__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3172:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3173:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3173:2: ( RULE_STRING )
            // InternalUseCase.g:3174:3: RULE_STRING
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
    // InternalUseCase.g:3183:1: rule__Step__ErrorAssignment_2 : ( ruleRaiseError ) ;
    public final void rule__Step__ErrorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3187:1: ( ( ruleRaiseError ) )
            // InternalUseCase.g:3188:2: ( ruleRaiseError )
            {
            // InternalUseCase.g:3188:2: ( ruleRaiseError )
            // InternalUseCase.g:3189:3: ruleRaiseError
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
    // InternalUseCase.g:3198:1: rule__RaiseError__ExceptionAssignment_2 : ( ruleException ) ;
    public final void rule__RaiseError__ExceptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3202:1: ( ( ruleException ) )
            // InternalUseCase.g:3203:2: ( ruleException )
            {
            // InternalUseCase.g:3203:2: ( ruleException )
            // InternalUseCase.g:3204:3: ruleException
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


    // $ANTLR start "rule__Exception__NameAssignment"
    // InternalUseCase.g:3213:1: rule__Exception__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Exception__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3217:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3218:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3218:2: ( RULE_STRING )
            // InternalUseCase.g:3219:3: RULE_STRING
            {
             before(grammarAccess.getExceptionAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExceptionAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exception__NameAssignment"


    // $ANTLR start "rule__Description__NameAssignment_1"
    // InternalUseCase.g:3228:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3232:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3233:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3233:2: ( RULE_STRING )
            // InternalUseCase.g:3234:3: RULE_STRING
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
    // InternalUseCase.g:3243:1: rule__Notes__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notes__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3247:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3248:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3248:2: ( RULE_STRING )
            // InternalUseCase.g:3249:3: RULE_STRING
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
    // InternalUseCase.g:3258:1: rule__Inputs__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Inputs__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3262:1: ( ( ruleInput ) )
            // InternalUseCase.g:3263:2: ( ruleInput )
            {
            // InternalUseCase.g:3263:2: ( ruleInput )
            // InternalUseCase.g:3264:3: ruleInput
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
    // InternalUseCase.g:3273:1: rule__Outputs__OutputsAssignment_1 : ( ruleOutput ) ;
    public final void rule__Outputs__OutputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3277:1: ( ( ruleOutput ) )
            // InternalUseCase.g:3278:2: ( ruleOutput )
            {
            // InternalUseCase.g:3278:2: ( ruleOutput )
            // InternalUseCase.g:3279:3: ruleOutput
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
    // InternalUseCase.g:3288:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3292:1: ( ( RULE_ID ) )
            // InternalUseCase.g:3293:2: ( RULE_ID )
            {
            // InternalUseCase.g:3293:2: ( RULE_ID )
            // InternalUseCase.g:3294:3: RULE_ID
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
    // InternalUseCase.g:3303:1: rule__Type__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Type__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3307:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3308:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3308:2: ( RULE_STRING )
            // InternalUseCase.g:3309:3: RULE_STRING
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
    // InternalUseCase.g:3318:1: rule__Type__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__Type__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3322:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:3323:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:3323:2: ( ruleQualifiedName )
            // InternalUseCase.g:3324:3: ruleQualifiedName
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
    // InternalUseCase.g:3333:1: rule__Input__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Input__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3337:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:3338:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:3338:2: ( ( 'many' ) )
            // InternalUseCase.g:3339:3: ( 'many' )
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:3340:3: ( 'many' )
            // InternalUseCase.g:3341:4: 'many'
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUseCase.g:3352:1: rule__Input__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Input__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3356:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3357:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3357:2: ( RULE_STRING )
            // InternalUseCase.g:3358:3: RULE_STRING
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
    // InternalUseCase.g:3367:1: rule__Input__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Input__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3371:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:3372:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:3372:2: ( ( RULE_ID ) )
            // InternalUseCase.g:3373:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:3374:3: ( RULE_ID )
            // InternalUseCase.g:3375:4: RULE_ID
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
    // InternalUseCase.g:3386:1: rule__Input__ExampleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Input__ExampleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3390:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3391:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3391:2: ( RULE_STRING )
            // InternalUseCase.g:3392:3: RULE_STRING
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
    // InternalUseCase.g:3401:1: rule__Output__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Output__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3405:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:3406:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:3406:2: ( ( 'many' ) )
            // InternalUseCase.g:3407:3: ( 'many' )
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:3408:3: ( 'many' )
            // InternalUseCase.g:3409:4: 'many'
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUseCase.g:3420:1: rule__Output__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3424:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3425:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3425:2: ( RULE_STRING )
            // InternalUseCase.g:3426:3: RULE_STRING
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
    // InternalUseCase.g:3435:1: rule__Output__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Output__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3439:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:3440:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:3440:2: ( ( RULE_ID ) )
            // InternalUseCase.g:3441:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:3442:3: ( RULE_ID )
            // InternalUseCase.g:3443:4: RULE_ID
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
    // InternalUseCase.g:3454:1: rule__Output__ExampleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Output__ExampleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3458:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3459:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3459:2: ( RULE_STRING )
            // InternalUseCase.g:3460:3: RULE_STRING
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
    // InternalUseCase.g:3469:1: rule__AllowedUserGroups__GroupsAssignment_1 : ( ruleAllowedUserGroup ) ;
    public final void rule__AllowedUserGroups__GroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3473:1: ( ( ruleAllowedUserGroup ) )
            // InternalUseCase.g:3474:2: ( ruleAllowedUserGroup )
            {
            // InternalUseCase.g:3474:2: ( ruleAllowedUserGroup )
            // InternalUseCase.g:3475:3: ruleAllowedUserGroup
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
    // InternalUseCase.g:3484:1: rule__AllowedUserGroup__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__AllowedUserGroup__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3488:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:3489:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:3489:2: ( ( 'many' ) )
            // InternalUseCase.g:3490:3: ( 'many' )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:3491:3: ( 'many' )
            // InternalUseCase.g:3492:4: 'many'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUseCase.g:3503:1: rule__AllowedUserGroup__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllowedUserGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3507:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3508:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3508:2: ( RULE_STRING )
            // InternalUseCase.g:3509:3: RULE_STRING
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
    // InternalUseCase.g:3518:1: rule__AllowedUserGroup__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllowedUserGroup__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3522:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:3523:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:3523:2: ( ( RULE_ID ) )
            // InternalUseCase.g:3524:3: ( RULE_ID )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:3525:3: ( RULE_ID )
            // InternalUseCase.g:3526:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000004010C2BF000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000088000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000400002L});

}