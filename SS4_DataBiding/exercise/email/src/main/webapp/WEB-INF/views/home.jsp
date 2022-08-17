<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form action="/update" method="post" modelAttribute="emailBox">
    <fieldset style="width: 500px ; text-align: center">
        <legend>Setting</legend>
        <table>
            <tr>
                <td><label>Languages</label></td>
                <td><form:select path="language" items="${languages}"></form:select></td>
            </tr>
            <tr>
                <td><label>Page size :</label></td>
                <td><label>Show</label></td>
                <td><form:select path="pageSize" items="${pageSize}"></form:select> emails per page</td>

            </tr>
            <tr>
                <td><label>Spams filter: </label></td>
                <td><form:checkbox path="spamsFilter"></form:checkbox> Enable spams filter</td>

            </tr>
            <tr>
                <td><label>Signature: </label></td>
                <td><form:textarea path="signature"></form:textarea></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"></td>
                <td><form:button name="cancel">Cancel</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
