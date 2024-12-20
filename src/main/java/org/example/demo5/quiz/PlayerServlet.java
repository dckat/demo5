package org.example.demo5.quiz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "player", value = "/player")
public class PlayerServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("PlayerServlet 초기화");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("PlayerServlet doPost 처리됨.");

        req.setCharacterEncoding("UTF-8");
        String playerName = req.getParameter("playerName");
        String playerScore = req.getParameter("playerScore");

        System.out.println("Player Name: " + playerName);
        System.out.println("Player Score: " + playerScore);

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>POST request received in PlayerServlet</h1>");
        out.println("Player Name: " + playerName + "<br>");
        out.println("Player Score: " + playerScore);
        out.println("</body></html>");
        out.close();
    }
}
