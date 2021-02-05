<%--
  Created by IntelliJ IDEA.
  User: 谢俊超
  Date: 2021/2/4
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<frameset rows="60,*" frameborder="no">
    <frame src="./top.jsp" name="toframe">
    <frameset cols="180,*">
        <frame src="./left.jsp" name="leftframe">
        <frame src="./show.jsp" name="rightframe">
    </frameset>
</frameset>
</html>
