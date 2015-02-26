package com.lftechnology.sbworkbench.training.manageorganization.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link departmentService}.
 * </p>
 *
 * @author    Sanjib Maharjan
 * @see       departmentService
 * @generated
 */
public class departmentServiceWrapper implements departmentService,
    ServiceWrapper<departmentService> {
    private departmentService _departmentService;

    public departmentServiceWrapper(departmentService departmentService) {
        _departmentService = departmentService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _departmentService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _departmentService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _departmentService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public departmentService getWrappeddepartmentService() {
        return _departmentService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappeddepartmentService(departmentService departmentService) {
        _departmentService = departmentService;
    }

    public departmentService getWrappedService() {
        return _departmentService;
    }

    public void setWrappedService(departmentService departmentService) {
        _departmentService = departmentService;
    }
}
