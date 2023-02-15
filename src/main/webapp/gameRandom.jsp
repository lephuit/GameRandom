
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %> <%--Experssion language--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Game đoán số</title>
</head>
<body>
    <form action="http://localhost:8080/gameRandom" method="post">
<%--    <% Player player = (Player) request.getAttribute("player");%>--%>
    <h4>Số ngẫu nhiên của máy là:    ${soRandom}</h4>
            <H3>${messenger}</H3>
        <h3>Xin chào: ${name}</h3>
        <input name="inputNumber" style="font-size: 30px" type="text" placeholder="Nhập số từ 1-1000"/>
        <h4>Số lần dự đoán : ${count} </h4>
        <button style="font-size: 30px">Xem kết quả</button>
    </form>
</body>
</html>
