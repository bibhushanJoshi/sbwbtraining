package com.lftechnology.sbworkbench.training.manageorganization.portlets;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.lftechnology.sbworkbench.training.manageorganization.service.departmentLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ManageOrganizationPortlet
 */
public class ManageOrganizationPortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		System.out.println("do view called");
		// try {
		// renderRequest.setAttribute("df", ActionUtils.getData());
		// } catch (SystemException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		try {
			resourceResponse.getWriter()
					.print(ActionUtils.getData().toString());
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// super.serveResource(resourceRequest, resourceResponse);
	}

	public void update(ActionRequest req, ActionResponse res) {
		System.out.println("update called");
	}

}
