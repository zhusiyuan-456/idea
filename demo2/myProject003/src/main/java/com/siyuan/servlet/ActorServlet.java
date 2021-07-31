package com.siyuan.servlet;

import com.siyuan.repository.Actor;
import com.siyuan.repository.ActorRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/Actor")
public class ActorServlet extends HttpServlet {
    private ActorRepository actorRepository=new ActorRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ActorRepository actorRepository=new ActorRepository();
        try {
            List<Actor> list=actorRepository.findAll();
            req.setAttribute("list",list);
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)  {
        String first_name=req.getParameter("first_name");
        String last_name=req.getParameter("last_name");
        try {
            actorRepository.add(first_name,last_name);
            resp.sendRedirect("/Actor");
        } catch (SQLException | IOException throwables) {
            throwables.printStackTrace();
        }

    }
}
