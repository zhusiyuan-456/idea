<%--
  Created by IntelliJ IDEA.
  User: absno
  Date: 5/27/2021
  Time: 10:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="/login"method="post">
userName:<input type="text" name="username"><br/>
password:<input type="password" name="password">

</form>
<%
    Cookie cookie=new Cookie("name","bob");
    response.addCookie(cookie);

%>
</body>
</html>
