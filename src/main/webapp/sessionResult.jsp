<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 23.
  Time: 오후 2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        if (session.getAttribute("check") != null) {
            out.println("현재 체크 상태는 ok입니다.");
        } else {
    %>
    check<input type="checkbox" name="check">
    <%
        }
    %>

</body>
</html>
