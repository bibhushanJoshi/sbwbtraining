package com.lftechnology.sbworkbench.training.manageorganization.service.impl;

import java.util.List;

import com.lftechnology.sbworkbench.training.manageorganization.model.department;
import com.lftechnology.sbworkbench.training.manageorganization.service.base.departmentLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the department local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.sbworkbench.training.manageorganization.service.departmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sanjib Maharjan
 * @see com.lftechnology.sbworkbench.training.manageorganization.service.base.departmentLocalServiceBaseImpl
 * @see com.lftechnology.sbworkbench.training.manageorganization.service.departmentLocalServiceUtil
 */
public class departmentLocalServiceImpl extends departmentLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.lftechnology.sbworkbench.training.manageorganization.service.departmentLocalServiceUtil} to access the department local service.
     */
	
	/**
	 * @author Sanjib<sanjibmaharjan@lftechonology.com>
	 */
	public List<department> getEveryDepartments() throws SystemException{
		return departmentPersistence.findAll();
	}
}
