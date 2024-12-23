<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 23.
  Time: 오후 5:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>장바구니</h1>
    <%
        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies) {
            if (!cookie.getName().equals("JSESSIONID")) {
              out.println(cookie.getValue() + "<br>");
            }
        }
    %>
    <a href="cart.jsp">아이템 추가</a>
</body>
</html>
