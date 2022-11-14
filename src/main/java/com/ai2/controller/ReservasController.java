package com.ai2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservasController {

	
	@GetMapping("/temporal")
	public String temporal() {
		return "misReservas";
	}
	
}
