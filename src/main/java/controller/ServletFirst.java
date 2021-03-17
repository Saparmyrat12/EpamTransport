package controller;

import model.entities.Stop;
import model.services.service.StopService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/index.html")
public class ServletFirst extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("heloo");
        StopService stopService = new StopService();
        List<Stop> users = stopService.getAll();
        for (Stop user : users) {
            System.out.println(user);
        }
        System.out.println("OK findAll()");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
