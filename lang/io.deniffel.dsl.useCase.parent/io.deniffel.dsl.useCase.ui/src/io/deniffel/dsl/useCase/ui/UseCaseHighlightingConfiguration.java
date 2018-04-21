package io.deniffel.dsl.useCase.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class UseCaseHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	public static final String QUOTE_SIGN = "quote_sign";
	public static final String BULLET_POINT = "bullet_point";
	public static final String SQUARE_BRAKETS_WITH_CONTENT = "square_brackets_with_content";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(QUOTE_SIGN, "Quote Sign", quoteSignTextStyle());
		acceptor.acceptDefaultHighlighting(BULLET_POINT, "Bullet Point", bulletPointStyle());
		acceptor.acceptDefaultHighlighting(SQUARE_BRAKETS_WITH_CONTENT, "Wquare Brackets, including Content", squareBracketsWithContentStyle());
	}
	
	public TextStyle quoteSignTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(210, 210, 210));
		return textStyle;
	}
	
	public TextStyle bulletPointStyle() {
		return keywordTextStyle();
	}
	
	public TextStyle squareBracketsWithContentStyle() {
		return quoteSignTextStyle();
	}
	
	@Override
	public TextStyle stringTextStyle() {
		TextStyle textStyle = new TextStyle(); // Not blue but dark grey
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
