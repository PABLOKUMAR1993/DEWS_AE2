<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body style="display: flex; flex-direction: column; align-items: center; justify-content: center; text-align: center; height: 100vh">

	<div style="height: 50vh; width: 75vw">
	
		<form method="get" action="/login/identificacion">
			
			<label for="userName">
				Nombre de Usario:
				<input type="text" name="userName" placeholder="Nombre de Usario"/>
			</label>
			<label for="password">
				Contrase�a:
				<input type="password" name="password" placeholder="Contrase�a"/>
			</label>
			<button>Iniciar Sesi�n</button>
			
		</form>
		
		<p>mensaje login:  ${mensajeLogin}</p>
		<p>�No tienes cuenta? <a href="#">Create una aqu�</a></p>
		
	</div>

</body>
</html>