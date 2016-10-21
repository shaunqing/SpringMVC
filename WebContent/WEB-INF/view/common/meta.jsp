<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
	request.setAttribute("basePath", basePath);
%>

<%--meta info--%>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<meta http-equiv="Cache-Control" content="no-store"/>
<meta http-equiv="Pragma" content="no-cache"/>
<meta http-equiv="Expires" content="0"/>
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<%--public css--%>
<link rel="stylesheet" type="text/css" href="${basePath}library/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${basePath}library/layer/skin/layer.css">

<%--public js--%>
<script type="text/javascript" src="${basePath}library/jquery/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="${basePath}library/bootstrap/js/bootstrap.min.js" ></script>
<script type="text/javascript" src="${basePath}library/layer/layer.js" ></script>
<script type="text/javascript" src="${basePath}library/laypage/laypage.js" ></script>
<script type="text/javascript" src="${basePath}library/utils/serializeUtil.js" ></script>
