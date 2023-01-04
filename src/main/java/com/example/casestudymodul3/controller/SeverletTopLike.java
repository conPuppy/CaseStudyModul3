package com.example.casestudymodul3.controller;

import com.example.casestudymodul3.model.Account;
import com.example.casestudymodul3.service.AccountService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/TopLike")
public class SeverletTopLike extends HttpServlet {
    AccountService accountService = new AccountService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account account= accountService.getTopLike();
        req.setAttribute("C",account);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/TopLike.jsp");
        requestDispatcher.forward(req,resp);
    }
}
