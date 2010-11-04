package com.subgraph.vega.internal.ui.http;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class ProxyPerspectiveFactory implements IPerspectiveFactory {
	private final static String HTTP_VIEW = "com.subgraph.vega.views.http";
	private final static String WEBSITE_VIEW = "com.subgraph.vega.views.website";
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.addView(HTTP_VIEW, IPageLayout.TOP, 0f, layout.getEditorArea());
		layout.addView(WEBSITE_VIEW, IPageLayout.LEFT, 0.25f, HTTP_VIEW);
		layout.setEditorAreaVisible(false);
	}

}