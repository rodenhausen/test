package edu.arizona.biosemantics.oto.oto.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class Client implements EntryPoint {

	private final ClientGinjector injector = GWT.create(ClientGinjector.class);

	public void onModuleLoad() {
		GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
	      public void onUncaughtException(Throwable e) {
	        //log.log(Level.SEVERE, e.getMessage(), e);
	      }
	    });
		
		//init layout
		RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();
		injector.getRootLayoutPanelDecorator().decorate(rootLayoutPanel);
	}
}
