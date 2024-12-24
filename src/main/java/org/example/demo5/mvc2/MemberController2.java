package org.example.demo5.mvc2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberController2 {

    // 클라이언트 요청 하나당 컨트롤러 함수 하나
    // 회원가입 기능
    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("회원가입 컨트롤 요청");

        // view 파일을 따로 만들고 불러서 응답
        // view 파일 설정
        // jsp를 서버가 부를 때 forward 활용
        // forward 할 때 req, res 객체 전달
        // jsp는 서블릿으로 변환되는데 service(req, res) 안으로 jsp java 코드가 다 삽입
        // forward로 jsp를 호출할때 service(req, res) 호출 --> req, res가 입력값으로 필요
        // forward 시 req, res를 전달함
        // jsp로 컨트롤러에서 결과를 전달할 값은 request의 속성으로 설정함.
        // forward로 전달할 때 이 속성도 함께 전달됨.
        req.setAttribute("result", "회원 가입 성공함.");
        RequestDispatcher rd = req.getRequestDispatcher("member_result.jsp");

        // view 설정한 파일을 불러주는 부분
        // 컨트롤러에서 처리한 결과를 jsp에 넣어서 응답할때 --> forward
        // 회원가입 후 결과를 "회원가입 성공했습니다(jsp)" 보내고 싶을때
        rd.forward(req, resp);      // 서버의 컨트롤러가 부름

        // 컨트롤러에서 처리한 결과를 보낼 필요 없이 새로운 요청을 할때 --> redirect
        // 회원가입 성공적으로 처리 --> 다음 작업은 로그인화면 요청
        // <--> res.redirect("/");  // 서버가 클라이언트에게 호출하도록 명령
    }

    // 회원탈퇴 기능
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("회원탈퇴 컨트롤 요청");

        req.setAttribute("result", "회원 탈퇴 성공함.");
        RequestDispatcher rd = req.getRequestDispatcher("member_result.jsp");
        rd.forward(req, resp);
    }
}
