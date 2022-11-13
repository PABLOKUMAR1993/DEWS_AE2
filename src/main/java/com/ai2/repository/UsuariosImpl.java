package com.ai2.repository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ai2.beans.Usuarios;


@Repository
public class UsuariosImpl implements IntUsuarios {

	
	// Atributos
	
	
	private List<Usuarios> usuarios;
	
	
	// Métodos Propios
	
	
	public UsuariosImpl() {
		
		usuarios = new ArrayList<>();
		crearUsuarios();
		
	}
	
	public void crearUsuarios() {
		
		usuarios.add( new Usuarios ( 01, "UserName01", "abcd", "email1@email.com", "Pavlo", "Calle Falsa 123", 1, new Date() ) );
		usuarios.add( new Usuarios ( 02, "UserName02", "dcba", "email2@email.com", "Tomas", "Calle Verdadera 321", 1, new Date() ) );
		
	}
	
	
	// Métodos Implementados
	
	
	@Override
	public Usuarios buscarUno(int idUsuario) {
		
		// Explicación del funcionamiento de este método en la clase TiposImpl.
		
		Usuarios aux = new Usuarios();
		aux.setIdUsuario(idUsuario);
		int index = usuarios.indexOf( aux );
		
		if ( index == -1 ) {
			return null;
		} else {
			return usuarios.get( index );
		}
		
	}

	@Override
	public List<Usuarios> buscarTodos() {
		
		return usuarios;
		
	}

	
}
