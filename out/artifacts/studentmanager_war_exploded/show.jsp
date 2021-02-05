<%--
  Created by IntelliJ IDEA.
  User: 谢俊超
  Date: 2021/2/5
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/user&admin.css">
    <link rel="icon" type="image/x-ico" href="images/stu.ico">
    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/admin.js"></script>
    <script type="text/javascript">
        function user_manager01() {
            var name = "${param.usermanager01}"
            if (name != "") {
                if (name == "all") {
                    query_all('user')
                }else if (name == "insert") {
                    show_insert_user()
                }else if (name == "delete") {
                    show_delete('user')
                }else if (name == "alter") {
                    show_alter('user')
                }
            }
        }
    </script>
</head>
<body onload="user_manager01()">
<div id="result" class="result">

    </div>
</body>
</html>
