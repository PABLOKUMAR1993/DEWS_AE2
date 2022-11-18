package com.ai2.controller;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ai2.model.beans.Reservas;
import com.ai2.model.repository.IntEventos;
import com.ai2.model.repository.IntReservas;
import com.ai2.model.repository.IntUsuarios;


@Controller
public class ReservasController {

	
	// Atributos
	
	
	@Autowired
	private IntReservas reserva;
	@Autowired
	private IntEventos evento;
	@Autowired
	private IntUsuarios usuario;
	
	
	// Métodos
	
	@GetMapping("/reservas")
	public String verReservas(Model model) {
		
		// Le paso una lista de TODAS las reservas.
		
		model.addAttribute("listadoReservas", reserva.buscarTodos());
		
		return "misReservas";
		
	}
	
	@PostMapping("/reservar/{idEvento}")
	public String reservar( @PathVariable( "idEvento" ) int idEvento, @RequestParam( "cantidad" ) int cantidad,
			@RequestParam( "observaciones" ) String observaciones, HttpSession sesion, RedirectAttributes redir ) {
		
		// Creo una nueva reserva.
		
		Reservas reservaNueva = new Reservas ( reserva.obtenerId(), evento.buscarUno(idEvento), usuario.buscarUno( (int) sesion.getAttribute("userLoggedId") ),
				evento.buscarUno(idEvento).getPrecio(), observaciones, cantidad );
		
		// Añado la reserva a la lista de reservas.
		
		boolean reservaCreada = reserva.crearReserva( reservaNueva );

		// Según si la reserva se ha creado o no, paso un mensaje u otro mediante redirect a reservas.jsp.
		
		if ( reservaCreada )redir.addFlashAttribute("mensajeReserva", "Evento reservado con éxito" );
		else redir.addFlashAttribute( "mensajeReserva", "Ha habido un error al procesar tu reserva" );	
		
		return "redirect:/reservas";
	
	}
	
}
