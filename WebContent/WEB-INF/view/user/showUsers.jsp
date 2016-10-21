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
	123123
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
				 <div class="view" style="margin: 10px auto;"></div>
    <div class="page"></div>
<script type="text/javascript">
laypage({
    cont: $('.page'), //容器。值支持id名、原生dom对象，jquery对象,
    pages: 100, //总页数
    skip: false, //是否开启跳页
    skin: 'molv',
    groups: 3, //连续显示分页数
    first: '首页', //若不显示，设置false即可
    last: '尾页', //若不显示，设置false即可
    prev: '<', //若不显示，设置false即可
    next: '>', //若不显示，设置false即可
    hash: true, //开启hash
    jump: function(obj){ //触发分页后的回调
        $('.view').html('目前正在第'+ obj.curr +'页，一共有：'+ obj.pages +'页');
    }
});
</script>
			</div>
			<div class="col-xs-6 col-md-4"></div>

		</div>
	</div>

</body>
</html>