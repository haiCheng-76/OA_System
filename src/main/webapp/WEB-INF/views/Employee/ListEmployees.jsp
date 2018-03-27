<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工管理</title>
<link rel="stylesheet" type="text/css"
	href="${ctx }/assets/css/jquery.dataTables.min.css">
<link href="${ctx }/assets/css/font-awesome.min.css" rel="stylesheet">
<link href="${ctx }/assets/css/font-awesome-ie7.min.css"
	rel="stylesheet">
<!-- jQuery -->
<script type="text/javascript" charset="utf8"
	src="${ctx }/assets/js/jquery-1.7.2.min.js"></script>

<!-- DataTables -->
<script type="text/javascript" charset="utf8"
	src="${ctx }/assets/js/jquery.dataTables.min.js"></script>

</head>
<body>
	<jsp:include page="/Top.jsp"></jsp:include>
	<table id="listEmployee"
		class="table table-border table-hover table-bg table-sort" width="95%">
		<thead>
			<tr>
				<th class="htz">员工编号</th>
				<th class="htz">员工姓名</th>
				<th class="htz">员工年龄</th>
				<th class="htz">部门名称</th>
				<th class="htz">角色</th>
				<th class="htz">操作</th>
			</tr>
		</thead>
		<tbody>
		</tbody>
	</table>
	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							$('#listEmployee')
									.DataTable(
											{
												paging : false,
												scrolly : 500,
												sAjaxDataProp : "",
												searching : false,
												ajax : {
													//指定数据源
													url : "${ctx}/employeeControl/getallEmoloyee"
												},
												columns : [ {
													"data" : "employee_id"
												}, {
													"data" : "username"
												}, {
													"data" : "age"
												}, {
													"data" : "departmentName"
												}, {
													"data" : "role"
												}],
												columnDefs : [
														{
															orderable : false,
															targets : [1,3,4]
														},
														{
															targets : 4,
															render : function(
																	data, type,
																	row, meta) {
																if (data == 1) {
																	return "管理员"
																} else {
																	return "普通员工"
																}
															}
														},
														{
															targets : 5,
															render : function(
																	data, type,
																	row, meta) {
																return '<a style="text-decoration:none" href="javadcript:;" onClick="show(\''
																		+ data
																		+ '\')" title="查看"><i class="icon-eye-open"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;'
																		+ '<a style="text-decoration:none" href="javadcript:;" onClick="edit(\''
																		+ data
																		+ '\')" title="编辑"><i class="icon-edit"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;'
																		+ '<a style="text-decoration:none" href="javadcript:;" onClick="show(\''
																		+ data
																		+ '\')" title="删除"><i class="icon-trash"></i></a>&nbsp;&nbsp;';
															}
														} ],
											});
						});
		function show(id) {
			alert(id)
		}
	</script>
</body>
</html>