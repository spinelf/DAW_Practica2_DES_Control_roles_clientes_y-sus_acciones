package com.rolclientes.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rolclientes.modelo.beans.Evento;
import com.rolclientes.modelo.repository.EventoDao;

@Controller
public class HomeController {
	
	@Autowired
	private EventoDao edao;
	
	@GetMapping("/inicio")
	public String procesarInicio (Model model) {
		List<Evento> lista = edao.buscarTodos();
		model.addAttribute("listaEventos", lista);
		return "inicio";
	}
}