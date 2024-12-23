<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 23.
  Time: 오후 5:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String item = request.getParameter("item");
        System.out.println(item);
        Cookie cookie = new Cookie("cart" + item, item);
        cookie.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie);
        out.println("<p>아이템 \'" + item + "\'이 장바구니에 추가되었습니다.");
    %>
    <hr>
    <a href="viewCart.jsp">장바구니 보기</a>
</body>
</html>
