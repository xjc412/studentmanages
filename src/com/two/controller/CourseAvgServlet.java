package com.two.controller;

import com.two.entity.Course_avg;
import com.two.service.CourseService;
import com.two.service.impl.CourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CourseAvgServlet")
public class CourseAvgServlet extends HttpServlet {
    private CourseService cs = new CourseServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Course_avg> list = cs.selAllCourse_avg();
        req.setAttribute("list",list);
        req.getRequestDispatcher("./course_avg.jsp").forward(req,resp);
    }
}
