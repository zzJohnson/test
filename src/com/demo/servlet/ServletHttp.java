package com.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("*.do")
@WebServlet("/test")
public class ServletHttp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doGet(req, resp);
//        System.out.println("这是HttpServlet的get方法。。。");
//        System.out.println("这是HttpServlet的get方法。。。");
//        System.out.println("这是HttpServlet的get方法。。。");

        System.out.println("test");

//        String username = request.getParameter("username");
//        String password = request.getParameter("password");

        /*//重定向
        response.setHeader("location","/day22/demo2");
        response.sendRedirect("/day22/demo2");*/

        /*//设置utf
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("你好,response");*/

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println("这是HttpServlet的post的方法。。。");

    }
}
