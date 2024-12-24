package org.example.demo5.quiz2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/quiz/cartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<Item> items = (List<Item>) session.getAttribute("items");

        if (items == null) {
            items = new ArrayList<>();
        }

        String itemName = req.getParameter("itemName");
        double itemPrice = Double.parseDouble(req.getParameter("itemPrice"));

        Item item = new Item(itemName, itemPrice);
        items.add(item);

        session.setAttribute("items", items);

        resp.sendRedirect("product.jsp");
    }
}
