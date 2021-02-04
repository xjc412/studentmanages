package com.two.controller;

import com.two.entity.Course_fail_rate;
import com.two.entity.Course_ranking;
import com.two.service.CourseService;
import com.two.service.impl.CourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CourseRankingServlet")
public class CourseRankingServlet extends HttpServlet {
    private CourseService cs = new CourseServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Course_ranking> list = cs.selAllCourse_ranking();
        request.setAttribute("list",list);
        request.getRequestDispatcher("./course_ranking.jsp").forward(request,response);
    }
}
