<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/5/13
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
</head>
<body>
<input type="button" value="新增" id="add"><br>
<hr>
<h1>${username},欢迎你</h1>
<table border="1" cellspacing="0" width="800">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
<c:forEach items="${brands}" var="brand" >
<tr>
    <th>${brand.id}</th>
    <th>${brand.brand_name}</th>
    <th>${brand.company_name}</th>
    <th>${brand.ordered}</th>
    <th>${brand.description}</th>
    <c:if test="${brand.status==1}">
        <th>启用</th>
    </c:if>
    <c:if test="${brand.status==0}">
        <th>禁用</th>
    </c:if>
    <th>
        <a href="/BrandDemo_war/selectByidServlet?id=${brand.id}">修改</a>
        <a href="/BrandDemo_war//deleteServlet?id=${brand.id}">删除</a>
    </th>
</tr>
</c:forEach>

</table>
<script>
    document.getElementById("add").onclick=function (){
        location.href="/BrandDemo_war/addBrand.jsp";
    }
</script>
</body>
</html>
