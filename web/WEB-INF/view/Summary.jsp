<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: abby-
  Date: 12/2/2019
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Flavor of the Day!</title>
    <link rel="stylesheet" href="WEB-INF/resources/css/stylesheet.css">
    <script
            src="https://code.jquery.com/jquery-2.2.4.min.js"
            integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
            crossorigin="anonymous"></script>
    <script src="WEB-INF/resources/js/javascript.js"></script>
    <script>
        component.initialize.init();
    </script>
    <link href="https://fonts.googleapis.com/css?family=Chelsea+Market|Hepta+Slab&display=swap" rel="stylesheet">

</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>New Donut</h2>
    </div>
</div>

<div id="container">

    <div id="content">

        <button class="add-button"
                onclick="window.location.href='showAddDonutForm'; return false;">Add Subscriber</button>

        <form:form action="search" method="GET">
            <input type="search" name="searchTerm">
            <input type="submit" value="Search" class="add-button">
        </form:form>

        <table>
            <tr>
                <th></th>
                <th>Newsletter</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>User Email</th>
                <th>Action</th>
            </tr>
            <c:forEach var="tempuser" items="${donuts}">
                <c:url var="updateLink" value="/users/showUpdateUsersForm">
                    <c:param name="userID" value="${tempuser.userID}"/>
                </c:url>
                <c:url var="deleteLink" value="/donut/delete">
                    <c:param name="userID" value="${tempDonut.userID}"/>
                </c:url>
                <tr>
                    <td>${tempuser.firstName}</td>
                    <td>${tempuser.lastName}</td>
                    <td>${tempuser.userEmail}</td>
                    <td>
                        <a href="${updateLink}">Update</a>
                        &nbsp;|&nbsp;
                        <a href="${deleteLink}"
                           onclick="if (!confirm('Are you sure?')) return false">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>


</body>
</html>