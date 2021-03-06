/******************************************************************************* 
 * Copyright (c) 2016 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/ 
package org.jboss.ide.eclipse.as.ui.editor.ports;

import org.eclipse.swt.widgets.Composite;
import org.jboss.ide.eclipse.as.core.util.ServerAttributeHelper;

public interface IPortEditorExtension {
	public void setServerAttributeHelper(ServerAttributeHelper helper);
	public void setSection(PortSection section);
	public void createControl(Composite parent);
	public String getValue();
	public void refresh();
}