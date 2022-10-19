<%--
  Created by IntelliJ IDEA.
  User: gxw
  Date: 2022/10/19
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick14" method="post">
    <%--表明是第一个User对象的username age--%>
    <input type="text" name="userList[0].userName"><br>
    <input type="text" name="userList[0].age"><br>
    <input type="text" name="userList[1].userName"><br>
    <input type="text" name="userList[1].age"><br>
    <input type="submit" value="提交"><br>
</form>
</body>
</html>
