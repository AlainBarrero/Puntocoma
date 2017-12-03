package com.alain.puntocoma.service.persistence;

import com.alain.puntocoma.model.Catalogo;
import com.alain.puntocoma.service.CatalogoLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Alain
 * @generated
 */
public abstract class CatalogoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CatalogoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CatalogoLocalServiceUtil.getService());
        setClass(Catalogo.class);

        setClassLoader(com.alain.puntocoma.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("catalogoId");
    }
}
