
<%@ page import="model.Player" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--Experssion language--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Xếp hạng</title>
</head>
<body>
<h3>Xếp hạng</h3>
<table >
    <h3> </h3>
    <h3>${messenger}</h3>
    <h3>Chúc mừng ${name} với số lần dự đoán là : ${count}</h3>

    Bảng xếp hạng thành tích
    <tr>
        <td>Name</td>
        <td>         Count</td>
    </tr>

    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.getName()}</td>
            <td> ${item.getCount()}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>