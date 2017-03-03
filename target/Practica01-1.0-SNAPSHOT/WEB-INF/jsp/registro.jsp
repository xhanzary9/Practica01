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
        <h1 style = "text-align:center;">Registrate</h1>
        <hr>
        <form method="GET" action="/Practica01/registrar"style = "text-align:center;">
            <input id="nombre" name="nombre" type="text" placeholder="Nombre">
            <br>
            <input id="carrera" name="carrera" type="text" placeholder="Carrera"style = "margin-top:10px;">
            <br>
            <p>Fecha de nacimiento:</p>
            <table style = "margin-left: 43.5%;">
                <tr>
                    <td>
                        <select name="dia"> 
                            <% 
                              for(int x=1; x<=31; x++)
                              { out.println("<option>" + x + "</option>");};
                            %>
                        </select> 
                    </td>
                    <td>-</td>
                    <td>
                        <select name ="mes"> 
                            <% 
                            for(int x=1; x<=12; x++)
                            { out.println("<option>" + x + "</option>");};
                            %>
                        </select> 
                    </td>
                    <td>-</td>
                    <td>
                        <select name = "anio"> 
                            <% 
                            for(int x=1940; x<=2010; x++)
                            { out.println("<option>" + x + "</option>");};
                            %>
                        </select> 
                    </td>
                </tr>
            </table> 
            <br>
            <input id="correo" name="correo" type="text" placeholder="Correo">
            <br>
            <input id="contrasenia" name="contrasenia" type="password" placeholder="Contraseña" style = "margin-top:10px;">
            <br>
            <button style = "margin-top:10px;">Aceptar</button>
        </form>
        <br><hr>
    </body>
</html>
