package com.lftechnology.sbworkbench.training.manageorganization.service.persistence;

import com.lftechnology.sbworkbench.training.manageorganization.model.department;
import com.lftechnology.sbworkbench.training.manageorganization.service.departmentLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Sanjib Maharjan
 * @generated
 */
public abstract class departmentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public departmentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(departmentLocalServiceUtil.getService());
        setClass(department.class);

        setClassLoader(com.lftechnology.sbworkbench.training.manageorganization.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("departmentId");
    }
}
