<%--
  Created by IntelliJ IDEA.
  User: 谢俊超
  Date: 2021/2/3
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="./css/bootstrap.min.css" >
    <script src="./js/jquery-3.1.1.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <style type="text/css">
        body{
            margin: 0px;
            padding: 0px;
            border: none;
            background-color: #a6e1ec;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <table class="table table-hover">
        <tr class="warning">
            <td>课程号</td>
            <td>课程名称</td>
            <td>平均分</td>
        </tr>
        <c:forEach items="${list}" var="list">
            <tr class="info">
                <td>${list.cno}</td>
                <td>${list.cname}</td>
                <td>${list.avg}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
