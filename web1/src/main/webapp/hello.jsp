<%--
  Created by IntelliJ IDEA.
  User: absno
  Date: 5/27/2021
  Time: 8:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<%
    String str=session.getId();
    session.setMaxInactiveInterval(5);
    ServletContext a=session.getServletContext();
%>
<%=str%>
</body>
</html>
