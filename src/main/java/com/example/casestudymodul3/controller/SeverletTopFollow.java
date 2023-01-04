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

@WebServlet(urlPatterns = "/TopFollow")
public class SeverletTopFollow extends HttpServlet {

AccountService accountService = new AccountService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account account= accountService.getTopfolow();
        req.setAttribute("H",account);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/TopFollow.jsp");
        requestDispatcher.forward(req,resp);
    }




}
