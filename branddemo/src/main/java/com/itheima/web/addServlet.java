package com.itheima.web;

import com.itheima.pojo.Brand;
import com.itheima.service.brandservice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");

       String brand_name= request.getParameter("brand_name");
       String company_name=request.getParameter("company_name");
        String ordered=request.getParameter("ordered");
       String description=request.getParameter("description");
        String status=request.getParameter("status");

        Brand brand=new Brand();
        brand.setBrand_name(brand_name);
        brand.setCompany_name(company_name);
        brand.setDescription(description);
        brand.setordered(Integer.parseInt(ordered));
        brand.setStatus(Integer.parseInt(status));

        brandservice service=new brandservice();
        service.add(brand);

        request.getRequestDispatcher("//selectAllServlet").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doGet(request,response);
    }
}
