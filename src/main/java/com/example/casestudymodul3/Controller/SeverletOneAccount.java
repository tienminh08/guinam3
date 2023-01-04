package com.example.casestudymodul3.Controller;

import com.example.casestudymodul3.Service.ServiceAccount;
import com.example.casestudymodul3.Service.ServiceStatus;
import com.example.casestudymodul3.model.Account;
import com.example.casestudymodul3.model.Status;
import jdk.internal.net.http.frame.Http2Frame;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/ShowOne")
public class SeverletOneAccount extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        Account account= ServiceAccount.ShowOneAccount(id);
        int count= account.getIdstatus();
        Status Status= ServiceStatus.ShowStatus(count);


        req.setAttribute("T",account);
        req.setAttribute("B",Status);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/bootstrap/feed/demo.foxthemes.net/instellohtml/Form-ShowOneAccount.jsp");
        requestDispatcher.forward(req,resp);
    }


}
