package com.alain.puntocoma.service.persistence;

import com.alain.puntocoma.model.Tutorial;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the tutorial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Alain
 * @see TutorialPersistenceImpl
 * @see TutorialUtil
 * @generated
 */
public interface TutorialPersistence extends BasePersistence<Tutorial> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TutorialUtil} to access the tutorial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the tutorials where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @return the matching tutorials
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.alain.puntocoma.model.Tutorial> findByorderTutorial(
        long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the tutorials where catalogoId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param catalogoId the catalogo ID
    * @param start the lower bound of the range of tutorials
    * @param end the upper bound of the range of tutorials (not inclusive)
    * @return the range of matching tutorials
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.alain.puntocoma.model.Tutorial> findByorderTutorial(
        long catalogoId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the tutorials where catalogoId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.alain.puntocoma.model.impl.TutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param catalogoId the catalogo ID
    * @param start the lower bound of the range of tutorials
    * @param end the upper bound of the range of tutorials (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching tutorials
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.alain.puntocoma.model.Tutorial> findByorderTutorial(
        long catalogoId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first tutorial in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching tutorial
    * @throws com.alain.puntocoma.NoSuchTutorialException if a matching tutorial could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Tutorial findByorderTutorial_First(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.alain.puntocoma.NoSuchTutorialException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first tutorial in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching tutorial, or <code>null</code> if a matching tutorial could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Tutorial fetchByorderTutorial_First(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last tutorial in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching tutorial
    * @throws com.alain.puntocoma.NoSuchTutorialException if a matching tutorial could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Tutorial findByorderTutorial_Last(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.alain.puntocoma.NoSuchTutorialException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last tutorial in the ordered set where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching tutorial, or <code>null</code> if a matching tutorial could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Tutorial fetchByorderTutorial_Last(
        long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the tutorials before and after the current tutorial in the ordered set where catalogoId = &#63;.
    *
    * @param articleId the primary key of the current tutorial
    * @param catalogoId the catalogo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next tutorial
    * @throws com.alain.puntocoma.NoSuchTutorialException if a tutorial with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Tutorial[] findByorderTutorial_PrevAndNext(
        long articleId, long catalogoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.alain.puntocoma.NoSuchTutorialException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the tutorials where catalogoId = &#63; from the database.
    *
    * @param catalogoId the catalogo ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByorderTutorial(long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of tutorials where catalogoId = &#63;.
    *
    * @param catalogoId the catalogo ID
    * @return the number of matching tutorials
    * @throws SystemException if a system exception occurred
    */
    public int countByorderTutorial(long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the tutorial in the entity cache if it is enabled.
    *
    * @param tutorial the tutorial
    */
    public void cacheResult(com.alain.puntocoma.model.Tutorial tutorial);

    /**
    * Caches the tutorials in the entity cache if it is enabled.
    *
    * @param tutorials the tutorials
    */
    public void cacheResult(
        java.util.List<com.alain.puntocoma.model.Tutorial> tutorials);

    /**
    * Creates a new tutorial with the primary key. Does not add the tutorial to the database.
    *
    * @param articleId the primary key for the new tutorial
    * @return the new tutorial
    */
    public com.alain.puntocoma.model.Tutorial create(long articleId);

    /**
    * Removes the tutorial with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param articleId the primary key of the tutorial
    * @return the tutorial that was removed
    * @throws com.alain.puntocoma.NoSuchTutorialException if a tutorial with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Tutorial remove(long articleId)
        throws com.alain.puntocoma.NoSuchTutorialException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.alain.puntocoma.model.Tutorial updateImpl(
        com.alain.puntocoma.model.Tutorial tutorial)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the tutorial with the primary key or throws a {@link com.alain.puntocoma.NoSuchTutorialException} if it could not be found.
    *
    * @param articleId the primary key of the tutorial
    * @return the tutorial
    * @throws com.alain.puntocoma.NoSuchTutorialException if a tutorial with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Tutorial findByPrimaryKey(long articleId)
        throws com.alain.puntocoma.NoSuchTutorialException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the tutorial with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param articleId the primary key of the tutorial
    * @return the tutorial, or <code>null</code> if a tutorial with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.alain.puntocoma.model.Tutorial fetchByPrimaryKey(long articleId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the tutorials.
    *
    * @return the tutorials
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.alain.puntocoma.model.Tutorial> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.alain.puntocoma.model.Tutorial> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.alain.puntocoma.model.Tutorial> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the tutorials from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of tutorials.
    *
    * @return the number of tutorials
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
