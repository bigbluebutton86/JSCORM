package com.arcusys.learn.persistence.liferay.service.base;

import com.arcusys.learn.persistence.liferay.service.LFPackageScopeRuleLocalServiceUtil;

import java.util.Arrays;


public class LFPackageScopeRuleLocalServiceClpInvoker {
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
    private String _methodName223;
    private String[] _methodParameterTypes223;
    private String _methodName224;
    private String[] _methodParameterTypes224;
    private String _methodName225;
    private String[] _methodParameterTypes225;
    private String _methodName226;
    private String[] _methodParameterTypes226;
    private String _methodName227;
    private String[] _methodParameterTypes227;
    private String _methodName228;
    private String[] _methodParameterTypes228;

    public LFPackageScopeRuleLocalServiceClpInvoker() {
        _methodName0 = "addLFPackageScopeRule";

        _methodParameterTypes0 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule"
            };

        _methodName1 = "createLFPackageScopeRule";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteLFPackageScopeRule";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteLFPackageScopeRule";

        _methodParameterTypes3 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule"
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

        _methodName9 = "fetchLFPackageScopeRule";

        _methodParameterTypes9 = new String[] { "long" };

        _methodName10 = "getLFPackageScopeRule";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getPersistedModel";

        _methodParameterTypes11 = new String[] { "java.io.Serializable" };

        _methodName12 = "getLFPackageScopeRules";

        _methodParameterTypes12 = new String[] { "int", "int" };

        _methodName13 = "getLFPackageScopeRulesCount";

        _methodParameterTypes13 = new String[] {  };

        _methodName14 = "updateLFPackageScopeRule";

        _methodParameterTypes14 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule"
            };

        _methodName15 = "updateLFPackageScopeRule";

        _methodParameterTypes15 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule",
                "boolean"
            };

        _methodName212 = "getBeanIdentifier";

        _methodParameterTypes212 = new String[] {  };

        _methodName213 = "setBeanIdentifier";

        _methodParameterTypes213 = new String[] { "java.lang.String" };

        _methodName218 = "createLFPackageScopeRule";

        _methodParameterTypes218 = new String[] {  };

        _methodName219 = "findByPackageID";

        _methodParameterTypes219 = new String[] { "java.lang.Integer" };

        _methodName220 = "findByScopeAndIsDefault";

        _methodParameterTypes220 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.Boolean"
            };

        _methodName221 = "findByScope";

        _methodParameterTypes221 = new String[] {
                "java.lang.String", "java.lang.String"
            };

        _methodName222 = "findByPackageIDAndScope";

        _methodParameterTypes222 = new String[] {
                "java.lang.Integer", "java.lang.String", "java.lang.String"
            };

        _methodName223 = "fetchByPackageIDAndScope";

        _methodParameterTypes223 = new String[] {
                "java.lang.Integer", "java.lang.String", "java.lang.String"
            };

        _methodName224 = "findByAllByPackageIDAndScope";

        _methodParameterTypes224 = new String[] {
                "java.lang.Integer", "java.lang.String", "java.lang.String"
            };

        _methodName225 = "findByVisibility";

        _methodParameterTypes225 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.Boolean"
            };

        _methodName226 = "removeByPackageID";

        _methodParameterTypes226 = new String[] { "java.lang.Integer" };

        _methodName227 = "removeAll";

        _methodParameterTypes227 = new String[] {  };

        _methodName228 = "getLFPackageScopeRule";

        _methodParameterTypes228 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.addLFPackageScopeRule((com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.createLFPackageScopeRule(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.deleteLFPackageScopeRule(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.deleteLFPackageScopeRule((com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.fetchLFPackageScopeRule(((Long) arguments[0]).longValue());
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getLFPackageScopeRule(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getLFPackageScopeRules(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getLFPackageScopeRulesCount();
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.updateLFPackageScopeRule((com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule) arguments[0]);
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.updateLFPackageScopeRule((com.arcusys.learn.persistence.liferay.model.LFPackageScopeRule) arguments[0],
                ((Boolean) arguments[1]).booleanValue());
        }

        if (_methodName212.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes212, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName213.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes213, parameterTypes)) {
            LFPackageScopeRuleLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName218.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes218, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.createLFPackageScopeRule();
        }

        if (_methodName219.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes219, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByPackageID((java.lang.Integer) arguments[0]);
        }

        if (_methodName220.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes220, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByScopeAndIsDefault((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.Boolean) arguments[2]);
        }

        if (_methodName221.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes221, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByScope((java.lang.String) arguments[0],
                (java.lang.String) arguments[1]);
        }

        if (_methodName222.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes222, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByPackageIDAndScope((java.lang.Integer) arguments[0],
                (java.lang.String) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName223.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes223, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.fetchByPackageIDAndScope((java.lang.Integer) arguments[0],
                (java.lang.String) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName224.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes224, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByAllByPackageIDAndScope((java.lang.Integer) arguments[0],
                (java.lang.String) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName225.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes225, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.findByVisibility((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.Boolean) arguments[2]);
        }

        if (_methodName226.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes226, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.removeByPackageID((java.lang.Integer) arguments[0]);
        }

        if (_methodName227.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes227, parameterTypes)) {
            LFPackageScopeRuleLocalServiceUtil.removeAll();

            return null;
        }

        if (_methodName228.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes228, parameterTypes)) {
            return LFPackageScopeRuleLocalServiceUtil.getLFPackageScopeRule(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
