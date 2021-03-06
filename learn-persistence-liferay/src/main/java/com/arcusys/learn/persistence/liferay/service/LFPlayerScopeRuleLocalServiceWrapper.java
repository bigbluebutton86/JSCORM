package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link LFPlayerScopeRuleLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       LFPlayerScopeRuleLocalService
 * @generated
 */
public class LFPlayerScopeRuleLocalServiceWrapper
    implements LFPlayerScopeRuleLocalService,
        ServiceWrapper<LFPlayerScopeRuleLocalService> {
    private LFPlayerScopeRuleLocalService _lfPlayerScopeRuleLocalService;

    public LFPlayerScopeRuleLocalServiceWrapper(
        LFPlayerScopeRuleLocalService lfPlayerScopeRuleLocalService) {
        _lfPlayerScopeRuleLocalService = lfPlayerScopeRuleLocalService;
    }

    /**
    * Adds the l f player scope rule to the database. Also notifies the appropriate model listeners.
    *
    * @param lfPlayerScopeRule the l f player scope rule
    * @return the l f player scope rule that was added
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule addLFPlayerScopeRule(
        com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule lfPlayerScopeRule)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.addLFPlayerScopeRule(lfPlayerScopeRule);
    }

    /**
    * Creates a new l f player scope rule with the primary key. Does not add the l f player scope rule to the database.
    *
    * @param id the primary key for the new l f player scope rule
    * @return the new l f player scope rule
    */
    public com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule createLFPlayerScopeRule(
        long id) {
        return _lfPlayerScopeRuleLocalService.createLFPlayerScopeRule(id);
    }

    /**
    * Deletes the l f player scope rule with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f player scope rule
    * @return the l f player scope rule that was removed
    * @throws PortalException if a l f player scope rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule deleteLFPlayerScopeRule(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.deleteLFPlayerScopeRule(id);
    }

    /**
    * Deletes the l f player scope rule from the database. Also notifies the appropriate model listeners.
    *
    * @param lfPlayerScopeRule the l f player scope rule
    * @return the l f player scope rule that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule deleteLFPlayerScopeRule(
        com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule lfPlayerScopeRule)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.deleteLFPlayerScopeRule(lfPlayerScopeRule);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lfPlayerScopeRuleLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule fetchLFPlayerScopeRule(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.fetchLFPlayerScopeRule(id);
    }

    /**
    * Returns the l f player scope rule with the primary key.
    *
    * @param id the primary key of the l f player scope rule
    * @return the l f player scope rule
    * @throws PortalException if a l f player scope rule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule getLFPlayerScopeRule(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.getLFPlayerScopeRule(id);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f player scope rules.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f player scope rules
    * @param end the upper bound of the range of l f player scope rules (not inclusive)
    * @return the range of l f player scope rules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule> getLFPlayerScopeRules(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.getLFPlayerScopeRules(start, end);
    }

    /**
    * Returns the number of l f player scope rules.
    *
    * @return the number of l f player scope rules
    * @throws SystemException if a system exception occurred
    */
    public int getLFPlayerScopeRulesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.getLFPlayerScopeRulesCount();
    }

    /**
    * Updates the l f player scope rule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfPlayerScopeRule the l f player scope rule
    * @return the l f player scope rule that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule updateLFPlayerScopeRule(
        com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule lfPlayerScopeRule)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.updateLFPlayerScopeRule(lfPlayerScopeRule);
    }

    /**
    * Updates the l f player scope rule in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfPlayerScopeRule the l f player scope rule
    * @param merge whether to merge the l f player scope rule with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the l f player scope rule that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule updateLFPlayerScopeRule(
        com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule lfPlayerScopeRule,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.updateLFPlayerScopeRule(lfPlayerScopeRule,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _lfPlayerScopeRuleLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lfPlayerScopeRuleLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lfPlayerScopeRuleLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    public com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule createLFPlayerScopeRule()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.createLFPlayerScopeRule();
    }

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule> findByPlayerID(
        java.lang.String playerID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.findByPlayerID(playerID);
    }

    public java.util.List<com.arcusys.learn.persistence.liferay.model.LFPlayerScopeRule> findByPlayerID(
        java.lang.String playerID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lfPlayerScopeRuleLocalService.findByPlayerID(playerID, start,
            end);
    }

    public void removeByPlayerID(java.lang.String playerID)
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfPlayerScopeRuleLocalService.removeByPlayerID(playerID);
    }

    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lfPlayerScopeRuleLocalService.removeAll();
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public LFPlayerScopeRuleLocalService getWrappedLFPlayerScopeRuleLocalService() {
        return _lfPlayerScopeRuleLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedLFPlayerScopeRuleLocalService(
        LFPlayerScopeRuleLocalService lfPlayerScopeRuleLocalService) {
        _lfPlayerScopeRuleLocalService = lfPlayerScopeRuleLocalService;
    }

    public LFPlayerScopeRuleLocalService getWrappedService() {
        return _lfPlayerScopeRuleLocalService;
    }

    public void setWrappedService(
        LFPlayerScopeRuleLocalService lfPlayerScopeRuleLocalService) {
        _lfPlayerScopeRuleLocalService = lfPlayerScopeRuleLocalService;
    }
}
