/*
 * generated by Xtext 2.17.0
 */
package quickGUI.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class QuickGUIAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("quickGUI/parser/antlr/internal/InternalQuickGUI.tokens");
	}
}
