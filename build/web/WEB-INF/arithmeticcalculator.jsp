<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 22, 2020, 9:27:10 PM
    Author     : Phillip Obiora
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Arithmetic Calculator</h1>
            <form action="arithmetic" method="POST">
                First: <input type="text" name="first" value="${first}"><br>
                Second: <input type="text" name="second" value="${second}"><br>
                <input type="submit" name="calc" value="+">
                <input type="submit" name="calc" value="-">
                <input type="submit" name="calc" value="*">
                <input type="submit" name="calc" value="%"><br>
            </form>
            Result: ${result}<br>
            <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
