<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Oops!</title>
    <link type="text/css" rel="stylesheet" href="${contextPath}/resources/css/style.css">
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>Ice Cream Newsletter</h2>
    </div>
</div>

<div id="container">
    <div id="content">
        <h3>Oops! You spilled your ice cream! An error has occurred!</h3>
        <p>${errorMessage}</p>
    </div>
</div>

<div style="clear: both;">
    <p>
        <a href="${contextPath}/Users/list">Back to List</a>
    </p>
</div>
</div>
</body>
</html>
