package com.example.casestudymodul3.controller;


import com.example.casestudymodul3.service.AccountService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Search")
public class SeverletSearch extends HttpServlet {
    AccountService accountService = new AccountService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/Show");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("name123");
        accountService.findByUsername(username);
        req.setAttribute("A", accountService.findByUsername(username));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/ShowAccount.jsp");
        requestDispatcher.forward(req, resp);
//        if (ServiceAccount.Findbyusername(username).size() <= 0) {
//            resp.sendRedirect("/Search");
//        } else {
//            for (int i = 0; i < ServiceAccount.Findbyusername(username).size(); i++) {
//
//                if (ServiceAccount.Findbyusername(username).get(i).getUsername().contains(username)) {
//                    req.setAttribute("A", ServiceAccount.Findbyusername(username));
//                    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/ShowAccount.jsp");
//                    requestDispatcher.forward(req, resp);
//                }
//
//
//            }
//
//
//        }
    }
}
