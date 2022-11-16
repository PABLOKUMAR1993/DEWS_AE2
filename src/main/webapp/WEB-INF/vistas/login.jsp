<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body style="display: flex; flex-direction: column; align-items: center; justify-content: center; text-align: center; height: 100vh">

	<div style="height: 50vh; width: 75vw">

		<c:if test="${ sessionScope.userLogged != null }">
	
			<p>${sessionScope.userLogged.userName}, ya estás loggeado, <a href="/">volver a inicio</a></p>
		
		</c:if>
		
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
				<button>Iniciar Sesión</button>
				
			</form>
			
			<p>mensaje login:  ${mensajeLogin}</p>
			<p>¿No tienes cuenta? <a href="/registro">Create una aquí</a></p>
	
		</c:if>
		
	</div>
	

</body>
</html>