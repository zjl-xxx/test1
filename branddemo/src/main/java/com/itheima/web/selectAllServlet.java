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


@WebServlet("/selectAllServlet")
public class selectAllServlet extends HttpServlet {
    brandservice brandser=new brandservice();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Brand> brands=brandser.selectAll();

    req.setAttribute("brands",brands);

    req.getRequestDispatcher("/brand.jsp").forward(req,resp);


    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    this.doGet(req,resp);
    }
}
