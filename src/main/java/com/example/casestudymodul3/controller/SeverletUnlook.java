package com.example.casestudymodul3.controller;


import com.example.casestudymodul3.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/UnLook")
public class SeverletUnlook extends HttpServlet {
    AccountService accountService = new AccountService();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        accountService.unLook(id);
        resp.sendRedirect("/Show");

    }


}
