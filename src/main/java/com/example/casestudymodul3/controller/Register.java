package com.example.casestudymodul3.controller;


import com.example.casestudymodul3.model.Account;
import com.example.casestudymodul3.service.RegisterSevice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class Register extends HttpServlet {
    RegisterSevice registerSevice = new RegisterSevice();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mess = req.getParameter("mess");
        if (mess != null) {
            switch (mess) {
                case "error1":
                    mess = "Tài khoản đã tồn tại vui lòng đăng kí lại";
                    req.setAttribute("mess", mess);
                    break;
                case "error3":
                    mess = "Mật khẩu không trùng khớp";
                    req.setAttribute("mess", mess);
                    break;
                case "error4":
                    mess = "Tài khoản hoặc mật khẩu không đúng yêu cầu";
                    req.setAttribute("mess", mess);
                    break;

                case "error5":
                    mess = "Email hoặc số điện thoại đã được sử dụng";
                    req.setAttribute("mess", mess);
                    break;


            }

        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("bootstrap/feed/demo.foxthemes.net/instellohtml/form-register.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String repass = req.getParameter("repassword");
        String email = req.getParameter("email");
        String phonenumber = req.getParameter("phonenumber");
        String address = req.getParameter("address");
        String avatarurl = req.getParameter("avatarurl");


        if (registerSevice.checkemail(email) || registerSevice.checkphonenumber(phonenumber)) {
            resp.sendRedirect("/register?mess=error5");
        } else if (registerSevice.checkusername(username) && registerSevice.checkpass(password)) {
            if (registerSevice.checkacc(username)) {
                resp.sendRedirect("/register?mess=error1");
            } else if (password.equals(repass)) {
                registerSevice.Adduser(new Account(username, password, email, phonenumber, address,avatarurl));
                resp.sendRedirect("/bootstrap/feed/demo.foxthemes.net/instellohtml/notice.jsp");
            } else {
                resp.sendRedirect("/register?mess=error3");
            }
        } else {
            resp.sendRedirect("/register?mess=error4");
        }


    }


}
