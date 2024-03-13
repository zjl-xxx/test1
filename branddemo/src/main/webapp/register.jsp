<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2022/5/15
  Time: 15:52
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

<h1>欢迎注册</h1>
<div>${resgister1_msg}</div>
<form action="/BrandDemo_war/registerServlet" method="post" >
    用户名： <input type="text" name="username1" id="username2"><br>
    <br><span id="username_error" style="display: none">用户名已存在</span>
    密码：<input type="password"name="password"><br>
    <input type="submit">
</form>
<script>


    document.getElementById('username2').onblur =

    function ()
    {
        var value=this.value;
        var xhttp;
        if(window.XMLHttpRequest)
        {
          xhttp= new XMLHttpRequest();
        }
        else{
            xhttp=new ActiveXObject("Microsoft.XMLHTTP")
        }
        xhttp.open("GET","http://localhost:8080/BrandDemo_war/selectUsernameServlet?username="+value);
        xhttp.send();

        xhttp.onreadystatechange =function (){
            if(this.readyState == 4 && this.status== 200)
            {

                if(this.responseText == "true")
                {
                    document.getElementById("username_error").style.display="";
                }else
                {
                    document.getElementById("username_error").style.display="none";
                }
            }
        };




    }
</script>

</body>
</html>
