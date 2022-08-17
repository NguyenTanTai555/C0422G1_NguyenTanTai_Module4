<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/17/2022
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table style="border: 1px chartreuse;width: 400px;text-align: center" >
        <h2>Language : ${emailBox.language}</h2>
        <h2>page size: ${emailBox.pageSize}</h2>
        <h2>spams filter: ${emailBox.spamsFilter}</h2>
        <h2>signature: ${emailBox.signature}</h2>
    </table>
</body>
</html>
