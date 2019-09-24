<%--
  Created by IntelliJ IDEA.
  User: John
  Date: 2019/9/20
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>500</title>
</head>
<body>
    服务器运行错误，请稍后刷新重试...
    <br/>
<%
    String msg = exception.getMessage();
    out.println(msg);
%>
</body>
</html>
