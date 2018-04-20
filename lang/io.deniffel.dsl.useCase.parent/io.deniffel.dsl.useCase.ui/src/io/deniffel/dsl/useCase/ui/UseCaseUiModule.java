package io.deniffel.dsl.useCase.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

public class UseCaseUiModule extends AbstractUseCaseUiModule {

	public UseCaseUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return UseCaseHighlightingConfiguration.class;
	}

}
