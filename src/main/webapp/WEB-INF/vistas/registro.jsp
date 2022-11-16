<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body style="display: flex; flex-direction: column; align-items: center; justify-content: center; text-align: center; height: 100vh">

	<div style="height: 50vh; width: 75vw">
	
		<c:if test="${ sessionScope.userLogged != null }">
		
			<p>${sessionScope.userLogged.userName}, ya estás loggeado, <a href="/">volver a inicio</a></p>
		
		</c:if>
	
		<c:if test="${ sessionScope.userLogged == null }">
		
		<form method="post" action="/registro/usuarioNuevo" style=" display: flex; flex-direction: column; align-items: center; justify-content: center;">
			
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
		
		<p>mensaje login:  ${mensajeLogin}</p>
		<p>¿No tienes cuenta? <a href="#">Create una aquí</a></p>
		
		</c:if>
		
	</div>

</body>
</html>