<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%-- 
<portlet:resourceURL var="jqGridFormResourceURL">
	<portlet:param name="jspPage" value="/html/jqgridaction/form.jsp"></portlet:param>
</portlet:resourceURL> --%>
<portlet:actionURL name="update" var="updates" />
<portlet:resourceURL var="serve"></portlet:resourceURL>
<portlet:defineObjects />

<table id="jqGrid"></table>
<div id="jqGridPager"></div>
<!-- 
<div id="pager3"></div>
<table id="navgrid"></table>
<div id="pagernav"></div> -->
<%
	//JSONObject obj = (JSONObject)renderRequest.getAttribute("df");
%>
jhgjh
<script>
/* var sd = {"total":"0.0","page":"1","records ":"2",
		"rows":[{ departmentId: "1", departmentName: "2007-10-01",createdBy:"dksljf",createdOn:"asdas"}]}; */


jQuery("#jqGrid").jqGrid({
	url:'${serve}',
	editurl:'${updates}',
    datatype: 'json',
    edit: true, add: true, del: true,
    colNames:['id', 'department', 'created by','Created On','CompanyId','GroupId','Actions'],
    colModel:[
    {name:'departmentId',index:'departmentId', width:60,align:"center", sorttype:"int", editable: true},
    {name:'departmentName',index:'departmentName',align:"left", width:310, editable: true},
    {name:'createdBy',index:'createdBy', width:80, align:"center", editable: true},
    {name:'createdOn',index:'createdOn', width:80, align:"center", editable: true},
    {name:'companyId',index:'companyId', width:80,align:"center",sorttype:"float", editable: true},
    {name:'groupId',index:'groupId', width:80,align:"center", sortable:false, editable: true},{
		label: "Edit Actions",
        name: "actions",
        width: 50,
        align:'center',
        formatter: "actions",
        formatoptions: {
            keys: true,
            editOptions: {},
            addOptions: {},
            delOptions: {}
        }       
    }
    ],
    height:'auto',
    rowNum:5,
    sortname: 'departmentId',
    viewrecords: true,
    sortorder: "desc",
    loadonce: true,
    pager:'#jqGridPager'
},{closeAfterEdit:true},{url:'${updates}',closeAfterAdd: true},{},{});
$('#jqGrid').navGrid("#jqGridPager", {edit: false, add: true});
/* $('#jqGrid').inlineNav('#jqGridPager',
    // the buttons to appear on the toolbar of the grid
    { 
        edit: true, 
        add: false, 
        del: true, 
        cancel: true,
        editParams: {
            keys: true,
        },
        addParams: {
            keys: true
        }
    }); */
/* jQuery("#list3").jqGrid('navGrid','#pager3',
{edit:false,add:false,del:false},
{},
{},
{},
{multipleSearch:true, multipleGroup:true}
); */
<%-- jQuery("#jqGrid").jqGrid({
    data:'<%=obj%>',
    datatype: "json",
    colNames:['id', 'department', 'created by','Updated By','CompanyId','GroupId'],
    colModel:[
    {name:'departmentId',index:'departmentId', width:60, sorttype:"int"},
    {name:'departmentName',index:'departmentName', width:100},
    {name:'createdBy',index:'createdBy', width:80, align:"right",sorttype:"float"},
    {name:'updatedBy',index:'updatedBy', width:80, align:"right",sorttype:"float"},
    {name:'companyId',index:'companyId', width:80,align:"right",sorttype:"float"},
    {name:'groupId',index:'groupId', width:150, sortable:false}
    ],
    multiselect: true,
    rowNum:20,
    rowList:[10,20,30],
    pager: '#pager3',
    sortname: 'id',
    viewrecords: true,
    sortorder: "desc",
    loadonce: true,
    caption: "Load Once Example"
});
jQuery("#list3").jqGrid('navGrid','#pager3',
{edit:false,add:false,del:false},
{},
{},
{},
{multipleSearch:true, multipleGroup:true}
); --%>



</script>

