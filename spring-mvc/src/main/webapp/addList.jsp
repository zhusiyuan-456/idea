<%--
  Created by IntelliJ IDEA.
  User: absno
  Date: 8/4/2021
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/hello/listType" method="post">
    User1 ID: <input type="text" name="users[0].id"><br>
    User1 name<input type="text" name="users[0].name"><br>
    User2 ID: <input type="text" name="users[1].id"><br>
    User2 name<input type="text" name="users[1].name"><br>
    User3 ID: <input type="text" name="users[2].id"><br>
    User3 name<input type="text" name="users[3].name"><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
