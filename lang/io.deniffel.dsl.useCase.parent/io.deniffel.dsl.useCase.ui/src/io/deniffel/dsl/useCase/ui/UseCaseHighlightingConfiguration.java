package io.deniffel.dsl.useCase.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class UseCaseHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	public static final String QUOTE_SIGN = "quote_sign";
	public static final String BULLET_POINT = "bullet_point";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(QUOTE_SIGN, "quote_sign", quoteSignTextStyle());
		acceptor.acceptDefaultHighlighting(BULLET_POINT, "bullet_point", bulletPointStyle());
	}
	
	public TextStyle quoteSignTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(180, 180, 180));
		return textStyle;
	}
	
	public TextStyle bulletPointStyle() {
		return keywordTextStyle();
	}
	
	
	@Override
	public TextStyle stringTextStyle() {
		TextStyle textStyle = new TextStyle(); // No blue but dark grey
		return textStyle;
	}
	
	@Override
	public TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	@Override
	public TextStyle numberTextStyle() {
		return keywordTextStyle();
	}
	
}
