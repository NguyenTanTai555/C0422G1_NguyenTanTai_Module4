<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/16/2022
  Time: 2:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Choose Topping</title>
</head>
<body>
<form action="/save" method="post">
    <h1>Sandwich Spices</h1>
    <c:forEach var="spiceSandwich" items="${list}">
        <input type="checkbox" name="spice" value="${spiceSandwich}">
        <span>${spiceSandwich}</span>
    </c:forEach>
    <input type="submit" value="Submit">
</form>
<c:if test="${spice!=null}">
    <c:forEach items="${spice}" var="spice">
        <p>${spice}</p>
    </c:forEach>
</c:if>
<c:if test="${message!=null}">
    <h3 style="color:deeppink">${message}</h3>
</c:if>
</body>
</html>
