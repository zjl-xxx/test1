package com.itheima.web;

import com.itheima.mapper.usermapper;
import com.itheima.pojo.User;
import com.itheima.service.userservice;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.Writer;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet{
         userservice service=new userservice();
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            String remmber=request.getParameter("remmber");

            User user=new User();
            user.setUsername(username);
            user.setPassword(password);

            User user1=service.select(user);

            if(user1==null)
            {
                request.setAttribute("error_msg","用户名和密码错误");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }else
            {
                if("1".equals(remmber))
                {
                    Cookie cookie=new Cookie("username",username);
                    Cookie cookie1=new Cookie("password",password);

                    cookie.setMaxAge(60*60*24*7);
                    cookie1.setMaxAge(60*60*24*7);

                    response.addCookie(cookie);
                    response.addCookie(cookie1);

                }
                HttpSession session=request.getSession();
                session.setAttribute("username",username);

                response.sendRedirect("/BrandDemo_war/selectAllServlet");
            }
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
        }
    }


