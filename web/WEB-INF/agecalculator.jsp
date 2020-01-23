<%-- 
    Document   : agecalculator
    Created on : Jan 22, 2020, 4:51:25 PM
    Author     : 638981
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="POST">
            Enter you age: <input type="text" name="yourAge"><br>
            <input type="submit" value="Age next birthday"><br>
        </form>
        ${message}<br>
        <a href="">Arithmetic Calculator</a>
    </body>
</html>
