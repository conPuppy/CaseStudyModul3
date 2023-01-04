package com.example.casestudymodul3.controller;

import com.example.casestudymodul3.model.Account;
import com.example.casestudymodul3.service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {
    LoginService loginService = new LoginService();
    public static Account account;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mess = req.getParameter("mess");
        if (mess != null) {
            switch (mess) {
                case "error1":
                    mess = "Incorrect password";
                    req.setAttribute("mess", mess);
                    break;
                case "error2":
                    mess = "Account does not exist";
                    req.setAttribute("mess", mess);
                    break;
                case "error3":
                    mess = "Your account bloked";
                    req.setAttribute("mess", mess);
                    break;
            }
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("bootstrap/feed/demo.foxthemes.net/instellohtml/form-login.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Account account1 = loginService.checklogin(username);

        if (account1 != null) {
            if (account1.getIdstatus() == 2) {
                resp.sendRedirect("/login?mess=error3");
            } else if (password.equals(loginService.checkpass(username))) {
                if (!username.equals("adminn")) {
                    HttpSession session = req.getSession();
                    session.setAttribute("account", account1);
                    resp.sendRedirect("/post");
                    account = account1;
                } else {
                    HttpSession session = req.getSession();
                    session.setAttribute("account", account1);
                    resp.sendRedirect("/adminpost");


                }
            } else {
                resp.sendRedirect("/login?mess=error1");
            }
        } else {
            resp.sendRedirect("/login?mess=error2");
        }
    }
}