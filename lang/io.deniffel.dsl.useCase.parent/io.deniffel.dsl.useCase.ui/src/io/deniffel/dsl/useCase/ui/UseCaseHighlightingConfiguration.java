package io.deniffel.dsl.useCase.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class UseCaseHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	@Override
	public TextStyle stringTextStyle() {
		TextStyle textStyle = new TextStyle(); // No blue but dark grey
		return textStyle;
	}
	
	public TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
}
