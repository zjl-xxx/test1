package com.itheima.web;

import com.itheima.pojo.Brand;
import com.itheima.service.brandservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {

    brandservice service=new brandservice();
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         req.setCharacterEncoding("utf-8");

        String brand_name= req.getParameter("brand_name");
        String company_name=req.getParameter("company_name");
        String ordered=req.getParameter("ordered");
        String description=req.getParameter("description");
        String status=req.getParameter("status");
        String id=req.getParameter("id");

        Brand brand=new Brand();
        brand.setBrand_name(brand_name);
        brand.setCompany_name(company_name);
        brand.setDescription(description);
        brand.setordered(Integer.parseInt(ordered));
        brand.setStatus(Integer.parseInt(status));
        brand.setId(Integer.parseInt(id));

        service.update(brand);

        resp.sendRedirect("/BrandDemo_war/selectAllServlet");
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doGet(req,resp);
    }
}
