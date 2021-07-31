package com.siyuan;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
public class myServlet implements Servlet {
    public myServlet(){
        System.out.println("creating new object");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println(servletConfig.getServletName());
        System.out.println("executing initialize of object");
        ServletContext servletContext=servletConfig.getServletContext();
        System.out.println(servletContext.getContextPath());
        System.out.println(servletContext.getServerInfo());
        System.out.println(servletContext.getInitParameter("username"));
        System.out.println(servletConfig.getInitParameter("username"));
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("executed object");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("release servlet object");
    }
}
