package edu.arizona.biosemantics.oto.oto.client;

import com.google.gwt.inject.client.AbstractGinModule;

public class ClientModule extends AbstractGinModule {
	
	//convention: don't set view as singleton, unless for good reason. 
	//A view should in the general case be a widget, which can only be attached to one parent at a time.
	//If defined as singleton, it will with multiple use be attached to a new parent, hence disappear in another view.
	//This is usually not the desired behavior. 
	//Use providers or make presenter singleton and responsible of view/return the view when necessary for third party
	protected void configure() {
		
	}
}