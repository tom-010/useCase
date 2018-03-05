package io.deniffel.dsl.useCase.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import io.deniffel.dsl.useCase.idea.lang.UseCaseElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import io.deniffel.dsl.useCase.services.UseCaseGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalUseCaseParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use-case'", "'end'", "'of'", "'description:'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public PsiInternalUseCaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalUseCaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalUseCaseParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalUseCase.g"; }



    	protected UseCaseGrammarAccess grammarAccess;

    	protected UseCaseElementTypeProvider elementTypeProvider;

    	public PsiInternalUseCaseParser(PsiBuilder builder, TokenStream input, UseCaseElementTypeProvider elementTypeProvider, UseCaseGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
    		this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "UseCase";
    	}




    // $ANTLR start "entryRuleUseCase"
    // PsiInternalUseCase.g:52:1: entryRuleUseCase returns [Boolean current=false] : iv_ruleUseCase= ruleUseCase EOF ;
    public final Boolean entryRuleUseCase() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUseCase = null;


        try {
            // PsiInternalUseCase.g:52:49: (iv_ruleUseCase= ruleUseCase EOF )
            // PsiInternalUseCase.g:53:2: iv_ruleUseCase= ruleUseCase EOF
            {
             markComposite(elementTypeProvider.getUseCaseElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // PsiInternalUseCase.g:59:1: ruleUseCase returns [Boolean current=false] : (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* otherlv_3= 'end' otherlv_4= 'of' otherlv_5= 'use-case' ) ;
    public final Boolean ruleUseCase() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Boolean lv_sections_2_0 = null;


        try {
            // PsiInternalUseCase.g:60:1: ( (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* otherlv_3= 'end' otherlv_4= 'of' otherlv_5= 'use-case' ) )
            // PsiInternalUseCase.g:61:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* otherlv_3= 'end' otherlv_4= 'of' otherlv_5= 'use-case' )
            {
            // PsiInternalUseCase.g:61:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* otherlv_3= 'end' otherlv_4= 'of' otherlv_5= 'use-case' )
            // PsiInternalUseCase.g:62:3: otherlv_0= 'use-case' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* otherlv_3= 'end' otherlv_4= 'of' otherlv_5= 'use-case'
            {

            			markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:69:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:70:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:70:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:71:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getUseCase_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalUseCase.g:86:3: ( (lv_sections_2_0= ruleSection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalUseCase.g:87:4: (lv_sections_2_0= ruleSection )
            	    {
            	    // PsiInternalUseCase.g:87:4: (lv_sections_2_0= ruleSection )
            	    // PsiInternalUseCase.g:88:5: lv_sections_2_0= ruleSection
            	    {

            	    					markComposite(elementTypeProvider.getUseCase_SectionsSectionParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_sections_2_0=ruleSection();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getUseCase_EndKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			doneLeaf(otherlv_3);
            		

            			markLeaf(elementTypeProvider.getUseCase_OfKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			doneLeaf(otherlv_4);
            		

            			markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_5ElementType());
            		
            otherlv_5=(Token)match(input,11,FOLLOW_2); 

            			doneLeaf(otherlv_5);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleSection"
    // PsiInternalUseCase.g:126:1: entryRuleSection returns [Boolean current=false] : iv_ruleSection= ruleSection EOF ;
    public final Boolean entryRuleSection() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSection = null;


        try {
            // PsiInternalUseCase.g:126:49: (iv_ruleSection= ruleSection EOF )
            // PsiInternalUseCase.g:127:2: iv_ruleSection= ruleSection EOF
            {
             markComposite(elementTypeProvider.getSectionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // PsiInternalUseCase.g:133:1: ruleSection returns [Boolean current=false] : this_Description_0= ruleDescription ;
    public final Boolean ruleSection() throws RecognitionException {
        Boolean current = false;

        Boolean this_Description_0 = null;


        try {
            // PsiInternalUseCase.g:134:1: (this_Description_0= ruleDescription )
            // PsiInternalUseCase.g:135:2: this_Description_0= ruleDescription
            {

            		markComposite(elementTypeProvider.getSection_DescriptionParserRuleCallElementType());
            	
            pushFollow(FOLLOW_2);
            this_Description_0=ruleDescription();

            state._fsp--;


            		current = this_Description_0;
            		doneComposite();
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleDescription"
    // PsiInternalUseCase.g:146:1: entryRuleDescription returns [Boolean current=false] : iv_ruleDescription= ruleDescription EOF ;
    public final Boolean entryRuleDescription() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDescription = null;


        try {
            // PsiInternalUseCase.g:146:53: (iv_ruleDescription= ruleDescription EOF )
            // PsiInternalUseCase.g:147:2: iv_ruleDescription= ruleDescription EOF
            {
             markComposite(elementTypeProvider.getDescriptionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // PsiInternalUseCase.g:153:1: ruleDescription returns [Boolean current=false] : (otherlv_0= 'description:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final Boolean ruleDescription() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalUseCase.g:154:1: ( (otherlv_0= 'description:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalUseCase.g:155:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalUseCase.g:155:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalUseCase.g:156:3: otherlv_0= 'description:' ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getDescription_DescriptionKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:163:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:164:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:164:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:165:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getDescription_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});

}