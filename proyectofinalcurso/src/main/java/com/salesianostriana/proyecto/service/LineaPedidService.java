package com.salesianostriana.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyecto.model.LineaPedido;
import com.salesianostriana.proyecto.repo.LineaPedRepository;

@Service

public class LineaPedidService {
	
	@Autowired
	private LineaPedRepository linRep;
	
	public Iterable<LineaPedido> findAll(){
		return linRep.findAll();
	}
	
	public LineaPedido findOne(Long id) {
		return linRep.findById(id).orElse(null);
	}
	

}
