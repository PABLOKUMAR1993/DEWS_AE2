package com.ai2.controller;
import java.util.Date;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ai2.model.beans.Usuarios;
import com.ai2.model.repository.IntUsuarios;


@Controller
public class UsuariosGestion {

	
	// Atributos
	
	
	@Autowired
	private IntUsuarios usuario;
	
	
	// Métodos
	
	
	@GetMapping("/login")
	public String mostrarPagina() {
		
		return "login"; // Muestro la página login.jsp
		
	}
	
	@GetMapping("/login/identificacion")
	public String identificacion(HttpSession sesion, Model model, @RequestParam( "userName" ) String userName, @RequestParam( "password" ) String password) {
		
		// Me guardo el suario según su userName.
		// Si el userName y el password rescibidos del form existen, muestro la página de inicio, creando la sesión con el usuario y su id.
		// Si no, muestro un mensaje de login incorrecto y nos mantenemos en login.jsp
		
		Usuarios usuarioSesion = usuario.buscarUno(userName);
		
		if ( usuario.comprobarUserName( userName ) && usuario.comprobarPassword( password ) ) {
			sesion.setAttribute( "userLogged", usuarioSesion );
			sesion.setAttribute( "userLoggedId", usuarioSesion.getIdUsuario() );
			return "index";
		} else {
			model.addAttribute( "mensajeLogin", "Usuario o Contraseña Incorrectos" );
			return "login";
		}
		
	}
	
	@GetMapping("/registro")
	public String registro() {
		
		return "registro"; // Muestro el contenido de registro.jsp
		
	}
	
	@PostMapping("/registro/usuarioNuevo")
	public String altaUsuario( @RequestParam( "userName" ) String userName, @RequestParam( "password" ) String password, @RequestParam( "email" ) String email,
							   @RequestParam( "nombre" ) String nombre, @RequestParam( "direccion" ) String direccion, HttpSession sesion, Model model) {
				
		// Creo un usuario con los datos pasados.
		Usuarios usuarioNuevo = new Usuarios( usuario.asignarID(), userName, password, email, nombre, direccion, 1, new Date() );
		
		// Lo añado a la lista de todos los usuarios.
		boolean usuarioCreado = usuario.crearUsuario(usuarioNuevo);
		
		// Si se ha creado correctamente, creo la sesión con el usuario, cómo si hubiera iniciado sesión.
		// Añado un mensaje para mostrar en la página de inicio.
		// Si no, nos mantenemos en la misma página mostrando un mensaje de error.
		if ( usuarioCreado ) {
			
			sesion.setAttribute( "userLogged", usuarioNuevo );
			model.addAttribute("mensajeRegistroOK", "Te has registrado con éxito, Bienvenido");
			return "index";
			
		} else {
			
			model.addAttribute("mensajeRegistroNOT", "Ha sucedido algún error, intentalo de nuevo");
			return "registro";
			
		}
		
	}
	
	@GetMapping("/cerrar")
	public String cerrarSesion(HttpSession sesion) {

		// Elimino los atributos de sesión y redirijo a inicio.
		sesion.removeAttribute( "userLogged" );
		sesion.removeAttribute( "userLoggedId" );
		return "redirect:/login";
		
	}

	
	
}
