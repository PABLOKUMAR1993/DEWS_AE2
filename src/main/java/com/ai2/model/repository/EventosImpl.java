package com.ai2.model.repository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.ai2.model.beans.Eventos;


@Repository
public class EventosImpl implements IntEventos {

	
	// Atributos
	
	
	private List<Eventos> eventos;
	
	
	// Métodos Propios
	
	
	public EventosImpl() {
		
		eventos = new ArrayList<>();
		crearEventos();
		
	}
	
	public void crearEventos() {
		
		IntTipos tipos = new TiposImpl(); // Necesito esta variable para acceder a los tipos de evento.
		
		eventos.add( new Eventos ( 01, "Boda de Thor y Freyja", "Se van a casar los gatos Thor y Freyja", new Date(), 12,
								  "En casa de Thor", "activo", 'n', 300, 50, 150, tipos.buscarUno( 04 ) ) );
		eventos.add( new Eventos ( 02, "Cumpleaños de Thor y Freyja", "Se van a celebrar el cumple de los gatos Thor y Freyja", new Date(), 9,
								  "En casa de Freyja", "activo", 's', 100, 10, 50, tipos.buscarUno( 03 ) ) );
		eventos.add( new Eventos ( 03, "Despedida de Thor y Freyja", "Se van a celebrar la despedida de la boda de los gatos Thor y Freyja", new Date(), 16,
								  "En casa de Freyja", "activo", 's', 400, 40, 50, tipos.buscarUno( 02 ) ) );
		eventos.add( new Eventos ( 04, "Concierto de la Boda de los gatos Thor y Freyja", "Se van a celebrar un concierto para Thor y Freyja", new Date(), 12,
								  "En el patio de Thor", "inactivo", 'n', 500, 25, 35, tipos.buscarUno( 01 ) ) );
		
	}
	
	
	// Métodos Implementados
	
	
	@Override
	public Eventos buscarUno( int idEvento ) {
		
		// Explicación del funcionamiento de este método en la clase TiposImpl.
		
		Eventos aux = new Eventos();
		aux.setIdEvento(idEvento);
		int index = eventos.indexOf( aux );
		
		if ( index == -1 ) {
			return null;
		} else {
			return eventos.get( index );
		}
		
	}

	@Override
	public List<Eventos> buscarTodos() {
		
		return eventos;
		
	}

	@Override
	public boolean crearEvento( Eventos evento ) {
		
		// Si el evento existe devuelvo false, si no, lo creo, lo añado a la lista y devuelvo ture.
		
		if ( eventos.contains(evento) ) { 
			return false;
		} else {
			eventos.add( evento ); 
			return true;
		}
		
	}

	@Override
	public boolean editarEvento( Eventos evento ) {
		
		// Localizo el indice del evento, si el indice es -1 esque no existe dicho evento para modificarlo.
		// En caso contrario, usando el método set de ArrayList, le paso el indice del evento y lo sobre escribo por el nuevo.
		
		int index = eventos.indexOf( evento ); 
		
		if ( index == -1 ) { 
			return false;
		} else { 
			eventos.set( index, evento );
			return true;
		}
		
	}

	@Override
	public boolean eliminarEvento( Eventos evento ) {
		
		// Si se ha eliminado el evento esque existe y devuelvo true, si no, false.
		
		return eventos.remove( evento ) ? true : false;
		
	}

	@Override
	public boolean cancelarEvento(Eventos evento) {
		
		// Compruebo si el estado del evento es "activo", si es así, lo cambio a "inactivo",
		// lo sobre escribo en la lista de eventos y devuelvo ture.
		
		int index = eventos.indexOf( evento );
		
		if ( evento.getEstado() == "activo" ) {
			evento.setEstado( "inactivo" );
			eventos.set( index, evento );
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean activarEvento(Eventos evento) {
		
		// Compruebo si el estado del evento es "inactivo", si es así, lo cambio a "activo",
		// lo sobre escribo en la lista de eventos y devuelvo ture.
		
		int index = eventos.indexOf( evento );
		
		if ( evento.getEstado() == "inactivo" ) {
			evento.setEstado( "activo" );
			eventos.set( index, evento );
			return true;
		} else {
			return false;
		}
		
	}
	
	
}
