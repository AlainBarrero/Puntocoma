package com.puntocoma.web.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.lang.StringUtils;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Catalogo
 */
public class Catalogo extends MVCPortlet {
 
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		
		if(blankPreferences(renderRequest.getPreferences())){
			include("/html/error.jsp", renderRequest, renderResponse);
			return;
		}	
		
		String paginaPrincpalCatalogo = renderRequest.getPreferences().getValue("paginaPrincpalCatalogo", "no");
		
		if (paginaPrincpalCatalogo.equals("no")) {
			
			include("/html/catalogo/catalogo.jsp", renderRequest, renderResponse);
			return;
			
		} else {
			
			super.doView(renderRequest, renderResponse);
			
		}
	}
	
	private boolean blankPreferences(PortletPreferences prefs) {
		if( StringUtils.isBlank( prefs.getValue("paginaPrincpalCatalogo", "")) ){ return true;}	
		return false;
	}

	public void createCatalogo(ActionRequest actioRequest, ActionResponse actionResponse) {
		
	}
	
	public void removeCatalogo(ActionRequest actionRequest, ActionResponse actionrResponse) {
		
	}
	
}
