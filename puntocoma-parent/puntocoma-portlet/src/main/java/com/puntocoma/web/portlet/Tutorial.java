package com.puntocoma.web.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.alain.puntocoma.service.CatalogoLocalServiceUtil;
import com.alain.puntocoma.service.TutorialLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Tutorial
 */
public class Tutorial extends MVCPortlet {
 
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		
		try {
			
			List<com.alain.puntocoma.model.Catalogo> catalogoList = CatalogoLocalServiceUtil.getAllCatalogos();
			renderRequest.setAttribute("catalogoList", catalogoList);
			
			List<com.alain.puntocoma.model.Tutorial> tutorialList = TutorialLocalServiceUtil.getAllTutoriales();
			renderRequest.setAttribute("tutorialList", tutorialList);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		super.doView(renderRequest, renderResponse);
	}
	
	public void createTutorial(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		long articleId = ParamUtil.getLong(actionRequest, "idArticle");
		long categoriaId = ParamUtil.getLong(actionRequest, "categoriaId");
		String title = ParamUtil.getString(actionRequest, "title");
		String image = ParamUtil.getString(actionRequest, "image");
		String description = ParamUtil.getString(actionRequest, "description");
		
		try {
			
			TutorialLocalServiceUtil.createTutorial(articleId, categoriaId, title, image, description);
		
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
	}
	
	public void removeTutorial(ActionRequest actionRequest, ActionResponse actionResponse) {
		long articleId = ParamUtil.getLong(actionRequest, "articleId");
		
		try {
			
			TutorialLocalServiceUtil.removeTutorial(articleId);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
