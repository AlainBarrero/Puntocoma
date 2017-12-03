package com.alain.puntocoma.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Tutorial}.
 * </p>
 *
 * @author Alain
 * @see Tutorial
 * @generated
 */
public class TutorialWrapper implements Tutorial, ModelWrapper<Tutorial> {
    private Tutorial _tutorial;

    public TutorialWrapper(Tutorial tutorial) {
        _tutorial = tutorial;
    }

    @Override
    public Class<?> getModelClass() {
        return Tutorial.class;
    }

    @Override
    public String getModelClassName() {
        return Tutorial.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("articleId", getArticleId());
        attributes.put("catalogoId", getCatalogoId());
        attributes.put("title", getTitle());
        attributes.put("image", getImage());
        attributes.put("description", getDescription());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long articleId = (Long) attributes.get("articleId");

        if (articleId != null) {
            setArticleId(articleId);
        }

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
    * Returns the primary key of this tutorial.
    *
    * @return the primary key of this tutorial
    */
    @Override
    public long getPrimaryKey() {
        return _tutorial.getPrimaryKey();
    }

    /**
    * Sets the primary key of this tutorial.
    *
    * @param primaryKey the primary key of this tutorial
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _tutorial.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the article ID of this tutorial.
    *
    * @return the article ID of this tutorial
    */
    @Override
    public long getArticleId() {
        return _tutorial.getArticleId();
    }

    /**
    * Sets the article ID of this tutorial.
    *
    * @param articleId the article ID of this tutorial
    */
    @Override
    public void setArticleId(long articleId) {
        _tutorial.setArticleId(articleId);
    }

    /**
    * Returns the catalogo ID of this tutorial.
    *
    * @return the catalogo ID of this tutorial
    */
    @Override
    public long getCatalogoId() {
        return _tutorial.getCatalogoId();
    }

    /**
    * Sets the catalogo ID of this tutorial.
    *
    * @param catalogoId the catalogo ID of this tutorial
    */
    @Override
    public void setCatalogoId(long catalogoId) {
        _tutorial.setCatalogoId(catalogoId);
    }

    /**
    * Returns the title of this tutorial.
    *
    * @return the title of this tutorial
    */
    @Override
    public java.lang.String getTitle() {
        return _tutorial.getTitle();
    }

    /**
    * Sets the title of this tutorial.
    *
    * @param title the title of this tutorial
    */
    @Override
    public void setTitle(java.lang.String title) {
        _tutorial.setTitle(title);
    }

    /**
    * Returns the image of this tutorial.
    *
    * @return the image of this tutorial
    */
    @Override
    public java.lang.String getImage() {
        return _tutorial.getImage();
    }

    /**
    * Sets the image of this tutorial.
    *
    * @param image the image of this tutorial
    */
    @Override
    public void setImage(java.lang.String image) {
        _tutorial.setImage(image);
    }

    /**
    * Returns the description of this tutorial.
    *
    * @return the description of this tutorial
    */
    @Override
    public java.lang.String getDescription() {
        return _tutorial.getDescription();
    }

    /**
    * Sets the description of this tutorial.
    *
    * @param description the description of this tutorial
    */
    @Override
    public void setDescription(java.lang.String description) {
        _tutorial.setDescription(description);
    }

    @Override
    public boolean isNew() {
        return _tutorial.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _tutorial.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _tutorial.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _tutorial.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _tutorial.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _tutorial.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _tutorial.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _tutorial.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _tutorial.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _tutorial.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _tutorial.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new TutorialWrapper((Tutorial) _tutorial.clone());
    }

    @Override
    public int compareTo(com.alain.puntocoma.model.Tutorial tutorial) {
        return _tutorial.compareTo(tutorial);
    }

    @Override
    public int hashCode() {
        return _tutorial.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.alain.puntocoma.model.Tutorial> toCacheModel() {
        return _tutorial.toCacheModel();
    }

    @Override
    public com.alain.puntocoma.model.Tutorial toEscapedModel() {
        return new TutorialWrapper(_tutorial.toEscapedModel());
    }

    @Override
    public com.alain.puntocoma.model.Tutorial toUnescapedModel() {
        return new TutorialWrapper(_tutorial.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _tutorial.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _tutorial.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _tutorial.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TutorialWrapper)) {
            return false;
        }

        TutorialWrapper tutorialWrapper = (TutorialWrapper) obj;

        if (Validator.equals(_tutorial, tutorialWrapper._tutorial)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Tutorial getWrappedTutorial() {
        return _tutorial;
    }

    @Override
    public Tutorial getWrappedModel() {
        return _tutorial;
    }

    @Override
    public void resetOriginalValues() {
        _tutorial.resetOriginalValues();
    }
}
