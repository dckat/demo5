<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 20.
  Time: 오후 2:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="second?id=나는한글이란다아이디가&pw=1234">get 요청</a>
    <%-- action은 서버에서 받을 주소 --%>
    <%-- method는 생략하면 get방식으로 설정 --%>
    <%-- 서버에서는 action에서 적은 주소와 method의 방법에 따라 처리할 수 있는 함수 호출 --%>
    <form action="second" method="post">
        id 입력: <input name="id" value="나는한글이란다아이디가"><br>
        pw 입력: <input name="password" value="1234"><br>
        <button type="submit">post요청</button>
    </form>
</body>
</html>
