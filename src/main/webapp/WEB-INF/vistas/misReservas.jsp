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
	
		<h1>Mis Reservas</h1>
		
		<p>${ mensaje }</p>
		
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
					<td>${ reserva.precioVeta }</td>
					<td>${ reserva.observaciones }</td>
					<td>${ reserva.cantidad }</td>
				</tr>
				
			</c:forEach>
			</table>
			
			<p><a href="/">volver a inicio</a></p>
			
		</c:if>
		
		<c:if test="${ listadoReservas == [] }">
		
			<p>No has realizado todavía ninguna reserva, <a href="/">volver a inicio</a></p>
		
		</c:if>
		
	</div>

</body>

</html>