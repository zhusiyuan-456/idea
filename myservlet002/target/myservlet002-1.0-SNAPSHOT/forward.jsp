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
    <title>forward</title>
</head>
<body>
<%
    request.setAttribute("name","tom");
    response.sendRedirect("target.jsp");
%>
</body>
</html>
