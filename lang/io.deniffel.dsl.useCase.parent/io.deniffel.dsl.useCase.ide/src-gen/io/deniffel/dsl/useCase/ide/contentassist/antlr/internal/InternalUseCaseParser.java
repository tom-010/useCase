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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Raise'", "'notes:'", "'note:'", "'requires:'", "'require:'", "'produces:'", "'produce:'", "'use-case'", "'end'", "'of'", "'steps:'", "'used'", "'types:'", "'errors:'", "'.'", "'On'", "'error'", "'raise'", "'description:'", "'requires'", "'the'", "'following'", "'input'", "':'", "'produces'", "'output'", "'-'", "'('", "')'", "'['", "']'", "'as'", "'e.g'", "'allowed-usergroups:'", "'many'"
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


    // $ANTLR start "entryRuleUsedTypes"
    // InternalUseCase.g:128:1: entryRuleUsedTypes : ruleUsedTypes EOF ;
    public final void entryRuleUsedTypes() throws RecognitionException {
        try {
            // InternalUseCase.g:129:1: ( ruleUsedTypes EOF )
            // InternalUseCase.g:130:1: ruleUsedTypes EOF
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
    // InternalUseCase.g:137:1: ruleUsedTypes : ( ( rule__UsedTypes__Group__0 ) ) ;
    public final void ruleUsedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:141:2: ( ( ( rule__UsedTypes__Group__0 ) ) )
            // InternalUseCase.g:142:2: ( ( rule__UsedTypes__Group__0 ) )
            {
            // InternalUseCase.g:142:2: ( ( rule__UsedTypes__Group__0 ) )
            // InternalUseCase.g:143:3: ( rule__UsedTypes__Group__0 )
            {
             before(grammarAccess.getUsedTypesAccess().getGroup()); 
            // InternalUseCase.g:144:3: ( rule__UsedTypes__Group__0 )
            // InternalUseCase.g:144:4: rule__UsedTypes__Group__0
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
    // InternalUseCase.g:153:1: entryRuleUsedExceptions : ruleUsedExceptions EOF ;
    public final void entryRuleUsedExceptions() throws RecognitionException {
        try {
            // InternalUseCase.g:154:1: ( ruleUsedExceptions EOF )
            // InternalUseCase.g:155:1: ruleUsedExceptions EOF
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
    // InternalUseCase.g:162:1: ruleUsedExceptions : ( ( rule__UsedExceptions__Group__0 ) ) ;
    public final void ruleUsedExceptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:166:2: ( ( ( rule__UsedExceptions__Group__0 ) ) )
            // InternalUseCase.g:167:2: ( ( rule__UsedExceptions__Group__0 ) )
            {
            // InternalUseCase.g:167:2: ( ( rule__UsedExceptions__Group__0 ) )
            // InternalUseCase.g:168:3: ( rule__UsedExceptions__Group__0 )
            {
             before(grammarAccess.getUsedExceptionsAccess().getGroup()); 
            // InternalUseCase.g:169:3: ( rule__UsedExceptions__Group__0 )
            // InternalUseCase.g:169:4: rule__UsedExceptions__Group__0
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
    // InternalUseCase.g:178:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalUseCase.g:179:1: ( ruleStep EOF )
            // InternalUseCase.g:180:1: ruleStep EOF
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
    // InternalUseCase.g:187:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:191:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalUseCase.g:192:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalUseCase.g:192:2: ( ( rule__Step__Group__0 ) )
            // InternalUseCase.g:193:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalUseCase.g:194:3: ( rule__Step__Group__0 )
            // InternalUseCase.g:194:4: rule__Step__Group__0
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
    // InternalUseCase.g:203:1: entryRuleRaiseError : ruleRaiseError EOF ;
    public final void entryRuleRaiseError() throws RecognitionException {
        try {
            // InternalUseCase.g:204:1: ( ruleRaiseError EOF )
            // InternalUseCase.g:205:1: ruleRaiseError EOF
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
    // InternalUseCase.g:212:1: ruleRaiseError : ( ( rule__RaiseError__Group__0 ) ) ;
    public final void ruleRaiseError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:216:2: ( ( ( rule__RaiseError__Group__0 ) ) )
            // InternalUseCase.g:217:2: ( ( rule__RaiseError__Group__0 ) )
            {
            // InternalUseCase.g:217:2: ( ( rule__RaiseError__Group__0 ) )
            // InternalUseCase.g:218:3: ( rule__RaiseError__Group__0 )
            {
             before(grammarAccess.getRaiseErrorAccess().getGroup()); 
            // InternalUseCase.g:219:3: ( rule__RaiseError__Group__0 )
            // InternalUseCase.g:219:4: rule__RaiseError__Group__0
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
    // InternalUseCase.g:228:1: entryRuleException : ruleException EOF ;
    public final void entryRuleException() throws RecognitionException {
        try {
            // InternalUseCase.g:229:1: ( ruleException EOF )
            // InternalUseCase.g:230:1: ruleException EOF
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
    // InternalUseCase.g:237:1: ruleException : ( ( rule__Exception__TypeAssignment ) ) ;
    public final void ruleException() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:241:2: ( ( ( rule__Exception__TypeAssignment ) ) )
            // InternalUseCase.g:242:2: ( ( rule__Exception__TypeAssignment ) )
            {
            // InternalUseCase.g:242:2: ( ( rule__Exception__TypeAssignment ) )
            // InternalUseCase.g:243:3: ( rule__Exception__TypeAssignment )
            {
             before(grammarAccess.getExceptionAccess().getTypeAssignment()); 
            // InternalUseCase.g:244:3: ( rule__Exception__TypeAssignment )
            // InternalUseCase.g:244:4: rule__Exception__TypeAssignment
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
    // InternalUseCase.g:253:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalUseCase.g:254:1: ( ruleDescription EOF )
            // InternalUseCase.g:255:1: ruleDescription EOF
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
    // InternalUseCase.g:262:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:266:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalUseCase.g:267:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalUseCase.g:267:2: ( ( rule__Description__Group__0 ) )
            // InternalUseCase.g:268:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalUseCase.g:269:3: ( rule__Description__Group__0 )
            // InternalUseCase.g:269:4: rule__Description__Group__0
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
    // InternalUseCase.g:278:1: entryRuleNotes : ruleNotes EOF ;
    public final void entryRuleNotes() throws RecognitionException {
        try {
            // InternalUseCase.g:279:1: ( ruleNotes EOF )
            // InternalUseCase.g:280:1: ruleNotes EOF
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
    // InternalUseCase.g:287:1: ruleNotes : ( ( rule__Notes__Group__0 ) ) ;
    public final void ruleNotes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:291:2: ( ( ( rule__Notes__Group__0 ) ) )
            // InternalUseCase.g:292:2: ( ( rule__Notes__Group__0 ) )
            {
            // InternalUseCase.g:292:2: ( ( rule__Notes__Group__0 ) )
            // InternalUseCase.g:293:3: ( rule__Notes__Group__0 )
            {
             before(grammarAccess.getNotesAccess().getGroup()); 
            // InternalUseCase.g:294:3: ( rule__Notes__Group__0 )
            // InternalUseCase.g:294:4: rule__Notes__Group__0
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
    // InternalUseCase.g:303:1: entryRuleInputs : ruleInputs EOF ;
    public final void entryRuleInputs() throws RecognitionException {
        try {
            // InternalUseCase.g:304:1: ( ruleInputs EOF )
            // InternalUseCase.g:305:1: ruleInputs EOF
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
    // InternalUseCase.g:312:1: ruleInputs : ( ( rule__Inputs__Group__0 ) ) ;
    public final void ruleInputs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:316:2: ( ( ( rule__Inputs__Group__0 ) ) )
            // InternalUseCase.g:317:2: ( ( rule__Inputs__Group__0 ) )
            {
            // InternalUseCase.g:317:2: ( ( rule__Inputs__Group__0 ) )
            // InternalUseCase.g:318:3: ( rule__Inputs__Group__0 )
            {
             before(grammarAccess.getInputsAccess().getGroup()); 
            // InternalUseCase.g:319:3: ( rule__Inputs__Group__0 )
            // InternalUseCase.g:319:4: rule__Inputs__Group__0
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


    // $ANTLR start "entryRuleType"
    // InternalUseCase.g:353:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUseCase.g:354:1: ( ruleType EOF )
            // InternalUseCase.g:355:1: ruleType EOF
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
    // InternalUseCase.g:362:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:366:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalUseCase.g:367:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalUseCase.g:367:2: ( ( rule__Type__Group__0 ) )
            // InternalUseCase.g:368:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalUseCase.g:369:3: ( rule__Type__Group__0 )
            // InternalUseCase.g:369:4: rule__Type__Group__0
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
    // InternalUseCase.g:378:1: entryRuleExceptionDecleration : ruleExceptionDecleration EOF ;
    public final void entryRuleExceptionDecleration() throws RecognitionException {
        try {
            // InternalUseCase.g:379:1: ( ruleExceptionDecleration EOF )
            // InternalUseCase.g:380:1: ruleExceptionDecleration EOF
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
    // InternalUseCase.g:387:1: ruleExceptionDecleration : ( ( rule__ExceptionDecleration__Group__0 ) ) ;
    public final void ruleExceptionDecleration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:391:2: ( ( ( rule__ExceptionDecleration__Group__0 ) ) )
            // InternalUseCase.g:392:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            {
            // InternalUseCase.g:392:2: ( ( rule__ExceptionDecleration__Group__0 ) )
            // InternalUseCase.g:393:3: ( rule__ExceptionDecleration__Group__0 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup()); 
            // InternalUseCase.g:394:3: ( rule__ExceptionDecleration__Group__0 )
            // InternalUseCase.g:394:4: rule__ExceptionDecleration__Group__0
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
    // InternalUseCase.g:403:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalUseCase.g:404:1: ( ruleInput EOF )
            // InternalUseCase.g:405:1: ruleInput EOF
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
    // InternalUseCase.g:412:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:416:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalUseCase.g:417:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalUseCase.g:417:2: ( ( rule__Input__Group__0 ) )
            // InternalUseCase.g:418:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalUseCase.g:419:3: ( rule__Input__Group__0 )
            // InternalUseCase.g:419:4: rule__Input__Group__0
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
    // InternalUseCase.g:428:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalUseCase.g:429:1: ( ruleOutput EOF )
            // InternalUseCase.g:430:1: ruleOutput EOF
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
    // InternalUseCase.g:437:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:441:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalUseCase.g:442:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalUseCase.g:442:2: ( ( rule__Output__Group__0 ) )
            // InternalUseCase.g:443:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalUseCase.g:444:3: ( rule__Output__Group__0 )
            // InternalUseCase.g:444:4: rule__Output__Group__0
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
    // InternalUseCase.g:453:1: entryRuleAllowedUserGroups : ruleAllowedUserGroups EOF ;
    public final void entryRuleAllowedUserGroups() throws RecognitionException {
        try {
            // InternalUseCase.g:454:1: ( ruleAllowedUserGroups EOF )
            // InternalUseCase.g:455:1: ruleAllowedUserGroups EOF
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
    // InternalUseCase.g:462:1: ruleAllowedUserGroups : ( ( rule__AllowedUserGroups__Group__0 ) ) ;
    public final void ruleAllowedUserGroups() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:466:2: ( ( ( rule__AllowedUserGroups__Group__0 ) ) )
            // InternalUseCase.g:467:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            {
            // InternalUseCase.g:467:2: ( ( rule__AllowedUserGroups__Group__0 ) )
            // InternalUseCase.g:468:3: ( rule__AllowedUserGroups__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroup()); 
            // InternalUseCase.g:469:3: ( rule__AllowedUserGroups__Group__0 )
            // InternalUseCase.g:469:4: rule__AllowedUserGroups__Group__0
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
    // InternalUseCase.g:478:1: entryRuleAllowedUserGroup : ruleAllowedUserGroup EOF ;
    public final void entryRuleAllowedUserGroup() throws RecognitionException {
        try {
            // InternalUseCase.g:479:1: ( ruleAllowedUserGroup EOF )
            // InternalUseCase.g:480:1: ruleAllowedUserGroup EOF
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
    // InternalUseCase.g:487:1: ruleAllowedUserGroup : ( ( rule__AllowedUserGroup__Group__0 ) ) ;
    public final void ruleAllowedUserGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:491:2: ( ( ( rule__AllowedUserGroup__Group__0 ) ) )
            // InternalUseCase.g:492:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            {
            // InternalUseCase.g:492:2: ( ( rule__AllowedUserGroup__Group__0 ) )
            // InternalUseCase.g:493:3: ( rule__AllowedUserGroup__Group__0 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup()); 
            // InternalUseCase.g:494:3: ( rule__AllowedUserGroup__Group__0 )
            // InternalUseCase.g:494:4: rule__AllowedUserGroup__Group__0
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
    // InternalUseCase.g:503:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalUseCase.g:504:1: ( ruleQualifiedName EOF )
            // InternalUseCase.g:505:1: ruleQualifiedName EOF
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
    // InternalUseCase.g:512:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:516:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalUseCase.g:517:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalUseCase.g:517:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalUseCase.g:518:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalUseCase.g:519:3: ( rule__QualifiedName__Group__0 )
            // InternalUseCase.g:519:4: rule__QualifiedName__Group__0
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
    // InternalUseCase.g:528:1: entryRuleQualifiedNumber : ruleQualifiedNumber EOF ;
    public final void entryRuleQualifiedNumber() throws RecognitionException {
        try {
            // InternalUseCase.g:529:1: ( ruleQualifiedNumber EOF )
            // InternalUseCase.g:530:1: ruleQualifiedNumber EOF
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
    // InternalUseCase.g:537:1: ruleQualifiedNumber : ( ( rule__QualifiedNumber__Group__0 ) ) ;
    public final void ruleQualifiedNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:541:2: ( ( ( rule__QualifiedNumber__Group__0 ) ) )
            // InternalUseCase.g:542:2: ( ( rule__QualifiedNumber__Group__0 ) )
            {
            // InternalUseCase.g:542:2: ( ( rule__QualifiedNumber__Group__0 ) )
            // InternalUseCase.g:543:3: ( rule__QualifiedNumber__Group__0 )
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup()); 
            // InternalUseCase.g:544:3: ( rule__QualifiedNumber__Group__0 )
            // InternalUseCase.g:544:4: rule__QualifiedNumber__Group__0
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
    // InternalUseCase.g:552:1: rule__RaiseError__Alternatives_1 : ( ( 'Raise' ) | ( ( rule__RaiseError__Group_1_1__0 ) ) );
    public final void rule__RaiseError__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:556:1: ( ( 'Raise' ) | ( ( rule__RaiseError__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUseCase.g:557:2: ( 'Raise' )
                    {
                    // InternalUseCase.g:557:2: ( 'Raise' )
                    // InternalUseCase.g:558:3: 'Raise'
                    {
                     before(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:563:2: ( ( rule__RaiseError__Group_1_1__0 ) )
                    {
                    // InternalUseCase.g:563:2: ( ( rule__RaiseError__Group_1_1__0 ) )
                    // InternalUseCase.g:564:3: ( rule__RaiseError__Group_1_1__0 )
                    {
                     before(grammarAccess.getRaiseErrorAccess().getGroup_1_1()); 
                    // InternalUseCase.g:565:3: ( rule__RaiseError__Group_1_1__0 )
                    // InternalUseCase.g:565:4: rule__RaiseError__Group_1_1__0
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
    // InternalUseCase.g:573:1: rule__Notes__Alternatives_0 : ( ( 'notes:' ) | ( 'note:' ) );
    public final void rule__Notes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:577:1: ( ( 'notes:' ) | ( 'note:' ) )
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
                    // InternalUseCase.g:578:2: ( 'notes:' )
                    {
                    // InternalUseCase.g:578:2: ( 'notes:' )
                    // InternalUseCase.g:579:3: 'notes:'
                    {
                     before(grammarAccess.getNotesAccess().getNotesKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNotesAccess().getNotesKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:584:2: ( 'note:' )
                    {
                    // InternalUseCase.g:584:2: ( 'note:' )
                    // InternalUseCase.g:585:3: 'note:'
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
    // InternalUseCase.g:594:1: rule__Inputs__Alternatives_0 : ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_2__0 ) ) );
    public final void rule__Inputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:598:1: ( ( 'requires:' ) | ( 'require:' ) | ( ( rule__Inputs__Group_0_2__0 ) ) )
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
            case 30:
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
                    // InternalUseCase.g:599:2: ( 'requires:' )
                    {
                    // InternalUseCase.g:599:2: ( 'requires:' )
                    // InternalUseCase.g:600:3: 'requires:'
                    {
                     before(grammarAccess.getInputsAccess().getRequiresKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequiresKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:605:2: ( 'require:' )
                    {
                    // InternalUseCase.g:605:2: ( 'require:' )
                    // InternalUseCase.g:606:3: 'require:'
                    {
                     before(grammarAccess.getInputsAccess().getRequireKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getInputsAccess().getRequireKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:611:2: ( ( rule__Inputs__Group_0_2__0 ) )
                    {
                    // InternalUseCase.g:611:2: ( ( rule__Inputs__Group_0_2__0 ) )
                    // InternalUseCase.g:612:3: ( rule__Inputs__Group_0_2__0 )
                    {
                     before(grammarAccess.getInputsAccess().getGroup_0_2()); 
                    // InternalUseCase.g:613:3: ( rule__Inputs__Group_0_2__0 )
                    // InternalUseCase.g:613:4: rule__Inputs__Group_0_2__0
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
    // InternalUseCase.g:621:1: rule__Outputs__Alternatives_0 : ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_2__0 ) ) );
    public final void rule__Outputs__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:625:1: ( ( 'produces:' ) | ( 'produce:' ) | ( ( rule__Outputs__Group_0_2__0 ) ) )
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
            case 35:
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
                    // InternalUseCase.g:626:2: ( 'produces:' )
                    {
                    // InternalUseCase.g:626:2: ( 'produces:' )
                    // InternalUseCase.g:627:3: 'produces:'
                    {
                     before(grammarAccess.getOutputsAccess().getProducesKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProducesKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:632:2: ( 'produce:' )
                    {
                    // InternalUseCase.g:632:2: ( 'produce:' )
                    // InternalUseCase.g:633:3: 'produce:'
                    {
                     before(grammarAccess.getOutputsAccess().getProduceKeyword_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOutputsAccess().getProduceKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCase.g:638:2: ( ( rule__Outputs__Group_0_2__0 ) )
                    {
                    // InternalUseCase.g:638:2: ( ( rule__Outputs__Group_0_2__0 ) )
                    // InternalUseCase.g:639:3: ( rule__Outputs__Group_0_2__0 )
                    {
                     before(grammarAccess.getOutputsAccess().getGroup_0_2()); 
                    // InternalUseCase.g:640:3: ( rule__Outputs__Group_0_2__0 )
                    // InternalUseCase.g:640:4: rule__Outputs__Group_0_2__0
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
    // InternalUseCase.g:648:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:652:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUseCase.g:653:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalUseCase.g:660:1: rule__Model__Group__0__Impl : ( ( rule__Model__UseCasesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:664:1: ( ( ( rule__Model__UseCasesAssignment_0 )* ) )
            // InternalUseCase.g:665:1: ( ( rule__Model__UseCasesAssignment_0 )* )
            {
            // InternalUseCase.g:665:1: ( ( rule__Model__UseCasesAssignment_0 )* )
            // InternalUseCase.g:666:2: ( rule__Model__UseCasesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getUseCasesAssignment_0()); 
            // InternalUseCase.g:667:2: ( rule__Model__UseCasesAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUseCase.g:667:3: rule__Model__UseCasesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__UseCasesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalUseCase.g:675:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:679:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUseCase.g:680:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalUseCase.g:687:1: rule__Model__Group__1__Impl : ( ( rule__Model__TypesAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:691:1: ( ( ( rule__Model__TypesAssignment_1 ) ) )
            // InternalUseCase.g:692:1: ( ( rule__Model__TypesAssignment_1 ) )
            {
            // InternalUseCase.g:692:1: ( ( rule__Model__TypesAssignment_1 ) )
            // InternalUseCase.g:693:2: ( rule__Model__TypesAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_1()); 
            // InternalUseCase.g:694:2: ( rule__Model__TypesAssignment_1 )
            // InternalUseCase.g:694:3: rule__Model__TypesAssignment_1
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
    // InternalUseCase.g:702:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:706:1: ( rule__Model__Group__2__Impl )
            // InternalUseCase.g:707:2: rule__Model__Group__2__Impl
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
    // InternalUseCase.g:713:1: rule__Model__Group__2__Impl : ( ( rule__Model__ExceptionsAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:717:1: ( ( ( rule__Model__ExceptionsAssignment_2 ) ) )
            // InternalUseCase.g:718:1: ( ( rule__Model__ExceptionsAssignment_2 ) )
            {
            // InternalUseCase.g:718:1: ( ( rule__Model__ExceptionsAssignment_2 ) )
            // InternalUseCase.g:719:2: ( rule__Model__ExceptionsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getExceptionsAssignment_2()); 
            // InternalUseCase.g:720:2: ( rule__Model__ExceptionsAssignment_2 )
            // InternalUseCase.g:720:3: rule__Model__ExceptionsAssignment_2
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
    // InternalUseCase.g:729:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:733:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCase.g:734:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUseCase.g:741:1: rule__UseCase__Group__0__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:745:1: ( ( 'use-case' ) )
            // InternalUseCase.g:746:1: ( 'use-case' )
            {
            // InternalUseCase.g:746:1: ( 'use-case' )
            // InternalUseCase.g:747:2: 'use-case'
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
    // InternalUseCase.g:756:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:760:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCase.g:761:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
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
    // InternalUseCase.g:768:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:772:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUseCase.g:773:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUseCase.g:773:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUseCase.g:774:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUseCase.g:775:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUseCase.g:775:3: rule__UseCase__NameAssignment_1
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
    // InternalUseCase.g:783:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:787:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCase.g:788:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
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
    // InternalUseCase.g:795:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionsAssignment_2 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:799:1: ( ( ( rule__UseCase__DescriptionsAssignment_2 )? ) )
            // InternalUseCase.g:800:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            {
            // InternalUseCase.g:800:1: ( ( rule__UseCase__DescriptionsAssignment_2 )? )
            // InternalUseCase.g:801:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); 
            // InternalUseCase.g:802:2: ( rule__UseCase__DescriptionsAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:802:3: rule__UseCase__DescriptionsAssignment_2
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
    // InternalUseCase.g:810:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:814:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCase.g:815:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
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
    // InternalUseCase.g:822:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:826:1: ( ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? ) )
            // InternalUseCase.g:827:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            {
            // InternalUseCase.g:827:1: ( ( rule__UseCase__AllowedUserGroupsAssignment_3 )? )
            // InternalUseCase.g:828:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            {
             before(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAssignment_3()); 
            // InternalUseCase.g:829:2: ( rule__UseCase__AllowedUserGroupsAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==44) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:829:3: rule__UseCase__AllowedUserGroupsAssignment_3
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
    // InternalUseCase.g:837:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:841:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCase.g:842:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
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
    // InternalUseCase.g:849:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__InputsAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:853:1: ( ( ( rule__UseCase__InputsAssignment_4 )? ) )
            // InternalUseCase.g:854:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            {
            // InternalUseCase.g:854:1: ( ( rule__UseCase__InputsAssignment_4 )? )
            // InternalUseCase.g:855:2: ( rule__UseCase__InputsAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getInputsAssignment_4()); 
            // InternalUseCase.g:856:2: ( rule__UseCase__InputsAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=14 && LA8_0<=15)||LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:856:3: rule__UseCase__InputsAssignment_4
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
    // InternalUseCase.g:864:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:868:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCase.g:869:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
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
    // InternalUseCase.g:876:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__OutputsAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:880:1: ( ( ( rule__UseCase__OutputsAssignment_5 )? ) )
            // InternalUseCase.g:881:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            {
            // InternalUseCase.g:881:1: ( ( rule__UseCase__OutputsAssignment_5 )? )
            // InternalUseCase.g:882:2: ( rule__UseCase__OutputsAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getOutputsAssignment_5()); 
            // InternalUseCase.g:883:2: ( rule__UseCase__OutputsAssignment_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=16 && LA9_0<=17)||LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUseCase.g:883:3: rule__UseCase__OutputsAssignment_5
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
    // InternalUseCase.g:891:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:895:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCase.g:896:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
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
    // InternalUseCase.g:903:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__StepsAssignment_6 )? ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:907:1: ( ( ( rule__UseCase__StepsAssignment_6 )? ) )
            // InternalUseCase.g:908:1: ( ( rule__UseCase__StepsAssignment_6 )? )
            {
            // InternalUseCase.g:908:1: ( ( rule__UseCase__StepsAssignment_6 )? )
            // InternalUseCase.g:909:2: ( rule__UseCase__StepsAssignment_6 )?
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_6()); 
            // InternalUseCase.g:910:2: ( rule__UseCase__StepsAssignment_6 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCase.g:910:3: rule__UseCase__StepsAssignment_6
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
    // InternalUseCase.g:918:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:922:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCase.g:923:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
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
    // InternalUseCase.g:930:1: rule__UseCase__Group__7__Impl : ( ( rule__UseCase__NotesAssignment_7 )? ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:934:1: ( ( ( rule__UseCase__NotesAssignment_7 )? ) )
            // InternalUseCase.g:935:1: ( ( rule__UseCase__NotesAssignment_7 )? )
            {
            // InternalUseCase.g:935:1: ( ( rule__UseCase__NotesAssignment_7 )? )
            // InternalUseCase.g:936:2: ( rule__UseCase__NotesAssignment_7 )?
            {
             before(grammarAccess.getUseCaseAccess().getNotesAssignment_7()); 
            // InternalUseCase.g:937:2: ( rule__UseCase__NotesAssignment_7 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=12 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:937:3: rule__UseCase__NotesAssignment_7
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
    // InternalUseCase.g:945:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:949:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCase.g:950:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCase.g:957:1: rule__UseCase__Group__8__Impl : ( 'end' ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:961:1: ( ( 'end' ) )
            // InternalUseCase.g:962:1: ( 'end' )
            {
            // InternalUseCase.g:962:1: ( 'end' )
            // InternalUseCase.g:963:2: 'end'
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
    // InternalUseCase.g:972:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:976:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // InternalUseCase.g:977:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCase.g:984:1: rule__UseCase__Group__9__Impl : ( 'of' ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:988:1: ( ( 'of' ) )
            // InternalUseCase.g:989:1: ( 'of' )
            {
            // InternalUseCase.g:989:1: ( 'of' )
            // InternalUseCase.g:990:2: 'of'
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
    // InternalUseCase.g:999:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1003:1: ( rule__UseCase__Group__10__Impl )
            // InternalUseCase.g:1004:2: rule__UseCase__Group__10__Impl
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
    // InternalUseCase.g:1010:1: rule__UseCase__Group__10__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1014:1: ( ( 'use-case' ) )
            // InternalUseCase.g:1015:1: ( 'use-case' )
            {
            // InternalUseCase.g:1015:1: ( 'use-case' )
            // InternalUseCase.g:1016:2: 'use-case'
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
    // InternalUseCase.g:1026:1: rule__Steps__Group__0 : rule__Steps__Group__0__Impl rule__Steps__Group__1 ;
    public final void rule__Steps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1030:1: ( rule__Steps__Group__0__Impl rule__Steps__Group__1 )
            // InternalUseCase.g:1031:2: rule__Steps__Group__0__Impl rule__Steps__Group__1
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
    // InternalUseCase.g:1038:1: rule__Steps__Group__0__Impl : ( 'steps:' ) ;
    public final void rule__Steps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1042:1: ( ( 'steps:' ) )
            // InternalUseCase.g:1043:1: ( 'steps:' )
            {
            // InternalUseCase.g:1043:1: ( 'steps:' )
            // InternalUseCase.g:1044:2: 'steps:'
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
    // InternalUseCase.g:1053:1: rule__Steps__Group__1 : rule__Steps__Group__1__Impl ;
    public final void rule__Steps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1057:1: ( rule__Steps__Group__1__Impl )
            // InternalUseCase.g:1058:2: rule__Steps__Group__1__Impl
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
    // InternalUseCase.g:1064:1: rule__Steps__Group__1__Impl : ( ( rule__Steps__StepsAssignment_1 )* ) ;
    public final void rule__Steps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1068:1: ( ( ( rule__Steps__StepsAssignment_1 )* ) )
            // InternalUseCase.g:1069:1: ( ( rule__Steps__StepsAssignment_1 )* )
            {
            // InternalUseCase.g:1069:1: ( ( rule__Steps__StepsAssignment_1 )* )
            // InternalUseCase.g:1070:2: ( rule__Steps__StepsAssignment_1 )*
            {
             before(grammarAccess.getStepsAccess().getStepsAssignment_1()); 
            // InternalUseCase.g:1071:2: ( rule__Steps__StepsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_INT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUseCase.g:1071:3: rule__Steps__StepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Steps__StepsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalUseCase.g:1080:1: rule__UsedTypes__Group__0 : rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 ;
    public final void rule__UsedTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1084:1: ( rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1 )
            // InternalUseCase.g:1085:2: rule__UsedTypes__Group__0__Impl rule__UsedTypes__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCase.g:1092:1: rule__UsedTypes__Group__0__Impl : ( 'used' ) ;
    public final void rule__UsedTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1096:1: ( ( 'used' ) )
            // InternalUseCase.g:1097:1: ( 'used' )
            {
            // InternalUseCase.g:1097:1: ( 'used' )
            // InternalUseCase.g:1098:2: 'used'
            {
             before(grammarAccess.getUsedTypesAccess().getUsedKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUseCase.g:1107:1: rule__UsedTypes__Group__1 : rule__UsedTypes__Group__1__Impl rule__UsedTypes__Group__2 ;
    public final void rule__UsedTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1111:1: ( rule__UsedTypes__Group__1__Impl rule__UsedTypes__Group__2 )
            // InternalUseCase.g:1112:2: rule__UsedTypes__Group__1__Impl rule__UsedTypes__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCase.g:1119:1: rule__UsedTypes__Group__1__Impl : ( 'types:' ) ;
    public final void rule__UsedTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1123:1: ( ( 'types:' ) )
            // InternalUseCase.g:1124:1: ( 'types:' )
            {
            // InternalUseCase.g:1124:1: ( 'types:' )
            // InternalUseCase.g:1125:2: 'types:'
            {
             before(grammarAccess.getUsedTypesAccess().getTypesKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUseCase.g:1134:1: rule__UsedTypes__Group__2 : rule__UsedTypes__Group__2__Impl ;
    public final void rule__UsedTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1138:1: ( rule__UsedTypes__Group__2__Impl )
            // InternalUseCase.g:1139:2: rule__UsedTypes__Group__2__Impl
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
    // InternalUseCase.g:1145:1: rule__UsedTypes__Group__2__Impl : ( ( rule__UsedTypes__TypesAssignment_2 )* ) ;
    public final void rule__UsedTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1149:1: ( ( ( rule__UsedTypes__TypesAssignment_2 )* ) )
            // InternalUseCase.g:1150:1: ( ( rule__UsedTypes__TypesAssignment_2 )* )
            {
            // InternalUseCase.g:1150:1: ( ( rule__UsedTypes__TypesAssignment_2 )* )
            // InternalUseCase.g:1151:2: ( rule__UsedTypes__TypesAssignment_2 )*
            {
             before(grammarAccess.getUsedTypesAccess().getTypesAssignment_2()); 
            // InternalUseCase.g:1152:2: ( rule__UsedTypes__TypesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUseCase.g:1152:3: rule__UsedTypes__TypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UsedTypes__TypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalUseCase.g:1161:1: rule__UsedExceptions__Group__0 : rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 ;
    public final void rule__UsedExceptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1165:1: ( rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1 )
            // InternalUseCase.g:1166:2: rule__UsedExceptions__Group__0__Impl rule__UsedExceptions__Group__1
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
    // InternalUseCase.g:1173:1: rule__UsedExceptions__Group__0__Impl : ( 'used' ) ;
    public final void rule__UsedExceptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1177:1: ( ( 'used' ) )
            // InternalUseCase.g:1178:1: ( 'used' )
            {
            // InternalUseCase.g:1178:1: ( 'used' )
            // InternalUseCase.g:1179:2: 'used'
            {
             before(grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUseCase.g:1188:1: rule__UsedExceptions__Group__1 : rule__UsedExceptions__Group__1__Impl rule__UsedExceptions__Group__2 ;
    public final void rule__UsedExceptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1192:1: ( rule__UsedExceptions__Group__1__Impl rule__UsedExceptions__Group__2 )
            // InternalUseCase.g:1193:2: rule__UsedExceptions__Group__1__Impl rule__UsedExceptions__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCase.g:1200:1: rule__UsedExceptions__Group__1__Impl : ( 'errors:' ) ;
    public final void rule__UsedExceptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1204:1: ( ( 'errors:' ) )
            // InternalUseCase.g:1205:1: ( 'errors:' )
            {
            // InternalUseCase.g:1205:1: ( 'errors:' )
            // InternalUseCase.g:1206:2: 'errors:'
            {
             before(grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUseCase.g:1215:1: rule__UsedExceptions__Group__2 : rule__UsedExceptions__Group__2__Impl ;
    public final void rule__UsedExceptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1219:1: ( rule__UsedExceptions__Group__2__Impl )
            // InternalUseCase.g:1220:2: rule__UsedExceptions__Group__2__Impl
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
    // InternalUseCase.g:1226:1: rule__UsedExceptions__Group__2__Impl : ( ( rule__UsedExceptions__ExceptionAssignment_2 )* ) ;
    public final void rule__UsedExceptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1230:1: ( ( ( rule__UsedExceptions__ExceptionAssignment_2 )* ) )
            // InternalUseCase.g:1231:1: ( ( rule__UsedExceptions__ExceptionAssignment_2 )* )
            {
            // InternalUseCase.g:1231:1: ( ( rule__UsedExceptions__ExceptionAssignment_2 )* )
            // InternalUseCase.g:1232:2: ( rule__UsedExceptions__ExceptionAssignment_2 )*
            {
             before(grammarAccess.getUsedExceptionsAccess().getExceptionAssignment_2()); 
            // InternalUseCase.g:1233:2: ( rule__UsedExceptions__ExceptionAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUseCase.g:1233:3: rule__UsedExceptions__ExceptionAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UsedExceptions__ExceptionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getUsedExceptionsAccess().getExceptionAssignment_2()); 

            }


            }

        }
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
    // InternalUseCase.g:1242:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1246:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalUseCase.g:1247:2: rule__Step__Group__0__Impl rule__Step__Group__1
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
    // InternalUseCase.g:1254:1: rule__Step__Group__0__Impl : ( ( rule__Step__NumberAssignment_0 ) ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1258:1: ( ( ( rule__Step__NumberAssignment_0 ) ) )
            // InternalUseCase.g:1259:1: ( ( rule__Step__NumberAssignment_0 ) )
            {
            // InternalUseCase.g:1259:1: ( ( rule__Step__NumberAssignment_0 ) )
            // InternalUseCase.g:1260:2: ( rule__Step__NumberAssignment_0 )
            {
             before(grammarAccess.getStepAccess().getNumberAssignment_0()); 
            // InternalUseCase.g:1261:2: ( rule__Step__NumberAssignment_0 )
            // InternalUseCase.g:1261:3: rule__Step__NumberAssignment_0
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
    // InternalUseCase.g:1269:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1273:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalUseCase.g:1274:2: rule__Step__Group__1__Impl rule__Step__Group__2
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
    // InternalUseCase.g:1281:1: rule__Step__Group__1__Impl : ( ( rule__Step__ActionAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1285:1: ( ( ( rule__Step__ActionAssignment_1 ) ) )
            // InternalUseCase.g:1286:1: ( ( rule__Step__ActionAssignment_1 ) )
            {
            // InternalUseCase.g:1286:1: ( ( rule__Step__ActionAssignment_1 ) )
            // InternalUseCase.g:1287:2: ( rule__Step__ActionAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getActionAssignment_1()); 
            // InternalUseCase.g:1288:2: ( rule__Step__ActionAssignment_1 )
            // InternalUseCase.g:1288:3: rule__Step__ActionAssignment_1
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
    // InternalUseCase.g:1296:1: rule__Step__Group__2 : rule__Step__Group__2__Impl ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1300:1: ( rule__Step__Group__2__Impl )
            // InternalUseCase.g:1301:2: rule__Step__Group__2__Impl
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
    // InternalUseCase.g:1307:1: rule__Step__Group__2__Impl : ( ( rule__Step__ErrorAssignment_2 )? ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1311:1: ( ( ( rule__Step__ErrorAssignment_2 )? ) )
            // InternalUseCase.g:1312:1: ( ( rule__Step__ErrorAssignment_2 )? )
            {
            // InternalUseCase.g:1312:1: ( ( rule__Step__ErrorAssignment_2 )? )
            // InternalUseCase.g:1313:2: ( rule__Step__ErrorAssignment_2 )?
            {
             before(grammarAccess.getStepAccess().getErrorAssignment_2()); 
            // InternalUseCase.g:1314:2: ( rule__Step__ErrorAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUseCase.g:1314:3: rule__Step__ErrorAssignment_2
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
    // InternalUseCase.g:1323:1: rule__RaiseError__Group__0 : rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1 ;
    public final void rule__RaiseError__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1327:1: ( rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1 )
            // InternalUseCase.g:1328:2: rule__RaiseError__Group__0__Impl rule__RaiseError__Group__1
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
    // InternalUseCase.g:1335:1: rule__RaiseError__Group__0__Impl : ( '.' ) ;
    public final void rule__RaiseError__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1339:1: ( ( '.' ) )
            // InternalUseCase.g:1340:1: ( '.' )
            {
            // InternalUseCase.g:1340:1: ( '.' )
            // InternalUseCase.g:1341:2: '.'
            {
             before(grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUseCase.g:1350:1: rule__RaiseError__Group__1 : rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2 ;
    public final void rule__RaiseError__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1354:1: ( rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2 )
            // InternalUseCase.g:1355:2: rule__RaiseError__Group__1__Impl rule__RaiseError__Group__2
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
    // InternalUseCase.g:1362:1: rule__RaiseError__Group__1__Impl : ( ( rule__RaiseError__Alternatives_1 ) ) ;
    public final void rule__RaiseError__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1366:1: ( ( ( rule__RaiseError__Alternatives_1 ) ) )
            // InternalUseCase.g:1367:1: ( ( rule__RaiseError__Alternatives_1 ) )
            {
            // InternalUseCase.g:1367:1: ( ( rule__RaiseError__Alternatives_1 ) )
            // InternalUseCase.g:1368:2: ( rule__RaiseError__Alternatives_1 )
            {
             before(grammarAccess.getRaiseErrorAccess().getAlternatives_1()); 
            // InternalUseCase.g:1369:2: ( rule__RaiseError__Alternatives_1 )
            // InternalUseCase.g:1369:3: rule__RaiseError__Alternatives_1
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
    // InternalUseCase.g:1377:1: rule__RaiseError__Group__2 : rule__RaiseError__Group__2__Impl ;
    public final void rule__RaiseError__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1381:1: ( rule__RaiseError__Group__2__Impl )
            // InternalUseCase.g:1382:2: rule__RaiseError__Group__2__Impl
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
    // InternalUseCase.g:1388:1: rule__RaiseError__Group__2__Impl : ( ( rule__RaiseError__ExceptionAssignment_2 ) ) ;
    public final void rule__RaiseError__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1392:1: ( ( ( rule__RaiseError__ExceptionAssignment_2 ) ) )
            // InternalUseCase.g:1393:1: ( ( rule__RaiseError__ExceptionAssignment_2 ) )
            {
            // InternalUseCase.g:1393:1: ( ( rule__RaiseError__ExceptionAssignment_2 ) )
            // InternalUseCase.g:1394:2: ( rule__RaiseError__ExceptionAssignment_2 )
            {
             before(grammarAccess.getRaiseErrorAccess().getExceptionAssignment_2()); 
            // InternalUseCase.g:1395:2: ( rule__RaiseError__ExceptionAssignment_2 )
            // InternalUseCase.g:1395:3: rule__RaiseError__ExceptionAssignment_2
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
    // InternalUseCase.g:1404:1: rule__RaiseError__Group_1_1__0 : rule__RaiseError__Group_1_1__0__Impl rule__RaiseError__Group_1_1__1 ;
    public final void rule__RaiseError__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1408:1: ( rule__RaiseError__Group_1_1__0__Impl rule__RaiseError__Group_1_1__1 )
            // InternalUseCase.g:1409:2: rule__RaiseError__Group_1_1__0__Impl rule__RaiseError__Group_1_1__1
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
    // InternalUseCase.g:1416:1: rule__RaiseError__Group_1_1__0__Impl : ( 'On' ) ;
    public final void rule__RaiseError__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1420:1: ( ( 'On' ) )
            // InternalUseCase.g:1421:1: ( 'On' )
            {
            // InternalUseCase.g:1421:1: ( 'On' )
            // InternalUseCase.g:1422:2: 'On'
            {
             before(grammarAccess.getRaiseErrorAccess().getOnKeyword_1_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalUseCase.g:1431:1: rule__RaiseError__Group_1_1__1 : rule__RaiseError__Group_1_1__1__Impl rule__RaiseError__Group_1_1__2 ;
    public final void rule__RaiseError__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1435:1: ( rule__RaiseError__Group_1_1__1__Impl rule__RaiseError__Group_1_1__2 )
            // InternalUseCase.g:1436:2: rule__RaiseError__Group_1_1__1__Impl rule__RaiseError__Group_1_1__2
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
    // InternalUseCase.g:1443:1: rule__RaiseError__Group_1_1__1__Impl : ( 'error' ) ;
    public final void rule__RaiseError__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1447:1: ( ( 'error' ) )
            // InternalUseCase.g:1448:1: ( 'error' )
            {
            // InternalUseCase.g:1448:1: ( 'error' )
            // InternalUseCase.g:1449:2: 'error'
            {
             before(grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_1_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalUseCase.g:1458:1: rule__RaiseError__Group_1_1__2 : rule__RaiseError__Group_1_1__2__Impl ;
    public final void rule__RaiseError__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1462:1: ( rule__RaiseError__Group_1_1__2__Impl )
            // InternalUseCase.g:1463:2: rule__RaiseError__Group_1_1__2__Impl
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
    // InternalUseCase.g:1469:1: rule__RaiseError__Group_1_1__2__Impl : ( 'raise' ) ;
    public final void rule__RaiseError__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1473:1: ( ( 'raise' ) )
            // InternalUseCase.g:1474:1: ( 'raise' )
            {
            // InternalUseCase.g:1474:1: ( 'raise' )
            // InternalUseCase.g:1475:2: 'raise'
            {
             before(grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_1_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUseCase.g:1485:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1489:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalUseCase.g:1490:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalUseCase.g:1497:1: rule__Description__Group__0__Impl : ( 'description:' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1501:1: ( ( 'description:' ) )
            // InternalUseCase.g:1502:1: ( 'description:' )
            {
            // InternalUseCase.g:1502:1: ( 'description:' )
            // InternalUseCase.g:1503:2: 'description:'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalUseCase.g:1512:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1516:1: ( rule__Description__Group__1__Impl )
            // InternalUseCase.g:1517:2: rule__Description__Group__1__Impl
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
    // InternalUseCase.g:1523:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1527:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalUseCase.g:1528:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalUseCase.g:1528:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalUseCase.g:1529:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalUseCase.g:1530:2: ( rule__Description__NameAssignment_1 )
            // InternalUseCase.g:1530:3: rule__Description__NameAssignment_1
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
    // InternalUseCase.g:1539:1: rule__Notes__Group__0 : rule__Notes__Group__0__Impl rule__Notes__Group__1 ;
    public final void rule__Notes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1543:1: ( rule__Notes__Group__0__Impl rule__Notes__Group__1 )
            // InternalUseCase.g:1544:2: rule__Notes__Group__0__Impl rule__Notes__Group__1
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
    // InternalUseCase.g:1551:1: rule__Notes__Group__0__Impl : ( ( rule__Notes__Alternatives_0 ) ) ;
    public final void rule__Notes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1555:1: ( ( ( rule__Notes__Alternatives_0 ) ) )
            // InternalUseCase.g:1556:1: ( ( rule__Notes__Alternatives_0 ) )
            {
            // InternalUseCase.g:1556:1: ( ( rule__Notes__Alternatives_0 ) )
            // InternalUseCase.g:1557:2: ( rule__Notes__Alternatives_0 )
            {
             before(grammarAccess.getNotesAccess().getAlternatives_0()); 
            // InternalUseCase.g:1558:2: ( rule__Notes__Alternatives_0 )
            // InternalUseCase.g:1558:3: rule__Notes__Alternatives_0
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
    // InternalUseCase.g:1566:1: rule__Notes__Group__1 : rule__Notes__Group__1__Impl ;
    public final void rule__Notes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1570:1: ( rule__Notes__Group__1__Impl )
            // InternalUseCase.g:1571:2: rule__Notes__Group__1__Impl
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
    // InternalUseCase.g:1577:1: rule__Notes__Group__1__Impl : ( ( rule__Notes__ContentAssignment_1 ) ) ;
    public final void rule__Notes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1581:1: ( ( ( rule__Notes__ContentAssignment_1 ) ) )
            // InternalUseCase.g:1582:1: ( ( rule__Notes__ContentAssignment_1 ) )
            {
            // InternalUseCase.g:1582:1: ( ( rule__Notes__ContentAssignment_1 ) )
            // InternalUseCase.g:1583:2: ( rule__Notes__ContentAssignment_1 )
            {
             before(grammarAccess.getNotesAccess().getContentAssignment_1()); 
            // InternalUseCase.g:1584:2: ( rule__Notes__ContentAssignment_1 )
            // InternalUseCase.g:1584:3: rule__Notes__ContentAssignment_1
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
    // InternalUseCase.g:1593:1: rule__Inputs__Group__0 : rule__Inputs__Group__0__Impl rule__Inputs__Group__1 ;
    public final void rule__Inputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1597:1: ( rule__Inputs__Group__0__Impl rule__Inputs__Group__1 )
            // InternalUseCase.g:1598:2: rule__Inputs__Group__0__Impl rule__Inputs__Group__1
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
    // InternalUseCase.g:1605:1: rule__Inputs__Group__0__Impl : ( ( rule__Inputs__Alternatives_0 ) ) ;
    public final void rule__Inputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1609:1: ( ( ( rule__Inputs__Alternatives_0 ) ) )
            // InternalUseCase.g:1610:1: ( ( rule__Inputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:1610:1: ( ( rule__Inputs__Alternatives_0 ) )
            // InternalUseCase.g:1611:2: ( rule__Inputs__Alternatives_0 )
            {
             before(grammarAccess.getInputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:1612:2: ( rule__Inputs__Alternatives_0 )
            // InternalUseCase.g:1612:3: rule__Inputs__Alternatives_0
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
    // InternalUseCase.g:1620:1: rule__Inputs__Group__1 : rule__Inputs__Group__1__Impl ;
    public final void rule__Inputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1624:1: ( rule__Inputs__Group__1__Impl )
            // InternalUseCase.g:1625:2: rule__Inputs__Group__1__Impl
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
    // InternalUseCase.g:1631:1: rule__Inputs__Group__1__Impl : ( ( rule__Inputs__InputsAssignment_1 )* ) ;
    public final void rule__Inputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1635:1: ( ( ( rule__Inputs__InputsAssignment_1 )* ) )
            // InternalUseCase.g:1636:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            {
            // InternalUseCase.g:1636:1: ( ( rule__Inputs__InputsAssignment_1 )* )
            // InternalUseCase.g:1637:2: ( rule__Inputs__InputsAssignment_1 )*
            {
             before(grammarAccess.getInputsAccess().getInputsAssignment_1()); 
            // InternalUseCase.g:1638:2: ( rule__Inputs__InputsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37||LA16_0==45) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUseCase.g:1638:3: rule__Inputs__InputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Inputs__InputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalUseCase.g:1647:1: rule__Inputs__Group_0_2__0 : rule__Inputs__Group_0_2__0__Impl rule__Inputs__Group_0_2__1 ;
    public final void rule__Inputs__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1651:1: ( rule__Inputs__Group_0_2__0__Impl rule__Inputs__Group_0_2__1 )
            // InternalUseCase.g:1652:2: rule__Inputs__Group_0_2__0__Impl rule__Inputs__Group_0_2__1
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
    // InternalUseCase.g:1659:1: rule__Inputs__Group_0_2__0__Impl : ( 'requires' ) ;
    public final void rule__Inputs__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1663:1: ( ( 'requires' ) )
            // InternalUseCase.g:1664:1: ( 'requires' )
            {
            // InternalUseCase.g:1664:1: ( 'requires' )
            // InternalUseCase.g:1665:2: 'requires'
            {
             before(grammarAccess.getInputsAccess().getRequiresKeyword_0_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalUseCase.g:1674:1: rule__Inputs__Group_0_2__1 : rule__Inputs__Group_0_2__1__Impl rule__Inputs__Group_0_2__2 ;
    public final void rule__Inputs__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1678:1: ( rule__Inputs__Group_0_2__1__Impl rule__Inputs__Group_0_2__2 )
            // InternalUseCase.g:1679:2: rule__Inputs__Group_0_2__1__Impl rule__Inputs__Group_0_2__2
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
    // InternalUseCase.g:1686:1: rule__Inputs__Group_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Inputs__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1690:1: ( ( 'the' ) )
            // InternalUseCase.g:1691:1: ( 'the' )
            {
            // InternalUseCase.g:1691:1: ( 'the' )
            // InternalUseCase.g:1692:2: 'the'
            {
             before(grammarAccess.getInputsAccess().getTheKeyword_0_2_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalUseCase.g:1701:1: rule__Inputs__Group_0_2__2 : rule__Inputs__Group_0_2__2__Impl rule__Inputs__Group_0_2__3 ;
    public final void rule__Inputs__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1705:1: ( rule__Inputs__Group_0_2__2__Impl rule__Inputs__Group_0_2__3 )
            // InternalUseCase.g:1706:2: rule__Inputs__Group_0_2__2__Impl rule__Inputs__Group_0_2__3
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
    // InternalUseCase.g:1713:1: rule__Inputs__Group_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Inputs__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1717:1: ( ( 'following' ) )
            // InternalUseCase.g:1718:1: ( 'following' )
            {
            // InternalUseCase.g:1718:1: ( 'following' )
            // InternalUseCase.g:1719:2: 'following'
            {
             before(grammarAccess.getInputsAccess().getFollowingKeyword_0_2_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUseCase.g:1728:1: rule__Inputs__Group_0_2__3 : rule__Inputs__Group_0_2__3__Impl rule__Inputs__Group_0_2__4 ;
    public final void rule__Inputs__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1732:1: ( rule__Inputs__Group_0_2__3__Impl rule__Inputs__Group_0_2__4 )
            // InternalUseCase.g:1733:2: rule__Inputs__Group_0_2__3__Impl rule__Inputs__Group_0_2__4
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
    // InternalUseCase.g:1740:1: rule__Inputs__Group_0_2__3__Impl : ( 'input' ) ;
    public final void rule__Inputs__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1744:1: ( ( 'input' ) )
            // InternalUseCase.g:1745:1: ( 'input' )
            {
            // InternalUseCase.g:1745:1: ( 'input' )
            // InternalUseCase.g:1746:2: 'input'
            {
             before(grammarAccess.getInputsAccess().getInputKeyword_0_2_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalUseCase.g:1755:1: rule__Inputs__Group_0_2__4 : rule__Inputs__Group_0_2__4__Impl ;
    public final void rule__Inputs__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1759:1: ( rule__Inputs__Group_0_2__4__Impl )
            // InternalUseCase.g:1760:2: rule__Inputs__Group_0_2__4__Impl
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
    // InternalUseCase.g:1766:1: rule__Inputs__Group_0_2__4__Impl : ( ':' ) ;
    public final void rule__Inputs__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1770:1: ( ( ':' ) )
            // InternalUseCase.g:1771:1: ( ':' )
            {
            // InternalUseCase.g:1771:1: ( ':' )
            // InternalUseCase.g:1772:2: ':'
            {
             before(grammarAccess.getInputsAccess().getColonKeyword_0_2_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUseCase.g:1782:1: rule__Outputs__Group__0 : rule__Outputs__Group__0__Impl rule__Outputs__Group__1 ;
    public final void rule__Outputs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1786:1: ( rule__Outputs__Group__0__Impl rule__Outputs__Group__1 )
            // InternalUseCase.g:1787:2: rule__Outputs__Group__0__Impl rule__Outputs__Group__1
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
    // InternalUseCase.g:1794:1: rule__Outputs__Group__0__Impl : ( ( rule__Outputs__Alternatives_0 ) ) ;
    public final void rule__Outputs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1798:1: ( ( ( rule__Outputs__Alternatives_0 ) ) )
            // InternalUseCase.g:1799:1: ( ( rule__Outputs__Alternatives_0 ) )
            {
            // InternalUseCase.g:1799:1: ( ( rule__Outputs__Alternatives_0 ) )
            // InternalUseCase.g:1800:2: ( rule__Outputs__Alternatives_0 )
            {
             before(grammarAccess.getOutputsAccess().getAlternatives_0()); 
            // InternalUseCase.g:1801:2: ( rule__Outputs__Alternatives_0 )
            // InternalUseCase.g:1801:3: rule__Outputs__Alternatives_0
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
    // InternalUseCase.g:1809:1: rule__Outputs__Group__1 : rule__Outputs__Group__1__Impl ;
    public final void rule__Outputs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1813:1: ( rule__Outputs__Group__1__Impl )
            // InternalUseCase.g:1814:2: rule__Outputs__Group__1__Impl
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
    // InternalUseCase.g:1820:1: rule__Outputs__Group__1__Impl : ( ( rule__Outputs__OutputsAssignment_1 )* ) ;
    public final void rule__Outputs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1824:1: ( ( ( rule__Outputs__OutputsAssignment_1 )* ) )
            // InternalUseCase.g:1825:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            {
            // InternalUseCase.g:1825:1: ( ( rule__Outputs__OutputsAssignment_1 )* )
            // InternalUseCase.g:1826:2: ( rule__Outputs__OutputsAssignment_1 )*
            {
             before(grammarAccess.getOutputsAccess().getOutputsAssignment_1()); 
            // InternalUseCase.g:1827:2: ( rule__Outputs__OutputsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37||LA17_0==45) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUseCase.g:1827:3: rule__Outputs__OutputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Outputs__OutputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalUseCase.g:1836:1: rule__Outputs__Group_0_2__0 : rule__Outputs__Group_0_2__0__Impl rule__Outputs__Group_0_2__1 ;
    public final void rule__Outputs__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1840:1: ( rule__Outputs__Group_0_2__0__Impl rule__Outputs__Group_0_2__1 )
            // InternalUseCase.g:1841:2: rule__Outputs__Group_0_2__0__Impl rule__Outputs__Group_0_2__1
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
    // InternalUseCase.g:1848:1: rule__Outputs__Group_0_2__0__Impl : ( 'produces' ) ;
    public final void rule__Outputs__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1852:1: ( ( 'produces' ) )
            // InternalUseCase.g:1853:1: ( 'produces' )
            {
            // InternalUseCase.g:1853:1: ( 'produces' )
            // InternalUseCase.g:1854:2: 'produces'
            {
             before(grammarAccess.getOutputsAccess().getProducesKeyword_0_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUseCase.g:1863:1: rule__Outputs__Group_0_2__1 : rule__Outputs__Group_0_2__1__Impl rule__Outputs__Group_0_2__2 ;
    public final void rule__Outputs__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1867:1: ( rule__Outputs__Group_0_2__1__Impl rule__Outputs__Group_0_2__2 )
            // InternalUseCase.g:1868:2: rule__Outputs__Group_0_2__1__Impl rule__Outputs__Group_0_2__2
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
    // InternalUseCase.g:1875:1: rule__Outputs__Group_0_2__1__Impl : ( 'the' ) ;
    public final void rule__Outputs__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1879:1: ( ( 'the' ) )
            // InternalUseCase.g:1880:1: ( 'the' )
            {
            // InternalUseCase.g:1880:1: ( 'the' )
            // InternalUseCase.g:1881:2: 'the'
            {
             before(grammarAccess.getOutputsAccess().getTheKeyword_0_2_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalUseCase.g:1890:1: rule__Outputs__Group_0_2__2 : rule__Outputs__Group_0_2__2__Impl rule__Outputs__Group_0_2__3 ;
    public final void rule__Outputs__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1894:1: ( rule__Outputs__Group_0_2__2__Impl rule__Outputs__Group_0_2__3 )
            // InternalUseCase.g:1895:2: rule__Outputs__Group_0_2__2__Impl rule__Outputs__Group_0_2__3
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
    // InternalUseCase.g:1902:1: rule__Outputs__Group_0_2__2__Impl : ( 'following' ) ;
    public final void rule__Outputs__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1906:1: ( ( 'following' ) )
            // InternalUseCase.g:1907:1: ( 'following' )
            {
            // InternalUseCase.g:1907:1: ( 'following' )
            // InternalUseCase.g:1908:2: 'following'
            {
             before(grammarAccess.getOutputsAccess().getFollowingKeyword_0_2_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUseCase.g:1917:1: rule__Outputs__Group_0_2__3 : rule__Outputs__Group_0_2__3__Impl rule__Outputs__Group_0_2__4 ;
    public final void rule__Outputs__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1921:1: ( rule__Outputs__Group_0_2__3__Impl rule__Outputs__Group_0_2__4 )
            // InternalUseCase.g:1922:2: rule__Outputs__Group_0_2__3__Impl rule__Outputs__Group_0_2__4
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
    // InternalUseCase.g:1929:1: rule__Outputs__Group_0_2__3__Impl : ( 'output' ) ;
    public final void rule__Outputs__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1933:1: ( ( 'output' ) )
            // InternalUseCase.g:1934:1: ( 'output' )
            {
            // InternalUseCase.g:1934:1: ( 'output' )
            // InternalUseCase.g:1935:2: 'output'
            {
             before(grammarAccess.getOutputsAccess().getOutputKeyword_0_2_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUseCase.g:1944:1: rule__Outputs__Group_0_2__4 : rule__Outputs__Group_0_2__4__Impl ;
    public final void rule__Outputs__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1948:1: ( rule__Outputs__Group_0_2__4__Impl )
            // InternalUseCase.g:1949:2: rule__Outputs__Group_0_2__4__Impl
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
    // InternalUseCase.g:1955:1: rule__Outputs__Group_0_2__4__Impl : ( ':' ) ;
    public final void rule__Outputs__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1959:1: ( ( ':' ) )
            // InternalUseCase.g:1960:1: ( ':' )
            {
            // InternalUseCase.g:1960:1: ( ':' )
            // InternalUseCase.g:1961:2: ':'
            {
             before(grammarAccess.getOutputsAccess().getColonKeyword_0_2_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUseCase.g:1971:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1975:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalUseCase.g:1976:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalUseCase.g:1983:1: rule__Type__Group__0__Impl : ( '-' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1987:1: ( ( '-' ) )
            // InternalUseCase.g:1988:1: ( '-' )
            {
            // InternalUseCase.g:1988:1: ( '-' )
            // InternalUseCase.g:1989:2: '-'
            {
             before(grammarAccess.getTypeAccess().getHyphenMinusKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:1998:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2002:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalUseCase.g:2003:2: rule__Type__Group__1__Impl rule__Type__Group__2
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
    // InternalUseCase.g:2010:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2014:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalUseCase.g:2015:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalUseCase.g:2015:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalUseCase.g:2016:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalUseCase.g:2017:2: ( rule__Type__NameAssignment_1 )
            // InternalUseCase.g:2017:3: rule__Type__NameAssignment_1
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
    // InternalUseCase.g:2025:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2029:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalUseCase.g:2030:2: rule__Type__Group__2__Impl rule__Type__Group__3
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
    // InternalUseCase.g:2037:1: rule__Type__Group__2__Impl : ( '(' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2041:1: ( ( '(' ) )
            // InternalUseCase.g:2042:1: ( '(' )
            {
            // InternalUseCase.g:2042:1: ( '(' )
            // InternalUseCase.g:2043:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUseCase.g:2052:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2056:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalUseCase.g:2057:2: rule__Type__Group__3__Impl rule__Type__Group__4
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
    // InternalUseCase.g:2064:1: rule__Type__Group__3__Impl : ( ( rule__Type__DescriptionAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2068:1: ( ( ( rule__Type__DescriptionAssignment_3 ) ) )
            // InternalUseCase.g:2069:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            {
            // InternalUseCase.g:2069:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            // InternalUseCase.g:2070:2: ( rule__Type__DescriptionAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getDescriptionAssignment_3()); 
            // InternalUseCase.g:2071:2: ( rule__Type__DescriptionAssignment_3 )
            // InternalUseCase.g:2071:3: rule__Type__DescriptionAssignment_3
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
    // InternalUseCase.g:2079:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2083:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalUseCase.g:2084:2: rule__Type__Group__4__Impl rule__Type__Group__5
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
    // InternalUseCase.g:2091:1: rule__Type__Group__4__Impl : ( ')' ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2095:1: ( ( ')' ) )
            // InternalUseCase.g:2096:1: ( ')' )
            {
            // InternalUseCase.g:2096:1: ( ')' )
            // InternalUseCase.g:2097:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUseCase.g:2106:1: rule__Type__Group__5 : rule__Type__Group__5__Impl ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2110:1: ( rule__Type__Group__5__Impl )
            // InternalUseCase.g:2111:2: rule__Type__Group__5__Impl
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
    // InternalUseCase.g:2117:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )? ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2121:1: ( ( ( rule__Type__Group_5__0 )? ) )
            // InternalUseCase.g:2122:1: ( ( rule__Type__Group_5__0 )? )
            {
            // InternalUseCase.g:2122:1: ( ( rule__Type__Group_5__0 )? )
            // InternalUseCase.g:2123:2: ( rule__Type__Group_5__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // InternalUseCase.g:2124:2: ( rule__Type__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCase.g:2124:3: rule__Type__Group_5__0
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
    // InternalUseCase.g:2133:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2137:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalUseCase.g:2138:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
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
    // InternalUseCase.g:2145:1: rule__Type__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2149:1: ( ( '[' ) )
            // InternalUseCase.g:2150:1: ( '[' )
            {
            // InternalUseCase.g:2150:1: ( '[' )
            // InternalUseCase.g:2151:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUseCase.g:2160:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2164:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalUseCase.g:2165:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
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
    // InternalUseCase.g:2172:1: rule__Type__Group_5__1__Impl : ( ( rule__Type__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2176:1: ( ( ( rule__Type__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:2177:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:2177:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:2178:2: ( rule__Type__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getTypeAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:2179:2: ( rule__Type__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:2179:3: rule__Type__ImportInfoAssignment_5_1
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
    // InternalUseCase.g:2187:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2191:1: ( rule__Type__Group_5__2__Impl )
            // InternalUseCase.g:2192:2: rule__Type__Group_5__2__Impl
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
    // InternalUseCase.g:2198:1: rule__Type__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2202:1: ( ( ']' ) )
            // InternalUseCase.g:2203:1: ( ']' )
            {
            // InternalUseCase.g:2203:1: ( ']' )
            // InternalUseCase.g:2204:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUseCase.g:2214:1: rule__ExceptionDecleration__Group__0 : rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 ;
    public final void rule__ExceptionDecleration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2218:1: ( rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1 )
            // InternalUseCase.g:2219:2: rule__ExceptionDecleration__Group__0__Impl rule__ExceptionDecleration__Group__1
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
    // InternalUseCase.g:2226:1: rule__ExceptionDecleration__Group__0__Impl : ( '-' ) ;
    public final void rule__ExceptionDecleration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2230:1: ( ( '-' ) )
            // InternalUseCase.g:2231:1: ( '-' )
            {
            // InternalUseCase.g:2231:1: ( '-' )
            // InternalUseCase.g:2232:2: '-'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:2241:1: rule__ExceptionDecleration__Group__1 : rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 ;
    public final void rule__ExceptionDecleration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2245:1: ( rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2 )
            // InternalUseCase.g:2246:2: rule__ExceptionDecleration__Group__1__Impl rule__ExceptionDecleration__Group__2
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
    // InternalUseCase.g:2253:1: rule__ExceptionDecleration__Group__1__Impl : ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) ;
    public final void rule__ExceptionDecleration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2257:1: ( ( ( rule__ExceptionDecleration__NameAssignment_1 ) ) )
            // InternalUseCase.g:2258:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            {
            // InternalUseCase.g:2258:1: ( ( rule__ExceptionDecleration__NameAssignment_1 ) )
            // InternalUseCase.g:2259:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getNameAssignment_1()); 
            // InternalUseCase.g:2260:2: ( rule__ExceptionDecleration__NameAssignment_1 )
            // InternalUseCase.g:2260:3: rule__ExceptionDecleration__NameAssignment_1
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
    // InternalUseCase.g:2268:1: rule__ExceptionDecleration__Group__2 : rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 ;
    public final void rule__ExceptionDecleration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2272:1: ( rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3 )
            // InternalUseCase.g:2273:2: rule__ExceptionDecleration__Group__2__Impl rule__ExceptionDecleration__Group__3
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
    // InternalUseCase.g:2280:1: rule__ExceptionDecleration__Group__2__Impl : ( '(' ) ;
    public final void rule__ExceptionDecleration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2284:1: ( ( '(' ) )
            // InternalUseCase.g:2285:1: ( '(' )
            {
            // InternalUseCase.g:2285:1: ( '(' )
            // InternalUseCase.g:2286:2: '('
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUseCase.g:2295:1: rule__ExceptionDecleration__Group__3 : rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4 ;
    public final void rule__ExceptionDecleration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2299:1: ( rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4 )
            // InternalUseCase.g:2300:2: rule__ExceptionDecleration__Group__3__Impl rule__ExceptionDecleration__Group__4
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
    // InternalUseCase.g:2307:1: rule__ExceptionDecleration__Group__3__Impl : ( ( rule__ExceptionDecleration__MessageAssignment_3 ) ) ;
    public final void rule__ExceptionDecleration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2311:1: ( ( ( rule__ExceptionDecleration__MessageAssignment_3 ) ) )
            // InternalUseCase.g:2312:1: ( ( rule__ExceptionDecleration__MessageAssignment_3 ) )
            {
            // InternalUseCase.g:2312:1: ( ( rule__ExceptionDecleration__MessageAssignment_3 ) )
            // InternalUseCase.g:2313:2: ( rule__ExceptionDecleration__MessageAssignment_3 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getMessageAssignment_3()); 
            // InternalUseCase.g:2314:2: ( rule__ExceptionDecleration__MessageAssignment_3 )
            // InternalUseCase.g:2314:3: rule__ExceptionDecleration__MessageAssignment_3
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
    // InternalUseCase.g:2322:1: rule__ExceptionDecleration__Group__4 : rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5 ;
    public final void rule__ExceptionDecleration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2326:1: ( rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5 )
            // InternalUseCase.g:2327:2: rule__ExceptionDecleration__Group__4__Impl rule__ExceptionDecleration__Group__5
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
    // InternalUseCase.g:2334:1: rule__ExceptionDecleration__Group__4__Impl : ( ')' ) ;
    public final void rule__ExceptionDecleration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2338:1: ( ( ')' ) )
            // InternalUseCase.g:2339:1: ( ')' )
            {
            // InternalUseCase.g:2339:1: ( ')' )
            // InternalUseCase.g:2340:2: ')'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUseCase.g:2349:1: rule__ExceptionDecleration__Group__5 : rule__ExceptionDecleration__Group__5__Impl ;
    public final void rule__ExceptionDecleration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2353:1: ( rule__ExceptionDecleration__Group__5__Impl )
            // InternalUseCase.g:2354:2: rule__ExceptionDecleration__Group__5__Impl
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
    // InternalUseCase.g:2360:1: rule__ExceptionDecleration__Group__5__Impl : ( ( rule__ExceptionDecleration__Group_5__0 )? ) ;
    public final void rule__ExceptionDecleration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2364:1: ( ( ( rule__ExceptionDecleration__Group_5__0 )? ) )
            // InternalUseCase.g:2365:1: ( ( rule__ExceptionDecleration__Group_5__0 )? )
            {
            // InternalUseCase.g:2365:1: ( ( rule__ExceptionDecleration__Group_5__0 )? )
            // InternalUseCase.g:2366:2: ( rule__ExceptionDecleration__Group_5__0 )?
            {
             before(grammarAccess.getExceptionDeclerationAccess().getGroup_5()); 
            // InternalUseCase.g:2367:2: ( rule__ExceptionDecleration__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCase.g:2367:3: rule__ExceptionDecleration__Group_5__0
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
    // InternalUseCase.g:2376:1: rule__ExceptionDecleration__Group_5__0 : rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1 ;
    public final void rule__ExceptionDecleration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2380:1: ( rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1 )
            // InternalUseCase.g:2381:2: rule__ExceptionDecleration__Group_5__0__Impl rule__ExceptionDecleration__Group_5__1
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
    // InternalUseCase.g:2388:1: rule__ExceptionDecleration__Group_5__0__Impl : ( '[' ) ;
    public final void rule__ExceptionDecleration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2392:1: ( ( '[' ) )
            // InternalUseCase.g:2393:1: ( '[' )
            {
            // InternalUseCase.g:2393:1: ( '[' )
            // InternalUseCase.g:2394:2: '['
            {
             before(grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUseCase.g:2403:1: rule__ExceptionDecleration__Group_5__1 : rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2 ;
    public final void rule__ExceptionDecleration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2407:1: ( rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2 )
            // InternalUseCase.g:2408:2: rule__ExceptionDecleration__Group_5__1__Impl rule__ExceptionDecleration__Group_5__2
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
    // InternalUseCase.g:2415:1: rule__ExceptionDecleration__Group_5__1__Impl : ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__ExceptionDecleration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2419:1: ( ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:2420:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:2420:1: ( ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:2421:2: ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getExceptionDeclerationAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:2422:2: ( rule__ExceptionDecleration__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:2422:3: rule__ExceptionDecleration__ImportInfoAssignment_5_1
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
    // InternalUseCase.g:2430:1: rule__ExceptionDecleration__Group_5__2 : rule__ExceptionDecleration__Group_5__2__Impl ;
    public final void rule__ExceptionDecleration__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2434:1: ( rule__ExceptionDecleration__Group_5__2__Impl )
            // InternalUseCase.g:2435:2: rule__ExceptionDecleration__Group_5__2__Impl
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
    // InternalUseCase.g:2441:1: rule__ExceptionDecleration__Group_5__2__Impl : ( ']' ) ;
    public final void rule__ExceptionDecleration__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2445:1: ( ( ']' ) )
            // InternalUseCase.g:2446:1: ( ']' )
            {
            // InternalUseCase.g:2446:1: ( ']' )
            // InternalUseCase.g:2447:2: ']'
            {
             before(grammarAccess.getExceptionDeclerationAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUseCase.g:2457:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2461:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalUseCase.g:2462:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalUseCase.g:2469:1: rule__Input__Group__0__Impl : ( ( rule__Input__ManyAssignment_0 )? ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2473:1: ( ( ( rule__Input__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2474:1: ( ( rule__Input__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2474:1: ( ( rule__Input__ManyAssignment_0 )? )
            // InternalUseCase.g:2475:2: ( rule__Input__ManyAssignment_0 )?
            {
             before(grammarAccess.getInputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2476:2: ( rule__Input__ManyAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCase.g:2476:3: rule__Input__ManyAssignment_0
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
    // InternalUseCase.g:2484:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2488:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalUseCase.g:2489:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalUseCase.g:2496:1: rule__Input__Group__1__Impl : ( '-' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2500:1: ( ( '-' ) )
            // InternalUseCase.g:2501:1: ( '-' )
            {
            // InternalUseCase.g:2501:1: ( '-' )
            // InternalUseCase.g:2502:2: '-'
            {
             before(grammarAccess.getInputAccess().getHyphenMinusKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:2511:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2515:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalUseCase.g:2516:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalUseCase.g:2523:1: rule__Input__Group__2__Impl : ( ( rule__Input__ContentAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2527:1: ( ( ( rule__Input__ContentAssignment_2 ) ) )
            // InternalUseCase.g:2528:1: ( ( rule__Input__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:2528:1: ( ( rule__Input__ContentAssignment_2 ) )
            // InternalUseCase.g:2529:2: ( rule__Input__ContentAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:2530:2: ( rule__Input__ContentAssignment_2 )
            // InternalUseCase.g:2530:3: rule__Input__ContentAssignment_2
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
    // InternalUseCase.g:2538:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2542:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalUseCase.g:2543:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalUseCase.g:2550:1: rule__Input__Group__3__Impl : ( ( rule__Input__Group_3__0 )? ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2554:1: ( ( ( rule__Input__Group_3__0 )? ) )
            // InternalUseCase.g:2555:1: ( ( rule__Input__Group_3__0 )? )
            {
            // InternalUseCase.g:2555:1: ( ( rule__Input__Group_3__0 )? )
            // InternalUseCase.g:2556:2: ( rule__Input__Group_3__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_3()); 
            // InternalUseCase.g:2557:2: ( rule__Input__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:2557:3: rule__Input__Group_3__0
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
    // InternalUseCase.g:2565:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2569:1: ( rule__Input__Group__4__Impl )
            // InternalUseCase.g:2570:2: rule__Input__Group__4__Impl
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
    // InternalUseCase.g:2576:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2580:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalUseCase.g:2581:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalUseCase.g:2581:1: ( ( rule__Input__Group_4__0 )? )
            // InternalUseCase.g:2582:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalUseCase.g:2583:2: ( rule__Input__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:2583:3: rule__Input__Group_4__0
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
    // InternalUseCase.g:2592:1: rule__Input__Group_3__0 : rule__Input__Group_3__0__Impl rule__Input__Group_3__1 ;
    public final void rule__Input__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2596:1: ( rule__Input__Group_3__0__Impl rule__Input__Group_3__1 )
            // InternalUseCase.g:2597:2: rule__Input__Group_3__0__Impl rule__Input__Group_3__1
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
    // InternalUseCase.g:2604:1: rule__Input__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Input__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2608:1: ( ( 'as' ) )
            // InternalUseCase.g:2609:1: ( 'as' )
            {
            // InternalUseCase.g:2609:1: ( 'as' )
            // InternalUseCase.g:2610:2: 'as'
            {
             before(grammarAccess.getInputAccess().getAsKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUseCase.g:2619:1: rule__Input__Group_3__1 : rule__Input__Group_3__1__Impl ;
    public final void rule__Input__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2623:1: ( rule__Input__Group_3__1__Impl )
            // InternalUseCase.g:2624:2: rule__Input__Group_3__1__Impl
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
    // InternalUseCase.g:2630:1: rule__Input__Group_3__1__Impl : ( ( rule__Input__TypeAssignment_3_1 ) ) ;
    public final void rule__Input__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2634:1: ( ( ( rule__Input__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:2635:1: ( ( rule__Input__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:2635:1: ( ( rule__Input__TypeAssignment_3_1 ) )
            // InternalUseCase.g:2636:2: ( rule__Input__TypeAssignment_3_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:2637:2: ( rule__Input__TypeAssignment_3_1 )
            // InternalUseCase.g:2637:3: rule__Input__TypeAssignment_3_1
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
    // InternalUseCase.g:2646:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2650:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalUseCase.g:2651:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
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
    // InternalUseCase.g:2658:1: rule__Input__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2662:1: ( ( '(' ) )
            // InternalUseCase.g:2663:1: ( '(' )
            {
            // InternalUseCase.g:2663:1: ( '(' )
            // InternalUseCase.g:2664:2: '('
            {
             before(grammarAccess.getInputAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUseCase.g:2673:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl rule__Input__Group_4__2 ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2677:1: ( rule__Input__Group_4__1__Impl rule__Input__Group_4__2 )
            // InternalUseCase.g:2678:2: rule__Input__Group_4__1__Impl rule__Input__Group_4__2
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
    // InternalUseCase.g:2685:1: rule__Input__Group_4__1__Impl : ( 'e.g' ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2689:1: ( ( 'e.g' ) )
            // InternalUseCase.g:2690:1: ( 'e.g' )
            {
            // InternalUseCase.g:2690:1: ( 'e.g' )
            // InternalUseCase.g:2691:2: 'e.g'
            {
             before(grammarAccess.getInputAccess().getEGKeyword_4_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUseCase.g:2700:1: rule__Input__Group_4__2 : rule__Input__Group_4__2__Impl rule__Input__Group_4__3 ;
    public final void rule__Input__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2704:1: ( rule__Input__Group_4__2__Impl rule__Input__Group_4__3 )
            // InternalUseCase.g:2705:2: rule__Input__Group_4__2__Impl rule__Input__Group_4__3
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
    // InternalUseCase.g:2712:1: rule__Input__Group_4__2__Impl : ( ( rule__Input__ExampleAssignment_4_2 ) ) ;
    public final void rule__Input__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2716:1: ( ( ( rule__Input__ExampleAssignment_4_2 ) ) )
            // InternalUseCase.g:2717:1: ( ( rule__Input__ExampleAssignment_4_2 ) )
            {
            // InternalUseCase.g:2717:1: ( ( rule__Input__ExampleAssignment_4_2 ) )
            // InternalUseCase.g:2718:2: ( rule__Input__ExampleAssignment_4_2 )
            {
             before(grammarAccess.getInputAccess().getExampleAssignment_4_2()); 
            // InternalUseCase.g:2719:2: ( rule__Input__ExampleAssignment_4_2 )
            // InternalUseCase.g:2719:3: rule__Input__ExampleAssignment_4_2
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
    // InternalUseCase.g:2727:1: rule__Input__Group_4__3 : rule__Input__Group_4__3__Impl ;
    public final void rule__Input__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2731:1: ( rule__Input__Group_4__3__Impl )
            // InternalUseCase.g:2732:2: rule__Input__Group_4__3__Impl
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
    // InternalUseCase.g:2738:1: rule__Input__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Input__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2742:1: ( ( ')' ) )
            // InternalUseCase.g:2743:1: ( ')' )
            {
            // InternalUseCase.g:2743:1: ( ')' )
            // InternalUseCase.g:2744:2: ')'
            {
             before(grammarAccess.getInputAccess().getRightParenthesisKeyword_4_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUseCase.g:2754:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2758:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalUseCase.g:2759:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalUseCase.g:2766:1: rule__Output__Group__0__Impl : ( ( rule__Output__ManyAssignment_0 )? ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2770:1: ( ( ( rule__Output__ManyAssignment_0 )? ) )
            // InternalUseCase.g:2771:1: ( ( rule__Output__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:2771:1: ( ( rule__Output__ManyAssignment_0 )? )
            // InternalUseCase.g:2772:2: ( rule__Output__ManyAssignment_0 )?
            {
             before(grammarAccess.getOutputAccess().getManyAssignment_0()); 
            // InternalUseCase.g:2773:2: ( rule__Output__ManyAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:2773:3: rule__Output__ManyAssignment_0
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
    // InternalUseCase.g:2781:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2785:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalUseCase.g:2786:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalUseCase.g:2793:1: rule__Output__Group__1__Impl : ( '-' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2797:1: ( ( '-' ) )
            // InternalUseCase.g:2798:1: ( '-' )
            {
            // InternalUseCase.g:2798:1: ( '-' )
            // InternalUseCase.g:2799:2: '-'
            {
             before(grammarAccess.getOutputAccess().getHyphenMinusKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:2808:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2812:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalUseCase.g:2813:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalUseCase.g:2820:1: rule__Output__Group__2__Impl : ( ( rule__Output__ContentAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2824:1: ( ( ( rule__Output__ContentAssignment_2 ) ) )
            // InternalUseCase.g:2825:1: ( ( rule__Output__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:2825:1: ( ( rule__Output__ContentAssignment_2 ) )
            // InternalUseCase.g:2826:2: ( rule__Output__ContentAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getContentAssignment_2()); 
            // InternalUseCase.g:2827:2: ( rule__Output__ContentAssignment_2 )
            // InternalUseCase.g:2827:3: rule__Output__ContentAssignment_2
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
    // InternalUseCase.g:2835:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2839:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalUseCase.g:2840:2: rule__Output__Group__3__Impl rule__Output__Group__4
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
    // InternalUseCase.g:2847:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2851:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalUseCase.g:2852:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalUseCase.g:2852:1: ( ( rule__Output__Group_3__0 )? )
            // InternalUseCase.g:2853:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalUseCase.g:2854:2: ( rule__Output__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:2854:3: rule__Output__Group_3__0
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
    // InternalUseCase.g:2862:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2866:1: ( rule__Output__Group__4__Impl )
            // InternalUseCase.g:2867:2: rule__Output__Group__4__Impl
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
    // InternalUseCase.g:2873:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2877:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalUseCase.g:2878:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalUseCase.g:2878:1: ( ( rule__Output__Group_4__0 )? )
            // InternalUseCase.g:2879:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalUseCase.g:2880:2: ( rule__Output__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCase.g:2880:3: rule__Output__Group_4__0
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
    // InternalUseCase.g:2889:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2893:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalUseCase.g:2894:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
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
    // InternalUseCase.g:2901:1: rule__Output__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2905:1: ( ( 'as' ) )
            // InternalUseCase.g:2906:1: ( 'as' )
            {
            // InternalUseCase.g:2906:1: ( 'as' )
            // InternalUseCase.g:2907:2: 'as'
            {
             before(grammarAccess.getOutputAccess().getAsKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUseCase.g:2916:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2920:1: ( rule__Output__Group_3__1__Impl )
            // InternalUseCase.g:2921:2: rule__Output__Group_3__1__Impl
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
    // InternalUseCase.g:2927:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2931:1: ( ( ( rule__Output__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:2932:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:2932:1: ( ( rule__Output__TypeAssignment_3_1 ) )
            // InternalUseCase.g:2933:2: ( rule__Output__TypeAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:2934:2: ( rule__Output__TypeAssignment_3_1 )
            // InternalUseCase.g:2934:3: rule__Output__TypeAssignment_3_1
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
    // InternalUseCase.g:2943:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2947:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalUseCase.g:2948:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
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
    // InternalUseCase.g:2955:1: rule__Output__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2959:1: ( ( '(' ) )
            // InternalUseCase.g:2960:1: ( '(' )
            {
            // InternalUseCase.g:2960:1: ( '(' )
            // InternalUseCase.g:2961:2: '('
            {
             before(grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUseCase.g:2970:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl rule__Output__Group_4__2 ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2974:1: ( rule__Output__Group_4__1__Impl rule__Output__Group_4__2 )
            // InternalUseCase.g:2975:2: rule__Output__Group_4__1__Impl rule__Output__Group_4__2
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
    // InternalUseCase.g:2982:1: rule__Output__Group_4__1__Impl : ( 'e.g' ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:2986:1: ( ( 'e.g' ) )
            // InternalUseCase.g:2987:1: ( 'e.g' )
            {
            // InternalUseCase.g:2987:1: ( 'e.g' )
            // InternalUseCase.g:2988:2: 'e.g'
            {
             before(grammarAccess.getOutputAccess().getEGKeyword_4_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUseCase.g:2997:1: rule__Output__Group_4__2 : rule__Output__Group_4__2__Impl rule__Output__Group_4__3 ;
    public final void rule__Output__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3001:1: ( rule__Output__Group_4__2__Impl rule__Output__Group_4__3 )
            // InternalUseCase.g:3002:2: rule__Output__Group_4__2__Impl rule__Output__Group_4__3
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
    // InternalUseCase.g:3009:1: rule__Output__Group_4__2__Impl : ( ( rule__Output__ExampleAssignment_4_2 ) ) ;
    public final void rule__Output__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3013:1: ( ( ( rule__Output__ExampleAssignment_4_2 ) ) )
            // InternalUseCase.g:3014:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            {
            // InternalUseCase.g:3014:1: ( ( rule__Output__ExampleAssignment_4_2 ) )
            // InternalUseCase.g:3015:2: ( rule__Output__ExampleAssignment_4_2 )
            {
             before(grammarAccess.getOutputAccess().getExampleAssignment_4_2()); 
            // InternalUseCase.g:3016:2: ( rule__Output__ExampleAssignment_4_2 )
            // InternalUseCase.g:3016:3: rule__Output__ExampleAssignment_4_2
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
    // InternalUseCase.g:3024:1: rule__Output__Group_4__3 : rule__Output__Group_4__3__Impl ;
    public final void rule__Output__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3028:1: ( rule__Output__Group_4__3__Impl )
            // InternalUseCase.g:3029:2: rule__Output__Group_4__3__Impl
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
    // InternalUseCase.g:3035:1: rule__Output__Group_4__3__Impl : ( ')' ) ;
    public final void rule__Output__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3039:1: ( ( ')' ) )
            // InternalUseCase.g:3040:1: ( ')' )
            {
            // InternalUseCase.g:3040:1: ( ')' )
            // InternalUseCase.g:3041:2: ')'
            {
             before(grammarAccess.getOutputAccess().getRightParenthesisKeyword_4_3()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUseCase.g:3051:1: rule__AllowedUserGroups__Group__0 : rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 ;
    public final void rule__AllowedUserGroups__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3055:1: ( rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1 )
            // InternalUseCase.g:3056:2: rule__AllowedUserGroups__Group__0__Impl rule__AllowedUserGroups__Group__1
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
    // InternalUseCase.g:3063:1: rule__AllowedUserGroups__Group__0__Impl : ( 'allowed-usergroups:' ) ;
    public final void rule__AllowedUserGroups__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3067:1: ( ( 'allowed-usergroups:' ) )
            // InternalUseCase.g:3068:1: ( 'allowed-usergroups:' )
            {
            // InternalUseCase.g:3068:1: ( 'allowed-usergroups:' )
            // InternalUseCase.g:3069:2: 'allowed-usergroups:'
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUseCase.g:3078:1: rule__AllowedUserGroups__Group__1 : rule__AllowedUserGroups__Group__1__Impl ;
    public final void rule__AllowedUserGroups__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3082:1: ( rule__AllowedUserGroups__Group__1__Impl )
            // InternalUseCase.g:3083:2: rule__AllowedUserGroups__Group__1__Impl
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
    // InternalUseCase.g:3089:1: rule__AllowedUserGroups__Group__1__Impl : ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) ;
    public final void rule__AllowedUserGroups__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3093:1: ( ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* ) )
            // InternalUseCase.g:3094:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            {
            // InternalUseCase.g:3094:1: ( ( rule__AllowedUserGroups__GroupsAssignment_1 )* )
            // InternalUseCase.g:3095:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            {
             before(grammarAccess.getAllowedUserGroupsAccess().getGroupsAssignment_1()); 
            // InternalUseCase.g:3096:2: ( rule__AllowedUserGroups__GroupsAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37||LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUseCase.g:3096:3: rule__AllowedUserGroups__GroupsAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__AllowedUserGroups__GroupsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalUseCase.g:3105:1: rule__AllowedUserGroup__Group__0 : rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 ;
    public final void rule__AllowedUserGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3109:1: ( rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1 )
            // InternalUseCase.g:3110:2: rule__AllowedUserGroup__Group__0__Impl rule__AllowedUserGroup__Group__1
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
    // InternalUseCase.g:3117:1: rule__AllowedUserGroup__Group__0__Impl : ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) ;
    public final void rule__AllowedUserGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3121:1: ( ( ( rule__AllowedUserGroup__ManyAssignment_0 )? ) )
            // InternalUseCase.g:3122:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:3122:1: ( ( rule__AllowedUserGroup__ManyAssignment_0 )? )
            // InternalUseCase.g:3123:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyAssignment_0()); 
            // InternalUseCase.g:3124:2: ( rule__AllowedUserGroup__ManyAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUseCase.g:3124:3: rule__AllowedUserGroup__ManyAssignment_0
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
    // InternalUseCase.g:3132:1: rule__AllowedUserGroup__Group__1 : rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 ;
    public final void rule__AllowedUserGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3136:1: ( rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2 )
            // InternalUseCase.g:3137:2: rule__AllowedUserGroup__Group__1__Impl rule__AllowedUserGroup__Group__2
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
    // InternalUseCase.g:3144:1: rule__AllowedUserGroup__Group__1__Impl : ( '-' ) ;
    public final void rule__AllowedUserGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3148:1: ( ( '-' ) )
            // InternalUseCase.g:3149:1: ( '-' )
            {
            // InternalUseCase.g:3149:1: ( '-' )
            // InternalUseCase.g:3150:2: '-'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUseCase.g:3159:1: rule__AllowedUserGroup__Group__2 : rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 ;
    public final void rule__AllowedUserGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3163:1: ( rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3 )
            // InternalUseCase.g:3164:2: rule__AllowedUserGroup__Group__2__Impl rule__AllowedUserGroup__Group__3
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
    // InternalUseCase.g:3171:1: rule__AllowedUserGroup__Group__2__Impl : ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) ;
    public final void rule__AllowedUserGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3175:1: ( ( ( rule__AllowedUserGroup__NameAssignment_2 ) ) )
            // InternalUseCase.g:3176:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            {
            // InternalUseCase.g:3176:1: ( ( rule__AllowedUserGroup__NameAssignment_2 ) )
            // InternalUseCase.g:3177:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getNameAssignment_2()); 
            // InternalUseCase.g:3178:2: ( rule__AllowedUserGroup__NameAssignment_2 )
            // InternalUseCase.g:3178:3: rule__AllowedUserGroup__NameAssignment_2
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
    // InternalUseCase.g:3186:1: rule__AllowedUserGroup__Group__3 : rule__AllowedUserGroup__Group__3__Impl ;
    public final void rule__AllowedUserGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3190:1: ( rule__AllowedUserGroup__Group__3__Impl )
            // InternalUseCase.g:3191:2: rule__AllowedUserGroup__Group__3__Impl
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
    // InternalUseCase.g:3197:1: rule__AllowedUserGroup__Group__3__Impl : ( ( rule__AllowedUserGroup__Group_3__0 )? ) ;
    public final void rule__AllowedUserGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3201:1: ( ( ( rule__AllowedUserGroup__Group_3__0 )? ) )
            // InternalUseCase.g:3202:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            {
            // InternalUseCase.g:3202:1: ( ( rule__AllowedUserGroup__Group_3__0 )? )
            // InternalUseCase.g:3203:2: ( rule__AllowedUserGroup__Group_3__0 )?
            {
             before(grammarAccess.getAllowedUserGroupAccess().getGroup_3()); 
            // InternalUseCase.g:3204:2: ( rule__AllowedUserGroup__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUseCase.g:3204:3: rule__AllowedUserGroup__Group_3__0
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
    // InternalUseCase.g:3213:1: rule__AllowedUserGroup__Group_3__0 : rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 ;
    public final void rule__AllowedUserGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3217:1: ( rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1 )
            // InternalUseCase.g:3218:2: rule__AllowedUserGroup__Group_3__0__Impl rule__AllowedUserGroup__Group_3__1
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
    // InternalUseCase.g:3225:1: rule__AllowedUserGroup__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__AllowedUserGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3229:1: ( ( 'as' ) )
            // InternalUseCase.g:3230:1: ( 'as' )
            {
            // InternalUseCase.g:3230:1: ( 'as' )
            // InternalUseCase.g:3231:2: 'as'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUseCase.g:3240:1: rule__AllowedUserGroup__Group_3__1 : rule__AllowedUserGroup__Group_3__1__Impl ;
    public final void rule__AllowedUserGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3244:1: ( rule__AllowedUserGroup__Group_3__1__Impl )
            // InternalUseCase.g:3245:2: rule__AllowedUserGroup__Group_3__1__Impl
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
    // InternalUseCase.g:3251:1: rule__AllowedUserGroup__Group_3__1__Impl : ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) ;
    public final void rule__AllowedUserGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3255:1: ( ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:3256:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:3256:1: ( ( rule__AllowedUserGroup__TypeAssignment_3_1 ) )
            // InternalUseCase.g:3257:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:3258:2: ( rule__AllowedUserGroup__TypeAssignment_3_1 )
            // InternalUseCase.g:3258:3: rule__AllowedUserGroup__TypeAssignment_3_1
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
    // InternalUseCase.g:3267:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3271:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUseCase.g:3272:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalUseCase.g:3279:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3283:1: ( ( RULE_ID ) )
            // InternalUseCase.g:3284:1: ( RULE_ID )
            {
            // InternalUseCase.g:3284:1: ( RULE_ID )
            // InternalUseCase.g:3285:2: RULE_ID
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
    // InternalUseCase.g:3294:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3298:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUseCase.g:3299:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUseCase.g:3305:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3309:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUseCase.g:3310:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUseCase.g:3310:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUseCase.g:3311:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUseCase.g:3312:2: ( rule__QualifiedName__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==25) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUseCase.g:3312:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalUseCase.g:3321:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3325:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUseCase.g:3326:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalUseCase.g:3333:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3337:1: ( ( '.' ) )
            // InternalUseCase.g:3338:1: ( '.' )
            {
            // InternalUseCase.g:3338:1: ( '.' )
            // InternalUseCase.g:3339:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUseCase.g:3348:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3352:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUseCase.g:3353:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUseCase.g:3359:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3363:1: ( ( RULE_ID ) )
            // InternalUseCase.g:3364:1: ( RULE_ID )
            {
            // InternalUseCase.g:3364:1: ( RULE_ID )
            // InternalUseCase.g:3365:2: RULE_ID
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
    // InternalUseCase.g:3375:1: rule__QualifiedNumber__Group__0 : rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 ;
    public final void rule__QualifiedNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3379:1: ( rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1 )
            // InternalUseCase.g:3380:2: rule__QualifiedNumber__Group__0__Impl rule__QualifiedNumber__Group__1
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
    // InternalUseCase.g:3387:1: rule__QualifiedNumber__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3391:1: ( ( RULE_INT ) )
            // InternalUseCase.g:3392:1: ( RULE_INT )
            {
            // InternalUseCase.g:3392:1: ( RULE_INT )
            // InternalUseCase.g:3393:2: RULE_INT
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
    // InternalUseCase.g:3402:1: rule__QualifiedNumber__Group__1 : rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 ;
    public final void rule__QualifiedNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3406:1: ( rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2 )
            // InternalUseCase.g:3407:2: rule__QualifiedNumber__Group__1__Impl rule__QualifiedNumber__Group__2
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
    // InternalUseCase.g:3414:1: rule__QualifiedNumber__Group__1__Impl : ( ( rule__QualifiedNumber__Group_1__0 )* ) ;
    public final void rule__QualifiedNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3418:1: ( ( ( rule__QualifiedNumber__Group_1__0 )* ) )
            // InternalUseCase.g:3419:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            {
            // InternalUseCase.g:3419:1: ( ( rule__QualifiedNumber__Group_1__0 )* )
            // InternalUseCase.g:3420:2: ( rule__QualifiedNumber__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNumberAccess().getGroup_1()); 
            // InternalUseCase.g:3421:2: ( rule__QualifiedNumber__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_INT) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalUseCase.g:3421:3: rule__QualifiedNumber__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__QualifiedNumber__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalUseCase.g:3429:1: rule__QualifiedNumber__Group__2 : rule__QualifiedNumber__Group__2__Impl ;
    public final void rule__QualifiedNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3433:1: ( rule__QualifiedNumber__Group__2__Impl )
            // InternalUseCase.g:3434:2: rule__QualifiedNumber__Group__2__Impl
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
    // InternalUseCase.g:3440:1: rule__QualifiedNumber__Group__2__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3444:1: ( ( '.' ) )
            // InternalUseCase.g:3445:1: ( '.' )
            {
            // InternalUseCase.g:3445:1: ( '.' )
            // InternalUseCase.g:3446:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUseCase.g:3456:1: rule__QualifiedNumber__Group_1__0 : rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 ;
    public final void rule__QualifiedNumber__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3460:1: ( rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1 )
            // InternalUseCase.g:3461:2: rule__QualifiedNumber__Group_1__0__Impl rule__QualifiedNumber__Group_1__1
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
    // InternalUseCase.g:3468:1: rule__QualifiedNumber__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNumber__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3472:1: ( ( '.' ) )
            // InternalUseCase.g:3473:1: ( '.' )
            {
            // InternalUseCase.g:3473:1: ( '.' )
            // InternalUseCase.g:3474:2: '.'
            {
             before(grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUseCase.g:3483:1: rule__QualifiedNumber__Group_1__1 : rule__QualifiedNumber__Group_1__1__Impl ;
    public final void rule__QualifiedNumber__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3487:1: ( rule__QualifiedNumber__Group_1__1__Impl )
            // InternalUseCase.g:3488:2: rule__QualifiedNumber__Group_1__1__Impl
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
    // InternalUseCase.g:3494:1: rule__QualifiedNumber__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__QualifiedNumber__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3498:1: ( ( RULE_INT ) )
            // InternalUseCase.g:3499:1: ( RULE_INT )
            {
            // InternalUseCase.g:3499:1: ( RULE_INT )
            // InternalUseCase.g:3500:2: RULE_INT
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
    // InternalUseCase.g:3510:1: rule__Model__UseCasesAssignment_0 : ( ruleUseCase ) ;
    public final void rule__Model__UseCasesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3514:1: ( ( ruleUseCase ) )
            // InternalUseCase.g:3515:2: ( ruleUseCase )
            {
            // InternalUseCase.g:3515:2: ( ruleUseCase )
            // InternalUseCase.g:3516:3: ruleUseCase
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
    // InternalUseCase.g:3525:1: rule__Model__TypesAssignment_1 : ( ruleUsedTypes ) ;
    public final void rule__Model__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3529:1: ( ( ruleUsedTypes ) )
            // InternalUseCase.g:3530:2: ( ruleUsedTypes )
            {
            // InternalUseCase.g:3530:2: ( ruleUsedTypes )
            // InternalUseCase.g:3531:3: ruleUsedTypes
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
    // InternalUseCase.g:3540:1: rule__Model__ExceptionsAssignment_2 : ( ruleUsedExceptions ) ;
    public final void rule__Model__ExceptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3544:1: ( ( ruleUsedExceptions ) )
            // InternalUseCase.g:3545:2: ( ruleUsedExceptions )
            {
            // InternalUseCase.g:3545:2: ( ruleUsedExceptions )
            // InternalUseCase.g:3546:3: ruleUsedExceptions
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
    // InternalUseCase.g:3555:1: rule__UseCase__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3559:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3560:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3560:2: ( RULE_STRING )
            // InternalUseCase.g:3561:3: RULE_STRING
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
    // InternalUseCase.g:3570:1: rule__UseCase__DescriptionsAssignment_2 : ( ruleDescription ) ;
    public final void rule__UseCase__DescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3574:1: ( ( ruleDescription ) )
            // InternalUseCase.g:3575:2: ( ruleDescription )
            {
            // InternalUseCase.g:3575:2: ( ruleDescription )
            // InternalUseCase.g:3576:3: ruleDescription
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
    // InternalUseCase.g:3585:1: rule__UseCase__AllowedUserGroupsAssignment_3 : ( ruleAllowedUserGroups ) ;
    public final void rule__UseCase__AllowedUserGroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3589:1: ( ( ruleAllowedUserGroups ) )
            // InternalUseCase.g:3590:2: ( ruleAllowedUserGroups )
            {
            // InternalUseCase.g:3590:2: ( ruleAllowedUserGroups )
            // InternalUseCase.g:3591:3: ruleAllowedUserGroups
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
    // InternalUseCase.g:3600:1: rule__UseCase__InputsAssignment_4 : ( ruleInputs ) ;
    public final void rule__UseCase__InputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3604:1: ( ( ruleInputs ) )
            // InternalUseCase.g:3605:2: ( ruleInputs )
            {
            // InternalUseCase.g:3605:2: ( ruleInputs )
            // InternalUseCase.g:3606:3: ruleInputs
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
    // InternalUseCase.g:3615:1: rule__UseCase__OutputsAssignment_5 : ( ruleOutputs ) ;
    public final void rule__UseCase__OutputsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3619:1: ( ( ruleOutputs ) )
            // InternalUseCase.g:3620:2: ( ruleOutputs )
            {
            // InternalUseCase.g:3620:2: ( ruleOutputs )
            // InternalUseCase.g:3621:3: ruleOutputs
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
    // InternalUseCase.g:3630:1: rule__UseCase__StepsAssignment_6 : ( ruleSteps ) ;
    public final void rule__UseCase__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3634:1: ( ( ruleSteps ) )
            // InternalUseCase.g:3635:2: ( ruleSteps )
            {
            // InternalUseCase.g:3635:2: ( ruleSteps )
            // InternalUseCase.g:3636:3: ruleSteps
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
    // InternalUseCase.g:3645:1: rule__UseCase__NotesAssignment_7 : ( ruleNotes ) ;
    public final void rule__UseCase__NotesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3649:1: ( ( ruleNotes ) )
            // InternalUseCase.g:3650:2: ( ruleNotes )
            {
            // InternalUseCase.g:3650:2: ( ruleNotes )
            // InternalUseCase.g:3651:3: ruleNotes
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
    // InternalUseCase.g:3660:1: rule__Steps__StepsAssignment_1 : ( ruleStep ) ;
    public final void rule__Steps__StepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3664:1: ( ( ruleStep ) )
            // InternalUseCase.g:3665:2: ( ruleStep )
            {
            // InternalUseCase.g:3665:2: ( ruleStep )
            // InternalUseCase.g:3666:3: ruleStep
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
    // InternalUseCase.g:3675:1: rule__UsedTypes__TypesAssignment_2 : ( ruleType ) ;
    public final void rule__UsedTypes__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3679:1: ( ( ruleType ) )
            // InternalUseCase.g:3680:2: ( ruleType )
            {
            // InternalUseCase.g:3680:2: ( ruleType )
            // InternalUseCase.g:3681:3: ruleType
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


    // $ANTLR start "rule__UsedExceptions__ExceptionAssignment_2"
    // InternalUseCase.g:3690:1: rule__UsedExceptions__ExceptionAssignment_2 : ( ruleExceptionDecleration ) ;
    public final void rule__UsedExceptions__ExceptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3694:1: ( ( ruleExceptionDecleration ) )
            // InternalUseCase.g:3695:2: ( ruleExceptionDecleration )
            {
            // InternalUseCase.g:3695:2: ( ruleExceptionDecleration )
            // InternalUseCase.g:3696:3: ruleExceptionDecleration
            {
             before(grammarAccess.getUsedExceptionsAccess().getExceptionExceptionDeclerationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExceptionDecleration();

            state._fsp--;

             after(grammarAccess.getUsedExceptionsAccess().getExceptionExceptionDeclerationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsedExceptions__ExceptionAssignment_2"


    // $ANTLR start "rule__Step__NumberAssignment_0"
    // InternalUseCase.g:3705:1: rule__Step__NumberAssignment_0 : ( ruleQualifiedNumber ) ;
    public final void rule__Step__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3709:1: ( ( ruleQualifiedNumber ) )
            // InternalUseCase.g:3710:2: ( ruleQualifiedNumber )
            {
            // InternalUseCase.g:3710:2: ( ruleQualifiedNumber )
            // InternalUseCase.g:3711:3: ruleQualifiedNumber
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
    // InternalUseCase.g:3720:1: rule__Step__ActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Step__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3724:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3725:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3725:2: ( RULE_STRING )
            // InternalUseCase.g:3726:3: RULE_STRING
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
    // InternalUseCase.g:3735:1: rule__Step__ErrorAssignment_2 : ( ruleRaiseError ) ;
    public final void rule__Step__ErrorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3739:1: ( ( ruleRaiseError ) )
            // InternalUseCase.g:3740:2: ( ruleRaiseError )
            {
            // InternalUseCase.g:3740:2: ( ruleRaiseError )
            // InternalUseCase.g:3741:3: ruleRaiseError
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
    // InternalUseCase.g:3750:1: rule__RaiseError__ExceptionAssignment_2 : ( ruleException ) ;
    public final void rule__RaiseError__ExceptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3754:1: ( ( ruleException ) )
            // InternalUseCase.g:3755:2: ( ruleException )
            {
            // InternalUseCase.g:3755:2: ( ruleException )
            // InternalUseCase.g:3756:3: ruleException
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
    // InternalUseCase.g:3765:1: rule__Exception__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Exception__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3769:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:3770:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:3770:2: ( ( RULE_ID ) )
            // InternalUseCase.g:3771:3: ( RULE_ID )
            {
             before(grammarAccess.getExceptionAccess().getTypeExceptionDeclerationCrossReference_0()); 
            // InternalUseCase.g:3772:3: ( RULE_ID )
            // InternalUseCase.g:3773:4: RULE_ID
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
    // InternalUseCase.g:3784:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3788:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3789:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3789:2: ( RULE_STRING )
            // InternalUseCase.g:3790:3: RULE_STRING
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
    // InternalUseCase.g:3799:1: rule__Notes__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notes__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3803:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3804:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3804:2: ( RULE_STRING )
            // InternalUseCase.g:3805:3: RULE_STRING
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
    // InternalUseCase.g:3814:1: rule__Inputs__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Inputs__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3818:1: ( ( ruleInput ) )
            // InternalUseCase.g:3819:2: ( ruleInput )
            {
            // InternalUseCase.g:3819:2: ( ruleInput )
            // InternalUseCase.g:3820:3: ruleInput
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
    // InternalUseCase.g:3829:1: rule__Outputs__OutputsAssignment_1 : ( ruleOutput ) ;
    public final void rule__Outputs__OutputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3833:1: ( ( ruleOutput ) )
            // InternalUseCase.g:3834:2: ( ruleOutput )
            {
            // InternalUseCase.g:3834:2: ( ruleOutput )
            // InternalUseCase.g:3835:3: ruleOutput
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
    // InternalUseCase.g:3844:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3848:1: ( ( RULE_ID ) )
            // InternalUseCase.g:3849:2: ( RULE_ID )
            {
            // InternalUseCase.g:3849:2: ( RULE_ID )
            // InternalUseCase.g:3850:3: RULE_ID
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
    // InternalUseCase.g:3859:1: rule__Type__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Type__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3863:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3864:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3864:2: ( RULE_STRING )
            // InternalUseCase.g:3865:3: RULE_STRING
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
    // InternalUseCase.g:3874:1: rule__Type__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__Type__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3878:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:3879:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:3879:2: ( ruleQualifiedName )
            // InternalUseCase.g:3880:3: ruleQualifiedName
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
    // InternalUseCase.g:3889:1: rule__ExceptionDecleration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExceptionDecleration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3893:1: ( ( RULE_ID ) )
            // InternalUseCase.g:3894:2: ( RULE_ID )
            {
            // InternalUseCase.g:3894:2: ( RULE_ID )
            // InternalUseCase.g:3895:3: RULE_ID
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
    // InternalUseCase.g:3904:1: rule__ExceptionDecleration__MessageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ExceptionDecleration__MessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3908:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3909:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3909:2: ( RULE_STRING )
            // InternalUseCase.g:3910:3: RULE_STRING
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
    // InternalUseCase.g:3919:1: rule__ExceptionDecleration__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__ExceptionDecleration__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3923:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:3924:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:3924:2: ( ruleQualifiedName )
            // InternalUseCase.g:3925:3: ruleQualifiedName
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
    // InternalUseCase.g:3934:1: rule__Input__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Input__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3938:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:3939:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:3939:2: ( ( 'many' ) )
            // InternalUseCase.g:3940:3: ( 'many' )
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:3941:3: ( 'many' )
            // InternalUseCase.g:3942:4: 'many'
            {
             before(grammarAccess.getInputAccess().getManyManyKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUseCase.g:3953:1: rule__Input__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Input__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3957:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3958:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3958:2: ( RULE_STRING )
            // InternalUseCase.g:3959:3: RULE_STRING
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
    // InternalUseCase.g:3968:1: rule__Input__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Input__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3972:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:3973:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:3973:2: ( ( RULE_ID ) )
            // InternalUseCase.g:3974:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:3975:3: ( RULE_ID )
            // InternalUseCase.g:3976:4: RULE_ID
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
    // InternalUseCase.g:3987:1: rule__Input__ExampleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Input__ExampleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:3991:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:3992:2: ( RULE_STRING )
            {
            // InternalUseCase.g:3992:2: ( RULE_STRING )
            // InternalUseCase.g:3993:3: RULE_STRING
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
    // InternalUseCase.g:4002:1: rule__Output__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Output__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4006:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:4007:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:4007:2: ( ( 'many' ) )
            // InternalUseCase.g:4008:3: ( 'many' )
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:4009:3: ( 'many' )
            // InternalUseCase.g:4010:4: 'many'
            {
             before(grammarAccess.getOutputAccess().getManyManyKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUseCase.g:4021:1: rule__Output__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4025:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4026:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4026:2: ( RULE_STRING )
            // InternalUseCase.g:4027:3: RULE_STRING
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
    // InternalUseCase.g:4036:1: rule__Output__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Output__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4040:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:4041:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:4041:2: ( ( RULE_ID ) )
            // InternalUseCase.g:4042:3: ( RULE_ID )
            {
             before(grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:4043:3: ( RULE_ID )
            // InternalUseCase.g:4044:4: RULE_ID
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
    // InternalUseCase.g:4055:1: rule__Output__ExampleAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Output__ExampleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4059:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4060:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4060:2: ( RULE_STRING )
            // InternalUseCase.g:4061:3: RULE_STRING
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
    // InternalUseCase.g:4070:1: rule__AllowedUserGroups__GroupsAssignment_1 : ( ruleAllowedUserGroup ) ;
    public final void rule__AllowedUserGroups__GroupsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4074:1: ( ( ruleAllowedUserGroup ) )
            // InternalUseCase.g:4075:2: ( ruleAllowedUserGroup )
            {
            // InternalUseCase.g:4075:2: ( ruleAllowedUserGroup )
            // InternalUseCase.g:4076:3: ruleAllowedUserGroup
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
    // InternalUseCase.g:4085:1: rule__AllowedUserGroup__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__AllowedUserGroup__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4089:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:4090:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:4090:2: ( ( 'many' ) )
            // InternalUseCase.g:4091:3: ( 'many' )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:4092:3: ( 'many' )
            // InternalUseCase.g:4093:4: 'many'
            {
             before(grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUseCase.g:4104:1: rule__AllowedUserGroup__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AllowedUserGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4108:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:4109:2: ( RULE_STRING )
            {
            // InternalUseCase.g:4109:2: ( RULE_STRING )
            // InternalUseCase.g:4110:3: RULE_STRING
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
    // InternalUseCase.g:4119:1: rule__AllowedUserGroup__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__AllowedUserGroup__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:4123:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:4124:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:4124:2: ( ( RULE_ID ) )
            // InternalUseCase.g:4125:3: ( RULE_ID )
            {
             before(grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:4126:3: ( RULE_ID )
            // InternalUseCase.g:4127:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00001008602BF000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000202000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000202000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002000002L});

}