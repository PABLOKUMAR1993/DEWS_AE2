<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/resources/style.css">
<title>Insert title here</title>
</head>
<body style="display: flex; flex-direction: column;">

	<table>
	
		<tr>
			<th style="border: 2px solid black;">NOMBRE</th>
			<th style="border: 2px solid black;">DESCRIPCIÓN</th>
			<th style="border: 2px solid black;">DIRECCIÓN</th>
			<th style="border: 2px solid black;">FECHA INICIO</th>
			<th style="border: 2px solid black;">DURACIÓN</th>
			<th style="border: 2px solid black;">AFOTO MÁXIMO</th>
			<th style="border: 2px solid black;">ASISTENCIA MÍNIMA</th>
		</tr>
		
		<tr>
			<td style="border: 2px solid black;">${ eventoSeleccionado.nombre }</td>
			<td style="border: 2px solid black;">${ eventoSeleccionado.descripcion }</td>
			<td style="border: 2px solid black;">${ eventoSeleccionado.direccion }</td>
			<td style="border: 2px solid black;">${ eventoSeleccionado.fechaInicio }</td>
			<td style="border: 2px solid black;">${ eventoSeleccionado.duracion }</td>
			<td style="border: 2px solid black;">${ eventoSeleccionado.aforoMaximo }</td>
			<td style="border: 2px solid black;">${ eventoSeleccionado.asistenciaMinima }</td>
		</tr>
	
	</table>

	<form method="post" action="/reservar/${ eventoSeleccionado.idEvento }">
	
		<p>Quédan: ${ eventoSeleccionado.aforoMaximo - cantidadReservas } entradas.</p>
		<label for="cantidad">Cantidad (máximo 10):</label>
		<input type="number" name="cantidad" placeholder="Cantidad a reservar"/>
		<label for="observaciones">Observaciones:</label>
		<textarea name="observaciones" placeholder="Observaciones..."></textarea>
		<button type="submit"> Reservar </button>
	
	</form>

	<img src="/img/boda.jpg" />

</body>
</html>