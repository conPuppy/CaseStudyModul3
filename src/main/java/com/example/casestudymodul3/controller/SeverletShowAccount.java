package com.example.casestudymodul3.controller;

import com.example.casestudymodul3.model.Account;
import com.example.casestudymodul3.service.AccountService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/Show")
public class SeverletShowAccount extends HttpServlet {
    AccountService accountService = new AccountService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account account = (Account) session.getAttribute("account");
        req.setAttribute("account", account);
        req.setAttribute("ListAccount", accountService.getall());
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/ShowAccount.jsp");
        requestDispatcher.forward(req,resp );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
