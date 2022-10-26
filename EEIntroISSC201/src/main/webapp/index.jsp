<%-- 
    Document   : index
    Created on : Oct 20, 2022, 10:24:33 AM
    Author     : Lokil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>
        <%
            String nombre = "Angel";
            out.print(nombre);
        %>
        </h1>
        
        <a href="/EEIntroISSC201/ServletM">Acceso al Servlet</a>
    </body>
</html>
