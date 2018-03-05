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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use-case'", "'end'", "'of'", "'description:'", "'attributes:'", "'type'", "'('", "')'", "'['", "']'", "'-'", "'as'", "'.'", "'many'"
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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


    // $ANTLR start "entryRuleAttributes"
    // InternalUseCase.g:128:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalUseCase.g:129:1: ( ruleAttributes EOF )
            // InternalUseCase.g:130:1: ruleAttributes EOF
            {
             before(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getAttributesRule()); 
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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalUseCase.g:137:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:141:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalUseCase.g:142:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalUseCase.g:142:2: ( ( rule__Attributes__Group__0 ) )
            // InternalUseCase.g:143:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalUseCase.g:144:3: ( rule__Attributes__Group__0 )
            // InternalUseCase.g:144:4: rule__Attributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleType"
    // InternalUseCase.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUseCase.g:154:1: ( ruleType EOF )
            // InternalUseCase.g:155:1: ruleType EOF
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
    // InternalUseCase.g:162:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:166:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalUseCase.g:167:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalUseCase.g:167:2: ( ( rule__Type__Group__0 ) )
            // InternalUseCase.g:168:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalUseCase.g:169:3: ( rule__Type__Group__0 )
            // InternalUseCase.g:169:4: rule__Type__Group__0
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


    // $ANTLR start "entryRuleAttribute"
    // InternalUseCase.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalUseCase.g:179:1: ( ruleAttribute EOF )
            // InternalUseCase.g:180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUseCase.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalUseCase.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalUseCase.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalUseCase.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalUseCase.g:194:3: ( rule__Attribute__Group__0 )
            // InternalUseCase.g:194:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUseCase.g:203:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalUseCase.g:204:1: ( ruleQualifiedName EOF )
            // InternalUseCase.g:205:1: ruleQualifiedName EOF
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
    // InternalUseCase.g:212:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:216:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalUseCase.g:217:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalUseCase.g:217:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalUseCase.g:218:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalUseCase.g:219:3: ( rule__QualifiedName__Group__0 )
            // InternalUseCase.g:219:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalUseCase.g:227:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:231:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUseCase.g:232:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalUseCase.g:239:1: rule__Model__Group__0__Impl : ( ( rule__Model__TypesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:243:1: ( ( ( rule__Model__TypesAssignment_0 )* ) )
            // InternalUseCase.g:244:1: ( ( rule__Model__TypesAssignment_0 )* )
            {
            // InternalUseCase.g:244:1: ( ( rule__Model__TypesAssignment_0 )* )
            // InternalUseCase.g:245:2: ( rule__Model__TypesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_0()); 
            // InternalUseCase.g:246:2: ( rule__Model__TypesAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCase.g:246:3: rule__Model__TypesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__TypesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalUseCase.g:254:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:258:1: ( rule__Model__Group__1__Impl )
            // InternalUseCase.g:259:2: rule__Model__Group__1__Impl
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
    // InternalUseCase.g:265:1: rule__Model__Group__1__Impl : ( ( rule__Model__UseCasesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:269:1: ( ( ( rule__Model__UseCasesAssignment_1 )* ) )
            // InternalUseCase.g:270:1: ( ( rule__Model__UseCasesAssignment_1 )* )
            {
            // InternalUseCase.g:270:1: ( ( rule__Model__UseCasesAssignment_1 )* )
            // InternalUseCase.g:271:2: ( rule__Model__UseCasesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getUseCasesAssignment_1()); 
            // InternalUseCase.g:272:2: ( rule__Model__UseCasesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCase.g:272:3: rule__Model__UseCasesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__UseCasesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalUseCase.g:281:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:285:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCase.g:286:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUseCase.g:293:1: rule__UseCase__Group__0__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:297:1: ( ( 'use-case' ) )
            // InternalUseCase.g:298:1: ( 'use-case' )
            {
            // InternalUseCase.g:298:1: ( 'use-case' )
            // InternalUseCase.g:299:2: 'use-case'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalUseCase.g:308:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:312:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCase.g:313:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
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
    // InternalUseCase.g:320:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:324:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUseCase.g:325:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUseCase.g:325:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUseCase.g:326:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUseCase.g:327:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUseCase.g:327:3: rule__UseCase__NameAssignment_1
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
    // InternalUseCase.g:335:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:339:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCase.g:340:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
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
    // InternalUseCase.g:347:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__DescriptionsAssignment_2 )* ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:351:1: ( ( ( rule__UseCase__DescriptionsAssignment_2 )* ) )
            // InternalUseCase.g:352:1: ( ( rule__UseCase__DescriptionsAssignment_2 )* )
            {
            // InternalUseCase.g:352:1: ( ( rule__UseCase__DescriptionsAssignment_2 )* )
            // InternalUseCase.g:353:2: ( rule__UseCase__DescriptionsAssignment_2 )*
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); 
            // InternalUseCase.g:354:2: ( rule__UseCase__DescriptionsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCase.g:354:3: rule__UseCase__DescriptionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__UseCase__DescriptionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

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
    // InternalUseCase.g:362:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:366:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCase.g:367:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
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
    // InternalUseCase.g:374:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__SectionsAssignment_3 )* ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:378:1: ( ( ( rule__UseCase__SectionsAssignment_3 )* ) )
            // InternalUseCase.g:379:1: ( ( rule__UseCase__SectionsAssignment_3 )* )
            {
            // InternalUseCase.g:379:1: ( ( rule__UseCase__SectionsAssignment_3 )* )
            // InternalUseCase.g:380:2: ( rule__UseCase__SectionsAssignment_3 )*
            {
             before(grammarAccess.getUseCaseAccess().getSectionsAssignment_3()); 
            // InternalUseCase.g:381:2: ( rule__UseCase__SectionsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCase.g:381:3: rule__UseCase__SectionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__UseCase__SectionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getSectionsAssignment_3()); 

            }


            }

        }
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
    // InternalUseCase.g:389:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:393:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCase.g:394:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
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
    // InternalUseCase.g:401:1: rule__UseCase__Group__4__Impl : ( 'end' ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:405:1: ( ( 'end' ) )
            // InternalUseCase.g:406:1: ( 'end' )
            {
            // InternalUseCase.g:406:1: ( 'end' )
            // InternalUseCase.g:407:2: 'end'
            {
             before(grammarAccess.getUseCaseAccess().getEndKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getEndKeyword_4()); 

            }


            }

        }
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
    // InternalUseCase.g:416:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:420:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCase.g:421:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalUseCase.g:428:1: rule__UseCase__Group__5__Impl : ( 'of' ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:432:1: ( ( 'of' ) )
            // InternalUseCase.g:433:1: ( 'of' )
            {
            // InternalUseCase.g:433:1: ( 'of' )
            // InternalUseCase.g:434:2: 'of'
            {
             before(grammarAccess.getUseCaseAccess().getOfKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getOfKeyword_5()); 

            }


            }

        }
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
    // InternalUseCase.g:443:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:447:1: ( rule__UseCase__Group__6__Impl )
            // InternalUseCase.g:448:2: rule__UseCase__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalUseCase.g:454:1: rule__UseCase__Group__6__Impl : ( 'use-case' ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:458:1: ( ( 'use-case' ) )
            // InternalUseCase.g:459:1: ( 'use-case' )
            {
            // InternalUseCase.g:459:1: ( 'use-case' )
            // InternalUseCase.g:460:2: 'use-case'
            {
             before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_6()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Description__Group__0"
    // InternalUseCase.g:470:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:474:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalUseCase.g:475:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalUseCase.g:482:1: rule__Description__Group__0__Impl : ( 'description:' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:486:1: ( ( 'description:' ) )
            // InternalUseCase.g:487:1: ( 'description:' )
            {
            // InternalUseCase.g:487:1: ( 'description:' )
            // InternalUseCase.g:488:2: 'description:'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalUseCase.g:497:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:501:1: ( rule__Description__Group__1__Impl )
            // InternalUseCase.g:502:2: rule__Description__Group__1__Impl
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
    // InternalUseCase.g:508:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:512:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalUseCase.g:513:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalUseCase.g:513:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalUseCase.g:514:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalUseCase.g:515:2: ( rule__Description__NameAssignment_1 )
            // InternalUseCase.g:515:3: rule__Description__NameAssignment_1
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


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalUseCase.g:524:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:528:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalUseCase.g:529:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Attributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0"


    // $ANTLR start "rule__Attributes__Group__0__Impl"
    // InternalUseCase.g:536:1: rule__Attributes__Group__0__Impl : ( 'attributes:' ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:540:1: ( ( 'attributes:' ) )
            // InternalUseCase.g:541:1: ( 'attributes:' )
            {
            // InternalUseCase.g:541:1: ( 'attributes:' )
            // InternalUseCase.g:542:2: 'attributes:'
            {
             before(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0__Impl"


    // $ANTLR start "rule__Attributes__Group__1"
    // InternalUseCase.g:551:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:555:1: ( rule__Attributes__Group__1__Impl )
            // InternalUseCase.g:556:2: rule__Attributes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1"


    // $ANTLR start "rule__Attributes__Group__1__Impl"
    // InternalUseCase.g:562:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__AttrsAssignment_1 )* ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:566:1: ( ( ( rule__Attributes__AttrsAssignment_1 )* ) )
            // InternalUseCase.g:567:1: ( ( rule__Attributes__AttrsAssignment_1 )* )
            {
            // InternalUseCase.g:567:1: ( ( rule__Attributes__AttrsAssignment_1 )* )
            // InternalUseCase.g:568:2: ( rule__Attributes__AttrsAssignment_1 )*
            {
             before(grammarAccess.getAttributesAccess().getAttrsAssignment_1()); 
            // InternalUseCase.g:569:2: ( rule__Attributes__AttrsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21||LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUseCase.g:569:3: rule__Attributes__AttrsAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Attributes__AttrsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAttributesAccess().getAttrsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalUseCase.g:578:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:582:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalUseCase.g:583:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCase.g:590:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:594:1: ( ( 'type' ) )
            // InternalUseCase.g:595:1: ( 'type' )
            {
            // InternalUseCase.g:595:1: ( 'type' )
            // InternalUseCase.g:596:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalUseCase.g:605:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:609:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalUseCase.g:610:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalUseCase.g:617:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:621:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalUseCase.g:622:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalUseCase.g:622:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalUseCase.g:623:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalUseCase.g:624:2: ( rule__Type__NameAssignment_1 )
            // InternalUseCase.g:624:3: rule__Type__NameAssignment_1
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
    // InternalUseCase.g:632:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:636:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalUseCase.g:637:2: rule__Type__Group__2__Impl rule__Type__Group__3
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
    // InternalUseCase.g:644:1: rule__Type__Group__2__Impl : ( '(' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:648:1: ( ( '(' ) )
            // InternalUseCase.g:649:1: ( '(' )
            {
            // InternalUseCase.g:649:1: ( '(' )
            // InternalUseCase.g:650:2: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUseCase.g:659:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:663:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // InternalUseCase.g:664:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCase.g:671:1: rule__Type__Group__3__Impl : ( ( rule__Type__DescriptionAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:675:1: ( ( ( rule__Type__DescriptionAssignment_3 ) ) )
            // InternalUseCase.g:676:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            {
            // InternalUseCase.g:676:1: ( ( rule__Type__DescriptionAssignment_3 ) )
            // InternalUseCase.g:677:2: ( rule__Type__DescriptionAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getDescriptionAssignment_3()); 
            // InternalUseCase.g:678:2: ( rule__Type__DescriptionAssignment_3 )
            // InternalUseCase.g:678:3: rule__Type__DescriptionAssignment_3
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
    // InternalUseCase.g:686:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:690:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // InternalUseCase.g:691:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCase.g:698:1: rule__Type__Group__4__Impl : ( ')' ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:702:1: ( ( ')' ) )
            // InternalUseCase.g:703:1: ( ')' )
            {
            // InternalUseCase.g:703:1: ( ')' )
            // InternalUseCase.g:704:2: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUseCase.g:713:1: rule__Type__Group__5 : rule__Type__Group__5__Impl ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:717:1: ( rule__Type__Group__5__Impl )
            // InternalUseCase.g:718:2: rule__Type__Group__5__Impl
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
    // InternalUseCase.g:724:1: rule__Type__Group__5__Impl : ( ( rule__Type__Group_5__0 )? ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:728:1: ( ( ( rule__Type__Group_5__0 )? ) )
            // InternalUseCase.g:729:1: ( ( rule__Type__Group_5__0 )? )
            {
            // InternalUseCase.g:729:1: ( ( rule__Type__Group_5__0 )? )
            // InternalUseCase.g:730:2: ( rule__Type__Group_5__0 )?
            {
             before(grammarAccess.getTypeAccess().getGroup_5()); 
            // InternalUseCase.g:731:2: ( rule__Type__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:731:3: rule__Type__Group_5__0
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
    // InternalUseCase.g:740:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:744:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // InternalUseCase.g:745:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCase.g:752:1: rule__Type__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:756:1: ( ( '[' ) )
            // InternalUseCase.g:757:1: ( '[' )
            {
            // InternalUseCase.g:757:1: ( '[' )
            // InternalUseCase.g:758:2: '['
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUseCase.g:767:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:771:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // InternalUseCase.g:772:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCase.g:779:1: rule__Type__Group_5__1__Impl : ( ( rule__Type__ImportInfoAssignment_5_1 ) ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:783:1: ( ( ( rule__Type__ImportInfoAssignment_5_1 ) ) )
            // InternalUseCase.g:784:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            {
            // InternalUseCase.g:784:1: ( ( rule__Type__ImportInfoAssignment_5_1 ) )
            // InternalUseCase.g:785:2: ( rule__Type__ImportInfoAssignment_5_1 )
            {
             before(grammarAccess.getTypeAccess().getImportInfoAssignment_5_1()); 
            // InternalUseCase.g:786:2: ( rule__Type__ImportInfoAssignment_5_1 )
            // InternalUseCase.g:786:3: rule__Type__ImportInfoAssignment_5_1
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
    // InternalUseCase.g:794:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:798:1: ( rule__Type__Group_5__2__Impl )
            // InternalUseCase.g:799:2: rule__Type__Group_5__2__Impl
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
    // InternalUseCase.g:805:1: rule__Type__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:809:1: ( ( ']' ) )
            // InternalUseCase.g:810:1: ( ']' )
            {
            // InternalUseCase.g:810:1: ( ']' )
            // InternalUseCase.g:811:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,20,FOLLOW_2); 
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalUseCase.g:821:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:825:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUseCase.g:826:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalUseCase.g:833:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__ManyAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:837:1: ( ( ( rule__Attribute__ManyAssignment_0 )? ) )
            // InternalUseCase.g:838:1: ( ( rule__Attribute__ManyAssignment_0 )? )
            {
            // InternalUseCase.g:838:1: ( ( rule__Attribute__ManyAssignment_0 )? )
            // InternalUseCase.g:839:2: ( rule__Attribute__ManyAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_0()); 
            // InternalUseCase.g:840:2: ( rule__Attribute__ManyAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:840:3: rule__Attribute__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalUseCase.g:848:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:852:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUseCase.g:853:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalUseCase.g:860:1: rule__Attribute__Group__1__Impl : ( '-' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:864:1: ( ( '-' ) )
            // InternalUseCase.g:865:1: ( '-' )
            {
            // InternalUseCase.g:865:1: ( '-' )
            // InternalUseCase.g:866:2: '-'
            {
             before(grammarAccess.getAttributeAccess().getHyphenMinusKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalUseCase.g:875:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:879:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalUseCase.g:880:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalUseCase.g:887:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ContentAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:891:1: ( ( ( rule__Attribute__ContentAssignment_2 ) ) )
            // InternalUseCase.g:892:1: ( ( rule__Attribute__ContentAssignment_2 ) )
            {
            // InternalUseCase.g:892:1: ( ( rule__Attribute__ContentAssignment_2 ) )
            // InternalUseCase.g:893:2: ( rule__Attribute__ContentAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getContentAssignment_2()); 
            // InternalUseCase.g:894:2: ( rule__Attribute__ContentAssignment_2 )
            // InternalUseCase.g:894:3: rule__Attribute__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalUseCase.g:902:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:906:1: ( rule__Attribute__Group__3__Impl )
            // InternalUseCase.g:907:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalUseCase.g:913:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:917:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // InternalUseCase.g:918:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // InternalUseCase.g:918:1: ( ( rule__Attribute__Group_3__0 )? )
            // InternalUseCase.g:919:2: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // InternalUseCase.g:920:2: ( rule__Attribute__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:920:3: rule__Attribute__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group_3__0"
    // InternalUseCase.g:929:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:933:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // InternalUseCase.g:934:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0"


    // $ANTLR start "rule__Attribute__Group_3__0__Impl"
    // InternalUseCase.g:941:1: rule__Attribute__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:945:1: ( ( 'as' ) )
            // InternalUseCase.g:946:1: ( 'as' )
            {
            // InternalUseCase.g:946:1: ( 'as' )
            // InternalUseCase.g:947:2: 'as'
            {
             before(grammarAccess.getAttributeAccess().getAsKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0__Impl"


    // $ANTLR start "rule__Attribute__Group_3__1"
    // InternalUseCase.g:956:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:960:1: ( rule__Attribute__Group_3__1__Impl )
            // InternalUseCase.g:961:2: rule__Attribute__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1"


    // $ANTLR start "rule__Attribute__Group_3__1__Impl"
    // InternalUseCase.g:967:1: rule__Attribute__Group_3__1__Impl : ( ( rule__Attribute__TypeAssignment_3_1 ) ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:971:1: ( ( ( rule__Attribute__TypeAssignment_3_1 ) ) )
            // InternalUseCase.g:972:1: ( ( rule__Attribute__TypeAssignment_3_1 ) )
            {
            // InternalUseCase.g:972:1: ( ( rule__Attribute__TypeAssignment_3_1 ) )
            // InternalUseCase.g:973:2: ( rule__Attribute__TypeAssignment_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3_1()); 
            // InternalUseCase.g:974:2: ( rule__Attribute__TypeAssignment_3_1 )
            // InternalUseCase.g:974:3: rule__Attribute__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalUseCase.g:983:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:987:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUseCase.g:988:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalUseCase.g:995:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:999:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1000:1: ( RULE_ID )
            {
            // InternalUseCase.g:1000:1: ( RULE_ID )
            // InternalUseCase.g:1001:2: RULE_ID
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
    // InternalUseCase.g:1010:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1014:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUseCase.g:1015:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUseCase.g:1021:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1025:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUseCase.g:1026:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUseCase.g:1026:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUseCase.g:1027:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUseCase.g:1028:2: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUseCase.g:1028:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalUseCase.g:1037:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1041:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUseCase.g:1042:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCase.g:1049:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1053:1: ( ( '.' ) )
            // InternalUseCase.g:1054:1: ( '.' )
            {
            // InternalUseCase.g:1054:1: ( '.' )
            // InternalUseCase.g:1055:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUseCase.g:1064:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1068:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUseCase.g:1069:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUseCase.g:1075:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1079:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1080:1: ( RULE_ID )
            {
            // InternalUseCase.g:1080:1: ( RULE_ID )
            // InternalUseCase.g:1081:2: RULE_ID
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
    // InternalUseCase.g:1091:1: rule__Model__TypesAssignment_0 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1095:1: ( ( ruleType ) )
            // InternalUseCase.g:1096:2: ( ruleType )
            {
            // InternalUseCase.g:1096:2: ( ruleType )
            // InternalUseCase.g:1097:3: ruleType
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
    // InternalUseCase.g:1106:1: rule__Model__UseCasesAssignment_1 : ( ruleUseCase ) ;
    public final void rule__Model__UseCasesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1110:1: ( ( ruleUseCase ) )
            // InternalUseCase.g:1111:2: ( ruleUseCase )
            {
            // InternalUseCase.g:1111:2: ( ruleUseCase )
            // InternalUseCase.g:1112:3: ruleUseCase
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
    // InternalUseCase.g:1121:1: rule__UseCase__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1125:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:1126:2: ( RULE_STRING )
            {
            // InternalUseCase.g:1126:2: ( RULE_STRING )
            // InternalUseCase.g:1127:3: RULE_STRING
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
    // InternalUseCase.g:1136:1: rule__UseCase__DescriptionsAssignment_2 : ( ruleDescription ) ;
    public final void rule__UseCase__DescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1140:1: ( ( ruleDescription ) )
            // InternalUseCase.g:1141:2: ( ruleDescription )
            {
            // InternalUseCase.g:1141:2: ( ruleDescription )
            // InternalUseCase.g:1142:3: ruleDescription
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


    // $ANTLR start "rule__UseCase__SectionsAssignment_3"
    // InternalUseCase.g:1151:1: rule__UseCase__SectionsAssignment_3 : ( ruleAttributes ) ;
    public final void rule__UseCase__SectionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1155:1: ( ( ruleAttributes ) )
            // InternalUseCase.g:1156:2: ( ruleAttributes )
            {
            // InternalUseCase.g:1156:2: ( ruleAttributes )
            // InternalUseCase.g:1157:3: ruleAttributes
            {
             before(grammarAccess.getUseCaseAccess().getSectionsAttributesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getSectionsAttributesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__SectionsAssignment_3"


    // $ANTLR start "rule__Description__NameAssignment_1"
    // InternalUseCase.g:1166:1: rule__Description__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1170:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:1171:2: ( RULE_STRING )
            {
            // InternalUseCase.g:1171:2: ( RULE_STRING )
            // InternalUseCase.g:1172:3: RULE_STRING
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


    // $ANTLR start "rule__Attributes__AttrsAssignment_1"
    // InternalUseCase.g:1181:1: rule__Attributes__AttrsAssignment_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttrsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1185:1: ( ( ruleAttribute ) )
            // InternalUseCase.g:1186:2: ( ruleAttribute )
            {
            // InternalUseCase.g:1186:2: ( ruleAttribute )
            // InternalUseCase.g:1187:3: ruleAttribute
            {
             before(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__AttrsAssignment_1"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalUseCase.g:1196:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1200:1: ( ( RULE_ID ) )
            // InternalUseCase.g:1201:2: ( RULE_ID )
            {
            // InternalUseCase.g:1201:2: ( RULE_ID )
            // InternalUseCase.g:1202:3: RULE_ID
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
    // InternalUseCase.g:1211:1: rule__Type__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Type__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1215:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:1216:2: ( RULE_STRING )
            {
            // InternalUseCase.g:1216:2: ( RULE_STRING )
            // InternalUseCase.g:1217:3: RULE_STRING
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
    // InternalUseCase.g:1226:1: rule__Type__ImportInfoAssignment_5_1 : ( ruleQualifiedName ) ;
    public final void rule__Type__ImportInfoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1230:1: ( ( ruleQualifiedName ) )
            // InternalUseCase.g:1231:2: ( ruleQualifiedName )
            {
            // InternalUseCase.g:1231:2: ( ruleQualifiedName )
            // InternalUseCase.g:1232:3: ruleQualifiedName
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


    // $ANTLR start "rule__Attribute__ManyAssignment_0"
    // InternalUseCase.g:1241:1: rule__Attribute__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Attribute__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1245:1: ( ( ( 'many' ) ) )
            // InternalUseCase.g:1246:2: ( ( 'many' ) )
            {
            // InternalUseCase.g:1246:2: ( ( 'many' ) )
            // InternalUseCase.g:1247:3: ( 'many' )
            {
             before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 
            // InternalUseCase.g:1248:3: ( 'many' )
            // InternalUseCase.g:1249:4: 'many'
            {
             before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ManyAssignment_0"


    // $ANTLR start "rule__Attribute__ContentAssignment_2"
    // InternalUseCase.g:1260:1: rule__Attribute__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1264:1: ( ( RULE_STRING ) )
            // InternalUseCase.g:1265:2: ( RULE_STRING )
            {
            // InternalUseCase.g:1265:2: ( RULE_STRING )
            // InternalUseCase.g:1266:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getContentSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ContentAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_3_1"
    // InternalUseCase.g:1275:1: rule__Attribute__TypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCase.g:1279:1: ( ( ( RULE_ID ) ) )
            // InternalUseCase.g:1280:2: ( ( RULE_ID ) )
            {
            // InternalUseCase.g:1280:2: ( ( RULE_ID ) )
            // InternalUseCase.g:1281:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_3_1_0()); 
            // InternalUseCase.g:1282:3: ( RULE_ID )
            // InternalUseCase.g:1283:4: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});

}