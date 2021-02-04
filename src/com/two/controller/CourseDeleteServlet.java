package com.two.controller;


import com.two.service.impl.CourseService06Impl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CourseDeleteServlet")
public class CourseDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.setCharacterEncoding("utf-8");
          response.setContentType("text/html;charset=utf-8");
        ServletContext servletContext = request.getServletContext();
        String contextPath = servletContext.getContextPath();
        String parameter = request.getParameter("id");
        CourseService06Impl courseService = new CourseService06Impl();
        int delete = courseService.delete(parameter);
        if(delete==1){
            response.sendRedirect(contextPath+"/CourseServlet");
        }else {
            response.getWriter().append("删除失败");
        }
    }
}
