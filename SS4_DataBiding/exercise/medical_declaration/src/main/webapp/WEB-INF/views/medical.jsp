<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/17/2022
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="medical">
    <table>
        <div>
            <h1>TỜ KHAI Y TẾ</h1>
        </div>
        <div>
            <h4>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT
                ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</h4>
        </div>
        <div>
            <h6>Khuyến cáo : Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</h6>
        </div>
        <label>Họ Tên (ghi chữ IN Hoa)<span style="color: red">(*)</span></label>
        <form:input path="name"></form:input>
        <tr>
            <td>
                <label>Năm Sinh</label>
                <form:select path="yearOfBirth" items="${yearOfBirth}"></form:select>
            </td>
            <td>
                <label>Giới Tính<label>
                        <form:select path="gender" items="${gender}"></form:select>
            </td>
            <td>
                <label>Quốc Tịch</label>
                <form:select path="nationality" items="${nationality}"></form:select>
            </td>
        </tr>
        <tr>
            <td>
                <label>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</label>
                <form:input path="id"></form:input>
            </td>
        </tr>
<%--        <tr>--%>
<%--            <lable>Thông tin đi lại</lable>--%>
<%--            <form:checkboxes path="destinationArrived" items="${information}"></form:checkboxes>--%>
<%--        </tr>--%>
    </table>
</form:form>

</body>
</html>
