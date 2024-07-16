package com.rolclientes.modelo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rolclientes.modelo.beans.Evento;

//creamos la interfaz que va a determinar los métodos para los eventos
@Repository
public interface EventoDao {
	
	List<Evento> buscarTodos();
	List<Evento> buscarPorEstado(String estado);
	List<Evento> buscarDestacados();
	
	Evento buscarId(int idEvento);
	
	int crearEvento(Evento evento);
	int editarEvento(Evento idEvento);
	int eliminarEvento(int idEvento);
	int cancelarEvento(int idEvento);
	int activarEvento(int idEvento);

}
