package org.example.demo5.mvc2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


// 모든 요청을 다 받을 때
@WebServlet("/")    // localhost:8080/member_insert (http header)
public class DispatcherServlet extends HttpServlet {
    MemberController2 memberController = new MemberController2();
    BoardController2 boardController = new BoardController2();
    ProductController productController = new ProductController();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 모든 요청을 이 메소드가 받음
        // 주소를 추출해서 해당 컨트롤러의 메소드 호출
        String uri = req.getRequestURI();       // member_insert
        System.out.println("uri>>>> " + uri);

        if (uri.equals("/mvc/member_insert")) {
            memberController.insert(req, resp);
        } else if (uri.equals("/mvc/board_insert")) {
            boardController.insert(req, resp);
        } else if (uri.equals("/mvc/member_delete")) {
            memberController.delete(req, resp);
        } else if (uri.equals("/mvc/board_delete")) {
            boardController.delete(req, resp);
        } else if (uri.equals("/mvc/product_insert")) {
            productController.insert(req, resp);
        } else if (uri.equals("/mvc/product_delete")) {
            productController.delete(req, resp);
        }
    }
}
