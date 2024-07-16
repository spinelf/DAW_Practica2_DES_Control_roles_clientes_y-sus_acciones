<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Detalle de eventos</title>
	</head>
	<body>
		<h2>Detalles del evento #${ evento.idEvento }</h2>
   			<div>
      			<table>
        			<tbody>
          				<tr><th>Nombre</th><td>${ evento.nombreEvento }</td></tr>
          				<tr><th>Descripción</th><td>${ evento.descripcionEvento }</td></tr>
          				<tr><th>Dirección</th><td>${ evento.direccionEvento }</td></tr>
          				<tr><th>Duración</th><td>${ evento.duracionEvento }</td></tr>
          				<tr><th>Aforo máximo</th><td>${ evento.aforoMaximoEvento }</td></tr>
          				<tr><th>Aforo Mínimo</th><td>${ evento.aforoMinimoEvento }</td></tr>
        			</tbody>
      			</table>
    	  </div>
    	<div>
    		<table>
        		<tbody>
          			<tr><th>Precio</th><td>${ evento.precioEvento }&euro;</td></tr>
          			
        		</tbody>
      		</table>
      		<br>
      		<br>
        			<a href="/eventos/activos">Volver al listado</a>
        		
      </div>
      		
  
	</body>
</html>