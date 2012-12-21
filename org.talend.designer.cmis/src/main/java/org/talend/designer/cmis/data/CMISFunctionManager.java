/*******************************************************************************
 * Copyright (c) 2012 Julien Boulay - Ekito - www.ekito.fr.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Julien Boulay - Ekito - www.ekito.fr - initial API and implementation
 ******************************************************************************/
package org.talend.designer.cmis.data;

import org.talend.designer.cmis.CMISComponent;

public class CMISFunctionManager {

	
	private CMISComponent cmisComponent;
	private CMISSessionManager sessionManager;
	private CMISFolderManager cmisFolderManager;
	
	public CMISFunctionManager(CMISComponent component,
			CMISSessionManager sessionManager) {
		this.cmisComponent = component;
		this.sessionManager = sessionManager;
		this.cmisFolderManager = new CMISFolderManager(component, sessionManager);
	}
	
	public CMISFolderManager getFolderManager() {
		return cmisFolderManager;
	}
	
	public void save() {
		this.cmisFolderManager.save();
		
	}
}