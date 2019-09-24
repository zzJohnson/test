<%@ page import="com.demo.classes.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: John
  Date: 2019/9/20
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List&Map</title>
</head>
<%
    User user1 = new User();
    user1.setName("John");
    user1.setAge(20);
    user1.setBrithday("basketball");
%>
<body>
user:
${requestScope.u.name}
<br/>
${requestScope.u.age}
<br/>
${requestScope.u.brithday}
<br/>
</body>
</html>
