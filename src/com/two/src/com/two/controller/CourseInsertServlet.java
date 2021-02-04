package com.two.controller;


import com.two.entity.Course;
import com.two.service.impl.CourseServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CourseInsertServlet")
public class CourseInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
       response.setContentType("text/html;charset=utf-8");
        ServletContext servletContext = request.getServletContext();
        String contextPath = servletContext.getContextPath();
        String cno = request.getParameter("cno");
        String cname = request.getParameter("cname");
        String cteacher = request.getParameter("cteacher");
        String parameter = request.getParameter("ccredit");
        int ccredit = Integer.parseInt(parameter);
        CourseServiceImpl courseService = new CourseServiceImpl();
        List<Course> select = courseService.selectByCname(cname);
        System.out.println(select);
        if(select.size()==0){
            int insert = courseService.insert(cno, cname, cteacher, ccredit);
            if(insert==1){
                response.sendRedirect(contextPath+"/CourseServlet");
            }else {
                response.getWriter().append("添加失败");
            }
        }else {
            response.getWriter().append("课程重复");
        }


    }
}
