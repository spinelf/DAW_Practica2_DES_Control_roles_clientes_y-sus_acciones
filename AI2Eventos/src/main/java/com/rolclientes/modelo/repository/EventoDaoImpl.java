package com.rolclientes.modelo.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.rolclientes.modelo.beans.Evento;

@Repository
public class EventoDaoImpl implements EventoDao {
	
	private List<Evento> listaEventos;
	
	public EventoDaoImpl() {
		listaEventos = new ArrayList <>();
		cargarDatosEventos();
	}

	private void cargarDatosEventos () {
		TipoDaoImpl itipos = new TipoDaoImpl();
		
		listaEventos.add (new Evento(1, "Boda", "Se casan dos tipos", "20 de octubre de 2022", 6, "Calle Falsa 123", "Activo", 'Y', 150, 20, 5000, itipos.buscarId(1)));
		listaEventos.add (new Evento(2, "Cumpleaños", "Cumplen 12 años", "13 de noviembre de 2022", 2, "Evergreen Terrace 756", "Activo", 'N', 30, 5, 100, itipos.buscarId(2)));
		listaEventos.add (new Evento(3, "Conferencia", "Tipo de las criptomonedas", "28 de diciembre de 2022", 3, "Avenida Averroes 130", "Cancelado", 'N', 50, 100, 600, itipos.buscarId(3)));
		listaEventos.add (new Evento(4, "Graduación", "Termina el instituto", "25 de junio de 2023", 3, "Pabellón Ctra. Meco", "Activo", 'Y', 50, 15, 250, itipos.buscarId(4)));
	}
	
	//el método me devuelve la lista de eventos
	@Override
	public List<Evento> buscarTodos() {
		return listaEventos;
	}

	//el método me devolverá una lista de eventos marcados como "Activo"
	@Override
	public List<Evento> buscarPorEstado(String estado) {
		List<Evento> eventosActivos = new ArrayList<Evento>();
		for(Evento evento : listaEventos) {
			if (evento.getEstadoEvento() == "Activo") {
				eventosActivos.add(evento);
			}
		}
		return eventosActivos;
	}

	//el método me devolverá una lista de eventos marcados como destacado = "Y"
	@Override
	public List<Evento> buscarDestacados() {
		List<Evento> eventosDestacados = new ArrayList<Evento>();
		for (Evento evento : listaEventos) {
			if (evento.getDestacado() == "Y".charAt(0)) {
				eventosDestacados.add(evento);
			}
		}
		return eventosDestacados;
	}

	//el método me devuelve el evento que busco según su id, si no lo encuentra no me devuelve nada
	@Override
	public Evento buscarId(int idEvento) {
		for (Evento evento : listaEventos) {
			if (evento.getIdEvento() == idEvento) return evento;
		}
		return null;
	}
	
	//el método recibe un evento. Devolverá 1 si se ha creado el nuevo evento y 0 si no se ha hecho
	@Override
	public int crearEvento(Evento evento) {
		return listaEventos.add(evento) ? 1 : 0;
	}

	//el método reemplaza un evento por otro, ambos con el mismo idEvento
	@Override
	public int editarEvento(Evento evento) {
		int pos = listaEventos.indexOf(evento); 
		if (pos == -1) return 0;
		else if (listaEventos.set(pos, evento) == null) return 0;
		else return 1;
	}
	
	//el método recibe el idEvento a eliminar. Devolverá 1 si se ha eliminado y 0 si no se ha eliminado
	@Override
	public int eliminarEvento(int idEvento) {
		Evento eventoEliminar = buscarId(idEvento);
			if (eventoEliminar == null) return 0;
			listaEventos.remove(idEvento);
		return 1;
	}

	//el método recibe el idEvento a cancelar. Devolverá 1 si se ha cancelado y 0 si no se ha cancelado
	@Override
	public int cancelarEvento(int idEvento) {
		Evento eventoCancelar = buscarId(idEvento);
		if(eventoCancelar == null) return 0;
		eventoCancelar.setEstadoEvento("Cancelado");
	return 1;
	}

	//el método recibe el idEvento a activar. Devolverá 1 si se ha activado y 0 si no se ha activado
	@Override
	public int activarEvento(int idEvento) {
		Evento eventoActivar = buscarId(idEvento);
			if(eventoActivar == null) return 0;
			eventoActivar.setEstadoEvento("Activo");
		return 1;
	}

}
