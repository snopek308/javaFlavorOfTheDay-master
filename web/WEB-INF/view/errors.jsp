<%--
  Created by IntelliJ IDEA.
  User: abby-
  Date: 12/4/2019
  Time: 12:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set value="${pageContext.request.contextPath}" var="contextPath"/>

<html>
<head>
    <title>Error Page</title>
    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h3>Oops! An error occurred. Please try again!</h3>
    </div>
</div>
<div id="container">
    <div id="content">
        <p>${errorMessage}</p>
    </div>
</div>
</body>
</html>
