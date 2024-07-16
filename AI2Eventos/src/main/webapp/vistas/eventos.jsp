<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 		<table border="2">
					<tr>
					<th>Id del Evento</th><th>Nombre evento</th><th>Descripción evento</th><th>Precio</th><th>Reservar</th>
					</tr>
   					 <c:forEach var="ele" items="${todos}">
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
    				<a href="/eventos/activos">Ver Eventos Activos</a>
    				<a href="/eventos/destacados">Ver Eventos Destacados</a>
</body>
</html>