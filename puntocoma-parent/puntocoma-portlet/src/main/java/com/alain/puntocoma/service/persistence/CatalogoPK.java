package com.alain.puntocoma.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Alain
 * @generated
 */
public class CatalogoPK implements Comparable<CatalogoPK>, Serializable {
    public long catalogoId;
    public String title;

    public CatalogoPK() {
    }

    public CatalogoPK(long catalogoId, String title) {
        this.catalogoId = catalogoId;
        this.title = title;
    }

    public long getCatalogoId() {
        return catalogoId;
    }

    public void setCatalogoId(long catalogoId) {
        this.catalogoId = catalogoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(CatalogoPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (catalogoId < pk.catalogoId) {
            value = -1;
        } else if (catalogoId > pk.catalogoId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = title.compareTo(pk.title);

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

        if (!(obj instanceof CatalogoPK)) {
            return false;
        }

        CatalogoPK pk = (CatalogoPK) obj;

        if ((catalogoId == pk.catalogoId) && (title.equals(pk.title))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(catalogoId) + String.valueOf(title)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("catalogoId");
        sb.append(StringPool.EQUAL);
        sb.append(catalogoId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("title");
        sb.append(StringPool.EQUAL);
        sb.append(title);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
