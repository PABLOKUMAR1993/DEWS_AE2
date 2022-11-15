package com.ai2.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.ai2.beans.Eventos;
import com.ai2.repository.IntEventos;


@Controller
public class EventosController {

	
	// Atributos
	
	@Autowired
	private IntEventos evento;
	//@Autowired
	//private List<Eventos> listaEventos;
	
	
	// Métodos
	
	
	@GetMapping("/activos")
	public String eventosActivos(Model model) {
		
		List<Eventos> listaEventos = evento.buscarTodos();
		model.addAttribute("listaEventos", listaEventos);
		return "activos";
		
	}
	
	
}
