package com.lftechnology.sbworkbench.training.manageorganization.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the department local service. This utility wraps {@link com.lftechnology.sbworkbench.training.manageorganization.service.impl.departmentLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sanjib Maharjan
 * @see departmentLocalService
 * @see com.lftechnology.sbworkbench.training.manageorganization.service.base.departmentLocalServiceBaseImpl
 * @see com.lftechnology.sbworkbench.training.manageorganization.service.impl.departmentLocalServiceImpl
 * @generated
 */
public class departmentLocalServiceUtil {
    private static departmentLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.lftechnology.sbworkbench.training.manageorganization.service.impl.departmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the department to the database. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbworkbench.training.manageorganization.model.department adddepartment(
        com.lftechnology.sbworkbench.training.manageorganization.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().adddepartment(department);
    }

    /**
    * Creates a new department with the primary key. Does not add the department to the database.
    *
    * @param departmentId the primary key for the new department
    * @return the new department
    */
    public static com.lftechnology.sbworkbench.training.manageorganization.model.department createdepartment(
        long departmentId) {
        return getService().createdepartment(departmentId);
    }

    /**
    * Deletes the department with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param departmentId the primary key of the department
    * @return the department that was removed
    * @throws PortalException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbworkbench.training.manageorganization.model.department deletedepartment(
        long departmentId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletedepartment(departmentId);
    }

    /**
    * Deletes the department from the database. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbworkbench.training.manageorganization.model.department deletedepartment(
        com.lftechnology.sbworkbench.training.manageorganization.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletedepartment(department);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    public static com.lftechnology.sbworkbench.training.manageorganization.model.department fetchdepartment(
        long departmentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchdepartment(departmentId);
    }

    /**
    * Returns the department with the primary key.
    *
    * @param departmentId the primary key of the department
    * @return the department
    * @throws PortalException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbworkbench.training.manageorganization.model.department getdepartment(
        long departmentId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getdepartment(departmentId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.lftechnology.sbworkbench.training.manageorganization.model.department> getdepartments(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getdepartments(start, end);
    }

    /**
    * Returns the number of departments.
    *
    * @return the number of departments
    * @throws SystemException if a system exception occurred
    */
    public static int getdepartmentsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getdepartmentsCount();
    }

    /**
    * Updates the department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @return the department that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbworkbench.training.manageorganization.model.department updatedepartment(
        com.lftechnology.sbworkbench.training.manageorganization.model.department department)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatedepartment(department);
    }

    /**
    * Updates the department in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param department the department
    * @param merge whether to merge the department with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the department that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbworkbench.training.manageorganization.model.department updatedepartment(
        com.lftechnology.sbworkbench.training.manageorganization.model.department department,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatedepartment(department, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * @author Sanjib<sanjibmaharjan@lftechonology.com>
    */
    public static java.util.List<com.lftechnology.sbworkbench.training.manageorganization.model.department> getEveryDepartments()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEveryDepartments();
    }

    public static void clearService() {
        _service = null;
    }

    public static departmentLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    departmentLocalService.class.getName());

            if (invokableLocalService instanceof departmentLocalService) {
                _service = (departmentLocalService) invokableLocalService;
            } else {
                _service = new departmentLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(departmentLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated
     */
    public void setService(departmentLocalService service) {
    }
}
