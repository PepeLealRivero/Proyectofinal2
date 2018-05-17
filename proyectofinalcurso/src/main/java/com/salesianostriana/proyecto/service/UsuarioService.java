package com.salesianostriana.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyecto.model.Usuario;
import com.salesianostriana.proyecto.repo.UsuarioRepository;

@Service

public class UsuarioService {
	
	@Autowired
	private UsuarioRepository userRep;
	
	public Iterable<Usuario> findAll(){
		return userRep.findAll();
	}
	
	public Usuario findOne(Long id) {
		return userRep.findById(id).orElse(null);
	}

	


}
