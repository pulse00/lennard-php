package com.dubture.ide.listener;

/**
 * 
 * @author Robert Gruendler <r.gruendler@gmail.com>
 *
 */
public interface OpenDocumentListener {

	/**
	 * @param path  The absolute on the file path the user requests to open with eclipse
	 * @return true if the extension handled the open operation, falsea otherwise
	 */
	public boolean onDocumentOpen(String path);
}
