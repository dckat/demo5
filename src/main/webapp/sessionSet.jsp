<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 23.
  Time: 오후 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        // 로그인 되었다 치고 세션에 저장 (RAM 저장)
        // 값을 저장 (id. username. vo 등)
        // session의 값은 모든 타입이 가능. 자동으로 Object로 형변환
        String id = request.getParameter("id");     // input name = id
        String pw = request.getParameter("pw");
        if (id.equals("root") && pw.equals("1234")) {
            out.println("로그인 성공했습니다.!!");
            session.setAttribute("loginId", id);    // loginId = root
        }
    %>
    <a href="sessionGet.jsp">로그인 성공후 페이지로</a>
</body>
</html>
