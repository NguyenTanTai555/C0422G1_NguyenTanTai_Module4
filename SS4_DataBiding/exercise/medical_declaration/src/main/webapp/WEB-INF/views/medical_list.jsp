<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/18/2022
  Time: 6:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h1>Danh Sách Tờ Khai Y Tế</h1>
</div>
<div>
    <a href="/add">Thêm mới tờ khai y tế</a>
</div>
<div>
    <table>
        <tr>
            <th>STT</th>
            <th>Họ Tên</th>
            <th>Năm Sinh</th>
            <th>Số CMND/Hộ chiếu</th>
            <th>Quốc tịch</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${list}" var="medical" varStatus="loop">
            <tr>
                <td>${loop.count}</td>
                <td>${medical.name}</td>
                <td>${medical.yearOfBirth}</td>
                <td>${medical.id}</td>
                <td>${medical.nationality}</td>
                <td>
                    <a href="/update/${medical.medicalId}">
                    <button>
                        Cập Nhật
                    </button>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
