package com.rolclientes.modelo.beans;

import java.io.Serializable;
import java.util.Objects;

public class Tipo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idTipo;
	private String nombreTipo;
	private String descripcionTipo;

	//constructor por defecto
	public Tipo() {
		super();
	}
	//constructor con parámetros
public Tipo(int idTipo, String nombreTipo, String descripcionTipo) {
		super();
		this.idTipo = idTipo;
		this.nombreTipo = nombreTipo;
		this.descripcionTipo = descripcionTipo;
	}

//generamos los métodos setter y getter mediante "source", así como equals, hashCode y toString
public int getIdTipo() {
	return idTipo;
}
public void setIdTipo(int idTipo) {
	this.idTipo = idTipo;
}
@Override
public String toString() {
	return "Tipo [idTipo=" + idTipo + ", nombreTipo=" + nombreTipo + ", descripcionTipo=" + descripcionTipo + "]";
}
@Override
public int hashCode() {
	return Objects.hash(descripcionTipo, idTipo, nombreTipo);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Tipo))
		return false;
	Tipo other = (Tipo) obj;
	return Objects.equals(descripcionTipo, other.descripcionTipo) && idTipo == other.idTipo
			&& Objects.equals(nombreTipo, other.nombreTipo);
}
public String getNombreTipo() {
	return nombreTipo;
}
public void setNombreTipo(String nombreTipo) {
	this.nombreTipo = nombreTipo;
}
public String getDescripcionTipo() {
	return descripcionTipo;
}
public void setDescripcionTipo(String descripcionTipo) {
	this.descripcionTipo = descripcionTipo;
}



}
