package com.skeyedu.controller;

import javax.servlet.*;
import java.io.IOException;

public class TestA implements Servlet {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
