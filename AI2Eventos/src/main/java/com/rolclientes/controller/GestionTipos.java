package com.rolclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GestionTipos {
	
	@GetMapping("/tipos")
		public String tipos (Model model) {
			return "sinFuncion";
	}

}


