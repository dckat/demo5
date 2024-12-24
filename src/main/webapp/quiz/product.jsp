<%@ page import="org.example.demo5.quiz2.Item" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 23.
  Time: 오후 5:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>상품 목록</h1>

    <form action="cartServlet" method="post">
        <input type="hidden" name="itemName" value="product1">
        <input type="hidden" name="itemPrice" value="10000">
        <button type="submit">상품1 추가 (₩10,000)</button>
    </form>

    <form action="cartServlet" method="post">
        <input type="hidden" name="itemName" value="product2">
        <input type="hidden" name="itemPrice" value="20000">
        <button type="submit">상품2 추가 (₩20,000)</button>
    </form>
    <hr>
    <h3>장바구니</h3>
    <ul>
    <%

        if (session.getAttribute("items") == null) {
            out.println("<li>장바구니가 비어있습니다.</li>");
        }
        else {
            List<Item> items = (List<Item>) session.getAttribute("items");

            for (Item item : items) {
                out.println("<li>" + item.getName() + " - " + item.getPrice() + "</li>");
            }
        }
    %>
    </ul>
</body>
</html>
