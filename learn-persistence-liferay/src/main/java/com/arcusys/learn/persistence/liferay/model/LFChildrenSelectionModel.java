package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
* The base model interface for the LFChildrenSelection service. Represents a row in the &quot;Learn_LFChildrenSelection&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFChildrenSelectionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFChildrenSelectionImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFChildrenSelection
* @see com.arcusys.learn.persistence.liferay.model.impl.LFChildrenSelectionImpl
* @see com.arcusys.learn.persistence.liferay.model.impl.LFChildrenSelectionModelImpl
* @generated
*/
public interface LFChildrenSelectionModel extends BaseModel<LFChildrenSelection> {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this interface directly. All methods that expect a l f children selection model instance should use the {@link LFChildrenSelection} interface instead.
    */

    /**
    * Returns the primary key of this l f children selection.
    *
    * @return the primary key of this l f children selection
    */
    public long getPrimaryKey();

    /**
    * Sets the primary key of this l f children selection.
    *
    * @param primaryKey the primary key of this l f children selection
    */
    public void setPrimaryKey(long primaryKey);

    /**
    * Returns the ID of this l f children selection.
    *
    * @return the ID of this l f children selection
    */
    public long getId();

    /**
        * Sets the ID of this l f children selection.
    *
    * @param id the ID of this l f children selection
    */
    public void setId(long id);

    /**
    * Returns the sequencing i d of this l f children selection.
    *
    * @return the sequencing i d of this l f children selection
    */
    public Integer getSequencingID();

    /**
        * Sets the sequencing i d of this l f children selection.
    *
    * @param sequencingID the sequencing i d of this l f children selection
    */
    public void setSequencingID(Integer sequencingID);

    /**
    * Returns the take count of this l f children selection.
    *
    * @return the take count of this l f children selection
    */
    public Integer getTakeCount();

    /**
        * Sets the take count of this l f children selection.
    *
    * @param takeCount the take count of this l f children selection
    */
    public void setTakeCount(Integer takeCount);

    /**
    * Returns the take timing on each attempt of this l f children selection.
    *
    * @return the take timing on each attempt of this l f children selection
    */
    @AutoEscape
    public String getTakeTimingOnEachAttempt();

    /**
        * Sets the take timing on each attempt of this l f children selection.
    *
    * @param takeTimingOnEachAttempt the take timing on each attempt of this l f children selection
    */
    public void setTakeTimingOnEachAttempt(String takeTimingOnEachAttempt);

    /**
    * Returns the reorder on each attempt of this l f children selection.
    *
    * @return the reorder on each attempt of this l f children selection
    */
    @AutoEscape
    public String getReorderOnEachAttempt();

    /**
        * Sets the reorder on each attempt of this l f children selection.
    *
    * @param reorderOnEachAttempt the reorder on each attempt of this l f children selection
    */
    public void setReorderOnEachAttempt(String reorderOnEachAttempt);

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

    public int compareTo(LFChildrenSelection lfChildrenSelection);

    public int hashCode();

    public CacheModel<LFChildrenSelection> toCacheModel();

    public LFChildrenSelection toEscapedModel();

    public String toString();

    public String toXmlString();
}
