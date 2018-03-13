<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>添加车辆</title>

<!-- Bootstrap -->
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<form role="form">
					<div class="form-group">
						<label>名称</label><input type="text"
							class="form-control" name="carname" />
					</div>
					<div class="form-group">
						<label>价格</label><input type="number" class="form-control"
							id="" name="carprice"/>
					</div>
					<div class="form-group">
						<label>去向</label><input type="text" class="form-control"
							id="" name="carwheretogo"/>
					</div>
					<div class="form-group">
						<label>借车日期</label><input type="datetime-local" class="form-control"
							id="" name="carborrowdate" />
					</div>
					<div class="form-group">
						<label>还车日期</label><input type="datetime-local" class="form-control"
							id="" name="carbackdate" />
					</div>
					 <button type="button" class="btn btn-block btn-default btn-primary">按钮</button>
				</form>
			</div>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="https://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>