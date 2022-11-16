package com.ai2.model.repository;
import java.util.List;
import com.ai2.model.beans.Reservas;


public interface IntReservas {


	Reservas buscarUno( int idReserva );
	List<Reservas> buscarTodos();
	boolean crearReserva( Reservas reserva );
	int totalReservas();
	int obtenerId();


}
