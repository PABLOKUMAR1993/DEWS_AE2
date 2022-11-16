package com.ai2.model.repository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.ai2.model.beans.Tipos;


@Repository
public class TiposImpl implements IntTipos {

	
	// Atributos
	
	
	private List<Tipos> tipos;
	
	
	// Métodos Propios
	
	
	public TiposImpl() {
		
		tipos = new ArrayList<>();
		crearTipos();
		
	}
	
	public void crearTipos() {
		
		tipos.add( new Tipos ( 01, "CONCIERTO", "Conciertos de cantantes." ) );
		tipos.add( new Tipos ( 02, "DESPEDIDA", "Despedida de soltero." ) );
		tipos.add( new Tipos ( 03, "CUMPLEAÑOS", "Cumpleaños para todas las edades." ) );
		tipos.add( new Tipos ( 04, "BODA", "Bodas en igesia o judicial." ) );
		
	}
	
	
	// Métodos Implementados
	
	
	@Override
	public Tipos buscarUno(int idTipo) {
		
		Tipos aux = new Tipos(); // Creo una variable de la clase llamando al contructor vacio.
		aux.setIdTipo(idTipo); // Al objeto "aux" le asigno un id, que es el mismo que recibo cómo argumento.
		int index = tipos.indexOf(aux); // Busco en la lista un objeto con mismo id.
		
		if ( index == -1 ) { // Si devuelve -1 significa que no ha entrado uno igual.
			return null;
		} else {
			return tipos.get(index); // Devuelvo el objeto almacenado en el indice indicado.
		}
		
	}

	@Override
	public List<Tipos> buscarTodos() {
		
		return tipos; // Devuelvo la lista completa.
		
	}
	
	
}
