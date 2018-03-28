<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>设备管理</title>
<link href="${ctx }/assets/images/favicon.ico" rel="shortcut icon" />
<link rel="stylesheet" type="text/css"
	href="${ctx }/assets/css/jquery.dataTables.min.css">

<!-- jQuery -->
<script type="text/javascript" charset="utf8"
	src="${ctx }/assets/js/jquery-1.7.2.min.js"></script>

<!-- DataTables -->
<script type="text/javascript" charset="utf8"
	src="${ctx }/assets/js/jquery.dataTables.min.js"></script>

</head>
<body>
	<jsp:include page="/Top.jsp"></jsp:include>
	<table id="listDevice"
		class="table table-border table-hover table-bg table-sort" width="95%">
		<thead>
			<tr>
				<th class="htz">设备编号</th>
				<th class="htz">设备名称</th>
				<th class="htz">设备价格</th>
				<th class="htz">生产厂商</th>
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
							$('#listDevice')
									.DataTable(
											{
												paging : false,
												scrolly : 500,
												sAjaxDataProp : "",
												searching : false,
												ajax : {
													//指定数据源
													url : "${ctx}/deviceControl/getAllDevice"
												},
												columns : [ {
													"data" : "deviceid"
												}, {
													"data" : "devicename"
												}, {
													"data" : "deviceprice"
												}, {
													"data" : "manufacture"
												},
												{
													"data" : "deviceid"
												}],
												columnDefs : [
														{
															orderable : false,
															targets : [ 1, 3]
														},
														{
															targets : 4,
															render : function(
																	data, type,
																	row, meta) {
																return '<a style="text-decoration:none" href="javadcript:;" onClick="show(\''
																		+ data
																		+ '\')" title="查看"><i class="icon-eye-open"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;'
																		+ '<a style="text-decoration:none" href="javadcript:;" onClick="edit(\''
																		+ data
																		+ '\')" title="编辑"><i class="icon-edit"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;'
																		+ '<a style="text-decoration:none" href="javadcript:;" onClick="del(\''
																		+ data
																		+ '\')" title="删除"><i class="icon-trash"></i></a>&nbsp;&nbsp;';
															}
														} ],
											});
						});
		function show(id) {alert(id)}
		function edit(id) {}
		function del(id) {}
	</script>
</body>
</html>