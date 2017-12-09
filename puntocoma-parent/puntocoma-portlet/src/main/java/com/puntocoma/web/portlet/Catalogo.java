package com.puntocoma.web.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.lang.StringUtils;

import com.alain.puntocoma.NoSuchCatalogoException;
import com.alain.puntocoma.service.CatalogoLocalServiceUtil;
import com.alain.puntocoma.service.TutorialLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
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
		long catalogoId = ParamUtil.getLong(renderRequest, "catalogoId", 0);
		long articleId = ParamUtil.getLong(renderRequest, "articleId", 0);
		
		try {
			
			List<com.alain.puntocoma.model.Catalogo> catalogoList = CatalogoLocalServiceUtil.getAllCatalogos();
			renderRequest.setAttribute("catalogoList", catalogoList);
			
		} catch (Exception e) {
			include("/html/error.jsp", renderRequest, renderResponse);
			return;
		}
		
		if (paginaPrincpalCatalogo.equals("no")) {
			
			include("/html/catalogo/catalogo.jsp", renderRequest, renderResponse);
			return;
			
		} else {
			
			if(articleId != 0) {
				
				try {
					
					com.alain.puntocoma.model.Tutorial tutorial = TutorialLocalServiceUtil.getTutorial(articleId);
					renderRequest.setAttribute("tutorial", tutorial);

				} catch(Exception e) {
					include("/html/error.jsp", renderRequest, renderResponse);
					return;
				}
				
				include("/html/catalogo/tutorial.jsp", renderRequest, renderResponse);
				return;
				
			}
			
			
			if(catalogoId != 0) {
				
				try {
					
					List<com.alain.puntocoma.model.Tutorial> tutorialList = TutorialLocalServiceUtil.getTutorialesByCatalogo(catalogoId);
					com.alain.puntocoma.model.Catalogo catalogo = CatalogoLocalServiceUtil.getCatalogo(catalogoId);
					renderRequest.setAttribute("catalogo", catalogo);
					renderRequest.setAttribute("tutorialList", tutorialList);
					
				} catch(Exception e) {
					include("/html/error.jsp", renderRequest, renderResponse);
					return;
				}
				
				include("/html/catalogo/lista-tutoriales.jsp", renderRequest, renderResponse);
				return;
				
			}
			
			super.doView(renderRequest, renderResponse);
			
		}
	}
	
	private boolean blankPreferences(PortletPreferences prefs) {
		if( StringUtils.isBlank( prefs.getValue("paginaPrincpalCatalogo", "")) ){ return true;}	
		return false;
	}

	public void createCatalogo(ActionRequest actionRequest, ActionResponse actionResponse) throws NoSuchCatalogoException, SystemException {
		
		String title = ParamUtil.getString(actionRequest, "title");
		String image = ParamUtil.getString(actionRequest, "image");
		String description = ParamUtil.getString(actionRequest, "description");
		
		CatalogoLocalServiceUtil.createCatalogo(title, image, description);
	}
	
	public void removeCatalogo(ActionRequest actionRequest, ActionResponse actionrResponse) throws NoSuchCatalogoException, SystemException {
		long catalogoId = ParamUtil.getLong(actionRequest, "categoriaId");
	
		CatalogoLocalServiceUtil.removeCatalogo(catalogoId);
	}
	
}
