package com.dubture.ide;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IStartup;

/**
 * Liste to File/Folder drop events from the OS.
 * 
 * @author Robert Gruendler <r.gruendler@gmail.com>
 */
public class StartupListener implements IStartup {

	public void earlyStartup() {

		final Display display = Display.getDefault();
		
		display.asyncExec(new Runnable() {
			public void run() {
				display.addListener(SWT.OpenDocument, new Listener() {
					public void handleEvent(final Event event) {
						if (event.text != null) {
							//TODO: call the extensions points and pass them the document / folder to open
						}
					}
				});
			}
		});
	}
}
