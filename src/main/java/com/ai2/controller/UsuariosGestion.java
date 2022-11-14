package com.ai2.controller;
import java.util.Date;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ai2.beans.Usuarios;
import com.ai2.repository.IntUsuarios;


@Controller
public class UsuariosGestion {

	
	// Atributos
	
	
	@Autowired
	private IntUsuarios usuario;
	
	
	// Métodos
	
	
	@GetMapping("/login")
	public String mostrarPagina() {
		
		return "login";
		
	}
	
	@GetMapping("/login/identificacion")
	public String identificacion(HttpSession sesion, Model model, @RequestParam("userName") String userName, @RequestParam("password") String password) {
		
		if ( usuario.comprobarUserName(userName) && usuario.comprobarPassword(password) ) {
			sesion.setAttribute("userNameMostrar", userName);
			return "index";
		} else {
			model.addAttribute("mensajeLogin", "Usuario o Contraseña Incorrectos");
			return "login";
		}
		
	}
	
	@GetMapping("/registro")
	public String registro() {
		usuario.asignarID();
		return "registro";
	}
	
	@PostMapping("/registro/usuarioNuevo")
	public String altaUsuario( @RequestParam( "userName" ) String userName, @RequestParam( "password" ) String password, @RequestParam( "email" ) String email,
							   @RequestParam( "nombre" ) String nombre, @RequestParam( "direccion" ) String direccion, HttpSession sesion) {
		
		// Creo un usuario con los datos pasados.
		Usuarios usuarioNuevo = new Usuarios( usuario.asignarID(), userName, password, email, nombre, direccion, 1, new Date() );
		
		// Lo añado a la lista de todos los usuarios.
		usuario.crearUsuario(usuarioNuevo);
		
		// Creo la sesión.
		sesion.setAttribute("userNameMostrar", userName);
		
		 
		return "index";
		
	}

	
	
}
