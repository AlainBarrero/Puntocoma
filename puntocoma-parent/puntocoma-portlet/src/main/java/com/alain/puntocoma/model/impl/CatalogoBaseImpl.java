package com.alain.puntocoma.model.impl;

import com.alain.puntocoma.model.Catalogo;
import com.alain.puntocoma.service.CatalogoLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Catalogo service. Represents a row in the &quot;PC_Catalogo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CatalogoImpl}.
 * </p>
 *
 * @author Alain
 * @see CatalogoImpl
 * @see com.alain.puntocoma.model.Catalogo
 * @generated
 */
public abstract class CatalogoBaseImpl extends CatalogoModelImpl
    implements Catalogo {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a catalogo model instance should use the {@link Catalogo} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CatalogoLocalServiceUtil.addCatalogo(this);
        } else {
            CatalogoLocalServiceUtil.updateCatalogo(this);
        }
    }
}