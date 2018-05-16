package com.salesianostriana.proyecto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.proyecto.model.Administrador;

public interface AdminRepository extends JpaRepository<Administrador, Long>{

}
