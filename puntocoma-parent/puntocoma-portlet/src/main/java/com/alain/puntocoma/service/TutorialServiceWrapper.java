package com.alain.puntocoma.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TutorialService}.
 *
 * @author Alain
 * @see TutorialService
 * @generated
 */
public class TutorialServiceWrapper implements TutorialService,
    ServiceWrapper<TutorialService> {
    private TutorialService _tutorialService;

    public TutorialServiceWrapper(TutorialService tutorialService) {
        _tutorialService = tutorialService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tutorialService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tutorialService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tutorialService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TutorialService getWrappedTutorialService() {
        return _tutorialService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTutorialService(TutorialService tutorialService) {
        _tutorialService = tutorialService;
    }

    @Override
    public TutorialService getWrappedService() {
        return _tutorialService;
    }

    @Override
    public void setWrappedService(TutorialService tutorialService) {
        _tutorialService = tutorialService;
    }
}
