<%--
  Created by IntelliJ IDEA.
  User: absno
  Date: 8/3/2021
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/hello/add" method="post">
    <table>
        <tr>
            <td>numID:</td>
            <td>
                <input type="text" name="id">
            </td>
        </tr>
        <tr>
            <td>name</td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td>code</td>
            <td>
                <input type="text" name="address.code">
            </td>
        </tr>
        <tr>
            <td>value</td>
            <td>
                <input type="text" name="address.value">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="submit">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
