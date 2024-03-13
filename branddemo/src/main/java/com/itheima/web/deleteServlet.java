package com.itheima.web;

import com.itheima.pojo.Brand;
import com.itheima.service.brandservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/deleteServlet")

public class deleteServlet extends HttpServlet {
    brandservice service=new brandservice();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        int id=Integer.parseInt(req.getParameter("id"));
        service.delete(id);
        resp.sendRedirect("/BrandDemo_war/selectAllServlet");

    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doGet(req,resp);
    }
}
