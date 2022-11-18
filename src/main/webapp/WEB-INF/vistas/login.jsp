<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="/resources/style.css">
	<title>Login</title>
</head>
<body>

	<section class="contenedor">
	
		<h1>Login</h1>
	
		<!-- Si la sesión existe, muestro su nombre y indico que vuelva a inicio. -->
	
		<c:if test="${ sessionScope.userLogged != null }">
			<p>${sessionScope.userLogged.userName}, ya estás loggeado. <a href="/">Volver a inicio</a>.</p>
		</c:if>
		
		
		<!-- Si no, le muestro los inputs para que me indique que usuario es. -->
		
		<c:if test="${ sessionScope.userLogged == null }">
		
			<form method="get" action="/login/identificacion">
				<label for="userName">
					Nombre de Usario:
					<input type="text" name="userName" placeholder="Nombre de Usario"/>
				</label>
				<label for="password">
					Contraseña:
					<input type="password" name="password" placeholder="Contraseña"/>
				</label>
				<button class="btnLogin">Iniciar Sesión</button>
			</form>
			
			<p>¿No tienes cuenta? <a href="/registro">Create una aquí</a></p>
			
			
			<!-- En caso de que el usuario o la contraseña no sean encontrados se lo muestro aquí -->
			
			<p>${mensajeLogin}</p>
	
		</c:if>
		
	</section>
	
</body>
</html>