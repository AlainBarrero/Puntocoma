package com.alain.puntocoma.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Catalogo}.
 * </p>
 *
 * @author Alain
 * @see Catalogo
 * @generated
 */
public class CatalogoWrapper implements Catalogo, ModelWrapper<Catalogo> {
    private Catalogo _catalogo;

    public CatalogoWrapper(Catalogo catalogo) {
        _catalogo = catalogo;
    }

    @Override
    public Class<?> getModelClass() {
        return Catalogo.class;
    }

    @Override
    public String getModelClassName() {
        return Catalogo.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("catalogoId", getCatalogoId());
        attributes.put("title", getTitle());
        attributes.put("image", getImage());
        attributes.put("description", getDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long catalogoId = (Long) attributes.get("catalogoId");

        if (catalogoId != null) {
            setCatalogoId(catalogoId);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String image = (String) attributes.get("image");

        if (image != null) {
            setImage(image);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }
    }

    /**
    * Returns the primary key of this catalogo.
    *
    * @return the primary key of this catalogo
    */
    @Override
    public long getPrimaryKey() {
        return _catalogo.getPrimaryKey();
    }

    /**
    * Sets the primary key of this catalogo.
    *
    * @param primaryKey the primary key of this catalogo
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _catalogo.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the catalogo ID of this catalogo.
    *
    * @return the catalogo ID of this catalogo
    */
    @Override
    public long getCatalogoId() {
        return _catalogo.getCatalogoId();
    }

    /**
    * Sets the catalogo ID of this catalogo.
    *
    * @param catalogoId the catalogo ID of this catalogo
    */
    @Override
    public void setCatalogoId(long catalogoId) {
        _catalogo.setCatalogoId(catalogoId);
    }

    /**
    * Returns the title of this catalogo.
    *
    * @return the title of this catalogo
    */
    @Override
    public java.lang.String getTitle() {
        return _catalogo.getTitle();
    }

    /**
    * Sets the title of this catalogo.
    *
    * @param title the title of this catalogo
    */
    @Override
    public void setTitle(java.lang.String title) {
        _catalogo.setTitle(title);
    }

    /**
    * Returns the image of this catalogo.
    *
    * @return the image of this catalogo
    */
    @Override
    public java.lang.String getImage() {
        return _catalogo.getImage();
    }

    /**
    * Sets the image of this catalogo.
    *
    * @param image the image of this catalogo
    */
    @Override
    public void setImage(java.lang.String image) {
        _catalogo.setImage(image);
    }

    /**
    * Returns the description of this catalogo.
    *
    * @return the description of this catalogo
    */
    @Override
    public java.lang.String getDescription() {
        return _catalogo.getDescription();
    }

    /**
    * Sets the description of this catalogo.
    *
    * @param description the description of this catalogo
    */
    @Override
    public void setDescription(java.lang.String description) {
        _catalogo.setDescription(description);
    }

    @Override
    public boolean isNew() {
        return _catalogo.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _catalogo.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _catalogo.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _catalogo.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _catalogo.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _catalogo.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _catalogo.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _catalogo.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _catalogo.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _catalogo.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _catalogo.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CatalogoWrapper((Catalogo) _catalogo.clone());
    }

    @Override
    public int compareTo(com.alain.puntocoma.model.Catalogo catalogo) {
        return _catalogo.compareTo(catalogo);
    }

    @Override
    public int hashCode() {
        return _catalogo.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.alain.puntocoma.model.Catalogo> toCacheModel() {
        return _catalogo.toCacheModel();
    }

    @Override
    public com.alain.puntocoma.model.Catalogo toEscapedModel() {
        return new CatalogoWrapper(_catalogo.toEscapedModel());
    }

    @Override
    public com.alain.puntocoma.model.Catalogo toUnescapedModel() {
        return new CatalogoWrapper(_catalogo.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _catalogo.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _catalogo.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _catalogo.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CatalogoWrapper)) {
            return false;
        }

        CatalogoWrapper catalogoWrapper = (CatalogoWrapper) obj;

        if (Validator.equals(_catalogo, catalogoWrapper._catalogo)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Catalogo getWrappedCatalogo() {
        return _catalogo;
    }

    @Override
    public Catalogo getWrappedModel() {
        return _catalogo;
    }

    @Override
    public void resetOriginalValues() {
        _catalogo.resetOriginalValues();
    }
}
