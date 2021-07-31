<%--
  Created by IntelliJ IDEA.
  User: absno
  Date: 5/27/2021
  Time: 7:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>target</title>
</head>
<body>
<%
    String name =(String) request.getAttribute("name");
%>
<%=name%>
</body>
</html>
