package com.example.casestudymodul3.controller;
import com.example.casestudymodul3.model.Account;
import com.example.casestudymodul3.model.Status;
import com.example.casestudymodul3.service.AccountService;
import com.example.casestudymodul3.service.ServiceStatus;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(urlPatterns = "/ShowOne")
public class SeverletOneAccount extends HttpServlet {
AccountService accountService = new AccountService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("account", Login.account);
        int id = Integer.parseInt(req.getParameter("id"));

        Account account= accountService.ShowOneAccount(id);
        int count= account.getIdstatus();
        Status Status= ServiceStatus.ShowStatus(count);


        req.setAttribute("T",account);
        req.setAttribute("B",Status);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/Form-ShowOneAccount.jsp");
        requestDispatcher.forward(req,resp);
    }


}
