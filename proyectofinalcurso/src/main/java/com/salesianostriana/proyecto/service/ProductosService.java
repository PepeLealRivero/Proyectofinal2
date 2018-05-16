package com.salesianostriana.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyecto.model.Productos;
import com.salesianostriana.proyecto.repo.ProductoRepository;

@Service

public class ProductosService {
	
	@Autowired
	private ProductoRepository productRep;
	
	public Iterable<Productos>findAll(){
		return productRep.findAll();
	}
	
	public Productos findOne(Long id) {
		return productRep.findById(id).orElse(null);
	}
	
	public Productos save(Productos product) {
		return productRep.save(product);
	}
	
	public Productos edit(Productos product) {
		return productRep.save(product);
	}

}
