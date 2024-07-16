package com.rolclientes.modelo.beans;

import java.io.Serializable;
import java.util.Objects;

public class Evento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int idEvento;
	private String nombreEvento;
	private String descripcionEvento;
	private String fechaInicioEvento;
	private int duracionEvento;
	private String direccionEvento;
	private String estadoEvento;
	private char destacado;
	private int aforoMaximoEvento;
	private int aforoMinimoEvento;
	private double precioEvento;
	private Tipo tipo;
	
	//constructor por defecto
	public Evento() {
		super();
	}
	
	//constructor con parámetros
	public Evento(int idEvento, String nombreEvento, String descripcionEvento, 
			String fechaInicioEvento, int duracionEvento, String direccionEvento, String estadoEvento, char destacado, int aforoMaximoEvento, int aforoMinimoEvento, 
			double precioEvento, Tipo tipo) {
		super();
		this.idEvento = idEvento;
		this.nombreEvento = nombreEvento;
		this.descripcionEvento = descripcionEvento;
		this.fechaInicioEvento = fechaInicioEvento;
		this.duracionEvento = duracionEvento;
		this.direccionEvento = direccionEvento;
		this.estadoEvento = estadoEvento;
		this.destacado = destacado;
		this.aforoMaximoEvento = aforoMaximoEvento;
		this.aforoMinimoEvento = aforoMinimoEvento;
		this.precioEvento = precioEvento;
		this.tipo = tipo;
	}
	
	//generamos los métodos setter y getter mediante "source", así como equals, hashCode y toString
	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public String getDescripcionEvento() {
		return descripcionEvento;
	}

	public void setDescripcionEvento(String descripcionEvento) {
		this.descripcionEvento = descripcionEvento;
	}

	public String getFechaInicioEvento() {
		return fechaInicioEvento;
	}

	public void setFechaInicioEvento(String fechaInicioEvento) {
		this.fechaInicioEvento = fechaInicioEvento;
	}

	public int getDuracionEvento() {
		return duracionEvento;
	}

	public void setDuracionEvento(int duracionEvento) {
		this.duracionEvento = duracionEvento;
	}

	public String getDireccionEvento() {
		return direccionEvento;
	}

	public void setDireccionEvento(String direccionEvento) {
		this.direccionEvento = direccionEvento;
	}

	public String getEstadoEvento() {
		return estadoEvento;
	}

	public void setEstadoEvento(String estadoEvento) {
		this.estadoEvento = estadoEvento;
	}

	public char getDestacado() {
		return destacado;
	}

	public void setDestacado(char destacado) {
		this.destacado = destacado;
	}

	public int getAforoMaximoEvento() {
		return aforoMaximoEvento;
	}

	public void setAforoMaximoEvento(int aforoMaximoEvento) {
		this.aforoMaximoEvento = aforoMaximoEvento;
	}

	public int getAforoMinimoEvento() {
		return aforoMinimoEvento;
	}

	public void setAforoMinimoEvento(int aforoMinimoEvento) {
		this.aforoMinimoEvento = aforoMinimoEvento;
	}

	public double getPrecioEvento() {
		return precioEvento;
	}

	public void setPrecioEvento(double precioEvento) {
		this.precioEvento = precioEvento;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aforoMaximoEvento, aforoMinimoEvento, descripcionEvento, destacado, direccionEvento,
				duracionEvento, estadoEvento, fechaInicioEvento, idEvento, nombreEvento, precioEvento, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Evento))
			return false;
		Evento other = (Evento) obj;
		return aforoMaximoEvento == other.aforoMaximoEvento && aforoMinimoEvento == other.aforoMinimoEvento
				&& Objects.equals(descripcionEvento, other.descripcionEvento) && destacado == other.destacado
				&& Objects.equals(direccionEvento, other.direccionEvento) && duracionEvento == other.duracionEvento
				&& Objects.equals(estadoEvento, other.estadoEvento)
				&& Objects.equals(fechaInicioEvento, other.fechaInicioEvento) && idEvento == other.idEvento
				&& Objects.equals(nombreEvento, other.nombreEvento)
				&& Double.doubleToLongBits(precioEvento) == Double.doubleToLongBits(other.precioEvento)
				&& Objects.equals(tipo, other.tipo);
	}

	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", nombreEvento=" + nombreEvento + ", descripcionEvento="
				+ descripcionEvento + ", fechaInicioEvento=" + fechaInicioEvento + ", duracionEvento=" + duracionEvento
				+ ", direccionEvento=" + direccionEvento + ", estadoEvento=" + estadoEvento + ", destacado=" + destacado
				+ ", aforoMaximoEvento=" + aforoMaximoEvento + ", aforoMinimoEvento=" + aforoMinimoEvento
				+ ", precioEvento=" + precioEvento + ", tipo=" + tipo + "]";
	}



	
}
