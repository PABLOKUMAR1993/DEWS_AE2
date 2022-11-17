package com.ai2.controller;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	
	@GetMapping("/")
	public String inicio(HttpSession sesion) {
		
		// Si el usuario está loggeado le mando a index.jsp
		// Si no, le mando a login.jsp
		
		if ( sesion.getAttribute( "userLogged" ) == null ) return "login";
		else return "index";
		
	}
	
	
}
