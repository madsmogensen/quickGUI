/*
 * generated by Xtext 2.17.0
 */
package quickGUI.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.paint.Color
import javafx.stage.Stage
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.google.inject.Inject
import quickGUI.quickGUI.*



/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */

class QuickGUIGenerator extends AbstractGenerator {

	@Inject extension IQualifiedNameProvider
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//get input
		val gui = resource.allContents.next
		val guiClass = gui as quickGUI.quickGUI.GUI
		val layoutClass = guiClass.getLayout() as quickGUI.quickGUI.Layout
		println(layoutClass.getElements())
		val btnClass = layoutClass.getElements().get(0) as quickGUI.quickGUI.Element
		println(btnClass.getName())
		
		fsa.generateFile(
		"QuickGUI.java",compileGUI(btnClass)
		)
		
		/*
		//Generate Model
		fsa.generateFile(
		//e.fullyQualifiedName.toString("/") + ".java", e.compile
		"QuickGUI.java",compileGUI
		)
		*/
	}
	
	def compileGUI(Element button)
		'''
		private void �button.getName�Submit(){
			//INSERT YOUR CODE HERE
		}
		'''
}