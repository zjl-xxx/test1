<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/5/13
  Time: 19:49
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
<form action="/BrandDemo_war/addServlet"method="post">

    品牌名称：<input name="brand_name"><br>
    企业名称：<input name="company_name"><br>
    排序：<input name="orderd"><br>
    描述信息：<textarea rows="5" cols="20" name="description"></textarea><br>
   状态：
    <input type="radio" name="status" value="0">禁用
    <input type="radio" name="status" value="1">启用<br>

    <input type="submit" value="提交">

</form>
</body>
</html>
