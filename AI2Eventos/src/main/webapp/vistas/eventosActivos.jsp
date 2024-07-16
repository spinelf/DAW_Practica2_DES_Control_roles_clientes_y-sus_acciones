<%@page import="com.rolclientes.modelo.beans.Evento"%>
<%@page import="com.rolclientes.modelo.repository.EventoDaoImpl"%>
<%@page import="com.rolclientes.modelo.repository.EventoDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eventos activos</title>
</head>
<body>
	<table border="2">
					<tr>
					<th>Id del Evento</th><th>Nombre evento</th><th>Descripción evento</th><th>Precio</th><th>Reservar</th><th>Detalle</th>
					</tr>
   					 <c:forEach var="ele" items="${eventosActivos}">
      					<tr>
							<td>${ele.idEvento }</td>
							<td>${ele.nombreEvento}</td>
							<td>${ele.descripcionEvento }</td>
							<td>${ele.precioEvento }</td>
							<td><a href="/reservas/reservar">Reservar Evento</a></td>
							<td><a href="/eventos/${ele.idEvento }">Detalle Evento</a></td>
							
    					</tr>
    				</c:forEach>
    				
		</table>	
		<br>
    	<br>
		<a href="/inicio">Volver Inicio</a>
</body>
</html>