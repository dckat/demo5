<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 23.
  Time: 오후 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
      // 세션을 가지고 오기
      // 로그인 성공이면 loginId를 세션에 저장
      // 로그인 했을 때 화면과 로그인 하지 않았을때 화면이 다름
      // 세션에 저장도니 loginId가 있는지 없는지를 확인
      String loginId = (String) session.getAttribute("loginId");    // Object 저장 되므로 String 변환

      // 가지고 온 세션을 출력
      if (loginId == null) {    // 로그인 실패
          out.println("로그인 되어 있지 않음.");
      } else {    // 로그인 성공
          out.println("로그인 되어 있음. 아이디는 " + loginId);
          out.println("<a href='logout.do'>로그아웃</a>");
      }
    %>
</body>
</html>
