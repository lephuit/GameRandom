<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Game đoán số</title>
</head>
<body>
<div style="text-align: center;font-size:30px">
    <h3>
        Game đoán số
    </h3>
    <p>Khi truy cập vào game, một số ngẫu nhiên trong khoản [1 - 1000] sẽ được sinh ra.</br>
        Người dùng có nhiệm vụ đoán chính xác con số ngẫu nhiên này.</br>
        Mỗi lượt đoán nếu đoán sai, người dùng sẽ được gợi ý:</br>
        • Số vừa đoán nhỏ hơn đáp án!</br>
        • Số vừa đoán lớn hơn đáp án!</br>
        Thành tích người dùng sẽ được sắp xếp dựa trên số lần đoán.</br>
        Ai có số lần đoán ít nhất đến khi đoán đúng số sẽ xếp hạng nhất</p>
    <h3>${messenger}</h3>

    <form action="http://localhost:8080/index" method="post">
        <input name="name" style="font-size: 30px" type="text" placeholder="Nhập tên người chơi"/>
        <button style="font-size: 30px">Xem kết quả</button>
    </form>
</div>
</body>
</html>
