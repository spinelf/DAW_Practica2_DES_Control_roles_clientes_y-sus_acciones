package com.rolclientes.modelo.repository;

import java.util.ArrayList;
import java.util.List;

import com.rolclientes.modelo.beans.Tipo;

public class TipoDaoImpl implements TipoDao {
	
	//creamos una lista de Tipos 
	private List<Tipo> listaTipos;
	
	public TipoDaoImpl() {
		listaTipos = new ArrayList <>();
		cargarDatosEventos();
	}
	
	private void cargarDatosEventos () {
		listaTipos.add (new Tipo (1, "Boda", "Celebrar casamiento"));
		listaTipos.add (new Tipo (2, "Cumpleaños", "Celebrar cumpleaños"));
		listaTipos.add (new Tipo (3, "Conferencia", "Charla aburrida"));
		listaTipos.add (new Tipo (4, "Graduación", "Termina de estudiar"));
	}

	//el método buscarTodos me devolverá toda la lista de Tipos
	@Override
	public List<Tipo> buscarTodos() {
		return listaTipos;
	}

	//el método buscarId me devolverá el tipo que se corresponda con la id del tipo que buscamos
	@Override
	public Tipo buscarId(int idTipo) {
		for (Tipo tipo : listaTipos) {
			if (tipo.getIdTipo() == idTipo) return tipo;
		}
		return null;
	}

}


