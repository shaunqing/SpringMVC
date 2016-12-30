<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ include file="../common/meta.jsp"%>
<!-- 用绝对路径后，在使用ajax时就要写Controller层的路径 -->
<base href="<%=basePath%>" />
<script type="text/javascript" src="${basePath}js/webPage/user/showUser.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-6">
				<form class="form-horizontal" id="updateForm">
				<input type="hidden"  name="id"
								id="id" value="${user.id}">
					<div class="form-group">
						<label class="col-sm-2 control-label">username</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="username"
								id="username" value="${user.username}">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">password</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="password"
								id="password" value="${user.password}">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">age</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" name="age" id="age"
								value="${user.age}">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="button" class="btn btn-default" id="updateBtn">更新</button>
						</div>
					</div>
				</form>
			</div>
			<div class="col-md-6"></div>
		</div>
	</div>


</body>
</html>
