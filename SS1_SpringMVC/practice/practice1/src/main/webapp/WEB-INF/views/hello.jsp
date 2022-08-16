<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/12/2022
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/hello">
        <tr>
            <label>USD :</label>
            <input type="text" name="usd" value="${usd}">
            <button type="submit">convert</button>
        </tr>
        <tr>
            <td>VND : ${vnd}</td>
        </tr>
    </form>
</body>
</html>
