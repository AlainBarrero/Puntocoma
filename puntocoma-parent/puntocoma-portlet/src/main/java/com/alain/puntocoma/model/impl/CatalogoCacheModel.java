package com.alain.puntocoma.model.impl;

import com.alain.puntocoma.model.Catalogo;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Catalogo in entity cache.
 *
 * @author Alain
 * @see Catalogo
 * @generated
 */
public class CatalogoCacheModel implements CacheModel<Catalogo>, Externalizable {
    public long catalogoId;
    public String title;
    public String image;
    public String description;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{catalogoId=");
        sb.append(catalogoId);
        sb.append(", title=");
        sb.append(title);
        sb.append(", image=");
        sb.append(image);
        sb.append(", description=");
        sb.append(description);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Catalogo toEntityModel() {
        CatalogoImpl catalogoImpl = new CatalogoImpl();

        catalogoImpl.setCatalogoId(catalogoId);

        if (title == null) {
            catalogoImpl.setTitle(StringPool.BLANK);
        } else {
            catalogoImpl.setTitle(title);
        }

        if (image == null) {
            catalogoImpl.setImage(StringPool.BLANK);
        } else {
            catalogoImpl.setImage(image);
        }

        if (description == null) {
            catalogoImpl.setDescription(StringPool.BLANK);
        } else {
            catalogoImpl.setDescription(description);
        }

        catalogoImpl.resetOriginalValues();

        return catalogoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        catalogoId = objectInput.readLong();
        title = objectInput.readUTF();
        image = objectInput.readUTF();
        description = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(catalogoId);

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }

        if (image == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(image);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }
    }
}
