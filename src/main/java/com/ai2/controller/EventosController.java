package com.ai2.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.ai2.model.beans.Eventos;
import com.ai2.model.beans.Tipos;
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
		
		// le paso a activos.jsp la lista de TODOS los eventos.
		// en el propio JSP decidiré cuales mostrar de la lista.
		
		List<Eventos> listaEventos = evento.buscarTodos();
		model.addAttribute("listaEventos", listaEventos);
		
		return "activos";
		
	}
		
	@GetMapping("/destacados")
	public String eventosDestacados(Model model) {
		
		// le paso a destacados.jsp la lista de TODOS los eventos.
		// en el propio JSP decidiré cuales mostrar de la lista.
		
		List<Eventos> listaEventos = evento.buscarTodos();
		model.addAttribute("listaEventos", listaEventos);
		
		return "destacados";
		
	}
	
	@GetMapping("/detalle/{id}")
	public String mostrarEvento( Model model, @PathVariable( "id" ) int idEvento ) {
		
		// Obtengo el id del tipo de evento, al que pertenece el id recibido.
		
		Eventos even = evento.buscarUno(idEvento);
		Tipos tipo = even.getTipo();
		int idTipo = tipo.getIdTipo();
		
		// Le paso a detalle.jsp el evento indicado en el id,
		// la cantidad de reservas que se han hecho y
		// el id del tipo de evento.

		model.addAttribute( "eventoSeleccionado", evento.buscarUno(idEvento) );
		model.addAttribute( "cantidadReservas", reserva.totalReservas() );
		model.addAttribute("iDtipo", idTipo);
		
		return "detalle";
		
	}
	
}
