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
<form action="/convert">
    <div>
        <h2>Currency Convert</h2>
    </div>
    <div>
        <label>USD :</label>
        <input type="text" name="usd" value="${usd}">
        <button type="submit">convert</button>
    </div>
    <div>
        <label>VND : </label>
        <input type="number" value="${vnd}">
    </div>
</form>

</body>
</html>
