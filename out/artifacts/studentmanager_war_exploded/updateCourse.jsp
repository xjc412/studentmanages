<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/3
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<form action="CourseUpdateServlet" method="post">
    请输入想要修改的课程编号：<input type="text"  class="form-control" placeholder="课程号" name="id">
    请输入修改课程名：<input type="text"  class="form-control" placeholder="课程名" name="cname">
    请输入修改授课老师：<input type="text"  class="form-control" placeholder="授课老师" name="cteacher">
    请输入修改课程学分：<input type="text"   class="form-control" placeholder="课程学分" name="ccredit">
    <input class="btn btn-default" type="submit" value="提交">
</form>
</body>
</html>
