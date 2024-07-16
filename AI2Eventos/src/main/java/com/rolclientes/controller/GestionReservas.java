package com.rolclientes.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rolclientes.modelo.repository.ReservaDao;





@Controller
@RequestMapping("/reservas")
public class GestionReservas {
	
	@Autowired (required = false)
	private ReservaDao iReserva;
	
		
	@GetMapping ("/reservar")
	public String mostrarReservas(Model model, HttpSession sesionUsuario) {
		if (sesionUsuario.getAttribute("idCliente") == null) 
			model.addAttribute("reservas", iReserva.buscarTodos());
		else {
			int idCliente = (Integer) sesionUsuario.getAttribute("idCliente");
			model.addAttribute("reservas", iReserva.buscarPorCliente(idCliente));
		}			
		return "reservas";
	}
	
		
	@PostMapping("/reservar/{idEvento}")
	public String reservar(RedirectAttributes atributos, HttpSession sesionUsuario,
			@PathVariable("idEvento") int idEvento,
			@RequestParam("cantidad") int cantidad) {
		int idCliente = (Integer) sesionUsuario.getAttribute("idCliente");
		
		
		if (iReserva.reservar(idEvento, idCliente, cantidad) == 0) {
			atributos.addFlashAttribute("Error", "Opps la reserva no se ha podido realizar");
		} else {
			atributos.addFlashAttribute("Correcto", "Reserva realizada!!!");
		}
			
			
		return "eventos/{idEvento}";
	}
}



