package org.example.demo5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// @WebServlet(name = "numberController", value = "/number")
public class NumberServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet--------------------");

        try {
            int num1 = Integer.parseInt(req.getParameter("number1"));
            int num2 = Integer.parseInt(req.getParameter("number2"));

            int result = num1 + num2;

            resp.getWriter().println("Sum of numbers is " + result);
        }
        catch (NumberFormatException e) {
            resp.getWriter().println(e.getMessage());
        }

    }
}
