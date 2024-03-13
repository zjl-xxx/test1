<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/5/13
  Time: 21:28
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
<form action="/BrandDemo_war/updateServlet" method="post">

    品牌名称：<input name="brand_name" value="${brand.brand_name}"> <br>
    企业名称：<input name="company_name" value="${brand.company_name}"><br>
    排序：<input name="ordered" value="${brand.ordered}"><br>
    描述信息：<textarea rows="5" cols="20" name="description" >${brand.description}</textarea><br>
    状态：<input name="status" value="${brand.status}"><br>

    <input type="hidden" name="id" value="${brand.id}">
    <input type="submit" value="提交">

</form>

</body>
</html>
