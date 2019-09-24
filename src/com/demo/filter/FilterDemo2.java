package com.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/reg.html")
public class FilterDemo2 implements Filter {
    public void init(FilterConfig config) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("this is demo2 filter");
        chain.doFilter(req, resp);
        System.out.println("demo2 filter return");
    }

    public void destroy() {

    }

}
