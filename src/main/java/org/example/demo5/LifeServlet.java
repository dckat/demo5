package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "life", value = "/life")
public class LifeServlet extends HttpServlet {

    // 생성자를 하나도 안쓰면 기본 생성자가 만들어짐
    // 서블릿은 최초 호출시에 객체가 생성되어 메모리에 준비 (loading)
    // lazy loading
    public LifeServlet() {
        System.out.println("Life Servlet 객체 생성");
    }

    @Override
    public void destroy() {
        System.out.println("서블릿 소멸됨...");
        // db 연결 객체 등의 자원 해제
        // 서블릿 종료 시에 언제. 무슨 이유로... 등록
    }

    @Override
    public void init() throws ServletException {
        System.out.println("서블릿 초기화...");
        System.out.println("ex) db 연결...");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청 들어왔을 때...");
        System.out.println("service()에서 method 판단 --> doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST 요청 들어왔을 때...");
        System.out.println("service()에서 method 판단 --> doPost");
    }

}
