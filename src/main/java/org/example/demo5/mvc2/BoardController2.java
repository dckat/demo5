package org.example.demo5.mvc2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BoardController2 {

    // 게시판 글 쓰기
    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("게시판 글 쓰기 컨트롤 요청");

        req.setAttribute("result", "게시판 글 쓰기 성공함.");
        RequestDispatcher rd = req.getRequestDispatcher("board_result.jsp");
        rd.forward(req, resp);
    }

    // 게시판 글 삭제
    public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("게시판 글 삭제 컨트롤 요청");

        req.setAttribute("result", "게시판 글 삭제 성공함.");
        RequestDispatcher rd = req.getRequestDispatcher("board_result.jsp");
        rd.forward(req, resp);
    }
}
