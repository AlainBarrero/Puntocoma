package com.alain.puntocoma.model.impl;

import com.alain.puntocoma.model.Tutorial;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Tutorial in entity cache.
 *
 * @author Alain
 * @see Tutorial
 * @generated
 */
public class TutorialCacheModel implements CacheModel<Tutorial>, Externalizable {
    public long articleId;
    public long catalogoId;
    public String title;
    public String image;
    public String description;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{articleId=");
        sb.append(articleId);
        sb.append(", catalogoId=");
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
    public Tutorial toEntityModel() {
        TutorialImpl tutorialImpl = new TutorialImpl();

        tutorialImpl.setArticleId(articleId);
        tutorialImpl.setCatalogoId(catalogoId);

        if (title == null) {
            tutorialImpl.setTitle(StringPool.BLANK);
        } else {
            tutorialImpl.setTitle(title);
        }

        if (image == null) {
            tutorialImpl.setImage(StringPool.BLANK);
        } else {
            tutorialImpl.setImage(image);
        }

        if (description == null) {
            tutorialImpl.setDescription(StringPool.BLANK);
        } else {
            tutorialImpl.setDescription(description);
        }

        tutorialImpl.resetOriginalValues();

        return tutorialImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        articleId = objectInput.readLong();
        catalogoId = objectInput.readLong();
        title = objectInput.readUTF();
        image = objectInput.readUTF();
        description = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(articleId);
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
