package com.lftechnology.sbworkbench.training.manageorganization.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * The utility for the department remote service. This utility wraps {@link com.lftechnology.sbworkbench.training.manageorganization.service.impl.departmentServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Sanjib Maharjan
 * @see departmentService
 * @see com.lftechnology.sbworkbench.training.manageorganization.service.base.departmentServiceBaseImpl
 * @see com.lftechnology.sbworkbench.training.manageorganization.service.impl.departmentServiceImpl
 * @generated
 */
public class departmentServiceUtil {
    private static departmentService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.lftechnology.sbworkbench.training.manageorganization.service.impl.departmentServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

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

    public static void clearService() {
        _service = null;
    }

    public static departmentService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    departmentService.class.getName());

            if (invokableService instanceof departmentService) {
                _service = (departmentService) invokableService;
            } else {
                _service = new departmentServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(departmentServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated
     */
    public void setService(departmentService service) {
    }
}
