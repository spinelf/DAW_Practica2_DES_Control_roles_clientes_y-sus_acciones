<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta cliente</title>
</head>
<body>
	<!-- En esta página podemos introducir los datos para dar de alta un Cliente -->


<title> Formulario alta cliente</title>
</head>

<body>
<form action="/clientes/alta" method="post">
      			<fieldset>
        			<legend>Alta nuevo usuario</legend>
        			<fieldset>
          				<label for="nombreUsuario">Nombre:</label>
          				<input type="text" name="nombreUsuario" id="nombreUsuario" required>
          				<label for="mailCliente">Email:</label>
          				<input type="email" name="mailCliente" id="mailCliente" required>
          				<label for="direccionCliente">Dirección:</label>
          				<input type="text" name="direccionCliente" id="direccionCliente" required>
          				<label for="usuarioCliente">Usuario:</label>
          				<input type="text" name="usuarioCliente" id="usuarioCliente" required>
          				<label for="password">Contraseña:</label>
          				<input type="password" name="password" id="password" required>
        			</fieldset>
        			<fieldset class="form__actions">
          				<button type="submit" name="submit" id="submit">Registrarse</button>
          				<button type="reset" name="reset" id="reset">Borrar formulario</button>
        			</fieldset>
      			</fieldset>
    		</form>
    		<br>
    		<br>
    				<a href="/inicio">Volver Inicio</a>
</body>
</html>