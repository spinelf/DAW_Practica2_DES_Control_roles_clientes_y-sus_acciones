package com.rolclientes.modelo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rolclientes.modelo.beans.Evento;
import com.rolclientes.modelo.beans.Reserva;

//creamos la interfaz que va a determinar los métodos para las reservas
@Repository
public interface ReservaDao {
	
	List<Reserva> buscarTodos();
	List<Reserva> buscarPorCliente(int idCliente);
	List<Reserva> buscarPorEvento(Evento evento);
	int reservar(int idEvento, int idCliente, int cantidad);
	int booked(int idEvento);
}
