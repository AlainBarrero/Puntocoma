package com.alain.puntocoma.service.base;

import com.alain.puntocoma.model.Tutorial;
import com.alain.puntocoma.service.TutorialService;
import com.alain.puntocoma.service.persistence.CatalogoPersistence;
import com.alain.puntocoma.service.persistence.TutorialPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the tutorial remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.alain.puntocoma.service.impl.TutorialServiceImpl}.
 * </p>
 *
 * @author Alain
 * @see com.alain.puntocoma.service.impl.TutorialServiceImpl
 * @see com.alain.puntocoma.service.TutorialServiceUtil
 * @generated
 */
public abstract class TutorialServiceBaseImpl extends BaseServiceImpl
    implements TutorialService, IdentifiableBean {
    @BeanReference(type = com.alain.puntocoma.service.CatalogoLocalService.class)
    protected com.alain.puntocoma.service.CatalogoLocalService catalogoLocalService;
    @BeanReference(type = CatalogoPersistence.class)
    protected CatalogoPersistence catalogoPersistence;
    @BeanReference(type = com.alain.puntocoma.service.TutorialService.class)
    protected com.alain.puntocoma.service.TutorialService tutorialService;
    @BeanReference(type = TutorialPersistence.class)
    protected TutorialPersistence tutorialPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private TutorialServiceClpInvoker _clpInvoker = new TutorialServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.alain.puntocoma.service.TutorialServiceUtil} to access the tutorial remote service.
     */

    /**
     * Returns the catalogo local service.
     *
     * @return the catalogo local service
     */
    public com.alain.puntocoma.service.CatalogoLocalService getCatalogoLocalService() {
        return catalogoLocalService;
    }

    /**
     * Sets the catalogo local service.
     *
     * @param catalogoLocalService the catalogo local service
     */
    public void setCatalogoLocalService(
        com.alain.puntocoma.service.CatalogoLocalService catalogoLocalService) {
        this.catalogoLocalService = catalogoLocalService;
    }

    /**
     * Returns the catalogo persistence.
     *
     * @return the catalogo persistence
     */
    public CatalogoPersistence getCatalogoPersistence() {
        return catalogoPersistence;
    }

    /**
     * Sets the catalogo persistence.
     *
     * @param catalogoPersistence the catalogo persistence
     */
    public void setCatalogoPersistence(CatalogoPersistence catalogoPersistence) {
        this.catalogoPersistence = catalogoPersistence;
    }

    /**
     * Returns the tutorial remote service.
     *
     * @return the tutorial remote service
     */
    public com.alain.puntocoma.service.TutorialService getTutorialService() {
        return tutorialService;
    }

    /**
     * Sets the tutorial remote service.
     *
     * @param tutorialService the tutorial remote service
     */
    public void setTutorialService(
        com.alain.puntocoma.service.TutorialService tutorialService) {
        this.tutorialService = tutorialService;
    }

    /**
     * Returns the tutorial persistence.
     *
     * @return the tutorial persistence
     */
    public TutorialPersistence getTutorialPersistence() {
        return tutorialPersistence;
    }

    /**
     * Sets the tutorial persistence.
     *
     * @param tutorialPersistence the tutorial persistence
     */
    public void setTutorialPersistence(TutorialPersistence tutorialPersistence) {
        this.tutorialPersistence = tutorialPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Tutorial.class;
    }

    protected String getModelClassName() {
        return Tutorial.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = tutorialPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}