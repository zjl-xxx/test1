package com.itheima.web;

import com.itheima.pojo.Brand;
import com.itheima.pojo.User;
import com.itheima.service.brandservice;
import com.itheima.service.userservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
    userservice service=new userservice();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");


        User user=new User();
        user.setUsername(username);
        user.setPassword(password);

        boolean flag=service.add(user);

        if(flag==true)
        {
            request.setAttribute("resgister_msg","注册成功，请登录");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else
        {
            request.setAttribute("resgister1_msg","用户名已被占用");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
