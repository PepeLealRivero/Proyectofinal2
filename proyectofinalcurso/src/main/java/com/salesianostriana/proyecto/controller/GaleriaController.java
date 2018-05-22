package com.salesianostriana.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class GaleriaController {
	@GetMapping({ "/", "/Galeria" })
	public String Galeria() {
		return "Galeria";
	}

}
