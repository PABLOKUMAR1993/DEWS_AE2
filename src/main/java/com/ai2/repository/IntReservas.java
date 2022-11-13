package com.ai2.repository;
import java.util.List;
import com.ai2.beans.Reservas;


public interface IntReservas {

	
	Reservas buscarUno(int idReserva);
	List<Reservas> buscarTodos();
	
	
}
