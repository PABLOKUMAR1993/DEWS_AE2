package com.ai2.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ai2.model.beans.Eventos;
import com.ai2.model.repository.IntEventos;
import com.ai2.model.repository.IntReservas;


@Controller
public class EventosController {

	
	// Atributos
	
	
	@Autowired
	private IntEventos evento;
	@Autowired
	private IntReservas reserva;
	
	
	// Métodos
	
	
	@GetMapping("/activos")
	public String eventosActivos(Model model) {
		
		List<Eventos> listaEventos = evento.buscarTodos();
		model.addAttribute("listaEventos", listaEventos);
		return "activos";
		
	}
	
	@GetMapping("/detalle/{id}")
	public String mostrarEvento( Model model, @PathVariable( "id" ) int idEvento ) {
		
		model.addAttribute( "eventoSeleccionado", evento.buscarUno(idEvento) );
		model.addAttribute( "cantidadReservas", reserva.totalReservas() );
		return "detalle";
		
	}
	
	@GetMapping("/destacados")
	public String eventosDestacados(Model model) {
		
		List<Eventos> listaEventos = evento.buscarTodos();
		model.addAttribute("listaEventos", listaEventos);
		return "destacados";
		
	}
	
	
}
