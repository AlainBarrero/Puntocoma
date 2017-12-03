package com.alain.puntocoma.service.persistence;

import com.alain.puntocoma.model.Catalogo;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the catalogo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Alain
 * @see CatalogoPersistenceImpl
 * @see CatalogoUtil
 * @generated
 */
public interface CatalogoPersistence extends BasePersistence<Catalogo> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CatalogoUtil} to access the catalogo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the catalogos where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @return the matching catalogos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.alain.puntocoma.model.Catalogo> findByorderCatalogo(
        long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the catalogos where catalogoId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.CatalogoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param catalogoId the catalogo ID
    * @param start the lower bound of the range of catalogos
    * @param end the upper bound of the range of catalogos (not inclusive)
    * @return the range of matching catalogos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.alain.puntocoma.model.Catalogo> findByorderCatalogo(
        long catalogoId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the catalogos where catalogoId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.CatalogoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param catalogoId the catalogo ID
    * @param start the lower bound of the range of catalogos
    * @param end the upper bound of the range of catalogos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching catalogos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.alain.puntocoma.model.Catalogo> findByorderCatalogo(
        long catalogoId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first catalogo in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching catalogo
    * @throws com.alain.puntocoma.NoSuchCatalogoException if a matching catalogo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Catalogo findByorderCatalogo_First(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first catalogo in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching catalogo, or <code>null</code> if a matching catalogo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Catalogo fetchByorderCatalogo_First(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last catalogo in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching catalogo
    * @throws com.alain.puntocoma.NoSuchCatalogoException if a matching catalogo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Catalogo findByorderCatalogo_Last(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last catalogo in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching catalogo, or <code>null</code> if a matching catalogo could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Catalogo fetchByorderCatalogo_Last(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the catalogos where catalogoId = &#63; from the database.
    *
    * @param catalogoId the catalogo ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByorderCatalogo(long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of catalogos where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @return the number of matching catalogos
    * @throws SystemException if a system exception occurred
    */
    public int countByorderCatalogo(long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the catalogo in the entity cache if it is enabled.
    *
    * @param catalogo the catalogo
    */
    public void cacheResult(com.alain.puntocoma.model.Catalogo catalogo);

    /**
    * Caches the catalogos in the entity cache if it is enabled.
    *
    * @param catalogos the catalogos
    */
    public void cacheResult(
        java.util.List<com.alain.puntocoma.model.Catalogo> catalogos);

    /**
    * Creates a new catalogo with the primary key. Does not add the catalogo to the database.
    *
    * @param catalogoId the primary key for the new catalogo
    * @return the new catalogo
    */
    public com.alain.puntocoma.model.Catalogo create(long catalogoId);

    /**
    * Removes the catalogo with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param catalogoId the primary key of the catalogo
    * @return the catalogo that was removed
    * @throws com.alain.puntocoma.NoSuchCatalogoException if a catalogo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Catalogo remove(long catalogoId)
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.alain.puntocoma.model.Catalogo updateImpl(
        com.alain.puntocoma.model.Catalogo catalogo)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the catalogo with the primary key or throws a {@link com.alain.puntocoma.NoSuchCatalogoException} if it could not be found.
    *
    * @param catalogoId the primary key of the catalogo
    * @return the catalogo
    * @throws com.alain.puntocoma.NoSuchCatalogoException if a catalogo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Catalogo findByPrimaryKey(long catalogoId)
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the catalogo with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param catalogoId the primary key of the catalogo
    * @return the catalogo, or <code>null</code> if a catalogo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Catalogo fetchByPrimaryKey(long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the catalogos.
    *
    * @return the catalogos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.alain.puntocoma.model.Catalogo> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.alain.puntocoma.model.Catalogo> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the catalogos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.CatalogoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of catalogos
    * @param end the upper bound of the range of catalogos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of catalogos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.alain.puntocoma.model.Catalogo> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the catalogos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of catalogos.
    *
    * @return the number of catalogos
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
