<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eventos Destacados</title>
</head>
<body>
		
		
	<!-- Declaro una variable para utilizarla en el if -->
	
	<c:set value="s" var="destacado" />
		
	<h2>Eventos Destacados</h2>
		
		
	<!-- Creo la tabla para mostrar los eventos -->
	
	<table>
		<thead>
			<tr>
				<th>NOMBRE</th>
				<th>AFORO</th>
				<th>FECHA INICIO</th>
				<th>OPCIONES</th>
			</tr>
		</thead>
		
		
		<!-- Muestro un listado de todos los eventos. Si el evento está "destacado" lo muestro -->
		
		<tbody>
			<c:forEach var="evento" items="${ listaEventos }">
				<c:if test="${ evento.destacado == destacado }">
					<tr>
						<td>${ evento.nombre }</td>
						<td>${ evento.aforoMaximo }</td>
						<td>${ evento.fechaInicio }</td>
						<td><a href="/detalle/${ evento.idEvento }">Detalle</a></td>
					</tr>
				</c:if>
			</c:forEach>
		</tbody>
		
	</table>
	
	<p>Volver a <a href="/">inicio</a>.</p>
	
</body>
</html>