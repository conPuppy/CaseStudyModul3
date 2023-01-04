package com.example.casestudymodul3.filter;

import com.example.casestudymodul3.model.Account;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/editpost","/deletepost","/createpost","/adminpost","/myposts", "/post","/searchuser","/setting","/Delete","/delete","/Lookup","/ShowOne","/Search","/Show","/showpostbyusername","/TopFollow","/TopLike","/UnLook"})
public class filter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpSession session = req.getSession();
        Account account = (Account) session.getAttribute("account");
        if (account == null){
            res.sendRedirect("bootstrap/feed/demo.foxthemes.net/instellohtml/loginfilter.jsp");
        }else {
            chain.doFilter(req,res);
        }

    }
}
