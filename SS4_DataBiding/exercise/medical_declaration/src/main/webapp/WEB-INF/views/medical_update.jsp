<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/18/2022
  Time: 6:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3 style="text-align: center">TỜ KHAI Y TẾ</h3>
<h5 style="text-align: center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN
    THIẾT
    ĐỂ PHÒNG CHÓNG DỊCH BỆNH TRUYỀN NHIỄM
</h5>
<p style="text-align: center;color: red">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam
    và có thể xử lý hình sự
</p>

<form:form action="/save" method="post" modelAttribute="medical">
    <div>Họ tên (ghi chữ IN HOA) <span>(*)</span></div>
    <div>
        <form:input path="name"/>
    </div>
    <div>
        <table>
            <tr>
                <th>Năm sinh<span>(*)</span></th>
                <th>Giới tính<span>(*)</span></th>
                <th>Quốc tịch<span>(*)</span></th>
            </tr>
            <tr>
                <td>
                    <form:select path="yearOfBirth" items="${years}"/>
                </td>
                <td>
                    <form:select path="gender" items="${genders}"/>
                </td>
                <td>
                    <form:select path="nationality" items="${nationalities}"/>
                </td>
            </tr>
        </table>
    </div>
    <div>
        Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác <span>(*)</span>
    </div>
    <div>
        <form:input path="id"/>
    </div>
    <div>
        Thông tin đi lại <span>(*)</span>
    </div>
    <div>
        <form:radiobuttons path="information" items="${transports}"/>
    </div>
    <div>
        <table>
            <tr>
                <th>Số hiệu phương tiện</th>
                <th>Số ghế</th>
            </tr>
            <tr>
                <td>
                    <form:input path="vehicleId"/>
                </td>
                <td>
                    <form:input path="seats"/>
                </td>
            </tr>
        </table>
    </div>
    <div>
        <table>
            <tr>
                <th colspan="3">Ngày khởi hành <span>(*)</span></th>
                <th colspan="3">Ngày kết thúc <span>(*)</span></th>
            </tr>
            <tr>
                <td>
                    <form:select path="startDay" items="${days}"/>
                </td>
                <td>
                    <form:select path="startMonth" items="${months}"/>
                </td>
                <td>
                    <form:select path="startYear" items="${years}"/>
                </td>
                <td>
                    <form:select path="endDay" items="${days}"/>
                </td>
                <td>
                    <form:select path="endMonth" items="${months}"/>
                </td>
                <td>
                    <form:select path="endYear" items="${years}"/>
                </td>
            </tr>
        </table>
    </div>
    <div>
        Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/thành phố nào? <span>(*)</span>
    </div>
    <div>
        <form:textarea path="destinationArrived"/>
    </div>
    <div>
        <button type="submit">Cập Nhật tờ khai</button>
    </div>

</form:form>
</body>
</html>
