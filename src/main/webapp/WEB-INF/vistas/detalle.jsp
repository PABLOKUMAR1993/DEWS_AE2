<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/resources/style.css">
<title>Insert title here</title>
</head>
<body>


	<!-- Muestro en una tabla el evento seleccionado por su ID -->

	<table>
		<tr>
			<th>NOMBRE</th>
			<th>DESCRIPCIÓN</th>
			<th>DIRECCIÓN</th>
			<th>FECHA INICIO</th>
			<th>DURACIÓN</th>
			<th>AFOTO MÁXIMO</th>
			<th>ASISTENCIA MÍNIMA</th>
		</tr>
		<tr>
			<td>${ eventoSeleccionado.nombre }</td>
			<td>${ eventoSeleccionado.descripcion }</td>
			<td>${ eventoSeleccionado.direccion }</td>
			<td>${ eventoSeleccionado.fechaInicio }</td>
			<td>${ eventoSeleccionado.duracion }</td>
			<td>${ eventoSeleccionado.aforoMaximo }</td>
			<td>${ eventoSeleccionado.asistenciaMinima }</td>
		</tr>
	</table>


	<!-- Hago un formulario para hacer la reserva -->

	<form method="post" action="/reservar/${ eventoSeleccionado.idEvento }">
	
		<label for="cantidad">Cantidad (máximo 10):</label>
		<input type="number" name="cantidad" placeholder="Cantidad a reservar"/>
		<label for="observaciones">Observaciones:</label>
		<textarea name="observaciones" placeholder="Observaciones..." ></textarea>
		<button type="submit"> Reservar </button>
	
	</form>

	<p>Precio del evento: ${ eventoSeleccionado.precio } euros.</p>


	<!-- Para indicar las entradas restantes, cojo el total de plazas y le resto las plazas reservadas -->	
	
	<p>Quédan: ${ eventoSeleccionado.aforoMaximo - cantidadReservas } entradas.</p>
	
	
	<!-- Según el id del tipo de evento, muestro una imágen diferente -->
	
	<c:if test="${ iDtipo == 01 }"><img src="/img/concierto.jpg" /></c:if>
	<c:if test="${ iDtipo == 02 }"><img src="/img/despedida.jpg" /></c:if>
	<c:if test="${ iDtipo == 03 }"><img src="/img/cumpleanyos.jpg" /></c:if>
	<c:if test="${ iDtipo == 04 }"><img src="/img/boda.jpg" /></c:if>


	<p>Volver a <a href="/">inicio</a>.</p>
	
</body>
</html>