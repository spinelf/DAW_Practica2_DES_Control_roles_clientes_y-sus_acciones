package com.rolclientes.modelo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rolclientes.modelo.beans.Tipo;

//creamos la interfaz que va a determinar los métodos para los tipos
@Repository
public interface TipoDao {
	
	List<Tipo> buscarTodos();
	Tipo buscarId(int idTipo);

}
