package com.two.controller;

import com.two.entity.Course_fail_rate;
import com.two.service.CourseService;
import com.two.service.impl.CourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CourseFailRateServlet")
public class CourseFailRateServlet extends HttpServlet {
    private CourseService cs = new CourseServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Course_fail_rate> list = cs.selAllCourse_fail_rate();
        request.setAttribute("list",list);
        request.getRequestDispatcher("./course_fail_rate.jsp").forward(request,response);
    }
}
