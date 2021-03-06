package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
* The base model interface for the LFCertificateSite service. Represents a row in the &quot;Learn_LFCertificateSite&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateSiteModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFCertificateSiteImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFCertificateSite
* @see com.arcusys.learn.persistence.liferay.model.impl.LFCertificateSiteImpl
* @see com.arcusys.learn.persistence.liferay.model.impl.LFCertificateSiteModelImpl
* @generated
*/
public interface LFCertificateSiteModel extends BaseModel<LFCertificateSite> {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this interface directly. All methods that expect a l f certificate site model instance should use the {@link LFCertificateSite} interface instead.
    */

    /**
    * Returns the primary key of this l f certificate site.
    *
    * @return the primary key of this l f certificate site
    */
    public long getPrimaryKey();

    /**
    * Sets the primary key of this l f certificate site.
    *
    * @param primaryKey the primary key of this l f certificate site
    */
    public void setPrimaryKey(long primaryKey);

    /**
    * Returns the ID of this l f certificate site.
    *
    * @return the ID of this l f certificate site
    */
    public long getId();

    /**
        * Sets the ID of this l f certificate site.
    *
    * @param id the ID of this l f certificate site
    */
    public void setId(long id);

    /**
    * Returns the certificate i d of this l f certificate site.
    *
    * @return the certificate i d of this l f certificate site
    */
    public Integer getCertificateID();

    /**
        * Sets the certificate i d of this l f certificate site.
    *
    * @param certificateID the certificate i d of this l f certificate site
    */
    public void setCertificateID(Integer certificateID);

    /**
    * Returns the site i d of this l f certificate site.
    *
    * @return the site i d of this l f certificate site
    */
    public Integer getSiteID();

    /**
        * Sets the site i d of this l f certificate site.
    *
    * @param siteID the site i d of this l f certificate site
    */
    public void setSiteID(Integer siteID);

    /**
    * Returns the arrangement index of this l f certificate site.
    *
    * @return the arrangement index of this l f certificate site
    */
    public Integer getArrangementIndex();

    /**
        * Sets the arrangement index of this l f certificate site.
    *
    * @param arrangementIndex the arrangement index of this l f certificate site
    */
    public void setArrangementIndex(Integer arrangementIndex);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(LFCertificateSite lfCertificateSite);

    public int hashCode();

    public CacheModel<LFCertificateSite> toCacheModel();

    public LFCertificateSite toEscapedModel();

    public String toString();

    public String toXmlString();
}
