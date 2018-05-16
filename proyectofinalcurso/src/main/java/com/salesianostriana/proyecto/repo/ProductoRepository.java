package com.salesianostriana.proyecto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.proyecto.model.Productos;

public interface ProductoRepository extends JpaRepository<Productos, Long>{

}
