package com.rolclientes.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rolclientes.modelo.beans.Evento;
import com.rolclientes.modelo.repository.EventoDao;

@Controller
@RequestMapping("/eventos")
public class GestionEventos {
	@Autowired
	private EventoDao edao;

	@GetMapping("/todos")
	public String mostrarTodosEventos(Model model, HttpSession sesionUsuario) {
		model.addAttribute("todos", edao.buscarTodos());
		return "eventos";
	}
	
	@GetMapping("/{id}") 
	public String mostrarEvento(Model model, HttpSession sesionUsuario,
		@PathVariable("id") int idEvento, RedirectAttributes atributos) {
			Evento evento = edao.buscarId(idEvento);		
			model.addAttribute("evento", evento);
			return "detalleEvento";
	}

	
	@GetMapping("/activos")
	public String mostrarActivos(Model model, HttpSession sesionUsuario) {
		model.addAttribute("eventosActivos", edao.buscarPorEstado("Activo"));
		//if (sesionUsuario.getAttribute("idCliente") != null) return "Sesion de Usuario" + sesionUsuario.getAttribute("cliente.getNombreUsuario()");
		return "eventosActivos";
	}
	
	
	@GetMapping("/destacados")
	public String mostrarDestacados(Model model, HttpSession sesionUsuario) {
		model.addAttribute("eventosDestacados", edao.buscarDestacados());
		if (sesionUsuario.getAttribute("idCliente") != null) return "Sesion de Usuario" + sesionUsuario.getAttribute("cliente.getNombreUsuario()");
		return "eventosDestacados";
	}
	}


