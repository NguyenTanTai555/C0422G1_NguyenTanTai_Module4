<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/16/2022
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/operator" method="post">
    <input type="text" name="num1" value="${num1}">
    <input type="text" name="num2" value="${num2}">
    <button type="submit" value="+" name="operator">Addition(+)</button>
    <button type="submit" value="-" name="operator">Subtraction(-)</button>
    <button type="submit" value="x" name="operator">Multiplication(*)</button>
    <button type="submit" value="/" name="operator">Division(/)</button>
</form>
    <h4>Result Operator: ${result}</h4>
    <h4 style="color: red">${error}</h4>

</body>
</html>
