package com.alain.puntocoma.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Tutorial. This utility wraps
 * {@link com.alain.puntocoma.service.impl.TutorialLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Alain
 * @see TutorialLocalService
 * @see com.alain.puntocoma.service.base.TutorialLocalServiceBaseImpl
 * @see com.alain.puntocoma.service.impl.TutorialLocalServiceImpl
 * @generated
 */
public class TutorialLocalServiceUtil {
    private static TutorialLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.alain.puntocoma.service.impl.TutorialLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the tutorial to the database. Also notifies the appropriate model listeners.
    *
    * @param tutorial the tutorial
    * @return the tutorial that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial addTutorial(
        com.alain.puntocoma.model.Tutorial tutorial)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addTutorial(tutorial);
    }

    /**
    * Creates a new tutorial with the primary key. Does not add the tutorial to the database.
    *
    * @param articleId the primary key for the new tutorial
    * @return the new tutorial
    */
    public static com.alain.puntocoma.model.Tutorial createTutorial(
        long articleId) {
        return getService().createTutorial(articleId);
    }

    /**
    * Deletes the tutorial with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param articleId the primary key of the tutorial
    * @return the tutorial that was removed
    * @throws PortalException if a tutorial with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial deleteTutorial(
        long articleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTutorial(articleId);
    }

    /**
    * Deletes the tutorial from the database. Also notifies the appropriate model listeners.
    *
    * @param tutorial the tutorial
    * @return the tutorial that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial deleteTutorial(
        com.alain.puntocoma.model.Tutorial tutorial)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteTutorial(tutorial);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.alain.puntocoma.model.Tutorial fetchTutorial(
        long articleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchTutorial(articleId);
    }

    /**
    * Returns the tutorial with the primary key.
    *
    * @param articleId the primary key of the tutorial
    * @return the tutorial
    * @throws PortalException if a tutorial with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial getTutorial(long articleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getTutorial(articleId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.alain.puntocoma.model.Tutorial> getTutorials(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTutorials(start, end);
    }

    /**
    * Returns the number of tutorials.
    *
    * @return the number of tutorials
    * @throws SystemException if a system exception occurred
    */
    public static int getTutorialsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTutorialsCount();
    }

    /**
    * Updates the tutorial in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param tutorial the tutorial
    * @return the tutorial that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.alain.puntocoma.model.Tutorial updateTutorial(
        com.alain.puntocoma.model.Tutorial tutorial)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateTutorial(tutorial);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<com.alain.puntocoma.model.Tutorial> getAllTutoriales()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAllTutoriales();
    }

    public static java.util.List<com.alain.puntocoma.model.Tutorial> getTutorialesByCatalogo(
        long catalogoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getTutorialesByCatalogo(catalogoId);
    }

    public static com.alain.puntocoma.model.Tutorial createTutorial(
        long articleId, long catalogoId, java.lang.String title,
        java.lang.String image, java.lang.String description)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .createTutorial(articleId, catalogoId, title, image,
            description);
    }

    public static com.alain.puntocoma.model.Tutorial removeTutorial(
        long articleId)
        throws com.alain.puntocoma.NoSuchTutorialException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().removeTutorial(articleId);
    }

    public static void clearService() {
        _service = null;
    }

    public static TutorialLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    TutorialLocalService.class.getName());

            if (invokableLocalService instanceof TutorialLocalService) {
                _service = (TutorialLocalService) invokableLocalService;
            } else {
                _service = new TutorialLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(TutorialLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(TutorialLocalService service) {
    }
}
