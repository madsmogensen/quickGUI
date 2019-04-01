/*
 * generated by Xtext 2.17.0
 */
package quickGUI.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import quickGUI.quickGUI.Button;
import quickGUI.quickGUI.GUI;
import quickGUI.quickGUI.Horizontal;
import quickGUI.quickGUI.QuickGUIPackage;
import quickGUI.quickGUI.TextBox;
import quickGUI.quickGUI.Vertical;
import quickGUI.services.QuickGUIGrammarAccess;

@SuppressWarnings("all")
public class QuickGUISemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QuickGUIGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == QuickGUIPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case QuickGUIPackage.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case QuickGUIPackage.GUI:
				sequence_GUI(context, (GUI) semanticObject); 
				return; 
			case QuickGUIPackage.HORIZONTAL:
				if (rule == grammarAccess.getHorizontalRule()) {
					sequence_Horizontal(context, (Horizontal) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLayoutRule()) {
					sequence_Horizontal_Layout(context, (Horizontal) semanticObject); 
					return; 
				}
				else break;
			case QuickGUIPackage.TEXT_BOX:
				sequence_TextBox(context, (TextBox) semanticObject); 
				return; 
			case QuickGUIPackage.VERTICAL:
				if (rule == grammarAccess.getLayoutRule()) {
					sequence_Layout_Vertical(context, (Vertical) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getVerticalRule()) {
					sequence_Vertical(context, (Vertical) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Element returns Button
	 *     Button returns Button
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Button(ISerializationContext context, Button semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QuickGUIPackage.Literals.ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuickGUIPackage.Literals.ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getButtonAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GUI returns GUI
	 *
	 * Constraint:
	 *     (title=STRING? layout=Layout+)
	 */
	protected void sequence_GUI(ISerializationContext context, GUI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Horizontal returns Horizontal
	 *
	 * Constraint:
	 *     {Horizontal}
	 */
	protected void sequence_Horizontal(ISerializationContext context, Horizontal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Layout returns Horizontal
	 *
	 * Constraint:
	 *     elements+=Element*
	 */
	protected void sequence_Horizontal_Layout(ISerializationContext context, Horizontal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Layout returns Vertical
	 *
	 * Constraint:
	 *     elements+=Element*
	 */
	protected void sequence_Layout_Vertical(ISerializationContext context, Vertical semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns TextBox
	 *     TextBox returns TextBox
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_TextBox(ISerializationContext context, TextBox semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, QuickGUIPackage.Literals.ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuickGUIPackage.Literals.ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextBoxAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Vertical returns Vertical
	 *
	 * Constraint:
	 *     {Vertical}
	 */
	protected void sequence_Vertical(ISerializationContext context, Vertical semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
