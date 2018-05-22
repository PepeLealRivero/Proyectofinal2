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
	
	/*
	 * @Autowired
	private AdministradorRepository adminRep;
	
	public Iterable<Administrador> findAll() {
		return adminRep.findAll();
	}
	
	public Administrador findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Administrador save(Administrador u) {
		return repositorio.save(u);
	}
	
	public Administrador edit(Administrador u) {
		return repositorio.save(u);
	}
	
	public Administrador delete(Administrador u) {
		Administrador aBorrar = repositorio.findById(u.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(u);
		
		return aBorrar;
	}
	
	 */

}
