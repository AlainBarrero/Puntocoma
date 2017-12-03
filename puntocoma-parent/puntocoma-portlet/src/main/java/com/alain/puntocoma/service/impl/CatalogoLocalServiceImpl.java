package com.alain.puntocoma.service.impl;

import java.util.List;

import com.alain.puntocoma.NoSuchCatalogoException;
import com.alain.puntocoma.model.Catalogo;
import com.alain.puntocoma.service.base.CatalogoLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the catalogo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alain.puntocoma.service.CatalogoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Alain
 * @see com.alain.puntocoma.service.base.CatalogoLocalServiceBaseImpl
 * @see com.alain.puntocoma.service.CatalogoLocalServiceUtil
 */
public class CatalogoLocalServiceImpl extends CatalogoLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.alain.puntocoma.service.CatalogoLocalServiceUtil} to access the catalogo local service.
     */
	
	@Override
	public List<Catalogo> getAllCatalogos() throws NoSuchCatalogoException, SystemException {
		return catalogoPersistence.findAll();
	}
	
	@Override
	public Catalogo createCatalogo(String title, String image, String description) throws NoSuchCatalogoException, SystemException {
		
		try {
			
			long catalogoId = counterLocalService.increment();
			
			Catalogo catalogo = catalogoPersistence.create(catalogoId);
			
			catalogo.setTitle(title);
			catalogo.setImage(image);
			catalogo.setDescription(description);
			
			return catalogoPersistence.update(catalogo);
			
		} catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public Catalogo removeCatalogo(long catalogoId) throws NoSuchCatalogoException, SystemException {
		return catalogoPersistence.remove(catalogoId);
	}
}
