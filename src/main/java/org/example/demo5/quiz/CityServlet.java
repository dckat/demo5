package org.example.demo5.quiz;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CityServlet extends HttpServlet {

    public CityServlet() {
        System.out.println("http://localhost:8080");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("서블릿 초기화");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청 처리됨.");
        resp.getWriter().println("servlet run");
    }
}
