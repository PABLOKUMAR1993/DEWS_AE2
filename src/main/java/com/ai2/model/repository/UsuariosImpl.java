package com.ai2.model.repository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.ai2.model.beans.Usuarios;


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
		
		usuarios.add( new Usuarios ( 1, "UserName01", "abcd", "email1@email.com", "Pavlo", "Calle Falsa 123", 1, new Date() ) );
		usuarios.add( new Usuarios ( 2, "UserName02", "dcba", "email2@email.com", "Tomas", "Calle Verdadera 321", 1, new Date() ) );
		
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
	public Usuarios buscarUno(String userName) {
		
		Usuarios usuarioObtenido = new Usuarios();
		int i = 0;
		
		for ( Usuarios usuario : usuarios ) {
			
			if ( userName.equals( usuario.getUserName() ) ) {
				
				usuarioObtenido = usuarios.get( i );
				i++;
				
			}
			break;
			
		}
		
		return usuarioObtenido;
		
	}


	@Override
	public List<Usuarios> buscarTodos() {
		
		return usuarios;
		
	}

	@Override
	public boolean crearUsuario(Usuarios usuario) {
		
		// Si el usuario no existe, lo añado a la lista.
		
		if ( usuarios.contains( usuario ) ) {
			return false;
		} else {
			usuarios.add( usuario );
			return true;
		}
		
	}
	
	@Override
	public boolean comprobarUserName(String userName) {
		
		// Si la lista contiene a un usuario con el userName, devuelvo true.
		
		boolean encontrado = false;
		
		for ( Usuarios usuario : usuarios ) {
			if ( userName.equals(usuario.getUserName()) ) encontrado = true;
			break;
		}
		
		return encontrado;
		
	}

	@Override
	public boolean comprobarPassword(String password) {

		// Si la lista contiene a un usuario con el password, devuelvo true.
		
		boolean encontrado = false;
		
		for ( Usuarios usuario : usuarios ) {
			if ( password.equals(usuario.getPassword()) ) encontrado = true;
			break;
		}
		
		return encontrado;
		
	}
	
	@Override
	public int asignarID() {
		
		// Devulevo la lóngitud del array +1.
		
		return ( usuarios.size() + 1 );
		
	}

	
}
