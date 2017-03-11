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
        <title>Inicio</title>
    </head>
    <body>
        <h1 style = "text-align:center;">Inicio Sesión </h1>
        <hr>
        <form method="POST" action="/Practica01/persona" style = "text-align:center;">
            <input id="correos" name="correo" type="text" placeholder="Correo">
            <br>
            <input id="contrasenias" name="contrasenia" type="password" placeholder="Contraseña"style = "margin-top:10px;">
            <br>
            <button style = "margin-top:10px;">Aceptar</button>
        </form>
        <a href="registro" style = "margin:15px 47%;"><button>Registrarse</button></a>
        <br><hr>
        
    </body>
</html>
