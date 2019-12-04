<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Summary Page</title>
    <link type="text/css" rel="stylesheet" href="${contextPath}/resources/css/style.css">
</head>
<body>

<%@include file="/WEB-INF/view/includes/header.jsp"%>

<div id="container">

    <div id="content">

        <!-- add user button -->

        <button class="add-button"
                onclick="window.location.href='showAddUserForm'; return false;">Add User Information
        </button>

        <!-- search form -->
        <form:form action="search" method="GET">
            Search Users by userID <input type="search" name="searchTerm"/>
            <input type="submit" value="Search" class="add-button"/>
        </form:form>

        <!-- user list table -->

        <table>
            <tr>
                <th></th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>User Email</th>
                <th>Action</th>
            </tr>
            <c:forEach var="tempUser" items="${users}">

                <!-- construct an "update" link with donut id -->
                <!-- c:url is same as JSP's response.encodeURL() -->
                <c:url var="updateLink" value="/Users/showUpdateUsersForm">
                    <c:param name="userID" value="${tempUser.userID}"/>
                </c:url>

                <!-- construct a "delete" link with donut id -->
                <c:url var="deleteLink" value="/Users/delete">
                    <c:param name="userID" value="${tempUser.userID}"/>
                </c:url>

                <tr>
                    <td>${tempUser.firstName}</td>
                    <td>${tempUser.lastName}</td>
                    <td>${tempUser.userEmail}</td>
                    <td>
                        <!-- display the update link -->
                        <a href="${updateLink}">Update</a>
                        |
                        <!-- display the delete link -->
                        <a href="${deleteLink}" onclick="if (!confirm('Are you sure?')) return false">Delete</a>
                    </td>

                </tr>
            </c:forEach>
        </table>

    </div>

</div>

</body>
</html>