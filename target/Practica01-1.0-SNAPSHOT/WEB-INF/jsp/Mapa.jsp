<%-- 
    Document   : Mapa
    Created on : 20/02/2017, 11:20:12 PM
    Author     : xhanzary
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<c:url value="/css/styles.css"/> ">
        <script src=" <c:url value="/js/mapa.js"/> "></script>
        <title>Mapa</title>
    </head>
    <body>
        <div id="map"></div>
        <!-- Latest compiled and minified JavaScript -->
	<script src="http://code.jquery.com/jquery-latest.js"></script>
        <script async defer
             src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBAh0iPRXyxLlBEc2z93ddYtiD5f5TjdCk&callback=initMap">
        </script>
    </body>
</html>
