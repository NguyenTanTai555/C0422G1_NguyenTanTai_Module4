<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/17/2022
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        span {
            color: blue;
        }
    </style>
</head>
<body>
<fieldset>
    <legend style="color: red">Medical Declaration</legend>
    <table>        <tr>
            <td>
                <label>Họ và Tên : </label>
                <span>
                    ${medical.name}
                </span>
            </td>
        </tr>
        <tr>
            <td>
                <label>Năm Sinh : </label>
                <span>
                    ${medical.yearOfBirth}
                </span>
            </td>
        </tr>
        <tr>
            <td>
                <label>Giới Tính : </label>
                <span>
                    ${medical.gender}
                </span>
            </td>
        </tr>
        <tr>
            <td>
                <label> Quốc Tịch</label>
                <span>
                    ${medical.nationality}
                </span>
            </td>
        </tr>
        <tr>
            <td>
                <label>Số CMND/Hộ chiếu</label>
                <span>
                    ${medical.id}
                </span>
            </td>
        </tr>
        <tr>
            <td>
                <label>Thông tin đi lại</label>
                <span>
                    ${medical.information}
                </span>
            </td>
        </tr>
        <tr>
            <td>
                <label>Số hiệu phương tiện</label>
                <span>
                    ${medical.vehicleId}
                </span>
            </td>
            <td>
                <label>Số ghế</label>
                <span>
                    ${medical.seats}
                </span>
            </td>
        </tr>
        <tr>
            <td>
                <label>Ngày khởi hành</label>
                <span>
                ${medical.startDay}/
                ${medical.startMonth}/
                ${medical.startYear}
                </span>
            </td>
            <td>
                <label>Ngày kết thúc</label>
                <span>
                ${medical.endDay}/
                ${medical.endMonth}/
                ${medical.endYear}
                </span>
            </td>
        </tr>
        <tr>
            <td>
                <label>Địa điểm đã đi lại trong 14 ngày qua</label>
                <span>
                    ${medical.destinationArrived}
                </span>
            </td>
        </tr>
    </table>
</fieldset>
</body>
</html>
