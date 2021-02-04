package com.two.controller;

import com.two.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset = utf-8");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String level = request.getParameter("level");
        UserServiceImpl userService = new UserServiceImpl();
        int i = userService.register(userName, password, level);
        if (i ==1 ) {
            response.sendRedirect("login.html");
        } else if (i == 0) {
            response.sendRedirect("register.html");
        }
    }
}
