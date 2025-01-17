<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="/resources/style.css">
	<title>Mis Reservas</title>
</head>

<body>
	
	<section class="contenedor">
	
		<h1>Mis Reservas</h1>
		
		
		<!-- Si hay reservas, muestro la lista de reservas del usuario -->
		
		<c:if test="${ listadoReservas != [] }">
			<table>
			<tr>
				<th>ID RESERVA</th>
				<th>PRECIO EVENTO</th>
				<th>OBSERVACIONES</th>
				<th>CANTIDAD RESERVADA</th>
			</tr>
			<c:forEach var="reserva" items="${ listadoReservas }">
				<tr>
					<td>${ reserva.idReserva }</td>
					<td>${ reserva.precioVeta } euros.</td>
					<td>${ reserva.observaciones }</td>
					<td>${ reserva.cantidad }</td>
				</tr>
			</c:forEach>
			</table>
			
			<p><a href="/">volver a inicio</a></p>
			
		</c:if>
		
		
		<!-- Si no hay reservas, lo indico con un mensaje. -->
		
		<c:if test="${ listadoReservas == [] }">
		
			<p>No has realizado todav�a ninguna reserva, <a href="/">volver a inicio</a></p>
		
		</c:if>
		
		
		<!-- Muestro un mensaje de si ha sido reservado o no -->
		
		<h3>${ mensajeReserva }</h3>

	</section>

</body>

</html>