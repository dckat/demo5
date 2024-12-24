<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 23.
  Time: 오전 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%-- 쿠키: 서버에서 클라이언트로 보내는 문자 정보 --%>
    <%-- response 객체를 활용함. 자바의 객체를 활용하므로 java 필요 --%>
    <%
      // java 들어가는 부분. 스크립트릿
      // 1. 쿠키 객체 만들기 (key-value 쌍)
      Cookie cookie = new Cookie("name", "hong");
      // 2. 쿠키의 유효기간 + 도메인별 설정
      cookie.setMaxAge(0);
      // cookie.setMaxage(0); --> 전송시 쿠키 삭제
      // 3. 쿠키를 브라우저에 전송
      // HttpServletResponse response = new HttpServletResponse() {} ;
      // 하나의 요청 당 request, response 객체가 tomcat 내부의 서블릿 엔진에 의해 생성
      response.addCookie(cookie);
    %>
</body>
</html>
