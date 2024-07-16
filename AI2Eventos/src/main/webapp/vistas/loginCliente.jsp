<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Entrada usuario</title>
  
</head>
	<body>
		
  		<main>
    		<form action="/clientes/login" method="post">
      			<fieldset>
        			<legend>Log in</legend>
        			<fieldset class="block-fieldset">
          				<legend>Información login</legend>
          				<label for="nombreUsuario">Nombre de usuario: </label>
          				<input type="text" name="nombreUsuario" id="nombreUsuario" value="${ nombreUsuario }" required>
          				<label for="password">Contraseña:</label>
          				<input type="password" name="password" id="password" required>
        			</fieldset>
        			<fieldset class="form__actions">
          				<button type="submit" name="submit" id="submit" class="btn-link cta">Log in</button>
          				<button type="reset" name="reset" id="reset" class="btn-link">Borrar formulario</button>
        			</fieldset>
        			<p class="mensaje-error">${ mensajeError }</p>
      			</fieldset>
    		</form>
  		</main>
  		<br>
    		<br>
    				<a href="/inicio">Volver Inicio</a>
  		
	</body>
</html>