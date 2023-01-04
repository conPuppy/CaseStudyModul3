package com.example.casestudymodul3.controller;

import com.example.casestudymodul3.model.Post;
import com.example.casestudymodul3.service.PostService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/showpostbyusername")
public class SeverletShowPost extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int idaccounts = Integer.parseInt(req.getParameter("idaccounts"));
        List<Post> postList = PostService.showPostByUsername(idaccounts);

        req.setAttribute("lispostbyusername", postList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/ListPostByUsName.jsp");
        dispatcher.forward(req,resp);


    }
}
