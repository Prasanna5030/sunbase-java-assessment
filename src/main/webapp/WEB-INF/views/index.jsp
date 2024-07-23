<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="../../styles.css">
</head>
<body align="center">
<div class="wrapper form" style="max-width:400px;margin:auto" class="shadow p-3 mb-5 bg-white rounded" class="form-group">
    <div class="title">
        <h1>Login</h1>
    </div>
    <form:form action="authenticate" method="POST" modelAttribute="authenticationRequest" >
        <div class="field">
            <label>Email Address</label>
            <form:input type="text" path="email" class="form-control"/>

        </div>
        <div class="field">
            <label>Password</label>
            <form:input type="password" path="password" class="form-control"/>

        </div>
        
        <div class="field">
            <input type="submit" value="Login" class="btn btn-success">
        </div>
        <div class="signup-link">
            Not a member? <a href="/signup">Signup now</a>
        </div>
    </form:form>
</div>
</body>
</html>