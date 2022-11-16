<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Inicio</title>
</head>
<body style="display: flex; flex-direction: column; align-items: center; justify-content: center; text-align: center; height: 100vh">

	<c:if test="${ sessionScope.userLogged != null }">
	
	<div style="height: 50vh; width: 75vw">
	
		<h1>AE-2 Controlar Rol clientes y sus acciones</h1>
		
		<nav style="display: flex">
			<p style="margin-right: 40px">LOGO</p>
			<li style="display: flex">
				<ul><a href="/destacados">Eventos Destacados</a></ul>
				<ul><a href="/activos">Eventos Activos</a></ul>
				<ul><a href="/reservas">Mis Reservas</a></ul>
				<ul><a href="/login">Login</a></ul>
				<ul><a href="/registro">Registro</a></ul>
				<ul><a href="/cerrar">Salir</a></ul>
			</li>
			<p style="margin-left: 80px">Nombre Usuario: ${sessionScope.userLogged.userName}</p>
		</nav>
		
	</div>

	</c:if>
	
	<c:if test="${ sessionScope.userLogged == null }">
	
		<div style="height: 50vh; width: 75vw">
	
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
		
	</div>
	
	</c:if>

</body>
</html>