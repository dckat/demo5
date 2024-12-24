package org.example.demo5.mvc2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductController {
    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("상품 추가 컨트롤 요청");

        req.setAttribute("result", "상품 추가 성공함.");
        RequestDispatcher rd = req.getRequestDispatcher("product_result.jsp");
        rd.forward(req, resp);
    }

    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("상품 삭제 컨트롤 요청");

        req.setAttribute("result", "상품 삭제 성공함.");
        RequestDispatcher rd = req.getRequestDispatcher("product_result.jsp");
        rd.forward(req, resp);
    }
}
