package com.example.casestudymodul3.Controller;

import com.example.casestudymodul3.Service.ServiceAccount;
import com.example.casestudymodul3.model.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/TopFollow")
public class SeverletTopFollow extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account account= ServiceAccount.getTopfolow();
        req.setAttribute("H",account);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/TopFollow.jsp");
        requestDispatcher.forward(req,resp);
    }




}
