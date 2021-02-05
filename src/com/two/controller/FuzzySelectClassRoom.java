package com.two.controller;

import com.two.entity.ClassRoom;
import com.two.service.ClassRoomService;
import com.two.service.impl.ClassRoomServiceImpl;
import com.two.util.PageUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FuzzySelectClassRoom")
public class FuzzySelectClassRoom extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        ClassRoomService classRoomService = new ClassRoomServiceImpl();
        List<ClassRoom> list = classRoomService.selectClassRoom();
        request.setAttribute("list", list);
        request.getRequestDispatcher("/classroom_list.jsp").forward(request, response);
    }
}
