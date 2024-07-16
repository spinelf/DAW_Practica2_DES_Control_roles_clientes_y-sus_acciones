package com.rolclientes.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rolclientes.modelo.beans.Cliente;
import com.rolclientes.modelo.repository.ClienteDao;

@Controller
@RequestMapping("/clientes")
public class GestionClientes {
	
	@Autowired
	private ClienteDao iCliente;

	
	@GetMapping("/altaClientes")
	public String tipos (Model model) {
		return "altaCliente";
}
	@GetMapping("/login")
	public String mostrarFormularioLogin(RedirectAttributes atributos, HttpSession sesionUsuario) {
		return "loginCliente";
	}
	@PostMapping("/login")
	public String loginUsuario(RedirectAttributes atributos, 
			@RequestParam("nombreUsuario") String nombreUsuario, 
			@RequestParam("password") String password,
			HttpSession  sesionUsuario, Model model) {
		
		if (iCliente.login(nombreUsuario, password) == 1) {
			Cliente cliente = iCliente.buscarPorNombreUsuario(nombreUsuario);
			sesionUsuario.setAttribute("idCliente", cliente.getIdCliente());
			return "redirect:inicio";
		} else {
			atributos.addFlashAttribute("mensajeError", "nombre de usuario o contraseña incorrecotos");
			return "login";
		}
			
	}
	
	@GetMapping("/cerrarSesion")
	public String cerrarSesion(HttpSession sesionUsuario) {
		sesionUsuario.invalidate();
		return "login";
	}
	
	@GetMapping("/inicio")
	public String inicioCliente(Model model, HttpSession sesionUsuario) {
		Cliente cliente = iCliente.buscarPorId((Integer) sesionUsuario.getAttribute("idCliente"));
		model.addAttribute("nombre", cliente.getNombreUsuario());
		return "Estas conectado: " + cliente.getNombreUsuario();
	}
	
	@GetMapping("/activos")
	public String mostrarActivos(HttpSession sesionUsuario) {
		return "eventosActivos";
	}
	
	@GetMapping("/destacados")
	public String mostrarDestacados(HttpSession sesionUsuario) {
		return "redirect:/eventos/destacados";
	}
	
	@GetMapping("/detalle/{idEvento}")
	public String mostrarDetalle(HttpSession sesionUsuario) {
		return "redirect:/eventos/detalle/{idEvento}";
	}
}
