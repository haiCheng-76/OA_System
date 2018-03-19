<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<link href="${ctx }/assets/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctx }/assets/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<link href="${ctx }/assets/css/font-awesome.min.css" rel="stylesheet">
<link href="${ctx }/assets/css/font-awesome-ie7.min.css" rel="stylesheet">
<link href="${ctx }/assets/css/style.css" rel="stylesheet">
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"><span class="icon-bar"></span><span
					class="icon-bar"></span><span class="icon-bar"></span> </a><a
					class="brand" href="index.html">OA系统</a>
				<div class="nav-collapse">
					<ul class="nav pull-right">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown"><i class="icon-cog"></i> Account <b
								class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="javascript:;">Settings</a></li>
								<li><a href="javascript:;">Help</a></li>
							</ul></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown"><i class="icon-user"></i> by EGrappler
								<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="javascript:;">Profile</a></li>
								<li><a href="javascript:;">Logout</a></li>
							</ul></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!-- /container -->
		</div>
		<!-- /navbar-inner -->
	</div>
	<!-- /navbar -->
	<div class="subnavbar">
		<div class="subnavbar-inner">
			<div class="container">
				<ul class="mainnav">
					<li class="active"><a href="index.html"><i
							class="icon-dashboard"></i><span>主面板</span> </a></li>
					<li><a href=""><i class="icon-group"></i><span>员工管理</span>
					</a></li>
					<li><a href=""><i class="icon-briefcase"></i><span>部门管理</span> </a></li>
					<li><a href=""><i class="icon-folder-close"></i><span>文件管理</span>
					</a></li>
					<li><a href=""><i class="icon-wrench"></i><span>设备管理</span>
					</a></li>
					<li><a href=""><i class="icon-truck"></i><span>车辆管理</span>
					</a></li>
				</ul>
			</div>
			<!-- /container -->
		</div>
		<!-- /subnavbar-inner -->
	</div>
	<!-- /subnavbar -->

	<!-- Placed at the end of the document so the pages load faster -->
	<script src="${ctx }/assets/js/bootstrap.js"></script>
	<script src="${ctx }/assets/js/base.js"></script>