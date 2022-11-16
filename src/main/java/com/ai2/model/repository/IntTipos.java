package com.ai2.model.repository;
import java.util.List;

import com.ai2.model.beans.Tipos;


public interface IntTipos {

	
	Tipos buscarUno(int idTipo);
	List<Tipos> buscarTodos();
	
	
}
