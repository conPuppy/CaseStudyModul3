package com.example.casestudymodul3.controller;

import com.example.casestudymodul3.model.Account;
import com.example.casestudymodul3.service.RepassService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/setting")
public class Setting extends HttpServlet {
    RepassService repassService = new RepassService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("account", Login.account);
        RequestDispatcher dispatcher = req.getRequestDispatcher("bootstrap/feed/demo.foxthemes.net/instellohtml/setting.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String password = req.getParameter("password");
        String repass = req.getParameter("repass");
        repassService.updatepass(new Account(password));
        resp.sendRedirect("/bootstrap/feed/demo.foxthemes.net/instellohtml/noticelogout.jsp");
    }
}
