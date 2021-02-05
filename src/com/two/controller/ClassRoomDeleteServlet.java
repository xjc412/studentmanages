package com.two.controller;

import com.two.service.ClassRoomService;
import com.two.service.impl.ClassRoomServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ClassRoomDeleteServlet")
public class ClassRoomDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String contextPath = request.getServletContext().getContextPath();
        ClassRoomService classRoomService = new ClassRoomServiceImpl();
        String clno = request.getParameter("clno");
        int i = classRoomService.deleteClassRoom(clno);
        response.sendRedirect(contextPath+"/FuzzySelectClassRoom");
    }
}
