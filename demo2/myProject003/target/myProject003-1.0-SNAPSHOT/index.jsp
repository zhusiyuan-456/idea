<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>演员信息管理系统</h1>
<table>
    <tr>
        <th>Id</th>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Date</th>
    </tr>
    <c:forEach items="${list}" var="actor"><tr>
        <td>${actor.actor_id}</td>
        <td>${actor.first_name}</td>
        <td>${actor.last_name}</td>
        <td>${actor.last_update}</td>
    </tr></c:forEach>
</table>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>