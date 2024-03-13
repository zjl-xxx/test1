<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/5/15
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login In</h1>
<div>${error_msg}${resgister_msg}${loginfilter_msg}</div>
<form action="/BrandDemo_war/loginServlet" method="post" >
  用户名： <input type="text" name="username" value="${cookie.username.value}"><br>
  密码：<input type="password"name="password" value="${cookie.password.value}"><br>
    下次自动登录？<input type="checkbox" name="remmber" value="1">

  <input type="submit"><br>
  <a href="/BrandDemo_war/register.jsp" >注册</a>

</form>
</body>
</html>
