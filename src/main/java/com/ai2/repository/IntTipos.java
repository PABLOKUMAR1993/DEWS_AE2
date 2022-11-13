package com.ai2.repository;
import java.util.List;
import com.ai2.beans.Tipos;


public interface IntTipos {

	
	Tipos buscarUno(int idTipo);
	List<Tipos> buscarTodos();
	
	
}
