/*
 * generated by Xtext 2.17.0
 */
package quickGUI.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import quickGUI.services.QuickGUIGrammarAccess;

@SuppressWarnings("all")
public class QuickGUISyntacticSequencer extends AbstractSyntacticSequencer {

	protected QuickGUIGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Button_BtnKeyword_1_0_or_ButtonKeyword_1_1;
	protected AbstractElementAlias match_Horizontal_HKeyword_1_0_or_HorizontalKeyword_1_1;
	protected AbstractElementAlias match_TextBox_TbKeyword_1_0_or_TextboxKeyword_1_1;
	protected AbstractElementAlias match_Vertical_VKeyword_1_0_or_VerticalKeyword_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (QuickGUIGrammarAccess) access;
		match_Button_BtnKeyword_1_0_or_ButtonKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getButtonAccess().getBtnKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getButtonAccess().getButtonKeyword_1_1()));
		match_Horizontal_HKeyword_1_0_or_HorizontalKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getHorizontalAccess().getHKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getHorizontalAccess().getHorizontalKeyword_1_1()));
		match_TextBox_TbKeyword_1_0_or_TextboxKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTextBoxAccess().getTbKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTextBoxAccess().getTextboxKeyword_1_1()));
		match_Vertical_VKeyword_1_0_or_VerticalKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getVerticalAccess().getVKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getVerticalAccess().getVerticalKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Button_BtnKeyword_1_0_or_ButtonKeyword_1_1.equals(syntax))
				emit_Button_BtnKeyword_1_0_or_ButtonKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Horizontal_HKeyword_1_0_or_HorizontalKeyword_1_1.equals(syntax))
				emit_Horizontal_HKeyword_1_0_or_HorizontalKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TextBox_TbKeyword_1_0_or_TextboxKeyword_1_1.equals(syntax))
				emit_TextBox_TbKeyword_1_0_or_TextboxKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Vertical_VKeyword_1_0_or_VerticalKeyword_1_1.equals(syntax))
				emit_Vertical_VKeyword_1_0_or_VerticalKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'btn' | 'button'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=STRING
	 */
	protected void emit_Button_BtnKeyword_1_0_or_ButtonKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'h' | 'horizontal'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' ')' (rule start)
	 *     (rule start) (ambiguity) '(' elements+=Element
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Horizontal_HKeyword_1_0_or_HorizontalKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'tb' | 'textbox'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=STRING
	 */
	protected void emit_TextBox_TbKeyword_1_0_or_TextboxKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'v' | 'vertical'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' ')' (rule start)
	 *     (rule start) (ambiguity) '(' elements+=Element
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Vertical_VKeyword_1_0_or_VerticalKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
