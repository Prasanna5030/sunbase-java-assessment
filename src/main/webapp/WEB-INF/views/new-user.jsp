<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>New User</title>
</head>
<body>
    <h1>New User</h1>
    <form:form action="${pageContext.request.contextPath}/users" method="post" modelAttribute="user">
        <label>First Name:</label>
        <form:input path="firstName"/>
        <br>
        <label>Last Name:</label>
        <form:input path="lastName"/>
        <br>
        <label>Email:</label>
        <form:input path="email"/>
        <br>
        <label>Phone:</label>
        <form:input path="phone"/>
        <br>
        <label>Address:</label>
        <form:input path="address"/>
        <br>
        <input type="submit" value="Save"/>
    </form:form>
</body>
</html>