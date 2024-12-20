package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "member", value = "/member")
public class MemberController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get request ----------");

        // 1. 클라이언트가 전송한 데이터 받기 (req)
        // 서버가 전달받은 데이터의 type 무조건 String
        String id = req.getParameter("id");     // id=root
        String pw = req.getParameter("password");     // pw=1234
        String name = req.getParameter("name"); // name=kim
        String tel = req.getParameter("tel");   // tel=011
        System.out.println(id + " " + pw + " " + name + " " + tel);
        // 2. 서버가 데이터를 클라이언트에게 확인하도록 전송 (resp)
        resp.getWriter().println(id + " " + pw + " " + name + " " + tel);
    }
}
