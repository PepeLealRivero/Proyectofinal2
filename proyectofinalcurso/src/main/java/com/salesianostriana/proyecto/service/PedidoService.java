package com.salesianostriana.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyecto.model.Pedido;
import com.salesianostriana.proyecto.repo.PedidoRepository;

@Service

public class PedidoService {
	
	@Autowired
	private PedidoRepository pedRep;
	
	public Iterable<Pedido> findAll(){
		return pedRep.findAll();
	}
	
	public Pedido findOne(Long id) {
		return pedRep.findById(id).orElse(null);
	}
	
	public Pedido save(Pedido entidad) {
		return pedRep.save(entidad);
	}
	

}
