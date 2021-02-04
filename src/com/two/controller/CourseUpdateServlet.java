package com.two.controller;

import com.two.service.impl.CourseService06Impl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CourseUpdateServlet")
public class CourseUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
       response.setContentType("text/html;charset=utf-8");
        ServletContext servletContext = request.getServletContext();
        String contextPath = servletContext.getContextPath();
        String cname = request.getParameter("cname");
        String cteacher = request.getParameter("cteacher");
        String parameter = request.getParameter("ccredit");
        int ccredit = Integer.parseInt(parameter);
        String id = request.getParameter("id");
        CourseService06Impl courseService = new CourseService06Impl();
        int update = courseService.update(cname, cteacher, ccredit, id);
        if(update==1){
            response.sendRedirect(contextPath+"/CourseServlet");
        }else {
            response.getWriter().write("修改失败");
        }
    }
}
