package quickGUI.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import quickGUI.services.QuickGUIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuickGUIParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'h'", "'horizontal'", "'v'", "'vertical'", "'btn'", "'button'", "'tb'", "'textbox'", "'ib'", "'inputBox'", "'true'", "'false'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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


        public InternalQuickGUIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuickGUIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuickGUIParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQuickGUI.g"; }



     	private QuickGUIGrammarAccess grammarAccess;

        public InternalQuickGUIParser(TokenStream input, QuickGUIGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GUI";
       	}

       	@Override
       	protected QuickGUIGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGUI"
    // InternalQuickGUI.g:64:1: entryRuleGUI returns [EObject current=null] : iv_ruleGUI= ruleGUI EOF ;
    public final EObject entryRuleGUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUI = null;


        try {
            // InternalQuickGUI.g:64:44: (iv_ruleGUI= ruleGUI EOF )
            // InternalQuickGUI.g:65:2: iv_ruleGUI= ruleGUI EOF
            {
             newCompositeNode(grammarAccess.getGUIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGUI=ruleGUI();

            state._fsp--;

             current =iv_ruleGUI; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGUI"


    // $ANTLR start "ruleGUI"
    // InternalQuickGUI.g:71:1: ruleGUI returns [EObject current=null] : ( ( (lv_title_0_0= RULE_STRING ) )? (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleGUI() throws RecognitionException {
        EObject current = null;

        Token lv_title_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_layout_2_0 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:77:2: ( ( ( (lv_title_0_0= RULE_STRING ) )? (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' ) ) )
            // InternalQuickGUI.g:78:2: ( ( (lv_title_0_0= RULE_STRING ) )? (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' ) )
            {
            // InternalQuickGUI.g:78:2: ( ( (lv_title_0_0= RULE_STRING ) )? (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' ) )
            // InternalQuickGUI.g:79:3: ( (lv_title_0_0= RULE_STRING ) )? (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' )
            {
            // InternalQuickGUI.g:79:3: ( (lv_title_0_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQuickGUI.g:80:4: (lv_title_0_0= RULE_STRING )
                    {
                    // InternalQuickGUI.g:80:4: (lv_title_0_0= RULE_STRING )
                    // InternalQuickGUI.g:81:5: lv_title_0_0= RULE_STRING
                    {
                    lv_title_0_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

                    					newLeafNode(lv_title_0_0, grammarAccess.getGUIAccess().getTitleSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGUIRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"title",
                    						lv_title_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalQuickGUI.g:97:3: (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' )
            // InternalQuickGUI.g:98:4: otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')'
            {
            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getGUIAccess().getLeftParenthesisKeyword_1_0());
            			
            // InternalQuickGUI.g:102:4: ( (lv_layout_2_0= ruleLayout ) )
            // InternalQuickGUI.g:103:5: (lv_layout_2_0= ruleLayout )
            {
            // InternalQuickGUI.g:103:5: (lv_layout_2_0= ruleLayout )
            // InternalQuickGUI.g:104:6: lv_layout_2_0= ruleLayout
            {

            						newCompositeNode(grammarAccess.getGUIAccess().getLayoutLayoutParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_5);
            lv_layout_2_0=ruleLayout();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getGUIRule());
            						}
            						set(
            							current,
            							"layout",
            							lv_layout_2_0,
            							"quickGUI.QuickGUI.Layout");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            				newLeafNode(otherlv_3, grammarAccess.getGUIAccess().getRightParenthesisKeyword_1_2());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGUI"


    // $ANTLR start "entryRuleLayout"
    // InternalQuickGUI.g:130:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalQuickGUI.g:130:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalQuickGUI.g:131:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalQuickGUI.g:137:1: ruleLayout returns [EObject current=null] : ( (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical ) otherlv_2= '(' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= ')' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Horizontal_0 = null;

        EObject this_Vertical_1 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:143:2: ( ( (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical ) otherlv_2= '(' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= ')' ) )
            // InternalQuickGUI.g:144:2: ( (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical ) otherlv_2= '(' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= ')' )
            {
            // InternalQuickGUI.g:144:2: ( (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical ) otherlv_2= '(' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= ')' )
            // InternalQuickGUI.g:145:3: (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical ) otherlv_2= '(' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= ')'
            {
            // InternalQuickGUI.g:145:3: (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQuickGUI.g:146:4: this_Horizontal_0= ruleHorizontal
                    {

                    				newCompositeNode(grammarAccess.getLayoutAccess().getHorizontalParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_3);
                    this_Horizontal_0=ruleHorizontal();

                    state._fsp--;


                    				current = this_Horizontal_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:155:4: this_Vertical_1= ruleVertical
                    {

                    				newCompositeNode(grammarAccess.getLayoutAccess().getVerticalParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_3);
                    this_Vertical_1=ruleVertical();

                    state._fsp--;


                    				current = this_Vertical_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQuickGUI.g:168:3: ( (lv_elements_3_0= ruleElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=22)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQuickGUI.g:169:4: (lv_elements_3_0= ruleElement )
            	    {
            	    // InternalQuickGUI.g:169:4: (lv_elements_3_0= ruleElement )
            	    // InternalQuickGUI.g:170:5: lv_elements_3_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getLayoutAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayoutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"quickGUI.QuickGUI.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLayoutAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleHorizontal"
    // InternalQuickGUI.g:195:1: entryRuleHorizontal returns [EObject current=null] : iv_ruleHorizontal= ruleHorizontal EOF ;
    public final EObject entryRuleHorizontal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorizontal = null;


        try {
            // InternalQuickGUI.g:195:51: (iv_ruleHorizontal= ruleHorizontal EOF )
            // InternalQuickGUI.g:196:2: iv_ruleHorizontal= ruleHorizontal EOF
            {
             newCompositeNode(grammarAccess.getHorizontalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHorizontal=ruleHorizontal();

            state._fsp--;

             current =iv_ruleHorizontal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHorizontal"


    // $ANTLR start "ruleHorizontal"
    // InternalQuickGUI.g:202:1: ruleHorizontal returns [EObject current=null] : ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) ) ;
    public final EObject ruleHorizontal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQuickGUI.g:208:2: ( ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) ) )
            // InternalQuickGUI.g:209:2: ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) )
            {
            // InternalQuickGUI.g:209:2: ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) )
            // InternalQuickGUI.g:210:3: () (otherlv_1= 'h' | otherlv_2= 'horizontal' )
            {
            // InternalQuickGUI.g:210:3: ()
            // InternalQuickGUI.g:211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHorizontalAccess().getHorizontalAction_0(),
            					current);
            			

            }

            // InternalQuickGUI.g:217:3: (otherlv_1= 'h' | otherlv_2= 'horizontal' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQuickGUI.g:218:4: otherlv_1= 'h'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHorizontalAccess().getHKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:223:4: otherlv_2= 'horizontal'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getHorizontalAccess().getHorizontalKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHorizontal"


    // $ANTLR start "entryRuleVertical"
    // InternalQuickGUI.g:232:1: entryRuleVertical returns [EObject current=null] : iv_ruleVertical= ruleVertical EOF ;
    public final EObject entryRuleVertical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertical = null;


        try {
            // InternalQuickGUI.g:232:49: (iv_ruleVertical= ruleVertical EOF )
            // InternalQuickGUI.g:233:2: iv_ruleVertical= ruleVertical EOF
            {
             newCompositeNode(grammarAccess.getVerticalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVertical=ruleVertical();

            state._fsp--;

             current =iv_ruleVertical; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVertical"


    // $ANTLR start "ruleVertical"
    // InternalQuickGUI.g:239:1: ruleVertical returns [EObject current=null] : ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) ) ;
    public final EObject ruleVertical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQuickGUI.g:245:2: ( ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) ) )
            // InternalQuickGUI.g:246:2: ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) )
            {
            // InternalQuickGUI.g:246:2: ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) )
            // InternalQuickGUI.g:247:3: () (otherlv_1= 'v' | otherlv_2= 'vertical' )
            {
            // InternalQuickGUI.g:247:3: ()
            // InternalQuickGUI.g:248:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerticalAccess().getVerticalAction_0(),
            					current);
            			

            }

            // InternalQuickGUI.g:254:3: (otherlv_1= 'v' | otherlv_2= 'vertical' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQuickGUI.g:255:4: otherlv_1= 'v'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerticalAccess().getVKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:260:4: otherlv_2= 'vertical'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getVerticalAccess().getVerticalKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVertical"


    // $ANTLR start "entryRuleElement"
    // InternalQuickGUI.g:269:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalQuickGUI.g:269:48: (iv_ruleElement= ruleElement EOF )
            // InternalQuickGUI.g:270:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalQuickGUI.g:276:1: ruleElement returns [EObject current=null] : ( ( (lv_type_0_1= ruleButton | lv_type_0_2= ruleTextBox | lv_type_0_3= ruleInputBox ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_type_0_3 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:282:2: ( ( ( (lv_type_0_1= ruleButton | lv_type_0_2= ruleTextBox | lv_type_0_3= ruleInputBox ) ) ) )
            // InternalQuickGUI.g:283:2: ( ( (lv_type_0_1= ruleButton | lv_type_0_2= ruleTextBox | lv_type_0_3= ruleInputBox ) ) )
            {
            // InternalQuickGUI.g:283:2: ( ( (lv_type_0_1= ruleButton | lv_type_0_2= ruleTextBox | lv_type_0_3= ruleInputBox ) ) )
            // InternalQuickGUI.g:284:3: ( (lv_type_0_1= ruleButton | lv_type_0_2= ruleTextBox | lv_type_0_3= ruleInputBox ) )
            {
            // InternalQuickGUI.g:284:3: ( (lv_type_0_1= ruleButton | lv_type_0_2= ruleTextBox | lv_type_0_3= ruleInputBox ) )
            // InternalQuickGUI.g:285:4: (lv_type_0_1= ruleButton | lv_type_0_2= ruleTextBox | lv_type_0_3= ruleInputBox )
            {
            // InternalQuickGUI.g:285:4: (lv_type_0_1= ruleButton | lv_type_0_2= ruleTextBox | lv_type_0_3= ruleInputBox )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
            case 22:
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
                    // InternalQuickGUI.g:286:5: lv_type_0_1= ruleButton
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getTypeButtonParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_1=ruleButton();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_1,
                    						"quickGUI.QuickGUI.Button");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:302:5: lv_type_0_2= ruleTextBox
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getTypeTextBoxParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_2=ruleTextBox();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_2,
                    						"quickGUI.QuickGUI.TextBox");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalQuickGUI.g:318:5: lv_type_0_3= ruleInputBox
                    {

                    					newCompositeNode(grammarAccess.getElementAccess().getTypeInputBoxParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_3=ruleInputBox();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_3,
                    						"quickGUI.QuickGUI.InputBox");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleButton"
    // InternalQuickGUI.g:339:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalQuickGUI.g:339:47: (iv_ruleButton= ruleButton EOF )
            // InternalQuickGUI.g:340:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalQuickGUI.g:346:1: ruleButton returns [EObject current=null] : ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalQuickGUI.g:352:2: ( ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalQuickGUI.g:353:2: ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalQuickGUI.g:353:2: ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalQuickGUI.g:354:3: () (otherlv_1= 'btn' | otherlv_2= 'button' ) ( (lv_name_3_0= RULE_STRING ) )
            {
            // InternalQuickGUI.g:354:3: ()
            // InternalQuickGUI.g:355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getButtonAccess().getButtonAction_0(),
            					current);
            			

            }

            // InternalQuickGUI.g:361:3: (otherlv_1= 'btn' | otherlv_2= 'button' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQuickGUI.g:362:4: otherlv_1= 'btn'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getBtnKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:367:4: otherlv_2= 'button'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getButtonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalQuickGUI.g:372:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalQuickGUI.g:373:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalQuickGUI.g:373:4: (lv_name_3_0= RULE_STRING )
            // InternalQuickGUI.g:374:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getButtonAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleTextBox"
    // InternalQuickGUI.g:394:1: entryRuleTextBox returns [EObject current=null] : iv_ruleTextBox= ruleTextBox EOF ;
    public final EObject entryRuleTextBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextBox = null;


        try {
            // InternalQuickGUI.g:394:48: (iv_ruleTextBox= ruleTextBox EOF )
            // InternalQuickGUI.g:395:2: iv_ruleTextBox= ruleTextBox EOF
            {
             newCompositeNode(grammarAccess.getTextBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextBox=ruleTextBox();

            state._fsp--;

             current =iv_ruleTextBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextBox"


    // $ANTLR start "ruleTextBox"
    // InternalQuickGUI.g:401:1: ruleTextBox returns [EObject current=null] : ( () (otherlv_1= 'tb' | otherlv_2= 'textbox' ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalQuickGUI.g:407:2: ( ( () (otherlv_1= 'tb' | otherlv_2= 'textbox' ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalQuickGUI.g:408:2: ( () (otherlv_1= 'tb' | otherlv_2= 'textbox' ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalQuickGUI.g:408:2: ( () (otherlv_1= 'tb' | otherlv_2= 'textbox' ) ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalQuickGUI.g:409:3: () (otherlv_1= 'tb' | otherlv_2= 'textbox' ) ( (lv_name_3_0= RULE_STRING ) )
            {
            // InternalQuickGUI.g:409:3: ()
            // InternalQuickGUI.g:410:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextBoxAccess().getTextBoxAction_0(),
            					current);
            			

            }

            // InternalQuickGUI.g:416:3: (otherlv_1= 'tb' | otherlv_2= 'textbox' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQuickGUI.g:417:4: otherlv_1= 'tb'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getTextBoxAccess().getTbKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:422:4: otherlv_2= 'textbox'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextBoxAccess().getTextboxKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalQuickGUI.g:427:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalQuickGUI.g:428:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalQuickGUI.g:428:4: (lv_name_3_0= RULE_STRING )
            // InternalQuickGUI.g:429:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getTextBoxAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextBox"


    // $ANTLR start "entryRuleInputBox"
    // InternalQuickGUI.g:449:1: entryRuleInputBox returns [EObject current=null] : iv_ruleInputBox= ruleInputBox EOF ;
    public final EObject entryRuleInputBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBox = null;


        try {
            // InternalQuickGUI.g:449:49: (iv_ruleInputBox= ruleInputBox EOF )
            // InternalQuickGUI.g:450:2: iv_ruleInputBox= ruleInputBox EOF
            {
             newCompositeNode(grammarAccess.getInputBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputBox=ruleInputBox();

            state._fsp--;

             current =iv_ruleInputBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputBox"


    // $ANTLR start "ruleInputBox"
    // InternalQuickGUI.g:456:1: ruleInputBox returns [EObject current=null] : ( () (otherlv_1= 'ib' | otherlv_2= 'inputBox' ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_requireCheck_4_1= 'true' | lv_requireCheck_4_2= 'false' ) ) ) ) ;
    public final EObject ruleInputBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_requireCheck_4_1=null;
        Token lv_requireCheck_4_2=null;


        	enterRule();

        try {
            // InternalQuickGUI.g:462:2: ( ( () (otherlv_1= 'ib' | otherlv_2= 'inputBox' ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_requireCheck_4_1= 'true' | lv_requireCheck_4_2= 'false' ) ) ) ) )
            // InternalQuickGUI.g:463:2: ( () (otherlv_1= 'ib' | otherlv_2= 'inputBox' ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_requireCheck_4_1= 'true' | lv_requireCheck_4_2= 'false' ) ) ) )
            {
            // InternalQuickGUI.g:463:2: ( () (otherlv_1= 'ib' | otherlv_2= 'inputBox' ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_requireCheck_4_1= 'true' | lv_requireCheck_4_2= 'false' ) ) ) )
            // InternalQuickGUI.g:464:3: () (otherlv_1= 'ib' | otherlv_2= 'inputBox' ) ( (lv_name_3_0= RULE_STRING ) ) ( ( (lv_requireCheck_4_1= 'true' | lv_requireCheck_4_2= 'false' ) ) )
            {
            // InternalQuickGUI.g:464:3: ()
            // InternalQuickGUI.g:465:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputBoxAccess().getInputBoxAction_0(),
            					current);
            			

            }

            // InternalQuickGUI.g:471:3: (otherlv_1= 'ib' | otherlv_2= 'inputBox' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQuickGUI.g:472:4: otherlv_1= 'ib'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getInputBoxAccess().getIbKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:477:4: otherlv_2= 'inputBox'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getInputBoxAccess().getInputBoxKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalQuickGUI.g:482:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalQuickGUI.g:483:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalQuickGUI.g:483:4: (lv_name_3_0= RULE_STRING )
            // InternalQuickGUI.g:484:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getInputBoxAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalQuickGUI.g:500:3: ( ( (lv_requireCheck_4_1= 'true' | lv_requireCheck_4_2= 'false' ) ) )
            // InternalQuickGUI.g:501:4: ( (lv_requireCheck_4_1= 'true' | lv_requireCheck_4_2= 'false' ) )
            {
            // InternalQuickGUI.g:501:4: ( (lv_requireCheck_4_1= 'true' | lv_requireCheck_4_2= 'false' ) )
            // InternalQuickGUI.g:502:5: (lv_requireCheck_4_1= 'true' | lv_requireCheck_4_2= 'false' )
            {
            // InternalQuickGUI.g:502:5: (lv_requireCheck_4_1= 'true' | lv_requireCheck_4_2= 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQuickGUI.g:503:6: lv_requireCheck_4_1= 'true'
                    {
                    lv_requireCheck_4_1=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_requireCheck_4_1, grammarAccess.getInputBoxAccess().getRequireCheckTrueKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputBoxRule());
                    						}
                    						setWithLastConsumed(current, "requireCheck", lv_requireCheck_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:514:6: lv_requireCheck_4_2= 'false'
                    {
                    lv_requireCheck_4_2=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_requireCheck_4_2, grammarAccess.getInputBoxAccess().getRequireCheckFalseKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputBoxRule());
                    						}
                    						setWithLastConsumed(current, "requireCheck", lv_requireCheck_4_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputBox"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007E1000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001800000L});

}