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
						<label for="deviceId" class="col-sm-2 control-label">设备编号</label>
						<div class="col-sm-10">
							<input type="number" class="form-control" id="deviceId"
								placeholder="设备编号" readonly="readonly">
						</div>
					</div>

					<div class="form-group">
						<label for="deviceName" class="col-sm-2 control-label">名称</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="deviceName"
								placeholder="名称">
						</div>
					</div>

					<div class="form-group">
						<label for="devicePrice" class="col-sm-2 control-label">价格</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="devicePrice"
								placeholder="价格">
						</div>
					</div>

					<div class="form-group">
						<label for="deviceNum" class="col-sm-2 control-label">数量</label>
						<div class="col-sm-10">
							<input type="number" class="form-control" id="deviceNum"
								placeholder="数量">
						</div>
					</div>
					<div class="form-group">
						<label for="manufacture" class="col-sm-2 control-label">生产商</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="manufacture"
								placeholder="生产商">
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
			var ID = '${ID}';

			$(document).ready(
					function() {
						var selectOption;
						<!--通过ID获得员工信息 / -->
						$.ajax({
							type : "POST",
							url : "${ctx}/deviceControl/getDeviceById",
							data : {
								ID : ID
							},
							success : function(data) {
								$("#deviceId").val(data.deviceid);
								$("#deviceName").val(data.devicename);
								$("#devicePrice").val(data.deviceprice);
								$("#deviceNum").val(data.devicenumber);
								$("#manufacture").val(data.manufacture);
							},
							error : function(data) {
								console.log(data)
							}
						});
					});

			<!--提交修改后的数据-->
			function commit() {
				var id = $("#deviceId").val();
				var name = $("#deviceName").val();
				var price = $("#devicePrice").val();
				var num = $("#deviceNum").val();
				var man = $("#manufacture").val();
				$
						.ajax({
							type : "POST",
							url : "${ctx}/deviceControl/updateDevice",
							data : {
								deviceid : id,
								devicename : name,
								deviceprice : price,
								devicenumber : num,
								manufacture : man,
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