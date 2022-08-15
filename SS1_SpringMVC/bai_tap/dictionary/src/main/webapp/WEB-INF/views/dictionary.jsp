<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/search" method="post">
    <div align="center">

        <h1> Vietnamese Dictionary</h1>

        <label>ENG :</label>
            <input type="text" name="eng" value="${eng}">

        <label>VIE :</label>
            <input type="text" name="vie" value="${vie}">

            <input type="submit" value="search">

    </div>
</form>
</body>
</html>
