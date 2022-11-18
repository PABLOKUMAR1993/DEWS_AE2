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
	
		<!-- Si la sesi�n existe, muestro su nombre y indico que vuelva a inicio. -->
	
		<c:if test="${ sessionScope.userLogged != null }">
			<p>${sessionScope.userLogged.userName}, ya est�s loggeado. <a href="/">Volver a inicio</a>.</p>
		</c:if>
		
		
		<!-- Si no, le muestro los inputs para que me indique que usuario es. -->
		
		<c:if test="${ sessionScope.userLogged == null }">
		
			<form method="get" action="/login/identificacion">
				<label for="userName">
					Nombre de Usario:
					<input type="text" name="userName" placeholder="Nombre de Usario"/>
				</label>
				<label for="password">
					Contrase�a:
					<input type="password" name="password" placeholder="Contrase�a"/>
				</label>
				<button class="btnLogin">Iniciar Sesi�n</button>
			</form>
			
			<p>�No tienes cuenta? <a href="/registro">Create una aqu�</a></p>
			
			
			<!-- En caso de que el usuario o la contrase�a no sean encontrados se lo muestro aqu� -->
			
			<p>${mensajeLogin}</p>
	
		</c:if>
		
	</section>
	
</body>
</html>