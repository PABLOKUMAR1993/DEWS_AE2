package com.ai2.beans;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class Usuarios implements Serializable {

	
	// Atributos
	
	
	private static final long serialVersionUID = 1L;
	private int idUsuario;
	private String userName;
	private String password;
	private String email;
	private String nombre;
	private String direccion;
	private int enabled;
	private Date fechaRegistro;
	
	
	// Constructores
	
	
	public Usuarios(int idUsuario, String userName, String password, String email, String nombre, String direccion,
			int enabled, Date fechaRegistro) {
		super();
		this.idUsuario = idUsuario;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.nombre = nombre;
		this.direccion = direccion;
		this.enabled = enabled;
		this.fechaRegistro = fechaRegistro;
	}
	
	public Usuarios() {
		super();
	}
	
	
	// Getters & Setters
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getEnabled() {
		return enabled;
	}
	
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	// toString
	
	
	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", userName=" + userName + ", password=" + password + ", email="
				+ email + ", nombre=" + nombre + ", direccion=" + direccion + ", enabled=" + enabled
				+ ", fechaRegistro=" + fechaRegistro + "]";
	}
	
	
	// hashCode & equeals
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idUsuario);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return idUsuario == other.idUsuario;
	}
	
	
}
