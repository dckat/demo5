package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


// value: url
// name: tomcat에 등록되는 서블릿 이름
@WebServlet(name = "second", value = "/second")
public class LoginServlet2 extends HttpServlet {

    //http의 method를 추출해서 get요청이 들어오면 doGet()호출
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet------------");

        // get 방식은  tomcat의 web.xml 설정에 따라 결정됨
        // web.xml에 utf-8로 설정함

        String id = req.getParameter("id");
        String pw = req.getParameter("pw");
        System.out.println(id + " " + pw);

        // 응답을 보낼 때는 body로 보내기 때문에
        // body마다 인코딩을 설정해주어야 함
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(id + " " + pw);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost--------------------");

        // post 방식은 http의 body에 데이터가 전달
        // 받을 때마다 한글로 인코딩
        // 파라미터 값을 추출 전에 한글 인코딩 설정
        // 받기전에 앞에 인코딩 처리 등을 하는 프로그램 (필터)
        // --> 한글 필터
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        String password = req.getParameter("password");

        // 응답
        System.out.println(id + " " + password);

        // 응답을 보낼때는 body로 보냄
        // body마다 인코등을 설정
        resp.setContentType("text/html;charset=UTF-8");

        // PrintWriter: 문자열들을 http의 body로 넣어서 전송하는 역할
        PrintWriter out = resp.getWriter();
        out.println("<html><body bgColor='yellow'>");
        out.println(id + " " + password);
        out.println("</body></html>");
        out.close();
    }
}
