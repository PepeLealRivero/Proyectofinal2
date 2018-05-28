package com.salesianostriana.proyecto.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.proyecto.formbean.LoginUser;
import com.salesianostriana.proyecto.model.Administrador;
import com.salesianostriana.proyecto.model.Usuario;
import com.salesianostriana.proyecto.service.UsuarioService;

@Controller

public class LoginController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private HttpSession session;
	
	@GetMapping({ "/", "/login" })
	public String showLogin(Model model) {
		model.addAttribute("loginUser", new LoginUser());
		return "login";

	}
	
	@PostMapping("/checkLogin")
	public String doLogin(@ModelAttribute("loginUser") LoginUser loginUser, BindingResult bindingResult, Model model) {

		Usuario user = usuarioService.login(loginUser.getEmail(), loginUser.getContrasenia());

		if (user != null && user instanceof Administrador) {

			session.setAttribute("usuarioActual", user);
			return "redirect:/admin/index";
		} else if (user != null) {
			session.setAttribute("usuarioActual", user);
			return "redirect:/app/index";
		} else {
			model.addAttribute("loginError", "El usuario o contraseÃ±a no es vÃ¡lido");
			return "login";
		}
		

	}
	
	@GetMapping("/logout")
	public String doLogout(Model model) {
		session.setAttribute("usuarioActual", null);
		return "redirect:/";
	}

}
