package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFChildrenSelection;
import com.arcusys.learn.persistence.liferay.model.LFChildrenSelectionModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
* The base model implementation for the LFChildrenSelection service. Represents a row in the &quot;Learn_LFChildrenSelection&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFChildrenSelectionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFChildrenSelectionImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFChildrenSelectionImpl
* @see com.arcusys.learn.persistence.liferay.model.LFChildrenSelection
* @see com.arcusys.learn.persistence.liferay.model.LFChildrenSelectionModel
* @generated
*/
public class LFChildrenSelectionModelImpl extends BaseModelImpl<LFChildrenSelection>
    implements LFChildrenSelectionModel {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this class directly. All methods that expect a l f children selection model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFChildrenSelection} interface instead.
    */
    public static final String TABLE_NAME = "Learn_LFChildrenSelection";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "sequencingID", Types.INTEGER },
            { "takeCount", Types.INTEGER },
            { "takeTimingOnEachAttempt", Types.CLOB },
            { "reorderOnEachAttempt", Types.CLOB }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFChildrenSelection (id_ LONG not null primary key,sequencingID INTEGER null,takeCount INTEGER null,takeTimingOnEachAttempt TEXT null,reorderOnEachAttempt TEXT null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFChildrenSelection";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFChildrenSelection"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFChildrenSelection"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFChildrenSelection"),
            true);
    public static long SEQUENCINGID_COLUMN_BITMASK = 1L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFChildrenSelection"));
    private static ClassLoader _classLoader = LFChildrenSelection.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            LFChildrenSelection.class
        };
    private long _id;
    private Integer _sequencingID;
    private Integer _originalSequencingID;
    private boolean _setOriginalSequencingID;
    private Integer _takeCount;
    private String _takeTimingOnEachAttempt;
    private String _reorderOnEachAttempt;
    private long _columnBitmask;
    private LFChildrenSelection _escapedModelProxy;

    public LFChildrenSelectionModelImpl() {
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_id);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return LFChildrenSelection.class;
    }

    public String getModelClassName() {
        return LFChildrenSelection.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("sequencingID", getSequencingID());
        attributes.put("takeCount", getTakeCount());
        attributes.put("takeTimingOnEachAttempt", getTakeTimingOnEachAttempt());
        attributes.put("reorderOnEachAttempt", getReorderOnEachAttempt());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Integer sequencingID = (Integer) attributes.get("sequencingID");

        if (sequencingID != null) {
            setSequencingID(sequencingID);
        }

        Integer takeCount = (Integer) attributes.get("takeCount");

        if (takeCount != null) {
            setTakeCount(takeCount);
        }

        String takeTimingOnEachAttempt = (String) attributes.get(
                "takeTimingOnEachAttempt");

        if (takeTimingOnEachAttempt != null) {
            setTakeTimingOnEachAttempt(takeTimingOnEachAttempt);
        }

        String reorderOnEachAttempt = (String) attributes.get(
                "reorderOnEachAttempt");

        if (reorderOnEachAttempt != null) {
            setReorderOnEachAttempt(reorderOnEachAttempt);
        }
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public Integer getSequencingID() {
        return _sequencingID;
    }

    public void setSequencingID(Integer sequencingID) {
        _columnBitmask |= SEQUENCINGID_COLUMN_BITMASK;

        if (!_setOriginalSequencingID) {
            _setOriginalSequencingID = true;

            _originalSequencingID = _sequencingID;
        }

        _sequencingID = sequencingID;
    }

    public Integer getOriginalSequencingID() {
        return _originalSequencingID;
    }

    public Integer getTakeCount() {
        return _takeCount;
    }

    public void setTakeCount(Integer takeCount) {
        _takeCount = takeCount;
    }

    public String getTakeTimingOnEachAttempt() {
        return _takeTimingOnEachAttempt;
    }

    public void setTakeTimingOnEachAttempt(String takeTimingOnEachAttempt) {
        _takeTimingOnEachAttempt = takeTimingOnEachAttempt;
    }

    public String getReorderOnEachAttempt() {
        return _reorderOnEachAttempt;
    }

    public void setReorderOnEachAttempt(String reorderOnEachAttempt) {
        _reorderOnEachAttempt = reorderOnEachAttempt;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFChildrenSelection.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFChildrenSelection toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (LFChildrenSelection) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        LFChildrenSelectionImpl lfChildrenSelectionImpl = new LFChildrenSelectionImpl();

        lfChildrenSelectionImpl.setId(getId());
        lfChildrenSelectionImpl.setSequencingID(getSequencingID());
        lfChildrenSelectionImpl.setTakeCount(getTakeCount());
        lfChildrenSelectionImpl.setTakeTimingOnEachAttempt(getTakeTimingOnEachAttempt());
        lfChildrenSelectionImpl.setReorderOnEachAttempt(getReorderOnEachAttempt());

        lfChildrenSelectionImpl.resetOriginalValues();

        return lfChildrenSelectionImpl;
    }

    public int compareTo(LFChildrenSelection lfChildrenSelection) {
        long primaryKey = lfChildrenSelection.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        LFChildrenSelection lfChildrenSelection = null;

        try {
            lfChildrenSelection = (LFChildrenSelection) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = lfChildrenSelection.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        LFChildrenSelectionModelImpl lfChildrenSelectionModelImpl = this;

        lfChildrenSelectionModelImpl._originalSequencingID = lfChildrenSelectionModelImpl._sequencingID;

        lfChildrenSelectionModelImpl._setOriginalSequencingID = false;

        lfChildrenSelectionModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFChildrenSelection> toCacheModel() {
        LFChildrenSelectionCacheModel lfChildrenSelectionCacheModel = new LFChildrenSelectionCacheModel();

        lfChildrenSelectionCacheModel.id = getId();

        lfChildrenSelectionCacheModel.sequencingID = getSequencingID();

        lfChildrenSelectionCacheModel.takeCount = getTakeCount();

        lfChildrenSelectionCacheModel.takeTimingOnEachAttempt = getTakeTimingOnEachAttempt();

        String takeTimingOnEachAttempt = lfChildrenSelectionCacheModel.takeTimingOnEachAttempt;

        if ((takeTimingOnEachAttempt != null) &&
                (takeTimingOnEachAttempt.length() == 0)) {
            lfChildrenSelectionCacheModel.takeTimingOnEachAttempt = null;
        }

        lfChildrenSelectionCacheModel.reorderOnEachAttempt = getReorderOnEachAttempt();

        String reorderOnEachAttempt = lfChildrenSelectionCacheModel.reorderOnEachAttempt;

        if ((reorderOnEachAttempt != null) &&
                (reorderOnEachAttempt.length() == 0)) {
            lfChildrenSelectionCacheModel.reorderOnEachAttempt = null;
        }

        return lfChildrenSelectionCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", sequencingID=");
        sb.append(getSequencingID());
        sb.append(", takeCount=");
        sb.append(getTakeCount());
        sb.append(", takeTimingOnEachAttempt=");
        sb.append(getTakeTimingOnEachAttempt());
        sb.append(", reorderOnEachAttempt=");
        sb.append(getReorderOnEachAttempt());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append(
            "com.arcusys.learn.persistence.liferay.model.LFChildrenSelection");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sequencingID</column-name><column-value><![CDATA[");
        sb.append(getSequencingID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>takeCount</column-name><column-value><![CDATA[");
        sb.append(getTakeCount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>takeTimingOnEachAttempt</column-name><column-value><![CDATA[");
        sb.append(getTakeTimingOnEachAttempt());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>reorderOnEachAttempt</column-name><column-value><![CDATA[");
        sb.append(getReorderOnEachAttempt());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
