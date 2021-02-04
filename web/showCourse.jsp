<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/3
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<%
    Object objNo = request.getAttribute("pageNo");
    Object objCount = request.getAttribute("pageCount");
    int pageNo = 0;
    int pageCount = 0;
    if( objCount!=null){
        pageCount=Integer.parseInt(objCount.toString());
    }
    if(objNo!=null){
        pageNo=Integer.parseInt(objNo.toString());
    }

%>
<table class="table table-hover">
    <tr>
        <th>编号</th>
        <th>课程名</th>
        <th>授课老师</th>
        <th>学分</th>
    </tr>
    <c:forEach var="cou" items="${list}">
        <tr>
            <td>${cou.cno}</td>
            <td>${cou.cname}</td>
            <td>${cou.cteacher}</td>
            <td>${cou.ccredit}</td>
        </tr>
    </c:forEach>

    <tr>
        <td colspan="4">
            <a href="<%=path%>/CourseServlet?pageNo=1">首页</a>
            <%
                if (pageNo>1){
            %>
            <a href="<%=path%>/CourseServlet?pageNo=${pageNo-1}">上一页</a>

            <%
                }
                if(pageNo == 1){

            %>
            <a>上一页</a>
            <%
                }
                if(pageCount>pageNo){
            %>
            <a href="<%=path%>/CourseServlet?pageNo=${pageNo+1}">下一页</a>
        </td>
        <%
            }
            if(pageCount==pageNo){
        %>
        <a>下一页</a>
        <%
            }

        %>
        <a href="<%=path%>/CourseServlet?pageNo=${pageCount}">尾页</a>
    </tr>
</table>
        <a href="admin.jsp">返回</a>
</body>
</html>
