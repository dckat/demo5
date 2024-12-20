package org.example.demo5.quiz;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CityServlet2 extends HttpServlet {

    public CityServlet2() {
        System.out.println("http://localhost:8080");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("CityServlet2 initialized");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet method called");

        String cityName = req.getParameter("cityName");
        String cityPopulation = req.getParameter("cityPopulation");
        System.out.println("City Name: " + cityName);
        System.out.println("City Population: " + cityPopulation);

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<h1>GET request received</h1>");
        resp.getWriter().println("City Name: " + cityName + "<br>");
        resp.getWriter().println("City Population: " + cityPopulation);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost method called");

        req.setCharacterEncoding("UTF-8");
        String cityName = req.getParameter("cityName");
        String cityPopulation = req.getParameter("cityPopulation");

        System.out.println("City Name: " + cityName);
        System.out.println("City Population: " + cityPopulation);

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>POST request received</h1>");
        out.println("City Name: " + cityName + "<br>");
        out.println("City Population: " + cityPopulation);
        out.println("</body></html>");
        out.close();
    }
}
