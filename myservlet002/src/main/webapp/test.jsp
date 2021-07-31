<%--
  Created by IntelliJ IDEA.
  User: absno
  Date: 5/27/2021
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>page2</title>
</head>
<body>
<%
    String str=request.getParameter("id");
    //store data to the request
    request.setAttribute("id",str);
    request.getRequestDispatcher("test2.jsp").forward(request,response);
%>
<%=str%>
</body>
</html>
