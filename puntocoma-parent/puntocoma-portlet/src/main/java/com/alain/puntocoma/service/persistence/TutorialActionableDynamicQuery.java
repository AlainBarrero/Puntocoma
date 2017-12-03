package com.alain.puntocoma.service.persistence;

import com.alain.puntocoma.model.Tutorial;
import com.alain.puntocoma.service.TutorialLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Alain
 * @generated
 */
public abstract class TutorialActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TutorialActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TutorialLocalServiceUtil.getService());
        setClass(Tutorial.class);

        setClassLoader(com.alain.puntocoma.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("articleId");
    }
}
