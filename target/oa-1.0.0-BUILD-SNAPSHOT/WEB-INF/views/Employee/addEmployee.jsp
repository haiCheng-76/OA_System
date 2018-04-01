<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap -->
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<form class="form-horizontal">

					<div class="form-group">
						<label for="employeeAccount" class="col-sm-2 control-label">员工账号</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="employeeAccount"
								placeholder="员工账号">
						</div>
					</div>

					<div class="form-group">
						<label for="employeeUername" class="col-sm-2 control-label">员工姓名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="employeeUername"
								placeholder="员工姓名">
						</div>
					</div>

					<div class="form-group">
						<label for="employeePassword" class="col-sm-2 control-label">密码</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="employeePassword"
								placeholder="密码">
						</div>
					</div>
					<div class="form-group">
						<label for="employeeAge" class="col-sm-2 control-label">年龄</label>
						<div class="col-sm-10">
							<input type="number" class="form-control" id="employeeAge"
								placeholder="年龄">
						</div>
					</div>

					<div class="form-group">
						<label for="employeeAddr" class="col-sm-2 control-label">家庭住址</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="employeeAddr"
								placeholder="家庭住址">
						</div>
					</div>



					<div class="form-group">
						<label for="departmentName" class="col-sm-2 control-label">所属部门</label>
						<div class="col-sm-10">
							<select id="departmentId"></select>
						</div>
					</div>

					<div class="form-group">
						<label for="role" class="col-sm-2 control-label">角色</label>
						<div class="col-sm-10">
							<select id="role">
								<option value="0">请选择</option>
								<option value="0">普通员工</option>
								<option value="1">管理员</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<button type="button"
							class="btn btn-default btn-block btn-primary" onClick="commit()">提交</button>
					</div>
				</form>
			</div>
		</div>

		<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
		<script src="${ctx }/assets/js/jquery-1.7.2.min.js"></script>
		<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
		<script src="${ctx }/assets/js/bootstrap.min.js"></script>
		<script type="text/javascript">
			$(document).ready(
					function() {
						<!--部门下拉列表-->
						$.ajax({
							type : "POST",
							url : "${ctx}/DepartmentControl/getAllDepartment",
							success : function(data) {
								$("#departmentId").append(
										'<option value=0>请选择</option>');
								for (var i = 0; i < data.length; i++) {
									$("#departmentId").append(
											'<option value="'+data[i].departmentid+'">'
													+ data[i].departmentname
													+ '</option>');
								}
							}
						});
					});

			function commit() {
				var Account = $("#employeeAccount").val();
				var Uername = $("#employeeUername").val();
				var Password = $("#employeePassword").val();
				var Age = $("#employeeAge").val();
				var Addr = $("#employeeAddr").val();
				var departmentId = $("#departmentId").val();
				var role = $("#role").val();
				$
						.ajax({
							type : "POST",
							url : "${ctx}/employeeControl/addEmployee",
							data : {
								employee_account : Account,
								username : Uername,
								password : Password,
								age : Age,
								address : Addr,
								departmentid : departmentId,
								role : role
							},
							success : function(data) {
								if (data == "SUCCESS") {
									var index = parent.layer
											.getFrameIndex(window.name); //先得到当前iframe层的索引
									window.parent.location.reload();
									parent.layer.close(index); //再执行关闭
								}
							}
						});
			}
		</script>
</body>
</html>