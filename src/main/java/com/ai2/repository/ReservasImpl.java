package com.ai2.repository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ai2.beans.Reservas;


@Repository
public class ReservasImpl implements IntReservas {

	
	// Atrivutos
	
	
	private List<Reservas> reservas;
	
	
	// Métodos Propios
	
	
	public ReservasImpl() {
		
		reservas = new ArrayList<>();
		crearReservas();
		
	}
	
	public void crearReservas() {
		
		IntEventos evento = new EventosImpl();
		IntUsuarios usuario = new UsuariosImpl();
		
		reservas.add( new Reservas ( 01, evento.buscarUno(01), usuario.buscarUno(01), 19.95, "Ejemplo de observaciones 01", 3 ) );
		reservas.add( new Reservas ( 02, evento.buscarUno(02), usuario.buscarUno(02), 29.95, "Ejemplo de observaciones 02", 4 ) );
		reservas.add( new Reservas ( 03, evento.buscarUno(03), usuario.buscarUno(01), 39.95, "Ejemplo de observaciones 03", 5 ) );
		reservas.add( new Reservas ( 04, evento.buscarUno(04), usuario.buscarUno(02), 49.95, "Ejemplo de observaciones 04", 6 ) );
		
	}
	
	
	//Métodos Implementados
	
	
	@Override
	public Reservas buscarUno(int idReserva) {

		// Explicación del funcionamiento de este método en la clase TiposImpl.
		
		Reservas aux = new Reservas();
		aux.setIdReserva(idReserva);
		int index = reservas.indexOf( aux );
		
		if ( index == -1 ) {
			return null;
		} else {
			return reservas.get( index );
		}
		
	}

	@Override
	public List<Reservas> buscarTodos() {

		return reservas;
		
	}
	

}
