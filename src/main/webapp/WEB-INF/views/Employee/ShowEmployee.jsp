<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
	var ID = '${ID}';
		$.ajax({
			url : "${ctx}/employeeControl/getEmployeeById",
			data : {
				ID : ID
			},
			success : function () {data} {
				console.log(data)
			},
			error : function(data) {
				alert(data)
			}
		});
	</script>
</body>
</html>