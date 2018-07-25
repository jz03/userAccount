<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%--<base href="<%=basePath%>">--%>
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <h1>项目案例</h1>
    <hr>
    <ul>
        <li><a href="goods/goods.jsp">商品购物车</a></li>
        <li><a href="file/upload.jsp">上传文件</a></li>
        <li><a href="TomcatTest/Refresh">页面自动刷新</a></li>
        <li><a href="Email/sendEmail.jsp">发送邮件</a></li>
    </ul>
  </body>
</html>
