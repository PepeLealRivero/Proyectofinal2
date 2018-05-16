package com.salesianostriana.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class InicioController {

@GetMapping({ "/", "/Inicio" })
	public String Inicio() {
		return "Inicio";
	}

}
