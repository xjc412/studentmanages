package com.two.controller;

import com.two.entity.User;
import com.two.service.UserManageService01;
import com.two.service.impl.UserManageServiceImpl01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/UserManage01Servlet")
public class UserManage01Servlet extends HttpServlet {
    private static UserManageService01 um = new UserManageServiceImpl01();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String action = request.getParameter("action");
        System.out.println(action);
//添加用户：start
        String username = null;
        String password = null;
        String level = null;
        String beforename = null;

        if (action.equals("insert_user")) {
            username = request.getParameter("username");
            password = request.getParameter("password");
            level = request.getParameter("level");
        }

        Object[] add = {username, password, level};
//添加用户：end

//删除用户：start
        if (action.equals("delete_user")) {
            username = request.getParameter("username");
        }

        Object[] delete = {username};
//删除用户：end

//修改用户：start:
        if (action.equals("alter_user")) {
            username = request.getParameter("after_username");
            password = request.getParameter("after_password");
            level = request.getParameter("after_level");
            beforename = request.getParameter("username");
        }

        Object[] alter = {username, password, level, beforename};
        switch (action) {
            //用户操作
            case "query_all_user":
                query_all_user(request, response);
                break;
            case "insert_user":
                insert_user(request, response, add);
                break;
            case "delete_user":
                delete_user(request, response, delete);
                break;
            case "alter_user":
                alter_user(request, response, alter);
                break;
            default:
                break;
        }
    }

    protected void query_all_user(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        List<User> users = um.allUser();
        PrintWriter writer = response.getWriter();
        if (users != null) {
            writer.write("<div class='all'>");
            writer.write("<div><span>用户名</span><span>密码</span><span>权限级别</span></div>");
            for (User user : users) {
                writer.write("<div>");
                writer.write("<span>" + user.getUsername() + "</span>");
                writer.write("<span>" + user.getPassword() + "</span>");
                writer.write("<span>" + user.getLevel() + "</span>");
                writer.write("</div>");
            }
            writer.write("</div>");
        }
        writer.flush();
        writer.close();
    }

    protected void insert_user(HttpServletRequest request, HttpServletResponse response, Object[] obj) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        int i = um.add(obj);
        PrintWriter out = response.getWriter();
        String info = null;
        if (i > 0) {
            info = "用户插入成功！";
        } else {
            info = "错误：用户插入失败！";
        }
        out.write("<div class='error'>");
        out.write("<div>" + info + "</div>");
        out.write("</div>");
        out.flush();
        out.close();
    }

    protected void delete_user(HttpServletRequest request, HttpServletResponse response, Object[] delete) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        int i = um.del(delete);
        String info = null;
        PrintWriter out = response.getWriter();
        if (i == 1) {
            info = "成功删除名为" + delete[0] + "用户！";
        } else {
            info = "错误：删除用户失败！";
        }
        out.write("<div class='error'>");
        out.write("<div>" + info + "</div>");
        out.write("</div>");
        out.flush();
        out.close();
    }

    protected void alter_user(HttpServletRequest request, HttpServletResponse response, Object[] alter) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        int i = um.alter(alter);
        System.out.println(i);
        String info = null;
        PrintWriter out = response.getWriter();
        if (i == 1) {
            info = "名为" + alter[3] + "的用户信息修改成功！";
        } else {
            info = "错误：修改用户失败!";
        }
        out.write("<div class='error'>");
        out.write("<div>" + info + "</div>");
        out.write("</div>");
        out.flush();
        out.close();

    }
}
