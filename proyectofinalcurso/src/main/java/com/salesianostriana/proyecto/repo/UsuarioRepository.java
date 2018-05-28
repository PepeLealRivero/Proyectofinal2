package com.salesianostriana.proyecto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.proyecto.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Usuario findFirstByEmailAndContrasenia(String nombreUsuario, String contrasenia);
	
}
