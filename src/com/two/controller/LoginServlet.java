package com.two.controller;

import com.two.entity.User;
import com.two.service.impl.UserServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        ServletContext servletContext = request.getServletContext();
       response.setContentType("text/html; charset = utf-8");
        UserServiceImpl userService = new UserServiceImpl();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        User user = userService.loginSelect(userName, password);
        if (user != null) {
                request.getSession().setAttribute("user", user);
                response.sendRedirect(servletContext.getContextPath() + "/main.jsp");
        } else if (user == null){
            request.setAttribute("info", "账号或密码输入错误");
            request.getRequestDispatcher("message08.jsp").forward(request, response);
        }
    }
}

