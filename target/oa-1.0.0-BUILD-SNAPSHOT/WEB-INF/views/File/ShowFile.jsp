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
						<label for="fileId" class="col-sm-2 control-label">文件编号</label>
						<div class="col-sm-10">
							<input type="number" class="form-control" id="fileId"
								placeholder="文件编号" readonly="readonly">
						</div>
					</div>

					<div class="form-group">
						<label for="fileName" class="col-sm-2 control-label">文件名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="fileName"
								placeholder="文件名" readonly="readonly">
						</div>
					</div>

					<div class="form-group">
						<label for="filesize" class="col-sm-2 control-label">文件大小</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="filesize"
								placeholder="文件大小" readonly="readonly">
						</div>
					</div>

					<div class="form-group">
						<label for="uploadtime" class="col-sm-2 control-label">上传时间</label>
						<div class="col-sm-10">
							<input type="datatime" class="form-control" id="uploadtime"
								placeholder=上传时间 readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label for="uploader" class="col-sm-2 control-label">上传者</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="uploader"
								placeholder="上传者" readonly="readonly">
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
		//文件大小转换
		function bytesToSize(bytes) {  
			　　if (bytes === 0) return '0 B';
			　　var k = 1024;
			　　sizes = ['B','KB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB'];
			　　i = Math.floor(Math.log(bytes) / Math.log(k))　　
			　　return (bytes / Math.pow(k, i)).toPrecision(3) + ' ' + sizes[i];
			};
			//时间格式转换
		function formatDate(now) {
			if (now == null) {
				return null;
			}
			var now = new Date(now);
			var year = now.getFullYear();
			var month = now.getMonth() + 1;
			var date = now.getDate();
			var hour = now.getHours();
			var minute = now.getMinutes();
			var second = now.getSeconds();
			return year + "-" + (month < 10 ? ("0" + month) : month) + "-"
					+ (date < 10 ? ("0" + date) : date) + " " + hour + ":"
					+ (minute < 10 ? ("0" + minute) : minute) + ":"
					+ (second < 10 ? ("0" + second) : second);
		};
			var ID = '${ID}';
			$(document).ready(function() {
				$.ajax({
					url : "${ctx}/fileControl/getFileById",
					data : {
						ID : ID
					},
					success : function(data) {
						$("#fileId").val(data.fileid);
						$("#fileName").val(data.filename);
						$("#filesize").val(bytesToSize(data.filesize));
						$("#uploadtime").val(formatDate(data.fileuploadtime));
						$("#uploader").val(data.uploaderName);
					},
					error : function(data) {
						console.log(data)
					}
				});
			});
		</script>
</body>
</html>