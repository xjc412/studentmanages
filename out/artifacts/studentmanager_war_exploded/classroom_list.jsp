<%--
  Created by IntelliJ IDEA.
  User: 18788
  Date: 2021/2/4
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%String path=request.getContextPath(); %>
<html>
<head>
    <title>班级展示</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
</head>

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container" style="margin-top:20px;">
    <form id="deleteFrom" action="${pageContext.request.contextPath}/goods/deleteBatch" method="post">
        <table style="text-align: center;margin-right:10px;width:99%"
               class="table table-striped table-hover table-bordered">
            <thead style="text-align: center;">
            <tr>
                <th>班级编号</th>
                <th>班级名字</th>
                <th>班级系别</th>
                <th>编辑</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="classR" varStatus="obj">

                <tr>

                    <td>${classR.clno}</td>
                    <td>${classR.clname}</td>
                    <td>${classR.dno}</td>
                        <%-- <td><a href="<%=path%>/after/add_goods_type.jsp?id=${goodsType.id}" onclick="if(confirm('是否确定编辑'+'${user.username}'+'？')==false)return false">编辑</a></td>
                        <td><a href="<%=path%>/GoodsTypeDeleteServlet?id=${goodsType.id}" onclick="if(confirm('是否确定删除'+'${goodsType.typename}'+'？')==false)return false">删除</a></td> --%>

                    <td><a href="<%=path%>/ClassRoomResetServlet?clno=${classR.clno}" onclick="if(confirm('是否确定编辑'+'${classR.clname}'+'？')==false)return false">
                        <span class="glyphicon glyphicon-edit"  color="#5BC0DE"></span></a></td>

                    <td><a class="glyphicon glyphicon-trash" color="#5BC0DE"
                           style="text-decoration:none"
                           href="<%=path%>/ClassRoomDeleteServlet?clno=${classR.clno}" onclick="if(confirm('是否确定删除'+'${classR.clname}'+'？')==false)return false" ></a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </form>
</div>
</body>
</html>
