<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>管理员登陆</title>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">

<link href="${ctx}/assets/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="${ctx}/assets/css/bootstrap-responsive.min.css"
	rel="stylesheet" type="text/css" />

<link href="${ctx}/assets/css/font-awesome.css" rel="stylesheet">

<link href="${ctx}/assets/css/style.css" rel="stylesheet"
	type="text/css">
<link href="${ctx}/assets/css/pages/signin.css" rel="stylesheet"
	type="text/css">

</head>


<body>

	<div class="navbar navbar-fixed-top">

		<div class="navbar-inner">

			<div class="container">

				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand"> OA系统 </a>

			</div>
			<!-- /container -->

		</div>
		<!-- /navbar-inner -->

	</div>
	<!-- /navbar -->



	<div class="account-container">

		<div class="content clearfix">

			<form>

				<h1>管理员登陆</h1>

				<div class="login-fields">

					<p>请输入登陆信息</p>

					<div class="field">
						<label for="account">用户名</label> <input type="text" id="account"
							name="account" value="" placeholder="用户名"
							class="login username-field" />
					</div>
					<!-- /field -->

					<div class="field">
						<label for="password">密码</label> <input type="password"
							id="password" name="password" value="" placeholder="密码"
							class="login password-field" />
					</div>
					<!-- /password -->

				</div>
				<!-- /login-fields -->

				<div class="login-actions">
					<select name="role" id="role">
						<option value="1">管理员</option>
						<option value="0">用户</option>
					</select>
					<button type="button" class="button btn btn-success btn-large"
						onclick="getall()">登陆</button>

				</div>
				<!-- .actions -->
			</form>

		</div>
		<!-- /content -->

	</div>
	<!-- /account-container -->



	<div class="login-extra">
		<a href="#">忘记密码</a>
	</div>
	<div>
		<h3 class="msg"></h3>
	</div>
	<!-- /login-extra -->


	<script src="${ctx}/assets/js/jquery-1.7.2.min.js"></script>
	<script src="${ctx}/assets/js/bootstrap.js"></script>
	<script src="${ctx}/assets/js/signin.js"></script>
	<script type="text/javascript">
		/* 		function tijiao() {
		 var account = $("#account").val();
		 var password = $("#password").val();
		 var role = $("#role").val();
		 $.ajax({
		 url : '${ctx}/login/isuer.htm',
		 type : 'POST',
		 data : {
		 account : account,
		 password : password,
		 role : role
		 },
		 success : function(data) {
		 if(data == "success") {
		 alert("成功");
		 }
		 if (data == "error"){
		 alert("失败");
		 }
		 },
		 });
		 } */
		function getall() {
			$.ajax({
				url : '${ctx}/fileControl/getallFileInfo.htm',
				type : 'POST',
				success : function(data) {
					console.log(data);
				}
			});
		}
	</script>

</body>

</html>
