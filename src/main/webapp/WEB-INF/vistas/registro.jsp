<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>


	<!-- Si la sesión existe, muestro su nombre y indico que vuelva a inicio. -->
	
	<c:if test="${ sessionScope.userLogged != null }">
		<p>${sessionScope.userLogged.userName}, ya estás loggeado, <a href="/">volver a inicio</a></p>
	</c:if>
	
	
	<!-- Si no, le muestro los inputs para que cree un usuario nuevo. -->

	<c:if test="${ sessionScope.userLogged == null }">

		<form method="post" action="/registro/usuarioNuevo">
			
			<label for="userName"> Nombre de Usario: </label>
			<input type="text" name="userName" placeholder="Nombre de Usario"/>
			<label for="password"> Contraseña: </label>
			<input type="password" name="password" placeholder="Contraseña"/>
			<label for="email"> E-mail: </label>
			<input type="text" name="email" placeholder="E-mail"/>
			<label for="nombre"> Nombre: </label>
			<input type="text" name="nombre" placeholder="Nombre"/>
			<label for="direccion"> Dirección: </label>
			<input type="text" name="direccion" placeholder="Dirección"/>
	
			<button style="width: 250px;">Registrarse</button>
			
		</form>
		
		<p>¿Ya tienes una cuenta? <a href="/login">Incia sesión aquí</a></p>
		
		
		<!-- En caso de que se haya producido algún error, se lo muestro aquí -->
		
		<p> ${ mensajeRegistroNOT } </p>
	
	</c:if>
		
</body>
</html>