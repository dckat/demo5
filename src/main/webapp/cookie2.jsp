<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 23.
  Time: 오전 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%-- 웹 프로그램 출력틀: html --%>
    <%-- 웹 프로그램의 출력용 ㅌ르로 j2ee 프로젝트에서는 jsp를 사용 --%>
    <%-- 템플릿(틀) 엔진: jsp ---- 타임리프 --%>
    <%
        // 스크립트릿 (짧게 쓰는 작은 프로그램)
        // jsp ---> servlet 전환
        // init() 초기화 --> service() [doGet. doPost 요청] --> destroy() 종료
        // service() 안으로 다 구현되어서 요청에 맞게 들어감.
        // 이 곳에서 만들어진 변수는 지역변수 (반드시 초기화 필요)
        // 1. 브라우저에 있는 쿠키 목록을 가지고 오기
        // 2. 배열에서 하나씩 꺼내어 조건에 맞는것만 쓰기 (key-value 쌍)
        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies) {
            // PrintWriter out = response.getWriter(); 내장객체
            if (!cookie.getName().equals("JSESSIONID")) {
                out.println(cookie.getName() + " " + cookie.getValue() + "<br>");
            }
        }
    %>
</body>
</html>
