<%-- <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<portlet:actionURL name="addNewDepartment" var="addDepartment" />
<portlet:defineObjects />
<div class="wrapper-add">
	<h1 class="add-title">Add your own Department</h1>
	<aui:form action="<%=addDepartment.toString()%>" method="post">
		<aui:fieldset>
			<aui:input name="departmentName" size="45" />
			<aui:button-row>
				<aui:button value="Add" type="submit" />
			</aui:button-row>
		</aui:fieldset>
	</aui:form>
</div> --%>