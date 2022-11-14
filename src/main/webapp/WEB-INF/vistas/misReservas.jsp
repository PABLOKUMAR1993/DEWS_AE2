<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body style="display: flex; flex-direction: column; align-items: center; justify-content: center; text-align: center; height: 100vh">

	<div style="height: 50vh; width: 75vw">
	
		<h1>AE-2 Controlar Rol clientes y sus acciones</h1>
		
		<nav style="display: flex">
			<p style="margin-right: 40px">LOGO</p>
			<li style="display: flex">
				<ul><a href="#">Eventos Destacados</a></ul>
				<ul><a href="#">Eventos Activos</a></ul>
				<ul><a href="#">Tipo de Evento</a></ul>
				<ul><a href="/temporal">Mis Reservas</a></ul>
				<ul><a href="/login">Login</a></ul>
				<ul><a href="#">Registro</a></ul>
				<ul><a href="#">Salir</a></ul>
			</li>
			<p style="margin-left: 80px">Nombre Usuario</p>
		</nav>
		
		<h6>Usuario: ${sessionScope.userNameMostrar}</h6>
		
	</div>

</body>

</html>