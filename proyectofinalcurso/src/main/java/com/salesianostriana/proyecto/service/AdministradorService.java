package com.salesianostriana.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyecto.model.Administrador;
import com.salesianostriana.proyecto.repo.AdminRepository;

@Service

public class AdministradorService {
	
	@Autowired
	private AdminRepository adminRep;
	
	public Iterable<Administrador> findAll(){
		return adminRep.findAll();
	}
	
	public Administrador findOner(Long id) {
		return adminRep.findById(id).orElse(null);
	}

}
