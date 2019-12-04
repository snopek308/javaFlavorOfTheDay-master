<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: abby-
  Date: 10/16/2019
  Time: 7:53 PM
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
    <body id="page">
        <div id="wrapper">
            <h1>Flavor of the Day</h1>
            <div class="tabs">
                <ul class="tabNavigation">
                    <li><a href="index.html" class="navTab">Homepage</a></li>
                    <li><a href="shopOne.html" class="navTab">Snopek's Ice Cream Shop</a></li>
                    <li><a href="shopOneCalendar.html" class="navTab">Snopek's Ice Cream Calendar</a></li>
                    <li><a href="summaryPage.html" class="navTab">Summary Page</a></li>
                </ul>
            </div>
        <div class="main">
            <h3>Welcome ice cream lovers!</h3>
            <p>If you love ice cream, you've come to the frozen place. </p>
            <p>Come explore our website. See what we're churning.</p>
        </div>

            <div>
                <p>Please join our email address for a subscription to our newsletter!</p>
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
            </div>
        </div>
        </body>
    </html>