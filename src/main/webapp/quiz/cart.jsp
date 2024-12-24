<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 23.
  Time: 오후 5:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>추가할 아이템을 입력하세요.</h1>
    단, 동일한 물건을 장바구니에 넣을 수 없음.<br>
    (영문입력 가능, 띄어쓰기 없음) <br>
    <a href="../viewCart.jsp">장바구니 보기</a>
    <form action="../addCart.jsp" method="post">
        <input type="text" name="item">
        <button type="submit">장바구니 추가</button>
    </form>
</body>
</html>
