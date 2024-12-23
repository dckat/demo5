package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout.do")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 유지된 세션을 끊고. 세션으로 설정한 값 모두 지우기
        // 세션 객체 먼저 획득 후 세션 끊기
        HttpSession session = req.getSession();
        session.invalidate();                       // 세션 끊기
        // session.removeAttribute("loginId");      // 특정 세션 하나만 지우기

        // 화면을 loginSession.jsp로 넘기기
        // 클라이언트에게 loginSession.jsp를 호출하라고 명령해서 넘기기
        // 컨트롤러에서 어떤 처리결과값을 jsp로 보내고자 하는 경우에는 사용하지 않음
        resp.sendRedirect("loginSession.jsp");      // 새로운 request/response 객체 생성
    }
}
