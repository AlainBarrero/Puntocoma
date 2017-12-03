package com.alain.puntocoma.service.persistence;

import com.alain.puntocoma.NoSuchCatalogoException;
import com.alain.puntocoma.model.Catalogo;
import com.alain.puntocoma.model.impl.CatalogoImpl;
import com.alain.puntocoma.model.impl.CatalogoModelImpl;
import com.alain.puntocoma.service.persistence.CatalogoPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the catalogo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Alain
 * @see CatalogoPersistence
 * @see CatalogoUtil
 * @generated
 */
public class CatalogoPersistenceImpl extends BasePersistenceImpl<Catalogo>
    implements CatalogoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CatalogoUtil} to access the catalogo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CatalogoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
            CatalogoModelImpl.FINDER_CACHE_ENABLED, CatalogoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
            CatalogoModelImpl.FINDER_CACHE_ENABLED, CatalogoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
            CatalogoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORDERCATALOGO =
        new FinderPath(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
            CatalogoModelImpl.FINDER_CACHE_ENABLED, CatalogoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByorderCatalogo",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERCATALOGO =
        new FinderPath(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
            CatalogoModelImpl.FINDER_CACHE_ENABLED, CatalogoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByorderCatalogo",
            new String[] { Long.class.getName() },
            CatalogoModelImpl.CATALOGOID_COLUMN_BITMASK |
            CatalogoModelImpl.TITLE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ORDERCATALOGO = new FinderPath(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
            CatalogoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByorderCatalogo",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ORDERCATALOGO_CATALOGOID_2 = "catalogo.catalogoId = ?";
    private static final String _SQL_SELECT_CATALOGO = "SELECT catalogo FROM Catalogo catalogo";
    private static final String _SQL_SELECT_CATALOGO_WHERE = "SELECT catalogo FROM Catalogo catalogo WHERE ";
    private static final String _SQL_COUNT_CATALOGO = "SELECT COUNT(catalogo) FROM Catalogo catalogo";
    private static final String _SQL_COUNT_CATALOGO_WHERE = "SELECT COUNT(catalogo) FROM Catalogo catalogo WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "catalogo.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Catalogo exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Catalogo exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(CatalogoPersistenceImpl.class);
    private static Catalogo _nullCatalogo = new CatalogoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Catalogo> toCacheModel() {
                return _nullCatalogoCacheModel;
            }
        };

    private static CacheModel<Catalogo> _nullCatalogoCacheModel = new CacheModel<Catalogo>() {
            @Override
            public Catalogo toEntityModel() {
                return _nullCatalogo;
            }
        };

    public CatalogoPersistenceImpl() {
        setModelClass(Catalogo.class);
    }

    /**
     * Returns all the catalogos where catalogoId = &#63;.
     *
     * @param catalogoId the catalogo ID
     * @return the matching catalogos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Catalogo> findByorderCatalogo(long catalogoId)
        throws SystemException {
        return findByorderCatalogo(catalogoId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Catalogo> findByorderCatalogo(long catalogoId, int start,
        int end) throws SystemException {
        return findByorderCatalogo(catalogoId, start, end, null);
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
    @Override
    public List<Catalogo> findByorderCatalogo(long catalogoId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERCATALOGO;
            finderArgs = new Object[] { catalogoId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORDERCATALOGO;
            finderArgs = new Object[] { catalogoId, start, end, orderByComparator };
        }

        List<Catalogo> list = (List<Catalogo>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Catalogo catalogo : list) {
                if ((catalogoId != catalogo.getCatalogoId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_CATALOGO_WHERE);

            query.append(_FINDER_COLUMN_ORDERCATALOGO_CATALOGOID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CatalogoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(catalogoId);

                if (!pagination) {
                    list = (List<Catalogo>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Catalogo>(list);
                } else {
                    list = (List<Catalogo>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Catalogo findByorderCatalogo_First(long catalogoId,
        OrderByComparator orderByComparator)
        throws NoSuchCatalogoException, SystemException {
        Catalogo catalogo = fetchByorderCatalogo_First(catalogoId,
                orderByComparator);

        if (catalogo != null) {
            return catalogo;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("catalogoId=");
        msg.append(catalogoId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCatalogoException(msg.toString());
    }

    /**
     * Returns the first catalogo in the ordered set where catalogoId = &#63;.
     *
     * @param catalogoId the catalogo ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching catalogo, or <code>null</code> if a matching catalogo could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Catalogo fetchByorderCatalogo_First(long catalogoId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Catalogo> list = findByorderCatalogo(catalogoId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Catalogo findByorderCatalogo_Last(long catalogoId,
        OrderByComparator orderByComparator)
        throws NoSuchCatalogoException, SystemException {
        Catalogo catalogo = fetchByorderCatalogo_Last(catalogoId,
                orderByComparator);

        if (catalogo != null) {
            return catalogo;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("catalogoId=");
        msg.append(catalogoId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCatalogoException(msg.toString());
    }

    /**
     * Returns the last catalogo in the ordered set where catalogoId = &#63;.
     *
     * @param catalogoId the catalogo ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching catalogo, or <code>null</code> if a matching catalogo could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Catalogo fetchByorderCatalogo_Last(long catalogoId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByorderCatalogo(catalogoId);

        if (count == 0) {
            return null;
        }

        List<Catalogo> list = findByorderCatalogo(catalogoId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the catalogos where catalogoId = &#63; from the database.
     *
     * @param catalogoId the catalogo ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByorderCatalogo(long catalogoId)
        throws SystemException {
        for (Catalogo catalogo : findByorderCatalogo(catalogoId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(catalogo);
        }
    }

    /**
     * Returns the number of catalogos where catalogoId = &#63;.
     *
     * @param catalogoId the catalogo ID
     * @return the number of matching catalogos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByorderCatalogo(long catalogoId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ORDERCATALOGO;

        Object[] finderArgs = new Object[] { catalogoId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CATALOGO_WHERE);

            query.append(_FINDER_COLUMN_ORDERCATALOGO_CATALOGOID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(catalogoId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the catalogo in the entity cache if it is enabled.
     *
     * @param catalogo the catalogo
     */
    @Override
    public void cacheResult(Catalogo catalogo) {
        EntityCacheUtil.putResult(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
            CatalogoImpl.class, catalogo.getPrimaryKey(), catalogo);

        catalogo.resetOriginalValues();
    }

    /**
     * Caches the catalogos in the entity cache if it is enabled.
     *
     * @param catalogos the catalogos
     */
    @Override
    public void cacheResult(List<Catalogo> catalogos) {
        for (Catalogo catalogo : catalogos) {
            if (EntityCacheUtil.getResult(
                        CatalogoModelImpl.ENTITY_CACHE_ENABLED,
                        CatalogoImpl.class, catalogo.getPrimaryKey()) == null) {
                cacheResult(catalogo);
            } else {
                catalogo.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all catalogos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CatalogoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CatalogoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the catalogo.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Catalogo catalogo) {
        EntityCacheUtil.removeResult(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
            CatalogoImpl.class, catalogo.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Catalogo> catalogos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Catalogo catalogo : catalogos) {
            EntityCacheUtil.removeResult(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
                CatalogoImpl.class, catalogo.getPrimaryKey());
        }
    }

    /**
     * Creates a new catalogo with the primary key. Does not add the catalogo to the database.
     *
     * @param catalogoId the primary key for the new catalogo
     * @return the new catalogo
     */
    @Override
    public Catalogo create(long catalogoId) {
        Catalogo catalogo = new CatalogoImpl();

        catalogo.setNew(true);
        catalogo.setPrimaryKey(catalogoId);

        return catalogo;
    }

    /**
     * Removes the catalogo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param catalogoId the primary key of the catalogo
     * @return the catalogo that was removed
     * @throws com.alain.puntocoma.NoSuchCatalogoException if a catalogo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Catalogo remove(long catalogoId)
        throws NoSuchCatalogoException, SystemException {
        return remove((Serializable) catalogoId);
    }

    /**
     * Removes the catalogo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the catalogo
     * @return the catalogo that was removed
     * @throws com.alain.puntocoma.NoSuchCatalogoException if a catalogo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Catalogo remove(Serializable primaryKey)
        throws NoSuchCatalogoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Catalogo catalogo = (Catalogo) session.get(CatalogoImpl.class,
                    primaryKey);

            if (catalogo == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCatalogoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(catalogo);
        } catch (NoSuchCatalogoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Catalogo removeImpl(Catalogo catalogo) throws SystemException {
        catalogo = toUnwrappedModel(catalogo);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(catalogo)) {
                catalogo = (Catalogo) session.get(CatalogoImpl.class,
                        catalogo.getPrimaryKeyObj());
            }

            if (catalogo != null) {
                session.delete(catalogo);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (catalogo != null) {
            clearCache(catalogo);
        }

        return catalogo;
    }

    @Override
    public Catalogo updateImpl(com.alain.puntocoma.model.Catalogo catalogo)
        throws SystemException {
        catalogo = toUnwrappedModel(catalogo);

        boolean isNew = catalogo.isNew();

        CatalogoModelImpl catalogoModelImpl = (CatalogoModelImpl) catalogo;

        Session session = null;

        try {
            session = openSession();

            if (catalogo.isNew()) {
                session.save(catalogo);

                catalogo.setNew(false);
            } else {
                session.merge(catalogo);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !CatalogoModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((catalogoModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERCATALOGO.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        catalogoModelImpl.getOriginalCatalogoId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORDERCATALOGO,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERCATALOGO,
                    args);

                args = new Object[] { catalogoModelImpl.getCatalogoId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORDERCATALOGO,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERCATALOGO,
                    args);
            }
        }

        EntityCacheUtil.putResult(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
            CatalogoImpl.class, catalogo.getPrimaryKey(), catalogo);

        return catalogo;
    }

    protected Catalogo toUnwrappedModel(Catalogo catalogo) {
        if (catalogo instanceof CatalogoImpl) {
            return catalogo;
        }

        CatalogoImpl catalogoImpl = new CatalogoImpl();

        catalogoImpl.setNew(catalogo.isNew());
        catalogoImpl.setPrimaryKey(catalogo.getPrimaryKey());

        catalogoImpl.setCatalogoId(catalogo.getCatalogoId());
        catalogoImpl.setTitle(catalogo.getTitle());
        catalogoImpl.setImage(catalogo.getImage());
        catalogoImpl.setDescription(catalogo.getDescription());

        return catalogoImpl;
    }

    /**
     * Returns the catalogo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the catalogo
     * @return the catalogo
     * @throws com.alain.puntocoma.NoSuchCatalogoException if a catalogo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Catalogo findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCatalogoException, SystemException {
        Catalogo catalogo = fetchByPrimaryKey(primaryKey);

        if (catalogo == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCatalogoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return catalogo;
    }

    /**
     * Returns the catalogo with the primary key or throws a {@link com.alain.puntocoma.NoSuchCatalogoException} if it could not be found.
     *
     * @param catalogoId the primary key of the catalogo
     * @return the catalogo
     * @throws com.alain.puntocoma.NoSuchCatalogoException if a catalogo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Catalogo findByPrimaryKey(long catalogoId)
        throws NoSuchCatalogoException, SystemException {
        return findByPrimaryKey((Serializable) catalogoId);
    }

    /**
     * Returns the catalogo with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the catalogo
     * @return the catalogo, or <code>null</code> if a catalogo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Catalogo fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Catalogo catalogo = (Catalogo) EntityCacheUtil.getResult(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
                CatalogoImpl.class, primaryKey);

        if (catalogo == _nullCatalogo) {
            return null;
        }

        if (catalogo == null) {
            Session session = null;

            try {
                session = openSession();

                catalogo = (Catalogo) session.get(CatalogoImpl.class, primaryKey);

                if (catalogo != null) {
                    cacheResult(catalogo);
                } else {
                    EntityCacheUtil.putResult(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
                        CatalogoImpl.class, primaryKey, _nullCatalogo);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CatalogoModelImpl.ENTITY_CACHE_ENABLED,
                    CatalogoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return catalogo;
    }

    /**
     * Returns the catalogo with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param catalogoId the primary key of the catalogo
     * @return the catalogo, or <code>null</code> if a catalogo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Catalogo fetchByPrimaryKey(long catalogoId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) catalogoId);
    }

    /**
     * Returns all the catalogos.
     *
     * @return the catalogos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Catalogo> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Catalogo> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Catalogo> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Catalogo> list = (List<Catalogo>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CATALOGO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CATALOGO;

                if (pagination) {
                    sql = sql.concat(CatalogoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Catalogo>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Catalogo>(list);
                } else {
                    list = (List<Catalogo>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the catalogos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Catalogo catalogo : findAll()) {
            remove(catalogo);
        }
    }

    /**
     * Returns the number of catalogos.
     *
     * @return the number of catalogos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_CATALOGO);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the catalogo persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.alain.puntocoma.model.Catalogo")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Catalogo>> listenersList = new ArrayList<ModelListener<Catalogo>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Catalogo>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CatalogoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
