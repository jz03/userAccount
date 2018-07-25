<%--
  Created by IntelliJ IDEA.
  User: 冀州
  Date: 2018/7/25
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>sendEmail</title>
</head>
<body>
    <form action="../SendEmail" method="post">
        <div>
            <label>目的地址:</label>
            <input type="text" name="toAddress">
        </div>
        <div>
            <label>主题:</label>
            <input type="text" name="subject">
        </div>
        <div>
            <label>邮件内容</label><br>
            <textarea name="content" cols="30" rows="10"></textarea>
        </div>
        <input type="submit" value="发送">
    </form>
</body>
</html>
