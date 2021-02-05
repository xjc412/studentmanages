<%--
  Created by IntelliJ IDEA.
  User: 谢俊超
  Date: 2021/2/4
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        *{
            padding: 0;
            margin: 0;
            font-family: "PingFangSC-Regular","Microsoft Yahei",sans-serif;
        }
        body {
            background-position: center center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            background-color: #a6e1ec;
        }

        a{
            color: #000;
            text-decoration: none;
            cursor: pointer;
        }

        a:hover{
            font-size: 15px;
            color: #E0555A;
        }

        ul{
            list-style: none;
        }

        ul li{
            display: inline-block;
        }

        header{
            position: absolute;
            top: 0;
            z-index: 30;
            font-size:15px;
            line-height: 34px;
            width: 100%;
            height: 60px;
        }

        .title{
            float: left;
            text-align: left;
            font-size: 24px;
            height: 60px;
            line-height: 60px;
            margin-left: 1.2em;
        }

        header nav{
            float: right;
            margin-right: 40px;
            text-align: center;
            height: 60px;
        }

        .userinfo ul li{
            margin: 0 15px;
            float: left;
            height: 38px;
            font-size: 20px;
            line-height: 60px;
            color:#000;
        }

        .userinfo ul li a{
            color:#000;
        }

        .userinfo ul li a:hover{
            font-size:20px;
            color: red;
        }
    </style>
</head>
<body>
<header>
    <div class="title">
        <span>学生管理系统</span>
    </div>
    <nav>
        <div class="userinfo">
            <ul>
                <li>${sessionScope.user.username}</li>
                <li>${sessionScope.user.level}</li>
                <li><a href="./login08.html" target="_top">退出登录</a></li>
                <li><a href="#">返回首页</a></li>
            </ul>
        </div>
    </nav>
</header>
</body>
</html>
