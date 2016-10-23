<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../common/meta.jsp"%>
<!-- 用绝对路径后，在使用ajax时就要写Controller层的路径 -->
<base href="<%=basePath%>" />
<script type="text/javascript" src="${basePath}js/webPage/user/showUsers.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-6 col-md-4"></div>
			<div class="col-xs-6 col-md-4">
				<table class="table table-bordered">
					<tr>
						<td>id</td>
						<td>username</td>
						<td>password</td>
						<td>age</td>
						<td>operation</td>
					</tr>
					<tbody id="list">
				</table>
				<div id="pagination" style="text-align: center;"></div>
			</div>
			<div class="col-xs-6 col-md-4"></div>
		</div>
	</div>
</body>
</html>