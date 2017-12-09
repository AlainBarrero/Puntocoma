package com.alain.puntocoma.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CatalogoLocalService}.
 *
 * @author Alain
 * @see CatalogoLocalService
 * @generated
 */
public class CatalogoLocalServiceWrapper implements CatalogoLocalService,
    ServiceWrapper<CatalogoLocalService> {
    private CatalogoLocalService _catalogoLocalService;

    public CatalogoLocalServiceWrapper(
        CatalogoLocalService catalogoLocalService) {
        _catalogoLocalService = catalogoLocalService;
    }

    /**
    * Adds the catalogo to the database. Also notifies the appropriate model listeners.
    *
    * @param catalogo the catalogo
    * @return the catalogo that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.alain.puntocoma.model.Catalogo addCatalogo(
        com.alain.puntocoma.model.Catalogo catalogo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.addCatalogo(catalogo);
    }

    /**
    * Creates a new catalogo with the primary key. Does not add the catalogo to the database.
    *
    * @param catalogoId the primary key for the new catalogo
    * @return the new catalogo
    */
    @Override
    public com.alain.puntocoma.model.Catalogo createCatalogo(long catalogoId) {
        return _catalogoLocalService.createCatalogo(catalogoId);
    }

    /**
    * Deletes the catalogo with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param catalogoId the primary key of the catalogo
    * @return the catalogo that was removed
    * @throws PortalException if a catalogo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.alain.puntocoma.model.Catalogo deleteCatalogo(long catalogoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.deleteCatalogo(catalogoId);
    }

    /**
    * Deletes the catalogo from the database. Also notifies the appropriate model listeners.
    *
    * @param catalogo the catalogo
    * @return the catalogo that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.alain.puntocoma.model.Catalogo deleteCatalogo(
        com.alain.puntocoma.model.Catalogo catalogo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.deleteCatalogo(catalogo);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _catalogoLocalService.dynamicQuery();
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
        return _catalogoLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.CatalogoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _catalogoLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.CatalogoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _catalogoLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _catalogoLocalService.dynamicQueryCount(dynamicQuery);
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
        return _catalogoLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.alain.puntocoma.model.Catalogo fetchCatalogo(long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.fetchCatalogo(catalogoId);
    }

    /**
    * Returns the catalogo with the primary key.
    *
    * @param catalogoId the primary key of the catalogo
    * @return the catalogo
    * @throws PortalException if a catalogo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    * @throws com.alain.puntocoma.NoSuchCatalogoException
    */
    @Override
    public com.alain.puntocoma.model.Catalogo getCatalogo(long catalogoId)
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.getCatalogo(catalogoId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the catalogos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.CatalogoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of catalogos
    * @param end the upper bound of the range of catalogos (not inclusive)
    * @return the range of catalogos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.alain.puntocoma.model.Catalogo> getCatalogos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.getCatalogos(start, end);
    }

    /**
    * Returns the number of catalogos.
    *
    * @return the number of catalogos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getCatalogosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.getCatalogosCount();
    }

    /**
    * Updates the catalogo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param catalogo the catalogo
    * @return the catalogo that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.alain.puntocoma.model.Catalogo updateCatalogo(
        com.alain.puntocoma.model.Catalogo catalogo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.updateCatalogo(catalogo);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _catalogoLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _catalogoLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _catalogoLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<com.alain.puntocoma.model.Catalogo> getAllCatalogos()
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.getAllCatalogos();
    }

    @Override
    public com.alain.puntocoma.model.Catalogo createCatalogo(
        java.lang.String title, java.lang.String image,
        java.lang.String description)
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.createCatalogo(title, image, description);
    }

    @Override
    public com.alain.puntocoma.model.Catalogo removeCatalogo(long catalogoId)
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.SystemException {
        return _catalogoLocalService.removeCatalogo(catalogoId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CatalogoLocalService getWrappedCatalogoLocalService() {
        return _catalogoLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCatalogoLocalService(
        CatalogoLocalService catalogoLocalService) {
        _catalogoLocalService = catalogoLocalService;
    }

    @Override
    public CatalogoLocalService getWrappedService() {
        return _catalogoLocalService;
    }

    @Override
    public void setWrappedService(CatalogoLocalService catalogoLocalService) {
        _catalogoLocalService = catalogoLocalService;
    }
}
