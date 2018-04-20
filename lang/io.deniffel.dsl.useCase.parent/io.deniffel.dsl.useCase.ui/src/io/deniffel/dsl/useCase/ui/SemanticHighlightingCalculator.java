package io.deniffel.dsl.useCase.ui;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

import io.deniffel.dsl.useCase.useCase.AllowedUserGroup;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator{

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		
		EObject root = resource.getContents().get(0);
		setStyleForNeedle("\"", UseCaseHighlightingConfiguration.QUOTE_SIGN, root, acceptor);
		setStyleForNeedle("- ", UseCaseHighlightingConfiguration.BULLET_POINT, root, acceptor);
	}
	
	private void setStyleForNeedle(String needle, String style, EObject root, IHighlightedPositionAcceptor acceptor) {
		ICompositeNode node = NodeModelUtils.findActualNodeFor(root);
		List<Integer> quoteMarkPositions = allQuoteSignPositionsOf(node.getText(), needle);
		for(Integer quoteMarkPos : quoteMarkPositions) {
			acceptor.addPosition(node.getOffset()+quoteMarkPos, 1, style);
		}
	}
	
	private List<Integer> allQuoteSignPositionsOf(String text, String needle) {
		List<Integer> res = new LinkedList<>();
		for (int i = -1; (i = text.indexOf(needle, i + 1)) != -1; i++) {
		    res.add(i);
		    if(i>text.length())
		    	break;
		} 
		
		return res;
	}

}
