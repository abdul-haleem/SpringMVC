<%--
  Created by IntelliJ IDEA.
  User: haleema
  Date: 9/11/2017
  Time: 05:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
</head>
<body>
<h1>Register</h1>
<sf:form method="post" commandName="spitter">
    First Name: <sf:input path="firstName"/>
    <sf:errors path="firstName"/> <br/>
    Last Name: <sf:input path="lastName"/>
    <sf:errors path="lastName"/><br/>
    Username: <sf:input path="username"/>
    <sf:errors path="username"/> <br/>
    Password: <sf:password path="password"/>
    <sf:errors path="password"/><br/>
    <input type="submit" value="Register"/>
</sf:form>

</body>
</html>
