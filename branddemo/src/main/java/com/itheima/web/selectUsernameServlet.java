package com.itheima.web;

import com.itheima.pojo.Brand;
import com.itheima.service.brandservice;
import com.itheima.service.userservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selectUsernameServlet")
public class selectUsernameServlet extends HttpServlet {

   userservice service=new userservice();

    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username=req.getParameter("username");
        boolean flag=service.selectByusername(username);
        resp.getWriter().write(""+flag);
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doGet(req,resp);
    }
}
