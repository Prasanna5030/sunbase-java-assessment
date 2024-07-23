<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>User List</title>
</head>
<body>
    <h1>User List</h1>
    <a href="${pageContext.request.contextPath}/users/new">Add New User</a>
    <table border="1" class="table">
    <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>street</th>
            <th>city</th>
            <th>state</th>
            <th>country</th>
            <th>Actions</th>
            
        </tr>
        </thead>
        <c:forEach var="user" items="${users}">
        <tbody>
            <tr>
                <td>${user.id}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.email}</td>
                <td>${user.phone}</td>
                <td>${user.street}</td>
                <td>${user.city}</td>
                <td>${user.state}</td>
                <td>${user.country}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/users/edit/${user.id}">Edit</a>
                    <a href="${pageContext.request.contextPath}/users/delete/${user.id}">Delete</a>
                </td>
            </tr>
            </tbody>
        </c:forEach>
    </table>
</body>
</html>