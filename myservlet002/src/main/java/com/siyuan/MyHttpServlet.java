package com.siyuan;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/http")
public class MyHttpServlet extends MyGenericServlet{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        //get the type of request
        String method=request.getMethod();
        switch (method){
            case "GET":this.doGet(request,response);
            break;
            case "POST":this.doPost(request,response);
        }
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{

    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws  IOException{

    }
}
