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
	<link href="${ctx }/assets/css/bootstrap-select.min.css">
<script type="text/javascript" src="${ctx }/assets/js/main.js"></script>

</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<form id="uploadfile" role="form" class="form-horizontal" enctype="multipart/form-data">
										<div class="form-group">
						<label for="uploader">上传者</label> <select selectpicker show-tick form-control data-style="btn-info" id="uploader" name="uploader"></select>
					</div>
					<div class="form-group">
						<label for="uploadFile">文件上传</label><input type="file"
							id="file" name="file" />
						<p class="help-block">这里显示帮助文档</p>
					</div>
					<button type="button" class="btn btn-default" onClick="commit()">上传</button>
				</form>
			</div>
		</div>
	</div>

	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	
	<script src="${ctx }/assets/js/jquery-1.7.2.min.js"></script>
	<!-- layer -->
<script type="text/javascript" src="${ctx }/assets/layer/layer.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script src="${ctx }/assets/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		//请求所有上传者
		$(document).ready(
				function() {
					$.ajax({
						type : "POST",
						url : "${ctx}/employeeControl/getallEmoloyee",
						success : function(data) {
							$("#uploader").append(
									'<option value=0>请选择</option>');
							for (var i = 0; i < data.length; i++) {
								$("#uploader").append(
										'<option value="'+data[i].employee_id+'">'
												+ data[i].username
												+ '</option>');
							}
						}
					});
				});

		function commit() {
			//加载层
			var index = layer.load(2, {shade: false}); //0代表加载的风格，支持0-2
			var uploader = $("#uploader").val();
			var file = $("#file")[0].files[0];
			var form = new FormData();
			form.append("uploader",uploader);
			form.append("file",file);
			/* var formData = new FormData($("#uploadfile")[0]); */
			console.log(uploader)
			$.ajax({
				type : "POST",
				url : "${ctx}/fileControl/addFile",
				data : form,
				async : true,
				cache : false,
				contentType : false,
				processData : false,
				success : function(data) {
 					if (data == "SUCCESS") {
						var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
						window.parent.location.reload();
						parent.layer.close(index); //再执行关闭
					}
				}
			});
		}
	</script>
</body>
</html>