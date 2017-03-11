<%-- 
    Document   : Inicio
    Created on : 2/03/2017, 03:17:20 PM
    Author     : xhanzary
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>${info}</h1>
        <hr>
        <h1>${persona.getNombre_persona()}</h1>
        <br>
        <h1>${persona.getCarrera_persona()}</h1>
        <br>
        <h1>${persona.getFechaNac_persona()}</h1>
        <br>
        <h1>${user.getCorreo_user()}</h1>
        <br>
        <h1>${user.getPassword_user()}</h1>
    </body>
</html>
