package com.alain.puntocoma.model;

import com.alain.puntocoma.service.CatalogoLocalServiceUtil;
import com.alain.puntocoma.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class CatalogoClp extends BaseModelImpl<Catalogo> implements Catalogo {
    private long _catalogoId;
    private String _title;
    private String _image;
    private String _description;
    private BaseModel<?> _catalogoRemoteModel;
    private Class<?> _clpSerializerClass = com.alain.puntocoma.service.ClpSerializer.class;

    public CatalogoClp() {
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
    public long getPrimaryKey() {
        return _catalogoId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setCatalogoId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _catalogoId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getCatalogoId() {
        return _catalogoId;
    }

    @Override
    public void setCatalogoId(long catalogoId) {
        _catalogoId = catalogoId;

        if (_catalogoRemoteModel != null) {
            try {
                Class<?> clazz = _catalogoRemoteModel.getClass();

                Method method = clazz.getMethod("setCatalogoId", long.class);

                method.invoke(_catalogoRemoteModel, catalogoId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;

        if (_catalogoRemoteModel != null) {
            try {
                Class<?> clazz = _catalogoRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_catalogoRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getImage() {
        return _image;
    }

    @Override
    public void setImage(String image) {
        _image = image;

        if (_catalogoRemoteModel != null) {
            try {
                Class<?> clazz = _catalogoRemoteModel.getClass();

                Method method = clazz.getMethod("setImage", String.class);

                method.invoke(_catalogoRemoteModel, image);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_catalogoRemoteModel != null) {
            try {
                Class<?> clazz = _catalogoRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_catalogoRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getCatalogoRemoteModel() {
        return _catalogoRemoteModel;
    }

    public void setCatalogoRemoteModel(BaseModel<?> catalogoRemoteModel) {
        _catalogoRemoteModel = catalogoRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _catalogoRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_catalogoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CatalogoLocalServiceUtil.addCatalogo(this);
        } else {
            CatalogoLocalServiceUtil.updateCatalogo(this);
        }
    }

    @Override
    public Catalogo toEscapedModel() {
        return (Catalogo) ProxyUtil.newProxyInstance(Catalogo.class.getClassLoader(),
            new Class[] { Catalogo.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CatalogoClp clone = new CatalogoClp();

        clone.setCatalogoId(getCatalogoId());
        clone.setTitle(getTitle());
        clone.setImage(getImage());
        clone.setDescription(getDescription());

        return clone;
    }

    @Override
    public int compareTo(Catalogo catalogo) {
        int value = 0;

        value = getTitle().compareTo(catalogo.getTitle());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CatalogoClp)) {
            return false;
        }

        CatalogoClp catalogo = (CatalogoClp) obj;

        long primaryKey = catalogo.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{catalogoId=");
        sb.append(getCatalogoId());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", image=");
        sb.append(getImage());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.alain.puntocoma.model.Catalogo");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>catalogoId</column-name><column-value><![CDATA[");
        sb.append(getCatalogoId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>image</column-name><column-value><![CDATA[");
        sb.append(getImage());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
