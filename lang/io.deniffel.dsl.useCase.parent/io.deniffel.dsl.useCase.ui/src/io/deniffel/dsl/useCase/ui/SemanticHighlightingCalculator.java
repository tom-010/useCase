package io.deniffel.dsl.useCase.ui;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import static io.deniffel.dsl.useCase.ui.UseCaseHighlightingConfiguration.*;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator{

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		EObject root = resource.getContents().get(0);
		setStyleForNeedle("\"", QUOTE_SIGN, root, acceptor);
		setStyleForNeedle("- ", BULLET_POINT, root, acceptor);
		setStyleOfSquareBrackets(root, acceptor);
	}
	
	private void setStyleForNeedle(String needle, String style, EObject root, IHighlightedPositionAcceptor acceptor) {
		ICompositeNode node = NodeModelUtils.findActualNodeFor(root);
		for(Integer quoteMarkPos : allPositionsOf(node.getText(), needle))
			acceptor.addPosition(node.getOffset()+quoteMarkPos, 1, style);
	}
	
	private void setStyleOfSquareBrackets(EObject root, IHighlightedPositionAcceptor acceptor) {
		String text = NodeModelUtils.findActualNodeFor(root).getText();
		List<Integer> brackets = allPositionsOf(text, "[");
		brackets.addAll(allPositionsOf(text, "]"));
		brackets.sort((Integer a, Integer b) -> a-b);
		
		int i = 0;
		int from = -1;
		int to = -1;
		
		if(brackets.size() % 2 != 0) {
			return; // It would be ugly if we are typing a [ and then the whole text becomes grey. In this case wait until ] is typed as well
		}
		
		for(Integer bracket : brackets) {
			if(i % 2 == 0) {
				from = bracket;
			} else {
				to = bracket;
				int length = to - from + 1;
				acceptor.addPosition(from, length, SQUARE_BRAKETS_WITH_CONTENT);
			}			
			i++;
		}
		
	}
	
	private List<Integer> allPositionsOf(String text, String needle) {
		List<Integer> positions = new LinkedList<>();
		for (int i = -1; (i = text.indexOf(needle, i + 1)) != -1; i++) {
			positions.add(i);
		    if(i>text.length())
		    	break;
		} 
		return positions;
	}

}
