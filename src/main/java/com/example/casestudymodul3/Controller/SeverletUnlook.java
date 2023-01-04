package com.example.casestudymodul3.Controller;

import com.example.casestudymodul3.Service.ServiceAccount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/UnLook")
public class SeverletUnlook extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        ServiceAccount.unLook(id);
        resp.sendRedirect("/Show");

    }


}
