<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
				<ul><a href="/activos">Eventos Activos</a></ul>
				<ul><a href="#">Tipo de Evento</a></ul>
				<ul><a href="/temporal">Mis Reservas</a></ul>
				<ul><a href="/login">Login</a></ul>
				<ul><a href="/registro">Registro</a></ul>
				<ul><a href="/cerrar">Salir</a></ul>
			</li>
			<p style="margin-left: 80px">Nombre Usuario: ${sessionScope.userNameMostrar}</p>
		</nav>
		
		<table>
		
			<tr>
			
				<th>NOMBRE</th>
				<th>AFORO</th>
				<th>FECHA INICIO</th>
				<th>OPCIONES</th>
			
			</tr>
			
			
			<c:forEach var="evento" items="${ listaEventos }">
				
				<tr>
					<td>${ evento.nombre }</td>
					<td>${ evento.aforoMaximo }</td>
					<td>${ evento.fechaInicio }</td>
					<td><a href="/detalle/${ evento.idEvento }">Detalle</a></td>
				</tr>
				
			</c:forEach>
			
		
		</table>
		
	</div>
	
</body>
</html>