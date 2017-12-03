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
public class CatalogoSoap implements Serializable {
    private long _catalogoId;
    private String _title;
    private String _image;
    private String _description;

    public CatalogoSoap() {
    }

    public static CatalogoSoap toSoapModel(Catalogo model) {
        CatalogoSoap soapModel = new CatalogoSoap();

        soapModel.setCatalogoId(model.getCatalogoId());
        soapModel.setTitle(model.getTitle());
        soapModel.setImage(model.getImage());
        soapModel.setDescription(model.getDescription());

        return soapModel;
    }

    public static CatalogoSoap[] toSoapModels(Catalogo[] models) {
        CatalogoSoap[] soapModels = new CatalogoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CatalogoSoap[][] toSoapModels(Catalogo[][] models) {
        CatalogoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CatalogoSoap[models.length][models[0].length];
        } else {
            soapModels = new CatalogoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CatalogoSoap[] toSoapModels(List<Catalogo> models) {
        List<CatalogoSoap> soapModels = new ArrayList<CatalogoSoap>(models.size());

        for (Catalogo model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CatalogoSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _catalogoId;
    }

    public void setPrimaryKey(long pk) {
        setCatalogoId(pk);
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
