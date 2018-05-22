package com.salesianostriana.proyecto.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping

public class AdminController {

	@Autowired
	private HttpSession session;

	@GetMapping
	public String login(Model model) {
		model.addAttribute("usuario", session.getAttribute("usuarioActual"));
		return "admin/index";
	}

}
