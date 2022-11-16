package com.ai2.model.repository;
import java.util.List;

import com.ai2.model.beans.Usuarios;


public interface IntUsuarios {

	
	Usuarios buscarUno(int idUsuario);
	Usuarios buscarUno(String userName);
	List<Usuarios> buscarTodos();
	boolean crearUsuario(Usuarios usuarios);
	boolean comprobarUserName(String userName);
	boolean comprobarPassword(String password);
	int asignarID();
	
	
}
