<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.demo.classes.User" %><%--
  Created by IntelliJ IDEA.
  User: John
  Date: 2019/9/20
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<%
    List<Object> ulist = new ArrayList<>();

    ulist.add(new User("john", 20 , "basketball"));
    ulist.add(new User("小明", 18 , "reunning"));
    ulist.add(new User("小红", 18 , "swimmming"));

    request.setAttribute("userList",ulist);

%>
<body>
${requestScope.userList[0].name}

<table border="1" width="400" align="center">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>爱好</td>
    </tr>

    <c:forEach items="${userList}" var="user" varStatus="s">

        <c:if test="${s.count%2 != 0}">
            <tr bgcolor="#7fffd4">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.hobby}</td>
            </tr>
        </c:if>
        <c:if test="${s.count%2==0}">
            <tr>
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.hobby}</td>
            </tr>
        </c:if>

    </c:forEach>


</table>


</body>
</html>
