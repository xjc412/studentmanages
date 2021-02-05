<%@ page import="com.two.service.impl.ClassRoomServiceImpl" %>
<%@ page import="com.two.service.ClassRoomService" %>
<%@ page import="com.two.entity.ClassRoom" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 18788
  Date: 2021/2/5
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%String path=request.getContextPath();%>
<%
    String clno = request.getParameter("clno");
    if(clno != null){
        ClassRoomService gs=new ClassRoomServiceImpl();
        List<ClassRoom> gp = gs.getClassRoomByClno(clno);
        request.setAttribute("gp", gp);
    }
%>
<html>
<head>
    <title>添加班级</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <form class="form-horizontal"
          action="${pageContext.request.contextPath}/AddClassRoomServlet"
          method="post">
        <%--<input type="hidden" name="clno" value="${gp.clno}" />--%>
        <div class="form-group">
            <label class="col-sm-2 control-label">班级编号</label>
            <div class="col-sm-6">
                <input type="text" class="form-control"
                       placeholder="班级编号" name="clno"
                       value="${gp.clno}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">班级名称</label>
            <div class="col-sm-6">
                <input type="text" class="form-control"
                       placeholder="班级名称" name="clname"
                       value="${gp.clname}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">班级系别</label>
            <div class="col-sm-6">
                <input type="text" class="form-control"
                       placeholder="班级系别" name="dno"
                       value="${gp.dno}">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit"  class="btn btn-default">保存</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
