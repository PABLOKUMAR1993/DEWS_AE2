<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>


	<!-- Si la sesi�n existe, muestro su nombre y indico que vuelva a inicio. -->
	
	<c:if test="${ sessionScope.userLogged != null }">
		<p>${sessionScope.userLogged.userName}, ya est�s loggeado, <a href="/">volver a inicio</a></p>
	</c:if>
	
	
	<!-- Si no, le muestro los inputs para que cree un usuario nuevo. -->

	<c:if test="${ sessionScope.userLogged == null }">

		<form method="post" action="/registro/usuarioNuevo">
			
			<label for="userName"> Nombre de Usario: </label>
			<input type="text" name="userName" placeholder="Nombre de Usario"/>
			<label for="password"> Contrase�a: </label>
			<input type="password" name="password" placeholder="Contrase�a"/>
			<label for="email"> E-mail: </label>
			<input type="text" name="email" placeholder="E-mail"/>
			<label for="nombre"> Nombre: </label>
			<input type="text" name="nombre" placeholder="Nombre"/>
			<label for="direccion"> Direcci�n: </label>
			<input type="text" name="direccion" placeholder="Direcci�n"/>
	
			<button style="width: 250px;">Registrarse</button>
			
		</form>
		
		<p>�Ya tienes una cuenta? <a href="/login">Incia sesi�n aqu�</a></p>
		
		
		<!-- En caso de que se haya producido alg�n error, se lo muestro aqu� -->
		
		<p> ${ mensajeRegistroNOT } </p>
	
	</c:if>
		
</body>
</html>