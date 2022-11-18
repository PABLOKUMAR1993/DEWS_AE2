<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="/resources/style.css">
	<title>Inicio</title>
</head>
<body>

	<section class="contenedor">
	
		<h1>AE-2 Controlar Rol clientes y sus acciones</h1>
		
		
		<!-- Muestro el menú de navegación -->
		
		<nav>
			<img src="/img/edix.png" alt="logo" class="logo"/>
			<li>
				<ul><a href="/destacados">Eventos Destacados</a></ul>
				<ul><a href="/activos">Eventos Activos</a></ul>
				<ul><a href="/reservas">Mis Reservas</a></ul>
				<ul><a href="/login">Login</a></ul>
				<ul><a href="/registro">Registro</a></ul>
				<ul><a href="/cerrar">Salir</a></ul>
				<ul>Usuario: ${sessionScope.userLogged.userName}</ul>
			</li>
			
			
			<!-- Muestro el nombre de usuario -->
			
			
		</nav>
		
		<p>Trabajo realizado por Raúl Herrera y Pavlo Dudnyk.</p>
		
		
		<!-- Si el usuario viene de registrarse se mostrará una vez el mensaje de bienvenida. -->
		
		<h2> ${ mensajeRegistroOK } </h2>
		
	</section>

</body>
</html>