package com.example.casestudymodul3.controller;


import com.example.casestudymodul3.service.PostService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class SeverletDeletePost  extends HttpServlet {
    PostService postService = new PostService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("idposts"));
        postService.delete(id);
        resp.sendRedirect("/Show");
    }
}
