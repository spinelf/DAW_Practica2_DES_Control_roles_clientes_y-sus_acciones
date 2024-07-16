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
<title> Aplicacion gestion de eventos</title>
</head>
<body>
<body>

				<table border="2">
					<tr>
						<th><a href="/tipos">Tipos</a></th>
						<th><a href="/eventos/todos">Eventos</a></th>
						<th><a href="/tipos">Usuarios</a></th>
						<th><a href="/tipos">Eventos/tipos</a></th>
						<th><a href="/reservas/reservar">Reservas</a></th>
						<th><a href="/clientes/login">Login</a></th>
						<th><a href="/clientes/altaClientes">Registrar</a></th>
					</tr>
				</table>
				
				
					
	</body>
</html>