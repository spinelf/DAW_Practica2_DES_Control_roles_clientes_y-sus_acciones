package com.rolclientes.modelo.beans;

import java.io.Serializable;
import java.util.Objects;

public class Reserva implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int idReserva;
	private int idCliente;
	private Evento evento;
	private Cliente cliente;
	private double precioVenta;
	private String observacionesReserva;
	private int cantidad;
	
	//constructor por defecto
	public Reserva() {
		super();
	}
	
	//constructor con parámetros
	public Reserva(int idReserva, Evento evento, Cliente cliente, double precioVenta, String observacionesReserva,
			int cantidad) {
		super();
		this.idReserva = idReserva;
		this.evento = evento;
		this.cliente = cliente;
		this.precioVenta = precioVenta;
		this.observacionesReserva = observacionesReserva;
		this.cantidad = cantidad;
	}
	
	public Reserva(int idReserva, int idCliente, int cantidad) {
		super();
		this.idReserva = idReserva;
		this.idCliente = idCliente;
		this.cantidad=cantidad;
		
		
		
		
	}
	
	//generamos los métodos setter y getter mediante "source", así como equals, hashCode y toString
	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getObservacionesReserva() {
		return observacionesReserva;
	}

	public void setObservacionesReserva(String observacionesReserva) {
		this.observacionesReserva = observacionesReserva;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, cliente, evento, idReserva, observacionesReserva, precioVenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Reserva))
			return false;
		Reserva other = (Reserva) obj;
		return cantidad == other.cantidad && Objects.equals(cliente, other.cliente)
				&& Objects.equals(evento, other.evento) && idReserva == other.idReserva
				&& Objects.equals(observacionesReserva, other.observacionesReserva)
				&& Double.doubleToLongBits(precioVenta) == Double.doubleToLongBits(other.precioVenta);
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", evento=" + evento + ", cliente=" + cliente + ", precioVenta="
				+ precioVenta + ", observacionesReserva=" + observacionesReserva + ", cantidad=" + cantidad + "]";
	}
	
	
	
}

