package com.yiwa.springboot1.filter;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1= (HttpServletRequest) request;
        System.out.println("this is myFilter,URL :"+request1.getRequestURI());
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
