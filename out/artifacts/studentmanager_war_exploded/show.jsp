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
        function user_manager() {
            var user = "${param.usermanager}"
            var name = "${param.name}"
            if (user != "") {
                if (user == "all") {
                    query_all(name)
                }else if (user == "insert" && name  == "user") {
                    show_insert_user()
                }else if (user == "insert" && name  == "department") {
                    show_insert_department()
                }else if (user == "delete") {
                    show_delete(name)
                }else if (user == "alter") {
                    show_alter(name)
                }
            }
        }
    </script>
</head>
<body onload="user_manager()">
<div id="result" class="result">

    </div>
</body>
</html>
