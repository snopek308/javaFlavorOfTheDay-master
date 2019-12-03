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

<form:form action="save" modelAttribute="Users">
    <form:hidden path="userID" value="${Users.userID}"/>


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
            <td><label>Email</label></td>
            <td><form:input path="userEmail"/>
                <form:errors path="userEmail" cssClass="error"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save" class="save"></td>
        </tr>
    </table>
</form:form>
</body>
</html>