package com.itheima.web;

import com.itheima.pojo.Brand;
import com.itheima.service.brandservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectByidServlet")
public class selectByidServlet extends HttpServlet {

    brandservice service=new brandservice();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        int id=Integer.parseInt(req.getParameter("id"));
        Brand brand=service.selectByid(id);
        req.setAttribute("brand",brand);
        req.getRequestDispatcher("/update.jsp").forward(req,resp);

    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doGet(req,resp);
    }
}
