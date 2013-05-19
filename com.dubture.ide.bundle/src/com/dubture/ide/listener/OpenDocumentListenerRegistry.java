package com.dubture.ide.listener;

import java.util.List;

public class OpenDocumentListenerRegistry {

	private static final String ID = "com.dubture.ide.bundle.openDocumentListener";
	
	protected static List<OpenDocumentListener> listeners = null;
	
	public static List<OpenDocumentListener> getListeners() {
		
		//TODO: load extensions and cache them
		return listeners;
	}
}
