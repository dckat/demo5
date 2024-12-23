<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 23.
  Time: 오후 3:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="utf8.do" method="post">
        name: <input type="text" name="name" value="홍길동">

        <%-- form 내의 button type은 default로 submit --%>
        <button>한글 처리 요청</button>
    </form>
</body>
</html>
