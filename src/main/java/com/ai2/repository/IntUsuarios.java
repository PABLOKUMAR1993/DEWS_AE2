package com.ai2.repository;
import java.util.List;
import com.ai2.beans.Usuarios;


public interface IntUsuarios {

	
	Usuarios buscarUno(int idUsuario);
	List<Usuarios> buscarTodos();
	
	
}
