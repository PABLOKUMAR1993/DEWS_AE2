package com.ai2.model.beans;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


public class Eventos implements Serializable {

	
	// Atributos
	
	
	private static final long serialVersionUID = 1L;
	private int idEvento;
	private String nombre;
	private String descripcion;
	private Date fechaInicio;
	private int duracion;
	private String direccion;
	private String estado;
	private char destacado;
	private int aforoMaximo;
	private int asistenciaMinima;
	private double precio;
	private Tipos tipo;
	
	
	// Constructores
	
	
	public Eventos(int idEvento, String nombre, String descripcion, Date fechaInicio, int duracion, String direccion,
			String estado, char destacado, int aforoMaximo, int asistenciaMinima, double precio, Tipos tipo) {
		super();
		this.idEvento = idEvento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.duracion = duracion;
		this.direccion = direccion;
		this.estado = estado;
		this.destacado = destacado;
		this.aforoMaximo = aforoMaximo;
		this.asistenciaMinima = asistenciaMinima;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	public Eventos() {
		super();
	}
	
	
	// Getters & Setters
	
	
	public int getIdEvento() {
		return idEvento;
	}
	
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public char getDestacado() {
		return destacado;
	}
	
	public void setDestacado(char destacado) {
		this.destacado = destacado;
	}
	
	public int getAforoMaximo() {
		return aforoMaximo;
	}
	
	public void setAforoMaximo(int aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}
	
	public int getAsistenciaMinima() {
		return asistenciaMinima;
	}
	
	public void setAsistenciaMinima(int asistenciaMinima) {
		this.asistenciaMinima = asistenciaMinima;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Tipos getTipo() {
		return tipo;
	}
	
	public void setTipo(Tipos tipo) {
		this.tipo = tipo;
	}
	
	
	// toString
	
	
	@Override
	public String toString() {
		return "Eventos [idEvento=" + idEvento + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", fechaInicio=" + fechaInicio + ", duracion=" + duracion + ", direccion=" + direccion + ", estado="
				+ estado + ", destacado=" + destacado + ", aforoMaximo=" + aforoMaximo + ", asistenciaMinima="
				+ asistenciaMinima + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
	
	// hashCode & equeals
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idEvento);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eventos other = (Eventos) obj;
		return idEvento == other.idEvento;
	}
	
	
}
