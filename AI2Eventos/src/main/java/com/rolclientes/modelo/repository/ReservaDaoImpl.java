package com.rolclientes.modelo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.rolclientes.modelo.beans.Evento;
import com.rolclientes.modelo.beans.Reserva;

public class ReservaDaoImpl implements ReservaDao {
	
	//creamos una lista de Reservas 
	@Autowired
	private ReservaDao iReserva;
	
	@Autowired
	private EventoDao iEvento;
	

	
	private List<Reserva> listaReservas;
		
		public ReservaDaoImpl() {
			listaReservas = new ArrayList <>();
			cargarDatosReservas();
		}
		
		private void cargarDatosReservas () {
			EventoDaoImpl ievento = new EventoDaoImpl();
			ClienteDaoImpl icliente = new ClienteDaoImpl();
			listaReservas.add(new Reserva (1001, ievento.buscarId(1), icliente.buscarPorId(4), 25, "Acceso a partir de las 15.00", 1));
			listaReservas.add(new Reserva (1012, ievento.buscarId(2), icliente.buscarPorId(3), 30, "ninguna observación", 2));
			listaReservas.add(new Reserva (2012, ievento.buscarId(3), icliente.buscarPorId(2), 15, "Llevar corbata de colores", 5));
			listaReservas.add(new Reserva (3018, ievento.buscarId(4), icliente.buscarPorId(4), 20, "Traed vuestros vasos", 3));
		}

		@Override
		public int booked(int idEvento) {
			int booked = 0;
			for (Reserva ele : listaReservas) {
				if (ele.getEvento().getIdEvento() == idEvento)
					booked += ele.getCantidad();
			}
			return booked;
		}
		
						
		@Override
		public int reservar(int idEvento, int idCliente, int cantidad) {
			
			//obtenemos los datos del evento
			Evento evento = iEvento.buscarId(idEvento);
			
			
			//vemos si hay plazas disponibles
			
			if (this.booked(evento.getIdEvento()) + cantidad > evento.getAforoMaximoEvento())
				return 0;
			
			//Vemos la cantidad de reservas que tiene el usuario.
			
			List<Reserva> reservasUsuario = buscarPorCliente(idCliente);
			int bookCliente = 0;
			for (Reserva reserva : reservasUsuario) {
				if (reserva.getEvento().equals(evento)) bookCliente += reserva.getCantidad();
			}
			
			// Si la cantidad de reservas es mayor a 10 no hacemos la reserva sino se hace.
			
			if (cantidad + bookCliente > 10) 
				return 0;		
			else
				return iReserva.reservar(idEvento, idCliente, cantidad);
		}


		
		@Override
		public List<Reserva> buscarTodos() {
			
			return listaReservas;
		}

		@Override
		public List<Reserva> buscarPorCliente(int idCliente) {
			List<Reserva> reserUser = new ArrayList<Reserva>();
			for (Reserva reserva: listaReservas) {
				if (reserva.getCliente().getIdCliente() == idCliente) {
					reserUser.add(reserva);
				}
			}
			return reserUser;
		}

		@Override
		public List<Reserva> buscarPorEvento(Evento evento) {
			List<Reserva> reserEvento = new ArrayList<Reserva>();
			for (Reserva reserva : listaReservas) {
				if (reserva.getEvento().equals(evento));
					reserEvento.add(reserva);
			}
			return reserEvento;
		}


	

}
