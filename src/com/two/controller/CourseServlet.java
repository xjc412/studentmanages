package com.two.controller;


import com.two.entity.Course;
import com.two.service.impl.CourseService06Impl;
import com.two.util.PageUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CourseServlet")
public class CourseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        String contextPath = servletContext.getContextPath();
        String parameter = request.getParameter("pageNo");
        if(parameter==null){
            parameter="1";
        }
        int pageNo = Integer.parseInt(parameter);
        request.setCharacterEncoding("utf-8");
          response.setContentType("text/html;charset=utf-8");
        CourseService06Impl courseService = new CourseService06Impl();
        int dateCount = courseService.getCount();
        int pageSize =3 ;
        PageUtil pageUtil = new PageUtil();
        pageUtil.setDataCount(dateCount);
        pageUtil.setPageNo(pageNo);
        pageUtil.setPageSize(pageSize);
        int pageCount = pageUtil.getPageCount();

        List<Course> courses = courseService.selectAll(pageNo,pageSize);
        request.setAttribute("list",courses);
        request.setAttribute("pageCount",pageCount);
        request.setAttribute("pageNo",pageNo);
        request.getRequestDispatcher("/showCourse.jsp").forward(request,response);

    }
}
