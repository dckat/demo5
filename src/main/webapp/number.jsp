<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 20.
  Time: 오전 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <form action="number" method="get">
    숫자 1: <input name="number1" value="100"><br>
    숫자 2: <input name="number2" value="200"><br>

    <%-- form 내의 button type은 생략하면 default로 submit! --%>
    <button>서버로 전송</button>
  </form>
  </body>
</html>
