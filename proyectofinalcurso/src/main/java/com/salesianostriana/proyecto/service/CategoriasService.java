package com.salesianostriana.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyecto.model.Categorias;
import com.salesianostriana.proyecto.repo.CategoriaRepository;

@Service

public class CategoriasService {
	
	@Autowired
	private CategoriaRepository CatRep;
	
	public Iterable<Categorias> findAll() {
		return CatRep.findAll();
	}
	
	public Categorias findOne(Long id) {
		return CatRep.findById(id).orElse(null);
	}

}
