<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>New User</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body align="center">
<div class="form" style="max-width:400px;margin:auto" class="shadow p-3 mb-5 bg-white rounded">
    <h1>Sign Up now</h1>
    <form:form action="${pageContext.request.contextPath}/users" method="post" modelAttribute="user" class="form-group">
        <label>First Name:</label>
        <form:input path="firstName" class="form-control"/>
        <br>
        <label>Last Name:</label> 
        <form:input path="lastName" class="form-control"/>
        <br>
        <label>Email:</label>
        <form:input path="email" class="form-control"/>
        <br>
        <label>Password:</label>
        <form:input path="password" class="form-control"/>
        <br>
        <label>Phone:</label>
        <form:input path="phone" class="form-control"/>
        <br>
        <label>street:</label>
        <form:input path="street" class="form-control"/>
        <br>
         <label>city:</label>
        <form:input path="city" class="form-control"/>
        <br>
         <label>State:</label>
        <form:input path="state" class="form-control"/>
        <br>
         <label>Country:</label>
          <form:input path="country" class="form-control"/>
        <br>
        
       
        <form:input path="role" type="hidden" value="USER"/>
        <br>
        <input type="submit" value="Register" class="btn btn-primary"/>
    </form:form>
    </div>
</body>
</html>