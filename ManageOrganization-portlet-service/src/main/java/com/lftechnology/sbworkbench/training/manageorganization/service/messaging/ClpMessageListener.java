package com.lftechnology.sbworkbench.training.manageorganization.service.messaging;

import com.lftechnology.sbworkbench.training.manageorganization.service.ClpSerializer;
import com.lftechnology.sbworkbench.training.manageorganization.service.departmentLocalServiceUtil;
import com.lftechnology.sbworkbench.training.manageorganization.service.departmentServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            departmentLocalServiceUtil.clearService();

            departmentServiceUtil.clearService();
        }
    }
}
