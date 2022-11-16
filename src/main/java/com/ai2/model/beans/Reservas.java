package com.ai2.model.beans;

import java.util.Objects;

public class Reservas {

	
	// Atributos
	
	
	private int idReserva;
	private Eventos idEvento;
	private Usuarios idUsuario;
	private double precioVeta;
	private String observaciones;
	private int cantidad;
	
	
	// Constructores
	
	
	public Reservas(int idReserva, Eventos idEvento, Usuarios idUsuario, double precioVeta, String observaciones,
			int cantidad) {
		super();
		this.idReserva = idReserva;
		this.idEvento = idEvento;
		this.idUsuario = idUsuario;
		this.precioVeta = precioVeta;
		this.observaciones = observaciones;
		this.cantidad = cantidad;
	}
	
	public Reservas() {
		super();
	}
	
	
	// Getters & Setters
	
	
	public int getIdReserva() {
		return idReserva;
	}
	
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	
	public Eventos getIdEvento() {
		return idEvento;
	}
	
	public void setIdEvento(Eventos idEvento) {
		this.idEvento = idEvento;
	}
	
	public Usuarios getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Usuarios idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public double getPrecioVeta() {
		return precioVeta;
	}
	
	public void setPrecioVeta(double precioVeta) {
		this.precioVeta = precioVeta;
	}
	
	public String getObservaciones() {
		return observaciones;
	}
	
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	// toString
	
	
	@Override
	public String toString() {
		return "Reservas [idReserva=" + idReserva + ", idEvento=" + idEvento + ", idUsuario=" + idUsuario
				+ ", precioVeta=" + precioVeta + ", observaciones=" + observaciones + ", cantidad=" + cantidad + "]";
	}
	
	
	// hashCode & equels
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idReserva);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservas other = (Reservas) obj;
		return idReserva == other.idReserva;
	}	
	
	
}
