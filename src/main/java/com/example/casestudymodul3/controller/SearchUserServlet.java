package com.example.casestudymodul3.controller;

import com.example.casestudymodul3.model.Account;
import com.example.casestudymodul3.service.AccountService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/searchuser")
public class SearchUserServlet extends HttpServlet {
    AccountService accountService = new AccountService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("search");
        System.out.println(username);
        List<Account> accountList =  accountService.findByUsername(username);
        System.out.println(accountList.size());
        request.setAttribute("accountlist",accountList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/searchprofile.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
