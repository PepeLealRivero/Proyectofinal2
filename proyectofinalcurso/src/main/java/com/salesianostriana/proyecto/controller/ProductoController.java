package com.salesianostriana.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.proyecto.model.Productos;
import com.salesianostriana.proyecto.service.ProductosService;

@Controller

public class ProductoController {
	
	@Autowired
	private ProductosService productService;
	
	@GetMapping("/productos") 
	public String catalogoProductos(Model model) {
		
		model.addAttribute("prods", productService.obtenerProductos());
		
		return "Productos";
	}
	
	
	@GetMapping("/producto/{id}")
	public String detalleProducto(@PathVariable("id") long id, Model model){
		
		Productos p = productService.obtenerUnProducto(id);
		
		if (p != null) {
			model.addAttribute("producto",p);
			return "DetalleProducto";
		} else {
			//tratamiento del error
			return "Error";
		
		}
	}
	@GetMapping ("/FormProductos")
	public String showForm(Model model) {
		
		Productos empleado = new Productos();
		model.addAttribute("FormProduct", empleado);
		
		return "FormProductos";
		
	}

	@PostMapping ("/addProducto")
	public String submit(@ModelAttribute("FormProduct") Productos product,  Model model) {
		
		model.addAttribute("producto", product);
		return "productos";
	}

}
