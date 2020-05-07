package OMA.web;

import OMA.repository.JpaProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OrderListServlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(OrderListServlet.class);
    private JpaProductRepository repository;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("products", repository.getAll());
        request.getRequestDispatcher("/orderlist.jsp").forward(request, response);
    }
}
