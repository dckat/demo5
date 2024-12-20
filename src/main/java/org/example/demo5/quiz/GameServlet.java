package org.example.demo5.quiz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "game", value = "/game")
public class GameServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("GameServlet 초기화");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GameServlet doGet 처리됨.");

        String gameName = req.getParameter("gameName");
        String gameType = req.getParameter("gameType");
        System.out.println("Game Name: " + gameName);
        System.out.println("Game Type: " + gameType);

        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("<h1>GET request received in GameServlet</h1>");
        resp.getWriter().println("Game Name: " + gameName + "<br>");
        resp.getWriter().println("Game Type: " + gameType);
    }
}
