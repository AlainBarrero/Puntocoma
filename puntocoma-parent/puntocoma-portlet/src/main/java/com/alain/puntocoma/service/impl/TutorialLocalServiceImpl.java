package com.alain.puntocoma.service.impl;

import java.util.List;

import com.alain.puntocoma.NoSuchTutorialException;
import com.alain.puntocoma.model.Tutorial;
import com.alain.puntocoma.service.base.TutorialLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the tutorial local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.alain.puntocoma.service.TutorialLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Alain
 * @see com.alain.puntocoma.service.base.TutorialLocalServiceBaseImpl
 * @see com.alain.puntocoma.service.TutorialLocalServiceUtil
 */
public class TutorialLocalServiceImpl extends TutorialLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.alain.puntocoma.service.TutorialLocalServiceUtil} to access the tutorial local service.
     */
	
	
	@Override
	public List<Tutorial> getAllTutoriales() throws SystemException {
		return tutorialPersistence.findAll();
	}
	
	@Override
	public List<Tutorial> getTutorialesByCatalogo(long catalogoId) throws SystemException {
		return tutorialPersistence.findByorderTutorial(catalogoId);
	}
	
	@Override
	public Tutorial createTutorial(long articleId, long catalogoId, String title, String image, String description) throws SystemException {
		
		Tutorial tutorial = tutorialPersistence.create(articleId);
		
		tutorial.setCatalogoId(catalogoId);
		tutorial.setTitle(title);
		tutorial.setImage(image);
		tutorial.setDescription(description);
		
		return tutorialPersistence.update(tutorial);
	}
	
	@Override
	public Tutorial removeTutorial(long articleId) throws NoSuchTutorialException, SystemException {
		return tutorialPersistence.remove(articleId);
	}
}
