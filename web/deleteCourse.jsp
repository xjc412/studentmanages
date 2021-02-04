<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/3
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>删除</title>
</head>
<body>
   <form action="CourseDeleteServlet" method="post">
       请输入想要删除的账号：<input type="text"  class="form-control" placeholder="课程编号" name="id">
       <input type="submit" value="提交" >
   </form>
</body>

</html>
