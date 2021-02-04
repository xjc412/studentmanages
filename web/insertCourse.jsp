<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/3
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>添加课程</title>
</head>
<body>
     <form action="CourseInsertServlet" method="post">
    请输入添加的课程编号：<input type="text" class="form-control" placeholder="课程编号" name="cno">
         请输入添加的课程名 <input type="text" class="form-control" placeholder="课程名" name="cname"> <br>
         请输入授课老师：<input type="text" class="form-control" placeholder="授课老师"  name="cteacher"> <br>
         请输入课程学分：<input type="text" class="form-control" placeholder="课程学分" name="ccredit"> <br>
    <input type="submit" value="提交" >
</form>
</body>
</html>
