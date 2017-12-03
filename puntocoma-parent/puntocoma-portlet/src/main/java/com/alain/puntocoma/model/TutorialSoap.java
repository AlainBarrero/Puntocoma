package com.alain.puntocoma.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Alain
 * @generated
 */
public class TutorialSoap implements Serializable {
    private long _articleId;
    private long _catalogoId;
    private String _title;
    private String _image;
    private String _description;

    public TutorialSoap() {
    }

    public static TutorialSoap toSoapModel(Tutorial model) {
        TutorialSoap soapModel = new TutorialSoap();

        soapModel.setArticleId(model.getArticleId());
        soapModel.setCatalogoId(model.getCatalogoId());
        soapModel.setTitle(model.getTitle());
        soapModel.setImage(model.getImage());
        soapModel.setDescription(model.getDescription());

        return soapModel;
    }

    public static TutorialSoap[] toSoapModels(Tutorial[] models) {
        TutorialSoap[] soapModels = new TutorialSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TutorialSoap[][] toSoapModels(Tutorial[][] models) {
        TutorialSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TutorialSoap[models.length][models[0].length];
        } else {
            soapModels = new TutorialSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TutorialSoap[] toSoapModels(List<Tutorial> models) {
        List<TutorialSoap> soapModels = new ArrayList<TutorialSoap>(models.size());

        for (Tutorial model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TutorialSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _articleId;
    }

    public void setPrimaryKey(long pk) {
        setArticleId(pk);
    }

    public long getArticleId() {
        return _articleId;
    }

    public void setArticleId(long articleId) {
        _articleId = articleId;
    }

    public long getCatalogoId() {
        return _catalogoId;
    }

    public void setCatalogoId(long catalogoId) {
        _catalogoId = catalogoId;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getImage() {
        return _image;
    }

    public void setImage(String image) {
        _image = image;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }
}
