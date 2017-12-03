package com.puntocoma.web.conf;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;

import org.apache.commons.lang.StringUtils;

import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

public class CatalogoActionConfiguration extends DefaultConfigurationAction  {

	@Override
	public void processAction(PortletConfig config, ActionRequest actionRequest, ActionResponse actionResponse) throws Exception { 
			
		String paginaPrincpalCatalogo = ParamUtil.getString(actionRequest, "paginaPrincpalCatalogo");
		
		if( !nullPreferences(paginaPrincpalCatalogo)) {
			
			String portletResource = ParamUtil.getString(actionRequest, "portletResource");
			PortletPreferences prefs = PortletPreferencesFactoryUtil.getPortletSetup(actionRequest, portletResource);
			
			prefs.reset("paginaPrincpalCatalogo");
			prefs.setValue("paginaPrincpalCatalogo", paginaPrincpalCatalogo);
			
			prefs.store();
			
			SessionMessages.add(actionRequest, "success");
			
		} else {
			
			SessionErrors.add(actionRequest, "error");
			
		}
		
		super.processAction(config, actionRequest, actionResponse);
	}
	
	private boolean nullPreferences(String paginaPrincpalCatalogo){		
		if( StringUtils.isBlank(paginaPrincpalCatalogo) ){ return true;}		
		return false;	
	}
	
}
