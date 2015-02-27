package com.lftechnology.sbworkbench.training.manageorganization.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link departmentLocalService}.
 * </p>
 *
 * @author    Sanjib Maharjan
 * @see       departmentLocalService
 * @generated
 */
public class departmentLocalServiceWrapper implements departmentLocalService,
    ServiceWrapper<departmentLocalService> {
    private departmentLocalService _departmentLocalService;

    public departmentLocalServiceWrapper(
        departmentLocalService departmentLocalService) {
        _departmentLocalService = departmentLocalService;
    }

    /**
    * Adds the department to the database. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was added
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbworkbench.training.manageorganization.model.department adddepartment(
        com.lftechnology.sbworkbench.training.manageorganization.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.adddepartment(department);
    }

    /**
    * Creates a new department with the primary key. Does not add the department to the database.
    *
    * @param departmentId the primary key for the new department
    * @return the new department
    */
    public com.lftechnology.sbworkbench.training.manageorganization.model.department createdepartment(
        long departmentId) {
        return _departmentLocalService.createdepartment(departmentId);
    }

    /**
    * Deletes the department with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param departmentId the primary key of the department
    * @return the department that was removed
    * @throws PortalException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbworkbench.training.manageorganization.model.department deletedepartment(
        long departmentId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.deletedepartment(departmentId);
    }

    /**
    * Deletes the department from the database. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbworkbench.training.manageorganization.model.department deletedepartment(
        com.lftechnology.sbworkbench.training.manageorganization.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.deletedepartment(department);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _departmentLocalService.dynamicQuery();
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
        return _departmentLocalService.dynamicQuery(dynamicQuery);
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
        return _departmentLocalService.dynamicQuery(dynamicQuery, start, end);
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
        return _departmentLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
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
        return _departmentLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.lftechnology.sbworkbench.training.manageorganization.model.department fetchdepartment(
        long departmentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.fetchdepartment(departmentId);
    }

    /**
    * Returns the department with the primary key.
    *
    * @param departmentId the primary key of the department
    * @return the department
    * @throws PortalException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbworkbench.training.manageorganization.model.department getdepartment(
        long departmentId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.getdepartment(departmentId);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the departments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of departments
    * @param end the upper bound of the range of departments (not inclusive)
    * @return the range of departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbworkbench.training.manageorganization.model.department> getdepartments(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.getdepartments(start, end);
    }

    /**
    * Returns the number of departments.
    *
    * @return the number of departments
    * @throws SystemException if a system exception occurred
    */
    public int getdepartmentsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.getdepartmentsCount();
    }

    /**
    * Updates the department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbworkbench.training.manageorganization.model.department updatedepartment(
        com.lftechnology.sbworkbench.training.manageorganization.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.updatedepartment(department);
    }

    /**
    * Updates the department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @param merge whether to merge the department with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the department that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbworkbench.training.manageorganization.model.department updatedepartment(
        com.lftechnology.sbworkbench.training.manageorganization.model.department department,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.updatedepartment(department, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _departmentLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _departmentLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _departmentLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
    * @author Sanjib<sanjibmaharjan@lftechonology.com>
    */
    public java.util.List<com.lftechnology.sbworkbench.training.manageorganization.model.department> getEveryDepartments()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.getEveryDepartments();
    }

    public com.lftechnology.sbworkbench.training.manageorganization.model.department addUpdateDepartment(
        com.lftechnology.sbworkbench.training.manageorganization.model.department department)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _departmentLocalService.addUpdateDepartment(department);
    }

    public void deleteDepartment(long departmentId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _departmentLocalService.deleteDepartment(departmentId);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public departmentLocalService getWrappeddepartmentLocalService() {
        return _departmentLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappeddepartmentLocalService(
        departmentLocalService departmentLocalService) {
        _departmentLocalService = departmentLocalService;
    }

    public departmentLocalService getWrappedService() {
        return _departmentLocalService;
    }

    public void setWrappedService(departmentLocalService departmentLocalService) {
        _departmentLocalService = departmentLocalService;
    }
}
