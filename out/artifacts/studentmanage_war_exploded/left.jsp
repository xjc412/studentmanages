<%--
  Created by IntelliJ IDEA.
  User: 谢俊超
  Date: 2021/2/4
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="./js/jquery-3.1.1.min.js"></script>
    <style type="text/css">
        body,div{
            background-color: #a6e1ec;
        }
        ul{
            margin: 0px;
            border: none;
            list-style-type: none;

        }
        li{
            width: 150px;
            height: 24px;
        }
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>
<h3>请选择操作</h3>
<div class="title"><a href="javascript:;">用户信息管理</a></div>
<ul>
    <li><a  href="javascript:;">查看所有用户</a></li>
    <li><a  href="javascript:;">新增用户信息</a></li>
    <li><a  href="javascript:;">删除指定用户</a></li>
    <li><a  href="javascript:;">修改用户信息</a></li>
</ul>
<div class="title"><a href="javascript:;">院系信息管理</a></div>
<ul>
    <li><a href="javascrip:;">查看所有院系</a></li>
    <li><a href="javascrip:;">新增院系信息</a></li>
    <li><a href="javascrip:;">删除指定院系</a></li>
    <li><a href="javascrip:;">修改院系信息</a></li>
</ul>
<div class="title"><a href="javascript:;">班级信息管理</a></div>
<ul>
    <li><a href="javascrip:;">查看所有班级</a></li>
    <li><a href="javascrip:;">新增班级信息</a></li>
    <li><a href="javascrip:;">删除指定班级</a></li>
    <li><a href="javascrip:;">修改班级信息</a></li>
</ul>
<div class="title"><a href="javascript:;">学生信息管理</a></div>
<ul>
    <li><a href="javascrip:;">查看所有学生</a></li>
    <li><a href="javascrip:;">新增学生信息</a></li>
    <li><a href="javascrip:;">删除指定学生</a></li>
    <li><a href="javascrip:;">修改学生信息</a></li>
</ul>
<div class="title"><a href="javascript:;">课程信息管理</a></div>
<ul>
    <li><a href="javascrip:;">查看所有课程</a></li>
    <li><a href="javascrip:;">新增课程信息</a></li>
    <li><a href="javascrip:;">删除课程信息</a></li>
    <li><a href="javascrip:;">修改课程信息</a></li>
    <li><a href="CourseAvgServlet" target="rightframe">查询课程平均分</a></li>
    <li><a href="CourseFailRateServlet" target="rightframe">查询课程不及格率</a></li>
    <li><a href="CourseRankingServlet" target="rightframe">查询课程排名情况</a></li>
</ul>
<div class="title"><a href="javascript:;">学生成绩管理</a></div>
<ul>
    <li><a href="javascrip:;">查看全部学生成绩</a></li>
    <li><a href="javascrip:;">新增学生成绩记录</a></li>
    <li><a href="javascrip:;">删除学生成绩记录</a></li>
    <li><a href="javascrip:;">修改学生成绩记录</a></li>
</ul>
</body>
<script type="text/javascript">
    $(function(){
        $('ul:gt(0)').slideUp()
        $('.title').click(function(){
            var $ul = $(this).next('ul')
            $('body').find('ul').slideUp()
            if(!$ul.is(':visible')){
                $ul.slideDown()
            }
        })
    })
</script>
</html>
