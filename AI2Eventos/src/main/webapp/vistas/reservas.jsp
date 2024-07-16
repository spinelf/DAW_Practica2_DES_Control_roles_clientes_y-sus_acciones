<%@page import="java.util.List"%>
<%@page import="com.rolclientes.modelo.beans.Evento"%>
<%@page import="com.rolclientes.modelo.repository.EventoDaoImpl"%>
<%@page import="com.rolclientes.modelo.repository.EventoDao"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Gestión de reservas</title>
</head>
<body>
<body>

				<table border="2">
					<tr>
						<th><a href="/sinFuncion">Tipos</a></th>
						<th><a href="/eventos/todos">Eventos</a></th>
						<th><a href="/sinFuncion">Usuarios</a></th>
						<th><a href="/sinFuncion">Eventos/tipos</a></th>
						<th><a href="/reservas/reservar">Reservas</a></th>
						<th><a href="/clientes/login">Login</a></th>
						<th><a href="/clientes/altaClientes">Registrar</a></th>
					</tr>
				</table>
				
				<table border="2">
					<tr>
					<th>Id Reserva</th><th>Precio Venta</th><th>Cantidad</th><th>Observaciones</th>
					</tr>
   					 <c:forEach var="ele" items="${reservas}">
      					<tr>
							<td>${ele.idReserva }</td>
							<td>${ele.precioVenta}</td>
							<td>${ele.cantidad }</td>
							<td>${ele.observacionesReserva }</td>
							
    					</tr>
    				</c:forEach>



	</table>
					
	</body>
</html>