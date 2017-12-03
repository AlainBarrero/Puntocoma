package com.alain.puntocoma.service.persistence;

import com.alain.puntocoma.model.Catalogo;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the catalogo service. This utility wraps {@link CatalogoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Alain
 * @see CatalogoPersistence
 * @see CatalogoPersistenceImpl
 * @generated
 */
public class CatalogoUtil {
    private static CatalogoPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Catalogo catalogo) {
        getPersistence().clearCache(catalogo);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Catalogo> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Catalogo> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Catalogo> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Catalogo update(Catalogo catalogo) throws SystemException {
        return getPersistence().update(catalogo);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Catalogo update(Catalogo catalogo,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(catalogo, serviceContext);
    }

    /**
    * Returns all the catalogos where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @return the matching catalogos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.alain.puntocoma.model.Catalogo> findByorderCatalogo(
        long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByorderCatalogo(catalogoId);
    }

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
    public static java.util.List<com.alain.puntocoma.model.Catalogo> findByorderCatalogo(
        long catalogoId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByorderCatalogo(catalogoId, start, end);
    }

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
    public static java.util.List<com.alain.puntocoma.model.Catalogo> findByorderCatalogo(
        long catalogoId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByorderCatalogo(catalogoId, start, end,
            orderByComparator);
    }

    /**
    * Returns the first catalogo in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching catalogo
    * @throws com.alain.puntocoma.NoSuchCatalogoException if a matching catalogo could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Catalogo findByorderCatalogo_First(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByorderCatalogo_First(catalogoId, orderByComparator);
    }

    /**
    * Returns the first catalogo in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching catalogo, or <code>null</code> if a matching catalogo could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Catalogo fetchByorderCatalogo_First(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByorderCatalogo_First(catalogoId, orderByComparator);
    }

    /**
    * Returns the last catalogo in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching catalogo
    * @throws com.alain.puntocoma.NoSuchCatalogoException if a matching catalogo could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Catalogo findByorderCatalogo_Last(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByorderCatalogo_Last(catalogoId, orderByComparator);
    }

    /**
    * Returns the last catalogo in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching catalogo, or <code>null</code> if a matching catalogo could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Catalogo fetchByorderCatalogo_Last(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByorderCatalogo_Last(catalogoId, orderByComparator);
    }

    /**
    * Removes all the catalogos where catalogoId = &#63; from the database.
    *
    * @param catalogoId the catalogo ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByorderCatalogo(long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByorderCatalogo(catalogoId);
    }

    /**
    * Returns the number of catalogos where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @return the number of matching catalogos
    * @throws SystemException if a system exception occurred
    */
    public static int countByorderCatalogo(long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByorderCatalogo(catalogoId);
    }

    /**
    * Caches the catalogo in the entity cache if it is enabled.
    *
    * @param catalogo the catalogo
    */
    public static void cacheResult(com.alain.puntocoma.model.Catalogo catalogo) {
        getPersistence().cacheResult(catalogo);
    }

    /**
    * Caches the catalogos in the entity cache if it is enabled.
    *
    * @param catalogos the catalogos
    */
    public static void cacheResult(
        java.util.List<com.alain.puntocoma.model.Catalogo> catalogos) {
        getPersistence().cacheResult(catalogos);
    }

    /**
    * Creates a new catalogo with the primary key. Does not add the catalogo to the database.
    *
    * @param catalogoId the primary key for the new catalogo
    * @return the new catalogo
    */
    public static com.alain.puntocoma.model.Catalogo create(long catalogoId) {
        return getPersistence().create(catalogoId);
    }

    /**
    * Removes the catalogo with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param catalogoId the primary key of the catalogo
    * @return the catalogo that was removed
    * @throws com.alain.puntocoma.NoSuchCatalogoException if a catalogo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Catalogo remove(long catalogoId)
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(catalogoId);
    }

    public static com.alain.puntocoma.model.Catalogo updateImpl(
        com.alain.puntocoma.model.Catalogo catalogo)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(catalogo);
    }

    /**
    * Returns the catalogo with the primary key or throws a {@link com.alain.puntocoma.NoSuchCatalogoException} if it could not be found.
    *
    * @param catalogoId the primary key of the catalogo
    * @return the catalogo
    * @throws com.alain.puntocoma.NoSuchCatalogoException if a catalogo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Catalogo findByPrimaryKey(
        long catalogoId)
        throws com.alain.puntocoma.NoSuchCatalogoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(catalogoId);
    }

    /**
    * Returns the catalogo with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param catalogoId the primary key of the catalogo
    * @return the catalogo, or <code>null</code> if a catalogo with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Catalogo fetchByPrimaryKey(
        long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(catalogoId);
    }

    /**
    * Returns all the catalogos.
    *
    * @return the catalogos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.alain.puntocoma.model.Catalogo> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.alain.puntocoma.model.Catalogo> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.alain.puntocoma.model.Catalogo> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the catalogos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of catalogos.
    *
    * @return the number of catalogos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static CatalogoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (CatalogoPersistence) PortletBeanLocatorUtil.locate(com.alain.puntocoma.service.ClpSerializer.getServletContextName(),
                    CatalogoPersistence.class.getName());

            ReferenceRegistry.registerReference(CatalogoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(CatalogoPersistence persistence) {
    }
}
