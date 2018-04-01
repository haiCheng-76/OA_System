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
						<label for="carId" class="col-sm-2 control-label">车辆编号</label>
						<div class="col-sm-10">
							<input type="number" class="form-control" id="carId"
								placeholder="员工编号" readonly="readonly">
						</div>
					</div>

					<div class="form-group">
						<label for="carName" class="col-sm-2 control-label">名称</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="carName"
								placeholder="员工账号" readonly="readonly">
						</div>
					</div>

					<div class="form-group">
						<label for="carNumber" class="col-sm-2 control-label">车牌号</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="carNumber"
								placeholder="员工姓名" readonly="readonly">
						</div>
					</div>

					<div class="form-group">
						<label for="carprice" class="col-sm-2 control-label">价格</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="carprice"
								placeholder="密码" readonly="readonly">
						</div>
					</div>
				</form>
			</div>
		</div>

		<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
		<script src="${ctx }/assets/js/jquery-1.7.2.min.js"></script>
		<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
		<script src="${ctx }/assets/js/bootstrap.min.js"></script>
		<script type="text/javascript">
			var ID = '${ID}';
			console.log("编号为" + ID)
			$(document).ready(function() {
				$.ajax({
					type : "POST",
					url : "${ctx}/carInfoControl/getCarinfoById",
					data : {
						ID : ID
					},
					success : function(data) {
						$("#carId").val(data.carid);
						$("#carName").val(data.carname);
						$("#carNumber").val(data.carnumber);
						$("#carprice").val(data.carprice);
					},
					error : function(data) {
						console.log(data)
					}
				});
			});
		</script>
</body>
</html>