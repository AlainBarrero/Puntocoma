package com.alain.puntocoma.service.persistence;

import com.alain.puntocoma.NoSuchTutorialException;
import com.alain.puntocoma.model.Tutorial;
import com.alain.puntocoma.model.impl.TutorialImpl;
import com.alain.puntocoma.model.impl.TutorialModelImpl;
import com.alain.puntocoma.service.persistence.TutorialPersistence;

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
 * The persistence implementation for the tutorial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Alain
 * @see TutorialPersistence
 * @see TutorialUtil
 * @generated
 */
public class TutorialPersistenceImpl extends BasePersistenceImpl<Tutorial>
    implements TutorialPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TutorialUtil} to access the tutorial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TutorialImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TutorialModelImpl.ENTITY_CACHE_ENABLED,
            TutorialModelImpl.FINDER_CACHE_ENABLED, TutorialImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TutorialModelImpl.ENTITY_CACHE_ENABLED,
            TutorialModelImpl.FINDER_CACHE_ENABLED, TutorialImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TutorialModelImpl.ENTITY_CACHE_ENABLED,
            TutorialModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ORDERTUTORIAL =
        new FinderPath(TutorialModelImpl.ENTITY_CACHE_ENABLED,
            TutorialModelImpl.FINDER_CACHE_ENABLED, TutorialImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByorderTutorial",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERTUTORIAL =
        new FinderPath(TutorialModelImpl.ENTITY_CACHE_ENABLED,
            TutorialModelImpl.FINDER_CACHE_ENABLED, TutorialImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByorderTutorial",
            new String[] { Long.class.getName() },
            TutorialModelImpl.ARTICLEID_COLUMN_BITMASK |
            TutorialModelImpl.TITLE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ORDERTUTORIAL = new FinderPath(TutorialModelImpl.ENTITY_CACHE_ENABLED,
            TutorialModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByorderTutorial",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ORDERTUTORIAL_ARTICLEID_2 = "tutorial.articleId = ?";
    private static final String _SQL_SELECT_TUTORIAL = "SELECT tutorial FROM Tutorial tutorial";
    private static final String _SQL_SELECT_TUTORIAL_WHERE = "SELECT tutorial FROM Tutorial tutorial WHERE ";
    private static final String _SQL_COUNT_TUTORIAL = "SELECT COUNT(tutorial) FROM Tutorial tutorial";
    private static final String _SQL_COUNT_TUTORIAL_WHERE = "SELECT COUNT(tutorial) FROM Tutorial tutorial WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "tutorial.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Tutorial exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Tutorial exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TutorialPersistenceImpl.class);
    private static Tutorial _nullTutorial = new TutorialImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Tutorial> toCacheModel() {
                return _nullTutorialCacheModel;
            }
        };

    private static CacheModel<Tutorial> _nullTutorialCacheModel = new CacheModel<Tutorial>() {
            @Override
            public Tutorial toEntityModel() {
                return _nullTutorial;
            }
        };

    public TutorialPersistenceImpl() {
        setModelClass(Tutorial.class);
    }

    /**
     * Returns all the tutorials where articleId = &#63;.
     *
     * @param articleId the article ID
     * @return the matching tutorials
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Tutorial> findByorderTutorial(long articleId)
        throws SystemException {
        return findByorderTutorial(articleId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the tutorials where articleId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param articleId the article ID
     * @param start the lower bound of the range of tutorials
     * @param end the upper bound of the range of tutorials (not inclusive)
     * @return the range of matching tutorials
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Tutorial> findByorderTutorial(long articleId, int start, int end)
        throws SystemException {
        return findByorderTutorial(articleId, start, end, null);
    }

    /**
     * Returns an ordered range of all the tutorials where articleId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param articleId the article ID
     * @param start the lower bound of the range of tutorials
     * @param end the upper bound of the range of tutorials (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching tutorials
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Tutorial> findByorderTutorial(long articleId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERTUTORIAL;
            finderArgs = new Object[] { articleId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ORDERTUTORIAL;
            finderArgs = new Object[] { articleId, start, end, orderByComparator };
        }

        List<Tutorial> list = (List<Tutorial>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Tutorial tutorial : list) {
                if ((articleId != tutorial.getArticleId())) {
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

            query.append(_SQL_SELECT_TUTORIAL_WHERE);

            query.append(_FINDER_COLUMN_ORDERTUTORIAL_ARTICLEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(TutorialModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(articleId);

                if (!pagination) {
                    list = (List<Tutorial>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Tutorial>(list);
                } else {
                    list = (List<Tutorial>) QueryUtil.list(q, getDialect(),
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
     * Returns the first tutorial in the ordered set where articleId = &#63;.
     *
     * @param articleId the article ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching tutorial
     * @throws com.alain.puntocoma.NoSuchTutorialException if a matching tutorial could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tutorial findByorderTutorial_First(long articleId,
        OrderByComparator orderByComparator)
        throws NoSuchTutorialException, SystemException {
        Tutorial tutorial = fetchByorderTutorial_First(articleId,
                orderByComparator);

        if (tutorial != null) {
            return tutorial;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("articleId=");
        msg.append(articleId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTutorialException(msg.toString());
    }

    /**
     * Returns the first tutorial in the ordered set where articleId = &#63;.
     *
     * @param articleId the article ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching tutorial, or <code>null</code> if a matching tutorial could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tutorial fetchByorderTutorial_First(long articleId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Tutorial> list = findByorderTutorial(articleId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last tutorial in the ordered set where articleId = &#63;.
     *
     * @param articleId the article ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching tutorial
     * @throws com.alain.puntocoma.NoSuchTutorialException if a matching tutorial could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tutorial findByorderTutorial_Last(long articleId,
        OrderByComparator orderByComparator)
        throws NoSuchTutorialException, SystemException {
        Tutorial tutorial = fetchByorderTutorial_Last(articleId,
                orderByComparator);

        if (tutorial != null) {
            return tutorial;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("articleId=");
        msg.append(articleId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchTutorialException(msg.toString());
    }

    /**
     * Returns the last tutorial in the ordered set where articleId = &#63;.
     *
     * @param articleId the article ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching tutorial, or <code>null</code> if a matching tutorial could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tutorial fetchByorderTutorial_Last(long articleId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByorderTutorial(articleId);

        if (count == 0) {
            return null;
        }

        List<Tutorial> list = findByorderTutorial(articleId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the tutorials where articleId = &#63; from the database.
     *
     * @param articleId the article ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByorderTutorial(long articleId) throws SystemException {
        for (Tutorial tutorial : findByorderTutorial(articleId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(tutorial);
        }
    }

    /**
     * Returns the number of tutorials where articleId = &#63;.
     *
     * @param articleId the article ID
     * @return the number of matching tutorials
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByorderTutorial(long articleId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ORDERTUTORIAL;

        Object[] finderArgs = new Object[] { articleId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_TUTORIAL_WHERE);

            query.append(_FINDER_COLUMN_ORDERTUTORIAL_ARTICLEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(articleId);

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
     * Caches the tutorial in the entity cache if it is enabled.
     *
     * @param tutorial the tutorial
     */
    @Override
    public void cacheResult(Tutorial tutorial) {
        EntityCacheUtil.putResult(TutorialModelImpl.ENTITY_CACHE_ENABLED,
            TutorialImpl.class, tutorial.getPrimaryKey(), tutorial);

        tutorial.resetOriginalValues();
    }

    /**
     * Caches the tutorials in the entity cache if it is enabled.
     *
     * @param tutorials the tutorials
     */
    @Override
    public void cacheResult(List<Tutorial> tutorials) {
        for (Tutorial tutorial : tutorials) {
            if (EntityCacheUtil.getResult(
                        TutorialModelImpl.ENTITY_CACHE_ENABLED,
                        TutorialImpl.class, tutorial.getPrimaryKey()) == null) {
                cacheResult(tutorial);
            } else {
                tutorial.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all tutorials.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TutorialImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TutorialImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the tutorial.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Tutorial tutorial) {
        EntityCacheUtil.removeResult(TutorialModelImpl.ENTITY_CACHE_ENABLED,
            TutorialImpl.class, tutorial.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Tutorial> tutorials) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Tutorial tutorial : tutorials) {
            EntityCacheUtil.removeResult(TutorialModelImpl.ENTITY_CACHE_ENABLED,
                TutorialImpl.class, tutorial.getPrimaryKey());
        }
    }

    /**
     * Creates a new tutorial with the primary key. Does not add the tutorial to the database.
     *
     * @param articleId the primary key for the new tutorial
     * @return the new tutorial
     */
    @Override
    public Tutorial create(long articleId) {
        Tutorial tutorial = new TutorialImpl();

        tutorial.setNew(true);
        tutorial.setPrimaryKey(articleId);

        return tutorial;
    }

    /**
     * Removes the tutorial with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param articleId the primary key of the tutorial
     * @return the tutorial that was removed
     * @throws com.alain.puntocoma.NoSuchTutorialException if a tutorial with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tutorial remove(long articleId)
        throws NoSuchTutorialException, SystemException {
        return remove((Serializable) articleId);
    }

    /**
     * Removes the tutorial with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the tutorial
     * @return the tutorial that was removed
     * @throws com.alain.puntocoma.NoSuchTutorialException if a tutorial with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tutorial remove(Serializable primaryKey)
        throws NoSuchTutorialException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Tutorial tutorial = (Tutorial) session.get(TutorialImpl.class,
                    primaryKey);

            if (tutorial == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTutorialException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(tutorial);
        } catch (NoSuchTutorialException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Tutorial removeImpl(Tutorial tutorial) throws SystemException {
        tutorial = toUnwrappedModel(tutorial);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(tutorial)) {
                tutorial = (Tutorial) session.get(TutorialImpl.class,
                        tutorial.getPrimaryKeyObj());
            }

            if (tutorial != null) {
                session.delete(tutorial);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (tutorial != null) {
            clearCache(tutorial);
        }

        return tutorial;
    }

    @Override
    public Tutorial updateImpl(com.alain.puntocoma.model.Tutorial tutorial)
        throws SystemException {
        tutorial = toUnwrappedModel(tutorial);

        boolean isNew = tutorial.isNew();

        TutorialModelImpl tutorialModelImpl = (TutorialModelImpl) tutorial;

        Session session = null;

        try {
            session = openSession();

            if (tutorial.isNew()) {
                session.save(tutorial);

                tutorial.setNew(false);
            } else {
                session.merge(tutorial);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !TutorialModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((tutorialModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERTUTORIAL.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        tutorialModelImpl.getOriginalArticleId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORDERTUTORIAL,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERTUTORIAL,
                    args);

                args = new Object[] { tutorialModelImpl.getArticleId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ORDERTUTORIAL,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ORDERTUTORIAL,
                    args);
            }
        }

        EntityCacheUtil.putResult(TutorialModelImpl.ENTITY_CACHE_ENABLED,
            TutorialImpl.class, tutorial.getPrimaryKey(), tutorial);

        return tutorial;
    }

    protected Tutorial toUnwrappedModel(Tutorial tutorial) {
        if (tutorial instanceof TutorialImpl) {
            return tutorial;
        }

        TutorialImpl tutorialImpl = new TutorialImpl();

        tutorialImpl.setNew(tutorial.isNew());
        tutorialImpl.setPrimaryKey(tutorial.getPrimaryKey());

        tutorialImpl.setArticleId(tutorial.getArticleId());
        tutorialImpl.setCatalogoId(tutorial.getCatalogoId());
        tutorialImpl.setTitle(tutorial.getTitle());
        tutorialImpl.setImage(tutorial.getImage());
        tutorialImpl.setDescription(tutorial.getDescription());

        return tutorialImpl;
    }

    /**
     * Returns the tutorial with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the tutorial
     * @return the tutorial
     * @throws com.alain.puntocoma.NoSuchTutorialException if a tutorial with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tutorial findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTutorialException, SystemException {
        Tutorial tutorial = fetchByPrimaryKey(primaryKey);

        if (tutorial == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTutorialException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return tutorial;
    }

    /**
     * Returns the tutorial with the primary key or throws a {@link com.alain.puntocoma.NoSuchTutorialException} if it could not be found.
     *
     * @param articleId the primary key of the tutorial
     * @return the tutorial
     * @throws com.alain.puntocoma.NoSuchTutorialException if a tutorial with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tutorial findByPrimaryKey(long articleId)
        throws NoSuchTutorialException, SystemException {
        return findByPrimaryKey((Serializable) articleId);
    }

    /**
     * Returns the tutorial with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the tutorial
     * @return the tutorial, or <code>null</code> if a tutorial with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tutorial fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Tutorial tutorial = (Tutorial) EntityCacheUtil.getResult(TutorialModelImpl.ENTITY_CACHE_ENABLED,
                TutorialImpl.class, primaryKey);

        if (tutorial == _nullTutorial) {
            return null;
        }

        if (tutorial == null) {
            Session session = null;

            try {
                session = openSession();

                tutorial = (Tutorial) session.get(TutorialImpl.class, primaryKey);

                if (tutorial != null) {
                    cacheResult(tutorial);
                } else {
                    EntityCacheUtil.putResult(TutorialModelImpl.ENTITY_CACHE_ENABLED,
                        TutorialImpl.class, primaryKey, _nullTutorial);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TutorialModelImpl.ENTITY_CACHE_ENABLED,
                    TutorialImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return tutorial;
    }

    /**
     * Returns the tutorial with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param articleId the primary key of the tutorial
     * @return the tutorial, or <code>null</code> if a tutorial with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Tutorial fetchByPrimaryKey(long articleId) throws SystemException {
        return fetchByPrimaryKey((Serializable) articleId);
    }

    /**
     * Returns all the tutorials.
     *
     * @return the tutorials
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Tutorial> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Tutorial> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the tutorials.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of tutorials
     * @param end the upper bound of the range of tutorials (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of tutorials
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Tutorial> findAll(int start, int end,
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

        List<Tutorial> list = (List<Tutorial>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TUTORIAL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TUTORIAL;

                if (pagination) {
                    sql = sql.concat(TutorialModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Tutorial>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Tutorial>(list);
                } else {
                    list = (List<Tutorial>) QueryUtil.list(q, getDialect(),
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
     * Removes all the tutorials from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Tutorial tutorial : findAll()) {
            remove(tutorial);
        }
    }

    /**
     * Returns the number of tutorials.
     *
     * @return the number of tutorials
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

                Query q = session.createQuery(_SQL_COUNT_TUTORIAL);

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
     * Initializes the tutorial persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.alain.puntocoma.model.Tutorial")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Tutorial>> listenersList = new ArrayList<ModelListener<Tutorial>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Tutorial>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TutorialImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
