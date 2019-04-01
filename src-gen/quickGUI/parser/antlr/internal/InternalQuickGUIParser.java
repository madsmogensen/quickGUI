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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'h'", "'horizontal'", "'v'", "'vertical'", "'btn'", "'button'", "'tb'", "'textbox'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // InternalQuickGUI.g:71:1: ruleGUI returns [EObject current=null] : ( ( (lv_title_0_0= RULE_STRING ) )? (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' )+ ) ;
    public final EObject ruleGUI() throws RecognitionException {
        EObject current = null;

        Token lv_title_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_layout_2_0 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:77:2: ( ( ( (lv_title_0_0= RULE_STRING ) )? (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' )+ ) )
            // InternalQuickGUI.g:78:2: ( ( (lv_title_0_0= RULE_STRING ) )? (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' )+ )
            {
            // InternalQuickGUI.g:78:2: ( ( (lv_title_0_0= RULE_STRING ) )? (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' )+ )
            // InternalQuickGUI.g:79:3: ( (lv_title_0_0= RULE_STRING ) )? (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' )+
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

            // InternalQuickGUI.g:97:3: (otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
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

            	    otherlv_3=(Token)match(input,12,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getGUIAccess().getRightParenthesisKeyword_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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


    // $ANTLR start "entryRuleElement"
    // InternalQuickGUI.g:130:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalQuickGUI.g:130:48: (iv_ruleElement= ruleElement EOF )
            // InternalQuickGUI.g:131:2: iv_ruleElement= ruleElement EOF
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
    // InternalQuickGUI.g:137:1: ruleElement returns [EObject current=null] : (this_Button_0= ruleButton | this_TextBox_1= ruleTextBox ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_TextBox_1 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:143:2: ( (this_Button_0= ruleButton | this_TextBox_1= ruleTextBox ) )
            // InternalQuickGUI.g:144:2: (this_Button_0= ruleButton | this_TextBox_1= ruleTextBox )
            {
            // InternalQuickGUI.g:144:2: (this_Button_0= ruleButton | this_TextBox_1= ruleTextBox )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=17 && LA3_0<=18)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=19 && LA3_0<=20)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQuickGUI.g:145:3: this_Button_0= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getButtonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_0=ruleButton();

                    state._fsp--;


                    			current = this_Button_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:154:3: this_TextBox_1= ruleTextBox
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTextBoxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextBox_1=ruleTextBox();

                    state._fsp--;


                    			current = this_TextBox_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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


    // $ANTLR start "entryRuleLayout"
    // InternalQuickGUI.g:166:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalQuickGUI.g:166:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalQuickGUI.g:167:2: iv_ruleLayout= ruleLayout EOF
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
    // InternalQuickGUI.g:173:1: ruleLayout returns [EObject current=null] : ( (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical ) otherlv_2= '(' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= ')' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Horizontal_0 = null;

        EObject this_Vertical_1 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalQuickGUI.g:179:2: ( ( (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical ) otherlv_2= '(' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= ')' ) )
            // InternalQuickGUI.g:180:2: ( (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical ) otherlv_2= '(' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= ')' )
            {
            // InternalQuickGUI.g:180:2: ( (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical ) otherlv_2= '(' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= ')' )
            // InternalQuickGUI.g:181:3: (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical ) otherlv_2= '(' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= ')'
            {
            // InternalQuickGUI.g:181:3: (this_Horizontal_0= ruleHorizontal | this_Vertical_1= ruleVertical )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=14)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQuickGUI.g:182:4: this_Horizontal_0= ruleHorizontal
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
                    // InternalQuickGUI.g:191:4: this_Vertical_1= ruleVertical
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

            otherlv_2=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQuickGUI.g:204:3: ( (lv_elements_3_0= ruleElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQuickGUI.g:205:4: (lv_elements_3_0= ruleElement )
            	    {
            	    // InternalQuickGUI.g:205:4: (lv_elements_3_0= ruleElement )
            	    // InternalQuickGUI.g:206:5: lv_elements_3_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getLayoutAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break loop5;
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
    // InternalQuickGUI.g:231:1: entryRuleHorizontal returns [EObject current=null] : iv_ruleHorizontal= ruleHorizontal EOF ;
    public final EObject entryRuleHorizontal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorizontal = null;


        try {
            // InternalQuickGUI.g:231:51: (iv_ruleHorizontal= ruleHorizontal EOF )
            // InternalQuickGUI.g:232:2: iv_ruleHorizontal= ruleHorizontal EOF
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
    // InternalQuickGUI.g:238:1: ruleHorizontal returns [EObject current=null] : ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) ) ;
    public final EObject ruleHorizontal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQuickGUI.g:244:2: ( ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) ) )
            // InternalQuickGUI.g:245:2: ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) )
            {
            // InternalQuickGUI.g:245:2: ( () (otherlv_1= 'h' | otherlv_2= 'horizontal' ) )
            // InternalQuickGUI.g:246:3: () (otherlv_1= 'h' | otherlv_2= 'horizontal' )
            {
            // InternalQuickGUI.g:246:3: ()
            // InternalQuickGUI.g:247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHorizontalAccess().getHorizontalAction_0(),
            					current);
            			

            }

            // InternalQuickGUI.g:253:3: (otherlv_1= 'h' | otherlv_2= 'horizontal' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQuickGUI.g:254:4: otherlv_1= 'h'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getHorizontalAccess().getHKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:259:4: otherlv_2= 'horizontal'
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
    // InternalQuickGUI.g:268:1: entryRuleVertical returns [EObject current=null] : iv_ruleVertical= ruleVertical EOF ;
    public final EObject entryRuleVertical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertical = null;


        try {
            // InternalQuickGUI.g:268:49: (iv_ruleVertical= ruleVertical EOF )
            // InternalQuickGUI.g:269:2: iv_ruleVertical= ruleVertical EOF
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
    // InternalQuickGUI.g:275:1: ruleVertical returns [EObject current=null] : ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) ) ;
    public final EObject ruleVertical() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQuickGUI.g:281:2: ( ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) ) )
            // InternalQuickGUI.g:282:2: ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) )
            {
            // InternalQuickGUI.g:282:2: ( () (otherlv_1= 'v' | otherlv_2= 'vertical' ) )
            // InternalQuickGUI.g:283:3: () (otherlv_1= 'v' | otherlv_2= 'vertical' )
            {
            // InternalQuickGUI.g:283:3: ()
            // InternalQuickGUI.g:284:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerticalAccess().getVerticalAction_0(),
            					current);
            			

            }

            // InternalQuickGUI.g:290:3: (otherlv_1= 'v' | otherlv_2= 'vertical' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalQuickGUI.g:291:4: otherlv_1= 'v'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getVerticalAccess().getVKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:296:4: otherlv_2= 'vertical'
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


    // $ANTLR start "entryRuleButton"
    // InternalQuickGUI.g:305:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalQuickGUI.g:305:47: (iv_ruleButton= ruleButton EOF )
            // InternalQuickGUI.g:306:2: iv_ruleButton= ruleButton EOF
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
    // InternalQuickGUI.g:312:1: ruleButton returns [EObject current=null] : ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalQuickGUI.g:318:2: ( ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalQuickGUI.g:319:2: ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalQuickGUI.g:319:2: ( () (otherlv_1= 'btn' | otherlv_2= 'button' ) ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalQuickGUI.g:320:3: () (otherlv_1= 'btn' | otherlv_2= 'button' ) ( (lv_name_3_0= RULE_STRING ) )
            {
            // InternalQuickGUI.g:320:3: ()
            // InternalQuickGUI.g:321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getButtonAccess().getButtonAction_0(),
            					current);
            			

            }

            // InternalQuickGUI.g:327:3: (otherlv_1= 'btn' | otherlv_2= 'button' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQuickGUI.g:328:4: otherlv_1= 'btn'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getBtnKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:333:4: otherlv_2= 'button'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getButtonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalQuickGUI.g:338:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalQuickGUI.g:339:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalQuickGUI.g:339:4: (lv_name_3_0= RULE_STRING )
            // InternalQuickGUI.g:340:5: lv_name_3_0= RULE_STRING
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
    // InternalQuickGUI.g:360:1: entryRuleTextBox returns [EObject current=null] : iv_ruleTextBox= ruleTextBox EOF ;
    public final EObject entryRuleTextBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextBox = null;


        try {
            // InternalQuickGUI.g:360:48: (iv_ruleTextBox= ruleTextBox EOF )
            // InternalQuickGUI.g:361:2: iv_ruleTextBox= ruleTextBox EOF
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
    // InternalQuickGUI.g:367:1: ruleTextBox returns [EObject current=null] : ( () (otherlv_1= 'tb' | otherlv_2= 'textbox' ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalQuickGUI.g:373:2: ( ( () (otherlv_1= 'tb' | otherlv_2= 'textbox' ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalQuickGUI.g:374:2: ( () (otherlv_1= 'tb' | otherlv_2= 'textbox' ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalQuickGUI.g:374:2: ( () (otherlv_1= 'tb' | otherlv_2= 'textbox' ) ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalQuickGUI.g:375:3: () (otherlv_1= 'tb' | otherlv_2= 'textbox' ) ( (lv_name_3_0= RULE_STRING ) )
            {
            // InternalQuickGUI.g:375:3: ()
            // InternalQuickGUI.g:376:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextBoxAccess().getTextBoxAction_0(),
            					current);
            			

            }

            // InternalQuickGUI.g:382:3: (otherlv_1= 'tb' | otherlv_2= 'textbox' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQuickGUI.g:383:4: otherlv_1= 'tb'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getTextBoxAccess().getTbKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalQuickGUI.g:388:4: otherlv_2= 'textbox'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextBoxAccess().getTextboxKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalQuickGUI.g:393:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalQuickGUI.g:394:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalQuickGUI.g:394:4: (lv_name_3_0= RULE_STRING )
            // InternalQuickGUI.g:395:5: lv_name_3_0= RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001E1000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});

}