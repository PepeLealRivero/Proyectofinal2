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
	
	public Usuario save(Usuario entidad) {
		return userRep.save(entidad);
	}
	
	public Usuario login(String nombreUsuario, String contrasenia) {
		return userRep.findFirstByEmailAndContrasenia(nombreUsuario, contrasenia);
		
		/*//Query q = entityManager.createQuery("");
		TypedQuery<Usuario> query = (TypedQuery<Usuario>) entityManager.createQuery("select distinct u from Usuario u where u.username = ?1 and u.pass = ?2");
		query.setParameter(1, nombreUsuario);
		query.setParameter(2, contrasenia);
		query.setFirstResult(0);
		query.setMaxResults(1);
		
		Usuario result = query.getSingleResult();
		
		return result;*/
	}



}
