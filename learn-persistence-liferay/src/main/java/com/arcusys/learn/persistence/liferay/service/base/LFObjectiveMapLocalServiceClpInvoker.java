package com.arcusys.learn.persistence.liferay.service.base;

import com.arcusys.learn.persistence.liferay.service.LFObjectiveMapLocalServiceUtil;

import java.util.Arrays;


public class LFObjectiveMapLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName212;
    private String[] _methodParameterTypes212;
    private String _methodName213;
    private String[] _methodParameterTypes213;
    private String _methodName218;
    private String[] _methodParameterTypes218;
    private String _methodName219;
    private String[] _methodParameterTypes219;
    private String _methodName220;
    private String[] _methodParameterTypes220;
    private String _methodName221;
    private String[] _methodParameterTypes221;
    private String _methodName222;
    private String[] _methodParameterTypes222;

    public LFObjectiveMapLocalServiceClpInvoker() {
        _methodName0 = "addLFObjectiveMap";

        _methodParameterTypes0 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFObjectiveMap"
            };

        _methodName1 = "createLFObjectiveMap";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteLFObjectiveMap";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteLFObjectiveMap";

        _methodParameterTypes3 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFObjectiveMap"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "fetchLFObjectiveMap";

        _methodParameterTypes9 = new String[] { "long" };

        _methodName10 = "getLFObjectiveMap";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getPersistedModel";

        _methodParameterTypes11 = new String[] { "java.io.Serializable" };

        _methodName12 = "getLFObjectiveMaps";

        _methodParameterTypes12 = new String[] { "int", "int" };

        _methodName13 = "getLFObjectiveMapsCount";

        _methodParameterTypes13 = new String[] {  };

        _methodName14 = "updateLFObjectiveMap";

        _methodParameterTypes14 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFObjectiveMap"
            };

        _methodName15 = "updateLFObjectiveMap";

        _methodParameterTypes15 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFObjectiveMap",
                "boolean"
            };

        _methodName212 = "getBeanIdentifier";

        _methodParameterTypes212 = new String[] {  };

        _methodName213 = "setBeanIdentifier";

        _methodParameterTypes213 = new String[] { "java.lang.String" };

        _methodName218 = "createLFObjectiveMap";

        _methodParameterTypes218 = new String[] {  };

        _methodName219 = "findByObjectiveID";

        _methodParameterTypes219 = new String[] { "java.lang.Integer" };

        _methodName220 = "removeByObjectiveID";

        _methodParameterTypes220 = new String[] { "java.lang.Integer" };

        _methodName221 = "removeAll";

        _methodParameterTypes221 = new String[] {  };

        _methodName222 = "getLFObjectiveMap";

        _methodParameterTypes222 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.addLFObjectiveMap((com.arcusys.learn.persistence.liferay.model.LFObjectiveMap) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.createLFObjectiveMap(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.deleteLFObjectiveMap(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.deleteLFObjectiveMap((com.arcusys.learn.persistence.liferay.model.LFObjectiveMap) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.fetchLFObjectiveMap(((Long) arguments[0]).longValue());
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.getLFObjectiveMap(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.getLFObjectiveMaps(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.getLFObjectiveMapsCount();
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.updateLFObjectiveMap((com.arcusys.learn.persistence.liferay.model.LFObjectiveMap) arguments[0]);
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.updateLFObjectiveMap((com.arcusys.learn.persistence.liferay.model.LFObjectiveMap) arguments[0],
                ((Boolean) arguments[1]).booleanValue());
        }

        if (_methodName212.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes212, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName213.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes213, parameterTypes)) {
            LFObjectiveMapLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName218.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes218, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.createLFObjectiveMap();
        }

        if (_methodName219.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes219, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.findByObjectiveID((java.lang.Integer) arguments[0]);
        }

        if (_methodName220.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes220, parameterTypes)) {
            LFObjectiveMapLocalServiceUtil.removeByObjectiveID((java.lang.Integer) arguments[0]);

            return null;
        }

        if (_methodName221.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes221, parameterTypes)) {
            LFObjectiveMapLocalServiceUtil.removeAll();

            return null;
        }

        if (_methodName222.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes222, parameterTypes)) {
            return LFObjectiveMapLocalServiceUtil.getLFObjectiveMap(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
