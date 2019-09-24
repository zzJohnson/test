<%--
  Created by IntelliJ IDEA.
  User: John
  Date: 2019/9/20
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    request.setAttribute("name","John");
    session.setAttribute("hobby","basketball");
%>
<body>
${3>4}
<br>
request:
${requestScope.name}
<br/>
session:
${sessionScope.hobby}

</body>
</html>
