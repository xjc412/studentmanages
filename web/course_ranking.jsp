<%--
  Created by IntelliJ IDEA.
  User: 谢俊超
  Date: 2021/2/4
  Time: 12:06
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
            <td>学号</td>
            <td>系名</td>
            <td>班名</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>成绩</td>
            <td>排名</td>
        </tr>
        <c:forEach items="${list}" var="list">
            <tr class="info">
                <td>${list.sno}</td>
                <td>${list.dname}</td>
                <td>${list.clname}</td>
                <td>${list.sname}</td>
                <td>${list.ssex}</td>
                <td>${list.sage}</td>
                <td>${list.grade}</td>
                <td>${list.ranking}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
