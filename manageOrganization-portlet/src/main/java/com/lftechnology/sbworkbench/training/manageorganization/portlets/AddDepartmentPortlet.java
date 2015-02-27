package com.lftechnology.sbworkbench.training.manageorganization.portlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.lftechnology.sbworkbench.training.manageorganization.model.department;
import com.lftechnology.sbworkbench.training.manageorganization.service.departmentLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AddDepartmentPortlet
 */
public class AddDepartmentPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}

	public void addNewDepartment(ActionRequest req, ActionResponse res) {
		String departmentName = req.getParameter("departmentName");
		department department = departmentLocalServiceUtil.createdepartment(0);
		department.setDepartmentName(departmentName);
		department.setCompanyId(PortalUtil.getCompanyId(req));
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		department.setCreatedOn(dateFormat.format(date));
		// PortalUtil.getUserId(request);
		try {
			department.setCreatedBy(PortalUtil.getUser(req).getFullName());
			department.setGroupId(GroupLocalServiceUtil.getCompanyGroup(
					PortalUtil.getCompanyId(req)).getGroupId());
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			departmentLocalServiceUtil.addUpdateDepartment(department);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
