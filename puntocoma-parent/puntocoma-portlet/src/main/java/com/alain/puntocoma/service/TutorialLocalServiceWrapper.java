package com.alain.puntocoma.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TutorialLocalService}.
 *
 * @author Alain
 * @see TutorialLocalService
 * @generated
 */
public class TutorialLocalServiceWrapper implements TutorialLocalService,
    ServiceWrapper<TutorialLocalService> {
    private TutorialLocalService _tutorialLocalService;

    public TutorialLocalServiceWrapper(
        TutorialLocalService tutorialLocalService) {
        _tutorialLocalService = tutorialLocalService;
    }

    /**
    * Adds the tutorial to the database. Also notifies the appropriate model listeners.
    *
    * @param tutorial the tutorial
    * @return the tutorial that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.alain.puntocoma.model.Tutorial addTutorial(
        com.alain.puntocoma.model.Tutorial tutorial)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.addTutorial(tutorial);
    }

    /**
    * Creates a new tutorial with the primary key. Does not add the tutorial to the database.
    *
    * @param articleId the primary key for the new tutorial
    * @return the new tutorial
    */
    @Override
    public com.alain.puntocoma.model.Tutorial createTutorial(long articleId) {
        return _tutorialLocalService.createTutorial(articleId);
    }

    /**
    * Deletes the tutorial with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param articleId the primary key of the tutorial
    * @return the tutorial that was removed
    * @throws PortalException if a tutorial with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.alain.puntocoma.model.Tutorial deleteTutorial(long articleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.deleteTutorial(articleId);
    }

    /**
    * Deletes the tutorial from the database. Also notifies the appropriate model listeners.
    *
    * @param tutorial the tutorial
    * @return the tutorial that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.alain.puntocoma.model.Tutorial deleteTutorial(
        com.alain.puntocoma.model.Tutorial tutorial)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.deleteTutorial(tutorial);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _tutorialLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.alain.puntocoma.model.Tutorial fetchTutorial(long articleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.fetchTutorial(articleId);
    }

    /**
    * Returns the tutorial with the primary key.
    *
    * @param articleId the primary key of the tutorial
    * @return the tutorial
    * @throws PortalException if a tutorial with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.alain.puntocoma.model.Tutorial getTutorial(long articleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.getTutorial(articleId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the tutorials.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of tutorials
    * @param end the upper bound of the range of tutorials (not inclusive)
    * @return the range of tutorials
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.alain.puntocoma.model.Tutorial> getTutorials(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.getTutorials(start, end);
    }

    /**
    * Returns the number of tutorials.
    *
    * @return the number of tutorials
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTutorialsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.getTutorialsCount();
    }

    /**
    * Updates the tutorial in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tutorial the tutorial
    * @return the tutorial that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.alain.puntocoma.model.Tutorial updateTutorial(
        com.alain.puntocoma.model.Tutorial tutorial)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.updateTutorial(tutorial);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _tutorialLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _tutorialLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _tutorialLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<com.alain.puntocoma.model.Tutorial> getAllTutoriales()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.getAllTutoriales();
    }

    @Override
    public java.util.List<com.alain.puntocoma.model.Tutorial> getTutorialesByCatalogo(
        long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.getTutorialesByCatalogo(catalogoId);
    }

    @Override
    public com.alain.puntocoma.model.Tutorial createTutorial(long articleId,
        long catalogoId, java.lang.String title, java.lang.String image,
        java.lang.String description)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.createTutorial(articleId, catalogoId,
            title, image, description);
    }

    @Override
    public com.alain.puntocoma.model.Tutorial removeTutorial(long articleId)
        throws com.alain.puntocoma.NoSuchTutorialException,
            com.liferay.portal.kernel.exception.SystemException {
        return _tutorialLocalService.removeTutorial(articleId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TutorialLocalService getWrappedTutorialLocalService() {
        return _tutorialLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTutorialLocalService(
        TutorialLocalService tutorialLocalService) {
        _tutorialLocalService = tutorialLocalService;
    }

    @Override
    public TutorialLocalService getWrappedService() {
        return _tutorialLocalService;
    }

    @Override
    public void setWrappedService(TutorialLocalService tutorialLocalService) {
        _tutorialLocalService = tutorialLocalService;
    }
}
