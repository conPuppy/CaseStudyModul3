package com.example.casestudymodul3.controller;

import com.example.casestudymodul3.service.PostService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/adminpost")
public class AdminPostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.setAttribute("account", session.getAttribute("account"));
        request.setAttribute("posts", PostService.getAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/feedadmin.jsp");
        dispatcher.forward(request, response);
    }
}
