<%--
  Created by IntelliJ IDEA.
  User: John
  Date: 2019/9/20
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/uploadServlet" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="usename"/><br/>
    文件：<input type="file" name="file"/><br/>

    <input type="submit" value="确认"/>

</form>
</body>
</html>
