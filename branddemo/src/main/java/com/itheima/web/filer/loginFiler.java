package com.itheima.web.filer;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter("/*")
public class loginFiler implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) servletRequest;

        String[] strs={"login.jsp","register.jsp","loginServlet","registerServlet","selectUsernameServlet"};

       String url=req.getRequestURI().toString();


        for (String str : strs) {
          if(url.contains(str))
          {filterChain.doFilter(servletRequest,servletResponse);
               return;}
        }






        HttpSession session=req.getSession();
        Object username=session.getAttribute("username");
        if(username!=null){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            req.setAttribute("loginfilter_msg","尚未登录，请登录");
            req.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
