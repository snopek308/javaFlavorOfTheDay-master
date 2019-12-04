<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Add User</title>
    <link type="text/css" rel="stylesheet" href="${contextPath}/resources/css/style.css">
    <link type="text/css" rel="stylesheet" href="${contextPath}/resources/css/user-form-style.css">
    <link type="text/css" rel="stylesheet" href="${contextPath}/resources/css/select-style.css">
</head>
<body>

<%@include file="/WEB-INF/view/includes/header.jsp"%>

<div id="container">

    <div id="content">

        <form:form action="save" modelAttribute="user" method="post">
            <form:hidden path="userID" value="${user.userID}"/>

            <table>
                <tr>
                    <td><label>First Name</label></td>
                    <td><form:input path="firstName"/>
                        <form:errors path="firstName" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><label>Last Name</label></td>
                    <td><form:input path="lastName"/>
                        <form:errors path="lastName" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><label>User's Email</label></td>
                    <td><form:input path="userEmail"/>
                        <form:errors path="userEmail" cssClass="error"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="save" class="save"></td>
                </tr>
            </table>
        </form:form>

        <%@include file="/WEB-INF/view/includes/footer.jsp"%>

    </div>
</div>
</body>
</html>
