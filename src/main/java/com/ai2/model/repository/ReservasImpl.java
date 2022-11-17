package com.ai2.model.repository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.ai2.model.beans.Reservas;


@Repository
public class ReservasImpl implements IntReservas {

	
	// Atrivutos
	
	
	private List<Reservas> reservas;
	
	
	// Métodos Propios
	
	
	public ReservasImpl() {
		
		reservas = new ArrayList<>();
		//crearReservas();
		
	}
	
	public void crearReservas() {
		
		IntEventos evento = new EventosImpl();
		IntUsuarios usuario = new UsuariosImpl();
		
		reservas.add( new Reservas ( 01, evento.buscarUno(01), usuario.buscarUno(01), evento.buscarUno(01).getPrecio(), "Ejemplo de observaciones 01", 3 ) );
		reservas.add( new Reservas ( 02, evento.buscarUno(02), usuario.buscarUno(02), evento.buscarUno(02).getPrecio(), "Ejemplo de observaciones 02", 4 ) );
		reservas.add( new Reservas ( 03, evento.buscarUno(03), usuario.buscarUno(01), evento.buscarUno(03).getPrecio(), "Ejemplo de observaciones 03", 5 ) );
		reservas.add( new Reservas ( 04, evento.buscarUno(04), usuario.buscarUno(02), evento.buscarUno(04).getPrecio(), "Ejemplo de observaciones 04", 6 ) );
		
	}
	
	
	//Métodos Implementados
	
	
	@Override
	public Reservas buscarUno(int idReserva) {
		
		Reservas aux = new Reservas(); // Creo una variable de la clase llamando al contructor vacio.
		aux.setIdReserva(idReserva); // Al objeto "aux" le asigno un id, que es el mismo que recibo cómo argumento.
		int index = reservas.indexOf( aux ); // Busco en la lista un objeto con mismo id.
		
		if ( index == -1 ) { // Si devuelve -1 significa que no ha entrado uno igual.
			return null;
		} else {
			return reservas.get( index ); // Devuelvo el objeto almacenado en el indice indicado.
		}
		
	}

	@Override
	public List<Reservas> buscarTodos() {

		return reservas; // Devuelvo la lista completa.
		
	}

	@Override
	public boolean crearReserva(Reservas reserva) {
		
		// Si la reserva no existe todavía, la añado a la lista y devuelvo true.
		
		if ( reservas.contains( reserva ) ) { 
			return false;
		} else {
			reservas.add( reserva  ); 
			return true;
		}
		
	}

	@Override
	public int totalReservas() {
		
		// Devuelvo el total de elementos en la lista, para saber cuantas reservas se han hecho.
		return reservas.size();
		
	}

	@Override
	public int obtenerId() {
		
		// Para que no se repita el id le asigno el total de elementos + 1.
		return ( reservas.size() + 1 );
		
	}
	

}
